package com.tencent.liteav.videobase.b;

import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends com.tencent.liteav.videobase.a.a {
    public a() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying highp vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final int a() {
        return 36197;
    }
}
