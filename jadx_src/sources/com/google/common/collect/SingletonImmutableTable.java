package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final R f57886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final C f57887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final V f57888f;

    SingletonImmutableTable(u2.a<R, C, V> aVar) {
        this(aVar.b(), aVar.a(), aVar.getValue());
    }

    SingletonImmutableTable(R r10, C c10, V v10) {
        this.f57886d = (R) com.google.common.base.w.E(r10);
        this.f57887e = (C) com.google.common.base.w.E(c10);
        this.f57888f = (V) com.google.common.base.w.E(v10);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.u2
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ImmutableMap<R, V> b0(C c10) {
        com.google.common.base.w.E(c10);
        return Z(c10) ? ImmutableMap.w(this.f57886d, this.f57888f) : ImmutableMap.v();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.u2
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ImmutableMap<C, Map<R, V>> a0() {
        return ImmutableMap.w(this.f57887e, ImmutableMap.w(this.f57886d, this.f57888f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.i
    /* JADX INFO: renamed from: p */
    public ImmutableSet<u2.a<R, C, V>> b() {
        return ImmutableSet.E(ImmutableTable.g(this.f57886d, this.f57887e, this.f57888f));
    }

    @Override // com.google.common.collect.ImmutableTable
    ImmutableTable.SerializedForm q() {
        return ImmutableTable.SerializedForm.a(this, new int[]{0}, new int[]{0});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.i
    /* JADX INFO: renamed from: r */
    public ImmutableCollection<V> c() {
        return ImmutableSet.E(this.f57888f);
    }

    @Override // com.google.common.collect.u2
    public int size() {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.u2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ImmutableMap<R, Map<C, V>> h() {
        return ImmutableMap.w(this.f57886d, ImmutableMap.w(this.f57887e, this.f57888f));
    }
}
