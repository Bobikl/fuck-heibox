package org.apache.tools.ant.taskdefs.optional.jsp;

import com.meituan.robust.Constants;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import org.apache.tools.ant.util.j2;

/* JADX INFO: compiled from: JspNameMangler.java */
/* JADX INFO: loaded from: classes5.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f135272a = {"assert", "abstract", "boolean", "break", Constants.BYTE, "case", "catch", Constants.CHAR, "class", "const", "continue", "default", "do", Constants.DOUBLE, "else", "extends", "final", "finally", "float", "for", "goto", RXScreenCaptureService.KEY_IFRAMERATE, "implements", "import", "instanceof", Constants.INT, "interface", Constants.LONG, "native", "new", "package", "private", "protected", "public", "return", Constants.SHORT, "static", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"};

    private static String c(char c10) {
        if (c10 == File.separatorChar) {
            c10 = IOUtils.DIR_SEPARATOR_UNIX;
        }
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

    private String d(File file) {
        String strE = e(file);
        for (String str : f135272a) {
            if (strE.equals(str)) {
                strE = strE + "%";
                break;
            }
        }
        StringBuilder sb2 = new StringBuilder(strE.length());
        char cCharAt = strE.charAt(0);
        if (Character.isJavaIdentifierStart(cCharAt)) {
            sb2.append(cCharAt);
        } else {
            sb2.append(c(cCharAt));
        }
        for (char c10 : strE.substring(1).toCharArray()) {
            if (Character.isJavaIdentifierPart(c10)) {
                sb2.append(c10);
            } else {
                sb2.append(c(c10));
            }
        }
        return sb2.toString();
    }

    private String e(File file) {
        return j2.i(file.getName(), ".jsp");
    }

    @Override // org.apache.tools.ant.taskdefs.optional.jsp.c
    public String a(File file) {
        return d(file) + ".java";
    }

    @Override // org.apache.tools.ant.taskdefs.optional.jsp.c
    public String b(String str) {
        return null;
    }
}
