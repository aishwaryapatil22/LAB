package assignment;
class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        length = 0;
        breadth = 0;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }



    public static void main(String[] args) {
        Rectangle rect = new Rectangle(20, 40);
        System.out.println("Area = " + rect.getArea());

        rect.setLength(30);
        rect.setBreadth(30);
        System.out.println("New area = " + rect.getArea());
    }
}