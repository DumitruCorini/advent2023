package org.example;

import org.example.service.FileUtils;
import org.example.service.StrategyCalculator;

import java.util.List;

public class Main {
    private static final StrategyCalculator strategyCalculator = new StrategyCalculator();

    public static void main(String[] args) {
        List<String> linesFromFile = FileUtils.getLinesFromFile("day2/src/main/resources/input.txt");
        System.out.println(strategyCalculator.getTournamentScore(linesFromFile));
    }
}