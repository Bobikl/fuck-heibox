package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: TypeParameterDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class g0 extends d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private final yh.l<kotlin.reflect.jvm.internal.impl.types.d0, Void> f125711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<kotlin.reflect.jvm.internal.impl.types.d0> f125712m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f125713n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private g0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, boolean z10, @dl.d Variance variance, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, int i10, @dl.d t0 t0Var, @dl.e yh.l<kotlin.reflect.jvm.internal.impl.types.d0, Void> lVar, @dl.d w0 w0Var, @dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar) {
        super(mVar, kVar, eVar, fVar, variance, z10, i10, t0Var, w0Var);
        if (kVar == null) {
            Z(19);
        }
        if (eVar == null) {
            Z(20);
        }
        if (variance == null) {
            Z(21);
        }
        if (fVar == null) {
            Z(22);
        }
        if (t0Var == null) {
            Z(23);
        }
        if (w0Var == null) {
            Z(24);
        }
        if (mVar == null) {
            Z(25);
        }
        this.f125712m = new ArrayList(1);
        this.f125713n = false;
        this.f125711l = lVar;
    }

    private void O0() {
        if (this.f125713n) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + V0());
    }

    private void P0() {
        if (this.f125713n) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + V0());
        }
    }

    public static g0 Q0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, boolean z10, @dl.d Variance variance, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, int i10, @dl.d t0 t0Var, @dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar) {
        if (kVar == null) {
            Z(6);
        }
        if (eVar == null) {
            Z(7);
        }
        if (variance == null) {
            Z(8);
        }
        if (fVar == null) {
            Z(9);
        }
        if (t0Var == null) {
            Z(10);
        }
        if (mVar == null) {
            Z(11);
        }
        return R0(kVar, eVar, z10, variance, fVar, i10, t0Var, null, w0.a.f125944a, mVar);
    }

    public static g0 R0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, boolean z10, @dl.d Variance variance, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, int i10, @dl.d t0 t0Var, @dl.e yh.l<kotlin.reflect.jvm.internal.impl.types.d0, Void> lVar, @dl.d w0 w0Var, @dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar) {
        if (kVar == null) {
            Z(12);
        }
        if (eVar == null) {
            Z(13);
        }
        if (variance == null) {
            Z(14);
        }
        if (fVar == null) {
            Z(15);
        }
        if (t0Var == null) {
            Z(16);
        }
        if (w0Var == null) {
            Z(17);
        }
        if (mVar == null) {
            Z(18);
        }
        return new g0(kVar, eVar, z10, variance, fVar, i10, t0Var, lVar, w0Var, mVar);
    }

    @dl.d
    public static y0 S0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, boolean z10, @dl.d Variance variance, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, int i10, @dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar) {
        if (kVar == null) {
            Z(0);
        }
        if (eVar == null) {
            Z(1);
        }
        if (variance == null) {
            Z(2);
        }
        if (fVar == null) {
            Z(3);
        }
        if (mVar == null) {
            Z(4);
        }
        g0 g0VarQ0 = Q0(kVar, eVar, z10, variance, fVar, i10, t0.f125942a, mVar);
        g0VarQ0.N0(DescriptorUtilsKt.j(kVar).y());
        g0VarQ0.W0();
        return g0VarQ0;
    }

    private void T0(kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        if (kotlin.reflect.jvm.internal.impl.types.e0.a(d0Var)) {
            return;
        }
        this.f125712m.add(d0Var);
    }

    private String V0() {
        return getName() + " declared in " + kotlin.reflect.jvm.internal.impl.resolve.d.m(c());
    }

    private static /* synthetic */ void Z(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d
    protected void L0(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        if (d0Var == null) {
            Z(27);
        }
        yh.l<kotlin.reflect.jvm.internal.impl.types.d0, Void> lVar = this.f125711l;
        if (lVar == null) {
            return;
        }
        lVar.invoke(d0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d
    @dl.d
    protected List<kotlin.reflect.jvm.internal.impl.types.d0> M0() {
        O0();
        List<kotlin.reflect.jvm.internal.impl.types.d0> list = this.f125712m;
        if (list == null) {
            Z(28);
        }
        return list;
    }

    public void N0(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        if (d0Var == null) {
            Z(26);
        }
        P0();
        T0(d0Var);
    }

    public boolean U0() {
        return this.f125713n;
    }

    public void W0() {
        P0();
        this.f125713n = true;
    }
}
