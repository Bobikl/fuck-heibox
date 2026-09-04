package com.tencent.ugc.preprocessor;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.frame.FrameMetaData;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.videobase.ConvertParams;

/* JADX INFO: loaded from: classes4.dex */
public class VideoPreprocessor {
    private final String TAG = "VideoPreprocessor_" + hashCode();
    private final SparseArray<ConvertParams> mConvertParamsList = new SparseArray<>();
    private final GPUPreprocessor mPreprocessor;

    public VideoPreprocessor(Context context, BeautyProcessor beautyProcessor) {
        this.mPreprocessor = new GPUPreprocessor(context, beautyProcessor);
    }

    private void applyMetaData(PixelFrame pixelFrame) {
        FrameMetaData metaData = pixelFrame.getMetaData();
        if (metaData == null) {
            return;
        }
        pixelFrame.setRotation(l.NORMAL);
        pixelFrame.postRotate(metaData.getPreprocessorRotation());
        pixelFrame.setMirrorHorizontal(metaData.isPreprocessorMirrorHorizontal());
        pixelFrame.setMirrorVertical(metaData.isPreprocessorMirrorVertical());
        Size renderSize = metaData.getRenderSize();
        if (renderSize.isValid()) {
            this.mPreprocessor.setProcessSize(renderSize.width, renderSize.height);
        }
    }

    private GLConstants.GLScaleType getScaleTypeFromMetaData(PixelFrame pixelFrame) {
        FrameMetaData metaData = pixelFrame.getMetaData();
        return metaData == null ? GLConstants.GLScaleType.CENTER_CROP : metaData.getPreprocessorScaleType();
    }

    private void recalculateProcessSizeInternal() {
        if (this.mConvertParamsList.size() == 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.mConvertParamsList.size(); i12++) {
            ConvertParams convertParamsValueAt = this.mConvertParamsList.valueAt(i12);
            l lVar = convertParamsValueAt.rotation;
            boolean z10 = lVar == l.ROTATION_90 || lVar == l.ROTATION_270;
            int i13 = z10 ? convertParamsValueAt.height : convertParamsValueAt.width;
            int i14 = z10 ? convertParamsValueAt.width : convertParamsValueAt.height;
            if (i10 * i14 != i11 * i13) {
                LiteavLog.w(this.TAG, "video preprocessor has different w/h ratio: %dx%d vs %dx%d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i13), Integer.valueOf(i14));
            }
            if (i13 * i14 > i10 * i11) {
                i11 = i14;
                i10 = i13;
            }
        }
        this.mPreprocessor.setProcessSize(i10, i11);
    }

    public BeautyProcessor getBeautyProcessor() {
        return this.mPreprocessor.getBeautyProcessor();
    }

    public synchronized void processFrame(PixelFrame pixelFrame) {
        PixelFrame pixelFrame2 = new PixelFrame(pixelFrame);
        applyMetaData(pixelFrame2);
        this.mPreprocessor.processFrame(pixelFrame2, getScaleTypeFromMetaData(pixelFrame2));
    }

    public void registerVideoProcessedListener(int i10, ConvertParams convertParams, GLConstants.a aVar, GLConstants.PixelFormatType pixelFormatType, boolean z10, VideoPreprocessorListener videoPreprocessorListener) {
        GLConstants.a aVar2 = GLConstants.a.TEXTURE_OES;
        if (aVar == GLConstants.a.TEXTURE_2D) {
            GLConstants.PixelFormatType pixelFormatType2 = GLConstants.PixelFormatType.RGBA;
        }
        this.mPreprocessor.registerVideoProcessedListener(i10, convertParams, aVar, pixelFormatType, z10, videoPreprocessorListener);
        this.mConvertParamsList.put(i10, convertParams);
        recalculateProcessSizeInternal();
    }

    public void setFilterGroupImages(float f10, Bitmap bitmap, float f11, Bitmap bitmap2, float f12) {
        this.mPreprocessor.setFilterGroupImages(f10, bitmap, f11, bitmap2, f12);
    }

    public void setFilterMixLevel(float f10) {
        LiteavLog.i(this.TAG, "setFilterMixLevel: ".concat(String.valueOf(f10)));
        this.mPreprocessor.setFilterMixLevel(f10);
    }

    public void setGaussianBlurLevel(float f10) {
        this.mPreprocessor.setGaussianBlurLevel(f10 / 4.0f);
    }

    public void uninitialize() {
        this.mPreprocessor.uninitialize();
    }

    public void unregisterVideoProcessedListener(int i10, VideoPreprocessorListener videoPreprocessorListener) {
        this.mPreprocessor.unregisterVideoProcessedListener(i10, videoPreprocessorListener);
        this.mConvertParamsList.remove(i10);
        recalculateProcessSizeInternal();
    }
}
