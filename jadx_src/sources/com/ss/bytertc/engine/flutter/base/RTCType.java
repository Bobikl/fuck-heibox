package com.ss.bytertc.engine.flutter.base;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import com.google.android.exoplayer2.text.ttml.d;
import com.google.android.gms.common.m;
import com.max.mediaselector.lib.config.b;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.ss.bytertc.engine.RTCRoomConfig;
import com.ss.bytertc.engine.ScreenVideoEncoderConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioEffectPlayerConfig;
import com.ss.bytertc.engine.data.AudioFrameSource;
import com.ss.bytertc.engine.data.AudioMixingConfig;
import com.ss.bytertc.engine.data.AudioMixingType;
import com.ss.bytertc.engine.data.AudioPropertiesConfig;
import com.ss.bytertc.engine.data.AudioPropertiesMode;
import com.ss.bytertc.engine.data.AudioQuality;
import com.ss.bytertc.engine.data.AudioRecordingConfig;
import com.ss.bytertc.engine.data.AudioReportMode;
import com.ss.bytertc.engine.data.AudioSampleRate;
import com.ss.bytertc.engine.data.CloudProxyInfo;
import com.ss.bytertc.engine.data.EchoTestConfig;
import com.ss.bytertc.engine.data.ForwardStreamInfo;
import com.ss.bytertc.engine.data.HumanOrientation;
import com.ss.bytertc.engine.data.LocalLogLevel;
import com.ss.bytertc.engine.data.MediaPlayerConfig;
import com.ss.bytertc.engine.data.MulDimSingScoringMode;
import com.ss.bytertc.engine.data.Orientation;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.data.PositionInfo;
import com.ss.bytertc.engine.data.RTCASRConfig;
import com.ss.bytertc.engine.data.RTCLogConfig;
import com.ss.bytertc.engine.data.ReceiveRange;
import com.ss.bytertc.engine.data.RecordingConfig;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.RemoteVideoConfig;
import com.ss.bytertc.engine.data.SingScoringConfig;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamSycnInfoConfig;
import com.ss.bytertc.engine.data.VirtualBackgroundSource;
import com.ss.bytertc.engine.data.VirtualBackgroundSourceType;
import com.ss.bytertc.engine.live.ByteRTCStreamMixingType;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.live.PushSingleStreamParam;
import com.ss.bytertc.engine.publicstream.PublicStreaming;
import com.ss.bytertc.engine.type.AttenuationType;
import com.ss.bytertc.engine.type.AudioSelectionPriority;
import com.ss.bytertc.engine.type.ChannelProfile;
import com.ss.bytertc.engine.type.LocalProxyConfiguration;
import com.ss.bytertc.engine.type.LocalProxyType;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.MediaTypeEnhancementConfig;
import com.ss.bytertc.engine.type.PauseResumeControlMediaType;
import com.ss.bytertc.engine.type.ProblemFeedbackInfo;
import com.ss.bytertc.engine.type.ProblemFeedbackOption;
import com.ss.bytertc.engine.type.ProblemFeedbackRoomInfo;
import com.ss.bytertc.engine.type.PublishFallbackOption;
import com.ss.bytertc.engine.type.RecordingFileType;
import com.ss.bytertc.engine.type.RemoteUserPriority;
import com.ss.bytertc.engine.type.SubscribeFallbackOptions;
import com.ss.bytertc.engine.type.SubtitleConfig;
import com.ss.bytertc.engine.type.SubtitleMode;
import com.ss.bytertc.engine.type.TorchState;
import com.ss.bytertc.engine.type.VoiceEqualizationBandFrequency;
import com.ss.bytertc.engine.type.VoiceEqualizationConfig;
import com.ss.bytertc.engine.type.VoiceReverbConfig;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.video.ByteWatermark;
import com.ss.bytertc.engine.video.RTCWatermarkConfig;
import com.ss.bytertc.engine.video.VideoCaptureConfig;
import com.ss.bytertc.ktv.data.MusicFilterType;
import com.ss.bytertc.ktv.data.MusicHotType;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.tools.ant.types.selectors.o;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RTCType {
    @n0
    public static LiveTranscoding.AACProfile toAACProfile(String str) {
        for (LiveTranscoding.AACProfile aACProfile : LiveTranscoding.AACProfile.values()) {
            if (aACProfile.getValue().equals(str)) {
                return aACProfile;
            }
        }
        throw new IllegalArgumentException("Unknown LiveTranscoding.AACProfile value: " + str);
    }

    @n0
    public static RTCASRConfig.ASRAuthorizationType toASRAuthorizationType(int i10) {
        for (RTCASRConfig.ASRAuthorizationType aSRAuthorizationType : RTCASRConfig.ASRAuthorizationType.values()) {
            if (aSRAuthorizationType.value() == i10) {
                return aSRAuthorizationType;
            }
        }
        throw new IllegalArgumentException("Unknown RTCASRConfig.ASRAuthorizationType value: " + i10);
    }

    public static AttenuationType toAttenuationType(int i10) {
        for (AttenuationType attenuationType : AttenuationType.values()) {
            if (i10 == attenuationType.value()) {
                return attenuationType;
            }
        }
        throw new IllegalArgumentException("Unknown AttenuationType value: " + i10);
    }

    @n0
    public static LiveTranscoding.AudioConfig.AudioCodecType toAudioCodecType(String str) {
        for (LiveTranscoding.AudioConfig.AudioCodecType audioCodecType : LiveTranscoding.AudioConfig.AudioCodecType.values()) {
            if (audioCodecType.getValue().equals(str)) {
                return audioCodecType;
            }
        }
        throw new IllegalArgumentException("Unknown LiveTranscoding.AudioConfig.AudioCodecType value: " + str);
    }

    public static AudioEffectPlayerConfig toAudioEffectPlayerConfig(RTCTypeBox rTCTypeBox) {
        return new AudioEffectPlayerConfig(AudioMixingType.fromId(rTCTypeBox.optInt("type")), rTCTypeBox.optInt("playCount"), rTCTypeBox.optInt("startPos"), rTCTypeBox.optInt("pitch"));
    }

    public static AudioFrame toAudioFrame(RTCTypeBox rTCTypeBox) {
        return new AudioFrame(rTCTypeBox.optBytes("buffer"), rTCTypeBox.optInt("samples"), AudioSampleRate.fromId(rTCTypeBox.optInt("sampleRate")), AudioChannel.fromId(rTCTypeBox.optInt("channel")));
    }

    public static AudioMixingConfig toAudioMixingConfig(RTCTypeBox rTCTypeBox) {
        AudioMixingConfig audioMixingConfig = new AudioMixingConfig(AudioMixingType.fromId(rTCTypeBox.optInt("type")), rTCTypeBox.optInt("playCount"), rTCTypeBox.optInt(CommonNetImpl.POSITION), rTCTypeBox.optInt("callbackOnProgressInterval"));
        audioMixingConfig.syncProgressToRecordFrame = rTCTypeBox.optBoolean("syncProgressToRecordFrame");
        return audioMixingConfig;
    }

    public static AudioPropertiesConfig toAudioPropertiesConfig(RTCTypeBox rTCTypeBox) {
        AudioPropertiesConfig audioPropertiesConfig = new AudioPropertiesConfig(rTCTypeBox.optInt(ak.aT), rTCTypeBox.optBoolean("enableSpectrum"), rTCTypeBox.optBoolean("enableVad"), AudioReportMode.fromId(rTCTypeBox.optInt("localMainReportMode")), rTCTypeBox.optFloat("smooth"), toAudioPropertiesMode(rTCTypeBox.optInt("audioReportMode")));
        audioPropertiesConfig.enableVoicePitch = rTCTypeBox.optBoolean("enableVoicePitch");
        return audioPropertiesConfig;
    }

    public static AudioPropertiesMode toAudioPropertiesMode(int i10) {
        for (AudioPropertiesMode audioPropertiesMode : AudioPropertiesMode.values()) {
            if (i10 == audioPropertiesMode.value()) {
                return audioPropertiesMode;
            }
        }
        throw new IllegalArgumentException("Unknown AudioPropertiesMode value: " + i10);
    }

    public static AudioRecordingConfig toAudioRecordingConfig(RTCTypeBox rTCTypeBox) {
        return new AudioRecordingConfig(rTCTypeBox.optString("absoluteFileName"), AudioSampleRate.fromId(rTCTypeBox.optInt("sampleRate")), AudioChannel.fromId(rTCTypeBox.optInt("channel")), AudioFrameSource.fromId(rTCTypeBox.optInt("frameSource")), AudioQuality.fromId(rTCTypeBox.optInt("quality")));
    }

    public static AudioSelectionPriority toAudioSelectionPriority(int i10) {
        for (AudioSelectionPriority audioSelectionPriority : AudioSelectionPriority.values()) {
            if (i10 == audioSelectionPriority.value()) {
                return audioSelectionPriority;
            }
        }
        throw new IllegalArgumentException("Unknown AudioSelectionPriority value: " + i10);
    }

    public static Orientation toByteOrientation(RTCTypeBox rTCTypeBox) {
        return new Orientation(rTCTypeBox.optFloat("x"), rTCTypeBox.optFloat("y"), rTCTypeBox.optFloat(ak.aD));
    }

    public static Position toBytePosition(RTCTypeBox rTCTypeBox) {
        return new Position(rTCTypeBox.optFloat("x"), rTCTypeBox.optFloat("y"), rTCTypeBox.optFloat(ak.aD));
    }

    private static ByteWatermark toByteWatermark(RTCTypeBox rTCTypeBox) {
        return new ByteWatermark(rTCTypeBox.optFloat("x"), rTCTypeBox.optFloat("y"), rTCTypeBox.optFloat("width"), rTCTypeBox.optFloat("height"));
    }

    public static CloudProxyInfo toCloudProxy(RTCTypeBox rTCTypeBox) {
        return new CloudProxyInfo(rTCTypeBox.optString("cloudProxyIp"), rTCTypeBox.optInt("cloudProxyPort"));
    }

    public static List<CloudProxyInfo> toCloudProxyInfoList(List<?> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toCloudProxy(new RTCTypeBox(it.next())));
        }
        return arrayList;
    }

    public static LiveTranscoding.Region.DataParam toDataParam(RTCTypeBox rTCTypeBox) {
        LiveTranscoding.Region.DataParam dataParam = new LiveTranscoding.Region.DataParam();
        dataParam.setImageWidth(rTCTypeBox.optInt(b.f75075c));
        dataParam.setImageHeight(rTCTypeBox.optInt(b.f75076d));
        return dataParam;
    }

    public static EchoTestConfig toEchoTestConfig(RTCTypeBox rTCTypeBox) {
        return new EchoTestConfig(null, rTCTypeBox.optString("uid"), rTCTypeBox.optString("roomId"), rTCTypeBox.optString("token"), rTCTypeBox.optBoolean("enableAudio"), rTCTypeBox.optBoolean("enableVideo"), rTCTypeBox.optInt("audioReportInterval"));
    }

    @n0
    public static VideoEncoderConfig.EncoderPreference toEncoderPreference(int i10) {
        for (VideoEncoderConfig.EncoderPreference encoderPreference : VideoEncoderConfig.EncoderPreference.values()) {
            if (encoderPreference.getValue() == i10) {
                return encoderPreference;
            }
        }
        throw new IllegalArgumentException("Unknown VideoEncoderConfig.EncoderPreference value: " + i10);
    }

    public static List<ProblemFeedbackOption> toFeedBackList(List<Integer> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ProblemFeedbackOption.fromId(it.next().intValue()));
        }
        return arrayList;
    }

    public static ProblemFeedbackInfo toFeedbackInfo(RTCTypeBox rTCTypeBox) {
        if (rTCTypeBox == null || rTCTypeBox.arguments == null) {
            return null;
        }
        ProblemFeedbackInfo problemFeedbackInfo = new ProblemFeedbackInfo();
        problemFeedbackInfo.problemDesc = rTCTypeBox.optString("problemDesc");
        List list = rTCTypeBox.getList("roomInfo");
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toFeedbackRoomInfo(new RTCTypeBox(it.next())));
            }
            problemFeedbackInfo.roomInfo = arrayList;
        }
        return problemFeedbackInfo;
    }

    public static ProblemFeedbackRoomInfo toFeedbackRoomInfo(RTCTypeBox rTCTypeBox) {
        return new ProblemFeedbackRoomInfo(rTCTypeBox.optString("roomId"), rTCTypeBox.optString("uid"));
    }

    public static ForwardStreamInfo toForwardStreamInfo(RTCTypeBox rTCTypeBox) {
        return new ForwardStreamInfo(rTCTypeBox.optString("roomId"), rTCTypeBox.optString("token"));
    }

    public static List<ForwardStreamInfo> toForwardStreamInfoList(List<?> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toForwardStreamInfo(new RTCTypeBox(it.next())));
        }
        return arrayList;
    }

    public static HumanOrientation toHumanOrientation(RTCTypeBox rTCTypeBox) {
        return new HumanOrientation(toByteOrientation(rTCTypeBox.optBox("forward")), toByteOrientation(rTCTypeBox.optBox(d.f49796n0)), toByteOrientation(rTCTypeBox.optBox(CommonNetImpl.UP)));
    }

    public static PublicStreaming.Layout toLayout(RTCTypeBox rTCTypeBox) {
        PublicStreaming.Layout layout = new PublicStreaming.Layout();
        layout.setInterpolationMode(rTCTypeBox.optInt("interpolationMode"));
        layout.setLayoutMode(rTCTypeBox.optInt("layoutMode"));
        layout.setBackgroundColor(rTCTypeBox.optString("backgroundImage"));
        layout.setBackgroundImage(rTCTypeBox.optString(d.H));
        layout.setRegions(toRegionsArray(rTCTypeBox.getList("regions")));
        return layout;
    }

    public static LiveTranscoding.AudioConfig toLiveAudioConfig(RTCTypeBox rTCTypeBox) {
        LiveTranscoding.AudioConfig audioConfig = new LiveTranscoding.AudioConfig();
        audioConfig.setAacProfile(toAACProfile(rTCTypeBox.optString("aacProfile")));
        audioConfig.setChannels(rTCTypeBox.optInt(com.max.xiaoheihe.module.bbs.utils.b.f83401f));
        audioConfig.setSampleRate(rTCTypeBox.optInt("sampleRate"));
        audioConfig.setCodec(toAudioCodecType(rTCTypeBox.optString("codec")));
        audioConfig.setKBitRate(rTCTypeBox.optInt("kBitrate"));
        return audioConfig;
    }

    public static LiveTranscoding.Layout toLiveLayout(RTCTypeBox rTCTypeBox) {
        LiveTranscoding.Layout layout = new LiveTranscoding.Layout();
        layout.setAppData(rTCTypeBox.optString("appData"));
        layout.setBackgroundColor(rTCTypeBox.optString(d.H));
        List list = rTCTypeBox.getList("regions");
        LiveTranscoding.Region[] regionArr = new LiveTranscoding.Region[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            regionArr[i10] = toLiveLayoutRegion(new RTCTypeBox(list.get(i10)));
        }
        layout.setRegions(regionArr);
        return layout;
    }

    public static LiveTranscoding.Region toLiveLayoutRegion(RTCTypeBox rTCTypeBox) {
        LiveTranscoding.Region region = new LiveTranscoding.Region();
        region.uid(rTCTypeBox.optString("uid"));
        region.roomId(rTCTypeBox.optString("roomId"));
        region.position(rTCTypeBox.optDouble("x"), rTCTypeBox.optDouble("y"));
        region.size(rTCTypeBox.optDouble(RXScreenCaptureService.KEY_WIDTH), rTCTypeBox.optDouble(RXScreenCaptureService.KEY_HEIGHT));
        region.zorder(rTCTypeBox.optInt("zorder"));
        region.alpha(rTCTypeBox.optDouble("alpha"));
        region.contentControl(toTranscoderContentControlType(rTCTypeBox.optInt("contentControl")));
        region.renderMode(toTranscoderRenderMode(rTCTypeBox.optInt("renderMode")));
        region.setLocalUser(rTCTypeBox.optBoolean("localUser"));
        region.setScreenStream(rTCTypeBox.optBoolean("isScreen"));
        region.setCornerRadius(rTCTypeBox.optDouble("cornerRadius"));
        Position bytePosition = toBytePosition(rTCTypeBox.optBox("spatialPosition"));
        region.spatialPosition(bytePosition.f97942x, bytePosition.f97943y, bytePosition.f97944z);
        region.applySpatialAudio(rTCTypeBox.optBoolean("applySpatialAudio"));
        region.type(toTranscoderLayoutRegionType(rTCTypeBox.optInt("type")));
        region.data(rTCTypeBox.optBytes("data", null));
        RTCTypeBox rTCTypeBoxOptBox = rTCTypeBox.optBox("dataParam");
        if (rTCTypeBoxOptBox.arguments != null) {
            region.dataParam(toDataParam(rTCTypeBoxOptBox));
        }
        return region;
    }

    public static LiveTranscoding.SpatialConfig toLiveSpatialConfig(RTCTypeBox rTCTypeBox) {
        LiveTranscoding.SpatialConfig spatialConfig = new LiveTranscoding.SpatialConfig();
        spatialConfig.setAudienceSpatialOrientation(toHumanOrientation(rTCTypeBox.optBox("orientation")));
        spatialConfig.setAudienceSpatialPosition(toBytePosition(rTCTypeBox.optBox(CommonNetImpl.POSITION)));
        spatialConfig.setEnableSpatialRender(rTCTypeBox.optBoolean("enableSpatialRender"));
        return spatialConfig;
    }

    public static LiveTranscoding toLiveTranscoding(RTCTypeBox rTCTypeBox) {
        LiveTranscoding defualtLiveTranscode = LiveTranscoding.getDefualtLiveTranscode();
        defualtLiveTranscode.setUrl(rTCTypeBox.optString("url"));
        defualtLiveTranscode.setRoomId(rTCTypeBox.optString("roomId"));
        defualtLiveTranscode.setUserId(rTCTypeBox.optString("uid"));
        defualtLiveTranscode.setMixType(ByteRTCStreamMixingType.fromId(rTCTypeBox.optInt("mixType")));
        defualtLiveTranscode.setVideo(toLiveVideoConfig(rTCTypeBox.optBox("video")));
        defualtLiveTranscode.setLayout(toLiveLayout(rTCTypeBox.optBox(d.f49813w)));
        defualtLiveTranscode.setAudio(toLiveAudioConfig(rTCTypeBox.optBox("audio")));
        defualtLiveTranscode.setSpatialConfig(toLiveSpatialConfig(rTCTypeBox.optBox("spatialConfig")));
        return defualtLiveTranscode;
    }

    public static LiveTranscoding.VideoConfig toLiveVideoConfig(RTCTypeBox rTCTypeBox) {
        LiveTranscoding.VideoConfig videoConfig = new LiveTranscoding.VideoConfig();
        videoConfig.setCodec(toVideoCodecType(rTCTypeBox.optString("codec")));
        videoConfig.setFps(rTCTypeBox.optInt("fps"));
        videoConfig.setGop(rTCTypeBox.optInt("gop"));
        videoConfig.setBFrame(rTCTypeBox.optBoolean("bFrame"));
        videoConfig.setKBitRate(rTCTypeBox.optInt("kBitrate"));
        videoConfig.setWidth(rTCTypeBox.optInt("width"));
        videoConfig.setHeight(rTCTypeBox.optInt("height"));
        return videoConfig;
    }

    public static List<LocalProxyConfiguration> toLocalProxyConfigurations(List<?> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            RTCTypeBox rTCTypeBox = new RTCTypeBox(it.next());
            arrayList.add(new LocalProxyConfiguration(LocalProxyType.fromId(rTCTypeBox.optInt("localProxyType")), rTCTypeBox.optString("localProxyIp"), rTCTypeBox.optInt("localProxyPort"), rTCTypeBox.optString("localProxyUsername"), rTCTypeBox.optString("localProxyPassword")));
        }
        return arrayList;
    }

    public static RTCLogConfig toLogConfig(RTCTypeBox rTCTypeBox) {
        return new RTCLogConfig(LocalLogLevel.fromId(rTCTypeBox.optInt("logLevel")), rTCTypeBox.optString("logPath"), rTCTypeBox.optInt("logFileSize"), rTCTypeBox.optString("logFilenamePrefix"));
    }

    public static MediaPlayerConfig toMediaPlayerConfig(RTCTypeBox rTCTypeBox) {
        return new MediaPlayerConfig(AudioMixingType.fromId(rTCTypeBox.optInt("type")), rTCTypeBox.optInt("playCount"), rTCTypeBox.optInt("startPos"), rTCTypeBox.optBoolean("autoPlay"), rTCTypeBox.optLong("callbackOnProgressInterval"), rTCTypeBox.optBoolean("syncProgressToRecordFrame"));
    }

    @n0
    public static MediaStreamType toMediaStreamType(int i10) {
        MediaStreamType mediaStreamTypeValueOf = MediaStreamType.valueOf(i10);
        if (mediaStreamTypeValueOf != null) {
            return mediaStreamTypeValueOf;
        }
        throw new IllegalArgumentException("Unknown MediaStreamType value: " + i10);
    }

    public static MediaTypeEnhancementConfig toMediaTypeEnhancementConfig(RTCTypeBox rTCTypeBox) {
        return new MediaTypeEnhancementConfig(rTCTypeBox.optBoolean("enhanceSignaling"), rTCTypeBox.optBoolean("enhanceAudio"), rTCTypeBox.optBoolean("enhanceVideo"), rTCTypeBox.optBoolean("enhanceScreenAudio"), rTCTypeBox.optBoolean("enhanceScreenVideo"));
    }

    @n0
    public static MixedStreamConfig.MixedStreamAlternateImageFillMode toMixedStreamAlternateImageFillMode(int i10) {
        for (MixedStreamConfig.MixedStreamAlternateImageFillMode mixedStreamAlternateImageFillMode : MixedStreamConfig.MixedStreamAlternateImageFillMode.values()) {
            if (mixedStreamAlternateImageFillMode.getValue() == i10) {
                return mixedStreamAlternateImageFillMode;
            }
        }
        throw new IllegalArgumentException("Unknown MixedStreamAlternateImageFillMode value: " + i10);
    }

    public static MixedStreamConfig.MixedStreamAudioConfig toMixedStreamAudioConfig(RTCTypeBox rTCTypeBox) {
        MixedStreamConfig.MixedStreamAudioConfig mixedStreamAudioConfig = new MixedStreamConfig.MixedStreamAudioConfig();
        mixedStreamAudioConfig.setChannels(rTCTypeBox.optInt(com.max.xiaoheihe.module.bbs.utils.b.f83401f));
        mixedStreamAudioConfig.setSampleRate(rTCTypeBox.optInt("sampleRate"));
        mixedStreamAudioConfig.setBitrate(rTCTypeBox.optInt("bitrate"));
        mixedStreamAudioConfig.setAudioProfile(toMixedStreamAudioProfile(rTCTypeBox.optInt("audioProfile")));
        return mixedStreamAudioConfig;
    }

    public static MixedStreamConfig.MixedStreamAudioProfile toMixedStreamAudioProfile(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC : MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_HEV2;
        }
        return MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_HEV1;
    }

    public static MixedStreamConfig toMixedStreamConfig(RTCTypeBox rTCTypeBox) {
        MixedStreamConfig mixedStreamConfigDefaultMixedStreamConfig = MixedStreamConfig.defaultMixedStreamConfig();
        mixedStreamConfigDefaultMixedStreamConfig.setPushURL(rTCTypeBox.optString("pushURL"));
        mixedStreamConfigDefaultMixedStreamConfig.setRoomID(rTCTypeBox.optString("roomId"));
        mixedStreamConfigDefaultMixedStreamConfig.setUserID(rTCTypeBox.optString("uid"));
        mixedStreamConfigDefaultMixedStreamConfig.setExpectedMixingType(ByteRTCStreamMixingType.fromId(rTCTypeBox.optInt("expectedMixingType")));
        mixedStreamConfigDefaultMixedStreamConfig.setAudioConfig(toMixedStreamAudioConfig(rTCTypeBox.optBox("audioConfig")));
        mixedStreamConfigDefaultMixedStreamConfig.setVideoConfig(toMixedStreamVideoConfig(rTCTypeBox.optBox("videoConfig")));
        mixedStreamConfigDefaultMixedStreamConfig.setLayout(toMixedStreamLayoutConfig(rTCTypeBox.optBox(d.f49813w)));
        mixedStreamConfigDefaultMixedStreamConfig.setSpatialConfig(toMixedStreamSpatialConfig(rTCTypeBox.optBox("spatialConfig")));
        mixedStreamConfigDefaultMixedStreamConfig.setServerControlConfig(toMixedStreamServerControlConfig(rTCTypeBox.optBox("serverControlConfig")));
        return mixedStreamConfigDefaultMixedStreamConfig;
    }

    public static MixedStreamConfig.MixedStreamLayoutConfig toMixedStreamLayoutConfig(RTCTypeBox rTCTypeBox) {
        MixedStreamConfig.MixedStreamLayoutConfig mixedStreamLayoutConfig = new MixedStreamConfig.MixedStreamLayoutConfig();
        mixedStreamLayoutConfig.setBackgroundColor(rTCTypeBox.optString(d.H));
        mixedStreamLayoutConfig.setBackgroundImageURL(rTCTypeBox.optString("backgroundImageUrl"));
        mixedStreamLayoutConfig.setUserConfigExtraInfo(rTCTypeBox.optString("userConfigExtraInfo"));
        List list = rTCTypeBox.getList("regions");
        MixedStreamConfig.MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr = new MixedStreamConfig.MixedStreamLayoutRegionConfig[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            mixedStreamLayoutRegionConfigArr[i10] = toMixedStreamLayoutRegionConfig(new RTCTypeBox(list.get(i10)));
        }
        mixedStreamLayoutConfig.setRegions(mixedStreamLayoutRegionConfigArr);
        return mixedStreamLayoutConfig;
    }

    public static MixedStreamConfig.MixedStreamLayoutRegionConfig toMixedStreamLayoutRegionConfig(RTCTypeBox rTCTypeBox) {
        MixedStreamConfig.MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig = new MixedStreamConfig.MixedStreamLayoutRegionConfig();
        mixedStreamLayoutRegionConfig.setUserID(rTCTypeBox.optString("uid"));
        mixedStreamLayoutRegionConfig.setRoomID(rTCTypeBox.optString("roomId"));
        mixedStreamLayoutRegionConfig.setLocationX(rTCTypeBox.optInt("locationX"));
        mixedStreamLayoutRegionConfig.setLocationY(rTCTypeBox.optInt("locationY"));
        mixedStreamLayoutRegionConfig.setWidth(rTCTypeBox.optInt("width"));
        mixedStreamLayoutRegionConfig.setHeight(rTCTypeBox.optInt("height"));
        mixedStreamLayoutRegionConfig.setZOrder(rTCTypeBox.optInt("zOrder"));
        mixedStreamLayoutRegionConfig.setAlpha(rTCTypeBox.optDouble("alpha"));
        mixedStreamLayoutRegionConfig.setCornerRadius(rTCTypeBox.optDouble("cornerRadius"));
        mixedStreamLayoutRegionConfig.setMediaType(toMixedStreamMediaType(rTCTypeBox.optInt("mediaType")));
        mixedStreamLayoutRegionConfig.setRenderMode(toMixedStreamRenderMode(rTCTypeBox.optInt("renderMode")));
        mixedStreamLayoutRegionConfig.setAlternateImageFillMode(toMixedStreamAlternateImageFillMode(rTCTypeBox.optInt("alternateImageFillMode")));
        mixedStreamLayoutRegionConfig.setAlternateImageURL(rTCTypeBox.optString("alternateImageUrl"));
        mixedStreamLayoutRegionConfig.setIsLocalUser(rTCTypeBox.optBoolean("isLocalUser"));
        mixedStreamLayoutRegionConfig.setStreamType(toMixedStreamVideoType(rTCTypeBox.optInt("streamType")));
        mixedStreamLayoutRegionConfig.setRegionContentType(toMixedStreamLayoutRegionType(rTCTypeBox.optInt("regionContentType")));
        mixedStreamLayoutRegionConfig.setSpatialPosition(toBytePosition(rTCTypeBox.optBox("spatialPosition")));
        mixedStreamLayoutRegionConfig.setApplySpatialAudio(rTCTypeBox.optBoolean("applySpatialAudio"));
        mixedStreamLayoutRegionConfig.setImageWaterMark(rTCTypeBox.optBytes("imageWaterMark", null));
        RTCTypeBox rTCTypeBoxOptBox = rTCTypeBox.optBox("imageWaterMarkConfig");
        if (rTCTypeBoxOptBox.arguments != null) {
            mixedStreamLayoutRegionConfig.setImageWaterMarkConfig(toMixedStreamLayoutRegionImageWaterMarkConfig(rTCTypeBoxOptBox));
        }
        return mixedStreamLayoutRegionConfig;
    }

    public static MixedStreamConfig.MixedStreamLayoutRegionConfig.MixedStreamLayoutRegionImageWaterMarkConfig toMixedStreamLayoutRegionImageWaterMarkConfig(RTCTypeBox rTCTypeBox) {
        return new MixedStreamConfig.MixedStreamLayoutRegionConfig.MixedStreamLayoutRegionImageWaterMarkConfig(rTCTypeBox.optInt(b.f75075c), rTCTypeBox.optInt(b.f75076d));
    }

    @n0
    public static MixedStreamConfig.MixedStreamLayoutRegionType toMixedStreamLayoutRegionType(int i10) {
        for (MixedStreamConfig.MixedStreamLayoutRegionType mixedStreamLayoutRegionType : MixedStreamConfig.MixedStreamLayoutRegionType.values()) {
            if (mixedStreamLayoutRegionType.getValue() == i10) {
                return mixedStreamLayoutRegionType;
            }
        }
        throw new IllegalArgumentException("Unknown MixedStreamLayoutRegionType value: " + i10);
    }

    @n0
    public static MixedStreamConfig.MixedStreamMediaType toMixedStreamMediaType(int i10) {
        for (MixedStreamConfig.MixedStreamMediaType mixedStreamMediaType : MixedStreamConfig.MixedStreamMediaType.values()) {
            if (mixedStreamMediaType.getValue() == i10) {
                return mixedStreamMediaType;
            }
        }
        throw new IllegalArgumentException("Unknown MixedStreamMediaType value: " + i10);
    }

    @n0
    public static MixedStreamConfig.MixedStreamPushMode toMixedStreamPushMode(int i10) {
        for (MixedStreamConfig.MixedStreamPushMode mixedStreamPushMode : MixedStreamConfig.MixedStreamPushMode.values()) {
            if (mixedStreamPushMode.getValue() == i10) {
                return mixedStreamPushMode;
            }
        }
        throw new IllegalArgumentException("Unknown MixedStreamPushMode value: " + i10);
    }

    @n0
    public static MixedStreamConfig.MixedStreamRenderMode toMixedStreamRenderMode(int i10) {
        for (MixedStreamConfig.MixedStreamRenderMode mixedStreamRenderMode : MixedStreamConfig.MixedStreamRenderMode.values()) {
            if (mixedStreamRenderMode.getValue() == i10) {
                return mixedStreamRenderMode;
            }
        }
        throw new IllegalArgumentException("Unknown MixedStreamRenderMode value: " + i10);
    }

    @n0
    public static MixedStreamConfig.MixedStreamSEIContentMode toMixedStreamSEIContentMode(int i10) {
        for (MixedStreamConfig.MixedStreamSEIContentMode mixedStreamSEIContentMode : MixedStreamConfig.MixedStreamSEIContentMode.values()) {
            if (mixedStreamSEIContentMode.getValue() == i10) {
                return mixedStreamSEIContentMode;
            }
        }
        throw new IllegalArgumentException("Unknown MixedStreamSEIContentMode value: " + i10);
    }

    public static MixedStreamConfig.MixedStreamServerControlConfig toMixedStreamServerControlConfig(RTCTypeBox rTCTypeBox) {
        MixedStreamConfig.MixedStreamServerControlConfig mixedStreamServerControlConfig = new MixedStreamConfig.MixedStreamServerControlConfig();
        mixedStreamServerControlConfig.setEnableVolumeIndication(rTCTypeBox.optBoolean("enableVolumeIndication"));
        mixedStreamServerControlConfig.setVolumeIndicationInterval(rTCTypeBox.optFloat("volumeIndicationInterval"));
        mixedStreamServerControlConfig.setTalkVolume(rTCTypeBox.optInt("talkVolume"));
        mixedStreamServerControlConfig.setIsAddVolumeValue(rTCTypeBox.optBoolean("isAddVolumeValue"));
        mixedStreamServerControlConfig.setSeiContentMode(toMixedStreamSEIContentMode(rTCTypeBox.optInt("seiContentMode")));
        mixedStreamServerControlConfig.setSeiPayloadType(rTCTypeBox.optInt("seiPayloadType"));
        mixedStreamServerControlConfig.setSeiPayloadUuid(rTCTypeBox.optString("seiPayloadUuid"));
        mixedStreamServerControlConfig.setMediaType(toMixedStreamMediaType(rTCTypeBox.optInt("mediaType")));
        mixedStreamServerControlConfig.setPushStreamMode(toMixedStreamPushMode(rTCTypeBox.optInt("pushStreamMode")));
        return mixedStreamServerControlConfig;
    }

    public static MixedStreamConfig.MixedStreamSpatialConfig toMixedStreamSpatialConfig(RTCTypeBox rTCTypeBox) {
        MixedStreamConfig.MixedStreamSpatialConfig mixedStreamSpatialConfig = new MixedStreamConfig.MixedStreamSpatialConfig();
        mixedStreamSpatialConfig.setAudienceSpatialOrientation(toHumanOrientation(rTCTypeBox.optBox("orientation")));
        mixedStreamSpatialConfig.setAudienceSpatialPosition(toBytePosition(rTCTypeBox.optBox(CommonNetImpl.POSITION)));
        mixedStreamSpatialConfig.setEnableSpatialRender(rTCTypeBox.optBoolean("enableSpatialRender"));
        return mixedStreamSpatialConfig;
    }

    public static MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType toMixedStreamVideoCodecType(int i10) {
        return i10 == 1 ? MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_BYTEVC1 : MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_H264;
    }

    public static MixedStreamConfig.MixedStreamVideoConfig toMixedStreamVideoConfig(RTCTypeBox rTCTypeBox) {
        MixedStreamConfig.MixedStreamVideoConfig mixedStreamVideoConfig = new MixedStreamConfig.MixedStreamVideoConfig();
        mixedStreamVideoConfig.setVideoCodec(toMixedStreamVideoCodecType(rTCTypeBox.optInt("videoCodec")));
        mixedStreamVideoConfig.setFps(rTCTypeBox.optInt("fps"));
        mixedStreamVideoConfig.setGop(rTCTypeBox.optInt("gop"));
        mixedStreamVideoConfig.setBitrate(rTCTypeBox.optInt("bitrate"));
        mixedStreamVideoConfig.setWidth(rTCTypeBox.optInt("width"));
        mixedStreamVideoConfig.setHeight(rTCTypeBox.optInt("height"));
        mixedStreamVideoConfig.setEnableBframe(rTCTypeBox.optBoolean("enableBFrame"));
        return mixedStreamVideoConfig;
    }

    @n0
    public static MixedStreamConfig.MixedStreamLayoutRegionConfig.MixedStreamVideoType toMixedStreamVideoType(int i10) {
        for (MixedStreamConfig.MixedStreamLayoutRegionConfig.MixedStreamVideoType mixedStreamVideoType : MixedStreamConfig.MixedStreamLayoutRegionConfig.MixedStreamVideoType.values()) {
            if (mixedStreamVideoType.getValue() == i10) {
                return mixedStreamVideoType;
            }
        }
        throw new IllegalArgumentException("Unknown MixedStreamVideoType value: " + i10);
    }

    public static MusicFilterType[] toMusicFilterTypes(List<Integer> list) {
        MusicFilterType[] musicFilterTypeArr = new MusicFilterType[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            musicFilterTypeArr[i10] = MusicFilterType.fromId(list.get(i10).intValue());
        }
        return musicFilterTypeArr;
    }

    public static MusicHotType[] toMusicHotTypes(List<Integer> list) {
        MusicHotType[] musicHotTypeArr = new MusicHotType[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            musicHotTypeArr[i10] = MusicHotType.fromId(list.get(i10).intValue());
        }
        return musicHotTypeArr;
    }

    @n0
    public static PauseResumeControlMediaType toPauseResumeControlMediaType(int i10) {
        return PauseResumeControlMediaType.values()[i10];
    }

    public static PositionInfo toPositionInfo(RTCTypeBox rTCTypeBox) {
        return new PositionInfo(toBytePosition(rTCTypeBox.optBox(CommonNetImpl.POSITION)), toHumanOrientation(rTCTypeBox.optBox("orientation")));
    }

    public static PublicStreaming toPublicStreaming(RTCTypeBox rTCTypeBox) {
        PublicStreaming publicStreaming = new PublicStreaming();
        publicStreaming.setRoomId(rTCTypeBox.optString("roomId"));
        publicStreaming.setVideo(toStreamingVideoConfig(rTCTypeBox.optBox("video")));
        publicStreaming.setAudio(toStreamingAudioConfig(rTCTypeBox.optBox("audio")));
        publicStreaming.setLayout(toLayout(rTCTypeBox.optBox(d.f49813w)));
        return publicStreaming;
    }

    @n0
    public static PublishFallbackOption toPublishFallbackOption(int i10) {
        for (PublishFallbackOption publishFallbackOption : PublishFallbackOption.values()) {
            if (publishFallbackOption.value() == i10) {
                return publishFallbackOption;
            }
        }
        throw new IllegalArgumentException("Unknown PublishFallbackOption value: " + i10);
    }

    public static PushSingleStreamParam toPushSingleStreamParam(RTCTypeBox rTCTypeBox) {
        return new PushSingleStreamParam(rTCTypeBox.optString("roomId"), rTCTypeBox.optString("uid"), rTCTypeBox.optString("url"), rTCTypeBox.optBoolean("isScreen"));
    }

    public static RTCASRConfig toRTCASRConfig(RTCTypeBox rTCTypeBox) {
        return new RTCASRConfig(rTCTypeBox.optString("uid"), rTCTypeBox.optString("accessToken"), rTCTypeBox.optString("secretKey"), toASRAuthorizationType(rTCTypeBox.optInt("authorizationType")), rTCTypeBox.optString("cluster"), rTCTypeBox.optString("appId"));
    }

    public static RTCRoomConfig toRTCRoomConfig(RTCTypeBox rTCTypeBox) {
        return new RTCRoomConfig(ChannelProfile.fromId(rTCTypeBox.optInt(m.f52595a)), rTCTypeBox.optBoolean("isAutoPublish"), rTCTypeBox.optBoolean("isAutoSubscribeAudio"), rTCTypeBox.optBoolean("isAutoSubscribeVideo"), toRemoteVideoConfig(rTCTypeBox.optBox("remoteVideoConfig")));
    }

    public static RTCWatermarkConfig toRTCWatermarkConfig(RTCTypeBox rTCTypeBox) {
        return new RTCWatermarkConfig(rTCTypeBox.optBoolean("visibleInPreview"), toByteWatermark(rTCTypeBox.optBox("positionInLandscapeMode")), toByteWatermark(rTCTypeBox.optBox("positionInPortraitMode")));
    }

    public static ReceiveRange toReceiveRange(RTCTypeBox rTCTypeBox) {
        return new ReceiveRange(rTCTypeBox.optInt(o.f136588l), rTCTypeBox.optInt(o.f136589m));
    }

    public static RecordingConfig toRecordingConfig(RTCTypeBox rTCTypeBox) {
        return new RecordingConfig(rTCTypeBox.optString("dirPath"), RecordingFileType.fromId(rTCTypeBox.optInt("recordingFileType")));
    }

    public static PublicStreaming.Layout.Region toRegion(RTCTypeBox rTCTypeBox) {
        PublicStreaming.Layout.Region region = new PublicStreaming.Layout.Region();
        region.userId(rTCTypeBox.optString("uid"));
        region.roomId(rTCTypeBox.optString("roomId"));
        region.size(rTCTypeBox.optDouble(RXScreenCaptureService.KEY_WIDTH), rTCTypeBox.optDouble(RXScreenCaptureService.KEY_HEIGHT));
        region.position(rTCTypeBox.optDouble("x"), rTCTypeBox.optDouble("y"));
        region.zorder(rTCTypeBox.optInt("zorder"));
        region.alpha(rTCTypeBox.optDouble("alpha"));
        region.streamType(rTCTypeBox.optInt("streamType"));
        region.mediaType(rTCTypeBox.optInt("mediaType"));
        region.renderMode(rTCTypeBox.optInt("renderMode"));
        RTCTypeBox rTCTypeBoxOptBox = rTCTypeBox.optBox("sourceCrop");
        region.sourceCropPosition(rTCTypeBoxOptBox.optDouble("locationX"), rTCTypeBoxOptBox.optDouble("locationY"));
        region.sourceCropSize(rTCTypeBoxOptBox.optDouble("widthProportion"), rTCTypeBoxOptBox.optDouble("heightProportion"));
        return region;
    }

    public static PublicStreaming.Layout.Region[] toRegionsArray(List<?> list) {
        if (list == null) {
            return null;
        }
        PublicStreaming.Layout.Region[] regionArr = new PublicStreaming.Layout.Region[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            regionArr[i10] = toRegion(new RTCTypeBox(list.get(i10)));
        }
        return regionArr;
    }

    public static RemoteStreamKey toRemoteStreamKey(RTCTypeBox rTCTypeBox) {
        return new RemoteStreamKey(rTCTypeBox.optString("roomId"), rTCTypeBox.optString("uid"), StreamIndex.fromId(rTCTypeBox.optInt("streamIndex")));
    }

    @n0
    public static RemoteUserPriority toRemoteUserPriority(int i10) {
        for (RemoteUserPriority remoteUserPriority : RemoteUserPriority.values()) {
            if (remoteUserPriority.value() == i10) {
                return remoteUserPriority;
            }
        }
        throw new IllegalArgumentException("Unknown RemoteUserPriority value: " + i10);
    }

    public static RemoteVideoConfig toRemoteVideoConfig(RTCTypeBox rTCTypeBox) {
        return new RemoteVideoConfig(rTCTypeBox.optInt("width"), rTCTypeBox.optInt("height"), rTCTypeBox.optInt("frameRate"));
    }

    public static ScreenVideoEncoderConfig toScreenVideoEncoderConfig(RTCTypeBox rTCTypeBox) {
        ScreenVideoEncoderConfig screenVideoEncoderConfig = new ScreenVideoEncoderConfig(rTCTypeBox.optInt("width"), rTCTypeBox.optInt("height"), rTCTypeBox.optInt("frameRate"), rTCTypeBox.optInt("maxBitrate"), rTCTypeBox.optInt("minBitrate"));
        screenVideoEncoderConfig.encodePreference = toScreenVideoEncoderPreference(rTCTypeBox.optInt("encoderPreference"));
        return screenVideoEncoderConfig;
    }

    public static ScreenVideoEncoderConfig.EncoderPreference toScreenVideoEncoderPreference(int i10) {
        for (ScreenVideoEncoderConfig.EncoderPreference encoderPreference : ScreenVideoEncoderConfig.EncoderPreference.values()) {
            if (encoderPreference.getValue() == i10) {
                return encoderPreference;
            }
        }
        throw new IllegalArgumentException("Unknown ScreenVideoEncoderConfig.EncoderPreference value: " + i10);
    }

    public static SingScoringConfig toSingScoringConfig(RTCTypeBox rTCTypeBox) {
        return new SingScoringConfig(AudioSampleRate.fromId(rTCTypeBox.optInt("sampleRate")), MulDimSingScoringMode.MUL_DIM_SING_SCORING_MODE_NOTE, rTCTypeBox.optString("lyricsFilepath"), rTCTypeBox.optString("midiFilepath"));
    }

    public static StreamSycnInfoConfig toStreamSyncInfoConfig(RTCTypeBox rTCTypeBox) {
        return new StreamSycnInfoConfig(StreamIndex.fromId(rTCTypeBox.optInt("streamIndex")), rTCTypeBox.optInt("repeatCount"), StreamSycnInfoConfig.SyncInfoStreamType.SYNC_INFO_STREAM_TYPE_AUDIO);
    }

    public static PublicStreaming.AudioConfig toStreamingAudioConfig(RTCTypeBox rTCTypeBox) {
        PublicStreaming.AudioConfig audioConfig = new PublicStreaming.AudioConfig();
        audioConfig.setKBitRate(rTCTypeBox.optInt("kBitrate"));
        audioConfig.setSampleRate(rTCTypeBox.optInt("sampleRate"));
        audioConfig.setChannels(rTCTypeBox.optInt(com.max.xiaoheihe.module.bbs.utils.b.f83401f));
        return audioConfig;
    }

    public static PublicStreaming.VideoConfig toStreamingVideoConfig(RTCTypeBox rTCTypeBox) {
        PublicStreaming.VideoConfig videoConfig = new PublicStreaming.VideoConfig();
        videoConfig.setWidth(rTCTypeBox.optInt("width"));
        videoConfig.setHeight(rTCTypeBox.optInt("height"));
        videoConfig.setFps(rTCTypeBox.optInt("fps"));
        videoConfig.setKBitRate(rTCTypeBox.optInt("kBitrate"));
        return videoConfig;
    }

    @n0
    public static SubscribeFallbackOptions toSubscribeFallbackOptions(int i10) {
        for (SubscribeFallbackOptions subscribeFallbackOptions : SubscribeFallbackOptions.values()) {
            if (subscribeFallbackOptions.value() == i10) {
                return subscribeFallbackOptions;
            }
        }
        throw new IllegalArgumentException("Unknown SubscribeFallbackOptions value: " + i10);
    }

    public static SubtitleConfig toSubtitleConfig(RTCTypeBox rTCTypeBox) {
        return new SubtitleConfig(SubtitleMode.fromId(rTCTypeBox.optInt("mode")), rTCTypeBox.optString("targetLanguage"));
    }

    public static TorchState toTorchState(int i10) {
        for (TorchState torchState : TorchState.values()) {
            if (i10 == torchState.ordinal()) {
                return torchState;
            }
        }
        throw new IllegalArgumentException("Unknown TorchState value: " + i10);
    }

    @n0
    public static LiveTranscoding.TranscoderContentControlType toTranscoderContentControlType(int i10) {
        for (LiveTranscoding.TranscoderContentControlType transcoderContentControlType : LiveTranscoding.TranscoderContentControlType.values()) {
            if (transcoderContentControlType.getValue() == i10) {
                return transcoderContentControlType;
            }
        }
        throw new IllegalArgumentException("Unknown TranscoderContentControlType value: " + i10);
    }

    public static LiveTranscoding.TranscoderLayoutRegionType toTranscoderLayoutRegionType(int i10) {
        for (LiveTranscoding.TranscoderLayoutRegionType transcoderLayoutRegionType : LiveTranscoding.TranscoderLayoutRegionType.values()) {
            if (transcoderLayoutRegionType.getValue() == i10) {
                return transcoderLayoutRegionType;
            }
        }
        throw new IllegalArgumentException("Unknown TranscoderLayoutRegionType value: " + i10);
    }

    @n0
    public static LiveTranscoding.TranscoderRenderMode toTranscoderRenderMode(int i10) {
        for (LiveTranscoding.TranscoderRenderMode transcoderRenderMode : LiveTranscoding.TranscoderRenderMode.values()) {
            if (transcoderRenderMode.getValue() == i10) {
                return transcoderRenderMode;
            }
        }
        throw new IllegalArgumentException("Unknown TranscoderRenderMode value: " + i10);
    }

    public static UserInfo toUserInfo(RTCTypeBox rTCTypeBox) {
        return new UserInfo(rTCTypeBox.optString("uid"), rTCTypeBox.optString("metaData"));
    }

    public static VideoCaptureConfig toVideoCaptureConfig(RTCTypeBox rTCTypeBox) {
        VideoCaptureConfig videoCaptureConfig = new VideoCaptureConfig(rTCTypeBox.optInt("width"), rTCTypeBox.optInt("height"), rTCTypeBox.optInt("frameRate"));
        videoCaptureConfig.capturePreference = VideoCaptureConfig.CapturePreference.convertFromInt(rTCTypeBox.optInt("capturePreference"));
        return videoCaptureConfig;
    }

    @n0
    public static LiveTranscoding.VideoConfig.VideoCodecType toVideoCodecType(String str) {
        for (LiveTranscoding.VideoConfig.VideoCodecType videoCodecType : LiveTranscoding.VideoConfig.VideoCodecType.values()) {
            if (videoCodecType.getValue().equals(str)) {
                return videoCodecType;
            }
        }
        throw new IllegalArgumentException("Unknown LiveTranscoding.VideoConfig.VideoCodecType value: " + str);
    }

    public static VideoEncoderConfig toVideoEncoderConfig(RTCTypeBox rTCTypeBox) {
        VideoEncoderConfig videoEncoderConfig = new VideoEncoderConfig(rTCTypeBox.optInt("width"), rTCTypeBox.optInt("height"), rTCTypeBox.optInt("frameRate"), rTCTypeBox.optInt("maxBitrate"), rTCTypeBox.optInt("minBitrate"));
        videoEncoderConfig.encodePreference = toEncoderPreference(rTCTypeBox.optInt("encoderPreference"));
        return videoEncoderConfig;
    }

    public static VideoEncoderConfig[] toVideoEncoderConfigArray(List<?> list) {
        if (list == null) {
            return new VideoEncoderConfig[0];
        }
        VideoEncoderConfig[] videoEncoderConfigArr = new VideoEncoderConfig[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            videoEncoderConfigArr[i10] = toVideoEncoderConfig(new RTCTypeBox(list.get(i10)));
        }
        return videoEncoderConfigArr;
    }

    public static VirtualBackgroundSource toVirtualBackgroundSource(RTCTypeBox rTCTypeBox) {
        VirtualBackgroundSource virtualBackgroundSource = new VirtualBackgroundSource();
        virtualBackgroundSource.sourceType = toVirtualBackgroundSourceType(rTCTypeBox.optInt("sourceType"));
        virtualBackgroundSource.sourceColor = rTCTypeBox.optInt("sourceColor");
        virtualBackgroundSource.sourcePath = rTCTypeBox.optString("sourcePath");
        return virtualBackgroundSource;
    }

    private static VirtualBackgroundSourceType toVirtualBackgroundSourceType(int i10) {
        return VirtualBackgroundSourceType.values()[i10];
    }

    public static VoiceEqualizationConfig toVoiceEqualizationConfig(RTCTypeBox rTCTypeBox) {
        return new VoiceEqualizationConfig(VoiceEqualizationBandFrequency.fromId(rTCTypeBox.optInt("frequency")), rTCTypeBox.optInt("gain"));
    }

    public static VoiceReverbConfig toVoiceReverbConfig(RTCTypeBox rTCTypeBox) {
        return new VoiceReverbConfig(rTCTypeBox.optFloat("roomSize"), rTCTypeBox.optFloat("decayTime"), rTCTypeBox.optFloat("damping"), rTCTypeBox.optFloat("wetGain"), rTCTypeBox.optFloat("dryGain"), rTCTypeBox.optFloat("preDelay"));
    }
}
