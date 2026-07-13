![Duoc UC Online](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# LlanquihueTourApp – Integrando Interfaces, Polimorfismo y Estructuras Dinámicas

## 👤 Autor del Proyecto
- **Nombre Completo:** Matías López
- **Carrera:** Analista Programador Computacional
- **Sede:** Modalidad Online

---

## 📘 Descripción General del Sistema
Este proyecto es la evolución del sistema de gestión para la agencia **Llanquihue Tour**. En esta etapa, la solución migra de una aplicación de consola hacia una interfaz gráfica básica interactiva utilizando `JOptionPane` para facilitar el uso por parte del personal administrativo.

El sistema integra un contrato de comportamiento común mediante el uso de interfaces y extiende el modelo con estructuras jerárquicas funcionales. Todos los recursos y colaboradores se administran de forma dinámica y unificada dentro de una colección genérica polimórfica, aplicando validaciones en tiempo de ejecución con el operador `instanceof`.

---

## 🛠️ Componentes Clave e Interfaces Utilizadas
El diseño arquitectónico de esta actualización se basa en:

* **Interfaz `Registrable`:** Define el contrato común mediante el método abstracto `mostrarResumen()`, obligando a todas las entidades de la empresa a implementar su propia lógica de despliegue.
* **Jerarquía de Herencia:** Superclase abstracta `Persona` con subclases especializadas (`GuiaTuristico` y `ColaboradorExterno`) para organizar la lógica de los recursos humanos de la agencia.
* **Diferenciación Dinámica (`instanceof`):** Mecanismo en la capa de datos que evalúa en tiempo de ejecución el tipo específico de objeto almacenado, permitiendo aplicar reglas de negocio o notas de alerta particulares a cada tipo de entidad.

---

## 🧱 Estructura General del Proyecto
El código fuente respeta una arquitectura modular organizada estrictamente en paquetes:

```plaintext
📁 LlanquihueTourApp/
└── 📁 src/
    ├── 📁 model/    # Interfaz Registrable, superclase Persona y subclases de entidades (GuiaTuristico, Vehiculo, etc.)
    ├── 📁 data/     # Clase GestorEntidades que administra el ArrayList<Registrable> y la lógica con instanceof
    └── 📁 ui/       # Clase MainApp que maneja el ciclo de vida y menús interactivos de la interfaz gráfica (GUI)
````

---



## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone [https://github.com/matiaslv207code/LlanquihueTourApp](https://github.com/matiaslv207code/LlanquihueTourApp)
```

2. Abrir el proyecto: Importa la carpeta raíz LlanquihueTourApp en tu entorno de desarrollo (IntelliJ IDEA recomendado).


3. Ejecutar la aplicación:

- Navega en el árbol de carpetas izquierdo hasta src/ui/MainApp.java.

- Haz clic derecho sobre el archivo y selecciona Run 'MainApp.main()'.

4. Uso del sistema:

- Interactúa mediante el menú gráfico flotante (JOptionPane) para registrar guías y vehículos.

- Selecciona "Mostrar Todo" para visualizar de manera centralizada el resumen polimórfico y las alertas específicas por tipo de cada recurso guardado.

Repositorio GitHub: https://github.com/matiaslv207code/LlanquihueTourApp

Fecha de Entrega: 13/07/2026