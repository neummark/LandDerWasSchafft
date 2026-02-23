package my_project.model;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import java.awt.*;


public class Cloud extends GraphicalObject {

    private double r;
    private Boolean chooseSpeed;
    private double speed;
    private Boolean goRight = false;
    private int Nummmer = (int) (Math.random()*1.1);



    public Cloud(double x, double y, double r, Boolean chooseSpeed, double speed){
        this.x = x;	//wird bereits in GraphicalObjekt deklariert
        this.y = y;	//wird bereits in GraphicalObjekt deklariert
        this.r = r;
        this.chooseSpeed = chooseSpeed;
        this.speed = speed;
        if(chooseSpeed == false){
            speed = Math.random()*400+100;
        }
        //goRight = Nummmer != 1;

    }


    public void draw(DrawTool drawTool) {
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
        if(goRight == true){
            if (x < 1200+ 2*r) {
                x += dt * speed;
            } else {
                x = 0 - 4*r;
                y = Math.random()*500+50;
                r = Math.random()*50 + 10;
                if(r < 20){
                    x -= dt * speed;
                }
            }
        } else {
            if (x > 0 - 2*r) {
                x -= dt * speed;
            } else {
                x = 1200 + 4*r;
                y = Math.random()*500+50;
                r = Math.random()*50 + 10;
                if(r < 20){
                    x += dt * speed;
                }
            }
        }

    }
}

