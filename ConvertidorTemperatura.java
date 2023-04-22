import javax.swing.*;
public class ConvertidorTemperatura extends Convertidor {
    private String seleccion;
    public ConvertidorTemperatura() {
        super();
        String[] tipos = {"°C Celsius a °F Fahrenheit","°C Celsius a °K Kelvin","°F Fahrenheit °C Celsius","°F Fahrenheit °K Kelvin"
                , "°K Kelvin a °F Fahrenheit","°K Kelvin a°C Celsius"};
        setTipos(tipos);
    }
    public void TiposdeTemperatura() {
        seleccion = (String) JOptionPane.showInputDialog(null,"¿Que desea convertir?","Convertidor"
                ,JOptionPane.QUESTION_MESSAGE,null, getTipos(),getTipos()[0]);
        convertirTemperatura();
    }
    public void IngresarTemperatura(){
        String input;
        input = JOptionPane.showInputDialog(null, "Ingrese los Grados: ");
        if (ValidarNumero(input)){
            setCantidad(Double.parseDouble(input));
            TiposdeTemperatura();
        }
        else {
            JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            IngresarTemperatura();
        }

    }
    public void convertirTemperatura(){
        switch (this.seleccion){
            case "°C Celsius a °F Fahrenheit":
                setResultado((getCantidad()*9/5)+32);
                JOptionPane.showMessageDialog(null, "°F " + getResultado());
                break;
            case "°C Celsius a °K Kelvin":
                setResultado(getCantidad()+ 273.15);
                JOptionPane.showMessageDialog(null, "°K " + getResultado());
                break;
            case "°F Fahrenheit °C Celsius":
                setResultado((getCantidad()-32)*5/9);
                JOptionPane.showMessageDialog(null, "°C " + getResultado());
                break;
            case "°F Fahrenheit °K Kelvin":
                setResultado((getCantidad()-32)*5/9+273.15);
                JOptionPane.showMessageDialog(null, "°K " + getResultado());
                break;
            case "°K Kelvin a °F Fahrenheit":
                setResultado((getCantidad()-273.15)*9/5+32);
                JOptionPane.showMessageDialog(null, "°F " + getResultado());
                break;
            case "°K Kelvin a°C Celsius":
                setResultado(getCantidad()-273.15);
                JOptionPane.showMessageDialog(null, "°C " + getResultado());
                break;
        }

    }
}
