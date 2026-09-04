package com.max.hbcustomview.simplevideo;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TResizableTextureView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class TResizableTextureView extends TextureView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f69479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private Matrix f69481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private a f69482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TResizableTextureView(@d Context context) {
        super(context);
        f0.p(context, "context");
        this.f69482e = a.C0561a.f69483a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TResizableTextureView(@d Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        this.f69482e = a.C0561a.f69483a;
    }

    public final void a(int i10, int i11) {
        boolean z10 = false;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.rr, new Class[]{cls, cls}, Void.TYPE).isSupported || getHeight() == 0 || getWidth() == 0) {
            return;
        }
        Matrix matrix = this.f69481d;
        if (matrix != null && matrix.equals(getMatrix())) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        float f10 = i10;
        float f11 = i11;
        float fMax = Math.max(getWidth() / f10, getHeight() / f11);
        Matrix matrix2 = getMatrix();
        this.f69481d = matrix2;
        f0.m(matrix2);
        float f12 = 2;
        matrix2.preTranslate((getWidth() - i10) / f12, (getHeight() - i11) / f12);
        Matrix matrix3 = this.f69481d;
        f0.m(matrix3);
        matrix3.preScale(f10 / getWidth(), f11 / getHeight());
        Matrix matrix4 = this.f69481d;
        f0.m(matrix4);
        matrix4.postScale(fMax, fMax, getWidth() / 2, getHeight() / f12);
        setTransform(this.f69481d);
        postInvalidate();
    }

    @d
    public final a getScreenType() {
        return this.f69482e;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x0075 A[PHI: r13
  0x0075: PHI (r13v15 int) = (r13v12 int), (r13v13 int), (r13v16 int) binds: [B:43:0x00b6, B:28:0x008b, B:21:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0115 A[PHI: r1 r13
  0x0115: PHI (r1v9 int) = (r1v6 int), (r1v6 int), (r1v12 int), (r1v12 int) binds: [B:77:0x0125, B:78:0x0127, B:68:0x0110, B:69:0x0112] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r13v7 int) = (r13v5 int), (r13v5 int), (r13v3 int), (r13v3 int) binds: [B:77:0x0125, B:78:0x0127, B:68:0x0110, B:69:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.qr, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (getRotation() == 90.0f) {
            i11 = i10;
            i10 = i11;
        } else {
            if (getRotation() == 270.0f) {
                i11 = i10;
                i10 = i11;
            }
        }
        int defaultSize = View.getDefaultSize(this.f69479b, i10);
        int defaultSize2 = View.getDefaultSize(this.f69480c, i11);
        a aVar = this.f69482e;
        if (f0.g(aVar, a.f.f69488a)) {
            i10 = this.f69479b;
            i11 = this.f69480c;
        } else if (f0.g(aVar, a.b.f69484a)) {
            i11 = (defaultSize / 16) * 9;
            if (defaultSize2 > i11) {
                i10 = defaultSize;
            } else {
                i10 = (defaultSize2 / 9) * 16;
                i11 = defaultSize2;
            }
        } else if (f0.g(aVar, a.c.f69485a)) {
            i11 = (defaultSize / 4) * 3;
            if (defaultSize2 > i11) {
                i10 = defaultSize;
            } else {
                i10 = (defaultSize2 / 3) * 4;
                i11 = defaultSize2;
            }
        } else if (!f0.g(aVar, a.e.f69487a)) {
            if (f0.g(aVar, a.d.f69486a)) {
                int i14 = this.f69479b;
                if (i14 > 0 && (i13 = this.f69480c) > 0) {
                    if (i14 * defaultSize2 > defaultSize * i13) {
                        i10 = (i14 * defaultSize2) / i13;
                    } else {
                        i11 = (i13 * defaultSize) / i14;
                        i10 = defaultSize;
                    }
                }
                i11 = defaultSize2;
            } else if (f0.g(aVar, a.C0561a.f69483a) && this.f69479b > 0 && this.f69480c > 0) {
                int mode = View.MeasureSpec.getMode(i10);
                i10 = View.MeasureSpec.getSize(i10);
                int mode2 = View.MeasureSpec.getMode(i11);
                i11 = View.MeasureSpec.getSize(i11);
                if (mode == 1073741824 && mode2 == 1073741824) {
                    int i15 = this.f69479b;
                    int i16 = i15 * i11;
                    int i17 = this.f69480c;
                    if (i16 < i10 * i17) {
                        i10 = (i15 * i11) / i17;
                    } else if (i15 * i11 > i10 * i17) {
                        i11 = (i17 * i10) / i15;
                    }
                } else if (mode == 1073741824) {
                    int i18 = (this.f69480c * i10) / this.f69479b;
                    if (mode2 != Integer.MIN_VALUE || i18 <= i11) {
                        i11 = i18;
                    }
                } else if (mode2 == 1073741824) {
                    i12 = (this.f69479b * i11) / this.f69480c;
                    if (mode != Integer.MIN_VALUE || i12 <= i10) {
                        i10 = i12;
                    }
                } else {
                    int i19 = this.f69479b;
                    int i20 = this.f69480c;
                    if (mode2 != Integer.MIN_VALUE || i20 <= i11) {
                        i12 = i19;
                        i11 = i20;
                    } else {
                        i12 = (i11 * i19) / i20;
                    }
                    if (mode != Integer.MIN_VALUE || i12 <= i10) {
                        i10 = i12;
                    } else {
                        i11 = (i20 * i10) / i19;
                    }
                }
            }
            i10 = defaultSize;
            i11 = defaultSize2;
        }
        setMeasuredDimension(i10, i11);
    }

    public final void setScreenScale(@d a type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, c.f.pr, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        this.f69482e = type;
        requestLayout();
    }

    public final void setScreenType(@d a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, c.f.nr, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f69482e = aVar;
    }

    public final void setVideoSize(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.or, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f69479b = i10;
        this.f69480c = i11;
        requestLayout();
    }
}
