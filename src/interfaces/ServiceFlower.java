package interfaces;

import enums.Colorr;

import java.util.List;
import java.util.Map;

public interface ServiceFlower<T> {
    String addFlowers(List<T> t);

    List<T> getAllFlowers();

    List<T> getFlowersFinByColor(String color);

    Map<Colorr, List<T>> groupingFlowersByColor();

    int getSumAllFlowers();

    List<T> getAllFlowersSortByPrice(String ascendingOrDescending);
}
