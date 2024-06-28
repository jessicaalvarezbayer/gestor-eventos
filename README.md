# Módulo de gestión de eventos solidarios
## Seminario de práctica de informática

Este proyecto contiene un conjunto de sentencias SQL necesarias en la entrega del módulo 2 y las clases Java correspondientes a las entregas de los módulos 3 y 4.

## Contenido

- Dentro de la carpeta **Sentencias** se encontrarán los archivos descriptos a continuación:

  - **CreateTable:** Contiene sentencias para crear la estructura de las tablas del módulo, además de la base de datos.
  - **InsertTable:** Contiene sentencias para insertar datos de prueba en las tablas.
  - **SelectTable:** Contiene sentencias para consultar y recuperar datos de las tablas.
  - **DeleteTable:** Contiene sentencias para eliminar los datos dentro de las tablas. Además de sentencias de consulta para verificar el correcto borrado.

- Dentro de la carpeta **src** se encontrarán las clases Java correspondientes al prototipo desarrollado.

- Dentro de la carpeta **drivers**, a fines prácticos, se encontrará el driver de conexión JDBC para la base de datos.

## Uso
- Cada archivo dentro de la carpeta **Sentencias** contiene un conjunto de sentencias SQL relacionadas, deben ejecutarse de la manera que se describe anteriormente para verificar su funcionamiento.
- Para ejecutar el programa desarrollado:
  - Crear un proyecto en una IDE.
  - Copiar el contenido de la carpeta **src** y **drivers**.
  - Configurar en el classpath el .Jar de la carpeta **drivers**.
  - Haber ejecutado previamente las sentencias SQL antes descriptas.
  - Cambiar en la clase <<main>> los datos de conexión con la Base de Datos.


