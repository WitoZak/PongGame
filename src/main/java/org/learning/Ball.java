package org.learning;

import java.awt.*;
import java.util.Objects;
import java.util.Random;

public class Ball extends Rectangle {

    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 2;
    Ball (int x, int y, int width, int height) {
        super(x, y, width, height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0)
            randomXDirection--;
        setXDirection(randomXDirection * initialSpeed);

        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0)
            randomYDirection--;
        setYDirection(randomYDirection * initialSpeed);

    }

    public void setYDirection(int randomYDirection) {

        yVelocity = randomYDirection;
    }

    public void setXDirection(int randomXDirection) {

        xVelocity = randomXDirection;
    }

    public void move() {

        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, width, height);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Ball ball = (Ball) o;

        if (xVelocity != ball.xVelocity) return false;
        if (yVelocity != ball.yVelocity) return false;
        if (initialSpeed != ball.initialSpeed) return false;
        return Objects.equals(random, ball.random);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (random != null ? random.hashCode() : 0);
        result = 31 * result + xVelocity;
        result = 31 * result + yVelocity;
        result = 31 * result + initialSpeed;
        return result;
    }
}
