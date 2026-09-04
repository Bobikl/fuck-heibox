package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Legend extends ComponentBase {
    private List<Boolean> mCalculatedLabelBreakPoints;
    private List<FSize> mCalculatedLabelSizes;
    private List<FSize> mCalculatedLineSizes;
    private LegendDirection mDirection;
    private boolean mDrawInside;
    private LegendEntry[] mEntries;
    private LegendEntry[] mExtraEntries;
    private DashPathEffect mFormLineDashEffect;
    private float mFormLineWidth;
    private float mFormSize;
    private float mFormToTextSpace;
    private LegendHorizontalAlignment mHorizontalAlignment;
    private boolean mIsLegendCustom;
    private float mMaxSizePercent;
    public float mNeededHeight;
    public float mNeededWidth;
    private LegendOrientation mOrientation;
    private LegendForm mShape;
    private float mStackSpace;
    public float mTextHeightMax;
    public float mTextWidthMax;
    private LegendVerticalAlignment mVerticalAlignment;
    private boolean mWordWrapEnabled;
    private float mXEntrySpace;
    private float mYEntrySpace;

    /* JADX INFO: renamed from: com.github.mikephil.charting.components.Legend$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition;

        static {
            int[] iArr = new int[LegendOrientation.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = iArr;
            try {
                iArr[LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[LegendPosition.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition = iArr2;
            try {
                iArr2[LegendPosition.LEFT_OF_CHART.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[LegendPosition.LEFT_OF_CHART_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[LegendPosition.LEFT_OF_CHART_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[LegendPosition.RIGHT_OF_CHART.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[LegendPosition.RIGHT_OF_CHART_INSIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[LegendPosition.RIGHT_OF_CHART_CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[LegendPosition.ABOVE_CHART_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[LegendPosition.ABOVE_CHART_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[LegendPosition.ABOVE_CHART_RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[LegendPosition.BELOW_CHART_LEFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[LegendPosition.BELOW_CHART_CENTER.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[LegendPosition.BELOW_CHART_RIGHT.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[LegendPosition.PIECHART_CENTER.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public enum LegendForm {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    public enum LegendHorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum LegendOrientation {
        HORIZONTAL,
        VERTICAL
    }

    @Deprecated
    public enum LegendPosition {
        RIGHT_OF_CHART,
        RIGHT_OF_CHART_CENTER,
        RIGHT_OF_CHART_INSIDE,
        LEFT_OF_CHART,
        LEFT_OF_CHART_CENTER,
        LEFT_OF_CHART_INSIDE,
        BELOW_CHART_LEFT,
        BELOW_CHART_RIGHT,
        BELOW_CHART_CENTER,
        ABOVE_CHART_LEFT,
        ABOVE_CHART_RIGHT,
        ABOVE_CHART_CENTER,
        PIECHART_CENTER
    }

    public enum LegendVerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }

    public Legend() {
        this.mEntries = new LegendEntry[0];
        this.mIsLegendCustom = false;
        this.mHorizontalAlignment = LegendHorizontalAlignment.LEFT;
        this.mVerticalAlignment = LegendVerticalAlignment.BOTTOM;
        this.mOrientation = LegendOrientation.HORIZONTAL;
        this.mDrawInside = false;
        this.mDirection = LegendDirection.LEFT_TO_RIGHT;
        this.mShape = LegendForm.SQUARE;
        this.mFormSize = 8.0f;
        this.mFormLineWidth = 3.0f;
        this.mFormLineDashEffect = null;
        this.mXEntrySpace = 6.0f;
        this.mYEntrySpace = 0.0f;
        this.mFormToTextSpace = 5.0f;
        this.mStackSpace = 3.0f;
        this.mMaxSizePercent = 0.95f;
        this.mNeededWidth = 0.0f;
        this.mNeededHeight = 0.0f;
        this.mTextHeightMax = 0.0f;
        this.mTextWidthMax = 0.0f;
        this.mWordWrapEnabled = false;
        this.mCalculatedLabelSizes = new ArrayList(16);
        this.mCalculatedLabelBreakPoints = new ArrayList(16);
        this.mCalculatedLineSizes = new ArrayList(16);
        this.mTextSize = Utils.convertDpToPixel(10.0f);
        this.mXOffset = Utils.convertDpToPixel(5.0f);
        this.mYOffset = Utils.convertDpToPixel(3.0f);
    }

    @Deprecated
    public Legend(List<Integer> list, List<String> list2) {
        this(Utils.convertIntegers(list), Utils.convertStrings(list2));
    }

    @Deprecated
    public Legend(int[] iArr, String[] strArr) {
        this();
        if (iArr == null || strArr == null) {
            throw new IllegalArgumentException("colors array or labels array is NULL");
        }
        if (iArr.length != strArr.length) {
            throw new IllegalArgumentException("colors array and labels array need to be of same size");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < Math.min(iArr.length, strArr.length); i10++) {
            LegendEntry legendEntry = new LegendEntry();
            int i11 = iArr[i10];
            legendEntry.formColor = i11;
            legendEntry.label = strArr[i10];
            if (i11 == 1122868) {
                legendEntry.form = LegendForm.NONE;
            } else if (i11 == 1122867 || i11 == 0) {
                legendEntry.form = LegendForm.EMPTY;
            }
            arrayList.add(legendEntry);
        }
        this.mEntries = (LegendEntry[]) arrayList.toArray(new LegendEntry[arrayList.size()]);
    }

    public Legend(LegendEntry[] legendEntryArr) {
        this();
        if (legendEntryArr == null) {
            throw new IllegalArgumentException("entries array is NULL");
        }
        this.mEntries = legendEntryArr;
    }

    public void calculateDimensions(Paint paint, ViewPortHandler viewPortHandler) {
        float f10;
        float f11;
        float f12;
        float fConvertDpToPixel = Utils.convertDpToPixel(this.mFormSize);
        float fConvertDpToPixel2 = Utils.convertDpToPixel(this.mStackSpace);
        float fConvertDpToPixel3 = Utils.convertDpToPixel(this.mFormToTextSpace);
        float fConvertDpToPixel4 = Utils.convertDpToPixel(this.mXEntrySpace);
        float fConvertDpToPixel5 = Utils.convertDpToPixel(this.mYEntrySpace);
        boolean z10 = this.mWordWrapEnabled;
        LegendEntry[] legendEntryArr = this.mEntries;
        int length = legendEntryArr.length;
        this.mTextWidthMax = getMaximumEntryWidth(paint);
        this.mTextHeightMax = getMaximumEntryHeight(paint);
        int i10 = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[this.mOrientation.ordinal()];
        if (i10 == 1) {
            float lineHeight = Utils.getLineHeight(paint);
            float fMax = 0.0f;
            float f13 = 0.0f;
            float fCalcTextWidth = 0.0f;
            boolean z11 = false;
            for (int i11 = 0; i11 < length; i11++) {
                LegendEntry legendEntry = legendEntryArr[i11];
                boolean z12 = legendEntry.form != LegendForm.NONE;
                float fConvertDpToPixel6 = Float.isNaN(legendEntry.formSize) ? fConvertDpToPixel : Utils.convertDpToPixel(legendEntry.formSize);
                String str = legendEntry.label;
                if (!z11) {
                    fCalcTextWidth = 0.0f;
                }
                if (z12) {
                    if (z11) {
                        fCalcTextWidth += fConvertDpToPixel2;
                    }
                    fCalcTextWidth += fConvertDpToPixel6;
                }
                if (str != null) {
                    if (z12 && !z11) {
                        fCalcTextWidth += fConvertDpToPixel3;
                    } else if (z11) {
                        fMax = Math.max(fMax, fCalcTextWidth);
                        f13 += lineHeight + fConvertDpToPixel5;
                        fCalcTextWidth = 0.0f;
                        z11 = false;
                    }
                    fCalcTextWidth += Utils.calcTextWidth(paint, str);
                    if (i11 < length - 1) {
                        f13 += lineHeight + fConvertDpToPixel5;
                    }
                } else {
                    fCalcTextWidth += fConvertDpToPixel6;
                    if (i11 < length - 1) {
                        fCalcTextWidth += fConvertDpToPixel2;
                    }
                    z11 = true;
                }
                fMax = Math.max(fMax, fCalcTextWidth);
            }
            this.mNeededWidth = fMax;
            this.mNeededHeight = f13;
        } else if (i10 == 2) {
            float lineHeight2 = Utils.getLineHeight(paint);
            float lineSpacing = Utils.getLineSpacing(paint) + fConvertDpToPixel5;
            float fContentWidth = viewPortHandler.contentWidth() * this.mMaxSizePercent;
            this.mCalculatedLabelBreakPoints.clear();
            this.mCalculatedLabelSizes.clear();
            this.mCalculatedLineSizes.clear();
            int i12 = 0;
            float fMax2 = 0.0f;
            int i13 = -1;
            float f14 = 0.0f;
            float f15 = 0.0f;
            while (i12 < length) {
                LegendEntry legendEntry2 = legendEntryArr[i12];
                float f16 = fConvertDpToPixel;
                float f17 = fConvertDpToPixel4;
                boolean z13 = legendEntry2.form != LegendForm.NONE;
                float fConvertDpToPixel7 = Float.isNaN(legendEntry2.formSize) ? f16 : Utils.convertDpToPixel(legendEntry2.formSize);
                String str2 = legendEntry2.label;
                LegendEntry[] legendEntryArr2 = legendEntryArr;
                float f18 = lineSpacing;
                this.mCalculatedLabelBreakPoints.add(Boolean.FALSE);
                float f19 = i13 == -1 ? 0.0f : f14 + fConvertDpToPixel2;
                if (str2 != null) {
                    f10 = fConvertDpToPixel2;
                    this.mCalculatedLabelSizes.add(Utils.calcTextSize(paint, str2));
                    f11 = f19 + (z13 ? fConvertDpToPixel3 + fConvertDpToPixel7 : 0.0f) + this.mCalculatedLabelSizes.get(i12).width;
                } else {
                    f10 = fConvertDpToPixel2;
                    float f20 = fConvertDpToPixel7;
                    this.mCalculatedLabelSizes.add(FSize.getInstance(0.0f, 0.0f));
                    f11 = f19 + (z13 ? f20 : 0.0f);
                    if (i13 == -1) {
                        i13 = i12;
                    }
                }
                if (str2 != null || i12 == length - 1) {
                    float f21 = f15;
                    float f22 = f21 == 0.0f ? 0.0f : f17;
                    if (!z10 || f21 == 0.0f || fContentWidth - f21 >= f22 + f11) {
                        f12 = f21 + f22 + f11;
                    } else {
                        this.mCalculatedLineSizes.add(FSize.getInstance(f21, lineHeight2));
                        float fMax3 = Math.max(fMax2, f21);
                        this.mCalculatedLabelBreakPoints.set(i13 > -1 ? i13 : i12, Boolean.TRUE);
                        fMax2 = fMax3;
                        f12 = f11;
                    }
                    if (i12 == length - 1) {
                        this.mCalculatedLineSizes.add(FSize.getInstance(f12, lineHeight2));
                        fMax2 = Math.max(fMax2, f12);
                    }
                    f15 = f12;
                }
                if (str2 != null) {
                    i13 = -1;
                }
                i12++;
                fConvertDpToPixel2 = f10;
                fConvertDpToPixel = f16;
                fConvertDpToPixel4 = f17;
                lineSpacing = f18;
                f14 = f11;
                legendEntryArr = legendEntryArr2;
            }
            float f23 = lineSpacing;
            this.mNeededWidth = fMax2;
            this.mNeededHeight = (lineHeight2 * this.mCalculatedLineSizes.size()) + (f23 * (this.mCalculatedLineSizes.size() == 0 ? 0 : this.mCalculatedLineSizes.size() - 1));
        }
        this.mNeededHeight += this.mYOffset;
        this.mNeededWidth += this.mXOffset;
    }

    public List<Boolean> getCalculatedLabelBreakPoints() {
        return this.mCalculatedLabelBreakPoints;
    }

    public List<FSize> getCalculatedLabelSizes() {
        return this.mCalculatedLabelSizes;
    }

    public List<FSize> getCalculatedLineSizes() {
        return this.mCalculatedLineSizes;
    }

    @Deprecated
    public int[] getColors() {
        int i10;
        int[] iArr = new int[this.mEntries.length];
        int i11 = 0;
        while (true) {
            LegendEntry[] legendEntryArr = this.mEntries;
            if (i11 >= legendEntryArr.length) {
                return iArr;
            }
            LegendEntry legendEntry = legendEntryArr[i11];
            LegendForm legendForm = legendEntry.form;
            if (legendForm == LegendForm.NONE) {
                i10 = ColorTemplate.COLOR_SKIP;
            } else {
                i10 = legendForm == LegendForm.EMPTY ? ColorTemplate.COLOR_NONE : legendEntry.formColor;
            }
            iArr[i11] = i10;
            i11++;
        }
    }

    public LegendDirection getDirection() {
        return this.mDirection;
    }

    public LegendEntry[] getEntries() {
        return this.mEntries;
    }

    @Deprecated
    public int[] getExtraColors() {
        int i10;
        int[] iArr = new int[this.mExtraEntries.length];
        int i11 = 0;
        while (true) {
            LegendEntry[] legendEntryArr = this.mExtraEntries;
            if (i11 >= legendEntryArr.length) {
                return iArr;
            }
            LegendEntry legendEntry = legendEntryArr[i11];
            LegendForm legendForm = legendEntry.form;
            if (legendForm == LegendForm.NONE) {
                i10 = ColorTemplate.COLOR_SKIP;
            } else {
                i10 = legendForm == LegendForm.EMPTY ? ColorTemplate.COLOR_NONE : legendEntry.formColor;
            }
            iArr[i11] = i10;
            i11++;
        }
    }

    public LegendEntry[] getExtraEntries() {
        return this.mExtraEntries;
    }

    @Deprecated
    public String[] getExtraLabels() {
        String[] strArr = new String[this.mExtraEntries.length];
        int i10 = 0;
        while (true) {
            LegendEntry[] legendEntryArr = this.mExtraEntries;
            if (i10 >= legendEntryArr.length) {
                return strArr;
            }
            strArr[i10] = legendEntryArr[i10].label;
            i10++;
        }
    }

    public LegendForm getForm() {
        return this.mShape;
    }

    public DashPathEffect getFormLineDashEffect() {
        return this.mFormLineDashEffect;
    }

    public float getFormLineWidth() {
        return this.mFormLineWidth;
    }

    public float getFormSize() {
        return this.mFormSize;
    }

    public float getFormToTextSpace() {
        return this.mFormToTextSpace;
    }

    public LegendHorizontalAlignment getHorizontalAlignment() {
        return this.mHorizontalAlignment;
    }

    @Deprecated
    public String[] getLabels() {
        String[] strArr = new String[this.mEntries.length];
        int i10 = 0;
        while (true) {
            LegendEntry[] legendEntryArr = this.mEntries;
            if (i10 >= legendEntryArr.length) {
                return strArr;
            }
            strArr[i10] = legendEntryArr[i10].label;
            i10++;
        }
    }

    public float getMaxSizePercent() {
        return this.mMaxSizePercent;
    }

    public float getMaximumEntryHeight(Paint paint) {
        float f10 = 0.0f;
        for (LegendEntry legendEntry : this.mEntries) {
            String str = legendEntry.label;
            if (str != null) {
                float fCalcTextHeight = Utils.calcTextHeight(paint, str);
                if (fCalcTextHeight > f10) {
                    f10 = fCalcTextHeight;
                }
            }
        }
        return f10;
    }

    public float getMaximumEntryWidth(Paint paint) {
        float fConvertDpToPixel = Utils.convertDpToPixel(this.mFormToTextSpace);
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (LegendEntry legendEntry : this.mEntries) {
            float fConvertDpToPixel2 = Utils.convertDpToPixel(Float.isNaN(legendEntry.formSize) ? this.mFormSize : legendEntry.formSize);
            if (fConvertDpToPixel2 > f11) {
                f11 = fConvertDpToPixel2;
            }
            String str = legendEntry.label;
            if (str != null) {
                float fCalcTextWidth = Utils.calcTextWidth(paint, str);
                if (fCalcTextWidth > f10) {
                    f10 = fCalcTextWidth;
                }
            }
        }
        return f10 + f11 + fConvertDpToPixel;
    }

    public LegendOrientation getOrientation() {
        return this.mOrientation;
    }

    @Deprecated
    public LegendPosition getPosition() {
        LegendOrientation legendOrientation = this.mOrientation;
        if (legendOrientation == LegendOrientation.VERTICAL && this.mHorizontalAlignment == LegendHorizontalAlignment.CENTER && this.mVerticalAlignment == LegendVerticalAlignment.CENTER) {
            return LegendPosition.PIECHART_CENTER;
        }
        if (legendOrientation == LegendOrientation.HORIZONTAL) {
            if (this.mVerticalAlignment == LegendVerticalAlignment.TOP) {
                LegendHorizontalAlignment legendHorizontalAlignment = this.mHorizontalAlignment;
                if (legendHorizontalAlignment == LegendHorizontalAlignment.LEFT) {
                    return LegendPosition.ABOVE_CHART_LEFT;
                }
                return legendHorizontalAlignment == LegendHorizontalAlignment.RIGHT ? LegendPosition.ABOVE_CHART_RIGHT : LegendPosition.ABOVE_CHART_CENTER;
            }
            LegendHorizontalAlignment legendHorizontalAlignment2 = this.mHorizontalAlignment;
            if (legendHorizontalAlignment2 == LegendHorizontalAlignment.LEFT) {
                return LegendPosition.BELOW_CHART_LEFT;
            }
            return legendHorizontalAlignment2 == LegendHorizontalAlignment.RIGHT ? LegendPosition.BELOW_CHART_RIGHT : LegendPosition.BELOW_CHART_CENTER;
        }
        if (this.mHorizontalAlignment == LegendHorizontalAlignment.LEFT) {
            LegendVerticalAlignment legendVerticalAlignment = this.mVerticalAlignment;
            if (legendVerticalAlignment == LegendVerticalAlignment.TOP && this.mDrawInside) {
                return LegendPosition.LEFT_OF_CHART_INSIDE;
            }
            return legendVerticalAlignment == LegendVerticalAlignment.CENTER ? LegendPosition.LEFT_OF_CHART_CENTER : LegendPosition.LEFT_OF_CHART;
        }
        LegendVerticalAlignment legendVerticalAlignment2 = this.mVerticalAlignment;
        if (legendVerticalAlignment2 == LegendVerticalAlignment.TOP && this.mDrawInside) {
            return LegendPosition.RIGHT_OF_CHART_INSIDE;
        }
        return legendVerticalAlignment2 == LegendVerticalAlignment.CENTER ? LegendPosition.RIGHT_OF_CHART_CENTER : LegendPosition.RIGHT_OF_CHART;
    }

    public float getStackSpace() {
        return this.mStackSpace;
    }

    public LegendVerticalAlignment getVerticalAlignment() {
        return this.mVerticalAlignment;
    }

    public float getXEntrySpace() {
        return this.mXEntrySpace;
    }

    public float getYEntrySpace() {
        return this.mYEntrySpace;
    }

    public boolean isDrawInsideEnabled() {
        return this.mDrawInside;
    }

    public boolean isLegendCustom() {
        return this.mIsLegendCustom;
    }

    public boolean isWordWrapEnabled() {
        return this.mWordWrapEnabled;
    }

    public void resetCustom() {
        this.mIsLegendCustom = false;
    }

    public void setCustom(List<LegendEntry> list) {
        this.mEntries = (LegendEntry[]) list.toArray(new LegendEntry[list.size()]);
        this.mIsLegendCustom = true;
    }

    public void setCustom(LegendEntry[] legendEntryArr) {
        this.mEntries = legendEntryArr;
        this.mIsLegendCustom = true;
    }

    public void setDirection(LegendDirection legendDirection) {
        this.mDirection = legendDirection;
    }

    public void setDrawInside(boolean z10) {
        this.mDrawInside = z10;
    }

    public void setEntries(List<LegendEntry> list) {
        this.mEntries = (LegendEntry[]) list.toArray(new LegendEntry[list.size()]);
    }

    public void setExtra(List<LegendEntry> list) {
        this.mExtraEntries = (LegendEntry[]) list.toArray(new LegendEntry[list.size()]);
    }

    @Deprecated
    public void setExtra(List<Integer> list, List<String> list2) {
        setExtra(Utils.convertIntegers(list), Utils.convertStrings(list2));
    }

    public void setExtra(int[] iArr, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < Math.min(iArr.length, strArr.length); i10++) {
            LegendEntry legendEntry = new LegendEntry();
            int i11 = iArr[i10];
            legendEntry.formColor = i11;
            legendEntry.label = strArr[i10];
            if (i11 == 1122868 || i11 == 0) {
                legendEntry.form = LegendForm.NONE;
            } else if (i11 == 1122867) {
                legendEntry.form = LegendForm.EMPTY;
            }
            arrayList.add(legendEntry);
        }
        this.mExtraEntries = (LegendEntry[]) arrayList.toArray(new LegendEntry[arrayList.size()]);
    }

    public void setExtra(LegendEntry[] legendEntryArr) {
        if (legendEntryArr == null) {
            legendEntryArr = new LegendEntry[0];
        }
        this.mExtraEntries = legendEntryArr;
    }

    public void setForm(LegendForm legendForm) {
        this.mShape = legendForm;
    }

    public void setFormLineDashEffect(DashPathEffect dashPathEffect) {
        this.mFormLineDashEffect = dashPathEffect;
    }

    public void setFormLineWidth(float f10) {
        this.mFormLineWidth = f10;
    }

    public void setFormSize(float f10) {
        this.mFormSize = f10;
    }

    public void setFormToTextSpace(float f10) {
        this.mFormToTextSpace = f10;
    }

    public void setHorizontalAlignment(LegendHorizontalAlignment legendHorizontalAlignment) {
        this.mHorizontalAlignment = legendHorizontalAlignment;
    }

    public void setMaxSizePercent(float f10) {
        this.mMaxSizePercent = f10;
    }

    public void setOrientation(LegendOrientation legendOrientation) {
        this.mOrientation = legendOrientation;
    }

    @Deprecated
    public void setPosition(LegendPosition legendPosition) {
        LegendHorizontalAlignment legendHorizontalAlignment;
        LegendHorizontalAlignment legendHorizontalAlignment2;
        switch (AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[legendPosition.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.mHorizontalAlignment = LegendHorizontalAlignment.LEFT;
                this.mVerticalAlignment = legendPosition == LegendPosition.LEFT_OF_CHART_CENTER ? LegendVerticalAlignment.CENTER : LegendVerticalAlignment.TOP;
                this.mOrientation = LegendOrientation.VERTICAL;
                break;
            case 4:
            case 5:
            case 6:
                this.mHorizontalAlignment = LegendHorizontalAlignment.RIGHT;
                this.mVerticalAlignment = legendPosition == LegendPosition.RIGHT_OF_CHART_CENTER ? LegendVerticalAlignment.CENTER : LegendVerticalAlignment.TOP;
                this.mOrientation = LegendOrientation.VERTICAL;
                break;
            case 7:
            case 8:
            case 9:
                if (legendPosition == LegendPosition.ABOVE_CHART_LEFT) {
                    legendHorizontalAlignment = LegendHorizontalAlignment.LEFT;
                } else {
                    legendHorizontalAlignment = legendPosition == LegendPosition.ABOVE_CHART_RIGHT ? LegendHorizontalAlignment.RIGHT : LegendHorizontalAlignment.CENTER;
                }
                this.mHorizontalAlignment = legendHorizontalAlignment;
                this.mVerticalAlignment = LegendVerticalAlignment.TOP;
                this.mOrientation = LegendOrientation.HORIZONTAL;
                break;
            case 10:
            case 11:
            case 12:
                if (legendPosition == LegendPosition.BELOW_CHART_LEFT) {
                    legendHorizontalAlignment2 = LegendHorizontalAlignment.LEFT;
                } else {
                    legendHorizontalAlignment2 = legendPosition == LegendPosition.BELOW_CHART_RIGHT ? LegendHorizontalAlignment.RIGHT : LegendHorizontalAlignment.CENTER;
                }
                this.mHorizontalAlignment = legendHorizontalAlignment2;
                this.mVerticalAlignment = LegendVerticalAlignment.BOTTOM;
                this.mOrientation = LegendOrientation.HORIZONTAL;
                break;
            case 13:
                this.mHorizontalAlignment = LegendHorizontalAlignment.CENTER;
                this.mVerticalAlignment = LegendVerticalAlignment.CENTER;
                this.mOrientation = LegendOrientation.VERTICAL;
                break;
        }
        this.mDrawInside = legendPosition == LegendPosition.LEFT_OF_CHART_INSIDE || legendPosition == LegendPosition.RIGHT_OF_CHART_INSIDE;
    }

    public void setStackSpace(float f10) {
        this.mStackSpace = f10;
    }

    public void setVerticalAlignment(LegendVerticalAlignment legendVerticalAlignment) {
        this.mVerticalAlignment = legendVerticalAlignment;
    }

    public void setWordWrapEnabled(boolean z10) {
        this.mWordWrapEnabled = z10;
    }

    public void setXEntrySpace(float f10) {
        this.mXEntrySpace = f10;
    }

    public void setYEntrySpace(float f10) {
        this.mYEntrySpace = f10;
    }
}
