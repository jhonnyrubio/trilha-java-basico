public class Conta {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public float saldo;

    public Conta(
        String nome,
        int numero,
        String numeroAgencia,
        float saldo
    ) {
        this.nomeCliente = nome;
        this.numero = numero;
        this.agencia = numeroAgencia;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.println(this.getMensagemBoasVindas());
    }

    public String getMensagemBoasVindas() {
        return "Olá " + this.nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + this.agencia + ", conta " + this.numero + " e seu saldo R$ " + this.saldo
                + " já está disponível para saque.";
    }
}
