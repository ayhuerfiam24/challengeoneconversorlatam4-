import javax.swing.*;

public class MenuPrincipal {
    public static void main(String[] args) {
        boolean seguir=true;
        while (seguir==true){
            String[] tipoConversor ={"Conversor de Divisas","Conversor de Temperatura"};

            int Menu = JOptionPane.showOptionDialog(null,"Seleccione un conversor:","Convertidores",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,tipoConversor,tipoConversor[1]);
            try{
                switch (Menu){
                    case 0:
                        ConvertidorDivisas divisas = new ConvertidorDivisas();
                        divisas.IngresarCantidad();

                        break;
                    case 1:
                        ConvertidorTemperatura temperatura = new ConvertidorTemperatura();
                        temperatura.IngresarTemperatura();
                        break;
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
            int continuar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
            if (continuar==0){
                seguir=true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                seguir=false;
            }
        }

    }
}
