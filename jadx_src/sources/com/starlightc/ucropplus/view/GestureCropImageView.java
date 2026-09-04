package com.starlightc.ucropplus.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.util.RotationGestureDetector;

/* JADX INFO: loaded from: classes4.dex */
public class GestureCropImageView extends CropImageView {
    private static final int DOUBLE_TAP_ZOOM_DURATION = 200;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mDoubleTapScaleSteps;
    private GestureDetector mGestureDetector;
    private boolean mIsGestureEnabled;
    private boolean mIsRotateEnabled;
    private boolean mIsScaleEnabled;
    private boolean mIsScrollEnable;
    private float mMidPntX;
    private float mMidPntY;
    private RotationGestureDetector mRotateDetector;
    private ScaleGestureDetector mScaleDetector;

    public class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        private GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 51029, new Class[]{MotionEvent.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            Object[] objArr = {motionEvent, motionEvent2, new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51030, new Class[]{MotionEvent.class, MotionEvent.class, cls, cls}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (GestureCropImageView.this.mIsScrollEnable) {
                GestureCropImageView.this.postTranslate(-f10, -f11);
            }
            return true;
        }
    }

    public class RotateListener extends RotationGestureDetector.SimpleOnRotationGestureListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        private RotateListener() {
        }

        @Override // com.starlightc.ucropplus.util.RotationGestureDetector.SimpleOnRotationGestureListener, com.starlightc.ucropplus.util.RotationGestureDetector.OnRotationGestureListener
        public boolean onRotation(RotationGestureDetector rotationGestureDetector) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{rotationGestureDetector}, this, changeQuickRedirect, false, 51031, new Class[]{RotationGestureDetector.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            GestureCropImageView.this.postRotate(rotationGestureDetector.getAngle(), GestureCropImageView.this.mMidPntX, GestureCropImageView.this.mMidPntY);
            return true;
        }
    }

    public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        private ScaleListener() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{scaleGestureDetector}, this, changeQuickRedirect, false, 51032, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            GestureCropImageView.this.postScale(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.mMidPntX, GestureCropImageView.this.mMidPntY);
            return true;
        }
    }

    public GestureCropImageView(Context context) {
        super(context);
        this.mIsRotateEnabled = true;
        this.mIsScaleEnabled = true;
        this.mIsGestureEnabled = true;
        this.mIsScrollEnable = true;
        this.mDoubleTapScaleSteps = 5;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mIsRotateEnabled = true;
        this.mIsScaleEnabled = true;
        this.mIsGestureEnabled = true;
        this.mIsScrollEnable = true;
        this.mDoubleTapScaleSteps = 5;
    }

    private void setupGestureListeners() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51028, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mGestureDetector = new GestureDetector(getContext(), new GestureListener(), null, true);
        this.mScaleDetector = new ScaleGestureDetector(getContext(), new ScaleListener());
        this.mRotateDetector = new RotationGestureDetector(new RotateListener());
    }

    public int getDoubleTapScaleSteps() {
        return this.mDoubleTapScaleSteps;
    }

    public float getDoubleTapTargetScale() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51027, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.mDoubleTapScaleSteps));
    }

    @Override // com.starlightc.ucropplus.view.TransformImageView
    public void init() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51026, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.init();
        setupGestureListeners();
    }

    public boolean isGestureEnabled() {
        return this.mIsGestureEnabled;
    }

    public boolean isRotateEnabled() {
        return this.mIsRotateEnabled;
    }

    public boolean isScaleEnabled() {
        return this.mIsScaleEnabled;
    }

    public boolean isScrollEnable() {
        return this.mIsScrollEnable;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 51025, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if ((motionEvent.getAction() & 255) == 0) {
            cancelAllAnimations();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.mMidPntX = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.mMidPntY = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        if (this.mIsGestureEnabled) {
            this.mGestureDetector.onTouchEvent(motionEvent);
        }
        if (this.mIsScaleEnabled) {
            this.mScaleDetector.onTouchEvent(motionEvent);
        }
        if (this.mIsRotateEnabled) {
            this.mRotateDetector.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            setImageToWrapCropBounds();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i10) {
        this.mDoubleTapScaleSteps = i10;
    }

    public void setGestureEnabled(boolean z10) {
        this.mIsGestureEnabled = z10;
    }

    public void setRotateEnabled(boolean z10) {
        this.mIsRotateEnabled = z10;
    }

    public void setScaleEnabled(boolean z10) {
        this.mIsScaleEnabled = z10;
    }

    public void setScrollEnable(boolean z10) {
        this.mIsScrollEnable = z10;
    }
}
