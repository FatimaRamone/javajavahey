import java.util.ArrayList;

public class Ejercicio {
    public static void main(String[] args) {
        // Crear un ArrayList vacío
        ArrayList<String> cars = new ArrayList<>();

        // Agregar elementos al ArrayList
        cars.add("volvo");
        cars.add("renault");
        cars.add("seat");

        // Imprimir el contenido del ArrayList
        System.out.println(cars);

        System.out.println("Aqui imprimo un elemento directamente de la lista " + cars.get(0));
        

        // Obtener y imprimir el elemento en la posición 0
        String car = cars.get(0);
        System.out.println(car);


        // Añadir más elementos al ArrayList
        cars.add("Vanette");
        System.out.println("He añadido un nuevo elemento a la lista: " + cars);

        // Eliminar un elemento de la lista
        cars.remove("Vanette");
        System.out.println("Y ahora he eliminado un elemento de la lista: " + cars);

        // Utilizar un bucle for para imprimir todos los elementos del ArrayList

        System.out.println("Y a continuación voy a imprimir un buclito : ");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        for (String coche :cars) {
            System.out.println("Y ahora imprimo usando otro  bucle ");
            System.out.println(car);
        }
    }
}

