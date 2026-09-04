package com.max.hbcustomview;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MarginItemDecoration.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends RecyclerView.ItemDecoration {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f69068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f69069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f69070d;

    public d(int i10, int i11) {
        this(i10, i11, i11);
    }

    public d(int i10, int i11, int i12) {
        this.f69068b = i10;
        this.f69069c = i11;
        this.f69070d = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, bb.c.f.R7, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(outRect, "outRect");
        f0.p(view, "view");
        f0.p(parent, "parent");
        f0.p(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new IllegalStateException("Make sure you are using the LinearLayoutManager！");
        }
        int orientation = ((LinearLayoutManager) layoutManager).getOrientation();
        outRect.top = 0;
        outRect.left = 0;
        outRect.right = 0;
        outRect.bottom = 0;
        int i10 = childAdapterPosition == 0 ? this.f69069c : this.f69068b / 2;
        int i11 = childAdapterPosition == itemCount - 1 ? this.f69070d : this.f69068b / 2;
        if (orientation == 1) {
            outRect.top = i10;
            outRect.bottom = i11;
        } else {
            outRect.left = i10;
            outRect.right = i11;
        }
    }
}
