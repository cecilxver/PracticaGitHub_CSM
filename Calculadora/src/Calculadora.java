public class Calculadora {     
    public static void main(String[] args) {   
        //Este programa sirve para que te muestre todas las operaciones entre dos números
        //Correción: En línea 11, no es un error en sí pero debería usarse un número mayor a 0 
        //ya que en divisiones saldrá un error.
        //En línea 12 hay un error lógico ya que la variable suma en su interior tiene una resta
        // En línea 18 hay un error sintáctico, ya que la variable multi no existe 
        //En línea 19hay un error sintáctico ya que falta un ;
        //En línea 20 falta una llave de cierre   
        int num1 = 10;         
        int num2 = 5;                  
        int suma = num1 + num2;         
        int resta = num1 - num2;         
        int multiplicacion = num1 * num2;         
        int division = num1 / num2;                   
        System.out.println("La suma es: " + suma);         
        System.out.println("La resta es: " + resta);         
        System.out.println("La multiplicación es: "+multiplicacion);         
        System.out.println("La división es: " + division);      
    }}