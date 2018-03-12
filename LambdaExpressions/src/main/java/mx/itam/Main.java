package mx.itam;

public class Main {
    public static void main(String[] args) {
        Funcion suma = (x,y) -> x+y;
        Funcion resta = (a,b) -> a-b;
        System.out.println(suma.operacion(20,40));
        System.out.println(resta.operacion(100,50));
        FactorialAbstract factorial_recursivo = new FactorialAbstract() {
            @Override
            public int factorial(int x) {
                int count = 1;
                for(int i=1;i<=x;i++){
                    count *=i;
                }
                return count;
            }

            @Override
            public int otraTonteria(int x) {
                return x;
            }
        };
        System.out.println(factorial_recursivo.factorial(5));
        System.out.println(factorial_recursivo.otraTonteria(3));

    }

}
