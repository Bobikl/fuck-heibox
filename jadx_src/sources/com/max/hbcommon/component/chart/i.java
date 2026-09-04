package com.max.hbcommon.component.chart;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: StartEndXAxisRenderer.java */
/* JADX INFO: loaded from: classes9.dex */
public class i extends XAxisRenderer {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f67487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f67488b;

    public i(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, boolean z10, boolean z11) {
        super(viewPortHandler, xAxis, transformer);
        this.f67487a = z10;
        this.f67488b = z11;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        if (!PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.Mn, new Class[]{Canvas.class}, Void.TYPE).isSupported && this.mXAxis.isDrawGridLinesEnabled() && this.mXAxis.isEnabled()) {
            int iSave = canvas.save();
            canvas.clipRect(getGridClippingRect());
            if (this.mRenderGridLinesBuffer.length != this.mAxis.mEntryCount * 2) {
                this.mRenderGridLinesBuffer = new float[this.mXAxis.mEntryCount * 2];
            }
            float[] fArr = this.mRenderGridLinesBuffer;
            for (int i10 = 0; i10 < fArr.length; i10 += 2) {
                float[] fArr2 = this.mXAxis.mEntries;
                int i11 = i10 / 2;
                fArr[i10] = fArr2[i11];
                fArr[i10 + 1] = fArr2[i11];
            }
            this.mTrans.pointValuesToPixel(fArr);
            setupGridPaint();
            Path path = this.mRenderGridLinesPath;
            path.reset();
            for (int i12 = 0; i12 < fArr.length; i12 += 2) {
                if ((this.f67487a || i12 != 0) && (this.f67488b || (i12 != fArr.length - 1 && i12 != fArr.length - 2))) {
                    drawGridLine(canvas, fArr[i12], fArr[i12 + 1], path);
                }
            }
            canvas.restoreToCount(iSave);
        }
    }
}
