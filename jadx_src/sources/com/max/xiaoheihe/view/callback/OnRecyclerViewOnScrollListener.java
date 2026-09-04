package com.max.xiaoheihe.view.callback;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes13.dex */
public class OnRecyclerViewOnScrollListener extends RecyclerView.OnScrollListener implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected LAYOUT_MANAGER_TYPE f95912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f95913c;

    public enum LAYOUT_MANAGER_TYPE {
        LINEAR,
        GRID,
        STAGGERED_GRID;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static LAYOUT_MANAGER_TYPE valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 49559, new Class[]{String.class}, LAYOUT_MANAGER_TYPE.class);
            return patchProxyResultProxy.isSupported ? (LAYOUT_MANAGER_TYPE) patchProxyResultProxy.result : (LAYOUT_MANAGER_TYPE) Enum.valueOf(LAYOUT_MANAGER_TYPE.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static LAYOUT_MANAGER_TYPE[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49558, new Class[0], LAYOUT_MANAGER_TYPE[].class);
            return patchProxyResultProxy.isSupported ? (LAYOUT_MANAGER_TYPE[]) patchProxyResultProxy.result : (LAYOUT_MANAGER_TYPE[]) values().clone();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f95914a;

        static {
            int[] iArr = new int[LAYOUT_MANAGER_TYPE.valuesCustom().length];
            f95914a = iArr;
            try {
                iArr[LAYOUT_MANAGER_TYPE.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95914a[LAYOUT_MANAGER_TYPE.GRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void b(int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49557, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onScrolled(recyclerView, i10, i11);
        if (recyclerView.getScrollState() == 0) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (this.f95912b == null) {
            if (layoutManager instanceof LinearLayoutManager) {
                this.f95912b = LAYOUT_MANAGER_TYPE.LINEAR;
            } else if (layoutManager instanceof GridLayoutManager) {
                this.f95912b = LAYOUT_MANAGER_TYPE.GRID;
            } else {
                if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                    throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager and StaggeredGridLayoutManager");
                }
                this.f95912b = LAYOUT_MANAGER_TYPE.STAGGERED_GRID;
            }
        }
        int i12 = a.f95914a[this.f95912b.ordinal()];
        if (i12 == 1) {
            this.f95913c = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        } else if (i12 == 2) {
            this.f95913c = ((GridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        }
        b(this.f95913c);
        com.max.hbcommon.utils.d.b("OnRecyclerViewOnScrollListener", "firstVisibleItemPosition:" + this.f95913c);
    }
}
