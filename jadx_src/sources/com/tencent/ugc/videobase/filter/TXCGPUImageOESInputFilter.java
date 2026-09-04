package com.tencent.ugc.videobase.filter;

import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUImageOESInputFilter extends TXCGPUImageFilter {
    private static final String OES_INPUT_FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying highp vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}";

    public TXCGPUImageOESInputFilter() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, OES_INPUT_FRAGMENT_SHADER);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public int getTarget() {
        return 36197;
    }
}
