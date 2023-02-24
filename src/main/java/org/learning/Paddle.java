package org.learning;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle {

    int id;
    int yVelocity;
    int speed = 10;

    Paddle(int x,
           int y,
           int PADDLE_WIDTH,
           int PADDLE_HEIGHT,
           int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
    }

    public void keyPressed(KeyEvent e) {

        if (id == 1) {
            if (e.getKeyCode() == KeyEvent.VK_W) {
                setYDirection(-speed);
            }
            if (e.getKeyCode() == KeyEvent.VK_S) {
                setYDirection(speed);
            }
        } else if (id == 2) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                setYDirection(-speed);
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                setYDirection(speed);
            }
        }
    }

    public void keyReleased(KeyEvent e) {

        if (id == 1) {
            if (e.getKeyCode() == KeyEvent.VK_W) {
                setYDirection(0);
            }
            if (e.getKeyCode() == KeyEvent.VK_S) {
                setYDirection(0);
            }
        } else if (id == 2) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                setYDirection(0);
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                setYDirection(0);
            }
        }
    }

    public void setYDirection(int yDirection) {

        yVelocity = yDirection;
    }

    public void move() {

        y = y + yVelocity;
    }

    public void draw(Graphics g) {
        if (id == 1)
            g.setColor(Color.BLUE);
        else
            g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Paddle paddle = (Paddle) o;

        if (id != paddle.id) return false;
        if (yVelocity != paddle.yVelocity) return false;
        return speed == paddle.speed;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + yVelocity;
        result = 31 * result + speed;
        return result;
    }
}

