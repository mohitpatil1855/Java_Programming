
interface circle {

    float pi = 3.14f;

    float area(float radius);

    float circumference(float radius);
}

class Demo implements circle {

    public float area(float radius) {
        float fAns = 0.0f;
        fAns = circle.pi * radius * radius;
        System.out.println(fAns);
        return 0;
    }

    public float circumference(float radius) {
        float fAns = 0.0f;
        fAns = 2 * circle.pi * radius;
        System.out.println(fAns);
        return 0;
    }

}

class InterfaceDemo1 {

    public static void main(String A[]) {

        Demo dobj = new Demo();

        dobj.area(11);
        dobj.circumference(22);

    }
}
