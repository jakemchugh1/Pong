package main;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.util.glu.Sphere;
import org.lwjgl.util.vector.Vector2f;

import static org.lwjgl.opengl.GL11.*;

public class PongWindow {

    private int width;
    private int height;

    public PongWindow(){

        //width and height of display
        int width = 640;
        int height = 480;




        //setting and naming display

        try {
            Display.setDisplayMode(new DisplayMode(width, height));
            Display.setTitle("Jake Pong");
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0,width,height,0,1,-1);//camera
        glMatrixMode(GL_MODELVIEW);
        glEnable(GL_TEXTURE_2D);
        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        //game loop
        Vector2f startPos = new Vector2f();
        startPos.x = 320f;
        startPos.y = 240f;
        Ball ball = new Ball(startPos);
        Player playerOne = new Player(true, 1);
        Player playerTwo = new Player(false, 0);
        Score score = new Score();

        while (!Display.isCloseRequested()){

            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);



            ball.draw();
            playerOne.draw();
            playerTwo.draw();
            score.drawScoreboard();

            playerOne.checkCollision(ball);
            playerTwo.checkCollision(ball);

            ball.update();
            playerOne.update(ball.getPos());
            playerTwo.update(ball.getPos());
            score.setScore(ball.getLeft(),ball.getRight());



            Display.update();
            Display.sync(60);
        }

        Display.destroy();
    }

    public PongWindow(int width, int height){

        //width and height of display
        this.width = width;
        this.height = height;

        try {
            Display.setDisplayMode(new DisplayMode(width, height));
            Display.setTitle("Jake Pong");
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }

        while (!Display.isCloseRequested()){
            Display.update();
            Display.sync(60);
        }

        Display.destroy();
    }
}
