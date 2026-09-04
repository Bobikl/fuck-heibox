package com.tencent.ugc.videobase.chain;

import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public abstract class GPUInterceptor {
    private boolean mIsInitialized = false;

    public final void initialize(GLTexturePool gLTexturePool) {
        if (this.mIsInitialized) {
            return;
        }
        onInit(gLTexturePool);
        this.mIsInitialized = true;
    }

    public abstract GLTexture intercept(long j10, GLTexture gLTexture);

    public boolean isInitialized() {
        return this.mIsInitialized;
    }

    protected void onInit(GLTexturePool gLTexturePool) {
    }

    protected void onUninit() {
    }

    public final void uninitialize() {
        if (this.mIsInitialized) {
            onUninit();
            this.mIsInitialized = false;
        }
    }
}
