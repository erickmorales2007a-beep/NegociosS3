public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.setNombre("Mouse");
        producto1.setPrecio(20);
        producto1.setCategoria("Tecnología");


        System.out.println(producto1.getNombre());
        System.out.println(producto1.getPrecio());
        System.out.println(producto1.getCategoria());


        producto1.setPrecio(-100);
        System.out.println("Precio tras intentar asignar -100: " + producto1.getPrecio());
    }
}