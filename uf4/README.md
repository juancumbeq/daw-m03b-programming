# UF4: PROGRAMACIÓN ORIENTEADA A OBJETOS (POO)

<p align="center">
  <img src="https://img.shields.io/badge/Curso%20-Finalizado-brightgreen"/>
</p>

<br>

## Index
  - [Obetivos](#objetivos)


<br>
<br>

## JAVA

  - JAVA es un lenguaje interpretado a través de una máquina virtual Java

  - Lenguaje multiplataforma, código binario universal.

  - Lenguaje orientado a objetos:
    - Módulos de programación = clases.
    - No existen funciones independientes.
    - Cualquier variable pertenece a una clase.

  - Gran biblioteca de clases.

<br>

#### Características

  - Independencia de la plataforma.
  - Fácil de aprender.
  - Basado en estándares.
  - Muldiamente extendido.
  - Usado en control de dispositivos.

<br>

#### Estructura de un proyecto POO

<p align="center">
  <img src="https://github.com/juancumbeq/daw-m03b-programming/blob/main/uf4/images/EstructuraProyectoJava.png?raw=true" width= "99%" alt="estructura de proyecto JAVA">
</p>

<br>

#### Estructura de un programa JAVA

<p align="center">
  <img src="https://github.com/juancumbeq/daw-m03b-programming/blob/main/uf4/images/EstructuraProgramaJava.png?raw=true" width= "99%" alt="estructura de proyecto JAVA">
</p>

<br>
<br>

## Variables

  - Estructuras de datos que pueden variar durante la ejecución del programa.
  - En Java se reserva una zona de memoria que la máquina virtual gestiona automáticamente.
  - Sintaxis de declaración de variables:```tipoVariabl nombreVariable;  ```

<br>

#### Tipos primitivos

  - byte - entero - 1 byte
  - short - entero - 2 bytes
  - int - entero - 4 bytes
  - long - entero - 8 bytes
  - float - decimal simple - 4 bytes
  - double - decimal doble - 8 bytes
  - char - caracter simple - 2 bytes
  - boolean - valor true o false - 1 byte
  - El tipo de dato String no es un primitivo de Java ya que se representa con la clase String.

<br>

#### Tipos complejos

  - Son las librerías fundamentales de Java y los tipos de datos que creemos.
  - Ejemplos: String, ArrayList, Scanner, System,...
  - Se declaran igual que los tipos primitivos.
  - Se inicializan por medio de su constuctor.
  - Sintaxis: ```TipoComplejo nombreVariable = new TipoComplejo(parametro);```

<br>

#### String - Funciones útiles
  
  - char charAt(int indice):
    - Devuelve el carácter que se encuentra en la posición del índice.

  - Boolean equals (String string):
    - Devuelve *True* si el objeto que se pasa por parámetro y el string son iguales. Si no, devuelve *False*.

  - boolean isEmpty():
    - Si la cadena es vacía, devuelve *True*, es decir, si su longitud es cero.

  - int length():
    - Devuelve el número de caracteres de la cadena.

<br>
<br>

## Variables VS Constantes

#### Variables

  - Declarar las variables al inicio de la clase o función
  - Una variable sin inicializar, tiene un valor desconocido.
  - Siempre que declaremos una variable se le da un valor inicial.

<br>

#### Constantes

  - Las constantes son similares a las variables.
  - Van precedidas de la palabra **final**.
  - No pueden ser modificadas.
  - Ejemplo:
  ```
  public class Ejemplo{
    public static void main(String[] args){
      final String txt = "Hola Mundo!";
      System.out.println(txt);
    }
  }
  ```

## Ámbito de variables

<p align="center">
  <img src="https://github.com/juancumbeq/daw-m03b-programming/blob/main/uf4/images/AmbitoVariables.png?raw=true" width= "99%" alt="estructura de proyecto JAVA">
</p>

<br>
<br>

## Operadores aritméticos y lógicos

<p align="center">
  <img src="https://github.com/juancumbeq/daw-m03b-programming/blob/main/uf4/images/OperadoresAritmeticosLogicos.png?raw=true" width= "99%" alt="estructura de proyecto JAVA">
</p>

<br>
<br>

## Comentarios

  - Comentarios de una línea: //
  - Comentarios de varias líneas: /* */
  - Comentarios de Javadoc: /** */

<br>
<br>

## Salida y entrada de datos por consola

#### Salida

  - ```System.out.println("Introduce un caracter");```

#### Entrada
```
Scanner scanner = new Scanner(System.in);
System.out.println("Introduce una linea");
String line = scanner.nextLine();
System.out.println(line);
```

#### Caracteres de escape

<p align="center">
  <img src="https://github.com/juancumbeq/daw-m03b-programming/blob/main/uf4/images/CaracteresEscape.png?raw=true" width= "99%" alt="estructura de proyecto JAVA">
</p>

<br>
<br>

## Estructuras de control

#### Características:

  - Tienen un único punto de entrada y un único punto de salida.
  - Están compuestas por instrucciones o por otras estructuras de control.

<br>

#### Categorías

  - Estructura Secuencial
  - Estructura Condicional o selectica
  - Estructura Iterativa o Repetitiva
  - Instrucciones de salto

<p align="center">
  <img src="https://github.com/juancumbeq/daw-m03b-programming/blob/main/uf4/images/EstructurasCategorias.png?raw=true" width= "99%" alt="estructura de proyecto JAVA">
</p>

<br>

#### Sintaxis estructuras de control Java - Estructuras de selección

<p align="center">
  <img src="https://github.com/juancumbeq/daw-m03b-programming/blob/main/uf4/images/EstructurasSeleccion.png?raw=true" width= "99%" alt="estructura de proyecto JAVA">
</p>

  - Ejemplo de uso: [ver archivo](https://github.com/juancumbeq/daw-m03b-programming/blob/main/uf4/code/01_EjemploClase1.cs)

<br>

#### Sintaxis estructuras de control Java - Estructuras de repetición

<p align="center">
  <img src="https://github.com/juancumbeq/daw-m03b-programming/blob/main/uf4/images/EstructurasRepeticipn.png?raw=true" width= "99%" alt="estructura de proyecto JAVA">
</p>

  - Ejemplo de uso:
    - Realiza la Clase EstructurasControl2, que muestre los "n" primeros valores de la secuenca de Fibonacci; siendo "n" un número entero llamado "num"; qué es introducido por consola.
      - La secuencia de Fibinacci es una sucesión de números en la que cada término se obtiene sumando los dos anteriores: 0, 1, 2, 3, 5, 8, 13, 21, 34, etc.
      - La secuencia de Fibonacci tiene muchas aplicaciones en matemáticas y ciencias naturales, así como en la teoría de juegos y la criptografía.
      - La proporción áurea es una relación matemática entre dos cantidades en la que la proporción  de la suma de ambas a la mayor de las dos es igual a la proporción de la mayor a la menor.

[ver archivo](https://github.com/juancumbeq/daw-m03b-programming/blob/main/uf4/code/02_EjemploClase2.cs)

<br>
<br>

## Ejercicio 1

  - Realiza la clase MostrarTableroConsola, que muestre el "tablero" de la imagen; con las siguientes especificaciones:

    - Directamente desde el método main.
    - Solo puede tener declaradas dos variables enteras: fila y columna.
    - No está permitido el uso de estructuras de seleccion (solo un "if" anidado).

<p align="center">
  <img src="https://github.com/juancumbeq/daw-m03b-programming/blob/main/uf4/images/Tablero.png?raw=true" width= "45%" alt="estructura de proyecto JAVA">
</p>

[ver archivo](https://github.com/juancumbeq/daw-m03b-programming/blob/main/uf4/code/02_EjemploClase2.cs)




<br>
<br>

## UF2: PROGRAMACIÓN MODULAR

Acceder a la siguiente UF: [enlace](https://github.com/juancumbeq/daw-m03a-programming/tree/main/uf2)


<br>
<br>

## Autor

Este proyecto fue desarrollado por Juan Cumbe. Si tienes alguna pregunta o sugerencia sobre el proyecto, no dudes en contactarme a través de [e-mail](mailto:hello@juancumbe.com) o mi perfil de [Linkedin](https://www.linkedin.com/in/juancumbeq/). 😊