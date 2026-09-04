package com.scwang.smartrefresh.layout.internal;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.annotation.v;
import androidx.core.content.d;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.internal.InternalClassics;
import ng.h;
import ng.i;
import ng.j;

/* JADX INFO: loaded from: classes8.dex */
public abstract class InternalClassics<T extends InternalClassics> extends InternalAbstract implements h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f96767r = R.id.srl_classics_title;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f96768s = R.id.srl_classics_arrow;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f96769t = R.id.srl_classics_progress;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected TextView f96770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ImageView f96771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected ImageView f96772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected i f96773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected b f96774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b f96775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f96776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f96777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f96778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f96779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f96780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f96781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected int f96782q;

    public InternalClassics(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f96779n = 500;
        this.f96780o = 20;
        this.f96781p = 20;
        this.f96782q = 0;
        this.f96765c = og.b.f132310d;
    }

    public T A(@l int i10) {
        this.f96777l = true;
        this.f96778m = i10;
        i iVar = this.f96773h;
        if (iVar != null) {
            iVar.a(this, i10);
        }
        return (T) f();
    }

    public T B(@n int i10) {
        A(d.f(getContext(), i10));
        return (T) f();
    }

    public T C(Drawable drawable) {
        this.f96775j = null;
        this.f96772g.setImageDrawable(drawable);
        return (T) f();
    }

    public T D(@v int i10) {
        this.f96775j = null;
        this.f96772g.setImageResource(i10);
        return (T) f();
    }

    public T E(og.b bVar) {
        this.f96765c = bVar;
        return (T) f();
    }

    public T F(float f10) {
        this.f96770e.setTextSize(f10);
        i iVar = this.f96773h;
        if (iVar != null) {
            iVar.b(this);
        }
        return (T) f();
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public void b(@n0 i iVar, int i10, int i11) {
        this.f96773h = iVar;
        iVar.a(this, this.f96778m);
    }

    protected T f() {
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public int g(@n0 j jVar, boolean z10) {
        ImageView imageView = this.f96772g;
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        } else {
            imageView.animate().rotation(0.0f).setDuration(0L);
        }
        imageView.setVisibility(8);
        return this.f96779n;
    }

    public T k(@l int i10) {
        this.f96776k = true;
        this.f96770e.setTextColor(i10);
        b bVar = this.f96774i;
        if (bVar != null) {
            bVar.a(i10);
            this.f96771f.invalidateDrawable(this.f96774i);
        }
        b bVar2 = this.f96775j;
        if (bVar2 != null) {
            bVar2.a(i10);
            this.f96772g.invalidateDrawable(this.f96775j);
        }
        return (T) f();
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public void o(@n0 j jVar, int i10, int i11) {
        p(jVar, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageView imageView = this.f96771f;
        ImageView imageView2 = this.f96772g;
        imageView.animate().cancel();
        imageView2.animate().cancel();
        Object drawable = this.f96772g.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f96782q == 0) {
            this.f96780o = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            this.f96781p = paddingBottom;
            if (this.f96780o == 0 || paddingBottom == 0) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int iD = this.f96780o;
                if (iD == 0) {
                    iD = com.scwang.smartrefresh.layout.util.b.d(20.0f);
                }
                this.f96780o = iD;
                int iD2 = this.f96781p;
                if (iD2 == 0) {
                    iD2 = com.scwang.smartrefresh.layout.util.b.d(20.0f);
                }
                this.f96781p = iD2;
                setPadding(paddingLeft, this.f96780o, paddingRight, iD2);
            }
            setClipToPadding(false);
        }
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            int size = View.MeasureSpec.getSize(i11);
            int i12 = this.f96782q;
            if (size < i12) {
                int i13 = (size - i12) / 2;
                setPadding(getPaddingLeft(), i13, getPaddingRight(), i13);
            } else {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
            }
        } else {
            setPadding(getPaddingLeft(), this.f96780o, getPaddingRight(), this.f96781p);
        }
        super.onMeasure(i10, i11);
        if (this.f96782q == 0) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                int measuredHeight = getChildAt(i14).getMeasuredHeight();
                if (this.f96782q < measuredHeight) {
                    this.f96782q = measuredHeight;
                }
            }
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public void p(@n0 j jVar, int i10, int i11) {
        ImageView imageView = this.f96772g;
        if (imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
            Object drawable = this.f96772g.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            } else {
                imageView.animate().rotation(36000.0f).setDuration(100000L);
            }
        }
    }

    public T s(@n int i10) {
        k(d.f(getContext(), i10));
        return (T) f();
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public void setPrimaryColors(@l int... iArr) {
        if (iArr.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable) && !this.f96777l) {
                A(iArr[0]);
                this.f96777l = false;
            }
            if (this.f96776k) {
                return;
            }
            if (iArr.length > 1) {
                k(iArr[1]);
            } else {
                k(iArr[0] == -1 ? -10066330 : -1);
            }
            this.f96776k = false;
        }
    }

    public T t(Drawable drawable) {
        this.f96774i = null;
        this.f96771f.setImageDrawable(drawable);
        return (T) f();
    }

    public T u(@v int i10) {
        this.f96774i = null;
        this.f96771f.setImageResource(i10);
        return (T) f();
    }

    public T v(float f10) {
        ImageView imageView = this.f96771f;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iD = com.scwang.smartrefresh.layout.util.b.d(f10);
        layoutParams.width = iD;
        layoutParams.height = iD;
        imageView.setLayoutParams(layoutParams);
        return (T) f();
    }

    public T w(float f10) {
        ImageView imageView = this.f96771f;
        ImageView imageView2 = this.f96772g;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
        int iD = com.scwang.smartrefresh.layout.util.b.d(f10);
        marginLayoutParams2.rightMargin = iD;
        marginLayoutParams.rightMargin = iD;
        imageView.setLayoutParams(marginLayoutParams);
        imageView2.setLayoutParams(marginLayoutParams2);
        return (T) f();
    }

    public T x(float f10) {
        ImageView imageView = this.f96772g;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iD = com.scwang.smartrefresh.layout.util.b.d(f10);
        layoutParams.width = iD;
        layoutParams.height = iD;
        imageView.setLayoutParams(layoutParams);
        return (T) f();
    }

    public T y(float f10) {
        ImageView imageView = this.f96771f;
        ImageView imageView2 = this.f96772g;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iD = com.scwang.smartrefresh.layout.util.b.d(f10);
        layoutParams2.width = iD;
        layoutParams.width = iD;
        int iD2 = com.scwang.smartrefresh.layout.util.b.d(f10);
        layoutParams2.height = iD2;
        layoutParams.height = iD2;
        imageView.setLayoutParams(layoutParams);
        imageView2.setLayoutParams(layoutParams2);
        return (T) f();
    }

    public T z(int i10) {
        this.f96779n = i10;
        return (T) f();
    }
}
