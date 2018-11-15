# PruebaJavaDeveloper
El repositorio actual contiene el desarrollo de los items definidos por la empresa Bennu.

1-. Con respecto a la primera sección del documento presentado:
1.1-. Se diseño un modelo de datos acorde a las especificaciones indicadas.
1.2-. El modelo de datos se encuentra en un archivo de imagen en formato ".jpg"
1.3-. El respaldo de la base de datos diseñada se encuentra en el archivo "db.sql"
1.4-. Se implementaron las 3 consultas especificadas, y su respaldo se encuentra en el archivo "querys.sql".

2-. Con respecto a la implementación/Codificación de los mantenedores:
2.1-. Se utilizaron las siguientes tecnologías: 
 * Gradle en su versión 4.10.2
 * Springboot en su versión 2.1.0
 * Motor de base de datos MariaDB
2.2-. Se aplicaron los siguientes patrones:
 * Data Access Object (DAO)
 * Model View Controller (MVC)
 
2.3-. Se implementaron los siguientes casos de uso:
 * Crear colegio/profesor
 * Leer todos los colegios/profesores
 * Editar colegio/profesor
 * Eliminar colegio/profesor
 
2.4-. Las rutas del proyecto son las siguientes
/
/mantenedor/colegio
/mantenedor/colegio/add
/mantenedor/colegio/editcolegio
/mantenedor/colegio/delete

/mantenedor/profesor
/mantenedor/profesor/add
/mantenedor/profesor/editprofesor
/mantenedor/profesor/edited
/mantenedor/profesor/delete

3-. Para configurar el proyecto en otro ambiente, considerar lo siguiente:
3.1- Se debe editar el archivo application.properties para ajustar los datos propios para configurar el acceso a la base de datos
3.1.1- Se debe editar el archivo profesorDAO.java, especificamente en la función DataSource. Replicar la data del paso 3.1.
3.1.2- Se debe editar el archivo colegioDAO.java, especificamente en la función DataSource. Replicar la data del paso 3.1.

4-. Para ejecutar el proyecto, se deben seguir los siguientes pasos:
4.1-. Crear una base de datos (en mi caso la nombré colegio)
4.2-. Restaurar el esquema de la base de datos en la base creada en el paso 4.1. Se encuentra ubicado en el archivo "squema.sql".
4.3-. Cargar la data del archivo "data.sql" en la base de datos del paso 4.1.
4.3-. Descargar o clonar el proyecto situado en el branch "app"
4.4-. Una vez completado el paso 4.3, situarse en el directorio del proyecto para construir el árbol de dependencias de la aplicación.
4.5-. La construcción automatizada del proyecto se efectuó con la ayuda de Gradle, y por ende es requerimiento para iniciar la aplicación.
4.6-. Gradle se debe descargar y configurar posteriormente como una variable de entorno del sistema.
4.7-. Para chequear que Gradle esta correctamente configurado, se debe abrir una consola (en mi caso una CMD) y ejecutar el siguiente comando: gradle -v
4.8-. Para ejecutar la aplicación, se deben ejecutar los siguientes comandos:
4.8.1-. gradle tasks
4.8.2-. gradle build
4.8.3-. gradle run
4.9-. Una vez que las depencias hayan cargado, junto con el servidor tomcat embebido. Se debe ir al navegador e ingresar la url correspondiente a localhost:8080.
5.0-. Como resultado de esta secuencia de acciones finalmente se puede apreciar la aplicación solicitada.
