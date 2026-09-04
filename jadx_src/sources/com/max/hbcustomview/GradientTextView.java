package com.max.hbcustomview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.annotation.l;
import androidx.appcompat.widget.AppCompatTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class GradientTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f68489k = "GradientTextView";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Shader f68490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f68491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f68492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f68493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    private int f68494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l
    private int f68495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @l
    private int[] f68496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private GradientDrawable.Orientation f68497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f68498j;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f68499a;

        static {
            int[] iArr = new int[GradientDrawable.Orientation.values().length];
            f68499a = iArr;
            try {
                iArr[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68499a[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68499a[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68499a[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68499a[GradientDrawable.Orientation.BL_TR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68499a[GradientDrawable.Orientation.TL_BR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public GradientTextView(Context context) {
        this(context, null);
    }

    public GradientTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GradientTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68491c = new Rect();
        this.f68498j = false;
        i(context);
    }

    private LinearGradient f(@l int i10, @l int i11, GradientDrawable.Orientation orientation) {
        Object[] objArr = {new Integer(i10), new Integer(i11), orientation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32325i6, new Class[]{cls, cls, GradientDrawable.Orientation.class}, LinearGradient.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearGradient) patchProxyResultProxy.result;
        }
        Rect rectH = h(orientation);
        return new LinearGradient(rectH.left, rectH.top, rectH.right, rectH.bottom, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
    }

    private LinearGradient g(@l int[] iArr, GradientDrawable.Orientation orientation) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iArr, orientation}, this, changeQuickRedirect, false, bb.c.f.f32348j6, new Class[]{int[].class, GradientDrawable.Orientation.class}, LinearGradient.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearGradient) patchProxyResultProxy.result;
        }
        Rect rectH = h(orientation);
        return new LinearGradient(rectH.left, rectH.top, rectH.right, rectH.bottom, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    private Rect h(GradientDrawable.Orientation orientation) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{orientation}, this, changeQuickRedirect, false, bb.c.f.f32371k6, new Class[]{GradientDrawable.Orientation.class}, Rect.class);
        if (patchProxyResultProxy.isSupported) {
            return (Rect) patchProxyResultProxy.result;
        }
        if (orientation == null) {
            return new Rect(0, 0, getMeasuredWidth(), 0);
        }
        switch (a.f68499a[orientation.ordinal()]) {
            case 1:
                return new Rect(0, 0, 0, getMeasuredHeight());
            case 2:
                return new Rect(0, getMeasuredHeight(), 0, 0);
            case 3:
                return new Rect(0, 0, getMeasuredWidth(), 0);
            case 4:
                return new Rect(getMeasuredWidth(), 0, 0, 0);
            case 5:
                return new Rect(0, getMeasuredHeight(), getMeasuredWidth(), 0);
            case 6:
                return new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            default:
                return new Rect(0, 0, getMeasuredWidth(), 0);
        }
    }

    private void i(Context context) {
    }

    public Shader getShader() {
        return this.f68490b;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.f32210d6, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68492d = getPaint();
        String string = getText().toString();
        this.f68493e = string;
        this.f68492d.getTextBounds(string, 0, string.length(), this.f68491c);
        if (!this.f68498j) {
            this.f68494f = getCurrentTextColor();
            this.f68495g = getCurrentTextColor();
        }
        int[] iArr = this.f68496h;
        if (iArr != null) {
            this.f68490b = g(iArr, this.f68497i);
        } else {
            this.f68490b = f(this.f68494f, this.f68495g, this.f68497i);
        }
        Shader shader = this.f68490b;
        if (shader != null) {
            this.f68492d.setShader(shader);
        }
        super.onDraw(canvas);
    }

    public void setColors(@l int i10, @l int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32256f6, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setColors(i10, i11, GradientDrawable.Orientation.LEFT_RIGHT);
    }

    public void setColors(@l int i10, @l int i11, GradientDrawable.Orientation orientation) {
        Object[] objArr = {new Integer(i10), new Integer(i11), orientation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32279g6, new Class[]{cls, cls, GradientDrawable.Orientation.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68494f = i10;
        this.f68495g = i11;
        this.f68497i = orientation;
        this.f68498j = true;
        invalidate();
    }

    public void setColors(@l int[] iArr, GradientDrawable.Orientation orientation) {
        if (PatchProxy.proxy(new Object[]{iArr, orientation}, this, changeQuickRedirect, false, bb.c.f.f32302h6, new Class[]{int[].class, GradientDrawable.Orientation.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68496h = iArr;
        this.f68497i = orientation;
        this.f68498j = true;
        invalidate();
    }

    public void setShader(Shader shader) {
        if (PatchProxy.proxy(new Object[]{shader}, this, changeQuickRedirect, false, bb.c.f.f32233e6, new Class[]{Shader.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68490b = shader;
        invalidate();
    }
}
