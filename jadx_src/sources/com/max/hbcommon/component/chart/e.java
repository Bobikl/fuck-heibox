package com.max.hbcommon.component.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: HeyBoxXAxisRenderer.java */
/* JADX INFO: loaded from: classes9.dex */
public class e extends XAxisRenderer {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f67461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Paint f67462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67463c;

    public e(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
        this.f67461a = true;
        this.f67463c = 452063987;
        this.f67462b = new Paint(1);
    }

    public void a(Canvas canvas, float f10, float f11, Path path) {
        Object[] objArr = {canvas, new Float(f10), new Float(f11), path};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.sn, new Class[]{Canvas.class, cls, cls, Path.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67462b.setColor(this.f67463c);
        canvas.drawRect(f10, this.mViewPortHandler.contentTop(), f11, this.mViewPortHandler.contentBottom(), this.f67462b);
    }

    public boolean b() {
        return this.f67461a;
    }

    public void c(boolean z10) {
        this.f67461a = z10;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        int i10;
        int i11 = 0;
        if (!PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.rn, new Class[]{Canvas.class}, Void.TYPE).isSupported && this.mXAxis.isDrawGridLinesEnabled() && this.mXAxis.isEnabled()) {
            int iSave = canvas.save();
            canvas.clipRect(getGridClippingRect());
            if (this.mRenderGridLinesBuffer.length != this.mAxis.mEntryCount * 2) {
                this.mRenderGridLinesBuffer = new float[this.mXAxis.mEntryCount * 2];
            }
            float[] fArr = this.mRenderGridLinesBuffer;
            for (int i12 = 0; i12 < fArr.length; i12 += 2) {
                float[] fArr2 = this.mXAxis.mEntries;
                int i13 = i12 / 2;
                fArr[i12] = fArr2[i13];
                fArr[i12 + 1] = fArr2[i13];
            }
            this.mTrans.pointValuesToPixel(fArr);
            setupGridPaint();
            Path path = this.mRenderGridLinesPath;
            path.reset();
            int length = fArr.length / 2;
            int i14 = 0;
            while (i11 < fArr.length) {
                if (this.f67461a && length > 2 && i14 > 0 && i14 % 2 != 0 && (i10 = i11 + 2) < fArr.length) {
                    a(canvas, fArr[i11], fArr[i10], path);
                }
                drawGridLine(canvas, fArr[i11], fArr[i11 + 1], path);
                i11 += 2;
                i14++;
            }
            canvas.restoreToCount(iSave);
        }
    }
}
