//esta clase permite instanciar los objetos de clase matematica
package operaciones;


public class PruebaMatematica {
    
    public static void main(String[] args) {
        //definicion de variable de tipo matematica, es una variable local 
        matematica ob1 = new matematica();
        ob1.a=25;
        ob1.b=35;
        ob1.sumar();
        
        // se puede utilizar var 
        var a="buenos dias";
        
        //crear metodo con parametros 
        int res = ob1.sumar1();
        System.out.println("res ="+ res);
        System.out.println("El resultado de la suma es =" +ob1.sumar1());
        ob1.sumar2(10, 15);
        
    }
}
