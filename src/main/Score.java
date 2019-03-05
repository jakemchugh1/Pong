package main;

import static org.lwjgl.opengl.GL11.*;

public class Score {

    private int left;
    private int right;

    public Score(){
        left = 0;
        right = 0;
    }

    public void drawScoreboard(){
        //left score
        if(left == 0) zero(200 , 20);
        if(left == 1) one(200 , 20);
        if(left == 2) two(200 , 20);
        if(left == 3) three(200 , 20);
        if(left == 4) four(200 , 20);
        if(left == 5) five(200 , 20);
        if(left == 6) six(200 , 20);
        if(left == 7) seven(200 , 20);
        if(left == 8) eight(200 , 20);
        if(left == 9) nine(200 , 20);

        //right score
        if(right == 0) zero(440 , 20);
        if(right == 1) one(440 , 20);
        if(right == 2) two(440 , 20);
        if(right == 3) three(440 , 20);
        if(right == 4) four(440 , 20);
        if(right == 5) five(440 , 20);
        if(right == 6) six(440 , 20);
        if(right == 7) seven(440 , 20);
        if(right == 8) eight(440 , 20);
        if(right == 9) nine(440 , 20);
    }

    public void setScore(int left, int right){
        this.left = left;
        this.right = right;
    }

    private void zero(float startX, float startY){
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY);
        glVertex2f(startX+10,startY);
        glVertex2f(startX+10,startY+3);
        glVertex2f(startX,startY+3);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX+7,startY+3);
        glVertex2f(startX+10,startY+3);
        glVertex2f(startX+10,startY+8);
        glVertex2f(startX+7,startY+8);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+3);
        glVertex2f(startX+3,startY+3);
        glVertex2f(startX+3,startY+8);
        glVertex2f(startX,startY+8);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+8);
        glVertex2f(startX+10,startY+8);
        glVertex2f(startX+10,startY+11);
        glVertex2f(startX,startY+11);
        glEnd();
    }

    private void one(float startX, float startY){
        glBegin(GL_POLYGON);
        glVertex2f(startX+7,startY);
        glVertex2f(startX+10,startY);
        glVertex2f(startX+10,startY+11);
        glVertex2f(startX+7,startY+11);
        glEnd();
    }
    private void two(float startX, float startY){
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY);
        glVertex2f(startX+10,startY);
        glVertex2f(startX+10,startY+3);
        glVertex2f(startX,startY+3);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX+7,startY+3);
        glVertex2f(startX+10,startY+3);
        glVertex2f(startX+10,startY+6);
        glVertex2f(startX+7,startY+6);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+5);
        glVertex2f(startX+10,startY+5);
        glVertex2f(startX+10,startY+7);
        glVertex2f(startX,startY+7);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+6);
        glVertex2f(startX+3,startY+6);
        glVertex2f(startX+3,startY+9);
        glVertex2f(startX,startY+9);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+9);
        glVertex2f(startX+10,startY+9);
        glVertex2f(startX+10,startY+11);
        glVertex2f(startX,startY+11);
        glEnd();
    }
    private void three(float startX, float startY){
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY);
        glVertex2f(startX+10,startY);
        glVertex2f(startX+10,startY+3);
        glVertex2f(startX,startY+3);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX+7,startY+3);
        glVertex2f(startX+10,startY+3);
        glVertex2f(startX+10,startY+6);
        glVertex2f(startX+7,startY+6);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+5);
        glVertex2f(startX+10,startY+5);
        glVertex2f(startX+10,startY+7);
        glVertex2f(startX,startY+7);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX+7,startY+6);
        glVertex2f(startX+10,startY+6);
        glVertex2f(startX+10,startY+9);
        glVertex2f(startX+7,startY+9);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+9);
        glVertex2f(startX+10,startY+9);
        glVertex2f(startX+10,startY+11);
        glVertex2f(startX,startY+11);
        glEnd();
    }
    private void four(float startX, float startY){
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY);
        glVertex2f(startX+3,startY);
        glVertex2f(startX+3,startY+6);
        glVertex2f(startX,startY+6);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX+7,startY);
        glVertex2f(startX+10,startY);
        glVertex2f(startX+10,startY+6);
        glVertex2f(startX+7,startY+6);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+5);
        glVertex2f(startX+10,startY+5);
        glVertex2f(startX+10,startY+7);
        glVertex2f(startX,startY+7);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX+7,startY+6);
        glVertex2f(startX+10,startY+6);
        glVertex2f(startX+10,startY+11);
        glVertex2f(startX+7,startY+11);
        glEnd();
    }
    private void five(float startX, float startY){
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY);
        glVertex2f(startX+10,startY);
        glVertex2f(startX+10,startY+3);
        glVertex2f(startX,startY+3);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+3);
        glVertex2f(startX+3,startY+3);
        glVertex2f(startX+3,startY+6);
        glVertex2f(startX,startY+6);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+5);
        glVertex2f(startX+10,startY+5);
        glVertex2f(startX+10,startY+7);
        glVertex2f(startX,startY+7);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX+7,startY+6);
        glVertex2f(startX+10,startY+6);
        glVertex2f(startX+10,startY+9);
        glVertex2f(startX+7,startY+9);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+9);
        glVertex2f(startX+10,startY+9);
        glVertex2f(startX+10,startY+11);
        glVertex2f(startX,startY+11);
        glEnd();
    }
    private void six(float startX, float startY){
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY);
        glVertex2f(startX+10,startY);
        glVertex2f(startX+10,startY+3);
        glVertex2f(startX,startY+3);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+3);
        glVertex2f(startX+3,startY+3);
        glVertex2f(startX+3,startY+6);
        glVertex2f(startX,startY+6);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+5);
        glVertex2f(startX+10,startY+5);
        glVertex2f(startX+10,startY+7);
        glVertex2f(startX,startY+7);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX+7,startY+6);
        glVertex2f(startX+10,startY+6);
        glVertex2f(startX+10,startY+9);
        glVertex2f(startX+7,startY+9);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+6);
        glVertex2f(startX+3,startY+6);
        glVertex2f(startX+3,startY+9);
        glVertex2f(startX,startY+9);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+9);
        glVertex2f(startX+10,startY+9);
        glVertex2f(startX+10,startY+11);
        glVertex2f(startX,startY+11);
        glEnd();
    }
    private void seven(float startX, float startY){
        glBegin(GL_POLYGON);
        glVertex2f(startX+7,startY);
        glVertex2f(startX+10,startY);
        glVertex2f(startX+10,startY+11);
        glVertex2f(startX+7,startY+11);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY);
        glVertex2f(startX+10,startY);
        glVertex2f(startX+10,startY+3);
        glVertex2f(startX,startY+3);
        glEnd();
    }
    private void eight(float startX, float startY){
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY);
        glVertex2f(startX+10,startY);
        glVertex2f(startX+10,startY+3);
        glVertex2f(startX,startY+3);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+3);
        glVertex2f(startX+3,startY+3);
        glVertex2f(startX+3,startY+6);
        glVertex2f(startX,startY+6);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+5);
        glVertex2f(startX+10,startY+5);
        glVertex2f(startX+10,startY+7);
        glVertex2f(startX,startY+7);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX+7,startY+6);
        glVertex2f(startX+10,startY+6);
        glVertex2f(startX+10,startY+9);
        glVertex2f(startX+7,startY+9);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+6);
        glVertex2f(startX+3,startY+6);
        glVertex2f(startX+3,startY+9);
        glVertex2f(startX,startY+9);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+9);
        glVertex2f(startX+10,startY+9);
        glVertex2f(startX+10,startY+11);
        glVertex2f(startX,startY+11);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX+7,startY+3);
        glVertex2f(startX+10,startY+3);
        glVertex2f(startX+10,startY+6);
        glVertex2f(startX+7,startY+6);
        glEnd();
    }
    private void nine(float startX, float startY){
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY);
        glVertex2f(startX+10,startY);
        glVertex2f(startX+10,startY+3);
        glVertex2f(startX,startY+3);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+3);
        glVertex2f(startX+3,startY+3);
        glVertex2f(startX+3,startY+6);
        glVertex2f(startX,startY+6);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX,startY+5);
        glVertex2f(startX+10,startY+5);
        glVertex2f(startX+10,startY+7);
        glVertex2f(startX,startY+7);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX+7,startY+6);
        glVertex2f(startX+10,startY+6);
        glVertex2f(startX+10,startY+9);
        glVertex2f(startX+7,startY+9);
        glEnd();
        glBegin(GL_POLYGON);
        glVertex2f(startX+7,startY+3);
        glVertex2f(startX+10,startY+3);
        glVertex2f(startX+10,startY+11);
        glVertex2f(startX+7,startY+11);
        glEnd();
    }
}
