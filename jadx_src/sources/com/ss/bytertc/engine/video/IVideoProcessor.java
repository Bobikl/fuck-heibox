package com.ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IVideoProcessor {
    public void onGLEnvInitiated() {
    }

    public void onGLEnvRelease() {
    }

    public abstract VideoFrame processVideoFrame(VideoFrame videoFrame);
}
