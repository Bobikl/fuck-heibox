package com.max.hbcustomview.bannerview.indicator;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.v;
import androidx.core.content.d;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.zhpan.indicator.base.BaseIndicatorView;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: DrawableIndicator.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DrawableIndicator extends BaseIndicatorView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private Bitmap f69017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private Bitmap f69018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f69021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f69022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f69023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @e
    private a f69024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f69025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f69026o;

    /* JADX INFO: compiled from: DrawableIndicator.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f69027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f69028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f69029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f69030d;

        public a(int i10, int i11, int i12, int i13) {
            this.f69027a = i10;
            this.f69028b = i11;
            this.f69029c = i12;
            this.f69030d = i13;
        }

        public final int a() {
            return this.f69030d;
        }

        public final int b() {
            return this.f69029c;
        }

        public final int c() {
            return this.f69028b;
        }

        public final int d() {
            return this.f69027a;
        }

        public final void e(int i10) {
            this.f69030d = i10;
        }

        public final void f(int i10) {
            this.f69029c = i10;
        }

        public final void g(int i10) {
            this.f69028b = i10;
        }

        public final void h(int i10) {
            this.f69027a = i10;
        }
    }

    @i
    public DrawableIndicator(@e Context context) {
        this(context, null, 0, 6, null);
    }

    @i
    public DrawableIndicator(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public DrawableIndicator(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        this.f69025n = true;
        this.f69026o = true;
    }

    public /* synthetic */ DrawableIndicator(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void n(Canvas canvas, int i10, int i11, Bitmap bitmap) {
        Object[] objArr = {canvas, new Integer(i10), new Integer(i11), bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Fg, new Class[]{Canvas.class, cls, cls, Bitmap.class}, Void.TYPE).isSupported || bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, i10, i11, (Paint) null);
    }

    private final Bitmap o(Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, c.f.Kg, new Class[]{Context.class, Integer.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        Drawable drawableI = d.i(context, i10);
        if (drawableI == null) {
            return null;
        }
        f0.m(drawableI);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableI.getIntrinsicWidth(), drawableI.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        f0.o(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableI.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableI.draw(canvas);
        return bitmapCreateBitmap;
    }

    private final void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Gg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Bitmap bitmap = this.f69017f;
        if (bitmap != null) {
            if (this.f69024m != null) {
                f0.m(bitmap);
                if (bitmap.isMutable() && this.f69026o) {
                    Bitmap bitmap2 = this.f69017f;
                    f0.m(bitmap2);
                    a aVar = this.f69024m;
                    f0.m(aVar);
                    bitmap2.setWidth(aVar.b());
                    Bitmap bitmap3 = this.f69017f;
                    f0.m(bitmap3);
                    a aVar2 = this.f69024m;
                    f0.m(aVar2);
                    bitmap3.setHeight(aVar2.a());
                } else {
                    Bitmap bitmap4 = this.f69017f;
                    f0.m(bitmap4);
                    int width = bitmap4.getWidth();
                    Bitmap bitmap5 = this.f69017f;
                    f0.m(bitmap5);
                    int height = bitmap5.getHeight();
                    a aVar3 = this.f69024m;
                    f0.m(aVar3);
                    float fB = aVar3.b() / width;
                    a aVar4 = this.f69024m;
                    f0.m(aVar4);
                    float fA = aVar4.a() / height;
                    Matrix matrix = new Matrix();
                    matrix.postScale(fB, fA);
                    Bitmap bitmap6 = this.f69017f;
                    f0.m(bitmap6);
                    this.f69017f = Bitmap.createBitmap(bitmap6, 0, 0, width, height, matrix, true);
                }
            }
            Bitmap bitmap7 = this.f69017f;
            f0.m(bitmap7);
            this.f69020i = bitmap7.getWidth();
            Bitmap bitmap8 = this.f69017f;
            f0.m(bitmap8);
            this.f69021j = bitmap8.getHeight();
        }
        Bitmap bitmap9 = this.f69018g;
        if (bitmap9 != null) {
            if (this.f69024m != null) {
                f0.m(bitmap9);
                if (bitmap9.isMutable() && this.f69025n) {
                    Bitmap bitmap10 = this.f69018g;
                    f0.m(bitmap10);
                    a aVar5 = this.f69024m;
                    f0.m(aVar5);
                    bitmap10.setWidth(aVar5.d());
                    Bitmap bitmap11 = this.f69018g;
                    f0.m(bitmap11);
                    a aVar6 = this.f69024m;
                    f0.m(aVar6);
                    bitmap11.setHeight(aVar6.c());
                } else {
                    Bitmap bitmap12 = this.f69018g;
                    f0.m(bitmap12);
                    int width2 = bitmap12.getWidth();
                    Bitmap bitmap13 = this.f69018g;
                    f0.m(bitmap13);
                    int height2 = bitmap13.getHeight();
                    a aVar7 = this.f69024m;
                    f0.m(aVar7);
                    float fD = aVar7.d();
                    Bitmap bitmap14 = this.f69018g;
                    f0.m(bitmap14);
                    float width3 = fD / bitmap14.getWidth();
                    a aVar8 = this.f69024m;
                    f0.m(aVar8);
                    float fC = aVar8.c();
                    Bitmap bitmap15 = this.f69018g;
                    f0.m(bitmap15);
                    float height3 = fC / bitmap15.getHeight();
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(width3, height3);
                    Bitmap bitmap16 = this.f69018g;
                    f0.m(bitmap16);
                    this.f69018g = Bitmap.createBitmap(bitmap16, 0, 0, width2, height2, matrix2, true);
                }
            }
            Bitmap bitmap17 = this.f69018g;
            f0.m(bitmap17);
            this.f69022k = bitmap17.getWidth();
            Bitmap bitmap18 = this.f69018g;
            f0.m(bitmap18);
            this.f69023l = bitmap18.getHeight();
        }
    }

    @Override // android.view.View
    public void onDraw(@dl.d Canvas canvas) {
        int i10;
        int measuredHeight;
        int i11;
        int measuredHeight2;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.f.Eg, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        super.onDraw(canvas);
        if (getPageSize() <= 1 || this.f69017f == null || this.f69018g == null) {
            return;
        }
        int pageSize = getPageSize() + 1;
        for (int i12 = 1; i12 < pageSize; i12++) {
            Bitmap bitmap = this.f69018g;
            int i13 = i12 - 1;
            if (i13 < getCurrentPosition()) {
                i10 = i13 * (this.f69022k + this.f69019h);
                measuredHeight = getMeasuredHeight() / 2;
                i11 = this.f69023l / 2;
            } else {
                if (i13 == getCurrentPosition()) {
                    i10 = i13 * (this.f69022k + this.f69019h);
                    measuredHeight2 = (getMeasuredHeight() / 2) - (this.f69021j / 2);
                    bitmap = this.f69017f;
                } else {
                    i10 = (i13 * this.f69019h) + ((i12 - 2) * this.f69022k) + this.f69020i;
                    measuredHeight = getMeasuredHeight() / 2;
                    i11 = this.f69023l / 2;
                }
                n(canvas, i10, measuredHeight2, bitmap);
            }
            measuredHeight2 = measuredHeight - i11;
            n(canvas, i10, measuredHeight2, bitmap);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Dg, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(i10, i11);
        setMeasuredDimension(this.f69020i + ((this.f69022k + this.f69019h) * (getPageSize() - 1)), fi.u.u(this.f69021j, this.f69023l));
    }

    @dl.d
    public final DrawableIndicator q(@v int i10, @v int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Hg, new Class[]{cls, cls}, DrawableIndicator.class);
        if (patchProxyResultProxy.isSupported) {
            return (DrawableIndicator) patchProxyResultProxy.result;
        }
        this.f69018g = BitmapFactory.decodeResource(getResources(), i10);
        this.f69017f = BitmapFactory.decodeResource(getResources(), i11);
        if (this.f69018g == null) {
            Context context = getContext();
            f0.o(context, "getContext(...)");
            this.f69018g = o(context, i10);
            this.f69025n = false;
        }
        if (this.f69017f == null) {
            Context context2 = getContext();
            f0.o(context2, "getContext(...)");
            this.f69017f = o(context2, i11);
            this.f69026o = false;
        }
        p();
        postInvalidate();
        return this;
    }

    @dl.d
    public final DrawableIndicator r(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Jg, new Class[]{Integer.TYPE}, DrawableIndicator.class);
        if (patchProxyResultProxy.isSupported) {
            return (DrawableIndicator) patchProxyResultProxy.result;
        }
        if (i10 >= 0) {
            this.f69019h = i10;
            postInvalidate();
        }
        return this;
    }

    @dl.d
    public final DrawableIndicator s(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Ig, new Class[]{cls, cls, cls, cls}, DrawableIndicator.class);
        if (patchProxyResultProxy.isSupported) {
            return (DrawableIndicator) patchProxyResultProxy.result;
        }
        this.f69024m = new a(i10, i11, i12, i13);
        p();
        postInvalidate();
        return this;
    }
}
