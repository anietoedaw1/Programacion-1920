import java.util.Arrays;

/**
 *  Guarda las notas de estudiantes en una serie de asignaturas
 *  
 */
public class Curso
{
    private static final int MAX_ESTUDIANTES = 10;
    private static final int MAX_ASIGNATURAS =  6;
    private int[][] notas;

    /**
     * Constructor  
     */
    public Curso()
    {
        notas = new int[MAX_ESTUDIANTES][MAX_ASIGNATURAS];
        inicializar(notas);
    }

    /**
     *  Inicializa el array con notas aleatorias entre 1 y 10 inclusive
     */
    private void inicializar(int[][] notas)
    {
        for (int fila = 0; fila <  notas.length; fila++)    {
            for (int col = 0; col <  notas[fila].length; col++)  {
                notas[fila][col] = (int) (Math.random() * 10) + 1;
            }
        }
    }

    /**
     *  Muestra en pantalla  
     * 
     */
    public void escribir( )
    {
        for (int fila = 0; fila <  notas.length; fila++)   {
            for (int col = 0; col <  notas[fila].length; col++)  {
                System.out.printf("%5d", notas[fila][col]);
            }
            System.out.println();
        }
    }

    /**
     *  
     *  Calcular la media por asignatura
     * 
     */
    public double[] calcularMediaPorAsignatura()
    {
        double[] medias = new double[MAX_ASIGNATURAS];
        for (int col = 0; col < notas[0].length; col++)  {
            double suma = 0.0;
            for (int fila = 0; fila < notas.length; fila++)    {
                suma += notas[fila][col];
            }
            medias[col] =  suma / MAX_ESTUDIANTES ;
        }
        return medias;
    }

    /**
     *  
     *  Calcular la media por alumno
     * 
     */
    public double[] calcularMediaPorAlumno()
    {
        double[] medias = new double[notas.length];
        for (int fila = 0; fila < notas.length; fila++)    {
            double suma = 0.0;
            for (int col = 0; col < notas[fila].length; col++)  {
                suma += notas[fila][col];
            }
            medias[fila] = suma / MAX_ASIGNATURAS;
        }
        return medias;
    }

    /**
     *  @param alumno nº de alumno - asumimos entre 0 y  MAX_ESTUDIANTES - 1
     *
     */
    public int suspensosDelAlumno(int alumno)
    {
        if (alumno < 0 || alumno >= notas.length) {
            throw new IllegalArgumentException("Error en nº alumno");
        }
        int suspensos = 0;
        for (int col = 0; col < notas[alumno].length; col++) {
            if (notas[alumno][col] < 5)  {
                suspensos ++;
            }
        }
        return suspensos;

    }

    /**
     *  @param asignatura nº de asignatura - asumimos entre 0 y  MAX_ASIGNATURAS - 1
     *
     */
    public int aprobadosEnAsignatura(int asignatura)
    {
        if (asignatura < 0 || asignatura >= notas[0].length) {
            throw new IllegalArgumentException("Error en nº asignatura");
        }
        int aprobados = 0;
        for (int fila = 0; fila < notas.length; fila++)   {
            if (notas[fila][asignatura] >= 5)  {
                aprobados ++;
            }
        }
        return aprobados;

    }

    /**
     * 
     */
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.escribir();
        double[] mediasPorAlumno = curso.calcularMediaPorAlumno();
        System.out.println("Media por alumno");
        System.out.println(Arrays.toString(mediasPorAlumno));
        double[] mediasPorAsignatura = curso.calcularMediaPorAsignatura();
        System.out.println("Media por asignatura");
        System.out.println(Arrays.toString(mediasPorAsignatura));
        int alumno = 7;
        System.out.println("Suspensos del alumno " + alumno + " = " + curso.suspensosDelAlumno(alumno));
        int asignatura = 4;
        System.out.println("Aprobados en asignatura " + asignatura + " = " + curso.aprobadosEnAsignatura(asignatura));
    }

}
