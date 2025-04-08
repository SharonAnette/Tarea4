# Tarea4.Nativas
 Desarrollo de una Aplicación de Geolocalización con Mapas
Tarea 4. Desarrollo de una Aplicación Móvil Nativa con Geolocalización y Mapas
Este proyecto consistió en la implementación de tres ejercicios prácticos utilizando Android Studio, con enfoque en la visualización de mapas, ubicación en tiempo real, exploración urbana y gestión de puntos de interés personalizados, integrando tecnologías como OpenStreetMap, Leaflet.js, Google Maps y Room para almacenamiento offline.

## Ejercicio 1: Implementación Básica de Localización con OpenStreetMap
En este primer ejercicio se desarrolló una aplicación Android que muestra la ubicación actual del usuario utilizando mapas de OpenStreetMap, cargados dentro de un WebView mediante Leaflet.js. Los permisos necesarios se solicitaron en tiempo de ejecución para garantizar la correcta obtención de coordenadas geográficas.

#### Características:
- Visualización del mapa centrado en la ubicación actual.
- Marcador en tiempo real con el texto "Mi ubicación".
- WebView configurado con Leaflet.js cargando un archivo map.html desde la carpeta assets.
- Integración de FusedLocationProviderClient para acceder a la ubicación.
- Manejo de errores si no se obtiene la ubicación del usuario.
- Optimización del rendimiento de WebView y del zoom del mapa.

## Ejercicio 2: Implementación Alternativa con Google Maps
En esta parte se implementó una versión alternativa de la aplicación utilizando Google Maps como proveedor de mapas. Se creó una nueva Activity que utiliza WebView para cargar la versión web de Google Maps y navegar entre ambas implementaciones.

Características:
- Mismo sistema de ubicación utilizando FusedLocationProviderClient.
- Visualización de Google Maps centrado en la ubicación del usuario.
- Botón de navegación para alternar entre OpenStreetMap y Google Maps.
- Comparación de rendimiento y tiempo de carga entre ambas versiones.

## Ejercicio 3: Implementación de Funcionalidades Creativas
En este último ejercicio se añadió un sistema de exploración urbana y gestor de puntos de interés para enriquecer la experiencia del usuario. Se integraron varias funcionalidades basadas en ubicación.

### Sistema de Exploración Urbana:
- Carga de puntos de interés (POIs) cercanos como parques, monumentos y restaurantes utilizando Overpass API.
- Detección de "zonas por descubrir" desbloqueadas al visitar ubicaciones físicas específicas.
- Barra de progreso en la pantalla que muestra el porcentaje de zonas descubiertas.
- Rutas sugeridas hacia zonas no exploradas utilizando Leaflet Routing Machine.

### Gestor de Puntos de Interés Personalizados:
- Posibilidad de agregar POIs personalizados con un toque largo sobre el mapa.
- Almacenamiento de los POIs en una base de datos local usando Room.
- Cada punto incluye información como latitud, longitud, categoría, nota y foto (opcional).
- Categorías personalizables como favoritos, pendientes o recomendados.
- Sistema preparado para búsquedas, filtros y asociación de imágenes a cada POI.
