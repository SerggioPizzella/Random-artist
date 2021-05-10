/** by Victor Asanache, 1567683
 * and Serggio Pizzella, 1534246
 * as group 188
 */
import java.awt.Graphics;
import java.awt.Color;

class Sky extends Dingus {

    //creates a gradient sky
    @Override
    void draw(Graphics g) {
        double redScalar = 0.323;   //makes sure we reach the delta red values within the delta of the position
        double greenScalar = 0.125; //makes sure we reach the delta green values within the delta of the position
        double blueScalar = 0.368;  //makes sure we reach the delta blue values within the delta of the position
        int red;
        int green;
        int blue;

        for (int i = 0; i < 576; i++) {
            red = (int) Math.round(59 + i*redScalar);       //shifts the red value to the end goal based on how far it is on the screen
            green = (int) Math.round(170 - i*greenScalar);  //shifts the green value to the end goal based on how far it is on the screen
            blue = (int) Math.round(235 - i*blueScalar);    //shifts the blue value to the end goal based on how far it is on the screen
            g.setColor(new Color(red, green, blue));
            g.fillRect(0, i, 816, 1); //makes a one pixel line from left to right
        }
    }
}
