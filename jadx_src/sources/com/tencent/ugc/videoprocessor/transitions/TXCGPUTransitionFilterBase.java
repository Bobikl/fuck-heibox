package com.tencent.ugc.videoprocessor.transitions;

import android.opengl.GLES20;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUTransitionFilterBase extends TXCGPUImageFilter {
    protected static final String FRAG_GET_FROM_COLOR = "vec4 getFromColor(in vec2 uv){\n    vec2 fromTexture = vec2(uv.x,1.0 - uv.y);\n    vec4 fromColor = texture2D(inputImageTexture,fromTexture);\n    return fromColor;\n}";
    protected static final String FRAG_GET_TO_COLOR = "vec4 getToColor(in vec2 uv){\n    vec2 toTexture = vec2(uv.x,1.0-uv.y);\n    vec4 toColor = texture2D(inputImageTexture,toTexture);\n    return toColor;\n}";
    protected static final String FRAG_MAIN = "void main() {\n    gl_FragColor = transition(_uv);\n}";
    protected static final String FRAG_PUBLIC_DECLARE = "precision mediump float;\nvarying mediump vec2 _uv;\nuniform sampler2D inputImageTexture;\nuniform float progress;\nuniform float ratio;";
    protected static final String TRANSITION_BASE_VERTEX = "attribute vec2 position; \nvarying mediump vec2 _uv;\n  \nvoid main() \n{ \n    gl_Position = vec4(position,0,1); \n    vec2 uv = position * 0.5 + 0.5;\n    _uv = vec2(uv.x,1.0 - uv.y);\n}";
    private int mProgressPosition;
    private int mRatioPosition;
    public final int mType;

    public TXCGPUTransitionFilterBase(String str, String str2, int i10) {
        super(str, str2);
        this.mType = i10;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mProgressPosition = GLES20.glGetUniformLocation(getProgramId(), "progress");
        this.mRatioPosition = GLES20.glGetUniformLocation(getProgramId(), "ratio");
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        if (i11 != 0) {
            setFloatOnDraw(this.mRatioPosition, (i10 * 1.0f) / i11);
        }
    }

    public void setProgressForTransition(float f10) {
        setFloatOnDraw(this.mProgressPosition, f10);
    }
}
