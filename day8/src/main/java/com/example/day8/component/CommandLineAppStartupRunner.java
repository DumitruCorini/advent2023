package com.example.day8.component;

import com.example.day8.service.ForestManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    @Autowired
    ForestManagerService forestManagerService;

    @Override
    public void run(String... args) {
        // Part 1
        List<List<Integer>> forest = forestManagerService.createForestFromFile("input.txt");
        int visibleTreesCount = forestManagerService.getVisibleTreesCount(forest);
        System.out.println("Visible trees count: " + visibleTreesCount);

        // Part 2
        Integer highestTreeVisibilityScore = forestManagerService.getHighestTreeVisibilityScore(forest);
        System.out.println("Highest tree visibility score: " + highestTreeVisibilityScore);
    }
}
