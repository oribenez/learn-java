public class Point
{
    private int _x, _y;
    // constructors
    public Point(int x, int y) {_x = x; _y = y; }
    public Point(Point p) {_x = p._x; _y = p._y; }
    // methods
    public int getX() {return _x; }
    public int getY() {return _y; }
    public void setX (int x) {_x = x; }
    public void setY (int y) {_y = y; }
}