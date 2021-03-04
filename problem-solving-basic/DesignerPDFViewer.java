package com.hackerrank;

class DesignerPDFViewer {

    private static int designerPdfViewer(int[] h, String word) {
        int i = 0, len = word.length(), max = 0;
        while (i < len) {
            if (h[(int) word.charAt(i) - 97] > max)
                max = h[(int) word.charAt(i) - 97];
            i++;
        }
        return max * len;
    }
}
