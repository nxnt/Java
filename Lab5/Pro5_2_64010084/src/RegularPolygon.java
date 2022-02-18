public class RegularPolygon {
    
    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon() {

        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }
    
    RegularPolygon(int n, double side) {

        this.n = n;
        this.side = side;
    }
    
    RegularPolygon(int n, double side, double x, double y) {

		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

    double getPerimeter() {

        return this.n * this.side;
    }

    double getArea() {

        return (this.n * this.side * this.side) / (4 * Math.tan(Math.PI / this.n));
    }


}
