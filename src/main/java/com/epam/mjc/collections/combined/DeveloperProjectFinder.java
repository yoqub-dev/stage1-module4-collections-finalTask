package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> developerProjects = new ArrayList<>();
        Set<String> projectsForDeveloper = projects.getOrDefault(developer, new HashSet<>());

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                developerProjects.add(entry.getKey());
            }
        }

        developerProjects.sort((a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(b.length(), a.length());
            } else {
                return b.compareTo(a);
            }
        });

        return developerProjects;
    }
}
