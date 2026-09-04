package com.max.hbcustomview.seekbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: HbRangeTrendView.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nHbRangeTrendView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HbRangeTrendView.kt\ncom/max/hbcustomview/seekbar/HbRangeTrendView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1855#2,2:209\n*S KotlinDebug\n*F\n+ 1 HbRangeTrendView.kt\ncom/max/hbcustomview/seekbar/HbRangeTrendView\n*L\n83#1:209,2\n*E\n"})
public final class HbRangeTrendView extends View {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private ArrayList<Float> f69289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f69290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f69291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f69294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f69295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final Paint f69296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final Path f69297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f69298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f69299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private ArrayList<Point> f69300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f69301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f69302o;

    public HbRangeTrendView(@dl.e Context context) {
        super(context);
        this.f69289b = new ArrayList<>();
        this.f69290c = 1.0f;
        this.f69294g = 1.0f;
        this.f69295h = 1.0f;
        this.f69296i = new Paint();
        this.f69297j = new Path();
        this.f69298k = -1.0f;
        this.f69299l = -1.0f;
        this.f69300m = new ArrayList<>();
        this.f69301n = -1;
    }

    public HbRangeTrendView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69289b = new ArrayList<>();
        this.f69290c = 1.0f;
        this.f69294g = 1.0f;
        this.f69295h = 1.0f;
        this.f69296i = new Paint();
        this.f69297j = new Path();
        this.f69298k = -1.0f;
        this.f69299l = -1.0f;
        this.f69300m = new ArrayList<>();
        this.f69301n = -1;
        b(attributeSet);
        c();
    }

    public HbRangeTrendView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f69289b = new ArrayList<>();
        this.f69290c = 1.0f;
        this.f69294g = 1.0f;
        this.f69295h = 1.0f;
        this.f69296i = new Paint();
        this.f69297j = new Path();
        this.f69298k = -1.0f;
        this.f69299l = -1.0f;
        this.f69300m = new ArrayList<>();
        this.f69301n = -1;
        b(attributeSet);
        c();
    }

    private final LinearGradient a(@l int i10, @l int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.lo, new Class[]{cls, cls}, LinearGradient.class);
        return patchProxyResultProxy.isSupported ? (LinearGradient) patchProxyResultProxy.result : new LinearGradient(0.0f, 0.0f, 0.0f, this.f69292e, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
    }

    private final void b(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.f.jo, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69301n = Color.parseColor("#8C9196");
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.ko, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setLayerType(1, null);
        this.f69296i.setStyle(Paint.Style.FILL);
        this.f69296i.setAntiAlias(true);
    }

    private final void d() {
        float f10;
        float f11;
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.qo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69297j.reset();
        float f12 = 0.0f;
        if (this.f69302o) {
            this.f69297j.moveTo(0.0f, 0.0f);
            int size = this.f69289b.size() - 1;
            if (size >= 0) {
                float f13 = 0.0f;
                float f14 = 0.0f;
                while (true) {
                    f11 = i10 * this.f69294g;
                    float fMax = Math.max(1.0f, (this.f69289b.get(i10).floatValue() - this.f69291d) * this.f69295h);
                    float f15 = (f13 + f11) / 2;
                    if (i10 == 0) {
                        this.f69297j.lineTo(f11, fMax);
                    } else {
                        this.f69297j.cubicTo(f15, f14, f15, fMax, f11, fMax);
                    }
                    if (i10 == size) {
                        break;
                    }
                    i10++;
                    f13 = f11;
                    f14 = fMax;
                }
            } else {
                f11 = 0.0f;
            }
            this.f69297j.lineTo(f11, 0.0f);
            this.f69297j.close();
            return;
        }
        this.f69297j.moveTo(0.0f, this.f69292e);
        float f16 = this.f69292e;
        int size2 = this.f69289b.size() - 1;
        if (size2 >= 0) {
            float f17 = f16;
            while (true) {
                f10 = i10 * this.f69294g;
                float fMax2 = Math.max(1.0f, this.f69292e - ((this.f69289b.get(i10).floatValue() - this.f69291d) * this.f69295h));
                float f18 = (f12 + f10) / 2;
                if (i10 == 0) {
                    this.f69297j.lineTo(f10, fMax2);
                } else {
                    this.f69297j.cubicTo(f18, f17, f18, fMax2, f10, fMax2);
                }
                if (i10 == size2) {
                    break;
                }
                i10++;
                f12 = f10;
                f17 = fMax2;
            }
            f12 = f10;
        }
        this.f69297j.lineTo(f12, this.f69292e);
        this.f69297j.close();
    }

    private final void getSizeUnit() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.oo, new Class[0], Void.TYPE).isSupported && (!this.f69289b.isEmpty())) {
            this.f69294g = this.f69293f / (this.f69289b.size() - 1);
            this.f69295h = this.f69292e / ((int) (this.f69290c - this.f69291d));
            this.f69300m.clear();
            int size = this.f69289b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f69300m.add(new Point((int) (i10 * this.f69294g), (int) Math.max(1.0f, this.f69292e - ((this.f69289b.get(i10).floatValue() - this.f69291d) * this.f69295h))));
            }
        }
    }

    @Override // android.view.View
    public void onDraw(@dl.d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.ro, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        super.onDraw(canvas);
        d();
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f69293f, this.f69292e, this.f69296i);
        this.f69296i.setShader(a(Color.parseColor("#1A000000"), Color.parseColor("#1A000000")));
        canvas.drawPath(this.f69297j, this.f69296i);
        this.f69296i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f69296i.setShader(null);
        this.f69296i.setColor(this.f69301n);
        canvas.drawRect(new RectF(0.0f, 0.0f, this.f69293f, this.f69292e), this.f69296i);
        this.f69296i.setXfermode(null);
        float f10 = this.f69298k;
        float f11 = this.f69294g;
        float f12 = f10 * f11;
        float f13 = this.f69299l * f11;
        canvas.restoreToCount(iSaveLayer);
        float f14 = this.f69298k;
        if (f14 >= 0.0f) {
            float f15 = this.f69299l;
            if (f15 < 0.0f || f15 - f14 <= 0.0f) {
                return;
            }
            int iSaveLayer2 = canvas.saveLayer(f12, 0.0f, f13, this.f69292e, this.f69296i);
            this.f69296i.setShader(a(Color.parseColor("#4C000000"), Color.parseColor("#00000000")));
            canvas.drawPath(this.f69297j, this.f69296i);
            this.f69296i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            this.f69296i.setShader(null);
            this.f69296i.setColor(this.f69301n);
            canvas.drawRect(new RectF(f12, 0.0f, f13, this.f69292e), this.f69296i);
            canvas.restoreToCount(iSaveLayer2);
            this.f69296i.setXfermode(null);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.po, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(i10, i11);
        this.f69293f = View.MeasureSpec.getSize(i10);
        this.f69292e = View.MeasureSpec.getSize(i11);
        getSizeUnit();
    }

    public final void setData(@dl.e ArrayList<Float> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.f.mo, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        if (arrayList != null) {
            this.f69289b.clear();
            this.f69289b.addAll(arrayList);
        }
        Iterator<T> it = this.f69289b.iterator();
        while (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            if (fFloatValue > this.f69290c) {
                this.f69290c = fFloatValue;
            }
        }
        getSizeUnit();
        invalidate();
    }

    public final void setOrientationDown(boolean z10) {
        this.f69302o = z10;
    }

    public final void setRange(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.no, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f69298k = f10;
        this.f69299l = f11;
        invalidate();
    }

    public final void setRangeColor(@l int i10) {
        this.f69301n = i10;
    }
}
