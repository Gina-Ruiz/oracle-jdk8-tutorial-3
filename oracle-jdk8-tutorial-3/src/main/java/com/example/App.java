package com.example;

public class App {
	public static void main(String[] args) {

		/* El text block es una caracteristica nueva de la version 21 de Java y 
		* permite crear cadenas de caracteres que abarquen varias lineas
		* sin necesidad de caracteres de cambio de linea ni secuencias de escape */
	 
		String tradicionalmente = "{\n" + 
				" \"name\" : \"John Doe\", \n " + 
				" \"age\" : 30\n " + 
				"}";


		System.out.println(tradicionalmente);
				
				
		System.out.println("Como seria con un text block ");

		String textBlock = """
		{
				"name" : "John Doe",
				"age" : 30 
		} 
		""";

				System.out.println(textBlock);
		
	}
	
}
