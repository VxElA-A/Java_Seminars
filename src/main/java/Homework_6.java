import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework_6 {
    private final Map<String, List<String>> phoneBook;

    public Homework_6() {
        this.phoneBook = new HashMap<>();
    }

    // Добавление номера телефона
    public void add(String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }

    // Получение списка телефонов по имени
    public List<String> get(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public static void main(String[] args) {
        Homework_6 phoneBook = new Homework_6();

        phoneBook.add("Иванов", "+1234567890");
        phoneBook.add("Иванов", "+0987654321");
        phoneBook.add("Петров", "+1111222233");
        phoneBook.add("Петров", "+1111222233");
        phoneBook.add("Петров", "+5556666444");
        phoneBook.add("Петрова", "+1111222233");
        phoneBook.add("Иванова", "+1111222233");
        phoneBook.add("Сидорова", "+1111222233");

        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Петровой: " + phoneBook.get("Петрова"));
        System.out.println("Телефоны Ивановой: " + phoneBook.get("Иванова"));
        System.out.println("Телефоны Сидоровой: " + phoneBook.get("Сидорова"));
    }
}