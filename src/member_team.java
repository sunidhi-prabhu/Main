import java.util.Scanner;

public class member_team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalPlayers;
        System.out.println("Enter the total number of players:");
        totalPlayers = in.nextInt();
        in.nextLine();

        String[][] playerInfo = new String[totalPlayers][3];
        String[] teamNames = new String[totalPlayers];
        int teamCount = 0;

        for (int i = 0; i < totalPlayers; i++) {
            System.out.println("For player " + (i + 1));
            System.out.println("Enter player name:");
            String playerName = in.nextLine();
            System.out.println("Enter his team:");
            String teamName = in.nextLine();
            System.out.println("Enter his batting average:");
            String battingAvg = in.nextLine();

            int teamIndex = -1;
            for (int j = 0; j < teamCount; j++) {
                if (teamNames[j].equals(teamName)) {
                    teamIndex = j;
                    break;
                }
            }

            if (teamIndex == -1) {
                teamNames[teamCount] = teamName;
                teamIndex = teamCount;
                teamCount++;
            }

            playerInfo[i][0] = playerName;
            playerInfo[i][1] = teamName;
            playerInfo[i][2] = battingAvg;
        }

        for (int i = 0; i < teamCount; i++) {
            String team = teamNames[i];
            System.out.println("\nTeam: " + team);
            for (String[] player : playerInfo) {
                if (player[1].equals(team)) {
                    System.out.println("Player: " + player[0] + ", Batting Avg: " + player[2]);
                }
            }
        }


    }
}
