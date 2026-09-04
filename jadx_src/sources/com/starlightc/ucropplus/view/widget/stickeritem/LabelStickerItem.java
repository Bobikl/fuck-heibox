package com.starlightc.ucropplus.view.widget.stickeritem;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.callback.SimpleAction;
import com.starlightc.ucropplus.model.RectFInfo;
import com.starlightc.ucropplus.model.RectInfo;
import com.starlightc.ucropplus.model.StickerStateInfo;
import dl.d;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: LabelStickerItem.kt */
/* JADX INFO: loaded from: classes4.dex */
@t0({"SMAP\nLabelStickerItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LabelStickerItem.kt\ncom/starlightc/ucropplus/view/widget/stickeritem/LabelStickerItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Matrix.kt\nandroidx/core/graphics/MatrixKt\n*L\n1#1,245:1\n1#2:246\n1#2:248\n32#3:247\n*S KotlinDebug\n*F\n+ 1 LabelStickerItem.kt\ncom/starlightc/ucropplus/view/widget/stickeritem/LabelStickerItem\n*L\n222#1:248\n222#1:247\n*E\n"})
public final class LabelStickerItem extends BaseStickerItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    private float arrowHeight;

    @d
    private LabelType currentLabelType;
    private float halfArrowWidth;

    @d
    private Paint labelPaint;
    private float radius;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private float f98147x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private float f98148x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private float f98149y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private float f98150y2;

    /* JADX INFO: compiled from: LabelStickerItem.kt */
    public enum LabelType {
        RECTANGLE,
        CIRCLE,
        ARROW;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public static kotlin.enums.a<LabelType> getEntries() {
            return $ENTRIES;
        }

        public static LabelType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 51227, new Class[]{String.class}, LabelType.class);
            return (LabelType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(LabelType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static LabelType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 51226, new Class[0], LabelType[].class);
            return (LabelType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: LabelStickerItem.kt */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LabelType.valuesCustom().length];
            try {
                iArr[LabelType.RECTANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LabelType.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LabelType.ARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelStickerItem(@d Context context) {
        super(context);
        f0.p(context, "context");
        this.currentLabelType = LabelType.RECTANGLE;
        Paint paint = new Paint();
        this.labelPaint = paint;
        paint.setColor(y1.a.f141526c);
        this.labelPaint.setStyle(Paint.Style.STROKE);
        this.labelPaint.setAntiAlias(true);
        this.labelPaint.setStrokeWidth(ViewUtils.f(context, 4.0f));
        this.radius = ViewUtils.f(context, 4.0f);
        this.arrowHeight = ViewUtils.f(context, 20.0f);
        this.halfArrowWidth = ViewUtils.f(context, 11.5f);
    }

    private final void syncInfo(StickerStateInfo stickerStateInfo) {
        Matrix matrix;
        if (PatchProxy.proxy(new Object[]{stickerStateInfo}, this, changeQuickRedirect, false, 51224, new Class[]{StickerStateInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        RectInfo srcRect = stickerStateInfo.getSrcRect();
        setSrcRect(srcRect != null ? new Rect(srcRect.getLeft(), srcRect.getTop(), srcRect.getRight(), srcRect.getBottom()) : null);
        RectFInfo dstRect = stickerStateInfo.getDstRect();
        setDstRect(dstRect != null ? new RectF(dstRect.getLeft(), dstRect.getTop(), dstRect.getRight(), dstRect.getBottom()) : null);
        RectInfo helpToolsRect = stickerStateInfo.getHelpToolsRect();
        setHelpToolsRect(helpToolsRect != null ? new Rect(helpToolsRect.getLeft(), helpToolsRect.getTop(), helpToolsRect.getRight(), helpToolsRect.getBottom()) : null);
        RectFInfo deleteRect = stickerStateInfo.getDeleteRect();
        setDeleteRect(deleteRect != null ? new RectF(deleteRect.getLeft(), deleteRect.getTop(), deleteRect.getRight(), deleteRect.getBottom()) : null);
        RectFInfo rotateRect = stickerStateInfo.getRotateRect();
        setRotateRect(rotateRect != null ? new RectF(rotateRect.getLeft(), rotateRect.getTop(), rotateRect.getRight(), rotateRect.getBottom()) : null);
        RectFInfo editRect = stickerStateInfo.getEditRect();
        setEditRect(editRect != null ? new RectF(editRect.getLeft(), editRect.getTop(), editRect.getRight(), editRect.getBottom()) : null);
        RectFInfo helpBox = stickerStateInfo.getHelpBox();
        setHelpBox(helpBox != null ? new RectF(helpBox.getLeft(), helpBox.getTop(), helpBox.getRight(), helpBox.getBottom()) : null);
        float[] matrix2 = stickerStateInfo.getMatrix();
        if (matrix2 != null) {
            matrix = new Matrix();
            matrix.setValues(matrix2);
        } else {
            matrix = null;
        }
        setMatrix(matrix);
        setRotateAngle(stickerStateInfo.getRotateAngle());
        setScale(stickerStateInfo.getScale());
        setDrawHelpTool(stickerStateInfo.isDrawHelpTool());
        setInitWidth(stickerStateInfo.getInitWidth());
        RectFInfo detectRotateRect = stickerStateInfo.getDetectRotateRect();
        setDetectRotateRect(detectRotateRect != null ? new RectF(detectRotateRect.getLeft(), detectRotateRect.getTop(), detectRotateRect.getRight(), detectRotateRect.getBottom()) : null);
        RectFInfo detectDeleteRect = stickerStateInfo.getDetectDeleteRect();
        setDetectDeleteRect(detectDeleteRect != null ? new RectF(detectDeleteRect.getLeft(), detectDeleteRect.getTop(), detectDeleteRect.getRight(), detectDeleteRect.getBottom()) : null);
        RectFInfo detectEditRect = stickerStateInfo.getDetectEditRect();
        setDetectEditRect(detectEditRect != null ? new RectF(detectEditRect.getLeft(), detectEditRect.getTop(), detectEditRect.getRight(), detectEditRect.getBottom()) : null);
        setCanDelete(stickerStateInfo.getCanDelete());
        setCanEdit(stickerStateInfo.getCanEdit());
        this.f98147x1 = stickerStateInfo.getX1();
        this.f98149y1 = stickerStateInfo.getY1();
        this.f98148x2 = stickerStateInfo.getX2();
        this.f98150y2 = stickerStateInfo.getY2();
        this.currentLabelType = stickerStateInfo.getLabelType();
        this.labelPaint.setColor(stickerStateInfo.getLabelColor());
    }

    @Override // com.starlightc.ucropplus.view.widget.stickeritem.BaseStickerItem
    public void draw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51219, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        drawSticker(canvas);
        if (isDrawHelpTool()) {
            canvas.save();
            float rotateAngle = getRotateAngle();
            RectF helpBox = getHelpBox();
            f0.m(helpBox);
            float fCenterX = helpBox.centerX();
            RectF helpBox2 = getHelpBox();
            f0.m(helpBox2);
            canvas.rotate(rotateAngle, fCenterX, helpBox2.centerY());
            RectF helpBox3 = getHelpBox();
            f0.m(helpBox3);
            canvas.drawRoundRect(helpBox3, 6.0f, 6.0f, getHelpBoxPaint());
            if (getCanDelete()) {
                Bitmap deleteBit = BaseStickerItem.Companion.getDeleteBit();
                f0.m(deleteBit);
                Rect helpToolsRect = getHelpToolsRect();
                RectF deleteRect = getDeleteRect();
                f0.m(deleteRect);
                canvas.drawBitmap(deleteBit, helpToolsRect, deleteRect, (Paint) null);
            }
            Bitmap rotateBit = BaseStickerItem.Companion.getRotateBit();
            f0.m(rotateBit);
            Rect helpToolsRect2 = getHelpToolsRect();
            RectF rotateRect = getRotateRect();
            f0.m(rotateRect);
            canvas.drawBitmap(rotateBit, helpToolsRect2, rotateRect, (Paint) null);
            canvas.restore();
        }
    }

    public final void drawAL(@d Canvas canvas, float f10, float f11, float f12, float f13) {
        Object[] objArr = {canvas, new Float(f10), new Float(f11), new Float(f12), new Float(f13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51221, new Class[]{Canvas.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        double dAtan = Math.atan(this.halfArrowWidth / this.arrowHeight);
        float f14 = this.halfArrowWidth;
        float f15 = this.radius;
        float f16 = (f14 - f15) * (f14 - f15);
        float f17 = this.arrowHeight;
        double dSqrt = Math.sqrt(f16 + ((f17 - f15) * (f17 - f15)));
        float f18 = f12 - f10;
        float f19 = f13 - f11;
        double[] dArrRotateVec = rotateVec(f18, f19, dAtan, true, dSqrt);
        double[] dArrRotateVec2 = rotateVec(f18, f19, -dAtan, true, dSqrt);
        double d10 = f12;
        double d11 = d10 - dArrRotateVec[0];
        double d12 = f13;
        double d13 = d12 - dArrRotateVec[1];
        double d14 = d10 - dArrRotateVec2[0];
        double d15 = d12 - dArrRotateVec2[1];
        canvas.drawLine(f10, f11, f12, f13, this.labelPaint);
        Path path = new Path();
        path.moveTo(f12, f13);
        path.lineTo((float) d11, (float) d13);
        path.lineTo((float) d14, (float) d15);
        path.close();
        canvas.drawPath(path, this.labelPaint);
    }

    public final void drawSticker(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51220, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        if (Math.abs(this.f98147x1 - this.f98148x2) + Math.abs(this.f98149y1 - this.f98150y2) > 0.0f) {
            RectF rectF = new RectF(this.f98147x1, this.f98149y1, this.f98148x2, this.f98150y2);
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.currentLabelType.ordinal()];
            if (i10 == 1) {
                this.labelPaint.setStyle(Paint.Style.STROKE);
                float f10 = this.radius;
                canvas.drawRoundRect(rectF, f10, f10, this.labelPaint);
            } else if (i10 == 2) {
                this.labelPaint.setStyle(Paint.Style.STROKE);
                canvas.drawOval(rectF, this.labelPaint);
            } else {
                if (i10 != 3) {
                    return;
                }
                this.labelPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                drawAL(canvas, this.f98147x1, this.f98149y1, this.f98148x2, this.f98150y2);
            }
        }
    }

    public final float getArrowHeight() {
        return this.arrowHeight;
    }

    @d
    public final LabelType getCurrentLabelType() {
        return this.currentLabelType;
    }

    public final float getHalfArrowWidth() {
        return this.halfArrowWidth;
    }

    @d
    public final Paint getLabelPaint() {
        return this.labelPaint;
    }

    public final float getRadius() {
        return this.radius;
    }

    @Override // com.starlightc.ucropplus.view.widget.stickeritem.BaseStickerItem
    @d
    public StickerStateInfo getStateInfo() {
        float[] fArr;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51225, new Class[0], StickerStateInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (StickerStateInfo) patchProxyResultProxy.result;
        }
        BaseStickerItem.StickerType stickerType = BaseStickerItem.StickerType.Label;
        Rect srcRect = getSrcRect();
        RectInfo rectInfo = srcRect != null ? new RectInfo(srcRect) : null;
        RectF dstRect = getDstRect();
        RectFInfo rectFInfo = dstRect != null ? new RectFInfo(dstRect) : null;
        Rect helpToolsRect = getHelpToolsRect();
        RectInfo rectInfo2 = helpToolsRect != null ? new RectInfo(helpToolsRect) : null;
        RectF deleteRect = getDeleteRect();
        RectFInfo rectFInfo2 = deleteRect != null ? new RectFInfo(deleteRect) : null;
        RectF rotateRect = getRotateRect();
        RectFInfo rectFInfo3 = rotateRect != null ? new RectFInfo(rotateRect) : null;
        RectF editRect = getEditRect();
        RectFInfo rectFInfo4 = editRect != null ? new RectFInfo(editRect) : null;
        RectF helpBox = getHelpBox();
        RectFInfo rectFInfo5 = helpBox != null ? new RectFInfo(helpBox) : null;
        Matrix matrix = getMatrix();
        if (matrix != null) {
            float[] fArr2 = new float[9];
            matrix.getValues(fArr2);
            fArr = fArr2;
        } else {
            fArr = null;
        }
        float rotateAngle = getRotateAngle();
        float scale = getScale();
        boolean zIsDrawHelpTool = isDrawHelpTool();
        float initWidth = getInitWidth();
        RectF detectRotateRect = getDetectRotateRect();
        RectFInfo rectFInfo6 = detectRotateRect != null ? new RectFInfo(detectRotateRect) : null;
        RectF detectDeleteRect = getDetectDeleteRect();
        RectFInfo rectFInfo7 = detectDeleteRect != null ? new RectFInfo(detectDeleteRect) : null;
        RectF detectEditRect = getDetectEditRect();
        return new StickerStateInfo(stickerType, null, null, null, null, rectInfo, rectFInfo, rectInfo2, rectFInfo2, rectFInfo3, rectFInfo4, rectFInfo5, fArr, rotateAngle, scale, zIsDrawHelpTool, initWidth, rectFInfo6, rectFInfo7, detectEditRect != null ? new RectFInfo(detectEditRect) : null, getCanEdit(), getCanDelete(), this.f98147x1, this.f98149y1, this.f98148x2, this.f98150y2, this.currentLabelType, this.labelPaint.getColor(), 30, null);
    }

    public final float getX1() {
        return this.f98147x1;
    }

    public final float getX2() {
        return this.f98148x2;
    }

    public final float getY1() {
        return this.f98149y1;
    }

    public final float getY2() {
        return this.f98150y2;
    }

    public final void init(@d View parentView, float f10, float f11, float f12, float f13, int i10) {
        Object[] objArr = {parentView, new Float(f10), new Float(f11), new Float(f12), new Float(f13), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51218, new Class[]{View.class, cls, cls, cls, cls, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(parentView, "parentView");
        this.f98147x1 = f10;
        this.f98149y1 = f11;
        this.f98148x2 = f12;
        this.f98150y2 = f13;
        this.labelPaint.setColor(i10);
        setParentH(ViewUtils.V(parentView));
        setParentW(ViewUtils.W(parentView));
        int iMax = Math.max(1, (int) Math.abs(f12 - f10));
        int iMax2 = Math.max(1, (int) Math.abs(f13 - f11));
        setSrcRect(new Rect(0, 0, iMax, iMax2));
        int iMin = Math.min(iMax, parentView.getWidth() >> 1);
        int i11 = (iMin * iMax2) / iMax;
        float f14 = iMin;
        float f15 = i11;
        setDstRect(new RectF(f10, f11, f10 + f14, f11 + f15));
        setMatrix(new Matrix());
        Matrix matrix = getMatrix();
        f0.m(matrix);
        RectF dstRect = getDstRect();
        f0.m(dstRect);
        float f16 = dstRect.left;
        RectF dstRect2 = getDstRect();
        f0.m(dstRect2);
        matrix.postTranslate(f16, dstRect2.top);
        Matrix matrix2 = getMatrix();
        f0.m(matrix2);
        float f17 = f14 / iMax;
        float f18 = f15 / iMax2;
        RectF dstRect3 = getDstRect();
        f0.m(dstRect3);
        float f19 = dstRect3.left;
        RectF dstRect4 = getDstRect();
        f0.m(dstRect4);
        matrix2.postScale(f17, f18, f19, dstRect4.top);
        RectF dstRect5 = getDstRect();
        f0.m(dstRect5);
        setInitWidth(dstRect5.width());
        setDrawHelpTool(false);
        setHelpBox(new RectF(getDstRect()));
        updateHelpBoxRect();
        BaseStickerItem.Companion companion = BaseStickerItem.Companion;
        Bitmap deleteBit = companion.getDeleteBit();
        f0.m(deleteBit);
        int width = deleteBit.getWidth();
        Bitmap deleteBit2 = companion.getDeleteBit();
        f0.m(deleteBit2);
        setHelpToolsRect(new Rect(0, 0, width, deleteBit2.getHeight()));
        RectF helpBox = getHelpBox();
        f0.m(helpBox);
        float button_width = helpBox.left - companion.getBUTTON_WIDTH();
        RectF helpBox2 = getHelpBox();
        f0.m(helpBox2);
        float button_width2 = helpBox2.top - companion.getBUTTON_WIDTH();
        RectF helpBox3 = getHelpBox();
        f0.m(helpBox3);
        float button_width3 = helpBox3.left + companion.getBUTTON_WIDTH();
        RectF helpBox4 = getHelpBox();
        f0.m(helpBox4);
        setDeleteRect(new RectF(button_width, button_width2, button_width3, helpBox4.top + companion.getBUTTON_WIDTH()));
        RectF helpBox5 = getHelpBox();
        f0.m(helpBox5);
        float button_width4 = helpBox5.right - companion.getBUTTON_WIDTH();
        RectF helpBox6 = getHelpBox();
        f0.m(helpBox6);
        float button_width5 = helpBox6.bottom - companion.getBUTTON_WIDTH();
        RectF helpBox7 = getHelpBox();
        f0.m(helpBox7);
        float button_width6 = helpBox7.right + companion.getBUTTON_WIDTH();
        RectF helpBox8 = getHelpBox();
        f0.m(helpBox8);
        setRotateRect(new RectF(button_width4, button_width5, button_width6, helpBox8.bottom + companion.getBUTTON_WIDTH()));
        setDetectRotateRect(new RectF(getRotateRect()));
        setDetectDeleteRect(new RectF(getDeleteRect()));
    }

    @Override // com.starlightc.ucropplus.view.widget.stickeritem.BaseStickerItem
    public void initWithStateInfo(@d StickerStateInfo info, @d View parentView, @d SimpleAction action) {
        if (PatchProxy.proxy(new Object[]{info, parentView, action}, this, changeQuickRedirect, false, 51223, new Class[]{StickerStateInfo.class, View.class, SimpleAction.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(info, "info");
        f0.p(parentView, "parentView");
        f0.p(action, "action");
        setParentH(ViewUtils.V(parentView));
        setParentW(ViewUtils.W(parentView));
        this.currentLabelType = info.getLabelType();
        init(parentView, info.getX1(), info.getY1(), info.getX2(), info.getY2(), info.getLabelColor());
        syncInfo(info);
        action.doAction(null);
    }

    @Override // com.starlightc.ucropplus.view.widget.stickeritem.BaseStickerItem
    public boolean needHelpBox() {
        return false;
    }

    @d
    public final double[] rotateVec(float f10, float f11, double d10, boolean z10, double d11) {
        Object[] objArr = {new Float(f10), new Float(f11), new Double(d10), new Byte(z10 ? (byte) 1 : (byte) 0), new Double(d11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51222, new Class[]{cls, cls, cls2, Boolean.TYPE, cls2}, double[].class);
        if (patchProxyResultProxy.isSupported) {
            return (double[]) patchProxyResultProxy.result;
        }
        double[] dArr = new double[2];
        double d12 = f10;
        double d13 = f11;
        double dCos = (Math.cos(d10) * d12) - (Math.sin(d10) * d13);
        double dSin = (d12 * Math.sin(d10)) + (d13 * Math.cos(d10));
        if (z10) {
            double dSqrt = Math.sqrt((dCos * dCos) + (dSin * dSin));
            dArr[0] = (dCos / dSqrt) * d11;
            dArr[1] = (dSin / dSqrt) * d11;
        }
        return dArr;
    }

    public final void setArrowHeight(float f10) {
        this.arrowHeight = f10;
    }

    public final void setCurrentLabelType(@d LabelType labelType) {
        if (PatchProxy.proxy(new Object[]{labelType}, this, changeQuickRedirect, false, 51216, new Class[]{LabelType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(labelType, "<set-?>");
        this.currentLabelType = labelType;
    }

    public final void setHalfArrowWidth(float f10) {
        this.halfArrowWidth = f10;
    }

    public final void setLabelPaint(@d Paint paint) {
        if (PatchProxy.proxy(new Object[]{paint}, this, changeQuickRedirect, false, 51217, new Class[]{Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(paint, "<set-?>");
        this.labelPaint = paint;
    }

    public final void setRadius(float f10) {
        this.radius = f10;
    }

    public final void setX1(float f10) {
        this.f98147x1 = f10;
    }

    public final void setX2(float f10) {
        this.f98148x2 = f10;
    }

    public final void setY1(float f10) {
        this.f98149y1 = f10;
    }

    public final void setY2(float f10) {
        this.f98150y2 = f10;
    }
}
