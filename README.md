# COLLECTIONS EN JAVA

En esta práctica se crea un pequeño Google de forma que se puedan indexar páginas que se le proporciona la programa.

   
## Enunciado

Se tiene un pequeño intérprete de comandos (librería cliche) que permiter.
 - addPage url. Se le pasa una url y la indexa.
 - findPage url. Comprueba que la página está indexada en el sistema.
 - findWord key. Devuelve en caso de existir un listado de las páginas en la que aparece la palabra
 - listPages. lista las páginas indexadas.

Un ejemplo de uso:

![image](https://github.com/pass1enator/DAWGoogleTemplate/blob/master/ejemplo.png?raw=true)

Se proporciona el código que "trocea" las url que a procesar en el metodo :
```Java
public void process(String texto, String url) {

        List<String> lineas = texto.lines().toList();
        Iterator<String> it = lineas.iterator();
        while (it.hasNext()) {
            StringTokenizer st = new StringTokenizer(it.next());
            String palabra;
            while (st.hasMoreTokens()) {
                palabra = st.nextToken();
                //se van anyadiendo las entradas a la estructura seleccionada
            }
        }
    }
```
## Tareas

 - Pensar en las estructuras de datos necesaria (puede ser necesario usar unas dentro de otras)
 - Implementar los métodos (@command).
 - Eliminar de la indexación un conjunto de palabras, por ejemplo (el, por, y....) ya que no aportan nada.
 - Probar
