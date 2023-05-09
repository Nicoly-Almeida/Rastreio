package pedido.estados;

import pedido.Pedido;

public class Recebimento implements Estado{
    @Override
    public void preparar(Pedido pedido) {
        pedido.setEstado(new Preparacao());
        System.out.println("Seu pedido foi preparado!");
    }

    @Override
    public void transportar(Pedido pedido) {
        System.out.println("Seu pedido já foi recebido!");
    }

    @Override
    public void receber(Pedido pedido) {
        System.out.println("Seu pedido foi recebido!");
    }

    @Override
    public void finalizar(Pedido pedido) {
        pedido.setEstado(new Finalizacao());
        System.out.println("Seu pedido foi finalizado!");
    }
}
