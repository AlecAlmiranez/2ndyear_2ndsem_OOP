public class NumberWords extends NumberRepresentation {
    private static final String[] ONES = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    private static final String[] TEENS = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen" };
    private static final String[] TENS = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
            "Ninety" };

    @Override
    public String convertNumber(int num) {
        if (num == 0) {
            return "Zero";
        }
        String words = "";
        if (num < 10) {
            words = ONES[num];
        } else if (num < 20) {
            words = TEENS[num - 10];
        } else if (num < 100) {
            words = TENS[num / 10] + " " + ONES[num % 10];
        } else if (num < 1000) {
            words = ONES[num / 100] + " Hundred " + convertNumber(num % 100);
        } else if (num < 1000000) {
            words = convertNumber(num / 1000) + " Thousand " + convertNumber(num % 1000);
        } else if (num < 1000000000) {
            words = convertNumber(num / 1000000) + " Million " + convertNumber(num % 1000000);
        } else {
            words = convertNumber(num / 1000000000) + " Billion " + convertNumber(num % 1000000000);
        }

        return words.trim();
    }
}
