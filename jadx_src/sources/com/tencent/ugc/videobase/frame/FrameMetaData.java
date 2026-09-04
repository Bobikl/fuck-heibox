package com.tencent.ugc.videobase.frame;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class FrameMetaData {
    private final MirrorInfo mEncodeMirror;
    private l mEncodeRotation;
    private final Size mEncodeSize;
    private l mPreprocessorRotation;
    private GLConstants.GLScaleType mPreprocessorScaleType;
    private final MirrorInfo mRenderMirror;
    private l mRenderRotation;
    private final Size mRenderSize;
    private final MirrorInfo mCaptureMirror = new MirrorInfo();
    private boolean mIsFrontCamera = false;
    private final Size mCaptureRealFrameSize = new Size();
    private final MirrorInfo mPreprocessorMirror = new MirrorInfo();

    public FrameMetaData() {
        l lVar = l.NORMAL;
        this.mPreprocessorRotation = lVar;
        this.mPreprocessorScaleType = GLConstants.GLScaleType.CENTER_CROP;
        this.mRenderMirror = new MirrorInfo();
        this.mRenderRotation = lVar;
        this.mRenderSize = new Size();
        this.mEncodeMirror = new MirrorInfo();
        this.mEncodeRotation = lVar;
        this.mEncodeSize = new Size();
    }

    public Size getCaptureRealSize() {
        return this.mCaptureRealFrameSize;
    }

    public int getEncodeHeight() {
        return this.mEncodeSize.height;
    }

    public l getEncodeRotation() {
        return this.mEncodeRotation;
    }

    public int getEncodeRotationValue() {
        return this.mEncodeRotation.mValue;
    }

    public Size getEncodeSize() {
        return this.mEncodeSize;
    }

    public l getPreprocessorRotation() {
        return this.mPreprocessorRotation;
    }

    public int getPreprocessorRotationValue() {
        return this.mPreprocessorRotation.mValue;
    }

    public GLConstants.GLScaleType getPreprocessorScaleType() {
        return this.mPreprocessorScaleType;
    }

    public int getRenderHeight() {
        return this.mRenderSize.height;
    }

    public l getRenderRotation() {
        return this.mRenderRotation;
    }

    public int getRenderRotationValue() {
        return this.mRenderRotation.mValue;
    }

    public Size getRenderSize() {
        return this.mRenderSize;
    }

    public boolean isCaptureMirrorHorizontal() {
        return this.mCaptureMirror.isHorizontal;
    }

    public boolean isFrontCamera() {
        return this.mIsFrontCamera;
    }

    public boolean isPreprocessorMirrorHorizontal() {
        return this.mPreprocessorMirror.isHorizontal;
    }

    public boolean isPreprocessorMirrorVertical() {
        return this.mPreprocessorMirror.isVertical;
    }

    public boolean isRenderMirrorHorizontal() {
        return this.mRenderMirror.isHorizontal;
    }

    public boolean isRenderMirrorVertical() {
        return this.mRenderMirror.isVertical;
    }

    public void setEncodeMetaData(boolean z10, boolean z11, int i10, int i11, int i12) {
        MirrorInfo mirrorInfo = this.mEncodeMirror;
        mirrorInfo.isHorizontal = z10;
        mirrorInfo.isVertical = z11;
        this.mEncodeRotation = l.a(i10);
        Size size = this.mEncodeSize;
        size.width = i11;
        size.height = i12;
    }

    public void setEncodeMirror(MirrorInfo mirrorInfo) {
        if (mirrorInfo == null) {
            return;
        }
        MirrorInfo mirrorInfo2 = this.mEncodeMirror;
        mirrorInfo2.isHorizontal = mirrorInfo.isHorizontal;
        mirrorInfo2.isVertical = mirrorInfo.isVertical;
    }

    public void setEncodeRotation(l lVar) {
        if (lVar == null) {
            return;
        }
        this.mEncodeRotation = lVar;
    }

    public void setEncodeSize(Size size) {
        this.mEncodeSize.set(size);
    }

    public void setPreprocessorMirror(MirrorInfo mirrorInfo) {
        if (mirrorInfo == null) {
            return;
        }
        MirrorInfo mirrorInfo2 = this.mPreprocessorMirror;
        mirrorInfo2.isHorizontal = mirrorInfo.isHorizontal;
        mirrorInfo2.isVertical = mirrorInfo.isVertical;
    }

    public void setPreprocessorRotation(l lVar) {
        if (lVar == null) {
            return;
        }
        this.mPreprocessorRotation = lVar;
    }

    public void setPreprocessorScaleType(GLConstants.GLScaleType gLScaleType) {
        if (gLScaleType == null) {
            return;
        }
        this.mPreprocessorScaleType = gLScaleType;
    }

    public void setRenderMetaData(boolean z10, boolean z11, int i10, int i11, int i12) {
        MirrorInfo mirrorInfo = this.mRenderMirror;
        mirrorInfo.isHorizontal = z10;
        mirrorInfo.isVertical = z11;
        this.mRenderRotation = l.a(i10);
        Size size = this.mRenderSize;
        size.width = i11;
        size.height = i12;
    }

    public void setRenderMirror(MirrorInfo mirrorInfo) {
        if (mirrorInfo == null) {
            return;
        }
        MirrorInfo mirrorInfo2 = this.mRenderMirror;
        mirrorInfo2.isHorizontal = mirrorInfo.isHorizontal;
        mirrorInfo2.isVertical = mirrorInfo.isVertical;
    }

    public void setRenderRotation(l lVar) {
        if (lVar == null) {
            return;
        }
        this.mRenderRotation = lVar;
    }

    public void setRenderSize(Size size) {
        this.mRenderSize.set(size);
    }
}
