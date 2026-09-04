package com.tencent.trtcplugin.util;

import com.google.android.exoplayer2.text.ttml.d;
import com.tencent.trtc.TRTCCloudDef;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ObjectUtils {
    public static TRTCCloudDef.TRTCPublishTarget getTRTCPublishTargetFromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget = new TRTCCloudDef.TRTCPublishTarget();
        if (map.containsKey("mode")) {
            tRTCPublishTarget.mode = EnumUtils.getPublishMode(((Integer) map.get("mode")).intValue());
        }
        if (map.containsKey("cdnUrlList")) {
            for (Map map2 : (List) map.get("cdnUrlList")) {
                TRTCCloudDef.TRTCPublishCdnUrl tRTCPublishCdnUrl = new TRTCCloudDef.TRTCPublishCdnUrl();
                if (map2.containsKey("rtmpUrl")) {
                    tRTCPublishCdnUrl.rtmpUrl = (String) map2.get("rtmpUrl");
                }
                if (map2.containsKey("isInternalLine")) {
                    tRTCPublishCdnUrl.isInternalLine = ((Boolean) map2.get("isInternalLine")).booleanValue();
                }
                if (tRTCPublishTarget.cdnUrlList == null) {
                    tRTCPublishTarget.cdnUrlList = new ArrayList<>();
                }
                tRTCPublishTarget.cdnUrlList.add(tRTCPublishCdnUrl);
            }
        }
        if (map.containsKey("mixStreamIdentity")) {
            tRTCPublishTarget.mixStreamIdentity = getTRTCUserFromMap((Map) map.get("mixStreamIdentity"));
        }
        return tRTCPublishTarget;
    }

    public static TRTCCloudDef.TRTCStreamEncoderParam getTRTCStreamEncoderParamFromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam = new TRTCCloudDef.TRTCStreamEncoderParam();
        if (map.containsKey("videoEncodedWidth")) {
            tRTCStreamEncoderParam.videoEncodedWidth = ((Integer) map.get("videoEncodedWidth")).intValue();
        }
        if (map.containsKey("videoEncodedHeight")) {
            tRTCStreamEncoderParam.videoEncodedHeight = ((Integer) map.get("videoEncodedHeight")).intValue();
        }
        if (map.containsKey("videoEncodedFPS")) {
            tRTCStreamEncoderParam.videoEncodedFPS = ((Integer) map.get("videoEncodedFPS")).intValue();
        }
        if (map.containsKey("videoEncodedGOP")) {
            tRTCStreamEncoderParam.videoEncodedGOP = ((Integer) map.get("videoEncodedGOP")).intValue();
        }
        if (map.containsKey("videoEncodedKbps")) {
            tRTCStreamEncoderParam.videoEncodedKbps = ((Integer) map.get("videoEncodedKbps")).intValue();
        }
        if (map.containsKey("audioEncodedSampleRate")) {
            tRTCStreamEncoderParam.audioEncodedSampleRate = ((Integer) map.get("audioEncodedSampleRate")).intValue();
        }
        if (map.containsKey("audioEncodedChannelNum")) {
            tRTCStreamEncoderParam.audioEncodedChannelNum = ((Integer) map.get("audioEncodedChannelNum")).intValue();
        }
        if (map.containsKey("audioEncodedKbps")) {
            tRTCStreamEncoderParam.audioEncodedKbps = ((Integer) map.get("audioEncodedKbps")).intValue();
        }
        if (map.containsKey("audioEncodedCodecType")) {
            tRTCStreamEncoderParam.audioEncodedCodecType = ((Integer) map.get("audioEncodedCodecType")).intValue();
        }
        return tRTCStreamEncoderParam;
    }

    public static TRTCCloudDef.TRTCStreamMixingConfig getTRTCStreamMixingConfigFromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig = new TRTCCloudDef.TRTCStreamMixingConfig();
        if (map.containsKey(d.H)) {
            tRTCStreamMixingConfig.backgroundColor = ((Integer) map.get(d.H)).intValue();
        }
        if (map.containsKey("backgroundImage")) {
            tRTCStreamMixingConfig.backgroundImage = (String) map.get("backgroundImage");
        }
        if (map.containsKey("videoLayoutList")) {
            Iterator it = ((List) map.get("videoLayoutList")).iterator();
            while (it.hasNext()) {
                tRTCStreamMixingConfig.videoLayoutList.add(getTRTCVideoLayoutFromMap((Map) it.next()));
            }
        }
        if (map.containsKey("audioMixUserList")) {
            Iterator it2 = ((List) map.get("audioMixUserList")).iterator();
            while (it2.hasNext()) {
                tRTCStreamMixingConfig.audioMixUserList.add(getTRTCUserFromMap((Map) it2.next()));
            }
        }
        if (map.containsKey("watermarkList")) {
            Iterator it3 = ((List) map.get("watermarkList")).iterator();
            while (it3.hasNext()) {
                tRTCStreamMixingConfig.watermarkList.add(getTRTCWatermarkFromMap((Map) it3.next()));
            }
        }
        return tRTCStreamMixingConfig;
    }

    public static TRTCCloudDef.TRTCUser getTRTCUserFromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        TRTCCloudDef.TRTCUser tRTCUser = new TRTCCloudDef.TRTCUser();
        if (map.containsKey("userId")) {
            tRTCUser.userId = (String) map.get("userId");
        }
        if (map.containsKey("intRoomId")) {
            tRTCUser.intRoomId = ((Integer) map.get("intRoomId")).intValue();
        }
        if (map.containsKey("strRoomId")) {
            tRTCUser.strRoomId = (String) map.get("strRoomId");
        }
        return tRTCUser;
    }

    public static TRTCCloudDef.TRTCVideoLayout getTRTCVideoLayoutFromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        TRTCCloudDef.TRTCVideoLayout tRTCVideoLayout = new TRTCCloudDef.TRTCVideoLayout();
        if (map.containsKey("rect")) {
            Map map2 = (Map) map.get("rect");
            if (map2.containsKey("originX")) {
                tRTCVideoLayout.f103191x = (int) ((Double) map2.get("originX")).doubleValue();
            }
            if (map2.containsKey("originY")) {
                tRTCVideoLayout.f103192y = (int) ((Double) map2.get("originY")).doubleValue();
            }
            if (map2.containsKey("sizeWidth")) {
                tRTCVideoLayout.width = (int) ((Double) map2.get("sizeWidth")).doubleValue();
            }
            if (map2.containsKey("sizeHeight")) {
                tRTCVideoLayout.height = (int) ((Double) map2.get("sizeHeight")).doubleValue();
            }
        }
        if (map.containsKey("zOrder")) {
            tRTCVideoLayout.zOrder = ((Integer) map.get("zOrder")).intValue();
        }
        if (map.containsKey("fillMode")) {
            tRTCVideoLayout.fillMode = EnumUtils.getVideoRenderFillMode(((Integer) map.get("fillMode")).intValue());
        }
        if (map.containsKey(d.H)) {
            tRTCVideoLayout.backgroundColor = ((Integer) map.get(d.H)).intValue();
        }
        if (map.containsKey("placeHolderImage")) {
            tRTCVideoLayout.placeHolderImage = (String) map.get("placeHolderImage");
        }
        if (map.containsKey("fixedVideoUser")) {
            tRTCVideoLayout.fixedVideoUser = getTRTCUserFromMap((Map) map.get("fixedVideoUser"));
        }
        if (map.containsKey("fixedVideoStreamType")) {
            tRTCVideoLayout.fixedVideoStreamType = EnumUtils.getVideoStreamType(((Integer) map.get("fixedVideoStreamType")).intValue());
        }
        return tRTCVideoLayout;
    }

    public static TRTCCloudDef.TRTCWatermark getTRTCWatermarkFromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        TRTCCloudDef.TRTCWatermark tRTCWatermark = new TRTCCloudDef.TRTCWatermark();
        if (map.containsKey("watermarkUrl")) {
            tRTCWatermark.watermarkUrl = (String) map.get("watermarkUrl");
        }
        if (map.containsKey("zOrder")) {
            tRTCWatermark.zOrder = ((Integer) map.get("zOrder")).intValue();
        }
        if (map.containsKey("rect")) {
            Map map2 = (Map) map.get("rect");
            if (map2.containsKey("originX")) {
                tRTCWatermark.f103193x = (int) ((Double) map2.get("originX")).doubleValue();
            }
            if (map2.containsKey("originY")) {
                tRTCWatermark.f103194y = (int) ((Double) map2.get("originY")).doubleValue();
            }
            if (map2.containsKey("sizeWidth")) {
                tRTCWatermark.width = (int) ((Double) map2.get("sizeWidth")).doubleValue();
            }
            if (map2.containsKey("sizeHeight")) {
                tRTCWatermark.height = (int) ((Double) map2.get("sizeHeight")).doubleValue();
            }
        }
        return tRTCWatermark;
    }
}
