package com.max.hbimage.image;

import android.app.Activity;
import android.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: RecyclerViewPreloader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class q<T> extends RecyclerView.OnScrollListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f70492b;

    public q(Activity activity, com.bumptech.glide.f.a<T> aVar, com.bumptech.glide.f.b<T> bVar, int i10) {
        this(Glide.D(activity), aVar, bVar, i10);
    }

    public q(Fragment fragment, com.bumptech.glide.f.a<T> aVar, com.bumptech.glide.f.b<T> bVar, int i10) {
        this(Glide.E(fragment), aVar, bVar, i10);
    }

    public q(androidx.fragment.app.Fragment fragment, com.bumptech.glide.f.a<T> aVar, com.bumptech.glide.f.b<T> bVar, int i10) {
        this(Glide.H(fragment), aVar, bVar, i10);
    }

    public q(FragmentActivity fragmentActivity, com.bumptech.glide.f.a<T> aVar, com.bumptech.glide.f.b<T> bVar, int i10) {
        this(Glide.I(fragmentActivity), aVar, bVar, i10);
    }

    public q(com.bumptech.glide.j jVar, com.bumptech.glide.f.a<T> aVar, com.bumptech.glide.f.b<T> bVar, int i10) {
        this.f70492b = new p(new com.bumptech.glide.f(jVar, aVar, bVar, i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.Rd, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f70492b.onScrolled(recyclerView, i10, i11);
    }
}
