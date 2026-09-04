package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import mi.j;
import mi.y;

/* JADX INFO: compiled from: LazyJavaTypeParameterDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.descriptors.impl.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.d f126255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final y f126256m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10, @dl.d y javaTypeParameter, int i10, @dl.d k containingDeclaration) {
        super(c10.e(), containingDeclaration, new LazyJavaAnnotations(c10, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), Variance.INVARIANT, false, i10, t0.f125942a, c10.a().v());
        f0.p(c10, "c");
        f0.p(javaTypeParameter, "javaTypeParameter");
        f0.p(containingDeclaration, "containingDeclaration");
        this.f126255l = c10;
        this.f126256m = javaTypeParameter;
    }

    private final List<d0> N0() {
        Collection<j> upperBounds = this.f126256m.getUpperBounds();
        if (upperBounds.isEmpty()) {
            j0 j0VarI = this.f126255l.d().t().i();
            f0.o(j0VarI, "c.module.builtIns.anyType");
            j0 j0VarI2 = this.f126255l.d().t().I();
            f0.o(j0VarI2, "c.module.builtIns.nullableAnyType");
            return s.k(KotlinTypeFactory.d(j0VarI, j0VarI2));
        }
        ArrayList arrayList = new ArrayList(t.Y(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f126255l.g().o((j) it.next(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(TypeUsage.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d
    @dl.d
    protected List<d0> K0(@dl.d List<? extends d0> bounds) {
        f0.p(bounds, "bounds");
        return this.f126255l.a().r().i(this, bounds, this.f126255l);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d
    protected void L0(@dl.d d0 type) {
        f0.p(type, "type");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d
    @dl.d
    protected List<d0> M0() {
        return N0();
    }
}
