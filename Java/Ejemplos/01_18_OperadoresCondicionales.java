
//Mi clase en Java
public class HolaMundo {

    public static void main(String args[]) {
        int a = 8;
        int valorMinimo = 0;
        int valorMaximo = 10;
        
        boolean resultado = a >= 0 && a <= 10;
        if(resultado){
            System.out.println("Dentro de rango");
        }
        else{
            System.out.println("Fuera de rango");
        }
        
        boolean vacaciones = false;
        boolean diaDescanso = true;
        
        if( vacaciones || diaDescanso){
            System.out.println("Padre puede asisitir al juego del hijo");
        }
        else{
            System.out.println("El padre esta ocupado");
        }
        
    }
}
