package service;

import classes.Rose;
import enums.Colorr;
import interfaces.ServiceFlower;

import java.util.*;
import java.util.stream.Collectors;


public class RoseService implements ServiceFlower<Rose> {
    private List<Rose> roseDateBase = new ArrayList<>();

    @Override
    public String addFlowers(List<Rose> roses) {
        roseDateBase.addAll(roses);
        return "Rose successfully added";
    }

    @Override
    public List<Rose> getAllFlowers() {
        return roseDateBase;
    }

    @Override
    public List<Rose> getFlowersFinByColor(String color) {
        return roseDateBase.stream().filter(s -> s.getColor().equals(Colorr.valueOf(color.toUpperCase()))).toList();
    }

    @Override
    public Map<Colorr, List<Rose>> groupingFlowersByColor() {
        return roseDateBase.stream().collect(Collectors.groupingBy(Rose::getColor));
    }

    @Override
    public int getSumAllFlowers() {
        return roseDateBase.stream().mapToInt(s -> (int) s.getPrice()).sum();
    }

    @Override
    public List<Rose> getAllFlowersSortByPrice(String ascendingOrDescending) {
      if (ascendingOrDescending.toLowerCase().equals("ascending")){
          return roseDateBase.stream().sorted(Comparator.comparing(Rose::getPrice)).toList();
      }
      if (ascendingOrDescending.toLowerCase().equals("descending")){
          return roseDateBase.stream().sorted(Comparator.comparing(Rose::getPrice).reversed()).toList();
      }
      return null;
    }
}
