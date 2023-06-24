# Ejercicio REST

Crear un proyecto con Spring Boot que exponga el servicio CRUD de pedidos definidio en el archivo [orders.yaml](./orders.yaml)

Puntos a calificar
1. Qué compile y despliegue **30pts**
2. Qué cumpla los criterios de las APIs RESTful **20 pts**
3. Qué pueda invocarse las operaciones CRUD por medio de una herramienta (Postman)  **50 pts**
4. Extras:
  - Emplee validaciones
  - Emplee bd (en memoria de preferencia)
  - Muestre el OpenAPI generado dinámicamente
  - Defina un OpenAPI para crud de detalles

### Formato de entrega
Enviar correo con la liga del proyecto en github con el usuario personal del participante.

----

## Order API

Esta API proporciona operaciones CRUD (Crear, Leer, Actualizar y Eliminar) para gestionar pedidos y sus detalles.

### Endpoints

#### Obtener todos los pedidos

```
GET /orders
```

Este endpoint permite obtener todos los pedidos existentes.

#### Crear un nuevo pedido

```
POST /orders
```

Este endpoint permite crear un nuevo pedido. Debes enviar los datos del pedido en el cuerpo de la solicitud en formato JSON, siguiendo el esquema de la entidad `OrderInput`.

#### Obtener un pedido por ID

```
GET /orders/{orderId}
```

Este endpoint permite obtener un pedido específico según su ID.

#### Actualizar un pedido por ID

```
PUT /orders/{orderId}
```

Este endpoint permite actualizar un pedido existente. Debes enviar los datos actualizados del pedido en el cuerpo de la solicitud en formato JSON, siguiendo el esquema de la entidad `OrderInput`.

#### Eliminar un pedido por ID

```
DELETE /orders/{orderId}
```

Este endpoint permite eliminar un pedido existente según su ID.

### Schemas

#### OrderInput

Esquema JSON para crear o actualizar un pedido.

```json
{
  "clientId": 1,
  "timestamp": "2023-06-14T10:30:00Z",
  "total": 100.00,
  "details": [
    {
      "orderId": 1,
      "sku": "ABC123",
      "description": "Producto 1",
      "quantity": 2,
      "price": 50.00
    },
    {
      "orderId": 1,
      "sku": "DEF456",
      "description": "Producto 2",
      "quantity": 1,
      "price": 30.00
    }
  ]
}
```

#### Order

Esquema JSON para representar un pedido con todos sus atributos, incluyendo el ID y los detalles.

```json
{
  "id": 1,
  "clientId": 1,
  "timestamp": "2023-06-14T10:30:00Z",
  "total": 100.00,
  "details": [
    {
      "id": 1,
      "orderId": 1,
      "sku": "ABC123",
      "description": "Producto 1",
      "quantity": 2,
      "price": 50.00
    },
    {
      "id": 2,
      "orderId": 1,
      "sku": "DEF456",
      "description": "Producto 2",
      "quantity": 1,
      "price": 30.00
    }
  ]
}
```

#### DetailInput

Esquema JSON para crear o actualizar un detalle de pedido.

```json
{
  "orderId": 1,
  "sku": "ABC123",
  "description": "Producto 1",
  "quantity": 2,
  "price": 50.00
}
```

#### Detail

Esquema JSON para representar un detalle de pedido con todos sus atributos, incluyendo el ID.

```json
{
  "id": 1,
  "orderId": 1,
  "sku": "ABC123",
  "description": "Producto 1",
  "quantity": 2,
  "price": 50.00
}
```

