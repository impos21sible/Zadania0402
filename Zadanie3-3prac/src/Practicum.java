import java.util.ArrayList;
import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> animals = new ArrayList<>();


        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");


        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных.");
        System.out.println("Это будут:");


        for (String animal : animals) {
            System.out.println(animal);
        }

        // Печатаем расписание кормлений
        System.out.println("Расписание кормлений:");
        System.out.println("В 9:00 - " + animals.get(1));  // Крокодил
        System.out.println("В 10:00 - " + animals.get(4)); // Слон
        System.out.println("В 11:00 - " + animals.get(0)); // Шиншилла
        System.out.println("В 12:00 - " + animals.get(2)); // Лев
        System.out.println("В 13:00 - " + animals.get(3)); // Медведь



        // 2 задание
        while (true){
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Показать список всех животных");
            System.out.println("2 - Добавить животное в список.");
            System.out.println("3 - Удалить животное из списка.");
            System.out.println("0 — Выход");

            int command = scanner.nextInt();

            switch (command){
                case 1:
                    for (int i = 0; i<animals.size();i++){
                        System.out.println(animals.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Напишите животное");
                    String anm = scanner.next();
                    animals.add(anm);
                    break;

                case 3:
                    if (!animals.isEmpty()){
                        System.out.println("Напишите животное для удаления");
                        String anmd = scanner.next();
                        if (animals.contains(anmd)){
                            animals.remove(anmd);
                        }
                        break;

                    }
                case 0:
                    System.exit(0);
            }


        }
    }
}
