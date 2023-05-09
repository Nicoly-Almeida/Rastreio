package pedido;

import pedido.estados.Estado;
import pedido.estados.Preparacao;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Pedido {
    Estado estado;

    public Pedido() {
        estado = new Preparacao();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void preparar() {
        estado.preparar(this);
    }

    public void transportar() {
        estado.transportar(this);
    }

    public void receber() {
        estado.receber(this);
    }

    public void finalizar() {
        estado.finalizar(this);
    }

    public void time() {
        for (int i = 1; i < 4; i++) {
            System.out.print(  "[*] ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

    }


    public void fluxo_pedido() {
        time();

        this.preparar();
        time();

        this.transportar();
        time();

        this.receber();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tudo ocorreu bem com o seu pedido? (sim ou não)");
        String feedback = scanner.nextLine();

        if (feedback.equalsIgnoreCase("nao")) {
            this.fluxo_pedido();
        } else {
            this.finalizar();
        }
    }

}
