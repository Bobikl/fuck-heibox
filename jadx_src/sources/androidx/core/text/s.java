package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.util.Locale;

/* JADX INFO: compiled from: TextUtilsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Locale f21173a = new Locale("", "");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f21174b = "Arab";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f21175c = "Hebr";

    /* JADX INFO: compiled from: TextUtilsCompat.java */
    @w0(17)
    public static class a {
        private a() {
        }

        @u
        static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    private s() {
    }

    private static int a(@n0 Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int b(@p0 Locale locale) {
        return a.a(locale);
    }

    @n0
    public static String c(@n0 String str) {
        return TextUtils.htmlEncode(str);
    }
}
