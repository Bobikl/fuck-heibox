package com.max.xiaoheihe.view.callback;

import android.view.View;
import androidx.annotation.i;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: SnapPageScrollListener.java */
/* JADX INFO: loaded from: classes13.dex */
public class d extends RecyclerView.OnScrollListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95915b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    protected SnapHelper f95916c;

    public void c(int i10, float f10, int i11) {
    }

    public void e(int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    @i
    public void onScrollStateChanged(@n0 RecyclerView recyclerView, int i10) {
        if (PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, 49561, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.onScrollStateChanged(recyclerView, i10);
        int i11 = this.f95915b;
        if (i11 != -1 && i10 == 0) {
            c(i11, 0.0f, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(@n0 RecyclerView recyclerView, int i10, int i11) {
        float f10;
        int i12;
        float fAbs;
        int iAbs;
        float f11;
        int height;
        float f12;
        int height2;
        int i13 = 0;
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49560, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onScrolled(recyclerView, i10, i11);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (this.f95916c == null) {
            RecyclerView.OnFlingListener onFlingListener = recyclerView.getOnFlingListener();
            if (onFlingListener instanceof SnapHelper) {
                this.f95916c = (SnapHelper) onFlingListener;
            }
        }
        View viewFindSnapView = null;
        int position = (layoutManager == null || (viewFindSnapView = this.f95916c.findSnapView(layoutManager)) == null) ? -1 : layoutManager.getPosition(viewFindSnapView);
        if (position == -1) {
            return;
        }
        if (this.f95915b != position) {
            this.f95915b = position;
            e(position);
        }
        int[] iArrCalculateDistanceToFinalSnap = this.f95916c.calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        float f13 = 0.0f;
        if (iArrCalculateDistanceToFinalSnap != null) {
            if (layoutManager.canScrollHorizontally()) {
                i12 = iArrCalculateDistanceToFinalSnap[0];
                f12 = i12;
                height2 = viewFindSnapView.getWidth();
            } else {
                i12 = iArrCalculateDistanceToFinalSnap[1];
                f12 = i12;
                height2 = viewFindSnapView.getHeight();
            }
            f10 = f12 / height2;
        } else {
            f10 = 0.0f;
            i12 = 0;
        }
        if (f10 <= 0.0f) {
            fAbs = Math.abs(f10);
            iAbs = Math.abs(i12);
        } else {
            position--;
            View viewFindViewByPosition = layoutManager.findViewByPosition(position);
            int[] iArrCalculateDistanceToFinalSnap2 = new int[2];
            if (viewFindViewByPosition != null) {
                iArrCalculateDistanceToFinalSnap2 = this.f95916c.calculateDistanceToFinalSnap(layoutManager, viewFindViewByPosition);
            }
            if (iArrCalculateDistanceToFinalSnap2 != null) {
                if (layoutManager.canScrollHorizontally()) {
                    i13 = iArrCalculateDistanceToFinalSnap2[0];
                    f11 = i13;
                    height = viewFindSnapView.getWidth();
                } else {
                    i13 = iArrCalculateDistanceToFinalSnap2[1];
                    f11 = i13;
                    height = viewFindSnapView.getHeight();
                }
                f13 = f11 / height;
            }
            fAbs = Math.abs(f13);
            iAbs = Math.abs(i13);
        }
        c(position, fAbs, iAbs);
    }
}
