package com.max.hbexpression.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import bb.c;
import com.max.hbcommon.utils.d;
import com.max.hbexpression.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: ExpressionSpan.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends DynamicDrawableSpan {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f70256m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f70257n = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f70258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<Context> f70259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f70260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f70261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f70262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f70263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f70264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f70265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f70266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f70267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WeakReference<Drawable> f70268l;

    public a(Context context, int i10, int i11, int i12, int i13) {
        this(context, i10, i11, i12, i13, 0);
    }

    public a(Context context, int i10, int i11, int i12, int i13, int i14) {
        super(i12);
        this.f70258b = i14;
        this.f70259c = new WeakReference<>(context);
        this.f70260d = i10;
        this.f70262f = i11;
        this.f70264h = i11;
        this.f70265i = i11;
        this.f70263g = i13;
        this.f70261e = null;
    }

    public a(Context context, String str, int i10, int i11, int i12) {
        super(i11);
        this.f70258b = 0;
        this.f70259c = new WeakReference<>(context);
        this.f70261e = str;
        int i13 = (i10 * 7) / 6;
        this.f70262f = i13;
        this.f70264h = i13;
        this.f70265i = i13;
        this.f70263g = i12;
        this.f70260d = -1;
    }

    private Drawable a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f32747b4, new Class[0], Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        WeakReference<Drawable> weakReference = this.f70268l;
        if (weakReference == null || weakReference.get() == null) {
            this.f70268l = new WeakReference<>(getDrawable());
        }
        return this.f70268l.get();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int i15;
        float f11 = f10;
        Object[] objArr = {canvas, charSequence, new Integer(i10), new Integer(i11), new Float(f11), new Integer(i12), new Integer(i13), new Integer(i14), paint};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.g.f32727a4, new Class[]{Canvas.class, CharSequence.class, cls, cls, Float.TYPE, cls, cls, cls, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        Drawable drawableA = a();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        if (this.f70258b == 1) {
            i15 = (i13 - ((drawableA.getBounds().bottom - drawableA.getBounds().top) / 2)) + (fontMetricsInt.ascent / 2);
            Context context = this.f70259c.get();
            if (context != null) {
                f11 -= ViewUtils.f(context, 2.0f);
            }
        } else {
            i15 = (i13 - ((drawableA.getBounds().bottom + drawableA.getBounds().top) / 2)) + ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2);
        }
        if (drawableA.getBounds().bottom + i15 > i14) {
            d.b("zzzzspantest", "特殊处理");
            i15 = i14 - drawableA.getBounds().bottom;
        }
        if (((DynamicDrawableSpan) this).mVerticalAlignment == 1) {
            i15 = ((((i14 - i12) / 2) + i12) - ((drawableA.getBounds().bottom - drawableA.getBounds().top) / 2)) - this.f70266j;
        }
        canvas.translate(f11, i15);
        drawableA.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan
    public Drawable getDrawable() {
        Context context;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.Z3, new Class[0], Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        if (this.f70267k == null) {
            try {
                Context context2 = this.f70259c.get();
                if (context2 != null) {
                    if (this.f70260d > 0) {
                        this.f70267k = context2.getResources().getDrawable(this.f70260d);
                    } else {
                        File file = new File(this.f70261e);
                        if (file.exists()) {
                            this.f70267k = Drawable.createFromPath(file.getAbsolutePath());
                        } else {
                            this.f70267k = context2.getResources().getDrawable(R.drawable.ic_post_image);
                        }
                    }
                }
                int i10 = this.f70262f;
                this.f70264h = i10;
                int intrinsicWidth = (i10 * this.f70267k.getIntrinsicWidth()) / this.f70267k.getIntrinsicHeight();
                this.f70265i = intrinsicWidth;
                int i11 = this.f70264h;
                int i12 = this.f70263g;
                if (i11 > (i12 * 7) / 6) {
                    this.f70266j = 0;
                } else {
                    this.f70266j = (((i12 * 7) / 6) - i11) / 2;
                }
                Drawable drawable = this.f70267k;
                int i13 = this.f70266j;
                drawable.setBounds(0, i13, intrinsicWidth, i11 + i13);
            } catch (Exception unused) {
            }
        }
        if (this.f70267k == null && (context = this.f70259c.get()) != null) {
            this.f70267k = context.getResources().getDrawable(R.drawable.ic_post_image);
        }
        return this.f70267k;
    }
}
