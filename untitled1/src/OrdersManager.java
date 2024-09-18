import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrdersManager {
    HashMap<String, ArrayList<Double>> customersOrders;

    public OrdersManager() {
        customersOrders = new HashMap<>();
        ArrayList<Double> orders = new ArrayList<>();
        orders.add(154.43);
        orders.add(5453.98);
        orders.add(8776.65);
        customersOrders.put("Иван И.", orders);

        orders = new ArrayList<>();
        orders.add(25343.54);
        orders.add(420.50);
        customersOrders.put("Ольга С.", orders);

        orders = new ArrayList<>();
        orders.add(325.90);
        customersOrders.put("Александр Т.", orders);

        orders = new ArrayList<>();
        orders.add(253.54);
        orders.add(420.50);
        customersOrders.put("Александр Р.", orders);

        orders = new ArrayList<>();
        orders.add(780.54);
        orders.add(420.50);
        orders.add(36343.54);
        orders.add(2000.50);
        customersOrders.put("Екатерина О.", orders);
    }

    void printAllOrders() {
        for (Map.Entry<String, ArrayList<Double>> entry : customersOrders.entrySet()) {
            // цикл должен пройтись по ключам
            String key = entry.getKey();
            System.out.println("Заказы " + key + ":");
            ArrayList<Double> value = customersOrders.get(key);
            System.out.println(value);
        }
    }

    double getOrdersSum() {
        double sum = 0;
        for (Map.Entry<String, ArrayList<Double>> entry : customersOrders.entrySet()) {
            String key = entry.getKey();
            ArrayList<Double> value = customersOrders.get(key);
            for (double orderPrice : value) {
                sum += orderPrice;
            }
        }
        return sum;
    }

    void printCustomerOrders(String customerName) {
        if (customerName != null) { // проверьте, есть ли указанный ключ в таблице
            System.out.println("Заказы " + customerName + ":");
            System.out.println(customersOrders.get(customerName));
        }
    }

    String getMaxOrderCustomerName() {
        Double maxOrder = 0.0;
        String customerName = "";

        for (Map.Entry<String, ArrayList<Double>> entry : customersOrders.entrySet()) {
            String key = entry.getKey();
            ArrayList<Double> value = customersOrders.get(key);

            for (int i = 0; i < value.size(); i++) {
                double order = value.get(i);
                if (order > maxOrder) {
                    maxOrder = order;
                    customerName = key;
                }
            }

        }

        return customerName;
    }

    void removeUnprofitableOrders() {
        ArrayList<String> NamesForMenche5k = new ArrayList<>(); // cоздание массива

        // проход по словарю
        for (Map.Entry<String, ArrayList<Double>> entry : customersOrders.entrySet()) {
            String key = entry.getKey();
            ArrayList<Double> value = customersOrders.get(key);

            // проходимся по клиенту и ищем общую сумму заказов
            double total = 0;
            for (Double PP : value)
                total += PP;
            if (total < 5000) {
                NamesForMenche5k.add(key);
            }
        }
        for (String name : NamesForMenche5k){
            System.out.println("Клиента " + name + " больше нет в таблице.");
            customersOrders.remove(name);
        }


    }
}