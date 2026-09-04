package org.aspectj.runtime.reflect;

import com.meituan.robust.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.StringTokenizer;
import zj.c0;
import zj.r;
import zj.t;
import zj.z;

/* JADX INFO: compiled from: Factory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Class[] f137725e = new Class[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f137726f = new String[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static Hashtable f137727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Object[] f137728h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Class f137729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ClassLoader f137730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f137731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f137732d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        f137727g = hashtable;
        hashtable.put("void", Void.TYPE);
        f137727g.put("boolean", Boolean.TYPE);
        f137727g.put(Constants.BYTE, Byte.TYPE);
        f137727g.put(Constants.CHAR, Character.TYPE);
        f137727g.put(Constants.SHORT, Short.TYPE);
        f137727g.put(Constants.INT, Integer.TYPE);
        f137727g.put(Constants.LONG, Long.TYPE);
        f137727g.put("float", Float.TYPE);
        f137727g.put(Constants.DOUBLE, Double.TYPE);
        f137728h = new Object[0];
    }

    public e(String str, Class cls) {
        this.f137731c = str;
        this.f137729a = cls;
        this.f137730b = cls.getClassLoader();
    }

    public static org.aspectj.lang.c E(org.aspectj.lang.c.b bVar, Object obj, Object obj2) {
        return new h(bVar, obj, obj2, f137728h);
    }

    public static org.aspectj.lang.c F(org.aspectj.lang.c.b bVar, Object obj, Object obj2, Object obj3) {
        return new h(bVar, obj, obj2, new Object[]{obj3});
    }

    public static org.aspectj.lang.c G(org.aspectj.lang.c.b bVar, Object obj, Object obj2, Object obj3, Object obj4) {
        return new h(bVar, obj, obj2, new Object[]{obj3, obj4});
    }

    public static org.aspectj.lang.c H(org.aspectj.lang.c.b bVar, Object obj, Object obj2, Object[] objArr) {
        return new h(bVar, obj, obj2, objArr);
    }

    static Class k(String str, ClassLoader classLoader) {
        if (str.equals(androidx.webkit.b.f28327e)) {
            return null;
        }
        Class cls = (Class) f137727g.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return ClassNotFoundException.class;
        }
    }

    public static org.aspectj.lang.c.b t(Member member) {
        org.aspectj.lang.f dVar;
        String str;
        if (member instanceof Method) {
            Method method = (Method) member;
            dVar = new k(method.getModifiers(), method.getName(), method.getDeclaringClass(), method.getParameterTypes(), new String[method.getParameterTypes().length], method.getExceptionTypes(), method.getReturnType());
            str = org.aspectj.lang.c.f137679a;
        } else {
            if (!(member instanceof Constructor)) {
                throw new IllegalArgumentException("member must be either a method or constructor");
            }
            Constructor constructor = (Constructor) member;
            dVar = new d(constructor.getModifiers(), constructor.getDeclaringClass(), constructor.getParameterTypes(), new String[constructor.getParameterTypes().length], constructor.getExceptionTypes());
            str = org.aspectj.lang.c.f137681c;
        }
        return new h.a(-1, str, dVar, null);
    }

    public org.aspectj.lang.c.b A(String str, int i10, Class cls, int i11) {
        g gVar = new g(i10, cls);
        int i12 = this.f137732d;
        this.f137732d = i12 + 1;
        return new h.b(i12, str, gVar, Y(i11, -1));
    }

    public zj.m B(int i10, Class cls) {
        g gVar = new g(i10, cls);
        gVar.z(this.f137730b);
        return gVar;
    }

    public zj.m C(String str) {
        g gVar = new g(str);
        gVar.z(this.f137730b);
        return gVar;
    }

    public zj.m D(String str, String str2) {
        g gVar = new g(Integer.parseInt(str, 16), k(str2, this.f137730b));
        gVar.z(this.f137730b);
        return gVar;
    }

    public org.aspectj.lang.c.a I(String str, Class cls, int i10) {
        i iVar = new i(cls);
        int i11 = this.f137732d;
        this.f137732d = i11 + 1;
        return new h.a(i11, str, iVar, Y(i10, -1));
    }

    public org.aspectj.lang.c.b J(String str, Class cls, int i10) {
        i iVar = new i(cls);
        int i11 = this.f137732d;
        this.f137732d = i11 + 1;
        return new h.b(i11, str, iVar, Y(i10, -1));
    }

    public r K() {
        i iVar = new i(k("Ljava/lang/Object;", this.f137730b));
        iVar.z(this.f137730b);
        return iVar;
    }

    public r L(Class cls) {
        i iVar = new i(cls);
        iVar.z(this.f137730b);
        return iVar;
    }

    public r M(String str) {
        i iVar = new i(str);
        iVar.z(this.f137730b);
        return iVar;
    }

    public org.aspectj.lang.c.a N(String str, int i10, String str2, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2, int i11) {
        t tVarP = P(i10, str2, cls, clsArr == null ? f137725e : clsArr, strArr == null ? f137726f : strArr, clsArr2 == null ? f137725e : clsArr2, cls2 == null ? Void.TYPE : cls2);
        int i12 = this.f137732d;
        this.f137732d = i12 + 1;
        return new h.a(i12, str, tVarP, Y(i11, -1));
    }

    public org.aspectj.lang.c.b O(String str, int i10, String str2, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2, int i11) {
        t tVarP = P(i10, str2, cls, clsArr == null ? f137725e : clsArr, strArr == null ? f137726f : strArr, clsArr2 == null ? f137725e : clsArr2, cls2 == null ? Void.TYPE : cls2);
        int i12 = this.f137732d;
        this.f137732d = i12 + 1;
        return new h.b(i12, str, tVarP, Y(i11, -1));
    }

    public t P(int i10, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        k kVar = new k(i10, str, cls, clsArr == null ? f137725e : clsArr, strArr, clsArr2 == null ? f137725e : clsArr2, cls2);
        kVar.z(this.f137730b);
        return kVar;
    }

    public t Q(String str) {
        k kVar = new k(str);
        kVar.z(this.f137730b);
        return kVar;
    }

    public t R(String str, String str2, Class cls, String str3, String str4, String str5, String str6) {
        int i10 = Integer.parseInt(str, 16);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i11 = 0; i11 < iCountTokens; i11++) {
            clsArr[i11] = k(stringTokenizer.nextToken(), this.f137730b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int iCountTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[iCountTokens2];
        for (int i12 = 0; i12 < iCountTokens2; i12++) {
            strArr[i12] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str5, ":");
        int iCountTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[iCountTokens3];
        for (int i13 = 0; i13 < iCountTokens3; i13++) {
            clsArr2[i13] = k(stringTokenizer3.nextToken(), this.f137730b);
        }
        return new k(i10, str2, cls, clsArr, strArr, clsArr2, k(str6, this.f137730b));
    }

    public t S(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return R(str, str2, k(str3, this.f137730b), str4, str5, str6, str7);
    }

    public org.aspectj.lang.c.b T(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10) {
        t tVarS = S(str2, str3, str4, str5, str6, "", str7);
        int i11 = this.f137732d;
        this.f137732d = i11 + 1;
        return new h.b(i11, str, tVarS, Y(i10, -1));
    }

    public org.aspectj.lang.c.b U(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10) {
        t tVarS = S(str2, str3, str4, str5, str6, str7, str8);
        int i11 = this.f137732d;
        this.f137732d = i11 + 1;
        return new h.b(i11, str, tVarS, Y(i10, -1));
    }

    public org.aspectj.lang.c.b V(String str, org.aspectj.lang.f fVar, int i10) {
        int i11 = this.f137732d;
        this.f137732d = i11 + 1;
        return new h.b(i11, str, fVar, Y(i10, -1));
    }

    public org.aspectj.lang.c.b W(String str, org.aspectj.lang.f fVar, int i10, int i11) {
        int i12 = this.f137732d;
        this.f137732d = i12 + 1;
        return new h.b(i12, str, fVar, Y(i10, i11));
    }

    public org.aspectj.lang.c.b X(String str, org.aspectj.lang.f fVar, z zVar) {
        int i10 = this.f137732d;
        this.f137732d = i10 + 1;
        return new h.b(i10, str, fVar, zVar);
    }

    public z Y(int i10, int i11) {
        return new m(this.f137729a, this.f137731c, i10);
    }

    public org.aspectj.lang.c.a Z(String str, Class cls, int i10) {
        o oVar = new o(cls);
        int i11 = this.f137732d;
        this.f137732d = i11 + 1;
        return new h.a(i11, str, oVar, Y(i10, -1));
    }

    public org.aspectj.lang.c.a a(String str, int i10, String str2, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2, int i11) {
        a aVar = new a(i10, str2, cls, clsArr == null ? f137725e : clsArr, strArr == null ? f137726f : strArr, clsArr2 == null ? f137725e : clsArr2, cls2 == null ? Void.TYPE : cls2);
        int i12 = this.f137732d;
        this.f137732d = i12 + 1;
        return new h.a(i12, str, aVar, Y(i11, -1));
    }

    public org.aspectj.lang.c.b a0(String str, Class cls, int i10) {
        o oVar = new o(cls);
        int i11 = this.f137732d;
        this.f137732d = i11 + 1;
        return new h.b(i11, str, oVar, Y(i10, -1));
    }

    public org.aspectj.lang.c.b b(String str, int i10, String str2, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2, int i11) {
        a aVar = new a(i10, str2, cls, clsArr == null ? f137725e : clsArr, strArr == null ? f137726f : strArr, clsArr2 == null ? f137725e : clsArr2, cls2 == null ? Void.TYPE : cls2);
        int i12 = this.f137732d;
        this.f137732d = i12 + 1;
        return new h.b(i12, str, aVar, Y(i11, -1));
    }

    public c0 b0() {
        o oVar = new o(k("Ljava/lang/Object;", this.f137730b));
        oVar.z(this.f137730b);
        return oVar;
    }

    public zj.b c(int i10, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        a aVar = new a(i10, str, cls, clsArr, strArr, clsArr2, cls2);
        aVar.z(this.f137730b);
        return aVar;
    }

    public c0 c0(Class cls) {
        o oVar = new o(cls);
        oVar.z(this.f137730b);
        return oVar;
    }

    public zj.b d(String str) {
        a aVar = new a(str);
        aVar.z(this.f137730b);
        return aVar;
    }

    public c0 d0(String str) {
        o oVar = new o(str);
        oVar.z(this.f137730b);
        return oVar;
    }

    public zj.b e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = Integer.parseInt(str, 16);
        Class clsK = k(str3, this.f137730b);
        StringTokenizer stringTokenizer = new StringTokenizer(str4, ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i11 = 0; i11 < iCountTokens; i11++) {
            clsArr[i11] = k(stringTokenizer.nextToken(), this.f137730b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str5, ":");
        int iCountTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[iCountTokens2];
        for (int i12 = 0; i12 < iCountTokens2; i12++) {
            strArr[i12] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str6, ":");
        int iCountTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[iCountTokens3];
        for (int i13 = 0; i13 < iCountTokens3; i13++) {
            clsArr2[i13] = k(stringTokenizer3.nextToken(), this.f137730b);
        }
        a aVar = new a(i10, str2, clsK, clsArr, strArr, clsArr2, k(str7, this.f137730b));
        aVar.z(this.f137730b);
        return aVar;
    }

    public org.aspectj.lang.c.a f(String str, Class cls, Class cls2, String str2, int i10) {
        if (str2 == null) {
            str2 = "";
        }
        b bVar = new b(cls, cls2, str2);
        int i11 = this.f137732d;
        this.f137732d = i11 + 1;
        return new h.a(i11, str, bVar, Y(i10, -1));
    }

    public org.aspectj.lang.c.b g(String str, Class cls, Class cls2, String str2, int i10) {
        if (str2 == null) {
            str2 = "";
        }
        b bVar = new b(cls, cls2, str2);
        int i11 = this.f137732d;
        this.f137732d = i11 + 1;
        return new h.b(i11, str, bVar, Y(i10, -1));
    }

    public zj.e h(Class cls, Class cls2, String str) {
        b bVar = new b(cls, cls2, str);
        bVar.z(this.f137730b);
        return bVar;
    }

    public zj.e i(String str) {
        b bVar = new b(str);
        bVar.z(this.f137730b);
        return bVar;
    }

    public zj.e j(String str, String str2, String str3) {
        b bVar = new b(k(str, this.f137730b), k(new StringTokenizer(str2, ":").nextToken(), this.f137730b), new StringTokenizer(str3, ":").nextToken());
        bVar.z(this.f137730b);
        return bVar;
    }

    public org.aspectj.lang.c.a l(String str, int i10, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, int i11) {
        if (clsArr == null) {
            clsArr = f137725e;
        }
        Class[] clsArr3 = clsArr;
        if (strArr == null) {
            strArr = f137726f;
        }
        String[] strArr2 = strArr;
        if (clsArr2 == null) {
            clsArr2 = f137725e;
        }
        d dVar = new d(i10, cls, clsArr3, strArr2, clsArr2);
        int i12 = this.f137732d;
        this.f137732d = i12 + 1;
        return new h.a(i12, str, dVar, Y(i11, -1));
    }

    public org.aspectj.lang.c.b m(String str, int i10, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, int i11) {
        if (clsArr == null) {
            clsArr = f137725e;
        }
        Class[] clsArr3 = clsArr;
        if (strArr == null) {
            strArr = f137726f;
        }
        String[] strArr2 = strArr;
        if (clsArr2 == null) {
            clsArr2 = f137725e;
        }
        d dVar = new d(i10, cls, clsArr3, strArr2, clsArr2);
        int i12 = this.f137732d;
        this.f137732d = i12 + 1;
        return new h.b(i12, str, dVar, Y(i11, -1));
    }

    public zj.g n(int i10, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        d dVar = new d(i10, cls, clsArr, strArr, clsArr2);
        dVar.z(this.f137730b);
        return dVar;
    }

    public zj.g o(String str) {
        d dVar = new d(str);
        dVar.z(this.f137730b);
        return dVar;
    }

    public zj.g p(String str, String str2, String str3, String str4, String str5) {
        int i10 = Integer.parseInt(str, 16);
        Class clsK = k(str2, this.f137730b);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i11 = 0; i11 < iCountTokens; i11++) {
            clsArr[i11] = k(stringTokenizer.nextToken(), this.f137730b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int iCountTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[iCountTokens2];
        for (int i12 = 0; i12 < iCountTokens2; i12++) {
            strArr[i12] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str5, ":");
        int iCountTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[iCountTokens3];
        for (int i13 = 0; i13 < iCountTokens3; i13++) {
            clsArr2[i13] = k(stringTokenizer3.nextToken(), this.f137730b);
        }
        d dVar = new d(i10, clsK, clsArr, strArr, clsArr2);
        dVar.z(this.f137730b);
        return dVar;
    }

    public org.aspectj.lang.c.a q(String str, org.aspectj.lang.f fVar, int i10) {
        int i11 = this.f137732d;
        this.f137732d = i11 + 1;
        return new h.a(i11, str, fVar, Y(i10, -1));
    }

    public org.aspectj.lang.c.a r(String str, org.aspectj.lang.f fVar, int i10, int i11) {
        int i12 = this.f137732d;
        this.f137732d = i12 + 1;
        return new h.a(i12, str, fVar, Y(i10, i11));
    }

    public org.aspectj.lang.c.a s(String str, org.aspectj.lang.f fVar, z zVar) {
        int i10 = this.f137732d;
        this.f137732d = i10 + 1;
        return new h.a(i10, str, fVar, zVar);
    }

    public org.aspectj.lang.c.a u(String str, int i10, String str2, Class cls, Class cls2, int i11) {
        f fVar = new f(i10, str2, cls, cls2);
        int i12 = this.f137732d;
        this.f137732d = i12 + 1;
        return new h.a(i12, str, fVar, Y(i11, -1));
    }

    public org.aspectj.lang.c.b v(String str, int i10, String str2, Class cls, Class cls2, int i11) {
        f fVar = new f(i10, str2, cls, cls2);
        int i12 = this.f137732d;
        this.f137732d = i12 + 1;
        return new h.b(i12, str, fVar, Y(i11, -1));
    }

    public zj.l w(int i10, String str, Class cls, Class cls2) {
        f fVar = new f(i10, str, cls, cls2);
        fVar.z(this.f137730b);
        return fVar;
    }

    public zj.l x(String str) {
        f fVar = new f(str);
        fVar.z(this.f137730b);
        return fVar;
    }

    public zj.l y(String str, String str2, String str3, String str4) {
        f fVar = new f(Integer.parseInt(str, 16), str2, k(str3, this.f137730b), k(str4, this.f137730b));
        fVar.z(this.f137730b);
        return fVar;
    }

    public org.aspectj.lang.c.a z(String str, int i10, Class cls, int i11) {
        g gVar = new g(i10, cls);
        int i12 = this.f137732d;
        this.f137732d = i12 + 1;
        return new h.a(i12, str, gVar, Y(i11, -1));
    }
}
