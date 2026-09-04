package com.max.xiaoheihe.module.account.specificsearch;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.n;
import androidx.compose.runtime.internal.o;
import androidx.core.view.j1;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SearchResultDividerDecoration.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class a extends RecyclerView.ItemDecoration {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f79246f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f79247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f79248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Paint f79249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Rect f79250e;

    public a(int i10, @n int i11) {
        this.f79247b = i10;
        this.f79248c = i11;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(com.max.xiaoheihe.utils.d.E(i11));
        this.f79249d = paint;
        this.f79250e = new Rect();
    }

    public /* synthetic */ a(int i10, int i11, int i12, u uVar) {
        this(i10, (i12 & 2) != 0 ? R.color.divider_secondary_1_color : i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@dl.d Canvas canvas, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{canvas, parent, state}, this, changeQuickRedirect, false, 25213, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        f0.p(parent, "parent");
        f0.p(state, "state");
        super.onDraw(canvas, parent, state);
        int childCount = parent.getChildCount();
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = parent.getChildAt(i10);
            parent.getDecoratedBoundsWithMargins(childAt, this.f79250e);
            int iRound = this.f79250e.bottom + Math.round(j1.z0(childAt));
            canvas.drawRect(paddingLeft, iRound - this.f79247b, width, iRound, this.f79249d);
        }
    }
}
