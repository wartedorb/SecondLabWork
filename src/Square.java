public class Square extends GeometricObject {
    private float side;


    public Square(float side){
        setSide(side);
    }

    public void setSide(float side) {
        this.side = side;
        super.perimeter = side * 4;
        super.area = side * side;
    }
    @Override
    public void getInfo() {
        System.out.println("Квадрат имеет: сторону = " + side + ", периметр = " + perimeter + ", площадь = " + area);
    }
}