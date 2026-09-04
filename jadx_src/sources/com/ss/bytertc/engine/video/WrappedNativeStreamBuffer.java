package com.ss.bytertc.engine.video;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.JniCommon;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class WrappedNativeStreamBuffer implements VideoStream.Buffer {
    private final ByteBuffer data;
    private final long nativeBuffer;
    private final int size;

    @CalledByNative
    WrappedNativeStreamBuffer(int i10, ByteBuffer byteBuffer, long j10) {
        this.size = i10;
        this.data = byteBuffer;
        this.nativeBuffer = j10;
        retain();
    }

    @Override // com.ss.bytertc.engine.video.VideoStream.Buffer
    public ByteBuffer getData() {
        return this.data.slice();
    }

    @Override // com.ss.bytertc.engine.video.VideoStream.Buffer
    public int getDataSize() {
        return this.size;
    }

    @Override // com.ss.bytertc.engine.video.VideoStream.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        JniCommon.nativeReleaseRef(this.nativeBuffer);
    }

    @Override // com.ss.bytertc.engine.video.VideoStream.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        JniCommon.nativeAddRef(this.nativeBuffer);
    }
}
