package com.bumptech.glide.load.model;

import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: MultiModelLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class r<Model, Data> implements o<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<o<Model, Data>> f41385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.core.util.n.a<List<Throwable>> f41386b;

    /* JADX INFO: compiled from: MultiModelLoader.java */
    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, com.bumptech.glide.load.data.d.a<Data> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<com.bumptech.glide.load.data.d<Data>> f41387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.core.util.n.a<List<Throwable>> f41388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f41389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Priority f41390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.bumptech.glide.load.data.d.a<? super Data> f41391f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private List<Throwable> f41392g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f41393h;

        a(@n0 List<com.bumptech.glide.load.data.d<Data>> list, @n0 androidx.core.util.n.a<List<Throwable>> aVar) {
            this.f41388c = aVar;
            com.bumptech.glide.util.m.d(list);
            this.f41387b = list;
            this.f41389d = 0;
        }

        private void g() {
            if (this.f41393h) {
                return;
            }
            if (this.f41389d < this.f41387b.size() - 1) {
                this.f41389d++;
                d(this.f41390e, this.f41391f);
            } else {
                com.bumptech.glide.util.m.e(this.f41392g);
                this.f41391f.f(new GlideException("Fetch failed", new ArrayList(this.f41392g)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @n0
        public Class<Data> a() {
            return this.f41387b.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f41392g;
            if (list != null) {
                this.f41388c.b(list);
            }
            this.f41392g = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f41387b.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @n0
        public DataSource c() {
            return this.f41387b.get(0).c();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f41393h = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f41387b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@n0 Priority priority, @n0 com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            this.f41390e = priority;
            this.f41391f = aVar;
            this.f41392g = this.f41388c.a();
            this.f41387b.get(this.f41389d).d(priority, this);
            if (this.f41393h) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void e(@p0 Data data) {
            if (data != null) {
                this.f41391f.e(data);
            } else {
                g();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(@n0 Exception exc) {
            ((List) com.bumptech.glide.util.m.e(this.f41392g)).add(exc);
            g();
        }
    }

    r(@n0 List<o<Model, Data>> list, @n0 androidx.core.util.n.a<List<Throwable>> aVar) {
        this.f41385a = list;
        this.f41386b = aVar;
    }

    @Override // com.bumptech.glide.load.model.o
    public o.a<Data> a(@n0 Model model, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        o.a<Data> aVarA;
        int size = this.f41385a.size();
        ArrayList arrayList = new ArrayList(size);
        com.bumptech.glide.load.c cVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            o<Model, Data> oVar = this.f41385a.get(i12);
            if (oVar.b(model) && (aVarA = oVar.a(model, i10, i11, fVar)) != null) {
                cVar = aVarA.f41378a;
                arrayList.add(aVarA.f41380c);
            }
        }
        if (arrayList.isEmpty() || cVar == null) {
            return null;
        }
        return new o.a<>(cVar, new a(arrayList, this.f41386b));
    }

    @Override // com.bumptech.glide.load.model.o
    public boolean b(@n0 Model model) {
        Iterator<o<Model, Data>> it = this.f41385a.iterator();
        while (it.hasNext()) {
            if (it.next().b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f41385a.toArray()) + '}';
    }
}
