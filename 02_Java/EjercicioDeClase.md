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
