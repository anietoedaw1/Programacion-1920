import java.util.Scanner;

/**
 *   
 */
public class PracticaBucles
{
    private static final char ASTERISCO = '*';
    private static final char CRUZ = 'X';
    private static final char ALMOHADILLA = '#';
    private static final char GUION = '-';
    private static final char ESPACIO = ' ';
    private  static Scanner teclado = new Scanner(System.in);

    /**
     *  Escribe los impares entre 1 y 100 (con un for)
     *  (con for) - escribe en cada línea 8 números
     * 
     */
    public static void metodo01()
    {
        int col = 0;
        for (int i = 1; i < 100; i = i + 2)  {
            System.out.print(i + "\t");
            col++;
            if (col % 8 == 0)  {
                System.out.println();
            }
        }

    }

    /**
     *  Escribe los 10 primeros múltiplos de n
     *  (con for) -  
     * 
     */
    public static void metodo02(int n)
    {
        for (int i = 1; i <= 10; i++)   {
            System.out.print("" + n * i + "\t");

        }
    }

    /**
     *  Detecta si n es un nº primo
     *  Hazlo con un while. En cuanto detectes que el nº no es primo sal del bucle con un return
     *  EL 1 no es un nº primo
     */
    public static boolean esPrimo(int n)
    {
        if (n == 1)  {
            return false;
        }
        int divisor = 2;
        while (divisor <= n / 2) {
            if (n % divisor == 0)  {
                return false;
            }
            divisor ++;
        }
        return true;

    }

    /**
     *  Calcula y devuelve el primo más cercano a n
     *  Si n = 12 el primo más cercano es 11
     *  S n = 15 el primo más cercano es 13
     *  Utiliza el método anterior para detectar si un nº es primo o no
     *  Con while
     */
    public static int metodo03(int n)
    {
        int i = n;
        while (i >  2) {
            if (esPrimo(i))   {
                return i;
            }
            i--;
        }
        return i;

        // otra posibilidad

        /* int i = n;
         while (!esPrimo(i)) {
             i--;
          }
          return i; */
    }

    /**
     * Escribe los n primeros números primos
     * Si n = 7 entonces  2   3   5   7   11   13   17
     * 
     *  Con while
     */
    public static void metodo04(int n)
    { 
        int primo = 2;
        int contador = 1;
        while (contador <= n)   {
            if (esPrimo(primo))    {
                System.out.print(primo + "\t");
                contador++;
            }
            primo ++;
        }
        System.out.println();
    }

    /**
     *  Genera aleatorios entre 0 y 50 y por cada aleatorio escribe tantas X
     *  como indique el nº . Hay que hacer un bucle anidado (un while y dentro un for)
     * 
     *   Posible resultado
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXXXX
     *   XXXXXXXXXXXXXXXX
     *   
     */
    public static void metodo05()
    {
        int aleatorio = (int) (Math.random() * 51);
        while (aleatorio != 0)    {
            for (int i = 1; i <= aleatorio; i++)   {
                System.out.print(CRUZ);

            }
            System.out.println();
            aleatorio = (int) (Math.random() * 51);
        }
    }

    /**
     *  Escribe los números entre ALTO y BAJO que
     *  son múltiplos de 4 pero no de 5 (con for)
     * 
     */
    public static void metodo06()
    {
        final int ALTO = 40;
        final int BAJO = 2;

        for (int numero = ALTO; numero >= BAJO; numero--)    {
            if ((numero % 4 == 0) && (numero % 5 != 0))   {
                System.out.print(numero + "\t");
            }

        }

    }

    /**
     *  Escribe la siguiente figura para 10 filas y 8 columnas (con for)
     * 
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########

     */
    public static void metodo07()
    { 
        for (int fila = 1; fila <= 10; fila++)   {
            for (int col = 1; col <= 8; col++)   {
                System.out.print(ALMOHADILLA);
            }
            System.out.println();
        }
    }

    /**
     * Cuenta y devuelve las apariciones de cifra en numero
     * (con while)
     */
    public static int metodo08(int numero, int cifra)
    { 
        int total = 0;
        int aux = numero;
        while (aux != 0)  {
            int c = aux % 10;
            if (c == cifra)  {
                total++;
            }
            aux = aux / 10;
        }
        return total;

    }

    /**
     * Escribe la siguiente figura
     * (con for) - utiliza el método escribirGuiones()
     * usa las constantes adecuadas
     * 
     *    *
     *    -*
     *    --*
     *    ---*
     *    ----*
     *    -----*

     */
    public static void metodo09(int filas)
    { 
        for (int fila = 1; fila <= filas; fila++)  {
            escribirGuiones(fila - 1);           
            System.out.println(ASTERISCO);
        }
    }

    /**
     * escribe n guiones en la misma línea
     * (con for) - Usa la constante adecuada
     */
    public static void escribirGuiones(int n)
    { 
        for (int i = 1; i <= n; i ++)   {
            System.out.print(GUION);
        }
    }

    /**
     * Calcula y escribe las 10 primeras potencias de 2 (con for)
     * Utiliza Math.pow() - Con for
     * 
     * 2 elevado a 0 es 1
     * 2 elevado a 1 es 2
     * 2 elevado a 2 es 4
     * 2 elevado a 3 es 8
     * 2 elevado a 4 es 16
     * 2 elevado a 5 es 32
     * 2 elevado a 6 es 64
     * 2 elevado a 7 es 128
     * 2 elevado a 8 es 256
     * 2 elevado a 9 es 512
     * 2 elevado a 10 es 1024

     */
    public static void metodo10()
    { 
        int base = 2;
        int potencia = 1;
        for (int exp = 0; exp <= 10; exp++)  {                           
            potencia = (int) (Math.pow(base, exp));
            System.out.println(base + " elevado a " + exp + " es " + potencia);
        }
    }

    /**
     *  Escribe la siguiente figura donde inicio marca el primer valor
     *  en la primera fila del cuadrado y fin el primer valor en la última fila del cuadrado
     *  Con for
     *  
     *  El ejemplo es para la llamada  printCuadrado(3, 8);
     *  
     *   3   4   5   6   7   8   
     *   4   5   6   7   8   3   
     *   5   6   7   8   3   4   
     *   6   7   8   3   4   5   
     *   7   8   3   4   5   6   
     *   8   3   4   5   6   7   
     *  
     */
    public static void metodo11(int inicio, int fin)
    {
        for (int fila = inicio; fila <= fin; fila++)   {
            int valor = fila;
            for (int col = 1; col <= (fin - inicio + 1); col++)      {
                System.out.print(valor + "\t");
                valor ++;
                if (valor > fin)       {
                    valor = inicio;
                }
            }
            System.out.println();
        }
        
        

    }
    
    public static void metodo11V2(int inicio, int fin)
    {
        int n = fin - inicio + 1;
        for (int fila = inicio; fila <= fin; fila++)   {            
            for (int col = 1; col <= n; col++)      {
                int valor =  fila + col - 1;
                if (valor > 8) {
                    valor -= n;
                }
                System.out.print(valor + "\t");
                 
            }
            System.out.println();
        }
        

    }

    /**
     *  Genera aleatorios entre 0 y 100 
     *  Calcula y escribe la longitud de la secuencia más larga de números iguales seguidos
     *  El final del proceso termina con el 0
     *  
     *  Ej.  Para la secuencia  2  2  2  4  4  7  6  6  6  1  1  9  9  9  2  2  2  2  2  2  5  0 
     *  
     *  el valor a mostrar sería "La longitud de la secuencia más larga de números seguidos es 6 y
     *  corresponde al valor 2"
     *
    Otras posibles ejecuciones:

    10   10  20  27  
    La longitud secuencia más larga de números seguidos es 2 
    y  corresponde al valor 10

    41  7   7   13  20  20  19  28  
    30  4   2   11  1   15  13  3   
    17  30  19  30  29  8   17  29  
    18  2   27  2   19  18  26  20  
    15  12  14  28  12  29  1   1   
    2   2   22  17  5   22  19  10  
    4   15  4   22  26              
    La longitud secuencia más larga de números seguidos es 2 
    y  corresponde al valor 7

    12  5   26  15  30  21  16  9           
    La longitud secuencia más larga de números seguidos es 1 
    y  corresponde al valor 12

    13  24  11  18  11  25  22  29  
    16  2   8   28  16  25  28  24  
    7   7   7   7   5   11  2   12  
    24  15  14  24  6   22  1   24  
    29  27  25  14  
    La longitud secuencia más larga de números seguidos es 4 
    y  corresponde al valor 7

     *  Con bucles while
     */
    public static void metodo12()
    {
        int col = 0;
        int valorSecuencia = 0;
        int max = 0;
        int aleatorio = (int) (Math.random() * 101);
        int anterior = aleatorio;
        while (aleatorio != 0)   {
            int longitud = 0;
            while (aleatorio != 0 && anterior == aleatorio)    {
                col ++;
                System.out.print(aleatorio + "\t");
                if (col == 8)   {
                    System.out.println();
                    col = 0;
                }

                longitud ++;
                aleatorio = (int) (Math.random() * 31);
            }
            if (longitud > max)     {
                max = longitud;
                valorSecuencia = anterior;
            }
            anterior = aleatorio;

        }
        System.out.println("\nLa longitud secuencia más larga de números seguidos es " + max + 
            " \ny  corresponde al valor " + valorSecuencia);
    }

    /**
     *  Genera aleatorios entre 0 y 100 
     *  Calcula y escribe la longitud de la secuencia más larga de números iguales seguidos
     *  El final del proceso termina con el 0
     *  
     *  Ej.  Para la secuencia  2  2  2  4  4  7  6  6  6  1  1  9  9  9  2  2  2  2  2  2  5  0 
     *  
     *  el valor a mostrar sería "La longitud de la secuencia más larga de números seguidos es 6 y
     *  corresponde al valor 2"
     *

    13  24  11  18  11  25  22  29  
    16  2   8   28  16  25  28  24  
    7   7   7   7   5   11  2   12  
    24  15  14  24  6   22  1   24  
    29  27  25  14  
    La longitud secuencia más larga de números seguidos es 4 
    y  corresponde al valor 7

     *  Con bucles while
     */
    public static void metodo12_V2()
    {
        int col = 0;
        int valorSecuencia = 0;
        int max = 0;
        System.out.println("Teclea secuencia de números finalizando en 0 ");        
        int num = teclado.nextInt();
        int anterior = num;
        int longitud = 0;
        while (num != 0)    {
            if (num == anterior)   {
                longitud++;

            }
            else   {
                if (longitud > max) {
                    max = longitud;
                    valorSecuencia = anterior;
                }
                longitud = 1;
                anterior = num;
            }

            System.out.print(num + "\t");
            col ++;           
            if (col == 8)  {
                System.out.println();
                col = 0;
            }
            num = teclado.nextInt();
        }
        // ver si la última seuencia es la más larga
        if (longitud > max)   {
            max = longitud;
            valorSecuencia = anterior;             
        }
        System.out.println("\nLa longitud secuencia más larga de números seguidos es " + max + 
            " \ny  corresponde al valor " + valorSecuencia);
    }

    /**
     *  Calcula y devuelve formateado a 2 decimales el valor de la serie
     *  para el valor de n proporcionado como parámetro (primero calcúlalo
     *  como double y luego lo devuelves con String.format()
     *  
     *  Hazlo con bucles for  
     *  
     *  1 / 1  + 1 / 2! + 1 / 3! + 1 / 4! + ..........  + 1 / n
     *
     *
     *  Para n = 3 se devuelve el valor 1.6667
     *  Para n = 5 se devuelve el valor 1.7167
     *  Para n = 6 se devuelve el valor 1.7181
     */
    public static String metodo13(int n)
    {
        int deno = 1;
        double suma = 1;
        for (int termino = 2; termino <= n; termino++)  {
            deno = deno * termino;
            suma = suma + (double) 1 / deno;

        }
        return String.format("%10.4f", suma);
    }

    /**
     *  Escribe los factores primos del nº n - Con while
     *  
     *  Si n = 9 entonces    3   3
     *  Si n = 18 entonces    2  3   3
     *  Si n =  24    entonces 2   2  2  3
     *
     */
    public static void metodo14(int n)
    {
        int factor = 2;
        int aux = n;
        while (aux > 1)   {
            if (aux % factor == 0)       {
                System.out.print(factor + "\t");
                aux = aux / factor;
            }
            else    {
                factor++;
            }
        }
    }

    /**
     *  Escribe la siguiente figura
     *  
     *  00  
     *  10  11  
     *  20  21  22  
     *  30  31  32  33  
     *  40  41  42  43  44  
     *  50  51  52  53  54  55  
     *  60  61  62  63  64  65  66  
     *  70  71  72  73  74  75  76  77  
     *  80  81  82  83  84  85  86  87  88  
     *  90  91  92  93  94  95  96  97  98  99  
     *
     */
    public static void metodo15()
    {
        for (int fila = 0; fila < 10; fila++)    {
            for (int col = 1; col <= (fila + 1); col++)       {
                System.out.print(fila + "" + (col - 1) + "\t");
            }
            System.out.println();
        }
    }

   

    /**
     *  Hacer una pausa en la pantalla
     */
    public static void hacerPausa()
    {
        System.out.println("\nPulse Intro para continuar");
        teclado.nextLine();

    }

}
