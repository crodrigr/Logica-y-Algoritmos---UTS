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

## 3. Calcular hora futura

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

## 4. Palabra más larga

![image](https://user-images.githubusercontent.com/31961588/161314780-387facf8-ca94-4329-9e18-e5d2f859ce9a.png)

**Solución**

```Java
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
        Scanner leer = new Scanner(System.in);
        String palabra1,palabra2;
        System.out.println("Ingrese la primera palabra:");
        palabra1=leer.next();
        System.out.println("Ingrese la segunda palabra :");
        palabra2=leer.next();
        
        if(palabra1.length()<palabra2.length()){
           System.out.println("la segunda palabra es más larga"); 
        }else{
            System.out.println("la primera palabra es más larga"); 
        }
        
    }
}
```

## 5. Determinar la edad

![image](https://user-images.githubusercontent.com/31961588/161316000-884eb389-46a5-4ce7-988e-713810f5abde.png)

## 6. Potencia de dos

![image](https://user-images.githubusercontent.com/31961588/161316250-b328c4cd-1f25-4378-94aa-49820413163c.png)

**Solución**

```Java
package ejerciciosdeclase;
import java.util.Scanner;

public class PotenciaDeDos {
    
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
       int numero;
       double potencia;
       System.out.println("Ingresar numero ");
       numero=leer.nextInt();               
       int i=1;       
       while(i<=numero){
         potencia=Math.pow(2, i);
         System.out.println(potencia);
         i++; //i=i+1;  
       }
       
       
    }
    
    
}
```

## 7. Suma entre ellos

![image](https://user-images.githubusercontent.com/31961588/161316404-b38f03af-b012-44cf-9f46-b7c5a699cdaf.png)

**Solución**

```Java
package ejerciciosdeclase2;

import java.util.Scanner;

public class SumaEntreDosValores {
    
     public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);         
         int num1,num2,suma=0,inicio;
         
         System.out.println("Ingrese el numero 1: ");
         num1=leer.nextInt();
         System.out.println("Ingrese el numero 2: ");
         num2=leer.nextInt();
         inicio=num1;
         while(inicio<num2-1){
          inicio=inicio+1;
          suma=suma+inicio;
         }
         
         System.out.println("La suma entre valors " + num1 + " y "+ num2 + " es :"+ suma);
            
     }
    
}
```

## 8. Tabla de multiplicar

![image](https://user-images.githubusercontent.com/31961588/161316508-f6228676-cf5e-42cd-97c8-0a9a91f30554.png)

**Solución**

```Java
package ejerciciosdeclase2;

public class TablaMultiplicacion {
    
    public static void main(String arg[]){
     
        int i,j;
        
        i=1;
        j=1;
        
        while(i<=10){
            j=1;
            while(j<=10){
              if(i==1){                 
                 System.out.print("  "+j);
              }
              if(j==1 &&  i!=1){
                 System.out.print(i);
              }else if(i!=1){
                System.out.print("  "+i*j);        
              }
             j=j+1;
            }
            i=i+1;
            System.out.println();
        }   
    
    }
    
}
```

## 9. Divesores

![image](https://user-images.githubusercontent.com/31961588/161316696-0ab90b26-b5ce-4986-abd4-71656e220b26.png)

## 10. Dibujo de asteriscos

![image](https://user-images.githubusercontent.com/31961588/161316915-9be4cf28-9182-45f1-ab64-94aa979e8eb2.png)

![image](https://user-images.githubusercontent.com/31961588/161316980-8a5f67fa-5511-48a6-9293-f471e5986b79.png)

## 11 Digitos

![image](https://user-images.githubusercontent.com/31961588/161317459-64acab49-1c68-40bd-a059-327482bc69e6.png)

## 12. Verificador de digito

![image](https://user-images.githubusercontent.com/31961588/161317842-c91525c3-e2e9-408e-b930-eb853a8d6015.png)

## 13. Adivinar el número

![image](https://user-images.githubusercontent.com/31961588/161318209-5b3e659c-8b44-4cca-8f2a-ef42de3f06f1.png)

![image](https://user-images.githubusercontent.com/31961588/161318279-f164d286-d917-4b1f-804a-dcc2f6260b5c.png)

![image](https://user-images.githubusercontent.com/31961588/161318311-77bd4fb6-92c6-43e5-94ee-9d2a76b0ea23.png)


## 14. Reglamento de evaluaciones

![image](https://user-images.githubusercontent.com/31961588/162555560-33f3e90a-746d-4a77-8cb1-108e482d925b.png)

![image](https://user-images.githubusercontent.com/31961588/162555574-f9d67d10-d9e5-4543-a560-3abfa97fc2ed.png)

## 15. Número Fibonacci

![image](https://user-images.githubusercontent.com/31961588/162555667-1b41b8ca-68e9-4a2d-beb7-61757b52339e.png)

![image](https://user-images.githubusercontent.com/31961588/162555671-1e34f134-da77-4b40-a9e4-fda7f2484be2.png)

## 16. Caballo de ajedrez

![image](https://user-images.githubusercontent.com/31961588/162556165-602c5710-71e4-4c50-be3f-8bd06c0763b1.png)

![image](https://user-images.githubusercontent.com/31961588/162556177-4bfdff3d-7edb-435c-a1fa-429c3ced0831.png)




