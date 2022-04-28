package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public JogoDaVelha() {
        field1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetPositionMarker(field1, 0, 0);
            }
        });
        field2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetPositionMarker(field2, 0, 1);
            }
        });
        field3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetPositionMarker(field3, 0, 2);
            }
        });
        field4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetPositionMarker(field4, 1, 0);
            }
        });
        field5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetPositionMarker(field5, 1, 1);
            }
        });
        field6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetPositionMarker(field6, 1, 2);
            }
        });
        field7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetPositionMarker(field7, 2, 0);
            }
        });
        field8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetPositionMarker(field8, 2, 1);
            }
        });
        field9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetPositionMarker(field9, 2, 2);
            }
        });
    }

    public void ChangePlayer() {
        if (this.PlayerControl == 0) {
            this.PlayerControl = 1;
            this.gameMessage.setText("Vez do jogador 'X'!");
        } else {
            this.PlayerControl = 0;
            this.gameMessage.setText("Vez do jogador 'O'!");
        }
    }

    public void SetMatrixMarker(int rowIndex, int colIndex, int markerValue) {
        this.GamePositions[rowIndex][colIndex] = markerValue;
    }

    public void SetPositionMarker(JButton button, int rowIndex, int colIndex) {
        if (this.PlayerControl == 0) {
            this.SetMatrixMarker(rowIndex, colIndex, 0);
            button.setText("O");
            if (this.VerifyWin()) {
                // Função que torna os botões inclicáveis
                this.gameMessage.setText("Jogador 'O' venceu!");
            } else {
                this.ChangePlayer();
            }
        } else {
            this.SetMatrixMarker(rowIndex, colIndex, 1);
            button.setText("X");
            if (this.VerifyWin()) {
                // Função que torna os botões inclicáveis
                this.gameMessage.setText("Jogador 'X' venceu!");
            } else {
                this.ChangePlayer();
            }
        }
    }

    public boolean VerifyWin() {
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
        ) {
            return true;
        } return false;
    }

    public static void run() {
        JFrame frame = new JFrame("Jogo da Velha");
        frame.setContentPane(new JogoDaVelha().JJogoDaVelha);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
