package info.savaged;

public class Rot13 {
    public static String encode(String value) {
        if (value == null || value.length() == 0) return "";
        StringBuilder encoded = new StringBuilder();
        for (char c : value.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                c = (char) ((c - 'A' + 13) % 26 + 'A');
            } else if ('a' <= c && c <= 'z') {
                c = (char) ((c - 'a' + 13) % 26 + 'a');
            }
            encoded.append(c);
        }
        return encoded.toString();
    }
}
