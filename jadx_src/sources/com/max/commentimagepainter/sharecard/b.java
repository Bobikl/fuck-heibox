package com.max.commentimagepainter.sharecard;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CardSpacingDecoration.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends RecyclerView.ItemDecoration {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f65358b;

    public b(int i10) {
        this.f65358b = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView recycleView, @dl.d RecyclerView.State state) {
        int iE;
        int iE2;
        if (PatchProxy.proxy(new Object[]{outRect, view, recycleView, state}, this, changeQuickRedirect, false, bb.c.b.Gh, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(outRect, "outRect");
        f0.p(view, "view");
        f0.p(recycleView, "recycleView");
        f0.p(state, "state");
        int childAdapterPosition = recycleView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recycleView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (childAdapterPosition != -1) {
            if (childAdapterPosition == 0) {
                int i10 = this.f65358b;
                Resources resources = view.getResources();
                f0.o(resources, "getResources(...)");
                iE = i10 + ShareCardDrawUtilsKt.e(30, resources);
            } else {
                iE = this.f65358b;
            }
            outRect.left = iE;
            if (childAdapterPosition == itemCount - 1) {
                int i11 = this.f65358b;
                Resources resources2 = view.getResources();
                f0.o(resources2, "getResources(...)");
                iE2 = i11 + ShareCardDrawUtilsKt.e(30, resources2);
            } else {
                iE2 = this.f65358b;
            }
            outRect.right = iE2;
        }
    }
}
