package com.ss.bytertc.engine;

import com.ss.bytertc.engine.audio.IRangeAudio;
import com.ss.bytertc.engine.audio.ISpatialAudio;
import com.ss.bytertc.engine.data.ForwardStreamInfo;
import com.ss.bytertc.engine.data.RemoteVideoConfig;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.type.AudioSelectionPriority;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.MessageConfig;
import com.ss.bytertc.engine.type.PauseResumeControlMediaType;
import com.ss.bytertc.engine.type.SubscribeMediaType;
import com.ss.bytertc.engine.type.SubtitleConfig;
import com.ss.bytertc.engine.video.IPanoramicVideo;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RTCRoom {
    public abstract void destroy();

    public abstract int enableSubscribeLocalStream(boolean z10);

    public abstract IPanoramicVideo getPanoramicVideo();

    public abstract IRangeAudio getRangeAudio();

    public abstract String getRoomId();

    public abstract ISpatialAudio getSpatialAudio();

    public abstract int joinRoom(String str, UserInfo userInfo, RTCRoomConfig rTCRoomConfig);

    public abstract int leaveRoom();

    public abstract int pauseAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType);

    public abstract int pauseForwardStreamToAllRooms();

    public abstract int publishScreen(MediaStreamType mediaStreamType);

    public abstract int publishStream(MediaStreamType mediaStreamType);

    public abstract int resumeAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType);

    public abstract int resumeForwardStreamToAllRooms();

    public abstract long sendRoomBinaryMessage(byte[] bArr);

    public abstract long sendRoomMessage(String str);

    public abstract long sendUserBinaryMessage(String str, byte[] bArr, MessageConfig messageConfig);

    public abstract long sendUserMessage(String str, String str2, MessageConfig messageConfig);

    public abstract int setAudioSelectionConfig(AudioSelectionPriority audioSelectionPriority);

    public abstract int setMultiDeviceAVSync(String str);

    public abstract int setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler);

    public abstract int setRemoteRoomAudioPlaybackVolume(int i10);

    public abstract int setRemoteVideoConfig(String str, RemoteVideoConfig remoteVideoConfig);

    public abstract long setRoomExtraInfo(String str, String str2);

    public abstract int setUserVisibility(boolean z10);

    public abstract int startCloudRendering(String str);

    public abstract int startForwardStreamToRooms(List<ForwardStreamInfo> list);

    public abstract int startSubtitle(SubtitleConfig subtitleConfig);

    public abstract int stopCloudRendering();

    public abstract int stopForwardStreamToRooms();

    public abstract int stopSubtitle();

    public abstract int subscribeAllStreams(MediaStreamType mediaStreamType);

    public abstract int subscribeScreen(String str, MediaStreamType mediaStreamType);

    public abstract int subscribeStream(String str, MediaStreamType mediaStreamType);

    @Deprecated
    public abstract int subscribeUserStream(String str, StreamIndex streamIndex, SubscribeMediaType subscribeMediaType, SubscribeVideoConfig subscribeVideoConfig);

    public abstract int unpublishScreen(MediaStreamType mediaStreamType);

    public abstract int unpublishStream(MediaStreamType mediaStreamType);

    public abstract int unsubscribeAllStreams(MediaStreamType mediaStreamType);

    public abstract int unsubscribeScreen(String str, MediaStreamType mediaStreamType);

    public abstract int unsubscribeStream(String str, MediaStreamType mediaStreamType);

    public abstract int updateCloudRendering(String str);

    public abstract int updateForwardStreamToRooms(List<ForwardStreamInfo> list);

    public abstract int updateToken(String str);
}
