package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.storage.l;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.n;

/* JADX INFO: compiled from: GivenFunctionsMemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class GivenFunctionsMemberScope extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f127575d = {n0.u(new PropertyReference1Impl(n0.d(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.d f127576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h f127577c;

    /* JADX INFO: compiled from: GivenFunctionsMemberScope.kt */
    public static final class a extends kotlin.reflect.jvm.internal.impl.resolve.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList<k> f127578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GivenFunctionsMemberScope f127579b;

        a(ArrayList<k> arrayList, GivenFunctionsMemberScope givenFunctionsMemberScope) {
            this.f127578a = arrayList;
            this.f127579b = givenFunctionsMemberScope;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.h
        public void a(@dl.d CallableMemberDescriptor fakeOverride) {
            f0.p(fakeOverride, "fakeOverride");
            OverridingUtil.K(fakeOverride, null);
            this.f127578a.add(fakeOverride);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.g
        protected void e(@dl.d CallableMemberDescriptor fromSuper, @dl.d CallableMemberDescriptor fromCurrent) {
            f0.p(fromSuper, "fromSuper");
            f0.p(fromCurrent, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f127579b.m() + ": " + fromSuper + " vs " + fromCurrent).toString());
        }
    }

    public GivenFunctionsMemberScope(@dl.d m storageManager, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d containingClass) {
        f0.p(storageManager, "storageManager");
        f0.p(containingClass, "containingClass");
        this.f127576b = containingClass;
        this.f127577c = storageManager.c(new yh.a<List<? extends k>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$allDescriptors$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends k> invoke() {
                List<w> listJ = this.f127580b.j();
                return CollectionsKt___CollectionsKt.y4(listJ, this.f127580b.k(listJ));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<k> k(List<? extends w> list) {
        Collection<? extends CallableMemberDescriptor> collectionE;
        ArrayList arrayList = new ArrayList(3);
        Collection<d0> collectionL = this.f127576b.r().l();
        f0.o(collectionL, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = collectionL.iterator();
        while (it.hasNext()) {
            x.n0(arrayList2, h.a.a(((d0) it.next()).u(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof CallableMemberDescriptor) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            kotlin.reflect.jvm.internal.impl.name.f name = ((CallableMemberDescriptor) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((CallableMemberDescriptor) obj3) instanceof w);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                OverridingUtil overridingUtil = OverridingUtil.f127488f;
                if (zBooleanValue) {
                    collectionE = new ArrayList<>();
                    for (Object obj4 : list) {
                        if (f0.g(((w) obj4).getName(), fVar)) {
                            collectionE.add(obj4);
                        }
                    }
                } else {
                    collectionE = CollectionsKt__CollectionsKt.E();
                }
                overridingUtil.v(fVar, list3, collectionE, this.f127576b, new a(arrayList, this));
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
    }

    private final List<k> l() {
        return (List) l.a(this.f127577c, this, f127575d[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        List<k> listL = l();
        kotlin.reflect.jvm.internal.impl.utils.d dVar = new kotlin.reflect.jvm.internal.impl.utils.d();
        for (Object obj : listL) {
            if ((obj instanceof s0) && f0.g(((s0) obj).getName(), name)) {
                dVar.add(obj);
            }
        }
        return dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Collection<o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        List<k> listL = l();
        kotlin.reflect.jvm.internal.impl.utils.d dVar = new kotlin.reflect.jvm.internal.impl.utils.d();
        for (Object obj : listL) {
            if ((obj instanceof o0) && f0.g(((o0) obj).getName(), name)) {
                dVar.add(obj);
            }
        }
        return dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<k> g(@dl.d d kindFilter, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        return !kindFilter.a(d.f127626p.m()) ? CollectionsKt__CollectionsKt.E() : l();
    }

    @dl.d
    protected abstract List<w> j();

    @dl.d
    protected final kotlin.reflect.jvm.internal.impl.descriptors.d m() {
        return this.f127576b;
    }
}
