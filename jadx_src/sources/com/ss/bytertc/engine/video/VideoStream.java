package com.ss.bytertc.engine.video;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RefCounted;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class VideoStream implements RefCounted {
    private final Buffer buffer;
    private final int height;
    private final int width;

    public interface Buffer extends RefCounted {
        @CalledByNative("Buffer")
        ByteBuffer getData();

        @CalledByNative("Buffer")
        int getDataSize();

        @Override // com.bytedance.realx.base.RefCounted
        @CalledByNative("VideoStreamBuffer")
        void release();

        @Override // com.bytedance.realx.base.RefCounted
        @CalledByNative("VideoStreamBuffer")
        void retain();
    }

    @CalledByNative
    public VideoStream(Buffer buffer, int i10, int i11) {
        this.buffer = buffer;
        this.width = i10;
        this.height = i11;
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
    public int getHeight() {
        return this.height;
    }

    @CalledByNative
    public int getWidth() {
        return this.width;
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
}
