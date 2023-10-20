import java.util.LinkedList;

public class LinkedListCarros {
    public static void main(String[] args) {
        LinkedList<String> carros= new LinkedList<>();

        carros.add("VOLVO");
        carros.add("BMW");
        carros.add("FORD");
        System.out.println(carros);

        carros.addFirst("MAZDA");
        System.out.println(carros);

        carros.addLast("BUGATTI");
        System.out.println(carros);

        carros.removeFirst();
        System.out.println(carros);

        carros.removeLast();
        System.out.println(carros);

        System.out.println(carros.getFirst());
        System.out.println(carros);

        System.out.println(carros.getLast());
        System.out.println(carros);

    }
}
