package com.max.hbsearch.utils;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bb.c;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: OneShotRecyclerViewItemExposeWatcher.java */
/* JADX INFO: loaded from: classes12.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f72380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private RecyclerView f72381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0580b f72382c;

    /* JADX INFO: compiled from: OneShotRecyclerViewItemExposeWatcher.java */
    public interface a {
        void a(boolean z10, int i10);
    }

    /* JADX INFO: renamed from: com.max.hbsearch.utils.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OneShotRecyclerViewItemExposeWatcher.java */
    public class C0580b extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0580b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            if (PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, c.k.f33799q9, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Log.d("ExposeWatcher-dbg", "[onScrollStateChanged]");
            if (i10 == 0 || i10 == 1 || i10 == 2) {
                b.this.g(false);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.f33821r9, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.onScrolled(recyclerView, i10, i11);
            b.this.g(true);
        }
    }

    private int[] c(int[] iArr, int[] iArr2) {
        int i10 = iArr[0];
        int i11 = iArr2[0];
        for (int i12 = 1; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            if (i10 > i13) {
                i10 = i13;
            }
        }
        for (int i14 = 1; i14 < iArr2.length; i14++) {
            int i15 = iArr2[i14];
            if (i11 < i15) {
                i11 = i15;
            }
        }
        return new int[]{i10, i11};
    }

    private int[] d(GridLayoutManager gridLayoutManager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gridLayoutManager}, this, changeQuickRedirect, false, c.k.f33730n9, new Class[]{GridLayoutManager.class}, int[].class);
        return patchProxyResultProxy.isSupported ? (int[]) patchProxyResultProxy.result : new int[]{gridLayoutManager.findFirstVisibleItemPosition(), gridLayoutManager.findLastVisibleItemPosition()};
    }

    private int[] e(LinearLayoutManager linearLayoutManager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linearLayoutManager}, this, changeQuickRedirect, false, c.k.f33707m9, new Class[]{LinearLayoutManager.class}, int[].class);
        return patchProxyResultProxy.isSupported ? (int[]) patchProxyResultProxy.result : new int[]{linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition()};
    }

    private int[] f(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{staggeredGridLayoutManager}, this, changeQuickRedirect, false, c.k.f33753o9, new Class[]{StaggeredGridLayoutManager.class}, int[].class);
        if (patchProxyResultProxy.isSupported) {
            return (int[]) patchProxyResultProxy.result;
        }
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        int[] iArr2 = new int[staggeredGridLayoutManager.getSpanCount()];
        staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
        staggeredGridLayoutManager.findLastVisibleItemPositions(iArr2);
        return c(iArr, iArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33776p9, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g(false);
    }

    private void j(View view, int i10, int i11) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.f33684l9, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported && view != null && view.getVisibility() == 0 && view.isShown() && view.getGlobalVisibleRect(new Rect())) {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            boolean z10 = (i11 == 1 && rect.height() > view.getMeasuredHeight() / 2) || (i11 == 0 && rect.width() > view.getMeasuredWidth() / 2);
            if (globalVisibleRect && z10) {
                this.f72380a.a(true, i10);
            } else {
                this.f72380a.a(false, i10);
            }
        }
    }

    public void b(@n0 RecyclerView recyclerView, @n0 a aVar) {
        if (PatchProxy.proxy(new Object[]{recyclerView, aVar}, this, changeQuickRedirect, false, c.k.f33615i9, new Class[]{RecyclerView.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f72380a = aVar;
        this.f72381b = recyclerView;
        if (recyclerView.getVisibility() != 0) {
            return;
        }
        C0580b c0580b = new C0580b();
        this.f72382c = c0580b;
        this.f72381b.addOnScrollListener(c0580b);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:13:0x0042, B:15:0x004f, B:23:0x007e, B:26:0x0082, B:27:0x00a6, B:29:0x00aa, B:17:0x005e, B:19:0x0062, B:20:0x006e, B:22:0x0072), top: B:37:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa A[Catch: Exception -> 0x00b4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b4, blocks: (B:13:0x0042, B:15:0x004f, B:23:0x007e, B:26:0x0082, B:27:0x00a6, B:29:0x00aa, B:17:0x005e, B:19:0x0062, B:20:0x006e, B:22:0x0072), top: B:37:0x0042 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x0082, please report this as an issue */
    public void g(boolean z10) {
        int[] iArrF;
        int orientation;
        int i10;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.k.f33661k9, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f72381b.getVisibility() != 0 || !this.f72381b.isShown() || !this.f72381b.getGlobalVisibleRect(new Rect())) {
            if (z10) {
                this.f72381b.postDelayed(new Runnable() { // from class: com.max.hbsearch.utils.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f72379b.h();
                    }
                }, 100L);
                return;
            }
            return;
        }
        try {
            int[] iArr = new int[2];
            int i11 = -1;
            RecyclerView.LayoutManager layoutManager = this.f72381b.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                iArrF = d(gridLayoutManager);
                orientation = gridLayoutManager.getOrientation();
            } else {
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    if (layoutManager instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                        iArrF = f(staggeredGridLayoutManager);
                        orientation = staggeredGridLayoutManager.getOrientation();
                    }
                    if (iArr.length < 2) {
                        return;
                    }
                    Log.d("HomePageExposeUtil-dbg", "[handleCurrentVisibleItems]\n屏幕内可见条目的起始位置：" + iArr[0] + "---" + iArr[1]);
                    for (i10 = iArr[0]; i10 <= iArr[1]; i10++) {
                        j(layoutManager.findViewByPosition(i10), i10, i11);
                    }
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                iArrF = e(linearLayoutManager);
                orientation = linearLayoutManager.getOrientation();
            }
            int[] iArr2 = iArrF;
            i11 = orientation;
            iArr = iArr2;
            if (iArr.length < 2) {
                return;
            }
            Log.d("HomePageExposeUtil-dbg", "[handleCurrentVisibleItems]\n屏幕内可见条目的起始位置：" + iArr[0] + "---" + iArr[1]);
            while (i10 <= iArr[1]) {
                j(layoutManager.findViewByPosition(i10), i10, i11);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            g.G("[handleCurrentVisibleItems] error: " + e10.getMessage());
        }
    }

    public void i(@p0 RecyclerView recyclerView) {
        RecyclerView recyclerView2;
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, c.k.f33638j9, new Class[]{RecyclerView.class}, Void.TYPE).isSupported || recyclerView == null || (recyclerView2 = this.f72381b) != recyclerView) {
            return;
        }
        recyclerView2.removeOnScrollListener(this.f72382c);
    }
}
