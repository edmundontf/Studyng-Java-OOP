package com.mycompany.banco;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if ("CC".equals(tipo)) {
            this.setSaldo(50);
        } else if ("CP".equals(tipo)) {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Você possui " + this.getSaldo() + " nesta conta, retire-o antes. ");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(float valor) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta de  " + this.getDono());

        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float valor) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar, pois a conta está fechada");
        }
    }

    public void pagarMensal() {

        int valor = 0;

        if ("CC".equals(getTipo())) {
            valor = 12;
        } else if ("CP".equals(getTipo())) {
            valor = 20;
        }
        if (this.isStatus()) {
            if (this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso pelo " + this.getDono());
            } else {
                System.out.println("Impossivel pagar");
            }
        }
    }

    public void estadoAtual() {
        
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("----------------------------------------------");
    }

    

}
