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

## 7. Suma entre ellos

![image](https://user-images.githubusercontent.com/31961588/161316404-b38f03af-b012-44cf-9f46-b7c5a699cdaf.png)

## 8. Tabla de multiplicar

![image](https://user-images.githubusercontent.com/31961588/161316508-f6228676-cf5e-42cd-97c8-0a9a91f30554.png)

## 9. Divesores

![image](https://user-images.githubusercontent.com/31961588/161316696-0ab90b26-b5ce-4986-abd4-71656e220b26.png)

## 10. Dibujo de asteriscos

![image](https://user-images.githubusercontent.com/31961588/161316915-9be4cf28-9182-45f1-ab64-94aa979e8eb2.png)

![image](https://user-images.githubusercontent.com/31961588/161316980-8a5f67fa-5511-48a6-9293-f471e5986b79.png)

## 11 Digitos

![image](https://user-images.githubusercontent.com/31961588/161317459-64acab49-1c68-40bd-a059-327482bc69e6.png)

## Verificador de digito

![image](https://user-images.githubusercontent.com/31961588/161317842-c91525c3-e2e9-408e-b930-eb853a8d6015.png)

