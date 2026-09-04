package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeProjectionImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class e1 extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Variance f128101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f128102b;

    public e1(@dl.d Variance variance, @dl.d d0 d0Var) {
        if (variance == null) {
            d(0);
        }
        if (d0Var == null) {
            d(1);
        }
        this.f128101a = variance;
        this.f128102b = d0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e1(@dl.d d0 d0Var) {
        this(Variance.INVARIANT, d0Var);
        if (d0Var == null) {
            d(2);
        }
    }

    private static /* synthetic */ void d(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c1
    @dl.d
    public c1 a(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
        if (fVar == null) {
            d(6);
        }
        return new e1(this.f128101a, fVar.a(this.f128102b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c1
    public boolean b() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c1
    @dl.d
    public Variance c() {
        Variance variance = this.f128101a;
        if (variance == null) {
            d(4);
        }
        return variance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c1
    @dl.d
    public d0 getType() {
        d0 d0Var = this.f128102b;
        if (d0Var == null) {
            d(5);
        }
        return d0Var;
    }
}
