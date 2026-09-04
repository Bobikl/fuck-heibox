package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: compiled from: ICUCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21137a = "ICUCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f21138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f21139c;

    /* JADX INFO: compiled from: ICUCompat.java */
    @w0(21)
    public static class a {
        private a() {
        }

        @u
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* JADX INFO: compiled from: ICUCompat.java */
    @w0(24)
    public static class b {
        private b() {
        }

        @u
        static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @u
        static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @u
        static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f21139c = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    private h() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String a(Locale locale) {
        String string = locale.toString();
        try {
            Method method = f21139c;
            if (method != null) {
                return (String) method.invoke(null, string);
            }
        } catch (IllegalAccessException e10) {
            Log.w(f21137a, e10);
        } catch (InvocationTargetException e11) {
            Log.w(f21137a, e11);
        }
        return string;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String b(String str) {
        try {
            Method method = f21138b;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e10) {
            Log.w(f21137a, e10);
        } catch (InvocationTargetException e11) {
            Log.w(f21137a, e11);
        }
        return null;
    }

    @p0
    public static String c(@n0 Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.c(b.a(b.b(locale)));
        }
        try {
            return a.a((Locale) f21139c.invoke(null, locale));
        } catch (IllegalAccessException e10) {
            Log.w(f21137a, e10);
            return a.a(locale);
        } catch (InvocationTargetException e11) {
            Log.w(f21137a, e11);
            return a.a(locale);
        }
    }
}
