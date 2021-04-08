package generic;

// import java.util.ArrayList;

// generic class adalah kelas yang bisa diisi dengan berbagai tipe data
// E: element, K: key. T: tipe data
public class CobaGeneric<T> {
    private T t;
    
    public T getT() {
        return t;
    }
    
    public void setT(T t) {
        this.t = t;
    }
    
    public static void main(String[] args) {
        CobaGeneric<Integer> integer = new CobaGeneric<>();

        integer.setT(10);

        System.out.println(integer.getT());
    }
}
