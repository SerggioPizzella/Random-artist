/** by Victor Asanache, 1567683
 * and Serggio Pizzella, 1534246
 * as group 188
 */
import java.awt.Graphics;

//provides the data for the constructor to make the ore block
class OreBlock extends PixelConstructor {

    public OreBlock(int xPos, int yPos) {
        super(xPos, yPos);
    }

    @Override
    void draw(Graphics g) {
        data = new int[] {
            12, 10, 10, 10, 16, 16, 15, 15,
            17, 17, 15, 10, 16, 17, 17, 13,
            13, 17, 17, 13, 10, 10, 10, 12,
            13, 14, 14, 11, 17, 17, 10, 16,
            13, 13, 13, 17, 17, 10, 11, 16,
            14, 14, 13, 10, 10, 10, 17, 16,
            12, 17, 17, 10, 11, 12, 10, 12,
            10, 12, 11, 11, 10, 11, 11, 12
        };
        constructBlock(g);
    }
}

            
            
           