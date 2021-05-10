/** by Victor Asanache, 1567683
 * and Serggio Pizzella, 1534246
 * as group 188
 */
import java.awt.Graphics;

//provides the data for the constructor to make the grass block
class GrassBlock extends PixelConstructor {

    public GrassBlock(int xPos, int yPos) {
        super(xPos, yPos);
    }

    @Override
    void draw(Graphics g) {
        data = new int[] {
            42, 41, 41, 42, 42, 41, 41, 42,
            41, 42, 42, 39, 41, 41, 42, 42,
            41, 39, 41, 39, 42, 39, 42, 39,
            39, 39, 41, 39, 39, 39, 41, 39,
            39, 40, 39, 40, 40, 39, 40, 40,
            39, 40, 39, 39, 39, 39, 40, 39,
            40, 39, 39, 39, 40, 39, 39, 39,
            39, 40, 40, 39, 40, 39, 39, 40
        };
        constructBlock(g);
    }
}