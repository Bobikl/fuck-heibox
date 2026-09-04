package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.meituan.robust.Constants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: methodSignatureMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l implements k<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final l f126548a = new l();

    /* JADX INFO: compiled from: methodSignatureMapping.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126549a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f126549a = iArr;
        }
    }

    private l() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.k
    @dl.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public j c(@dl.d j possiblyPrimitiveType) {
        f0.p(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof j.d)) {
            return possiblyPrimitiveType;
        }
        j.d dVar = (j.d) possiblyPrimitiveType;
        if (dVar.i() == null) {
            return possiblyPrimitiveType;
        }
        String strF = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.c(dVar.i().getWrapperFqName()).f();
        f0.o(strF, "byFqNameWithoutInnerClas…apperFqName).internalName");
        return f(strF);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.k
    @dl.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public j a(@dl.d String representation) {
        JvmPrimitiveType jvmPrimitiveType;
        j cVar;
        f0.p(representation, "representation");
        representation.length();
        char cCharAt = representation.charAt(0);
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i10];
            if (jvmPrimitiveType.getDesc().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (jvmPrimitiveType != null) {
            return new j.d(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new j.d(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
            cVar = new j.a(a(strSubstring));
        } else {
            if (cCharAt == 'L') {
                StringsKt__StringsKt.b3(representation, ';', false, 2, null);
            }
            String strSubstring2 = representation.substring(1, representation.length() - 1);
            f0.o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            cVar = new j.c(strSubstring2);
        }
        return cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.k
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public j.c f(@dl.d String internalName) {
        f0.p(internalName, "internalName");
        return new j.c(internalName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.k
    @dl.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public j d(@dl.d PrimitiveType primitiveType) {
        f0.p(primitiveType, "primitiveType");
        switch (a.f126549a[primitiveType.ordinal()]) {
            case 1:
                return j.f126536a.a();
            case 2:
                return j.f126536a.c();
            case 3:
                return j.f126536a.b();
            case 4:
                return j.f126536a.h();
            case 5:
                return j.f126536a.f();
            case 6:
                return j.f126536a.e();
            case 7:
                return j.f126536a.g();
            case 8:
                return j.f126536a.d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.k
    @dl.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public j b() {
        return f("java/lang/Class");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.k
    @dl.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String e(@dl.d j type) {
        String desc;
        f0.p(type, "type");
        if (type instanceof j.a) {
            return '[' + e(((j.a) type).i());
        }
        if (type instanceof j.d) {
            JvmPrimitiveType jvmPrimitiveTypeI = ((j.d) type).i();
            return (jvmPrimitiveTypeI == null || (desc = jvmPrimitiveTypeI.getDesc()) == null) ? androidx.exifinterface.media.a.X4 : desc;
        }
        if (!(type instanceof j.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return Constants.OBJECT_TYPE + ((j.c) type).i() + ';';
    }
}
