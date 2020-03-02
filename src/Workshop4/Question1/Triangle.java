package Workshop4.Question1;

import Workshop4.Question2.Validation;

import java.util.Scanner;

public class Triangle {

    public static Scanner input = new Scanner(System.in);

    private static float length1;
    private static float length2;
    private static float length3;

    public Triangle() {}

    public Triangle(float length1, float length2, float length3){
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    public static Triangle inputData(){
        System.out.print("Please input length1: ");
        float length1 = Validation.checkInputFloat();
        System.out.print("Please input length1: ");
        float length2 = Validation.checkInputFloat();
        System.out.print("Please input length1: ");
        float length3 = Validation.checkInputFloat();
        Triangle tri = new Triangle(length1,length2,length3);
        return tri;
    }

    public static float caculatePerimeter(){
        float perimeter = length1 + length2 + length3;
        return perimeter;
    }

    public static float caculateArea(){
        float q = (length1+length2+length3)/2;
        float area = (float) Math.sqrt(q*(q-length1)*(q-length2)*(q-length3));
        return area;
    }

    public static void kindOf() {
        if (length1 < length2 + length3 && length2 < length1 + length3 && length1 < length2 + length3) {
            if (length1 * length1 == length2 * length2 + length3 * length3 || length2 * length2 == length1 * length1 + length3 * length3 || length3 * length3 == length1 * length1 + length2 * length2)
                System.out.printf("Day la tam giac vuong\n");
            else if (length1 == length2 && length2 == length3 && length3 == length1)
                System.out.printf("Day la tam giac deu");
            else if (length1 == length2 || length2 == length3 || length3 == length1)
                System.out.printf("Day la tam giac can\n");
            else if (length1 * length1 > length2 * length2 + length3 * length3 || length2 * length2 > length1 * length1 + length3 * length3 || length3 * length3 > length2 * length2 + length1 * length1)
                System.out.printf("Day la tam giac tu\n");
            else {
                System.out.printf("Day la tam giac nhon\n");
            }
        } else {
            System.out.printf("Ba canh length1,length2,length3 khong phai la ba canh cua mot tam giac");
        }
    }

    public static void display(){
        System.out.printf("Perimetere: %.4f\n", caculatePerimeter());
        System.out.printf("Area: %.4f\n",caculateArea());
    }
}
