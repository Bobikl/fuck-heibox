package com.tencent.custom.customcapture.opengl;

import android.opengl.GLES20;
import bb.c;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class GPUImageFilter {
    public static final String NO_FILTER_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}";
    public static final String NO_FILTER_FRAGMENT_SHADER_FLIP = "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, vec2(textureCoordinate.x, 1.0 - textureCoordinate.y));\n}";
    public static final String NO_FILTER_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}";
    private int mGLAttribPosition;
    private int mGLAttribTextureCoordinate;
    private int mGLUniformTexture;
    private boolean mIsInitialized;
    protected final Program mProgram;
    private final LinkedList<Runnable> mRunOnDraw;
    protected float[] mTextureMatrix;

    public GPUImageFilter() {
        this(false);
    }

    public GPUImageFilter(String str, String str2) {
        this.mRunOnDraw = new LinkedList<>();
        this.mProgram = new Program(str, str2);
    }

    public GPUImageFilter(boolean z10) {
        this(NO_FILTER_VERTEX_SHADER, z10 ? NO_FILTER_FRAGMENT_SHADER_FLIP : "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    protected void beforeDrawArrays(int i10) {
    }

    public final void destroy() {
        runPendingOnDrawTasks();
        onUninit();
        this.mIsInitialized = false;
        this.mProgram.destroy();
    }

    public int getTarget() {
        return c.e.F;
    }

    public final void init() {
        onInit();
        this.mIsInitialized = true;
    }

    public boolean isInitialized() {
        return this.mIsInitialized;
    }

    public void onDraw(int i10, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.mProgram.getProgramId());
        runPendingOnDrawTasks();
        if (this.mIsInitialized) {
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.mGLAttribPosition, 2, c.f.f32240ed, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.mGLAttribPosition);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.mGLAttribTextureCoordinate, 2, c.f.f32240ed, false, 0, (Buffer) floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoordinate);
            if (i10 != -1) {
                GLES20.glActiveTexture(33984);
                OpenGlUtils.bindTexture(getTarget(), i10);
                GLES20.glUniform1i(this.mGLUniformTexture, 0);
            }
            beforeDrawArrays(i10);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.mGLAttribPosition);
            GLES20.glDisableVertexAttribArray(this.mGLAttribTextureCoordinate);
            OpenGlUtils.bindTexture(getTarget(), 0);
        }
    }

    protected void onInit() {
        this.mProgram.build();
        this.mGLAttribPosition = GLES20.glGetAttribLocation(this.mProgram.getProgramId(), CommonNetImpl.POSITION);
        this.mGLUniformTexture = GLES20.glGetUniformLocation(this.mProgram.getProgramId(), "inputImageTexture");
        this.mGLAttribTextureCoordinate = GLES20.glGetAttribLocation(this.mProgram.getProgramId(), "inputTextureCoordinate");
        this.mIsInitialized = true;
    }

    public void onOutputSizeChanged(int i10, int i11) {
    }

    protected void onUninit() {
    }

    protected void runPendingOnDrawTasks() {
        LinkedList linkedList;
        synchronized (this.mRunOnDraw) {
            linkedList = new LinkedList(this.mRunOnDraw);
            this.mRunOnDraw.clear();
        }
        while (!linkedList.isEmpty()) {
            ((Runnable) linkedList.removeFirst()).run();
        }
    }

    public void setTexutreTransform(float[] fArr) {
        this.mTextureMatrix = fArr;
    }
}
