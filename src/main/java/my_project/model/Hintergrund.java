package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class Hintergrund extends GraphicalObject {

    public double time;
    public double earthHeight = 600;
    public boolean isDay;
    public double y = 80;

    public Hintergrund() {
        time = (int)(Math.random()*2000);
    }
    public Hintergrund(double time) {
        this.time = time;
    }

    public void draw(DrawTool drawTool) {

        if(time < 1260) {
            isDay = true;
            drawTool.setCurrentColor(new Color(100, 130, 255, 255));
            drawTool.drawFilledRectangle(0, 0, 1200, 780);
            drawTool.setCurrentColor(new Color(253, 218, 13, 255));
            drawTool.drawFilledCircle(time, y, 60);
        } else if (time > 1200) {
            isDay = false;
            drawTool.setCurrentColor(new Color(26, 29, 43, 255));
            drawTool.drawFilledRectangle(0, 0, 1200, 780);
            drawTool.setCurrentColor(new Color(239, 222, 142, 255));
            drawTool.drawFilledCircle(time - 1200, y, 60);
        }
        //earf
        drawTool.setCurrentColor(new Color(124, 189, 107, 255));
        drawTool.drawFilledRectangle(0, earthHeight, 1200, 200);

    }


    public void update(double dt){
        time =  time + dt*200;
        if (isDay){
            y = 0.0005*(time-600) * (time-600)+40;
        } else {
            y = 0.0005*(time-1800) * (time-1800)+40;
            if (time > 2460){
                time = -60;
            }
        }
        System.out.println(y);
        System.out.println(time);
    }
}
