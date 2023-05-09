package pedido.estados;

import pedido.Pedido;

public class Finalizacao implements Estado{
    @Override
    public void preparar(Pedido pedido) {
        System.out.println("Seu pedido foi finalizado!");
    }

    @Override
    public void transportar(Pedido pedido) {
        System.out.println("Seu pedido foi finalizado!");
    }

    @Override
    public void receber(Pedido pedido) {
        System.out.println("Seu pedido foi finalizado!");
    }

    @Override
    public void finalizar(Pedido pedido) {
        System.out.println("Seu pedido foi finalizado!");
    }
}
