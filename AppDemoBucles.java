import java.util.Scanner;
/**
 *  @author - Jaione echalecu Sagasti
 *  
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 */
public class AppDemoBucles
{

    /**
     *  Punto de entrada a la aplicación. Dentro del main:
     *  - define y crea el teclado  
     *  - define e instancia un objeto DemoBucles
     *  - pide la cantidad tope  máxima de aleatorios a generar
     *  - valida que ese tope esté entre 10 y 15
     *  - muestra los números generados como suma de potencias de 2
     *  
     *  - haz una pausa y borra la pantalla 
     *  
     *  - muestra la figura para 6 escalones de alto = 4 y ancho = 12
     *  
     *  
     */
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in); 
        DemoBucles demoBucle = new DemoBucles();
        
        Utilidades.borrarPantalla();
        System.out.println("Teclee tope de aleatorios a generar [10, 15]:");
        int tecla = teclado.nextInt();
        while (tecla >= 15 || tecla <= 10)    
        {
            System.out.println("Error, teclee tope de aleatorios a generar [10, 15]:");
            tecla = teclado.nextInt();
        }
        demoBucle.generarAleatorios(tecla);
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();
        demoBucle.mostrarEscalera(6, 4, 12);
    }
}

