package com.tencent.ugc.beauty.gpufilters;

import android.opengl.GLES20;
import com.tencent.ugc.videobase.filter.TXCGPUThreeInputFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUColorScreenFilter extends TXCGPUThreeInputFilter {
    public static final String COLORSCREEN_FILTER_FRAGMENT_SHADER = "precision mediump float;\nvarying highp vec2 textureCoordinate;\nvarying highp vec2 textureCoordinate2;\nvarying highp vec2 textureCoordinate3;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nuniform mediump vec3 screenReplaceColor; //YUV数据\nuniform float screenMirrorX;\nuniform float screenMirrorY;\n\nvoid main()\n{\n    highp vec4 _smooth = texture2D(inputImageTexture,textureCoordinate);\n    highp vec4 origin = texture2D(inputImageTexture2,textureCoordinate2);\n    \n    lowp float r = origin.r;\n    lowp float g = origin.g;\n    lowp float b = origin.b;\n    float Cr = 128.0 - 37.797 * r - 74.203 * g + 112.0 * b;\n    float Cb = 128.0 + 112.0 * r - 93.768 * g - 18.214 * b;\n    \n    highp vec2 screenPos = textureCoordinate3;\n    if(screenMirrorX != 0.0)screenPos.x = 1.0 - screenPos.x;\n    if(screenMirrorY != 0.0)screenPos.y = 1.0 - screenPos.y;\n    highp vec4 screen = texture2D(inputImageTexture3, screenPos);\n    float Y = 0.2989 * r + 0.5866 * g + 0.1145 * b;\n    Cr = 0.7132 * (r - Y);\n    Cb = 0.5647 * (b - Y);\n    float blendValue = 1.0 - smoothstep(0.4, 0.4 + 0.1, distance(vec2(Cr, Cb), vec2(screenReplaceColor.g, screenReplaceColor.b)));\n    vec3 diff = screen.rgb - _smooth.rgb;\n    _smooth.rgb = _smooth.rgb + blendValue * diff;\n    gl_FragColor = _smooth;\n}\n";
    private int screenColorLocation;
    private int screenMirrorXLocation;
    private int screenMirrorYLocation;
    private int screenModeLocation;
    private float[] screenReplaceColor;

    TXCGPUColorScreenFilter() {
        super(COLORSCREEN_FILTER_FRAGMENT_SHADER);
        this.screenModeLocation = -1;
        this.screenColorLocation = -1;
        this.screenMirrorXLocation = -1;
        this.screenMirrorYLocation = -1;
        this.screenReplaceColor = new float[]{0.0f, 1.0f, 0.0f};
    }

    public void enableScreenMode(boolean z10) {
        setFloatOnDraw(this.screenModeLocation, z10 ? 1.0f : 0.0f);
    }

    @Override // com.tencent.ugc.videobase.filter.TXCGPUThreeInputFilter, com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.screenModeLocation = GLES20.glGetUniformLocation(getProgramId(), "screenMode");
        this.screenColorLocation = GLES20.glGetUniformLocation(getProgramId(), "screenReplaceColor");
        this.screenMirrorXLocation = GLES20.glGetUniformLocation(getProgramId(), "screenMirrorX");
        this.screenMirrorYLocation = GLES20.glGetUniformLocation(getProgramId(), "screenMirrorY");
        setScreenColor(this.screenReplaceColor);
    }

    public void setScreenColor(float[] fArr) {
        double d10 = (((double) fArr[0]) * 0.2989d) + (((double) fArr[1]) * 0.5866d);
        float f10 = fArr[2];
        float f11 = (float) (d10 + (((double) f10) * 0.1145d));
        setFloatVec3OnDraw(this.screenColorLocation, new float[]{f11, (float) (((double) (fArr[0] - f11)) * 0.7132d), (float) (((double) (f10 - f11)) * 0.5647d)});
    }

    public void setScreenMirrorX(boolean z10) {
        setFloatOnDraw(this.screenMirrorXLocation, z10 ? 1.0f : 0.0f);
    }

    public void setScreenMirrorY(boolean z10) {
        setFloatOnDraw(this.screenMirrorYLocation, z10 ? 1.0f : 0.0f);
    }
}
