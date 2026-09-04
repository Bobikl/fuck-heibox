package com.tencent.custom.customcapture.opengl;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes4.dex */
public class OesInputFilter extends GPUImageFilter {
    private static final String OES_INPUT_FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying highp vec2 textureCoordinate;\n \nuniform samplerExternalOES inputImageTexture;\n \nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}";
    private static final String OES_INPUT_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\n\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}\n";
    protected int mTextureTransform;

    public OesInputFilter() {
        super(OES_INPUT_VERTEX_SHADER, OES_INPUT_FRAGMENT_SHADER);
    }

    public OesInputFilter(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.custom.customcapture.opengl.GPUImageFilter
    protected void beforeDrawArrays(int i10) {
        super.beforeDrawArrays(i10);
        GLES20.glUniformMatrix4fv(this.mTextureTransform, 1, false, this.mTextureMatrix, 0);
    }

    @Override // com.tencent.custom.customcapture.opengl.GPUImageFilter
    public int getTarget() {
        return 36197;
    }

    @Override // com.tencent.custom.customcapture.opengl.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.mTextureTransform = GLES20.glGetUniformLocation(this.mProgram.getProgramId(), "textureTransform");
    }
}
