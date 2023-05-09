package pedido.estados;

import pedido.Pedido;

public class Trasporte implements Estado{
    @Override
    public void preparar(Pedido pedido) {
        System.out.println("Seu pedido já está em transito!");
    }

    @Override
    public void transportar(Pedido pedido) {
        System.out.println("Seu pedido está em transito!");
    }

    @Override
    public void receber(Pedido pedido) {
        pedido.setEstado(new Recebimento());
        System.out.println("Seu pedido foi recebido!");
    }

    @Override
    public void finalizar(Pedido pedido) {
        System.out.println("Seu ainda pedido está em transito!");
    }
}
