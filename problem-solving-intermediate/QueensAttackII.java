package com.hackerrank;

import java.util.Scanner;

public class QueensAttackII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boardSize = scanner.nextInt();
        int obstacles = scanner.nextInt();

        int queenX = scanner.nextInt();
        int queenY = scanner.nextInt();

        // X axis, and Y Axis
        int top = queenY - 1;
        int bottom = boardSize - queenY;
        int right = boardSize - queenX;
        int left = queenX - 1;
        // Diagonal
        int topLeft = Math.min(top, left);
        int topRight = Math.min(top, right);
        int bottomLeft = Math.min(bottom, left);
        int bottomRight = Math.min(bottom, right);

        int obstacleX = 0, obstacleY = 0;
        for (int i = 0; i < obstacles; i++) {
            obstacleX = scanner.nextInt();
            obstacleY = scanner.nextInt();

            if (obstacleX == queenX && obstacleY < queenY)
                top = Math.min(top, queenY - obstacleY - 1);
            else if (obstacleX == queenX && obstacleY > queenY)
                bottom = Math.min(bottom, obstacleY - queenY - 1);
            else if (obstacleY == queenY && obstacleX > queenX)
                right = Math.min(right, obstacleX - queenX - 1);
            else if (obstacleY == queenY && obstacleX < queenX)
                left = Math.min(left, queenX - obstacleX - 1);
            else if (obstacleY < queenY && obstacleX < queenX
                    && Math.abs(obstacleX - queenX) == Math.abs(queenY - obstacleY))
                topLeft = Math.min(topLeft, queenX - obstacleX - 1);
            else if (obstacleY < queenY && obstacleX > queenX
                    && Math.abs(obstacleX - queenX) == Math.abs(queenY - obstacleY))
                topRight = Math.min(topRight, obstacleX - queenX - 1);
            else if (obstacleY > queenY && obstacleX < queenX
                    && Math.abs(obstacleX - queenX) == Math.abs(queenY - obstacleY))
                bottomLeft = Math.min(bottomLeft, queenX - obstacleX - 1);
            else if (obstacleY > queenY && obstacleX > queenX
                    && Math.abs(obstacleX - queenX) == Math.abs(queenY - obstacleY))
                bottomRight = Math.min(bottomRight, obstacleX - queenX - 1);

        }
        int sum = top + bottom + left + right + topLeft + topRight + bottomLeft + bottomRight;
        System.out.println(sum);
    }

}
