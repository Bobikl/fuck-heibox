package com.max.hbcustomview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class GradientShadowTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private int f68481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    private int f68482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private GradientDrawable.Orientation f68483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f68484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f68485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f68486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f68487h;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f68488a;

        static {
            int[] iArr = new int[GradientDrawable.Orientation.values().length];
            f68488a = iArr;
            try {
                iArr[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68488a[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68488a[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68488a[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public GradientShadowTextView(@n0 Context context) {
        super(context);
        i();
    }

    public GradientShadowTextView(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        i();
    }

    public GradientShadowTextView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i();
    }

    private LinearGradient f(@l int i10, @l int i11, GradientDrawable.Orientation orientation) {
        Object[] objArr = {new Integer(i10), new Integer(i11), orientation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32140a6, new Class[]{cls, cls, GradientDrawable.Orientation.class}, LinearGradient.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearGradient) patchProxyResultProxy.result;
        }
        Rect rectH = h(orientation);
        return new LinearGradient(rectH.left, rectH.top, rectH.right, rectH.bottom, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public static int g(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.f.f32186c6, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private Rect h(GradientDrawable.Orientation orientation) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{orientation}, this, changeQuickRedirect, false, bb.c.f.f32163b6, new Class[]{GradientDrawable.Orientation.class}, Rect.class);
        if (patchProxyResultProxy.isSupported) {
            return (Rect) patchProxyResultProxy.result;
        }
        if (orientation == null) {
            return new Rect(0, 0, getMeasuredWidth(), 0);
        }
        int i10 = a.f68488a[orientation.ordinal()];
        if (i10 == 1) {
            return new Rect(0, 0, 0, getMeasuredHeight());
        }
        if (i10 == 2) {
            return new Rect(0, getMeasuredHeight(), 0, 0);
        }
        if (i10 != 3 && i10 == 4) {
            return new Rect(getMeasuredWidth(), 0, 0, 0);
        }
        return new Rect(0, 0, getMeasuredWidth(), 0);
    }

    private void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.X5, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f68481b = getResources().getColor(R.color.gift_effect_streak_start);
        this.f68482c = getResources().getColor(R.color.gift_effect_streak_end);
        this.f68483d = GradientDrawable.Orientation.LEFT_RIGHT;
        this.f68484e = g(getContext(), 1.0f);
        this.f68485f = g(getContext(), 1.5f);
        this.f68486g = g(getContext(), 2.0f);
        this.f68487h = getResources().getColor(R.color.gift_effect_streak_shadow);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.Y5, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        getPaint().setShadowLayer(this.f68484e, this.f68485f, this.f68486g, this.f68487h);
        getPaint().setShader(null);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(f(this.f68481b, this.f68482c, this.f68483d));
        super.onDraw(canvas);
    }

    public void setColors(@l int i10, @l int i11, GradientDrawable.Orientation orientation) {
        Object[] objArr = {new Integer(i10), new Integer(i11), orientation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Z5, new Class[]{cls, cls, GradientDrawable.Orientation.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68481b = i10;
        this.f68482c = i11;
        this.f68483d = orientation;
        invalidate();
    }

    public void setShadow(float f10, float f11, float f12, int i10) {
        this.f68484e = f10;
        this.f68485f = f11;
        this.f68486g = f12;
        this.f68487h = i10;
    }
}
