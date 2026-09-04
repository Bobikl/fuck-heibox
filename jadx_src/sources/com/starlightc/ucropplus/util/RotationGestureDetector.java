package com.starlightc.ucropplus.util;

import android.view.MotionEvent;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes4.dex */
public class RotationGestureDetector {
    private static final int INVALID_POINTER_INDEX = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private float fX;
    private float fY;
    private float mAngle;
    private boolean mIsFirstTouch;
    private OnRotationGestureListener mListener;
    private int mPointerIndex1 = -1;
    private int mPointerIndex2 = -1;
    private float sX;
    private float sY;

    public interface OnRotationGestureListener {
        boolean onRotation(RotationGestureDetector rotationGestureDetector);
    }

    public static class SimpleOnRotationGestureListener implements OnRotationGestureListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.starlightc.ucropplus.util.RotationGestureDetector.OnRotationGestureListener
        public boolean onRotation(RotationGestureDetector rotationGestureDetector) {
            return false;
        }
    }

    public RotationGestureDetector(OnRotationGestureListener onRotationGestureListener) {
        this.mListener = onRotationGestureListener;
    }

    private float calculateAngleBetweenLines(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13), new Float(f14), new Float(f15), new Float(f16), new Float(f17)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50976, new Class[]{cls, cls, cls, cls, cls, cls, cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : calculateAngleDelta((float) Math.toDegrees((float) Math.atan2(f11 - f13, f10 - f12)), (float) Math.toDegrees((float) Math.atan2(f15 - f17, f14 - f16)));
    }

    private float calculateAngleDelta(float f10, float f11) {
        float f12 = (f11 % 360.0f) - (f10 % 360.0f);
        this.mAngle = f12;
        if (f12 < -180.0f) {
            this.mAngle = f12 + 360.0f;
        } else if (f12 > 180.0f) {
            this.mAngle = f12 - 360.0f;
        }
        return this.mAngle;
    }

    public float getAngle() {
        return this.mAngle;
    }

    public boolean onTouchEvent(@n0 MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 50975, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.sX = motionEvent.getX();
            this.sY = motionEvent.getY();
            this.mPointerIndex1 = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
            this.mAngle = 0.0f;
            this.mIsFirstTouch = true;
        } else if (actionMasked == 1) {
            this.mPointerIndex1 = -1;
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.fX = motionEvent.getX();
                this.fY = motionEvent.getY();
                this.mPointerIndex2 = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                this.mAngle = 0.0f;
                this.mIsFirstTouch = true;
            } else if (actionMasked == 6) {
                this.mPointerIndex2 = -1;
            }
        } else if (this.mPointerIndex1 != -1 && this.mPointerIndex2 != -1 && motionEvent.getPointerCount() > this.mPointerIndex2) {
            float x10 = motionEvent.getX(this.mPointerIndex1);
            float y10 = motionEvent.getY(this.mPointerIndex1);
            float x11 = motionEvent.getX(this.mPointerIndex2);
            float y11 = motionEvent.getY(this.mPointerIndex2);
            if (this.mIsFirstTouch) {
                this.mAngle = 0.0f;
                this.mIsFirstTouch = false;
            } else {
                calculateAngleBetweenLines(this.fX, this.fY, this.sX, this.sY, x11, y11, x10, y10);
            }
            OnRotationGestureListener onRotationGestureListener = this.mListener;
            if (onRotationGestureListener != null) {
                onRotationGestureListener.onRotation(this);
            }
            this.fX = x11;
            this.fY = y11;
            this.sX = x10;
            this.sY = y10;
        }
        return true;
    }
}
