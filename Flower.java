/** by Victor Asanache, 1567683
 * and Serggio Pizzella, 1534246
 * as group 188
 */
import java.awt.Graphics;

//provides the data for the constructor to make a flower
class Flower extends PixelConstructor {

    public Flower(int xPos, int yPos) {
        super(xPos, yPos);
    }
    
    @Override
    void draw(Graphics g) {
        data = new int[] {
            24, 24, 24, 27, 24, 27, 24, 24,
            24, 24, 24, 27, 27, 27, 24, 24,
            24, 24, 24, 27, 27, 27, 24, 24,
            24, 24, 24, 24, 27, 24, 24, 24,
            24, 24, 29, 24, 29, 24, 28, 24,
            24, 24, 28, 28, 29, 29, 24, 24,
            24, 24, 24, 29, 29, 28, 24, 24,
            24, 24, 24, 24, 29, 24, 24, 24
        };
        constructBlock(g);
    }
}
