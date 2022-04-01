
//Mi clase en Java
public class HolaMundo {
    
    public static void main(String args[]) {
        int resultado = (1 > 2) ? "verdadero" : "falso";        
        System.out.println("resultado = " + resultado);
        
        int numero = 9;
        resultado = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("resultado = " + resultado);
    }
}
