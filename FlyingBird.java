/** by Victor Asanache, 1567683
 * and Serggio Pizzella, 1534246
 * as group 188
 */
import java.awt.Graphics;

//provides the data for the constructor to make a green bird
class FlyingBird extends PixelConstructor {

    public FlyingBird(int xPos, int yPos) {
        super(xPos, yPos);
    }

    @Override
    void draw(Graphics g) {
        data = new int[] {
            24, 24, 24, 24, 24, 24, 24, 24,
            24, 24, 24, 24, 35, 35, 35, 24,
            34, 34, 34, 24, 35, 32, 35, 24,
            24, 35, 34, 34, 35, 35, 36, 36,
            24, 35, 35, 34, 31, 31, 24, 24,
            24, 24, 34, 34, 35, 35, 35, 24,
            35, 35, 35, 35, 35, 35, 24, 24,
            24, 35, 36, 36, 35, 24, 24, 24
        };
        constructBlock(g);
    }
}
