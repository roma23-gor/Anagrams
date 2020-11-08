public class anagrams {
    String value;
    anagrams(String value) {
        this.value = value;
    }
    public String solve() {
        String[] letters = new String[value.length()];
        for (int i = 0; i < value.length(); i++) {
            letters[letters.length - i - 1] = value.substring(i, i + 1);
        }
        String solved = "";
        for (int i = 0; i < value.length(); i++) {
            solved += letters[i];
        }
        return solved;
    }
}
