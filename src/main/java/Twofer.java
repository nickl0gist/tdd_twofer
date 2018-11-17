class Twofer {
    String twofer(String name) {
        String template = "One for %s, one for me.";
        String actual_name = "you";
        if (name != null){
            actual_name = name;
        }
        return String.format(template, actual_name);
    }
}
