import classes.Carnation;
import classes.Rose;
import classes.Tulip;
import enums.Colorr;
import service.RoseService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static RoseService rose = new RoseService();

    public static void main(String[] args) {

        /** TASK FOR EXAM:
         Flowers!
         Flower деген класс тузунуз, ичинде переменныйлар:
         (manufacturerCountry, shelfLifeInDays, color, price)  -  (страна производитель, срок хранения в днях, цвет, цена.)
         Flower_ди мурастаган 3  класс тузунуз
         (мисалы:Rose, Carnation, Tulip )  -   (Роза, Гвоздика, Тюльпан)
         FlowerService<Т> деген generic интервейс тузунуз анын ичинде төмөндөгүдөй методдор болсун.
         String addFlowers(List<T> t);
         List<T> getAllFlowers();
         List<T> getFlowersFinByColor(String color);
         Map<String, List<T>> groupingFlowersByColor();
         int getSumAllFlowers();
         List<T> getAllFlowersSortByPrice(String ascendingOrDescending);
         RoseService (private List<Rose> roses) , CarnationServiceImpl(private List<Carnation> carnations), TulipServiceImpl(private List<Tulip> tulip) деген класстар FlowerService_ди implement кылып методдорн реализация кылсын. **/

        List<Rose> roses = List.of(
                new Rose("Bishkek", 20, Colorr.BLUE, 300),
                new Rose("Talas", 15, Colorr.PINK, 230),
                new Rose("Osh", 25, Colorr.BLUE, 300),
                new Rose("Batken", 20, Colorr.RED, 400),
                new Rose("Batken", 20, Colorr.RED, 400));

        List<Tulip> tulips = List.of(
                new Tulip("Bishkek", 40, Colorr.RED, 500),
                new Tulip("Talas", 20, Colorr.WHITE, 200),
                new Tulip("Bishkek", 25, Colorr.RED, 540),
                new Tulip("Osh", 30, Colorr.BLUE, 300));

        List<Carnation> carnations = List.of(
                new Carnation("Bishkek", 15, Colorr.WHITE, 200),
                new Carnation("Talas", 20, Colorr.WHITE, 240),
                new Carnation("Osh", 15, Colorr.WHITE, 300),
                new Carnation("Bishkek", 30, Colorr.WHITE, 430));


        System.out.println(rose.addFlowers(roses)); // add
//
//        System.out.println(rose.getAllFlowers()); // get all
//
//        String color = new Scanner(System.in).nextLine();
//        System.out.println(rose.getFlowersFinByColor(color));  // by color

//        System.out.println(rose.groupingFlowersByColor());  // grouping by color
//
//        System.out.println(rose.getSumAllFlowers());        // sum
////
        String ascendingOrDescending = new Scanner(System.in).nextLine();
        System.out.println(rose.getAllFlowersSortByPrice(ascendingOrDescending));


    }
}