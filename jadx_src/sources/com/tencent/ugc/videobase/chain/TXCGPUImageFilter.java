package com.tencent.ugc.videobase.chain;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.frame.GLFrameBuffer;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.DelayQueue;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import com.tencent.ugc.videobase.utils.Program;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUImageFilter {
    public static final String NO_FILTER_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}";
    public static final String NO_FILTER_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}";
    private static final String TAG = "TXCGPUImageFilter";
    protected GLConstants.ColorRange mColorRange;
    protected GLConstants.ColorSpace mColorSpace;
    protected int mGLAttribPosition;
    protected int mGLAttribTextureCoord;
    private final GLFrameBuffer mGLFrameBuffer;
    protected int mGLUniformTexture;
    private boolean mIsInitialized;
    public final Size mOutputSize;
    private final Program mProgram;
    private int mProgramId;
    private final DelayQueue mRunOnDrawQueue;
    private float[] mTextureMatrix;
    protected GLTexturePool mTexturePool;
    private int mUniformTextureTransform;
    private static final float[] IDENTITY_MATRIX = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private static final AtomicInteger sFilterCount = new AtomicInteger();

    public TXCGPUImageFilter() {
        this(NO_FILTER_VERTEX_SHADER, "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public TXCGPUImageFilter(String str, String str2) {
        this.mOutputSize = new Size(-1, -1);
        this.mColorRange = GLConstants.ColorRange.UNKNOWN;
        this.mColorSpace = GLConstants.ColorSpace.UNKNOWN;
        this.mProgramId = -1;
        this.mGLFrameBuffer = new GLFrameBuffer();
        this.mRunOnDrawQueue = new DelayQueue();
        this.mProgram = new Program(str, str2);
    }

    static /* synthetic */ void lambda$runOnDrawAndWaitDone$4(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        countDownLatch.countDown();
    }

    static /* synthetic */ void lambda$setFloatOnDraw$0(TXCGPUImageFilter tXCGPUImageFilter, int i10, float f10) {
        GLES20.glUseProgram(tXCGPUImageFilter.getProgramId());
        GLES20.glUniform1f(i10, f10);
    }

    static /* synthetic */ void lambda$setFloatVec2OnDraw$2(TXCGPUImageFilter tXCGPUImageFilter, int i10, float[] fArr) {
        GLES20.glUseProgram(tXCGPUImageFilter.getProgramId());
        GLES20.glUniform2fv(i10, 1, FloatBuffer.wrap(fArr));
    }

    static /* synthetic */ void lambda$setFloatVec3OnDraw$1(TXCGPUImageFilter tXCGPUImageFilter, int i10, float[] fArr) {
        GLES20.glUseProgram(tXCGPUImageFilter.getProgramId());
        GLES20.glUniform3fv(i10, 1, FloatBuffer.wrap(fArr));
    }

    static /* synthetic */ void lambda$setFloatVec4OnDraw$3(TXCGPUImageFilter tXCGPUImageFilter, int i10, float[] fArr) {
        GLES20.glUseProgram(tXCGPUImageFilter.getProgramId());
        GLES20.glUniform4fv(i10, 1, FloatBuffer.wrap(fArr));
    }

    protected void afterDrawArrays() {
    }

    protected void beforeDrawArrays(int i10) {
    }

    protected int buildProgram() {
        return this.mProgram.build();
    }

    public boolean canBeSkipped() {
        return false;
    }

    public Size getOutputSize() {
        return this.mOutputSize;
    }

    public final int getProgramId() {
        return this.mProgramId;
    }

    public int getTarget() {
        return bb.c.e.F;
    }

    public final void initialize(GLTexturePool gLTexturePool) {
        if (this.mIsInitialized) {
            return;
        }
        this.mGLFrameBuffer.initialize();
        this.mProgramId = buildProgram();
        this.mGLAttribPosition = GLES20.glGetAttribLocation(getProgramId(), CommonNetImpl.POSITION);
        this.mGLUniformTexture = GLES20.glGetUniformLocation(getProgramId(), "inputImageTexture");
        this.mGLAttribTextureCoord = GLES20.glGetAttribLocation(getProgramId(), "inputTextureCoordinate");
        this.mUniformTextureTransform = GLES20.glGetUniformLocation(getProgramId(), "textureTransform");
        onInit(gLTexturePool);
        this.mIsInitialized = true;
        LiteavLog.d(TAG, "%s initialized, count: %d", this, Integer.valueOf(sFilterCount.incrementAndGet()));
    }

    public boolean isInitialized() {
        return this.mIsInitialized;
    }

    protected boolean isLessOrEqualZero(float f10) {
        return ((double) f10) < 1.0E-5d;
    }

    public void onDraw(int i10, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (this.mIsInitialized) {
            GLES20.glUseProgram(getProgramId());
            runPendingOnDrawTasks();
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.mGLAttribPosition, 2, bb.c.f.f32240ed, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.mGLAttribPosition);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.mGLAttribTextureCoord, 2, bb.c.f.f32240ed, false, 0, (Buffer) floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoord);
            if (i10 != -1) {
                GLES20.glActiveTexture(33984);
                OpenGlUtils.bindTexture(getTarget(), i10);
                GLES20.glUniform1i(this.mGLUniformTexture, 0);
            }
            if (gLTexture != null) {
                this.mGLFrameBuffer.attachTexture(gLTexture.getId());
                this.mGLFrameBuffer.bindToContext();
            } else {
                OpenGlUtils.bindFramebuffer(36160, 0);
            }
            float[] fArr = this.mTextureMatrix;
            if (fArr == null) {
                fArr = IDENTITY_MATRIX;
            }
            GLES20.glUniformMatrix4fv(this.mUniformTextureTransform, 1, false, fArr, 0);
            beforeDrawArrays(i10);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.mGLAttribPosition);
            GLES20.glDisableVertexAttribArray(this.mGLAttribTextureCoord);
            afterDrawArrays();
            GLES20.glActiveTexture(33984);
            OpenGlUtils.bindTexture(getTarget(), 0);
            if (gLTexture != null) {
                this.mGLFrameBuffer.unbindFromContext();
                this.mGLFrameBuffer.detachTexture();
            }
        }
    }

    public void onFilterBeenSkipped() {
        if (this.mIsInitialized) {
            GLES20.glUseProgram(getProgramId());
            runPendingOnDrawTasks();
        }
    }

    protected void onInit(GLTexturePool gLTexturePool) {
        this.mTexturePool = gLTexturePool;
    }

    public void onOutputSizeChanged(int i10, int i11) {
        Size size = this.mOutputSize;
        size.width = i10;
        size.height = i11;
    }

    protected void onUninit() {
    }

    public final void runOnDraw(Runnable runnable) {
        this.mRunOnDrawQueue.add(runnable);
    }

    public void runOnDrawAndWaitDone(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.mRunOnDrawQueue.add(e.a(runnable, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    protected void runPendingOnDrawTasks() {
        this.mRunOnDrawQueue.rerun();
    }

    public void setColorFormat(GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        this.mColorRange = colorRange;
        this.mColorSpace = colorSpace;
    }

    public void setFloatOnDraw(int i10, float f10) {
        runOnDraw(a.a(this, i10, f10));
    }

    public void setFloatVec2OnDraw(int i10, float[] fArr) {
        runOnDraw(c.a(this, i10, fArr));
    }

    public void setFloatVec3OnDraw(int i10, float[] fArr) {
        runOnDraw(b.a(this, i10, fArr));
    }

    public void setFloatVec4OnDraw(int i10, float[] fArr) {
        runOnDraw(d.a(this, i10, fArr));
    }

    public void setTextureTransform(float[] fArr) {
        this.mTextureMatrix = fArr;
    }

    public final void uninitialize() {
        if (this.mIsInitialized) {
            runPendingOnDrawTasks();
            onUninit();
            this.mIsInitialized = false;
            this.mGLFrameBuffer.uninitialize();
            int i10 = this.mProgramId;
            if (i10 != -1) {
                GLES20.glDeleteProgram(i10);
                this.mProgramId = -1;
            }
            LiteavLog.d(TAG, "%s uninitialized, count: %d", this, Integer.valueOf(sFilterCount.decrementAndGet()));
        }
    }
}
