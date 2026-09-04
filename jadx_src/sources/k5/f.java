package k5;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f124451a = Pattern.compile("([\t\r\n])+");

    public static int a(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 = (i10 * 31) + c10;
        }
        return i10;
    }

    public static boolean b(String str) {
        return str == null || str.length() <= 0;
    }
}
