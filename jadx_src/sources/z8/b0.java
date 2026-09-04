package z8;

import android.text.TextUtils;
import androidx.annotation.p0;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
@d0
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f141912a = Pattern.compile("\\$\\{(.*?)\\}");

    private b0() {
    }

    @v8.a
    @p0
    public static String a(@p0 String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @mk.e(expression = {"#1"}, result = false)
    @v8.a
    public static boolean b(@p0 String str) {
        return str == null || str.trim().isEmpty();
    }
}
