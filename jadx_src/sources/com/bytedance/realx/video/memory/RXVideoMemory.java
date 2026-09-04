package com.bytedance.realx.video.memory;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RXVideoMemory implements RXVideoMemoryInterface {
    protected long nativeHandle;
    RefObject refCounted = new RefObject(new Runnable() { // from class: com.bytedance.realx.video.memory.d
        @Override // java.lang.Runnable
        public final void run() {
            this.f42213b.lambda$new$0();
        }
    });

    protected RXVideoMemory(long j10) {
        this.nativeHandle = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleaseVideoMemory(j10);
            this.nativeHandle = 0L;
        }
    }

    private static native void nativeReleaseVideoMemory(long j10);

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    protected boolean isNullPointer() {
        return this.nativeHandle == 0;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface, com.bytedance.realx.base.RefCounted
    public synchronized void release() {
        this.refCounted.release();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface, com.bytedance.realx.base.RefCounted
    public synchronized void retain() {
        this.refCounted.retain();
    }
}
