package com.voting;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        VotingService votingService = new VotingService();
        AdminPanel adminPanel = new AdminPanel(votingService);
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("==== Welcome to Voting Machine ====");

        do {
            System.out.println("\n1. Vote");
            System.out.println("2. Show Results (Admin)");
            System.out.println("3. Reset Voting (Admin)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    votingService.castVote();
                    break;
                case 2:
                    adminPanel.showResults();
                    break;
                case 3:
                    adminPanel.resetVotes();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}
