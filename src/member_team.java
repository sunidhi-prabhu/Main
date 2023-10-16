import java.util.Arrays;
import java.util.Scanner;

public class member_team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n , m;
        System.out.println("enter the total number of teams");
        n = in.nextInt();
        System.out.println("enter the total number of members in each team");
        m = in.nextInt();
        in.nextLine();
        String[][][] arr = new String[n][m][2];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the team name");
            String team = in.nextLine();
            for (int j = 0; j < m; j++) {
                System.out.println("enter  the team member");
                String member = in.nextLine();
                arr[i][j][0] = team;
                arr[i][j][1] = member;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
