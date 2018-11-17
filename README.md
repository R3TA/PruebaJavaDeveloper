# PruebaJavaDeveloper
<ol>
<li>Para configurar el proyecto en otro ambiente, considerar lo siguiente:
  <ol>
     <li>Se debe editar el archivo "application.properties" para ajustar los datos propios para configurar el acceso a la base de datos</li>
    <li>Se debe editar el archivo "profesorDAO.java", especificamente en la función DataSource. Replicar la data del paso i.</li>
    <li>Se debe editar el archivo "colegioDAO.java", especificamente en la función DataSource. Replicar la data del paso i.</li>
  </ol>
 </li>
<li>Para ejecutar el proyecto, se deben seguir los siguientes pasos:
<ol> 
 <li>Crear una base de datos (en mi caso la nombré colegio)</li>
 <li>Restaurar el esquema de la base de datos en la base creada en el paso 4.1. Se encuentra ubicado en el archivo "squema.sql".</li>
 <li>Cargar la data del archivo "data.sql" en la base de datos del paso 4.1.</li>
 <li>Descargar o clonar el proyecto situado en el branch "app".</li>
 <li>Una vez completado el paso 4.3, situarse en el directorio del proyecto para construir el árbol de dependencias de la aplicación.</li>
 <li>La construcción automatizada del proyecto se efectuó con la ayuda de Gradle, y por ende es requerimiento para iniciar la aplicación.</li>
 <li>Gradle se debe descargar y configurar posteriormente como una variable de entorno del sistema.</li>
 <li>Para chequear que Gradle esta correctamente configurado, se debe abrir una consola (en mi caso una CMD) y ejecutar el siguiente comando: gradle -v</li>
 <li>Para ejecutar la aplicación, se deben ejecutar los siguientes comandos:
  <ol>
       <li>gradle tasks</li>
       <li>gradle build</li>
       <li>gradle run</li>
  </ol>
 </li>
</ol> 
<li>Se debe ir al navegador e ingresar la url correspondiente a localhost:8080.
</li> 
<li>Como resultado de esta secuencia de acciones finalmente se puede apreciar la aplicación solicitada.</li>
</ol>
