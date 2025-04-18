
# Práctica de Algoritmos de Ordenamiento

## 📌 Información General

- **Título:** Práctica de Algoritmo de Busqueda Binaria
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Einar Kaalhus
- **Fecha:** 18/4/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto implementa la búsqueda binaria en Java para encontrar una persona por su edad en un arreglo ordenado. La aplicación permite:

Ingresar un listado de personas (nombre y edad).

Ordenar el arreglo (requisito para la búsqueda binaria).

Buscar una edad específica, mostrando en cada iteración:

Subarreglo actual.

Índices bajo, alto y centro.

Valor en la posición central.

Dirección de búsqueda (izquierda/derecha).

Indicar si la persona fue encontrada o no.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Entrada

Ingrese cantidad de Personas del listado: 3  
Ingrese Persona:  
Nombre: Pablo  
Edad: 4  
Ingrese Persona:  
Nombre: María  
Edad: 5  
Ingrese Persona:  
Nombre: Juan  
Edad: 18  

Ingrese la edad a buscar: 18  

4 | 5 | 18  
bajo=0  alto=2  centro=1  valorCentro=5  -> DERECHA  

18  
bajo=2  alto=2  centro=2  valorCentro=18  -> ENCONTRADO  

La persona con la edad 18 es Juan  
```

---