public class vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int year;
    private String color;
    private double precio;

    public vehiculo(String placa, String marca, String modelo, int year, String color, double precio){
        this.placa = placa.toUpperCase();
        this.marca = marca; 
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.precio = precio;
    }

    //getters
    public String getPlaca(){
        return placa;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getYear(){
        return year;
    }

    public String getColor(){
        return color;
    }

    public double getPrecio(){
        return precio;
    }

    //setters
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format(
            "%-12s | %-15s | %-15s | %-6d | %-12s | $%,.2f",
            placa, marca, modelo, year, color, precio
        );
    }
}
