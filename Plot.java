/*
 * Class: CMSC203
 * Instructor: Professor Kuijt
 * Description: plot creation
 * Due: 10/22/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Abel Mintesnot
*/

public class Plot {
	private int x;
	private int y;
    private int width;
	private int depth;
    
    public Plot() {
        x = 0;
        y = 0;
        depth = 1;
        width = 1;
    }
    public Plot(int x, int y, int w, int d) {
        this.x = x;
        this.y = y;
        depth = d;
        width = w;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setDepth(int d) {
        depth = d;
    }
    public void setWidth(int w) {
        width = w;
    }
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getDepth() {
        return depth;
    }
    public int getWidth() {
        return width;
    }
    
    public boolean overlaps(Plot otherPlot) {

        int thisX1 = this.x;
        int thisY1 = this.y;
        int thisX2 = this.x + this.width;
        int thisY2 = this.y + this.depth;

        int otherX1 = otherPlot.x;
        int otherY1 = otherPlot.y;
        int otherX2 = otherPlot.x + otherPlot.width;
        int otherY2 = otherPlot.y + otherPlot.depth;

        boolean doesOverlap = thisX1 < otherX2 && thisX2 > otherX1 &&
                thisY1 < otherY2 && thisY2 > otherY1;

        return doesOverlap;
    }
    public boolean encompasses(Plot otherPlot) {
       
        int thisX1 = this.x;
        int thisY1 = this.y;
        int thisX2 = this.x + this.width;
        int thisY2 = this.y + this.depth;

        int otherX1 = otherPlot.x;
        int otherY1 = otherPlot.y;
        int otherX2 = otherPlot.x + otherPlot.width;
        int otherY2 = otherPlot.y + otherPlot.depth;

        boolean containsInclusive = thisX1 <= otherX1 && thisY1 <= otherY1 &&
                thisX2 >= otherX2 && thisY2 >= otherY2;

        return containsInclusive;
    }
    public String toString() {
        return String.format("[%d],[%d],[%d],[%d]", x, y, width, depth);
    }
}