package com.starlightc.ucropplus.view.widget.stickeritem;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.callback.SimpleAction;
import com.starlightc.ucropplus.model.RectFInfo;
import com.starlightc.ucropplus.model.RectInfo;
import com.starlightc.ucropplus.model.StickerStateInfo;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.starlightc.ucropplus.model.puzzle.HBRectF;
import com.starlightc.ucropplus.util.RectUtil;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: BitmapStickerItem.kt */
/* JADX INFO: loaded from: classes4.dex */
@t0({"SMAP\nBitmapStickerItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapStickerItem.kt\ncom/starlightc/ucropplus/view/widget/stickeritem/BitmapStickerItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Matrix.kt\nandroidx/core/graphics/MatrixKt\n*L\n1#1,221:1\n1#2:222\n1#2:224\n32#3:223\n*S KotlinDebug\n*F\n+ 1 BitmapStickerItem.kt\ncom/starlightc/ucropplus/view/widget/stickeritem/BitmapStickerItem\n*L\n208#1:224\n208#1:223\n*E\n"})
public final class BitmapStickerItem extends BaseStickerItem {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Bitmap bitmap;

    @e
    private String bitmapPath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapStickerItem(@d Context context) {
        super(context);
        f0.p(context, "context");
    }

    private final void drawImageSticker(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51212, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        Bitmap bitmap = this.bitmap;
        f0.m(bitmap);
        Matrix matrix = getMatrix();
        f0.m(matrix);
        canvas.drawBitmap(bitmap, matrix, null);
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

    private final void syncInfo(StickerStateInfo stickerStateInfo) {
        Matrix matrix;
        if (PatchProxy.proxy(new Object[]{stickerStateInfo}, this, changeQuickRedirect, false, 51214, new Class[]{StickerStateInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        this.bitmapPath = stickerStateInfo.getBitmapPath();
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
    }

    @Override // com.starlightc.ucropplus.view.widget.stickeritem.BaseStickerItem
    public void draw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51211, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        drawImageSticker(canvas);
    }

    @e
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @e
    public final String getBitmapPath() {
        return this.bitmapPath;
    }

    @Override // com.starlightc.ucropplus.view.widget.stickeritem.BaseStickerItem
    @d
    public StickerStateInfo getStateInfo() {
        float[] fArr;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51215, new Class[0], StickerStateInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (StickerStateInfo) patchProxyResultProxy.result;
        }
        BaseStickerItem.StickerType stickerType = BaseStickerItem.StickerType.Bitmap;
        String str = this.bitmapPath;
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
            fArr = new float[9];
            matrix.getValues(fArr);
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
        return new StickerStateInfo(stickerType, null, null, null, str, rectInfo, rectFInfo, rectInfo2, rectFInfo2, rectFInfo3, rectFInfo4, rectFInfo5, fArr, rotateAngle, scale, zIsDrawHelpTool, initWidth, rectFInfo6, rectFInfo7, detectEditRect != null ? new RectFInfo(detectEditRect) : null, getCanEdit(), getCanDelete(), 0.0f, 0.0f, 0.0f, 0.0f, null, 0, 264241166, null);
    }

    public final void init(@d Bitmap addBit, @d View parentView, @e String str) {
        if (PatchProxy.proxy(new Object[]{addBit, parentView, str}, this, changeQuickRedirect, false, 51209, new Class[]{Bitmap.class, View.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(addBit, "addBit");
        f0.p(parentView, "parentView");
        setParentH(ViewUtils.V(parentView));
        setParentW(ViewUtils.W(parentView));
        this.bitmap = addBit;
        this.bitmapPath = str;
        setSrcRect(new Rect(0, 0, addBit.getWidth(), addBit.getHeight()));
        int iMin = Math.min(addBit.getWidth(), parentView.getWidth() >> 1);
        int height = (addBit.getHeight() * iMin) / addBit.getWidth();
        int width = (parentView.getWidth() >> 1) - (iMin >> 1);
        int height2 = (parentView.getHeight() >> 1) - (height >> 1);
        setDstRect(RectUtil.INSTANCE.rectRandomOffset(new RectF(width, height2, width + iMin, height2 + height)));
        setMatrix(new Matrix());
        Matrix matrix = getMatrix();
        f0.m(matrix);
        RectF dstRect = getDstRect();
        f0.m(dstRect);
        float f10 = dstRect.left;
        RectF dstRect2 = getDstRect();
        f0.m(dstRect2);
        matrix.postTranslate(f10, dstRect2.top);
        Matrix matrix2 = getMatrix();
        f0.m(matrix2);
        float width2 = iMin / addBit.getWidth();
        float height3 = height / addBit.getHeight();
        RectF dstRect3 = getDstRect();
        f0.m(dstRect3);
        float f11 = dstRect3.left;
        RectF dstRect4 = getDstRect();
        f0.m(dstRect4);
        matrix2.postScale(width2, height3, f11, dstRect4.top);
        RectF dstRect5 = getDstRect();
        f0.m(dstRect5);
        setInitWidth(dstRect5.width());
        setDrawHelpTool(true);
        setHelpBox(new RectF(getDstRect()));
        updateHelpBoxRect();
        BaseStickerItem.Companion companion = BaseStickerItem.Companion;
        Bitmap deleteBit = companion.getDeleteBit();
        f0.m(deleteBit);
        int width3 = deleteBit.getWidth();
        Bitmap deleteBit2 = companion.getDeleteBit();
        f0.m(deleteBit2);
        setHelpToolsRect(new Rect(0, 0, width3, deleteBit2.getHeight()));
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

    public final void initWithInfo(@d Bitmap addBit, @d View parentView, @e String str, @d BasePuzzleInfo puzzleInfo) {
        if (PatchProxy.proxy(new Object[]{addBit, parentView, str, puzzleInfo}, this, changeQuickRedirect, false, 51210, new Class[]{Bitmap.class, View.class, String.class, BasePuzzleInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(addBit, "addBit");
        f0.p(parentView, "parentView");
        f0.p(puzzleInfo, "puzzleInfo");
        setParentH(ViewUtils.V(parentView));
        setParentW(ViewUtils.W(parentView));
        this.bitmap = addBit;
        this.bitmapPath = str;
        setSrcRect(new Rect(0, 0, addBit.getWidth(), addBit.getHeight()));
        HBRectF rect = puzzleInfo.getRect();
        f0.m(rect);
        RectF pxRectF = rect.toPxRectF(getContext());
        float f10 = pxRectF.right - pxRectF.left;
        float f11 = pxRectF.bottom - pxRectF.top;
        if (f0.g(BasePuzzleInfo.PUZZLE_TYPE_CONTENT_PICTURE, puzzleInfo.getType())) {
            setCanDelete(false);
        }
        setRotateAngle(n.p(puzzleInfo.getRotation()));
        setDstRect(pxRectF);
        setMatrix(new Matrix());
        Matrix matrix = getMatrix();
        f0.m(matrix);
        RectF dstRect = getDstRect();
        f0.m(dstRect);
        float f12 = dstRect.left;
        RectF dstRect2 = getDstRect();
        f0.m(dstRect2);
        matrix.postTranslate(f12, dstRect2.top);
        Matrix matrix2 = getMatrix();
        f0.m(matrix2);
        float width = f10 / addBit.getWidth();
        float height = f11 / addBit.getHeight();
        RectF dstRect3 = getDstRect();
        f0.m(dstRect3);
        float f13 = dstRect3.left;
        RectF dstRect4 = getDstRect();
        f0.m(dstRect4);
        matrix2.postScale(width, height, f13, dstRect4.top);
        Matrix matrix3 = getMatrix();
        f0.m(matrix3);
        float rotateAngle = getRotateAngle();
        RectF dstRect5 = getDstRect();
        f0.m(dstRect5);
        float fCenterX = dstRect5.centerX();
        RectF dstRect6 = getDstRect();
        f0.m(dstRect6);
        matrix3.postRotate(rotateAngle, fCenterX, dstRect6.centerY());
        RectF dstRect7 = getDstRect();
        f0.m(dstRect7);
        setInitWidth(dstRect7.width());
        setDrawHelpTool(true);
        setHelpBox(new RectF(getDstRect()));
        updateHelpBoxRect();
        BaseStickerItem.Companion companion = BaseStickerItem.Companion;
        Bitmap deleteBit = companion.getDeleteBit();
        f0.m(deleteBit);
        int width2 = deleteBit.getWidth();
        Bitmap deleteBit2 = companion.getDeleteBit();
        f0.m(deleteBit2);
        setHelpToolsRect(new Rect(0, 0, width2, deleteBit2.getHeight()));
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
        refreshDetectRects();
    }

    @Override // com.starlightc.ucropplus.view.widget.stickeritem.BaseStickerItem
    public void initWithStateInfo(@d StickerStateInfo info, @d View parentView, @d SimpleAction action) {
        Bitmap bitmapDecodeFile;
        String strD4;
        if (PatchProxy.proxy(new Object[]{info, parentView, action}, this, changeQuickRedirect, false, 51213, new Class[]{StickerStateInfo.class, View.class, SimpleAction.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(info, "info");
        f0.p(parentView, "parentView");
        f0.p(action, "action");
        setParentH(ViewUtils.V(parentView));
        setParentW(ViewUtils.W(parentView));
        String bitmapPath = info.getBitmapPath();
        f0.m(bitmapPath);
        if (StringsKt__StringsKt.W2(bitmapPath, "android_asset", false, 2, null)) {
            String bitmapPath2 = info.getBitmapPath();
            bitmapDecodeFile = BitmapFactory.decodeStream((bitmapPath2 == null || (strD4 = StringsKt__StringsKt.d4(bitmapPath2, "file:///android_asset/")) == null) ? null : getContext().getAssets().open(strD4));
            f0.o(bitmapDecodeFile, "decodeStream(...)");
        } else {
            bitmapDecodeFile = BitmapFactory.decodeFile(info.getBitmapPath());
            f0.o(bitmapDecodeFile, "decodeFile(...)");
        }
        init(bitmapDecodeFile, parentView, info.getBitmapPath());
        syncInfo(info);
        action.doAction(null);
    }

    public final void setBitmap(@e Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final void setBitmapPath(@e String str) {
        this.bitmapPath = str;
    }
}
