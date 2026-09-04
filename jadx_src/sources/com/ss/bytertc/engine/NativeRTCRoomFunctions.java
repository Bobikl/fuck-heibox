package com.ss.bytertc.engine;

import com.ss.bytertc.engine.handler.RTCRoomEventHandler;
import com.ss.bytertc.engine.handler.RTCRoomEventHandlerEx;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class NativeRTCRoomFunctions {
    public static native void nativeDestory(long j10);

    public static native int nativeEnableSubscribeLocalStream(long j10, boolean z10);

    public static native long nativeGetPanoramicVideo(long j10);

    public static native long nativeGetRangeAudio(long j10);

    public static native String nativeGetRoomId(long j10);

    public static native long nativeGetSpatialAudio(long j10);

    public static native int nativeJoinRoomWithRoomConfig(long j10, String str, UserInfo userInfo, RTCRoomConfig rTCRoomConfig);

    public static native int nativeLeaveRoom(long j10);

    public static native int nativePauseAllSubscribedStream(long j10, int i10);

    public static native int nativePauseForwardStreamToAllRooms(long j10);

    public static native int nativePublishScreenWithMediaStreamType(long j10, int i10);

    public static native int nativePublishStream(long j10, int i10);

    public static native int nativePublishStreamEx(long j10, int i10, int i11);

    public static native void nativeReleaseRTCRoomEventHandler(long j10);

    public static native void nativeReleaseRTCRoomEventHandlerEx(long j10);

    public static native int nativeResumeAllSubscribedStream(long j10, int i10);

    public static native int nativeResumeForwardStreamToAllRooms(long j10);

    public static native long nativeSendRoomBinaryMessage(long j10, byte[] bArr);

    public static native long nativeSendRoomMessage(long j10, String str);

    public static native long nativeSendUserBinaryMessage(long j10, String str, byte[] bArr, int i10);

    public static native long nativeSendUserMessage(long j10, String str, String str2, int i10);

    public static native int nativeSetAudioSelectionConfig(long j10, int i10);

    public static native int nativeSetMultiDeviceAVSync(long j10, String str);

    public static native long nativeSetRTCRoomEventHandler(long j10, RTCRoomEventHandler rTCRoomEventHandler);

    public static native long nativeSetRTCRoomEventHandlerEx(long j10, RTCRoomEventHandlerEx rTCRoomEventHandlerEx);

    public static native int nativeSetRemoteRoomAudioPlaybackVolume(long j10, int i10);

    public static native int nativeSetRemoteVideoConfig(long j10, String str, int i10, int i11, int i12);

    public static native int nativeSetRemoteVideoConfigEx(long j10, String str, int i10, int i11, int i12, int i13);

    public static native long nativeSetRoomExtraInfo(long j10, String str, String str2);

    public static native int nativeSetUserVisibility(long j10, boolean z10);

    public static native int nativeStartForwardStreamToRooms(long j10, List<InternalForwardStreamInfo> list);

    public static native int nativeStartSubtitle(long j10, int i10, String str);

    public static native int nativeStopForwardStreamToRooms(long j10);

    public static native int nativeStopSubtitle(long j10);

    public static native int nativeSubscribeAllStreamsWithMediaStreamType(long j10, int i10);

    public static native int nativeSubscribeScreenWithMediaStreamType(long j10, String str, int i10);

    public static native int nativeSubscribeStreamEx(long j10, String str, int i10, int i11);

    public static native int nativeSubscribeStreamWithMediaStreamType(long j10, String str, int i10);

    public static native int nativeSubscribeUserStream(long j10, String str, boolean z10, int i10, int i11, int i12);

    public static native int nativeUnpublishScreenWithMediaStreamType(long j10, int i10);

    public static native int nativeUnpublishStream(long j10, int i10);

    public static native int nativeUnpublishStreamEx(long j10, int i10, int i11);

    public static native int nativeUnsubscribeAllStreamsWithMediaStreamType(long j10, int i10);

    public static native int nativeUnsubscribeScreenWithMediaStreamType(long j10, String str, int i10);

    public static native int nativeUnsubscribeStreamEx(long j10, String str, int i10, int i11);

    public static native int nativeUnsubscribeStreamWithMediaStreamType(long j10, String str, int i10);

    public static native int nativeUpdateCloudRending(long j10, String str);

    public static native int nativeUpdateForwardStreamToRooms(long j10, List<InternalForwardStreamInfo> list);

    public static native int nativeUpdateToken(long j10, String str);
}
