package com.starlightc.ucropplus.view.widget.stickeritem;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.v;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.callback.SimpleAction;
import com.starlightc.ucropplus.model.StickerStateInfo;
import com.starlightc.ucropplus.util.DeviceServiceUtil;
import com.starlightc.ucropplus.util.RectUtil;
import dl.d;
import dl.e;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BaseStickerItem.kt */
/* JADX INFO: loaded from: classes4.dex */
public class BaseStickerItem {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private static Bitmap deleteBit;

    @e
    private static Bitmap editBit;

    @e
    private static Bitmap rotateBit;
    private boolean canDelete;
    private boolean canEdit;

    @d
    private final Context context;

    @d
    private Paint debugPaint;

    @e
    private RectF deleteRect;

    @e
    private RectF detectDeleteRect;

    @e
    private RectF detectEditRect;

    @e
    private RectF detectRotateRect;

    @d
    private Paint dstPaint;

    @e
    private RectF dstRect;

    @e
    private RectF editRect;
    private boolean forbidMove;
    private boolean forbidRotate;

    @d
    private final Handler handler;

    @e
    private RectF helpBox;

    @d
    private final Paint helpBoxPaint;

    @e
    private Rect helpToolsRect;
    private float initWidth;
    private boolean isDrawHelpTool;
    private long lastVirbTime;

    @e
    private Matrix matrix;
    private int parentH;
    private int parentW;
    private float rotateAngle;

    @e
    private RectF rotateRect;
    private float scale;
    private boolean showAxisX;
    private boolean showAxisY;

    @e
    private Rect srcRect;

    @d
    public static final Companion Companion = new Companion(null);
    private static final int TEXT_PADDING = 12;
    private static final float MIN_SCALE = 0.15f;
    private static final int HELP_BOX_PAD = 25;
    private static final int BUTTON_WIDTH = 54;

    /* JADX INFO: compiled from: BaseStickerItem.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final int getBUTTON_WIDTH() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51200, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : BaseStickerItem.BUTTON_WIDTH;
        }

        @e
        public final Bitmap getDeleteBit() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51201, new Class[0], Bitmap.class);
            return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : BaseStickerItem.deleteBit;
        }

        @e
        public final Bitmap getEditBit() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51205, new Class[0], Bitmap.class);
            return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : BaseStickerItem.editBit;
        }

        public final int getHELP_BOX_PAD() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51199, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : BaseStickerItem.HELP_BOX_PAD;
        }

        public final float getMIN_SCALE() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51198, new Class[0], Float.TYPE);
            return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : BaseStickerItem.MIN_SCALE;
        }

        @e
        public final Bitmap getRotateBit() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51203, new Class[0], Bitmap.class);
            return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : BaseStickerItem.rotateBit;
        }

        public final int getTEXT_PADDING() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51197, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : BaseStickerItem.TEXT_PADDING;
        }

        public final void setDeleteBit(@e Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 51202, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseStickerItem.deleteBit = bitmap;
        }

        public final void setEditBit(@e Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 51206, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseStickerItem.editBit = bitmap;
        }

        public final void setRotateBit(@e Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 51204, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseStickerItem.rotateBit = bitmap;
        }
    }

    /* JADX INFO: compiled from: BaseStickerItem.kt */
    public enum StickerType {
        Bitmap,
        Text,
        Label;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public static kotlin.enums.a<StickerType> getEntries() {
            return $ENTRIES;
        }

        public static StickerType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 51208, new Class[]{String.class}, StickerType.class);
            return (StickerType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(StickerType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static StickerType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 51207, new Class[0], StickerType[].class);
            return (StickerType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    public BaseStickerItem(@d Context context) {
        f0.p(context, "context");
        this.context = context;
        this.scale = 1.0f;
        this.dstPaint = new Paint();
        Paint paint = new Paint();
        this.helpBoxPaint = paint;
        this.debugPaint = new Paint();
        this.canEdit = true;
        this.canDelete = true;
        this.handler = new Handler(Looper.getMainLooper());
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(3.0f);
        Paint paint2 = new Paint();
        this.dstPaint = paint2;
        paint2.setColor(y1.a.f141526c);
        this.dstPaint.setAlpha(120);
        Paint paint3 = new Paint();
        this.debugPaint = paint3;
        paint3.setColor(-16711936);
        this.debugPaint.setAlpha(120);
        if (deleteBit == null) {
            setDeleteIcon(R.drawable.ucp_sticker_delete);
        }
        if (rotateBit == null) {
            setRotateIcon(R.drawable.ucp_sticker_rotate);
        }
        if (this.editRect == null) {
            setEditIcon(R.drawable.ucp_sticker_edit);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addRotation$lambda$1(BaseStickerItem this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, 51196, new Class[]{BaseStickerItem.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.forbidRotate = false;
    }

    private final void forbidMove() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51178, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.forbidMove = true;
        DeviceServiceUtil.INSTANCE.vibrate(this.context, 50L);
        this.handler.postDelayed(new Runnable() { // from class: com.starlightc.ucropplus.view.widget.stickeritem.a
            @Override // java.lang.Runnable
            public final void run() {
                BaseStickerItem.forbidMove$lambda$0(this.f98151b);
            }
        }, 400L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forbidMove$lambda$0(BaseStickerItem this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, 51195, new Class[]{BaseStickerItem.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.forbidMove = false;
    }

    public static /* synthetic */ void updatePos$default(BaseStickerItem baseStickerItem, float f10, float f11, boolean z10, int i10, Object obj) {
        Object[] objArr = {baseStickerItem, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 51177, new Class[]{BaseStickerItem.class, cls, cls, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updatePos");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        baseStickerItem.updatePos(f10, f11, z10);
    }

    public static /* synthetic */ void updateRotateAndScale$default(BaseStickerItem baseStickerItem, float f10, float f11, boolean z10, int i10, Object obj) {
        Object[] objArr = {baseStickerItem, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 51180, new Class[]{BaseStickerItem.class, cls, cls, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRotateAndScale");
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        baseStickerItem.updateRotateAndScale(f10, f11, z10);
    }

    public final void addRotation(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 51187, new Class[]{Float.TYPE}, Void.TYPE).isSupported || this.forbidRotate) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!isInSpecialAngle(f10) || jCurrentTimeMillis - this.lastVirbTime <= 500 || Math.abs(f10) >= 5.0f) {
            this.rotateAngle += f10;
            Matrix matrix = this.matrix;
            f0.m(matrix);
            RectF rectF = this.dstRect;
            f0.m(rectF);
            float fCenterX = rectF.centerX();
            RectF rectF2 = this.dstRect;
            f0.m(rectF2);
            matrix.postRotate(f10, fCenterX, rectF2.centerY());
        } else {
            fitAngle(f10);
            DeviceServiceUtil.INSTANCE.vibrate(this.context, 50L);
            this.lastVirbTime = jCurrentTimeMillis;
            this.forbidRotate = true;
            this.handler.postDelayed(new Runnable() { // from class: com.starlightc.ucropplus.view.widget.stickeritem.b
                @Override // java.lang.Runnable
                public final void run() {
                    BaseStickerItem.addRotation$lambda$1(this.f98152b);
                }
            }, 300L);
        }
        refreshDetectRects();
    }

    public final float convertTextSize(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51183, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : TypedValue.applyDimension(1, f10, this.context.getResources().getDisplayMetrics()) + 0.5f;
    }

    public void draw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51192, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
    }

    public final void fitAngle(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 51191, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        float f11 = this.rotateAngle + f10;
        this.rotateAngle = f11;
        float f12 = f11 % 45.0f;
        float fAbs = Math.abs(f12);
        float f13 = fAbs > 40.0f ? 45.0f - fAbs : fAbs;
        if ((f12 < 0.0f && fAbs < 5.0f) || (f12 > 0.0f && fAbs > 40.0f)) {
            f13 *= -1;
        }
        this.rotateAngle -= f13;
        Matrix matrix = this.matrix;
        f0.m(matrix);
        float f14 = f10 - f13;
        RectF rectF = this.dstRect;
        f0.m(rectF);
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.dstRect;
        f0.m(rectF2);
        matrix.postRotate(f14, fCenterX, rectF2.centerY());
    }

    public final boolean getCanDelete() {
        return this.canDelete;
    }

    public final boolean getCanEdit() {
        return this.canEdit;
    }

    @d
    public final Context getContext() {
        return this.context;
    }

    @d
    public final Paint getDebugPaint() {
        return this.debugPaint;
    }

    @e
    public final RectF getDeleteRect() {
        return this.deleteRect;
    }

    @e
    public final RectF getDetectDeleteRect() {
        return this.detectDeleteRect;
    }

    @e
    public final RectF getDetectEditRect() {
        return this.detectEditRect;
    }

    @e
    public final RectF getDetectRotateRect() {
        return this.detectRotateRect;
    }

    @d
    public final Paint getDstPaint() {
        return this.dstPaint;
    }

    @e
    public final RectF getDstRect() {
        return this.dstRect;
    }

    @e
    public final RectF getEditRect() {
        return this.editRect;
    }

    public final boolean getForbidMove() {
        return this.forbidMove;
    }

    public final boolean getForbidRotate() {
        return this.forbidRotate;
    }

    @d
    public final Handler getHandler() {
        return this.handler;
    }

    @e
    public final RectF getHelpBox() {
        return this.helpBox;
    }

    @d
    public final Paint getHelpBoxPaint() {
        return this.helpBoxPaint;
    }

    @e
    public final Rect getHelpToolsRect() {
        return this.helpToolsRect;
    }

    public final float getInitWidth() {
        return this.initWidth;
    }

    public final long getLastVirbTime() {
        return this.lastVirbTime;
    }

    @e
    public final Matrix getMatrix() {
        return this.matrix;
    }

    public final int getParentH() {
        return this.parentH;
    }

    public final int getParentW() {
        return this.parentW;
    }

    public final float getRotateAngle() {
        return this.rotateAngle;
    }

    @e
    public final RectF getRotateRect() {
        return this.rotateRect;
    }

    public final float getScale() {
        return this.scale;
    }

    public final boolean getShowAxisX() {
        return this.showAxisX;
    }

    public final boolean getShowAxisY() {
        return this.showAxisY;
    }

    @e
    public final Rect getSrcRect() {
        return this.srcRect;
    }

    @d
    public StickerStateInfo getStateInfo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51194, new Class[0], StickerStateInfo.class);
        return patchProxyResultProxy.isSupported ? (StickerStateInfo) patchProxyResultProxy.result : new StickerStateInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, false, 0.0f, null, null, null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, 268435455, null);
    }

    public void initWithStateInfo(@d StickerStateInfo info, @d View parentView, @d SimpleAction action) {
        if (PatchProxy.proxy(new Object[]{info, parentView, action}, this, changeQuickRedirect, false, 51193, new Class[]{StickerStateInfo.class, View.class, SimpleAction.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(info, "info");
        f0.p(parentView, "parentView");
        f0.p(action, "action");
    }

    public final boolean isDrawHelpTool() {
        return this.isDrawHelpTool;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    public final boolean isInSpecialAngle(float f10) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 51190, new Class[]{Float.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        float f11 = (this.rotateAngle + f10) % 45.0f;
        float fAbs = Math.abs(f11);
        if (fAbs > 40.0f) {
            if (f11 >= 0.0f ? f10 <= 0.0f : f10 >= 0.0f) {
                z10 = false;
            }
        } else {
            if (fAbs >= 5.0f || fAbs <= 0.0f) {
                return false;
            }
            if (f11 >= 0.0f ? f10 >= 0.0f : f10 <= 0.0f) {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean isTextSticker() {
        return this instanceof TextStickerItem;
    }

    public boolean needHelpBox() {
        return true;
    }

    public final void refreshDetectRects() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51181, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RectUtil rectUtil = RectUtil.INSTANCE;
        RectF rectF = this.detectRotateRect;
        f0.m(rectF);
        RectF rectF2 = this.dstRect;
        f0.m(rectF2);
        float fCenterX = rectF2.centerX();
        RectF rectF3 = this.dstRect;
        f0.m(rectF3);
        rectUtil.rotateRect(rectF, fCenterX, rectF3.centerY(), this.rotateAngle);
        RectF rectF4 = this.detectDeleteRect;
        f0.m(rectF4);
        RectF rectF5 = this.dstRect;
        f0.m(rectF5);
        float fCenterX2 = rectF5.centerX();
        RectF rectF6 = this.dstRect;
        f0.m(rectF6);
        rectUtil.rotateRect(rectF4, fCenterX2, rectF6.centerY(), this.rotateAngle);
        RectF rectF7 = this.detectEditRect;
        if (rectF7 != null) {
            f0.m(rectF7);
            RectF rectF8 = this.dstRect;
            f0.m(rectF8);
            float fCenterX3 = rectF8.centerX();
            RectF rectF9 = this.dstRect;
            f0.m(rectF9);
            rectUtil.rotateRect(rectF7, fCenterX3, rectF9.centerY(), this.rotateAngle);
        }
    }

    public final void refreshHelpBoxRect() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51182, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RectF rectF = this.helpBox;
        f0.m(rectF);
        RectF rectF2 = this.dstRect;
        f0.m(rectF2);
        rectF.set(rectF2);
        updateHelpBoxRect();
        RectF rectF3 = this.rotateRect;
        f0.m(rectF3);
        RectF rectF4 = this.helpBox;
        f0.m(rectF4);
        float f10 = rectF4.right;
        int i10 = BUTTON_WIDTH;
        RectF rectF5 = this.helpBox;
        f0.m(rectF5);
        rectF3.offsetTo(f10 - i10, rectF5.bottom - i10);
        RectF rectF6 = this.deleteRect;
        f0.m(rectF6);
        RectF rectF7 = this.helpBox;
        f0.m(rectF7);
        float f11 = rectF7.left - i10;
        RectF rectF8 = this.helpBox;
        f0.m(rectF8);
        rectF6.offsetTo(f11, rectF8.top - i10);
        RectF rectF9 = this.editRect;
        if (rectF9 != null) {
            RectF rectF10 = this.helpBox;
            f0.m(rectF10);
            float f12 = rectF10.right - i10;
            RectF rectF11 = this.helpBox;
            f0.m(rectF11);
            rectF9.offsetTo(f12, rectF11.top - i10);
        }
        RectF rectF12 = this.detectRotateRect;
        f0.m(rectF12);
        RectF rectF13 = this.helpBox;
        f0.m(rectF13);
        float f13 = rectF13.right - i10;
        RectF rectF14 = this.helpBox;
        f0.m(rectF14);
        rectF12.offsetTo(f13, rectF14.bottom - i10);
        RectF rectF15 = this.detectDeleteRect;
        f0.m(rectF15);
        RectF rectF16 = this.helpBox;
        f0.m(rectF16);
        float f14 = rectF16.left - i10;
        RectF rectF17 = this.helpBox;
        f0.m(rectF17);
        rectF15.offsetTo(f14, rectF17.top - i10);
        RectF rectF18 = this.detectEditRect;
        if (rectF18 != null) {
            RectF rectF19 = this.helpBox;
            f0.m(rectF19);
            float f15 = rectF19.right - i10;
            RectF rectF20 = this.helpBox;
            f0.m(rectF20);
            rectF18.offsetTo(f15, rectF20.top - i10);
        }
    }

    public final void scale(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 51188, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Matrix matrix = this.matrix;
        f0.m(matrix);
        RectF rectF = this.dstRect;
        f0.m(rectF);
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.dstRect;
        f0.m(rectF2);
        matrix.postScale(f10, f10, fCenterX, rectF2.centerY());
        this.scale *= f10;
        RectUtil rectUtil = RectUtil.INSTANCE;
        RectF rectF3 = this.dstRect;
        f0.m(rectF3);
        rectUtil.scaleRect(rectF3, f10);
    }

    public final void scaleByDifference(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 51189, new Class[]{Float.TYPE}, Void.TYPE).isSupported || this.forbidRotate) {
            return;
        }
        RectF rectF = this.dstRect;
        f0.m(rectF);
        float fWidth = rectF.width() + (f10 * 2);
        RectF rectF2 = this.dstRect;
        f0.m(rectF2);
        float fWidth2 = fWidth / rectF2.width();
        if (this.scale * fWidth2 >= 0.15f) {
            scale(fWidth2);
        }
    }

    public final void setCanDelete(boolean z10) {
        this.canDelete = z10;
    }

    public final void setCanEdit(boolean z10) {
        this.canEdit = z10;
    }

    public final void setDebugPaint(@d Paint paint) {
        if (PatchProxy.proxy(new Object[]{paint}, this, changeQuickRedirect, false, 51174, new Class[]{Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(paint, "<set-?>");
        this.debugPaint = paint;
    }

    public final void setDeleteIcon(@v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51185, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        deleteBit = BitmapFactory.decodeResource(this.context.getResources(), i10);
    }

    public final void setDeleteRect(@e RectF rectF) {
        this.deleteRect = rectF;
    }

    public final void setDetectDeleteRect(@e RectF rectF) {
        this.detectDeleteRect = rectF;
    }

    public final void setDetectEditRect(@e RectF rectF) {
        this.detectEditRect = rectF;
    }

    public final void setDetectRotateRect(@e RectF rectF) {
        this.detectRotateRect = rectF;
    }

    public final void setDrawHelpTool(boolean z10) {
        this.isDrawHelpTool = z10;
    }

    public final void setDstPaint(@d Paint paint) {
        if (PatchProxy.proxy(new Object[]{paint}, this, changeQuickRedirect, false, 51173, new Class[]{Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(paint, "<set-?>");
        this.dstPaint = paint;
    }

    public final void setDstRect(@e RectF rectF) {
        this.dstRect = rectF;
    }

    public final void setEditIcon(@v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51186, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        editBit = BitmapFactory.decodeResource(this.context.getResources(), i10);
    }

    public final void setEditRect(@e RectF rectF) {
        this.editRect = rectF;
    }

    public final void setForbidMove(boolean z10) {
        this.forbidMove = z10;
    }

    public final void setForbidRotate(boolean z10) {
        this.forbidRotate = z10;
    }

    public final void setHelpBox(@e RectF rectF) {
        this.helpBox = rectF;
    }

    public final void setHelpToolsRect(@e Rect rect) {
        this.helpToolsRect = rect;
    }

    public final void setInitWidth(float f10) {
        this.initWidth = f10;
    }

    public final void setLastVirbTime(long j10) {
        this.lastVirbTime = j10;
    }

    public final void setMatrix(@e Matrix matrix) {
        this.matrix = matrix;
    }

    public final void setParentH(int i10) {
        this.parentH = i10;
    }

    public final void setParentW(int i10) {
        this.parentW = i10;
    }

    public final void setRotateAngle(float f10) {
        this.rotateAngle = f10;
    }

    public final void setRotateIcon(@v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51184, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        rotateBit = BitmapFactory.decodeResource(this.context.getResources(), i10);
    }

    public final void setRotateRect(@e RectF rectF) {
        this.rotateRect = rectF;
    }

    public final void setScale(float f10) {
        this.scale = f10;
    }

    public final void setShowAxisX(boolean z10) {
        this.showAxisX = z10;
    }

    public final void setShowAxisY(boolean z10) {
        this.showAxisY = z10;
    }

    public final void setSrcRect(@e Rect rect) {
        this.srcRect = rect;
    }

    public final void updateHelpBoxRect() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51175, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RectF rectF = this.helpBox;
        f0.m(rectF);
        float f10 = rectF.left;
        int i10 = HELP_BOX_PAD;
        rectF.left = f10 - i10;
        RectF rectF2 = this.helpBox;
        f0.m(rectF2);
        rectF2.right += i10;
        RectF rectF3 = this.helpBox;
        f0.m(rectF3);
        rectF3.top -= i10;
        RectF rectF4 = this.helpBox;
        f0.m(rectF4);
        rectF4.bottom += i10;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x0125  */
    /* JADX WARN: Code duplicated, block: B:51:0x0127  */
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Code duplicated, block: B:60:0x015b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0165  */
    /* JADX WARN: Code duplicated, block: B:67:0x0178  */
    /* JADX WARN: Code duplicated, block: B:69:0x0181  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b7  */
    public final void updatePos(float f10, float f11, boolean z10) {
        int i10;
        int i11;
        int i12;
        boolean z11 = false;
        Object[] objArr = {new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51176, new Class[]{cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        RectF rectF = this.dstRect;
        f0.m(rectF);
        float fCenterX = rectF.centerX() + f10;
        RectF rectF2 = this.dstRect;
        f0.m(rectF2);
        float fCenterY = rectF2.centerY() + f11;
        int iF = ViewUtils.f(this.context, 5.0f);
        int i13 = this.parentW;
        float f12 = iF;
        boolean z12 = fCenterX >= (((float) i13) / 2.0f) - f12 && fCenterX <= (((float) i13) / 2.0f) + f12;
        int i14 = this.parentH;
        if (fCenterY >= (i14 / 2.0f) - f12 && fCenterY <= (i14 / 2.0f) + f12) {
            z11 = true;
        }
        if (this.forbidMove) {
            return;
        }
        if (i14 > 0 && i13 > 0 && Math.abs(f10) < 15.0f && Math.abs(f11) < 15.0f) {
            if (z10 && f10 < 0.0f) {
                RectF rectF3 = this.dstRect;
                f0.m(rectF3);
                if (rectF3.left + f10 <= f12) {
                    RectF rectF4 = this.dstRect;
                    f0.m(rectF4);
                    if (rectF4.left + f10 > 0.0f) {
                        RectF rectF5 = this.dstRect;
                        f0.m(rectF5);
                        f10 = -rectF5.left;
                        forbidMove();
                    } else if (!z10) {
                        if (!z10) {
                            if (!z10) {
                                if (f10 < 0.0f) {
                                    i11 = this.parentW;
                                    if (fCenterX < (i11 / 2) + iF) {
                                        i10 = this.parentW;
                                        if (fCenterX > (i10 / 2.0f) - f12) {
                                            f10 += (i10 / 2.0f) - fCenterX;
                                            forbidMove();
                                        }
                                    } else {
                                        i10 = this.parentW;
                                        if (fCenterX > (i10 / 2.0f) - f12) {
                                            f10 += (i10 / 2.0f) - fCenterX;
                                            forbidMove();
                                        }
                                    }
                                } else {
                                    i10 = this.parentW;
                                    if (fCenterX > (i10 / 2.0f) - f12) {
                                        f10 += (i10 / 2.0f) - fCenterX;
                                        forbidMove();
                                    }
                                }
                            } else if (f10 < 0.0f) {
                                i11 = this.parentW;
                                if (fCenterX < (i11 / 2) + iF) {
                                    i10 = this.parentW;
                                    if (fCenterX > (i10 / 2.0f) - f12) {
                                        f10 += (i10 / 2.0f) - fCenterX;
                                        forbidMove();
                                    }
                                } else {
                                    i10 = this.parentW;
                                    if (fCenterX > (i10 / 2.0f) - f12) {
                                        f10 += (i10 / 2.0f) - fCenterX;
                                        forbidMove();
                                    }
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else if (!z10) {
                            if (f10 < 0.0f) {
                                i11 = this.parentW;
                                if (fCenterX < (i11 / 2) + iF) {
                                    i10 = this.parentW;
                                    if (fCenterX > (i10 / 2.0f) - f12) {
                                        f10 += (i10 / 2.0f) - fCenterX;
                                        forbidMove();
                                    }
                                } else {
                                    i10 = this.parentW;
                                    if (fCenterX > (i10 / 2.0f) - f12) {
                                        f10 += (i10 / 2.0f) - fCenterX;
                                        forbidMove();
                                    }
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else if (f10 < 0.0f) {
                            i11 = this.parentW;
                            if (fCenterX < (i11 / 2) + iF) {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else if (!z10) {
                        if (!z10) {
                            if (f10 < 0.0f) {
                                i11 = this.parentW;
                                if (fCenterX < (i11 / 2) + iF) {
                                    i10 = this.parentW;
                                    if (fCenterX > (i10 / 2.0f) - f12) {
                                        f10 += (i10 / 2.0f) - fCenterX;
                                        forbidMove();
                                    }
                                } else {
                                    i10 = this.parentW;
                                    if (fCenterX > (i10 / 2.0f) - f12) {
                                        f10 += (i10 / 2.0f) - fCenterX;
                                        forbidMove();
                                    }
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else if (f10 < 0.0f) {
                            i11 = this.parentW;
                            if (fCenterX < (i11 / 2) + iF) {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else if (!z10) {
                        if (f10 < 0.0f) {
                            i11 = this.parentW;
                            if (fCenterX < (i11 / 2) + iF) {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else if (f10 < 0.0f) {
                        i11 = this.parentW;
                        if (fCenterX < (i11 / 2) + iF) {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    }
                } else if (!z10) {
                    if (!z10) {
                        if (!z10) {
                            if (f10 < 0.0f) {
                                i11 = this.parentW;
                                if (fCenterX < (i11 / 2) + iF) {
                                    i10 = this.parentW;
                                    if (fCenterX > (i10 / 2.0f) - f12) {
                                        f10 += (i10 / 2.0f) - fCenterX;
                                        forbidMove();
                                    }
                                } else {
                                    i10 = this.parentW;
                                    if (fCenterX > (i10 / 2.0f) - f12) {
                                        f10 += (i10 / 2.0f) - fCenterX;
                                        forbidMove();
                                    }
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else if (f10 < 0.0f) {
                            i11 = this.parentW;
                            if (fCenterX < (i11 / 2) + iF) {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else if (!z10) {
                        if (f10 < 0.0f) {
                            i11 = this.parentW;
                            if (fCenterX < (i11 / 2) + iF) {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else if (f10 < 0.0f) {
                        i11 = this.parentW;
                        if (fCenterX < (i11 / 2) + iF) {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    }
                } else if (!z10) {
                    if (!z10) {
                        if (f10 < 0.0f) {
                            i11 = this.parentW;
                            if (fCenterX < (i11 / 2) + iF) {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else if (f10 < 0.0f) {
                        i11 = this.parentW;
                        if (fCenterX < (i11 / 2) + iF) {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    }
                } else if (!z10) {
                    if (f10 < 0.0f) {
                        i11 = this.parentW;
                        if (fCenterX < (i11 / 2) + iF) {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    }
                } else if (f10 < 0.0f) {
                    i11 = this.parentW;
                    if (fCenterX < (i11 / 2) + iF) {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    } else {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    }
                } else {
                    i10 = this.parentW;
                    if (fCenterX > (i10 / 2.0f) - f12) {
                        f10 += (i10 / 2.0f) - fCenterX;
                        forbidMove();
                    }
                }
            } else if (!z10 && f10 < 0.0f) {
                RectF rectF6 = this.dstRect;
                f0.m(rectF6);
                if (rectF6.right + f10 < this.parentW + iF) {
                    RectF rectF7 = this.dstRect;
                    f0.m(rectF7);
                    float f13 = rectF7.right + f10;
                    int i15 = this.parentW;
                    if (f13 > i15) {
                        RectF rectF8 = this.dstRect;
                        f0.m(rectF8);
                        f10 = i15 - rectF8.right;
                        forbidMove();
                    } else if (!z10) {
                        if (!z10) {
                            if (f10 < 0.0f) {
                                i11 = this.parentW;
                                if (fCenterX < (i11 / 2) + iF) {
                                    i10 = this.parentW;
                                    if (fCenterX > (i10 / 2.0f) - f12) {
                                        f10 += (i10 / 2.0f) - fCenterX;
                                        forbidMove();
                                    }
                                } else {
                                    i10 = this.parentW;
                                    if (fCenterX > (i10 / 2.0f) - f12) {
                                        f10 += (i10 / 2.0f) - fCenterX;
                                        forbidMove();
                                    }
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else if (f10 < 0.0f) {
                            i11 = this.parentW;
                            if (fCenterX < (i11 / 2) + iF) {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else if (!z10) {
                        if (f10 < 0.0f) {
                            i11 = this.parentW;
                            if (fCenterX < (i11 / 2) + iF) {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else if (f10 < 0.0f) {
                        i11 = this.parentW;
                        if (fCenterX < (i11 / 2) + iF) {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    }
                } else if (!z10) {
                    if (!z10) {
                        if (f10 < 0.0f) {
                            i11 = this.parentW;
                            if (fCenterX < (i11 / 2) + iF) {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else if (f10 < 0.0f) {
                        i11 = this.parentW;
                        if (fCenterX < (i11 / 2) + iF) {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    }
                } else if (!z10) {
                    if (f10 < 0.0f) {
                        i11 = this.parentW;
                        if (fCenterX < (i11 / 2) + iF) {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    }
                } else if (f10 < 0.0f) {
                    i11 = this.parentW;
                    if (fCenterX < (i11 / 2) + iF) {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    } else {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    }
                } else {
                    i10 = this.parentW;
                    if (fCenterX > (i10 / 2.0f) - f12) {
                        f10 += (i10 / 2.0f) - fCenterX;
                        forbidMove();
                    }
                }
            } else if (!z10 && f10 > 0.0f) {
                RectF rectF9 = this.dstRect;
                f0.m(rectF9);
                if (rectF9.left + f10 >= (-iF)) {
                    RectF rectF10 = this.dstRect;
                    f0.m(rectF10);
                    if (rectF10.left + f10 < 0.0f) {
                        RectF rectF11 = this.dstRect;
                        f0.m(rectF11);
                        f10 = -rectF11.left;
                        forbidMove();
                    } else if (!z10) {
                        if (f10 < 0.0f) {
                            i11 = this.parentW;
                            if (fCenterX < (i11 / 2) + iF) {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            } else {
                                i10 = this.parentW;
                                if (fCenterX > (i10 / 2.0f) - f12) {
                                    f10 += (i10 / 2.0f) - fCenterX;
                                    forbidMove();
                                }
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else if (f10 < 0.0f) {
                        i11 = this.parentW;
                        if (fCenterX < (i11 / 2) + iF) {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    }
                } else if (!z10) {
                    if (f10 < 0.0f) {
                        i11 = this.parentW;
                        if (fCenterX < (i11 / 2) + iF) {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    }
                } else if (f10 < 0.0f) {
                    i11 = this.parentW;
                    if (fCenterX < (i11 / 2) + iF) {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    } else {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    }
                } else {
                    i10 = this.parentW;
                    if (fCenterX > (i10 / 2.0f) - f12) {
                        f10 += (i10 / 2.0f) - fCenterX;
                        forbidMove();
                    }
                }
            } else if (!z10 && f10 > 0.0f) {
                RectF rectF12 = this.dstRect;
                f0.m(rectF12);
                if (rectF12.right + f10 > this.parentW - iF) {
                    RectF rectF13 = this.dstRect;
                    f0.m(rectF13);
                    float f14 = rectF13.right + f10;
                    int i16 = this.parentW;
                    if (f14 < i16) {
                        RectF rectF14 = this.dstRect;
                        f0.m(rectF14);
                        f10 = i16 - rectF14.right;
                        forbidMove();
                    } else if (f10 < 0.0f) {
                        i11 = this.parentW;
                        if (fCenterX < (i11 / 2) + iF) {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        } else {
                            i10 = this.parentW;
                            if (fCenterX > (i10 / 2.0f) - f12) {
                                f10 += (i10 / 2.0f) - fCenterX;
                                forbidMove();
                            }
                        }
                    } else {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    }
                } else if (f10 < 0.0f) {
                    i11 = this.parentW;
                    if (fCenterX < (i11 / 2) + iF) {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    } else {
                        i10 = this.parentW;
                        if (fCenterX > (i10 / 2.0f) - f12) {
                            f10 += (i10 / 2.0f) - fCenterX;
                            forbidMove();
                        }
                    }
                } else {
                    i10 = this.parentW;
                    if (fCenterX > (i10 / 2.0f) - f12) {
                        f10 += (i10 / 2.0f) - fCenterX;
                        forbidMove();
                    }
                }
            } else if (f10 < 0.0f) {
                i11 = this.parentW;
                if (fCenterX < (i11 / 2) + iF || fCenterX <= i11 / 2 || z12 == this.showAxisY) {
                    i10 = this.parentW;
                    if (fCenterX > (i10 / 2.0f) - f12 && fCenterX < i10 / 2.0f && f10 > 0.0f && z12 != this.showAxisY) {
                        f10 += (i10 / 2.0f) - fCenterX;
                        forbidMove();
                    }
                } else {
                    f10 += (i11 / 2.0f) - fCenterX;
                    forbidMove();
                }
            } else {
                i10 = this.parentW;
                if (fCenterX > (i10 / 2.0f) - f12) {
                    f10 += (i10 / 2.0f) - fCenterX;
                    forbidMove();
                }
            }
            if (f11 < 0.0f) {
                int i17 = this.parentH;
                if (fCenterY >= (i17 / 2) + iF || fCenterY <= i17 / 2 || z11 == this.showAxisX) {
                    i12 = this.parentH;
                    if (fCenterY > (i12 / 2.0f) - f12 && fCenterY < i12 / 2 && f11 > 0.0f && z11 != this.showAxisX) {
                        f11 += (i12 / 2.0f) - fCenterY;
                        forbidMove();
                    }
                } else {
                    f11 += (i17 / 2.0f) - fCenterY;
                    forbidMove();
                }
            } else {
                i12 = this.parentH;
                if (fCenterY > (i12 / 2.0f) - f12) {
                    f11 += (i12 / 2.0f) - fCenterY;
                    forbidMove();
                }
            }
        }
        this.showAxisY = z12;
        this.showAxisX = z11;
        Matrix matrix = this.matrix;
        f0.m(matrix);
        matrix.postTranslate(f10, f11);
        RectF rectF15 = this.dstRect;
        f0.m(rectF15);
        rectF15.offset(f10, f11);
        RectF rectF16 = this.helpBox;
        f0.m(rectF16);
        rectF16.offset(f10, f11);
        RectF rectF17 = this.deleteRect;
        f0.m(rectF17);
        rectF17.offset(f10, f11);
        RectF rectF18 = this.rotateRect;
        f0.m(rectF18);
        rectF18.offset(f10, f11);
        RectF rectF19 = this.editRect;
        if (rectF19 != null) {
            rectF19.offset(f10, f11);
        }
        RectF rectF20 = this.detectRotateRect;
        f0.m(rectF20);
        rectF20.offset(f10, f11);
        RectF rectF21 = this.detectDeleteRect;
        f0.m(rectF21);
        rectF21.offset(f10, f11);
        RectF rectF22 = this.detectEditRect;
        if (rectF22 != null) {
            rectF22.offset(f10, f11);
        }
    }

    public void updateRotateAndScale(float f10, float f11, boolean z10) {
        Object[] objArr = {new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51179, new Class[]{cls, cls, Boolean.TYPE}, Void.TYPE).isSupported || this.forbidRotate) {
            return;
        }
        RectF rectF = this.dstRect;
        f0.m(rectF);
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.dstRect;
        f0.m(rectF2);
        float fCenterY = rectF2.centerY();
        RectF rectF3 = this.detectRotateRect;
        f0.m(rectF3);
        float fCenterX2 = rectF3.centerX();
        RectF rectF4 = this.detectRotateRect;
        f0.m(rectF4);
        float fCenterY2 = rectF4.centerY();
        float f12 = f10 + fCenterX2;
        float f13 = f11 + fCenterY2;
        float f14 = fCenterX2 - fCenterX;
        float f15 = fCenterY2 - fCenterY;
        float f16 = f12 - fCenterX;
        float f17 = f13 - fCenterY;
        float fSqrt = (float) Math.sqrt((f14 * f14) + (f15 * f15));
        float fSqrt2 = (float) Math.sqrt((f16 * f16) + (f17 * f17));
        float f18 = fSqrt2 / fSqrt;
        RectF rectF5 = this.dstRect;
        f0.m(rectF5);
        if ((rectF5.width() * f18) / this.initWidth < MIN_SCALE) {
            return;
        }
        scale(f18);
        refreshHelpBoxRect();
        if (z10) {
            double d10 = ((f14 * f16) + (f15 * f17)) / (fSqrt * fSqrt2);
            if (d10 > 1.0d || d10 < -1.0d) {
                return;
            }
            addRotation(((f14 * f17) - (f16 * f15) <= 0.0f ? -1 : 1) * ((float) Math.toDegrees(Math.acos(d10))));
        }
    }
}
