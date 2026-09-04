package com.max.hbcommon.base.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.j1;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: DefaultDividerItemDecoration.java */
/* JADX INFO: loaded from: classes9.dex */
public class i extends RecyclerView.ItemDecoration {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f66751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f66752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f66755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f66756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f66757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f66758i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Paint f66759j;

    public i(Context context) {
        this(context, 0, 0);
    }

    public i(Context context, int i10, int i11) {
        this(context, context.getResources().getDimensionPixelSize(R.dimen.divider_height), i10, i11);
    }

    public i(Context context, int i10, int i11, int i12) {
        this.f66751b = new Rect();
        this.f66752c = i11;
        this.f66753d = i12;
        this.f66759j = new Paint();
        this.f66754e = i10;
        this.f66755f = context.getResources().getColor(R.color.divider_secondary_1_color);
        this.f66756g = context.getResources().getColor(R.color.background_layer_2_color);
        this.f66757h = true;
        this.f66758i = false;
    }

    public int a() {
        return this.f66755f;
    }

    public int b() {
        return this.f66756g;
    }

    public boolean c() {
        return this.f66757h;
    }

    public boolean d() {
        return this.f66758i;
    }

    public void e(int i10) {
        this.f66755f = i10;
    }

    public i f(boolean z10) {
        this.f66757h = z10;
        return this;
    }

    public i g(boolean z10) {
        this.f66758i = z10;
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, bb.c.b.By, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = recyclerView.getAdapter().getItemCount();
        if ((this.f66758i || childAdapterPosition != itemCount - 1) && (this.f66757h || childAdapterPosition != 0)) {
            rect.set(0, 0, 0, this.f66754e);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    public void h(int i10) {
        this.f66756g = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int width;
        int i10;
        int i11 = 0;
        if (PatchProxy.proxy(new Object[]{canvas, recyclerView, state}, this, changeQuickRedirect, false, bb.c.b.Ay, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported || recyclerView.getLayoutManager() == null) {
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int width2 = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width2, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            i10 = paddingLeft;
            width = width2;
        } else {
            width = recyclerView.getWidth();
            i10 = 0;
        }
        int childCount = recyclerView.getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = recyclerView.getChildAt(i12);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            int itemCount = recyclerView.getAdapter() != null ? recyclerView.getAdapter().getItemCount() : i11;
            if ((this.f66758i || childAdapterPosition != itemCount - 1) && (this.f66757h || childAdapterPosition != 0)) {
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.f66751b);
                int iRound = this.f66751b.bottom + Math.round(j1.z0(childAt));
                int i13 = iRound - this.f66754e;
                if (this.f66752c > 0) {
                    this.f66759j.setColor(this.f66756g);
                    canvas.drawRect(i10, i13, this.f66752c + i10, iRound, this.f66759j);
                }
                this.f66759j.setColor(this.f66755f);
                int i14 = this.f66753d;
                int i15 = width - i14;
                int i16 = this.f66752c;
                if (i15 >= i10 + i16) {
                    canvas.drawRect(i16 + i10, i13, width - i14, iRound, this.f66759j);
                }
                int i17 = this.f66753d;
                if (i17 > 0 && i17 <= width) {
                    this.f66759j.setColor(this.f66756g);
                    canvas.drawRect(width - this.f66753d, i13, width, iRound, this.f66759j);
                }
            }
            i12++;
            i11 = 0;
        }
        canvas.restore();
    }
}
