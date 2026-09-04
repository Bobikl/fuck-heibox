package com.bytedance.realx.video;

import android.graphics.Matrix;
import android.opengl.EGLContext;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RefCounted;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class VideoFrame implements RefCounted {
    private final Buffer buffer;
    private int colorSpace;
    private final ByteBuffer extendedData;
    private boolean isFlip;
    private int iso;
    private final int rotation;
    private final long timestampNs;

    public interface Buffer extends RefCounted {

        public interface BufferType {
            public static final int I420 = 3;
            public static final int Null = 0;
            public static final int Nv12 = 1;
            public static final int Nv21 = 2;
            public static final int RGBA = 5;
            public static final int Texture = 4;
        }

        @CalledByNative("Buffer")
        Buffer copyData();

        @CalledByNative("Buffer")
        Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15);

        @CalledByNative("Buffer")
        int getBufferType();

        @CalledByNative("Buffer")
        int getHeight();

        @CalledByNative("Buffer")
        int getWidth();

        @Override // com.bytedance.realx.base.RefCounted
        @CalledByNative("Buffer")
        void release();

        @Override // com.bytedance.realx.base.RefCounted
        @CalledByNative("Buffer")
        void retain();

        @CalledByNative("Buffer")
        Buffer scaleAndFill(int i10, int i11, int i12, int i13);

        @CalledByNative("Buffer")
        I420Buffer toI420();

        @CalledByNative("Buffer")
        NV12Buffer toNV12();
    }

    public enum ColorSpace {
        kUnknown(0),
        kYCbCrBT601LimitedRange(1),
        kYCbCrBT601FullRange(2),
        kYCbCrBT709LimitedRange(3),
        kYCbCrBT709FullRange(4);

        private int colorSpace;

        ColorSpace(int i10) {
            this.colorSpace = i10;
        }

        public int getColorSpace() {
            return this.colorSpace;
        }
    }

    public interface I420Buffer extends Buffer {
        @Override // com.bytedance.realx.video.VideoFrame.Buffer
        @CalledByNative("I420Buffer")
        int getBufferType();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I420Buffer")
        int getStrideU();

        @CalledByNative("I420Buffer")
        int getStrideV();

        @CalledByNative("I420Buffer")
        int getStrideY();
    }

    public interface NV12Buffer extends Buffer {
        @Override // com.bytedance.realx.video.VideoFrame.Buffer
        @CalledByNative("NV12Buffer")
        int getBufferType();

        @CalledByNative("NV12Buffer")
        ByteBuffer getDataUV();

        @CalledByNative("NV12Buffer")
        ByteBuffer getDataY();

        @CalledByNative("NV12Buffer")
        int getStrideUV();

        @CalledByNative("NV12Buffer")
        int getStrideY();
    }

    public interface TextureBuffer extends Buffer {

        public enum Type {
            OES(36197),
            RGB(bb.c.e.F);

            private final int glTarget;

            Type(int i10) {
                this.glTarget = i10;
            }

            @CalledByNative("TextureBuffer")
            public int getGlTarget() {
                return this.glTarget;
            }
        }

        @CalledByNative("TextureBuffer")
        Buffer cropAndScaleWithFilter(int i10, int i11, int i12, int i13, int i14, int i15, int i16);

        @Override // com.bytedance.realx.video.VideoFrame.Buffer
        @CalledByNative("TextureBuffer")
        int getBufferType();

        @CalledByNative("TextureBuffer")
        EGLContext getEglContext();

        @CalledByNative("TextureBuffer")
        long getNativeEglContext();

        @CalledByNative("TextureBuffer")
        FilterType getScaleFilter();

        @CalledByNative("TextureBuffer")
        int getTextureId();

        @CalledByNative("TextureBuffer")
        Matrix getTransformMatrix();

        @CalledByNative("TextureBuffer")
        Type getType();

        @CalledByNative("TextureBuffer")
        int getTypeGlTarget();

        @CalledByNative("TextureBuffer")
        int getUnscaledHeight();

        @CalledByNative("TextureBuffer")
        int getUnscaledWidth();

        @CalledByNative("TextureBuffer")
        float[] nativeGetTransFormMatrix();
    }

    public VideoFrame(Buffer buffer, int i10, long j10) {
        this(buffer, (ByteBuffer) null, i10, j10);
    }

    public VideoFrame(Buffer buffer, int i10, long j10, boolean z10) {
        this.isFlip = false;
        this.colorSpace = 0;
        this.iso = -1;
        if (buffer == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        }
        if (i10 % 90 != 0) {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        this.buffer = buffer;
        this.rotation = i10;
        this.timestampNs = j10;
        this.extendedData = null;
        this.isFlip = z10;
    }

    public VideoFrame(Buffer buffer, ByteBuffer byteBuffer, int i10, long j10) {
        this.isFlip = false;
        this.colorSpace = 0;
        this.iso = -1;
        if (buffer == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        }
        if (i10 % 90 != 0) {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        this.buffer = buffer;
        this.rotation = i10;
        this.timestampNs = j10;
        this.extendedData = byteBuffer;
    }

    public VideoFrame(Buffer buffer, ByteBuffer byteBuffer, int i10, long j10, boolean z10) {
        this.isFlip = false;
        this.colorSpace = 0;
        this.iso = -1;
        if (buffer == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        }
        if (i10 % 90 != 0) {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        this.buffer = buffer;
        this.rotation = i10;
        this.timestampNs = j10;
        this.extendedData = byteBuffer;
        this.isFlip = z10;
    }

    @CalledByNative
    public VideoFrame(Buffer buffer, ByteBuffer byteBuffer, int i10, long j10, boolean z10, int i11) {
        this.isFlip = false;
        this.colorSpace = 0;
        this.iso = -1;
        if (buffer == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        }
        if (i10 % 90 != 0) {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        this.buffer = buffer;
        this.rotation = i10;
        this.timestampNs = j10;
        this.extendedData = byteBuffer;
        this.isFlip = z10;
        this.colorSpace = i11;
    }

    @CalledByNative
    public static ByteBuffer allocateDirectByteBuffer(int i10) {
        return ByteBuffer.allocateDirect(i10);
    }

    @CalledByNative
    public Buffer getBuffer() {
        return this.buffer;
    }

    @CalledByNative
    public int getColorSpace() {
        return this.colorSpace;
    }

    public ByteBuffer getExtendedData() {
        return this.extendedData;
    }

    @CalledByNative
    public boolean getFlipState() {
        return this.isFlip;
    }

    @CalledByNative
    public int getIso() {
        return this.iso;
    }

    public int getRotatedHeight() {
        return this.rotation % 180 == 0 ? this.buffer.getHeight() : this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        return this.rotation % 180 == 0 ? this.buffer.getWidth() : this.buffer.getHeight();
    }

    @CalledByNative
    public int getRotation() {
        return this.rotation;
    }

    @CalledByNative
    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override // com.bytedance.realx.base.RefCounted
    @CalledByNative
    public void release() {
        this.buffer.release();
    }

    @Override // com.bytedance.realx.base.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    @CalledByNative
    public void setFlipState(boolean z10) {
        this.isFlip = z10;
    }

    public void setIso(int i10) {
        this.iso = i10;
    }
}
