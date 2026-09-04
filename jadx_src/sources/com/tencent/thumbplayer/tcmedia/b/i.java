package com.tencent.thumbplayer.tcmedia.b;

import android.util.Xml;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMap;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMapUtil;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaRTCAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaUrlAsset;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class i {
    private static String a(int i10, boolean z10) {
        if (i10 == 1) {
            return z10 ? "av_tracks" : "av_track";
        }
        if (i10 == 2) {
            return z10 ? "video_tracks" : "video_track";
        }
        if (i10 == 3) {
            return z10 ? "audio_tracks" : "audio_track";
        }
        return "";
    }

    static String a(ITPMediaComposition iTPMediaComposition) throws IOException {
        if (iTPMediaComposition == null) {
            return "";
        }
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
        xmlSerializerNewSerializer.startTag("", "assets");
        List<ITPMediaTrack> allAVTracks = iTPMediaComposition.getAllAVTracks();
        if (com.tencent.thumbplayer.tcmedia.utils.b.a(allAVTracks)) {
            List<ITPMediaTrack> allVideoTracks = iTPMediaComposition.getAllVideoTracks();
            List<ITPMediaTrack> allAudioTracks = iTPMediaComposition.getAllAudioTracks();
            if (com.tencent.thumbplayer.tcmedia.utils.b.a(allVideoTracks) && com.tencent.thumbplayer.tcmedia.utils.b.a(allAudioTracks)) {
                return "";
            }
            e eVar = (e) iTPMediaComposition;
            long jA = eVar.a();
            a(xmlSerializerNewSerializer, allVideoTracks, 2, eVar.b());
            a(xmlSerializerNewSerializer, allAudioTracks, 3, jA);
        } else {
            a(xmlSerializerNewSerializer, allAVTracks, 1, 0L);
        }
        xmlSerializerNewSerializer.endTag("", "assets");
        xmlSerializerNewSerializer.endDocument();
        return stringWriter.toString();
    }

    static String a(ITPMediaDRMAsset iTPMediaDRMAsset) throws IOException {
        if (iTPMediaDRMAsset == null) {
            return "";
        }
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
        xmlSerializerNewSerializer.startTag("", "assets");
        xmlSerializerNewSerializer.startTag("", "av_tracks");
        xmlSerializerNewSerializer.startTag("", "av_track");
        xmlSerializerNewSerializer.startTag("", "track_clip");
        xmlSerializerNewSerializer.startTag("", "clip_id");
        xmlSerializerNewSerializer.text(Integer.toString(0));
        xmlSerializerNewSerializer.endTag("", "clip_id");
        xmlSerializerNewSerializer.startTag("", "clip_placeHolder");
        xmlSerializerNewSerializer.text("0");
        xmlSerializerNewSerializer.endTag("", "clip_placeHolder");
        xmlSerializerNewSerializer.startTag("", "clip_path");
        xmlSerializerNewSerializer.text(a(iTPMediaDRMAsset.getDrmPlayUrl()));
        xmlSerializerNewSerializer.endTag("", "clip_path");
        xmlSerializerNewSerializer.startTag("", "clip_drmType");
        xmlSerializerNewSerializer.text(String.valueOf(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapDrmType.class, iTPMediaDRMAsset.getDrmType())));
        xmlSerializerNewSerializer.endTag("", "clip_drmType");
        xmlSerializerNewSerializer.startTag("", "clip_drmProvisionUrl");
        xmlSerializerNewSerializer.text(a(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_PROVISION_URL, "")));
        xmlSerializerNewSerializer.endTag("", "clip_drmProvisionUrl");
        xmlSerializerNewSerializer.startTag("", "clip_drmLicenseUrl");
        xmlSerializerNewSerializer.text(a(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_LICENSE_URL, "")));
        xmlSerializerNewSerializer.endTag("", "clip_drmLicenseUrl");
        xmlSerializerNewSerializer.startTag("", "clip_drmUseL1");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_DRM_USEL1, "1"));
        xmlSerializerNewSerializer.endTag("", "clip_drmUseL1");
        xmlSerializerNewSerializer.startTag("", "clip_drmSavePath");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_SAVE_PATH, ""));
        xmlSerializerNewSerializer.endTag("", "clip_drmSavePath");
        xmlSerializerNewSerializer.startTag("", "clip_drmGuid");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_GUID, ""));
        xmlSerializerNewSerializer.endTag("", "clip_drmGuid");
        xmlSerializerNewSerializer.startTag("", "clip_drmPlatform");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_PLATFORM, ""));
        xmlSerializerNewSerializer.endTag("", "clip_drmPlatform");
        xmlSerializerNewSerializer.startTag("", "clip_drmAppVersion");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_APPVER, ""));
        xmlSerializerNewSerializer.endTag("", "clip_drmAppVersion");
        xmlSerializerNewSerializer.startTag("", "clip_drmCookie");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_COOKIE, ""));
        xmlSerializerNewSerializer.endTag("", "clip_drmCookie");
        xmlSerializerNewSerializer.startTag("", "clip_drmLicenseStandardization");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_LICENSE_STANDARDIZATION, "0"));
        xmlSerializerNewSerializer.endTag("", "clip_drmLicenseStandardization");
        xmlSerializerNewSerializer.startTag("", "clip_drmCommonKey");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_EXT_X_KEY, ""));
        xmlSerializerNewSerializer.endTag("", "clip_drmCommonKey");
        xmlSerializerNewSerializer.startTag("", "clip_drmOfflineKeySetId");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getOfflineKeySetId());
        xmlSerializerNewSerializer.endTag("", "clip_drmOfflineKeySetId");
        xmlSerializerNewSerializer.startTag("", "clip_preferredProperty");
        a(xmlSerializerNewSerializer, iTPMediaDRMAsset);
        xmlSerializerNewSerializer.endTag("", "clip_preferredProperty");
        xmlSerializerNewSerializer.endTag("", "track_clip");
        xmlSerializerNewSerializer.endTag("", "av_track");
        xmlSerializerNewSerializer.endTag("", "av_tracks");
        xmlSerializerNewSerializer.endTag("", "assets");
        xmlSerializerNewSerializer.endDocument();
        return stringWriter.toString();
    }

    static String a(ITPMediaRTCAsset iTPMediaRTCAsset) throws IOException {
        if (iTPMediaRTCAsset == null) {
            return "";
        }
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
        xmlSerializerNewSerializer.startTag("", "assets");
        xmlSerializerNewSerializer.startTag("", "av_tracks");
        xmlSerializerNewSerializer.startTag("", "av_track");
        xmlSerializerNewSerializer.startTag("", "track_clip");
        xmlSerializerNewSerializer.startTag("", "clip_id");
        xmlSerializerNewSerializer.text(Integer.toString(0));
        xmlSerializerNewSerializer.endTag("", "clip_id");
        xmlSerializerNewSerializer.startTag("", "clip_placeHolder");
        xmlSerializerNewSerializer.text("0");
        xmlSerializerNewSerializer.endTag("", "clip_placeHolder");
        xmlSerializerNewSerializer.startTag("", "clip_path");
        xmlSerializerNewSerializer.text(a(iTPMediaRTCAsset.getRtcStreamUrl()));
        xmlSerializerNewSerializer.endTag("", "clip_path");
        xmlSerializerNewSerializer.startTag("", "clip_rtcServerUrl");
        xmlSerializerNewSerializer.text(a(iTPMediaRTCAsset.getRtcServerUrl()));
        xmlSerializerNewSerializer.endTag("", "clip_rtcServerUrl");
        xmlSerializerNewSerializer.startTag("", "clip_rtcSdpExchangeType");
        xmlSerializerNewSerializer.text(Integer.toString(iTPMediaRTCAsset.getRtcSdpExchangeType()));
        xmlSerializerNewSerializer.endTag("", "clip_rtcSdpExchangeType");
        xmlSerializerNewSerializer.startTag("", "clip_preferredProperty");
        a(xmlSerializerNewSerializer, iTPMediaRTCAsset);
        xmlSerializerNewSerializer.endTag("", "clip_preferredProperty");
        xmlSerializerNewSerializer.endTag("", "track_clip");
        xmlSerializerNewSerializer.endTag("", "av_track");
        xmlSerializerNewSerializer.endTag("", "av_tracks");
        xmlSerializerNewSerializer.endTag("", "assets");
        xmlSerializerNewSerializer.endDocument();
        return stringWriter.toString();
    }

    public static String a(ITPMediaUrlAsset iTPMediaUrlAsset) throws IOException {
        if (iTPMediaUrlAsset == null) {
            return "";
        }
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
        xmlSerializerNewSerializer.startTag("", "assets");
        xmlSerializerNewSerializer.startTag("", "av_tracks");
        xmlSerializerNewSerializer.startTag("", "av_track");
        xmlSerializerNewSerializer.startTag("", "track_clip");
        xmlSerializerNewSerializer.startTag("", "clip_id");
        xmlSerializerNewSerializer.text(Integer.toString(0));
        xmlSerializerNewSerializer.endTag("", "clip_id");
        xmlSerializerNewSerializer.startTag("", "clip_placeHolder");
        xmlSerializerNewSerializer.text("0");
        xmlSerializerNewSerializer.endTag("", "clip_placeHolder");
        xmlSerializerNewSerializer.startTag("", "clip_path");
        xmlSerializerNewSerializer.text(a(iTPMediaUrlAsset.getStreamUrl()));
        xmlSerializerNewSerializer.endTag("", "clip_path");
        xmlSerializerNewSerializer.startTag("", "clip_preferredProperty");
        a(xmlSerializerNewSerializer, iTPMediaUrlAsset);
        xmlSerializerNewSerializer.endTag("", "clip_preferredProperty");
        xmlSerializerNewSerializer.endTag("", "track_clip");
        xmlSerializerNewSerializer.endTag("", "av_track");
        xmlSerializerNewSerializer.endTag("", "av_tracks");
        xmlSerializerNewSerializer.endTag("", "assets");
        xmlSerializerNewSerializer.endDocument();
        return stringWriter.toString();
    }

    private static String a(String str) {
        return str.replaceAll("[^\t\r\n -\ud7ff\ue000-�𐀀-\u10ffff]+", "");
    }

    static String a(List<ITPMediaTrackClip> list, int i10) throws IOException {
        String str;
        String str2;
        if (com.tencent.thumbplayer.tcmedia.utils.b.a(list)) {
            return "";
        }
        if (i10 == 1) {
            str = "av_tracks";
            str2 = "av_track";
        } else if (i10 == 2) {
            str = "video_tracks";
            str2 = "video_track";
        } else {
            if (i10 != 3) {
                return "";
            }
            str = "audio_tracks";
            str2 = "audio_track";
        }
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
        xmlSerializerNewSerializer.startTag("", "assets");
        a(xmlSerializerNewSerializer, list, str, str2);
        xmlSerializerNewSerializer.endTag("", "assets");
        xmlSerializerNewSerializer.endDocument();
        return stringWriter.toString();
    }

    private static void a(XmlSerializer xmlSerializer, ITPMediaAsset iTPMediaAsset) throws IOException {
        ITPMediaAssetExtraParam extraParam = iTPMediaAsset.getExtraParam();
        if (extraParam == null) {
            return;
        }
        a(xmlSerializer, extraParam, ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_AUDIO);
        a(xmlSerializer, extraParam, ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_SUBTITLE);
        a(xmlSerializer, extraParam, ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_VIDEO);
    }

    private static void a(XmlSerializer xmlSerializer, ITPMediaAssetExtraParam iTPMediaAssetExtraParam, String str) throws IOException {
        c cVar = (c) iTPMediaAssetExtraParam.getExtraObject(str);
        if (cVar == null) {
            return;
        }
        xmlSerializer.startTag("", str);
        xmlSerializer.text(a(cVar.getKeyValueStr()));
        xmlSerializer.endTag("", str);
    }

    private static void a(XmlSerializer xmlSerializer, ITPMediaTrackClip iTPMediaTrackClip) throws IOException {
        a(xmlSerializer, iTPMediaTrackClip, 0L);
    }

    private static void a(XmlSerializer xmlSerializer, ITPMediaTrackClip iTPMediaTrackClip, long j10) throws IOException {
        if (iTPMediaTrackClip instanceof a) {
            b(xmlSerializer, iTPMediaTrackClip, j10);
        } else if (iTPMediaTrackClip instanceof h) {
            c(xmlSerializer, iTPMediaTrackClip, j10);
        }
    }

    private static void a(XmlSerializer xmlSerializer, List<ITPMediaTrack> list, int i10, long j10) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    String strA = a(i10, true);
                    String strA2 = a(i10, false);
                    xmlSerializer.startTag("", strA);
                    for (ITPMediaTrack iTPMediaTrack : list) {
                        if (iTPMediaTrack.getMediaType() == i10) {
                            xmlSerializer.startTag("", strA2);
                            xmlSerializer.startTag("", "track_id");
                            xmlSerializer.text(Integer.toString(iTPMediaTrack.getTrackId()));
                            xmlSerializer.endTag("", "track_id");
                            if (i10 == 1 || !f.f102436a.equals("base_audio") || iTPMediaTrack.getTimelineDurationMs() <= j10) {
                                Iterator<ITPMediaTrackClip> it = iTPMediaTrack.getAllTrackClips().iterator();
                                while (it.hasNext()) {
                                    a(xmlSerializer, it.next());
                                }
                            } else {
                                long originalDurationMs = 0;
                                for (ITPMediaTrackClip iTPMediaTrackClip : iTPMediaTrack.getAllTrackClips()) {
                                    originalDurationMs += iTPMediaTrackClip.getOriginalDurationMs();
                                    if (originalDurationMs > j10) {
                                        a(xmlSerializer, iTPMediaTrackClip, originalDurationMs - j10);
                                        break;
                                    }
                                    a(xmlSerializer, iTPMediaTrackClip);
                                }
                            }
                            xmlSerializer.endTag("", strA2);
                        }
                    }
                    xmlSerializer.endTag("", strA);
                }
            } catch (IOException e10) {
                TPLogUtil.e("TPMediaCompositionXmlGenerator", e10);
            }
        }
    }

    private static void a(XmlSerializer xmlSerializer, List<ITPMediaTrackClip> list, String str, String str2) throws IOException {
        xmlSerializer.startTag("", str);
        xmlSerializer.startTag("", str2);
        Iterator<ITPMediaTrackClip> it = list.iterator();
        while (it.hasNext()) {
            a(xmlSerializer, it.next());
        }
        xmlSerializer.endTag("", str2);
        xmlSerializer.endTag("", str);
    }

    private static void b(XmlSerializer xmlSerializer, ITPMediaTrackClip iTPMediaTrackClip, long j10) throws IOException {
        xmlSerializer.startTag("", "track_clip");
        xmlSerializer.startTag("", "clip_id");
        xmlSerializer.text(Integer.toString(iTPMediaTrackClip.getClipId()));
        xmlSerializer.endTag("", "clip_id");
        xmlSerializer.startTag("", "clip_placeHolder");
        xmlSerializer.text("1");
        xmlSerializer.endTag("", "clip_placeHolder");
        xmlSerializer.startTag("", "clip_playTimeMs");
        xmlSerializer.text(j10 > 0 ? Long.toString(iTPMediaTrackClip.getOriginalDurationMs() - j10) : Long.toString(iTPMediaTrackClip.getOriginalDurationMs()));
        xmlSerializer.endTag("", "clip_playTimeMs");
        xmlSerializer.endTag("", "track_clip");
    }

    private static void c(XmlSerializer xmlSerializer, ITPMediaTrackClip iTPMediaTrackClip, long j10) throws IOException {
        String string;
        xmlSerializer.startTag("", "track_clip");
        xmlSerializer.startTag("", "clip_id");
        xmlSerializer.text(Integer.toString(iTPMediaTrackClip.getClipId()));
        xmlSerializer.endTag("", "clip_id");
        xmlSerializer.startTag("", "clip_placeHolder");
        xmlSerializer.text("0");
        xmlSerializer.endTag("", "clip_placeHolder");
        xmlSerializer.startTag("", "clip_path");
        xmlSerializer.text(a(iTPMediaTrackClip.getFilePath()));
        xmlSerializer.endTag("", "clip_path");
        xmlSerializer.startTag("", "clip_startTimeMs");
        xmlSerializer.text(Long.toString(iTPMediaTrackClip.getStartTimeMs()));
        xmlSerializer.endTag("", "clip_startTimeMs");
        xmlSerializer.startTag("", "clip_durationMs");
        xmlSerializer.text(Long.toString(iTPMediaTrackClip.getOriginalDurationMs()));
        xmlSerializer.endTag("", "clip_durationMs");
        if (j10 > 0) {
            long endTimeMs = iTPMediaTrackClip.getEndTimeMs() - j10;
            long originalDurationMs = iTPMediaTrackClip.getOriginalDurationMs() - j10;
            xmlSerializer.startTag("", "clip_endTimeMs");
            xmlSerializer.text(Long.toString(endTimeMs));
            xmlSerializer.endTag("", "clip_endTimeMs");
            xmlSerializer.startTag("", "clip_playTimeMs");
            string = Long.toString(originalDurationMs);
        } else {
            xmlSerializer.startTag("", "clip_endTimeMs");
            xmlSerializer.text(Long.toString(iTPMediaTrackClip.getEndTimeMs()));
            xmlSerializer.endTag("", "clip_endTimeMs");
            xmlSerializer.startTag("", "clip_playTimeMs");
            string = Long.toString(iTPMediaTrackClip.getOriginalDurationMs());
        }
        xmlSerializer.text(string);
        xmlSerializer.endTag("", "clip_playTimeMs");
        xmlSerializer.endTag("", "track_clip");
    }
}
