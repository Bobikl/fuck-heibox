package com.ss.bytertc.engine.live;

import bb.c;
import com.bytedance.realx.base.CalledByNative;
import com.google.android.exoplayer2.text.ttml.d;
import com.max.xiaoheihe.module.bbs.utils.b;
import com.ss.bytertc.engine.data.HumanOrientation;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.utils.LogUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class MixedStreamConfig {
    private static final String TAG = "MixedStreamConfig";
    private JSONObject advancedConfig;
    private MixedStreamAudioConfig audioConfig;
    private JSONObject authInfo;
    private MixedStreamClientMixConfig clientMixConfig;
    private ByteRTCStreamMixingType expectedMixingType = ByteRTCStreamMixingType.STREAM_MIXING_BY_SERVER;
    private MixedStreamLayoutConfig layout;
    private String pushURL;
    private String roomID;
    private MixedStreamServerControlConfig serverControlConfig;
    private MixedStreamSpatialConfig spatialConfig;
    private MixedStreamSyncControlConfig syncControlConfig;
    private String userID;
    private MixedStreamVideoConfig videoConfig;

    public enum MixedStreamAlternateImageFillMode {
        FIT(0),
        FILL(1);

        private int imageFillMode;

        MixedStreamAlternateImageFillMode(int i10) {
            this.imageFillMode = i10;
        }

        public int getValue() {
            return this.imageFillMode;
        }
    }

    public static class MixedStreamAudioConfig {
        private MixedStreamAudioCodecType audioCodec = MixedStreamAudioCodecType.MIXED_STREAM_AUDIO_CODEC_TYPE_AAC;
        private int bitrate = 64;
        private int sampleRate = 48000;
        private int channels = 2;
        private MixedStreamAudioProfile audioProfile = MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;

        public enum MixedStreamAudioCodecType {
            MIXED_STREAM_AUDIO_CODEC_TYPE_AAC("AAC");

            private String audioCodecType;

            MixedStreamAudioCodecType(String str) {
                this.audioCodecType = str;
            }

            public String getValue() {
                return this.audioCodecType;
            }
        }

        public MixedStreamAudioCodecType getAudioCodec() {
            return this.audioCodec;
        }

        public MixedStreamAudioProfile getAudioProfile() {
            return this.audioProfile;
        }

        public int getBitrate() {
            return this.bitrate;
        }

        public int getChannels() {
            return this.channels;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        public MixedStreamAudioConfig setAudioCodec(MixedStreamAudioCodecType mixedStreamAudioCodecType) {
            this.audioCodec = mixedStreamAudioCodecType;
            return this;
        }

        public MixedStreamAudioConfig setAudioProfile(MixedStreamAudioProfile mixedStreamAudioProfile) {
            this.audioProfile = mixedStreamAudioProfile;
            return this;
        }

        public MixedStreamAudioConfig setBitrate(int i10) {
            this.bitrate = i10;
            return this;
        }

        public MixedStreamAudioConfig setChannels(int i10) {
            this.channels = i10;
            return this;
        }

        public MixedStreamAudioConfig setSampleRate(int i10) {
            this.sampleRate = i10;
            return this;
        }
    }

    public enum MixedStreamAudioProfile {
        MIXED_STREAM_AUDIO_PROFILE_LC("LC"),
        MIXED_STREAM_AUDIO_PROFILE_HEV1("HEv1"),
        MIXED_STREAM_AUDIO_PROFILE_HEV2("HEv2");

        private String aacProfile;

        MixedStreamAudioProfile(String str) {
            this.aacProfile = str;
        }

        public String getValue() {
            return this.aacProfile;
        }
    }

    public static class MixedStreamClientMixConfig {
        private boolean useAudioMixer = true;
        private MixedStreamClientMixVideoFormat videoFormat = MixedStreamClientMixVideoFormat.MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_I420;

        public boolean getUseAudioMixer() {
            return this.useAudioMixer;
        }

        public MixedStreamClientMixVideoFormat getVideoFormat() {
            return this.videoFormat;
        }

        public MixedStreamClientMixConfig setUseAudioMixer(boolean z10) {
            this.useAudioMixer = z10;
            return this;
        }

        public MixedStreamClientMixConfig setVideoFormat(MixedStreamClientMixVideoFormat mixedStreamClientMixVideoFormat) {
            this.videoFormat = mixedStreamClientMixVideoFormat;
            return this;
        }
    }

    public enum MixedStreamClientMixVideoFormat {
        MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_I420(0),
        MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_TEXTURE_2D(1),
        MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_CVPIXEL_BUFFER_BGRA(2),
        MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_NV12(3);

        private int videoFormat;

        MixedStreamClientMixVideoFormat(int i10) {
            this.videoFormat = i10;
        }

        public int getValue() {
            return this.videoFormat;
        }
    }

    public static class MixedStreamLayoutConfig {
        private MixedStreamLayoutRegionConfig[] regions = null;
        private String userConfigExtraInfo = "";
        private String backgroundColor = "#000000";
        private String backgroundImageURL = "";

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public String getBackgroundImageURL() {
            return this.backgroundImageURL;
        }

        public MixedStreamLayoutRegionConfig[] getRegions() {
            return this.regions;
        }

        public String getUserConfigExtraInfo() {
            return this.userConfigExtraInfo;
        }

        public MixedStreamLayoutConfig setBackgroundColor(String str) {
            this.backgroundColor = str;
            return this;
        }

        public MixedStreamLayoutConfig setBackgroundImageURL(String str) {
            this.backgroundImageURL = str;
            return this;
        }

        public MixedStreamLayoutConfig setRegions(MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr) {
            this.regions = mixedStreamLayoutRegionConfigArr;
            return this;
        }

        public MixedStreamLayoutConfig setUserConfigExtraInfo(String str) {
            this.userConfigExtraInfo = str;
            return this;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Object jSONObject2 = new JSONObject();
            try {
                MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr = this.regions;
                if (mixedStreamLayoutRegionConfigArr != null) {
                    for (MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig : mixedStreamLayoutRegionConfigArr) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("userID", mixedStreamLayoutRegionConfig.userID);
                        jSONObject3.put("roomID", mixedStreamLayoutRegionConfig.roomID);
                        jSONObject3.put("locationX", mixedStreamLayoutRegionConfig.locationX);
                        jSONObject3.put("locationY", mixedStreamLayoutRegionConfig.locationY);
                        jSONObject3.put("width", mixedStreamLayoutRegionConfig.width);
                        jSONObject3.put("height", mixedStreamLayoutRegionConfig.height);
                        jSONObject3.put("zOrder", mixedStreamLayoutRegionConfig.zOrder);
                        jSONObject3.put("alpha", mixedStreamLayoutRegionConfig.alpha);
                        jSONObject3.put("cornerRadius", mixedStreamLayoutRegionConfig.cornerRadius);
                        jSONObject3.put("regionContentType", mixedStreamLayoutRegionConfig.regionContentType);
                        jSONObject3.put("renderMode", mixedStreamLayoutRegionConfig.renderMode);
                        jSONObject3.put("streamType", mixedStreamLayoutRegionConfig.streamType);
                        jSONObject3.put("applySpatialAudio", mixedStreamLayoutRegionConfig.applySpatialAudio);
                        jSONObject3.put("alternateImageFillMode", mixedStreamLayoutRegionConfig.alternateImageFillMode);
                        jSONObject3.put("alternateImageURL", mixedStreamLayoutRegionConfig.alternateImageURL);
                        jSONArray.put(jSONObject3);
                    }
                }
                jSONObject.put("canvas", jSONObject2);
                jSONObject.put("regions", jSONArray);
                jSONObject.put("userConfigExtraInfo", this.userConfigExtraInfo);
                return jSONObject.toString();
            } catch (JSONException e10) {
                LogUtil.w(MixedStreamConfig.TAG, "create layout json message happen exception", e10);
                return null;
            }
        }
    }

    public static class MixedStreamLayoutRegionConfig {
        private String userID = "";
        private String roomID = "";
        private int locationX = 0;
        private int locationY = 0;
        private int width = 360;
        private int height = c.b.f30883q9;
        private int zOrder = 0;
        private double alpha = 1.0d;
        private double cornerRadius = 0.0d;
        private MixedStreamMediaType mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
        private MixedStreamRenderMode renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
        private boolean isLocalUser = false;
        private MixedStreamVideoType streamType = MixedStreamVideoType.MIXED_STREAM_VIDEO_TYPE_MAIN;
        private MixedStreamLayoutRegionType regionContentType = MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM;
        private byte[] imageWaterMark = null;
        private MixedStreamLayoutRegionImageWaterMarkConfig imageWaterMarkConfig = new MixedStreamLayoutRegionImageWaterMarkConfig(0, 0);
        private MixedStreamAlternateImageFillMode alternateImageFillMode = MixedStreamAlternateImageFillMode.FIT;
        String alternateImageURL = "";
        private Position spatialPosition = new Position();
        private boolean applySpatialAudio = true;

        public static class MixedStreamLayoutRegionImageWaterMarkConfig {
            private int imageHeight;
            private int imageWidth;

            public MixedStreamLayoutRegionImageWaterMarkConfig(int i10, int i11) {
                this.imageWidth = i10;
                this.imageHeight = i11;
            }

            public int getImageHeight() {
                return this.imageHeight;
            }

            public int getImageWidth() {
                return this.imageWidth;
            }

            public MixedStreamLayoutRegionImageWaterMarkConfig setImageHeight(int i10) {
                this.imageHeight = i10;
                return this;
            }

            public MixedStreamLayoutRegionImageWaterMarkConfig setImageWidth(int i10) {
                this.imageWidth = i10;
                return this;
            }
        }

        public enum MixedStreamVideoType {
            MIXED_STREAM_VIDEO_TYPE_MAIN(0),
            MIXED_STREAM_VIDEO_TYPE_SCREEN(1);

            private int videoType;

            MixedStreamVideoType(int i10) {
                this.videoType = i10;
            }

            public int getValue() {
                return this.videoType;
            }
        }

        public double getAlpha() {
            return this.alpha;
        }

        public MixedStreamAlternateImageFillMode getAlternateImageFillMode() {
            return this.alternateImageFillMode;
        }

        public String getAlternateImageURL() {
            return this.alternateImageURL;
        }

        public boolean getApplySpatialAudio() {
            return this.applySpatialAudio;
        }

        public double getCornerRadius() {
            return this.cornerRadius;
        }

        public double getHeight() {
            return this.height;
        }

        public byte[] getImageWaterMark() {
            return this.imageWaterMark;
        }

        public MixedStreamLayoutRegionImageWaterMarkConfig getImageWaterMarkConfig() {
            return this.imageWaterMarkConfig;
        }

        public boolean getIsLocalUser() {
            return this.isLocalUser;
        }

        public int getLocationX() {
            return this.locationX;
        }

        public int getLocationY() {
            return this.locationY;
        }

        public MixedStreamMediaType getMediaType() {
            return this.mediaType;
        }

        public MixedStreamLayoutRegionType getRegionContentType() {
            return this.regionContentType;
        }

        public MixedStreamRenderMode getRenderMode() {
            return this.renderMode;
        }

        public String getRoomID() {
            return this.roomID;
        }

        public Position getSpatialPosition() {
            return this.spatialPosition;
        }

        public MixedStreamVideoType getStreamType() {
            return this.streamType;
        }

        public String getUserID() {
            return this.userID;
        }

        public int getWidth() {
            return this.width;
        }

        public int getZOrder() {
            return this.zOrder;
        }

        public MixedStreamLayoutRegionConfig setAlpha(double d10) {
            this.alpha = d10;
            return this;
        }

        public MixedStreamLayoutRegionConfig setAlternateImageFillMode(MixedStreamAlternateImageFillMode mixedStreamAlternateImageFillMode) {
            this.alternateImageFillMode = mixedStreamAlternateImageFillMode;
            return this;
        }

        public MixedStreamLayoutRegionConfig setAlternateImageURL(String str) {
            this.alternateImageURL = str;
            return this;
        }

        public MixedStreamLayoutRegionConfig setApplySpatialAudio(boolean z10) {
            this.applySpatialAudio = z10;
            return this;
        }

        public MixedStreamLayoutRegionConfig setCornerRadius(double d10) {
            this.cornerRadius = d10;
            return this;
        }

        public MixedStreamLayoutRegionConfig setHeight(int i10) {
            this.height = i10;
            return this;
        }

        public MixedStreamLayoutRegionConfig setImageWaterMark(byte[] bArr) {
            this.imageWaterMark = bArr;
            return this;
        }

        public MixedStreamLayoutRegionConfig setImageWaterMarkConfig(MixedStreamLayoutRegionImageWaterMarkConfig mixedStreamLayoutRegionImageWaterMarkConfig) {
            this.imageWaterMarkConfig = mixedStreamLayoutRegionImageWaterMarkConfig;
            return this;
        }

        public MixedStreamLayoutRegionConfig setIsLocalUser(boolean z10) {
            this.isLocalUser = z10;
            return this;
        }

        public MixedStreamLayoutRegionConfig setLocationX(int i10) {
            this.locationX = i10;
            return this;
        }

        public MixedStreamLayoutRegionConfig setLocationY(int i10) {
            this.locationY = i10;
            return this;
        }

        public MixedStreamLayoutRegionConfig setMediaType(MixedStreamMediaType mixedStreamMediaType) {
            this.mediaType = mixedStreamMediaType;
            return this;
        }

        public MixedStreamLayoutRegionConfig setRegionContentType(MixedStreamLayoutRegionType mixedStreamLayoutRegionType) {
            this.regionContentType = mixedStreamLayoutRegionType;
            return this;
        }

        public MixedStreamLayoutRegionConfig setRenderMode(MixedStreamRenderMode mixedStreamRenderMode) {
            this.renderMode = mixedStreamRenderMode;
            return this;
        }

        public MixedStreamLayoutRegionConfig setRoomID(String str) {
            this.roomID = str;
            return this;
        }

        public MixedStreamLayoutRegionConfig setSpatialPosition(Position position) {
            this.spatialPosition = position;
            return this;
        }

        public MixedStreamLayoutRegionConfig setStreamType(MixedStreamVideoType mixedStreamVideoType) {
            this.streamType = mixedStreamVideoType;
            return this;
        }

        public MixedStreamLayoutRegionConfig setUserID(String str) {
            this.userID = str;
            return this;
        }

        public MixedStreamLayoutRegionConfig setWidth(int i10) {
            this.width = i10;
            return this;
        }

        public MixedStreamLayoutRegionConfig setZOrder(int i10) {
            this.zOrder = i10;
            return this;
        }
    }

    public enum MixedStreamLayoutRegionType {
        MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM(0),
        MIXED_STREAM_LAYOUT_REGION_TYPE_IMAGE(1);

        private int regionType;

        MixedStreamLayoutRegionType(int i10) {
            this.regionType = i10;
        }

        public int getValue() {
            return this.regionType;
        }
    }

    public enum MixedStreamMediaType {
        MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO(0),
        MIXED_STREAM_MEDIA_TYPE_AUDIO_ONLY(1),
        MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY(2);

        private int contentControlType;

        MixedStreamMediaType(int i10) {
            this.contentControlType = i10;
        }

        public int getValue() {
            return this.contentControlType;
        }
    }

    public enum MixedStreamPushMode {
        ON_STREAM(0),
        ON_START_REQUEST(1);

        private int pushMode;

        MixedStreamPushMode(int i10) {
            this.pushMode = i10;
        }

        public int getValue() {
            return this.pushMode;
        }
    }

    public enum MixedStreamRenderMode {
        MIXED_STREAM_RENDER_MODE_HIDDEN(1),
        MIXED_STREAM_RENDER_MODE_FIT(2),
        MIXED_STREAM_RENDER_MODE_ADAPTIVE(3);

        private int renderMode;

        MixedStreamRenderMode(int i10) {
            this.renderMode = i10;
        }

        public int getValue() {
            return this.renderMode;
        }
    }

    public enum MixedStreamSEIContentMode {
        MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT(0),
        MIXED_STREAM_SEI_CONTENT_MODE_ENABLE_VOLUME_INDICATION(1);

        private int seiContentMode;

        MixedStreamSEIContentMode(int i10) {
            this.seiContentMode = i10;
        }

        public int getValue() {
            return this.seiContentMode;
        }
    }

    public static class MixedStreamServerControlConfig {
        private boolean enableVolumeIndication = false;
        private float volumeIndicationInterval = 2.0f;
        private int talkVolume = 0;
        private boolean isAddVolumeValue = false;
        private MixedStreamSEIContentMode seiContentMode = MixedStreamSEIContentMode.MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT;
        private int seiPayloadType = 100;
        private String seiPayloadUuid = "";
        private MixedStreamMediaType mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
        private MixedStreamPushMode pushStreamMode = MixedStreamPushMode.ON_STREAM;

        public boolean getEnableVolumeIndication() {
            return this.enableVolumeIndication;
        }

        public boolean getIsAddVolumeValue() {
            return this.isAddVolumeValue;
        }

        public MixedStreamMediaType getMediaType() {
            return this.mediaType;
        }

        public MixedStreamPushMode getPushStreamMode() {
            return this.pushStreamMode;
        }

        public MixedStreamSEIContentMode getSeiContentMode() {
            return this.seiContentMode;
        }

        public int getSeiPayloadType() {
            return this.seiPayloadType;
        }

        public String getSeiPayloadUuid() {
            return this.seiPayloadUuid;
        }

        public int getTalkVolume() {
            return this.talkVolume;
        }

        public float getVolumeIndicationInterval() {
            return this.volumeIndicationInterval;
        }

        public MixedStreamServerControlConfig setEnableVolumeIndication(boolean z10) {
            this.enableVolumeIndication = z10;
            return this;
        }

        public MixedStreamServerControlConfig setIsAddVolumeValue(boolean z10) {
            this.isAddVolumeValue = z10;
            return this;
        }

        public MixedStreamServerControlConfig setMediaType(MixedStreamMediaType mixedStreamMediaType) {
            this.mediaType = mixedStreamMediaType;
            return this;
        }

        public MixedStreamServerControlConfig setPushStreamMode(MixedStreamPushMode mixedStreamPushMode) {
            this.pushStreamMode = mixedStreamPushMode;
            return this;
        }

        public MixedStreamServerControlConfig setSeiContentMode(MixedStreamSEIContentMode mixedStreamSEIContentMode) {
            this.seiContentMode = mixedStreamSEIContentMode;
            return this;
        }

        public MixedStreamServerControlConfig setSeiPayloadType(int i10) {
            this.seiPayloadType = i10;
            return this;
        }

        public MixedStreamServerControlConfig setSeiPayloadUuid(String str) {
            this.seiPayloadUuid = str;
            return this;
        }

        public MixedStreamServerControlConfig setTalkVolume(int i10) {
            this.talkVolume = i10;
            return this;
        }

        public MixedStreamServerControlConfig setVolumeIndicationInterval(float f10) {
            this.volumeIndicationInterval = f10;
            return this;
        }
    }

    public static class MixedStreamSpatialConfig {
        public boolean enableSpatialRender = false;
        public Position audienceSpatialPosition = new Position();
        public HumanOrientation audienceSpatialOrientation = new HumanOrientation();

        public HumanOrientation getAudienceSpatialOrientation() {
            return this.audienceSpatialOrientation;
        }

        public Position getAudienceSpatialPosition() {
            return this.audienceSpatialPosition;
        }

        public boolean getEnableSpatialRender() {
            return this.enableSpatialRender;
        }

        public MixedStreamSpatialConfig setAudienceSpatialOrientation(HumanOrientation humanOrientation) {
            this.audienceSpatialOrientation = humanOrientation;
            return this;
        }

        public MixedStreamSpatialConfig setAudienceSpatialPosition(float f10, float f11, float f12) {
            Position position = this.audienceSpatialPosition;
            position.f97942x = f10;
            position.f97943y = f11;
            position.f97944z = f12;
            return this;
        }

        public MixedStreamSpatialConfig setAudienceSpatialPosition(Position position) {
            this.audienceSpatialPosition = position;
            return this;
        }

        public MixedStreamSpatialConfig setEnableSpatialRender(boolean z10) {
            this.enableSpatialRender = z10;
            return this;
        }
    }

    public static class MixedStreamSyncControlConfig {
        private MixedStreamSyncStrategy syncStrategy = MixedStreamSyncStrategy.MIXED_STREAM_SYNC_STRATEGY_NO_SYNC;
        private int maxCacheTimeMs = 2000;
        private boolean videoNeedSdkMix = true;
        private String baseUserID = "";

        public String getBaseUserID() {
            return this.baseUserID;
        }

        public int getMaxCacheTimeMs() {
            return this.maxCacheTimeMs;
        }

        public MixedStreamSyncStrategy getSyncStrategy() {
            return this.syncStrategy;
        }

        public boolean getVideoNeedSdkMix() {
            return this.videoNeedSdkMix;
        }

        public MixedStreamSyncControlConfig setBaseUserID(String str) {
            this.baseUserID = str;
            return this;
        }

        public MixedStreamSyncControlConfig setMaxCacheTimeMs(int i10) {
            this.maxCacheTimeMs = i10;
            return this;
        }

        public MixedStreamSyncControlConfig setSyncStrategy(MixedStreamSyncStrategy mixedStreamSyncStrategy) {
            this.syncStrategy = mixedStreamSyncStrategy;
            return this;
        }

        public MixedStreamSyncControlConfig setVideoNeedSdkMix(boolean z10) {
            this.videoNeedSdkMix = z10;
            return this;
        }
    }

    public enum MixedStreamSyncStrategy {
        MIXED_STREAM_SYNC_STRATEGY_NO_SYNC(0),
        MIXED_STREAM_SYNC_STRATEGY_AUDIO_PRECISE_SYNC(1),
        MIXED_STREAM_SYNC_STRATEGY_SIMPLEX_MODE_SYNC(2);

        private int syncStrategy;

        MixedStreamSyncStrategy(int i10) {
            this.syncStrategy = i10;
        }

        public int getValue() {
            return this.syncStrategy;
        }
    }

    public static class MixedStreamVideoConfig {
        private MixedStreamVideoCodecType videoCodec = MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_H264;
        private int fps = 15;
        private int gop = 2;
        private int bitrate = 500;
        private int width = 360;
        private int height = c.b.f30883q9;
        private boolean enableBframe = false;

        public enum MixedStreamVideoCodecType {
            MIXED_STREAM_VIDEO_CODEC_TYPE_H264("H264"),
            MIXED_STREAM_VIDEO_CODEC_TYPE_BYTEVC1("ByteVC1");

            private String videoCodecType;

            MixedStreamVideoCodecType(String str) {
                this.videoCodecType = str;
            }

            public String getValue() {
                return this.videoCodecType;
            }
        }

        public int getBitrate() {
            return this.bitrate;
        }

        public boolean getEnableBframe() {
            return this.enableBframe;
        }

        public int getFps() {
            return this.fps;
        }

        public int getGop() {
            return this.gop;
        }

        public int getHeight() {
            return this.height;
        }

        public MixedStreamVideoCodecType getVideoCodec() {
            return this.videoCodec;
        }

        public int getWidth() {
            return this.width;
        }

        public MixedStreamVideoConfig setBitrate(int i10) {
            this.bitrate = i10;
            return this;
        }

        public MixedStreamVideoConfig setEnableBframe(boolean z10) {
            this.enableBframe = z10;
            return this;
        }

        public MixedStreamVideoConfig setFps(int i10) {
            this.fps = i10;
            return this;
        }

        public MixedStreamVideoConfig setGop(int i10) {
            this.gop = i10;
            return this;
        }

        public MixedStreamVideoConfig setHeight(int i10) {
            this.height = i10;
            return this;
        }

        public MixedStreamVideoConfig setVideoCodec(MixedStreamVideoCodecType mixedStreamVideoCodecType) {
            this.videoCodec = mixedStreamVideoCodecType;
            return this;
        }

        public MixedStreamVideoConfig setWidth(int i10) {
            this.width = i10;
            return this;
        }
    }

    public static MixedStreamConfig defaultMixedStreamConfig() {
        MixedStreamVideoConfig mixedStreamVideoConfig = new MixedStreamVideoConfig();
        mixedStreamVideoConfig.videoCodec = MixedStreamVideoConfig.MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_H264;
        mixedStreamVideoConfig.fps = 15;
        mixedStreamVideoConfig.gop = 2;
        mixedStreamVideoConfig.enableBframe = false;
        mixedStreamVideoConfig.height = c.b.f30883q9;
        mixedStreamVideoConfig.width = 360;
        mixedStreamVideoConfig.bitrate = 500;
        MixedStreamAudioConfig mixedStreamAudioConfig = new MixedStreamAudioConfig();
        mixedStreamAudioConfig.audioCodec = MixedStreamAudioConfig.MixedStreamAudioCodecType.MIXED_STREAM_AUDIO_CODEC_TYPE_AAC;
        mixedStreamAudioConfig.channels = 2;
        mixedStreamAudioConfig.bitrate = 64;
        mixedStreamAudioConfig.sampleRate = 48000;
        mixedStreamAudioConfig.audioProfile = MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;
        MixedStreamServerControlConfig mixedStreamServerControlConfig = new MixedStreamServerControlConfig();
        mixedStreamServerControlConfig.enableVolumeIndication = false;
        mixedStreamServerControlConfig.seiContentMode = MixedStreamSEIContentMode.MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT;
        mixedStreamServerControlConfig.isAddVolumeValue = false;
        mixedStreamServerControlConfig.talkVolume = 0;
        mixedStreamServerControlConfig.volumeIndicationInterval = 2.0f;
        mixedStreamServerControlConfig.seiPayloadType = 100;
        mixedStreamServerControlConfig.seiPayloadUuid = "";
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = new MixedStreamSyncControlConfig();
        mixedStreamSyncControlConfig.baseUserID = "";
        mixedStreamSyncControlConfig.syncStrategy = MixedStreamSyncStrategy.MIXED_STREAM_SYNC_STRATEGY_NO_SYNC;
        mixedStreamSyncControlConfig.maxCacheTimeMs = 2000;
        mixedStreamSyncControlConfig.videoNeedSdkMix = true;
        MixedStreamClientMixConfig mixedStreamClientMixConfig = new MixedStreamClientMixConfig();
        mixedStreamClientMixConfig.useAudioMixer = true;
        mixedStreamClientMixConfig.videoFormat = MixedStreamClientMixVideoFormat.MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_I420;
        MixedStreamSpatialConfig mixedStreamSpatialConfig = new MixedStreamSpatialConfig();
        mixedStreamSpatialConfig.enableSpatialRender = false;
        MixedStreamLayoutConfig mixedStreamLayoutConfig = new MixedStreamLayoutConfig();
        mixedStreamLayoutConfig.backgroundColor = "#000000";
        mixedStreamLayoutConfig.userConfigExtraInfo = "";
        MixedStreamConfig mixedStreamConfig = new MixedStreamConfig();
        mixedStreamConfig.audioConfig = mixedStreamAudioConfig;
        mixedStreamConfig.videoConfig = mixedStreamVideoConfig;
        mixedStreamConfig.serverControlConfig = mixedStreamServerControlConfig;
        mixedStreamConfig.syncControlConfig = mixedStreamSyncControlConfig;
        mixedStreamConfig.clientMixConfig = mixedStreamClientMixConfig;
        mixedStreamConfig.spatialConfig = mixedStreamSpatialConfig;
        mixedStreamConfig.layout = mixedStreamLayoutConfig;
        mixedStreamConfig.pushURL = null;
        return mixedStreamConfig;
    }

    public JSONObject getAdvancedConfig() {
        return this.advancedConfig;
    }

    public MixedStreamAudioConfig getAudioConfig() {
        return this.audioConfig;
    }

    public JSONObject getAuthInfo() {
        return this.authInfo;
    }

    public MixedStreamClientMixConfig getClientMixConfig() {
        return this.clientMixConfig;
    }

    public ByteRTCStreamMixingType getExpectedMixingType() {
        return this.expectedMixingType;
    }

    public MixedStreamLayoutConfig getLayout() {
        return this.layout;
    }

    @CalledByNative
    public String getMixedStreamAdvancedConfig() {
        JSONObject jSONObject = this.advancedConfig;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    @CalledByNative
    public String getMixedStreamAudioConfigAudioProfile() {
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        return (mixedStreamAudioConfig == null || mixedStreamAudioConfig.audioProfile == null) ? "" : this.audioConfig.audioProfile.getValue();
    }

    @CalledByNative
    public int getMixedStreamAudioConfigChannels() {
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        if (mixedStreamAudioConfig == null) {
            return 0;
        }
        return mixedStreamAudioConfig.channels;
    }

    @CalledByNative
    public String getMixedStreamAudioConfigCodec() {
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        return (mixedStreamAudioConfig == null || mixedStreamAudioConfig.audioCodec == null) ? "" : this.audioConfig.audioCodec.getValue();
    }

    @CalledByNative
    public int getMixedStreamAudioConfigSampleRate() {
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        if (mixedStreamAudioConfig == null) {
            return 0;
        }
        return mixedStreamAudioConfig.sampleRate;
    }

    @CalledByNative
    public String getMixedStreamAuthInfo() {
        JSONObject jSONObject = this.authInfo;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    @CalledByNative
    public boolean getMixedStreamClientMixConfigUseAudioMixer() {
        MixedStreamClientMixConfig mixedStreamClientMixConfig = this.clientMixConfig;
        if (mixedStreamClientMixConfig == null) {
            return true;
        }
        return mixedStreamClientMixConfig.useAudioMixer;
    }

    @CalledByNative
    public int getMixedStreamClientMixConfigVideoFormat() {
        MixedStreamClientMixConfig mixedStreamClientMixConfig = this.clientMixConfig;
        return (mixedStreamClientMixConfig == null ? MixedStreamClientMixVideoFormat.MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_YUV_I420 : mixedStreamClientMixConfig.videoFormat).getValue();
    }

    @CalledByNative
    public String getMixedStreamLayoutBackgroundColor() {
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        return (mixedStreamLayoutConfig == null || mixedStreamLayoutConfig.backgroundColor == null) ? "" : this.layout.backgroundColor;
    }

    @CalledByNative
    public String getMixedStreamLayoutBackgroundImageURL() {
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        return (mixedStreamLayoutConfig == null || mixedStreamLayoutConfig.backgroundImageURL == null) ? "" : this.layout.backgroundImageURL;
    }

    @CalledByNative
    public double getMixedStreamLayoutRegionAlpha(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0d;
        }
        return mixedStreamLayoutRegionConfig.alpha;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionAlternateImageFillMode(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        return mixedStreamLayoutRegionConfig == null ? MixedStreamAlternateImageFillMode.FIT.getValue() : mixedStreamLayoutRegionConfig.alternateImageFillMode.getValue();
    }

    @CalledByNative
    public String getMixedStreamLayoutRegionAlternateImageURL(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        return mixedStreamLayoutRegionConfig == null ? "" : mixedStreamLayoutRegionConfig.alternateImageURL;
    }

    @CalledByNative
    public boolean getMixedStreamLayoutRegionApplySpatialAudio(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return true;
        }
        return mixedStreamLayoutRegionConfig.applySpatialAudio;
    }

    @CalledByNative
    public MixedStreamLayoutRegionConfig[] getMixedStreamLayoutRegionConfigs() {
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        if (mixedStreamLayoutConfig == null) {
            return null;
        }
        return mixedStreamLayoutConfig.regions;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionContentType(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.regionContentType.getValue();
    }

    @CalledByNative
    public double getMixedStreamLayoutRegionCornerRadius(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0d;
        }
        return mixedStreamLayoutRegionConfig.cornerRadius;
    }

    @CalledByNative
    public byte[] getMixedStreamLayoutRegionData(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return null;
        }
        return mixedStreamLayoutRegionConfig.imageWaterMark;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionDataParamImageHeight(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.imageWaterMarkConfig.imageHeight;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionDataParamImageWidth(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.imageWaterMarkConfig.imageWidth;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionH(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.height;
    }

    @CalledByNative
    public boolean getMixedStreamLayoutRegionLocalUser(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return false;
        }
        return mixedStreamLayoutRegionConfig.isLocalUser;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionMediaType(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.mediaType.getValue();
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionRenderMode(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.renderMode.getValue();
    }

    @CalledByNative
    public String getMixedStreamLayoutRegionRoomID(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        return (mixedStreamLayoutRegionConfig == null || mixedStreamLayoutRegionConfig.roomID == null) ? "" : mixedStreamLayoutRegionConfig.roomID;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionScreenStream(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.streamType.getValue();
    }

    @CalledByNative
    public float getMixedStreamLayoutRegionSpatialPositionX(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.spatialPosition.f97942x;
    }

    @CalledByNative
    public float getMixedStreamLayoutRegionSpatialPositionY(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.spatialPosition.f97943y;
    }

    @CalledByNative
    public float getMixedStreamLayoutRegionSpatialPositionZ(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0.0f;
        }
        return mixedStreamLayoutRegionConfig.spatialPosition.f97944z;
    }

    @CalledByNative
    public String getMixedStreamLayoutRegionUserID(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        return (mixedStreamLayoutRegionConfig == null || mixedStreamLayoutRegionConfig.userID == null) ? "" : mixedStreamLayoutRegionConfig.userID;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionW(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.width;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionX(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.locationX;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionY(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.locationY;
    }

    @CalledByNative
    public int getMixedStreamLayoutRegionZOrder(MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig) {
        if (mixedStreamLayoutRegionConfig == null) {
            return 0;
        }
        return mixedStreamLayoutRegionConfig.zOrder;
    }

    @CalledByNative
    public String getMixedStreamLayoutUserConfigExtraInfo() {
        MixedStreamLayoutConfig mixedStreamLayoutConfig = this.layout;
        return (mixedStreamLayoutConfig == null || mixedStreamLayoutConfig.userConfigExtraInfo == null) ? "" : this.layout.userConfigExtraInfo;
    }

    @CalledByNative
    public int getMixedStreamMixType() {
        return this.expectedMixingType.value();
    }

    @CalledByNative
    public String getMixedStreamRoomID() {
        String str = this.roomID;
        return str == null ? "" : str;
    }

    @CalledByNative
    public boolean getMixedStreamServerControlConfigEnableVolumeIndication() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return false;
        }
        return mixedStreamServerControlConfig.enableVolumeIndication;
    }

    @CalledByNative
    public boolean getMixedStreamServerControlConfigIsAddVolumeValue() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return false;
        }
        return mixedStreamServerControlConfig.isAddVolumeValue;
    }

    @CalledByNative
    public int getMixedStreamServerControlConfigMediaType() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        return (mixedStreamServerControlConfig == null ? MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO : mixedStreamServerControlConfig.mediaType).getValue();
    }

    @CalledByNative
    public int getMixedStreamServerControlConfigPushStreamMode() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        return (mixedStreamServerControlConfig == null ? MixedStreamPushMode.ON_STREAM : mixedStreamServerControlConfig.pushStreamMode).getValue();
    }

    @CalledByNative
    public int getMixedStreamServerControlConfigSeiContentMode() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        return (mixedStreamServerControlConfig == null ? MixedStreamSEIContentMode.MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT : mixedStreamServerControlConfig.seiContentMode).getValue();
    }

    @CalledByNative
    public int getMixedStreamServerControlConfigSeiPayloadType() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return 0;
        }
        return mixedStreamServerControlConfig.seiPayloadType;
    }

    @CalledByNative
    public String getMixedStreamServerControlConfigSeiPayloadUuid() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        return mixedStreamServerControlConfig == null ? "" : mixedStreamServerControlConfig.seiPayloadUuid;
    }

    @CalledByNative
    public int getMixedStreamServerControlConfigTalkVolume() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return 0;
        }
        return mixedStreamServerControlConfig.talkVolume;
    }

    @CalledByNative
    public float getMixedStreamServerControlConfigVolumeIndicationInterval() {
        MixedStreamServerControlConfig mixedStreamServerControlConfig = this.serverControlConfig;
        if (mixedStreamServerControlConfig == null) {
            return 2.0f;
        }
        return mixedStreamServerControlConfig.volumeIndicationInterval;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationForwardX() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.forward.f97939x;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationForwardY() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.forward.f97940y;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationForwardZ() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.forward.f97941z;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationRightX() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.right.f97939x;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationRightY() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.right.f97940y;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationRightZ() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.right.f97941z;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationUpX() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.up.f97939x;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationUpY() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.up.f97940y;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialOrientationUpZ() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialOrientation.up.f97941z;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialPositionX() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialPosition.f97942x;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialPositionY() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialPosition.f97943y;
    }

    @CalledByNative
    public float getMixedStreamSpatialConfigAudienceSpatialPositionZ() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return 0.0f;
        }
        return mixedStreamSpatialConfig.audienceSpatialPosition.f97944z;
    }

    @CalledByNative
    public boolean getMixedStreamSpatialConfigEnableSpatialRender() {
        MixedStreamSpatialConfig mixedStreamSpatialConfig = this.spatialConfig;
        if (mixedStreamSpatialConfig == null) {
            return false;
        }
        return mixedStreamSpatialConfig.enableSpatialRender;
    }

    @CalledByNative
    public String getMixedStreamSyncControlConfigBaseUser() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        return mixedStreamSyncControlConfig == null ? "" : mixedStreamSyncControlConfig.baseUserID;
    }

    @CalledByNative
    public int getMixedStreamSyncControlConfigQueueLength() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        if (mixedStreamSyncControlConfig == null) {
            return 0;
        }
        return mixedStreamSyncControlConfig.maxCacheTimeMs;
    }

    @CalledByNative
    public int getMixedStreamSyncControlConfigSyncStrategy() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        return (mixedStreamSyncControlConfig == null ? MixedStreamSyncStrategy.MIXED_STREAM_SYNC_STRATEGY_NO_SYNC : mixedStreamSyncControlConfig.syncStrategy).getValue();
    }

    @CalledByNative
    public boolean getMixedStreamSyncControlConfigVideoNeedMix() {
        MixedStreamSyncControlConfig mixedStreamSyncControlConfig = this.syncControlConfig;
        if (mixedStreamSyncControlConfig == null) {
            return false;
        }
        return mixedStreamSyncControlConfig.videoNeedSdkMix;
    }

    @CalledByNative
    public String getMixedStreamUrl() {
        String str = this.pushURL;
        return str == null ? "" : str;
    }

    @CalledByNative
    public String getMixedStreamUserID() {
        String str = this.userID;
        return str == null ? "" : str;
    }

    @CalledByNative
    public boolean getMixedStreamVideoConfigBFrame() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return false;
        }
        return mixedStreamVideoConfig.enableBframe;
    }

    @CalledByNative
    public int getMixedStreamVideoConfigBitrate() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.bitrate;
    }

    @CalledByNative
    public String getMixedStreamVideoConfigCodec() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        return (mixedStreamVideoConfig == null || mixedStreamVideoConfig.videoCodec == null) ? "" : this.videoConfig.videoCodec.getValue();
    }

    @CalledByNative
    public int getMixedStreamVideoConfigFps() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.fps;
    }

    @CalledByNative
    public int getMixedStreamVideoConfigGop() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.gop;
    }

    @CalledByNative
    public int getMixedStreamVideoConfigHeight() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.height;
    }

    @CalledByNative
    public int getMixedStreamVideoConfigWidth() {
        MixedStreamVideoConfig mixedStreamVideoConfig = this.videoConfig;
        if (mixedStreamVideoConfig == null) {
            return 0;
        }
        return mixedStreamVideoConfig.width;
    }

    @CalledByNative
    public int getMixedStreamaudioConfigBitrate() {
        MixedStreamAudioConfig mixedStreamAudioConfig = this.audioConfig;
        if (mixedStreamAudioConfig == null) {
            return 0;
        }
        return mixedStreamAudioConfig.bitrate;
    }

    public String getPushURL() {
        return this.pushURL;
    }

    public String getRoomID() {
        return this.roomID;
    }

    public MixedStreamServerControlConfig getServerControlConfig() {
        return this.serverControlConfig;
    }

    public MixedStreamSpatialConfig getSpatialConfig() {
        return this.spatialConfig;
    }

    public MixedStreamSyncControlConfig getSyncControlConfig() {
        return this.syncControlConfig;
    }

    public JSONObject getTranscodeMessage() {
        String str;
        Object obj;
        String str2 = "height";
        String str3 = "width";
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject8 = new JSONObject();
        JSONObject jSONObject9 = new JSONObject();
        JSONObject jSONObject10 = new JSONObject();
        try {
            jSONObject.put("videoCodec", this.videoConfig.videoCodec);
            jSONObject.put("fps", this.videoConfig.fps);
            jSONObject.put("gop", this.videoConfig.gop);
            jSONObject.put("bitrate", this.videoConfig.bitrate);
            jSONObject.put("width", this.videoConfig.width);
            jSONObject.put("height", this.videoConfig.height);
            jSONObject.put("enableBframe", this.videoConfig.enableBframe);
            jSONObject2.put("audioCodec", this.audioConfig.audioCodec);
            jSONObject2.put("bitrate", this.audioConfig.bitrate);
            jSONObject2.put("sampleRate", this.audioConfig.sampleRate);
            jSONObject2.put(b.f83401f, this.audioConfig.channels);
            jSONObject2.put("audioProfile", this.audioConfig.audioProfile);
            jSONObject3.put("enableVolumeIndication", this.serverControlConfig.enableVolumeIndication);
            jSONObject3.put("talkVolume", this.serverControlConfig.talkVolume);
            jSONObject3.put("isAddVolumeValue", this.serverControlConfig.isAddVolumeValue);
            jSONObject3.put("volumeIndicationInterval", this.serverControlConfig.volumeIndicationInterval);
            jSONObject3.put("seiContentMode", this.serverControlConfig.seiContentMode);
            jSONObject3.put("seiPayloadType", this.serverControlConfig.seiPayloadType);
            jSONObject3.put("seiPayloadUuid", this.serverControlConfig.seiPayloadUuid);
            jSONObject3.put("mediaType", this.serverControlConfig.mediaType);
            jSONObject3.put("pushStreamMode", this.serverControlConfig.pushStreamMode);
            jSONObject4.put("useAudioMixer", this.clientMixConfig.useAudioMixer);
            jSONObject4.put("videoFormat", this.clientMixConfig.videoFormat.getValue());
            jSONObject5.put("syncStrategy", this.syncControlConfig.syncStrategy);
            jSONObject5.put("maxCacheTimeMs", this.syncControlConfig.maxCacheTimeMs);
            jSONObject5.put("videoNeedSdkMix", this.syncControlConfig.videoNeedSdkMix);
            jSONObject5.put("baseuserID", this.syncControlConfig.baseUserID);
            jSONObject7.put(d.H, this.layout.backgroundColor);
            jSONObject7.put("backgroundImageURL", this.layout.backgroundImageURL);
            String str4 = "roomID";
            String str5 = "userID";
            if (this.layout.regions != null) {
                MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr = this.layout.regions;
                int length = mixedStreamLayoutRegionConfigArr.length;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = length;
                    MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig = mixedStreamLayoutRegionConfigArr[i10];
                    MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr2 = mixedStreamLayoutRegionConfigArr;
                    JSONObject jSONObject11 = new JSONObject();
                    jSONObject11.put(str5, mixedStreamLayoutRegionConfig.userID);
                    jSONObject11.put(str4, mixedStreamLayoutRegionConfig.roomID);
                    jSONObject11.put("locationX", mixedStreamLayoutRegionConfig.locationX);
                    jSONObject11.put("locationY", mixedStreamLayoutRegionConfig.locationY);
                    jSONObject11.put(str3, mixedStreamLayoutRegionConfig.width);
                    jSONObject11.put(str2, mixedStreamLayoutRegionConfig.height);
                    jSONObject11.put("zOrder", mixedStreamLayoutRegionConfig.zOrder);
                    jSONObject11.put("alpha", mixedStreamLayoutRegionConfig.alpha);
                    jSONObject11.put("cornerRadius", mixedStreamLayoutRegionConfig.cornerRadius);
                    jSONObject11.put("mediaType", mixedStreamLayoutRegionConfig.mediaType);
                    jSONObject11.put("renderMode", mixedStreamLayoutRegionConfig.renderMode);
                    jSONObject11.put("isLocalUser", mixedStreamLayoutRegionConfig.isLocalUser);
                    jSONObject11.put("streamType", mixedStreamLayoutRegionConfig.streamType);
                    jSONObject11.put("applySpatialAudio", mixedStreamLayoutRegionConfig.applySpatialAudio);
                    jSONObject11.put("alternateImageFillMode", mixedStreamLayoutRegionConfig.alternateImageFillMode);
                    jSONObject11.put("alternateImageURL", mixedStreamLayoutRegionConfig.alternateImageURL);
                    jSONArray.put(jSONObject11);
                    i10++;
                    str4 = str4;
                    str2 = str2;
                    length = i11;
                    mixedStreamLayoutRegionConfigArr = mixedStreamLayoutRegionConfigArr2;
                    jSONObject4 = jSONObject4;
                    str5 = str5;
                    str3 = str3;
                }
                str = str5;
                obj = jSONObject4;
            } else {
                str = "userID";
                obj = jSONObject4;
            }
            String str6 = str4;
            jSONObject6.put("canvas", jSONObject7);
            jSONObject6.put("regions", jSONArray);
            jSONObject6.put("userConfigExtraInfo", this.layout.userConfigExtraInfo);
            jSONObject8.put("pushURL", this.pushURL);
            jSONObject9.put("transcode", jSONObject8);
            jSONObject9.put("video", jSONObject);
            jSONObject9.put("audio", jSONObject2);
            jSONObject9.put("serverControl", jSONObject3);
            jSONObject9.put("clientMix", obj);
            jSONObject9.put("syncControl", jSONObject5);
            jSONObject9.put(d.f49813w, jSONObject6);
            jSONObject9.put("advancedConfig", this.advancedConfig);
            Object obj2 = this.authInfo;
            if (obj2 != null) {
                jSONObject9.put("authInfo", obj2);
            }
            jSONObject10.put("expectedMixingType", this.expectedMixingType);
            jSONObject10.put("type", "transcode");
            jSONObject10.put(str6, this.roomID);
            jSONObject10.put(str, this.userID);
            jSONObject10.put("transcodeMeta", jSONObject9);
            return jSONObject10;
        } catch (Exception e10) {
            LogUtil.w(TAG, "get json message happen exception", e10);
            return null;
        }
    }

    public String getUserID() {
        return this.userID;
    }

    public MixedStreamVideoConfig getVideoConfig() {
        return this.videoConfig;
    }

    public MixedStreamConfig setAdvancedConfig(JSONObject jSONObject) {
        this.advancedConfig = jSONObject;
        return this;
    }

    public MixedStreamConfig setAudioConfig(MixedStreamAudioConfig mixedStreamAudioConfig) {
        this.audioConfig = mixedStreamAudioConfig;
        return this;
    }

    public MixedStreamConfig setAuthInfo(JSONObject jSONObject) {
        this.authInfo = jSONObject;
        return this;
    }

    public MixedStreamConfig setClientMixConfig(MixedStreamClientMixConfig mixedStreamClientMixConfig) {
        this.clientMixConfig = mixedStreamClientMixConfig;
        return this;
    }

    public MixedStreamConfig setExpectedMixingType(ByteRTCStreamMixingType byteRTCStreamMixingType) {
        this.expectedMixingType = byteRTCStreamMixingType;
        return this;
    }

    public MixedStreamConfig setLayout(MixedStreamLayoutConfig mixedStreamLayoutConfig) {
        this.layout = mixedStreamLayoutConfig;
        return this;
    }

    public MixedStreamConfig setPushURL(String str) {
        this.pushURL = str;
        return this;
    }

    public MixedStreamConfig setRoomID(String str) {
        this.roomID = str;
        return this;
    }

    public MixedStreamConfig setServerControlConfig(MixedStreamServerControlConfig mixedStreamServerControlConfig) {
        this.serverControlConfig = mixedStreamServerControlConfig;
        return this;
    }

    public MixedStreamConfig setSpatialConfig(MixedStreamSpatialConfig mixedStreamSpatialConfig) {
        this.spatialConfig = mixedStreamSpatialConfig;
        return this;
    }

    public MixedStreamConfig setSyncControlConfig(MixedStreamSyncControlConfig mixedStreamSyncControlConfig) {
        this.syncControlConfig = mixedStreamSyncControlConfig;
        return this;
    }

    public MixedStreamConfig setUserID(String str) {
        this.userID = str;
        return this;
    }

    public MixedStreamConfig setVideoConfig(MixedStreamVideoConfig mixedStreamVideoConfig) {
        this.videoConfig = mixedStreamVideoConfig;
        return this;
    }
}
