package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
public class GhostViewPort extends ViewGroup implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ViewGroup f27710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    View f27711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f27712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f27713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private Matrix f27714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f27715g;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            j1.n1(GhostViewPort.this);
            GhostViewPort ghostViewPort = GhostViewPort.this;
            ViewGroup viewGroup = ghostViewPort.f27710b;
            if (viewGroup == null || (view = ghostViewPort.f27711c) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            j1.n1(GhostViewPort.this.f27710b);
            GhostViewPort ghostViewPort2 = GhostViewPort.this;
            ghostViewPort2.f27710b = null;
            ghostViewPort2.f27711c = null;
            return true;
        }
    }

    GhostViewPort(View view) {
        super(view.getContext());
        this.f27715g = new a();
        this.f27712d = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    static GhostViewPort b(View view, ViewGroup viewGroup, Matrix matrix) {
        GhostViewHolder ghostViewHolder;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        GhostViewHolder ghostViewHolderB = GhostViewHolder.b(viewGroup);
        GhostViewPort ghostViewPortE = e(view);
        int i10 = 0;
        if (ghostViewPortE != null && (ghostViewHolder = (GhostViewHolder) ghostViewPortE.getParent()) != ghostViewHolderB) {
            i10 = ghostViewPortE.f27713e;
            ghostViewHolder.removeView(ghostViewPortE);
            ghostViewPortE = null;
        }
        if (ghostViewPortE == null) {
            if (matrix == null) {
                matrix = new Matrix();
                c(view, viewGroup, matrix);
            }
            ghostViewPortE = new GhostViewPort(view);
            ghostViewPortE.setMatrix(matrix);
            if (ghostViewHolderB == null) {
                ghostViewHolderB = new GhostViewHolder(viewGroup);
            } else {
                ghostViewHolderB.g();
            }
            d(viewGroup, ghostViewHolderB);
            d(viewGroup, ghostViewPortE);
            ghostViewHolderB.a(ghostViewPortE);
            ghostViewPortE.f27713e = i10;
        } else if (matrix != null) {
            ghostViewPortE.setMatrix(matrix);
        }
        ghostViewPortE.f27713e++;
        return ghostViewPortE;
    }

    static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        l0.j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        l0.k(viewGroup, matrix);
    }

    static void d(View view, View view2) {
        l0.g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    static GhostViewPort e(View view) {
        return (GhostViewPort) view.getTag(R.id.ghost_view);
    }

    static void f(View view) {
        GhostViewPort ghostViewPortE = e(view);
        if (ghostViewPortE != null) {
            int i10 = ghostViewPortE.f27713e - 1;
            ghostViewPortE.f27713e = i10;
            if (i10 <= 0) {
                ((GhostViewHolder) ghostViewPortE.getParent()).removeView(ghostViewPortE);
            }
        }
    }

    static void g(@androidx.annotation.n0 View view, @androidx.annotation.p0 GhostViewPort ghostViewPort) {
        view.setTag(R.id.ghost_view, ghostViewPort);
    }

    @Override // androidx.transition.f
    public void a(ViewGroup viewGroup, View view) {
        this.f27710b = viewGroup;
        this.f27711c = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.f27712d, this);
        this.f27712d.getViewTreeObserver().addOnPreDrawListener(this.f27715g);
        l0.i(this.f27712d, 4);
        if (this.f27712d.getParent() != null) {
            ((View) this.f27712d.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f27712d.getViewTreeObserver().removeOnPreDrawListener(this.f27715g);
        l0.i(this.f27712d, 0);
        g(this.f27712d, null);
        if (this.f27712d.getParent() != null) {
            ((View) this.f27712d.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        b.a(canvas, true);
        canvas.setMatrix(this.f27714f);
        l0.i(this.f27712d, 0);
        this.f27712d.invalidate();
        l0.i(this.f27712d, 4);
        drawChild(canvas, this.f27712d, getDrawingTime());
        b.a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    void setMatrix(@androidx.annotation.n0 Matrix matrix) {
        this.f27714f = matrix;
    }

    @Override // android.view.View, androidx.transition.f
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (e(this.f27712d) == this) {
            l0.i(this.f27712d, i10 == 0 ? 4 : 0);
        }
    }
}
