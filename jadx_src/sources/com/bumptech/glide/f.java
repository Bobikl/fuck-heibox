package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import java.util.List;
import java.util.Queue;

/* JADX INFO: compiled from: ListPreloader.java */
/* JADX INFO: loaded from: classes6.dex */
public class f<T> implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f40660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f40661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a<T> f40662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b<T> f40663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f40665g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f40667i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f40666h = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f40668j = true;

    /* JADX INFO: compiled from: ListPreloader.java */
    public interface a<U> {
        @n0
        List<U> a(int i10);

        @p0
        i<?> b(@n0 U u10);
    }

    /* JADX INFO: compiled from: ListPreloader.java */
    public interface b<T> {
        @p0
        int[] a(@n0 T t10, int i10, int i11);
    }

    /* JADX INFO: compiled from: ListPreloader.java */
    public static final class c implements p<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f40669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f40670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private com.bumptech.glide.request.e f40671d;

        c() {
        }

        @Override // com.bumptech.glide.request.target.p
        @p0
        public com.bumptech.glide.request.e getRequest() {
            return this.f40671d;
        }

        @Override // com.bumptech.glide.request.target.p
        public void getSize(@n0 o oVar) {
            oVar.d(this.f40670c, this.f40669b);
        }

        @Override // com.bumptech.glide.manager.k
        public void onDestroy() {
        }

        @Override // com.bumptech.glide.request.target.p
        public void onLoadCleared(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void onLoadFailed(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void onLoadStarted(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }

        @Override // com.bumptech.glide.manager.k
        public void onStart() {
        }

        @Override // com.bumptech.glide.manager.k
        public void onStop() {
        }

        @Override // com.bumptech.glide.request.target.p
        public void removeCallback(@n0 o oVar) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void setRequest(@p0 com.bumptech.glide.request.e eVar) {
            this.f40671d = eVar;
        }
    }

    /* JADX INFO: compiled from: ListPreloader.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Queue<c> f40672a;

        d(int i10) {
            this.f40672a = com.bumptech.glide.util.o.g(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f40672a.offer(new c());
            }
        }

        public c a(int i10, int i11) {
            c cVarPoll = this.f40672a.poll();
            this.f40672a.offer(cVarPoll);
            cVarPoll.f40670c = i10;
            cVarPoll.f40669b = i11;
            return cVarPoll;
        }
    }

    public f(@n0 j jVar, @n0 a<T> aVar, @n0 b<T> bVar, int i10) {
        this.f40661c = jVar;
        this.f40662d = aVar;
        this.f40663e = bVar;
        this.f40659a = i10;
        this.f40660b = new d(i10 + 1);
    }

    private void a() {
        for (int i10 = 0; i10 < this.f40660b.f40672a.size(); i10++) {
            this.f40661c.q(this.f40660b.a(0, 0));
        }
    }

    private void b(int i10, int i11) {
        int iMin;
        int iMax;
        if (i10 < i11) {
            iMax = Math.max(this.f40664f, i10);
            iMin = i11;
        } else {
            iMin = Math.min(this.f40665g, i10);
            iMax = i11;
        }
        int iMin2 = Math.min(this.f40667i, iMin);
        int iMin3 = Math.min(this.f40667i, Math.max(0, iMax));
        if (i10 < i11) {
            for (int i12 = iMin3; i12 < iMin2; i12++) {
                d(this.f40662d.a(i12), i12, true);
            }
        } else {
            for (int i13 = iMin2 - 1; i13 >= iMin3; i13--) {
                d(this.f40662d.a(i13), i13, false);
            }
        }
        this.f40665g = iMin3;
        this.f40664f = iMin2;
    }

    private void c(int i10, boolean z10) {
        if (this.f40668j != z10) {
            this.f40668j = z10;
            a();
        }
        b(i10, (z10 ? this.f40659a : -this.f40659a) + i10);
    }

    private void d(List<T> list, int i10, boolean z10) {
        int size = list.size();
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e(list.get(i11), i10, i11);
            }
            return;
        }
        for (int i12 = size - 1; i12 >= 0; i12--) {
            e(list.get(i12), i10, i12);
        }
    }

    private void e(@p0 T t10, int i10, int i11) {
        int[] iArrA;
        i<?> iVarB;
        if (t10 == null || (iArrA = this.f40663e.a(t10, i10, i11)) == null || (iVarB = this.f40662d.b(t10)) == null) {
            return;
        }
        iVarB.z1(this.f40660b.a(iArrA[0], iArrA[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        if (this.f40667i == 0 && i12 == 0) {
            return;
        }
        this.f40667i = i12;
        int i13 = this.f40666h;
        if (i10 > i13) {
            c(i11 + i10, true);
        } else if (i10 < i13) {
            c(i10, false);
        }
        this.f40666h = i10;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
