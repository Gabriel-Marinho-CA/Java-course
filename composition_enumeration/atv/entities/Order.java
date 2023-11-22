package nelioAlves.course.composition_enumeration.atv.entities;

import nelioAlves.course.composition_enumeration.atv.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> order = new ArrayList<>();

    private Client client;

    public Order() {

    }
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        order.add(item);
    }

    public void removeItem(OrderItem item) {
        order.remove(item);
    }

    public Double total() {
        Double sum = (double) 0;

        for(OrderItem o : order) {
            sum+= o.subTotal();
        }
        return sum;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrder() {
        return order;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        StringBuilder sb = new StringBuilder();

        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : order) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
