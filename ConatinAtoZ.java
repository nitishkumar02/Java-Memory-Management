public class StringTest {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 26; i++)
        {
            char ch = (char)('a'+i);
            stringBuilder = stringBuilder.append(ch);
        }
        System.out.println(stringBuilder);
    }

}
