/*
 * part of HA Random artist
 * TO BE COMPLETED
 *
 * @author huub
 * @author kees
 *
 * by Victor Asanache, 1567683
 * and Serggio Pizzella, 1534246
 * as group 188
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

public class Painting extends JPanel implements ActionListener {

   /*---- Randomness ----*/
    /** you can change the variable SEED if you like
     *  the same program with the same SEED will generate exactly the same sequence of pictures
     */
    final static long SEED = 37; // seed for the random number generator; any number works

    /** do not change the following two lines **/
    final static Random random = new Random( SEED ); // random generator to be used by all classes
    int numberOfRegenerates = 0;

   /*---- Screenshots ----
    * do not change
    */
    char current = '0';
    String filename = "randomshot_"; // prefix
    
   /*---- Dinguses ----*/
    ArrayList<Dingus> canvas = new ArrayList<Dingus>();
    int[] heights = new int[17]; //stores the y value at which the floor starts
    public void DingusArray() {
        int forrest = 1 + random.nextInt(4);    //amount of trees
        int flowers = 3 + random.nextInt(10);   //amount of flowers
        Flower[] coolFlower = new Flower[17];
        Sky sky = new Sky();

        canvas.add(sky);    //adds the sky
        createClouds(5);    //creates 5 clouds
        createBirds(5);     //generates 5 birds
        createSurface();    //generates the height of the floor
        createDogs(3);      //generates 3 dogs
        createSoil();       //generates the terrain under the floor

        //generates the flowers at random positions on the floor
        for (int i = 0; i < flowers; i++) {
            int xFlower = random.nextInt(17);
            int yFlower = heights[xFlower] + 1;
            coolFlower[i] = new Flower(xFlower, yFlower);
            canvas.add(coolFlower[i]);
        }

        //generates the trees at random positions on the floor
        for (int i = 0; i < forrest; i++) {
            int xTree = random.nextInt(17);
            int yTree = heights[xTree] + 1;
            createTree(xTree, yTree);
        }
    }

    //generates the clouds at random positions in the sky
    void createClouds(int amount) {
        Cloud[] clouds = new Cloud[amount];
        int xPos;
        int yPos;

        for (int i = 0; i < amount; i++) {
            xPos = random.nextInt(816);
            yPos = 180 - random.nextInt(181);

            clouds[i] = new Cloud(xPos, yPos);
            canvas.add(clouds[i]);
        }
    }

    //generates birds and adds them to the canvas
    void createBirds(int amount) {
        FlyingBird[] coolBird = new FlyingBird[amount];
        FlyingBird2[] coolBird2 = new FlyingBird2[amount];
        int xPos;
        int yPos;
        boolean flyingRight;

        for (int i = 0; i < amount; i++) {
            flyingRight = random.nextBoolean(); //determens wether the bird flies to the right or left
            xPos = random.nextInt(17);
            yPos = 8 + random.nextInt(3);

            if (flyingRight) {
                coolBird[i] = new FlyingBird(xPos, yPos); //makes a bird flying to the right
                canvas.add(coolBird[i]);
            } else {
                coolBird2[i] = new FlyingBird2(xPos, yPos); //makes a bird flying to the left
                canvas.add(coolBird2[i]);
            }
            
        }
    }

    //generates the height of the floor level and creates it
    void createSurface() {
        GrassBlock[] coolGrass = new GrassBlock[17];
        int variation;
        double amplitude = 2;    //determines the amplitude of the Sin wave
        double aFrequency = 0.5;    //determines the angular frequency of the Sin wave
        double xOffset = random.nextInt(50); //determines the horizontal shift of the Sin wave
        double yOffset = 0; //determines the vertical shift of the Sin wave


        for (int i = 0; i < 17; i++) {
            variation = (int) Math.round(amplitude*Math.sin(aFrequency*(i-xOffset)+yOffset)); //calculates the variation with the Sin wave
            heights[i] = 4 + variation; //set the height of the floor
        }

        //generates the floor at the generated heights
        for (int i = 0; i < coolGrass.length; i++) {
            coolGrass[0] = new GrassBlock(i, heights[i]);
            canvas.add(coolGrass[0]);
        }
    }

    //generates a tree
    void createTree(int xPos, int yPos){
        int variation = random.nextInt(4); //determens the color of the leaves on this tree
        int height = 3 + random.nextInt(3);//determens the hight of the tree
        int x = xPos; //x coordinate of the tree's trunk
        int y = yPos; //y coordinate of the bottom trunk block

        TreeTrunkBlock[] coolTrunk = new TreeTrunkBlock[height];
        LeavesBlock[] leaves = new LeavesBlock[9];

        //these are the position of the leaves relative to the trunk and height of the tree
        leaves[0] = new LeavesBlock(x - 2,  y + height - 2, variation);
        leaves[1] = new LeavesBlock(x - 1,  y + height - 2, variation);
        leaves[2] = new LeavesBlock(x,      y + height - 2, variation);
        leaves[3] = new LeavesBlock(x + 1,  y + height - 2, variation);
        leaves[4] = new LeavesBlock(x + 2,  y + height - 2, variation);
        leaves[5] = new LeavesBlock(x - 1,  y + height - 1, variation);
        leaves[6] = new LeavesBlock(x,      y + height - 1, variation);
        leaves[7] = new LeavesBlock(x + 1,  y + height - 1, variation);
        leaves[8] = new LeavesBlock(x,      y + height, variation);

        //generates the trunk of the tree
        for (int i = 0; i < height; i++) {
            coolTrunk[i] = new TreeTrunkBlock(x, y + i);
            canvas.add(coolTrunk[i]);
        }

        //generates the leaves of the tree
        for (int i = 0; i < leaves.length; i++) {
            canvas.add(leaves[i]);
        }
    }

    //generates a given amount of dogs on the surface of the floor
    void createDogs(int amount) {
        Dog[] dogs = new Dog[amount];
        int xDog; //x coordinate of the dog
        int yDog; //y coordinate of the dog
        
        for (int i = 0; i < amount; i++) {
            xDog = random.nextInt(17);
            yDog = heights[xDog] + 1;
            dogs[i] = new Dog(xDog, yDog);
            canvas.add(dogs[i]);
        }
    }

    //generates the ground underneath the floor
    void createSoil() {
        DirtBlock[] coolDirt = new DirtBlock[17];
        StoneBlock[] coolStone = new StoneBlock[17];
        OreBlock[] coolOre = new OreBlock[17];

        //generates the ground collum by collum, from the bottom up, until the floor
        for (int col = 0; col < 17; col++) {
            for (int row = 0; row < heights[col]; row++) {
                int blockType = random.nextInt(10); //control the spawn rate of dirt, stone and ore

                if (blockType < 4) { //spawn rate of dirt is 30%
                    coolDirt[col] = new DirtBlock(col, row);
                    canvas.add(coolDirt[col]);
                } else if (blockType >= 4 && blockType < 9 ) { //spawn rate of stone is 50%
                    coolStone[col] = new StoneBlock(col, row);
                    canvas.add(coolStone[col]);
                } else if (blockType >= 9) { //spawn rate of ore is 20%
                    coolOre[col] = new OreBlock(col, row);
                    canvas.add(coolOre[col]);
                } 
            }
            
        }
    }
    //...

    public Painting() {
        setPreferredSize(new Dimension(816, 576)); // make panel 816 by 576 pixels.
        //...
    }

    @Override
    protected void paintComponent(Graphics g) { // draw all your shapes
        super.paintComponent(g);     // clears the panel
        // draw all shapes
        for (Dingus dingus : canvas) {
            dingus.draw(g);
        }
        // ...
    }

    /**
     * reaction to button press
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if ( "Regenerate".equals(e.getActionCommand()) ) {
            regenerate();
            repaint();
        } else { // screenshot
            saveScreenshot( this, filename+current++ ); // ++ to show of compact code :-)
        }
    }

    void regenerate() {
        numberOfRegenerates++; // do not change
        
        // clear the shapes list
        canvas.clear();
        // ...

        // create random shapes
        // ...
        DingusArray();
    }

    /** 
     * saves a screenshot of a Component on disk
     *  overides existing files
     *
     * @param component - Component to be saved
     * @param name - filename of the screenshot, followed by a sequence number
     * 
     * do not change
     */
    void saveScreenshot(Component component, String name) {
        String randomInfo = ""+SEED+"+"+ (numberOfRegenerates-1); //minus 1 because the initial picture should not count
        System.out.println( SwingUtilities.isEventDispatchThread() );
        BufferedImage image =
            new BufferedImage(
                              component.getWidth(),
                              component.getHeight(),
                              BufferedImage.TYPE_INT_RGB
                             );
        // call the Component's paint method, using
        // the Graphics object of the image.
        Graphics graphics = image.getGraphics();
        component.paint( graphics ); // alternately use .printAll(..)
        graphics.drawString(randomInfo, 0, component.getHeight());
        
        try {
            ImageIO.write(image, "PNG", new File(name+".png"));
            System.out.println( "Saved screenshot as "+ name );
        } catch( IOException e ) {
            System.out.println( "Saving screenshot failed: "+e );
        }
    }
    
}