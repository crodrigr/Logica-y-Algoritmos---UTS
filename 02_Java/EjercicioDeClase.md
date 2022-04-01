# Ejercicios de Clase

## 1. Obtener la parte decimal de un número real. 

![image](https://user-images.githubusercontent.com/31961588/161311834-96876277-f26f-4b00-85b9-df0008c381b2.png)

**Solución**

```Java
public class MyClass {
    public static void main(String args[]) {
       System.out.println("PARTE DECIMAL");
       
       double number = 31.54;

       int iPart = (int) number;
       double fPart = number - iPart;

       System.out.println("Integer part = " + iPart);
       System.out.println("Fractional part = " + fPart);
    }
}

```
## 2. Número invertido

![image](https://user-images.githubusercontent.com/31961588/161312125-6cd00cea-86f8-42e0-94cc-4646784ed88e.png)

**Solución**

```Java
public class MyClass {
    public static void main(String args[]) {
       System.out.println("PARTE DECIMAL");
       int c,d;
       int numero = 315;
       int invertido=0;
       System.out.println("Número = " + numero);
    
       c=(numero%10)*100;
       numero=numero/10;
       d=(numero%10)*10;
       numero=numero/10;
       invertido=c+d+numero;
       
       System.out.println("Invertido = " + invertido);
  
    }
}
```

## 2. Calcular hora futura

![image](https://user-images.githubusercontent.com/31961588/161313481-2cd0c06c-dc20-44fd-a901-cd988c247a5c.png)

**Solución**

```Java
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
        Scanner leer = new Scanner(System.in);
        int hActual,numeroH,totalH;
        
        System.out.println("Ingrese la hora actual:");
        hActual=leer.nextInt();
        
        System.out.println("Ingrese ingrese el número de horas:");
        numeroH=leer.nextInt();
        
        totalH=hActual+numeroH;
        
        if(totalH<=24){
          System.out.println("En "+ numeroH+ " horas, el reloj marcara las " + totalH);
        }else{
          totalH=totalH%24;
          System.out.println("En "+ numeroH+ " horas, el reloj marcara las " + totalH);   
        }
       
  
    }
}
```
