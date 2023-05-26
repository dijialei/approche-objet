package string;

public class TestString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder aaa = sb.append("aaa");
        aaa.append("bbb");
        System.out.println(sb);
    }
}
