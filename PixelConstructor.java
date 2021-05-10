/** by Victor Asanache, 1567683
 * and Serggio Pizzella, 1534246
 * as group 188
 */
import java.awt.Graphics;
import java.awt.Color;
/**
 * The canvas is devided in a grid, in each section of the grid
 * we can fill in a block.
 */
public class PixelConstructor extends Dingus {
    int blockSize = 48; //determines the size of the block in pixels
    int blockSubSize = 6; // determines the size of the tiny block(Sub Pixels) in a full block
    int[] data;
    int variation;

    //initializes a block at a position in the grid
    //and takes a variation input for blocks that need to share features
    public PixelConstructor(int xPos, int yPos, int vari) {
        x = xPos*blockSize;
        y = 528 - yPos*blockSize;
        variation = vari;
    }

    
    //initializes a block at a position in the grid
    public PixelConstructor(int xPos, int yPos) {
        x = xPos*blockSize;
        y = 576 - yPos*blockSize;
    }

    public PixelConstructor() {

    }
    
    //We declare all the colors that the blocks can be made of
    Color none = new Color(0, 0, 0, 0);

    //Grass block
    Color darkBrown = new Color(101, 67, 33);
    Color lightBrown = new Color(151, 104, 62);
    Color lightGreen = new Color(109, 181, 2);
    Color darkGreen = new Color(0, 98, 0);
    
    //Stone and Ore
    Color grey1 = new Color(187, 187, 187);
    Color grey2 = new Color(156, 156, 156);
    Color grey3 = new Color(116, 116, 116);
    Color grey4 = new Color(140, 140, 140);
    Color grey5 = new Color(167, 167, 167);
    Color grey6 = new Color(124, 124, 124);
    Color grey7 = new Color(148, 148, 148);
    
    //Ores
    Color cole = new Color(29, 27, 28);
    Color iron = new Color(193, 159, 147);
    Color gold = new Color(226, 198, 76);
    Color diamond = new Color(120, 218, 242);
    Color redstone = new Color(193, 54, 54);
    Color[] ores = new Color[] {cole, iron, gold, diamond, redstone};
    
    //Tree trunks
    Color brown1 = new Color(153, 121, 74);
    Color brown2 = new Color(103, 85, 54);
    Color brown3 = new Color(66, 54, 32);
    Color brown4 = new Color(58, 45, 26);
    
    //Tree leaves
    Color green1 = new Color(72, 99, 40);
    Color green2 = new Color(54, 71, 30);
    Color red1 = new Color(181, 53, 73);
    Color red2 = new Color(194, 43, 53);
    Color yellow1 = new Color(212, 168, 40);
    Color yellow2 = new Color(218, 158, 32);
    Color orange1 = new Color(192, 95, 31);
    Color orange2 = new Color(150, 64, 11);
    Color[] leavecolor1 = new Color[] {green1, red1, yellow1, orange1};
    Color[] leavecolor2 = new Color[] {green2, red2, yellow2, orange2};

    //Flowers
    Color greenflower1 = new Color(54, 107, 2);
    Color greenflower2 = new Color(134, 194, 74);
    Color lightpurple = new Color(185, 192, 235);
    Color pink = new Color(235, 185, 228);
    Color[] flowercolor = new Color[] {red1, lightpurple, yellow1, orange1, pink};

    //Dog
    Color orange = new Color(228, 92, 16);
    Color black = new Color(0, 0, 0);
    Color white = new Color(225, 225, 225);
    Color yellow = new Color(249, 216, 123);

    //Bird 
    Color darkgreen = new Color(1, 101, 2);
    Color lightgreen = new Color(0, 168, 0);
    Color yellowbird = new Color(250, 181, 9);
    Color darkred = new Color(146, 43, 53);
    Color lightred = new Color(211, 43, 53);

    //Contrucs the block based on the data provided in an array
    void constructBlock(Graphics g) {
        int xx = x; //x position of the Sub Pixel in the block
        int yy = y; //y position of the Sub Pixel in the block
        int fColor = random.nextInt(5); //determines the color of a flower and the ore, from the possible colors

        //generates the block, Sub Pixel by Sub Pixel from left to right, top to bottom
        for (int i = 0; i < data.length; i++) {
            //resets the Sub x position if we reach the end of the block
            //and moves on to the next line
            if (xx == x + blockSize) {
                yy += blockSubSize;
                xx = x;
            }
            //makes the Sub Pixel corresponding to the data in the array
            if (data[i] == 10) {
                g.setColor(grey1);
            } else if (data[i] == 11) {
                g.setColor(grey2);
            } else if (data[i] == 12) {
                g.setColor(grey3);
            } else if (data[i] == 13) {
                g.setColor(grey4);
            } else if (data[i] == 14) {
                g.setColor(grey5);
            } else if (data[i] == 15) {
                g.setColor(grey6);
            } else if (data[i] == 16) {
                g.setColor(grey7);
            } else if (data[i] == 17) {
                g.setColor(ores[fColor]);
            } else if (data[i] == 20) {
                g.setColor(brown1);
            } else if (data[i] == 21) {
                g.setColor(brown2);
            } else if (data[i] == 22) {
                g.setColor(brown3);
            } else if (data[i] == 23) {
                g.setColor(brown4);
            } else if (data[i] == 24) {
                g.setColor(none);
            } else if (data[i] == 25) {
                g.setColor(leavecolor1[variation]);
            } else if (data[i] == 26) {
                g.setColor(leavecolor2[variation]);
            } else if (data[i] == 27) {
                g.setColor(flowercolor[fColor]);
            } else if (data[i] == 28) {
                g.setColor(greenflower1);
            } else if (data[i] == 29) {
                g.setColor(greenflower2);
            } else if (data[i] == 30) {
                g.setColor(orange);
            } else if (data[i] == 31) {
                g.setColor(black);
            } else if (data[i] == 32) {
                g.setColor(white);
            } else if (data[i] == 33) {
                g.setColor(yellow);
            } else if (data[i] == 34) {
                g.setColor(darkgreen);
            } else if (data[i] == 35) {
                g.setColor(lightgreen);
            } else if (data[i] == 36) {
                g.setColor(yellowbird);
            } else if (data[i] == 37) {
                g.setColor(darkred);
            } else if (data[i] == 38) {
                g.setColor(lightred);
            } else if (data[i] == 39) {
                g.setColor(darkBrown);
            } else if (data[i] == 40) {
                g.setColor(lightBrown);
            } else if (data[i] == 41) {
                g.setColor(darkGreen);
            } else if (data[i] == 42) {
                g.setColor(lightGreen);
            }
            g.fillRect(xx, yy, blockSubSize, blockSubSize);
            xx += blockSubSize;
        }
    }

    @Override
    void draw(Graphics g) {
        constructBlock(g);
    } 
    
}
