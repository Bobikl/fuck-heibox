package com.tencent.ugc.videobase.yuv;

import android.opengl.GLES20;
import androidx.constraintlayout.core.motion.utils.w;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUImageNV12InputFilter extends TXCGPUImageYUVInputFilter {
    private static final String NV21_RENDER_SHADER = "precision highp float;\nvarying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform sampler2D uvTexture;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main()\n{\n    highp vec3 yuv;\n    highp vec3 rgb;\n\n    yuv.x = texture2D(inputImageTexture, textureCoordinate).r;\n    yuv.y = texture2D(uvTexture, textureCoordinate).r;\n    yuv.z = texture2D(uvTexture, textureCoordinate).a;\n    yuv += offset;\n    rgb = convertMatrix * yuv;\n\n    gl_FragColor = vec4(rgb, 1.0);\n}";
    private int mUniformConvertMatrix;
    private int mUniformConvertOffset;

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.yuv.TXCGPUImageNV12InputFilter$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f103926a;

        static {
            int[] iArr = new int[GLConstants.ColorRange.values().length];
            f103926a = iArr;
            try {
                iArr[GLConstants.ColorRange.FULL_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103926a[GLConstants.ColorRange.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103926a[GLConstants.ColorRange.VIDEO_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TXCGPUImageNV12InputFilter() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, NV21_RENDER_SHADER);
    }

    private float[] getConvertMatrix() {
        GLConstants.ColorSpace colorSpace = this.mColorSpace;
        if (colorSpace == null || colorSpace == GLConstants.ColorSpace.UNKNOWN) {
            colorSpace = GLConstants.ColorSpace.BT601;
        }
        GLConstants.ColorRange colorRange = this.mColorRange;
        if (colorRange == null || colorRange == GLConstants.ColorRange.UNKNOWN) {
            colorRange = GLConstants.ColorRange.VIDEO_RANGE;
        }
        if (colorSpace == GLConstants.ColorSpace.BT601) {
            if (colorRange == GLConstants.ColorRange.VIDEO_RANGE) {
                return TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_601_VIDEO_RANGE_MATRIX;
            }
            if (colorRange == GLConstants.ColorRange.FULL_RANGE) {
                return TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_601_FULL_RANGE_MATRIX;
            }
        } else if (colorSpace == GLConstants.ColorSpace.BT709) {
            if (colorRange == GLConstants.ColorRange.VIDEO_RANGE) {
                return TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_709_VIDEO_RANGE_MATRIX;
            }
            if (colorRange == GLConstants.ColorRange.FULL_RANGE) {
                return TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_709_FULL_RANGE_MATRIX;
            }
        }
        return TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_601_VIDEO_RANGE_MATRIX;
    }

    private float[] getConvertOffset() {
        return AnonymousClass1.f103926a[this.mColorRange.ordinal()] != 1 ? TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_VIDEO_RANGE_OFFSET : TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_FULL_RANGE_OFFSET;
    }

    static /* synthetic */ void lambda$onInit$0(TXCGPUImageNV12InputFilter tXCGPUImageNV12InputFilter) {
        GLES20.glUseProgram(tXCGPUImageNV12InputFilter.getProgramId());
        GLES20.glUniform3fv(tXCGPUImageNV12InputFilter.mUniformConvertOffset, 1, tXCGPUImageNV12InputFilter.getConvertOffset(), 0);
        GLES20.glUniformMatrix3fv(tXCGPUImageNV12InputFilter.mUniformConvertMatrix, 1, false, tXCGPUImageNV12InputFilter.getConvertMatrix(), 0);
    }

    static /* synthetic */ void lambda$setColorFormat$1(TXCGPUImageNV12InputFilter tXCGPUImageNV12InputFilter) {
        GLES20.glUniformMatrix3fv(tXCGPUImageNV12InputFilter.mUniformConvertMatrix, 1, false, tXCGPUImageNV12InputFilter.getConvertMatrix(), 0);
        GLES20.glUniform3fv(tXCGPUImageNV12InputFilter.mUniformConvertOffset, 1, tXCGPUImageNV12InputFilter.getConvertOffset(), 0);
    }

    @Override // com.tencent.ugc.videobase.yuv.TXCGPUImageYUVInputFilter
    protected int getUvFormat() {
        return bb.c.f.QB;
    }

    @Override // com.tencent.ugc.videobase.yuv.TXCGPUImageYUVInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mUniformConvertMatrix = GLES20.glGetUniformLocation(getProgramId(), "convertMatrix");
        this.mUniformConvertOffset = GLES20.glGetUniformLocation(getProgramId(), w.c.R);
        runOnDraw(c.a(this));
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void setColorFormat(GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        if (colorRange == this.mColorRange && colorSpace == this.mColorSpace) {
            return;
        }
        super.setColorFormat(colorRange, colorSpace);
        runOnDraw(d.a(this));
    }
}
