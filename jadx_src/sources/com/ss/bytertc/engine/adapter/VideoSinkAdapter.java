package com.ss.bytertc.engine.adapter;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.VideoFrame;

/* JADX INFO: loaded from: classes4.dex */
public class VideoSinkAdapter implements IVideoSink {
    private com.ss.bytertc.engine.mediaio.IVideoSink mBridgedOldSink;
    private boolean mDirectPush;
    private boolean mInitialized;
    private IVideoSink mSink;
    private boolean mStarted;
    private VideoSinkTask mVideoSinkTask;

    public VideoSinkAdapter(com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink, VideoSinkTask videoSinkTask) {
        this.mSink = null;
        this.mInitialized = false;
        this.mStarted = false;
        this.mDirectPush = false;
        this.mBridgedOldSink = iVideoSink;
        this.mVideoSinkTask = videoSinkTask;
    }

    public VideoSinkAdapter(IVideoSink iVideoSink) {
        this.mInitialized = false;
        this.mStarted = false;
        this.mDirectPush = false;
        this.mSink = iVideoSink;
    }

    public VideoSinkAdapter(IVideoSink iVideoSink, boolean z10) {
        this.mInitialized = false;
        this.mStarted = false;
        this.mSink = iVideoSink;
        this.mDirectPush = z10;
    }

    @Override // com.ss.bytertc.engine.video.IVideoSink
    @CalledByNative
    public int getRenderElapse() {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            return iVideoSink.getRenderElapse();
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.video.IVideoSink
    public void onFrame(VideoFrame videoFrame) {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            iVideoSink.onFrame(videoFrame);
            return;
        }
        com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink2 = this.mBridgedOldSink;
        if (iVideoSink2 != null) {
            iVideoSink2.consumeVideoFrame(videoFrame);
        }
    }

    @CalledByNative
    void onVideoFrame(VideoFrame videoFrame) {
        if (videoFrame == null) {
            return;
        }
        onFrame(videoFrame);
    }

    @CalledByNative
    public void release() {
        VideoSinkTask videoSinkTask;
        if (this.mBridgedOldSink == null || (videoSinkTask = this.mVideoSinkTask) == null) {
            return;
        }
        videoSinkTask.post(new Runnable() { // from class: com.ss.bytertc.engine.adapter.VideoSinkAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                if (VideoSinkAdapter.this.mBridgedOldSink != null) {
                    VideoSinkAdapter.this.mBridgedOldSink.onStop();
                    VideoSinkAdapter.this.mBridgedOldSink.onDispose();
                }
            }
        });
    }
}
