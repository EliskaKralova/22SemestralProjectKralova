package cz.tul.fm.alg1.semestralproject;

/**
 *
 * @author Eliška Králová
 */
import java.util.Scanner;

public class UI {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean pokracuj = true;
        while (pokracuj) {
            System.out.println("Zadejte jaky program chcete pustit program.");
            System.out.println("1 pro spusteni vanocni ulohy");
            System.out.println("2 pro spusteni semestralni prace");
            System.out.println("0 pro ukonceni programu.");
            int vyber = sc.nextInt(); // input for switch
            switch (vyber) {
                case 1 -> {
                    System.out.println("Spoustim vanocni ulohu");
                    christmas.main(args);
                    break;
                }
                case 2 -> {
                    System.out.println("Spoustim semestralni praci");
                    SemestralProject.main(args);
                    break;
                }
                case 0 -> {
                    System.out.println("Ukoncuji program");
                    pokracuj = false;
                    break;
                }
                default -> {
                    System.out.println("Nezadal si spravny parametr");
                    System.out.println("Znovu a lepe...");
                    break;
                }
            }
        }
        System.out.println("UI ukonceno");
    }
}
