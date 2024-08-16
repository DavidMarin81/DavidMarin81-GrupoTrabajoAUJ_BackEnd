# GrupoTrabajoAUJ_BackEnd
Proyecto de API RESTful para el proceso de selección de "Grupos de trabajo" de <a href="https://adoptaunjunior.es/" target="_blank">Adopta un Junior</a>

## Motivation APIRESTful
<details>
  <summary>Descripción</summary>
    <ul>
        <li>
        Con esta aplicación puedes agregar tus propias citas motivacionales, las cuales se muestran en una lista personalizada. Una vez añadida la motivación, ésta puede ser editada o eliminada según lo desees.
        </li>
        <li>Características principales:</li>
            <ul>
                <li><b>Añadir motivaciones</b>: introduce tus frases motivadoras favoritas en la aplicación</li>
                <li><b>Lista personalizada</b>: visualiza todas tus motivaciones en una lista fácil de navegar</li>
                <li><b>Edición y Eliminación</b>: modifica y borra motivaciones en cualquier momento para mantener tu lista actualizada</li>
            </ul>
        <i>* Este proyecto es una demostración de mis habilidades en desarrollo backend utilizando Java y Spring Boot. Fue creado como parte del proceso de selección para los grupos de trabajo de <a href="https://adoptaunjunior.es/" target="_blank">Adopta un Junior</a>
        en BackEnd. La aplicación es una API RESTful que permite operaciones CRUD sobre un recurso de "Motivaciones", utilizando una base de datos H2 en memoria para el almacenamiento</i>
        </li>
    </ul>
</details>

<details>
  <summary>Tecnologías utilizadas</summary>
    <ul>
        <li><b><u>Java</u></b>: Lenguaje de programación para el desarrollo del backend.</li>
        <li><b><u>Spring Boot</u></b>: Framework para facilitar la creación de aplicaciones web en Java</li>
        <li><b><u>Spring Data JPA</u></b>: Abstracción para la interacción con bases de datos</li>
        <li><b><u>H2 Database</u></b>: Base de datos en memoria para el desarrollo</li>
        <li><b><u>Maven</u></b>: Herramienta de gestión de proyectos y dependencias</li>
    </ul>
</details>

<details>
  <summary>Características</summary>
    <ul>
        <li>CRUD Completo: Gestión de motivaciones mediante operaciones CRUD (Crear, Leer, Actualizar y Eliminar)</li>
        <li>API RESTful: Implementación de endpoints HTTP para interactuar con el recurso "Motivation"</li>
        <li>Base de Datos en Memoria: Uso de H2 para simplificar la persistencia de datos durante el desarrollo</li>
    </ul>
</details>

## Instalación y Ejecución
- Sigue estos pasos para configurar y ejecutar la aplicación en tu entorno local:
    - Clonar el repositorio
        ~~~bash
        git clone https://github.com/DavidMarin81/DavidMarin81-GrupoTrabajoAUJ_BackEnd.git
        cd DavidMarin81-GrupoTrabajoAUJ_BackEnd
        ~~~

    - Construir el proyecto- 
        ~~~bash
        # Asegúrate de tener Maven y Java instalados
        mvn clean install
        ~~~

    - Ejecutar la apliación
        ~~~bash
        mvn spring-boot:run
        ~~~
        
      - Prueba la app desde un navegador web:
          ~~~bash
          [mvn spring-boot:run](http://localhost:8080/)
          ~~~
          ![image](https://github.com/user-attachments/assets/68f4c711-6dbe-426a-9daf-6f2ee0e5a70e)
      
      - Prueba la API sin un navegador web:
          - Puedes utilizar herramientas como **POSTMAN** para probar los endpoints de la API:
              ~~~bash
              # Obtener todas las motivaciones
              GET/motivations
              ~~~
              ~~~bash
              # Crear una nueva motivación
              POST/motivations
              ~~~
              ~~~bash
              # Obtener una motivación por ID
              GET/motivations/{id}
              ~~~
              ~~~bash
              # Actualizar una motivación existente
              PUT/motivations/{id}
              ~~~
              ~~~bash
              # Eliminar una motivación
              DELETE/motivations/{id}
              ~~~
          - Ejemplo para introducir datos:
          ![image](https://github.com/user-attachments/assets/50d48e48-c3ba-47c4-bf4a-22edb3c70e9c)
          - Ejemplo para obtener todas las motivaciones:
          ![image](https://github.com/user-attachments/assets/dee31b8a-95d7-4c98-9c49-324691457ead)
    - Uso de la base de datos H2
        - Accede a la consola de H2 para inspeccionar la base de datos en 
            ~~~bash
            http://localhost:8080/h2-console
            ~~~

            JDBC URL
            ~~~bash
            jdbc:h2:mem:testdb
            ~~~

            Username
            ~~~bash
            root
            ~~~

            Password
            ~~~bash
            abc123.
            ~~~
## Contribuciones
<details>
  <summary>Contribuciones realizadas</summary>
    <h2>Issue creada y resuelta</h2>
    <p>Como parte del proceso de desarrollo y mejora de la aplicación de frases motivadoras, creé una issue titulada "<b>Agregar campo 'author' a la entidad 'Motivation'"</b>. Esta mejora permitiría almacenar y mostrar el nombre del autor de cada frase, proporcionando más contexto y valor a las frases motivadoras</p>
    <ul>
        <li><b>Descripción de la  Issue</b></li>
        <p>La issue tenía como objetivo principal agregar un nuevo campo "author" a la entidad "Motivation", que hasta el momento solo almacenaba la frase en sí. Las tareas incluidas en la issue abarcaban tanto el backend como el frontend:</p>
        <ul>
          <li>BackEnd</li>
          <ul>
            <li>Modificar la entidad "Motivation" para incluir el campo "author"</li>
            <li>Añadir un constructor con dos parámetros: "motivation" y "author"</li>
            <li>Implementar los métodos getter y setter para el nuevo campo "author"</li>
            <li>Asegurar que el JSON enviado y recibido por el backend coincidiera con los nombres de los campos de la clase "Motivation"</li>
          </ul>
          <li>FrontEnd</li>
          <ul>
            <li>Actualizar el formulario de creación y edición de frases en la interfaz web para incluir un campo adicional donde el usuario pueda introducir el nombre del autor</li>
            <li>Modificar la vista de lista de frases y la vista de detalles para mostrar el autor junto con la frase</li>
          </ul>
        </ul>
        <br>
        <li><b>Resolución de la Issue</b></li>
        <p>El colaborador <b>NiramDivad</b> asumió la responsabilidad de resolver esta issue en la rama <i>'feature/add-author-field'</i>. Las modificaciones realizadas fueron solo en la parte del Backend:</p>
        <ul>
          <li>BackEnd</li>
          <ul>
            <li>Modificación de la entidad "Motivation"</li>
            <li>Actualización del controlador, añadiendo un constructor con dos parámetros, getter y setter</li>
          </ul>
        </ul>
        <br>
        <li><b>Revisión y aceptación de la PR (pull request)</b></li>
        <p>Revisé la Pull Resquest (PR) enviada por NiramDivad. Verifiqué que todas las modificaciones cumplieran con los requisitos establecidos en la issue, y probé el código para asegurarme de que funcionara correctamente en Postman. Tras confirmar que todo estaba en orden, acepté la PR</p>
        <p>Esta colaboración no solo mejoró la funcionalidad de la aplicación, sino que también demostró la efectividad de trabajar en equipo, gestionando correctamente las contribuciones y asegurando la calidad del código.</p>
    </ul>
</details>
            
## Contacto
- **Nombre:** [David Marín](https://www.linkedin.com/in/tu-perfil)
- **Correo Electrónico:** [davidmaringomez81@gmail.com](mailto:davidmaringomez81@gmail.com)
- **LinkedIn:** [David Marín](https://www.linkedin.com/in/davidmaringomez/)
- **GitHub:** [GitHub Usuario](https://github.com/DavidMarin81)

