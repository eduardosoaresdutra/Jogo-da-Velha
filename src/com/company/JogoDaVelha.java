package com.company;

import javax.swing.*;

public class JogoDaVelha {
    private JPanel JJogoDaVelha;
    private JButton field1;
    private JButton field3;
    private JButton field2;
    private JButton field6;
    private JButton field5;
    private JButton field4;
    private JButton field7;
    private JButton field8;
    private JButton field9;
    private JLabel gameMessage;

    private int[][] GamePositions = new int[3][3];

    private int PlayerControl = 0;

    public void ChangePlayer() {
        if (this.PlayerControl == 0) {
            this.PlayerControl = 1;
        } else {
            this.PlayerControl = 0;
        }
    }

    public void VerifyWin() {
        if ((this.GamePositions[0][0] == 0 && this.GamePositions[0][1] == 0 && this.GamePositions[0][2] == 0) ||
                (this.GamePositions[0][0] == 1 && this.GamePositions[0][1] == 1 && this.GamePositions[0][2] == 1) ||
                (this.GamePositions[1][0] == 0 && this.GamePositions[1][1] == 0 && this.GamePositions[1][2] == 0) ||
                (this.GamePositions[1][0] == 1 && this.GamePositions[1][1] == 1 && this.GamePositions[1][2] == 1) ||
                (this.GamePositions[2][0] == 0 && this.GamePositions[2][1] == 0 && this.GamePositions[2][2] == 0) ||
                (this.GamePositions[2][0] == 1 && this.GamePositions[2][1] == 1 && this.GamePositions[2][2] == 1) ||
                (this.GamePositions[0][0] == 0 && this.GamePositions[1][0] == 0 && this.GamePositions[2][0] == 0) ||
                (this.GamePositions[0][0] == 1 && this.GamePositions[1][0] == 1 && this.GamePositions[2][0] == 1) ||
                (this.GamePositions[0][1] == 0 && this.GamePositions[1][1] == 0 && this.GamePositions[2][1] == 0) ||
                (this.GamePositions[0][1] == 1 && this.GamePositions[1][1] == 1 && this.GamePositions[2][1] == 1) ||
                (this.GamePositions[0][2] == 0 && this.GamePositions[1][2] == 0 && this.GamePositions[2][2] == 0) ||
                (this.GamePositions[0][2] == 1 && this.GamePositions[1][2] == 1 && this.GamePositions[2][2] == 1) ||
                (this.GamePositions[0][0] == 0 && this.GamePositions[1][1] == 0 && this.GamePositions[2][2] == 0) ||
                (this.GamePositions[0][0] == 1 && this.GamePositions[1][1] == 1 && this.GamePositions[2][2] == 1) ||
                (this.GamePositions[2][0] == 1 && this.GamePositions[1][1] == 1 && this.GamePositions[0][2] == 1) ||
                (this.GamePositions[2][0] == 1 && this.GamePositions[1][1] == 1 && this.GamePositions[0][2] == 1)
        ) {}
    }

    public static void run() {
        JFrame frame = new JFrame("Jogo da Velha");
        frame.setContentPane(new JogoDaVelha().JJogoDaVelha);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
