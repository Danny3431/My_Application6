# Proyecto de Cuentas Bancarias en Kotlin 💳

Este proyecto es una aplicación simple de gestión de cuentas bancarias escrita en Kotlin. Permite realizar depósitos y retiros, mostrando el saldo disponible y un historial de transacciones.

## Características ✨

- **Crear cuentas bancarias** con un saldo inicial.
- **Realizar depósitos** y **retiros**.
- Mostrar **saldo disponible**.
- Mantener un **historial de transacciones**.
- Manejar **retiros fallidos** por saldo insuficiente.

## Requisitos 📋

- [JDK 1.8 o superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Kotlin](https://kotlinlang.org/docs/command-line.html) instalado

## Instalación ⚙️

1. Clona el repositorio:

   ```bash
   git clone https://github.com/Danny3431/My_Application6
   cd nombre-del-repo
Abre el proyecto en tu IDE favorito (como IntelliJ IDEA).
Compila y ejecuta el archivo Main.kt.
Uso 🚀
Al ejecutar el programa, se crearán tres cuentas bancarias con transacciones predefinidas. La salida mostrará el saldo inicial, las transacciones realizadas (incluyendo las fallidas) y el saldo final.

Ejemplo de Salida 📊
-------------------------------------------------------
Saldo y historial para la cuenta Ahorros de Andres:
-------------------------------------------------------
Saldo inicial: $1000.0
Transacciones:
- Depósito de $200.0 realizado exitosamente.
- Retiro de $150.0 realizado exitosamente.
- Retiro de $100.0 realizado exitosamente.
- Depósito de $50.0 realizado exitosamente.
- Retiro fallido: saldo insuficiente.
-------------------------------------------------------
Saldo disponible en la 'Cuenta Ahorros Andres': $1000.00
-------------------------------------------------------
Historial de transacciones para 'Cuenta Ahorros Andres':
- Depósito: $200.0
- Retiro: $150.0
- Retiro: $100.0
- Depósito: $50.0
- Retiro: $1200.0 Retiro fallido.
-------------------------------------------------------
Contribuciones 🤝
Las contribuciones son bienvenidas. Si deseas colaborar, por favor sigue estos pasos:

Haz un fork del repositorio.
Crea una nueva rama (git checkout -b feature/nueva-caracteristica).
Realiza tus cambios y haz commit (git commit -m 'Añadir nueva característica').
Haz push a la rama (git push origin feature/nueva-caracteristica).
Abre un Pull Request.
Licencia 📄
Este proyecto está licenciado bajo la MIT License.


