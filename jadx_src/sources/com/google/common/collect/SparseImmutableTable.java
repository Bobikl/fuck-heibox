package com.google.common.collect;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@s9.j(containerOf = {"R", "C", androidx.exifinterface.media.a.X4})
@u
public final class SparseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final ImmutableTable<Object, Object, Object> f57889h = new SparseImmutableTable(ImmutableList.B(), ImmutableSet.D(), ImmutableSet.D());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImmutableMap<R, ImmutableMap<C, V>> f57890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ImmutableMap<C, ImmutableMap<R, V>> f57891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f57892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f57893g;

    /* JADX WARN: Multi-variable type inference failed */
    SparseImmutableTable(ImmutableList<u2.a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap immutableMapQ = Maps.Q(immutableSet);
        LinkedHashMap linkedHashMapC0 = Maps.c0();
        b3<R> it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMapC0.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMapC1 = Maps.c0();
        b3<C> it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMapC1.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i10 = 0; i10 < immutableList.size(); i10++) {
            u2.a<R, C, V> aVar = immutableList.get(i10);
            R rB = aVar.b();
            C cA = aVar.a();
            V value = aVar.getValue();
            Integer num = (Integer) immutableMapQ.get(rB);
            Objects.requireNonNull(num);
            iArr[i10] = num.intValue();
            Map map = (Map) linkedHashMapC0.get(rB);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i10] = map2.size();
            A(rB, cA, map2.put(cA, value), value);
            Map map3 = (Map) linkedHashMapC1.get(cA);
            Objects.requireNonNull(map3);
            map3.put(rB, value);
        }
        this.f57892f = iArr;
        this.f57893g = iArr2;
        ImmutableMap.b bVar = new ImmutableMap.b(linkedHashMapC0.size());
        for (Map.Entry entry : linkedHashMapC0.entrySet()) {
            bVar.i(entry.getKey(), ImmutableMap.g((Map) entry.getValue()));
        }
        this.f57890d = bVar.d();
        ImmutableMap.b bVar2 = new ImmutableMap.b(linkedHashMapC1.size());
        for (Map.Entry entry2 : linkedHashMapC1.entrySet()) {
            bVar2.i(entry2.getKey(), ImmutableMap.g((Map) entry2.getValue()));
        }
        this.f57891e = bVar2.d();
    }

    @Override // com.google.common.collect.RegularImmutableTable
    u2.a<R, C, V> F(int i10) {
        Map.Entry<R, ImmutableMap<C, V>> entry = this.f57890d.entrySet().a().get(this.f57892f[i10]);
        ImmutableMap<C, V> value = entry.getValue();
        Map.Entry<C, V> entry2 = value.entrySet().a().get(this.f57893g[i10]);
        return ImmutableTable.g(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.RegularImmutableTable
    V G(int i10) {
        ImmutableMap<C, V> immutableMap = this.f57890d.values().a().get(this.f57892f[i10]);
        return immutableMap.values().a().get(this.f57893g[i10]);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.u2
    /* JADX INFO: renamed from: m */
    public ImmutableMap<C, Map<R, V>> a0() {
        return ImmutableMap.g(this.f57891e);
    }

    @Override // com.google.common.collect.ImmutableTable
    ImmutableTable.SerializedForm q() {
        ImmutableMap immutableMapQ = Maps.Q(y0());
        int[] iArr = new int[v0().size()];
        b3<u2.a<R, C, V>> it = v0().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Integer num = (Integer) immutableMapQ.get(it.next().a());
            Objects.requireNonNull(num);
            iArr[i10] = num.intValue();
            i10++;
        }
        return ImmutableTable.SerializedForm.a(this, this.f57892f, iArr);
    }

    @Override // com.google.common.collect.u2
    public int size() {
        return this.f57892f.length;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.u2
    /* JADX INFO: renamed from: w */
    public ImmutableMap<R, Map<C, V>> h() {
        return ImmutableMap.g(this.f57890d);
    }
}
