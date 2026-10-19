class StripIndent{
    public static void main(String[] args) {
        String test = "  Apple    \n    B   E\nC  f";
        // System.out.println(test);
        System.out.println(test.stripIndent());
    }
}