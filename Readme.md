# Sistema de Control de Tráfico Global

Este proyecto implementa un sistema utilizando los pilares de la Programación Orientada a Objetos en Java: Abstracción, Herencia, Encapsulamiento y Polimorfismo.

## Estructura del Proyecto
*   **Vehiculo (Clase Abstracta):** Define los atributos comunes (`marca`, `velocidadMaxima`, `capacidadPasajeros`) y el método abstracto `moverse()`.
*   **Ramas Intermedias:** `VehiculoTerrestre`, `VehiculoAereo` y `VehiculoMaritimo`.
*   **Clases Concretas:** `Automovil`, `Motocicleta`, `Avion`, `Helicoptero`, `Barco` y `Submarino`.

---

## Uso de Inteligencia Artificial

### 1. Herramientas Utilizadas y Propósito
Se utilizó **Gemini Notebook** como instructor y guía:
*   **Comprensión Teórica:** Explicar de forma interactiva y con analogías sencillas los conceptos de constructores, encapsulamiento, herencia y polimorfismo.
*   **Resolución de Problemas de Git:** Diagnosticar y resolver advertencias de finales de línea y errores de configuración de repositorios remotos en la terminal.

### 2. Errores o Limitaciones Detectadas
Durante el proceso, se detectó que la IA puede generar código genérico que no necesariamente cumple con todas las restricciones de la rúbrica si no se le guía con precisión. Por ejemplo:
*   Inicialmente, no se incluía el control de errores para evitar capacidades de pasajeros negativas. Se tuvo que intervenir manualmente y corregir los métodos *setters* bajo la guía de la IA para asegurar los atributos de la clase.

### 3. Reflexión sobre el Impacto en el Aprendizaje
El uso de la IA en este proyecto no reemplazó el proceso de aprendizaje, sino que actuó como un impulso de conocimiento. En lugar de frustrarme al intentar descifrar la sintaxis de Java o los comandos de consola de Git, la herramienta me permitió entender el porqué de cada paso línea por línea, acelerando el aprendizaje y permitiéndome entregar.