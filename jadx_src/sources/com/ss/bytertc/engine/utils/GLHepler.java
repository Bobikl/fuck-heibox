package com.ss.bytertc.engine.utils;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlShader;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.VideoFrame;
import java.nio.FloatBuffer;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public class GLHepler {
    private static final FloatBuffer DEVICE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer TEXTURE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private final String TAG;
    private int frameBufferId;
    private Handler handler;
    private boolean mBInit;
    private EglBase mEglBase;
    private final String mFragmentShader;
    private GlShader mGlShader;
    private final String mVertorShader;
    private boolean released;
    private GlShader shader;
    private VideoFrame.TextureBuffer.Type shaderTextureType;
    private final ThreadUtils.ThreadChecker threadChecker;

    private GLHepler(EGLContext eGLContext, Handler handler) {
        this.TAG = "GLHepler";
        this.mBInit = false;
        this.frameBufferId = 0;
        this.mVertorShader = "attribute vec4 vPosition;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\n\nvoid main(){gl_Position = vPosition;\ntextureCoordinate = inputTextureCoordinate;\n}\n";
        this.mFragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}";
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.released = false;
        this.handler = handler;
        EglBase eglBaseF = com.bytedance.realx.video.a.f(eGLContext, EglBase.CONFIG_PIXEL_BUFFER);
        this.mEglBase = eglBaseF;
        try {
            eglBaseF.createDummyPbufferSurface();
            this.mEglBase.makeCurrent();
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.frameBufferId = iArr[0];
            threadChecker.detachThread();
        } catch (RuntimeException e10) {
            this.mEglBase.release();
            handler.getLooper().quit();
            throw e10;
        }
    }

    public static GLHepler create(final String str, final EGLContext eGLContext) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (GLHepler) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<GLHepler>() { // from class: com.ss.bytertc.engine.utils.GLHepler.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GLHepler call() {
                try {
                    return new GLHepler(eGLContext, handler);
                } catch (RuntimeException e10) {
                    LogUtil.e("TextureHelper", str + " create failure", e10);
                    return null;
                }
            }
        });
    }

    private void initShader(VideoFrame.TextureBuffer.Type type) {
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
        if (this.mBInit) {
            return;
        }
        this.mBInit = true;
        this.shaderTextureType = type;
        GlShader glShader2 = new GlShader("attribute vec4 vPosition;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\n\nvoid main(){gl_Position = vPosition;\ntextureCoordinate = inputTextureCoordinate;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}");
        this.shader = glShader2;
        glShader2.useProgram();
        GLES20.glUniform1i(this.shader.getUniformLocation("s_texture"), 0);
        GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
        this.shader.setVertexAttribArray("vPosition", 2, DEVICE_RECTANGLE);
        this.shader.setVertexAttribArray("inputTextureCoordinate", 2, TEXTURE_RECTANGLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deliverToTexture2D$0(int i10, int i11, int i12, int i13) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.threadChecker.checkIsOnValidThread();
        if (this.released) {
            throw new IllegalStateException("YuvConverter.convert called on released object");
        }
        if (!this.mBInit) {
            initShader(VideoFrame.TextureBuffer.Type.OES);
            this.shader.useProgram();
            GLES20.glBindFramebuffer(36160, this.frameBufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, bb.c.e.F, i10, 0);
        }
        this.shader.useProgram();
        GLES20.glBindFramebuffer(36160, this.frameBufferId);
        GLES20.glFramebufferTexture2D(36160, 36064, bb.c.e.F, i10, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i11);
        GLES20.glViewport(0, 0, i12, i13);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(36197, 0);
        LogUtil.i("opnngl ToTexture2D", "usetime:" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public void deliverToTexture2D(final int i10, final int i11, final int i12, final int i13, float[] fArr) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: com.ss.bytertc.engine.utils.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f98005b.lambda$deliverToTexture2D$0(i13, i12, i10, i11);
            }
        });
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.released = true;
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
    }
}
