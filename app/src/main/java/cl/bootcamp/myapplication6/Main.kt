package cl.bootcamp.myapplication6

fun main() {
    // Crear cuentas bancarias
    val cuenta1 = CuentaBancaria("Cuenta Ahorros Andres", 1000.0)
    val cuenta2 = CuentaBancaria("Cuenta Corriente Maria", 1500.0)
    val cuenta3 = CuentaBancaria("Cuenta Sueldo Juan", 2000.0)

    // Realizar transacciones para la cuenta 1
    println("-------------------------------------------------------")
    println("Saldo y historial para la cuenta Ahorros de Andres:")
    println("-------------------------------------------------------")
    println("Saldo inicial: $1000.0")
    println("Transacciones:")
    cuenta1.deposito(200.0)
    cuenta1.retiro(150.0)
    cuenta1.retiro(100.0)
    cuenta1.deposito(50.0)
    cuenta1.retiro(1200.0) // Retiro fallido

    // Mostrar saldo y historial para la cuenta 1
    println("-------------------------------------------------------")
    cuenta1.mostrarSaldo()
    println("-------------------------------------------------------")
    cuenta1.mostrarHistorial()
    println("-------------------------------------------------------")

    // Realizar transacciones para la cuenta 2
    println("-------------------------------------------------------")
    println("Saldo y historial para la cuenta Corriente de Maria:")
    println("-------------------------------------------------------")
    println("Saldo inicial: $1500.0")
    println("Transacciones:")
    cuenta2.deposito(300.0)
    cuenta2.retiro(100.0)
    cuenta2.retiro(2000.0) // Retiro fallido
    cuenta2.deposito(150.0)
    cuenta2.retiro(500.0)

    // Mostrar saldo y historial para la cuenta 2
    println("-------------------------------------------------------")
    cuenta2.mostrarHistorial()
    println("-------------------------------------------------------")
    cuenta2.mostrarSaldo()
    println("-------------------------------------------------------")

    // Realizar transacciones para la cuenta 3
    println("-------------------------------------------------------")
    println("Saldo y historial para la cuenta Sueldo de Juan:")
    println("-------------------------------------------------------")
    println("Saldo inicial: $2000.0")
    println("Transacciones:")
    cuenta3.deposito(500.0)
    cuenta3.retiro(3000.0) // Retiro fallido
    cuenta3.deposito(200.0)
    cuenta3.retiro(300.0)
    cuenta3.retiro(500.0)

    // Mostrar saldo y historial para la cuenta 3
    println("-------------------------------------------------------")
    cuenta3.mostrarHistorial()
    println("-------------------------------------------------------")
    cuenta3.mostrarSaldo()
    println("-------------------------------------------------------")
}