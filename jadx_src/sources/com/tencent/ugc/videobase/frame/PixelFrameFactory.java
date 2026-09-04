package com.tencent.ugc.videobase.frame;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.egl.EGLException;
import com.tencent.ugc.videobase.utils.MemoryAllocator;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class PixelFrameFactory {
    private EGLSurface mCallerEGLDrawSurface;
    private EGLSurface mCallerEGLReadSurface;
    private GLTexturePool mGLTexturePool;
    private final Size mLastFrameSize;
    private PixelFrameRenderer mPixelFrameRenderer;
    private EGLCore mRenderEGLCore;
    private final com.tencent.liteav.base.b.b mThrottlers;
    private final String mTAG = "PixelFrameFactory_" + hashCode();
    private Object mSharedEGLContext = null;
    private EGLDisplay mCallerEGLDisplay = EGL14.EGL_NO_DISPLAY;
    private EGLContext mCallerEGLContext = EGL14.EGL_NO_CONTEXT;

    public PixelFrameFactory() {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.mCallerEGLReadSurface = eGLSurface;
        this.mCallerEGLDrawSurface = eGLSurface;
        this.mLastFrameSize = new Size();
        this.mThrottlers = new com.tencent.liteav.base.b.b();
    }

    private PixelFrame copyTexture(PixelFrame pixelFrame) {
        if (this.mGLTexturePool == null) {
            this.mGLTexturePool = new GLTexturePool();
        }
        GLTexture gLTextureObtain = this.mGLTexturePool.obtain(pixelFrame.getWidth(), pixelFrame.getHeight());
        gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
        if (this.mLastFrameSize.width != pixelFrame.getWidth() || this.mLastFrameSize.height != pixelFrame.getHeight()) {
            PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
            if (pixelFrameRenderer != null) {
                pixelFrameRenderer.uninitialize();
                this.mPixelFrameRenderer = null;
            }
            this.mLastFrameSize.width = pixelFrame.getWidth();
            this.mLastFrameSize.height = pixelFrame.getHeight();
        }
        if (this.mPixelFrameRenderer == null) {
            this.mPixelFrameRenderer = new PixelFrameRenderer(pixelFrame.getWidth(), pixelFrame.getHeight());
        }
        this.mPixelFrameRenderer.renderFrame(pixelFrame, GLConstants.GLScaleType.FILL, gLTextureObtain);
        PixelFrame pixelFrameWrap = gLTextureObtain.wrap(pixelFrame.getGLContext());
        gLTextureObtain.release();
        return pixelFrameWrap;
    }

    private PixelFrame deepCopyDataToPixelFrame(PixelFrame pixelFrame, Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArrAllocateByteArray = MemoryAllocator.allocateByteArray(((byte[]) obj).length);
            if (bArrAllocateByteArray == null) {
                return null;
            }
            System.arraycopy(obj, 0, bArrAllocateByteArray, 0, bArrAllocateByteArray.length);
            pixelFrame.setData(bArrAllocateByteArray);
        } else if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            ByteBuffer byteBufferAllocateDirectBuffer = MemoryAllocator.allocateDirectBuffer(byteBuffer.capacity());
            if (byteBufferAllocateDirectBuffer == null) {
                return null;
            }
            byteBuffer.rewind();
            byteBufferAllocateDirectBuffer.put(byteBuffer);
            byteBufferAllocateDirectBuffer.rewind();
            pixelFrame.setBuffer(byteBufferAllocateDirectBuffer);
        }
        pixelFrame.retain();
        return pixelFrame;
    }

    private PixelFrame deepCopyTextureToPixelFrame(PixelFrame pixelFrame, Object obj) {
        saveCallerEGLContext();
        GLES20.glFinish();
        if (!CommonUtil.equals(this.mSharedEGLContext, obj)) {
            uninitOpenGLComponents();
            initRenderEGLContext(obj);
        }
        if (!makeCurrent()) {
            LiteavLog.e(this.mThrottlers.a("makeCurrent"), this.mTAG, "use origin texture when makeCurrent error", new Object[0]);
            pixelFrame.retain();
            return pixelFrame;
        }
        PixelFrame pixelFrameCopyTexture = copyTexture(pixelFrame);
        GLES20.glFinish();
        restoreCallerEGLContext();
        return pixelFrameCopyTexture;
    }

    private void initRenderEGLContext(Object obj) {
        if (this.mRenderEGLCore != null) {
            return;
        }
        LiteavLog.i(this.mTAG, "initRenderEGLContext");
        this.mSharedEGLContext = obj;
        EGLCore eGLCore = new EGLCore();
        this.mRenderEGLCore = eGLCore;
        try {
            eGLCore.initialize(obj, null, 128, 128);
        } catch (EGLException e10) {
            this.mRenderEGLCore = null;
            LiteavLog.e(this.mThrottlers.a("initEGLCore"), this.mTAG, "create EGLCore failed.", e10);
        }
    }

    private boolean makeCurrent() {
        EGLCore eGLCore = this.mRenderEGLCore;
        if (eGLCore == null) {
            LiteavLog.e(this.mThrottlers.a("makeCurrentNull"), this.mTAG, "makeCurrent on mEGLCore is null", new Object[0]);
            return false;
        }
        try {
            eGLCore.makeCurrent();
            return true;
        } catch (EGLException e10) {
            LiteavLog.e(this.mThrottlers.a("makeCurrentError"), this.mTAG, "make current failed.", e10);
            return false;
        }
    }

    private void restoreCallerEGLContext() {
        if (!CommonUtil.equals(this.mCallerEGLContext, EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglMakeCurrent(this.mCallerEGLDisplay, this.mCallerEGLDrawSurface, this.mCallerEGLReadSurface, this.mCallerEGLContext);
            return;
        }
        EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplayEglGetCurrentDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
    }

    private void saveCallerEGLContext() {
        EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
        if (CommonUtil.equals(this.mCallerEGLContext, EGL14.EGL_NO_CONTEXT) || !CommonUtil.equals(eGLContextEglGetCurrentContext, this.mCallerEGLContext)) {
            this.mCallerEGLContext = eGLContextEglGetCurrentContext;
            this.mCallerEGLDisplay = EGL14.eglGetCurrentDisplay();
            this.mCallerEGLReadSurface = EGL14.eglGetCurrentSurface(bb.c.m.Sm);
            this.mCallerEGLDrawSurface = EGL14.eglGetCurrentSurface(bb.c.m.Rm);
        }
    }

    private PixelFrame shallowCopyDataToPixelFrame(PixelFrame pixelFrame, Object obj) {
        if (obj instanceof byte[]) {
            pixelFrame.setData((byte[]) obj);
        } else if (obj instanceof ByteBuffer) {
            pixelFrame.setBuffer((ByteBuffer) obj);
        }
        pixelFrame.retain();
        return pixelFrame;
    }

    public synchronized PixelFrame create(int i10, int i11, long j10, int i12, int i13, int i14, Object obj, Object obj2, boolean z10) {
        PixelFrame pixelFrameDeepCopyDataToPixelFrame;
        PixelFrame pixelFrame = new PixelFrame();
        pixelFrame.setWidth(i10);
        pixelFrame.setHeight(i11);
        pixelFrame.setTimestamp(j10);
        pixelFrame.setGLContext(obj);
        pixelFrame.setTextureId(i14);
        pixelFrame.setPixelBufferType(GLConstants.a.a(i12));
        pixelFrame.setPixelFormatType(GLConstants.PixelFormatType.a(i13));
        if (pixelFrame.getPixelBufferType() == GLConstants.a.BYTE_ARRAY || pixelFrame.getPixelBufferType() == GLConstants.a.BYTE_BUFFER) {
            pixelFrameDeepCopyDataToPixelFrame = z10 ? deepCopyDataToPixelFrame(pixelFrame, obj2) : shallowCopyDataToPixelFrame(pixelFrame, obj2);
        } else {
            pixelFrameDeepCopyDataToPixelFrame = deepCopyTextureToPixelFrame(pixelFrame, obj);
        }
        return pixelFrameDeepCopyDataToPixelFrame;
    }

    public synchronized void release(PixelFrame pixelFrame) {
        if (pixelFrame != null) {
            pixelFrame.release();
        }
    }

    public synchronized void uninitOpenGLComponents() {
        if (this.mRenderEGLCore == null) {
            return;
        }
        LiteavLog.i(this.mTAG, "uninitOpenGLComponents");
        if (makeCurrent()) {
            GLTexturePool gLTexturePool = this.mGLTexturePool;
            if (gLTexturePool != null) {
                gLTexturePool.evictAll();
                this.mGLTexturePool.destroy();
                this.mGLTexturePool = null;
            }
            PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
            if (pixelFrameRenderer != null) {
                pixelFrameRenderer.uninitialize();
                this.mPixelFrameRenderer = null;
            }
        }
        EGLCore.destroy(this.mRenderEGLCore);
        this.mRenderEGLCore = null;
    }
}
