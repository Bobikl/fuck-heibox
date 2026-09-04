package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: LocaleManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: compiled from: LocaleManagerCompat.java */
    @androidx.annotation.w0(21)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static String a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: compiled from: LocaleManagerCompat.java */
    @androidx.annotation.w0(24)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static androidx.core.os.o a(Configuration configuration) {
            return androidx.core.os.o.c(configuration.getLocales().toLanguageTags());
        }
    }

    /* JADX INFO: compiled from: LocaleManagerCompat.java */
    @androidx.annotation.w0(33)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    private a0() {
    }

    @androidx.annotation.j1
    static androidx.core.os.o a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? b.a(configuration) : androidx.core.os.o.c(a.a(configuration.locale));
    }

    @androidx.annotation.w0(33)
    private static Object b(Context context) {
        return context.getSystemService("locale");
    }

    @androidx.annotation.d
    @androidx.annotation.n0
    @androidx.annotation.r0(markerClass = {androidx.core.os.a.b.class})
    public static androidx.core.os.o c(@androidx.annotation.n0 Context context) {
        androidx.core.os.o oVarG = androidx.core.os.o.g();
        if (!androidx.core.os.a.k()) {
            return a(context.getApplicationContext().getResources().getConfiguration());
        }
        Object objB = b(context);
        return objB != null ? androidx.core.os.o.o(c.a(objB)) : oVarG;
    }
}
