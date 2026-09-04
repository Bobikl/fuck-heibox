package com.tencent.thumbplayer.tcmedia.c;

import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class k {
    static TPDownloadParam a(String str, TPDownloadParamData tPDownloadParamData, Map<String, String> map, Map<String, Object> map2) {
        ArrayList<Map<String, String>> urlCdnidHttpHeaderList;
        ArrayList<Map<String, String>> arrayList = null;
        if (tPDownloadParamData == null) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(str);
            return new TPDownloadParam(arrayList2, 0, null);
        }
        ArrayList<String> arrayList3 = new ArrayList<>();
        if (tPDownloadParamData.getUrlCdnidList() == null || tPDownloadParamData.getUrlCdnidList().isEmpty()) {
            if (TextUtils.isEmpty(str)) {
                str = tPDownloadParamData.url;
            }
            arrayList3.add(str);
            String[] bakUrl = tPDownloadParamData.getBakUrl();
            if (bakUrl != null && bakUrl.length > 0) {
                for (int i10 = 0; i10 < bakUrl.length; i10++) {
                    if (!TextUtils.isEmpty(bakUrl[i10])) {
                        arrayList3.add(bakUrl[i10]);
                    }
                }
            }
            if (map != null) {
                arrayList = new ArrayList<>();
                arrayList.add(map);
            }
            urlCdnidHttpHeaderList = arrayList;
        } else {
            arrayList3 = tPDownloadParamData.getUrlCdnidList();
            urlCdnidHttpHeaderList = tPDownloadParamData.getUrlCdnidHttpHeaderList();
        }
        HashMap map3 = new HashMap();
        if (!TextUtils.isEmpty(tPDownloadParamData.getFlowId())) {
            TPLogUtil.i("TPProxyUtils", tPDownloadParamData.getFlowId());
            map3.put(TPDownloadProxyEnum.DLPARAM_PLAY_FLOWID, tPDownloadParamData.getFlowId());
        }
        if (tPDownloadParamData.getUrlExpireTime() > 0) {
            map3.put(TPDownloadProxyEnum.DLPARAM_URL_EXPIRE_TIME, Integer.valueOf(tPDownloadParamData.getUrlExpireTime()));
        }
        if (tPDownloadParamData.getFileSize() > 0) {
            map3.put(TPDownloadProxyEnum.DLPARAM_FILE_SIZE, Long.valueOf(tPDownloadParamData.getFileSize()));
        }
        if (tPDownloadParamData.getFileDuration() > 0) {
            map3.put(TPDownloadProxyEnum.DLPARAM_FILE_DURATION, Long.valueOf(tPDownloadParamData.getFileDuration()));
        }
        if (!TextUtils.isEmpty(tPDownloadParamData.getDownloadFileID())) {
            map3.put(TPDownloadProxyEnum.DLPARAM_PLAY_KEYID, tPDownloadParamData.getDownloadFileID());
        }
        if (!TextUtils.isEmpty(tPDownloadParamData.getVid())) {
            map3.put(TPDownloadProxyEnum.DLPARAM_VID, tPDownloadParamData.getVid());
        }
        if (!TextUtils.isEmpty(tPDownloadParamData.getPlayDefinition())) {
            map3.put(TPDownloadProxyEnum.DLPARAM_PLAY_DEFINITION, tPDownloadParamData.getPlayDefinition());
        }
        if (!TextUtils.isEmpty(tPDownloadParamData.getCurrentFormat())) {
            map3.put(TPDownloadProxyEnum.DLPARAM_CURRENT_FORMAT, tPDownloadParamData.getCurrentFormat());
        }
        if (tPDownloadParamData.getCurrentFormatID() > 0) {
            map3.put(TPDownloadProxyEnum.DLPARAM_CURRENT_FORMATID, Integer.valueOf(tPDownloadParamData.getCurrentFormatID()));
        }
        if (!com.tencent.thumbplayer.tcmedia.utils.b.a(tPDownloadParamData.getFormatInfo())) {
            map3.put(TPDownloadProxyEnum.DLPARAM_FORMAT_INFO, tPDownloadParamData.getFormatInfo());
        }
        if (tPDownloadParamData.getBandwidthLevel() > 0) {
            map3.put(TPDownloadProxyEnum.DLPARAM_BAND_WIDTH_LEVEL, Integer.valueOf(tPDownloadParamData.getBandwidthLevel()));
        }
        map3.put(TPDownloadProxyEnum.DLPARAM_SOURCE_IS_CHARGE, Boolean.valueOf(tPDownloadParamData.isCharge()));
        map3.put(TPDownloadProxyEnum.DLPARAM_CACHE_NEED_ENCRYPT, Boolean.valueOf(tPDownloadParamData.isNeedEncryptCache()));
        map3.put(TPDownloadProxyEnum.DLPARAM_IS_OFFLINE, Boolean.valueOf(tPDownloadParamData.isOffline()));
        map3.put(TPDownloadProxyEnum.DLPARAM_ENABLE_EXPAND_DOWNLOAD_URL, Boolean.valueOf(tPDownloadParamData.isExtraParam()));
        if (urlCdnidHttpHeaderList != null && !urlCdnidHttpHeaderList.isEmpty()) {
            map3.put(TPDownloadProxyEnum.DLPARAM_URL_HEADER, urlCdnidHttpHeaderList);
        }
        if (tPDownloadParamData.getPreloadSize() > 0) {
            map3.put(TPDownloadProxyEnum.DLPARAM_PRELOAD_SIZE, Long.valueOf(tPDownloadParamData.getPreloadSize()));
        }
        if (tPDownloadParamData.getPreloadDuration() > 0) {
            map3.put(TPDownloadProxyEnum.DLPARAM_PRELOAD_DURATION, Long.valueOf(tPDownloadParamData.getPreloadDuration()));
        }
        if (!TextUtils.isEmpty(tPDownloadParamData.getSavePath())) {
            map3.put(TPDownloadProxyEnum.DLPARAM_SAVE_PATH, tPDownloadParamData.getSavePath());
        }
        if (tPDownloadParamData.getStarTimeMS() > 0) {
            map3.put(TPDownloadProxyEnum.DLPARAM_PLAY_START_TIME, Integer.valueOf(tPDownloadParamData.getStarTimeMS()));
        }
        if (tPDownloadParamData.getEndTimeMS() > 0) {
            map3.put(TPDownloadProxyEnum.DLPARAM_PLAY_END_TIME, Integer.valueOf(tPDownloadParamData.getEndTimeMS()));
        }
        if (tPDownloadParamData.getClipCount() > 0) {
            map3.put(TPDownloadProxyEnum.DLPARAM_PLAY_CLIP_COUNT, Integer.valueOf(tPDownloadParamData.getClipCount()));
        }
        if (tPDownloadParamData.getClipNo() > 0) {
            map3.put(TPDownloadProxyEnum.DLPARAM_PLAY_CLIP_NO, Integer.valueOf(tPDownloadParamData.getClipNo()));
        }
        if (!TextUtils.isEmpty(tPDownloadParamData.getBase())) {
            map3.put(TPDownloadProxyEnum.DLPARAM_VINFO_BASE, tPDownloadParamData.getBase());
        }
        if (!TextUtils.isEmpty(tPDownloadParamData.getLinkVid())) {
            map3.put(TPDownloadProxyEnum.DLPARAM_VINFO_LINK_VID, tPDownloadParamData.getLinkVid());
        }
        if (!TextUtils.isEmpty(tPDownloadParamData.getFileMD5())) {
            map3.put(TPDownloadProxyEnum.DLPARAM_FILE_MD5, tPDownloadParamData.getFileMD5());
        }
        if (!TextUtils.isEmpty(tPDownloadParamData.getM3u8())) {
            map3.put(TPDownloadProxyEnum.DLPARAM_VINFO_M3U8, tPDownloadParamData.getM3u8());
        }
        if (tPDownloadParamData.getTm() > 0) {
            map3.put(TPDownloadProxyEnum.DLPARAM_VINFO_TM, Long.valueOf(tPDownloadParamData.getTm()));
        }
        if (!TextUtils.isEmpty(tPDownloadParamData.getNonce())) {
            TPLogUtil.i("TPProxyUtils", "nonce:" + tPDownloadParamData.getNonce());
            map3.put(TPDownloadProxyEnum.DLPARAM_NONCE, tPDownloadParamData.getNonce());
        }
        if (!TextUtils.isEmpty(tPDownloadParamData.getDecKey())) {
            TPLogUtil.i("TPProxyUtils", "encrypt stream key:" + tPDownloadParamData.getDecKey());
            map3.put(TPDownloadProxyEnum.DLPARAM_ENCRYPT_STREAM_KEY, tPDownloadParamData.getDecKey());
        }
        if (!TextUtils.isEmpty(tPDownloadParamData.getRandoms())) {
            TPLogUtil.i("TPProxyUtils", "encrypt randoms:" + tPDownloadParamData.getRandoms());
            map3.put(TPDownloadProxyEnum.DLPARAM_ENCRYPT_STREAM_RANDOMS, tPDownloadParamData.getRandoms());
        }
        map3.put(TPDownloadProxyEnum.DLPARAM_VINFO_FP2P, Integer.valueOf(tPDownloadParamData.getFp2p()));
        if (tPDownloadParamData.getTestid() > 0) {
            map3.put(TPDownloadProxyEnum.DLPARAM_VINFO_TESTID, Integer.valueOf(tPDownloadParamData.getTestid()));
        }
        if (tPDownloadParamData.getExceptDelay() > 0) {
            map3.put(TPDownloadProxyEnum.DLPARAM_EXPECT_DELAY_TIME, Integer.valueOf(tPDownloadParamData.getExceptDelay()));
        }
        if (tPDownloadParamData.getSecondaryM3u8List() != null) {
            map3.put(TPDownloadProxyEnum.DLPARAM_VINFO_SECONDARY_M3U8_LIST, tPDownloadParamData.getSecondaryM3u8List());
        }
        if (!com.tencent.thumbplayer.tcmedia.utils.b.a(tPDownloadParamData.getExtInfoMap())) {
            map3.putAll(tPDownloadParamData.getExtInfoMap());
        }
        map3.put(TPDownloadProxyEnum.DLPARAM_FORMAT_NODES, tPDownloadParamData.getDefInfoList());
        if (map2 != null && !map2.isEmpty()) {
            map3.putAll(map2);
        }
        if (tPDownloadParamData.getPcdnUrlList() != null && !tPDownloadParamData.getPcdnUrlList().isEmpty()) {
            StringBuilder sb2 = new StringBuilder("");
            Iterator<String> it = tPDownloadParamData.getPcdnUrlList().iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(";");
            }
            if (sb2.length() > 0) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            TPLogUtil.i("TPProxyUtils", "pcdn url list: " + sb2.toString());
            map3.put(TPDownloadProxyEnum.DLPARAM_PCDN_URLS, sb2.toString());
        }
        if (tPDownloadParamData.getPcdnVtList() != null && !tPDownloadParamData.getPcdnVtList().isEmpty()) {
            StringBuilder sb3 = new StringBuilder("");
            Iterator<Integer> it2 = tPDownloadParamData.getPcdnVtList().iterator();
            while (it2.hasNext()) {
                sb3.append(it2.next().intValue());
                sb3.append(";");
            }
            if (sb3.length() > 0) {
                sb3.deleteCharAt(sb3.length() - 1);
            }
            map3.put(TPDownloadProxyEnum.DLPARAM_PCDN_VTS, sb3.toString());
        }
        return new TPDownloadParam(arrayList3, h.a(tPDownloadParamData.getDlType()), map3);
    }
}
