import java.awt.Graphics;
import java.awt.Color;

class Cloud extends Dingus {

    Cloud(int xPos, int yPos) {
        x = xPos;
        y = yPos;
    }
    
    @Override
    void draw(Graphics g) {
        int amount = 4 + random.nextInt(4);
        int radius;
        int variation;
        int xx = x;
        int yy = y;

        g.setColor(new Color(255, 255, 255, 210));
        
        radius = 40 + random.nextInt(61);
        variation = (int) Math.round(radius * 0.30);

        for (int i = 0; i < amount; i++) {
            radius = 40 + random.nextInt(61);

            g.fillOval(xx, yy , radius, radius);

            variation = (int) Math.round(radius * 0.25);
            xx += (int) Math.round(radius * 0.25) + random.nextInt(variation);
            yy = y - 20 + random.nextInt(41);
        }
    } 
}
