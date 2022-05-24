package com.hdvuv.May;

/**
 * Remove spaces in string, includes space, \t, \n, etc
 */
public class RemoveSpace {

    /**
     * Solution 3 is high efficiency, it remove space, tab(\t), enter (\r\n), but not effective with full-space
     */
    public static void main(String[] args) {
        String inputText = "  abc  de gh j \t\n\r";
        System.out.println("'" + RemoveSpace_001(inputText) + "'");
        System.out.println("'" + RemoveSpace_002(inputText) + "'");
        System.out.println("'" + RemoveSpace_003(inputText) + "'");
    }

    /**
     * Using while combine with replace
     */
    private static String RemoveSpace_001(String input) {
        while (input.contains(" ") || input.contains("  ")) {
            input = input.replace(" ", "").replace("    ", "");
        }
        return input;
    }

    /**
     * Using replaceAll() with regex = " "
     */
    private static String RemoveSpace_002(String input) {
        return input.replaceAll(" ", "").replaceAll("\t", "");
    }

    /**
     * Using replaceAll() with regex = "\\s"
     * Note: "\\s" same result "\\s+"
     */
    private static String RemoveSpace_003(String input) {
        return input.replaceAll("\\s", "");
    }
}
