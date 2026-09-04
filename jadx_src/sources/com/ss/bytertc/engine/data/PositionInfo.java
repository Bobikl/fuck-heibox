package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class PositionInfo {
    public HumanOrientation orientation;
    public Position position;

    public PositionInfo(Position position, HumanOrientation humanOrientation) {
        this.position = position;
        this.orientation = humanOrientation;
    }

    @CalledByNative
    public float getFieldOrientationForwardX() {
        return this.orientation.forward.f97939x;
    }

    @CalledByNative
    public float getFieldOrientationForwardY() {
        return this.orientation.forward.f97940y;
    }

    @CalledByNative
    public float getFieldOrientationForwardZ() {
        return this.orientation.forward.f97941z;
    }

    @CalledByNative
    public float getFieldOrientationRightX() {
        return this.orientation.right.f97939x;
    }

    @CalledByNative
    public float getFieldOrientationRightY() {
        return this.orientation.right.f97940y;
    }

    @CalledByNative
    public float getFieldOrientationRightZ() {
        return this.orientation.right.f97941z;
    }

    @CalledByNative
    public float getFieldOrientationUpX() {
        return this.orientation.up.f97939x;
    }

    @CalledByNative
    public float getFieldOrientationUpY() {
        return this.orientation.up.f97940y;
    }

    @CalledByNative
    public float getFieldOrientationUpZ() {
        return this.orientation.up.f97941z;
    }

    @CalledByNative
    public float getFieldPositionX() {
        return this.position.f97942x;
    }

    @CalledByNative
    public float getFieldPositionY() {
        return this.position.f97943y;
    }

    @CalledByNative
    public float getFieldPositionZ() {
        return this.position.f97944z;
    }
}
