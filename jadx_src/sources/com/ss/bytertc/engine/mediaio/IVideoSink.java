package com.ss.bytertc.engine.mediaio;

import android.opengl.EGLContext;
import com.ss.bytertc.engine.video.VideoFrame;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public interface IVideoSink {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BufferType {
        public static final int PLANAR = 2;
        public static final int RAWDATA = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PixelFormat {
        public static final int I420 = 1;
    }

    void consumeVideoFrame(VideoFrame videoFrame);

    int getBufferType();

    EGLContext getEGLContextHandle();

    int getPixelFormat();

    int getRenderElapse();

    void onDispose();

    boolean onInitialize();

    boolean onStart();

    void onStop();
}
