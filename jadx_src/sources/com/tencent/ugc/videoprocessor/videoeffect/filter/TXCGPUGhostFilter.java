package com.tencent.ugc.videoprocessor.videoeffect.filter;

import android.opengl.GLES20;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUGhostFilter extends TXCGPUEffectFilterBase {
    private static final String BLUR_FRAGMENT_SHADER = "precision mediump float;  \nuniform sampler2D inputImageTexture;  \nvarying vec2 textureCoordinate;  \nvarying vec2 oneBackCoord;  \nvarying vec2 twoBackCoord;  \nvarying vec2 threeBackCoord;  \nvarying vec2 fourBackCoord;  \nvarying vec2 oneForwardCoord;  \nvarying vec2 twoForwardCoord;  \nvarying vec2 threeForwardCoord;  \nvarying vec2 fourForwardCoord;  \nvoid main() {   \n\tlowp vec4 fragmentColor = texture2D(inputImageTexture, textureCoordinate) * 0.18;  \n\tfragmentColor += texture2D(inputImageTexture, oneBackCoord) * 0.15;  \n\tfragmentColor += texture2D(inputImageTexture, twoBackCoord) * 0.12;  \n\tfragmentColor += texture2D(inputImageTexture, threeBackCoord) * 0.09;  \n\tfragmentColor += texture2D(inputImageTexture, fourBackCoord) * 0.05;  \n\tfragmentColor += texture2D(inputImageTexture, oneForwardCoord) * 0.15;  \n\tfragmentColor += texture2D(inputImageTexture, twoForwardCoord) * 0.12;  \n\tfragmentColor += texture2D(inputImageTexture, threeForwardCoord) * 0.09;  \n\tfragmentColor += texture2D(inputImageTexture, fourForwardCoord) * 0.05;  \n\tgl_FragColor = fragmentColor;  \n}  \n";
    private static final String BLUR_VERTEX_SHADER = "attribute vec4 position;  \nattribute vec4 inputTextureCoordinate;\nuniform vec2 step;  \nvarying vec2 textureCoordinate;  \nvarying vec2 oneBackCoord;  \nvarying vec2 twoBackCoord;  \nvarying vec2 threeBackCoord;  \nvarying vec2 fourBackCoord;  \nvarying vec2 oneForwardCoord;  \nvarying vec2 twoForwardCoord;  \nvarying vec2 threeForwardCoord;  \nvarying vec2 fourForwardCoord;  \nvoid main() {  \n\tgl_Position = position;  \n\tvec2 coord = inputTextureCoordinate.xy;  \n\ttextureCoordinate = coord;  \n\toneBackCoord = coord.xy - step;  \n\ttwoBackCoord = coord.xy - 2.0 * step;  \n\tthreeBackCoord = coord.xy - 3.0 * step;  \n\tfourBackCoord = coord.xy - 4.0 * step;  \n\toneForwardCoord = coord.xy + step;  \n\ttwoForwardCoord = coord.xy + 2.0 * step;  \n\tthreeForwardCoord = coord.xy + 3.0 * step;  \n\tfourForwardCoord = coord.xy + 4.0 * step;  \n}  \n";
    private static final int DURATION_GHOST_LV1 = 100;
    private static final int DURATION_GHOST_LV2 = 200;
    private static final int DURATION_GHOST_LV3 = 300;
    private static final int DURATION_GHOST_LV4 = 400;
    private static final int DURATION_GHOST_LV5 = 500;
    private static final int DURATION_GHOST_LV6 = 600;
    private static final int DURATION_GHOST_LV7 = 700;
    private static final int DURATION_GHOST_LV8 = 800;
    private static final int DURATION_GHOST_LV9 = 850;
    private static final String SHIFT_FRAGMENT_SHADER = "precision lowp float;  \nvarying vec2 textureCoordinate;  \n\tuniform sampler2D inputImageTexture;  \n\tuniform float shift;  \n\tuniform float alpha;  \n\tvoid main() { vec4 colorShift = texture2D(inputImageTexture, textureCoordinate + vec2(shift, 0.0));\n\tvec4 color = texture2D(inputImageTexture, textureCoordinate + vec2(shift * 0.1, 0.0));  \n\tgl_FragColor = vec4(mix(colorShift.rgb, color.rgb, alpha), color.a);  \n}  \n";
    private int mAlphaPos;
    private float mBlur;
    private int mBlurPos;
    private GhostParam mGhostParam;
    private final TXCGPUImageFilter mShiftFilter;
    private int mShiftPos;

    public static class GhostParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public float shift = 0.0f;
        public float blur = 0.0f;
        public float alpha = 0.0f;
    }

    public TXCGPUGhostFilter() {
        super(BLUR_VERTEX_SHADER, BLUR_FRAGMENT_SHADER);
        this.mShiftPos = -1;
        this.mAlphaPos = -1;
        this.mBlurPos = -1;
        this.mBlur = 0.0f;
        this.mShiftFilter = new TXCGPUImageFilter(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, SHIFT_FRAGMENT_SHADER);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i10, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLTexture gLTextureObtain = this.mTexturePool.obtain(getOutputSize().width, getOutputSize().height);
        super.onDraw(i10, gLTextureObtain, floatBuffer, floatBuffer2);
        this.mShiftFilter.onDraw(gLTextureObtain.getId(), gLTexture, floatBuffer, floatBuffer2);
        gLTextureObtain.release();
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mBlurPos = GLES20.glGetUniformLocation(getProgramId(), "step");
        this.mShiftFilter.initialize(gLTexturePool);
        this.mShiftPos = GLES20.glGetUniformLocation(getProgramId(), "shift");
        this.mAlphaPos = GLES20.glGetUniformLocation(getProgramId(), "alpha");
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        TXCGPUImageFilter tXCGPUImageFilter = this.mShiftFilter;
        if (tXCGPUImageFilter != null) {
            tXCGPUImageFilter.onOutputSizeChanged(i10, i11);
        }
        if (Math.abs(i10) <= 1.0E-5d || Math.abs(this.mBlur) <= 1.0E-5d) {
            return;
        }
        setFloatVec2OnDraw(this.mBlurPos, new float[]{this.mBlur / getOutputSize().width, 0.0f});
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        super.onUninit();
        this.mShiftFilter.uninitialize();
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase
    public void setNextFrameTimestamp(long j10) {
        super.setNextFrameTimestamp(j10);
        if (this.mGhostParam == null) {
            GhostParam ghostParam = new GhostParam();
            this.mGhostParam = ghostParam;
            ghostParam.blur = 0.0f;
            ghostParam.shift = 0.0f;
            ghostParam.alpha = 0.0f;
        }
        long jAbs = Math.abs(j10 - this.mEffectStartTime);
        if (jAbs < 100) {
            GhostParam ghostParam2 = this.mGhostParam;
            ghostParam2.blur = 10.0f;
            ghostParam2.shift = 0.01f;
            ghostParam2.alpha = 0.0f;
        } else if (jAbs < 200) {
            GhostParam ghostParam3 = this.mGhostParam;
            ghostParam3.blur = 20.0f;
            ghostParam3.shift = -0.02f;
            ghostParam3.alpha = 0.0f;
        } else if (jAbs < 300) {
            GhostParam ghostParam4 = this.mGhostParam;
            ghostParam4.blur = 30.0f;
            ghostParam4.shift = 0.02f;
            ghostParam4.alpha = 0.0f;
        } else if (jAbs < 400) {
            GhostParam ghostParam5 = this.mGhostParam;
            ghostParam5.blur = 20.0f;
            ghostParam5.shift = -0.03f;
            ghostParam5.alpha = 0.0f;
        } else if (jAbs < 500) {
            GhostParam ghostParam6 = this.mGhostParam;
            ghostParam6.blur = 10.0f;
            ghostParam6.shift = 0.01f;
            ghostParam6.alpha = 0.0f;
        } else if (jAbs < 600) {
            GhostParam ghostParam7 = this.mGhostParam;
            ghostParam7.blur = 20.0f;
            ghostParam7.shift = -0.02f;
            ghostParam7.alpha = 0.0f;
        } else if (jAbs < 700) {
            GhostParam ghostParam8 = this.mGhostParam;
            ghostParam8.blur = 30.0f;
            ghostParam8.shift = -0.03f;
            ghostParam8.alpha = 0.0f;
        } else if (jAbs < 800) {
            GhostParam ghostParam9 = this.mGhostParam;
            ghostParam9.blur = 20.0f;
            ghostParam9.shift = 0.02f;
            ghostParam9.alpha = 0.0f;
        } else if (jAbs < 850) {
            GhostParam ghostParam10 = this.mGhostParam;
            ghostParam10.blur = 0.0f;
            ghostParam10.shift = 0.0f;
            ghostParam10.alpha = 0.0f;
        } else {
            this.mEffectStartTime = -1L;
        }
        updateParams(this.mGhostParam);
    }

    public void updateParams(GhostParam ghostParam) {
        this.mBlur = ghostParam.blur;
        if (getOutputSize().width != 0) {
            setFloatVec2OnDraw(this.mBlurPos, new float[]{ghostParam.blur / getOutputSize().width, 0.0f});
        }
        this.mShiftFilter.setFloatOnDraw(this.mAlphaPos, ghostParam.alpha);
        this.mShiftFilter.setFloatOnDraw(this.mShiftPos, ghostParam.shift);
    }
}
