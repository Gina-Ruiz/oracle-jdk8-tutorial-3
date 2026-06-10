package com.example;

public class App {
    public static void main(String[] args) {
    
    	/*
    	* Los objetos de la clase String son inmutables, es decir que una vez creados
    	* no se pueden modificar.
    	* 
    	* Lo anterior, a simple vista puede parecer contradictorio por lo mucho que se 
    	* utilizan las variables de tipo String */

    	String nombre = "Youssef";

    	// Vamos a concatener el nombre de Youssef con el apellido Belhaj
    	// y veamos cual es el resultado

    	System.out.println(nombre.concat(" Belhaj"));
    	
    	// Mostramos el valorde la variable u objeto nombre y veremos que el valor
    	// no ha cambiado, la valor es inmutable 
    	
    	System.out.println("El valor de la variable nombre es: " + nombre);
    	
    	/* ¿Ventajas de la inmutabilidad de los objetos de la clase Sting?
    	 * 
    	 * -Ni por accidente se puede cambiar el valor de la variable una vez creada
    	 * -Se puede acceder a dicho objeto inmutable de forma concurrente.
    	 * 
    	 * ¿Y que quiere decir concurrente?
    	 * 
    	 * Quiere decir acceder a un elemento, simultaneamente, a la misma vez, por 
    	 * varios hilos(entiendase los cores de un procesador de varios nucleos, de
    	 * varios hilos) sin peligro de que se vaya a corromper la informacion contenida */
    	
    	/* ¿Desventajas de la inmutabilidad de los objetos de la clase String? 
    	* 
    	* La unica desventaja es que en operaciones de concatenacion son bastante 
    	* ineficientes, porque pueden generar un gran numero de variables intermedia
    	* lo cual puede afectar a la memoria y al rendimiento de la aplicacion en 
    	* general.
    	*  */
    	
    	/* A modo de ejemplo, el codigo siguiente que ha sido verificado a traves de la
    	* herramienta jshell */

    	String resultado = "";

    	for (int i = 0; i < 100; i++) {
    	resultado = resultado.concat(Integer.toString(i));
    	}

    	/* El bucle for anterior genera 100 variables intermedias hasta llegar 
    	* a la operacion final */

    	System.out.println(resultado);
    	
    	/* ¿Como se soluciona el problema de la inmutabilidad en operaciones de 
    	* concatenacion de cadenas de caracteres? 
    	* 
    	* Se soluciona utilizando el tipo StringBuilder, es decir, la clase 
    	* StringBuilder 
    	* 
    	* La clase StringBuilder permite construir cadenas de caracteres mutables, 
    	* es decir, que se puede modificar una vez que ha sido creada 
    	* 
    	* No obstante, hay que ser juicioso y precavido a la hora de crear 
    	* objetos de este tipo, porque la desventaja que tiene es que no es
    	* seguro en operaciones multi hilos, o concurrentes, no existe garantia
    	* de que un objeto de tipo StringBuilder no pueda ser modificado por uno 
    	* de los hilos que participan en el procesamiento paralelo. 
    	*
    	* Si fuese necesario utilizar StringBuilder en operaciones concurrentes
    	* se recomienda utilizar StringBuffer, pero aqui habria una ligera penalizacion
    	* por rendimiento, por un encabezado adicional que se incorpora 
    	* 
    	* En resumen, que StringBuilder solo debe utilizarse en operaciones de 
    	* concatenacion siempre y cuando no sean concurrentes */
    	
    	/* Ejemplos de creacion de objetos de tipo StringBuilder y metodos de la 
    	* clase StringBuider */
    	
    	/* Existen 3 formas de crear objetos utilizando la clase StringBuilder */
    	
    	// Genera/crea/instancia un objeto StringBuilder vacio
    	StringBuilder sb1 = new StringBuilder();
    	
    	// Genera/crea/instancia un objeto StringBuilder para el cual
    	// se han reservado 10 posiciones inicialmente
    	StringBuilder sb2 = new StringBuilder(10);
    	
    	// Genera/Crea/Instancia un objeto StringBuilder con valor "Hello"
    	StringBuilder sb3 = new StringBuilder("Hello");
    	
    	/* Utilizando la herramienta jshell terminaremos de demostrar que 
    	* los objetos StringBuilder son mutables */
    	
    	StringBuilder sb = new StringBuilder("Hello");
    	sb.append(" World").insert(0, "Hey, ").delete(4, 10);
    	
    	System.out.println(sb);
    	
    	
    	/* Ejercicio # 1 del Martes 9 junio. 
    	* 
    	* Rescribir el codigo siguiente que concatena 100 valores en bucle, utilizando
    	* la sentancia for clasica, para utilizar: 
    	* 
    	* 1- La clase StringBuilder y sus metodos correspondientes
    	* 2- En lugar de una sentencia for clasica utilizar una sentencia while 
    	* 
    	* 
    	String resultado = "";

    	for (int i = 0; i < 100; i++) {
    	resultado = resultado.concat(Integer.toString(i));
    	}

    	*/
    	
    	
    	StringBuilder resultado2 = new StringBuilder();

    	int i = 0;

    	while (i < 100) {
    	    resultado2.append(Integer.toString(i++)).append(" ");
    	  
    	}

    	System.out.println(resultado2);
    	
    }
}
