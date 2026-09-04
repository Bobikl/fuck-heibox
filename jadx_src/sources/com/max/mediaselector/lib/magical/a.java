package com.max.mediaselector.lib.magical;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BuildRecycleItemViewParams.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<ViewParams> f75332a = new ArrayList();
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.H1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<ViewParams> list = f75332a;
        if (list.size() > 0) {
            list.clear();
        }
    }

    private static void b(List<View> list, int i10, int i11, int i12) {
        Object[] objArr = {list, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.K1, new Class[]{List.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (i11 > 0) {
            while (i11 >= 1) {
                list.add(0, null);
                i11--;
            }
        }
        if (i12 < i10) {
            for (int i13 = (i10 - 1) - i12; i13 >= 1; i13--) {
                list.add(null);
            }
        }
    }

    public static void c(RecyclerView recyclerView, int i10) {
        if (PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.J1, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        if (gridLayoutManager == null) {
            return;
        }
        int itemCount = gridLayoutManager.getItemCount();
        int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
        if (iFindLastVisibleItemPosition > itemCount) {
            iFindLastVisibleItemPosition = itemCount - 1;
        }
        b(arrayList, itemCount, iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
        f75332a.clear();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            View view = (View) arrayList.get(i12);
            ViewParams viewParams = new ViewParams();
            if (view == null) {
                viewParams.c(0);
                viewParams.d(0);
                viewParams.t0(0);
                viewParams.G1(0);
            } else {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                viewParams.c(iArr[0]);
                viewParams.d(iArr[1] - i10);
                viewParams.t0(view.getWidth());
                viewParams.G1(view.getHeight());
            }
            f75332a.add(viewParams);
        }
    }

    public static ViewParams d(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.I1, new Class[]{Integer.TYPE}, ViewParams.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewParams) patchProxyResultProxy.result;
        }
        List<ViewParams> list = f75332a;
        if (list.size() > i10) {
            return list.get(i10);
        }
        return null;
    }
}
