package com.max.hbimage.image;

import android.widget.AbsListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: RecyclerToListViewScrollListener.java */
/* JADX INFO: loaded from: classes10.dex */
public final class p extends RecyclerView.OnScrollListener {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f70487f = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbsListView.OnScrollListener f70488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70489c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f70490d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f70491e = -1;

    public p(AbsListView.OnScrollListener onScrollListener) {
        this.f70488b = onScrollListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        int i11 = 2;
        if (PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.Pd, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 0) {
            i11 = 0;
        } else if (i10 == 1) {
            i11 = 1;
        } else if (i10 != 2) {
            i11 = Integer.MIN_VALUE;
        }
        this.f70488b.onScrollStateChanged(null, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.Qd, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iAbs = Math.abs(iFindFirstVisibleItemPosition - linearLayoutManager.findLastVisibleItemPosition());
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (iFindFirstVisibleItemPosition == this.f70489c && iAbs == this.f70490d && itemCount == this.f70491e) {
            return;
        }
        this.f70488b.onScroll(null, iFindFirstVisibleItemPosition, iAbs, itemCount);
        this.f70489c = iFindFirstVisibleItemPosition;
        this.f70490d = iAbs;
        this.f70491e = itemCount;
    }
}
