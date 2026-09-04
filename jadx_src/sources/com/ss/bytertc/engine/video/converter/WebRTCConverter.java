package com.ss.bytertc.engine.video.converter;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.realx.video.JavaI420Buffer;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.utils.ByteBufferUtils;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.utils.j;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class WebRTCConverter {
    private static final String TAG = "WebRTCConverter";

    public static VideoFrame convertByteI420Frame2WebrtcI420Frame(com.ss.bytertc.engine.video.VideoFrame videoFrame) {
        if (videoFrame.getFrameType() != VideoFrameType.RAW_MEMORY || videoFrame.getPixelFormat() != VideoPixelFormat.I420) {
            return null;
        }
        videoFrame.retain();
        try {
            return new VideoFrame(JavaI420Buffer.wrap(videoFrame.getWidth(), videoFrame.getHeight(), videoFrame.getPlaneData(0), videoFrame.getPlaneStride(0), videoFrame.getPlaneData(1), videoFrame.getPlaneStride(1), videoFrame.getPlaneData(2), videoFrame.getPlaneStride(2), new j(videoFrame)), videoFrame.getRotation().value(), videoFrame.getTimeStampUs());
        } catch (IllegalArgumentException e10) {
            videoFrame.release();
            LogUtil.e(TAG, "Frame convert failed: " + e10.getMessage());
            return null;
        }
    }

    public static VideoFrame convertByteRGBAFrame2WebrtcI420Frame(com.ss.bytertc.engine.video.VideoFrame videoFrame) {
        if (videoFrame.getFrameType() != VideoFrameType.RAW_MEMORY || videoFrame.getPixelFormat() != VideoPixelFormat.RGBA) {
            return null;
        }
        int width = videoFrame.getWidth();
        int height = videoFrame.getHeight();
        int planeStride = videoFrame.getPlaneStride(0);
        int i10 = ((width + 63) / 64) * 64;
        int i11 = (((width >> 1) + 63) / 64) * 64;
        ByteBuffer planeData = videoFrame.getPlaneData(0);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i10 * height);
        int i12 = ((height + 1) >> 1) * i11;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i12);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(i12);
        ByteBufferUtils.nativeRGBAToI420(planeData, planeStride, byteBufferAllocateDirect, i10, byteBufferAllocateDirect2, i11, byteBufferAllocateDirect3, i11, width, height);
        return new VideoFrame(JavaI420Buffer.wrap(width, height, byteBufferAllocateDirect, i10, byteBufferAllocateDirect2, i11, byteBufferAllocateDirect3, i11, new j(videoFrame)), videoFrame.getRotation().value(), videoFrame.getTimeStampUs());
    }

    public static VideoFrame convertByteTexFrame2WebrtcTexFrame(com.ss.bytertc.engine.video.VideoFrame videoFrame, Looper looper) {
        if (videoFrame.getFrameType() != VideoFrameType.GL_TEXTURE || looper == null) {
            return null;
        }
        Matrix matrixConvertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(videoFrame.getTextureMatrix());
        VideoFrame.TextureBuffer.Type type = videoFrame.getPixelFormat() == VideoPixelFormat.TEXTURE_2D ? VideoFrame.TextureBuffer.Type.RGB : VideoFrame.TextureBuffer.Type.OES;
        videoFrame.retain();
        return new VideoFrame(new TextureBufferImpl(videoFrame.getWidth(), videoFrame.getHeight(), type, videoFrame.getTextureID(), matrixConvertMatrixToAndroidGraphicsMatrix, new Handler(looper), new YuvConverter(), new j(videoFrame)), videoFrame.getRotation().value(), videoFrame.getTimeStampUs());
    }
}
