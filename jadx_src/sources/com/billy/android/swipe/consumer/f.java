package com.billy.android.swipe.consumer;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.billy.android.swipe.SmartSwipeWrapper;
import com.billy.android.swipe.internal.ScrimView;

/* JADX INFO: compiled from: DrawerConsumer.java */
/* JADX INFO: loaded from: classes6.dex */
public class f extends com.billy.android.swipe.f implements View.OnClickListener {
    protected View W;
    protected int X;
    protected int Y;
    protected int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected int f40362a0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    protected ScrimView f40365p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    protected boolean f40366p2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    protected int f40367x1;
    protected final View[] V = new View[4];

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected int f40363b0 = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected int f40364c0 = 0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    protected boolean f40368y1 = true;

    public f() {
        E1(3);
    }

    private void f2(int i10) {
        View view = this.V[i10];
        SmartSwipeWrapper smartSwipeWrapper = this.f40407b;
        if (view == null || smartSwipeWrapper == null || view.getParent() == smartSwipeWrapper) {
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        int iIndexOfChild = smartSwipeWrapper.indexOfChild(smartSwipeWrapper.getContentView());
        if (iIndexOfChild >= 0) {
            if (view.getLayoutParams() == null) {
                int i11 = -1;
                int i12 = -2;
                if (i10 == 0 || i10 == 1) {
                    i12 = -1;
                    i11 = -2;
                } else if (i10 != 2 && i10 != 3) {
                    i11 = -2;
                }
                view.setLayoutParams(new FrameLayout.LayoutParams(i11, i12));
            }
            smartSwipeWrapper.addView(view, iIndexOfChild);
            view.setVisibility(4);
        }
    }

    private void y2(int i10, View view) {
        View[] viewArr = this.V;
        if (viewArr[i10] == view) {
            return;
        }
        viewArr[i10] = view;
        f2(i10);
    }

    public f A2(int i10) {
        this.f40363b0 = i10;
        return this;
    }

    public f B2(int i10) {
        this.f40364c0 = i10;
        return this;
    }

    public f C2(int i10) {
        this.f40367x1 = i10;
        return this;
    }

    public f D2(View view) {
        return u2(4, view);
    }

    public f E2(View view) {
        return u2(12, view);
    }

    public f F2() {
        this.f40366p2 = false;
        return this;
    }

    public f G2() {
        this.f40366p2 = true;
        return this;
    }

    @Override // com.billy.android.swipe.f
    public boolean V1(int i10, float f10, float f11, float f12, float f13) {
        boolean zV1 = super.V1(i10, f10, f11, f12, f13);
        if (zV1 && this.f40409d == 0 && this.f40410e == 0 && this.f40368y1 && i2(this.f40408c) == null) {
            return false;
        }
        return zV1;
    }

    @Override // com.billy.android.swipe.f
    public int a0() {
        View view = this.W;
        if (view == null) {
            return super.a0();
        }
        return (this.f40408c & 3) > 0 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    @Override // com.billy.android.swipe.f
    protected void a1(boolean z10) {
        KeyEvent.Callback callback = this.W;
        if (callback instanceof r6.b) {
            ((r6.b) callback).a(this.f40407b, this, this.f40408c, z10, this.f40418m);
        }
        super.a1(z10);
    }

    @Override // com.billy.android.swipe.f
    protected void b1(float f10, float f11) {
        KeyEvent.Callback callback = this.W;
        if (callback instanceof r6.b) {
            ((r6.b) callback).h(this.f40407b, this, this.f40408c, this.f40418m, f10, f11);
        }
        super.b1(f10, f11);
    }

    @Override // com.billy.android.swipe.f
    protected void c1() {
        KeyEvent.Callback callback = this.W;
        if (callback instanceof r6.b) {
            ((r6.b) callback).f(this.f40407b, this, this.f40408c);
        }
        super.c1();
    }

    @Override // com.billy.android.swipe.f
    public void e1(SmartSwipeWrapper smartSwipeWrapper, com.billy.android.swipe.internal.b bVar) {
        super.e1(smartSwipeWrapper, bVar);
        for (int i10 = 0; i10 < this.V.length; i10++) {
            f2(i10);
        }
        if (this.f40367x1 == 0) {
            this.f40367x1 = com.billy.android.swipe.b.b(10, smartSwipeWrapper.getContext());
        }
    }

    @Override // com.billy.android.swipe.f
    protected boolean f(ViewGroup viewGroup, int i10, int i11, float f10, float f11, float f12, float f13) {
        if (this.f40408c == 0 || this.f40407b.getContentView() != S(viewGroup, (int) f10, (int) f11)) {
            return super.f(viewGroup, i10, i11, f10, f11, f12, f13);
        }
        return false;
    }

    @Override // com.billy.android.swipe.f
    protected void f1() {
        super.f1();
        if (this.W != null) {
            h2(4);
        }
        ScrimView scrimView = this.f40365p1;
        if (scrimView != null) {
            scrimView.setOnClickListener(null);
            this.f40365p1.setClickable(false);
            this.f40365p1.setFocusable(false);
            this.f40365p1.setVisibility(8);
        }
    }

    @Override // com.billy.android.swipe.f
    public void g1() {
        super.g1();
        ScrimView scrimView = this.f40365p1;
        if (scrimView != null) {
            this.f40407b.removeView(scrimView);
            this.f40365p1.setOnClickListener(null);
            this.f40365p1 = null;
        }
        for (View view : this.V) {
            if (view != null) {
                this.f40407b.removeView(view);
            }
        }
        this.W = null;
    }

    protected void g2(int i10, int i11, int i12) {
        if (i10 == 1) {
            int i13 = -i11;
            this.X = i13;
            this.Z = i13 + i11;
            this.Y = 0;
            this.f40362a0 = i12;
            return;
        }
        if (i10 == 2) {
            int i14 = this.D;
            this.X = i14;
            this.Z = i14 + i11;
            this.Y = 0;
            this.f40362a0 = i12;
            return;
        }
        if (i10 == 4) {
            this.X = 0;
            this.Z = this.D;
            int i15 = -i12;
            this.Y = i15;
            this.f40362a0 = i15 + i12;
            return;
        }
        if (i10 != 8) {
            return;
        }
        this.X = 0;
        this.Z = this.D;
        int i16 = this.E;
        this.Y = i16;
        this.f40362a0 = i16 + i12;
    }

    @Override // com.billy.android.swipe.f
    protected void h1(int i10, int i11, int i12, int i13) {
        View view = this.W;
        if (view == null || view.getParent() != this.f40407b) {
            return;
        }
        if ((this.f40408c & 3) > 0) {
            com.billy.android.swipe.internal.d.g(view, i12);
        } else {
            com.billy.android.swipe.internal.d.h(view, i13);
        }
        q2();
    }

    protected void h2(int i10) {
        View view = this.W;
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public View i2(int i10) {
        byte b10 = 2;
        if (i10 == 1) {
            b10 = 0;
        } else if (i10 == 2) {
            b10 = 1;
        } else if (i10 != 4) {
            b10 = i10 != 8 ? (byte) -1 : (byte) 3;
        }
        if (b10 < 0) {
            return null;
        }
        return this.V[b10];
    }

    @Override // com.billy.android.swipe.f
    public boolean j1(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f40407b == null) {
            return false;
        }
        n2();
        return true;
    }

    public int j2() {
        return this.f40367x1;
    }

    protected void k2() {
        if (this.f40363b0 != 0 || (this.f40364c0 != 0 && this.f40367x1 > 0)) {
            if (this.f40365p1 == null) {
                ScrimView scrimView = new ScrimView(this.f40407b.getContext());
                this.f40365p1 = scrimView;
                this.f40407b.addView(scrimView);
            }
            this.f40365p1.setScrimColor(this.f40363b0);
            if (this.f40364c0 != 0 && this.f40367x1 > 0) {
                int iA = this.f40408c;
                if (this.f40366p2) {
                    iA = com.billy.android.swipe.internal.c.a(iA);
                }
                this.f40365p1.setDirection(this.f40408c, this.f40364c0, iA, this.f40367x1, this.D, this.E);
            }
            this.f40365p1.setVisibility(0);
        }
    }

    @Override // com.billy.android.swipe.f
    protected void l1() {
        super.l1();
        ScrimView scrimView = this.f40365p1;
        if (scrimView == null || this.f40366p2) {
            return;
        }
        scrimView.setOnClickListener(this);
    }

    public boolean l2() {
        return this.f40368y1;
    }

    @Override // com.billy.android.swipe.f
    protected void m0() {
        SmartSwipeWrapper smartSwipeWrapper = this.f40407b;
        int childCount = smartSwipeWrapper.getChildCount();
        View contentView = smartSwipeWrapper.getContentView();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = smartSwipeWrapper.getChildAt(i10);
            if (childAt != contentView && (childAt.getLayoutParams() instanceof SmartSwipeWrapper.LayoutParams)) {
                int i11 = ((SmartSwipeWrapper.LayoutParams) childAt.getLayoutParams()).f40304a;
                if (this.V[0] == null && (i11 & 1) == 1) {
                    x2(childAt);
                    this.f40407b.consumeInflateFromXml();
                }
                if (this.V[1] == null && (i11 & 2) == 2) {
                    z2(childAt);
                    this.f40407b.consumeInflateFromXml();
                }
                if (this.V[2] == null && (i11 & 4) == 4) {
                    D2(childAt);
                    this.f40407b.consumeInflateFromXml();
                }
                if (this.V[3] == null && (i11 & 8) == 8) {
                    t2(childAt);
                    this.f40407b.consumeInflateFromXml();
                }
            }
        }
    }

    public boolean m2() {
        return this.f40366p2;
    }

    @Override // com.billy.android.swipe.f
    public void n1(int i10, boolean z10, float f10, float f11) {
        if (this.f40409d == 0 && this.f40410e == 0) {
            h2(4);
            this.W = i2(this.f40408c);
            h2(0);
        }
        int measuredWidth = this.D;
        int measuredHeight = this.E;
        View view = this.W;
        if (view != null) {
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = this.W.getMeasuredHeight();
        } else if (this.f40368y1) {
            return;
        }
        if (!this.f40414i) {
            if ((this.f40408c & 3) > 0) {
                this.f40428w = measuredWidth;
            } else {
                this.f40428w = measuredHeight;
            }
        }
        g2(this.f40408c, measuredWidth, measuredHeight);
        h2(0);
        k2();
        n2();
        r2();
        super.n1(i10, z10, f10, f11);
    }

    protected void n2() {
        o2(this.f40407b.getContentView());
        p2();
        q2();
    }

    protected void o2(View view) {
        if (view != null) {
            view.layout(0, 0, this.D, this.E);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (U() == 0 && !this.f40366p2 && view == this.f40365p1) {
            N1();
        }
    }

    protected void p2() {
        View view = this.W;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        View view2 = this.W;
        int i10 = this.X;
        int i11 = this.f40416k;
        int i12 = this.Y;
        int i13 = this.f40417l;
        view2.layout(i10 + i11, i12 + i13, this.Z + i11, this.f40362a0 + i13);
    }

    protected void q2() {
        int i10;
        int i11;
        ScrimView scrimView = this.f40365p1;
        if (scrimView == null || scrimView.getVisibility() != 0) {
            return;
        }
        int i12 = this.D;
        int i13 = this.E;
        int i14 = 0;
        if (this.f40366p2) {
            int i15 = this.f40408c;
            if (i15 == 1) {
                i12 = this.f40416k;
            } else if (i15 == 2) {
                i10 = this.f40416k + i12;
                i14 = i10;
                i11 = 0;
            } else if (i15 == 4) {
                i13 = this.f40417l;
            } else if (i15 == 8) {
                i11 = this.f40417l + i13;
            }
            i11 = 0;
        } else {
            int i16 = this.f40408c;
            if (i16 != 1) {
                if (i16 == 2) {
                    i12 += this.f40416k;
                } else if (i16 == 4) {
                    i11 = this.f40417l;
                } else if (i16 == 8) {
                    i13 += this.f40417l;
                }
                i11 = 0;
            } else {
                i10 = this.f40416k;
                i14 = i10;
                i11 = 0;
            }
        }
        this.f40365p1.layout(i14, i11, i12, i13);
        this.f40365p1.setProgress(this.f40366p2 ? 1.0f - this.f40418m : this.f40418m);
    }

    protected void r2() {
        View view = this.W;
        if (view != null) {
            view.bringToFront();
        }
        ScrimView scrimView = this.f40365p1;
        if (scrimView != null) {
            scrimView.bringToFront();
        }
    }

    public f s2(View view) {
        return u2(15, view);
    }

    public f t2(View view) {
        return u2(8, view);
    }

    public f u2(int i10, View view) {
        w(i10, view != null);
        if ((i10 & 1) > 0) {
            y2(0, view);
        }
        if ((i10 & 2) > 0) {
            y2(1, view);
        }
        if ((i10 & 4) > 0) {
            y2(2, view);
        }
        if ((i10 & 8) > 0) {
            y2(3, view);
        }
        return this;
    }

    @Override // com.billy.android.swipe.f
    public void v1() {
        this.W = null;
        super.v1();
    }

    public f v2(boolean z10) {
        this.f40368y1 = z10;
        return this;
    }

    public f w2(View view) {
        return u2(3, view);
    }

    public f x2(View view) {
        return u2(1, view);
    }

    public f z2(View view) {
        return u2(2, view);
    }
}
