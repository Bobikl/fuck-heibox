package com.github.mikephil.charting.charts;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.animation.EasingFunction;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.DefaultValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.ChartHighlighter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.IHighlighter;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.LegendRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.max.mediaselector.lib.config.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"NewApi"})
public abstract class Chart<T extends ChartData<? extends IDataSet<? extends Entry>>> extends ViewGroup implements ChartInterface {
    public static final String LOG_TAG = "MPAndroidChart";
    public static final int PAINT_CENTER_TEXT = 14;
    public static final int PAINT_DESCRIPTION = 11;
    public static final int PAINT_GRID_BACKGROUND = 4;
    public static final int PAINT_HOLE = 13;
    public static final int PAINT_INFO = 7;
    public static final int PAINT_LEGEND_LABEL = 18;
    protected ChartAnimator mAnimator;
    protected ChartTouchListener mChartTouchListener;
    protected T mData;
    protected DefaultValueFormatter mDefaultValueFormatter;
    protected Paint mDescPaint;
    protected Description mDescription;
    private boolean mDragDecelerationEnabled;
    private float mDragDecelerationFrictionCoef;
    protected boolean mDrawMarkers;
    private float mExtraBottomOffset;
    private float mExtraLeftOffset;
    private float mExtraRightOffset;
    private float mExtraTopOffset;
    private OnChartGestureListener mGestureListener;
    protected boolean mHighLightPerTapEnabled;
    protected IHighlighter mHighlighter;
    protected Highlight[] mIndicesToHighlight;
    protected Paint mInfoPaint;
    protected ArrayList<Runnable> mJobs;
    protected Legend mLegend;
    protected LegendRenderer mLegendRenderer;
    protected boolean mLogEnabled;
    protected IMarker mMarker;
    protected float mMaxHighlightDistance;
    private String mNoDataText;
    private boolean mOffsetsCalculated;
    protected DataRenderer mRenderer;
    protected OnChartValueSelectedListener mSelectionListener;
    protected boolean mTouchEnabled;
    private boolean mUnbind;
    protected ViewPortHandler mViewPortHandler;
    protected XAxis mXAxis;

    /* JADX INFO: renamed from: com.github.mikephil.charting.charts.Chart$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$CompressFormat;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            $SwitchMap$android$graphics$Bitmap$CompressFormat = iArr;
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Chart(Context context) {
        super(context);
        this.mLogEnabled = false;
        this.mData = null;
        this.mHighLightPerTapEnabled = true;
        this.mDragDecelerationEnabled = true;
        this.mDragDecelerationFrictionCoef = 0.9f;
        this.mDefaultValueFormatter = new DefaultValueFormatter(0);
        this.mTouchEnabled = true;
        this.mNoDataText = "No chart data available.";
        this.mViewPortHandler = new ViewPortHandler();
        this.mExtraTopOffset = 0.0f;
        this.mExtraRightOffset = 0.0f;
        this.mExtraBottomOffset = 0.0f;
        this.mExtraLeftOffset = 0.0f;
        this.mOffsetsCalculated = false;
        this.mMaxHighlightDistance = 0.0f;
        this.mDrawMarkers = true;
        this.mJobs = new ArrayList<>();
        this.mUnbind = false;
        init();
    }

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLogEnabled = false;
        this.mData = null;
        this.mHighLightPerTapEnabled = true;
        this.mDragDecelerationEnabled = true;
        this.mDragDecelerationFrictionCoef = 0.9f;
        this.mDefaultValueFormatter = new DefaultValueFormatter(0);
        this.mTouchEnabled = true;
        this.mNoDataText = "No chart data available.";
        this.mViewPortHandler = new ViewPortHandler();
        this.mExtraTopOffset = 0.0f;
        this.mExtraRightOffset = 0.0f;
        this.mExtraBottomOffset = 0.0f;
        this.mExtraLeftOffset = 0.0f;
        this.mOffsetsCalculated = false;
        this.mMaxHighlightDistance = 0.0f;
        this.mDrawMarkers = true;
        this.mJobs = new ArrayList<>();
        this.mUnbind = false;
        init();
    }

    public Chart(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mLogEnabled = false;
        this.mData = null;
        this.mHighLightPerTapEnabled = true;
        this.mDragDecelerationEnabled = true;
        this.mDragDecelerationFrictionCoef = 0.9f;
        this.mDefaultValueFormatter = new DefaultValueFormatter(0);
        this.mTouchEnabled = true;
        this.mNoDataText = "No chart data available.";
        this.mViewPortHandler = new ViewPortHandler();
        this.mExtraTopOffset = 0.0f;
        this.mExtraRightOffset = 0.0f;
        this.mExtraBottomOffset = 0.0f;
        this.mExtraLeftOffset = 0.0f;
        this.mOffsetsCalculated = false;
        this.mMaxHighlightDistance = 0.0f;
        this.mDrawMarkers = true;
        this.mJobs = new ArrayList<>();
        this.mUnbind = false;
        init();
    }

    private void unbindDrawables(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i10 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                unbindDrawables(viewGroup.getChildAt(i10));
                i10++;
            }
        }
    }

    public void addViewportJob(Runnable runnable) {
        if (this.mViewPortHandler.hasChartDimens()) {
            post(runnable);
        } else {
            this.mJobs.add(runnable);
        }
    }

    public void animateX(int i10) {
        this.mAnimator.animateX(i10);
    }

    public void animateX(int i10, Easing.EasingOption easingOption) {
        this.mAnimator.animateX(i10, easingOption);
    }

    public void animateX(int i10, EasingFunction easingFunction) {
        this.mAnimator.animateX(i10, easingFunction);
    }

    public void animateXY(int i10, int i11) {
        this.mAnimator.animateXY(i10, i11);
    }

    public void animateXY(int i10, int i11, Easing.EasingOption easingOption, Easing.EasingOption easingOption2) {
        this.mAnimator.animateXY(i10, i11, easingOption, easingOption2);
    }

    public void animateXY(int i10, int i11, EasingFunction easingFunction, EasingFunction easingFunction2) {
        this.mAnimator.animateXY(i10, i11, easingFunction, easingFunction2);
    }

    public void animateY(int i10) {
        this.mAnimator.animateY(i10);
    }

    public void animateY(int i10, Easing.EasingOption easingOption) {
        this.mAnimator.animateY(i10, easingOption);
    }

    public void animateY(int i10, EasingFunction easingFunction) {
        this.mAnimator.animateY(i10, easingFunction);
    }

    protected abstract void calcMinMax();

    protected abstract void calculateOffsets();

    public void clear() {
        this.mData = null;
        this.mOffsetsCalculated = false;
        this.mIndicesToHighlight = null;
        invalidate();
    }

    public void clearAllViewportJobs() {
        this.mJobs.clear();
    }

    public void clearValues() {
        this.mData.clearValues();
        invalidate();
    }

    public void disableScroll() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    protected void drawDescription(Canvas canvas) {
        float height;
        float width;
        Description description = this.mDescription;
        if (description == null || !description.isEnabled()) {
            return;
        }
        MPPointF position = this.mDescription.getPosition();
        this.mDescPaint.setTypeface(this.mDescription.getTypeface());
        this.mDescPaint.setTextSize(this.mDescription.getTextSize());
        this.mDescPaint.setColor(this.mDescription.getTextColor());
        this.mDescPaint.setTextAlign(this.mDescription.getTextAlign());
        if (position == null) {
            width = (getWidth() - this.mViewPortHandler.offsetRight()) - this.mDescription.getXOffset();
            height = (getHeight() - this.mViewPortHandler.offsetBottom()) - this.mDescription.getYOffset();
        } else {
            float f10 = position.f43143x;
            height = position.f43144y;
            width = f10;
        }
        canvas.drawText(this.mDescription.getText(), width, height, this.mDescPaint);
    }

    protected void drawMarkers(Canvas canvas) {
        if (this.mMarker == null || !isDrawMarkersEnabled() || !valuesToHighlight()) {
            return;
        }
        int i10 = 0;
        while (true) {
            Highlight[] highlightArr = this.mIndicesToHighlight;
            if (i10 >= highlightArr.length) {
                return;
            }
            Highlight highlight = highlightArr[i10];
            IDataSet dataSetByIndex = this.mData.getDataSetByIndex(highlight.getDataSetIndex());
            Entry entryForHighlight = this.mData.getEntryForHighlight(this.mIndicesToHighlight[i10]);
            int entryIndex = dataSetByIndex.getEntryIndex(entryForHighlight);
            if (entryForHighlight != null && entryIndex <= dataSetByIndex.getEntryCount() * this.mAnimator.getPhaseX()) {
                float[] markerPosition = getMarkerPosition(highlight);
                if (this.mViewPortHandler.isInBounds(markerPosition[0], markerPosition[1])) {
                    this.mMarker.refreshContent(entryForHighlight, highlight);
                    this.mMarker.draw(canvas, markerPosition[0], markerPosition[1]);
                }
            }
            i10++;
        }
    }

    public void enableScroll() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public ChartAnimator getAnimator() {
        return this.mAnimator;
    }

    public MPPointF getCenter() {
        return MPPointF.getInstance(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public MPPointF getCenterOfView() {
        return getCenter();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public MPPointF getCenterOffsets() {
        return this.mViewPortHandler.getContentCenter();
    }

    public Bitmap getChartBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public RectF getContentRect() {
        return this.mViewPortHandler.getContentRect();
    }

    public T getData() {
        return this.mData;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public IValueFormatter getDefaultValueFormatter() {
        return this.mDefaultValueFormatter;
    }

    public Description getDescription() {
        return this.mDescription;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.mDragDecelerationFrictionCoef;
    }

    public float getExtraBottomOffset() {
        return this.mExtraBottomOffset;
    }

    public float getExtraLeftOffset() {
        return this.mExtraLeftOffset;
    }

    public float getExtraRightOffset() {
        return this.mExtraRightOffset;
    }

    public float getExtraTopOffset() {
        return this.mExtraTopOffset;
    }

    public Highlight getHighlightByTouchPoint(float f10, float f11) {
        if (this.mData != null) {
            return getHighlighter().getHighlight(f10, f11);
        }
        Log.e(LOG_TAG, "Can't select by touch. No data set.");
        return null;
    }

    public Highlight[] getHighlighted() {
        return this.mIndicesToHighlight;
    }

    public IHighlighter getHighlighter() {
        return this.mHighlighter;
    }

    public ArrayList<Runnable> getJobs() {
        return this.mJobs;
    }

    public Legend getLegend() {
        return this.mLegend;
    }

    public LegendRenderer getLegendRenderer() {
        return this.mLegendRenderer;
    }

    public IMarker getMarker() {
        return this.mMarker;
    }

    protected float[] getMarkerPosition(Highlight highlight) {
        return new float[]{highlight.getDrawX(), highlight.getDrawY()};
    }

    @Deprecated
    public IMarker getMarkerView() {
        return getMarker();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getMaxHighlightDistance() {
        return this.mMaxHighlightDistance;
    }

    public OnChartGestureListener getOnChartGestureListener() {
        return this.mGestureListener;
    }

    public ChartTouchListener getOnTouchListener() {
        return this.mChartTouchListener;
    }

    public Paint getPaint(int i10) {
        if (i10 == 7) {
            return this.mInfoPaint;
        }
        if (i10 != 11) {
            return null;
        }
        return this.mDescPaint;
    }

    public DataRenderer getRenderer() {
        return this.mRenderer;
    }

    public ViewPortHandler getViewPortHandler() {
        return this.mViewPortHandler;
    }

    public XAxis getXAxis() {
        return this.mXAxis;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getXChartMax() {
        return this.mXAxis.mAxisMaximum;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getXChartMin() {
        return this.mXAxis.mAxisMinimum;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getXRange() {
        return this.mXAxis.mAxisRange;
    }

    public float getYMax() {
        return this.mData.getYMax();
    }

    public float getYMin() {
        return this.mData.getYMin();
    }

    public void highlightValue(float f10, float f11, int i10) {
        highlightValue(f10, f11, i10, true);
    }

    public void highlightValue(float f10, float f11, int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.mData.getDataSetCount()) {
            highlightValue((Highlight) null, z10);
        } else {
            highlightValue(new Highlight(f10, f11, i10), z10);
        }
    }

    public void highlightValue(float f10, int i10) {
        highlightValue(f10, i10, true);
    }

    public void highlightValue(float f10, int i10, boolean z10) {
        highlightValue(f10, Float.NaN, i10, z10);
    }

    public void highlightValue(Highlight highlight) {
        highlightValue(highlight, false);
    }

    public void highlightValue(Highlight highlight, boolean z10) {
        Entry entry = null;
        if (highlight == null) {
            this.mIndicesToHighlight = null;
        } else {
            if (this.mLogEnabled) {
                Log.i(LOG_TAG, "Highlighted: " + highlight.toString());
            }
            Entry entryForHighlight = this.mData.getEntryForHighlight(highlight);
            if (entryForHighlight == null) {
                this.mIndicesToHighlight = null;
                highlight = null;
            } else {
                this.mIndicesToHighlight = new Highlight[]{highlight};
            }
            entry = entryForHighlight;
        }
        setLastHighlighted(this.mIndicesToHighlight);
        if (z10 && this.mSelectionListener != null) {
            if (valuesToHighlight()) {
                this.mSelectionListener.onValueSelected(entry, highlight);
            } else {
                this.mSelectionListener.onNothingSelected();
            }
        }
        invalidate();
    }

    public void highlightValues(Highlight[] highlightArr) {
        this.mIndicesToHighlight = highlightArr;
        setLastHighlighted(highlightArr);
        invalidate();
    }

    protected void init() {
        setWillNotDraw(false);
        this.mAnimator = new ChartAnimator(new ValueAnimator.AnimatorUpdateListener() { // from class: com.github.mikephil.charting.charts.Chart.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Chart.this.postInvalidate();
            }
        });
        Utils.init(getContext());
        this.mMaxHighlightDistance = Utils.convertDpToPixel(500.0f);
        this.mDescription = new Description();
        Legend legend = new Legend();
        this.mLegend = legend;
        this.mLegendRenderer = new LegendRenderer(this.mViewPortHandler, legend);
        this.mXAxis = new XAxis();
        this.mDescPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.mInfoPaint = paint;
        paint.setColor(Color.rgb(247, 189, 51));
        this.mInfoPaint.setTextAlign(Paint.Align.CENTER);
        this.mInfoPaint.setTextSize(Utils.convertDpToPixel(12.0f));
        if (this.mLogEnabled) {
            Log.i("", "Chart.init()");
        }
    }

    public boolean isDragDecelerationEnabled() {
        return this.mDragDecelerationEnabled;
    }

    @Deprecated
    public boolean isDrawMarkerViewsEnabled() {
        return isDrawMarkersEnabled();
    }

    public boolean isDrawMarkersEnabled() {
        return this.mDrawMarkers;
    }

    public boolean isEmpty() {
        T t10 = this.mData;
        return t10 == null || t10.getEntryCount() <= 0;
    }

    public boolean isHighlightPerTapEnabled() {
        return this.mHighLightPerTapEnabled;
    }

    public boolean isLogEnabled() {
        return this.mLogEnabled;
    }

    public abstract void notifyDataSetChanged();

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mUnbind) {
            unbindDrawables(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mData == null) {
            if (!TextUtils.isEmpty(this.mNoDataText)) {
                MPPointF center = getCenter();
                canvas.drawText(this.mNoDataText, center.f43143x, center.f43144y, this.mInfoPaint);
                return;
            }
            return;
        }
        if (this.mOffsetsCalculated) {
            return;
        }
        calculateOffsets();
        this.mOffsetsCalculated = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            getChildAt(i14).layout(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int iConvertDpToPixel = (int) Utils.convertDpToPixel(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(iConvertDpToPixel, i10)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(iConvertDpToPixel, i11)));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (this.mLogEnabled) {
            Log.i(LOG_TAG, "OnSizeChanged()");
        }
        if (i10 > 0 && i11 > 0 && i10 < 10000 && i11 < 10000) {
            this.mViewPortHandler.setChartDimens(i10, i11);
            if (this.mLogEnabled) {
                Log.i(LOG_TAG, "Setting chart dimens, width: " + i10 + ", height: " + i11);
            }
            Iterator<Runnable> it = this.mJobs.iterator();
            while (it.hasNext()) {
                post(it.next());
            }
            this.mJobs.clear();
        }
        notifyDataSetChanged();
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public void removeViewportJob(Runnable runnable) {
        this.mJobs.remove(runnable);
    }

    public boolean saveToGallery(String str, int i10) {
        return saveToGallery(str, "", "MPAndroidChart-Library Save", Bitmap.CompressFormat.JPEG, i10);
    }

    public boolean saveToGallery(String str, String str2, String str3, Bitmap.CompressFormat compressFormat, int i10) {
        if (i10 < 0 || i10 > 100) {
            i10 = 50;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM/" + str2);
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        int i11 = AnonymousClass2.$SwitchMap$android$graphics$Bitmap$CompressFormat[compressFormat.ordinal()];
        String str4 = f.D;
        if (i11 != 1) {
            if (i11 != 2) {
                if (!str.endsWith(".jpg") && !str.endsWith(f.f75139r)) {
                    str = str + ".jpg";
                }
                str4 = "image/jpeg";
            } else {
                if (!str.endsWith(f.f75142u)) {
                    str = str + f.f75142u;
                }
                str4 = "image/webp";
            }
        } else if (!str.endsWith(f.f75141t)) {
            str = str + f.f75141t;
        }
        String str5 = file.getAbsolutePath() + "/" + str;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str5);
            getChartBitmap().compress(compressFormat, i10, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            long length = new File(str5).length();
            ContentValues contentValues = new ContentValues(8);
            contentValues.put("title", str);
            contentValues.put("_display_name", str);
            contentValues.put("date_added", Long.valueOf(jCurrentTimeMillis));
            contentValues.put("mime_type", str4);
            contentValues.put("description", str3);
            contentValues.put("orientation", (Integer) 0);
            contentValues.put("_data", str5);
            contentValues.put("_size", Long.valueOf(length));
            return getContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) != null;
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public boolean saveToPath(String str, String str2) {
        Bitmap chartBitmap = getChartBitmap();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(Environment.getExternalStorageDirectory().getPath() + str2 + "/" + str + f.f75141t);
            chartBitmap.compress(Bitmap.CompressFormat.PNG, 40, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public void setData(T t10) {
        this.mData = t10;
        this.mOffsetsCalculated = false;
        if (t10 == null) {
            return;
        }
        setupDefaultFormatter(t10.getYMin(), t10.getYMax());
        for (IDataSet iDataSet : this.mData.getDataSets()) {
            if (iDataSet.needsFormatter() || iDataSet.getValueFormatter() == this.mDefaultValueFormatter) {
                iDataSet.setValueFormatter(this.mDefaultValueFormatter);
            }
        }
        notifyDataSetChanged();
        if (this.mLogEnabled) {
            Log.i(LOG_TAG, "Data is set.");
        }
    }

    public void setDescription(Description description) {
        this.mDescription = description;
    }

    public void setDragDecelerationEnabled(boolean z10) {
        this.mDragDecelerationEnabled = z10;
    }

    public void setDragDecelerationFrictionCoef(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 >= 1.0f) {
            f10 = 0.999f;
        }
        this.mDragDecelerationFrictionCoef = f10;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z10) {
        setDrawMarkers(z10);
    }

    public void setDrawMarkers(boolean z10) {
        this.mDrawMarkers = z10;
    }

    public void setExtraBottomOffset(float f10) {
        this.mExtraBottomOffset = Utils.convertDpToPixel(f10);
    }

    public void setExtraLeftOffset(float f10) {
        this.mExtraLeftOffset = Utils.convertDpToPixel(f10);
    }

    public void setExtraOffsets(float f10, float f11, float f12, float f13) {
        setExtraLeftOffset(f10);
        setExtraTopOffset(f11);
        setExtraRightOffset(f12);
        setExtraBottomOffset(f13);
    }

    public void setExtraRightOffset(float f10) {
        this.mExtraRightOffset = Utils.convertDpToPixel(f10);
    }

    public void setExtraTopOffset(float f10) {
        this.mExtraTopOffset = Utils.convertDpToPixel(f10);
    }

    public void setHardwareAccelerationEnabled(boolean z10) {
        if (z10) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z10) {
        this.mHighLightPerTapEnabled = z10;
    }

    public void setHighlighter(ChartHighlighter chartHighlighter) {
        this.mHighlighter = chartHighlighter;
    }

    protected void setLastHighlighted(Highlight[] highlightArr) {
        Highlight highlight;
        if (highlightArr == null || highlightArr.length <= 0 || (highlight = highlightArr[0]) == null) {
            this.mChartTouchListener.setLastHighlighted(null);
        } else {
            this.mChartTouchListener.setLastHighlighted(highlight);
        }
    }

    public void setLogEnabled(boolean z10) {
        this.mLogEnabled = z10;
    }

    public void setMarker(IMarker iMarker) {
        this.mMarker = iMarker;
    }

    @Deprecated
    public void setMarkerView(IMarker iMarker) {
        setMarker(iMarker);
    }

    public void setMaxHighlightDistance(float f10) {
        this.mMaxHighlightDistance = Utils.convertDpToPixel(f10);
    }

    public void setNoDataText(String str) {
        this.mNoDataText = str;
    }

    public void setNoDataTextColor(int i10) {
        this.mInfoPaint.setColor(i10);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.mInfoPaint.setTypeface(typeface);
    }

    public void setOnChartGestureListener(OnChartGestureListener onChartGestureListener) {
        this.mGestureListener = onChartGestureListener;
    }

    public void setOnChartValueSelectedListener(OnChartValueSelectedListener onChartValueSelectedListener) {
        this.mSelectionListener = onChartValueSelectedListener;
    }

    public void setOnTouchListener(ChartTouchListener chartTouchListener) {
        this.mChartTouchListener = chartTouchListener;
    }

    public void setPaint(Paint paint, int i10) {
        if (i10 == 7) {
            this.mInfoPaint = paint;
        } else {
            if (i10 != 11) {
                return;
            }
            this.mDescPaint = paint;
        }
    }

    public void setRenderer(DataRenderer dataRenderer) {
        if (dataRenderer != null) {
            this.mRenderer = dataRenderer;
        }
    }

    public void setTouchEnabled(boolean z10) {
        this.mTouchEnabled = z10;
    }

    public void setUnbindEnabled(boolean z10) {
        this.mUnbind = z10;
    }

    protected void setupDefaultFormatter(float f10, float f11) {
        T t10 = this.mData;
        this.mDefaultValueFormatter.setup(Utils.getDecimals((t10 == null || t10.getEntryCount() < 2) ? Math.max(Math.abs(f10), Math.abs(f11)) : Math.abs(f11 - f10)));
    }

    public boolean valuesToHighlight() {
        Highlight[] highlightArr = this.mIndicesToHighlight;
        return (highlightArr == null || highlightArr.length <= 0 || highlightArr[0] == null) ? false : true;
    }
}
