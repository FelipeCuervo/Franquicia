# API de Franquicias

Este proyecto proporciona una API RESTful para gestionar franquicias, sucursales y productos asociados.

## Endpoints

- `POST /franquicia`: Crear una nueva franquicia.
- `PUT /franquicia`: Modificar nombre franquicia.
- `POST /sucursal/crear/{franquiciaId}`: Crear una sucursal en una franquicia específica.
- `POST /sucursal/modificarNombre`: Modificar nombre de sucursal.
- `POST /producto/crear/{sucursalId}`: Crear un nuevo producto en una sucursal.
- `DELETE /producto/{sucursalId}`: Elimina un producto de una sucursal.
- `PUT /producto/{productoId}`: Modificar el stock de un producto.
- `GET /producto/{sucursalId}/max-stock`: Obtener el producto con más stock en cada sucursal de una franquicia específica.

## Requisitos

- Java 17 o superior
- MySQL 8 o superior

## Configuración de base de datos

Configura la base de datos MySQL en `application.properties` con los valores correspondientes, para ambiente local, la configuración actual
está montada en un servidor mysql en nube.

spring.datasource.url= jdbc:mysql://ufvzk2xo7efqusbn:nbCa4359xkUtOBR51AlI@bfcgmfjfnaften6huyei-mysql.services.clever-cloud.com:3306/bfcgmfjfnaften6huyei
spring.datasource.username= ufvzk2xo7efqusbn
spring.datasource.password= nbCa4359xkUtOBR51AlI

## Instalación

1. Clona este repositorio:

   ```bash
   https://github.com/FelipeCuervo/Franquicia.git


## Abrir el Proyecto en IntelliJ IDEA:

1. Abre IntelliJ IDEA.
2. Selecciona "Open" desde la pantalla de inicio o ve a File > Open.
3. Navega al directorio donde clonaste el proyecto y selecciónalo.

## Configuración del SDK:
1. Ve a File > Project Structure (Ctrl+Alt+Shift+S en Windows o ⌘+; en macOS).
2. En Project, selecciona el JDK correspondiente a tu proyecto.
3. Si no tienes el JDK en la lista, haz clic en "Add SDK" y selecciona la carpeta donde instalaste el JDK.

## Dependencias y Construcción del Proyecto

Este proyecto utiliza Maven, IntelliJ IDEA detectará automáticamente el archivo de construcción (pom.xml para Maven) y descargará las dependencias necesarias.


IntelliJ IDEA debería descargar las dependencias automáticamente. Si no es así, puedes actualizar Maven manualmente:
Haz clic derecho en el archivo pom.xml y selecciona "Maven > Reload Project".

Para compilar el proyecto con Maven, abre la terminal en IntelliJ y ejecuta el siguiente comando:

mvn clean install

## Ejecutar un Proyecto con Spring Boot:
   
puedes ejecutarlo de la siguiente manera:

Asegúrate de tener el archivo application.properties o application.yml correctamente configurado si estás utilizando una base de datos o configuraciones adicionales.
Haz clic derecho en la clase principal y selecciona Run 'NombreDeLaClase.main()'.