import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Kamil");
        lista1.add("Ala");
        lista1.add("Monika");
        lista1.add("Michał");
        lista1.add("Ola");

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Zenek");
        lista2.add("Ala");
        lista2.add("Monika");
        lista2.add("Arek");
        lista2.add("Ola");

        lista1.retainAll(lista2);

        System.out.println("Powtarzajace sie imiona to: " + lista1);
    }
}