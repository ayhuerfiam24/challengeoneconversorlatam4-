import javax.swing.*;
import java.text.DecimalFormat;
public class ConvertidorDivisas extends Convertidor {
    private String seleccion;
    public ConvertidorDivisas() {
        super();
        String[] tipos = {"Dolar(USD)","Euros(EUR)",
                "Yen(JPY)","Libras(GBP)","Dolar(AUD)","Franco Suizo(CHF)",
                "Renminbi(Yuan)","Won(KRW)","Quetzal(GTQ)","Colon(CRC)"};
        setTipos(tipos);
    }
    public void TiposdeDivisas() {
        seleccion = (String) JOptionPane.showInputDialog(null,"¿En que modena desea convertir los " + getCantidad(),"Convertidor"
                ,JOptionPane.QUESTION_MESSAGE,null, getTipos(),getTipos()[0]);

        ConvertirMoneda();
    }
    public void IngresarCantidad(){
        String input;
        input = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir:");
        if (ValidarNumero(input)){
            setCantidad(Double.parseDouble(input));
            TiposdeDivisas();
        }
        else {
            JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            IngresarCantidad();
        }

    }
    public void redondearResultado(double num) {
        DecimalFormat decimal = new DecimalFormat("#.###");
        setResultado(Double.parseDouble(decimal.format(num)));
        JOptionPane.showMessageDialog(null,"Tienes:" + getResultado() + " " + this.seleccion);
    }
    public void ConvertirMoneda(){
        switch (this.seleccion){
            case "Dolar(USD)":
                redondearResultado(getCantidad() * 0.041);
                break;
            case "Euros(EUR)":
                redondearResultado(getCantidad() * 0.037);
                break;
            case "Yen(JPY)":

                redondearResultado(getCantidad() * 5.38);
                break;
            case "Libras(GBP)":
                redondearResultado(getCantidad() * 0.033);
                break;
            case "Dolar(AUD)":
                redondearResultado(getCantidad() * 0.061);
                break;
            case "Franco Suizo(CHF)":
                redondearResultado(getCantidad() * 0.037);
                break;
            case "Renminbi(Yuan)":
                redondearResultado(getCantidad() * 0.28);
                break;
            case "Won(KRW)":
                redondearResultado(getCantidad() * 53.55);
                break;
            case "Quetzal(GTQ)":
                redondearResultado(getCantidad() * 0.32);
                break;
            case "Colon(CRC)":
                redondearResultado(getCantidad() * 21.89);
                break;
        }
    }
}
