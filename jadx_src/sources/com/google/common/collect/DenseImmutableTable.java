package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@s9.j(containerOf = {"R", "C", androidx.exifinterface.media.a.X4})
@o9.b
@u
public final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImmutableMap<R, Integer> f57169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ImmutableMap<C, Integer> f57170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImmutableMap<R, ImmutableMap<C, V>> f57171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ImmutableMap<C, ImmutableMap<R, V>> f57172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f57173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f57174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final V[][] f57175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f57176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f57177l;

    public final class Column extends ImmutableArrayMap<R, V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f57178h;

        Column(int i10) {
            super(DenseImmutableTable.this.f57174i[i10]);
            this.f57178h = i10;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        @CheckForNull
        V L(int i10) {
            return (V) DenseImmutableTable.this.f57175j[i10][this.f57178h];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap<R, Integer> N() {
            return DenseImmutableTable.this.f57169d;
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean p() {
            return true;
        }
    }

    public final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        private ColumnMap() {
            super(DenseImmutableTable.this.f57174i.length);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap<C, Integer> N() {
            return DenseImmutableTable.this.f57170e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public ImmutableMap<R, V> L(int i10) {
            return new Column(i10);
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean p() {
            return false;
        }
    }

    public static abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f57181g;

        public class a extends AbstractIterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f57182d = -1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final int f57183e;

            a() {
                this.f57183e = ImmutableArrayMap.this.N().size();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a() {
                int i10 = this.f57182d;
                while (true) {
                    this.f57182d = i10 + 1;
                    int i11 = this.f57182d;
                    if (i11 >= this.f57183e) {
                        return b();
                    }
                    Object objL = ImmutableArrayMap.this.L(i11);
                    if (objL != null) {
                        return Maps.O(ImmutableArrayMap.this.K(this.f57182d), objL);
                    }
                    i10 = this.f57182d;
                }
            }
        }

        ImmutableArrayMap(int i10) {
            this.f57181g = i10;
        }

        private boolean M() {
            return this.f57181g == N().size();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        b3<Map.Entry<K, V>> J() {
            return new a();
        }

        K K(int i10) {
            return N().keySet().a().get(i10);
        }

        @CheckForNull
        abstract V L(int i10);

        abstract ImmutableMap<K, Integer> N();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            Integer num = N().get(obj);
            if (num == null) {
                return null;
            }
            return L(num.intValue());
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        ImmutableSet<K> i() {
            return M() ? N().keySet() : super.i();
        }

        @Override // java.util.Map
        public int size() {
            return this.f57181g;
        }
    }

    public final class Row extends ImmutableArrayMap<C, V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f57185h;

        Row(int i10) {
            super(DenseImmutableTable.this.f57173h[i10]);
            this.f57185h = i10;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        @CheckForNull
        V L(int i10) {
            return (V) DenseImmutableTable.this.f57175j[this.f57185h][i10];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap<C, Integer> N() {
            return DenseImmutableTable.this.f57170e;
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean p() {
            return true;
        }
    }

    public final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        private RowMap() {
            super(DenseImmutableTable.this.f57173h.length);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap<R, Integer> N() {
            return DenseImmutableTable.this.f57169d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public ImmutableMap<C, V> L(int i10) {
            return new Row(i10);
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean p() {
            return false;
        }
    }

    DenseImmutableTable(ImmutableList<u2.a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        this.f57175j = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableSet.size(), immutableSet2.size()));
        ImmutableMap<R, Integer> immutableMapQ = Maps.Q(immutableSet);
        this.f57169d = immutableMapQ;
        ImmutableMap<C, Integer> immutableMapQ2 = Maps.Q(immutableSet2);
        this.f57170e = immutableMapQ2;
        this.f57173h = new int[immutableMapQ.size()];
        this.f57174i = new int[immutableMapQ2.size()];
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i10 = 0; i10 < immutableList.size(); i10++) {
            u2.a<R, C, V> aVar = immutableList.get(i10);
            R rB = aVar.b();
            C cA = aVar.a();
            Integer num = this.f57169d.get(rB);
            Objects.requireNonNull(num);
            int iIntValue = num.intValue();
            Integer num2 = this.f57170e.get(cA);
            Objects.requireNonNull(num2);
            int iIntValue2 = num2.intValue();
            A(rB, cA, this.f57175j[iIntValue][iIntValue2], aVar.getValue());
            this.f57175j[iIntValue][iIntValue2] = aVar.getValue();
            int[] iArr3 = this.f57173h;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.f57174i;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i10] = iIntValue;
            iArr2[i10] = iIntValue2;
        }
        this.f57176k = iArr;
        this.f57177l = iArr2;
        this.f57171f = new RowMap();
        this.f57172g = new ColumnMap();
    }

    @Override // com.google.common.collect.RegularImmutableTable
    u2.a<R, C, V> F(int i10) {
        int i11 = this.f57176k[i10];
        int i12 = this.f57177l[i10];
        R r10 = j().a().get(i11);
        C c10 = y0().a().get(i12);
        V v10 = this.f57175j[i11][i12];
        Objects.requireNonNull(v10);
        return ImmutableTable.g(r10, c10, v10);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    V G(int i10) {
        V v10 = this.f57175j[this.f57176k[i10]][this.f57177l[i10]];
        Objects.requireNonNull(v10);
        return v10;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.i, com.google.common.collect.u2
    @CheckForNull
    public V Y(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Integer num = this.f57169d.get(obj);
        Integer num2 = this.f57170e.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f57175j[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.u2
    /* JADX INFO: renamed from: m */
    public ImmutableMap<C, Map<R, V>> a0() {
        return ImmutableMap.g(this.f57172g);
    }

    @Override // com.google.common.collect.ImmutableTable
    ImmutableTable.SerializedForm q() {
        return ImmutableTable.SerializedForm.a(this, this.f57176k, this.f57177l);
    }

    @Override // com.google.common.collect.u2
    public int size() {
        return this.f57176k.length;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.u2
    /* JADX INFO: renamed from: w */
    public ImmutableMap<R, Map<C, V>> h() {
        return ImmutableMap.g(this.f57171f);
    }
}
