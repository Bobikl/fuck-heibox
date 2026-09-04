package com.ss.bytertc.engine.flutter.base;

import androidx.annotation.RestrictTo;
import androidx.constraintlayout.motion.widget.f;
import androidx.core.app.o0;
import com.lzy.okgo.model.Progress;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.SysStats;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.data.AudioPropertiesInfo;
import com.ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.ss.bytertc.engine.data.RecordingInfo;
import com.ss.bytertc.engine.data.RecordingProgress;
import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.SingScoringRealtimeInfo;
import com.ss.bytertc.engine.data.StandardPitchInfo;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.type.LocalAudioStats;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.LocalVideoStats;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.bytertc.engine.type.RemoteAudioStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteStreamSwitch;
import com.ss.bytertc.engine.type.RemoteVideoStats;
import com.ss.bytertc.engine.type.RtcUser;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.bytertc.engine.type.SubtitleMessage;
import com.ss.bytertc.engine.video.Rectangle;
import com.ss.bytertc.ktv.data.DownloadResult;
import com.ss.bytertc.ktv.data.HotMusicInfo;
import com.ss.bytertc.ktv.data.MusicInfo;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RTCMap {
    public static List<Map<String, Object>> from(List<StandardPitchInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (StandardPitchInfo standardPitchInfo : list) {
            HashMap map = new HashMap();
            map.put(AnalyticsConfig.RTD_START_TIME, Integer.valueOf(standardPitchInfo.startTime));
            map.put("duration", Integer.valueOf(standardPitchInfo.duration));
            map.put("pitch", Integer.valueOf(standardPitchInfo.pitch));
            arrayList.add(map);
        }
        return arrayList;
    }

    public static List<Map<?, ?>> from(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
        ArrayList arrayList = new ArrayList(forwardStreamEventInfoArr.length);
        for (ForwardStreamEventInfo forwardStreamEventInfo : forwardStreamEventInfoArr) {
            arrayList.add(from(forwardStreamEventInfo));
        }
        return arrayList;
    }

    public static List<Map<?, ?>> from(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
        ArrayList arrayList = new ArrayList(forwardStreamStateInfoArr.length);
        for (ForwardStreamStateInfo forwardStreamStateInfo : forwardStreamStateInfoArr) {
            arrayList.add(from(forwardStreamStateInfo));
        }
        return arrayList;
    }

    public static List<Map<?, ?>> from(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr) {
        ArrayList arrayList = new ArrayList();
        for (RemoteAudioPropertiesInfo remoteAudioPropertiesInfo : remoteAudioPropertiesInfoArr) {
            arrayList.add(from(remoteAudioPropertiesInfo));
        }
        return arrayList;
    }

    public static List<Map<?, ?>> from(NetworkQualityStats[] networkQualityStatsArr) {
        ArrayList arrayList = new ArrayList(networkQualityStatsArr.length);
        for (NetworkQualityStats networkQualityStats : networkQualityStatsArr) {
            arrayList.add(from(networkQualityStats));
        }
        return arrayList;
    }

    public static List<Map<String, Object>> from(SubtitleMessage[] subtitleMessageArr) {
        ArrayList arrayList = new ArrayList(subtitleMessageArr.length);
        for (SubtitleMessage subtitleMessage : subtitleMessageArr) {
            HashMap map = new HashMap();
            map.put("uid", subtitleMessage.userId);
            map.put("text", subtitleMessage.text);
            map.put("sequence", Integer.valueOf(subtitleMessage.sequence));
            map.put("definite", Boolean.valueOf(subtitleMessage.definite));
            map.put(ak.N, subtitleMessage.language);
            map.put("mode", Integer.valueOf(subtitleMessage.mode.value()));
            arrayList.add(map);
        }
        return arrayList;
    }

    public static List<Map<String, Object>> from(Rectangle[] rectangleArr) {
        if (rectangleArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(rectangleArr.length);
        for (Rectangle rectangle : rectangleArr) {
            HashMap map = new HashMap();
            map.put("x", Integer.valueOf(rectangle.f98040x));
            map.put("y", Integer.valueOf(rectangle.f98041y));
            map.put("width", Integer.valueOf(rectangle.width));
            map.put("height", Integer.valueOf(rectangle.height));
            arrayList.add(map);
        }
        return arrayList;
    }

    public static List<Map<String, ?>> from(HotMusicInfo[] hotMusicInfoArr) {
        if (hotMusicInfoArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(hotMusicInfoArr.length);
        for (HotMusicInfo hotMusicInfo : hotMusicInfoArr) {
            HashMap map = new HashMap();
            map.put("hotType", Integer.valueOf(hotMusicInfo.hotType.value()));
            String str = hotMusicInfo.hotName;
            if (str != null) {
                map.put("hotName", str);
            }
            List<Map<String, ?>> listFrom = from(hotMusicInfo.musicInfos);
            if (listFrom != null) {
                map.put("musicInfos", listFrom);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public static List<Map<String, ?>> from(MusicInfo[] musicInfoArr) {
        if (musicInfoArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(musicInfoArr.length);
        for (MusicInfo musicInfo : musicInfoArr) {
            arrayList.add(from(musicInfo));
        }
        return arrayList;
    }

    public static Map<String, ?> from(SubscribeConfig subscribeConfig) {
        HashMap map = new HashMap();
        map.put("isScreen", Boolean.valueOf(subscribeConfig.isScreen));
        map.put("subVideo", Boolean.valueOf(subscribeConfig.subVideo));
        map.put("subAudio", Boolean.valueOf(subscribeConfig.subAudio));
        map.put("videoIndex", Integer.valueOf(subscribeConfig.videoIndex));
        map.put("subWidth", Integer.valueOf(subscribeConfig.subWidth));
        map.put("subHeight", Integer.valueOf(subscribeConfig.subHeight));
        map.put("subVideoIndex", Integer.valueOf(subscribeConfig.subVideoIndex));
        map.put("svcLayer", Integer.valueOf(subscribeConfig.svcLayer.getValue()));
        map.put("frameRate", Integer.valueOf(subscribeConfig.framerate));
        return map;
    }

    public static Map<String, ?> from(SysStats sysStats) {
        HashMap map = new HashMap();
        map.put("cpuAppUsage", Double.valueOf(sysStats.cpuAppUsage));
        map.put("cpuCores", Integer.valueOf(sysStats.cpuCores));
        map.put("cpuTotalUsage", Double.valueOf(sysStats.cpuTotalUsage));
        map.put("freeMemory", Long.valueOf(sysStats.freeMemory));
        map.put("fullMemory", Long.valueOf(sysStats.fullMemory));
        map.put("memoryRatio", Double.valueOf(sysStats.memoryRatio));
        map.put("memoryUsage", Double.valueOf(sysStats.memoryUsage));
        map.put("totalMemoryUsage", Long.valueOf(sysStats.totalMemoryUsage));
        map.put("totalMemoryRatio", Double.valueOf(sysStats.totalMemoryRatio));
        return map;
    }

    public static Map<?, ?> from(UserInfo userInfo) {
        HashMap map = new HashMap();
        map.put("uid", userInfo.getUid());
        map.put("metaData", userInfo.getExtraInfo());
        return map;
    }

    public static Map<String, ?> from(AudioPropertiesInfo audioPropertiesInfo) {
        HashMap map = new HashMap();
        map.put("linearVolume", Integer.valueOf(audioPropertiesInfo.linearVolume));
        map.put("nonlinearVolume", Integer.valueOf(audioPropertiesInfo.nonlinearVolume));
        map.put("vad", Integer.valueOf(audioPropertiesInfo.vad));
        float[] fArr = audioPropertiesInfo.spectrum;
        int length = fArr == null ? 0 : fArr.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = audioPropertiesInfo.spectrum[i10];
        }
        map.put("spectrum", dArr);
        map.put("voicePitch", Double.valueOf(audioPropertiesInfo.voicePitch));
        return map;
    }

    public static Map<?, ?> from(ForwardStreamEventInfo forwardStreamEventInfo) {
        HashMap map = new HashMap();
        map.put("roomId", forwardStreamEventInfo.roomId);
        map.put(o0.I0, Integer.valueOf(forwardStreamEventInfo.event.value()));
        return map;
    }

    public static Map<?, ?> from(ForwardStreamStateInfo forwardStreamStateInfo) {
        HashMap map = new HashMap();
        map.put("roomId", forwardStreamStateInfo.roomId);
        map.put("state", Integer.valueOf(forwardStreamStateInfo.state.value()));
        map.put("error", Integer.valueOf(forwardStreamStateInfo.error.value()));
        return map;
    }

    public static Map<String, ?> from(RecordingInfo recordingInfo) {
        HashMap map = new HashMap();
        map.put("width", Integer.valueOf(recordingInfo.width));
        map.put("height", Integer.valueOf(recordingInfo.height));
        map.put(Progress.E, recordingInfo.filePath);
        map.put("videoCodecType", Integer.valueOf(recordingInfo.videoCodecType.value()));
        return map;
    }

    public static Map<String, ?> from(RecordingProgress recordingProgress) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(recordingProgress.duration));
        map.put("fileSize", Long.valueOf(recordingProgress.fileSize));
        return map;
    }

    public static Map<?, ?> from(RemoteAudioPropertiesInfo remoteAudioPropertiesInfo) {
        HashMap map = new HashMap();
        map.put("streamKey", from(remoteAudioPropertiesInfo.streamKey));
        map.put("audioPropertiesInfo", from(remoteAudioPropertiesInfo.audioPropertiesInfo));
        return map;
    }

    public static Map<String, ?> from(RemoteStreamKey remoteStreamKey) {
        HashMap map = new HashMap();
        map.put("roomId", remoteStreamKey.getRoomId());
        map.put("uid", remoteStreamKey.getUserId());
        map.put("streamIndex", Integer.valueOf(remoteStreamKey.getStreamIndex().value()));
        return map;
    }

    public static Map<?, ?> from(SingScoringRealtimeInfo singScoringRealtimeInfo) {
        HashMap map = new HashMap();
        map.put("currentPosition", Integer.valueOf(singScoringRealtimeInfo.currentPosition));
        map.put("userPitch", Integer.valueOf(singScoringRealtimeInfo.userPitch));
        map.put("standardPitch", Integer.valueOf(singScoringRealtimeInfo.standardPitch));
        map.put("sentenceIndex", Integer.valueOf(singScoringRealtimeInfo.sentenceIndex));
        map.put("sentenceScore", Integer.valueOf(singScoringRealtimeInfo.sentenceScore));
        map.put("totalScore", Integer.valueOf(singScoringRealtimeInfo.totalScore));
        map.put("averageScore", Integer.valueOf(singScoringRealtimeInfo.averageScore));
        return map;
    }

    public static Map<String, ?> from(VideoFrameInfo videoFrameInfo) {
        HashMap map = new HashMap();
        map.put("width", Integer.valueOf(videoFrameInfo.getWidth()));
        map.put("height", Integer.valueOf(videoFrameInfo.getHeight()));
        map.put(f.f18721i, Integer.valueOf(videoFrameInfo.rotation.value()));
        return map;
    }

    public static Map<String, ?> from(LocalAudioStats localAudioStats) {
        HashMap map = new HashMap();
        map.put("audioLossRate", Float.valueOf(localAudioStats.audioLossRate));
        map.put("sentKBitrate", Float.valueOf(localAudioStats.sendKBitrate));
        map.put("recordSampleRate", Integer.valueOf(localAudioStats.recordSampleRate));
        map.put("statsInterval", Integer.valueOf(localAudioStats.statsInterval));
        map.put("rtt", Integer.valueOf(localAudioStats.rtt));
        map.put("numChannels", Integer.valueOf(localAudioStats.numChannels));
        map.put("sentSampleRate", Integer.valueOf(localAudioStats.sentSampleRate));
        map.put("jitter", Integer.valueOf(localAudioStats.jitter));
        return map;
    }

    public static Map<String, ?> from(LocalStreamStats localStreamStats) {
        HashMap map = new HashMap();
        map.put("audioStats", from(localStreamStats.audioStats));
        map.put("videoStats", from(localStreamStats.videoStats));
        map.put("isScreen", Boolean.valueOf(localStreamStats.isScreen));
        return map;
    }

    public static Map<String, ?> from(LocalVideoStats localVideoStats) {
        HashMap map = new HashMap();
        map.put("sentKBitrate", Float.valueOf(localVideoStats.sentKBitrate));
        map.put("inputFrameRate", Integer.valueOf(localVideoStats.inputFrameRate));
        map.put("sentFrameRate", Integer.valueOf(localVideoStats.sentFrameRate));
        map.put("encoderOutputFrameRate", Integer.valueOf(localVideoStats.encoderOutputFrameRate));
        map.put("renderOutputFrameRate", Integer.valueOf(localVideoStats.rendererOutputFrameRate));
        map.put("statsInterval", Integer.valueOf(localVideoStats.statsInterval));
        map.put("videoLossRate", Float.valueOf(localVideoStats.videoLossRate));
        map.put("rtt", Integer.valueOf(localVideoStats.rtt));
        map.put("encodedBitrate", Integer.valueOf(localVideoStats.encodedBitrate));
        map.put("encodedFrameWidth", Integer.valueOf(localVideoStats.encodedFrameWidth));
        map.put("encodedFrameHeight", Integer.valueOf(localVideoStats.encodedFrameHeight));
        map.put("encodedFrameCount", Integer.valueOf(localVideoStats.encodedFrameCount));
        map.put("codecType", Integer.valueOf(localVideoStats.codecType));
        map.put("isScreen", Boolean.valueOf(localVideoStats.isScreen));
        map.put("jitter", Integer.valueOf(localVideoStats.jitter));
        return map;
    }

    public static Map<?, ?> from(NetworkQualityStats networkQualityStats) {
        HashMap map = new HashMap();
        map.put("uid", networkQualityStats.uid);
        map.put("fractionLost", Double.valueOf(networkQualityStats.fractionLost));
        map.put("rtt", Integer.valueOf(networkQualityStats.rtt));
        map.put("totalBandwidth", Integer.valueOf(networkQualityStats.totalBandwidth));
        map.put("txQuality", Integer.valueOf(networkQualityStats.txQuality));
        map.put("rxQuality", Integer.valueOf(networkQualityStats.rxQuality));
        return map;
    }

    public static Map<String, ?> from(RTCRoomStats rTCRoomStats) {
        HashMap map = new HashMap();
        map.put("duration", Integer.valueOf(rTCRoomStats.totalDuration));
        map.put("txBytes", Long.valueOf(rTCRoomStats.txBytes));
        map.put("rxBytes", Long.valueOf(rTCRoomStats.rxBytes));
        map.put("txKBitrate", Integer.valueOf(rTCRoomStats.txKBitRate));
        map.put("rxKBitrate", Integer.valueOf(rTCRoomStats.rxKBitRate));
        map.put("txAudioKBitrate", Integer.valueOf(rTCRoomStats.txAudioKBitRate));
        map.put("rxAudioKBitrate", Integer.valueOf(rTCRoomStats.rxAudioKBitRate));
        map.put("txVideoKBitrate", Integer.valueOf(rTCRoomStats.txVideoKBitRate));
        map.put("rxVideoKBitrate", Integer.valueOf(rTCRoomStats.rxVideoKBitRate));
        map.put("txScreenKBitrate", Integer.valueOf(rTCRoomStats.txScreenKBitRate));
        map.put("rxScreenKBitrate", Integer.valueOf(rTCRoomStats.rxScreenKBitRate));
        map.put("userCount", Integer.valueOf(rTCRoomStats.users));
        map.put("cpuAppUsage", Double.valueOf(rTCRoomStats.cpuAppUsage));
        map.put("cpuTotalUsage", Double.valueOf(rTCRoomStats.cpuTotalUsage));
        map.put("txLostrate", Double.valueOf(rTCRoomStats.txLostrate));
        map.put("rxLostrate", Double.valueOf(rTCRoomStats.rxLostrate));
        map.put("rtt", Integer.valueOf(rTCRoomStats.rtt));
        map.put("txJitter", Integer.valueOf(rTCRoomStats.txJitter));
        map.put("rxJitter", Integer.valueOf(rTCRoomStats.rxJitter));
        map.put("txCellularKBitrate", Integer.valueOf(rTCRoomStats.txCellularKBitrate));
        map.put("rxCellularKBitrate", Integer.valueOf(rTCRoomStats.rxCellularKBitrate));
        return map;
    }

    public static Map<String, ?> from(RemoteAudioStats remoteAudioStats) {
        HashMap map = new HashMap();
        map.put("audioLossRate", Float.valueOf(remoteAudioStats.audioLossRate));
        map.put("receivedKBitrate", Float.valueOf(remoteAudioStats.receivedKBitrate));
        map.put("stallCount", Integer.valueOf(remoteAudioStats.stallCount));
        map.put("stallDuration", Integer.valueOf(remoteAudioStats.stallDuration));
        map.put("e2eDelay", Long.valueOf(remoteAudioStats.e2eDelay));
        map.put("playoutSampleRate", Integer.valueOf(remoteAudioStats.playoutSampleRate));
        map.put("statsInterval", Integer.valueOf(remoteAudioStats.statsInterval));
        map.put("rtt", Integer.valueOf(remoteAudioStats.rtt));
        map.put("totalRtt", Integer.valueOf(remoteAudioStats.totalRtt));
        map.put("quality", Integer.valueOf(remoteAudioStats.quality));
        map.put("jitterBufferDelay", Integer.valueOf(remoteAudioStats.jitterBufferDelay));
        map.put("numChannels", Integer.valueOf(remoteAudioStats.numChannels));
        map.put("receivedSampleRate", Integer.valueOf(remoteAudioStats.receivedSampleRate));
        map.put("frozenRate", Integer.valueOf(remoteAudioStats.frozenRate));
        map.put("concealedSamples", Integer.valueOf(remoteAudioStats.concealedSamples));
        map.put("concealmentEvent", Integer.valueOf(remoteAudioStats.concealmentEvent));
        map.put("decSampleRate", Integer.valueOf(remoteAudioStats.decSampleRate));
        map.put("decDuration", Integer.valueOf(remoteAudioStats.decDuration));
        map.put("jitter", Integer.valueOf(remoteAudioStats.jitter));
        return map;
    }

    public static Map<String, ?> from(RemoteStreamStats remoteStreamStats) {
        HashMap map = new HashMap();
        map.put("audioStats", from(remoteStreamStats.audioStats));
        map.put("videoStats", from(remoteStreamStats.videoStats));
        map.put("uid", remoteStreamStats.uid);
        map.put("isScreen", Boolean.valueOf(remoteStreamStats.isScreen));
        return map;
    }

    public static Map<String, ?> from(RemoteStreamSwitch remoteStreamSwitch) {
        HashMap map = new HashMap();
        map.put("uid", remoteStreamSwitch.uid);
        map.put("isScreen", Boolean.valueOf(remoteStreamSwitch.isScreen));
        map.put("beforeVideoIndex", Integer.valueOf(remoteStreamSwitch.beforeVideoIndex));
        map.put("afterVideoIndex", Integer.valueOf(remoteStreamSwitch.afterVideoIndex));
        map.put("beforeEnable", Boolean.valueOf(remoteStreamSwitch.beforeEnable));
        map.put("afterEnable", Boolean.valueOf(remoteStreamSwitch.afterEnable));
        map.put("reason", Integer.valueOf(remoteStreamSwitch.reason.value()));
        return map;
    }

    public static Map<String, ?> from(RemoteVideoStats remoteVideoStats) {
        HashMap map = new HashMap();
        map.put("width", Integer.valueOf(remoteVideoStats.width));
        map.put("height", Integer.valueOf(remoteVideoStats.height));
        map.put("videoLossRate", Float.valueOf(remoteVideoStats.videoLossRate));
        map.put("receivedKBitrate", Float.valueOf(remoteVideoStats.receivedKBitrate));
        map.put("decoderOutputFrameRate", Integer.valueOf(remoteVideoStats.decoderOutputFrameRate));
        map.put("renderOutputFrameRate", Integer.valueOf(remoteVideoStats.rendererOutputFrameRate));
        map.put("stallCount", Integer.valueOf(remoteVideoStats.stallCount));
        map.put("stallDuration", Integer.valueOf(remoteVideoStats.stallDuration));
        map.put("e2eDelay", Long.valueOf(remoteVideoStats.e2eDelay));
        map.put("isScreen", Boolean.valueOf(remoteVideoStats.isScreen));
        map.put("statsInterval", Integer.valueOf(remoteVideoStats.statsInterval));
        map.put("rtt", Integer.valueOf(remoteVideoStats.rtt));
        map.put("frozenRate", Integer.valueOf(remoteVideoStats.frozenRate));
        map.put("videoIndex", Integer.valueOf(remoteVideoStats.videoIndex));
        map.put("codecType", Integer.valueOf(remoteVideoStats.codecType));
        return map;
    }

    public static Map<?, ?> from(RtcUser rtcUser) {
        HashMap map = new HashMap();
        map.put("uid", rtcUser.userId);
        map.put("metaData", rtcUser.metaData);
        return map;
    }

    public static Map<String, ?> from(SourceWantedData sourceWantedData) {
        HashMap map = new HashMap();
        map.put("width", Integer.valueOf(sourceWantedData.width));
        map.put("height", Integer.valueOf(sourceWantedData.height));
        map.put("frameRate", Integer.valueOf(sourceWantedData.frameRate));
        return map;
    }

    public static Map<String, ?> from(DownloadResult downloadResult) {
        HashMap map = new HashMap();
        map.put("musicId", downloadResult.musicId);
        map.put("fileType", Integer.valueOf(downloadResult.fileType.value()));
        String str = downloadResult.filePath;
        if (str != null) {
            map.put(Progress.E, str);
        }
        return map;
    }

    public static Map<String, ?> from(MusicInfo musicInfo) {
        HashMap map = new HashMap();
        map.put("musicId", musicInfo.musicId);
        map.put("musicName", musicInfo.musicName);
        map.put("singer", musicInfo.singer);
        map.put("vendorId", musicInfo.vendorId);
        map.put("vendorName", musicInfo.vendorName);
        map.put("updateTimestamp", Long.valueOf(musicInfo.updateTimestamp));
        map.put("posterUrl", musicInfo.posterUrl);
        map.put("lyricStatus", Integer.valueOf(musicInfo.lyricStatus.value()));
        map.put("duration", Integer.valueOf(musicInfo.duration));
        map.put("enableScore", Boolean.valueOf(musicInfo.enableScore));
        map.put("climaxStartTime", Integer.valueOf(musicInfo.climaxStartTime));
        map.put("climaxEndTime", Integer.valueOf(musicInfo.climaxEndTime));
        return map;
    }
}
