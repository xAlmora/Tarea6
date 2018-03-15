package mx.itam;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[])
    {
        LinkedList<String> canciones = new LinkedList<>();
        canciones.add("cancion1");
        canciones.add("cancion1");
        canciones.add("cancion3");
        canciones.add("cancion4");
        canciones.add("cancion4");
        canciones.add("cancion4");
        canciones.add("cancion4");
        canciones.add("cancion4");
        canciones.add("cancion4");
        canciones.add("cancion4");
        canciones.add("cancion4");


        List<String> duplicateList =
                canciones
                        .stream()
                        .collect(Collectors.groupingBy(s -> s))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue().size() > 3)
                        .map(e -> e.getKey())
                        .collect(Collectors.toList());

        for(String cancion : duplicateList) {
            System.out.println(cancion);
        }
    }

}
