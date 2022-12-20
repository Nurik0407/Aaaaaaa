package service;

import classes.Carnation;
import enums.Colorr;
import interfaces.ServiceFlower;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class CarnationService implements ServiceFlower<Carnation> {
    private List<Carnation> carnationsDateBase = new ArrayList<>();

    @Override
    public String addFlowers(List<Carnation> carnations) {
        carnationsDateBase.addAll(carnations);
        return "Carnation successfully added";
    }

    @Override
    public List<Carnation> getAllFlowers() {
        return carnationsDateBase;
    }

    @Override
    public List<Carnation> getFlowersFinByColor(String color) {
        return carnationsDateBase.stream().filter(s -> s.getColor().equals(Colorr.valueOf(color.toUpperCase()))).toList();
    }

    @Override
    public Map<Colorr, List<Carnation>> groupingFlowersByColor() {
        return null;
    }

    @Override
    public int getSumAllFlowers() {
        return carnationsDateBase.stream().mapToInt(s -> (int) s.getPrice()).sum();
    }

    @Override
    public List<Carnation> getAllFlowersSortByPrice(String ascendingOrDescending) {
        Comparator<Carnation> comparator = new Comparator<Carnation>() {
            @Override
            public int compare(Carnation o1, Carnation o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        };
        return carnationsDateBase.stream().sorted(comparator).toList();
    }
}
