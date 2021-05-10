/** by Victor Asanache, 1567683
 * and Serggio Pizzella, 1534246
 * as group 188
 */
import java.awt.Graphics;

//provides the data for the constructor to make a dog
class Dog extends PixelConstructor {

    public Dog(int xPos, int yPos) {
        super(xPos, yPos);
    }
    
    @Override
    void draw(Graphics g) {
        data = new int[] {
            24, 31, 31, 30, 30, 31, 31, 24,
            31, 31, 30, 30, 30, 30, 31, 31,
            31, 30, 31, 30, 30, 31, 30, 31,
            31, 30, 32, 31, 31, 32, 30, 31,
            31, 31, 32, 32, 32, 32, 31, 31,
            31, 31, 30, 30, 30, 30, 31, 31,
            31, 30, 30, 33, 33, 30, 30, 31,
            24, 30, 30, 33, 33, 30, 30, 24
        };
        constructBlock(g);
    }
}