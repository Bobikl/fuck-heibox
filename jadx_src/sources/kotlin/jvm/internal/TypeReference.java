package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.KVariance;

/* JADX INFO: compiled from: TypeReference.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.u0(version = "1.4")
public final class TypeReference implements kotlin.reflect.r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f124893f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f124894g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f124895h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f124896i = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.g f124897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<kotlin.reflect.t> f124898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final kotlin.reflect.r f124899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f124900e;

    /* JADX INFO: compiled from: TypeReference.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: TypeReference.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124902a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f124902a = iArr;
        }
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136930u)
    public TypeReference(@dl.d kotlin.reflect.g classifier, @dl.d List<kotlin.reflect.t> arguments, @dl.e kotlin.reflect.r rVar, int i10) {
        f0.p(classifier, "classifier");
        f0.p(arguments, "arguments");
        this.f124897b = classifier;
        this.f124898c = arguments;
        this.f124899d = rVar;
        this.f124900e = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeReference(@dl.d kotlin.reflect.g classifier, @dl.d List<kotlin.reflect.t> arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        f0.p(classifier, "classifier");
        f0.p(arguments, "arguments");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(kotlin.reflect.t tVar) {
        String strValueOf;
        if (tVar.h() == null) {
            return androidx.webkit.b.f28327e;
        }
        kotlin.reflect.r rVarG = tVar.g();
        TypeReference typeReference = rVarG instanceof TypeReference ? (TypeReference) rVarG : null;
        if (typeReference == null || (strValueOf = typeReference.j(true)) == null) {
            strValueOf = String.valueOf(tVar.g());
        }
        int i10 = b.f124902a[tVar.h().ordinal()];
        if (i10 == 1) {
            return strValueOf;
        }
        if (i10 == 2) {
            return "in " + strValueOf;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + strValueOf;
    }

    private final String j(boolean z10) {
        String name;
        kotlin.reflect.g gVarO = o();
        kotlin.reflect.d dVar = gVarO instanceof kotlin.reflect.d ? (kotlin.reflect.d) gVarO : null;
        Class<?> clsE = dVar != null ? xh.a.e(dVar) : null;
        if (clsE == null) {
            name = o().toString();
        } else if ((this.f124900e & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsE.isArray()) {
            name = k(clsE);
        } else if (z10 && clsE.isPrimitive()) {
            kotlin.reflect.g gVarO2 = o();
            f0.n(gVarO2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = xh.a.g((kotlin.reflect.d) gVarO2).getName();
        } else {
            name = clsE.getName();
        }
        String str = name + (d().isEmpty() ? "" : CollectionsKt___CollectionsKt.h3(d(), ", ", "<", ">", 0, null, new yh.l<kotlin.reflect.t, CharSequence>() { // from class: kotlin.jvm.internal.TypeReference$asString$args$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@dl.d kotlin.reflect.t it) {
                f0.p(it, "it");
                return this.f124901b.i(it);
            }
        }, 24, null)) + (p() ? "?" : "");
        kotlin.reflect.r rVar = this.f124899d;
        if (!(rVar instanceof TypeReference)) {
            return str;
        }
        String strJ = ((TypeReference) rVar).j(true);
        if (f0.g(strJ, str)) {
            return str;
        }
        if (f0.g(strJ, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strJ + ')';
    }

    private final String k(Class<?> cls) {
        if (f0.g(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (f0.g(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (f0.g(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (f0.g(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (f0.g(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (f0.g(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (f0.g(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        return f0.g(cls, double[].class) ? "kotlin.DoubleArray" : kotlinx.serialization.internal.s.f130755a;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136930u)
    public static /* synthetic */ void q() {
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136930u)
    public static /* synthetic */ void w() {
    }

    @Override // kotlin.reflect.r
    @dl.d
    public List<kotlin.reflect.t> d() {
        return this.f124898c;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof TypeReference) {
            TypeReference typeReference = (TypeReference) obj;
            if (f0.g(o(), typeReference.o()) && f0.g(d(), typeReference.d()) && f0.g(this.f124899d, typeReference.f124899d) && this.f124900e == typeReference.f124900e) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.b
    @dl.d
    public List<Annotation> getAnnotations() {
        return CollectionsKt__CollectionsKt.E();
    }

    public int hashCode() {
        return (((o().hashCode() * 31) + d().hashCode()) * 31) + this.f124900e;
    }

    public final int n() {
        return this.f124900e;
    }

    @Override // kotlin.reflect.r
    @dl.d
    public kotlin.reflect.g o() {
        return this.f124897b;
    }

    @Override // kotlin.reflect.r
    public boolean p() {
        return (this.f124900e & 1) != 0;
    }

    @dl.e
    public final kotlin.reflect.r r() {
        return this.f124899d;
    }

    @dl.d
    public String toString() {
        return j(false) + " (Kotlin reflection is not available)";
    }
}
