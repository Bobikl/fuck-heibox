package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import si.i;

/* JADX INFO: compiled from: ValueClassRepresentation.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class z0<Type extends si.i> {
    private z0() {
    }

    public /* synthetic */ z0(kotlin.jvm.internal.u uVar) {
        this();
    }

    @dl.d
    public abstract List<Pair<kotlin.reflect.jvm.internal.impl.name.f, Type>> a();

    @dl.d
    public final <Other extends si.i> z0<Other> b(@dl.d yh.l<? super Type, ? extends Other> transform) {
        kotlin.jvm.internal.f0.p(transform, "transform");
        if (this instanceof x) {
            x xVar = (x) this;
            return new x(xVar.c(), transform.invoke(xVar.d()));
        }
        if (!(this instanceof e0)) {
            throw new NoWhenBranchMatchedException();
        }
        List<Pair<kotlin.reflect.jvm.internal.impl.name.f, Type>> listA = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(kotlin.c1.a((kotlin.reflect.jvm.internal.impl.name.f) pair.a(), transform.invoke((si.i) pair.b())));
        }
        return new e0(arrayList);
    }
}
