package cl.bootcamp.myapplication6

class CuentaBancaria(
    val nombreCuenta: String,
    private var saldoDisponible: Double
) {
    private val historialTransacciones = mutableListOf<String>()

    fun deposito(monto: Double) {
        if (monto > 0) {
            saldoDisponible += monto
            historialTransacciones.add("Depósito: $$monto")
            println("Depósito de $$monto realizado exitosamente.")
        } else {
            println("El monto a depositar debe ser mayor que cero.")
        }
    }

    fun retiro(monto: Double) {
        if (monto > 0 && monto <= saldoDisponible) {
            saldoDisponible -= monto
            historialTransacciones.add("Retiro: $$monto")
            println("Retiro de $$monto realizado exitosamente.")
        } else if (monto > saldoDisponible) {
            println("Retiro fallido para la cuenta '$nombreCuenta'. ${monto}:  Saldo insuficiente.${saldoDisponible}")
        } else {
            println("El monto a retirar debe ser mayor que cero.")
        }
    }

    fun mostrarSaldo() {
        println("Saldo disponible en la '$nombreCuenta': $${"%.2f".format(saldoDisponible)}")
    }

    fun mostrarHistorial() {
        println("Historial de transacciones para '$nombreCuenta':")
        if (historialTransacciones.isEmpty()) {
            println("No hay transacciones realizadas.")
        } else {
            historialTransacciones.forEach { println(it) }
        }
    }
}