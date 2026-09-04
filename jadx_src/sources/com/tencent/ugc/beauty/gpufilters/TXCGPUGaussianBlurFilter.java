package com.tencent.ugc.beauty.gpufilters;

import android.opengl.GLES20;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUGaussianBlurFilter extends TXCGPUImageFilterChain {
    private final a mHeightFilter;
    private final a mWidthFilter;

    public static final class a extends TXCGPUImageFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f103335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f103336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f103337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f103338d;

        public a() {
            super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nconst int GAUSSIAN_SAMPLES = 9;\n\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\n\nvarying vec2 textureCoordinate;\nvarying vec2 blurCoordinates[GAUSSIAN_SAMPLES];\n\nvoid main()\n{\n gl_Position = position;\n textureCoordinate = inputTextureCoordinate.xy;\n \n // Calculate the positions for the blur\n int multiplier = 0;\n vec2 blurStep;\n   vec2 singleStepOffset = vec2(texelHeightOffset, texelWidthOffset);\n    \n for (int i = 0; i < GAUSSIAN_SAMPLES; i++)\n   {\n  multiplier = (i - ((GAUSSIAN_SAMPLES - 1) / 2));\n       // Blur in x (horizontal)\n       blurStep = float(multiplier) * singleStepOffset;\n  blurCoordinates[i] = inputTextureCoordinate.xy + blurStep;\n }\n}\n", "uniform sampler2D inputImageTexture;\n\nconst lowp int GAUSSIAN_SAMPLES = 9;\n\nvarying highp vec2 textureCoordinate;\nvarying highp vec2 blurCoordinates[GAUSSIAN_SAMPLES];\n\nvoid main()\n{\n lowp vec3 sum = vec3(0.0);\n   lowp vec4 fragColor=texture2D(inputImageTexture,textureCoordinate);\n \n    sum += texture2D(inputImageTexture, blurCoordinates[0]).rgb * 0.05;\n    sum += texture2D(inputImageTexture, blurCoordinates[1]).rgb * 0.09;\n    sum += texture2D(inputImageTexture, blurCoordinates[2]).rgb * 0.12;\n    sum += texture2D(inputImageTexture, blurCoordinates[3]).rgb * 0.15;\n    sum += texture2D(inputImageTexture, blurCoordinates[4]).rgb * 0.18;\n    sum += texture2D(inputImageTexture, blurCoordinates[5]).rgb * 0.15;\n    sum += texture2D(inputImageTexture, blurCoordinates[6]).rgb * 0.12;\n    sum += texture2D(inputImageTexture, blurCoordinates[7]).rgb * 0.09;\n    sum += texture2D(inputImageTexture, blurCoordinates[8]).rgb * 0.05;\n\n gl_FragColor = vec4(sum,fragColor.a);\n}");
        }

        private void a() {
            runOnDraw(com.tencent.ugc.beauty.gpufilters.a.a(this));
        }

        static /* synthetic */ void a(a aVar) {
            GLES20.glUseProgram(aVar.getProgramId());
            GLES20.glUniform1f(aVar.f103335a, aVar.f103337c / aVar.mOutputSize.width);
            GLES20.glUniform1f(aVar.f103336b, aVar.f103338d / aVar.mOutputSize.height);
        }

        public final void a(float f10, float f11) {
            this.f103337c = f10;
            this.f103338d = f11;
            a();
        }

        @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
        public final void onInit(GLTexturePool gLTexturePool) {
            super.onInit(gLTexturePool);
            this.f103335a = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
            this.f103336b = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
        }

        @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
        public final void onOutputSizeChanged(int i10, int i11) {
            super.onOutputSizeChanged(i10, i11);
            a();
        }
    }

    public TXCGPUGaussianBlurFilter() {
        this(1.0f);
    }

    public TXCGPUGaussianBlurFilter(float f10) {
        a aVar = new a();
        this.mWidthFilter = aVar;
        a aVar2 = new a();
        this.mHeightFilter = aVar2;
        aVar.a(f10, 0.0f);
        aVar2.a(0.0f, f10);
        addFilter(aVar);
        addFilter(aVar2);
    }

    public void setBlurSize(float f10) {
        this.mWidthFilter.a(f10, 0.0f);
        this.mHeightFilter.a(0.0f, f10);
    }
}
