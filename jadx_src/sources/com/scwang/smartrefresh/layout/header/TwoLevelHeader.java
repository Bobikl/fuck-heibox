package com.scwang.smartrefresh.layout.header;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;
import ng.d;
import ng.g;
import ng.h;
import ng.i;
import ng.j;
import og.b;

/* JADX INFO: loaded from: classes8.dex */
public class TwoLevelHeader extends InternalAbstract implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f96738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected float f96739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected float f96740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected float f96741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected float f96742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f96743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f96744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f96745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f96746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f96747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected h f96748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected i f96749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected d f96750q;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f96751a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f96751a = iArr;
            try {
                iArr[RefreshState.TwoLevelReleased.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96751a[RefreshState.TwoLevel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96751a[RefreshState.TwoLevelFinish.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96751a[RefreshState.PullDownToRefresh.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public TwoLevelHeader(Context context) {
        this(context, null);
    }

    public TwoLevelHeader(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f96739f = 0.0f;
        this.f96740g = 2.5f;
        this.f96741h = 1.9f;
        this.f96742i = 1.0f;
        this.f96743j = true;
        this.f96744k = true;
        this.f96745l = true;
        this.f96746m = 1000;
        this.f96765c = b.f132312f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f96579g);
        this.f96740g = typedArrayObtainStyledAttributes.getFloat(R.styleable.TwoLevelHeader_srlMaxRage, this.f96740g);
        this.f96741h = typedArrayObtainStyledAttributes.getFloat(R.styleable.TwoLevelHeader_srlFloorRage, this.f96741h);
        this.f96742i = typedArrayObtainStyledAttributes.getFloat(R.styleable.TwoLevelHeader_srlRefreshRage, this.f96742i);
        this.f96740g = typedArrayObtainStyledAttributes.getFloat(R.styleable.TwoLevelHeader_srlMaxRate, this.f96740g);
        this.f96741h = typedArrayObtainStyledAttributes.getFloat(R.styleable.TwoLevelHeader_srlFloorRate, this.f96741h);
        this.f96742i = typedArrayObtainStyledAttributes.getFloat(R.styleable.TwoLevelHeader_srlRefreshRate, this.f96742i);
        this.f96746m = typedArrayObtainStyledAttributes.getInt(R.styleable.TwoLevelHeader_srlFloorDuration, this.f96746m);
        this.f96743j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TwoLevelHeader_srlEnableTwoLevel, this.f96743j);
        this.f96745l = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TwoLevelHeader_srlEnableRefresh, this.f96745l);
        this.f96744k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TwoLevelHeader_srlEnablePullToCloseTwoLevel, this.f96744k);
        typedArrayObtainStyledAttributes.recycle();
    }

    public TwoLevelHeader A(g gVar, int i10, int i11) {
        if (gVar != null) {
            if (i10 == 0) {
                i10 = -1;
            }
            if (i11 == 0) {
                i11 = -2;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i11);
            ViewGroup.LayoutParams layoutParams2 = gVar.getView().getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
            }
            h hVar = this.f96748o;
            if (hVar != null) {
                removeView(hVar.getView());
            }
            if (gVar.getSpinnerStyle() == b.f132312f) {
                addView(gVar.getView(), 0, layoutParams);
            } else {
                addView(gVar.getView(), getChildCount(), layoutParams);
            }
            this.f96748o = gVar;
            this.f96766d = gVar;
        }
        return this;
    }

    public TwoLevelHeader B(float f10) {
        this.f96742i = f10;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public void b(@n0 i iVar, int i10, int i11) {
        h hVar = this.f96748o;
        if (hVar == null) {
            return;
        }
        if (((i11 + i10) * 1.0f) / i10 != this.f96740g && this.f96747n == 0) {
            this.f96747n = i10;
            this.f96748o = null;
            iVar.d().E(this.f96740g);
            this.f96748o = hVar;
        }
        if (this.f96749p == null && hVar.getSpinnerStyle() == b.f132310d && !isInEditMode()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hVar.getView().getLayoutParams();
            marginLayoutParams.topMargin -= i10;
            hVar.getView().setLayoutParams(marginLayoutParams);
        }
        this.f96747n = i10;
        this.f96749p = iVar;
        iVar.h(this.f96746m);
        iVar.e(this, !this.f96744k);
        hVar.b(iVar, i10, i11);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract
    public boolean equals(Object obj) {
        h hVar = this.f96748o;
        return (hVar != null && hVar.equals(obj)) || super.equals(obj);
    }

    public TwoLevelHeader f() {
        i iVar = this.f96749p;
        if (iVar != null) {
            iVar.g();
        }
        return this;
    }

    protected void k(int i10) {
        h hVar = this.f96748o;
        if (this.f96738e == i10 || hVar == null) {
            return;
        }
        this.f96738e = i10;
        b spinnerStyle = hVar.getSpinnerStyle();
        if (spinnerStyle == b.f132310d) {
            hVar.getView().setTranslationY(i10);
        } else if (spinnerStyle.f132318c) {
            View view = hVar.getView();
            view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getTop() + Math.max(0, i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f96765c = b.f132314h;
        if (this.f96748o == null) {
            z(new ClassicsHeader(getContext()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f96765c = b.f132312f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof g) {
                this.f96748o = (g) childAt;
                this.f96766d = (h) childAt;
                bringChildToFront(childAt);
                return;
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        h hVar = this.f96748o;
        if (hVar == null) {
            super.onMeasure(i10, i11);
        } else {
            if (View.MeasureSpec.getMode(i11) != Integer.MIN_VALUE) {
                super.onMeasure(i10, i11);
                return;
            }
            hVar.getView().measure(i10, i11);
            super.setMeasuredDimension(View.resolveSize(super.getSuggestedMinimumWidth(), i10), hVar.getView().getMeasuredHeight());
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, pg.f
    public void q(@n0 j jVar, @n0 RefreshState refreshState, @n0 RefreshState refreshState2) {
        h hVar = this.f96748o;
        if (hVar != null) {
            if (refreshState2 == RefreshState.ReleaseToRefresh && !this.f96745l) {
                refreshState2 = RefreshState.PullDownToRefresh;
            }
            hVar.q(jVar, refreshState, refreshState2);
            int i10 = a.f96751a[refreshState2.ordinal()];
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 == 3) {
                    if (hVar.getView() != this) {
                        hVar.getView().animate().alpha(1.0f).setDuration(this.f96746m / 2);
                        return;
                    }
                    return;
                } else {
                    if (i10 == 4 && hVar.getView().getAlpha() == 0.0f && hVar.getView() != this) {
                        hVar.getView().setAlpha(1.0f);
                        return;
                    }
                    return;
                }
            }
            if (hVar.getView() != this) {
                hVar.getView().animate().alpha(0.0f).setDuration(this.f96746m / 2);
            }
            i iVar = this.f96749p;
            if (iVar != null) {
                d dVar = this.f96750q;
                if (dVar != null && !dVar.a(jVar)) {
                    z10 = false;
                }
                iVar.i(z10);
            }
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public void r(boolean z10, float f10, int i10, int i11, int i12) {
        k(i10);
        h hVar = this.f96748o;
        i iVar = this.f96749p;
        if (hVar != null) {
            hVar.r(z10, f10, i10, i11, i12);
        }
        if (z10) {
            float f11 = this.f96739f;
            float f12 = this.f96741h;
            if (f11 < f12 && f10 >= f12 && this.f96743j) {
                iVar.f(RefreshState.ReleaseToTwoLevel);
            } else if (f11 >= f12 && f10 < this.f96742i) {
                iVar.f(RefreshState.PullDownToRefresh);
            } else if (f11 >= f12 && f10 < f12 && this.f96745l) {
                iVar.f(RefreshState.ReleaseToRefresh);
            } else if (!this.f96745l && iVar.d().getState() != RefreshState.ReleaseToTwoLevel) {
                iVar.f(RefreshState.PullDownToRefresh);
            }
            this.f96739f = f10;
        }
    }

    public TwoLevelHeader s(boolean z10) {
        i iVar = this.f96749p;
        if (iVar != null) {
            d dVar = this.f96750q;
            iVar.i(!z10 || dVar == null || dVar.a(iVar.d()));
        }
        return this;
    }

    public TwoLevelHeader t(boolean z10) {
        i iVar = this.f96749p;
        this.f96744k = z10;
        if (iVar != null) {
            iVar.e(this, !z10);
        }
        return this;
    }

    public TwoLevelHeader u(boolean z10) {
        this.f96743j = z10;
        return this;
    }

    public TwoLevelHeader v(int i10) {
        this.f96746m = i10;
        return this;
    }

    public TwoLevelHeader w(float f10) {
        this.f96741h = f10;
        return this;
    }

    public TwoLevelHeader x(float f10) {
        if (this.f96740g != f10) {
            this.f96740g = f10;
            i iVar = this.f96749p;
            if (iVar != null) {
                this.f96747n = 0;
                iVar.d().E(this.f96740g);
            }
        }
        return this;
    }

    public TwoLevelHeader y(d dVar) {
        this.f96750q = dVar;
        return this;
    }

    public TwoLevelHeader z(g gVar) {
        return A(gVar, -1, -2);
    }
}
