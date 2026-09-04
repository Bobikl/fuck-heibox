package gc;

import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: StartLinearSnapHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends LinearSnapHelper {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OrientationHelper f119012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OrientationHelper f119013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f119014c = 0;

    private int a(View view, OrientationHelper orientationHelper) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, orientationHelper}, this, changeQuickRedirect, false, c.f.qm, new Class[]{View.class, OrientationHelper.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : orientationHelper.getDecoratedStart(view) - orientationHelper.getStartAfterPadding();
    }

    private View c(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutManager, orientationHelper}, this, changeQuickRedirect, false, c.f.rm, new Class[]{RecyclerView.LayoutManager.class, OrientationHelper.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return super.findSnapView(layoutManager);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        boolean z10 = linearLayoutManager.findLastCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1;
        if (iFindFirstVisibleItemPosition == -1 || z10) {
            return null;
        }
        View viewFindViewByPosition = layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (orientationHelper.getDecoratedEnd(viewFindViewByPosition) >= orientationHelper.getDecoratedMeasurement(viewFindViewByPosition) / 2 && orientationHelper.getDecoratedEnd(viewFindViewByPosition) > 0) {
            return viewFindViewByPosition;
        }
        if (((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1) {
            return null;
        }
        return layoutManager.findViewByPosition(iFindFirstVisibleItemPosition + 1);
    }

    private OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutManager}, this, changeQuickRedirect, false, c.f.tm, new Class[]{RecyclerView.LayoutManager.class}, OrientationHelper.class);
        if (patchProxyResultProxy.isSupported) {
            return (OrientationHelper) patchProxyResultProxy.result;
        }
        if (this.f119013b == null) {
            this.f119013b = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f119013b;
    }

    private OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutManager}, this, changeQuickRedirect, false, c.f.sm, new Class[]{RecyclerView.LayoutManager.class}, OrientationHelper.class);
        if (patchProxyResultProxy.isSupported) {
            return (OrientationHelper) patchProxyResultProxy.result;
        }
        if (this.f119012a == null) {
            this.f119012a = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.f119012a;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(@p0 RecyclerView recyclerView) throws IllegalStateException {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, c.f.nm, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        super.attachToRecyclerView(recyclerView);
    }

    public int b() {
        return this.f119014c;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(@n0 RecyclerView.LayoutManager layoutManager, @n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutManager, view}, this, changeQuickRedirect, false, c.f.om, new Class[]{RecyclerView.LayoutManager.class, View.class}, int[].class);
        if (patchProxyResultProxy.isSupported) {
            return (int[]) patchProxyResultProxy.result;
        }
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(view, getHorizontalHelper(layoutManager)) - this.f119014c;
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = a(view, getVerticalHelper(layoutManager)) - this.f119014c;
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public void d(int i10) {
        this.f119014c = i10;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutManager}, this, changeQuickRedirect, false, c.f.pm, new Class[]{RecyclerView.LayoutManager.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return layoutManager.canScrollHorizontally() ? c(layoutManager, getHorizontalHelper(layoutManager)) : c(layoutManager, getVerticalHelper(layoutManager));
        }
        return super.findSnapView(layoutManager);
    }
}
