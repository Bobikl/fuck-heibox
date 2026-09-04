package com.max.hbcommon.component.chart;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.LineRadarRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: TwoColorLineChartRenderer.java */
/* JADX INFO: loaded from: classes9.dex */
public class k extends LineRadarRenderer {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f67493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f67494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f67495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected LineDataProvider f67496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Paint f67497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected WeakReference<Bitmap> f67498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Canvas f67499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Bitmap.Config f67500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Path f67501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Path f67502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f67503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Path f67504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private HashMap<IDataSet, c> f67505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float[] f67506n;

    /* JADX INFO: compiled from: TwoColorLineChartRenderer.java */
    public class a extends ShapeDrawable.ShaderFactory {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f67507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f67508b;

        a(float f10, float f11) {
            this.f67507a = f10;
            this.f67508b = f11;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.go, new Class[]{cls, cls}, Shader.class);
            if (patchProxyResultProxy.isSupported) {
                return (Shader) patchProxyResultProxy.result;
            }
            float f10 = i10 / 2;
            return new LinearGradient(f10, 0.0f, f10, i11, new int[]{k.this.f67494b, 0, k.this.f67495c}, new float[]{0.0f, (this.f67507a - k.this.f67493a) / (this.f67507a - this.f67508b), 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    /* JADX INFO: compiled from: TwoColorLineChartRenderer.java */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f67510a;

        static {
            int[] iArr = new int[LineDataSet.Mode.values().length];
            f67510a = iArr;
            try {
                iArr[LineDataSet.Mode.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67510a[LineDataSet.Mode.STEPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67510a[LineDataSet.Mode.CUBIC_BEZIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67510a[LineDataSet.Mode.HORIZONTAL_BEZIER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: TwoColorLineChartRenderer.java */
    public class c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Path f67511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap[] f67512b;

        private c() {
            this.f67511a = new Path();
        }

        /* synthetic */ c(k kVar, a aVar) {
            this();
        }

        public void a(ILineDataSet iLineDataSet, boolean z10, boolean z11) {
            Object[] objArr = {iLineDataSet, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31310io, new Class[]{ILineDataSet.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            int circleColorCount = iLineDataSet.getCircleColorCount();
            float circleRadius = iLineDataSet.getCircleRadius();
            float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
            for (int i10 = 0; i10 < circleColorCount; i10++) {
                int i11 = (int) (((double) circleRadius) * 2.1d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                this.f67512b[i10] = bitmapCreateBitmap;
                ((DataRenderer) k.this).mRenderPaint.setColor(iLineDataSet.getCircleColor(i10));
                if (z11) {
                    this.f67511a.reset();
                    this.f67511a.addCircle(circleRadius, circleRadius, circleRadius, Path.Direction.CW);
                    this.f67511a.addCircle(circleRadius, circleRadius, circleHoleRadius, Path.Direction.CCW);
                    canvas.drawPath(this.f67511a, ((DataRenderer) k.this).mRenderPaint);
                } else {
                    canvas.drawCircle(circleRadius, circleRadius, circleRadius, ((DataRenderer) k.this).mRenderPaint);
                    if (z10) {
                        canvas.drawCircle(circleRadius, circleRadius, circleHoleRadius, k.this.f67497e);
                    }
                }
            }
        }

        public Bitmap b(int i10) {
            Bitmap[] bitmapArr = this.f67512b;
            return bitmapArr[i10 % bitmapArr.length];
        }

        public boolean c(ILineDataSet iLineDataSet) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iLineDataSet}, this, changeQuickRedirect, false, bb.c.d.ho, new Class[]{ILineDataSet.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            int circleColorCount = iLineDataSet.getCircleColorCount();
            Bitmap[] bitmapArr = this.f67512b;
            if (bitmapArr == null) {
                this.f67512b = new Bitmap[circleColorCount];
                return true;
            }
            if (bitmapArr.length == circleColorCount) {
                return false;
            }
            this.f67512b = new Bitmap[circleColorCount];
            return true;
        }
    }

    public k(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.f67500h = Bitmap.Config.ARGB_8888;
        this.f67501i = new Path();
        this.f67502j = new Path();
        this.f67503k = new float[4];
        this.f67504l = new Path();
        this.f67505m = new HashMap<>();
        this.f67506n = new float[2];
        this.f67496d = lineDataProvider;
        Paint paint = new Paint(1);
        this.f67497e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f67497e.setColor(-1);
    }

    public static int g(float f10, int i10) {
        Object[] objArr = {new Float(f10), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.Un, new Class[]{Float.TYPE, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Color.argb(Math.round(f10 * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.github.mikephil.charting.data.BaseEntry] */
    private void generateFilledPath(ILineDataSet iLineDataSet, int i10, int i11, Path path) {
        Object[] objArr = {iLineDataSet, new Integer(i10), new Integer(i11), path};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Zn, new Class[]{ILineDataSet.class, cls, cls, Path.class}, Void.TYPE).isSupported) {
            return;
        }
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.f67496d);
        float phaseY = this.mAnimator.getPhaseY();
        boolean z10 = iLineDataSet.getMode() == LineDataSet.Mode.STEPPED;
        path.reset();
        ?? entryForIndex = iLineDataSet.getEntryForIndex(i10);
        path.moveTo(entryForIndex.getX(), fillLinePosition);
        path.lineTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
        int i12 = i10 + 1;
        ?? r10 = 0;
        while (true) {
            ?? r11 = r10;
            if (i12 > i11) {
                break;
            }
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i12);
            if (z10 && r11 != 0) {
                path.lineTo(entryForIndex2.getX(), r11.getY() * phaseY);
            }
            path.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
            i12++;
            r10 = entryForIndex2;
        }
        if (r10 != 0) {
            path.lineTo(r10.getX(), fillLinePosition);
        }
        path.close();
    }

    private Drawable h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Yn, new Class[0], Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        a aVar = new a(((LineChart) this.f67496d).getAxisLeft().getAxisMaximum(), ((LineChart) this.f67496d).getAxisLeft().getAxisMinimum());
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(aVar);
        return paintDrawable;
    }

    private void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Wn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f67494b;
        int i11 = this.f67495c;
        int[] iArr = {i10, i10, i11, i11};
        float axisMaximum = ((LineChart) this.f67496d).getAxisLeft().getAxisMaximum();
        float axisMinimum = ((LineChart) this.f67496d).getAxisLeft().getAxisMinimum();
        float f10 = this.f67493a;
        float f11 = axisMaximum - axisMinimum;
        this.mRenderPaint.setShader(new LinearGradient(0.0f, this.mViewPortHandler.getContentRect().top, 0.0f, this.mViewPortHandler.getContentRect().bottom, iArr, new float[]{0.0f, (axisMaximum - f10) / f11, (axisMaximum - f10) / f11, 1.0f}, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public void drawCircles(Canvas canvas) {
        c cVar;
        Bitmap bitmapB;
        char c10 = 0;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.co, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float phaseY = this.mAnimator.getPhaseY();
        float[] fArr = this.f67506n;
        float f10 = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        List<T> dataSets = this.f67496d.getLineData().getDataSets();
        int i10 = 0;
        while (i10 < dataSets.size()) {
            ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(i10);
            if (iLineDataSet.isVisible() && iLineDataSet.isDrawCirclesEnabled() && iLineDataSet.getEntryCount() != 0) {
                this.f67497e.setColor(iLineDataSet.getCircleHoleColor());
                Transformer transformer = this.f67496d.getTransformer(iLineDataSet.getAxisDependency());
                this.mXBounds.set(this.f67496d, iLineDataSet);
                float circleRadius = iLineDataSet.getCircleRadius();
                float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
                boolean z10 = (!iLineDataSet.isDrawCircleHoleEnabled() || circleHoleRadius >= circleRadius || circleHoleRadius <= f10) ? c10 : 1;
                boolean z11 = (z10 == 0 || iLineDataSet.getCircleHoleColor() != 1122867) ? c10 : 1;
                a aVar = null;
                if (this.f67505m.containsKey(iLineDataSet)) {
                    cVar = this.f67505m.get(iLineDataSet);
                } else {
                    c cVar2 = new c(this, aVar);
                    this.f67505m.put(iLineDataSet, cVar2);
                    cVar = cVar2;
                }
                if (cVar.c(iLineDataSet)) {
                    cVar.a(iLineDataSet, z10, z11);
                }
                BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                int i11 = xBounds.range;
                int i12 = xBounds.min;
                int i13 = i11 + i12;
                while (i12 <= i13) {
                    ?? entryForIndex = iLineDataSet.getEntryForIndex(i12);
                    if (entryForIndex == 0) {
                        break;
                    }
                    this.f67506n[c10] = entryForIndex.getX();
                    this.f67506n[1] = entryForIndex.getY() * phaseY;
                    transformer.pointValuesToPixel(this.f67506n);
                    if (!this.mViewPortHandler.isInBoundsRight(this.f67506n[c10])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.f67506n[c10]) && this.mViewPortHandler.isInBoundsY(this.f67506n[1]) && (bitmapB = cVar.b(i12)) != null) {
                        float[] fArr2 = this.f67506n;
                        canvas.drawBitmap(bitmapB, fArr2[c10] - circleRadius, fArr2[1] - circleRadius, (Paint) null);
                    }
                    i12++;
                    c10 = 0;
                }
            }
            i10++;
            f10 = 0.0f;
            c10 = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v5 */
    public void drawCubicBezier(ILineDataSet iLineDataSet) {
        if (PatchProxy.proxy(new Object[]{iLineDataSet}, this, changeQuickRedirect, false, bb.c.d.Sn, new Class[]{ILineDataSet.class}, Void.TYPE).isSupported) {
            return;
        }
        Math.max(0.0f, Math.min(1.0f, this.mAnimator.getPhaseX()));
        float phaseY = this.mAnimator.getPhaseY();
        Transformer transformer = this.f67496d.getTransformer(iLineDataSet.getAxisDependency());
        this.mXBounds.set(this.f67496d, iLineDataSet);
        float cubicIntensity = iLineDataSet.getCubicIntensity();
        this.f67501i.reset();
        BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
        if (xBounds.range >= 1) {
            int i10 = xBounds.min + 1;
            Object entryForIndex = iLineDataSet.getEntryForIndex(Math.max(i10 - 2, 0));
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(Math.max(i10 - 1, 0));
            if (entryForIndex2 != 0) {
                this.f67501i.moveTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                int i11 = this.mXBounds.min + 1;
                int i12 = -1;
                ?? r10 = entryForIndex2;
                ?? r11 = entryForIndex2;
                ?? r12 = entryForIndex;
                while (true) {
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                    ?? entryForIndex3 = r11;
                    if (i11 > xBounds2.range + xBounds2.min) {
                        break;
                    }
                    if (i12 != i11) {
                        entryForIndex3 = iLineDataSet.getEntryForIndex(i11);
                    }
                    int i13 = i11 + 1;
                    if (i13 < iLineDataSet.getEntryCount()) {
                        i11 = i13;
                    }
                    ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i11);
                    this.f67501i.cubicTo(r10.getX() + ((entryForIndex3.getX() - r12.getX()) * cubicIntensity), (r10.getY() + ((entryForIndex3.getY() - r12.getY()) * cubicIntensity)) * phaseY, entryForIndex3.getX() - ((entryForIndex4.getX() - r10.getX()) * cubicIntensity), (entryForIndex3.getY() - ((entryForIndex4.getY() - r10.getY()) * cubicIntensity)) * phaseY, entryForIndex3.getX(), entryForIndex3.getY() * phaseY);
                    r12 = r10;
                    r10 = entryForIndex3;
                    r11 = entryForIndex4;
                    int i14 = i11;
                    i11 = i13;
                    i12 = i14;
                }
            } else {
                return;
            }
        }
        if (iLineDataSet.isDrawFilledEnabled()) {
            this.f67502j.reset();
            this.f67502j.addPath(this.f67501i);
            drawCubicFill(this.f67499g, iLineDataSet, this.f67502j, transformer, this.mXBounds);
        }
        i();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.pathValueToPixel(this.f67501i);
        this.f67499g.drawPath(this.f67501i, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.github.mikephil.charting.data.Entry] */
    public void drawCubicFill(Canvas canvas, ILineDataSet iLineDataSet, Path path, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        if (PatchProxy.proxy(new Object[]{canvas, iLineDataSet, path, transformer, xBounds}, this, changeQuickRedirect, false, bb.c.d.Tn, new Class[]{Canvas.class, ILineDataSet.class, Path.class, Transformer.class, BarLineScatterCandleBubbleRenderer.XBounds.class}, Void.TYPE).isSupported) {
            return;
        }
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.f67496d);
        path.lineTo(iLineDataSet.getEntryForIndex(xBounds.min + xBounds.range).getX(), fillLinePosition);
        path.lineTo(iLineDataSet.getEntryForIndex(xBounds.min).getX(), fillLinePosition);
        path.close();
        transformer.pathValueToPixel(path);
        try {
            drawFilledPath(canvas, path, h());
        } catch (Throwable unused) {
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.Pn, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.f67498f;
        if (weakReference == null || weakReference.get().getWidth() != chartWidth || this.f67498f.get().getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            this.f67498f = new WeakReference<>(Bitmap.createBitmap(chartWidth, chartHeight, this.f67500h));
            this.f67499g = new Canvas(this.f67498f.get());
        }
        this.f67498f.get().eraseColor(0);
        for (T t10 : this.f67496d.getLineData().getDataSets()) {
            if (t10.isVisible()) {
                drawDataSet(canvas, t10);
            }
        }
        canvas.drawBitmap(this.f67498f.get(), 0.0f, 0.0f, this.mRenderPaint);
    }

    public void drawDataSet(Canvas canvas, ILineDataSet iLineDataSet) {
        if (!PatchProxy.proxy(new Object[]{canvas, iLineDataSet}, this, changeQuickRedirect, false, bb.c.d.Qn, new Class[]{Canvas.class, ILineDataSet.class}, Void.TYPE).isSupported && iLineDataSet.getEntryCount() >= 1) {
            this.mRenderPaint.setStrokeWidth(iLineDataSet.getLineWidth());
            this.mRenderPaint.setPathEffect(iLineDataSet.getDashPathEffect());
            int i10 = b.f67510a[iLineDataSet.getMode().ordinal()];
            if (i10 == 3) {
                drawCubicBezier(iLineDataSet);
            } else if (i10 != 4) {
                drawLinear(canvas, iLineDataSet);
            } else {
                drawHorizontalBezier(iLineDataSet);
            }
            this.mRenderPaint.setPathEffect(null);
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.bo, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        drawCircles(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        if (PatchProxy.proxy(new Object[]{canvas, highlightArr}, this, changeQuickRedirect, false, bb.c.d.f2do, new Class[]{Canvas.class, Highlight[].class}, Void.TYPE).isSupported) {
            return;
        }
        LineData lineData = this.f67496d.getLineData();
        for (Highlight highlight : highlightArr) {
            ILineDataSet iLineDataSet = (ILineDataSet) lineData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iLineDataSet != null && iLineDataSet.isHighlightEnabled()) {
                ?? entryForXValue = iLineDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iLineDataSet)) {
                    MPPointD pixelForValues = this.f67496d.getTransformer(iLineDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.f43141x, (float) pixelForValues.f43142y);
                    drawHighlightLines(canvas, (float) pixelForValues.f43141x, (float) pixelForValues.f43142y, iLineDataSet);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public void drawHorizontalBezier(ILineDataSet iLineDataSet) {
        if (PatchProxy.proxy(new Object[]{iLineDataSet}, this, changeQuickRedirect, false, bb.c.d.Rn, new Class[]{ILineDataSet.class}, Void.TYPE).isSupported) {
            return;
        }
        float phaseY = this.mAnimator.getPhaseY();
        Transformer transformer = this.f67496d.getTransformer(iLineDataSet.getAxisDependency());
        this.mXBounds.set(this.f67496d, iLineDataSet);
        this.f67501i.reset();
        BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
        if (xBounds.range >= 1) {
            ?? entryForIndex = iLineDataSet.getEntryForIndex(xBounds.min);
            this.f67501i.moveTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
            int i10 = this.mXBounds.min + 1;
            ?? r10 = entryForIndex;
            while (true) {
                BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                if (i10 > xBounds2.range + xBounds2.min) {
                    break;
                }
                ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i10);
                float x10 = r10.getX() + ((entryForIndex2.getX() - r10.getX()) / 2.0f);
                this.f67501i.cubicTo(x10, r10.getY() * phaseY, x10, entryForIndex2.getY() * phaseY, entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                i10++;
                r10 = entryForIndex2;
            }
        }
        if (iLineDataSet.isDrawFilledEnabled()) {
            this.f67502j.reset();
            this.f67502j.addPath(this.f67501i);
            drawCubicFill(this.f67499g, iLineDataSet, this.f67502j, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.pathValueToPixel(this.f67501i);
        this.f67499g.drawPath(this.f67501i, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r13v7, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v23, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public void drawLinear(Canvas canvas, ILineDataSet iLineDataSet) {
        if (PatchProxy.proxy(new Object[]{canvas, iLineDataSet}, this, changeQuickRedirect, false, bb.c.d.Vn, new Class[]{Canvas.class, ILineDataSet.class}, Void.TYPE).isSupported) {
            return;
        }
        int entryCount = iLineDataSet.getEntryCount();
        boolean zIsDrawSteppedEnabled = iLineDataSet.isDrawSteppedEnabled();
        int i10 = zIsDrawSteppedEnabled ? 4 : 2;
        Transformer transformer = this.f67496d.getTransformer(iLineDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = iLineDataSet.isDashedLineEnabled() ? this.f67499g : canvas;
        this.mXBounds.set(this.f67496d, iLineDataSet);
        if (iLineDataSet.isDrawFilledEnabled() && entryCount > 0) {
            drawLinearFill(canvas, iLineDataSet, transformer, this.mXBounds);
        }
        if (iLineDataSet.getColors().size() > 1) {
            int i11 = i10 * 2;
            if (this.f67503k.length <= i11) {
                this.f67503k = new float[i10 * 4];
            }
            int i12 = this.mXBounds.min;
            while (true) {
                BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                if (i12 > xBounds.range + xBounds.min) {
                    break;
                }
                ?? entryForIndex = iLineDataSet.getEntryForIndex(i12);
                if (entryForIndex != 0) {
                    this.f67503k[0] = entryForIndex.getX();
                    this.f67503k[1] = entryForIndex.getY() * phaseY;
                    if (i12 < this.mXBounds.max) {
                        ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i12 + 1);
                        if (entryForIndex2 == 0) {
                            break;
                        }
                        if (zIsDrawSteppedEnabled) {
                            this.f67503k[2] = entryForIndex2.getX();
                            float[] fArr = this.f67503k;
                            float f10 = fArr[1];
                            fArr[3] = f10;
                            fArr[4] = fArr[2];
                            fArr[5] = f10;
                            fArr[6] = entryForIndex2.getX();
                            this.f67503k[7] = entryForIndex2.getY() * phaseY;
                        } else {
                            this.f67503k[2] = entryForIndex2.getX();
                            this.f67503k[3] = entryForIndex2.getY() * phaseY;
                        }
                    } else {
                        float[] fArr2 = this.f67503k;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    transformer.pointValuesToPixel(this.f67503k);
                    if (!this.mViewPortHandler.isInBoundsRight(this.f67503k[0])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.f67503k[2]) && (this.mViewPortHandler.isInBoundsTop(this.f67503k[1]) || this.mViewPortHandler.isInBoundsBottom(this.f67503k[3]))) {
                        this.mRenderPaint.setColor(iLineDataSet.getColor(i12));
                        canvas2.drawLines(this.f67503k, 0, i11, this.mRenderPaint);
                    }
                }
                i12++;
            }
        } else {
            int i13 = entryCount * i10;
            if (this.f67503k.length < Math.max(i13, i10) * 2) {
                this.f67503k = new float[Math.max(i13, i10) * 4];
            }
            if (iLineDataSet.getEntryForIndex(this.mXBounds.min) != 0) {
                int i14 = this.mXBounds.min;
                int i15 = 0;
                while (true) {
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                    if (i14 > xBounds2.range + xBounds2.min) {
                        break;
                    }
                    ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i14 == 0 ? 0 : i14 - 1);
                    ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i14);
                    if (entryForIndex3 != 0 && entryForIndex4 != 0) {
                        int i16 = i15 + 1;
                        this.f67503k[i15] = entryForIndex3.getX();
                        int i17 = i16 + 1;
                        this.f67503k[i16] = entryForIndex3.getY() * phaseY;
                        if (zIsDrawSteppedEnabled) {
                            int i18 = i17 + 1;
                            this.f67503k[i17] = entryForIndex4.getX();
                            int i19 = i18 + 1;
                            this.f67503k[i18] = entryForIndex3.getY() * phaseY;
                            int i20 = i19 + 1;
                            this.f67503k[i19] = entryForIndex4.getX();
                            i17 = i20 + 1;
                            this.f67503k[i20] = entryForIndex3.getY() * phaseY;
                        }
                        int i21 = i17 + 1;
                        this.f67503k[i17] = entryForIndex4.getX();
                        this.f67503k[i21] = entryForIndex4.getY() * phaseY;
                        i15 = i21 + 1;
                    }
                    i14++;
                }
                if (i15 > 0) {
                    transformer.pointValuesToPixel(this.f67503k);
                    i();
                    canvas2.drawLines(this.f67503k, 0, Math.max((this.mXBounds.range + 1) * i10, i10) * 2, this.mRenderPaint);
                }
            }
        }
        this.mRenderPaint.setPathEffect(null);
    }

    public void drawLinearFill(Canvas canvas, ILineDataSet iLineDataSet, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        int i10;
        int i11;
        int i12 = 0;
        if (PatchProxy.proxy(new Object[]{canvas, iLineDataSet, transformer, xBounds}, this, changeQuickRedirect, false, bb.c.d.Xn, new Class[]{Canvas.class, ILineDataSet.class, Transformer.class, BarLineScatterCandleBubbleRenderer.XBounds.class}, Void.TYPE).isSupported) {
            return;
        }
        Path path = this.f67504l;
        int i13 = xBounds.min;
        int i14 = xBounds.range + i13;
        do {
            i10 = (i12 * 128) + i13;
            i11 = i10 + 128;
            if (i11 > i14) {
                i11 = i14;
            }
            if (i10 <= i11) {
                generateFilledPath(iLineDataSet, i10, i11, path);
                transformer.pathValueToPixel(path);
                try {
                    drawFilledPath(canvas, path, h());
                } catch (Throwable unused) {
                }
            }
            i12++;
        } while (i10 <= i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        int i10 = 0;
        if (!PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.ao, new Class[]{Canvas.class}, Void.TYPE).isSupported && isDrawingValuesAllowed(this.f67496d)) {
            List<T> dataSets = this.f67496d.getLineData().getDataSets();
            int i11 = 0;
            while (i11 < dataSets.size()) {
                ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(i11);
                if (shouldDrawValues(iLineDataSet)) {
                    applyValueTextStyle(iLineDataSet);
                    Transformer transformer = this.f67496d.getTransformer(iLineDataSet.getAxisDependency());
                    int circleRadius = (int) (iLineDataSet.getCircleRadius() * 1.75f);
                    if (!iLineDataSet.isDrawCirclesEnabled()) {
                        circleRadius /= 2;
                    }
                    int i12 = circleRadius;
                    this.mXBounds.set(this.f67496d, iLineDataSet);
                    float phaseX = this.mAnimator.getPhaseX();
                    float phaseY = this.mAnimator.getPhaseY();
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                    float[] fArrGenerateTransformedValuesLine = transformer.generateTransformedValuesLine(iLineDataSet, phaseX, phaseY, xBounds.min, xBounds.max);
                    MPPointF mPPointF = MPPointF.getInstance(iLineDataSet.getIconsOffset());
                    mPPointF.f43143x = Utils.convertDpToPixel(mPPointF.f43143x);
                    mPPointF.f43144y = Utils.convertDpToPixel(mPPointF.f43144y);
                    int i13 = i10;
                    while (i13 < fArrGenerateTransformedValuesLine.length) {
                        float f10 = fArrGenerateTransformedValuesLine[i13];
                        float f11 = fArrGenerateTransformedValuesLine[i13 + 1];
                        if (!this.mViewPortHandler.isInBoundsRight(f10)) {
                            break;
                        }
                        if (this.mViewPortHandler.isInBoundsLeft(f10) && this.mViewPortHandler.isInBoundsY(f11)) {
                            int i14 = i13 / 2;
                            ?? entryForIndex = iLineDataSet.getEntryForIndex(this.mXBounds.min + i14);
                            if (iLineDataSet.isDrawValuesEnabled()) {
                                drawValue(canvas, iLineDataSet.getValueFormatter(), entryForIndex.getY(), entryForIndex, i11, f10, f11 - i12, iLineDataSet.getValueTextColor(i14));
                            }
                            if (entryForIndex.getIcon() != null && iLineDataSet.isDrawIconsEnabled()) {
                                Drawable icon = entryForIndex.getIcon();
                                Utils.drawImage(canvas, icon, (int) (f10 + mPPointF.f43143x), (int) (f11 + mPPointF.f43144y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                        } else {
                            i13 = i13;
                            mPPointF = mPPointF;
                        }
                        i13 += 2;
                        mPPointF = mPPointF;
                    }
                    MPPointF.recycleInstance(mPPointF);
                }
                i11++;
                i10 = 0;
            }
        }
    }

    public Bitmap.Config getBitmapConfig() {
        return this.f67500h;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public void j(float f10, int i10, int i11) {
        this.f67493a = f10;
        this.f67494b = i10;
        this.f67495c = i11;
    }

    public void releaseBitmap() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.fo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Canvas canvas = this.f67499g;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.f67499g = null;
        }
        WeakReference<Bitmap> weakReference = this.f67498f;
        if (weakReference != null) {
            weakReference.get().recycle();
            this.f67498f.clear();
            this.f67498f = null;
        }
    }

    public void setBitmapConfig(Bitmap.Config config) {
        if (PatchProxy.proxy(new Object[]{config}, this, changeQuickRedirect, false, bb.c.d.eo, new Class[]{Bitmap.Config.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67500h = config;
        releaseBitmap();
    }
}
