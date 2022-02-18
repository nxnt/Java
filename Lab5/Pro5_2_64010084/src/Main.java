public class Main {
    public static void main(String[] args) throws Exception {
        
        RegularPolygon polygon1 = new RegularPolygon();
        System.out.println("Polygon 1 : ");
		System.out.println(" - Perimeter : " + polygon1.getPerimeter());
		System.out.println(" - Area : " + polygon1.getArea());

        RegularPolygon polygon2 = new RegularPolygon(6,4);
        System.out.println("Polygon 2 : ");
		System.out.println(" - Perimeter : " + polygon2.getPerimeter());
		System.out.println(" - Area : " + polygon2.getArea());

        RegularPolygon polygon3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("Polygon 3 : ");
		System.out.println(" - Perimeter : " + polygon3.getPerimeter());
		System.out.println(" - Area : " + polygon3.getArea());
    }
}
