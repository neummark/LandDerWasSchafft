package my_project.model;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import java.awt.*;


public class Cloud extends GraphicalObject {

    private double r;

    public Cloud(double x, double y, double r){
        this.x = x;	//wird bereits in GraphicalObjekt deklariert
        this.y = y;	//wird bereits in GraphicalObjekt deklariert
        this.r = r;
    }


    public void draw(DrawTool drawTool) {
        //wolken (mit hilfe von KI)
        /*drawTool.setCurrentColor(255, 255, 240, 150);
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
        drawTool.drawFilledCircle(280, 115, 35);*/

        drawTool.setCurrentColor(new Color(65, 58, 58));
        drawTool.drawCircle(x,y,r);
        drawTool.drawCircle(x+r,y+r*0.75,r);
        drawTool.drawCircle(x+r*0.5,y-r*0.5,r);
        drawTool.drawCircle(x+r*2,y+r*0.25,r);
        drawTool.drawCircle(x+r*2.5,y+r*0.75,r);
        drawTool.drawCircle(x+r*3,y,r);
        /** Dies hier war die Vorlage, dank derer die Koordinaten
         berechnet wurden.
         drawTool.drawCircle(100,50,40);
         drawTool.drawCircle(140,80,40);
         drawTool.drawCircle(160,30,40);
         drawTool.drawCircle(180,60,40);
         drawTool.drawCircle(200,80,40);
         drawTool.drawCircle(220,50,40);
         */


        drawTool.setCurrentColor(Color.lightGray);
        drawTool.drawFilledCircle(x,y,r);
        drawTool.drawFilledCircle(x+r,y+r*0.75,r);
        drawTool.drawFilledCircle(x+r*0.5,y-r*0.5,r);
        drawTool.drawFilledCircle(x+r*2,y+r*0.25,r);
        drawTool.drawFilledCircle(x+r*2.5,y+r*0.75,r);
        drawTool.drawFilledCircle(x+r*3,y,r);
    }

    @Override
    public void update(double dt) {
        if (x < 1200+ 2*r) {
            x += dt * 100;
        } else {
            x = 0 - 4*r;
        }
    }
}

