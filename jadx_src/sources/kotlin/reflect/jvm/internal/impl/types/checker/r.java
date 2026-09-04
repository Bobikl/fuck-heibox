package kotlin.reflect.jvm.internal.impl.types.checker;

import com.umeng.analytics.pro.ak;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: TypeCheckerProcedureCallbacksImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class r implements t {
    r() {
    }

    private static /* synthetic */ void b(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = ak.av;
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i10) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.t
    public boolean a(@dl.d z0 z0Var, @dl.d z0 z0Var2) {
        if (z0Var == null) {
            b(3);
        }
        if (z0Var2 == null) {
            b(4);
        }
        return z0Var.equals(z0Var2);
    }
}
