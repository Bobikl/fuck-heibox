package com.starlightc.ucropplus.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.enums.EDIT_MODE;
import com.starlightc.ucropplus.enums.STICKER_STATUS;
import com.starlightc.ucropplus.model.TextRenderInfo;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.starlightc.ucropplus.model.puzzle.LabelPuzzle;
import com.starlightc.ucropplus.model.puzzle.TextPuzzle;
import com.starlightc.ucropplus.ui.TextStickerFragmentDialog;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.starlightc.ucropplus.util.BitmapLoadUtils;
import com.starlightc.ucropplus.view.widget.stickeritem.BaseStickerItem;
import com.starlightc.ucropplus.view.widget.stickeritem.BitmapStickerItem;
import com.starlightc.ucropplus.view.widget.stickeritem.LabelStickerItem;
import com.starlightc.ucropplus.view.widget.stickeritem.TextStickerItem;
import dl.d;
import dl.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Stack;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: StickerView.kt */
/* JADX INFO: loaded from: classes4.dex */
public class StickerView extends View {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean adsorbEdge;

    @d
    private final Paint axisPaint;
    private boolean canRotation;

    @d
    private LabelStickerItem.LabelType currentLabelType;

    @e
    private BaseStickerItem currentStickerItem;
    private float downOldx;
    private float downOldy;
    private float downX1;
    private float downX2;
    private float downY1;
    private float downY2;

    @d
    private EDIT_MODE editMode;

    @d
    private final q0 ioScope;
    private boolean isDoubleFingerCancel;

    @d
    private final Stack<LabelStickerItem> labelStickerItemStack;

    @d
    private final Point mPoint;

    @e
    private View parentView;
    private float startDistance;
    private float startRotation;
    private int stickerCount;
    private float stickerOldx;
    private float stickerOldy;

    @d
    private STICKER_STATUS stickerStatus;

    @e
    private StickerStatusChangeListener stickerStatusChangeListener;

    @d
    private final LinkedHashMap<Integer, BaseStickerItem> stickerStore;

    @e
    private UCropPlusActivity uCropPlusActivity;

    @d
    private final q0 uiScope;

    /* JADX INFO: compiled from: StickerView.kt */
    public interface StickerStatusChangeListener {

        /* JADX INFO: compiled from: StickerView.kt */
        public static final class DefaultImpls {
            public static ChangeQuickRedirect changeQuickRedirect;

            public static void onItemDelete(@d StickerStatusChangeListener stickerStatusChangeListener, int i10, int i11) {
            }
        }

        void onItemDelete(int i10, int i11);

        void onStatusChanged(boolean z10);

        void requestChangeMode(@d EDIT_MODE edit_mode);
    }

    /* JADX INFO: compiled from: StickerView.kt */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EDIT_MODE.valuesCustom().length];
            try {
                iArr[EDIT_MODE.LABEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EDIT_MODE.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EDIT_MODE.STICKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EDIT_MODE.IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EDIT_MODE.CROP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StickerView(@e Context context) {
        super(context);
        this.editMode = EDIT_MODE.IDLE;
        this.uiScope = r0.a(e1.e());
        this.ioScope = r0.a(e1.c());
        this.currentLabelType = LabelStickerItem.LabelType.RECTANGLE;
        Paint paint = new Paint();
        this.axisPaint = paint;
        this.canRotation = true;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(ViewUtils.f(getContext(), 1.0f));
        this.stickerStatus = STICKER_STATUS.IDLE;
        this.stickerStore = new LinkedHashMap<>();
        this.labelStickerItemStack = new Stack<>();
        this.mPoint = new Point(0, 0);
    }

    public StickerView(@e Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        this.editMode = EDIT_MODE.IDLE;
        this.uiScope = r0.a(e1.e());
        this.ioScope = r0.a(e1.c());
        this.currentLabelType = LabelStickerItem.LabelType.RECTANGLE;
        Paint paint = new Paint();
        this.axisPaint = paint;
        this.canRotation = true;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(ViewUtils.f(getContext(), 1.0f));
        this.stickerStatus = STICKER_STATUS.IDLE;
        this.stickerStore = new LinkedHashMap<>();
        this.labelStickerItemStack = new Stack<>();
        this.mPoint = new Point(0, 0);
    }

    public StickerView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.editMode = EDIT_MODE.IDLE;
        this.uiScope = r0.a(e1.e());
        this.ioScope = r0.a(e1.c());
        this.currentLabelType = LabelStickerItem.LabelType.RECTANGLE;
        Paint paint = new Paint();
        this.axisPaint = paint;
        this.canRotation = true;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(ViewUtils.f(getContext(), 1.0f));
        this.stickerStatus = STICKER_STATUS.IDLE;
        this.stickerStore = new LinkedHashMap<>();
        this.labelStickerItemStack = new Stack<>();
        this.mPoint = new Point(0, 0);
    }

    public StickerView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.editMode = EDIT_MODE.IDLE;
        this.uiScope = r0.a(e1.e());
        this.ioScope = r0.a(e1.c());
        this.currentLabelType = LabelStickerItem.LabelType.RECTANGLE;
        Paint paint = new Paint();
        this.axisPaint = paint;
        this.canRotation = true;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(ViewUtils.f(getContext(), 1.0f));
        this.stickerStatus = STICKER_STATUS.IDLE;
        this.stickerStore = new LinkedHashMap<>();
        this.labelStickerItemStack = new Stack<>();
        this.mPoint = new Point(0, 0);
    }

    public static /* synthetic */ void addLabelSticker$default(StickerView stickerView, BasePuzzleInfo basePuzzleInfo, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{stickerView, basePuzzleInfo, new Integer(i10), obj}, null, changeQuickRedirect, true, 51090, new Class[]{StickerView.class, BasePuzzleInfo.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addLabelSticker");
        }
        if ((i10 & 1) != 0) {
            basePuzzleInfo = null;
        }
        stickerView.addLabelSticker(basePuzzleInfo);
    }

    public static /* synthetic */ void addStickerBitImage$default(StickerView stickerView, Bitmap bitmap, String str, BasePuzzleInfo basePuzzleInfo, boolean z10, int i10, int i11, Object obj) {
        Object[] objArr = {stickerView, bitmap, str, basePuzzleInfo, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 51080, new Class[]{StickerView.class, Bitmap.class, String.class, BasePuzzleInfo.class, Boolean.TYPE, cls, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addStickerBitImage");
        }
        stickerView.addStickerBitImage(bitmap, str, (i11 & 4) != 0 ? null : basePuzzleInfo, (i11 & 8) != 0 ? true : z10 ? 1 : 0, (i11 & 16) != 0 ? -1 : i10);
    }

    public static /* synthetic */ void addTextSticker$default(StickerView stickerView, TextPuzzle textPuzzle, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{stickerView, textPuzzle, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 51086, new Class[]{StickerView.class, TextPuzzle.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addTextSticker");
        }
        if ((i10 & 1) != 0) {
            textPuzzle = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        stickerView.addTextSticker(textPuzzle, z10);
    }

    private final boolean detectInButton(BaseStickerItem baseStickerItem, RectF rectF, float f10, float f11) {
        Object[] objArr = {baseStickerItem, rectF, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51069, new Class[]{BaseStickerItem.class, RectF.class, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (rectF == null) {
            return false;
        }
        Point point = new Point((int) f10, (int) f11);
        RectF helpBox = baseStickerItem.getHelpBox();
        f0.m(helpBox);
        float fCenterX = helpBox.centerX();
        RectF helpBox2 = baseStickerItem.getHelpBox();
        f0.m(helpBox2);
        rotatePoint(point, fCenterX, helpBox2.centerY(), -baseStickerItem.getRotateAngle());
        return rectF.contains(point.x, point.y);
    }

    private final boolean detectInItemContent(BaseStickerItem baseStickerItem, float f10, float f11) {
        Object[] objArr = {baseStickerItem, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51068, new Class[]{BaseStickerItem.class, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!baseStickerItem.getCanEdit() || !itemCanEdit(baseStickerItem)) {
            return false;
        }
        this.mPoint.set((int) f10, (int) f11);
        Point point = this.mPoint;
        RectF helpBox = baseStickerItem.getHelpBox();
        f0.m(helpBox);
        float fCenterX = helpBox.centerX();
        RectF helpBox2 = baseStickerItem.getHelpBox();
        f0.m(helpBox2);
        rotatePoint(point, fCenterX, helpBox2.centerY(), -baseStickerItem.getRotateAngle());
        RectF helpBox3 = baseStickerItem.getHelpBox();
        f0.m(helpBox3);
        Point point2 = this.mPoint;
        return helpBox3.contains(point2.x, point2.y);
    }

    private final boolean drawLabel(int i10, float f10, float f11) {
        Object[] objArr = {new Integer(i10), new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51064, new Class[]{Integer.TYPE, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        BaseStickerItem baseStickerItem = this.currentStickerItem;
        if (baseStickerItem instanceof LabelStickerItem) {
            f0.n(baseStickerItem, "null cannot be cast to non-null type com.starlightc.ucropplus.view.widget.stickeritem.LabelStickerItem");
            LabelStickerItem labelStickerItem = (LabelStickerItem) baseStickerItem;
            labelStickerItem.setX2(f10);
            labelStickerItem.setY2(f11);
            invalidate();
        }
        return true;
    }

    private final float getDistance(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 51078, new Class[]{MotionEvent.class}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.sqrt(Math.pow(motionEvent.getX(0) - motionEvent.getX(1), 2.0d) + Math.pow(motionEvent.getY(0) - motionEvent.getY(1), 2.0d));
    }

    private final float getRotation(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 51077, new Class[]{MotionEvent.class}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.toDegrees(Math.atan2(motionEvent.getY(0) - motionEvent.getY(1), motionEvent.getX(0) - motionEvent.getX(1)));
    }

    private final UCropPlusActivity getUCropPlusActivity() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51058, new Class[0], UCropPlusActivity.class);
        if (patchProxyResultProxy.isSupported) {
            return (UCropPlusActivity) patchProxyResultProxy.result;
        }
        if (!(getContext() instanceof UCropPlusActivity)) {
            return null;
        }
        Context context = getContext();
        f0.n(context, "null cannot be cast to non-null type com.starlightc.ucropplus.ui.UCropPlusActivity");
        return (UCropPlusActivity) context;
    }

    private final boolean isEditTextMode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51093, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.editMode != EDIT_MODE.TEXT) {
            return false;
        }
        UCropPlusActivity uCropPlusActivity = getUCropPlusActivity();
        return (uCropPlusActivity != null ? uCropPlusActivity.getCurrentDialogFragment() : null) instanceof TextStickerFragmentDialog;
    }

    private final boolean itemCanEdit(BaseStickerItem baseStickerItem) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{baseStickerItem}, this, changeQuickRedirect, false, 51092, new Class[]{BaseStickerItem.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (isEditTextMode()) {
            return baseStickerItem != null && baseStickerItem.isTextSticker();
        }
        return true;
    }

    private final boolean onActionCancelOrUP(int i10, float f10, float f11) {
        Object[] objArr = {new Integer(i10), new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51072, new Class[]{Integer.TYPE, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.editMode.ordinal()];
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            return stickerActionDownOrUp(i10, f10, f11);
        }
        return false;
    }

    private final void onActionDoubleFingerMove(MotionEvent motionEvent) {
        boolean z10;
        if (PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 51075, new Class[]{MotionEvent.class}, Void.TYPE).isSupported) {
            return;
        }
        float distance = getDistance(motionEvent) - this.startDistance;
        if (distance == 0.0f) {
            z10 = false;
        } else {
            BaseStickerItem baseStickerItem = this.currentStickerItem;
            if (baseStickerItem != null) {
                baseStickerItem.scaleByDifference(distance);
            }
            z10 = true;
        }
        if (this.canRotation) {
            float rotation = getRotation(motionEvent) - this.startRotation;
            if (!(rotation == 0.0f)) {
                BaseStickerItem baseStickerItem2 = this.currentStickerItem;
                if (baseStickerItem2 != null) {
                    baseStickerItem2.addRotation(rotation);
                }
                z10 = true;
            }
        }
        if (z10) {
            BaseStickerItem baseStickerItem3 = this.currentStickerItem;
            if (baseStickerItem3 != null) {
                baseStickerItem3.refreshHelpBoxRect();
            }
            BaseStickerItem baseStickerItem4 = this.currentStickerItem;
            if (baseStickerItem4 != null) {
                baseStickerItem4.refreshDetectRects();
            }
        }
        float f10 = 2;
        stickerActionMove(((motionEvent.getX(0) - this.downX1) / f10) + ((motionEvent.getX(1) - this.downX2) / f10), ((motionEvent.getY(0) - this.downY1) / f10) + ((motionEvent.getY(1) - this.downY2) / f10));
        refreshDoubleFingerState(motionEvent);
        invalidate();
    }

    private final boolean onActionDown(int i10, float f10, float f11) {
        Object[] objArr = {new Integer(i10), new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51070, new Class[]{Integer.TYPE, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (WhenMappings.$EnumSwitchMapping$0[this.editMode.ordinal()] != 1) {
            return stickerActionDown(i10, f10, f11);
        }
        this.stickerOldx = f10;
        this.stickerOldy = f11;
        this.stickerStatus = STICKER_STATUS.MOVE;
        addLabelSticker$default(this, null, 1, null);
        return true;
    }

    private final boolean onActionMove(int i10, float f10, float f11) {
        Object[] objArr = {new Integer(i10), new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51071, new Class[]{Integer.TYPE, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.editMode.ordinal()];
        if (i11 == 1) {
            return drawLabel(i10, f10, f11);
        }
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            return stickerActionMove(i10, f10, f11);
        }
        return false;
    }

    private final void refreshDoubleFingerState(MotionEvent motionEvent) {
        if (PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 51076, new Class[]{MotionEvent.class}, Void.TYPE).isSupported) {
            return;
        }
        this.startRotation = getRotation(motionEvent);
        this.startDistance = getDistance(motionEvent);
        this.downX1 = motionEvent.getX(0);
        this.downX2 = motionEvent.getX(1);
        this.downY1 = motionEvent.getY(0);
        this.downY2 = motionEvent.getY(1);
    }

    private final void rotatePoint(Point point, float f10, float f11, float f12) {
        Object[] objArr = {point, new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51061, new Class[]{Point.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        double d10 = f12;
        float fSin = (float) Math.sin(Math.toRadians(d10));
        float fCos = (float) Math.cos(Math.toRadians(d10));
        int i10 = point.x;
        int i11 = point.y;
        point.set((int) ((((i10 - f10) * fCos) + f10) - ((i11 - f11) * fSin)), (int) (f11 + ((i11 - f11) * fCos) + ((i10 - f10) * fSin)));
    }

    private final boolean saveStickerBitmap(Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GestureCropImageView cropImageView;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 51094, new Class[]{Bitmap.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (bitmap == null) {
            return false;
        }
        UCropView uCropView = getUCropView();
        OutputStream outputStream = null;
        Uri imageOutputUri = (uCropView == null || (cropImageView = uCropView.getCropImageView()) == null) ? null : cropImageView.getImageOutputUri();
        if (imageOutputUri == null) {
            return false;
        }
        try {
            OutputStream outputStreamOpenOutputStream = getContext().getContentResolver().openOutputStream(imageOutputUri);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                    f0.m(outputStreamOpenOutputStream);
                    outputStreamOpenOutputStream.write(byteArrayOutputStream.toByteArray());
                    bitmap.recycle();
                    BitmapLoadUtils.close(outputStreamOpenOutputStream);
                } catch (IOException e10) {
                    e = e10;
                    outputStream = outputStreamOpenOutputStream;
                    try {
                        String localizedMessage = e.getLocalizedMessage();
                        if (localizedMessage == null) {
                            localizedMessage = "unknown error";
                        }
                        Log.e("UCropPlus", localizedMessage);
                        BitmapLoadUtils.close(outputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        BitmapLoadUtils.close(outputStream);
                        BitmapLoadUtils.close(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = outputStreamOpenOutputStream;
                    BitmapLoadUtils.close(outputStream);
                    BitmapLoadUtils.close(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        } catch (IOException e12) {
            e = e12;
            byteArrayOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream = null;
        }
        BitmapLoadUtils.close(byteArrayOutputStream);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0119  */
    /* JADX WARN: Code duplicated, block: B:63:0x011d  */
    private final boolean stickerActionDown(int i10, float f10, float f11) {
        StickerStatusChangeListener stickerStatusChangeListener;
        StickerStatusChangeListener stickerStatusChangeListener2;
        Object[] objArr = {new Integer(i10), new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51062, new Class[]{Integer.TYPE, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Iterator<Integer> it = this.stickerStore.keySet().iterator();
        while (it.hasNext()) {
            BaseStickerItem baseStickerItem = this.stickerStore.get(it.next());
            if (baseStickerItem != null) {
                RectF detectRotateRect = baseStickerItem.getDetectRotateRect();
                f0.m(detectRotateRect);
                if (detectRotateRect.contains(f10, f11)) {
                    BaseStickerItem baseStickerItem2 = this.currentStickerItem;
                    if (baseStickerItem2 != null) {
                        f0.m(baseStickerItem2);
                        baseStickerItem2.setDrawHelpTool(false);
                    }
                    setCurrentStickerItem(baseStickerItem);
                    BaseStickerItem baseStickerItem3 = this.currentStickerItem;
                    if (baseStickerItem3 != null) {
                        baseStickerItem3.setDrawHelpTool(true);
                    }
                    this.stickerStatus = STICKER_STATUS.ROTATE;
                } else {
                    if (baseStickerItem.isTextSticker()) {
                        RectF detectEditRect = baseStickerItem.getDetectEditRect();
                        f0.m(detectEditRect);
                        if (detectEditRect.contains(f10, f11)) {
                            BaseStickerItem baseStickerItem4 = this.currentStickerItem;
                            if (baseStickerItem4 != null) {
                                f0.m(baseStickerItem4);
                                baseStickerItem4.setDrawHelpTool(false);
                            }
                            setCurrentStickerItem(baseStickerItem);
                            BaseStickerItem baseStickerItem5 = this.currentStickerItem;
                            if (baseStickerItem5 != null) {
                                baseStickerItem5.setDrawHelpTool(true);
                            }
                            this.stickerStatus = STICKER_STATUS.EDIT;
                        }
                    }
                    if (!detectInItemContent(baseStickerItem, f10, f11)) {
                        RectF detectDeleteRect = baseStickerItem.getDetectDeleteRect();
                        f0.m(detectDeleteRect);
                        if (!detectDeleteRect.contains(f10, f11) || !baseStickerItem.getCanDelete()) {
                        }
                    }
                    BaseStickerItem baseStickerItem6 = this.currentStickerItem;
                    if (baseStickerItem6 != null) {
                        f0.m(baseStickerItem6);
                        baseStickerItem6.setDrawHelpTool(false);
                    }
                    setCurrentStickerItem(baseStickerItem);
                    BaseStickerItem baseStickerItem7 = this.currentStickerItem;
                    if (baseStickerItem7 != null) {
                        baseStickerItem7.setDrawHelpTool(true);
                    }
                    this.stickerStatus = STICKER_STATUS.MOVE;
                    this.downOldx = f10;
                    this.downOldy = f11;
                }
            }
        }
        this.stickerOldx = f10;
        this.stickerOldy = f11;
        if (this.stickerStatus == STICKER_STATUS.EDIT && (stickerStatusChangeListener2 = this.stickerStatusChangeListener) != null) {
            stickerStatusChangeListener2.requestChangeMode(EDIT_MODE.TEXT);
        }
        BaseStickerItem baseStickerItem8 = this.currentStickerItem;
        if (baseStickerItem8 != null) {
            f0.m(baseStickerItem8);
            if (baseStickerItem8.isDrawHelpTool()) {
                StickerStatusChangeListener stickerStatusChangeListener3 = this.stickerStatusChangeListener;
                if (stickerStatusChangeListener3 != null) {
                    stickerStatusChangeListener3.onStatusChanged(true);
                }
            } else {
                stickerStatusChangeListener = this.stickerStatusChangeListener;
                if (stickerStatusChangeListener != null) {
                    stickerStatusChangeListener.onStatusChanged(false);
                }
            }
        } else {
            stickerStatusChangeListener = this.stickerStatusChangeListener;
            if (stickerStatusChangeListener != null) {
                stickerStatusChangeListener.onStatusChanged(false);
            }
        }
        invalidate();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0073 A[SYNTHETIC] */
    private final boolean stickerActionDownOrUp(int i10, float f10, float f11) {
        RectF detectDeleteRect;
        Object[] objArr = {new Integer(i10), new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51066, new Class[]{Integer.TYPE, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int iIntValue = -1;
        boolean z10 = false;
        for (Integer num : this.stickerStore.keySet()) {
            BaseStickerItem baseStickerItem = this.stickerStore.get(num);
            if (baseStickerItem != null) {
                RectF detectRotateRect = baseStickerItem.getDetectRotateRect();
                f0.m(detectRotateRect);
                if (!detectRotateRect.contains(f10, f11)) {
                    if (baseStickerItem.isTextSticker()) {
                        RectF detectEditRect = baseStickerItem.getDetectEditRect();
                        f0.m(detectEditRect);
                        if (!detectEditRect.contains(f10, f11)) {
                            if (detectInItemContent(baseStickerItem, f10, f11)) {
                                detectDeleteRect = baseStickerItem.getDetectDeleteRect();
                                f0.m(detectDeleteRect);
                                if (!detectDeleteRect.contains(f10, f11) && baseStickerItem.getCanDelete()) {
                                    f0.m(num);
                                    iIntValue = num.intValue();
                                    this.stickerStatus = STICKER_STATUS.DELETE;
                                }
                            }
                        }
                    } else if (detectInItemContent(baseStickerItem, f10, f11)) {
                        detectDeleteRect = baseStickerItem.getDetectDeleteRect();
                        f0.m(detectDeleteRect);
                        if (!detectDeleteRect.contains(f10, f11)) {
                        }
                    }
                }
                z10 = true;
            }
        }
        if (iIntValue <= 0 || this.stickerStatus != STICKER_STATUS.DELETE) {
            if (!z10) {
                BaseStickerItem baseStickerItem2 = this.currentStickerItem;
                if (baseStickerItem2 != null) {
                    baseStickerItem2.setDrawHelpTool(false);
                }
                setCurrentStickerItem(null);
                invalidate();
            }
        } else if (Math.abs(f10 - this.downOldx) + Math.abs(f11 - this.downOldy) < 5.0f) {
            this.stickerStore.remove(Integer.valueOf(iIntValue));
            StickerStatusChangeListener stickerStatusChangeListener = this.stickerStatusChangeListener;
            if (stickerStatusChangeListener != null) {
                stickerStatusChangeListener.onItemDelete(this.stickerStore.size(), getBitmapStickerNum());
            }
            setCurrentStickerItem(null);
            invalidate();
        }
        this.stickerStatus = STICKER_STATUS.IDLE;
        return z10;
    }

    private final void stickerActionMove(float f10, float f11) {
        BaseStickerItem baseStickerItem;
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51065, new Class[]{cls, cls}, Void.TYPE).isSupported || (baseStickerItem = this.currentStickerItem) == null) {
            return;
        }
        if (baseStickerItem != null) {
            baseStickerItem.updatePos(f10, f11, this.adsorbEdge);
        }
        invalidate();
    }

    private final void stickerOnDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51067, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        Iterator<Integer> it = this.stickerStore.keySet().iterator();
        while (it.hasNext()) {
            BaseStickerItem baseStickerItem = this.stickerStore.get(it.next());
            if (canvas != null && baseStickerItem != null) {
                baseStickerItem.draw(canvas);
            }
        }
        if (canvas != null) {
            BaseStickerItem baseStickerItem2 = this.currentStickerItem;
            if (baseStickerItem2 != null && baseStickerItem2.getShowAxisX()) {
                BaseStickerItem baseStickerItem3 = this.currentStickerItem;
                if (baseStickerItem3 != null && baseStickerItem3.isDrawHelpTool()) {
                    canvas.drawLine(0.0f, canvas.getHeight() / 2.0f, canvas.getWidth(), canvas.getHeight() / 2.0f, this.axisPaint);
                }
            }
            BaseStickerItem baseStickerItem4 = this.currentStickerItem;
            if (baseStickerItem4 != null && baseStickerItem4.getShowAxisY()) {
                BaseStickerItem baseStickerItem5 = this.currentStickerItem;
                if (baseStickerItem5 != null && baseStickerItem5.isDrawHelpTool()) {
                    canvas.drawLine(canvas.getWidth() / 2.0f, 0.0f, canvas.getWidth() / 2.0f, canvas.getHeight(), this.axisPaint);
                }
            }
        }
    }

    private final void updateBitmap(boolean z10) {
        GestureCropImageView cropImageView;
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 51095, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && z10) {
            reset();
            try {
                UCropView uCropView = getUCropView();
                if (uCropView == null || (cropImageView = uCropView.getCropImageView()) == null) {
                    return;
                }
                cropImageView.refreshFromCacheUri();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void addLabelSticker(@e BasePuzzleInfo basePuzzleInfo) {
        if (PatchProxy.proxy(new Object[]{basePuzzleInfo}, this, changeQuickRedirect, false, 51089, new Class[]{BasePuzzleInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        f0.o(context, "getContext(...)");
        LabelStickerItem labelStickerItem = new LabelStickerItem(context);
        labelStickerItem.setDrawHelpTool(false);
        labelStickerItem.setCurrentLabelType(this.currentLabelType);
        setEditMode(EDIT_MODE.LABEL);
        if (basePuzzleInfo == null) {
            labelStickerItem.setCanEdit(true);
            float f10 = this.stickerOldx;
            float f11 = this.stickerOldy;
            UCropPlusActivity uCropPlusActivity = getUCropPlusActivity();
            labelStickerItem.init(this, f10, f11, f10, f11, uCropPlusActivity != null ? uCropPlusActivity.getCurrentLabelColor() : y1.a.f141526c);
            this.labelStickerItemStack.push(labelStickerItem);
        } else {
            labelStickerItem.setCanEdit(false);
            LabelPuzzle labelPuzzle = (LabelPuzzle) basePuzzleInfo;
            labelStickerItem.init(this, labelPuzzle.getX1(), labelPuzzle.getY1(), labelPuzzle.getX2(), labelPuzzle.getY2(), labelPuzzle.getLabelColor());
        }
        BaseStickerItem baseStickerItem = this.currentStickerItem;
        if (baseStickerItem != null) {
            f0.m(baseStickerItem);
            baseStickerItem.setDrawHelpTool(false);
        }
        setCurrentStickerItem(labelStickerItem);
        LinkedHashMap<Integer, BaseStickerItem> linkedHashMap = this.stickerStore;
        int i10 = this.stickerCount + 1;
        this.stickerCount = i10;
        linkedHashMap.put(Integer.valueOf(i10), labelStickerItem);
        invalidate();
    }

    public final void addSticker(@d BaseStickerItem item) {
        if (PatchProxy.proxy(new Object[]{item}, this, changeQuickRedirect, false, 51081, new Class[]{BaseStickerItem.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(item, "item");
        BaseStickerItem baseStickerItem = this.currentStickerItem;
        if (baseStickerItem != null) {
            f0.m(baseStickerItem);
            baseStickerItem.setDrawHelpTool(false);
        }
        if (item.getCanEdit()) {
            setCurrentStickerItem(item);
        }
        LinkedHashMap<Integer, BaseStickerItem> linkedHashMap = this.stickerStore;
        int i10 = this.stickerCount + 1;
        this.stickerCount = i10;
        linkedHashMap.put(Integer.valueOf(i10), item);
    }

    public final void addStickerBitImage(@e Bitmap bitmap, @e String str, @e BasePuzzleInfo basePuzzleInfo, boolean z10, int i10) {
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[]{bitmap, str, basePuzzleInfo, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, this, changeQuickRedirect, false, 51079, new Class[]{Bitmap.class, String.class, BasePuzzleInfo.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported || bitmap == null) {
            return;
        }
        Context context = getContext();
        f0.o(context, "getContext(...)");
        BitmapStickerItem bitmapStickerItem = new BitmapStickerItem(context);
        if (basePuzzleInfo == null) {
            bitmapStickerItem.init(bitmap, this, str);
        } else {
            bitmapStickerItem.setCanEdit(!f0.g("0", basePuzzleInfo.getCan_edit()));
            bitmapStickerItem.initWithInfo(bitmap, this, str, basePuzzleInfo);
        }
        BaseStickerItem baseStickerItem = this.currentStickerItem;
        if (baseStickerItem != null) {
            f0.m(baseStickerItem);
            baseStickerItem.setDrawHelpTool(false);
        }
        if (bitmapStickerItem.getCanEdit() && z10) {
            setEditMode(EDIT_MODE.STICKER);
            setCurrentStickerItem(bitmapStickerItem);
        } else {
            bitmapStickerItem.setDrawHelpTool(false);
        }
        if (i10 >= 0 && i10 < this.stickerCount) {
            z11 = true;
        }
        if (z11) {
            this.stickerStore.put(Integer.valueOf(i10), bitmapStickerItem);
        } else {
            LinkedHashMap<Integer, BaseStickerItem> linkedHashMap = this.stickerStore;
            int i11 = this.stickerCount + 1;
            this.stickerCount = i11;
            linkedHashMap.put(Integer.valueOf(i11), bitmapStickerItem);
        }
        invalidate();
    }

    public final void addTextSticker(@e TextPuzzle textPuzzle, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textPuzzle, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 51085, new Class[]{TextPuzzle.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        f0.o(context, "getContext(...)");
        TextStickerItem textStickerItem = new TextStickerItem(context);
        if (textPuzzle == null) {
            textStickerItem.textInit(this);
        } else {
            textStickerItem.setCanEdit(!f0.g("0", textPuzzle.getCan_edit()));
            textStickerItem.textInitWithInfo(this, textPuzzle);
        }
        BaseStickerItem baseStickerItem = this.currentStickerItem;
        if (baseStickerItem != null) {
            f0.m(baseStickerItem);
            baseStickerItem.setDrawHelpTool(false);
        }
        if (textStickerItem.getCanEdit() && z10) {
            setEditMode(EDIT_MODE.TEXT);
            setCurrentStickerItem(textStickerItem);
        } else {
            textStickerItem.setDrawHelpTool(false);
        }
        LinkedHashMap<Integer, BaseStickerItem> linkedHashMap = this.stickerStore;
        int i10 = this.stickerCount + 1;
        this.stickerCount = i10;
        linkedHashMap.put(Integer.valueOf(i10), textStickerItem);
        postInvalidate();
    }

    public final boolean getAdsorbEdge() {
        return this.adsorbEdge;
    }

    public final int getBitmapStickerNum() {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51098, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Iterator<Integer> it = this.stickerStore.keySet().iterator();
        while (it.hasNext()) {
            if (this.stickerStore.get(it.next()) instanceof BitmapStickerItem) {
                i10++;
            }
        }
        return i10;
    }

    public final boolean getCanRotation() {
        return this.canRotation;
    }

    @d
    public final LabelStickerItem.LabelType getCurrentLabelType() {
        return this.currentLabelType;
    }

    @e
    public final BaseStickerItem getCurrentStickerItem() {
        return this.currentStickerItem;
    }

    @e
    public final String getCurrentTextContent() {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51088, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        BaseStickerItem baseStickerItem = this.currentStickerItem;
        if (baseStickerItem != null && baseStickerItem.isTextSticker()) {
            z10 = true;
        }
        if (!z10) {
            return null;
        }
        TextStickerItem textStickerItem = (TextStickerItem) this.currentStickerItem;
        f0.m(textStickerItem);
        return textStickerItem.getText();
    }

    @e
    public final TextRenderInfo getCurrentTextRenderInfo() {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51084, new Class[0], TextRenderInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextRenderInfo) patchProxyResultProxy.result;
        }
        if (this.editMode != EDIT_MODE.TEXT) {
            return null;
        }
        BaseStickerItem baseStickerItem = this.currentStickerItem;
        if (baseStickerItem != null && baseStickerItem.isTextSticker()) {
            z10 = true;
        }
        if (!z10) {
            return null;
        }
        TextStickerItem textStickerItem = (TextStickerItem) this.currentStickerItem;
        f0.m(textStickerItem);
        return textStickerItem.getTextRenderInfo();
    }

    public final float getDownOldx() {
        return this.downOldx;
    }

    public final float getDownOldy() {
        return this.downOldy;
    }

    public final float getDownX1() {
        return this.downX1;
    }

    public final float getDownX2() {
        return this.downX2;
    }

    public final float getDownY1() {
        return this.downY1;
    }

    public final float getDownY2() {
        return this.downY2;
    }

    @d
    public final EDIT_MODE getEditMode() {
        return this.editMode;
    }

    @d
    public final Stack<LabelStickerItem> getLabelStickerItemStack() {
        return this.labelStickerItemStack;
    }

    @d
    public final Point getMPoint() {
        return this.mPoint;
    }

    @e
    public final View getParentView() {
        return this.parentView;
    }

    public final int getStickerCount() {
        return this.stickerCount;
    }

    public final float getStickerOldx() {
        return this.stickerOldx;
    }

    public final float getStickerOldy() {
        return this.stickerOldy;
    }

    @d
    public final STICKER_STATUS getStickerStatus() {
        return this.stickerStatus;
    }

    @e
    public final StickerStatusChangeListener getStickerStatusChangeListener() {
        return this.stickerStatusChangeListener;
    }

    @d
    public final LinkedHashMap<Integer, BaseStickerItem> getStickerStore() {
        return this.stickerStore;
    }

    @e
    public final UCropView getUCropView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51056, new Class[0], UCropView.class);
        if (patchProxyResultProxy.isSupported) {
            return (UCropView) patchProxyResultProxy.result;
        }
        View view = this.parentView;
        if (!(view instanceof UCropView)) {
            return null;
        }
        f0.n(view, "null cannot be cast to non-null type com.starlightc.ucropplus.view.UCropView");
        return (UCropView) view;
    }

    public final void handleImage(@d Canvas canvas, @d Matrix matrix) {
        if (PatchProxy.proxy(new Object[]{canvas, matrix}, this, changeQuickRedirect, false, 51096, new Class[]{Canvas.class, Matrix.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        f0.p(matrix, "matrix");
        LinkedHashMap<Integer, BaseStickerItem> linkedHashMap = this.stickerStore;
        Iterator<Integer> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            BaseStickerItem baseStickerItem = linkedHashMap.get(it.next());
            f0.m(baseStickerItem);
            Matrix matrix2 = baseStickerItem.getMatrix();
            f0.m(matrix2);
            matrix2.postConcat(matrix);
            if (baseStickerItem instanceof TextStickerItem) {
                float[] fArr = new float[9];
                matrix.getValues(fArr);
                int i10 = (int) fArr[2];
                int i11 = (int) fArr[5];
                float f10 = fArr[0];
                float f11 = fArr[4];
                canvas.save();
                canvas.translate(i10, i11);
                canvas.scale(f10, f11);
                ((TextStickerItem) baseStickerItem).drawTextContent(canvas);
                canvas.restore();
            } else if (baseStickerItem instanceof LabelStickerItem) {
                float[] fArr2 = new float[9];
                matrix.getValues(fArr2);
                int i12 = (int) fArr2[2];
                int i13 = (int) fArr2[5];
                float f12 = fArr2[0];
                float f13 = fArr2[4];
                canvas.save();
                canvas.translate(i12, i13);
                canvas.scale(f12, f13);
                ((LabelStickerItem) baseStickerItem).drawSticker(canvas);
                canvas.restore();
            } else if (baseStickerItem instanceof BitmapStickerItem) {
                BitmapStickerItem bitmapStickerItem = (BitmapStickerItem) baseStickerItem;
                Bitmap bitmap = bitmapStickerItem.getBitmap();
                f0.m(bitmap);
                Matrix matrix3 = bitmapStickerItem.getMatrix();
                f0.m(matrix3);
                canvas.drawBitmap(bitmap, matrix3, null);
            }
        }
    }

    public final boolean isTextStickerSelected() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51087, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        BaseStickerItem baseStickerItem = this.currentStickerItem;
        if (!(baseStickerItem != null && baseStickerItem.isTextSticker())) {
            return false;
        }
        BaseStickerItem baseStickerItem2 = this.currentStickerItem;
        return baseStickerItem2 != null && baseStickerItem2.isDrawHelpTool();
    }

    @Override // android.view.View
    public void onDraw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51073, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        super.onDraw(canvas);
        if (WhenMappings.$EnumSwitchMapping$0[this.editMode.ordinal()] != 5) {
            stickerOnDraw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:52:0x0129  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00c3, please report this as an issue */
    @Override // android.view.View
    public boolean onTouchEvent(@d MotionEvent event) {
        boolean z10;
        Iterator<Integer> it;
        BaseStickerItem baseStickerItem;
        BaseStickerItem baseStickerItem2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{event}, this, changeQuickRedirect, false, 51074, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(event, "event");
        if (this.editMode == EDIT_MODE.CROP) {
            return false;
        }
        boolean zOnTouchEvent = super.onTouchEvent(event);
        int action = event.getAction();
        float x10 = event.getX();
        float y10 = event.getY();
        Log.d("onTouchEvent", "action: " + action + "  oldx: " + this.stickerOldx + "  oldy: " + this.stickerOldy + " x: " + x10 + "  y: " + y10);
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 == 1) {
                Log.d("cqtest", "up/cancel  count: " + event.getPointerCount());
                if (event.getPointerCount() != 2) {
                    if (this.isDoubleFingerCancel) {
                        z10 = zOnTouchEvent;
                    } else {
                        boolean zOnActionCancelOrUP = onActionCancelOrUP(action, x10, y10);
                        it = this.stickerStore.keySet().iterator();
                        while (it.hasNext()) {
                            baseStickerItem2 = this.stickerStore.get(it.next());
                            if (baseStickerItem2 != null && baseStickerItem2.isDrawHelpTool()) {
                                baseStickerItem2.setShowAxisX(false);
                                baseStickerItem2.setShowAxisY(false);
                                invalidate();
                            }
                        }
                        baseStickerItem = this.currentStickerItem;
                        if ((baseStickerItem instanceof LabelStickerItem) && baseStickerItem != null) {
                            baseStickerItem.setCanEdit(false);
                        }
                        z10 = zOnActionCancelOrUP;
                    }
                    this.isDoubleFingerCancel = false;
                    return z10;
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    Log.d("cqtest", "up/cancel  count: " + event.getPointerCount());
                    if (event.getPointerCount() != 2) {
                        if (this.isDoubleFingerCancel) {
                            boolean zOnActionCancelOrUP2 = onActionCancelOrUP(action, x10, y10);
                            it = this.stickerStore.keySet().iterator();
                            while (it.hasNext()) {
                                baseStickerItem2 = this.stickerStore.get(it.next());
                                if (baseStickerItem2 != null) {
                                    baseStickerItem2.setShowAxisX(false);
                                    baseStickerItem2.setShowAxisY(false);
                                    invalidate();
                                }
                            }
                            baseStickerItem = this.currentStickerItem;
                            if (baseStickerItem instanceof LabelStickerItem) {
                                baseStickerItem.setCanEdit(false);
                            }
                            z10 = zOnActionCancelOrUP2;
                        } else {
                            z10 = zOnTouchEvent;
                        }
                        this.isDoubleFingerCancel = false;
                        return z10;
                    }
                } else if (i10 != 5) {
                    if (i10 == 6) {
                        Log.d("cqtest", "pointer up");
                        if (event.getPointerCount() == 2) {
                            this.isDoubleFingerCancel = true;
                        }
                    }
                } else if (event.getPointerCount() == 2) {
                    refreshDoubleFingerState(event);
                }
            } else {
                if (event.getPointerCount() == 2) {
                    onActionDoubleFingerMove(event);
                    return true;
                }
                if (!this.isDoubleFingerCancel) {
                    return onActionMove(action, x10, y10);
                }
            }
        } else if (event.getPointerCount() != 2) {
            return onActionDown(action, x10, y10);
        }
        return zOnTouchEvent;
    }

    public final void refreshTextLayout() {
        TextStickerItem textStickerItem;
        boolean z10 = false;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51083, new Class[0], Void.TYPE).isSupported && this.editMode == EDIT_MODE.TEXT) {
            BaseStickerItem baseStickerItem = this.currentStickerItem;
            if (baseStickerItem != null && baseStickerItem.isTextSticker()) {
                z10 = true;
            }
            if (!z10 || (textStickerItem = (TextStickerItem) this.currentStickerItem) == null) {
                return;
            }
            textStickerItem.refreshTextLayout(this);
        }
    }

    public final void removeFirstLabelStickerItem() {
        LabelStickerItem labelStickerItemPop;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51097, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Stack<LabelStickerItem> stack = this.labelStickerItemStack;
        if ((stack == null || stack.isEmpty()) || (labelStickerItemPop = this.labelStickerItemStack.pop()) == null) {
            return;
        }
        for (Integer num : this.stickerStore.keySet()) {
            BaseStickerItem baseStickerItem = this.stickerStore.get(num);
            if (baseStickerItem != null) {
                f0.m(baseStickerItem);
                if (f0.g(baseStickerItem, labelStickerItemPop)) {
                    this.stickerStore.remove(num);
                    invalidate();
                    return;
                }
            }
        }
    }

    public final void reset() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51091, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setCurrentStickerItem(null);
        this.stickerStore.clear();
        this.stickerCount = 0;
        this.stickerStatus = STICKER_STATUS.IDLE;
        invalidate();
    }

    public final void setAdsorbEdge(boolean z10) {
        this.adsorbEdge = z10;
    }

    public final void setCanRotation(boolean z10) {
        this.canRotation = z10;
    }

    public final void setCurrentLabelType(@d LabelStickerItem.LabelType labelType) {
        if (PatchProxy.proxy(new Object[]{labelType}, this, changeQuickRedirect, false, 51057, new Class[]{LabelStickerItem.LabelType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(labelType, "<set-?>");
        this.currentLabelType = labelType;
    }

    public final void setCurrentStickerItem(@e BaseStickerItem baseStickerItem) {
        if (PatchProxy.proxy(new Object[]{baseStickerItem}, this, changeQuickRedirect, false, 51060, new Class[]{BaseStickerItem.class}, Void.TYPE).isSupported) {
            return;
        }
        BaseStickerItem baseStickerItem2 = this.currentStickerItem;
        if (baseStickerItem2 != null) {
            baseStickerItem2.setDrawHelpTool(false);
        }
        this.currentStickerItem = baseStickerItem;
        if (baseStickerItem != null) {
            baseStickerItem.setDrawHelpTool(baseStickerItem != null && baseStickerItem.needHelpBox());
        }
        UCropPlusActivity uCropPlusActivity = getUCropPlusActivity();
        if (uCropPlusActivity != null) {
            uCropPlusActivity.refreshCurrentText();
        }
    }

    public final void setDownOldx(float f10) {
        this.downOldx = f10;
    }

    public final void setDownOldy(float f10) {
        this.downOldy = f10;
    }

    public final void setDownX1(float f10) {
        this.downX1 = f10;
    }

    public final void setDownX2(float f10) {
        this.downX2 = f10;
    }

    public final void setDownY1(float f10) {
        this.downY1 = f10;
    }

    public final void setDownY2(float f10) {
        this.downY2 = f10;
    }

    public final void setEditMode(@d EDIT_MODE value) {
        if (PatchProxy.proxy(new Object[]{value}, this, changeQuickRedirect, false, 51055, new Class[]{EDIT_MODE.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(value, "value");
        this.editMode = value;
        invalidate();
    }

    public final void setParentView(@e View view) {
        this.parentView = view;
    }

    public final void setStickerCount(int i10) {
        this.stickerCount = i10;
    }

    public final void setStickerOldx(float f10) {
        this.stickerOldx = f10;
    }

    public final void setStickerOldy(float f10) {
        this.stickerOldy = f10;
    }

    public final void setStickerStatus(@d STICKER_STATUS sticker_status) {
        if (PatchProxy.proxy(new Object[]{sticker_status}, this, changeQuickRedirect, false, 51059, new Class[]{STICKER_STATUS.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sticker_status, "<set-?>");
        this.stickerStatus = sticker_status;
    }

    public final void setStickerStatusChangeListener(@e StickerStatusChangeListener stickerStatusChangeListener) {
        this.stickerStatusChangeListener = stickerStatusChangeListener;
    }

    public boolean stickerActionMove(int i10, float f10, float f11) {
        Object[] objArr = {new Integer(i10), new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51063, new Class[]{Integer.TYPE, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        STICKER_STATUS sticker_status = this.stickerStatus;
        if (sticker_status == STICKER_STATUS.MOVE) {
            float f12 = f10 - this.stickerOldx;
            float f13 = f11 - this.stickerOldy;
            BaseStickerItem baseStickerItem = this.currentStickerItem;
            if (baseStickerItem != null) {
                f0.m(baseStickerItem);
                baseStickerItem.updatePos(f12, f13, this.adsorbEdge);
                invalidate();
            }
            this.stickerOldx = f10;
            this.stickerOldy = f11;
        } else if (sticker_status == STICKER_STATUS.ROTATE) {
            float f14 = f10 - this.stickerOldx;
            float f15 = f11 - this.stickerOldy;
            BaseStickerItem baseStickerItem2 = this.currentStickerItem;
            if (baseStickerItem2 != null) {
                f0.m(baseStickerItem2);
                baseStickerItem2.updateRotateAndScale(f14, f15, this.canRotation);
                invalidate();
            }
            this.stickerOldx = f10;
            this.stickerOldy = f11;
        }
        return true;
    }

    public final void updateTextSticker(@d String text) {
        TextStickerItem textStickerItem;
        if (PatchProxy.proxy(new Object[]{text}, this, changeQuickRedirect, false, 51082, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(text, "text");
        if (this.editMode == EDIT_MODE.TEXT) {
            BaseStickerItem baseStickerItem = this.currentStickerItem;
            if (!(baseStickerItem != null && baseStickerItem.isTextSticker()) || (textStickerItem = (TextStickerItem) this.currentStickerItem) == null) {
                return;
            }
            textStickerItem.updateText(this, text);
        }
    }
}
