package com.srg.code;

public class RobotReturnToOrigin {

    public static void main(String[] args) {
        String moves = "LL";
        System.out.println(judgeCircle(moves));
    }

    private static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (Character character : moves.toCharArray()) {
            if (character == 'U') y--;
            else if (character == 'D') y++;
            else if (character == 'L') x--;
            else if (character == 'R') x++;
        }

        return x == 0 && y == 0;
    }
}
