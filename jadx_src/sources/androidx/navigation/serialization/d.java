package androidx.navigation.serialization;

import androidx.navigation.m0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.r;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;
import kotlinx.serialization.internal.s;
import kotlinx.serialization.t;

/* JADX INFO: compiled from: NavTypeConverter.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: compiled from: NavTypeConverter.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25271a;

        static {
            int[] iArr = new int[InternalType.values().length];
            try {
                iArr[InternalType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalType.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InternalType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InternalType.LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InternalType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InternalType.STRING_NULLABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InternalType.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InternalType.INT_NULLABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InternalType.BOOL_NULLABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[InternalType.DOUBLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[InternalType.DOUBLE_NULLABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[InternalType.FLOAT_NULLABLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[InternalType.LONG_NULLABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[InternalType.INT_ARRAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[InternalType.BOOL_ARRAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[InternalType.DOUBLE_ARRAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[InternalType.FLOAT_ARRAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[InternalType.LONG_ARRAY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[InternalType.ARRAY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[InternalType.LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[InternalType.ENUM_NULLABLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            f25271a = iArr;
        }
    }

    private static final Class<?> a(kotlinx.serialization.descriptors.f fVar) {
        String strL2 = u.l2(fVar.j(), "?", "", false, 4, null);
        try {
            Class<?> cls = Class.forName(strL2);
            f0.o(cls, "forName(className)");
            return cls;
        } catch (ClassNotFoundException unused) {
            if (StringsKt__StringsKt.W2(strL2, ".", false, 2, null)) {
                Class<?> cls2 = Class.forName(new Regex("(\\.+)(?!.*\\.)").m(strL2, "\\$"));
                f0.o(cls2, "forName(className)");
                return cls2;
            }
            throw new IllegalArgumentException("Cannot find class with name \"" + fVar.j() + "\". Ensure that the serialName for this argument is the default fully qualified name");
        }
    }

    @dl.d
    public static final m0<?> b(@dl.d kotlinx.serialization.descriptors.f fVar) {
        f0.p(fVar, "<this>");
        InternalType internalTypeD = d(fVar);
        int[] iArr = a.f25271a;
        switch (iArr[internalTypeD.ordinal()]) {
            case 1:
                return m0.f25185d;
            case 2:
                return m0.f25195n;
            case 3:
                return m0.f25192k;
            case 4:
                return m0.f25189h;
            case 5:
                return c.f25256a.i();
            case 6:
                return m0.f25198q;
            case 7:
                m0<?> m0VarD = m0.f25184c.d(a(fVar), false);
                return m0VarD == null ? i.f25283t : m0VarD;
            case 8:
                return c.f25256a.g();
            case 9:
                return c.f25256a.a();
            case 10:
                return c.f25256a.e();
            case 11:
                return c.f25256a.d();
            case 12:
                return c.f25256a.f();
            case 13:
                return c.f25256a.h();
            case 14:
                return m0.f25187f;
            case 15:
                return m0.f25196o;
            case 16:
                return c.f25256a.b();
            case 17:
                return m0.f25193l;
            case 18:
                return m0.f25190i;
            case 19:
                return d(fVar.e(0)) == InternalType.STRING ? m0.f25199r : i.f25283t;
            case 20:
                switch (iArr[d(fVar.e(0)).ordinal()]) {
                    case 1:
                        return m0.f25188g;
                    case 2:
                        return m0.f25197p;
                    case 3:
                        return m0.f25194m;
                    case 4:
                        return m0.f25191j;
                    case 5:
                        return m0.f25200s;
                    case 6:
                        return c.f25256a.k();
                    case 7:
                        Class<?> clsA = a(fVar.e(0));
                        f0.n(clsA, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
                        return new c.f(clsA);
                    default:
                        return i.f25283t;
                }
            case 21:
                Class<?> clsA2 = a(fVar);
                if (!Enum.class.isAssignableFrom(clsA2)) {
                    return i.f25283t;
                }
                f0.n(clsA2, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>?>");
                return new c.g(clsA2);
            default:
                return i.f25283t;
        }
    }

    public static final boolean c(@dl.d kotlinx.serialization.descriptors.f fVar, @dl.d r kType) {
        f0.p(fVar, "<this>");
        f0.p(kType, "kType");
        if (fVar.c() != kType.p()) {
            return false;
        }
        kotlinx.serialization.g<Object> gVarP = t.p(kType);
        if (gVarP != null) {
            return f0.g(fVar, gVarP.a());
        }
        throw new IllegalStateException("Custom serializers declared directly on a class field via @Serializable(with = ...) is currently not supported by safe args for both custom types and third-party types. Please use @Serializable or @Serializable(with = ...) on the class or object declaration.".toString());
    }

    private static final InternalType d(kotlinx.serialization.descriptors.f fVar) {
        String strL2 = u.l2(fVar.j(), "?", "", false, 4, null);
        if (f0.g(fVar.b(), kotlinx.serialization.descriptors.h.b.f130590a)) {
            return fVar.c() ? InternalType.ENUM_NULLABLE : InternalType.ENUM;
        }
        if (f0.g(strL2, "kotlin.Int")) {
            return fVar.c() ? InternalType.INT_NULLABLE : InternalType.INT;
        }
        if (f0.g(strL2, "kotlin.Boolean")) {
            return fVar.c() ? InternalType.BOOL_NULLABLE : InternalType.BOOL;
        }
        if (f0.g(strL2, "kotlin.Double")) {
            return fVar.c() ? InternalType.DOUBLE_NULLABLE : InternalType.DOUBLE;
        }
        if (f0.g(strL2, "kotlin.Double")) {
            return InternalType.DOUBLE;
        }
        if (f0.g(strL2, "kotlin.Float")) {
            return fVar.c() ? InternalType.FLOAT_NULLABLE : InternalType.FLOAT;
        }
        if (f0.g(strL2, "kotlin.Long")) {
            return fVar.c() ? InternalType.LONG_NULLABLE : InternalType.LONG;
        }
        if (f0.g(strL2, "kotlin.String")) {
            return fVar.c() ? InternalType.STRING_NULLABLE : InternalType.STRING;
        }
        if (f0.g(strL2, "kotlin.IntArray")) {
            return InternalType.INT_ARRAY;
        }
        if (f0.g(strL2, "kotlin.DoubleArray")) {
            return InternalType.DOUBLE_ARRAY;
        }
        if (f0.g(strL2, "kotlin.BooleanArray")) {
            return InternalType.BOOL_ARRAY;
        }
        if (f0.g(strL2, "kotlin.FloatArray")) {
            return InternalType.FLOAT_ARRAY;
        }
        if (f0.g(strL2, "kotlin.LongArray")) {
            return InternalType.LONG_ARRAY;
        }
        if (f0.g(strL2, s.f130755a)) {
            return InternalType.ARRAY;
        }
        return u.v2(strL2, s.f130756b, false, 2, null) ? InternalType.LIST : InternalType.UNKNOWN;
    }
}
