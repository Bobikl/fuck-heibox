package com.ss.bytertc.engine;

import android.content.Context;
import com.ss.bytertc.engine.data.AudioContentTypeConfig;
import com.ss.bytertc.engine.data.AudioEncodeConfig;
import com.ss.bytertc.engine.data.RTCLogConfig;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.StreamPriority;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandlerEx;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.utils.RTCEglContextChecker;
import com.ss.bytertc.engine.video.VideoFrame;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RTCVideoEx extends RTCVideo {
    private static final String TAG = "RtcVideoEx";

    public static synchronized RTCVideoEx createRTCVideoEx(Context context, String str, IRTCVideoEventHandler iRTCVideoEventHandler, IRTCVideoEventHandlerEx iRTCVideoEventHandlerEx, Object obj, JSONObject jSONObject) {
        if (context != null && str != null) {
            if (RTCVideo.mInstance == null && RTCVideoImpl.initializeNativeLibs()) {
                if (RTCVideo.mInstanceEx == null) {
                    try {
                        RTCVideo.mInstanceEx = new RTCVideoImpl(context, str, iRTCVideoEventHandler, iRTCVideoEventHandlerEx, obj, jSONObject, true, false);
                    } catch (IllegalStateException unused) {
                        return null;
                    }
                }
                return RTCVideo.mInstanceEx;
            }
        }
        return null;
    }

    public static synchronized void destroyRTCVideoEx() {
        RTCVideoImpl rTCVideoImpl = RTCVideo.mInstanceEx;
        if (rTCVideoImpl != null) {
            rTCVideoImpl.doDestroy(false);
            RTCVideo.mInstanceEx = null;
            RTCVideo.mRtcNativeLibraryLoader = null;
            RTCVideo.mRtcEglContextChecker = null;
            System.gc();
        }
    }

    public static String getErrorDescription(int i10) {
        return !RTCVideoImpl.initializeNativeLibs() ? "" : RTCVideoImpl.getErrorDescription(i10);
    }

    public static String getSDKVersion() {
        return !RTCVideoImpl.initializeNativeLibs() ? "" : RTCVideoImpl.getSdkVersion();
    }

    public static int setLogConfig(RTCLogConfig rTCLogConfig) {
        if (RTCVideoImpl.initializeNativeLibs()) {
            return RTCVideoImpl.setLogConfig(rTCLogConfig);
        }
        return -1;
    }

    public static void setRtcEglContextChecker(RTCEglContextChecker rTCEglContextChecker) {
        RTCVideo.setRtcEglContextChecker(rTCEglContextChecker);
    }

    public static void setRtcNativeLibraryLoader(RTCNativeLibraryLoader rTCNativeLibraryLoader) {
        LogUtil.i(TAG, "set rtc native library loader" + rTCNativeLibraryLoader);
        RTCVideo.setRtcNativeLibraryLoader(rTCNativeLibraryLoader);
    }

    public abstract RTCRoomEx createRTCRoomEx(String str);

    public abstract int pushExternalVideoFrame(StreamIndex streamIndex, VideoFrame videoFrame);

    public abstract int setAudioContentType(StreamIndex streamIndex, AudioContentTypeConfig audioContentTypeConfig);

    public abstract int setAudioEncodeConfig(StreamIndex streamIndex, AudioEncodeConfig audioEncodeConfig);

    public abstract int setAudioSourceVolume(StreamIndex streamIndex, int i10);

    public abstract int setCaptureVolume(int i10);

    public abstract int setLocalStreamPriority(StreamIndex streamIndex, StreamPriority streamPriority);

    public abstract int setRemoteAudioPlaybackVolume(StreamKey streamKey, int i10);

    public abstract int setRtcVideoEventHandlerEx(IRTCVideoEventHandlerEx iRTCVideoEventHandlerEx);

    public abstract int setScreenCaptureVolume(int i10);

    public abstract int setVideoCaptureConfig(StreamIndex streamIndex, com.ss.bytertc.engine.video.VideoCaptureConfig videoCaptureConfig);

    public abstract int setVideoSource(StreamIndex streamIndex, InternalVideoSourceConfig internalVideoSourceConfig);

    public abstract int startVideoCapture(StreamIndex streamIndex, String str);

    public abstract int stopVideoCapture(StreamIndex streamIndex);
}
