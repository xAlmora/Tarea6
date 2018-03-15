# RxJava [Ensayo]
RxJava es una de las librerías que más interés esta generando dentro de la comunidad. Esto es debido a que cada día nos encontramos con más sistemas que funcionan de forma asíncrona y que necesitan poder gestionar flujos de información complejos.
## La programación reactiva
La programación reactiva es un paradigma enfocado en el trabajo con flujos de datos finitos o infinitos de manera asíncrona. Su concepción y evolución ha ido ligada a la publicación del Reactive Manifesto, que establecía las bases de los sistemas reactivos, los cuales deben ser:
* Responsivos: aseguran la calidad del servicio cumpliendo unos tiempos de respuesta establecidos.
* Resilientes: se mantienen responsivos incluso cuando se enfrentan a situaciones de error.
* Elásticos: se mantienen responsivos incluso ante aumentos en la carga de trabajo.
* Orientados a mensajes: minimizan el acoplamiento entre componentes al establecer interacciones basadas en el intercambio de mensajes de manera asíncrona.
Nace de la imposiblilidad de tener sistemas perfectamente síncronos

## Sobre
La programación reactiva nos lleva a una nueva forma de construir nuestros programas, los cuales deben ser pensados como un conjunto de flujos de datos (streams), que serán programados para que el sistema “reaccione” ante la presencia de cada uno de éstos datos asíncronos en el tiempo.
Esto nos permite enfocarnos en lo que nuestro código debe hacer, sin tener que codificar cada paso para hacerlo, lo cual resulta en un enfoque más confiable y mantenible para la construcción de software.
RX es un modelo de programación reactiva creado por Microsoft, que nos permite componer fácilmente streams de datos asíncronos.
Provee una interfaz común para combinar y transformar datos desde fuentes muy diferentes (operaciones de filesystem, interacciones de usuarios, etc.)
RX comenzó con una implementación para .NET, pero actualmente tiene una implementación de código abierto para los principales lenguajes de programación.

## ¿Cómo funciona?
En la programación reactiva podemos ver los clicks del mouse como un stream continuo de eventos que podemos consultar y manipular.
El hecho de pensar en streams en vez de valores aislados, nos permite pensar en una forma de programar en la cual podemos manipular secuencias enteras de valores que aún no han sido creados.
En la siguiente imagen podemos ver que una secuencia de stream es muy similar a un arreglo, en el cual los elementos están separados por espacios de tiempo en vez de espacios de memoria
Para poder trabajar con programación reactiva, el punto importante aquí es imaginar el programa completo como un flujo de secuencias de datos
Con la programación reactiva, podemos consultar los streams de eventos, filtrarlos, transformarlos, etc.
Lo que necesitamos para poder tratar los streams de eventos como “bases de datos” que pueden ser consultadas, es un objeto que abstraiga el concepto de stream, el cual es llamado Observable.

## El Observable
RxJava es una librería para programación reactiva, es decir, para la gestión de eventos asíncronos haciendo uso de Observables. Se basa en el patrón Observer, permitiéndonos añadir operadores para componer distintos Observables. El paradigma de programación reactiva es bastante potente, pero, a la vez, complejo y con una gran curva de aprendizaje. Para poder entender RxJava hay que comprender qué papel juegan los Observer y los Observable.

Los Observer cuentan con tres métodos, que se llevan a cabo cuando se suscribe al Observable:

 * onCompleted: cuando se ejecuta este método es porque el Observable ha terminado de enviar objetos.
 * onError: se ejecutará en el momento en que se produzca un error.
 * onNext: se ejecutará tantas veces como objetos tengan que enviarse al Observer.

Para el caso de los Observable contamos con una serie de métodos para emitir objetos:
 * observeOn: permite especificar en qué hilo se ejecuta el Observable.
 * subscribeOn: permite especificar en qué hilo se ejecuta el Observer. Normalmente será en el hilo principal para poder actualizar la vista con los datos que se reciban.
 * subscribe: a partir de este método, el Observer se suscribe a los objetos que emite el Observable.

Una de las grandes funcionalidades que tiene RxJava son sus operadores. Con la inclusión de estos, podemos filtrar, transformar o incluso agrupar, los distintos objetos emitidos por el Observable.
