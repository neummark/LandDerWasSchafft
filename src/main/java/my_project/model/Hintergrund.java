package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class Hintergrund extends GraphicalObject {
    public Hintergrund() {
    }

    public void draw(DrawTool drawTool) {
        //air
        drawTool.setCurrentColor(100, 130, 255, 255);
        drawTool.drawFilledRectangle(0, 0, 800, 780);
        //earf
        drawTool.setCurrentColor(124, 189, 107, 255);
        drawTool.drawFilledRectangle(0, 600, 800, 200);
        //sonne
        drawTool.setCurrentColor(253, 218, 13, 255);
        drawTool.drawFilledCircle(50, 40, 60);
        //wolken (mit hilfe von KI)
        drawTool.setCurrentColor(255, 255, 240, 150);
        drawTool.drawFilledCircle(420, 60, 40);
        drawTool.drawFilledCircle(500, 70, 50);
        drawTool.drawFilledCircle(530, 50, 30);
        drawTool.drawFilledCircle(510, 80, 30);
        drawTool.drawFilledCircle(415, 75, 60);
        drawTool.drawFilledCircle(450, 65, 35);
        drawTool.drawFilledCircle(480, 55, 25);
        drawTool.setCurrentColor(255, 255, 240, 120);
        drawTool.drawFilledCircle(620, 90, 45);
        drawTool.drawFilledCircle(690, 100, 55);
        drawTool.drawFilledCircle(720, 80, 35);
        drawTool.drawFilledCircle(700, 110, 35);
        drawTool.drawFilledCircle(615, 105, 65);
        drawTool.drawFilledCircle(650, 95, 40);
        drawTool.drawFilledCircle(680, 85, 30);
        drawTool.setCurrentColor(255, 255, 240, 130);
        drawTool.drawFilledCircle(220, 120, 50);
        drawTool.drawFilledCircle(290, 130, 60);
        drawTool.drawFilledCircle(320, 110, 40);
        drawTool.drawFilledCircle(300, 140, 40);
        drawTool.drawFilledCircle(215, 135, 70);
        drawTool.drawFilledCircle(250, 125, 45);
        drawTool.drawFilledCircle(280, 115, 35);
    }
}