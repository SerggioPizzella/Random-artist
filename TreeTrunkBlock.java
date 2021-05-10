/** by Victor Asanache, 1567683
 * and Serggio Pizzella, 1534246
 * as group 188
 */
import java.awt.Graphics;

//provides the data for the constructor to make the tree trunk block
class TreeTrunkBlock extends PixelConstructor {

    public TreeTrunkBlock(int xPos, int yPos) {
        super(xPos, yPos);
    }

    @Override
    void draw(Graphics g) {
        data = new int[] {
            22, 21, 23, 23, 20, 22, 23, 22,
            22, 22, 23, 21, 20, 23, 23, 21,
            23, 23, 22, 21, 20, 23, 22, 21,
            21, 23, 20, 21, 21, 22, 22, 23,
            21, 22, 20, 22, 21, 22, 20, 21,
            23, 22, 20, 22, 20, 21, 20, 20,
            23, 22, 20, 22, 22, 20, 21, 20,
            21, 23, 21, 23, 22, 20, 21, 20
        };
        constructBlock(g);
    }
}