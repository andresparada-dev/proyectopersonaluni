# Sistema de Control de Tráfico Global

Este proyecto implementa un sistema para gestionar diferentes tipos de vehículos utilizando los pilares de la **Programación Orientada a Objetos (POO)** en Java: Abstracción, Herencia, Encapsulamiento y Polimorfismo.

## Estructura del Proyecto
*   **Vehiculo (Clase Abstracta):** Define los atributos comunes (`marca`, `velocidadMaxima`, `capacidadPasajeros`) y el método abstracto `moverse()`.
*   **Ramas Intermedias:** `VehiculoTerrestre`, `VehiculoAereo` y `VehiculoMaritimo`.
*   **Clases Concretas (6 Subclases):** `Automovil`, `Motocicleta`, `Avion`, `Helicoptero`, `Barco` y `Submarino`.

---

## 🤖 Uso de Inteligencia Artificial - Reflexión Crítica

De acuerdo con las pautas de la actividad, se presenta una reflexión honesta sobre el uso de la Inteligencia Artificial durante el desarrollo de este laboratorio:

### 1. Herramientas Utilizadas y Propósito
Se utilizó **Gemini Notebook** como tutor personalizado con los siguientes objetivos:
*   **Comprensión Teórica:** Explicar de forma interactiva y con analogías sencillas los conceptos de constructores, encapsulamiento, herencia y polimorfismo.
*   **Diseño de Arquitectura:** Estructurar la jerarquía de 3 niveles exigida para los vehículos.
*   **Resolución de Problemas de Git:** Diagnosticar y resolver advertencias de finales de línea (`LF` vs `CRLF`) y errores de configuración de repositorios remotos (`remote origin already exists`) en la terminal.

### 2. Errores o Limitaciones Detectadas
Durante el proceso, se detectó que la IA puede generar código genérico que no necesariamente cumple con todas las restricciones de la rúbrica si no se le guía con precisión. Por ejemplo:
*   Inicialmente, no se incluía el control de errores para evitar capacidades de pasajeros negativas. Se tuvo que intervenir manualmente y corregir los métodos *setters* bajo la guía de la IA para asegurar que las reglas de negocio protegieran los atributos de la clase de manera efectiva.

### 3. Reflexión sobre el Impacto en el Aprendizaje
El uso de la IA en este proyecto no reemplazó el proceso de aprendizaje, sino que actuó como un **potenciador del conocimiento**. En lugar de frustrarme al intentar descifrar la sintaxis de Java o los comandos de consola de Git, la herramienta me permitió entender el *porqué* de cada paso línea por línea, acelerando la curva de aprendizaje y permitiéndome realizar una entrega de alta calidad de manera autónoma.