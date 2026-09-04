package com.max.hbcommon.component.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: HeyBoxXAxisRendererRadarChart.java */
/* JADX INFO: loaded from: classes9.dex */
public class f extends XAxisRenderer {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HeyBoxRadarChart f67464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f67465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f67466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected List<Integer> f67467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Typeface f67468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected float f67469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected List<Integer> f67470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Typeface f67471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected float f67472i;

    public f(ViewPortHandler viewPortHandler, XAxis xAxis, HeyBoxRadarChart heyBoxRadarChart) {
        super(viewPortHandler, xAxis, null);
        this.f67467d = null;
        this.f67469f = 10.0f;
        this.f67470g = null;
        this.f67472i = 16.0f;
        this.f67464a = heyBoxRadarChart;
        this.f67465b = new Paint(1);
        this.f67466c = new Paint(1);
        this.f67467d = new ArrayList();
        this.f67470g = new ArrayList();
        k(Typeface.defaultFromStyle(0));
        n(Typeface.defaultFromStyle(1));
        j(this.f67469f);
        m(this.f67472i);
        i(-7564906);
        l(-15460066);
    }

    public List<Integer> a() {
        return this.f67467d;
    }

    public float b() {
        return this.f67469f;
    }

    public Typeface c() {
        return this.f67468e;
    }

    public List<Integer> d() {
        return this.f67470g;
    }

    public float e() {
        return this.f67472i;
    }

    public Typeface f() {
        return this.f67471h;
    }

    public void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.un, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f67467d == null) {
            this.f67467d = new ArrayList();
        }
        this.f67467d.clear();
    }

    public void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.vn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f67470g == null) {
            this.f67470g = new ArrayList();
        }
        this.f67470g.clear();
    }

    public void i(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.wn, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        g();
        this.f67467d.add(Integer.valueOf(i10));
    }

    public void j(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.d.yn, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67469f = Utils.convertDpToPixel(f10);
    }

    public void k(Typeface typeface) {
        this.f67468e = typeface;
    }

    public void l(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.xn, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        h();
        this.f67470g.add(Integer.valueOf(i10));
    }

    public void m(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.d.zn, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67472i = Utils.convertDpToPixel(f10);
    }

    public void n(Typeface typeface) {
        this.f67471h = typeface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        int i10 = 0;
        if (!PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.tn, new Class[]{Canvas.class}, Void.TYPE).isSupported && this.mXAxis.isEnabled()) {
            this.mXAxis.getLabelRotationAngle();
            MPPointF mPPointF = MPPointF.getInstance(0.5f, 0.25f);
            this.f67464a.getContext().getResources();
            this.f67465b.setTypeface(this.f67468e);
            this.f67465b.setTextSize(this.f67469f);
            this.f67466c.setTypeface(this.f67471h);
            this.f67466c.setTextSize(this.f67472i);
            if (this.f67467d.size() > 0) {
                this.f67465b.setColor(this.f67467d.get(0).intValue());
            }
            if (this.f67470g.size() > 0) {
                this.f67466c.setColor(this.f67470g.get(0).intValue());
            }
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            float sliceAngle = this.f67464a.getSliceAngle();
            float factor = this.f67464a.getFactor();
            MPPointF centerOffsets = this.f67464a.getCenterOffsets();
            MPPointF mPPointF2 = MPPointF.getInstance(0.0f, 0.0f);
            RadarData radarData = (RadarData) this.f67464a.getData();
            int entryCount = radarData.getMaxEntryCountSet().getEntryCount();
            String[] strArr = new String[entryCount];
            for (IRadarDataSet iRadarDataSet : radarData.getDataSets()) {
                if (iRadarDataSet.isVisible()) {
                    for (int i11 = i10; i11 < iRadarDataSet.getEntryCount(); i11++) {
                        strArr[i11] = String.format(Locale.US, "%.1f", Float.valueOf(((RadarEntry) iRadarDataSet.getEntryForIndex(i11)).getY()));
                    }
                }
                i10 = 0;
            }
            int i12 = 0;
            while (i12 < ((RadarData) this.f67464a.getData()).getMaxEntryCountSet().getEntryCount()) {
                float f10 = i12;
                String formattedValue = this.mXAxis.getValueFormatter().getFormattedValue(f10, this.mXAxis);
                String str = strArr[i12];
                Utils.getPosition(centerOffsets, (this.f67464a.getYRange() * factor) + (this.mXAxis.mLabelRotatedWidth / 2.0f), ((f10 * sliceAngle) + this.f67464a.getRotationAngle()) % 360.0f, mPPointF2);
                Paint.FontMetrics fontMetrics = new Paint.FontMetrics();
                Rect rect = new Rect();
                float fontMetrics2 = this.f67465b.getFontMetrics(fontMetrics);
                float f11 = sliceAngle;
                float f12 = factor;
                this.f67465b.getTextBounds(formattedValue, 0, formattedValue.length(), rect);
                int iWidth = rect.width();
                int i13 = (int) fontMetrics2;
                float fWidth = 0.0f - rect.left;
                float f13 = (-fontMetrics.ascent) + 0.0f;
                String[] strArr2 = strArr;
                this.f67465b.getTextAlign();
                MPPointF mPPointF3 = centerOffsets;
                this.f67465b.setTextAlign(Paint.Align.LEFT);
                if (mPPointF.f43143x != 0.0f || mPPointF.f43144y != 0.0f) {
                    fWidth -= rect.width() * mPPointF.f43143x;
                    f13 -= fontMetrics2 * mPPointF.f43144y;
                }
                float f14 = fWidth + mPPointF2.f43143x;
                float fConvertDpToPixel = f13 + (mPPointF2.f43144y - (this.mXAxis.mLabelRotatedHeight / 2.0f));
                if (entryCount == 5 && (i12 == 2 || i12 == 3)) {
                    fConvertDpToPixel = (fConvertDpToPixel - i13) + Utils.convertDpToPixel(2.0f);
                }
                canvas.drawText(formattedValue, f14, fConvertDpToPixel, this.f67465b);
                this.f67466c.getTextBounds(str, 0, str.length(), rect);
                canvas.drawText(str, f14 + ((iWidth - rect.width()) / 2.0f), fConvertDpToPixel + i13 + 20.0f, this.f67466c);
                i12++;
                sliceAngle = f11;
                factor = f12;
                strArr = strArr2;
                centerOffsets = mPPointF3;
            }
            MPPointF.recycleInstance(centerOffsets);
            MPPointF.recycleInstance(mPPointF2);
            MPPointF.recycleInstance(mPPointF);
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
    }
}
