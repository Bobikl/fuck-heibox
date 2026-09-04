package com.tencent.ugc.videoprocessor.videoeffect.filter;

import android.opengl.GLES20;
import com.google.android.exoplayer2.text.ttml.d;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPURockFilter extends TXCGPUEffectFilterBase {
    private static final int DURATION_LIVEWAVE = 70;
    private static final int DURATION_LIVEWAVE_LVMIN = 120;
    private static final String FRAGMENT_SHADER = "precision highp float; \nvarying vec2 textureCoordinate; \nuniform sampler2D inputImageTexture; \nuniform float t; \nuniform float st; \nconst float stride = 7.0; \nconst float interval = 1.0; \nuniform float zMin; \nuniform float zMax; \nuniform vec2 center; \nuniform vec2 offsetR; \nuniform vec2 offsetG; \nuniform vec2 offsetB;\n\nfloat GetFactor(float elapse, float astride, float ainterval, float amp) \n{ \n   float ff = mod(elapse, astride + ainterval) / astride; \n   if (ff > 1.0) \n   { \n       ff = 0.0; \n   } \n   return pow(ff, 3.0) * 1.125 * amp; \n} \nvec2 _uv(vec2 uv, vec2 center, float zz, float min) \n{ \n   return uv + (zz + min) * (center - uv); \n} \nvoid main() \n{ \n   vec4 fout; \n   float zz = GetFactor(t - st, stride, interval, zMax - zMin); \n   float coeff = pow(zz, 0.75); \n   fout.r = texture2D(inputImageTexture, _uv(textureCoordinate, center, zz, zMin) + offsetR * coeff).r;\n   fout.g = texture2D(inputImageTexture, _uv(textureCoordinate, center, zz, zMin) + offsetG * coeff).g;\n   fout.b = texture2D(inputImageTexture, _uv(textureCoordinate, center, zz, zMin) + offsetB * coeff).b;\n   gl_FragColor = vec4(fout.rgb, 1.0); \n}\n";
    private static final int INTERVAL = 400;
    private int mCenterLocation;
    private int mCurrentLocation;
    private DongGanLightParam mDongGanParam;
    private int mDurationLocation;
    private int mOffsetBLocation;
    private int mOffsetGLocation;
    private int mOffsetRLocation;
    private int mZMaxLocation;
    private int mZMinLocation;

    public static class DongGanLightParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public float zoomMin = 0.0f;
        public float zoomMax = 0.4f;
        public float[] center = {0.5f, 0.5f};
        public float current = 0.0f;
        public float duration = 10.0f;
        public float[] offetRed = {0.0f, 0.0f};
        public float[] offsetGreen = {0.0f, 0.0f};
        public float[] offsetBlue = {0.0f, 0.0f};
    }

    public TXCGPURockFilter() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, FRAGMENT_SHADER);
        this.mZMinLocation = -1;
        this.mZMaxLocation = -1;
        this.mDurationLocation = -1;
        this.mCurrentLocation = -1;
        this.mCenterLocation = -1;
        this.mOffsetRLocation = -1;
        this.mOffsetGLocation = -1;
        this.mOffsetBLocation = -1;
        this.mDongGanParam = null;
    }

    private void setCurrent(float f10) {
        setFloatOnDraw(this.mCurrentLocation, f10);
    }

    private void setDuration(float f10) {
        setFloatOnDraw(this.mDurationLocation, f10);
    }

    private void setOffset(float[] fArr, float[] fArr2, float[] fArr3) {
        setFloatVec2OnDraw(this.mOffsetRLocation, fArr);
        setFloatVec2OnDraw(this.mOffsetGLocation, fArr2);
        setFloatVec2OnDraw(this.mOffsetBLocation, fArr3);
    }

    private void setZoom(float f10, float f11) {
        setFloatOnDraw(this.mZMinLocation, f10);
        setFloatOnDraw(this.mZMaxLocation, f11);
    }

    private void updateParamsToOpenGL() {
        DongGanLightParam dongGanLightParam = this.mDongGanParam;
        setOffset(dongGanLightParam.offetRed, dongGanLightParam.offsetGreen, dongGanLightParam.offsetBlue);
        setFloatVec2OnDraw(this.mCenterLocation, this.mDongGanParam.center);
        DongGanLightParam dongGanLightParam2 = this.mDongGanParam;
        setZoom(dongGanLightParam2.zoomMin, dongGanLightParam2.zoomMax);
        setDuration(this.mDongGanParam.duration);
        setCurrent(this.mDongGanParam.current);
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mZMinLocation = GLES20.glGetUniformLocation(getProgramId(), "zMin");
        this.mZMaxLocation = GLES20.glGetUniformLocation(getProgramId(), "zMax");
        this.mDurationLocation = GLES20.glGetUniformLocation(getProgramId(), "t");
        this.mCurrentLocation = GLES20.glGetUniformLocation(getProgramId(), "st");
        this.mCenterLocation = GLES20.glGetUniformLocation(getProgramId(), d.f49794m0);
        this.mOffsetRLocation = GLES20.glGetUniformLocation(getProgramId(), "offsetR");
        this.mOffsetGLocation = GLES20.glGetUniformLocation(getProgramId(), "offsetG");
        this.mOffsetBLocation = GLES20.glGetUniformLocation(getProgramId(), "offsetB");
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase
    public void setNextFrameTimestamp(long j10) {
        super.setNextFrameTimestamp(j10);
        if (this.mDongGanParam == null) {
            DongGanLightParam dongGanLightParam = new DongGanLightParam();
            this.mDongGanParam = dongGanLightParam;
            dongGanLightParam.duration = 8.0f;
            dongGanLightParam.center = new float[]{0.5f, 0.5f};
            dongGanLightParam.zoomMin = 0.0f;
            dongGanLightParam.zoomMax = 0.2f;
        }
        long jAbs = Math.abs(j10 - this.mEffectStartTime);
        if (jAbs < 120) {
            DongGanLightParam dongGanLightParam2 = this.mDongGanParam;
            dongGanLightParam2.current = 0.0f;
            dongGanLightParam2.duration = 8.0f;
            dongGanLightParam2.center = new float[]{0.0f, 0.0f};
            dongGanLightParam2.zoomMin = 0.0f;
            dongGanLightParam2.zoomMax = 0.0f;
            dongGanLightParam2.offetRed = new float[]{0.0f, 0.0f};
            dongGanLightParam2.offsetGreen = new float[]{0.0f, 0.0f};
        } else {
            for (int i10 = 1; i10 <= 8; i10++) {
                if (jAbs < (i10 * 70) + 120) {
                    DongGanLightParam dongGanLightParam3 = this.mDongGanParam;
                    dongGanLightParam3.current = i10;
                    dongGanLightParam3.duration = 8.0f;
                    dongGanLightParam3.center = new float[]{0.5f, 0.5f};
                    dongGanLightParam3.zoomMin = 0.0f;
                    dongGanLightParam3.zoomMax = 0.3f;
                    if (i10 >= 3) {
                        dongGanLightParam3.offetRed = new float[]{-0.1f, 0.0f};
                        dongGanLightParam3.offsetGreen = new float[]{0.0f, 0.1f};
                        break;
                    } else {
                        dongGanLightParam3.offetRed = new float[]{0.0f, 0.0f};
                        dongGanLightParam3.offsetGreen = new float[]{0.0f, 0.0f};
                        break;
                    }
                }
            }
            if (jAbs > 680) {
                if (jAbs <= 1080) {
                    DongGanLightParam dongGanLightParam4 = this.mDongGanParam;
                    dongGanLightParam4.current = 0.0f;
                    dongGanLightParam4.duration = 8.0f;
                    dongGanLightParam4.center = new float[]{0.0f, 0.0f};
                    dongGanLightParam4.zoomMin = 0.0f;
                    dongGanLightParam4.zoomMax = 0.0f;
                    dongGanLightParam4.offetRed = new float[]{0.0f, 0.0f};
                    dongGanLightParam4.offsetGreen = new float[]{0.0f, 0.0f};
                } else {
                    this.mEffectStartTime = -1L;
                }
            }
        }
        updateParamsToOpenGL();
    }
}
