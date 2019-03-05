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
        zero(200, 200);
        one(220, 200);
        two(240, 200);
        three(260, 200);
        four(280, 200);
        five(300, 200);
        six(320, 200);
        seven(340, 200);
        eight(360, 200);
        nine(380, 200);
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

    }
    private void seven(float startX, float startY){

    }
    private void eight(float startX, float startY){

    }
    private void nine(float startX, float startY){

    }
}
