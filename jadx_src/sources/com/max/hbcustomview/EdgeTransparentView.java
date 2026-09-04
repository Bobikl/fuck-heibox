package com.max.hbcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: EdgeTransparentView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class EdgeTransparentView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Paint f68470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f68471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f68472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f68473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f68474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f68475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f68476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f68477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f68478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final int[] f68479k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final float[] f68480l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public EdgeTransparentView(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public EdgeTransparentView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public EdgeTransparentView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f68470b = new Paint(1);
        this.f68473e = 1;
        this.f68474f = 1 << 1;
        this.f68475g = 1 << 2;
        this.f68476h = 1 << 3;
        this.f68479k = new int[]{-1, 0};
        this.f68480l = new float[]{0.0f, 1.0f};
        a(context, attributeSet);
    }

    public /* synthetic */ EdgeTransparentView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, bb.c.f.O5, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68470b.setStyle(Paint.Style.FILL);
        this.f68470b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f68720u0);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f68471c = typedArrayObtainStyledAttributes.getInt(R.styleable.EdgeTransparentView_edge_position, 0);
        this.f68472d = typedArrayObtainStyledAttributes.getDimension(R.styleable.EdgeTransparentView_edge_width, ic.a.f119343a.a(context, 20.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.R5, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f68470b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f68472d, this.f68479k, this.f68480l, Shader.TileMode.CLAMP));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@dl.d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.P5, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@dl.d Canvas canvas, @dl.d View child, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{canvas, child, new Long(j10)}, this, changeQuickRedirect, false, bb.c.f.S5, new Class[]{Canvas.class, View.class, Long.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(canvas, "canvas");
        f0.p(child, "child");
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean zDrawChild = super.drawChild(canvas, child, j10);
        int i10 = this.f68471c;
        if (i10 == 0 || (i10 & this.f68473e) != 0) {
            canvas.drawRect(0.0f, 0.0f, this.f68477i, this.f68472d, this.f68470b);
        }
        int i11 = this.f68471c;
        if (i11 == 0 || (i11 & this.f68474f) != 0) {
            int iSave = canvas.save();
            canvas.rotate(180.0f, this.f68477i / 2.0f, this.f68478j / 2.0f);
            canvas.drawRect(0.0f, 0.0f, this.f68477i, this.f68472d, this.f68470b);
            canvas.restoreToCount(iSave);
        }
        float f10 = (this.f68478j - this.f68477i) / 2.0f;
        int i12 = this.f68471c;
        if (i12 == 0 || (i12 & this.f68475g) != 0) {
            int iSave2 = canvas.save();
            canvas.rotate(270.0f, this.f68477i / 2.0f, this.f68478j / 2.0f);
            canvas.translate(0.0f, f10);
            canvas.drawRect(0.0f - f10, 0.0f, this.f68477i + f10, this.f68472d, this.f68470b);
            canvas.restoreToCount(iSave2);
        }
        int i13 = this.f68471c;
        if (i13 == 0 || (i13 & this.f68476h) != 0) {
            int iSave3 = canvas.save();
            canvas.rotate(90.0f, this.f68477i / 2.0f, this.f68478j / 2.0f);
            canvas.translate(0.0f, f10);
            canvas.drawRect(0.0f - f10, 0.0f, this.f68477i + f10, this.f68472d, this.f68470b);
            canvas.restoreToCount(iSave3);
        }
        canvas.restoreToCount(iSaveLayer);
        return zDrawChild;
    }

    @Override // android.view.View
    public void onDraw(@dl.d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.T5, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Q5, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        b();
        this.f68477i = getWidth();
        this.f68478j = getHeight();
    }
}
