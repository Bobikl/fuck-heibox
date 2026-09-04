package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final RegularImmutableMultiset<Object> f57819h = new RegularImmutableMultiset<>(v1.c());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient v1<E> f57820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f57821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient ImmutableSet<E> f57822g;

    public final class ElementSet extends IndexedImmutableSet<E> {
        private ElementSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        E get(int i10) {
            return RegularImmutableMultiset.this.f57820e.j(i10);
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RegularImmutableMultiset.this.f57820e.D();
        }
    }

    @o9.c
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object[] f57824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int[] f57825c;

        SerializedForm(s1<? extends Object> s1Var) {
            int size = s1Var.entrySet().size();
            this.f57824b = new Object[size];
            this.f57825c = new int[size];
            int i10 = 0;
            for (s1.a<? extends Object> aVar : s1Var.entrySet()) {
                this.f57824b[i10] = aVar.a();
                this.f57825c[i10] = aVar.getCount();
                i10++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object a() {
            ImmutableMultiset.b bVar = new ImmutableMultiset.b(this.f57824b.length);
            int i10 = 0;
            while (true) {
                Object[] objArr = this.f57824b;
                if (i10 >= objArr.length) {
                    return bVar.e();
                }
                bVar.k(objArr[i10], this.f57825c[i10]);
                i10++;
            }
        }
    }

    RegularImmutableMultiset(v1<E> v1Var) {
        this.f57820e = v1Var;
        long jL = 0;
        for (int i10 = 0; i10 < v1Var.D(); i10++) {
            jL += (long) v1Var.l(i10);
        }
        this.f57821f = Ints.x(jL);
    }

    @Override // com.google.common.collect.s1
    public int E1(@CheckForNull Object obj) {
        return this.f57820e.g(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @o9.c
    Object l() {
        return new SerializedForm(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    public int size() {
        return this.f57821f;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.s1
    /* JADX INFO: renamed from: w */
    public ImmutableSet<E> c() {
        ImmutableSet<E> immutableSet = this.f57822g;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet();
        this.f57822g = elementSet;
        return elementSet;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    s1.a<E> y(int i10) {
        return this.f57820e.h(i10);
    }
}
