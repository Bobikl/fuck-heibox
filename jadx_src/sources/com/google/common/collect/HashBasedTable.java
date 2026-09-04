package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public class HashBasedTable<R, C, V> extends StandardTable<R, C, V> {
    private static final long serialVersionUID = 0;

    public static class Factory<C, V> implements com.google.common.base.c0<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f57225b;

        Factory(int i10) {
            this.f57225b = i10;
        }

        @Override // com.google.common.base.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get() {
            return Maps.e0(this.f57225b);
        }
    }

    HashBasedTable(Map<R, Map<C, V>> map, Factory<C, V> factory) {
        super(map, factory);
    }

    public static <R, C, V> HashBasedTable<R, C, V> p() {
        return new HashBasedTable<>(new LinkedHashMap(), new Factory(0));
    }

    public static <R, C, V> HashBasedTable<R, C, V> q(int i10, int i11) {
        n.b(i11, "expectedCellsPerRow");
        return new HashBasedTable<>(Maps.e0(i10), new Factory(i11));
    }

    public static <R, C, V> HashBasedTable<R, C, V> r(u2<? extends R, ? extends C, ? extends V> u2Var) {
        HashBasedTable<R, C, V> hashBasedTableP = p();
        hashBasedTableP.s0(u2Var);
        return hashBasedTableP;
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean A0(@CheckForNull Object obj) {
        return super.A0(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ Map E0(Object obj) {
        return super.E0(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    @CheckForNull
    public /* bridge */ /* synthetic */ Object Y(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.Y(obj, obj2);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean Z(@CheckForNull Object obj) {
        return super.Z(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ Map a0() {
        return super.a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ Map b0(Object obj) {
        return super.b0(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean containsValue(@CheckForNull Object obj) {
        return super.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    @s9.a
    @CheckForNull
    public /* bridge */ /* synthetic */ Object d0(Object obj, Object obj2, Object obj3) {
        return super.d0(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ Map h() {
        return super.h();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean h0(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.h0(obj, obj2);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ Set j() {
        return super.j();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    @s9.a
    @CheckForNull
    public /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ void s0(u2 u2Var) {
        super.s0(u2Var);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.i
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ Set v0() {
        return super.v0();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ Set y0() {
        return super.y0();
    }
}
