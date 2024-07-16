import java.util.*;

public class Main {
    static int R, C;
    static char[][] patch;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0}; 
    static int[] dc = {0, 0, -1, 1}; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        sc.nextLine(); 

        patch = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < C; j++) {
                patch[i][j] = line.charAt(j);
            }
        }

        int startRow = sc.nextInt();
        int startCol = sc.nextInt();

        int totalValue = dfs(startRow, startCol);

        System.out.println(totalValue);
    }

    public static int dfs(int row, int col) {
        if (row < 0 || row >= R || col < 0 || col >= C || patch[row][col] == '*' || visited[row][col]) {
            return 0;
        }

        visited[row][col] = true;

        int value = getValue(patch[row][col]);

        for (int i = 0; i < 4; i++) {
            value += dfs(row + dr[i], col + dc[i]);
        }

        return value;
    }

    public static int getValue(char pumpkin) {
        switch (pumpkin) {
            case 'S': return 1;
            case 'M': return 5;
            case 'L': return 10;
            default: return 0; 
        }
    }
}