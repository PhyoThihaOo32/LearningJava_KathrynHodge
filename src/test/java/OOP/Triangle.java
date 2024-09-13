package OOP;

public class Triangle {

    static int numOfSides = 3;

    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;


    public Triangle(double base, double height,
                    double sideLenOne, double sideLenTwo,
                    double getSideLenThree) {

            this.base = base;
            this.height = height;
            this.sideLenOne = sideLenOne;
            this.sideLenTwo = sideLenTwo;
            this.sideLenThree = getSideLenThree;


    }

    public double findArea(){

        return ( this.base * this.height ) /2;
    }

    public double findPerimeter(){

        return (this.sideLenOne+this.sideLenTwo+this.sideLenThree);
    }



}
