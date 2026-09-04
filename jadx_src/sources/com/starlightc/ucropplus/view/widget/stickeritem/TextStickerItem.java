package com.starlightc.ucropplus.view.widget.stickeritem;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.max.hbcommon.utils.c;
import com.max.hbcommon.utils.l;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.callback.SimpleAction;
import com.starlightc.ucropplus.model.RectFInfo;
import com.starlightc.ucropplus.model.RectInfo;
import com.starlightc.ucropplus.model.RemoteTextRenderInfo;
import com.starlightc.ucropplus.model.StickerStateInfo;
import com.starlightc.ucropplus.model.StrokeObj;
import com.starlightc.ucropplus.model.TextRenderInfo;
import com.starlightc.ucropplus.model.TextTypefaceInfo;
import com.starlightc.ucropplus.model.puzzle.HBRectF;
import com.starlightc.ucropplus.model.puzzle.TextPuzzle;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.starlightc.ucropplus.util.RectUtil;
import com.starlightc.ucropplus.util.TypefaceUtil;
import dl.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.z;

/* JADX INFO: compiled from: TextStickerItem.kt */
/* JADX INFO: loaded from: classes4.dex */
@t0({"SMAP\nTextStickerItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextStickerItem.kt\ncom/starlightc/ucropplus/view/widget/stickeritem/TextStickerItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Matrix.kt\nandroidx/core/graphics/MatrixKt\n*L\n1#1,392:1\n1#2:393\n1#2:395\n32#3:394\n*S KotlinDebug\n*F\n+ 1 TextStickerItem.kt\ncom/starlightc/ucropplus/view/widget/stickeritem/TextStickerItem\n*L\n379#1:395\n379#1:394\n*E\n"})
public final class TextStickerItem extends BaseStickerItem {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final z strokePaint$delegate;

    @d
    private String text;

    @d
    private ArrayList<String> textContent;

    @d
    private final Paint textHelpBoxPaint;

    @d
    private final z textPaint$delegate;

    @d
    private TextRenderInfo textRenderInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStickerItem(@d Context context) {
        super(context);
        f0.p(context, "context");
        this.text = "";
        this.textContent = new ArrayList<>();
        this.textRenderInfo = new TextRenderInfo(0, false, 0.0f, 0.0f, null, 0, 0, 0.0f, null, null, false, null, false, 8191, null);
        this.textPaint$delegate = b0.c(new yh.a<TextPaint>() { // from class: com.starlightc.ucropplus.view.widget.stickeritem.TextStickerItem$textPaint$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @d
            public final TextPaint invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51246, new Class[0], TextPaint.class);
                return patchProxyResultProxy.isSupported ? (TextPaint) patchProxyResultProxy.result : new TextPaint(1);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.text.TextPaint, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ TextPaint invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51247, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
        this.strokePaint$delegate = b0.c(new yh.a<TextPaint>() { // from class: com.starlightc.ucropplus.view.widget.stickeritem.TextStickerItem$strokePaint$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @d
            public final TextPaint invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51244, new Class[0], TextPaint.class);
                return patchProxyResultProxy.isSupported ? (TextPaint) patchProxyResultProxy.result : new TextPaint(1);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.text.TextPaint, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ TextPaint invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51245, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
        Paint paint = new Paint();
        this.textHelpBoxPaint = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(3.0f);
        paint.setPathEffect(new DashPathEffect(new float[]{12.0f, 12.0f}, 0.0f));
    }

    private final void drawTextSticker(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51240, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        drawTextContent(canvas);
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
            canvas.drawRoundRect(helpBox3, 0.0f, 0.0f, this.textHelpBoxPaint);
            BaseStickerItem.Companion companion = BaseStickerItem.Companion;
            Bitmap deleteBit = companion.getDeleteBit();
            f0.m(deleteBit);
            Rect helpToolsRect = getHelpToolsRect();
            RectF deleteRect = getDeleteRect();
            f0.m(deleteRect);
            canvas.drawBitmap(deleteBit, helpToolsRect, deleteRect, (Paint) null);
            Bitmap rotateBit = companion.getRotateBit();
            f0.m(rotateBit);
            Rect helpToolsRect2 = getHelpToolsRect();
            RectF rotateRect = getRotateRect();
            f0.m(rotateRect);
            canvas.drawBitmap(rotateBit, helpToolsRect2, rotateRect, (Paint) null);
            Bitmap editBit = companion.getEditBit();
            f0.m(editBit);
            Rect helpToolsRect3 = getHelpToolsRect();
            RectF editRect = getEditRect();
            f0.m(editRect);
            canvas.drawBitmap(editBit, helpToolsRect3, editRect, (Paint) null);
            canvas.restore();
        }
    }

    private final void syncInfo(StickerStateInfo stickerStateInfo) {
        Matrix matrix;
        if (PatchProxy.proxy(new Object[]{stickerStateInfo}, this, changeQuickRedirect, false, 51242, new Class[]{StickerStateInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        this.text = stickerStateInfo.getText();
        this.textContent = stickerStateInfo.getTextContent();
        this.textRenderInfo = stickerStateInfo.getTextRenderInfo();
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

    private final void updateTextDstRect(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 51233, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported || getDstRect() == null) {
            return;
        }
        RectF dstRect = getDstRect();
        f0.m(dstRect);
        float f10 = dstRect.left;
        RectF dstRect2 = getDstRect();
        f0.m(dstRect2);
        float f11 = dstRect2.top;
        RectF dstRect3 = getDstRect();
        f0.m(dstRect3);
        dstRect3.set(f10, f11, f10, f11);
        getTextPaint().setTextSize((convertTextSize(this.textRenderInfo.getTextSize()) * getScale()) / 1.3f);
        getStrokePaint().setTextSize((convertTextSize(this.textRenderInfo.getTextSize()) * getScale()) / 1.3f);
        Typeface typeface = TypefaceUtil.INSTANCE.getTypeface(getContext(), this.textRenderInfo.getTypeface(), this.textRenderInfo.getTypefaceName(), this.textRenderInfo.isRemoteTypeface());
        getTextPaint().setTypeface(typeface);
        getStrokePaint().setTypeface(typeface);
        Rect rect = new Rect();
        Paint.FontMetricsInt fontMetricsInt = getTextPaint().getFontMetricsInt();
        f0.o(fontMetricsInt, "getFontMetricsInt(...)");
        int iAbs = Math.abs(fontMetricsInt.ascent) + Math.abs(fontMetricsInt.descent);
        int size = this.textContent.size();
        int iWidth = 0;
        for (int i10 = 0; i10 < size; i10++) {
            String str = this.textContent.get(i10);
            f0.o(str, "get(...)");
            String str2 = str;
            getTextPaint().getTextBounds(str2, 0, str2.length(), rect);
            if (rect.height() <= 0) {
                rect.set(0, 0, 0, iAbs);
            }
            if (rect.width() > iWidth) {
                iWidth = rect.width();
            }
            RectUtil rectUtil = RectUtil.INSTANCE;
            RectF dstRect4 = getDstRect();
            f0.m(dstRect4);
            rectUtil.rectAddV(dstRect4, rect, 0, iAbs);
        }
        int height = view.getHeight() >> 1;
        RectF dstRect5 = getDstRect();
        f0.m(dstRect5);
        int iHeight = (height - (((int) dstRect5.height()) >> 1)) - ((int) f11);
        int width = view.getWidth() >> 1;
        RectF dstRect6 = getDstRect();
        f0.m(dstRect6);
        int iWidth2 = (width - (((int) dstRect6.width()) >> 1)) - ((int) f10);
        if (this.textRenderInfo.getShadowEnable()) {
            if (this.textRenderInfo.getShadowOffsetY() >= 0.0f) {
                RectF dstRect7 = getDstRect();
                f0.m(dstRect7);
                float f12 = dstRect7.bottom;
                convertTextSize(this.textRenderInfo.getShadowOffsetY());
            } else {
                RectF dstRect8 = getDstRect();
                f0.m(dstRect8);
                float f13 = dstRect8.top;
                convertTextSize(this.textRenderInfo.getShadowOffsetY());
            }
            if (this.textRenderInfo.getShadowOffsetX() >= 0.0f) {
                RectF dstRect9 = getDstRect();
                f0.m(dstRect9);
                float f14 = dstRect9.right;
                convertTextSize(this.textRenderInfo.getShadowOffsetX());
            } else {
                RectF dstRect10 = getDstRect();
                f0.m(dstRect10);
                float f15 = dstRect10.left;
                convertTextSize(this.textRenderInfo.getShadowOffsetX());
            }
        }
        if (!z10) {
            refreshHelpBoxRect();
            refreshDetectRects();
        } else {
            RectF dstRect11 = getDstRect();
            f0.m(dstRect11);
            dstRect11.offset(iWidth2, iHeight);
        }
    }

    @Override // com.starlightc.ucropplus.view.widget.stickeritem.BaseStickerItem
    public void draw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51238, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        drawTextSticker(canvas);
    }

    public final void drawTextContent(@d Canvas canvas) {
        float fCenterY;
        int i10 = 1;
        int i11 = 0;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51239, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        canvas.save();
        float rotateAngle = getRotateAngle();
        RectF helpBox = getHelpBox();
        f0.m(helpBox);
        float fCenterX = helpBox.centerX();
        RectF helpBox2 = getHelpBox();
        f0.m(helpBox2);
        canvas.rotate(rotateAngle, fCenterX, helpBox2.centerY());
        float[] fArr = new float[9];
        Matrix matrix = getMatrix();
        if (matrix != null) {
            matrix.getValues(fArr);
        }
        int i12 = 0;
        for (String str : this.textContent) {
            int i13 = i12 + 1;
            float fConvertTextSize = (convertTextSize(this.textRenderInfo.getTextSize()) * getScale()) / 1.3f;
            getTextPaint().setTextSize(fConvertTextSize);
            getStrokePaint().setTextSize(fConvertTextSize);
            Paint.FontMetrics fontMetrics = getTextPaint().getFontMetrics();
            if (this.textContent.size() > i10) {
                RectF dstRect = getDstRect();
                f0.m(dstRect);
                fCenterY = dstRect.top + ((i12 + 0.5f) * (Math.abs(fontMetrics.descent) + Math.abs(fontMetrics.ascent)));
            } else {
                RectF dstRect2 = getDstRect();
                f0.m(dstRect2);
                fCenterY = dstRect2.centerY();
            }
            RectF dstRect3 = getDstRect();
            f0.m(dstRect3);
            float f10 = dstRect3.left;
            float f11 = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            float scale = this.textRenderInfo.getUseRate() ? getScale() * 2.0f : (this.textRenderInfo.getTextSize() / 23.0f) * getScale();
            List[] listArr = new List[i10];
            listArr[i11] = this.textRenderInfo.getStrokeList();
            if (!c.w(listArr)) {
                float stroke_width = 0.0f;
                ArrayList<StrokeObj> strokeList = this.textRenderInfo.getStrokeList();
                f0.m(strokeList);
                Iterator<StrokeObj> it = strokeList.iterator();
                while (it.hasNext()) {
                    stroke_width += it.next().getStroke_width();
                }
                ArrayList<StrokeObj> strokeList2 = this.textRenderInfo.getStrokeList();
                f0.m(strokeList2);
                int size = strokeList2.size();
                for (int i14 = i11; i14 < size; i14++) {
                    ArrayList<StrokeObj> strokeList3 = this.textRenderInfo.getStrokeList();
                    f0.m(strokeList3);
                    StrokeObj strokeObj = strokeList3.get(i14);
                    f0.o(strokeObj, "get(...)");
                    StrokeObj strokeObj2 = strokeObj;
                    getStrokePaint().setColor(l.g(strokeObj2.getStroke_color()));
                    getStrokePaint().setStyle(Paint.Style.FILL_AND_STROKE);
                    getStrokePaint().setStrokeWidth(convertTextSize(stroke_width) * scale);
                    getStrokePaint().setStrokeJoin(Paint.Join.ROUND);
                    if (i14 == 0 && this.textRenderInfo.getShadowEnable()) {
                        canvas.drawText(str, ((convertTextSize(this.textRenderInfo.getShadowOffsetX()) * scale) / 2.0f) + f10, ((convertTextSize(this.textRenderInfo.getShadowOffsetY()) * scale) / 2.0f) + f11, getStrokePaint());
                    }
                    canvas.drawText(str, f10, f11, getStrokePaint());
                    stroke_width -= strokeObj2.getStroke_width();
                }
            } else if (this.textRenderInfo.getShadowEnable()) {
                getTextPaint().setColor(this.textRenderInfo.getShadowColor());
                canvas.drawText(str, ((convertTextSize(this.textRenderInfo.getShadowOffsetX()) * scale) / 2.0f) + f10, ((convertTextSize(this.textRenderInfo.getShadowOffsetY()) * scale) / 2.0f) + f11, getTextPaint());
            }
            getTextPaint().setColor(this.textRenderInfo.getTextColor());
            canvas.drawText(str, f10, f11, getTextPaint());
            i12 = i13;
            i10 = 1;
            i11 = 0;
        }
        canvas.restore();
    }

    @Override // com.starlightc.ucropplus.view.widget.stickeritem.BaseStickerItem
    @d
    public StickerStateInfo getStateInfo() {
        float[] fArr;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51243, new Class[0], StickerStateInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (StickerStateInfo) patchProxyResultProxy.result;
        }
        BaseStickerItem.StickerType stickerType = BaseStickerItem.StickerType.Text;
        String str = this.text;
        ArrayList<String> arrayList = this.textContent;
        TextRenderInfo textRenderInfo = this.textRenderInfo;
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
        return new StickerStateInfo(stickerType, str, arrayList, textRenderInfo, null, rectInfo, rectFInfo, rectInfo2, rectFInfo2, rectFInfo3, rectFInfo4, rectFInfo5, fArr, rotateAngle, scale, zIsDrawHelpTool, initWidth, rectFInfo6, rectFInfo7, detectEditRect != null ? new RectFInfo(detectEditRect) : null, getCanEdit(), getCanDelete(), 0.0f, 0.0f, 0.0f, 0.0f, null, 0, 264241168, null);
    }

    @d
    public final TextPaint getStrokePaint() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51232, new Class[0], TextPaint.class);
        return patchProxyResultProxy.isSupported ? (TextPaint) patchProxyResultProxy.result : (TextPaint) this.strokePaint$delegate.getValue();
    }

    @d
    public final String getText() {
        return this.text;
    }

    @d
    public final ArrayList<String> getTextContent() {
        return this.textContent;
    }

    @d
    public final Paint getTextHelpBoxPaint() {
        return this.textHelpBoxPaint;
    }

    @d
    public final TextPaint getTextPaint() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51231, new Class[0], TextPaint.class);
        return patchProxyResultProxy.isSupported ? (TextPaint) patchProxyResultProxy.result : (TextPaint) this.textPaint$delegate.getValue();
    }

    @d
    public final TextRenderInfo getTextRenderInfo() {
        return this.textRenderInfo;
    }

    @Override // com.starlightc.ucropplus.view.widget.stickeritem.BaseStickerItem
    public void initWithStateInfo(@d StickerStateInfo info, @d View parentView, @d SimpleAction action) {
        if (PatchProxy.proxy(new Object[]{info, parentView, action}, this, changeQuickRedirect, false, 51241, new Class[]{StickerStateInfo.class, View.class, SimpleAction.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(info, "info");
        f0.p(parentView, "parentView");
        f0.p(action, "action");
        setParentH(ViewUtils.V(parentView));
        setParentW(ViewUtils.W(parentView));
        this.textRenderInfo.setTypeface(info.getTextRenderInfo().getTypeface());
        this.textRenderInfo.setTypefaceName(info.getTextRenderInfo().getTypefaceName());
        this.textRenderInfo.setRemoteTypeface(info.getTextRenderInfo().isRemoteTypeface());
        textInit(parentView);
        syncInfo(info);
        action.doAction(null);
    }

    public final void refreshTextLayout(@d View parentView) {
        if (PatchProxy.proxy(new Object[]{parentView}, this, changeQuickRedirect, false, 51237, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(parentView, "parentView");
        updateTextDstRect(parentView, false);
    }

    public final void setText(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 51228, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.text = str;
    }

    public final void setTextContent(@d ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 51229, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.textContent = arrayList;
    }

    public final void setTextRenderInfo(@d TextRenderInfo textRenderInfo) {
        if (PatchProxy.proxy(new Object[]{textRenderInfo}, this, changeQuickRedirect, false, 51230, new Class[]{TextRenderInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textRenderInfo, "<set-?>");
        this.textRenderInfo = textRenderInfo;
    }

    public final void textInit(@d View parentView) {
        if (PatchProxy.proxy(new Object[]{parentView}, this, changeQuickRedirect, false, 51234, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(parentView, "parentView");
        setParentH(ViewUtils.V(parentView));
        setParentW(ViewUtils.W(parentView));
        this.textContent.clear();
        this.textContent.add(getContext().getString(R.string.text_sticker_editor_hint));
        setDstRect(new RectF(0.0f, 0.0f, 0.0f, 0.0f));
        this.textRenderInfo.setTextSize(32.0f);
        updateTextDstRect(parentView, true);
        setMatrix(new Matrix());
        Matrix matrix = getMatrix();
        f0.m(matrix);
        RectF dstRect = getDstRect();
        f0.m(dstRect);
        float f10 = dstRect.left;
        RectF dstRect2 = getDstRect();
        f0.m(dstRect2);
        matrix.postTranslate(f10, dstRect2.top);
        RectF dstRect3 = getDstRect();
        f0.m(dstRect3);
        setInitWidth(dstRect3.width());
        setDrawHelpTool(true);
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
        RectF helpBox9 = getHelpBox();
        f0.m(helpBox9);
        float button_width7 = helpBox9.right - companion.getBUTTON_WIDTH();
        RectF helpBox10 = getHelpBox();
        f0.m(helpBox10);
        float button_width8 = helpBox10.top - companion.getBUTTON_WIDTH();
        RectF helpBox11 = getHelpBox();
        f0.m(helpBox11);
        float button_width9 = helpBox11.right + companion.getBUTTON_WIDTH();
        RectF helpBox12 = getHelpBox();
        f0.m(helpBox12);
        setEditRect(new RectF(button_width7, button_width8, button_width9, helpBox12.top + companion.getBUTTON_WIDTH()));
        setDetectRotateRect(new RectF(getRotateRect()));
        setDetectDeleteRect(new RectF(getDeleteRect()));
        setDetectEditRect(new RectF(getEditRect()));
    }

    public final void textInitWithInfo(@d View parentView, @d TextPuzzle textPuzzle) {
        TextTypefaceInfo next;
        if (PatchProxy.proxy(new Object[]{parentView, textPuzzle}, this, changeQuickRedirect, false, 51235, new Class[]{View.class, TextPuzzle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(parentView, "parentView");
        f0.p(textPuzzle, "textPuzzle");
        setParentH(ViewUtils.V(parentView));
        setParentW(ViewUtils.W(parentView));
        this.textContent.clear();
        ArrayList<String> arrayList = this.textContent;
        String text = textPuzzle.getText();
        if (text == null) {
            text = getContext().getString(R.string.text_sticker_editor_hint);
            f0.o(text, "getString(...)");
        }
        arrayList.addAll(StringsKt__StringsKt.U4(text, new String[]{"\n"}, false, 0, 6, null));
        String text2 = textPuzzle.getText();
        if (text2 != null) {
            this.text = text2;
        }
        setRotateAngle(n.p(textPuzzle.getRotation()));
        HBRectF rect = textPuzzle.getRect();
        setDstRect(rect != null ? rect.toPxRectF(getContext()) : null);
        RemoteTextRenderInfo advance_typeface = textPuzzle.getAdvance_typeface();
        if (advance_typeface != null) {
            this.textRenderInfo = advance_typeface.toTextRenderInfo();
        }
        String typeface_name = textPuzzle.getTypeface_name();
        if (typeface_name != null && TypefaceUtil.INSTANCE.getCachedRemoteTypeface(typeface_name) != null) {
            Iterator<TextTypefaceInfo> it = UCropPlusActivity.Companion.getRemoteTFList().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!f0.g(next.getName(), typeface_name));
            this.textRenderInfo.setTypeface(next != null ? next.getTypeface() : null);
            this.textRenderInfo.setTypefaceName(typeface_name);
            this.textRenderInfo.setRemoteTypeface(true);
        }
        if (!c.u(textPuzzle.getTextsize())) {
            this.textRenderInfo.setTextSize(n.p(textPuzzle.getTextsize()) * 1.3f);
        }
        setHelpBox(new RectF(getDstRect()));
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
        float rotateAngle = getRotateAngle();
        RectF dstRect3 = getDstRect();
        f0.m(dstRect3);
        float fCenterX = dstRect3.centerX();
        RectF dstRect4 = getDstRect();
        f0.m(dstRect4);
        matrix2.postRotate(rotateAngle, fCenterX, dstRect4.centerY());
        RectF dstRect5 = getDstRect();
        f0.m(dstRect5);
        setInitWidth(dstRect5.width());
        setDrawHelpTool(true);
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
        RectF helpBox9 = getHelpBox();
        f0.m(helpBox9);
        float button_width7 = helpBox9.right - companion.getBUTTON_WIDTH();
        RectF helpBox10 = getHelpBox();
        f0.m(helpBox10);
        float button_width8 = helpBox10.top - companion.getBUTTON_WIDTH();
        RectF helpBox11 = getHelpBox();
        f0.m(helpBox11);
        float button_width9 = helpBox11.right + companion.getBUTTON_WIDTH();
        RectF helpBox12 = getHelpBox();
        f0.m(helpBox12);
        setEditRect(new RectF(button_width7, button_width8, button_width9, helpBox12.top + companion.getBUTTON_WIDTH()));
        setDetectRotateRect(new RectF(getRotateRect()));
        setDetectDeleteRect(new RectF(getDeleteRect()));
        setDetectEditRect(new RectF(getEditRect()));
        updateTextDstRect(parentView, false);
    }

    public final void updateText(@d View parentView, @d String text) {
        if (PatchProxy.proxy(new Object[]{parentView, text}, this, changeQuickRedirect, false, 51236, new Class[]{View.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(parentView, "parentView");
        f0.p(text, "text");
        this.textContent.clear();
        if (TextUtils.isEmpty(text)) {
            this.text = "请输入文字";
            this.textContent.add("请输入文字");
        } else {
            this.text = text;
            this.textContent.addAll(StringsKt__StringsKt.U4(text, new String[]{"\n"}, false, 0, 6, null));
        }
        updateTextDstRect(parentView, false);
    }
}
