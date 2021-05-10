/** by Victor Asanache, 1567683
 * and Serggio Pizzella, 1534246
 * as group 188
 */
import java.awt.Graphics;

//provides the data for the constructor to make the dirt block
class DirtBlock extends PixelConstructor {

    public DirtBlock(int xPos, int yPos) {
        super(xPos, yPos);
    }

    @Override
    void draw(Graphics g) {
        data = new int[] {
            39, 40, 40, 39, 39, 40, 40, 39,
            40, 39, 39, 39, 40, 40, 39, 39,
            40, 39, 40, 39, 39, 39, 13, 39,
            39, 39, 13, 39, 39, 39, 40, 39,
            39, 40, 39, 40, 40, 39, 40, 40,
            39, 40, 39, 39, 39, 39, 40, 39,
            40, 39, 39, 39, 40, 13, 39, 39,
            39, 40, 40, 39, 40, 39, 39, 40
        };
        constructBlock(g);
    }
}