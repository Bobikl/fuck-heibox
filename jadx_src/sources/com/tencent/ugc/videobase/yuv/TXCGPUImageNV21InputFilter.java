package com.tencent.ugc.videobase.yuv;

import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUImageNV21InputFilter extends TXCGPUImageYUVInputFilter {
    private static final String NV21_RENDER_SHADER = "varying highp vec2 textureCoordinate;\n\nuniform sampler2D yTexture;\nuniform sampler2D uvTexture;\nmediump mat3 colorConversionMatrix = mat3(       1.164,  1.164, 1.164,\n       1.596, -0.813,   0.0,\n         0.0, -0.392, 2.017\n);\nvoid main()\n{\n    mediump vec3 yuv;\n    lowp vec3 rgb;\n\n    yuv.x = texture2D(yTexture, textureCoordinate).r - (16.0/255.0);\n    yuv.yz = texture2D(uvTexture, textureCoordinate).ra - vec2(0.5, 0.5);\n    rgb = colorConversionMatrix * yuv;\n\n    gl_FragColor = vec4(rgb, 1.0);\n}";

    public TXCGPUImageNV21InputFilter() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, NV21_RENDER_SHADER);
    }

    @Override // com.tencent.ugc.videobase.yuv.TXCGPUImageYUVInputFilter
    protected int getUvFormat() {
        return bb.c.f.QB;
    }
}
