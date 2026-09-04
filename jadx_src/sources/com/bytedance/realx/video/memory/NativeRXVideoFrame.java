package com.bytedance.realx.video.memory;

import androidx.annotation.n0;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.RXColorSpace;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoFrameHelperInterface;
import com.bytedance.realx.video.RXVideoRotation;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class NativeRXVideoFrame implements RXVideoFrameInterface {
    private long nativeHandle;
    RefObject refCounted = new RefObject(new Runnable() { // from class: com.bytedance.realx.video.memory.a
        @Override // java.lang.Runnable
        public final void run() {
            this.f42208b.lambda$new$0();
        }
    });

    @CalledByNative
    private NativeRXVideoFrame(long j10) {
        this.nativeHandle = j10;
    }

    @n0
    public static NativeRXVideoFrame createRXVideoFrame(@n0 NativeRXByteMemory nativeRXByteMemory, long j10, ByteBuffer byteBuffer, RXColorSpace rXColorSpace, RXVideoRotation rXVideoRotation) {
        return new NativeRXVideoFrame(nativeCreateRXVideoFrameFromByteMemory(nativeRXByteMemory.getNativeHandle(), nativeRXByteMemory.getWidth(), nativeRXByteMemory.getHeight(), nativeRXByteMemory.getPixelFormat(), nativeRXByteMemory.getPlaneDataArray(), nativeRXByteMemory.getPlaneLineSizeArray(), j10, byteBuffer, rXColorSpace, rXVideoRotation));
    }

    @n0
    public static NativeRXVideoFrame createRXVideoFrame(@n0 NativeRXOpenGLMemory nativeRXOpenGLMemory, RXVideoFrameHelperInterface rXVideoFrameHelperInterface, long j10, ByteBuffer byteBuffer, RXColorSpace rXColorSpace) {
        return new NativeRXVideoFrame(nativeCreateRXVideoFrameFromOpenGLMemory(nativeRXOpenGLMemory.getNativeHandle(), rXVideoFrameHelperInterface != null ? rXVideoFrameHelperInterface.getNativeHandle() : 0L, j10, byteBuffer, rXColorSpace, nativeRXOpenGLMemory.getRotation()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleaseVideoFrame(j10);
            this.nativeHandle = 0L;
        }
    }

    private static native long nativeCreateRXVideoFrameFromByteMemory(long j10, int i10, int i11, RXPixelFormat rXPixelFormat, ByteBuffer[] byteBufferArr, int[] iArr, long j11, ByteBuffer byteBuffer, RXColorSpace rXColorSpace, RXVideoRotation rXVideoRotation);

    private static native long nativeCreateRXVideoFrameFromOpenGLMemory(long j10, long j11, long j12, ByteBuffer byteBuffer, RXColorSpace rXColorSpace, RXVideoRotation rXVideoRotation);

    private static native RXColorSpace nativeGetColorSpace(long j10);

    private static native RXVideoMemoryInterface nativeGetFrameMemory(long j10);

    private static native RXVideoRotation nativeGetRotation(long j10);

    private static native ByteBuffer nativeGetSupplementData(long j10);

    private static native long nativeGetTimestampNs(long j10);

    private static native long nativeGetTimestampUs(long j10);

    private static native void nativeReleaseVideoFrame(long j10);

    private static native void nativeSetRotation(long j10, RXVideoRotation rXVideoRotation);

    private static native void nativeSetTimestampNs(long j10, long j11);

    private static native void nativeSetTimestampUs(long j10, long j11);

    private static native NativeRXVideoFrame nativeToI420(long j10);

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public RXVideoMemoryInterface getAndRetainVideoFrameMemory() {
        if (isNullPointer()) {
            return null;
        }
        return nativeGetFrameMemory(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public RXColorSpace getColorSpace() {
        return isNullPointer() ? RXColorSpace.kUnknown : nativeGetColorSpace(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public int getHeight() {
        RXVideoMemoryInterface andRetainVideoFrameMemory = getAndRetainVideoFrameMemory();
        if (andRetainVideoFrameMemory == null) {
            return 0;
        }
        int height = andRetainVideoFrameMemory.getHeight();
        andRetainVideoFrameMemory.release();
        return height;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public int getRotatedHeight() {
        RXVideoMemoryInterface andRetainVideoFrameMemory = getAndRetainVideoFrameMemory();
        if (andRetainVideoFrameMemory == null) {
            return 0;
        }
        int width = andRetainVideoFrameMemory.getWidth();
        int height = andRetainVideoFrameMemory.getHeight();
        andRetainVideoFrameMemory.release();
        return getRotation().value() % 180 == 0 ? height : width;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public int getRotatedWidth() {
        RXVideoMemoryInterface andRetainVideoFrameMemory = getAndRetainVideoFrameMemory();
        if (andRetainVideoFrameMemory == null) {
            return 0;
        }
        int width = andRetainVideoFrameMemory.getWidth();
        int height = andRetainVideoFrameMemory.getHeight();
        andRetainVideoFrameMemory.release();
        return getRotation().value() % 180 == 0 ? width : height;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public RXVideoRotation getRotation() {
        return isNullPointer() ? RXVideoRotation.VIDEO_ROTATION_0 : nativeGetRotation(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public ByteBuffer getSupplementData() {
        if (isNullPointer()) {
            return null;
        }
        return nativeGetSupplementData(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public long getTimestampNs() {
        if (isNullPointer()) {
            return 0L;
        }
        return nativeGetTimestampNs(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public long getTimestampUs() {
        if (isNullPointer()) {
            return 0L;
        }
        return nativeGetTimestampUs(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public int getWidth() {
        RXVideoMemoryInterface andRetainVideoFrameMemory = getAndRetainVideoFrameMemory();
        if (andRetainVideoFrameMemory == null) {
            return 0;
        }
        int width = andRetainVideoFrameMemory.getWidth();
        andRetainVideoFrameMemory.release();
        return width;
    }

    protected boolean isNullPointer() {
        return this.nativeHandle == 0;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface, com.bytedance.realx.base.RefCounted
    public synchronized void release() {
        this.refCounted.release();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface, com.bytedance.realx.base.RefCounted
    public synchronized void retain() {
        this.refCounted.retain();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public void setRotation(RXVideoRotation rXVideoRotation) {
        if (isNullPointer()) {
            return;
        }
        nativeSetRotation(this.nativeHandle, rXVideoRotation);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public void setTimestampNs(long j10) {
        if (isNullPointer()) {
            nativeSetTimestampNs(this.nativeHandle, j10);
        }
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public void setTimestampUs(long j10) {
        if (isNullPointer()) {
            nativeSetTimestampUs(this.nativeHandle, j10);
        }
    }

    @Override // com.bytedance.realx.video.memory.RXVideoFrameInterface
    public RXVideoFrameInterface toI420() {
        if (isNullPointer()) {
            return null;
        }
        return nativeToI420(this.nativeHandle);
    }
}
