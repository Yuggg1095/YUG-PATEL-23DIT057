import java.util.Scanner;
import java.util.Vector;

class CricketScoreSheet2 {
    static String competition, venue, matchBetween, tossWinner, electedChoice, inning, date;
    static String[] batsmen, bowlers;
    static int[] runsByBatsmen, runsGivenByBowlers;
    static int numPlayers;
    static Vector<String> v1 = new Vector<>();
    static Vector<Integer> v2 = new Vector<>();
    static Vector<String> v3 = new Vector<>();
    static Vector<Integer> v4 = new Vector<>();

    static String getCompetition() {
        return competition;
    }

    static void setCompetition(String competition) {
        CricketScoreSheet.competition = competition;
    }

    static String getVenue() {
        return venue;
    }

    static void setVenue(String venue) {
        CricketScoreSheet.venue = venue;
    }

    static String getMatchBetween() {
        return matchBetween;
    }

    static void setMatchBetween(String matchBetween) {
        CricketScoreSheet.matchBetween = matchBetween;
    }

    static String getTossWinner() {
        return tossWinner;
    }

    static void setTossWinner(String tossWinner) {
        CricketScoreSheet.tossWinner = tossWinner;
    }

    static String getElectedChoice() {
        return electedChoice;
    }

    static void setElectedChoice(String electedChoice) {
        CricketScoreSheet.electedChoice = electedChoice;
    }

    static String getInning() {
        return inning;
    }

    static void setInning(String inning) {
        CricketScoreSheet.inning = inning;
    }

    static String getDate() {
        return date;
    }

    static void setDate(String date) {
        CricketScoreSheet.date = date;
    }

    static String[] getBatsmen() {
        return batsmen;
    }

    static void setBatsmen(String[] batsmen) {
        CricketScoreSheet.batsmen = batsmen;
    }

    static String[] getBowlers() {
        return bowlers;
    }

    static void setBowlers(String[] bowlers) {
        CricketScoreSheet.bowlers = bowlers;
    }

    static int[] getRunsByBatsmen() {
        return runsByBatsmen;
    }

    static void setRunsByBatsmen(int[] runsByBatsmen) {
        CricketScoreSheet.runsByBatsmen = runsByBatsmen;
    }

    static int[] getRunsGivenByBowlers() {
        return runsGivenByBowlers;
    }

    static void setRunsGivenByBowlers(int[] runsGivenByBowlers) {
        CricketScoreSheet.runsGivenByBowlers = runsGivenByBowlers;
    }

    static int getNumPlayers() {
        return numPlayers;
    }

    static void setNumPlayers(int numPlayers) {
        CricketScoreSheet.numPlayers = numPlayers;
    }

    static void viewScoreSheet() {
        System.out.println("\n+---------------------------------------------+");
        System.out.println("|                  Score Sheet                |");
        System.out.println("+---------------------------------------------+");
        System.out.println("| Competition: " + competition);
        System.out.println("| Venue: " + venue);
        System.out.println("| Match Between: " + matchBetween);
        System.out.println("| Toss Winner: " + tossWinner);
        System.out.println("| Elected Choice: " + electedChoice);
        System.out.println("| Inning: " + inning);
        System.out.println("| Date: " + date);
        System.out.println("+---------------------------------------------+");

        System.out.println("\n+-----------------------+");
        System.out.println("| Batsmen      | Runs   |");
        System.out.println("+-----------------------+");
        for (int i = 0; i < numPlayers; i++) {
            System.out.printf("| %-12s | %-5d |\n", v1.get(i), v2.get(i));
        }
        System.out.println("+-----------------------+");

        System.out.println("\n+-----------------------+");
        System.out.println("| Bowlers      | Runs Given |");
        System.out.println("+---------------------------+");
        for (int i = 0; i < numPlayers; i++) {
            System.out.printf("| %-12s | %-10d |\n", v3.get(i), v4.get(i));
        }
        System.out.println("+---------------------------+");
    }

    static void newScoreSheet() {
        System.out.println("Enter Competition: ");
        Scanner sc = new Scanner(System.in);
        competition = sc.next();
        System.out.println("Enter Venue: ");
        venue = sc.next();
        System.out.println("Enter Match Between: ");
        matchBetween = sc.next();
        System.out.println("Enter Toss Winner: ");
        tossWinner = sc.next();
        System.out.println("Enter Elected Choice: ");
        electedChoice = sc.next();
        System.out.println("Enter Inning: ");
        inning = sc.next();
        System.out.println("Enter Date: ");
        date = sc.next();

        System.out.println("Enter Number of Players: ");
        numPlayers = sc.nextInt();
        batsmen = new String[numPlayers];
        runsByBatsmen = new int[numPlayers];
        bowlers = new String[numPlayers];
        runsGivenByBowlers = new int[numPlayers];

        System.out.println("Enter Names of Batsmen and Runs Hit:");
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Batsman " + (i + 1) + " Name: ");
            batsmen[i] = sc.next();
            v1.add(batsmen[i]);
            System.out.println("Runs Hit by " + batsmen[i] + ": ");
            runsByBatsmen[i] = sc.nextInt();
            v2.add(runsByBatsmen[i]);
        }

        System.out.println("Enter Names of Bowlers and Runs Given:");
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Bowler " + (i + 1) + " Name: ");
            bowlers[i] = sc.next();
            v3.add(bowlers[i]);
            System.out.println("Runs Given by " + bowlers[i] + ": ");
            runsGivenByBowlers[i] = sc.nextInt();
            v4.add(runsGivenByBowlers[i]);
        }

        System.out.println("Score Sheet created successfully.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1) New Score Sheet");
            System.out.println("2) View Score Sheet");
            System.out.println("3) Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    newScoreSheet();
                    break;
                case 2:
                    viewScoreSheet();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
