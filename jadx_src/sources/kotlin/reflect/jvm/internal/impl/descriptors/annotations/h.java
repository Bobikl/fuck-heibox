package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final e f125605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f125606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final l<kotlin.reflect.jvm.internal.impl.name.c, Boolean> f125607d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@dl.d e delegate, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.c, Boolean> fqNameFilter) {
        this(delegate, false, fqNameFilter);
        f0.p(delegate, "delegate");
        f0.p(fqNameFilter, "fqNameFilter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@dl.d e delegate, boolean z10, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.c, Boolean> fqNameFilter) {
        f0.p(delegate, "delegate");
        f0.p(fqNameFilter, "fqNameFilter");
        this.f125605b = delegate;
        this.f125606c = z10;
        this.f125607d = fqNameFilter;
    }

    private final boolean a(c cVar) {
        kotlin.reflect.jvm.internal.impl.name.c cVarE = cVar.e();
        return cVarE != null && this.f125607d.invoke(cVarE).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    public boolean J1(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        if (this.f125607d.invoke(fqName).booleanValue()) {
            return this.f125605b.J1(fqName);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    public boolean isEmpty() {
        boolean z10;
        e eVar = this.f125605b;
        if (!(eVar instanceof Collection) || !((Collection) eVar).isEmpty()) {
            Iterator<c> it = eVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                if (a(it.next())) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (this.f125606c) {
            return !z10;
        }
        return z10;
    }

    @Override // java.lang.Iterable
    @dl.d
    public Iterator<c> iterator() {
        e eVar = this.f125605b;
        ArrayList arrayList = new ArrayList();
        for (c cVar : eVar) {
            if (a(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    @dl.e
    public c k(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        if (this.f125607d.invoke(fqName).booleanValue()) {
            return this.f125605b.k(fqName);
        }
        return null;
    }
}
