/** by Victor Asanache, 1567683
 * and Serggio Pizzella, 1534246
 * as group 188
 */
import java.awt.Graphics;

//provides the data for the constructor to make the leaves block
class LeavesBlock extends PixelConstructor {

    public LeavesBlock(int xPos, int yPos, int z) {
        super(xPos, yPos, z);
    }

    @Override
    void draw(Graphics g) {
        data = new int[] {
            25, 24, 24, 25, 24, 24, 24, 26,
            24, 26, 26, 25, 26, 24, 25, 26,
            24, 24, 26, 24, 26, 26, 25, 25,
            25, 25, 25, 26, 24, 26, 24, 26,
            26, 24, 25, 24, 24, 24, 24, 26,
            24, 26, 26, 24, 26, 25, 26, 26,
            24, 26, 24, 25, 25, 25, 24, 25,
            25, 24, 24, 25, 26, 26, 24, 25
        };
        constructBlock(g);
    }
}