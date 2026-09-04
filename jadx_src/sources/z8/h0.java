package z8;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f141922a = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f141922a.matcher(str);
        int iEnd = 0;
        StringBuilder sb2 = null;
        while (matcher.find()) {
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            int iStart = matcher.start();
            int i10 = iStart;
            while (i10 >= 0 && str.charAt(i10) == '\\') {
                i10--;
            }
            if ((iStart - i10) % 2 != 0) {
                int i11 = Integer.parseInt(matcher.group().substring(2), 16);
                sb2.append((CharSequence) str, iEnd, matcher.start());
                if (i11 == 92) {
                    sb2.append("\\\\");
                } else {
                    sb2.append(Character.toChars(i11));
                }
                iEnd = matcher.end();
            }
        }
        if (sb2 == null) {
            return str;
        }
        if (iEnd < matcher.regionEnd()) {
            sb2.append((CharSequence) str, iEnd, matcher.regionEnd());
        }
        return sb2.toString();
    }
}
