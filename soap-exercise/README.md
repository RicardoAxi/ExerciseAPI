# Ejercicio SOAP

Crear un proyecto con Spring Boot que exponga el servicio CRUD de Player definido en el archivo [PlayerService.wsdl](./PlayerService.wsdl)


Puntos a calificar
1. Qué compile y despliegue **30pts**
2. Muestre el wsdl en la ruta /ws/playerservice.wsdl **30 pts**
3. Qué pueda invocarse las operaciones CRUD por medio de una herramienta (SoapUI)  **40 pts**
4. Extras:
  - Emplee validaciones
  - Emplee bd (en memoria de preferencia)

### Formato de entrega
Enviar correo con la liga del proyecto en github con el usuario personal del participante.

----

## Instrucciones para las operaciones del WSDL

[Ver el archivo PlayerService.wsdll](./PlayerService.wsdl)
Este archivo proporciona instrucciones sobre cómo utilizar las operaciones CRUD del servicio web generado a partir del WSDL.

### Requisitos previos

- Java Development Kit (JDK) instalado en su sistema.
- Entorno de desarrollo integrado (IDE) de su elección, como Eclipse o IntelliJ.
- Conocimientos básicos de desarrollo web y servicios web.

### Configuración del servicio web

1. Descargue el archivo WSDL generado, llamado `PlayerService.wsdl`.
2. Coloque el archivo WSDL en su proyecto de Java en una ubicación adecuada.

### Generación de clases Java a partir del WSDL

#### Opción 1
Si deseas generar clases utilizando `XJC` a partir del esquema embebido en el WSDL, puedes seguir estos pasos:

1. Asegúrate de tener instalado el JDK (Java Development Kit) en tu sistema.

2. Abre una ventana de comandos o terminal y navega hasta el directorio donde se encuentra el archivo WSDL.

3. Ejecuta el siguiente comando para generar las clases Java utilizando `XJC`:

```bash
xjc -wsdl <nombre_archivo.wsdl>
```

Reemplaza `<nombre_archivo.wsdl>` con el nombre real de tu archivo WSDL. Esto generará las clases Java correspondientes utilizando el esquema embebido en el WSDL.

4. Verifica que se hayan generado las clases Java en el directorio actual. Las clases se generarán en un paquete específico según el esquema definido en el WSDL.

Con estos pasos, deberías poder generar las clases Java utilizando `XJC` a partir del esquema embebido en el WSDL.

#### Opción 2

Para generar clases utilizando `XJC` a partir de un archivo `PlayerService.xsd` y agregar un plugin para Spring Boot, puedes seguir estos pasos:

1. Asegúrate de tener instalado el JDK (Java Development Kit) en tu sistema.

2. Crea un archivo `pom.xml` en el directorio raíz de tu proyecto o actualiza el archivo existente si ya tienes uno.

3. Agrega las siguientes dependencias y configuraciones en el archivo `pom.xml`:

```xml
<project>
  <!-- Otras configuraciones del proyecto -->

  <dependencies>
    <!-- Dependencia para el plugin de XJC -->
    <dependency>
      <groupId>org.codehaus.mojo</groupId>
      <artifactId>jaxb2-maven-plugin</artifactId>
      <version>2.6</version>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <!-- Plugin para generar clases con XJC -->
      <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>jaxb2-maven-plugin</artifactId>
        <version>2.6</version>
        <executions>
          <execution>
            <id>xjc</id>
            <goals>
              <goal>xjc</goal>
            </goals>
          </execution>
        </executions>
        <configuration>
          <sources>
            <source>src/main/resources/PlayerService.xsd</source>
          </sources>
          <packageName>com.axity.dnd.generated</packageName>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
```

Asegúrate de reemplazar `src/main/resources/PlayerService.xsd` con la ubicación y el nombre correctos de tu archivo `PlayerService.xsd`. Además, puedes ajustar el valor de `<packageName>` según tus necesidades.

4. Abre una ventana de comandos o terminal y navega hasta el directorio raíz de tu proyecto donde se encuentra el archivo `pom.xml`.

5. Ejecuta el siguiente comando para generar las clases Java utilizando `XJC` y el plugin de Maven:

```bash
mvn clean compile
```

Esto iniciará el proceso de compilación del proyecto y generará las clases Java correspondientes en el paquete especificado en la configuración del plugin.

Una vez completados estos pasos, deberías tener las clases generadas en el paquete especificado. Puedes utilizar estas clases en tu proyecto Spring Boot según sea necesario.

### Uso de las operaciones del servicio web

A continuación, se muestran las instrucciones para utilizar cada una de las operaciones CRUD del servicio web:

#### 1. createPlayer

Descripción: Crea un nuevo jugador.

Pasos:

1. Importe la clase `com.axity.dnd.CreatePlayerRequest` y `com.axity.dnd.CreatePlayerResponse` en su código Java.
2. Cree una instancia de `CreatePlayerRequest` y configure los datos del nuevo jugador.
3. Llame al método `createPlayer` del servicio web pasando el objeto `CreatePlayerRequest` como argumento.
4. Recupere el objeto `CreatePlayerResponse` devuelto, que contiene el ID del jugador creado.

#### 2. readPlayer

Descripción: Lee la información de un jugador existente.

Pasos:

1. Importe la clase `com.axity.dnd.ReadPlayerRequest` y `com.axity.dnd.ReadPlayerResponse` en su código Java.
2. Cree una instancia de `ReadPlayerRequest` y configure el ID del jugador que desea leer.
3. Llame al método `readPlayer` del servicio web pasando el objeto `ReadPlayerRequest` como argumento.
4. Recupere el objeto `ReadPlayerResponse` devuelto, que contiene los detalles del jugador solicitado.

#### 3. updatePlayer

Descripción: Actualiza la información de un jugador existente.

Pasos:

1. Importe la clase `com.axity.dnd.UpdatePlayerRequest` y `com.axity.dnd.UpdatePlayerResponse` en su código Java.
2. Cree una instancia de `UpdatePlayerRequest` y configure el ID del jugador y los nuevos datos del jugador que desea actualizar.
3. Llame al método `updatePlayer` del servicio web pasando el objeto `UpdatePlayerRequest` como argumento.
4. Recupere el objeto `UpdatePlayerResponse` devuelto, que indica si la actualización fue exitosa.

#### 4. deletePlayer

Descripción: Elimina un jugador existente.

Pasos:

1. Importe la clase `com.axity.dnd.DeletePlayerRequest` y `com.axity.dnd.DeletePlayerResponse` en su código Java.
2. Cree una instancia de `DeletePlayer

Request` y configure el ID del jugador que desea eliminar.
3. Llame al método `deletePlayer` del servicio web pasando el objeto `DeletePlayerRequest` como argumento.
4. Recupere el objeto `DeletePlayerResponse` devuelto, que indica si la eliminación fue exitosa.

¡Y eso es todo! Con estas instrucciones, debería poder utilizar las operaciones del servicio web generado a partir del WSDL en su aplicación Java.