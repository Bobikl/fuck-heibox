package com.tencent.ugc.beauty.gpufilters;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageMultipleInputFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPULookupFilterGroup extends TXCGPUImageFilter {
    private static final String LOOKUP_FILTER_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2; // lookup texture 1\nuniform sampler2D inputImageTexture3; // lookup texture 2\n\n\nuniform lowp vec3 v3_params;\nuniform lowp vec2 v2_texs;\n\n\nvoid main()\n{\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n\n    mediump float blueColor = textureColor.b * 63.0;\n\n    mediump vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n\n    mediump vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 8.0);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n\n    highp vec2 texPos1;\n    texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n    texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n    highp vec2 texPos2;\n    texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n    texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n    lowp vec4 newColor1;\n    lowp vec4 newColor2;\n    if(textureCoordinate.x <= v3_params.x) { \n      if(v2_texs.x == 1.0) { \n        newColor1 = texture2D(inputImageTexture2, texPos1);\n        newColor2 = texture2D(inputImageTexture2, texPos2);\n        lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n        gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), v3_params.y);\n      } else { \n        gl_FragColor = textureColor;\n      } \n    } else {\n      if(v2_texs.y == 1.0) { \n        newColor1 = texture2D(inputImageTexture3, texPos1);\n        newColor2 = texture2D(inputImageTexture3, texPos2);\n        lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n        gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), v3_params.z);\n      } else { \n        gl_FragColor = textureColor;\n      } \n    }\n }";
    private Bitmap mLeftBitmap;
    private int mLeftTextureId;
    private int mLeftTextureUniform;
    private int mParams3Location;
    private final FloatBuffer mParamsFloatBuffer;
    private Bitmap mRightBitmap;
    private int mRightTextureId;
    private int mRightTextureUniform;
    private int mTexs2Location;
    private final FloatBuffer mTexsFloatBuffer;

    public TXCGPULookupFilterGroup() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, LOOKUP_FILTER_FRAGMENT_SHADER);
        this.mLeftBitmap = null;
        this.mLeftTextureId = -1;
        this.mRightBitmap = null;
        this.mRightTextureId = -1;
        this.mParamsFloatBuffer = FloatBuffer.allocate(3);
        this.mTexsFloatBuffer = FloatBuffer.allocate(2);
    }

    static /* synthetic */ void lambda$setBitmap$0(TXCGPULookupFilterGroup tXCGPULookupFilterGroup, float f10, float f11, float f12, Bitmap bitmap, Bitmap bitmap2) {
        tXCGPULookupFilterGroup.mParamsFloatBuffer.put(0, f10);
        tXCGPULookupFilterGroup.mParamsFloatBuffer.put(1, f11);
        tXCGPULookupFilterGroup.mParamsFloatBuffer.put(2, f12);
        if (bitmap == null) {
            OpenGlUtils.deleteTexture(tXCGPULookupFilterGroup.mLeftTextureId);
            tXCGPULookupFilterGroup.mLeftTextureId = -1;
            tXCGPULookupFilterGroup.mTexsFloatBuffer.put(0, 0.0f);
        } else if (bitmap != tXCGPULookupFilterGroup.mLeftBitmap) {
            tXCGPULookupFilterGroup.mLeftTextureId = OpenGlUtils.loadTexture(bitmap, tXCGPULookupFilterGroup.mLeftTextureId, false);
            tXCGPULookupFilterGroup.mTexsFloatBuffer.put(0, 1.0f);
        }
        if (bitmap2 == null) {
            OpenGlUtils.deleteTexture(tXCGPULookupFilterGroup.mRightTextureId);
            tXCGPULookupFilterGroup.mRightTextureId = -1;
            tXCGPULookupFilterGroup.mTexsFloatBuffer.put(1, 0.0f);
        } else if (bitmap2 != tXCGPULookupFilterGroup.mRightBitmap) {
            tXCGPULookupFilterGroup.mRightTextureId = OpenGlUtils.loadTexture(bitmap2, tXCGPULookupFilterGroup.mRightTextureId, false);
            tXCGPULookupFilterGroup.mTexsFloatBuffer.put(1, 1.0f);
        }
        tXCGPULookupFilterGroup.mLeftBitmap = bitmap;
        tXCGPULookupFilterGroup.mRightBitmap = bitmap2;
    }

    static /* synthetic */ void lambda$setIntensity$1(TXCGPULookupFilterGroup tXCGPULookupFilterGroup, float f10) {
        tXCGPULookupFilterGroup.mParamsFloatBuffer.put(1, f10);
        tXCGPULookupFilterGroup.mParamsFloatBuffer.put(2, 0.0f);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void afterDrawArrays() {
        super.afterDrawArrays();
        if (this.mLeftTextureId != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(bb.c.e.F, 0);
        }
        if (this.mRightTextureId != -1) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(bb.c.e.F, 0);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void beforeDrawArrays(int i10) {
        super.beforeDrawArrays(i10);
        if (this.mLeftTextureId != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(bb.c.e.F, this.mLeftTextureId);
            GLES20.glUniform1i(this.mLeftTextureUniform, 3);
        }
        if (this.mRightTextureId != -1) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(bb.c.e.F, this.mRightTextureId);
            GLES20.glUniform1i(this.mRightTextureUniform, 4);
        }
        GLES20.glUniform2fv(this.mTexs2Location, 1, this.mTexsFloatBuffer);
        GLES20.glUniform3fv(this.mParams3Location, 1, this.mParamsFloatBuffer);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mLeftTextureUniform = GLES20.glGetUniformLocation(getProgramId(), TXCGPUImageMultipleInputFilter.SECOND_INPUT_SAMPLE2D_NAME);
        this.mRightTextureUniform = GLES20.glGetUniformLocation(getProgramId(), TXCGPUImageMultipleInputFilter.THIRD_INPUT_SAMPLE2D_NAME);
        this.mParams3Location = GLES20.glGetUniformLocation(getProgramId(), "v3_params");
        this.mTexs2Location = GLES20.glGetUniformLocation(getProgramId(), "v2_texs");
        if (this.mLeftBitmap == null && this.mRightBitmap == null) {
            return;
        }
        setBitmap(this.mParamsFloatBuffer.get(0), this.mLeftBitmap, this.mParamsFloatBuffer.get(1), this.mRightBitmap, this.mParamsFloatBuffer.get(2));
        this.mLeftBitmap = null;
        this.mRightBitmap = null;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        super.onUninit();
        OpenGlUtils.deleteTexture(this.mLeftTextureId);
        OpenGlUtils.deleteTexture(this.mRightTextureId);
        this.mLeftTextureId = -1;
        this.mRightTextureId = -1;
    }

    public void setBitmap(float f10, Bitmap bitmap, float f11, Bitmap bitmap2, float f12) {
        runOnDraw(d.a(this, f10, f11, f12, bitmap, bitmap2));
    }

    public void setIntensity(float f10) {
        runOnDraw(e.a(this, f10));
    }
}
