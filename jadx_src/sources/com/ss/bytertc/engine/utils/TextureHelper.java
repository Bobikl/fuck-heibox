package com.ss.bytertc.engine.utils;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.p0;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlRectDrawer;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.bytedance.realx.video.YuvHelper;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes4.dex */
public class TextureHelper {
    public static final int FORMAT_TEXTURE_2D = 10;
    public static final int FORMAT_TEXTURE_OES = 11;
    private static final String TAG = "TextureHelper";
    private static final int TEXTURE_MAX_COUNT = 45;
    private static float[] TEX_MATRIX = new float[16];
    private static float[] YUV_TEX_MATRIX = new float[16];
    private final EglBase mEglBase;
    private int mFrameBufferId;
    private final Handler mHandler;
    private int mHeight;
    private boolean mIsQuitting;
    private boolean mIsRelease;
    private boolean mIsTextureInUse;
    private GlRectDrawer mTextureDrawer;
    private int mWidth;
    private YuvConverter mYuvConverter;
    private YuvUploader mYuvUploader;
    private int mTextureCnt = 0;
    private List<Integer> mTextureFreeQueue = new LinkedList();
    private List<Integer> mTextureUsedQueue = new LinkedList();

    public static class YuvUploader {

        @p0
        private ByteBuffer copyBuffer;

        @p0
        private int[] yuvTextures;

        YuvUploader() {
        }

        @p0
        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        @p0
        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        @p0
        public int[] uploadYuvData(int i10, int i11, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i12 = i10 / 2;
            int[] iArr2 = {i10, i12, i12};
            int i13 = i11 / 2;
            int[] iArr3 = {i11, i13, i13};
            int iMax = 0;
            for (int i14 = 0; i14 < 3; i14++) {
                int i15 = iArr[i14];
                int i16 = iArr2[i14];
                if (i15 > i16) {
                    iMax = Math.max(iMax, i16 * iArr3[i14]);
                }
            }
            if (iMax > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < iMax)) {
                this.copyBuffer = ByteBuffer.allocateDirect(iMax);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i17 = 0; i17 < 3; i17++) {
                    this.yuvTextures[i17] = GlUtil.generateTexture(bb.c.e.F);
                }
            }
            for (int i18 = 0; i18 < 3; i18++) {
                GLES20.glPixelStorei(bb.c.d.On, 1);
                GLES20.glActiveTexture(33984 + i18);
                GLES20.glBindTexture(bb.c.e.F, this.yuvTextures[i18]);
                int i19 = iArr[i18];
                int i20 = iArr2[i18];
                if (i19 == i20) {
                    byteBuffer = byteBufferArr[i18];
                } else {
                    YuvHelper.copyPlane(byteBufferArr[i18], i19, this.copyBuffer, i20, i20, iArr3[i18]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(bb.c.e.F, 0, bb.c.f.PB, iArr2[i18], iArr3[i18], 0, bb.c.f.PB, bb.c.f.Zc, byteBuffer);
            }
            return this.yuvTextures;
        }
    }

    private TextureHelper(Object obj, Handler handler, int i10, int i11) {
        if (handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("TextureHelper must be created on the handler thread");
        }
        this.mWidth = i10;
        this.mHeight = i11;
        this.mHandler = handler;
        Matrix.setIdentityM(TEX_MATRIX, 0);
        Matrix.setIdentityM(YUV_TEX_MATRIX, 0);
        Matrix.translateM(YUV_TEX_MATRIX, 0, 0.5f, 0.5f, 0.0f);
        Matrix.scaleM(YUV_TEX_MATRIX, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(YUV_TEX_MATRIX, 0, -0.5f, -0.5f, 0.0f);
        if (obj instanceof EGLContext) {
            this.mEglBase = com.bytedance.realx.video.a.d((EGLContext) obj, EglBase.CONFIG_PIXEL_BUFFER);
        } else if (obj instanceof android.opengl.EGLContext) {
            this.mEglBase = com.bytedance.realx.video.a.f((android.opengl.EGLContext) obj, EglBase.CONFIG_PIXEL_BUFFER);
        } else {
            if (!(obj instanceof EglBase.Context)) {
                throw new RuntimeException("unknown shareContext:" + obj);
            }
            this.mEglBase = com.bytedance.realx.video.a.b((EglBase.Context) obj);
        }
        try {
            this.mEglBase.createPbufferSurface(this.mWidth, this.mHeight);
            this.mEglBase.makeCurrent();
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.mFrameBufferId = iArr[0];
            this.mTextureDrawer = new GlRectDrawer();
            this.mYuvUploader = new YuvUploader();
            GlUtil.checkNoGLES2Error("TextureHelper construct");
        } catch (RuntimeException e10) {
            this.mEglBase.release();
            handler.getLooper().quit();
            throw e10;
        }
    }

    public static TextureHelper create(final String str, final android.opengl.EGLContext eGLContext, final int i10, final int i11) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: com.ss.bytertc.engine.utils.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.lambda$create$1(eGLContext, handler, i10, i11, str);
            }
        });
    }

    public static TextureHelper create(final String str, final EglBase.Context context, final int i10, final int i11) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: com.ss.bytertc.engine.utils.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.lambda$create$2(context, handler, i10, i11, str);
            }
        });
    }

    public static TextureHelper create(final String str, final EGLContext eGLContext, final int i10, final int i11) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: com.ss.bytertc.engine.utils.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.lambda$create$0(eGLContext, handler, i10, i11, str);
            }
        });
    }

    private int generateTexture(final int i10, final int i11, final int i12) {
        if (this.mTextureCnt == 45) {
            return 0;
        }
        return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Callable() { // from class: com.ss.bytertc.engine.utils.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f98031b.lambda$generateTexture$6(i10, i11, i12);
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TextureHelper lambda$create$0(EGLContext eGLContext, Handler handler, int i10, int i11, String str) throws Exception {
        try {
            return new TextureHelper(eGLContext, handler, i10, i11);
        } catch (RuntimeException e10) {
            LogUtil.e(TAG, str + " create failure", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TextureHelper lambda$create$1(android.opengl.EGLContext eGLContext, Handler handler, int i10, int i11, String str) throws Exception {
        try {
            return new TextureHelper(eGLContext, handler, i10, i11);
        } catch (RuntimeException e10) {
            LogUtil.e(TAG, str + " create failure", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TextureHelper lambda$create$2(EglBase.Context context, Handler handler, int i10, int i11, String str) throws Exception {
        try {
            return new TextureHelper(context, handler, i10, i11);
        } catch (RuntimeException e10) {
            LogUtil.e(TAG, str + " create failure", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dequeueTexture$3(int[] iArr) {
        List<Integer> list = this.mTextureFreeQueue;
        if (list != null) {
            if (list.size() != 0) {
                iArr[0] = this.mTextureFreeQueue.get(0).intValue();
                this.mTextureFreeQueue.remove(0);
                this.mTextureUsedQueue.add(Integer.valueOf(iArr[0]));
            } else {
                int iGenerateTexture = generateTexture(bb.c.e.F, this.mWidth, this.mHeight);
                iArr[0] = iGenerateTexture;
                if (iGenerateTexture > 0) {
                    this.mTextureUsedQueue.add(Integer.valueOf(iGenerateTexture));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispose$7() {
        this.mIsQuitting = true;
        if (this.mIsTextureInUse) {
            return;
        }
        release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$generateTexture$6(int i10, int i11, int i12) throws Exception {
        int iGenerateTexture = GlUtil.generateTexture(i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(bb.c.e.F, iGenerateTexture);
        GLES20.glTexImage2D(bb.c.e.F, 0, bb.c.f.OB, i11, i12, 0, bb.c.f.OB, bb.c.f.Zc, null);
        GLES20.glBindTexture(bb.c.e.F, 0);
        if (GLES20.glGetError() != 0) {
            return 0;
        }
        this.mTextureCnt++;
        return Integer.valueOf(iGenerateTexture);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queueTexture$4(int i10) {
        List<Integer> list = this.mTextureUsedQueue;
        if (list == null || !list.contains(Integer.valueOf(i10))) {
            return;
        }
        this.mTextureUsedQueue.remove(new Integer(i10));
        List<Integer> list2 = this.mTextureFreeQueue;
        if (list2 != null) {
            list2.add(Integer.valueOf(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseTextureID$5(int i10) {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        if (this.mHandler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        }
        if (this.mIsTextureInUse || !this.mIsQuitting) {
            throw new IllegalStateException("Unexpected release.");
        }
        this.mIsRelease = true;
        YuvConverter yuvConverter = this.mYuvConverter;
        if (yuvConverter != null) {
            yuvConverter.release();
        }
        YuvUploader yuvUploader = this.mYuvUploader;
        if (yuvUploader != null) {
            yuvUploader.release();
        }
        List<Integer> list = this.mTextureFreeQueue;
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.mTextureFreeQueue.iterator();
            while (it.hasNext()) {
                GLES20.glDeleteTextures(1, new int[]{it.next().intValue()}, 0);
            }
        }
        this.mTextureFreeQueue.clear();
        List<Integer> list2 = this.mTextureUsedQueue;
        if (list2 != null && list2.size() > 0) {
            Iterator<Integer> it2 = this.mTextureUsedQueue.iterator();
            while (it2.hasNext()) {
                GLES20.glDeleteTextures(1, new int[]{it2.next().intValue()}, 0);
            }
        }
        this.mTextureUsedQueue.clear();
        GLES20.glDeleteFramebuffers(1, new int[]{this.mFrameBufferId}, 0);
        this.mFrameBufferId = 0;
        this.mEglBase.release();
        this.mHandler.getLooper().quit();
    }

    public int dequeueTexture() {
        final int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f98017b.lambda$dequeueTexture$3(iArr);
            }
        });
        return iArr[0];
    }

    public synchronized void dispose() {
        LogUtil.d(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f98016b.lambda$dispose$7();
            }
        });
    }

    public void drawTexture(int i10, int i11, int i12) {
        drawTexture(i10, i11, i12, TEX_MATRIX);
    }

    public void drawTexture(final int i10, final int i11, final int i12, final float[] fArr) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (TextureHelper.this.mTextureDrawer == null) {
                    TextureHelper.this.mTextureDrawer = new GlRectDrawer();
                }
                GlUtil.checkNoGLES2Error("TextureHelper construct");
                GLES20.glBindFramebuffer(36160, TextureHelper.this.mFrameBufferId);
                GLES20.glFramebufferTexture2D(36160, 36064, bb.c.e.F, i12, 0);
                int i13 = i10;
                if (i13 == 10) {
                    TextureHelper.this.mTextureDrawer.drawRgb(i11, fArr, TextureHelper.this.mWidth, TextureHelper.this.mHeight, 0, 0, TextureHelper.this.mWidth, TextureHelper.this.mHeight);
                } else if (i13 != 11) {
                    LogUtil.e(TextureHelper.TAG, "draw texture type error");
                } else {
                    TextureHelper.this.mTextureDrawer.drawOes(i11, fArr, TextureHelper.this.mWidth, TextureHelper.this.mHeight, 0, 0, TextureHelper.this.mWidth, TextureHelper.this.mHeight);
                }
                GLES20.glBindTexture(bb.c.e.F, 0);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glFinish();
                GlUtil.checkNoGLES2Error("TextureHelper drawTexture");
            }
        });
    }

    public EglBase.Context getEglBaseContext() {
        EglBase eglBase = this.mEglBase;
        if (eglBase != null) {
            return eglBase.getEglBaseContext();
        }
        return null;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public long getNativeEglContext() {
        EglBase eglBase = this.mEglBase;
        if (eglBase != null) {
            return eglBase.getEglBaseContext().getNativeEglContext();
        }
        return 0L;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void post(Runnable runnable) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void queueTexture(final int i10) {
        this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.engine.utils.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f98024b.lambda$queueTexture$4(i10);
            }
        });
    }

    public void releaseTextureID(final int i10) {
        if (i10 <= 0 || this.mIsQuitting || this.mIsRelease) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.b
            @Override // java.lang.Runnable
            public final void run() {
                TextureHelper.lambda$releaseTextureID$5(i10);
            }
        });
    }

    public synchronized VideoFrame.I420Buffer textureToYuv(final VideoFrame.TextureBuffer textureBuffer) {
        final VideoFrame.I420Buffer[] i420BufferArr;
        i420BufferArr = new VideoFrame.I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                TextureHelper.this.mIsTextureInUse = true;
                if (TextureHelper.this.mYuvConverter == null) {
                    TextureHelper.this.mYuvConverter = new YuvConverter();
                }
                if (TextureHelper.this.mTextureDrawer == null) {
                    TextureHelper.this.mTextureDrawer = new GlRectDrawer();
                }
                i420BufferArr[0] = TextureHelper.this.mYuvConverter.convert(textureBuffer);
                TextureHelper.this.mIsTextureInUse = false;
                if (TextureHelper.this.mIsQuitting) {
                    TextureHelper.this.release();
                }
            }
        });
        return i420BufferArr[0];
    }

    public void yuvToTexture(VideoFrame.I420Buffer i420Buffer, int i10) {
        yuvToTexture(i420Buffer, i10, YUV_TEX_MATRIX);
    }

    public void yuvToTexture(final VideoFrame.I420Buffer i420Buffer, final int i10, final float[] fArr) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.engine.utils.TextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                if (TextureHelper.this.mTextureDrawer == null || TextureHelper.this.mYuvUploader == null) {
                    throw new IllegalStateException("mTextureDrawer and mYuvUploader can not null.");
                }
                GlUtil.checkNoGLES2Error("TextureHelper construct");
                GLES20.glBindFramebuffer(36160, TextureHelper.this.mFrameBufferId);
                GLES20.glFramebufferTexture2D(36160, 36064, bb.c.e.F, i10, 0);
                TextureHelper.this.mYuvUploader.uploadFromBuffer(i420Buffer);
                TextureHelper.this.mTextureDrawer.drawYuv(TextureHelper.this.mYuvUploader.getYuvTextures(), fArr, TextureHelper.this.mWidth, TextureHelper.this.mHeight, 0, 0, TextureHelper.this.mWidth, TextureHelper.this.mHeight);
                GLES20.glBindTexture(bb.c.e.F, 0);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glFinish();
                GlUtil.checkNoGLES2Error("TextureHelper drawTexture");
            }
        });
    }
}
