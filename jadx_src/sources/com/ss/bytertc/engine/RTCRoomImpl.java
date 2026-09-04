package com.ss.bytertc.engine;

import com.ss.bytertc.engine.audio.IRangeAudio;
import com.ss.bytertc.engine.audio.ISpatialAudio;
import com.ss.bytertc.engine.data.ForwardStreamInfo;
import com.ss.bytertc.engine.data.RemoteVideoConfig;
import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandlerEx;
import com.ss.bytertc.engine.handler.RTCRoomEventHandler;
import com.ss.bytertc.engine.handler.RTCRoomEventHandlerEx;
import com.ss.bytertc.engine.type.AudioSelectionPriority;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.MessageConfig;
import com.ss.bytertc.engine.type.PauseResumeControlMediaType;
import com.ss.bytertc.engine.type.SubscribeMediaType;
import com.ss.bytertc.engine.type.SubtitleConfig;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.IPanoramicVideo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class RTCRoomImpl extends RTCRoomEx {
    protected static final String TAG = "RtcRoom";
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    protected long mNativeRtcRoom;
    private final ReentrantReadWriteLock mReadWriteLock;
    private String mRoom;
    private RTCRoomEventHandler mRtcRoomEventHandler;
    private RTCRoomEventHandlerEx mRtcRoomEventHandlerEx;
    private IRTCRoomEventHandler mRtcRoomHandler;
    private IRTCRoomEventHandlerEx mRtcRoomHandlerEx;
    private String mUser;
    private long mNativeRtcRoomEventHandler = 0;
    private long mNativeRtcRoomEventHandlerEx = 0;
    private NativeRangeAudio mRangeAudio = null;
    private NativeSpatialAudio mSpatialAudio = null;
    private NativePanoramicVideo mPanoramicVideo = null;

    public RTCRoomImpl(String str, long j10) {
        this.mNativeRtcRoom = 0L;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeRtcRoom = j10;
        this.mRoom = str;
    }

    public static String getCloudRenderingInfo(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
            jSONObject.put("externalService", "render");
            jSONObject.put("renderMeta", str2);
            return jSONObject.toString();
        } catch (Exception e10) {
            LogUtil.e(TAG, "getCloudRenderingInfo catch exception , e : " + e10.getMessage());
            return null;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public void destroy() {
        LogUtil.d(TAG, "Destroy ");
        this.mJniWriteLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, Destroy failed.");
                this.mJniWriteLock.unlock();
                return;
            }
            this.mNativeRtcRoom = 0L;
            NativeRangeAudio nativeRangeAudio = this.mRangeAudio;
            if (nativeRangeAudio instanceof NativeRangeAudio) {
                nativeRangeAudio.destroy();
            }
            NativeSpatialAudio nativeSpatialAudio = this.mSpatialAudio;
            if (nativeSpatialAudio instanceof NativeSpatialAudio) {
                nativeSpatialAudio.destroy();
            }
            this.mJniWriteLock.unlock();
            NativeRTCRoomFunctions.nativeDestory(j10);
            long j11 = this.mNativeRtcRoomEventHandlerEx;
            if (j11 != 0) {
                NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandlerEx(j11);
                this.mNativeRtcRoomEventHandlerEx = 0L;
            }
            long j12 = this.mNativeRtcRoomEventHandler;
            if (j12 != 0) {
                NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandler(j12);
                this.mNativeRtcRoomEventHandler = 0L;
            }
        } catch (Throwable th2) {
            this.mJniWriteLock.unlock();
            throw th2;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int enableSubscribeLocalStream(boolean z10) {
        int iNativeEnableSubscribeLocalStream;
        LogUtil.d(TAG, "enableSubscribeLocalStream: " + z10);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, EnableSubscribeLocalStream failed.");
                iNativeEnableSubscribeLocalStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableSubscribeLocalStream = NativeRTCRoomFunctions.nativeEnableSubscribeLocalStream(j10, z10);
            }
            return iNativeEnableSubscribeLocalStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long getNativeHandle() {
        return this.mNativeRtcRoom;
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public IPanoramicVideo getPanoramicVideo() {
        LogUtil.d(TAG, "getPanoramicVideo...");
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, getPanoramicVideo failed.");
            } else {
                NativePanoramicVideo nativePanoramicVideo = this.mPanoramicVideo;
                if (nativePanoramicVideo != null) {
                    return nativePanoramicVideo;
                }
                long jNativeGetPanoramicVideo = NativeRTCRoomFunctions.nativeGetPanoramicVideo(j10);
                if (jNativeGetPanoramicVideo != 0) {
                    NativePanoramicVideo nativePanoramicVideo2 = new NativePanoramicVideo(jNativeGetPanoramicVideo);
                    this.mPanoramicVideo = nativePanoramicVideo2;
                    return nativePanoramicVideo2;
                }
                LogUtil.e(TAG, "getPanoramicVideo failed");
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public IRangeAudio getRangeAudio() {
        LogUtil.d(TAG, "getRangeAudio...");
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, getRangeAudio failed.");
            } else {
                NativeRangeAudio nativeRangeAudio = this.mRangeAudio;
                if (nativeRangeAudio != null) {
                    return nativeRangeAudio;
                }
                long jNativeGetRangeAudio = NativeRTCRoomFunctions.nativeGetRangeAudio(j10);
                if (jNativeGetRangeAudio != 0) {
                    NativeRangeAudio nativeRangeAudio2 = new NativeRangeAudio(jNativeGetRangeAudio);
                    this.mRangeAudio = nativeRangeAudio2;
                    return nativeRangeAudio2;
                }
                LogUtil.e(TAG, "getRangeAudio failed");
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public String getRoomId() {
        String strNativeGetRoomId;
        LogUtil.d(TAG, "getRoomId");
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, getRoomId failed.");
                strNativeGetRoomId = "";
            } else {
                strNativeGetRoomId = NativeRTCRoomFunctions.nativeGetRoomId(j10);
            }
            return strNativeGetRoomId;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public IRTCRoomEventHandler getRtcRoomHandler() {
        return this.mRtcRoomHandler;
    }

    public IRTCRoomEventHandlerEx getRtcRoomHandlerEx() {
        return this.mRtcRoomHandlerEx;
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public ISpatialAudio getSpatialAudio() {
        LogUtil.d(TAG, "getSpatialAudio...");
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, getSpatialAudio failed.");
            } else {
                NativeSpatialAudio nativeSpatialAudio = this.mSpatialAudio;
                if (nativeSpatialAudio != null) {
                    return nativeSpatialAudio;
                }
                long jNativeGetSpatialAudio = NativeRTCRoomFunctions.nativeGetSpatialAudio(j10);
                if (jNativeGetSpatialAudio != 0) {
                    NativeSpatialAudio nativeSpatialAudio2 = new NativeSpatialAudio(jNativeGetSpatialAudio);
                    this.mSpatialAudio = nativeSpatialAudio2;
                    return nativeSpatialAudio2;
                }
                LogUtil.e(TAG, "getSpatialAudio failed");
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public String getmRoom() {
        return this.mRoom;
    }

    public String getmUser() {
        return this.mUser;
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int joinRoom(String str, UserInfo userInfo, RTCRoomConfig rTCRoomConfig) {
        int iNativeJoinRoomWithRoomConfig;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("joinRoom with token: ");
        sb2.append(str);
        sb2.append(",room");
        sb2.append(this.mRoom);
        sb2.append(" and uid: ");
        sb2.append(userInfo == null ? "" : userInfo.getUid());
        LogUtil.d(TAG, sb2.toString());
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e(TAG, "native room is invalid, joinRoom failed.");
                iNativeJoinRoomWithRoomConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (userInfo == null || str == null) {
                iNativeJoinRoomWithRoomConfig = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                this.mUser = userInfo.getUid();
                iNativeJoinRoomWithRoomConfig = NativeRTCRoomFunctions.nativeJoinRoomWithRoomConfig(this.mNativeRtcRoom, str, userInfo, rTCRoomConfig);
            }
            return iNativeJoinRoomWithRoomConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int leaveRoom() {
        int iNativeLeaveRoom;
        LogUtil.d(TAG, "leaveChannel");
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, leaveChannel failed.");
                iNativeLeaveRoom = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mRoom = "";
                this.mUser = "";
                iNativeLeaveRoom = NativeRTCRoomFunctions.nativeLeaveRoom(j10);
            }
            return iNativeLeaveRoom;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int pauseAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType) {
        int iNativePauseAllSubscribedStream;
        LogUtil.d(TAG, "pauseAllSubscribedStream...");
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, pauseAllSubscribedStream failed.");
                iNativePauseAllSubscribedStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePauseAllSubscribedStream = NativeRTCRoomFunctions.nativePauseAllSubscribedStream(j10, pauseResumeControlMediaType.value());
            }
            return iNativePauseAllSubscribedStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int pauseForwardStreamToAllRooms() {
        int iNativePauseForwardStreamToAllRooms;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, pauseForwardStreamToAllRooms failed.");
                iNativePauseForwardStreamToAllRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePauseForwardStreamToAllRooms = NativeRTCRoomFunctions.nativePauseForwardStreamToAllRooms(j10);
            }
            return iNativePauseForwardStreamToAllRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int publishScreen(MediaStreamType mediaStreamType) {
        int iNativePublishScreenWithMediaStreamType;
        LogUtil.d(TAG, "publishScreen");
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, publishScreen failed.");
                iNativePublishScreenWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePublishScreenWithMediaStreamType = NativeRTCRoomFunctions.nativePublishScreenWithMediaStreamType(j10, mediaStreamType.value);
            }
            return iNativePublishScreenWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoomEx
    public int publishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        int iNativePublishStreamEx;
        LogUtil.d(TAG, "publishStream: " + streamIndex);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, publishStream failed.\"");
                iNativePublishStreamEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePublishStreamEx = NativeRTCRoomFunctions.nativePublishStreamEx(j10, streamIndex.value(), mediaStreamType.value);
            }
            return iNativePublishStreamEx;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int publishStream(MediaStreamType mediaStreamType) {
        int iNativePublishStream;
        LogUtil.d(TAG, "publishStream");
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, publishStream failed.\"");
                iNativePublishStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePublishStream = NativeRTCRoomFunctions.nativePublishStream(j10, mediaStreamType.value);
            }
            return iNativePublishStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int resumeAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType) {
        int iNativeResumeAllSubscribedStream;
        LogUtil.d(TAG, "resumeAllSubscribedStream...");
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, resumeAllSubscribedStream failed.");
                iNativeResumeAllSubscribedStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeResumeAllSubscribedStream = NativeRTCRoomFunctions.nativeResumeAllSubscribedStream(j10, pauseResumeControlMediaType.value());
            }
            return iNativeResumeAllSubscribedStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int resumeForwardStreamToAllRooms() {
        int iNativeResumeForwardStreamToAllRooms;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, resumeForwardStreamToAllRooms failed.");
                iNativeResumeForwardStreamToAllRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeResumeForwardStreamToAllRooms = NativeRTCRoomFunctions.nativeResumeForwardStreamToAllRooms(j10);
            }
            return iNativeResumeForwardStreamToAllRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public long sendRoomBinaryMessage(byte[] bArr) {
        long jNativeSendRoomBinaryMessage;
        LogUtil.d(TAG, "SendRoomBinaryMessage ");
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, SendRoomBinaryMessage failed.");
                jNativeSendRoomBinaryMessage = -1;
            } else {
                jNativeSendRoomBinaryMessage = NativeRTCRoomFunctions.nativeSendRoomBinaryMessage(j10, bArr);
            }
            return jNativeSendRoomBinaryMessage;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public long sendRoomMessage(String str) {
        long jNativeSendRoomMessage;
        LogUtil.d(TAG, "SendRoomMessage ");
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, SendRoomMessage failed.");
                jNativeSendRoomMessage = -1;
            } else {
                jNativeSendRoomMessage = NativeRTCRoomFunctions.nativeSendRoomMessage(j10, str);
            }
            return jNativeSendRoomMessage;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public long sendUserBinaryMessage(String str, byte[] bArr, MessageConfig messageConfig) {
        long jNativeSendUserBinaryMessage;
        LogUtil.d(TAG, "SendUserBinaryMessage. uid : " + str + ", message length:" + bArr.length);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, SendUserBinaryMessage failed.");
                jNativeSendUserBinaryMessage = -1;
            } else {
                jNativeSendUserBinaryMessage = NativeRTCRoomFunctions.nativeSendUserBinaryMessage(j10, str, bArr, messageConfig.value());
            }
            return jNativeSendUserBinaryMessage;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public long sendUserMessage(String str, String str2, MessageConfig messageConfig) {
        long jNativeSendUserMessage;
        LogUtil.d(TAG, "SendUserMessage. uid : " + str + ", message" + str2);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, SendUserMessage failed.");
                jNativeSendUserMessage = -1;
            } else {
                jNativeSendUserMessage = NativeRTCRoomFunctions.nativeSendUserMessage(j10, str, str2, messageConfig.value());
            }
            return jNativeSendUserMessage;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int setAudioSelectionConfig(AudioSelectionPriority audioSelectionPriority) {
        int iNativeSetAudioSelectionConfig;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, setAudioSelectionConfig failed.");
                iNativeSetAudioSelectionConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioSelectionConfig = NativeRTCRoomFunctions.nativeSetAudioSelectionConfig(j10, audioSelectionPriority.value());
            }
            return iNativeSetAudioSelectionConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int setMultiDeviceAVSync(String str) {
        int iNativeSetMultiDeviceAVSync;
        LogUtil.d(TAG, "setMultiDeviceAVSync ");
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, setMultiDeviceAVSync failed.");
                iNativeSetMultiDeviceAVSync = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetMultiDeviceAVSync = NativeRTCRoomFunctions.nativeSetMultiDeviceAVSync(j10, str);
            }
            return iNativeSetMultiDeviceAVSync;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e(TAG, "native room is invalid, setRTCRoomEventHandler failed.");
                return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            }
            this.mRtcRoomHandler = iRTCRoomEventHandler;
            RTCRoomEventHandler rTCRoomEventHandler = new RTCRoomEventHandler(this);
            this.mRtcRoomEventHandler = rTCRoomEventHandler;
            long j10 = this.mNativeRtcRoomEventHandler;
            this.mNativeRtcRoomEventHandler = NativeRTCRoomFunctions.nativeSetRTCRoomEventHandler(this.mNativeRtcRoom, rTCRoomEventHandler);
            if (j10 != 0) {
                NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandler(j10);
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoomEx
    public int setRTCRoomEventHandlerEx(IRTCRoomEventHandlerEx iRTCRoomEventHandlerEx) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e(TAG, "native room is invalid, setRTCRoomEventHandler failed.");
                return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            }
            this.mRtcRoomHandlerEx = iRTCRoomEventHandlerEx;
            RTCRoomEventHandlerEx rTCRoomEventHandlerEx = new RTCRoomEventHandlerEx(this);
            this.mRtcRoomEventHandlerEx = rTCRoomEventHandlerEx;
            long j10 = this.mNativeRtcRoomEventHandlerEx;
            this.mNativeRtcRoomEventHandlerEx = NativeRTCRoomFunctions.nativeSetRTCRoomEventHandlerEx(this.mNativeRtcRoom, rTCRoomEventHandlerEx);
            if (j10 != 0) {
                NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandlerEx(j10);
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int setRemoteRoomAudioPlaybackVolume(int i10) {
        int iNativeSetRemoteRoomAudioPlaybackVolume;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, setRemoteRoomAudioPlaybackVolume failed.");
                iNativeSetRemoteRoomAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteRoomAudioPlaybackVolume = NativeRTCRoomFunctions.nativeSetRemoteRoomAudioPlaybackVolume(j10, i10);
            }
            return iNativeSetRemoteRoomAudioPlaybackVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int setRemoteVideoConfig(String str, RemoteVideoConfig remoteVideoConfig) {
        int iNativeSetRemoteVideoConfig;
        LogUtil.d(TAG, "setRemoteVideoConfig");
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid,setRemoteVideoConfig failed.\"");
                iNativeSetRemoteVideoConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteVideoConfig = NativeRTCRoomFunctions.nativeSetRemoteVideoConfig(j10, str, remoteVideoConfig.getWidth(), remoteVideoConfig.getHeight(), remoteVideoConfig.getFrameRate());
            }
            return iNativeSetRemoteVideoConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoomEx
    public int setRemoteVideoConfig(String str, StreamIndex streamIndex, RemoteVideoConfig remoteVideoConfig) {
        int iNativeSetRemoteVideoConfigEx;
        LogUtil.d(TAG, "setRemoteVideoConfig: userId: " + str + ", streamIndex: " + streamIndex);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, setRemoteVideoConfig failed.\"");
                iNativeSetRemoteVideoConfigEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteVideoConfigEx = NativeRTCRoomFunctions.nativeSetRemoteVideoConfigEx(j10, str, streamIndex.value(), remoteVideoConfig.getWidth(), remoteVideoConfig.getHeight(), remoteVideoConfig.getFrameRate());
            }
            return iNativeSetRemoteVideoConfigEx;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public long setRoomExtraInfo(String str, String str2) {
        long jNativeSetRoomExtraInfo;
        this.mJniReadLock.lock();
        if (str == null) {
            jNativeSetRoomExtraInfo = -2;
        } else if (str2 == null) {
            jNativeSetRoomExtraInfo = -3;
        } else {
            try {
                LogUtil.d(TAG, "setRoomExtraInfo,key : " + str + ", value" + str2);
                long j10 = this.mNativeRtcRoom;
                if (j10 == 0) {
                    LogUtil.e(TAG, "native rtcroom is invalid, setRoomExtraInfo failed.");
                    jNativeSetRoomExtraInfo = -1;
                } else {
                    jNativeSetRoomExtraInfo = NativeRTCRoomFunctions.nativeSetRoomExtraInfo(j10, str, str2);
                }
            } finally {
                this.mJniReadLock.unlock();
            }
        }
        return jNativeSetRoomExtraInfo;
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int setUserVisibility(boolean z10) {
        int iNativeSetUserVisibility;
        LogUtil.d(TAG, "setUserVisibility. enable : " + z10);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native engine is invalid, setUserVisibility failed.");
                iNativeSetUserVisibility = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetUserVisibility = NativeRTCRoomFunctions.nativeSetUserVisibility(j10, z10);
            }
            return iNativeSetUserVisibility;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int startCloudRendering(String str) {
        int iNativeUpdateCloudRending;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, startCloudRendering failed.");
                iNativeUpdateCloudRending = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                String cloudRenderingInfo = getCloudRenderingInfo("started", str);
                iNativeUpdateCloudRending = cloudRenderingInfo == null ? -1 : NativeRTCRoomFunctions.nativeUpdateCloudRending(this.mNativeRtcRoom, cloudRenderingInfo);
            }
            return iNativeUpdateCloudRending;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int startForwardStreamToRooms(List<ForwardStreamInfo> list) {
        int iNativeStartForwardStreamToRooms;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, startForwardStreamToRooms failed.");
                iNativeStartForwardStreamToRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (list == null) {
                iNativeStartForwardStreamToRooms = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                LinkedList linkedList = new LinkedList();
                Iterator<ForwardStreamInfo> it = list.iterator();
                while (it.hasNext()) {
                    linkedList.add(new InternalForwardStreamInfo(it.next()));
                }
                iNativeStartForwardStreamToRooms = NativeRTCRoomFunctions.nativeStartForwardStreamToRooms(this.mNativeRtcRoom, linkedList);
            }
            return iNativeStartForwardStreamToRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int startSubtitle(SubtitleConfig subtitleConfig) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            LogUtil.d(TAG, "startSubtitle");
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0 || subtitleConfig == null) {
                LogUtil.e(TAG, "native rtcroom or config is invalid, startSubtitle failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCRoomFunctions.nativeStartSubtitle(j10, subtitleConfig.mode.value(), subtitleConfig.targetLanguage);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int stopCloudRendering() {
        int iNativeUpdateCloudRending;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, stopCloudRendering failed.");
                iNativeUpdateCloudRending = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                String cloudRenderingInfo = getCloudRenderingInfo("stopped", "");
                iNativeUpdateCloudRending = cloudRenderingInfo == null ? -1 : NativeRTCRoomFunctions.nativeUpdateCloudRending(this.mNativeRtcRoom, cloudRenderingInfo);
            }
            return iNativeUpdateCloudRending;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int stopForwardStreamToRooms() {
        int iNativeStopForwardStreamToRooms;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, stopForwardStreamToRooms failed.");
                iNativeStopForwardStreamToRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopForwardStreamToRooms = NativeRTCRoomFunctions.nativeStopForwardStreamToRooms(j10);
            }
            return iNativeStopForwardStreamToRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int stopSubtitle() {
        int iNativeStopSubtitle;
        this.mJniReadLock.lock();
        try {
            LogUtil.d(TAG, "stopSubtitle");
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, stopSubtitle failed.");
                iNativeStopSubtitle = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopSubtitle = NativeRTCRoomFunctions.nativeStopSubtitle(j10);
            }
            return iNativeStopSubtitle;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int subscribeAllStreams(MediaStreamType mediaStreamType) {
        int iNativeSubscribeAllStreamsWithMediaStreamType;
        LogUtil.d(TAG, "subscribeStream, MediaStreamType:" + mediaStreamType);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native engine is invalid, subscribeAllStreams failed.");
                iNativeSubscribeAllStreamsWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeAllStreamsWithMediaStreamType = NativeRTCRoomFunctions.nativeSubscribeAllStreamsWithMediaStreamType(j10, mediaStreamType.value);
            }
            return iNativeSubscribeAllStreamsWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int subscribeScreen(String str, MediaStreamType mediaStreamType) {
        int iNativeSubscribeScreenWithMediaStreamType;
        LogUtil.d(TAG, "subscribeScreen: " + str + ", MediaStreamType:" + mediaStreamType);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native engine is invalid, subscribeScreen failed.");
                iNativeSubscribeScreenWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeScreenWithMediaStreamType = NativeRTCRoomFunctions.nativeSubscribeScreenWithMediaStreamType(j10, str, mediaStreamType.value);
            }
            return iNativeSubscribeScreenWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoomEx
    public int subscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        int iNativeSubscribeStreamEx;
        LogUtil.d(TAG, "subscribeStream: userId: " + str + ", streamIndex: " + streamIndex);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, subscribeStream failed.\"");
                iNativeSubscribeStreamEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeStreamEx = NativeRTCRoomFunctions.nativeSubscribeStreamEx(j10, str, streamIndex.value(), mediaStreamType.value);
            }
            return iNativeSubscribeStreamEx;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int subscribeStream(String str, MediaStreamType mediaStreamType) {
        int iNativeSubscribeStreamWithMediaStreamType;
        LogUtil.d(TAG, "subscribeStream: " + str + ", MediaStreamType:" + mediaStreamType);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native engine is invalid, subscribeStream failed.");
                iNativeSubscribeStreamWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeStreamWithMediaStreamType = NativeRTCRoomFunctions.nativeSubscribeStreamWithMediaStreamType(j10, str, mediaStreamType.value);
            }
            return iNativeSubscribeStreamWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int subscribeUserStream(String str, StreamIndex streamIndex, SubscribeMediaType subscribeMediaType, SubscribeVideoConfig subscribeVideoConfig) {
        int iNativeSubscribeUserStream;
        this.mJniReadLock.lock();
        try {
            boolean z10 = streamIndex == StreamIndex.STREAM_INDEX_SCREEN;
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native engine is invalid, subscribeStream failed.");
                iNativeSubscribeUserStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeUserStream = subscribeVideoConfig != null ? NativeRTCRoomFunctions.nativeSubscribeUserStream(j10, str, z10, subscribeMediaType.value(), subscribeVideoConfig.getVideoIndex(), subscribeVideoConfig.getPriority()) : ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            }
            return iNativeSubscribeUserStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int unpublishScreen(MediaStreamType mediaStreamType) {
        int iNativeUnpublishScreenWithMediaStreamType;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, unpublishScreen failed.");
                iNativeUnpublishScreenWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnpublishScreenWithMediaStreamType = NativeRTCRoomFunctions.nativeUnpublishScreenWithMediaStreamType(j10, mediaStreamType.value);
            }
            return iNativeUnpublishScreenWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoomEx
    public int unpublishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        int iNativeUnpublishStreamEx;
        LogUtil.d(TAG, "unpublishStream: " + streamIndex);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, unpublishStream failed.\"");
                iNativeUnpublishStreamEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnpublishStreamEx = NativeRTCRoomFunctions.nativeUnpublishStreamEx(j10, streamIndex.value(), mediaStreamType.value);
            }
            return iNativeUnpublishStreamEx;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int unpublishStream(MediaStreamType mediaStreamType) {
        int iNativeUnpublishStream;
        LogUtil.d(TAG, "unpublishStream");
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native unpublishStream is invalid");
                iNativeUnpublishStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnpublishStream = NativeRTCRoomFunctions.nativeUnpublishStream(j10, mediaStreamType.value);
            }
            return iNativeUnpublishStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int unsubscribeAllStreams(MediaStreamType mediaStreamType) {
        int iNativeUnsubscribeAllStreamsWithMediaStreamType;
        LogUtil.d(TAG, "unsubscribeAllStreams MediaStreamType:" + mediaStreamType);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native engine is invalid, subscribeStream failed.");
                iNativeUnsubscribeAllStreamsWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnsubscribeAllStreamsWithMediaStreamType = NativeRTCRoomFunctions.nativeUnsubscribeAllStreamsWithMediaStreamType(j10, mediaStreamType.value);
            }
            return iNativeUnsubscribeAllStreamsWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int unsubscribeScreen(String str, MediaStreamType mediaStreamType) {
        int iNativeUnsubscribeScreenWithMediaStreamType;
        LogUtil.d(TAG, "unsubscribeScreen: " + str + ", MediaStreamType:" + mediaStreamType);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native engine is invalid, subscribeStream failed.");
                iNativeUnsubscribeScreenWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnsubscribeScreenWithMediaStreamType = NativeRTCRoomFunctions.nativeUnsubscribeScreenWithMediaStreamType(j10, str, mediaStreamType.value);
            }
            return iNativeUnsubscribeScreenWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoomEx
    public int unsubscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        int iNativeUnsubscribeStreamEx;
        LogUtil.d(TAG, "unsubscribeStream: userId: " + str + ", streamIndex: " + streamIndex);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, unsubscribeStream failed.\"");
                iNativeUnsubscribeStreamEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnsubscribeStreamEx = NativeRTCRoomFunctions.nativeUnsubscribeStreamEx(j10, str, streamIndex.value(), mediaStreamType.value);
            }
            return iNativeUnsubscribeStreamEx;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int unsubscribeStream(String str, MediaStreamType mediaStreamType) {
        int iNativeUnsubscribeStreamWithMediaStreamType;
        LogUtil.d(TAG, "unsubscribeStream: " + str + ", MediaStreamType:" + mediaStreamType);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native engine is invalid, subscribeStream failed.");
                iNativeUnsubscribeStreamWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnsubscribeStreamWithMediaStreamType = NativeRTCRoomFunctions.nativeUnsubscribeStreamWithMediaStreamType(j10, str, mediaStreamType.value);
            }
            return iNativeUnsubscribeStreamWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int updateCloudRendering(String str) {
        int iNativeUpdateCloudRending;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, updateCloudRendering failed.");
                iNativeUpdateCloudRending = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                String cloudRenderingInfo = getCloudRenderingInfo("changed", str);
                iNativeUpdateCloudRending = cloudRenderingInfo == null ? -1 : NativeRTCRoomFunctions.nativeUpdateCloudRending(this.mNativeRtcRoom, cloudRenderingInfo);
            }
            return iNativeUpdateCloudRending;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int updateForwardStreamToRooms(List<ForwardStreamInfo> list) {
        int iNativeUpdateForwardStreamToRooms;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, updateForwardStreamToRooms failed.");
                iNativeUpdateForwardStreamToRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (list == null) {
                iNativeUpdateForwardStreamToRooms = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                LinkedList linkedList = new LinkedList();
                Iterator<ForwardStreamInfo> it = list.iterator();
                while (it.hasNext()) {
                    linkedList.add(new InternalForwardStreamInfo(it.next()));
                }
                iNativeUpdateForwardStreamToRooms = NativeRTCRoomFunctions.nativeUpdateForwardStreamToRooms(this.mNativeRtcRoom, linkedList);
            }
            return iNativeUpdateForwardStreamToRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int updateToken(String str) {
        int iNativeUpdateToken;
        LogUtil.d(TAG, "updateToken. token : " + str);
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeRtcRoom;
            if (j10 == 0) {
                LogUtil.e(TAG, "native rtcroom is invalid, updateToken failed.");
                iNativeUpdateToken = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUpdateToken = NativeRTCRoomFunctions.nativeUpdateToken(j10, str);
            }
            return iNativeUpdateToken;
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
