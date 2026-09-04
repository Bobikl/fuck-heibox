package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.t0;
import androidx.core.graphics.drawable.d;
import androidx.core.view.j1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.resources.c;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialDividerItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f54185j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f54186k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f54187l = R.style.Widget_MaterialComponents_MaterialDivider;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private Drawable f54188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    private int f54190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f54194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f54195i;

    public MaterialDividerItemDecoration(@n0 Context context, int i10) {
        this(context, null, i10);
    }

    public MaterialDividerItemDecoration(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, R.attr.materialDividerStyle, i10);
    }

    public MaterialDividerItemDecoration(@n0 Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        this.f54195i = new Rect();
        TypedArray typedArrayK = c0.k(context, attributeSet, R.styleable.C0, i10, f54187l, new int[0]);
        this.f54190d = c.a(context, typedArrayK, R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.f54189c = typedArrayK.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f54192f = typedArrayK.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.f54193g = typedArrayK.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.f54194h = typedArrayK.getBoolean(R.styleable.MaterialDivider_lastItemDecorated, true);
        typedArrayK.recycle();
        this.f54188b = new ShapeDrawable();
        i(this.f54190d);
        setOrientation(i11);
    }

    private void a(@n0 Canvas canvas, @n0 RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i10 = paddingTop + this.f54192f;
        int i11 = height - this.f54193g;
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            if (s(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f54195i);
                int iRound = this.f54195i.right + Math.round(childAt.getTranslationX());
                this.f54188b.setBounds(iRound - this.f54189c, i10, iRound, i11);
                this.f54188b.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void b(@n0 Canvas canvas, @n0 RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean z10 = j1.Z(recyclerView) == 1;
        int i10 = paddingLeft + (z10 ? this.f54193g : this.f54192f);
        int i11 = width - (z10 ? this.f54192f : this.f54193g);
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            if (s(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f54195i);
                int iRound = this.f54195i.bottom + Math.round(childAt.getTranslationY());
                this.f54188b.setBounds(i10, iRound - this.f54189c, i11, iRound);
                this.f54188b.draw(canvas);
            }
        }
        canvas.restore();
    }

    private boolean s(@n0 RecyclerView recyclerView, @n0 View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z10 = adapter != null && childAdapterPosition == adapter.getItemCount() - 1;
        if (childAdapterPosition != -1) {
            return (!z10 || this.f54194h) && r(childAdapterPosition, adapter);
        }
        return false;
    }

    @l
    public int c() {
        return this.f54190d;
    }

    @t0
    public int d() {
        return this.f54193g;
    }

    @t0
    public int e() {
        return this.f54192f;
    }

    @t0
    public int f() {
        return this.f54189c;
    }

    public int g() {
        return this.f54191e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@n0 Rect rect, @n0 View view, @n0 RecyclerView recyclerView, @n0 RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (s(recyclerView, view)) {
            if (this.f54191e == 1) {
                rect.bottom = this.f54189c;
            } else {
                rect.right = this.f54189c;
            }
        }
    }

    public boolean h() {
        return this.f54194h;
    }

    public void i(@l int i10) {
        this.f54190d = i10;
        Drawable drawableR = d.r(this.f54188b);
        this.f54188b = drawableR;
        d.n(drawableR, i10);
    }

    public void j(@n0 Context context, @n int i10) {
        i(androidx.core.content.d.f(context, i10));
    }

    public void k(@t0 int i10) {
        this.f54193g = i10;
    }

    public void l(@n0 Context context, @q int i10) {
        k(context.getResources().getDimensionPixelOffset(i10));
    }

    public void m(@t0 int i10) {
        this.f54192f = i10;
    }

    public void n(@n0 Context context, @q int i10) {
        m(context.getResources().getDimensionPixelOffset(i10));
    }

    public void o(@t0 int i10) {
        this.f54189c = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@n0 Canvas canvas, @n0 RecyclerView recyclerView, @n0 RecyclerView.State state) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.f54191e == 1) {
            b(canvas, recyclerView);
        } else {
            a(canvas, recyclerView);
        }
    }

    public void p(@n0 Context context, @q int i10) {
        o(context.getResources().getDimensionPixelSize(i10));
    }

    public void q(boolean z10) {
        this.f54194h = z10;
    }

    protected boolean r(int i10, @p0 RecyclerView.Adapter<?> adapter) {
        return true;
    }

    public void setOrientation(int i10) {
        if (i10 == 0 || i10 == 1) {
            this.f54191e = i10;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i10 + ". It should be either HORIZONTAL or VERTICAL");
    }
}
