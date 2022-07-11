package exercicios.Exercicio_Enum_2.Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH/mm/ss");
    private Date momento;
    private StatusPedido status;
    private Cliente cliente;
    private List<itemPedido> itens = new ArrayList<itemPedido>();
    public Pedido() {
    }
    public Pedido(Date momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }
    public Date getMomento() {
        return momento;
    }
    public void setMomento(Date momento) {
        this.momento = momento;
    }
    public StatusPedido getStatus() {
        return status;
    }
    public void setStatus(StatusPedido status) {
        this.status = status;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItem(itemPedido item){
        itens.add(item);
    }
    public void removeItem(itemPedido item){
        itens.remove(item);
    }
    public double total(){
        double soma = 0;
        for (itemPedido ip : itens) {
            soma +=  ip.subtotal();            
        }
        return soma;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hora do pedido: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Items do pedido: \n");
        for (itemPedido item : itens) {
            sb.append(item + "\n");
        }
        sb.append("Valor total: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();


    }
    


    
}
