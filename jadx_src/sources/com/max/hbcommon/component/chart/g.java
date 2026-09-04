package com.max.hbcommon.component.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.j1;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: HeyBoxYAxisRenderer.java */
/* JADX INFO: loaded from: classes9.dex */
public class g extends YAxisRenderer {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected YAxis f67473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Paint f67474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f67475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f67476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Path f67477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected RectF f67478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected float[] f67479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Path f67480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected RectF f67481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Path f67482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float[] f67483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected RectF f67484l;

    public g(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        this.f67477e = new Path();
        this.f67478f = new RectF();
        this.f67479g = new float[2];
        this.f67480h = new Path();
        this.f67481i = new RectF();
        this.f67482j = new Path();
        this.f67483k = new float[2];
        this.f67484l = new RectF();
        this.f67473a = yAxis;
        if (this.mViewPortHandler != null) {
            this.mAxisLabelPaint.setColor(j1.f21601t);
            this.mAxisLabelPaint.setTextSize(Utils.convertDpToPixel(10.0f));
            Paint paint = new Paint(1);
            this.f67474b = paint;
            paint.setColor(-7829368);
            this.f67474b.setStrokeWidth(1.0f);
            this.f67474b.setStyle(Paint.Style.STROKE);
        }
    }

    public boolean a() {
        return this.f67476d;
    }

    public boolean b() {
        return this.f67475c;
    }

    public void c(boolean z10) {
        this.f67476d = z10;
    }

    public void d(boolean z10) {
        this.f67475c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.github.mikephil.charting.components.AxisBase, com.github.mikephil.charting.components.YAxis] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public void drawYLabels(Canvas canvas, float f10, float[] fArr, float f11) {
        Object[] objArr = {canvas, new Float(f10), fArr, new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Cn, new Class[]{Canvas.class, cls, float[].class, cls}, Void.TYPE).isSupported) {
            return;
        }
        boolean z10 = !this.f67473a.isDrawBottomYLabelEntryEnabled();
        int i10 = this.f67473a.isDrawTopYLabelEntryEnabled() ? this.f67473a.mEntryCount : this.f67473a.mEntryCount - 1;
        ?? r10 = z10;
        while (r10 < i10) {
            if (!((!this.f67476d && r10 == z10) || (!this.f67475c && r10 == i10 + (-1)))) {
                canvas.drawText(this.f67473a.getFormattedLabel(r10), f10, fArr[(r10 * 2) + 1] + f11, this.mAxisLabelPaint);
            }
            r10++;
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public void drawZeroLine(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.Hn, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        int iSave = canvas.save();
        this.f67481i.set(this.mViewPortHandler.getContentRect());
        this.f67481i.inset(0.0f, -this.f67473a.getZeroLineWidth());
        canvas.clipRect(this.f67481i);
        MPPointD pixelForValues = this.mTrans.getPixelForValues(0.0f, 0.0f);
        this.f67474b.setColor(this.f67473a.getZeroLineColor());
        this.f67474b.setStrokeWidth(this.f67473a.getZeroLineWidth());
        Path path = this.f67480h;
        path.reset();
        path.moveTo(this.mViewPortHandler.contentLeft(), (float) pixelForValues.f43142y);
        path.lineTo(this.mViewPortHandler.contentRight(), (float) pixelForValues.f43142y);
        canvas.drawPath(path, this.f67474b);
        canvas.restoreToCount(iSave);
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public RectF getGridClippingRect() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.En, new Class[0], RectF.class);
        if (patchProxyResultProxy.isSupported) {
            return (RectF) patchProxyResultProxy.result;
        }
        this.f67478f.set(this.mViewPortHandler.getContentRect());
        this.f67478f.inset(0.0f, -this.mAxis.getGridLineWidth());
        return this.f67478f;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public float[] getTransformedPositions() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Gn, new Class[0], float[].class);
        if (patchProxyResultProxy.isSupported) {
            return (float[]) patchProxyResultProxy.result;
        }
        int length = this.f67479g.length;
        int i10 = this.f67473a.mEntryCount;
        if (length != i10 * 2) {
            this.f67479g = new float[i10 * 2];
        }
        float[] fArr = this.f67479g;
        for (int i11 = 0; i11 < fArr.length; i11 += 2) {
            fArr[i11 + 1] = this.f67473a.mEntries[i11 / 2];
        }
        this.mTrans.pointValuesToPixel(fArr);
        return fArr;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public Path linePath(Path path, int i10, float[] fArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{path, new Integer(i10), fArr}, this, changeQuickRedirect, false, bb.c.d.Fn, new Class[]{Path.class, Integer.TYPE, float[].class}, Path.class);
        if (patchProxyResultProxy.isSupported) {
            return (Path) patchProxyResultProxy.result;
        }
        int i11 = i10 + 1;
        path.moveTo(this.mViewPortHandler.offsetLeft(), fArr[i11]);
        path.lineTo(this.mViewPortHandler.contentRight(), fArr[i11]);
        return path;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        float fContentRight;
        float fContentRight2;
        float f10;
        if (!PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.An, new Class[]{Canvas.class}, Void.TYPE).isSupported && this.f67473a.isEnabled() && this.f67473a.isDrawLabelsEnabled()) {
            float[] transformedPositions = getTransformedPositions();
            this.mAxisLabelPaint.setTypeface(this.f67473a.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.f67473a.getTextSize());
            this.mAxisLabelPaint.setColor(this.f67473a.getTextColor());
            float xOffset = this.f67473a.getXOffset();
            float fCalcTextHeight = (Utils.calcTextHeight(this.mAxisLabelPaint, androidx.exifinterface.media.a.W4) / 2.5f) + this.f67473a.getYOffset();
            YAxis.AxisDependency axisDependency = this.f67473a.getAxisDependency();
            YAxis.YAxisLabelPosition labelPosition = this.f67473a.getLabelPosition();
            if (axisDependency == YAxis.AxisDependency.LEFT) {
                if (labelPosition == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                    this.mAxisLabelPaint.setTextAlign(Paint.Align.RIGHT);
                    fContentRight = this.mViewPortHandler.offsetLeft();
                    f10 = fContentRight - xOffset;
                } else {
                    this.mAxisLabelPaint.setTextAlign(Paint.Align.LEFT);
                    fContentRight2 = this.mViewPortHandler.offsetLeft();
                    f10 = fContentRight2 + xOffset;
                }
            } else if (labelPosition == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                this.mAxisLabelPaint.setTextAlign(Paint.Align.LEFT);
                fContentRight2 = this.mViewPortHandler.contentRight();
                f10 = fContentRight2 + xOffset;
            } else {
                this.mAxisLabelPaint.setTextAlign(Paint.Align.RIGHT);
                fContentRight = this.mViewPortHandler.contentRight();
                f10 = fContentRight - xOffset;
            }
            drawYLabels(canvas, f10, transformedPositions, fCalcTextHeight);
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(Canvas canvas) {
        if (!PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.Bn, new Class[]{Canvas.class}, Void.TYPE).isSupported && this.f67473a.isEnabled() && this.f67473a.isDrawAxisLineEnabled()) {
            this.mAxisLinePaint.setColor(this.f67473a.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.f67473a.getAxisLineWidth());
            if (this.f67473a.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                canvas.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            } else {
                canvas.drawLine(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        if (!PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.Dn, new Class[]{Canvas.class}, Void.TYPE).isSupported && this.f67473a.isEnabled()) {
            if (this.f67473a.isDrawGridLinesEnabled()) {
                int iSave = canvas.save();
                canvas.clipRect(getGridClippingRect());
                float[] transformedPositions = getTransformedPositions();
                this.mGridPaint.setColor(this.f67473a.getGridColor());
                this.mGridPaint.setStrokeWidth(this.f67473a.getGridLineWidth());
                this.mGridPaint.setPathEffect(this.f67473a.getGridDashPathEffect());
                Path path = this.f67477e;
                path.reset();
                for (int i10 = 0; i10 < transformedPositions.length; i10 += 2) {
                    canvas.drawPath(linePath(path, i10, transformedPositions), this.mGridPaint);
                    path.reset();
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f67473a.isDrawZeroLineEnabled()) {
                drawZeroLine(canvas);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.In, new Class[]{Canvas.class}, Void.TYPE).isSupported || (limitLines = this.f67473a.getLimitLines()) == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = this.f67483k;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.f67482j;
        path.reset();
        for (int i10 = 0; i10 < limitLines.size(); i10++) {
            LimitLine limitLine = limitLines.get(i10);
            if (limitLine.isEnabled()) {
                int iSave = canvas.save();
                this.f67484l.set(this.mViewPortHandler.getContentRect());
                this.f67484l.inset(0.0f, -limitLine.getLineWidth());
                canvas.clipRect(this.f67484l);
                this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
                this.mLimitLinePaint.setColor(limitLine.getLineColor());
                this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                fArr[1] = limitLine.getLimit();
                this.mTrans.pointValuesToPixel(fArr);
                path.moveTo(this.mViewPortHandler.contentLeft(), fArr[1]);
                path.lineTo(this.mViewPortHandler.contentRight(), fArr[1]);
                canvas.drawPath(path, this.mLimitLinePaint);
                path.reset();
                String label = limitLine.getLabel();
                if (label != null && !label.equals("")) {
                    this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
                    this.mLimitLinePaint.setPathEffect(null);
                    this.mLimitLinePaint.setColor(limitLine.getTextColor());
                    this.mLimitLinePaint.setTypeface(limitLine.getTypeface());
                    this.mLimitLinePaint.setStrokeWidth(0.5f);
                    this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
                    float fCalcTextHeight = Utils.calcTextHeight(this.mLimitLinePaint, label);
                    float fConvertDpToPixel = Utils.convertDpToPixel(4.0f) + limitLine.getXOffset();
                    float lineWidth = limitLine.getLineWidth() + fCalcTextHeight + limitLine.getYOffset();
                    LimitLine.LimitLabelPosition labelPosition = limitLine.getLabelPosition();
                    if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(label, this.mViewPortHandler.contentRight() - fConvertDpToPixel, (fArr[1] - lineWidth) + fCalcTextHeight, this.mLimitLinePaint);
                    } else if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(label, this.mViewPortHandler.contentRight() - fConvertDpToPixel, fArr[1] + lineWidth, this.mLimitLinePaint);
                    } else if (labelPosition == LimitLine.LimitLabelPosition.LEFT_TOP) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(label, this.mViewPortHandler.contentLeft() + fConvertDpToPixel, (fArr[1] - lineWidth) + fCalcTextHeight, this.mLimitLinePaint);
                    } else {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(label, this.mViewPortHandler.offsetLeft() + fConvertDpToPixel, fArr[1] + lineWidth, this.mLimitLinePaint);
                    }
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
