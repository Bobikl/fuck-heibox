package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.VideoFrame;

/* JADX INFO: loaded from: classes4.dex */
public class RTCVideoFrameObserver {
    private static final String TAG = "RtcVideoFrameObserver";

    @CalledByNative
    void onLocalScreenFrame(VideoFrame videoFrame) throws Exception {
        try {
            videoFrame.release();
        } catch (Exception e10) {
            e10.printStackTrace();
            throw e10;
        }
    }

    @CalledByNative
    void onLocalVideoFrame(VideoFrame videoFrame) throws Exception {
        try {
            videoFrame.release();
        } catch (Exception e10) {
            e10.printStackTrace();
            throw e10;
        }
    }

    @CalledByNative
    void onMergeFrame(String str, String str2, VideoFrame videoFrame) throws Exception {
        try {
            videoFrame.release();
        } catch (Exception e10) {
            e10.printStackTrace();
            throw e10;
        }
    }

    @CalledByNative
    void onRemoteScreenFrame(String str, String str2, VideoFrame videoFrame) throws Exception {
        try {
            videoFrame.release();
        } catch (Exception e10) {
            e10.printStackTrace();
            throw e10;
        }
    }

    @CalledByNative
    void onRemoteVideoFrame(String str, String str2, VideoFrame videoFrame) throws Exception {
        try {
            videoFrame.release();
        } catch (Exception e10) {
            e10.printStackTrace();
            throw e10;
        }
    }
}
