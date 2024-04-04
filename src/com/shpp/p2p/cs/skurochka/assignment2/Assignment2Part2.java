package com.shpp.p2p.cs.skurochka.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram {
    // The constant in which the radius of a circle is stored.
    private final double RADIUS_OF_CIRCLE = 100;

    // The method of launching the program.
    public void run() {
        // A method that draws four circles. Accepts the radius of a circle as a parameter.
        drawAllCircles(RADIUS_OF_CIRCLE);
        // A method that draws a rectangle. Accepts the radius of a circle as a parameter.
        drawRectangle(RADIUS_OF_CIRCLE);
    }

    /*
    * A method that draws four circles. Accepts the radius of a circle as a parameter.
    * The method calls methods ( drawFirstCircle(), drawSecondCircle(), drawThirdCircle(),
    * drawForthCircle() ) in turn that draw four color-filled circles.
    */
    private void drawAllCircles(double radius) {
        drawFirstCircle(radius);
        drawSecondCircle(radius);
        drawThirdCircle(radius);
        drawForthCircle(radius);
    }

    /*
     * The method of drawing a rectangle. Accepts the radius of the circle as a parameter.
     * In the middle, a new object of type GRect is created, in which the radius is set,
     * which is used as the starting position for building a rectangle, the service function getWidth()/getHeight()
     * is used as the size, from which the diameters of the circle are subtracted.
     * Then the shape fill is turned on to allow you to add a fill color.
     * The next step is to set the desired color.
     * This is then added to the screen composition.
     */
    private void drawRectangle(double radius) {
        GRect rect = new GRect(radius, radius, getWidth() - getDiameter(radius), getHeight() - getDiameter(radius));
        rect.setFilled(true);
        rect.setColor(Color.WHITE);
        add(rect);
    }

    /*
     * Method for drawing the first circle. Accepts the radius of the circle as a parameter.
     * The method includes the parameters of the starting point for calculating the circle.
     * Then the method for drawing a circle is called drawOneCircle(), to which all the necessary parameters are passed.
     */
    private void drawFirstCircle(double radius) {
        double startPointX = 0, startPointY = 0;
        drawOneCircle(startPointX, startPointY, radius, radius);
    }

    /*
      Method for drawing the second circle. Accepts the radius of the circle as a parameter.
     * The method includes the parameters of the starting point for calculating the circle.
     * Then the method for drawing a circle is called drawOneCircle(), to which all the necessary parameters are passed.
     */
    private void drawSecondCircle(double radius) {
        double startPointX = getWidth() - getDiameter(radius), startPointY = 0;
        drawOneCircle(startPointX, startPointY, radius, radius);
    }

    /*
     * Method for drawing the third circle. Accepts the radius of the circle as a parameter.
     * The method includes the parameters of the starting point for calculating the circle.
     * Then the method for drawing a circle is called drawOneCircle(), to which all the necessary parameters are passed.
     */
    private void drawThirdCircle(double radius) {
        double startPointX = 0, startPointY = getHeight() - getDiameter(radius);
        drawOneCircle(startPointX, startPointY, radius, radius);
    }

    /*
     * Method for drawing the forth circle. Accepts the radius of the circle as a parameter.
     * The method includes the parameters of the starting point for calculating the circle.
     * Then the method for drawing a circle is called drawOneCircle(), to which all the necessary parameters are passed.
     */
    private void drawForthCircle(double radius) {
        double startPointX = getWidth() - getDiameter(radius), startPointY = getHeight() - getDiameter(radius);
        drawOneCircle(startPointX, startPointY, radius, radius);
    }

    /*
     * The method of drawing a single circle.
     * The method takes four parameters, the first parameter is the X position,
     * the second parameter is the Y position, the third parameter is the radius in the X coordinate direction,
     * and the last parameter is the radius in the Y coordinate direction.
     * Inside the method, an object of type GOval is created,
     * into which the input parameters of the starting positions are passed,
     * and the diameters calculated from the input radii are passed accordingly.
     * Then the shape fill is turned on to allow you to add a fill color.
     * The next step is to set the desired color.
     * This is then added to the screen composition.
     */
    private void drawOneCircle(double startX, double startY, double radiusX, double radiusY) {
        GOval circle = new GOval(startX, startY, getDiameter(radiusX), getDiameter(radiusY));
        circle.setFilled(true);
        circle.setColor(Color.BLACK);
        add(circle);
    }

    /*
     *The method is used to calculate the diameter.
     * Takes a radius as a parameter and returns a double value.
     * Returns the radius multiplied by two.
     */
    private double getDiameter(double x) {
        return x * 2;
    }
}