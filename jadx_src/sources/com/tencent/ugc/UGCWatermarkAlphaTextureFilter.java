package com.tencent.ugc;

import android.opengl.GLES20;
import com.tencent.ugc.beauty.gpufilters.TXCGPUWatermarkFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public class UGCWatermarkAlphaTextureFilter extends TXCGPUWatermarkFilter {
    private static final String WATERMARK_ALPHA_FRAG = "varying lowp vec2 textureCoordinate;\n   \n  uniform sampler2D inputImageTexture;\n  uniform mediump float alphaBlend;\n  \n  void main()\n  {\n      mediump vec4 color = texture2D(inputImageTexture, textureCoordinate);\n       if (0.0 == color.a){\n            gl_FragColor = color;\n       }else{\n            gl_FragColor = vec4(color.rgb, alphaBlend);\n       } \n  }\n";
    private int mAlphaUniform;
    private boolean mIsShowBackImageMoment;

    public UGCWatermarkAlphaTextureFilter() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, WATERMARK_ALPHA_FRAG);
        this.mAlphaUniform = -1;
        this.mIsShowBackImageMoment = false;
    }

    static /* synthetic */ void lambda$setTextureWatermark$1(UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter, int i10, int i11, int i12, float f10, float f11, float f12) {
        if (uGCWatermarkAlphaTextureFilter.mRenderObjects == null) {
            uGCWatermarkAlphaTextureFilter.mRenderObjects = new TXCGPUWatermarkFilter.WatermarkRenderObject[1];
        }
        TXCGPUWatermarkFilter.WatermarkRenderObject[] watermarkRenderObjectArr = uGCWatermarkAlphaTextureFilter.mRenderObjects;
        if (watermarkRenderObjectArr[0] == null) {
            watermarkRenderObjectArr[0] = new TXCGPUWatermarkFilter.WatermarkRenderObject();
        }
        if (i10 == -1) {
            uGCWatermarkAlphaTextureFilter.mRenderObjects[0].releaseResource();
            uGCWatermarkAlphaTextureFilter.mRenderObjects[0] = null;
        } else {
            uGCWatermarkAlphaTextureFilter.mRenderObjects[0].textureId = i10;
            uGCWatermarkAlphaTextureFilter.calculateOffsetMatrix(i11, i12, f10, f11, f12, 0);
        }
    }

    @Override // com.tencent.ugc.beauty.gpufilters.TXCGPUWatermarkFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void afterDrawArrays() {
        if (!this.mDrawWaterMarkEnabled) {
            return;
        }
        GLES20.glEnable(bb.c.d.f31689zi);
        if (this.mIsShowBackImageMoment) {
            GLES20.glBlendFunc(bb.c.b.Tb, bb.c.b.Sb);
        } else {
            GLES20.glBlendFunc(bb.c.b.Qb, bb.c.b.Rb);
        }
        GLES20.glActiveTexture(33984);
        int i10 = 0;
        while (true) {
            TXCGPUWatermarkFilter.WatermarkRenderObject[] watermarkRenderObjectArr = this.mRenderObjects;
            if (i10 >= watermarkRenderObjectArr.length) {
                GLES20.glDisable(bb.c.d.f31689zi);
                return;
            }
            if (watermarkRenderObjectArr[i10] != null) {
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(bb.c.e.F, this.mRenderObjects[i10].textureId);
                GLES20.glUniform1i(this.mGLUniformTexture, 0);
                GLES20.glVertexAttribPointer(this.mGLAttribPosition, 2, bb.c.f.f32240ed, false, 8, (Buffer) this.mRenderObjects[i10].vertexCoordsBuffer);
                GLES20.glEnableVertexAttribArray(this.mGLAttribPosition);
                GLES20.glVertexAttribPointer(this.mGLAttribTextureCoord, 2, bb.c.f.f32240ed, false, 0, (Buffer) TXCGPUWatermarkFilter.TEXTURE_COORDS_BUFFER);
                GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoord);
                GLES20.glDrawElements(4, TXCGPUWatermarkFilter.DRAW_ORDER.length, bb.c.f.f32170bd, TXCGPUWatermarkFilter.DRAW_ORDER_BUFFER);
                GLES20.glDisableVertexAttribArray(this.mGLAttribPosition);
                GLES20.glDisableVertexAttribArray(this.mGLAttribTextureCoord);
            }
            i10++;
        }
    }

    @Override // com.tencent.ugc.beauty.gpufilters.TXCGPUWatermarkFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        this.mAlphaUniform = GLES20.glGetUniformLocation(getProgramId(), "alphaBlend");
        this.mSrcBlendMode = bb.c.b.Qb;
        setAlpha(1.0f);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.TXCGPUWatermarkFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        this.mRenderObjects = null;
    }

    public void setAlpha(float f10) {
        setFloatOnDraw(this.mAlphaUniform, f10);
    }

    public void setShowBackImageMoment(boolean z10) {
        runOnDraw(hk.a(this, z10));
    }

    public void setTextureWatermark(int i10, int i11, int i12, float f10, float f11, float f12) {
        runOnDraw(hl.a(this, i10, i11, i12, f10, f11, f12));
    }
}
