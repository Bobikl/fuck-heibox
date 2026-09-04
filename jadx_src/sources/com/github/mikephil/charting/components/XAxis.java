package com.github.mikephil.charting.components;

import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: loaded from: classes6.dex */
public class XAxis extends AxisBase {
    public int mLabelWidth = 1;
    public int mLabelHeight = 1;
    public int mLabelRotatedWidth = 1;
    public int mLabelRotatedHeight = 1;
    protected float mLabelRotationAngle = 0.0f;
    private boolean mAvoidFirstLastClipping = false;
    private XAxisPosition mPosition = XAxisPosition.TOP;

    public enum XAxisPosition {
        TOP,
        BOTTOM,
        BOTH_SIDED,
        TOP_INSIDE,
        BOTTOM_INSIDE
    }

    public XAxis() {
        this.mYOffset = Utils.convertDpToPixel(4.0f);
    }

    public float getLabelRotationAngle() {
        return this.mLabelRotationAngle;
    }

    public XAxisPosition getPosition() {
        return this.mPosition;
    }

    public boolean isAvoidFirstLastClippingEnabled() {
        return this.mAvoidFirstLastClipping;
    }

    public void setAvoidFirstLastClipping(boolean z10) {
        this.mAvoidFirstLastClipping = z10;
    }

    public void setLabelRotationAngle(float f10) {
        this.mLabelRotationAngle = f10;
    }

    public void setPosition(XAxisPosition xAxisPosition) {
        this.mPosition = xAxisPosition;
    }
}
