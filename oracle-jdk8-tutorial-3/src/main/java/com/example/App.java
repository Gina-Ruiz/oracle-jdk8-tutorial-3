package com.example;

public class App {
	public static void main(String[] args) {

		/*
		 * Los objetos de la clase String son inmutables, es decir que una vez creados
		 * no se pueden modificar.
		 * 
		 * Lo anterior, a simple vista puede parecer contradictorio por lo mucho que se
		 * utilizan las variables de tipo String
		 */

		String nombre = "Youssef";

		// Vamos a concatener el nombre de Youssef con el apellido Belhaj
		// y veamos cual es el resultado

		System.out.println(nombre.concat(" Belhaj"));

		// Mostramos el valorde la variable u objeto nombre y veremos que el valor
		// no ha cambiado, la valor es inmutable

		System.out.println("El valor de la variable nombre es: " + nombre);

		/*
		 * ¿Ventajas de la inmutabilidad de los objetos de la clase Sting?
		 * 
		 * -Ni por accidente se puede cambiar el valor de la variable una vez creada -Se
		 * puede acceder a dicho objeto inmutable de forma concurrente.
		 * 
		 * ¿Y que quiere decir concurrente?
		 * 
		 * Quiere decir acceder a un elemento, simultaneamente, a la misma vez, por
		 * varios hilos(entiendase los cores de un procesador de varios nucleos, de
		 * varios hilos) sin peligro de que se vaya a corromper la informacion contenida
		 */

		/*
		 * ¿Desventajas de la inmutabilidad de los objetos de la clase String?
		 * 
		 * La unica desventaja es que en operaciones de concatenacion son bastante
		 * ineficientes, porque pueden generar un gran numero de variables intermedia lo
		 * cual puede afectar a la memoria y al rendimiento de la aplicacion en general.
		 */

		/*
		 * A modo de ejemplo, el codigo siguiente que ha sido verificado a traves de la
		 * herramienta jshell
		 */

		String resultado = "";

		for (int i = 0; i < 100; i++) {
			resultado = resultado.concat(Integer.toString(i));
		}

		/*
		 * El bucle for anterior genera 100 variables intermedias hasta llegar a la
		 * operacion final
		 */

		System.out.println(resultado);

		/*
		 * ¿Como se soluciona el problema de la inmutabilidad en operaciones de
		 * concatenacion de cadenas de caracteres?
		 * 
		 * Se soluciona utilizando el tipo StringBuilder, es decir, la clase
		 * StringBuilder
		 * 
		 * La clase StringBuilder permite construir cadenas de caracteres mutables, es
		 * decir, que se puede modificar una vez que ha sido creada
		 * 
		 * No obstante, hay que ser juicioso y precavido a la hora de crear objetos de
		 * este tipo, porque la desventaja que tiene es que no es seguro en operaciones
		 * multi hilos, o concurrentes, no existe garantia de que un objeto de tipo
		 * StringBuilder no pueda ser modificado por uno de los hilos que participan en
		 * el procesamiento paralelo.
		 *
		 * Si fuese necesario utilizar StringBuilder en operaciones concurrentes se
		 * recomienda utilizar StringBuffer, pero aqui habria una ligera penalizacion
		 * por rendimiento, por un encabezado adicional que se incorpora
		 * 
		 * En resumen, que StringBuilder solo debe utilizarse en operaciones de
		 * concatenacion siempre y cuando no sean concurrentes
		 */

		/*
		 * Ejemplos de creacion de objetos de tipo StringBuilder y metodos de la clase
		 * StringBuider
		 */

		/* Existen 3 formas de crear objetos utilizando la clase StringBuilder */

		// Genera/crea/instancia un objeto StringBuilder vacio
		StringBuilder sb1 = new StringBuilder();

		// Genera/crea/instancia un objeto StringBuilder para el cual
		// se han reservado 10 posiciones inicialmente
		StringBuilder sb2 = new StringBuilder(10);

		// Genera/Crea/Instancia un objeto StringBuilder con valor "Hello"
		StringBuilder sb3 = new StringBuilder("Hello");

		/*
		 * Utilizando la herramienta jshell terminaremos de demostrar que los objetos
		 * StringBuilder son mutables
		 */

		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World").insert(0, "Hey, ").delete(4, 10);

		System.out.println(sb);

		/*
		 * Ejercicio # 1 del Martes 9 junio.
		 * 
		 * Rescribir el codigo siguiente que concatena 100 valores en bucle, utilizando
		 * la sentancia for clasica, para utilizar:
		 * 
		 * 1- La clase StringBuilder y sus metodos correspondientes 2- En lugar de una
		 * sentencia for clasica utilizar una sentencia while
		 * 
		 * 
		 * String resultado = "";
		 * 
		 * for (int i = 0; i < 100; i++) { resultado =
		 * resultado.concat(Integer.toString(i)); }
		 * 
		 */

		StringBuilder resultado2 = new StringBuilder();

		int i = 0;

		while (i < 100) {
			resultado2.append(Integer.toString(i++)).append(" ");

		}

		System.out.println(resultado2);

		/*
		 * Metodos mas utilizados de la clase String, que son validos, en su mayoria
		 * para la clase StringBuilder tambien
		 */

		String sampleCadena = "Yodalis Ninoska Grillo";

		char caracterEjemplo = '2';
		// Metodo que recupera la cantidad de caracteres de la variable, u objeto,
		// de tipo String

		int totalCaracteres = sampleCadena.length();

		System.out.println("Total de caracteres de la variable es: " + totalCaracteres);

		// Recupera el caracter en una posicion cocreta de la cadena
		char result2 = sampleCadena.charAt(0);

		System.out.println("En el indice 0 esta el caracter: " + result2);

		// Busca la ocurrencia de una cadena de catacteres o un caracter simple
		// y devuelve el indice de la posicion deonde ha sido encontrado o -1
		// si no ha sido encontrado

		String cadenaBuscar = "noska";

		if (sampleCadena.indexOf(cadenaBuscar) != -1) {
			System.out.println("La cadena " + cadenaBuscar + " ha sido encontrada en la variable sampleCadena");
		} else {
			System.out.println("La cadena " + cadenaBuscar + " no ha sido encontrada en la variable sampleCadena");
		}

		/*
		 * Ejercicio # 1 del Miercoles 10 de Junio. Modificar el codigo anterior para si
		 * la cadena ha sido encotrada que se muestre la posicion, o indice, donde ha
		 * sido encontrada
		 */

		String cadenaABuscar2 = "noska";

		int indice = sampleCadena.indexOf(cadenaABuscar2);

		if (indice != -1)
			System.out.println("Se ha encontrado la cadena a buscar en la posicion: " + indice);
		else
			System.out.println("No se ha encontrado la cadena a buscar");

		// Otra manera de escribir el codigo anterior, utilizando la asignacion dentro
		// de la condicion del if

		String cadenaABuscar3 = "noska";

		int indice0 = 0;

		if ((indice0 = sampleCadena.indexOf(cadenaABuscar3)) != -1)
			System.out.println("Se ha encontrado la cadena a buscar en el indice: " + indice0);
		else
			System.out.println("No se ha encontrado la cadena a buscar");

		// Recupera una parte de la cadena que va desde un indice inicial hasta un valor
		// de un indice o posicion final

		String subCadena = sampleCadena.substring(8, 14);

		System.out.println("Subcadena resultante del metodo substring: " + subCadena);

		//// Convertir a mayusculas

		System.out.println(sampleCadena.toUpperCase());

		// Convertir a minusculas

		System.out.println(sampleCadena.toLowerCase());
		
		
		/* Ejercicio # 2. 
		* 
		* Buscar la posicion de la cadena grillo en la cadena sampleCadena, 
		* realizando una busqueda case insensitive (insensible a las mayusculas o 
		* minusculas), y mostrar la posicion en la cual ha sido encontrada si 
		* es par, de lo contrario no mostrar nada */
		
		String cadenaABuscar4 = "grillo";

		int posicion = sampleCadena.toLowerCase().indexOf(cadenaABuscar4.toLowerCase());

		if (posicion != -1 && posicion % 2 == 0)
		    System.out.println("La cadena '" + cadenaABuscar4 + "' fue encontrada en la posición: " + posicion);
		
		// Metodo equals que comprueba si el contenido de dos objetos de tipo String
		// o de cualquier otro tipo, son iguales

		String obj1 = "Hola";
		String obj2 = new String("Hola");
		
		// Un literal de tipo String se crea en zona de la memoria reservada
		// especialmente para ello, denominada String Pool

		String literalDeCadena1 = "Hola";

		// Los literales de cadena la maquina virtual de Java comprueba si ya estan
		// en el String Pool y si es asi, no crea un nuevo literal de cadena, sino
		// que reutiliza el que ya existe, por lo cual a literalDeCadena2 se 
		// le ha asignado el mismo valor que a literalDeCadena1 porque la cadena "Hola"
		// ya existia en el String Pool

		String literalDeCadena2 = "Hola";

		if (literalDeCadena1 == literalDeCadena2) {
		System.out.println("Verdadero");
		} else {
		System.out.println("Falso");
		}


		// La variable siguiente se crea en otra zona que no es el String Pool, sino
		// en una zona de la memoria denominada el Heap, es decir, donde se crean 
		// las variables dinamicas
		String obj3 = new String("Hola");
		String obj4 = new String("Hola");
		
		if (obj2.equals(obj3)) {
			System.out.println("El contenido de los objtos obj2 y obj3 son iguales");
			} else {
			System.out.println("Son diferentes ");
			}
		
		/* Si quieres el contenido de dos objetos de tipo String independientemente
		* de las mayusculas y minusculas que tengan hay que utilizar el metodo 
		* equalsIgnoreCase */

		if (obj3.equalsIgnoreCase(obj4)) {
		System.out.println("El contenido de los objetos obj2 y obj3 son iguales");
		} else {
		System.out.println("Son diferentes ");
		}
		
		/* Comprueba que la primera letra o carecter de una cadena sea el 
		* especificado */

		if (sampleCadena.startsWith("Y"))
		System.out.println("Si, comienza con la letra Y");
		else {
		System.out.println("No, no comienza con la letra Y");
		}
		// Existe tambien el metodo endsWith()
		
		/* Comprueba que la primera letra o caracter de una cadena sea el 
		* especificado */

		if (sampleCadena.startsWith("Y"))
		System.out.println("Si, comienza con la letra Y");
		else {
		System.out.println("No, no comienza con la letra Y");
		}

		// Existe tambien el metodo endsWith()

		/* Comprueba si una cadena contiena a otra subcadena */

		if (sampleCadena.contains("Grillo")) 
		System.out.println("Si, la contiene");
		else 
		System.out.println("No la contiene");
		
		// Metodo que substituye partes de una cadena. 
		// Como ejemplo en la cadena sampleCadena substituir 123 por nada
		// y mostrar la cadena antes y despues de la substitucion
		
		
		System.out.println("Cadena original: " + sampleCadena);

		sampleCadena.replace("123", "");

		// ¿Deberia mostrarse "Yodalis $ @ Ninoska Grillo" ?
		System.out.println("Cadena despues de eliminar 123 " + sampleCadena );
		
		/*Los metodos siguientes, historicamente, tienden a confundir.
		 * 
		 * isEmpty() isBlank()
		 */
		
		String sampleString = "";
		
		String result = sampleString.isEmpty() ? "Si, esta vacia" : "No, no esta vacia";
		
		System.out.println("Resultado de la llamada al metodo isEmty()" + result);
		
		/* El metodo isEmpty() devuelve un valor verdadero si y solo si la cantidad de 
		 * elementos de la cadena es cero, es decir, si el resultado del metodo length()
		 * sobre la cadena es creo.
		 * */
		
		/* Entre utilizar el operador de suma (+) y el metodo concat() es preferible el 
		* operador + porque esta optimizado para en las operaciones de concatenacion de 
		* cadenas de caracteres, cambiar los operandos a StringBuilder */
		
		/* El metodo isBlank() devuelve verdadero (true) al igual que el metodo isEmpty(),
		* en el caso que la cadena tenga longitud cero, es decir, cero caracteres.
		* 
		* y, ademas, el metodo isBlank() devuelve true cuando la cadena solamente este 
		* formada por espacios en blanco */

		String sampleString2 = " ";

		// Para la cadena anterior, el metodo isEmpty() retorna false, mientras que el metodo
		// isBlank retorna verdadero

		System.out.println(sampleString2.isEmpty()); // false
		System.out.println(sampleString2.isBlank()); // true
		
		/* Eliminar espacios en blanco al principio y al final de una cadena  */
		
		 String sampleString3 = "   Hola Mundo   ";
		 
		 // Tanto los metodos trim() como strip() eliminan los caracteres en blanco
		 // al principio y al final 
		 System.out.println("Valor de la cadena sampleString3: '" + sampleString3 + "'");
		
		 /* Eliminar espacios en blanco al principio y al final de una cadena */
		 
		 /* Eliminar espacios en blanco al principio y al final de una cadena */

		 String sampleString4 = " Hola ";

		 // Tanto los metodos trim() como strip() eliminan los caracteres en blanco 
		 // al principio y al final de una cadena

		 System.out.println("Valor de la cadena sampleString3 original : " + sampleString4);

		 System.out.println("Cadena sampleString3 sin los espacios en blanco: " 
		 + sampleString4.trim());

		 System.out.println("La cadena sampleString3 continua siendo la misma, "
		 + "porque es inmutable : " + sampleString4);
	}
	
}
