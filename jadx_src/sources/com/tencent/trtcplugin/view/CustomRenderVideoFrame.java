package com.tencent.trtcplugin.view;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import android.widget.ImageView;
import com.tencent.custom.customcapture.opengl.GPUImageFilter;
import com.tencent.custom.customcapture.opengl.GpuImageI420Filter;
import com.tencent.custom.customcapture.opengl.OpenGlUtils;
import com.tencent.custom.customcapture.opengl.Rotation;
import com.tencent.custom.customcapture.render.EglCore;
import com.tencent.custom.customcapture.utils.Size;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.uc.crashsdk.export.LogType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(17)
public class CustomRenderVideoFrame implements TRTCCloudListener.TRTCVideoRenderListener, Handler.Callback {
    private static final int MSG_DESTROY = 3;
    private static final int MSG_RENDER = 2;
    private static final int RENDER_TYPE_I420 = 1;
    private static final int RENDER_TYPE_TEXTURE = 0;
    public static final String TAG = "CustomRenderVideoFrame";
    private EglCore mEglCore;
    private final FloatBuffer mGLCubeBuffer;
    private final GLHandler mGLHandler;
    private final FloatBuffer mGLTextureBuffer;
    private final HandlerThread mGLThread;
    private GPUImageFilter mNormalFilter;
    private int mSteamType;
    private SurfaceTexture mSurfaceTexture;
    private String mUserId;
    private GpuImageI420Filter mYUVFilter;
    private int mRenderType = 0;
    private Size mSurfaceSize = new Size();
    private Size mLastInputSize = new Size();
    private Size mLastOutputSize = new Size();

    public static class GLHandler extends Handler {
        public GLHandler(Looper looper, Handler.Callback callback) {
            super(looper, callback);
        }

        public void runAndWaitDone(final Runnable runnable) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            post(new Runnable() { // from class: com.tencent.trtcplugin.view.CustomRenderVideoFrame.GLHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    public CustomRenderVideoFrame(String str, int i10) {
        this.mUserId = str;
        this.mSteamType = i10;
        float[] fArr = OpenGlUtils.CUBE;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mGLCubeBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        float[] fArr2 = OpenGlUtils.TEXTURE;
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mGLTextureBuffer = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr2).position(0);
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.mGLThread = handlerThread;
        handlerThread.start();
        this.mGLHandler = new GLHandler(handlerThread.getLooper(), this);
        Log.i(TAG, TAG);
    }

    private void destroyInternal() {
        uninitGlComponent();
        this.mGLHandler.getLooper().quitSafely();
    }

    private void initGlComponent(Object obj) {
        if (this.mSurfaceTexture == null) {
            return;
        }
        try {
            if (obj instanceof EGLContext) {
                this.mEglCore = new EglCore((EGLContext) obj, new Surface(this.mSurfaceTexture));
            } else {
                this.mEglCore = new EglCore((android.opengl.EGLContext) obj, new Surface(this.mSurfaceTexture));
            }
            EglCore eglCore = this.mEglCore;
            if (eglCore == null) {
                return;
            }
            eglCore.makeCurrent();
            int i10 = this.mRenderType;
            if (i10 == 0) {
                GPUImageFilter gPUImageFilter = new GPUImageFilter();
                this.mNormalFilter = gPUImageFilter;
                gPUImageFilter.init();
            } else if (i10 == 1) {
                GpuImageI420Filter gpuImageI420Filter = new GpuImageI420Filter();
                this.mYUVFilter = gpuImageI420Filter;
                gpuImageI420Filter.init();
            }
        } catch (Exception e10) {
            Log.e(TAG, "create EglCore failed.", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0051  */
    private void renderInternal(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        Object obj;
        this.mRenderType = 1;
        int i10 = tRTCVideoFrame.bufferType;
        if (i10 == 3) {
            this.mRenderType = 0;
        } else {
            if (tRTCVideoFrame.pixelFormat != 1 || i10 != 2) {
                Log.w(TAG, "error video frame type");
                return;
            }
            this.mRenderType = 1;
        }
        if (this.mEglCore == null && this.mSurfaceTexture != null) {
            TRTCCloudDef.TRTCTexture tRTCTexture = tRTCVideoFrame.texture;
            if (tRTCTexture != null) {
                obj = tRTCTexture.eglContext10;
                if (obj == null) {
                    obj = tRTCTexture.eglContext14;
                }
            } else {
                obj = null;
            }
            initGlComponent(obj);
        }
        if (this.mEglCore == null) {
            return;
        }
        Size size = this.mLastInputSize;
        int i11 = size.width;
        int i12 = tRTCVideoFrame.width;
        if (i11 == i12 && size.height == tRTCVideoFrame.height) {
            Size size2 = this.mLastOutputSize;
            int i13 = size2.width;
            Size size3 = this.mSurfaceSize;
            if (i13 != size3.width || size2.height != size3.height) {
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                Rotation rotation = Rotation.ROTATION_180;
                int i14 = tRTCVideoFrame.height;
                Size size4 = this.mSurfaceSize;
                Pair<float[], float[]> pairCalcCubeAndTextureBuffer = OpenGlUtils.calcCubeAndTextureBuffer(scaleType, rotation, true, i12, i14, size4.width, size4.height);
                this.mGLCubeBuffer.clear();
                this.mGLCubeBuffer.put((float[]) pairCalcCubeAndTextureBuffer.first);
                this.mGLTextureBuffer.clear();
                this.mGLTextureBuffer.put((float[]) pairCalcCubeAndTextureBuffer.second);
                this.mLastInputSize = new Size(tRTCVideoFrame.width, tRTCVideoFrame.height);
                Size size5 = this.mSurfaceSize;
                this.mLastOutputSize = new Size(size5.width, size5.height);
            }
        } else {
            ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
            Rotation rotation2 = Rotation.ROTATION_180;
            int i15 = tRTCVideoFrame.height;
            Size size6 = this.mSurfaceSize;
            Pair<float[], float[]> pairCalcCubeAndTextureBuffer2 = OpenGlUtils.calcCubeAndTextureBuffer(scaleType2, rotation2, true, i12, i15, size6.width, size6.height);
            this.mGLCubeBuffer.clear();
            this.mGLCubeBuffer.put((float[]) pairCalcCubeAndTextureBuffer2.first);
            this.mGLTextureBuffer.clear();
            this.mGLTextureBuffer.put((float[]) pairCalcCubeAndTextureBuffer2.second);
            this.mLastInputSize = new Size(tRTCVideoFrame.width, tRTCVideoFrame.height);
            Size size7 = this.mSurfaceSize;
            this.mLastOutputSize = new Size(size7.width, size7.height);
        }
        this.mEglCore.makeCurrent();
        Size size8 = this.mSurfaceSize;
        GLES20.glViewport(0, 0, size8.width, size8.height);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(LogType.UNEXP_RESTART);
        if (this.mRenderType == 0) {
            this.mNormalFilter.onDraw(tRTCVideoFrame.texture.textureId, this.mGLCubeBuffer, this.mGLTextureBuffer);
        } else {
            this.mYUVFilter.loadYuvDataToTexture(tRTCVideoFrame.data, tRTCVideoFrame.width, tRTCVideoFrame.height);
            this.mYUVFilter.onDraw(-1, this.mGLCubeBuffer, this.mGLTextureBuffer);
        }
        if (this.mEglCore.getmEglHelper() == null) {
            this.mEglCore = null;
        } else {
            this.mEglCore.swapBuffer();
        }
    }

    private void uninitGlComponent() {
        GPUImageFilter gPUImageFilter = this.mNormalFilter;
        if (gPUImageFilter != null) {
            gPUImageFilter.destroy();
            this.mNormalFilter = null;
        }
        GpuImageI420Filter gpuImageI420Filter = this.mYUVFilter;
        if (gpuImageI420Filter != null) {
            gpuImageI420Filter.destroy();
            this.mYUVFilter = null;
        }
        EglCore eglCore = this.mEglCore;
        if (eglCore != null) {
            eglCore.unmakeCurrent();
            this.mEglCore.destroy();
            this.mEglCore = null;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 2) {
            renderInternal((TRTCCloudDef.TRTCVideoFrame) message.obj);
            return false;
        }
        if (i10 != 3) {
            destroyInternal();
            return false;
        }
        destroyInternal();
        return false;
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener
    public void onRenderVideoFrame(String str, int i10, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (str.equals(this.mUserId) && this.mSteamType == i10) {
            if (tRTCVideoFrame.texture != null) {
                GLES20.glFinish();
            }
            this.mGLHandler.obtainMessage(2, tRTCVideoFrame).sendToTarget();
        }
    }

    public void start(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.mSurfaceTexture = surfaceTexture;
        this.mSurfaceSize = new Size(i10, i11);
    }

    public void stop() {
        this.mGLHandler.obtainMessage(3).sendToTarget();
    }

    public void updateSize(int i10, int i11) {
        this.mSurfaceSize = new Size(i10, i11);
    }
}
