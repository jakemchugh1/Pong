package main;

import org.lwjgl.input.Mouse;
import org.lwjgl.util.vector.Vector2f;

import java.util.Random;

import static org.lwjgl.opengl.GL11.*;

public class Ball {

    private Vector2f pos;
    private Vector2f movement;
    private float speed = 1f;
    private int left;
    private int right;
    private Random rand;

    public Ball(Vector2f pos){

        this.pos = pos;
        movement = new Vector2f();
        movement.y = 0f;
        rand = new Random();
        resetMovement();
        left = 0;
        right = 0;
        printScore();

    }

    public void draw(){
        glBegin(GL_POLYGON);
        glVertex2f(pos.x-5,pos.y-5);
        glVertex2f(pos.x+5,pos.y-5);
        glVertex2f(pos.x+5,pos.y+5);
        glVertex2f(pos.x-5,pos.y+5);
        glEnd();


    }

    public void update(){
        pos.x = pos.x + movement.x*speed;
        pos.y = pos.y + movement.y*speed;
        checkBorders();
    }

    public void checkBorders(){
        if(pos.y-5 < 0 || pos.y + 5 > 480) movement.y = -movement.y;
        if(pos.x < 0){
            pos.x = 320;
            pos.y = 240;
            resetMovement();
            right++;
            speed = speed + 0.2f;
        }
        if(pos.x > 640){
            pos.x = 320;
            pos.y = 240;
            resetMovement();
            left++;
            speed = speed + 0.2f;
        }
    }

    private void resetMovement(){
        int start = rand.nextInt(2);
        if(start == 1) movement.x = 1.5f;
        else movement.x = -1.5f;
        movement.y = 0f;
    }

    private void printScore(){
        System.out.println("Left: " + left);
        System.out.println("Right: " + right);
    }

    public Vector2f getPos() {
        return pos;
    }

    public void setPos(Vector2f pos) {
        this.pos = pos;
    }

    public Vector2f getMovement() {
        return movement;
    }

    public void setMovement(Vector2f movement) {
        this.movement = movement;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getLeft(){
        return left;
    }

    public int getRight(){
        return right;
    }
}
