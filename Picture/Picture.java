
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square grass;
    private Square window;
    private Square window2;
    private Triangle roof;
    private Circle sun;
    private Square sky;
    private Circle cloud;
    private Circle cloud2;
    private Circle cloud3;
    private Circle cloud4;
    private Circle cloud5;
    private Circle cloud6;
    private Square door;
    private Square chimney;
    private Circle knob;
    private Triangle branch;
    private Triangle branch2;
    private Square bush;
    private Square vertBar;
    private Square vertBar2;
    private Square horizBar;
    private Square horizBar2;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.changeColor("blue");
        sky.moveHorizontal(-70);
        sky.moveVertical(-50);
        sky.changeSizeHeight(400);
        sky.changeSizeWidth(400);
        sky.makeVisible();
        
        grass = new Square();
        grass.changeColor("green");
        grass.moveHorizontal(-70);
        grass.moveVertical(150);
        grass.changeSizeHeight(400);
        grass.changeSizeWidth(400);
        grass.makeVisible();
        
        wall = new Square();
        wall.changeColor("red");
        wall.moveVertical(80);
        wall.changeSizeHeight(100);
        wall.changeSizeWidth(100);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("red");
        wall.moveVertical(80);
        wall.moveHorizontal(50);
        wall.changeSizeHeight(100);
        wall.changeSizeWidth(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(100);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(90, 180);
        roof.moveHorizontal(85);
        roof.moveVertical(30);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(200);
        sun.moveVertical(-40);
        sun.changeSize(60);
        sun.makeVisible();
        
        cloud = new Circle();
        cloud.changeColor("white");
        cloud.moveHorizontal(-10);
        cloud.moveVertical(-20);
        cloud.changeSize(40);
        cloud.makeVisible();
        
        cloud2 = new Circle();
        cloud2.changeColor("white");
        cloud2.moveHorizontal(-5);
        cloud2.moveVertical(-30);
        cloud2.changeSize(40);
        cloud2.makeVisible();
        
        cloud3 = new Circle();
        cloud3.changeColor("white");
        cloud3.moveHorizontal(10);
        cloud3.moveVertical(-40);
        cloud3.changeSize(40);
        cloud3.makeVisible();
        
        cloud4 = new Circle();
        cloud4.changeColor("white");
        cloud4.moveHorizontal(20);
        cloud4.moveVertical(-50);
        cloud4.changeSize(40);
        cloud4.makeVisible();
        
        cloud5 = new Circle();
        cloud5.changeColor("white");
        cloud5.moveHorizontal(30);
        cloud5.moveVertical(-30);
        cloud5.changeSize(40);
        cloud5.makeVisible();
        
        cloud6 = new Circle();
        cloud6.changeColor("white");
        cloud6.moveHorizontal(15);
        cloud6.moveVertical(-15);
        cloud6.changeSize(40);
        cloud6.makeVisible();
        
        door = new Square();
        door.changeColor("black");
        door.moveHorizontal(60);
        door.moveVertical(110);
        door.changeSizeHeight(30);
        door.changeSizeWidth(70);
        door.makeVisible();
        
        knob = new Circle();
        knob.changeColor("yellow");
        knob.moveHorizontal(118);
        knob.moveVertical(130);
        knob.changeSize(10);
        knob.makeVisible();
        
        door = new Square();
        door.changeColor("black");
        door.moveHorizontal(120);
        door.moveVertical(0);
        door.changeSizeHeight(10);
        door.changeSizeWidth(70);
        door.makeVisible();
        
        branch = new Triangle();
        branch.changeColor("magenta");
        branch.changeSize(30, 10);
        branch.moveHorizontal(185);
        branch.moveVertical(155);
        branch.makeVisible();
        
        branch2 = new Triangle();
        branch2.changeColor("magenta");
        branch2.changeSize(30, 10);
        branch2.moveHorizontal(220);
        branch2.moveVertical(155);
        branch2.makeVisible();
        
        bush = new Square();
        bush.changeColor("green");
        bush.moveHorizontal(160);
        bush.moveVertical(100);
        bush.changeSizeHeight(70);
        bush.changeSizeWidth(40);
        bush.makeVisible();
        
        vertBar = new Square();
        vertBar.changeColor("black");
        vertBar.moveHorizontal(32);
        vertBar.moveVertical(100);
        vertBar.changeSizeHeight(5);
        vertBar.changeSizeWidth(30);
        vertBar.makeVisible();
        
        vertBar2 = new Square();
        vertBar2.changeColor("black");
        vertBar2.moveHorizontal(112);
        vertBar2.moveVertical(100);
        vertBar2.changeSizeHeight(5);
        vertBar2.changeSizeWidth(30);
        vertBar2.makeVisible();
        
        horizBar = new Square();
        horizBar.changeColor("black");
        horizBar.moveHorizontal(20);
        horizBar.moveVertical(112);
        horizBar.changeSizeHeight(30);
        horizBar.changeSizeWidth(5);
        horizBar.makeVisible();
        
        horizBar2 = new Square();
        horizBar2.changeColor("black");
        horizBar2.moveHorizontal(100);
        horizBar2.moveVertical(112);
        horizBar2.changeSizeHeight(30);
        horizBar2.changeSizeWidth(5);
        horizBar2.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
