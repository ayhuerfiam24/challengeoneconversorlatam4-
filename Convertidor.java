public class Convertidor {
    private double cantidad;
    private String[] tipos;
    private double Resultado;
    public Convertidor() {
        this.tipos = new String[10];
    }

    public double getCantidad() { //Muestra valores
        return cantidad;
    }

    public void setCantidad(double cantidad) { //Cambia valores
        this.cantidad = cantidad;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public double getResultado() {
        return Resultado;
    }

    public void setResultado(double resultado) {
        Resultado = resultado;
    }
    public static boolean ValidarNumero(String input){
        try {
            double numero = Double.parseDouble(input);
            if (numero>=0 || numero<0);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

}



