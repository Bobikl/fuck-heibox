package com.tencent.custom.customcapture.structs;

import android.opengl.GLES20;
import android.util.Log;
import bb.c;
import com.tencent.custom.customcapture.opengl.OpenGlUtils;

/* JADX INFO: loaded from: classes4.dex */
public class FrameBuffer {
    private static final String TAG = "FrameBuffer";
    private int mFrameBufferId;
    private final int mHeight;
    private int mTextureId;
    private final int mWidth;

    public FrameBuffer(int i10, int i11) {
        this.mWidth = i10;
        this.mHeight = i11;
    }

    public int getFrameBufferId() {
        return this.mFrameBufferId;
    }

    public int getTextureId() {
        return this.mTextureId;
    }

    public void initialize() {
        this.mTextureId = OpenGlUtils.loadTexture(c.f.OB, null, this.mWidth, this.mHeight, -1);
        int iGenerateFrameBufferId = OpenGlUtils.generateFrameBufferId();
        this.mFrameBufferId = iGenerateFrameBufferId;
        Log.i(TAG, String.format("create frameBufferId: %d, textureId: %d", Integer.valueOf(iGenerateFrameBufferId), Integer.valueOf(this.mTextureId)));
        GLES20.glBindTexture(c.e.F, this.mTextureId);
        GLES20.glBindFramebuffer(36160, this.mFrameBufferId);
        GLES20.glFramebufferTexture2D(36160, 36064, c.e.F, this.mTextureId, 0);
        GLES20.glBindTexture(c.e.F, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public void uninitialize() {
        Log.i(TAG, String.format("destroy frameBufferId: %d, textureId: %d", Integer.valueOf(this.mFrameBufferId), Integer.valueOf(this.mTextureId)));
        OpenGlUtils.deleteTexture(this.mTextureId);
        this.mTextureId = -1;
        OpenGlUtils.deleteFrameBuffer(this.mFrameBufferId);
        this.mFrameBufferId = -1;
    }
}
