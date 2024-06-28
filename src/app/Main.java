package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String evenOdd = null;
        String numIs = null;
        int num = 0;
        while (true) {
            System.out.println("Введіть число від 1 до 999. Для зупинки введіть STOP!");
            String line = myScan.nextLine();
            if (line.equals("STOP!")) {//Умова на вихід із циклу
                System.out.println("Бажаю здоров'я!");
                break; //Перериваємо викорнання програми
            }
            try {
                num = Integer.parseInt(line);
                if (num < 1) {
                    System.out.println("Введено число меньше 1!");
                } else if (num > 999) {
                    System.out.println("Введене число більше 999!");
                } else { //Місце для коду, якщо всі умови по вводу виконуються
                    evenOdd = (num % 2 == 0) ? "парне" : "непарне";
                    int rest = num / 10;
                    if (rest >=10) {
                        numIs = "трьохзначне число";
                    } else if (rest ==0) {
                        numIs = "однозначне число";
                    } else
                        numIs = "двохзначне число";
                    System.out.println("Введено " + evenOdd + " " + numIs);
                    //break; Без переривання циклу, якщо потрібне бескінечне опитування консолі
                    //myScan.close(); Ну і сканер не треба закривати
                }
            } catch (NumberFormatException e) {
                System.out.println("Введено взагалі не число, або не ціле чило з діапвзону Integer!!!");
            }
        }
    }
}
