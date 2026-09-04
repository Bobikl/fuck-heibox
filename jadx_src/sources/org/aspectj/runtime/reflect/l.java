package org.aspectj.runtime.reflect;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;
import kotlin.text.y;
import okhttp3.t;

/* JADX INFO: compiled from: SignatureImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class l implements org.aspectj.lang.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f137749h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final char f137750i = '-';

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static String[] f137751j = new String[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static Class[] f137752k = new Class[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f137753l = ":";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f137754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f137755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f137756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Class f137757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f137758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f137759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ClassLoader f137760g;

    /* JADX INFO: compiled from: SignatureImpl.java */
    public interface a {
        void a(int i10, String str);

        String get(int i10);
    }

    /* JADX INFO: compiled from: SignatureImpl.java */
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SoftReference f137761a;

        public b() {
            c();
        }

        private String[] b() {
            return (String[]) this.f137761a.get();
        }

        private String[] c() {
            String[] strArr = new String[3];
            this.f137761a = new SoftReference(strArr);
            return strArr;
        }

        @Override // org.aspectj.runtime.reflect.l.a
        public void a(int i10, String str) {
            String[] strArrB = b();
            if (strArrB == null) {
                strArrB = c();
            }
            strArrB[i10] = str;
        }

        @Override // org.aspectj.runtime.reflect.l.a
        public String get(int i10) {
            String[] strArrB = b();
            if (strArrB == null) {
                return null;
            }
            return strArrB[i10];
        }
    }

    l(int i10, String str, Class cls) {
        this.f137760g = null;
        this.f137754a = i10;
        this.f137755b = str;
        this.f137757d = cls;
    }

    public l(String str) {
        this.f137754a = -1;
        this.f137760g = null;
        this.f137759f = str;
    }

    static void A(boolean z10) {
        f137749h = z10;
    }

    private ClassLoader x() {
        if (this.f137760g == null) {
            this.f137760g = getClass().getClassLoader();
        }
        return this.f137760g;
    }

    static boolean y() {
        return f137749h;
    }

    String B(Class cls) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            return C(cls.getName()).replace(y.f128594c, lg.a.f131414g);
        }
        return B(cls.getComponentType()) + t.f132643o;
    }

    String C(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    String D(n nVar) {
        String strQ;
        if (f137749h) {
            a aVar = this.f137758e;
            if (aVar == null) {
                try {
                    this.f137758e = new b();
                } catch (Throwable unused) {
                    f137749h = false;
                }
                strQ = null;
            } else {
                strQ = aVar.get(nVar.f137776i);
            }
        } else {
            strQ = null;
        }
        if (strQ == null) {
            strQ = q(nVar);
        }
        if (f137749h) {
            this.f137758e.a(nVar.f137776i, strQ);
        }
        return strQ;
    }

    @Override // org.aspectj.lang.f
    public Class a() {
        if (this.f137757d == null) {
            this.f137757d = u(2);
        }
        return this.f137757d;
    }

    @Override // org.aspectj.lang.f
    public final String d() {
        return D(n.f137765j);
    }

    @Override // org.aspectj.lang.f
    public final String f() {
        return D(n.f137767l);
    }

    @Override // org.aspectj.lang.f
    public int getModifiers() {
        if (this.f137754a == -1) {
            this.f137754a = r(0);
        }
        return this.f137754a;
    }

    @Override // org.aspectj.lang.f
    public String getName() {
        if (this.f137755b == null) {
            this.f137755b = s(1);
        }
        return this.f137755b;
    }

    @Override // org.aspectj.lang.f
    public String k() {
        if (this.f137756c == null) {
            this.f137756c = a().getName();
        }
        return this.f137756c;
    }

    void n(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(w(clsArr[i10]));
        }
    }

    void o(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(B(clsArr[i10]));
        }
    }

    void p(StringBuffer stringBuffer, Class[] clsArr) {
        n(stringBuffer, clsArr);
    }

    protected abstract String q(n nVar);

    int r(int i10) {
        return Integer.parseInt(s(i10), 16);
    }

    String s(int i10) {
        int iIndexOf = this.f137759f.indexOf(45);
        int i11 = 0;
        while (true) {
            int i12 = i10 - 1;
            if (i10 <= 0) {
                break;
            }
            i11 = iIndexOf + 1;
            iIndexOf = this.f137759f.indexOf(45, i11);
            i10 = i12;
        }
        if (iIndexOf == -1) {
            iIndexOf = this.f137759f.length();
        }
        return this.f137759f.substring(i11, iIndexOf);
    }

    String[] t(int i10) {
        StringTokenizer stringTokenizer = new StringTokenizer(s(i10), ":");
        int iCountTokens = stringTokenizer.countTokens();
        String[] strArr = new String[iCountTokens];
        for (int i11 = 0; i11 < iCountTokens; i11++) {
            strArr[i11] = stringTokenizer.nextToken();
        }
        return strArr;
    }

    @Override // org.aspectj.lang.f
    public final String toString() {
        return D(n.f137766k);
    }

    Class u(int i10) {
        return e.k(s(i10), x());
    }

    Class[] v(int i10) {
        StringTokenizer stringTokenizer = new StringTokenizer(s(i10), ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i11 = 0; i11 < iCountTokens; i11++) {
            clsArr[i11] = e.k(stringTokenizer.nextToken(), x());
        }
        return clsArr;
    }

    String w(Class cls) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            return cls.getName().replace(y.f128594c, lg.a.f131414g);
        }
        return w(cls.getComponentType()) + t.f132643o;
    }

    public void z(ClassLoader classLoader) {
        this.f137760g = classLoader;
    }
}
