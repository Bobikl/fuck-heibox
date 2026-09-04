package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: AbstractTypeParameterDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d extends j implements y0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Variance f125685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f125686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f125687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.h<z0> f125688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.h<j0> f125689j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.m f125690k;

    /* JADX INFO: compiled from: AbstractTypeParameterDescriptor.java */
    public class a implements yh.a<z0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.m f125691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f125692c;

        a(kotlin.reflect.jvm.internal.impl.storage.m mVar, w0 w0Var) {
            this.f125691b = mVar;
            this.f125692c = w0Var;
        }

        @Override // yh.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z0 invoke() {
            return new c(d.this, this.f125691b, this.f125692c);
        }
    }

    /* JADX INFO: compiled from: AbstractTypeParameterDescriptor.java */
    public class b implements yh.a<j0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f125694b;

        /* JADX INFO: compiled from: AbstractTypeParameterDescriptor.java */
        public class a implements yh.a<MemberScope> {
            a() {
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MemberScope invoke() {
                return TypeIntersectionScope.k("Scope for type parameter " + b.this.f125694b.b(), d.this.getUpperBounds());
            }
        }

        b(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            this.f125694b = fVar;
        }

        @Override // yh.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 invoke() {
            return KotlinTypeFactory.m(kotlin.reflect.jvm.internal.impl.types.w0.f128193c.h(), d.this.r(), Collections.emptyList(), false, new LazyScopeAdapter(new a()));
        }
    }

    /* JADX INFO: compiled from: AbstractTypeParameterDescriptor.java */
    public class c extends AbstractTypeConstructor {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final w0 f125697d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f125698e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@dl.d d dVar, kotlin.reflect.jvm.internal.impl.storage.m mVar, w0 w0Var) {
            super(mVar);
            if (mVar == null) {
                v(0);
            }
            this.f125698e = dVar;
            this.f125697d = w0Var;
        }

        private static /* synthetic */ void v(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.k, kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        public kotlin.reflect.jvm.internal.impl.descriptors.f d() {
            d dVar = this.f125698e;
            if (dVar == null) {
                v(3);
            }
            return dVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        public boolean e() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        public List<y0> getParameters() {
            List<y0> listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                v(2);
            }
            return listEmptyList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.k
        protected boolean h(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
            if (fVar == null) {
                v(9);
            }
            return (fVar instanceof y0) && DescriptorEquivalenceForOverrides.f127482a.h(this.f125698e, (y0) fVar, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @dl.d
        protected Collection<kotlin.reflect.jvm.internal.impl.types.d0> k() {
            List<kotlin.reflect.jvm.internal.impl.types.d0> listM0 = this.f125698e.M0();
            if (listM0 == null) {
                v(1);
            }
            return listM0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @dl.e
        protected kotlin.reflect.jvm.internal.impl.types.d0 m() {
            return kotlin.reflect.jvm.internal.impl.types.error.h.d(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @dl.d
        protected w0 p() {
            w0 w0Var = this.f125697d;
            if (w0Var == null) {
                v(5);
            }
            return w0Var;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @dl.d
        protected List<kotlin.reflect.jvm.internal.impl.types.d0> r(@dl.d List<kotlin.reflect.jvm.internal.impl.types.d0> list) {
            if (list == null) {
                v(7);
            }
            List<kotlin.reflect.jvm.internal.impl.types.d0> listK0 = this.f125698e.K0(list);
            if (listK0 == null) {
                v(8);
            }
            return listK0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        public kotlin.reflect.jvm.internal.impl.builtins.g t() {
            kotlin.reflect.jvm.internal.impl.builtins.g gVarJ = DescriptorUtilsKt.j(this.f125698e);
            if (gVarJ == null) {
                v(4);
            }
            return gVarJ;
        }

        public String toString() {
            return this.f125698e.getName().toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected void u(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
            if (d0Var == null) {
                v(6);
            }
            this.f125698e.L0(d0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected d(@dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d Variance variance, boolean z10, int i10, @dl.d t0 t0Var, @dl.d w0 w0Var) {
        super(kVar, eVar, fVar, t0Var);
        if (mVar == null) {
            Z(0);
        }
        if (kVar == null) {
            Z(1);
        }
        if (eVar == null) {
            Z(2);
        }
        if (fVar == null) {
            Z(3);
        }
        if (variance == null) {
            Z(4);
        }
        if (t0Var == null) {
            Z(5);
        }
        if (w0Var == null) {
            Z(6);
        }
        this.f125685f = variance;
        this.f125686g = z10;
        this.f125687h = i10;
        this.f125688i = mVar.c(new a(mVar, w0Var));
        this.f125689j = mVar.c(new b(fVar));
        this.f125690k = mVar;
    }

    private static /* synthetic */ void Z(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y0
    public boolean I() {
        return false;
    }

    @dl.d
    protected List<kotlin.reflect.jvm.internal.impl.types.d0> K0(@dl.d List<kotlin.reflect.jvm.internal.impl.types.d0> list) {
        if (list == null) {
            Z(12);
        }
        if (list == null) {
            Z(13);
        }
        return list;
    }

    protected abstract void L0(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 d0Var);

    @dl.d
    protected abstract List<kotlin.reflect.jvm.internal.impl.types.d0> M0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @dl.d
    public y0 a() {
        y0 y0Var = (y0) super.a();
        if (y0Var == null) {
            Z(11);
        }
        return y0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R c0(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> mVar, D d10) {
        return mVar.h(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y0
    public int getIndex() {
        return this.f125687h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y0
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.types.d0> getUpperBounds() {
        List<kotlin.reflect.jvm.internal.impl.types.d0> listL = ((c) r()).l();
        if (listL == null) {
            Z(8);
        }
        return listL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.storage.m j0() {
        kotlin.reflect.jvm.internal.impl.storage.m mVar = this.f125690k;
        if (mVar == null) {
            Z(14);
        }
        return mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y0
    public boolean k() {
        return this.f125686g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y0
    @dl.d
    public Variance n() {
        Variance variance = this.f125685f;
        if (variance == null) {
            Z(7);
        }
        return variance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y0, kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    public final z0 r() {
        z0 z0VarInvoke = this.f125688i.invoke();
        if (z0VarInvoke == null) {
            Z(9);
        }
        return z0VarInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    public j0 v() {
        j0 j0VarInvoke = this.f125689j.invoke();
        if (j0VarInvoke == null) {
            Z(10);
        }
        return j0VarInvoke;
    }
}
