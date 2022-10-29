public class Circle extends GeometricObject {
    private float radius;

    public Circle(float radius){
        setRadius(radius);
    }

    public void setRadius(float radius){
        this.radius = radius;
        super.perimeter = 2 * radius * (float) Math.PI;
        super.area = radius * radius * (float) Math.PI;
    }

    @Override
    public void getInfo() {
        System.out.println("Круг имеет: радиус = " + radius + ", периметр = " + perimeter + ", площадь = " + area);
    }
}