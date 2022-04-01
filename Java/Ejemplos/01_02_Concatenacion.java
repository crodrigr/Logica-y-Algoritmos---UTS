//Mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        String usuario = "Juan";
        String titulo = "Ingeniero";
        String union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        int i = 3;
        int j = 4;
        
        System.out.println(i + j);//se realiza la suma de numeros
        System.out.println(i + j + usuario); //Evaluación de izq a der, realiza suma
        System.out.println(usuario + i + j);//contexto cadena, todo es una cadena
        System.out.println(usuario + (i + j));//uso de parentesis modifican la prioridad en la evaluacion
        
    }
}
