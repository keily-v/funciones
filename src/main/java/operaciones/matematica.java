
package operaciones;


public class matematica {
    //atributos de la clase matematica
    int a;
    int b;
    
    //método de la clase matemáticas
    public void sumar(){
    
        //variables locales
        int resultado= this.a + this.b;
        System.out.println("EL resultado es: " + resultado);
    }
    
    public int sumar1(){
        int resultado = this.a + this.b;
        return resultado;
        
    }
    //metodo con parametros
    public void sumar2(int arg1, int arg2){
        
        //a travez de estos valores modifiquen arg1 y arg2 modifique las variables de clase 
        this.a=arg1;
        this.b=arg2;
        //llamar al metodo sumar 2
        System.out.println("El resultado del metodo con parametro es: " +this.a +this.b);
        //se debe realizar primero la presecendia
        System.out.println("El resultado del metodo con parametro es: " +(this.a +this.b));
    }
}
