package org.apache.tools.ant.taskdefs.optional.jsp;

import java.io.File;

/* JADX INFO: compiled from: Jasper41Mangler.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements c {
    private static String c(char c10) {
        String hexString = Integer.toHexString(c10);
        int length = 5 - hexString.length();
        char[] cArr = new char[6];
        int i10 = 0;
        cArr[0] = '_';
        for (int i11 = 1; i11 <= length; i11++) {
            cArr[i11] = '0';
        }
        int i12 = length + 1;
        while (i12 < 6) {
            cArr[i12] = hexString.charAt(i10);
            i12++;
            i10++;
        }
        return new String(cArr);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.jsp.c
    public String a(File file) {
        String absolutePath = file.getAbsolutePath();
        int iLastIndexOf = absolutePath.lastIndexOf(File.separatorChar) + 1;
        StringBuilder sb2 = new StringBuilder(absolutePath.length() - iLastIndexOf);
        if (!Character.isJavaIdentifierStart(absolutePath.charAt(iLastIndexOf)) || absolutePath.charAt(iLastIndexOf) == '_') {
            sb2.append('_');
        }
        for (char c10 : absolutePath.substring(iLastIndexOf).toCharArray()) {
            if (Character.isJavaIdentifierPart(c10)) {
                sb2.append(c10);
            } else if (c10 == '.') {
                sb2.append('_');
            } else {
                sb2.append(c(c10));
            }
        }
        return sb2.toString();
    }

    @Override // org.apache.tools.ant.taskdefs.optional.jsp.c
    public String b(String str) {
        return null;
    }
}
