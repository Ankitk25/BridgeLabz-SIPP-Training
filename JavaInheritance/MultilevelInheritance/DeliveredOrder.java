class Order {
    String orderId;
    String orderDate;

    Order(String id, String date) {
        this.orderId = id;
        this.orderDate = date;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String id, String date, String trackingNumber) {
        super(id, date);
        this.trackingNumber = trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String id, String date, String trackingNumber, String deliveryDate) {
        super(id, date, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Status: Delivered on " + deliveryDate);
    }

    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder("ORD001", "2025-06-28", "TRK12345", "2025-07-01");
        d.getOrderStatus();
    }
}