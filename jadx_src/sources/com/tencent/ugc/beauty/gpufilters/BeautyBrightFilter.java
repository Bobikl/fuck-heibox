package com.tencent.ugc.beauty.gpufilters;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.l;
import com.tencent.ugc.beauty.NativeLoad;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.filter.TXCGPUThreeInputFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class BeautyBrightFilter extends TXCGPUImageFilter implements BeautyInterFace {
    private float mBeautyLevel = 0.0f;
    private float mWhiteLevel = 0.0f;
    private float mRuddyLevel = 0.0f;
    private float mSharpnessLevel = 0.0f;
    private final FloatBuffer mNormalCubeVerticesBuffer = OpenGlUtils.createNormalCubeVerticesBuffer();
    private final FloatBuffer mNormalTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(l.NORMAL, false, false);
    private final TXCGPUFaceFilter mNewFaceFilter = new TXCGPUFaceFilter();
    private final BeautyCoreFilter mBeautyCoreFilter = new BeautyCoreFilter();
    private final TXCGPUSharpenFilter mSharpenessFilter = new TXCGPUSharpenFilter();

    public static class BeautyCoreFilter extends TXCGPUThreeInputFilter {
        private int mBeautyDegreeLocation;
        private int mBrightDegreeLocation;
        private int mRuddyLocation;

        public BeautyCoreFilter() {
            super(TXCGPUThreeInputFilter.VERTEX_THREE_INPUT_SHADER, "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
            this.mBeautyDegreeLocation = -1;
            this.mBrightDegreeLocation = -1;
            this.mRuddyLocation = -1;
        }

        @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
        public int buildProgram() {
            return NativeLoad.nativeLoadGLProgram(1);
        }

        @Override // com.tencent.ugc.videobase.filter.TXCGPUThreeInputFilter, com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
        public void onInit(GLTexturePool gLTexturePool) {
            super.onInit(gLTexturePool);
            this.mBeautyDegreeLocation = GLES20.glGetUniformLocation(getProgramId(), "smoothDegree");
            this.mBrightDegreeLocation = GLES20.glGetUniformLocation(getProgramId(), "brightDegree");
            this.mRuddyLocation = GLES20.glGetUniformLocation(getProgramId(), "ruddyDegree");
        }

        public void setBeautyLevel(float f10) {
            setFloatOnDraw(this.mBeautyDegreeLocation, BeautyBrightFilter.getNewBeautyLevel(f10));
        }

        public void setBrightLevel(float f10) {
            setFloatOnDraw(this.mBrightDegreeLocation, f10 / 3.0f);
        }

        public void setRuddyLevel(float f10) {
            setFloatOnDraw(this.mRuddyLocation, (f10 / 10.0f) / 2.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float getNewBeautyLevel(float f10) {
        if (f10 <= 1.0f) {
            return 0.1f;
        }
        double d10 = f10;
        if (d10 < 2.5d) {
            f10 = getValue((f10 - 1.0f) / 1.5f, 1.0f, 4.1f);
        } else if (f10 < 4.0f) {
            f10 = getValue((f10 - 2.5f) / 1.5f, 4.1f, 5.6f);
        } else if (d10 < 5.5d) {
            f10 = getValue((f10 - 4.0f) / 1.5f, 5.6f, 6.8f);
        } else if (d10 <= 7.0d) {
            f10 = getValue((f10 - 5.5f) / 1.5f, 6.8f, 7.0f);
        }
        return f10 / 10.0f;
    }

    private static float getValue(float f10, float f11, float f12) {
        return f11 + ((f12 - f11) * f10);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return isLessOrEqualZero(this.mBeautyLevel) && isLessOrEqualZero(this.mWhiteLevel) && isLessOrEqualZero(this.mRuddyLevel) && isLessOrEqualZero(this.mSharpnessLevel);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i10, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        FloatBuffer floatBuffer3;
        FloatBuffer floatBuffer4;
        int id2;
        int id3;
        FloatBuffer floatBuffer5;
        FloatBuffer floatBuffer6;
        if (isInitialized()) {
            runPendingOnDrawTasks();
            float f10 = this.mBeautyLevel;
            GLTexture gLTextureObtain = null;
            if (f10 > 0.0f || this.mWhiteLevel > 0.0f || this.mRuddyLevel > 0.0f) {
                if (f10 != 0.0f) {
                    GLTexturePool gLTexturePool = this.mTexturePool;
                    Size size = this.mOutputSize;
                    gLTextureObtain = gLTexturePool.obtain(size.width, size.height);
                    this.mNewFaceFilter.onDraw(i10, gLTextureObtain, floatBuffer, floatBuffer2);
                    id2 = gLTextureObtain.getId();
                    floatBuffer4 = this.mNormalCubeVerticesBuffer;
                    floatBuffer3 = this.mNormalTextureCoordsBuffer;
                } else {
                    floatBuffer3 = floatBuffer2;
                    floatBuffer4 = floatBuffer;
                    id2 = i10;
                }
                GLTexturePool gLTexturePool2 = this.mTexturePool;
                Size size2 = this.mOutputSize;
                GLTexture gLTextureObtain2 = gLTexturePool2.obtain(size2.width, size2.height);
                this.mBeautyCoreFilter.setSecondInputTexture(i10);
                if (this.mSharpnessLevel > 0.0f) {
                    this.mBeautyCoreFilter.onDraw(id2, gLTextureObtain2, floatBuffer4, floatBuffer3);
                } else {
                    this.mBeautyCoreFilter.onDraw(id2, gLTexture, floatBuffer4, floatBuffer3);
                }
                id3 = gLTextureObtain2.getId();
                floatBuffer5 = this.mNormalCubeVerticesBuffer;
                floatBuffer6 = this.mNormalTextureCoordsBuffer;
                if (gLTextureObtain != null) {
                    gLTextureObtain.release();
                }
                gLTextureObtain = gLTextureObtain2;
            } else {
                floatBuffer6 = floatBuffer2;
                floatBuffer5 = floatBuffer;
                id3 = i10;
            }
            if (this.mSharpnessLevel > 0.0f || id3 == i10) {
                this.mSharpenessFilter.onDraw(id3, gLTexture, floatBuffer5, floatBuffer6);
            }
            if (gLTextureObtain != null) {
                gLTextureObtain.release();
            }
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mNewFaceFilter.initialize(gLTexturePool);
        this.mBeautyCoreFilter.initialize(gLTexturePool);
        this.mSharpenessFilter.initialize(gLTexturePool);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        this.mBeautyCoreFilter.onOutputSizeChanged(i10, i11);
        this.mNewFaceFilter.onOutputSizeChanged(i10, i11);
        this.mSharpenessFilter.onOutputSizeChanged(i10, i11);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        super.onUninit();
        this.mBeautyCoreFilter.uninitialize();
        this.mNewFaceFilter.uninitialize();
        this.mSharpenessFilter.uninitialize();
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setBeautyLevel(float f10) {
        this.mBeautyLevel = f10;
        this.mBeautyCoreFilter.setBeautyLevel(f10);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setRuddyLevel(float f10) {
        this.mRuddyLevel = f10;
        this.mBeautyCoreFilter.setRuddyLevel(f10);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setSharpenLevel(float f10) {
        float f11 = f10 / 1.5f;
        this.mSharpnessLevel = f11;
        this.mSharpenessFilter.setSharpness(f11);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setWhitenessLevel(float f10) {
        this.mWhiteLevel = f10;
        this.mBeautyCoreFilter.setBrightLevel(f10);
    }
}
