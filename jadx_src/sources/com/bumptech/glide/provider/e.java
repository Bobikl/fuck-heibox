package com.bumptech.glide.provider;

import androidx.annotation.n0;
import com.bumptech.glide.load.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ResourceDecoderRegistry.java */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f41799a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f41800b = new HashMap();

    /* JADX INFO: compiled from: ResourceDecoderRegistry.java */
    public static class a<T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f41801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<R> f41802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final g<T, R> f41803c;

        public a(@n0 Class<T> cls, @n0 Class<R> cls2, g<T, R> gVar) {
            this.f41801a = cls;
            this.f41802b = cls2;
            this.f41803c = gVar;
        }

        public boolean a(@n0 Class<?> cls, @n0 Class<?> cls2) {
            return this.f41801a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f41802b);
        }
    }

    @n0
    private synchronized List<a<?, ?>> c(@n0 String str) {
        List<a<?, ?>> arrayList;
        if (!this.f41799a.contains(str)) {
            this.f41799a.add(str);
        }
        arrayList = this.f41800b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f41800b.put(str, arrayList);
        }
        return arrayList;
    }

    public synchronized <T, R> void a(@n0 String str, @n0 g<T, R> gVar, @n0 Class<T> cls, @n0 Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, gVar));
    }

    @n0
    public synchronized <T, R> List<g<T, R>> b(@n0 Class<T> cls, @n0 Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f41799a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f41800b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f41803c);
                    }
                }
            }
        }
        return arrayList;
    }

    @n0
    public synchronized <T, R> List<Class<R>> d(@n0 Class<T> cls, @n0 Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f41799a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f41800b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f41802b)) {
                        arrayList.add(aVar.f41802b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void e(@n0 String str, @n0 g<T, R> gVar, @n0 Class<T> cls, @n0 Class<R> cls2) {
        c(str).add(0, new a<>(cls, cls2, gVar));
    }

    public synchronized void f(@n0 List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f41799a);
        this.f41799a.clear();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f41799a.add(it.next());
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f41799a.add(str);
            }
        }
    }
}
