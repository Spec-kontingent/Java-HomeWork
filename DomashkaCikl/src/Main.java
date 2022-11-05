//Распечатать произвольное количество строк: “Task1”. “Task2”. …. Используем цикл while


public class Main {
    public static void main(String[] args) {
        int krug = 1;
        while (krug < 7) {
            System.out.println("Task"+krug);
            krug++;
        }
    }
}