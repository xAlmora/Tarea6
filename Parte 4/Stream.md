# Stream en Java 1.8
Stream se define como una secuencia de elementos que provienen de una fuente que soporta operaciones para el procesamiento de sus datos:
 * De forma declarativa usando expresiones lambda.
 * Permitiendo el posible encadenamiento de varias operaciones, con lo que se logra tener un código fácil de leer y con un objetivo claro.
 * De forma secuencial o paralela (Fork/Join).

Las estructuras que soportan esta nueva API se encuentran en el paquete `java.util.stream` y en especial, la interface java.util.stream.Stream define un Stream.
La API nos permite realizar operaciones sobre colecciones de datos usando el modelo filtro/mapeo/reducción, en el cual se seleccionan los datos que se van a procesar (filtro), se convierten a otro tipo de dato (mapeo) y al final se obtiene el resultado deseado (reducción).
## El programa
En el programa usamos una `LinkedList` de `String` que son nombres de canciones y usando `Stream` filtramos la lista y dejamos solo aquellas canciones que estan en la `LinkedList` más de 3 veces repetidas.
Las agrupamos primeramente por nombre y después las filtramos para que solo aparezcan los elementos con 3 o más repeticiones.
