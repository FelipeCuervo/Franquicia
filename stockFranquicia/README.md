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

## Instalación

1. Clona este repositorio:

   ```bash
   git clone https://github.com/usuario/proyecto-gestion-tareas.git
