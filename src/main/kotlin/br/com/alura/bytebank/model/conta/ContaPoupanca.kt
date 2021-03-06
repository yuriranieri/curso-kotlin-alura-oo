package br.com.alura.bytebank.model.conta

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.model.Cliente

class ContaPoupanca(
    titular: Cliente,
    numero: Int,
) : Conta(
    titular,
    numero
) {

    override fun sacar(valor: Double) {
        if (valor > saldo) {
            throw SaldoInsuficienteException()
        }
        saldo -= valor
    }

}