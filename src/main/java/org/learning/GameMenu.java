package org.learning;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameMenu extends JFrame {

    private JButton playerVsPlayerButton;
    private JButton playerVsAiButton;

    public GameMenu() {
        setTitle("Pick opponent");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        playerVsPlayerButton = new JButton("Player vs Player");
        playerVsAiButton = new JButton("Player vs AI");
        panel.add(playerVsPlayerButton);
        panel.add(playerVsAiButton);
        add(panel);

        playerVsPlayerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                GameFrame gameFrame = new GameFrame();
                gameFrame.setVisible(true);
            }
        });

        playerVsAiButton.addActionListener(e -> {
            // kod do uruchomienia gry player vs AI
        });
    }
}
