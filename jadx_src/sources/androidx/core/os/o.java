package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.r0;
import androidx.annotation.w0;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;

/* JADX INFO: compiled from: LocaleListCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o f20982b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f20983a;

    /* JADX INFO: compiled from: LocaleListCompat.java */
    @w0(21)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Locale[] f20984a = {new Locale(SocializeProtocolConstants.PROTOCOL_KEY_EN, "XA"), new Locale("ar", "XB")};

        private a() {
        }

        @androidx.annotation.u
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale locale2 : f20984a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        @androidx.annotation.u
        static boolean c(@androidx.annotation.n0 Locale locale, @androidx.annotation.n0 Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String strC = androidx.core.text.h.c(locale);
            if (!strC.isEmpty()) {
                return strC.equals(androidx.core.text.h.c(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* JADX INFO: compiled from: LocaleListCompat.java */
    @w0(24)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @androidx.annotation.u
        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        @androidx.annotation.u
        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private o(q qVar) {
        this.f20983a = qVar;
    }

    @androidx.annotation.n0
    public static o a(@androidx.annotation.n0 Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? o(b.a(localeArr)) : new o(new p(localeArr));
    }

    static Locale b(String str) {
        if (str.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
            String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER, -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains(lg.a.f131412e)) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split(lg.a.f131412e, -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @androidx.annotation.n0
    public static o c(@p0 String str) {
        if (str == null || str.isEmpty()) {
            return g();
        }
        String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    @androidx.annotation.n0
    @b1(min = 1)
    public static o e() {
        return Build.VERSION.SDK_INT >= 24 ? o(b.b()) : a(Locale.getDefault());
    }

    @androidx.annotation.n0
    @b1(min = 1)
    public static o f() {
        return Build.VERSION.SDK_INT >= 24 ? o(b.c()) : a(Locale.getDefault());
    }

    @androidx.annotation.n0
    public static o g() {
        return f20982b;
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    @w0(21)
    public static boolean k(@androidx.annotation.n0 Locale locale, @androidx.annotation.n0 Locale locale2) {
        return androidx.core.os.a.k() ? LocaleList.matchesLanguageAndScript(locale, locale2) : a.c(locale, locale2);
    }

    @androidx.annotation.n0
    @w0(24)
    public static o o(@androidx.annotation.n0 LocaleList localeList) {
        return new o(new r(localeList));
    }

    @w0(24)
    @Deprecated
    public static o p(Object obj) {
        return o((LocaleList) obj);
    }

    @p0
    public Locale d(int i10) {
        return this.f20983a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof o) && this.f20983a.equals(((o) obj).f20983a);
    }

    @p0
    public Locale h(@androidx.annotation.n0 String[] strArr) {
        return this.f20983a.c(strArr);
    }

    public int hashCode() {
        return this.f20983a.hashCode();
    }

    @androidx.annotation.f0(from = -1)
    public int i(@p0 Locale locale) {
        return this.f20983a.d(locale);
    }

    public boolean j() {
        return this.f20983a.isEmpty();
    }

    @androidx.annotation.f0(from = 0)
    public int l() {
        return this.f20983a.size();
    }

    @androidx.annotation.n0
    public String m() {
        return this.f20983a.a();
    }

    @p0
    public Object n() {
        return this.f20983a.b();
    }

    @androidx.annotation.n0
    public String toString() {
        return this.f20983a.toString();
    }
}
