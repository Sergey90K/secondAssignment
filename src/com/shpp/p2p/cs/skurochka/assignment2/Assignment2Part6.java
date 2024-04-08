package com.shpp.p2p.cs.skurochka.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;

public class Assignment2Part6 extends WindowProgram {
    // Number of caterpillar circles. Can be changed for testing purposes.
    private static final int NUMBER_OF_CIRCLES = 6;
    // The diameter of each circle of the track. It does not need to be changed.
    private static final double DIAMETER_OF_THE_CIRCLE = 100;
    // The offset coefficient of the next circle. No need to change it.
    private static final double COEFFICIENT_OF_OFFSET_OF_THE_CIRCLE_POSITION = 0.55;

    // The method of launching the program.
    public void run() {
        // The method of drawing a caterpillar.
        drawCaterpillar();
    }

    /*
    * The method of drawing a caterpillar.
    * The method includes X and Y positions to start building each segment of the caterpillar.
    * Next, the offset position of each subsequent caterpillar segment is calculated.
    * Then a loop is started and repeated the number of times it takes to build a given caterpillar size.
    * The loop checks for step parity and calculates the position change according to the formulas.
    * Then the construction of the caterpillar segment is completed.
    * At the end of the cycle, the X and Y positions are reset to zero each time.
    * */
    private void drawCaterpillar() {
        double positionX = 0, positionY = 0;
        double shiftThePositionOfTheWheel = DIAMETER_OF_THE_CIRCLE * COEFFICIENT_OF_OFFSET_OF_THE_CIRCLE_POSITION;
        for (int i = 0; i < NUMBER_OF_CIRCLES; i++) {
            if (i % 2 == 0) {
                positionX += shiftThePositionOfTheWheel * i;
                positionY += shiftThePositionOfTheWheel;
            } else {
                positionX += shiftThePositionOfTheWheel * i;
            }
            drawOneCircle(positionX, positionY, DIAMETER_OF_THE_CIRCLE, DIAMETER_OF_THE_CIRCLE);
            positionX = 0;
            positionY = 0;
        }
    }

    /*
    *
    * */
    private void drawOneCircle(double startX, double startY, double diameterX, double diameterY) {
        GOval circle = new GOval(startX, startY, diameterX, diameterY);
        circle.setFilled(true);
        circle.setColor(Color.RED);
        circle.setFillColor(Color.GREEN);
        add(circle);
    }
}
