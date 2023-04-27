public class Par {
    public static void main (String [] args) {
    int pares = 0;
    int inicio = 1;
    int fim = 100;

    if (inicio % 2 != 0) {
        inicio++;
    }
    for (int i = inicio; i <= fim; i +=2) {
         pares++;
    }
    System.out.println("A quantidade de números pares é: " + pares);
    }
}
