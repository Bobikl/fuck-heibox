package com.max.hbcustomview.Shimmer;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import bb.c;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f68817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f68818c;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.f68817b = new Paint();
        this.f68818c = new b();
        a(context, null);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68817b = new Paint();
        this.f68818c = new b();
        a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68817b = new Paint();
        this.f68818c = new b();
        a(context, attributeSet);
    }

    @TargetApi(21)
    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f68817b = new Paint();
        this.f68818c = new b();
        a(context, attributeSet);
    }

    private void a(Context context, @p0 AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, c.f.f32558sb, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        setWillNotDraw(false);
        this.f68818c.setCallback(this);
        if (attributeSet == null) {
            c(new a.C0556a().a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Q2, 0, 0);
        try {
            int i10 = R.styleable.ShimmerFrameLayout_shimmer_colored;
            c(((typedArrayObtainStyledAttributes.hasValue(i10) && typedArrayObtainStyledAttributes.getBoolean(i10, false)) ? new a.c() : new a.C0556a()).d(typedArrayObtainStyledAttributes).a());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public boolean b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5040, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f68818c.a();
    }

    public ShimmerFrameLayout c(a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, c.f.f32580tb, new Class[]{a.class}, ShimmerFrameLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (ShimmerFrameLayout) patchProxyResultProxy.result;
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Given null shimmer");
        }
        this.f68818c.d(aVar);
        if (aVar.f68864o) {
            setLayerType(2, this.f68817b);
        } else {
            setLayerType(0, null);
        }
        return this;
    }

    public void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32602ub, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f68818c.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.f.Ab, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.dispatchDraw(canvas);
        this.f68818c.draw(canvas);
    }

    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32624vb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f68818c.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32690yb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        this.f68818c.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32712zb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.f32668xb, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        this.f68818c.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public boolean verifyDrawable(@n0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.f.Bb, new Class[]{Drawable.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return super.verifyDrawable(drawable) || drawable == this.f68818c;
    }
}
