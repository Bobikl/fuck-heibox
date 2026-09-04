package com.max.hbexpression.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.o;
import bb.c;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b0;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: SimpleMarkerViewSpan.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nSimpleMarkerViewSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleMarkerViewSpan.kt\ncom/max/hbexpression/widget/SimpleMarkerViewSpan\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,155:1\n47#2,8:156\n47#2,8:164\n47#2,8:172\n47#2,8:180\n47#2,8:188\n*S KotlinDebug\n*F\n+ 1 SimpleMarkerViewSpan.kt\ncom/max/hbexpression/widget/SimpleMarkerViewSpan\n*L\n127#1:156,8\n131#1:164,8\n135#1:172,8\n139#1:180,8\n143#1:188,8\n*E\n"})
public final class SimpleMarkerViewSpan extends ReplacementSpan {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    public static final a f70250d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private static final String f70251e = "SimpleMarkerViewSpan-dbg";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f70252f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final z f70253b = b0.c(new yh.a<Paint>() { // from class: com.max.hbexpression.widget.SimpleMarkerViewSpan$debugPaint$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public final Paint a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f32986n4, new Class[0], Paint.class);
            if (patchProxyResultProxy.isSupported) {
                return (Paint) patchProxyResultProxy.result;
            }
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeWidth(3.0f);
            return paint;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.Paint, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ Paint invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f33006o4, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private FrameLayout f70254c;

    /* JADX INFO: compiled from: SimpleMarkerViewSpan.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public final boolean a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f32946l4, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : SimpleMarkerViewSpan.f70252f;
        }

        public final void b(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.g.f32966m4, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SimpleMarkerViewSpan.f70252f = z10;
        }
    }

    private final void c(Canvas canvas, float f10, int i10, Paint paint) {
        if (!PatchProxy.proxy(new Object[]{canvas, new Float(f10), new Integer(i10), paint}, this, changeQuickRedirect, false, c.g.f32926k4, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE, Paint.class}, Void.TYPE).isSupported && f70252f) {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            FrameLayout frameLayout = this.f70254c;
            float right = frameLayout != null ? frameLayout.getRight() : 0;
            float f11 = i10;
            float f12 = fontMetricsInt.top + f11;
            int iSave = canvas.save();
            canvas.translate(f10, f12);
            try {
                d().setColor(y1.a.f141526c);
                canvas.drawLine(0.0f, 0.0f, right, 0.0f, d());
                canvas.restoreToCount(iSave);
                float f13 = fontMetricsInt.ascent + f11;
                int iSave2 = canvas.save();
                canvas.translate(f10, f13);
                try {
                    d().setColor(o.f21773u);
                    canvas.drawLine(0.0f, 0.0f, right, 0.0f, d());
                    canvas.restoreToCount(iSave2);
                    int iSave3 = canvas.save();
                    canvas.translate(f10, f11);
                    try {
                        d().setColor(-16711936);
                        canvas.drawLine(0.0f, 0.0f, right, 0.0f, d());
                        canvas.restoreToCount(iSave3);
                        float f14 = fontMetricsInt.descent + f11;
                        int iSave4 = canvas.save();
                        canvas.translate(f10, f14);
                        try {
                            d().setColor(-16776961);
                            canvas.drawLine(0.0f, 0.0f, right, 0.0f, d());
                            canvas.restoreToCount(iSave4);
                            float f15 = f11 + fontMetricsInt.bottom;
                            int iSave5 = canvas.save();
                            canvas.translate(f10, f15);
                            try {
                                d().setColor(-7829368);
                                canvas.drawLine(0.0f, 0.0f, right, 0.0f, d());
                            } finally {
                                canvas.restoreToCount(iSave5);
                            }
                        } catch (Throwable th2) {
                            canvas.restoreToCount(iSave4);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        canvas.restoreToCount(iSave3);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    canvas.restoreToCount(iSave2);
                    throw th4;
                }
            } catch (Throwable th5) {
                canvas.restoreToCount(iSave);
                throw th5;
            }
        }
    }

    private final Paint d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f32807e4, new Class[0], Paint.class);
        return patchProxyResultProxy.isSupported ? (Paint) patchProxyResultProxy.result : (Paint) this.f70253b.getValue();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@d Canvas canvas, @e CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @d Paint paint) {
        Object[] objArr = {canvas, charSequence, new Integer(i10), new Integer(i11), new Float(f10), new Integer(i12), new Integer(i13), new Integer(i14), paint};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.g.f32906j4, new Class[]{Canvas.class, CharSequence.class, cls, cls, Float.TYPE, cls, cls, cls, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        f0.p(paint, "paint");
        FrameLayout frameLayout = this.f70254c;
        if (frameLayout != null) {
            int measuredHeight = frameLayout.getMeasuredHeight();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i15 = ((fontMetricsInt.descent + fontMetricsInt.ascent) / 2) - (measuredHeight / 2);
            canvas.save();
            canvas.translate(f10, fi.u.t(i13 + i15, i12));
            FrameLayout frameLayout2 = this.f70254c;
            if (frameLayout2 != null) {
                frameLayout2.draw(canvas);
            }
            canvas.restore();
            c(canvas, f10, i13, paint);
        }
    }

    public final void e(@e Context context, @e View view, int i10, int i11) {
        Object[] objArr = {context, view, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.g.f32827f4, new Class[]{Context.class, View.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f(context, view, -2, -2, i10, i11);
    }

    public final void f(@e Context context, @e View view, int i10, int i11, int i12, int i13) {
        int iF = i10;
        Object[] objArr = {context, view, new Integer(iF), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.g.f32847g4, new Class[]{Context.class, View.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int iF2 = iF < 0 ? iF : ViewUtils.f(context, iF);
        if (i11 >= 0) {
            iF = ViewUtils.f(context, i11);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iF2, iF);
        layoutParams.setMarginStart(ViewUtils.f(context, i12));
        layoutParams.setMarginEnd(ViewUtils.f(context, i13));
        g(context, view, layoutParams);
    }

    public final void g(@e Context context, @e View view, @e FrameLayout.LayoutParams layoutParams) {
        if (PatchProxy.proxy(new Object[]{context, view, layoutParams}, this, changeQuickRedirect, false, c.g.f32867h4, new Class[]{Context.class, View.class, FrameLayout.LayoutParams.class}, Void.TYPE).isSupported || context == null || view == null || layoutParams == null) {
            return;
        }
        FrameLayout frameLayout = this.f70254c;
        b2 b2Var = null;
        if (frameLayout != null && frameLayout != null) {
            frameLayout.removeAllViews();
            b2Var = b2.f124493a;
        }
        if (b2Var == null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            this.f70254c = frameLayout2;
        }
        FrameLayout frameLayout3 = this.f70254c;
        if (frameLayout3 != null) {
            frameLayout3.addView(view, layoutParams);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@d Paint paint, @e CharSequence charSequence, int i10, int i11, @e Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, new Integer(i10), new Integer(i11), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.g.f32887i4, new Class[]{Paint.class, CharSequence.class, cls, cls, Paint.FontMetricsInt.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(paint, "paint");
        FrameLayout frameLayout = this.f70254c;
        if (frameLayout == null) {
            return 0;
        }
        frameLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight());
        if (fontMetricsInt != null) {
            int measuredHeight = frameLayout.getMeasuredHeight();
            int i12 = (-measuredHeight) / 2;
            fontMetricsInt.top = i12;
            fontMetricsInt.ascent = i12;
            int i13 = measuredHeight / 2;
            fontMetricsInt.bottom = i13;
            fontMetricsInt.descent = i13;
        }
        return frameLayout.getRight();
    }
}
