import java.awt.Graphics;

/** by Victor Asanache, 1567683
 * and Serggio Pizzella, 1534246
 * as group 188
 */

//provides the data for the constructor to make a red bird
class FlyingBird2 extends PixelConstructor {

    public FlyingBird2(int xPos, int yPos) {
        super(xPos, yPos);
    }

    @Override
    void draw(Graphics g) {
        data = new int[] {
            24, 24, 24, 24, 24, 24, 24, 24,
            24, 38, 38, 38, 24, 24, 24, 24,
            24, 38, 32, 38, 24, 37, 37, 37,
            36, 36, 38, 38, 37, 37, 38, 24,
            24, 24, 31, 31, 37, 38, 38, 24,
            24, 38, 38, 38, 37, 37, 24, 24,
            24, 24, 38, 38, 38, 38, 38, 38,
            24, 24, 24, 38, 36, 36, 38, 24
        };
        constructBlock(g);
    }
}