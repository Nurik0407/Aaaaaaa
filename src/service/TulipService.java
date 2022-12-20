package service;

import classes.Tulip;
import enums.Colorr;
import interfaces.ServiceFlower;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class TulipService implements ServiceFlower<Tulip> {
    private List<Tulip> tulipDateBase = new ArrayList<>();

    @Override
    public String addFlowers(List<Tulip> tulips) {
        tulipDateBase.addAll(tulips);
        return "Tulip successfully added";
    }

    @Override
    public List<Tulip> getAllFlowers() {
        return tulipDateBase;
    }

    @Override
    public List<Tulip> getFlowersFinByColor(String color) {
        return tulipDateBase.stream().filter(s -> s.getColor().equals(Colorr.valueOf(color.toUpperCase()))).toList();
    }

    @Override
    public Map<Colorr, List<Tulip>> groupingFlowersByColor() {
        return null;
    }

    @Override
    public int getSumAllFlowers() {
        return tulipDateBase.stream().mapToInt(s -> (int) s.getPrice()).sum();
    }

    @Override
    public List<Tulip> getAllFlowersSortByPrice(String ascendingOrDescending) {
        Comparator<Tulip> comparator = new Comparator<Tulip>() {
            @Override
            public int compare(Tulip o1, Tulip o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        };
        return tulipDateBase.stream().sorted(comparator).toList();
    }
}
