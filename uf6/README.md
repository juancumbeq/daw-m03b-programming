# UF3: FUNDAMENTOS DE GESTIÓN DE FICHEROS

<p align="center">
  <img src="https://img.shields.io/badge/Curso%20-Finalizado-brightgreen"/>
</p>

<br>

## Index
  - [Librerías](#librerías)
  - [Librerías System.io - Clases](#librería-systemio---clases)
  - [FileStream](#filestream)
  - [Stream VS Buffer](#stream-vs-buffer)
  - [Ejercicio opcional PT.1](#ejercicio-opcional-pt1)
  - [Ficheros binarios - Lectura](#ficheros-binarios-uso-del-buffer---lectura)
  - [Ficheros binarios - Escritura](#ficheros-binarios-uso-del-buffer---escritura)
  - [Manejo de ficheros](#manejo-de-ficheros)

<br>
<br>

## Librerías

Una librería es un conjunto de métodos relacionados con el mismo objetivo para poder ser reutilizado cada vez que el programador lo desee. Están basadas en clases.

<p align="center">
  <img src="https://github.com/juancumbeq/daw-m03a-programming/blob/main/uf3/images/UsingSystem.png?raw=true" width= "99%" alt="filestream">
</p>

<p align="center">
  <img src="https://github.com/juancumbeq/daw-m03a-programming/blob/main/uf3/images/ClaseMath.png?raw=true" width= "99%" alt="filestream">
</p>

<br>
<br>

## Librería System.io - Clases

  - **File**: Proporciona métodos estáticos para crear, copiar, eliminar, mover, abrir un solo archivo. **Contribuye a la creación de objetos FileStream.** Métodos estáticos se refiere a que símplemente con llamar a la clase podemos ejecutar el método, sin necesidad de instanciar ningún objeto.

  - **FileStream**: Proporciona un stream para un archivo, lo que **permite operaciones de lectura y escritura síncrona (la ejecución se centra en la operación de lectura/escritura y bloquea las demás) y asíncrona (se puede realizar la operación de lectura/escritura en segundo plano y ejecutar otras tareas a la vez).**
  
  - **StreamReader**: Es una clase que el programa va a usar para guardar la información de un **fichero que se abre por extracción de datos** (Lectura, Read). Lectura de datos en archivo secuencial (habrá un error si el archivo no existe).

  - **StreamWriter**: Es una clase que el programa va a usar para guardar la información de un **fichero que se abre para escritura** (Write, escribir).

  - BinaryReader: Lee en formato finario sobre los archivos indicados.

  - BinaryWriter: Escribe en formato binario sobre los archivos indicados.

<br>
<br>

## FileStream

  - La clase FileStream proporciona un Stream (flujo) para un archivo, lo que permite operaciones de lectura y escritura.

  - El modo en el que vamos a abrir el fichero (FileMode)
    - **Open**: Abre un fichero existente. Si el fichero no existe, lanzará un error.
    - **Append**: Abre un fichero para añadir datos al final del mismo si existe, o crea un fichero nuevo si no existe.
    - **Create**: Crea un nuevo fichero. Si el fichero existe será sobrescrito.
    - **Delete**: Borra un fichero (no se especifica FileAccess).

  - El modo en el que accedemos al fichero (FileAccess):
    - **Read**: Acceso para leer el archivo.
    - **Write**: Acceso de escritura al archivo.
    - **ReadWrite**: acceso de lectura y escritura al archivo.

  - Ejemplo: ```FileStream ficheroOrigen = new FileStream("fondo.jpg", FileMode.Open, FileAccess.Read);```

<br>
<br>

## Stream vs Buffer

  - La diferencia en pocas palabras entre un búffer y una Stream es que una Stream es una secuencia que transfiere información desde o hacia una fuente específica, mientras que un búfer es una secuencia de bytes que se almacena en la memoria. Ejemplo de Stream: ```FileStream stream = new FileStream("filepath.txt", FileMode.OpenOrCreate);```

  - Ejemplo de Búfer: ```byte[] fileContents = File.ReadAllBytes("filepath.txt")```. Lee todos los bytes de un archivo en la memoria. Esto es útil para cuando necesita manipular todo el archivo a la vez, o mantener una "copia local" para que su programa la guarde para que el archivo pueda estar libre para otros usos. Sin embargo, dependiendo del tamaño de la fuente y la cantidad de memoria disponible, un búfer que contiene el archivo completo podría no ser una opción.

<p align="center">
  <img src="https://github.com/juancumbeq/daw-m03a-programming/blob/main/uf3/images/FileStream.png?raw=true" width= "99%" alt="filestream">
</p>

<br>
<br>

## Ejercicio opcional PT.1

  - Importar la librería System.IO.

  - Crear método 1: preguntar al usuario si quiere añadir algún alumno al fichero alumnos.txt o leer el fichero.

  - Crear método 2: si el usuario decide leer el fichero, muestra el contenido de alumnos.txt.

  - Crear método 3: si el usuario decide añadir algún alumno, preguntar su nombre y añadirlo a alumnos.txt.

  - En el método MAIN(): ejecutar los método anteriores.

[ver archivo](https://github.com/juancumbeq/daw-m03a-programming/blob/main/uf3/code/01_EjercicioOpcionalPT1.cs)

<br>
<br>

## Ficheros binarios: uso del Buffer - LECTURA
```
// Lectura binaria

FileStream fichero = new FileStream("C:/fichero/pelota.jpg", FileMode.Open, FileAccess.Read);

byte[] buffer = new byte[fichero.Length] // un entero de 8 bits sin signo
fichero.Read(buffer, 0, buffer.Length);

for(int i = 0; i < buffer.Length; i++)
{
  Console.WriteLine(buffer[i])
}
fichero.Close();
```

Este código en C# está diseñado para abrir un archivo de imagen (en este caso, "pelota.jpg") ubicado en la ruta **"C:/fichero/"** y luego imprimir el contenido del archivo en la consola en forma de bytes.

Aquí está el desglose del código:

1. Se crea un objeto FileStream llamado fichero que apunta al archivo "pelota.jpg" utilizando la ruta especificada. Se abre en modo de lectura (FileMode.Open) y se establece el acceso para lectura (FileAccess.Read). 

```
FileStream fichero = new FileStream("C:/fichero/pelota.jpg", FileMode.Open, FileAccess.Read);
```

2. Se crea un array de bytes llamado buffer que tiene el mismo tamaño que el archivo. Esto asegura que haya suficiente espacio para almacenar todo el contenido del archivo.
```
byte[] buffer = new byte[fichero.Length];
```

3. Se lee el contenido del archivo en el array de bytes utilizando el método Read del objeto FileStream. Los parámetros buffer, 0 y buffer.Length indican que se debe leer desde el principio del array de bytes (buffer), comenzando desde el primer byte (0), y se debe leer hasta el final del array (buffer.Length).
```
fichero.Read(buffer, 0, buffer.Length);
```

4. Se recorre el array de bytes utilizando un bucle for para imprimir cada byte en la consola. Esto imprime el valor numérico de cada byte en una línea separada. 
```
for(int i = 0; i < buffer.Length; i++)
{
  Console.WriteLine(buffer[i]);
}
```

5. Se cierra el objeto FileStream para liberar los recursos del sistema asociados con él.
```
fichero.Close();
```

En resumen, este código lee un archivo de imagen byte por byte y luego imprime el valor numérico de cada byte en la consola. Esto puede ser útil para visualizar cómo está estructurado un archivo binario, como una imagen, en términos de sus bytes individuales.

<br>

#### fichero.Read(buffer, 0, buffer.Length); 
La línea **fichero.Read(buffer, 0, buffer.Length);** es una llamada al método **Read** del objeto FileStream. Este método se utiliza para leer bytes desde el archivo asociado al FileStream y almacenarlos en un array de bytes, que en este caso es buffer.

Aquí está el desglose de los parámetros utilizados en esta llamada:

  - **buffer**: Este es el array de bytes en el que se almacenarán los datos leídos del archivo.

  - **0**: Este es el índice en el array buffer donde comenzará a almacenarse la lectura. En este caso, se especifica 0, lo que significa que la lectura comenzará desde el primer byte del array.

  - **buffer.Length**: Este es el número máximo de bytes que se leerán del archivo. buffer.Length especifica que se leerán tantos bytes como sea posible hasta llenar completamente el array buffer.

Entonces, la línea fichero.Read(buffer, 0, buffer.Length); básicamente dice: "Lee tantos bytes como sea posible del archivo asociado a fichero y almacénalos en el array buffer, comenzando desde el primer byte del array".

Después de esta línea, el array buffer contendrá los bytes del archivo "pelota.jpg", listos para ser procesados o manipulados según sea necesario.

<br>
<br>

## Ficheros binarios: uso del Buffer - ESCRITURA
```
// Escritura binaria
FileStream fichero = new FileStream("C:/fichero/pelota.jpg", FileMode.Create, FileAccess.Write);

byte[] buffer = new byte[fichero.Length] // un entero de 8 bits sin signo
fichero.Write(buffer, 0, buffer.Length);

for(int i = 1000; i < 2000; i++)
{
  buffer[i] = 0;
}

FileStream fichero2 = new FileStream("C:/fichero/pelota.jpg", FileMode.Create, FileAccess.Write);
fichero2.Write(buffer, 0, buffer.Length);

fichero.Close();
fichero2.Close();
```

<br>
<br>

## Manejo de ficheros
  - Todo lo que llevamos visto hasta aquí ha sido mediante variables, estructuras de datos, y hemos manipulado la información de la que disponíamos.
  
  - Esta información, una vez que finaliza la ejecución del software, desaparece de memoria, ya que ha estado almacenada en el memoria principal el tiempo que dura la ejecución del software.
  
  - Podemos ver los ficheros como una parte de un dispositivo no volátil a la que se le asigna un nombrem y que puede contener una cantidad de datos.
  
  - Los ficheros o archivos son una secuencia de bits (0 y 1) 1 Byte = 8 bits que se almacenan en un dispositivo de almacenamiento secundario, por lo que la información va a permanecer a pesar de que se cierre la aplicación que los utilice.
  
  - Se utiliza la librería System.IO que contien tipos que permiten leer y escribir en los archivos.
  ```
  using System;
  using System.IO;
  ```

Esto da más independencia sobre la información, ya que no necesitamos que el programa se esté ejecutando para que la información que contiene exista.

A la hora de trabajar con ficheros debemos tener en cuenta:

  - La información es un conjunto de 0 y 1.
  - Al agrupar los bits se forman bytes.
  - Al agrupar los campos se crean los registros de información.
  - Un fichero es creado por un conjunto de registros de manera quetodos tienen en común la misma estructura.
  - Los directorios tienen la función de agrupar distintos ficheros siguiendo unas condiciones determinadas por el sistema operativo o por el programador.

<br>

#### Acceso a ficheros

<p align="center">
  <img src="https://github.com/juancumbeq/daw-m03a-programming/blob/main/uf3/images/AccesoFicheros.png?raw=true" width= "99%" alt="acceso a ficheros">
</p>

<br>

#### Rutas de acceso

Dependendiendo de cómo empecemos la ruta de directorio para nombrar el archivo, podemos tener dos tipos de rutas bien diferenciadas.
   - Ruta absoluta o completa: se le indica el camino de directorio desde el comienzo. Si es en el sistema operativo Linux (UNIX), empezará por la raíz (/), en caso contrario, si el sistema operativo es Windows debe empezar por el nombre de la unidad en cuestión (\).

   - Ruta relativa: se le indica el camino de directorio desde la posición actual. No se incluye el directorio raíz.

<p align="center">
  <img src="https://github.com/juancumbeq/daw-m03a-programming/blob/main/uf3/images/RutasFicheros.png?raw=true" width= "99%" alt="acceso a ficheros">
</p>

<br>
<br>

## Autor

Este proyecto fue desarrollado por Juan Cumbe. Si tienes alguna pregunta o sugerencia sobre el proyecto, no dudes en contactarme a través de [e-mail](mailto:hello@juancumbe.com) o mi perfil de [Linkedin](https://www.linkedin.com/in/juancumbeq/). 😊