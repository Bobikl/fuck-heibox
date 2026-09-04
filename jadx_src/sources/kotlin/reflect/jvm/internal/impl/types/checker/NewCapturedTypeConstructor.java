package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.z;

/* JADX INFO: compiled from: NewCapturedType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class NewCapturedTypeConstructor implements kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final c1 f128057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private yh.a<? extends List<? extends l1>> f128058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final NewCapturedTypeConstructor f128059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final y0 f128060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final z f128061e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor(@dl.d c1 projection, @dl.d final List<? extends l1> supertypes, @dl.e NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this(projection, new yh.a<List<? extends l1>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends l1> invoke() {
                return supertypes;
            }
        }, newCapturedTypeConstructor, null, 8, null);
        f0.p(projection, "projection");
        f0.p(supertypes, "supertypes");
    }

    public /* synthetic */ NewCapturedTypeConstructor(c1 c1Var, List list, NewCapturedTypeConstructor newCapturedTypeConstructor, int i10, kotlin.jvm.internal.u uVar) {
        this(c1Var, list, (i10 & 4) != 0 ? null : newCapturedTypeConstructor);
    }

    public NewCapturedTypeConstructor(@dl.d c1 projection, @dl.e yh.a<? extends List<? extends l1>> aVar, @dl.e NewCapturedTypeConstructor newCapturedTypeConstructor, @dl.e y0 y0Var) {
        f0.p(projection, "projection");
        this.f128057a = projection;
        this.f128058b = aVar;
        this.f128059c = newCapturedTypeConstructor;
        this.f128060d = y0Var;
        this.f128061e = b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<List<? extends l1>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$_supertypes$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            public final List<? extends l1> invoke() {
                yh.a aVar2 = this.f128063b.f128058b;
                if (aVar2 != null) {
                    return (List) aVar2.invoke();
                }
                return null;
            }
        });
    }

    public /* synthetic */ NewCapturedTypeConstructor(c1 c1Var, yh.a aVar, NewCapturedTypeConstructor newCapturedTypeConstructor, y0 y0Var, int i10, kotlin.jvm.internal.u uVar) {
        this(c1Var, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : newCapturedTypeConstructor, (i10 & 8) != 0 ? null : y0Var);
    }

    private final List<l1> h() {
        return (List) this.f128061e.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b
    @dl.d
    public c1 c() {
        return this.f128057a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    public boolean e() {
        return false;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f0.g(NewCapturedTypeConstructor.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        f0.n(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.f128059c;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = this;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.f128059c;
        if (newCapturedTypeConstructor3 != null) {
            newCapturedTypeConstructor = newCapturedTypeConstructor3;
        }
        return newCapturedTypeConstructor2 == newCapturedTypeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public List<l1> l() {
        List<l1> listH = h();
        return listH == null ? CollectionsKt__CollectionsKt.E() : listH;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public List<y0> getParameters() {
        return CollectionsKt__CollectionsKt.E();
    }

    public int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f128059c;
        return newCapturedTypeConstructor != null ? newCapturedTypeConstructor.hashCode() : super.hashCode();
    }

    public final void i(@dl.d final List<? extends l1> supertypes) {
        f0.p(supertypes, "supertypes");
        this.f128058b = new yh.a<List<? extends l1>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$initializeSupertypes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends l1> invoke() {
                return supertypes;
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public NewCapturedTypeConstructor a(@dl.d final f kotlinTypeRefiner) {
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        c1 c1VarA = c().a(kotlinTypeRefiner);
        f0.o(c1VarA, "projection.refine(kotlinTypeRefiner)");
        yh.a<List<? extends l1>> aVar = this.f128058b != null ? new yh.a<List<? extends l1>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$refine$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends l1> invoke() {
                List<l1> listL = this.f128065b.l();
                f fVar = kotlinTypeRefiner;
                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listL, 10));
                Iterator<T> it = listL.iterator();
                while (it.hasNext()) {
                    arrayList.add(((l1) it.next()).Y0(fVar));
                }
                return arrayList;
            }
        } : null;
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f128059c;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(c1VarA, aVar, newCapturedTypeConstructor, this.f128060d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.builtins.g t() {
        d0 type = c().getType();
        f0.o(type, "projection.type");
        return TypeUtilsKt.i(type);
    }

    @dl.d
    public String toString() {
        return "CapturedType(" + c() + ')';
    }
}
