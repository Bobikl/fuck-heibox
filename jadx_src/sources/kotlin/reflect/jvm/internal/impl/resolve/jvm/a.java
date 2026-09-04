package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.name.f;

/* JADX INFO: compiled from: SyntheticJavaPartsProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<e> f127566b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@dl.d List<? extends e> inner) {
        f0.p(inner, "inner");
        this.f127566b = inner;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    public void a(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d thisDescriptor, @dl.d List<kotlin.reflect.jvm.internal.impl.descriptors.c> result) {
        f0.p(dVar, "<this>");
        f0.p(thisDescriptor, "thisDescriptor");
        f0.p(result, "result");
        Iterator<T> it = this.f127566b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(dVar, thisDescriptor, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    public void b(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d thisDescriptor, @dl.d f name, @dl.d Collection<s0> result) {
        f0.p(dVar, "<this>");
        f0.p(thisDescriptor, "thisDescriptor");
        f0.p(name, "name");
        f0.p(result, "result");
        Iterator<T> it = this.f127566b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b(dVar, thisDescriptor, name, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    @dl.d
    public List<f> c(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d thisDescriptor) {
        f0.p(dVar, "<this>");
        f0.p(thisDescriptor, "thisDescriptor");
        List<e> list = this.f127566b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            x.n0(arrayList, ((e) it.next()).c(dVar, thisDescriptor));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    @dl.d
    public List<f> d(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d thisDescriptor) {
        f0.p(dVar, "<this>");
        f0.p(thisDescriptor, "thisDescriptor");
        List<e> list = this.f127566b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            x.n0(arrayList, ((e) it.next()).d(dVar, thisDescriptor));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    public void e(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d thisDescriptor, @dl.d f name, @dl.d Collection<s0> result) {
        f0.p(dVar, "<this>");
        f0.p(thisDescriptor, "thisDescriptor");
        f0.p(name, "name");
        f0.p(result, "result");
        Iterator<T> it = this.f127566b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).e(dVar, thisDescriptor, name, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    public void f(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d thisDescriptor, @dl.d f name, @dl.d List<kotlin.reflect.jvm.internal.impl.descriptors.d> result) {
        f0.p(dVar, "<this>");
        f0.p(thisDescriptor, "thisDescriptor");
        f0.p(name, "name");
        f0.p(result, "result");
        Iterator<T> it = this.f127566b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).f(dVar, thisDescriptor, name, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    @dl.d
    public List<f> g(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d thisDescriptor) {
        f0.p(dVar, "<this>");
        f0.p(thisDescriptor, "thisDescriptor");
        List<e> list = this.f127566b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            x.n0(arrayList, ((e) it.next()).g(dVar, thisDescriptor));
        }
        return arrayList;
    }
}
