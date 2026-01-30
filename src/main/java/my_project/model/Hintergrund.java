package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class Hintergrund extends GraphicalObject {

    private boolean daytime;
    private int time = (int)(Math.random()*2000);

    public Hintergrund(boolean daytime) {
        this.daytime = daytime;
    }

    public void draw(DrawTool drawTool) {
        if (daytime) {
            if(time < 1200) {
                drawTool.setCurrentColor(new Color(100, 130, 255, 255));
                drawTool.drawFilledRectangle(0, 0, 1200, 780);
                drawTool.setCurrentColor(new Color(253, 218, 13, 255));
                drawTool.drawFilledCircle(time, 40, 60);
            } else if (time > 1200) {
                drawTool.setCurrentColor(Color.BLACK);
                drawTool.drawFilledRectangle(0, 0, 1200, 780);
            }
        } else {
            drawTool.setCurrentColor(new Color(100, 130, 255, 255));
            drawTool.drawFilledRectangle(0, 0, 1200, 780);
            drawTool.setCurrentColor(new Color(253, 218, 13, 255));
            drawTool.drawFilledCircle(50, 40, 60);
        }
        //earf
        drawTool.setCurrentColor(new Color(124, 189, 107, 255));
        drawTool.drawFilledRectangle(0, 600, 1200, 200);
    }
}