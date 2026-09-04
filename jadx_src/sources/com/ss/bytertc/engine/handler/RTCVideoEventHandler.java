package com.ss.bytertc.engine.handler;

import android.util.Log;
import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.InternalLocalStreamStats;
import com.ss.bytertc.engine.InternalRTCUser;
import com.ss.bytertc.engine.InternalRemoteStreamStats;
import com.ss.bytertc.engine.InternalRemoteStreamSwitch;
import com.ss.bytertc.engine.InternalSourceWantedData;
import com.ss.bytertc.engine.SysStats;
import com.ss.bytertc.engine.data.AudioMixingError;
import com.ss.bytertc.engine.data.AudioMixingState;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.DataMessageSourceType;
import com.ss.bytertc.engine.data.DeadLockMsg;
import com.ss.bytertc.engine.data.FrameUpdateInfo;
import com.ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.ss.bytertc.engine.data.LocalAudioStreamError;
import com.ss.bytertc.engine.data.LocalAudioStreamState;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.RecordingInfo;
import com.ss.bytertc.engine.data.RecordingProgress;
import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.data.RemoteAudioState;
import com.ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.StreamSycnInfoConfig;
import com.ss.bytertc.engine.data.VideoDenoiseMode;
import com.ss.bytertc.engine.data.VideoDenoiseModeChangedReason;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.ss.bytertc.engine.data.VideoSuperResolutionModeChangedReason;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.type.AudioDeviceType;
import com.ss.bytertc.engine.type.AudioDumpStatus;
import com.ss.bytertc.engine.type.AudioRecordingErrorCode;
import com.ss.bytertc.engine.type.AudioRecordingState;
import com.ss.bytertc.engine.type.EchoTestResult;
import com.ss.bytertc.engine.type.EffectErrorType;
import com.ss.bytertc.engine.type.FirstFramePlayState;
import com.ss.bytertc.engine.type.FirstFrameSendState;
import com.ss.bytertc.engine.type.HardwareEchoDetectionResult;
import com.ss.bytertc.engine.type.LocalProxyError;
import com.ss.bytertc.engine.type.LocalProxyState;
import com.ss.bytertc.engine.type.LocalProxyType;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.LocalVideoStreamError;
import com.ss.bytertc.engine.type.LocalVideoStreamState;
import com.ss.bytertc.engine.type.NetworkDetectionLinkType;
import com.ss.bytertc.engine.type.NetworkDetectionStopReason;
import com.ss.bytertc.engine.type.PerformanceAlarmMode;
import com.ss.bytertc.engine.type.PerformanceAlarmReason;
import com.ss.bytertc.engine.type.PublicStreamErrorCode;
import com.ss.bytertc.engine.type.RecordingErrorCode;
import com.ss.bytertc.engine.type.RecordingState;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteStreamSwitch;
import com.ss.bytertc.engine.type.RemoteVideoState;
import com.ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.ss.bytertc.engine.type.RenderError;
import com.ss.bytertc.engine.type.RtcUser;
import com.ss.bytertc.engine.type.SEIStreamUpdateEvent;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.bytertc.engine.type.VideoDeviceType;
import com.ss.bytertc.engine.utils.LogUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class RTCVideoEventHandler {
    private static final String TAG = "RtcVideoEventHandler";
    private static final String WEBRTC_MEDIA_STAT_KEY = "rtc_media_statistics";
    private static final String WEBRTC_MONITOR_TAG = "live_webrtc_monitor_log";
    private static final String WEBRTC_STATISTICS_KEY = "rtc_statistics";
    private static final String WEBRTC_TRANSPORT_STAT_KEY = "rtc_transport_statistics";
    private WeakReference<RTCVideoImpl> mRTCVideoImpl;
    private String mRoom;
    private String mSession;
    private String mUser;
    private State mState = State.IDLE;
    private long mJoinChannelTime = 0;

    public enum State {
        IDLE,
        IN_ROOM
    }

    public RTCVideoEventHandler(RTCVideoImpl rTCVideoImpl) {
        this.mRTCVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    @CalledByNative
    public static ByteBuffer allocateDirectByteBuffer(int i10) {
        return ByteBuffer.allocateDirect(i10);
    }

    @CalledByNative
    public void onActiveSpeaker(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onActiveSpeaker");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onActiveSpeaker(str, str2);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onActiveSpeaker callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i10, int i11) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onAudioDeviceStateChanged, AudioDeviceType: " + audioDeviceType + ", device_state: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioDeviceStateChanged(str, audioDeviceType, i10, i11);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onAudioDeviceStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onAudioDeviceWarning(String str, AudioDeviceType audioDeviceType, int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onAudioDeviceWarning, AudioDeviceType: " + audioDeviceType + ", device_warning " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioDeviceWarning(str, audioDeviceType, i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onAudioDeviceWarning callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onAudioDumpStateChanged(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onAudioDumpStateChanged...status: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            AudioDumpStatus audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_START_FAILURE;
            if (i10 != 0) {
                if (i10 == 1) {
                    audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_START_SUCCESS;
                } else if (i10 == 2) {
                    audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_STOP_FAILURE;
                } else if (i10 == 3) {
                    audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_STOP_SUCCESS;
                } else if (i10 == 4) {
                    audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_RUNNING_FAILURE;
                } else if (i10 == 5) {
                    audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_RUNNING_SUCCESS;
                }
            }
            rtcEngineHandler.onAudioDumpStateChanged(audioDumpStatus);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onAudioDumpStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onAudioFramePlayStateChanged(StreamKey streamKey, String str, int i10) {
        IRTCVideoEventHandlerEx rtcEngineHandlerEx;
        LogUtil.d(TAG, "onAudioFramePlayStateChanged, user: " + streamKey.getUserId() + ", state: " + i10);
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i10 != 0) {
            if (i10 == 1) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            } else if (i10 == 2) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandlerEx = rTCVideoImpl.getRtcEngineHandlerEx()) == null) {
                return;
            }
            rtcEngineHandlerEx.onAudioFramePlayStateChanged(streamKey, str, firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.e(TAG, "onAudioFramePlayStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onAudioFramePlayStateChanged(String str, InternalRTCUser internalRTCUser, int i10, int i11) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onAudioFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i11);
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i11 != 0) {
            if (i11 == 1) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            } else if (i11 == 2) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioFramePlayStateChanged(str, new RtcUser(internalRTCUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.e(TAG, "onAudioFramePlayStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onAudioFrameSendStateChanged(StreamKey streamKey, String str, int i10) {
        IRTCVideoEventHandlerEx rtcEngineHandlerEx;
        LogUtil.d(TAG, "onAudioFrameSendStateChanged,  state: " + i10);
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i10 != 0) {
            if (i10 == 1) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            } else if (i10 == 2) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
            }
        }
        RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
        if (rTCVideoImpl == null || (rtcEngineHandlerEx = rTCVideoImpl.getRtcEngineHandlerEx()) == null) {
            return;
        }
        rtcEngineHandlerEx.onAudioFrameSendStateChanged(streamKey, str, firstFrameSendState);
    }

    @CalledByNative
    public void onAudioFrameSendStateChanged(String str, InternalRTCUser internalRTCUser, int i10, int i11) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onAudioFrameSendStateChanged,  state: " + i11);
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i11 != 0) {
            if (i11 == 1) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            } else if (i11 == 2) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioFrameSendStateChanged(str, new RtcUser(internalRTCUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.e(TAG, "onAudioFrameSendStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onAudioMixingPlayingProgress(int i10, long j10) {
        IRTCVideoEventHandler rtcEngineHandler;
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioMixingPlayingProgress(i10, j10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onAudioMixingPlayingProgress callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onAudioMixingStateChanged(int i10, AudioMixingState audioMixingState, AudioMixingError audioMixingError) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onAudioMixingStateChanged... mixId: " + i10 + ", state: " + audioMixingState.value() + ", error: " + audioMixingError.value());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioMixingStateChanged(i10, audioMixingState, audioMixingError);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onAudioMixingStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onAudioPlaybackDeviceChanged(AudioPlaybackDevice audioPlaybackDevice) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onAudioPlaybackDeviceChanged...device: " + audioPlaybackDevice.value());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioPlaybackDeviceChanged(audioPlaybackDevice);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onAudioPlaybackDeviceChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onAudioPlaybackDeviceTestVolume(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onAudioPlaybackDeviceTestVolume");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioPlaybackDeviceTestVolume(i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onAudioPlaybackDeviceTestVolume callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onAudioRecordingStateUpdate(int i10, int i11) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onAudioRecordingStateUpdate, state: " + i10 + ", errorCode: " + i11);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioRecordingStateUpdate(AudioRecordingState.fromId(i10), AudioRecordingErrorCode.fromId(i11));
        } catch (Exception e10) {
            LogUtil.e(TAG, "onAudioRecordingStateUpdate callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onAudioRouteChanged(AudioRoute audioRoute) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onAudioRouteChanged...device: " + audioRoute.value());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioRouteChanged(audioRoute);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onAudioRouteChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onCloudProxyConnected(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onCloudProxyConnected, interval: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onCloudProxyConnected(i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onCloudProxyConnected callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onConnectionStateChanged(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onConnectionStateChanged, state: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onConnectionStateChanged(i10, -1);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onConnectionStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onCreateRoomStateChanged(String str, int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onCreateRoomStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onCreateRoomStateChanged(str, i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onCreateRoomStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onDeadLockError(DeadLockMsg deadLockMsg) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onDeadLockError...: " + deadLockMsg);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onDeadLockError(deadLockMsg);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onDeadLockError callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onEchoTestResult(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onEchoTestResult...error code: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            EchoTestResult echoTestResult = EchoTestResult.ECHO_TEST_SUCCESS;
            switch (i10) {
                case 1:
                    echoTestResult = EchoTestResult.ECHO_TEST_TIMEOUT;
                    break;
                case 2:
                    echoTestResult = EchoTestResult.ECHO_TEST_INTERVAL_SHORT;
                    break;
                case 3:
                    echoTestResult = EchoTestResult.ECHO_TEST_AUDIO_DEVICE_ERROR;
                    break;
                case 4:
                    echoTestResult = EchoTestResult.ECHO_TEST_VIDEO_DEVICE_ERROR;
                    break;
                case 5:
                    echoTestResult = EchoTestResult.ECHO_TEST_AUDIO_RECEIVE_ERROR;
                    break;
                case 6:
                    echoTestResult = EchoTestResult.ECHO_TEST_VIDEO_RECEIVE_ERROR;
                    break;
                case 7:
                    echoTestResult = EchoTestResult.ECHO_TEST_INTERNAL_ERROR;
                    break;
            }
            rtcEngineHandler.onEchoTestResult(echoTestResult);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onEchoTestResult callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onEffectError(EffectErrorType effectErrorType, String str) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onEffectError error: " + effectErrorType + ", msg: " + str);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onEffectError(effectErrorType, str);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onEffectError callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onError(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onError...errorNum: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onError(i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onError callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onExtensionAccessError(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        Log.e(TAG, "onExtensionAccessError...extensionName: " + str + " msg:" + str2);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onExtensionAccessError(str, str2);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onExtensionAccessError callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onExternalScreenFrameUpdate(FrameUpdateInfo frameUpdateInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onExternalScreenFrameUpdate, info: " + frameUpdateInfo.toString());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onExternalScreenFrameUpdate(frameUpdateInfo);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onExternalScreenFrameUpdate callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onFirstLocalAudioFrame...streamIndex: " + streamIndex.value());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onFirstLocalAudioFrame(streamIndex);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onFirstLocalAudioFrame callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onFirstLocalVideoFrame...width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onFirstLocalVideoFrame callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onFirstPublicStreamAudioFrame(String str) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onFirstPublicStreamAudioFrame...streamid: " + str);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onFirstPublicStreamAudioFrame(str);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onFirstPublicStreamAudioFrame callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onFirstPublicStreamVideoFrameDecoded(String str, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onFirstPublicStreamVideoFrameDecoded...streamid: " + str + ", width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onFirstPublicStreamVideoFrameDecoded(str, videoFrameInfo);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onFirstPublicStreamVideoFrameDecoded callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onFirstRemoteAudioFrame...uid: " + remoteStreamKey.getUserId() + ", roomid: " + remoteStreamKey.getRoomId() + ", streamIndex: " + remoteStreamKey.getStreamIndex().value());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onFirstRemoteAudioFrame(remoteStreamKey);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onFirstRemoteAudioFrame callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onFirstRemoteVideoFrameDecoded(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onFirstRemoteVideoFrameDecoded...uid: " + remoteStreamKey.getUserId() + ", StreamIndex:" + remoteStreamKey.getStreamIndex() + ", width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onFirstRemoteVideoFrameDecoded(remoteStreamKey, videoFrameInfo);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onFirstRemoteVideoFrameDecoded callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onFirstRemoteVideoFrameRendered...uid: " + remoteStreamKey.getUserId() + ", StreamIndex:" + remoteStreamKey.getStreamIndex() + ", width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onFirstRemoteVideoFrameRendered callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onGetPeerOnlineStatus(String str, int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onGetPeerOnlineStatus: " + str + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onGetPeerOnlineStatus(str, i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onGetPeerOnlineStatus callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onHardwareEchoDetectionResult(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onHardwareEchoDetectionResult...result code: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            HardwareEchoDetectionResult hardwareEchoDetectionResult = HardwareEchoDetectionResult.HARDWARE_ECHO_RESULT_NORMAL;
            if (i10 == 0) {
                hardwareEchoDetectionResult = HardwareEchoDetectionResult.HARDWARE_ECHO_RESULT_CANCELED;
            } else if (i10 == 1) {
                hardwareEchoDetectionResult = HardwareEchoDetectionResult.HARDWARE_ECHO_RESULT_UNKNOWN;
            } else if (i10 == 3) {
                hardwareEchoDetectionResult = HardwareEchoDetectionResult.HARDWARE_ECHO_RESULT_POOR;
            }
            rtcEngineHandler.onHardwareEchoDetectionResult(hardwareEchoDetectionResult);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onHardwareEchoDetectionResult callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onHttpProxyState(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onHttpProxyState, state: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onHttpProxyState(i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onHttpProxyState callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onHttpsProxyState(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onHttpsProxyState, state: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onHttpsProxyState(i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onHttpsProxyState callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onInvokeExperimentalAPI(String str) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onInvokeExperimentalAPI...param: " + str);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onInvokeExperimentalAPI(str);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onInvokeExperimentalAPI callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onLicenseWillExpire(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onLicenseWillExpire, days: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLicenseWillExpire(i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onLicenseWillExpire callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onLocalAudioPropertiesReport");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLocalAudioPropertiesReport(localAudioPropertiesInfoArr);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onLocalAudioPropertiesReport callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onLocalAudioStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onLocalAudioStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onLocalProxyStateChanged(LocalProxyType localProxyType, LocalProxyState localProxyState, LocalProxyError localProxyError) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onLocalProxyStateChanged...: " + localProxyType.value() + ", state: " + localProxyState.value() + ", error: " + localProxyError.value());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLocalProxyStateChanged(localProxyType, localProxyState, localProxyError);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onLocalProxyStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onLocalStreamStats(StreamIndex streamIndex, InternalLocalStreamStats internalLocalStreamStats) {
        IRTCVideoEventHandlerEx rtcEngineHandlerEx;
        LogUtil.d(TAG, "onLocalStreamStats, streamIndex: " + streamIndex);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandlerEx = rTCVideoImpl.getRtcEngineHandlerEx()) == null) {
                return;
            }
            rtcEngineHandlerEx.onLocalStreamStats(streamIndex, new LocalStreamStats(internalLocalStreamStats));
        } catch (Exception e10) {
            LogUtil.d(TAG, "onLocalStreamStats callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onLocalVideoSizeChanged... streamIndex: " + streamIndex + ", frameInfo: " + videoFrameInfo);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onLocalVideoSizeChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onLocalVideoStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onLocalVideoStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onLogReport(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        try {
            if (!WEBRTC_MONITOR_TAG.equals(str)) {
                LogUtil.i(str, str2);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str2);
                RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
                if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                    return;
                }
                rtcEngineHandler.onLogReport(str, jSONObject);
            } catch (JSONException e10) {
                LogUtil.d(TAG, "onLogReport...parse json catch exception: " + e10.getMessage());
            }
        } catch (Exception e11) {
            LogUtil.e(TAG, "onLogReport callback catch exception.\n" + e11.getMessage());
        }
    }

    @CalledByNative
    public void onLoginResult(String str, int i10, int i11) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "OnLoginResult: " + str + i10 + i11);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLoginResult(str, i10, i11);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onLoginResult callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onLogout(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onLogout: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLogout(i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onLogout callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onMediaDeviceStateChanged(String str, int i10, int i11, int i12) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onMediaDeviceStateChanged, MediaDeviceType: " + i10 + ", device_state: " + i11);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onMediaDeviceStateChanged(str, i10, i11, i12);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onMediaDeviceStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onMediaDeviceWarning(String str, int i10, int i11) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onMediaDeviceWarning, MediaDeviceType: " + i10 + ", device_warning " + i11);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onMediaDeviceWarning(str, i10, i11);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onMediaDeviceWarning callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onNetworkProbeResult(int i10, int i11, int i12, double d10, int i13, int i14) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onNetworkProbeResult: " + i10 + Constants.ACCEPT_TIME_SEPARATOR_SP + i11 + Constants.ACCEPT_TIME_SEPARATOR_SP + i12 + Constants.ACCEPT_TIME_SEPARATOR_SP + d10 + Constants.ACCEPT_TIME_SEPARATOR_SP + i13 + Constants.ACCEPT_TIME_SEPARATOR_SP + i14);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onNetworkDetectionResult(NetworkDetectionLinkType.values()[i10], i11, i12, d10, i13, i14);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onNetworkDetectionResult callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onNetworkProbeStopped(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onNetworkProbeStopped: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onNetworkDetectionStopped(NetworkDetectionStopReason.values()[i10]);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onNetworkDetectionStopped callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onNetworkTimeSynchronized() {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onNetworkTimeSynchronized...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onNetworkTimeSynchronized();
        } catch (Exception e10) {
            LogUtil.e(TAG, "onNetworkTimeSynchronized callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onNetworkTypeChanged(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onNetworkTypeChanged, type: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onNetworkTypeChanged(i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onNetworkTypeChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onPerformanceAlarms(int i10, String str, int i11, InternalSourceWantedData internalSourceWantedData) {
        PerformanceAlarmReason performanceAlarmReason;
        LogUtil.d(TAG, "onPerformanceAlarms, level: " + i11 + ", data: " + internalSourceWantedData);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null) {
                if (i11 == 0) {
                    performanceAlarmReason = PerformanceAlarmReason.BANDWIDTH_FALLBACKED;
                } else if (i11 == 1) {
                    performanceAlarmReason = PerformanceAlarmReason.BANDWIDTH_RESUMED;
                } else if (i11 != 2) {
                    performanceAlarmReason = i11 != 3 ? PerformanceAlarmReason.PERFORMANCE_RESUMED : PerformanceAlarmReason.PERFORMANCE_RESUMED;
                } else {
                    performanceAlarmReason = PerformanceAlarmReason.PERFORMANCE_FALLBACKED;
                }
                IRTCVideoEventHandler rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler();
                if (rtcEngineHandler != null) {
                    rtcEngineHandler.onPerformanceAlarms(i10 == 0 ? PerformanceAlarmMode.NORMAL : PerformanceAlarmMode.SIMULCAST, str, performanceAlarmReason, new SourceWantedData(internalSourceWantedData));
                }
            }
        } catch (Exception e10) {
            LogUtil.e(TAG, "onPerformanceAlarms callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onPlayPublicStreamResult(String str, PublicStreamErrorCode publicStreamErrorCode) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onPlayPublicStreamError error(" + publicStreamErrorCode + ") streamId:" + str);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onPlayPublicStreamResult(str, publicStreamErrorCode);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onPlayPublicStreamError callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onPublicStreamDataMessageReceived(String str, ByteBuffer byteBuffer, int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onPublicStreamDataMessageReceived(str, byteBuffer, DataMessageSourceType.fromId(i10));
        } catch (Exception e10) {
            LogUtil.e(TAG, "onPublicStreamDataMessageReceived callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onPublicStreamSEIMessageReceived(String str, ByteBuffer byteBuffer, int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onPublicStreamSEIMessageReceived(str, byteBuffer, DataMessageSourceType.fromId(i10));
        } catch (Exception e10) {
            LogUtil.e(TAG, "onPublicStreamSEIMessageReceived callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onPublicStreamSEIMessageReceivedWithChannel(String str, int i10, ByteBuffer byteBuffer) {
        IRTCVideoEventHandler rtcEngineHandler;
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onPublicStreamSEIMessageReceivedWithChannel(str, i10, byteBuffer);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onPublicStreamSEIMessageReceivedWithChannel callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onPushPublicStreamResult(String str, String str2, PublicStreamErrorCode publicStreamErrorCode) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onPushPublicStreamError error(" + publicStreamErrorCode.value() + ") streamId:" + str2);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onPushPublicStreamResult(str, str2, publicStreamErrorCode);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onPushPublicStreamError callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRecordingProgressUpdate(StreamIndex streamIndex, RecordingProgress recordingProgress, RecordingInfo recordingInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onRecordingProgressUpdate, StreamIndex: " + streamIndex + ", progress.dur: " + recordingProgress.duration + ", progress.fileSize: " + recordingProgress.fileSize + ", info.filePath: " + recordingInfo.filePath);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRecordingProgressUpdate(streamIndex, recordingProgress, recordingInfo);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onRecordingProgressUpdate callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRecordingStateUpdate(StreamIndex streamIndex, int i10, int i11, RecordingInfo recordingInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onRecordingStateUpdate, StreamIndex: " + streamIndex + ", RecordingState: " + i10 + ", RecordingErrorCode: " + i11 + ", info.filePath: " + recordingInfo.filePath);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRecordingStateUpdate(streamIndex, RecordingState.fromId(i10), RecordingErrorCode.fromId(i11), recordingInfo);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onRecordingStateUpdate callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onRemoteAudioPropertiesReport");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRemoteAudioPropertiesReport(remoteAudioPropertiesInfoArr, i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onRemoteAudioPropertiesReport callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onRemoteAudioStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRemoteAudioStateChanged(remoteStreamKey, remoteAudioState, remoteAudioStateChangeReason);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onRemoteAudioStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteRenderError(RemoteStreamKey remoteStreamKey, RenderError renderError, String str) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onRemoteRenderError, key: " + remoteStreamKey.toString() + ", error: ; message: " + str);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRemoteRenderError(remoteStreamKey, renderError, str);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onRemoteRenderError callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteStreamStats(StreamKey streamKey, InternalRemoteStreamStats internalRemoteStreamStats) {
        IRTCVideoEventHandlerEx rtcEngineHandlerEx;
        LogUtil.d(TAG, "onRemoteStreamStats, streamIndex: " + streamKey.getStreamIndex());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandlerEx = rTCVideoImpl.getRtcEngineHandlerEx()) == null) {
                return;
            }
            rtcEngineHandlerEx.onRemoteStreamStats(new StreamKey(streamKey.getRoomId(), streamKey.getUserId(), streamKey.getStreamIndex()), new RemoteStreamStats(internalRemoteStreamStats));
        } catch (Exception e10) {
            LogUtil.d(TAG, "onRemoteStreamStats callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onRemoteVideoSizeChanged... RemoteStreamKey: " + remoteStreamKey + ", frameInfo: " + videoFrameInfo);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onRemoteVideoSizeChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onRemoteVideoStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onRemoteVideoStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteVideoSuperResolutionModeChanged(RemoteStreamKey remoteStreamKey, VideoSuperResolutionMode videoSuperResolutionMode, VideoSuperResolutionModeChangedReason videoSuperResolutionModeChangedReason) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onRemoteVideoSuperResolutionModeChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRemoteVideoSuperResolutionModeChanged(remoteStreamKey, videoSuperResolutionMode, videoSuperResolutionModeChangedReason);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onRemoteVideoSuperResolutionModeChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onSEIMessageReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onSEIMessageReceived" + remoteStreamKey.getRoomId() + remoteStreamKey.getUserId());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onSEIMessageReceived(remoteStreamKey, byteBuffer);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onSEIMessageReceived callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onSEIStreamUpdate(RemoteStreamKey remoteStreamKey, int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onSEIStreamUpdate" + remoteStreamKey.getRoomId() + remoteStreamKey.getUserId());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onSEIStreamUpdate(remoteStreamKey, SEIStreamUpdateEvent.values()[i10]);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onSEIStreamUpdate callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onScreenVideoFramePlayStateChanged(String str, InternalRTCUser internalRTCUser, int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onScreenVideoFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i10);
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i10 != 0) {
            if (i10 == 1) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            } else if (i10 == 2) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onScreenVideoFramePlayStateChanged(str, new RtcUser(internalRTCUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.e(TAG, "onScreenVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onScreenVideoFrameSendStateChanged(String str, InternalRTCUser internalRTCUser, int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onScreenVideoFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i10);
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i10 != 0) {
            if (i10 == 1) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            } else if (i10 == 2) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onScreenVideoFrameSendStateChanged(str, new RtcUser(internalRTCUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.e(TAG, "onScreenVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onServerMessageSendResult(long j10, int i10, ByteBuffer byteBuffer) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onServerMessageSendResult: " + j10 + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onServerMessageSendResult(j10, i10, byteBuffer);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onServerMessageSendResult callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onServerParamsSetResult(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onServerParamsSetResult: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onServerParamsSetResult(i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onServerParamsSetResult callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onSimulcastSubscribeFallback(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onSimulcastSubscribeFallback, uid: " + internalRemoteStreamSwitch.uid + ", before_video_index: " + internalRemoteStreamSwitch.beforeVideoIndex + ", after_video_index: " + internalRemoteStreamSwitch.afterVideoIndex + ", before_enable: " + internalRemoteStreamSwitch.beforeEnable + ", after_enable: " + internalRemoteStreamSwitch.afterEnable + ", reason: " + internalRemoteStreamSwitch.reason);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onSimulcastSubscribeFallback(new RemoteStreamSwitch(internalRemoteStreamSwitch));
        } catch (Exception e10) {
            LogUtil.e(TAG, "onNetworkTypeChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onSocks5ProxyState(int i10, String str, String str2, String str3, String str4) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onSocks5ProxyState, state: " + i10 + ", cmd: " + str + ", proxy_address: " + str2 + ", local_address: " + str3 + ", remote_address: " + str4);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onSocks5ProxyState(i10, str, str2, str3, str4);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onSocks5ProxyState callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onStreamSyncInfoReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer, int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onStreamSyncInfoReceived");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onStreamSyncInfoReceived(remoteStreamKey, StreamSycnInfoConfig.SyncInfoStreamType.SYNC_INFO_STREAM_TYPE_AUDIO, byteBuffer);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onStreamSyncInfoReceived callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onSysStats(SysStats sysStats) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onSysStats... " + sysStats.toString());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onSysStats(sysStats);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onSysStats callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserBinaryMessageReceivedOutsideRoom(String str, ByteBuffer byteBuffer) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onUserBinaryMessageReceivedOutsideRoom: " + str + byteBuffer.capacity());
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserBinaryMessageReceivedOutsideRoom(str, byteBuffer);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onUserBinaryMessageReceivedOutsideRoom callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserMessageReceivedOutsideRoom(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onUserMessageReceivedOutsideRoom: " + str + str2);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserMessageReceivedOutsideRoom(str, str2);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onUserMessageReceivedOutsideRoom callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserMessageSendResultOutsideRoom(long j10, int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onUserMessageSendResultOutsideRoom: " + j10 + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserMessageSendResultOutsideRoom(j10, i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onUserMessageSendResultOutsideRoom callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserMuteAudio(String str, String str2, MuteState muteState) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onUserMuteAudio... uid: " + str2 + ", muteState: " + muteState.value() + ", roomId: " + str);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserMuteAudio(str, str2, muteState);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onUserMuteAudio callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserMuteVideo(String str, String str2, MuteState muteState) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onUserMuteVideo... uid: " + str2 + ", muted: " + (muteState == MuteState.MUTE_STATE_ON) + ", roomId: " + str);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserMuteVideo(str, str2, muteState);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onUserMuteVideo callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserStartAudioCapture(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onUserStartAudioCapture... uid: " + str2 + ", roomId: " + str);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserStartAudioCapture(str, str2);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onUserStartAudioCapture callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserStartVideoCapture(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onUserStartVideoCapture... uid: " + str2 + ", roomId: " + str);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserStartVideoCapture(str, str2);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onUserStartVideoCapture callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserStopAudioCapture(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onUserStopAudioCapture... uid: " + str2);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserStopAudioCapture(str, str2);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onUserStopAudioCapture callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserStopVideoCapture(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onUserStopVideoCapture... uid: " + str2 + ", roomId: " + str);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserStopVideoCapture(str, str2);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onUserStopVideoCapture callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onVideoDenoiseModeChanged(VideoDenoiseMode videoDenoiseMode, VideoDenoiseModeChangedReason videoDenoiseModeChangedReason) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onVideoDenoiseModeChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onVideoDenoiseModeChanged(videoDenoiseMode, videoDenoiseModeChangedReason);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onVideoDenoiseModeChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onVideoDeviceStateChanged(String str, VideoDeviceType videoDeviceType, int i10, int i11) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onVideoDeviceStateChanged, VideoDeviceType: " + videoDeviceType + ", device_state: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onVideoDeviceStateChanged(str, videoDeviceType, i10, i11);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onVideoDeviceStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onVideoDeviceWarning(String str, VideoDeviceType videoDeviceType, int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onVideoDeviceWarning, VideoDeviceType: " + videoDeviceType + ", device_warning " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onVideoDeviceWarning(str, videoDeviceType, i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onVideoDeviceWarning callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onVideoFramePlayStateChanged(StreamKey streamKey, String str, int i10) {
        IRTCVideoEventHandlerEx rtcEngineHandlerEx;
        LogUtil.d(TAG, "onVideoFramePlayStateChanged, user: " + streamKey.getUserId() + ", state: " + i10);
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i10 != 0) {
            if (i10 == 1) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            } else if (i10 == 2) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandlerEx = rTCVideoImpl.getRtcEngineHandlerEx()) == null) {
                return;
            }
            rtcEngineHandlerEx.onVideoFramePlayStateChanged(streamKey, str, firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.e(TAG, "onVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onVideoFramePlayStateChanged(String str, InternalRTCUser internalRTCUser, int i10, int i11) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onVideoFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i11);
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i11 != 0) {
            if (i11 == 1) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            } else if (i11 == 2) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onVideoFramePlayStateChanged(str, new RtcUser(internalRTCUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.e(TAG, "onVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onVideoFrameSendStateChanged(StreamKey streamKey, String str, int i10) {
        IRTCVideoEventHandlerEx rtcEngineHandlerEx;
        LogUtil.d(TAG, "onVideoFrameSendStateChanged, user: " + streamKey.getUserId() + ", state: " + i10);
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i10 != 0) {
            if (i10 == 1) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            } else if (i10 == 2) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandlerEx = rTCVideoImpl.getRtcEngineHandlerEx()) == null) {
                return;
            }
            rtcEngineHandlerEx.onVideoFrameSendStateChanged(streamKey, str, firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.e(TAG, "onVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onVideoFrameSendStateChanged(String str, InternalRTCUser internalRTCUser, int i10, int i11) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onVideoFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i11);
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i11 != 0) {
            if (i11 == 1) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            } else if (i11 == 2) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onVideoFrameSendStateChanged(str, new RtcUser(internalRTCUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.e(TAG, "onVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onWarning(int i10) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d(TAG, "onWarning, warnNum: " + i10);
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onWarning(i10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onWarning callback catch exception.\n" + e10.getMessage());
        }
    }

    public void setJoinChannelTime(long j10) {
        this.mJoinChannelTime = j10;
    }
}
