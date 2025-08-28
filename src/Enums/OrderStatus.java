package Enums;

public enum OrderStatus {
    NEW("Pedido Creado"),
    PROCESSING("Pedido en proceso"),
    SHIPPED("Pedido encviado"),
    DELIVERED("Pedido entregado"),
    CANCELLED("Pedido cancelado");

    private final String message;

    OrderStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
