package com.ss.bytertc.engine.mediaio;

import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes4.dex */
public class RTCVideoFrame extends RefObject {

    @Deprecated
    public ByteBuffer buffer;

    @Deprecated
    public int buffer_type;

    @Deprecated
    public int color_space;

    @Deprecated
    public int cropBottom;

    @Deprecated
    public int cropLeft;

    @Deprecated
    public int cropRight;

    @Deprecated
    public int cropTop;

    @Deprecated
    public EGLContext eglContext11;

    @Deprecated
    public android.opengl.EGLContext eglContext14;

    @Deprecated
    public ByteBuffer extend_data;

    @Deprecated
    public int format;

    @Deprecated
    public int glTarget;

    @Deprecated
    public int height;
    private ByteBuffer[] planes_;

    @Deprecated
    public int rotation;

    @Deprecated
    public int stride;
    private int[] strides_;

    @Deprecated
    public ByteBuffer supplementary_info;

    @Deprecated
    public int textureId;

    @Deprecated
    public long timestamp;

    @Deprecated
    public float[] transform;
    private int width_;

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface BufferType {
        public static final int PLANAR = 2;
        public static final int RAWDATA = 0;
        public static final int RTCBUFFER = 2;
        public static final int TEXTURE = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PixelFormat {
        public static final int I420 = 1;
        public static final int NV21 = 3;
        public static final int TEXTURE_2D = 10;
        public static final int TEXTURE_OES = 11;
        public static final int UNKNOW = 0;
    }

    public RTCVideoFrame() {
        super(null);
        this.cropLeft = 0;
        this.cropTop = 0;
        this.cropRight = 0;
        this.cropBottom = 0;
        this.eglContext11 = null;
        this.eglContext14 = null;
        this.transform = null;
    }

    public RTCVideoFrame(int i10, int i11, float[] fArr, @p0 ByteBuffer byteBuffer, @p0 ByteBuffer byteBuffer2, int i12, int i13, int i14, long j10, @p0 Runnable runnable) {
        super(runnable);
        this.cropLeft = 0;
        this.cropTop = 0;
        this.cropRight = 0;
        this.cropBottom = 0;
        this.eglContext11 = null;
        this.eglContext14 = null;
        this.stride = i12;
        this.width_ = i12;
        this.height = i13;
        this.buffer_type = 1;
        this.format = i11;
        this.rotation = i14;
        this.timestamp = j10;
        this.extend_data = byteBuffer;
        this.supplementary_info = byteBuffer2;
        this.textureId = i10;
        this.transform = fArr;
    }

    @Deprecated
    public RTCVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, long j10, int i14, @p0 Runnable runnable) {
        super(runnable);
        this.cropLeft = 0;
        this.cropTop = 0;
        this.cropRight = 0;
        this.cropBottom = 0;
        this.eglContext11 = null;
        this.eglContext14 = null;
        this.transform = null;
        this.stride = i10;
        this.width_ = i11;
        this.height = i12;
        this.buffer_type = 0;
        this.format = i14;
        this.rotation = i13;
        this.timestamp = j10;
        this.extend_data = byteBuffer2;
        this.supplementary_info = byteBuffer3;
        this.buffer = byteBuffer;
    }

    @Deprecated
    public RTCVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, long j10, @p0 Runnable runnable) {
        super(runnable);
        this.cropLeft = 0;
        this.cropTop = 0;
        this.cropRight = 0;
        this.cropBottom = 0;
        this.eglContext11 = null;
        this.eglContext14 = null;
        this.transform = null;
        this.stride = i10;
        this.height = i11;
        this.buffer_type = 0;
        this.format = 1;
        this.rotation = i12;
        this.color_space = i13;
        this.timestamp = j10;
        this.extend_data = byteBuffer2;
        this.supplementary_info = byteBuffer3;
        this.buffer = byteBuffer;
    }

    @Deprecated
    public RTCVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, long j10, @p0 Runnable runnable) {
        super(runnable);
        this.cropLeft = 0;
        this.cropTop = 0;
        this.cropRight = 0;
        this.cropBottom = 0;
        this.eglContext11 = null;
        this.eglContext14 = null;
        this.transform = null;
        this.stride = i10;
        this.width_ = i10;
        this.height = i11;
        this.buffer_type = 0;
        this.format = 1;
        this.rotation = i12;
        this.timestamp = j10;
        this.extend_data = byteBuffer2;
        this.supplementary_info = byteBuffer3;
        this.buffer = byteBuffer;
    }

    public RTCVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, int i10, int i11, int i12, int i13, long j10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, @p0 Runnable runnable) {
        super(runnable);
        this.cropLeft = 0;
        this.cropTop = 0;
        this.cropRight = 0;
        this.cropBottom = 0;
        this.eglContext11 = null;
        this.eglContext14 = null;
        this.transform = null;
        this.buffer_type = 2;
        this.planes_ = byteBufferArr;
        this.strides_ = iArr;
        this.width_ = i10;
        this.height = i11;
        this.format = i12;
        this.rotation = i13;
        this.timestamp = j10;
        this.extend_data = byteBuffer;
        this.supplementary_info = byteBuffer2;
    }

    public static RTCVideoFrame createI420Frame(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, long j10, @p0 Runnable runnable) {
        return new RTCVideoFrame(new ByteBuffer[]{byteBuffer, byteBuffer2, byteBuffer3}, new int[]{i10, i11, i12}, i13, i14, 1, i15, j10, (ByteBuffer) null, (ByteBuffer) null, runnable);
    }

    public static RTCVideoFrame createTextureFrame(int i10, int i11, int i12, int i13, int i14, long j10, float[] fArr, @p0 Runnable runnable) {
        if (i10 == 10 || i10 == 11) {
            return new RTCVideoFrame(i11, i10, fArr, (ByteBuffer) null, (ByteBuffer) null, i12, i13, i14, j10, runnable);
        }
        return null;
    }

    public static RTCVideoFrame shallowCopy(RTCVideoFrame rTCVideoFrame) {
        RTCVideoFrame rTCVideoFrame2 = new RTCVideoFrame();
        rTCVideoFrame2.buffer = rTCVideoFrame.buffer;
        rTCVideoFrame2.buffer_type = rTCVideoFrame.buffer_type;
        rTCVideoFrame2.cropBottom = rTCVideoFrame.cropBottom;
        rTCVideoFrame2.cropLeft = rTCVideoFrame.cropLeft;
        rTCVideoFrame2.cropRight = rTCVideoFrame.cropRight;
        rTCVideoFrame2.cropTop = rTCVideoFrame.cropTop;
        rTCVideoFrame2.eglContext11 = rTCVideoFrame.eglContext11;
        rTCVideoFrame2.eglContext14 = rTCVideoFrame.eglContext14;
        rTCVideoFrame2.extend_data = rTCVideoFrame.extend_data;
        rTCVideoFrame2.supplementary_info = rTCVideoFrame.supplementary_info;
        rTCVideoFrame2.format = rTCVideoFrame.format;
        rTCVideoFrame2.glTarget = rTCVideoFrame.glTarget;
        rTCVideoFrame2.stride = rTCVideoFrame.stride;
        rTCVideoFrame2.width_ = rTCVideoFrame.width_;
        rTCVideoFrame2.height = rTCVideoFrame.height;
        rTCVideoFrame2.rotation = rTCVideoFrame.rotation;
        rTCVideoFrame2.textureId = rTCVideoFrame.textureId;
        rTCVideoFrame2.timestamp = rTCVideoFrame.timestamp;
        rTCVideoFrame2.transform = rTCVideoFrame.transform;
        rTCVideoFrame2.planes_ = rTCVideoFrame.planes_;
        rTCVideoFrame2.strides_ = rTCVideoFrame.strides_;
        return rTCVideoFrame2;
    }

    public int getColorspace() {
        return this.color_space;
    }

    public int getCropBottom() {
        return this.cropBottom;
    }

    public int getCropLeft() {
        return this.cropLeft;
    }

    public int getCropRight() {
        return this.cropRight;
    }

    public int getCropTop() {
        return this.cropTop;
    }

    public android.opengl.EGLContext getEglContext() {
        return this.eglContext14;
    }

    public ByteBuffer getExtendData() {
        return this.extend_data;
    }

    public int getGlTextureId() {
        return this.textureId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getPixelFormat() {
        return this.format;
    }

    public ByteBuffer getPlane(int i10) {
        if (getPlaneCount() <= i10) {
            return null;
        }
        return this.buffer_type == 0 ? this.buffer : this.planes_[i10].slice();
    }

    public int getPlaneCount() {
        if (this.buffer_type == 0) {
            return 1;
        }
        return this.planes_.length;
    }

    public int getPlaneStride(int i10) {
        if (getPlaneCount() <= i10) {
            return 0;
        }
        return this.buffer_type == 0 ? this.stride : this.strides_[i10];
    }

    public int getRotation() {
        return this.rotation;
    }

    public ByteBuffer getSupplementaryInfo() {
        return this.supplementary_info;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public float[] getTransform() {
        return this.transform;
    }

    public int getWidth() {
        return this.width_;
    }

    public void setColorspace(int i10) {
        this.color_space = i10;
    }

    public void setRotation(int i10) {
        this.rotation = i10;
    }

    public void setTimestamp(long j10) {
        this.timestamp = j10;
    }
}
