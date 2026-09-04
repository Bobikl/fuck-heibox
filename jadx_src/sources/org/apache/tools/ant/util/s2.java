package org.apache.tools.ant.util;

/* JADX INFO: compiled from: UnicodeUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class s2 {
    private s2() {
    }

    public static StringBuffer a(char c10) {
        StringBuffer stringBuffer = new StringBuffer("u0000");
        String hexString = Integer.toHexString(c10);
        for (int i10 = 0; i10 < hexString.length(); i10++) {
            stringBuffer.setCharAt((stringBuffer.length() - hexString.length()) + i10, hexString.charAt(i10));
        }
        return stringBuffer;
    }
}
