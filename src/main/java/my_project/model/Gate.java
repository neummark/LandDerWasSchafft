package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class Gate extends GraphicalObject {
    public Gate(){}
    public void draw(DrawTool drawTool) {

        drawTool.setCurrentColor(255, 248, 220,255);
        for(int i = 0; i < 10; i = i + 1){
            drawTool.drawFilledRectangle(5+i*15,590,5,50);
        }
        drawTool.drawFilledRectangle(0,585,150,5);
    }
}