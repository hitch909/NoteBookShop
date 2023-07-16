//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

import java.util.*;

public class Shop {
    public static void main(String[] args) {
        NoteBook note1 = new NoteBook("ACB", "Черный", "Acer");
        note1.setRAM(8);
        note1.setHDD(700);
        note1.setOS("Windows");
        note1.setColor("black");
        note1.setBrand("Acer");

        NoteBook note2 = new NoteBook("Tong", "Серебро", "Apple");
        note2.setRAM(16);
        note2.setHDD(1000);
        note2.setOS("Linux");
        note2.setColor("silver");
        note2.setBrand("Apple");

        NoteBook note3 = new NoteBook("Game", "Белый", "HP");
        note3.setRAM(8);
        note3.setHDD(900);
        note3.setOS("Windows");
        note3.setColor("white");
        note3.setBrand("HP");

        NoteBook note4 = new NoteBook("Speed", "Розовый", "Samsung");
        note4.setRAM(16);
        note4.setHDD(800);
        note4.setOS("macOS");
        note4.setColor("rose");
        note4.setBrand("Samsung");

        List<NoteBook> noteBooksArray = new ArrayList<>((Arrays.asList(note1, note2, note3, note4)));
        filterNoteBook(noteBooksArray);
    }

    public static void filterNoteBook(List<NoteBook> noteBooksArray) {
        System.out.println("Здравствуйте!");
        System.out.println("введите номер интересующего параметра: \n 1 - RAM, \n 2 - HDD, \n 3 - OS, \n 4 - Цвет, \n 5 - Брэнд ");
        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();
        scann.hasNextLine();

        HashMap<String, Object> choice = new HashMap<>();

        if (number == 1) {
            System.out.println("введите обьем RAM :   8  или  16");
            Integer temp = scann.nextInt();
            scann.hasNextLine();
            choice.put("RAM", temp);
            for (NoteBook RAM : noteBooksArray) {
                if (RAM.getRAM().equals(choice.get("RAM"))) {
                    System.out.println(RAM.toString());
                }
            }
        }
        if (number == 2) {
            System.out.println("введите обьем HDD :  700,  800,  900,  1000");
            Integer temp = scann.nextInt();
            scann.hasNextLine();
            choice.put("HDD", temp);
            for (NoteBook HDD : noteBooksArray) {
                if (HDD.getHDD().equals(choice.get("HDD"))) {
                    System.out.println(HDD.toString());
                }
            }
        }
        if (number == 3) {
            System.out.println("выберите операционную систему:  Windows,  Linux,  macOS");
            String temp = scann.next();
            scann.hasNextLine();
            choice.put("OS", temp);
            for (NoteBook OS : noteBooksArray) {
                if (OS.getOS().equals(choice.get("OS"))) {
                    System.out.println(OS.toString());
                }
            }
        }
        if (number == 4) {
            System.out.println("выберите цвет корпуса:  black,  silver,  white,  rose");
            String temp = scann.next();
            scann.hasNextLine();
            choice.put("color", temp);
            for (NoteBook color : noteBooksArray) {
                if (color.getColor().equals(choice.get("color"))) {
                    System.out.println(color.toString());
                }
            }
        }
        if (number == 5) {
            System.out.println("выберите фирму-производителя:  Acer,  Apple,  HP,  Samsung");
            String temp = scann.next();
            scann.hasNextLine();
            choice.put("brand", temp);
            for (NoteBook brand : noteBooksArray) {
                if (brand.getBrand().equals(choice.get("brand"))) {
                    System.out.println(brand.toString());
                }
            }
        }
    }
}
