
public class Agencia {

    private int numero;
    private int numeroAgencia;
    private String nomeAgencia;
    private int tipo;
    private double saldo;


    public Agencia() {
    }


    public Agencia(int numero, int numeroAgencia, String nomeAgencia, int tipo) {
        this.numero = numero;
        this.numeroAgencia = numeroAgencia;
        this.nomeAgencia = nomeAgencia;
        this.tipo = tipo;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public int getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }


    public void creditar(double valor) {
        saldo = saldo + valor;
    }


    public void debitar(double valor) {
        saldo = saldo - valor;
    }


    public String consultarSaldo() {
        return "Conta " + numero + " (Agencia " + numeroAgencia + " - " + nomeAgencia + ")"
                + " | Saldo: R$ " + String.format("%.2f", saldo);
    }


    public int encerrarConta() {
        tipo = 4;
        return tipo;
    }


    public String textoEncerrar() {
        return "Conta " + numero + " encerrada com sucesso!"
                + "\nTipo da conta: " + tipo + " (encerrada)"
                + "\nValor retirado: R$ " + String.format("%.2f", saldo);
    }
}
