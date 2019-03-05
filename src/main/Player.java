package main;

import org.lwjgl.input.Mouse;
import org.lwjgl.util.vector.Vector2f;

import static org.lwjgl.opengl.GL11.*;

public class Player {

    private boolean real;
    private int side;
    private Vector2f pos;

    public Player(boolean real, int side){
        this.real = real;
        this.side = side;
        pos = new Vector2f();

        if(side == 1){
            pos.x = 600;
        }else{
            pos.x = 40;
        }
        pos.y = 240;
    }
    public void draw(){
        glBegin(GL_POLYGON);
        glVertex2f(pos.x-5,pos.y-20);
        glVertex2f(pos.x+5,pos.y-20);
        glVertex2f(pos.x+5,pos.y+20);
        glVertex2f(pos.x-5,pos.y+20);
        glEnd();


    }
    public void update(Ball ball){
        if(real)pos.y = 480- Mouse.getY();
        else{
            if(pos.y < ball.getPos().y+5 && ball.getMovement().x < 0) pos.y = pos.y + 0.7f*ball.getSpeed();
            else if(pos.y > ball.getPos().y-5 && ball.getMovement().x < 0) pos.y = pos.y - 0.7f*ball.getSpeed();
        }
    }

    public void checkCollision(Ball ball){

        if(ball.getPos().x+5 > pos.x-5 && ball.getPos().x-5 < pos.x+5 && ball.getPos().y+5 > pos.y-20 && ball.getPos().y-5 < pos.y+20) {

            ball.setSpeed(ball.getSpeed() + .1f);


            ball.setMovement(returnVector(ball));
        }
    }

    private Vector2f returnVector(Ball ball){
        Vector2f vector = new Vector2f();

        float magnitude = (float) Math.sqrt(Math.pow((ball.getPos().y - pos.y),2)+Math.pow((ball.getPos().x - pos.x),2));

        vector.x = -ball.getMovement().x;


        vector.y = (ball.getPos().y - pos.y)/magnitude;

        return vector;

    }
}

