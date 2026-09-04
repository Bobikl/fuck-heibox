package pe;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: compiled from: PictureLanguageUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f138292a = "KEY_LOCALE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f138293b = "VALUE_FOLLOW_SYSTEM";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f138294c = "PictureSpUtils";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static SharedPreferences f138295d;

    private c() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static void a(@n0 Context context, @n0 Locale locale) {
        if (PatchProxy.proxy(new Object[]{context, locale}, null, changeQuickRedirect, true, bb.c.m.I, new Class[]{Context.class, Locale.class}, Void.TYPE).isSupported) {
            return;
        }
        b(context, locale, false);
    }

    private static void b(@n0 Context context, @n0 Locale locale, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, locale, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.J, new Class[]{Context.class, Locale.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            f138295d = context.getSharedPreferences(f138294c, 0);
            d(context).edit().putString(f138292a, f138293b).apply();
        } else {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            f138295d = context.getSharedPreferences(f138294c, 0);
            d(context).edit().putString(f138292a, language + "$" + country).apply();
        }
        g(context, locale);
    }

    private static boolean c(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence, charSequence2}, null, changeQuickRedirect, true, bb.c.m.N, new Class[]{CharSequence.class, CharSequence.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    private static SharedPreferences d(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.K, new Class[]{Context.class}, SharedPreferences.class);
        if (patchProxyResultProxy.isSupported) {
            return (SharedPreferences) patchProxyResultProxy.result;
        }
        if (f138295d == null) {
            f138295d = context.getSharedPreferences(f138294c, 0);
        }
        return f138295d;
    }

    public static void e(Context context, int i10) {
        if (PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.H, new Class[]{Context.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        WeakReference weakReference = new WeakReference(context);
        if (i10 >= 0) {
            a((Context) weakReference.get(), b.a(i10));
        } else {
            f((Context) weakReference.get());
        }
    }

    private static void f(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.M, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration.setLocale(Locale.getDefault());
        context.createConfigurationContext(configuration);
        resources.updateConfiguration(configuration, displayMetrics);
    }

    private static void g(Context context, Locale locale) {
        if (PatchProxy.proxy(new Object[]{context, locale}, null, changeQuickRedirect, true, bb.c.m.L, new Class[]{Context.class, Locale.class}, Void.TYPE).isSupported) {
            return;
        }
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        Locale locale2 = configuration.locale;
        if (c(locale2.getLanguage(), locale.getLanguage()) && c(locale2.getCountry(), locale.getCountry())) {
            return;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration.setLocale(locale);
        context.createConfigurationContext(configuration);
        resources.updateConfiguration(configuration, displayMetrics);
    }
}
