public class Rectangle extends GeometricObject {
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        setLengthWidth(length, width);
    }

    public void setLengthWidth(float length, float width) {
        this.length = length;
        this.width = width;
        super.perimeter = (length + width) * 2;
        super.area = length * width;
    }

    @Override
    public void getInfo() {
        System.out.println("Прямоугольник имеет: длину = " + length + ", ширину = " + width + ", периметр = " + perimeter + ", площадь = " + area);
    }
}