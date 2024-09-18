import java.util.ArrayList;

 class Practicum {
    public static void main(String[] args) {

        ArrayList<Integer> speeds = new ArrayList();
        speeds.add(120);
        speeds.add(75);
        speeds.add(42);
        speeds.add(60);
        speeds.add(110);
        speeds.add(20);

        int sum = 0;
        for (Integer ss : speeds) {
            sum += ss;
        }


        int averageSpeed = sum/speeds.size(); // вычислите среднюю скорость

        System.out.println("Средняя скорость равна " + averageSpeed + " км/ч");
    }
}