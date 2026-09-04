package android.graphics;

import android.annotation.NonNull;
import android.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RenderNode {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ RenderNode(@Nullable String str) {
    }

    @NonNull
    public native /* synthetic */ RecordingCanvas beginRecording();

    public native /* synthetic */ void discardDisplayList();

    public native /* synthetic */ void endRecording();

    public native /* synthetic */ float getAlpha();

    public native /* synthetic */ int getAmbientShadowColor();

    public native /* synthetic */ int getBottom();

    public native /* synthetic */ float getCameraDistance();

    public native /* synthetic */ boolean getClipToBounds();

    public native /* synthetic */ boolean getClipToOutline();

    public native /* synthetic */ float getElevation();

    public native /* synthetic */ int getHeight();

    public native /* synthetic */ void getInverseMatrix(@NonNull Matrix matrix);

    public native /* synthetic */ int getLeft();

    public native /* synthetic */ void getMatrix(@NonNull Matrix matrix);

    public native /* synthetic */ float getPivotX();

    public native /* synthetic */ float getPivotY();

    public native /* synthetic */ int getRight();

    public native /* synthetic */ float getRotationX();

    public native /* synthetic */ float getRotationY();

    public native /* synthetic */ float getRotationZ();

    public native /* synthetic */ float getScaleX();

    public native /* synthetic */ float getScaleY();

    public native /* synthetic */ int getSpotShadowColor();

    public native /* synthetic */ int getTop();

    public native /* synthetic */ float getTranslationX();

    public native /* synthetic */ float getTranslationY();

    public native /* synthetic */ long getUniqueId();

    public native /* synthetic */ int getWidth();

    public native /* synthetic */ boolean hasDisplayList();

    public native /* synthetic */ boolean offsetLeftAndRight(int i10);

    public native /* synthetic */ boolean offsetTopAndBottom(int i10);

    public native /* synthetic */ boolean setAlpha(float f10);

    public native /* synthetic */ boolean setAmbientShadowColor(int i10);

    public native /* synthetic */ boolean setCameraDistance(float f10);

    public native /* synthetic */ boolean setClipToBounds(boolean z10);

    public native /* synthetic */ boolean setClipToOutline(boolean z10);

    public native /* synthetic */ boolean setElevation(float f10);

    public native /* synthetic */ boolean setHasOverlappingRendering(boolean z10);

    public native /* synthetic */ boolean setOutline(@Nullable Outline outline);

    public native /* synthetic */ boolean setPivotX(float f10);

    public native /* synthetic */ boolean setPivotY(float f10);

    public native /* synthetic */ boolean setPosition(int i10, int i11, int i12, int i13);

    public native /* synthetic */ boolean setRotationX(float f10);

    public native /* synthetic */ boolean setRotationY(float f10);

    public native /* synthetic */ boolean setRotationZ(float f10);

    public native /* synthetic */ boolean setScaleX(float f10);

    public native /* synthetic */ boolean setScaleY(float f10);

    public native /* synthetic */ boolean setSpotShadowColor(int i10);

    public native /* synthetic */ boolean setTranslationX(float f10);

    public native /* synthetic */ boolean setTranslationY(float f10);
}
