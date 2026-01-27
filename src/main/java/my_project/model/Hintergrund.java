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

    }
}