package com.voting;

import java.util.Map;

public class AdminPanel {
    private VotingService votingService;

    public AdminPanel(VotingService service) {
        this.votingService = service;
    }

    public void showResults() {
        System.out.println("\n===== Voting Results =====");
        for (Map.Entry<String, Integer> entry : votingService.getResults().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    public void resetVotes() {
        votingService.resetVotes();
        System.out.println("All votes have been reset.");
    }
}
