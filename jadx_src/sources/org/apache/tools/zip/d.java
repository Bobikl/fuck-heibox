package org.apache.tools.zip;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;

/* JADX INFO: compiled from: ExtraFieldUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f137392a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<a0, Class<?>> f137393b = new ConcurrentHashMap();

    /* JADX INFO: compiled from: ExtraFieldUtils.java */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f137394b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f137395c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f137396d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f137397e = new a(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f137398f = new a(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f137399g = new a(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f137400a;

        private a(int i10) {
            this.f137400a = i10;
        }

        public int a() {
            return this.f137400a;
        }
    }

    static {
        g(b.class);
        g(g.class);
        g(k.class);
        g(j.class);
        g(o.class);
    }

    public static u a(a0 a0Var) throws IllegalAccessException, InstantiationException {
        Class<?> cls = f137393b.get(a0Var);
        if (cls == null) {
            n nVar = new n();
            nVar.i(a0Var);
            return nVar;
        }
        try {
            return (u) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException e10) {
            throw ((InstantiationException) new InstantiationException().initCause(e10));
        } catch (InvocationTargetException e11) {
            throw ((InstantiationException) new InstantiationException().initCause(e11.getTargetException()));
        }
    }

    public static byte[] b(u[] uVarArr) {
        boolean z10 = uVarArr.length > 0 && (uVarArr[uVarArr.length - 1] instanceof m);
        int length = uVarArr.length;
        if (z10) {
            length--;
        }
        int iC = length * 4;
        for (u uVar : uVarArr) {
            iC += uVar.f().c();
        }
        byte[] bArr = new byte[iC];
        int length2 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            System.arraycopy(uVarArr[i10].d().a(), 0, bArr, length2, 2);
            System.arraycopy(uVarArr[i10].f().a(), 0, bArr, length2 + 2, 2);
            byte[] bArrA = uVarArr[i10].a();
            System.arraycopy(bArrA, 0, bArr, length2 + 4, bArrA.length);
            length2 += bArrA.length + 4;
        }
        if (z10) {
            byte[] bArrA2 = uVarArr[uVarArr.length - 1].a();
            System.arraycopy(bArrA2, 0, bArr, length2, bArrA2.length);
        }
        return bArr;
    }

    public static byte[] c(u[] uVarArr) {
        boolean z10 = uVarArr.length > 0 && (uVarArr[uVarArr.length - 1] instanceof m);
        int length = uVarArr.length;
        if (z10) {
            length--;
        }
        int iC = length * 4;
        for (u uVar : uVarArr) {
            iC += uVar.c().c();
        }
        byte[] bArr = new byte[iC];
        int length2 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            System.arraycopy(uVarArr[i10].d().a(), 0, bArr, length2, 2);
            System.arraycopy(uVarArr[i10].c().a(), 0, bArr, length2 + 2, 2);
            byte[] bArrE = uVarArr[i10].e();
            System.arraycopy(bArrE, 0, bArr, length2 + 4, bArrE.length);
            length2 += bArrE.length + 4;
        }
        if (z10) {
            byte[] bArrE2 = uVarArr[uVarArr.length - 1].e();
            System.arraycopy(bArrE2, 0, bArr, length2, bArrE2.length);
        }
        return bArr;
    }

    public static u[] d(byte[] bArr) throws ZipException {
        return f(bArr, true, a.f137397e);
    }

    public static u[] e(byte[] bArr, boolean z10) throws ZipException {
        return f(bArr, z10, a.f137397e);
    }

    public static u[] f(byte[] bArr, boolean z10, a aVar) throws ZipException {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= bArr.length - 4) {
            a0 a0Var = new a0(bArr, i10);
            int iC = new a0(bArr, i10 + 2).c();
            int i11 = i10 + 4;
            if (i11 + iC > bArr.length) {
                int iA = aVar.a();
                if (iA == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("bad extra field starting at ");
                    sb2.append(i10);
                    sb2.append(".  Block length of ");
                    sb2.append(iC);
                    sb2.append(" bytes exceeds remaining data of ");
                    sb2.append((bArr.length - i10) - 4);
                    sb2.append(" bytes.");
                    throw new ZipException(sb2.toString());
                }
                if (iA == 1) {
                    break;
                }
                if (iA != 2) {
                    throw new ZipException("unknown UnparseableExtraField key: " + aVar.a());
                }
                m mVar = new m();
                if (z10) {
                    mVar.g(bArr, i10, bArr.length - i10);
                } else {
                    mVar.b(bArr, i10, bArr.length - i10);
                }
                arrayList.add(mVar);
                break;
            }
            try {
                u uVarA = a(a0Var);
                if (z10 || !(uVarA instanceof c)) {
                    uVarA.g(bArr, i11, iC);
                } else {
                    ((c) uVarA).b(bArr, i11, iC);
                }
                arrayList.add(uVarA);
                i10 += iC + 4;
            } catch (IllegalAccessException | InstantiationException e10) {
                throw new ZipException(e10.getMessage());
            }
        }
        return (u[]) arrayList.toArray(new u[arrayList.size()]);
    }

    public static void g(Class<?> cls) {
        try {
            f137393b.put(((u) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).d(), cls);
        } catch (ClassCastException unused) {
            throw new RuntimeException(cls + " doesn't implement ZipExtraField");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException(cls + "'s no-arg constructor is not public");
        } catch (InstantiationException unused3) {
            throw new RuntimeException(cls + " is not a concrete class");
        } catch (NoSuchMethodException unused4) {
            throw new RuntimeException(cls + "'s no-arg constructor not found");
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(cls + "'s no-arg constructor threw an exception:" + e10.getMessage());
        }
    }
}
