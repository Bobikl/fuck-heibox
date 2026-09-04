package com.ss.bytertc.engine.meeting;

import android.view.Surface;
import com.ss.bytertc.engine.InternalVideoEncoderConfig;
import com.ss.bytertc.engine.NativeRTCVideoFunctions;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.RTCRoomImpl;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.SubscribeVideoBaseline;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.type.SubscribeMode;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.IAmazingEffect;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MeetingAdvance {
    protected static final String TAG = "MeetingAdvance";
    private static Method mGetAmazingEffectMethod;
    private static Method mGetNativeMethod;
    private static Method mGetNativeVideoMethod;

    public static int enableAutoSubscribe(RTCRoom rTCRoom, SubscribeMode subscribeMode, SubscribeMode subscribeMode2) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle > 0) {
            return NativeRTCVideoFunctions.nativeEnableAutoSubscribe(nativeRoomHandle, subscribeMode.value(), subscribeMode2.value());
        }
        LogUtil.e(TAG, "room native handle is invalid, enableAutoSubscribe failed.");
        return -1;
    }

    public static int enableRescaleAudioVolume(RTCRoom rTCRoom, boolean z10) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle != 0) {
            return NativeRTCVideoFunctions.nativeEenableRescaleAudioVolume(nativeRoomHandle, z10);
        }
        LogUtil.e(TAG, "room native handle is invalid, enableRescaleAudioVolume failed.");
        return -1;
    }

    public static IAmazingEffect getAmazingEffectInterface(RTCVideo rTCVideo) {
        if (mGetAmazingEffectMethod == null) {
            try {
                mGetAmazingEffectMethod = Class.forName("com.ss.bytertc.engine.engineimpl.RTCVideoImpl").getMethod("getAmazingEffectInterface", new Class[0]);
            } catch (Exception unused) {
                LogUtil.e(TAG, "fail to find method getAmazingEffectInterface");
            }
        }
        Method method = mGetAmazingEffectMethod;
        if (method == null) {
            return null;
        }
        try {
            return (IAmazingEffect) method.invoke(rTCVideo, new Object[0]);
        } catch (Exception unused2) {
            LogUtil.e(TAG, "fail to invoke method getAmazingEffectInterface");
            return null;
        }
    }

    public static int getDownlinkNetworkBandwidthEstimationStatus(RTCRoom rTCRoom) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle > 0) {
            return NativeRTCVideoFunctions.nativeGetDownlinkNetworkBandwidthEstimationStatus(nativeRoomHandle);
        }
        LogUtil.e(TAG, "room native handle is invalid, getUplinkNetworkBandwidthEstimationStatus failed.");
        return -1;
    }

    private static long getNativeRoomHandle(RTCRoom rTCRoom) {
        if (mGetNativeMethod == null) {
            try {
                mGetNativeMethod = RTCRoomImpl.class.getMethod("getNativeHandle", new Class[0]);
            } catch (Exception unused) {
                LogUtil.e(TAG, "fail to find method getNativeHandle");
            }
        }
        Method method = mGetNativeMethod;
        if (method == null) {
            return 0L;
        }
        try {
            return ((Long) method.invoke(rTCRoom, new Object[0])).longValue();
        } catch (Exception unused2) {
            LogUtil.e(TAG, "fail to invoke method getNativeHandle");
            return 0L;
        }
    }

    private static long getNativeVideoHandle(RTCVideo rTCVideo) {
        if (mGetNativeVideoMethod == null) {
            try {
                mGetNativeVideoMethod = Class.forName("com.ss.bytertc.engine.engineimpl.RTCVideoImpl").getMethod("getNativeHandle", new Class[0]);
            } catch (Exception unused) {
                LogUtil.e(TAG, "fail to find method getNativeHandle");
            }
        }
        Method method = mGetNativeVideoMethod;
        if (method == null) {
            return 0L;
        }
        try {
            return ((Long) method.invoke(rTCVideo, new Object[0])).longValue();
        } catch (Exception unused2) {
            LogUtil.e(TAG, "fail to invoke method getNativeHandle");
            return 0L;
        }
    }

    public static int getUplinkNetworkBandwidthEstimationStatus(RTCRoom rTCRoom) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle > 0) {
            return NativeRTCVideoFunctions.nativeGetUplinkNetworkBandwidthEstimationStatus(nativeRoomHandle);
        }
        LogUtil.e(TAG, "room native handle is invalid, getUplinkNetworkBandwidthEstimationStatus failed.");
        return -1;
    }

    public static boolean isStreamUnpublished(RTCRoom rTCRoom, int i10) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle != 0) {
            return NativeRTCVideoFunctions.nativeIsStreamUnpublished(nativeRoomHandle, i10);
        }
        LogUtil.e(TAG, "room native handle is invalid, isStreamUnpublished failed.");
        return false;
    }

    public static void resetScreenVideoConfigs(RTCVideo rTCVideo) {
        long nativeVideoHandle = getNativeVideoHandle(rTCVideo);
        if (nativeVideoHandle == 0) {
            LogUtil.e(TAG, "video native handle is invalid, resetScreenVideoConfigs failed.");
        } else {
            NativeRTCVideoFunctions.nativeResetScreenVideoConfigs(nativeVideoHandle);
        }
    }

    public static void setExternalSurface(RTCVideo rTCVideo, RemoteStreamKey remoteStreamKey, Surface surface) {
        long nativeVideoHandle = getNativeVideoHandle(rTCVideo);
        if (nativeVideoHandle == 0) {
            LogUtil.e(TAG, "room native handle is invalid, setExternalSurface failed.");
            return;
        }
        LogUtil.i(TAG, "setExternalSurface, roomId:" + remoteStreamKey.roomId + ", userId: " + remoteStreamKey.userId + ", index: " + remoteStreamKey.streamIndex + ", externalSurface:" + surface);
        NativeRTCVideoFunctions.nativeSetExternalSurface(nativeVideoHandle, remoteStreamKey.roomId, remoteStreamKey.userId, remoteStreamKey.streamIndex.value(), surface);
    }

    public static int setPublishChannel(RTCRoom rTCRoom, String str) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle != 0) {
            return NativeRTCVideoFunctions.nativeSetPublishChannel(nativeRoomHandle, str);
        }
        LogUtil.e(TAG, "room native handle is invalid, setPublishChannel failed.");
        return -1;
    }

    public static int setPublishSpecialStream(RTCRoom rTCRoom, int i10) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle != 0) {
            return NativeRTCVideoFunctions.nativeSetPublishSpecialStream(nativeRoomHandle, i10);
        }
        LogUtil.e(TAG, "room native handle is invalid, setPublishSpecialStream failed.");
        return -1;
    }

    public static void setScreenVideoConfigs(RTCVideo rTCVideo) {
        long nativeVideoHandle = getNativeVideoHandle(rTCVideo);
        if (nativeVideoHandle == 0) {
            LogUtil.e(TAG, "video native handle is invalid, setScreenVideoConfigs failed.");
        } else {
            NativeRTCVideoFunctions.nativeSetScreenVideoConfigs(nativeVideoHandle);
        }
    }

    public static void setSubscribeBaselineData(RTCRoom rTCRoom, String str, boolean z10, SubscribeVideoBaseline subscribeVideoBaseline) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle == 0) {
            LogUtil.e(TAG, "room native handle is invalid, setSubscribeBaselineData failed.");
        } else {
            NativeRTCVideoFunctions.nativeSetSubscribeBaselineData(nativeRoomHandle, str, z10, subscribeVideoBaseline);
        }
    }

    public static int setSubscribeChannels(RTCRoom rTCRoom, String[] strArr, boolean z10) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle != 0) {
            return NativeRTCVideoFunctions.nativeSetSubscribeChannels(nativeRoomHandle, strArr, z10);
        }
        LogUtil.e(TAG, "room native handle is invalid, setSubscribeChannels failed.");
        return -1;
    }

    public static int setSubscribeSpecialStream(RTCRoom rTCRoom, int[] iArr) {
        long nativeRoomHandle = getNativeRoomHandle(rTCRoom);
        if (nativeRoomHandle != 0) {
            return NativeRTCVideoFunctions.nativeSetSubscribeSpecialStream(nativeRoomHandle, iArr);
        }
        LogUtil.e(TAG, "room native handle is invalid, setSubscribeSpecialStream failed.");
        return -1;
    }

    public static int setVideoEncoderConfig(RTCVideo rTCVideo, List<VideoEncoderConfig> list, List<VideoEncoderConfig> list2) {
        LogUtil.d(TAG, "setVideoEncoderConfig ");
        long nativeVideoHandle = getNativeVideoHandle(rTCVideo);
        if (nativeVideoHandle == 0) {
            LogUtil.e(TAG, "room native handle is invalid, isMuteLocalVideo failed.");
            return -1;
        }
        if (list == null) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoEncoderConfig videoEncoderConfig : list) {
            if (!videoEncoderConfig.isValid()) {
                LogUtil.e(TAG, "setVideoEncoderConfig with illegal params");
                return -1;
            }
            arrayList.add(new InternalVideoEncoderConfig(videoEncoderConfig));
        }
        if (list2 == null) {
            return NativeRTCVideoFunctions.nativeSetVideoEncoderConfigWithMain(nativeVideoHandle, arrayList, null);
        }
        ArrayList arrayList2 = new ArrayList();
        for (VideoEncoderConfig videoEncoderConfig2 : list2) {
            if (!videoEncoderConfig2.isValid()) {
                LogUtil.e(TAG, "setVideoEncoderConfig with illegal params");
                return -1;
            }
            arrayList2.add(new InternalVideoEncoderConfig(videoEncoderConfig2));
        }
        return NativeRTCVideoFunctions.nativeSetVideoEncoderConfigWithMain(nativeVideoHandle, arrayList, arrayList2);
    }

    public static void writeLog(String str, int i10, String str2, String str3, String str4) {
        NativeRTCVideoFunctions.nativeWriteLog(str, i10, str2, str3, str4);
    }
}
