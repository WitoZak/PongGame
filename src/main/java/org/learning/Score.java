package org.learning;

import java.awt.*;

public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    Score(int GAME_WIDTH, int GAME_HEIGHT) {

        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g) {

        g.setColor(Color.white);
        g.setFont(new Font("Consolas",Font.PLAIN,60));

        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);

        g.drawString(player1 / 10 +String.valueOf(player1%10), (GAME_WIDTH/2)-85, 50);
        g.drawString(player2 / 10 +String.valueOf(player2%10), (GAME_WIDTH/2)+20, 50);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Score score = (Score) o;

        if (player1 != score.player1) return false;
        return player2 == score.player2;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + player1;
        result = 31 * result + player2;
        return result;
    }
}
