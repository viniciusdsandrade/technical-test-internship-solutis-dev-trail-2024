public class Test5 {
    int ini = 0, fim = 25;

    void print() {
        System.out.println(ini + fim);
    }

    {
        ini = fim % 7;
        fim = ini * 3;
    }

    Test5(int a, int b) {
        ini += a;
        fim += b;
    }

    {
        ini /= 2;
        fim += 10;
    }

    public static void main(String[] args) {
        new Test5(4, -4).print();
    }
}
