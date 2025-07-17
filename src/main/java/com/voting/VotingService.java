package com.voting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VotingService {
    private Map<String, Integer> candidates;

    public VotingService() {
        candidates = new HashMap<>();
        candidates.put("Alice", 0);
        candidates.put("Bob", 0);
        candidates.put("Charlie", 0);
    }

    public void castVote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCandidates:");
        for (String name : candidates.keySet()) {
            System.out.println("- " + name);
        }
        System.out.print("Enter candidate name to vote: ");
        String vote = scanner.nextLine();

        if (candidates.containsKey(vote)) {
            candidates.put(vote, candidates.get(vote) + 1);
            System.out.println("Vote casted successfully!");
        } else {
            System.out.println("Invalid candidate.");
        }
    }

    public Map<String, Integer> getResults() {
        return candidates;
    }

    public void resetVotes() {
        for (String name : candidates.keySet()) {
            candidates.put(name, 0);
        }
    }
}
