package com.tencent.ugc.videoprocessor.videoeffect;

import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TXCGPUEffectFilterBase extends TXCGPUImageFilter {
    protected long mEffectStartTime;

    public static class VideoEffectParams {
    }

    public TXCGPUEffectFilterBase() {
        this(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public TXCGPUEffectFilterBase(String str, String str2) {
        super(str, str2);
        this.mEffectStartTime = -1L;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mEffectStartTime = -1L;
    }

    public void setNextFrameTimestamp(long j10) {
        if (this.mEffectStartTime == -1) {
            this.mEffectStartTime = j10;
        }
    }
}
