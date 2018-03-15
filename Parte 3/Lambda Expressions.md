# Lambda Expressions Java 1.8

Por medio de expresiones lambda podemos referenciar métodos anónimos o métodos sin nombre, lo que nos permite escribir código más claro y conciso que  cuando usamos clases anónimas. Una expresión lambda se compone de:
* Listado de parámetros separados por comas y encerrados en paréntesis, por ejemplo: (a,b).
* El símbolo de flecha hacia la derecha: ->
* Un cuerpo que puede ser un bloque de código encerrado entre llaves o una sola expresión.

 En el programa se usa la clase `FactorialAbstract` y Funcion que son abstractas y los métodos se instancian al momento de usarse, las expresiones de lambda son muy usadas en distintos frameworks para añadir funcionalidad especifica a clases genericas como son los
 events (para agregar un listener se puede hacer):
  ```
  Java
  //[Vaadin/JavaSwing Code]
  button.addClickListener(e->{
    //TODO
  });```

Sin tener que crear una clase que implemente `ClickListener` y esto ahorra tiempo y esfuerzo de crear clases "únicas" para cada acción.

## El Programa
En el programa se define la clase `Funcion` y la instanciamos con lambda para que haga suma y resta. `Funcion` solo tiene un método lo que hace una creacion más simple.
Sin embargo, instanciamos `FactorialAbstract` que incluye dos metodos que necesitan sobreescribirse para funcionar y poder ser una instancia del tipo `FactorialAbstract`.
