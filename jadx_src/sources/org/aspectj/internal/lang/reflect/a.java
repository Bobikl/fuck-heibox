package org.aspectj.internal.lang.reflect;

import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.aspectj.lang.reflect.AdviceKind;
import zj.x;

/* JADX INFO: compiled from: AdviceImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements zj.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f137588h = "org.aspectj.runtime.internal";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdviceKind f137589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f137590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x f137591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f137592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Type[] f137593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zj.c[] f137594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private zj.c[] f137595g;

    /* JADX INFO: renamed from: org.aspectj.internal.lang.reflect.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdviceImpl.java */
    public static /* synthetic */ class C1239a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f137596a;

        static {
            int[] iArr = new int[AdviceKind.values().length];
            f137596a = iArr;
            try {
                iArr[AdviceKind.AFTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137596a[AdviceKind.AFTER_RETURNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f137596a[AdviceKind.AFTER_THROWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f137596a[AdviceKind.AROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f137596a[AdviceKind.BEFORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    protected a(Method method, String str, AdviceKind adviceKind) {
        this.f137592d = false;
        this.f137589a = adviceKind;
        this.f137590b = method;
        this.f137591c = new n(str);
    }

    protected a(Method method, String str, AdviceKind adviceKind, String str2) {
        this(method, str, adviceKind);
        this.f137592d = true;
    }

    @Override // zj.a
    public zj.c a() {
        return zj.d.a(this.f137590b.getDeclaringClass());
    }

    @Override // zj.a
    public AdviceKind b() {
        return this.f137589a;
    }

    @Override // zj.a
    public zj.c<?>[] c() {
        if (this.f137594f == null) {
            Class<?>[] parameterTypes = this.f137590b.getParameterTypes();
            int i10 = 0;
            int i11 = 0;
            for (Class<?> cls : parameterTypes) {
                if (cls.getPackage().getName().equals(f137588h)) {
                    i11++;
                }
            }
            this.f137594f = new zj.c[parameterTypes.length - i11];
            while (true) {
                zj.c[] cVarArr = this.f137594f;
                if (i10 >= cVarArr.length) {
                    break;
                }
                cVarArr[i10] = zj.d.a(parameterTypes[i10]);
                i10++;
            }
        }
        return this.f137594f;
    }

    @Override // zj.a
    public x d() {
        return this.f137591c;
    }

    @Override // zj.a
    public zj.c<?>[] e() {
        if (this.f137595g == null) {
            Class<?>[] exceptionTypes = this.f137590b.getExceptionTypes();
            this.f137595g = new zj.c[exceptionTypes.length];
            for (int i10 = 0; i10 < exceptionTypes.length; i10++) {
                this.f137595g[i10] = zj.d.a(exceptionTypes[i10]);
            }
        }
        return this.f137595g;
    }

    @Override // zj.a
    public Type[] f() {
        if (this.f137593e == null) {
            Type[] genericParameterTypes = this.f137590b.getGenericParameterTypes();
            int i10 = 0;
            int i11 = 0;
            for (Type type : genericParameterTypes) {
                if ((type instanceof Class) && ((Class) type).getPackage().getName().equals(f137588h)) {
                    i11++;
                }
            }
            this.f137593e = new Type[genericParameterTypes.length - i11];
            while (true) {
                Type[] typeArr = this.f137593e;
                if (i10 >= typeArr.length) {
                    break;
                }
                Type type2 = genericParameterTypes[i10];
                if (type2 instanceof Class) {
                    typeArr[i10] = zj.d.a((Class) type2);
                } else {
                    typeArr[i10] = type2;
                }
                i10++;
            }
        }
        return this.f137593e;
    }

    @Override // zj.a
    public String getName() {
        String name = this.f137590b.getName();
        if (!name.startsWith("ajc$")) {
            return name;
        }
        xj.a aVar = (xj.a) this.f137590b.getAnnotation(xj.a.class);
        return aVar != null ? aVar.value() : "";
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8 A[SYNTHETIC] */
    public String toString() {
        zj.c<?>[] cVarArrE;
        StringBuffer stringBuffer = new StringBuffer();
        if (getName().length() > 0) {
            stringBuffer.append("@AdviceName(\"");
            stringBuffer.append(getName());
            stringBuffer.append("\") ");
        }
        if (b() == AdviceKind.AROUND) {
            stringBuffer.append(this.f137590b.getGenericReturnType().toString());
            stringBuffer.append(" ");
        }
        int i10 = C1239a.f137596a[b().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            stringBuffer.append("after(");
        } else if (i10 == 4) {
            stringBuffer.append("around(");
        } else if (i10 == 5) {
            stringBuffer.append("before(");
        }
        zj.c<?>[] cVarArrC = c();
        int length = cVarArrC.length;
        if (this.f137592d) {
            length--;
        }
        int i11 = 0;
        int i12 = 0;
        while (i12 < length) {
            stringBuffer.append(cVarArrC[i12].getName());
            i12++;
            if (i12 < length) {
                stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        stringBuffer.append(") ");
        int i13 = C1239a.f137596a[b().ordinal()];
        if (i13 != 2) {
            if (i13 == 3) {
            }
            cVarArrE = e();
            if (cVarArrE.length > 0) {
                stringBuffer.append("throws ");
                while (i11 < cVarArrE.length) {
                    stringBuffer.append(cVarArrE[i11].getName());
                    i11++;
                    if (i11 < cVarArrE.length) {
                        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                stringBuffer.append(" ");
            }
            stringBuffer.append(": ");
            stringBuffer.append(d().a());
            return stringBuffer.toString();
        }
        stringBuffer.append("returning");
        if (this.f137592d) {
            stringBuffer.append("(");
            stringBuffer.append(cVarArrC[length - 1].getName());
            stringBuffer.append(") ");
        }
        stringBuffer.append("throwing");
        if (this.f137592d) {
            stringBuffer.append("(");
            stringBuffer.append(cVarArrC[length - 1].getName());
            stringBuffer.append(") ");
        }
        cVarArrE = e();
        if (cVarArrE.length > 0) {
            stringBuffer.append("throws ");
            while (i11 < cVarArrE.length) {
                stringBuffer.append(cVarArrE[i11].getName());
                i11++;
                if (i11 < cVarArrE.length) {
                    stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
            stringBuffer.append(" ");
        }
        stringBuffer.append(": ");
        stringBuffer.append(d().a());
        return stringBuffer.toString();
    }
}
