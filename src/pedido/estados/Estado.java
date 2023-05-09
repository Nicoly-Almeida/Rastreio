package pedido.estados;

import pedido.Pedido;

public interface Estado {

    void preparar(Pedido pedido);
    void transportar(Pedido pedido);
    void receber(Pedido pedido);
    void finalizar(Pedido pedido);


}
