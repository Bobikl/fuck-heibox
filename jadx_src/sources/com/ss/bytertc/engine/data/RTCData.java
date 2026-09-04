package com.ss.bytertc.engine.data;

import android.util.Pair;
import bb.c;
import com.ss.bytertc.engine.VideoStreamDescription;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.VideoEncoderConfiguration;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class RTCData {
    private static final String TAG = "RTCData";
    private VideoEncoderConfiguration.OrientationMode mOrientationMode;
    private VideoStreamDescription[] videoStreamDescriptions = new VideoStreamDescription[1];

    public static class SingletonHelper {
        private static final RTCData INSTANCE = new RTCData();

        private SingletonHelper() {
        }
    }

    public RTCData() {
        VideoStreamDescription videoStreamDescription = new VideoStreamDescription();
        videoStreamDescription.videoSize = new Pair<>(Integer.valueOf(c.b.f30883q9), 360);
        videoStreamDescription.frameRate = 20;
        videoStreamDescription.maxKbps = 600;
        this.videoStreamDescriptions[0] = videoStreamDescription;
        this.mOrientationMode = VideoEncoderConfiguration.OrientationMode.ORIENTATION_MODE_ADAPTIVE;
    }

    public static RTCData instance() {
        return SingletonHelper.INSTANCE;
    }

    public VideoEncoderConfiguration.OrientationMode getOrientationMode() {
        return this.mOrientationMode;
    }

    public VideoStreamDescription[] getVideoStreamDescriptions() {
        return this.videoStreamDescriptions;
    }

    public void setOrientationMode(VideoEncoderConfiguration.OrientationMode orientationMode) {
        this.mOrientationMode = orientationMode;
    }

    public void setVideoStreamDescriptions(VideoStreamDescription[] videoStreamDescriptionArr) {
        LogUtil.i(TAG, "setVideoStreamDescriptions: " + Arrays.toString(videoStreamDescriptionArr));
        this.videoStreamDescriptions = videoStreamDescriptionArr;
    }
}
