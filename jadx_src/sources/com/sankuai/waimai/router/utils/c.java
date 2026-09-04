package com.sankuai.waimai.router.utils;

import android.annotation.TargetApi;
import androidx.annotation.n0;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PriorityList.java */
/* JADX INFO: loaded from: classes8.dex */
public class c<T> extends AbstractList<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedList<a<T>> f96562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f96563c;

    /* JADX INFO: compiled from: PriorityList.java */
    public static class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f96564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        T f96565b;

        a(T t10, int i10) {
            this.f96565b = t10;
            this.f96564a = i10;
        }
    }

    /* JADX INFO: compiled from: PriorityList.java */
    public class b implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ListIterator<a<T>> f96566b;

        /* JADX INFO: compiled from: PriorityList.java */
        public class a implements Consumer<a<T>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Consumer f96568b;

            a(Consumer consumer) {
                this.f96568b = consumer;
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void accept(a<T> aVar) {
                this.f96568b.accept(aVar.f96565b);
            }
        }

        public b(c cVar) {
            this(0);
        }

        public b(int i10) {
            this.f96566b = c.this.f96562b.listIterator(i10);
        }

        @Override // java.util.Iterator
        @TargetApi(24)
        public void forEachRemaining(Consumer<? super T> consumer) {
            this.f96566b.forEachRemaining(new a(consumer));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f96566b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f96566b.next().f96565b;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f96566b.remove();
        }
    }

    public c() {
        this(0);
    }

    public c(int i10) {
        this.f96562b = new LinkedList<>();
        this.f96563c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public void add(int i10, T t10) {
        throw new UnsupportedOperationException("不支持添加到指定位置");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t10) {
        return e(t10, this.f96563c);
    }

    public boolean b(T t10) {
        return e(t10, this.f96563c);
    }

    public boolean e(T t10, int i10) {
        a<T> aVar = new a<>(t10, i10);
        if (this.f96562b.isEmpty()) {
            this.f96562b.add(aVar);
            return true;
        }
        ListIterator<a<T>> listIterator = this.f96562b.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().f96564a < i10) {
                listIterator.previous();
                listIterator.add(aVar);
                return true;
            }
        }
        this.f96562b.addLast(aVar);
        return true;
    }

    public int g(int i10) {
        return this.f96562b.get(i10).f96564a;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        return this.f96562b.get(i10).f96565b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @n0
    public Iterator<T> iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        Iterator<a<T>> it = this.f96562b.iterator();
        while (it.hasNext()) {
            if (it.next().f96565b == obj) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i10, T t10) {
        a<T> aVar = this.f96562b.get(i10);
        T t11 = aVar.f96565b;
        aVar.f96565b = t10;
        return t11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f96562b.size();
    }
}
