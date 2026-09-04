package com.bytedance.realx.video;

import android.opengl.EGLContext;
import androidx.annotation.n0;
import com.bytedance.realx.video.memory.RefObject;

/* JADX INFO: loaded from: classes6.dex */
public class RXVideoFrameHelper implements RXVideoFrameHelperInterface {
    protected long nativeHandle;
    RefObject refCounted = new RefObject(new Runnable() { // from class: com.bytedance.realx.video.n
        @Override // java.lang.Runnable
        public final void run() {
            this.f42214b.lambda$new$0();
        }
    });

    private RXVideoFrameHelper(long j10) {
        this.nativeHandle = j10;
    }

    @n0
    public static RXVideoFrameHelperInterface createRXVideoFrameHelperOpenGL(EGLContext eGLContext) {
        return new RXVideoFrameHelper(nativeCreateRXVideoFrameHelperOpenGL(EglBaseUtils.getNativeEGLContext(eGLContext)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleaseVideoFrameHelper(j10);
            this.nativeHandle = 0L;
        }
    }

    private static native long nativeCreateRXVideoFrameHelperOpenGL(long j10);

    private static native void nativeReleaseVideoFrameHelper(long j10);

    @Override // com.bytedance.realx.video.RXVideoFrameHelperInterface
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    @Override // com.bytedance.realx.video.RXVideoFrameHelperInterface, com.bytedance.realx.base.RefCounted
    public synchronized void release() {
        this.refCounted.release();
    }

    @Override // com.bytedance.realx.video.RXVideoFrameHelperInterface, com.bytedance.realx.base.RefCounted
    public synchronized void retain() {
        this.refCounted.retain();
    }
}
