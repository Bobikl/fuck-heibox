package com.tencent.ugc.videoprocessor.videoeffect.filter;

import android.opengl.GLES20;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUMirrorFilter extends TXCGPUEffectFilterBase {
    private static final int DURATION_MIRROR_LV1 = 1000;
    private static final int DURATION_MIRROR_LV2 = 2000;
    private static final String FRAGMENT_SHADER = "varying highp vec2 textureCoordinate; \nuniform sampler2D inputImageTexture; \nuniform lowp float mode; \n \nvoid main() \n{ \n    highp vec2 position = textureCoordinate; \n     \n    if (mode <= 0.5) \n    { \n        if (position.x > 0.5) \n        { \n            position.x = 1.0 - position.x; \n        } \n    } \n    else \n    { \n        if (position.x > 0.5) \n        { \n            position.x = position.x - 0.5; \n        } \n        else \n        { \n            position.x = 0.5 - position.x; \n        } \n    } \n     \n    gl_FragColor = texture2D(inputImageTexture, position); \n} \n";
    private MirrorParam mMirrorParam;
    private int mModePos;

    public static class MirrorParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public float mode = 0.0f;
    }

    public TXCGPUMirrorFilter() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, FRAGMENT_SHADER);
        this.mModePos = -1;
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mModePos = GLES20.glGetUniformLocation(getProgramId(), "mode");
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase
    public void setNextFrameTimestamp(long j10) {
        super.setNextFrameTimestamp(j10);
        if (this.mMirrorParam == null) {
            this.mMirrorParam = new MirrorParam();
        }
        long jAbs = Math.abs(j10 - this.mEffectStartTime);
        if (jAbs < 1000) {
            this.mMirrorParam.mode = 0.0f;
        } else if (jAbs < 2000) {
            this.mMirrorParam.mode = 1.0f;
        } else {
            this.mEffectStartTime = -1L;
        }
        setFloatOnDraw(this.mModePos, this.mMirrorParam.mode);
    }
}
