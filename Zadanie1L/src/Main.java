import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        HashMap<String, Double> orders = new HashMap<>();

        orders.put("Иван И.", 4345.5);
        orders.put("Ольга С.", 76564.43);
        orders.put("Александр Т.", 1234.86);
        orders.put("Александр Р.", 23432.87);
        orders.put("Екатерина О.", 1034753.6);
        orders.put("Ярослав В.", 450.0);

        Double sumprice = 0.0;
        for (Map.Entry<String, Double> entry :orders.entrySet()) { // пройдитесь в цикле по значениям


            Double value = entry.getValue();

            sumprice = value +sumprice;
        }

        System.out.println("Всего было совершено заказов на сумму: " + sumprice);
    }
}