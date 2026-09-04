package androidx.core.os;

import androidx.annotation.j1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.meituan.robust.Constants;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: LocaleListCompatWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class p implements q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Locale[] f20985c = new Locale[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Locale f20986d = new Locale(SocializeProtocolConstants.PROTOCOL_KEY_EN, "XA");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Locale f20987e = new Locale("ar", "XB");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Locale f20988f = o.b("en-Latn");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Locale[] f20989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    private final String f20990b;

    /* JADX INFO: compiled from: LocaleListCompatWrapper.java */
    @w0(21)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    p(@androidx.annotation.n0 Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f20989a = f20985c;
            this.f20990b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale == null) {
                throw new NullPointerException("list[" + i10 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                k(sb2, locale2);
                if (i10 < localeArr.length - 1) {
                    sb2.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f20989a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f20990b = sb2.toString();
    }

    private Locale e(Collection<String> collection, boolean z10) {
        int iF = f(collection, z10);
        if (iF == -1) {
            return null;
        }
        return this.f20989a[iF];
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e  */
    private int f(Collection<String> collection, boolean z10) {
        int iG;
        Locale[] localeArr = this.f20989a;
        if (localeArr.length == 1) {
            return 0;
        }
        if (localeArr.length == 0) {
            return -1;
        }
        if (z10) {
            iG = g(f20988f);
            if (iG == 0) {
                return 0;
            }
            if (iG >= Integer.MAX_VALUE) {
                iG = Integer.MAX_VALUE;
            }
        } else {
            iG = Integer.MAX_VALUE;
        }
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            int iG2 = g(o.b(it.next()));
            if (iG2 == 0) {
                return 0;
            }
            if (iG2 < iG) {
                iG = iG2;
            }
        }
        if (iG == Integer.MAX_VALUE) {
            return 0;
        }
        return iG;
    }

    private int g(Locale locale) {
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f20989a;
            if (i10 >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (j(locale, localeArr[i10]) > 0) {
                return i10;
            }
            i10++;
        }
    }

    private static String h(Locale locale) {
        String strA = a.a(locale);
        return !strA.isEmpty() ? strA : "";
    }

    private static boolean i(Locale locale) {
        return f20986d.equals(locale) || f20987e.equals(locale);
    }

    @androidx.annotation.f0(from = 0, to = 1)
    private static int j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || i(locale) || i(locale2)) {
            return 0;
        }
        String strH = h(locale);
        if (!strH.isEmpty()) {
            return strH.equals(h(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
    }

    @j1
    static void k(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb2.append('-');
        sb2.append(locale.getCountry());
    }

    @Override // androidx.core.os.q
    public String a() {
        return this.f20990b;
    }

    @Override // androidx.core.os.q
    @p0
    public Object b() {
        return null;
    }

    @Override // androidx.core.os.q
    public Locale c(@androidx.annotation.n0 String[] strArr) {
        return e(Arrays.asList(strArr), false);
    }

    @Override // androidx.core.os.q
    public int d(Locale locale) {
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f20989a;
            if (i10 >= localeArr.length) {
                return -1;
            }
            if (localeArr[i10].equals(locale)) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        Locale[] localeArr = ((p) obj).f20989a;
        if (this.f20989a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f20989a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // androidx.core.os.q
    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f20989a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f20989a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.core.os.q
    public boolean isEmpty() {
        return this.f20989a.length == 0;
    }

    @Override // androidx.core.os.q
    public int size() {
        return this.f20989a.length;
    }

    @androidx.annotation.n0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Constants.ARRAY_TYPE);
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f20989a;
            if (i10 >= localeArr.length) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(localeArr[i10]);
            if (i10 < this.f20989a.length - 1) {
                sb2.append(',');
            }
            i10++;
        }
    }
}
