package pedido.estados;

import pedido.Pedido;

public class Preparacao implements Estado {
    @Override
    public void preparar(Pedido pedido) {
        System.out.println("Seu pedido foi preparado!");
    }

    @Override
    public void transportar(Pedido pedido) {
        pedido.setEstado(new Trasporte());
        System.out.println("Seu pedido foi enviado!");
    }

    @Override
    public void receber(Pedido pedido) {
        System.out.println("Seu pedido já foi preparado!");
    }

    @Override
    public void finalizar(Pedido pedido) {
        System.out.println("Seu pedido já foi preparado!");
    }

}
