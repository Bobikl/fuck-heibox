package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import fi.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r0;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.m;
import mi.g;
import mi.n;
import mi.p;
import mi.q;
import mi.r;
import mi.w;
import yh.l;

/* JADX INFO: compiled from: DeclaredMemberIndex.kt */
/* JADX INFO: loaded from: classes5.dex */
public class ClassDeclaredMemberIndex implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final g f126114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final l<q, Boolean> f126115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final l<r, Boolean> f126116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Map<f, List<r>> f126117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Map<f, n> f126118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final Map<f, w> f126119f;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(@dl.d g jClass, @dl.d l<? super q, Boolean> memberFilter) {
        f0.p(jClass, "jClass");
        f0.p(memberFilter, "memberFilter");
        this.f126114a = jClass;
        this.f126115b = memberFilter;
        l<r, Boolean> lVar = new l<r, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex$methodFilter$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d r m10) {
                f0.p(m10, "m");
                return Boolean.valueOf(((Boolean) this.f126120b.f126115b.invoke(m10)).booleanValue() && !p.c(m10));
            }
        };
        this.f126116c = lVar;
        m mVarP0 = SequencesKt___SequencesKt.p0(CollectionsKt___CollectionsKt.v1(jClass.b()), lVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : mVarP0) {
            f name = ((r) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f126117d = linkedHashMap;
        m mVarP1 = SequencesKt___SequencesKt.p0(CollectionsKt___CollectionsKt.v1(this.f126114a.j()), this.f126115b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : mVarP1) {
            linkedHashMap2.put(((n) obj2).getName(), obj2);
        }
        this.f126118e = linkedHashMap2;
        Collection<w> collectionI = this.f126114a.I();
        l<q, Boolean> lVar2 = this.f126115b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionI) {
            if (lVar2.invoke((q) obj3).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(u.u(r0.j(t.Y(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((w) obj4).getName(), obj4);
        }
        this.f126119f = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
    @dl.d
    public Set<f> a() {
        m mVarP0 = SequencesKt___SequencesKt.p0(CollectionsKt___CollectionsKt.v1(this.f126114a.b()), this.f126116c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = mVarP0.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
    @dl.d
    public Set<f> b() {
        return this.f126119f.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
    @dl.e
    public n c(@dl.d f name) {
        f0.p(name, "name");
        return this.f126118e.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
    @dl.d
    public Set<f> d() {
        m mVarP0 = SequencesKt___SequencesKt.p0(CollectionsKt___CollectionsKt.v1(this.f126114a.j()), this.f126115b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = mVarP0.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
    @dl.d
    public Collection<r> e(@dl.d f name) {
        f0.p(name, "name");
        List<r> list = this.f126117d.get(name);
        return list != null ? list : CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
    @dl.e
    public w f(@dl.d f name) {
        f0.p(name, "name");
        return this.f126119f.get(name);
    }
}
