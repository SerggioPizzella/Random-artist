/** by Victor Asanache, 1567683
 * and Serggio Pizzella, 1534246
 * as group 188
 */
import java.awt.Graphics;

//provides the data for the constructor to make the stone block
class StoneBlock extends PixelConstructor {

    public StoneBlock(int xPos, int yPos) {
        super(xPos, yPos);
    }

    @Override
    void draw(Graphics g) {
        data = new int[] {
            10, 12, 11, 11, 10, 11, 11, 12,
            12, 11, 11, 10, 11, 12, 10, 12,
            14, 14, 13, 10, 10, 10, 10, 16,
            13, 13, 13, 12, 12, 11, 11, 16,
            13, 12, 14, 11, 10, 11, 10, 16,
            13, 12, 14, 13, 10, 10, 10, 12,
            11, 15, 15, 10, 10, 16, 12, 13,
            12, 10, 10, 10, 16, 16, 15, 15
        };
        constructBlock(g);
    }
}