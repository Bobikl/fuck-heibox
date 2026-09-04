package kotlin.reflect.jvm.internal.impl.builtins.functions;

import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.builtins.h;
import kotlin.reflect.jvm.internal.impl.name.f;
import xh.m;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'KFunction' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: FunctionClassKind.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class FunctionClassKind {
    private static final /* synthetic */ FunctionClassKind[] $VALUES;

    @dl.d
    public static final a Companion;
    public static final FunctionClassKind KFunction;
    public static final FunctionClassKind KSuspendFunction;

    @dl.d
    private final String classNamePrefix;
    private final boolean isReflectType;
    private final boolean isSuspendType;

    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.c packageFqName;
    public static final FunctionClassKind Function = new FunctionClassKind("Function", 0, h.f125412u, "Function", false, false);
    public static final FunctionClassKind SuspendFunction = new FunctionClassKind("SuspendFunction", 1, h.f125404m, "SuspendFunction", true, false);

    /* JADX INFO: compiled from: FunctionClassKind.kt */
    public static final class a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FunctionClassKind.kt */
        public static final class C1139a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            private final FunctionClassKind f125359a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f125360b;

            public C1139a(@dl.d FunctionClassKind kind, int i10) {
                f0.p(kind, "kind");
                this.f125359a = kind;
                this.f125360b = i10;
            }

            @dl.d
            public final FunctionClassKind a() {
                return this.f125359a;
            }

            public final int b() {
                return this.f125360b;
            }

            @dl.d
            public final FunctionClassKind c() {
                return this.f125359a;
            }

            public boolean equals(@e Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1139a)) {
                    return false;
                }
                C1139a c1139a = (C1139a) obj;
                return this.f125359a == c1139a.f125359a && this.f125360b == c1139a.f125360b;
            }

            public int hashCode() {
                return (this.f125359a.hashCode() * 31) + this.f125360b;
            }

            @dl.d
            public String toString() {
                return "KindWithArity(kind=" + this.f125359a + ", arity=" + this.f125360b + ')';
            }
        }

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        private final Integer d(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                int iCharAt = str.charAt(i11) - '0';
                if (!(iCharAt >= 0 && iCharAt < 10)) {
                    return null;
                }
                i10 = (i10 * 10) + iCharAt;
            }
            return Integer.valueOf(i10);
        }

        @e
        public final FunctionClassKind a(@dl.d kotlin.reflect.jvm.internal.impl.name.c packageFqName, @dl.d String className) {
            f0.p(packageFqName, "packageFqName");
            f0.p(className, "className");
            for (FunctionClassKind functionClassKind : FunctionClassKind.values()) {
                if (f0.g(functionClassKind.getPackageFqName(), packageFqName) && kotlin.text.u.v2(className, functionClassKind.getClassNamePrefix(), false, 2, null)) {
                    return functionClassKind;
                }
            }
            return null;
        }

        @e
        @m
        public final FunctionClassKind b(@dl.d String className, @dl.d kotlin.reflect.jvm.internal.impl.name.c packageFqName) {
            f0.p(className, "className");
            f0.p(packageFqName, "packageFqName");
            C1139a c1139aC = c(className, packageFqName);
            if (c1139aC != null) {
                return c1139aC.c();
            }
            return null;
        }

        @e
        public final C1139a c(@dl.d String className, @dl.d kotlin.reflect.jvm.internal.impl.name.c packageFqName) {
            f0.p(className, "className");
            f0.p(packageFqName, "packageFqName");
            FunctionClassKind functionClassKindA = a(packageFqName, className);
            if (functionClassKindA == null) {
                return null;
            }
            String strSubstring = className.substring(functionClassKindA.getClassNamePrefix().length());
            f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
            Integer numD = d(strSubstring);
            if (numD != null) {
                return new C1139a(functionClassKindA, numD.intValue());
            }
            return null;
        }
    }

    private static final /* synthetic */ FunctionClassKind[] $values() {
        return new FunctionClassKind[]{Function, SuspendFunction, KFunction, KSuspendFunction};
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = h.f125409r;
        KFunction = new FunctionClassKind("KFunction", 2, cVar, "KFunction", false, true);
        KSuspendFunction = new FunctionClassKind("KSuspendFunction", 3, cVar, "KSuspendFunction", true, true);
        $VALUES = $values();
        Companion = new a(null);
    }

    private FunctionClassKind(String str, int i10, kotlin.reflect.jvm.internal.impl.name.c cVar, String str2, boolean z10, boolean z11) {
        super(str, i10);
        this.packageFqName = cVar;
        this.classNamePrefix = str2;
        this.isSuspendType = z10;
        this.isReflectType = z11;
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) $VALUES.clone();
    }

    @dl.d
    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.c getPackageFqName() {
        return this.packageFqName;
    }

    @dl.d
    public final f numberedClassName(int i10) {
        f fVarF = f.f(this.classNamePrefix + i10);
        f0.o(fVarF, "identifier(\"$classNamePrefix$arity\")");
        return fVarF;
    }
}
