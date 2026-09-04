package com.max.mediaselector.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import oe.p;
import oe.q;
import oe.r;

/* JADX INFO: loaded from: classes2.dex */
public class RecyclerPreloadView extends RecyclerView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f75578j = RecyclerPreloadView.class.getSimpleName();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f75579k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f75580l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f75581m = 150;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f75582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f75583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f75584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f75585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f75586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p f75587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f75588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q f75589i;

    public RecyclerPreloadView(@n0 Context context) {
        super(context);
        this.f75582b = false;
        this.f75583c = false;
        this.f75586f = 1;
    }

    public RecyclerPreloadView(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75582b = false;
        this.f75583c = false;
        this.f75586f = 1;
    }

    public RecyclerPreloadView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f75582b = false;
        this.f75583c = false;
        this.f75586f = 1;
    }

    private void setLayoutManagerPosition(RecyclerView.LayoutManager layoutManager) {
        if (PatchProxy.proxy(new Object[]{layoutManager}, this, changeQuickRedirect, false, c.m.f35174za, new Class[]{RecyclerView.LayoutManager.class}, Void.TYPE).isSupported) {
            return;
        }
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            this.f75584d = gridLayoutManager.findFirstVisibleItemPosition();
            this.f75585e = gridLayoutManager.findLastVisibleItemPosition();
        } else if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.f75584d = linearLayoutManager.findFirstVisibleItemPosition();
            this.f75585e = linearLayoutManager.findLastVisibleItemPosition();
        }
    }

    public boolean e() {
        return this.f75583c;
    }

    public int getFirstVisiblePosition() {
        return this.f75584d;
    }

    public int getLastVisiblePosition() {
        return this.f75585e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i10) {
        r rVar;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.Aa, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.onScrollStateChanged(i10);
        if (i10 == 0 || i10 == 1) {
            setLayoutManagerPosition(getLayoutManager());
        }
        q qVar = this.f75589i;
        if (qVar != null) {
            qVar.a(i10);
        }
        if (i10 != 0 || (rVar = this.f75588h) == null) {
            return;
        }
        rVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i10, int i11) {
        boolean z10;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.f35152ya, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onScrolled(i10, i11);
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            throw new RuntimeException("LayoutManager is null,Please check it!");
        }
        setLayoutManagerPosition(layoutManager);
        if (this.f75587g != null && this.f75583c) {
            RecyclerView.Adapter adapter = getAdapter();
            if (adapter == null) {
                throw new RuntimeException("Adapter is null,Please check it!");
            }
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                if (gridLayoutManager.findLastVisibleItemPosition() / gridLayoutManager.getSpanCount() >= (adapter.getItemCount() / gridLayoutManager.getSpanCount()) - this.f75586f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f75582b = false;
            } else if (!this.f75582b) {
                this.f75587g.C2();
                if (i11 > 0) {
                    this.f75582b = true;
                }
            } else if (i11 == 0) {
                this.f75582b = false;
            }
        }
        q qVar = this.f75589i;
        if (qVar != null) {
            qVar.b(i10, i11);
        }
        if (this.f75588h != null) {
            if (Math.abs(i11) < 150) {
                this.f75588h.a();
            } else {
                this.f75588h.b();
            }
        }
    }

    public void setEnabledLoadMore(boolean z10) {
        this.f75583c = z10;
    }

    public void setLastVisiblePosition(int i10) {
        this.f75585e = i10;
    }

    public void setOnRecyclerViewPreloadListener(p pVar) {
        this.f75587g = pVar;
    }

    public void setOnRecyclerViewScrollListener(q qVar) {
        this.f75589i = qVar;
    }

    public void setOnRecyclerViewScrollStateListener(r rVar) {
        this.f75588h = rVar;
    }

    public void setReachBottomRow(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.f75586f = i10;
    }
}
