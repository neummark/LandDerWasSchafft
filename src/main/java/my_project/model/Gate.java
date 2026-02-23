package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class Gate extends GraphicalObject {
        private double length;
        private double height;

    public Gate(int x, int y, double length, double height){
        this.x = x;
        this.y = y;
        this.length = length;
        this.height = height;
    }


    public void draw(DrawTool drawTool) {

        drawTool.setCurrentColor(255, 248, 220,255);
        for(int i = 0; i < 10; i = i + 1){
            drawTool.drawFilledRectangle(x+i*(length*0.1)+5,y,length * 0.03,height);
        }
        drawTool.drawFilledRectangle(x,y - (height *0.1),length,height*0.1);
    }
}