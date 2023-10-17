import java.util.Scanner;

public class member_team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n , m;
        float avg;
        System.out.println("enter the total number of teams");
        n = in.nextInt();
        System.out.println("enter the total number of members in each team");
        m = in.nextInt();
        in.nextLine();
        String[][][] arr = new String[n][m][3];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the team name");
            String team = in.nextLine();
            for (int j = 0; j < m; j++) {
                System.out.println("enter  the team member");
                String member = in.nextLine();
                System.out.println("enter batting avg");
                avg = in.nextFloat();
                in.nextLine();



                arr[i][j][0] = team;
                arr[i][j][1] = member;
                arr[i][j][2] = String.valueOf(avg);
            }
        }
        for (String[][] teamArray : arr) {
            for (String[] memberInfo : teamArray) {
                System.out.println("Team: " + memberInfo[0] + ", Member: " + memberInfo[1] + ", Batting Avg: " + memberInfo[2]);
            }
        }
    }
}
