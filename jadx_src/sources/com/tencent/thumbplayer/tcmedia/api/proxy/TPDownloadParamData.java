package com.tencent.thumbplayer.tcmedia.api.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TPDownloadParamData {
    public String audioTrackKeyId;
    private String[] bakUrl;
    private int bandwidthLevel;
    private String base;
    private int clipCount;
    private int clipNo;
    private String currentFormat;
    private int currentFormatID;
    private String decKey;
    private List<Map<String, String>> defInfoList;
    private int dlType;
    private String downloadFileID;
    private int endTimeMS;
    private int expectDelay;
    private Map<String, String> extInfoMap;
    private boolean extraParam;
    private long fileDuration;
    private String fileMD5;
    private long fileSize;
    public String flowId;
    private Map<String, Integer> formatInfo;
    private int fp2p;
    private boolean isCharge;
    private boolean isOffline;
    private String linkVid;
    private String m3u8;
    private boolean needEncryptCache;
    private String nonce;
    private ArrayList<String> pcdnUrlList;
    private ArrayList<Integer> pcdnVtList;
    private String playDefinition;
    private long preloadDuration;
    private long preloadSize;
    private String randoms;
    private String savePath;
    private List<Map<String, String>> secondaryM3u8List;
    private int starTimeMS;
    private int taskType;
    private int testid;
    private long tm;
    public String url;
    private ArrayList<Map<String, String>> urlCdnidHttpHeaderList;
    private ArrayList<String> urlCdnidList;
    private ArrayList<String> urlCookieList;
    private int urlExpireTime;
    private ArrayList<String> urlHostList;
    private String vid;

    public TPDownloadParamData() {
        this.clipCount = 1;
        this.clipNo = 1;
        this.fp2p = 1;
        this.isOffline = false;
    }

    public TPDownloadParamData(int i10) {
        this(null, i10);
    }

    public TPDownloadParamData(String str) {
        this(str, 0);
    }

    public TPDownloadParamData(String str, int i10) {
        this.clipCount = 1;
        this.clipNo = 1;
        this.fp2p = 1;
        this.isOffline = false;
        this.downloadFileID = str;
        this.dlType = i10;
    }

    public String getAudioTrackKeyId() {
        return this.audioTrackKeyId;
    }

    public String[] getBakUrl() {
        return this.bakUrl;
    }

    public int getBandwidthLevel() {
        return this.bandwidthLevel;
    }

    public String getBase() {
        return this.base;
    }

    public int getClipCount() {
        return this.clipCount;
    }

    public int getClipNo() {
        return this.clipNo;
    }

    public String getCurrentFormat() {
        return this.currentFormat;
    }

    public int getCurrentFormatID() {
        return this.currentFormatID;
    }

    public String getDecKey() {
        return this.decKey;
    }

    public List<Map<String, String>> getDefInfoList() {
        return this.defInfoList;
    }

    public int getDlType() {
        return this.dlType;
    }

    public String getDownloadFileID() {
        return this.downloadFileID;
    }

    public int getEndTimeMS() {
        return this.endTimeMS;
    }

    public int getExceptDelay() {
        return this.expectDelay;
    }

    public Map<String, String> getExtInfoMap() {
        return this.extInfoMap;
    }

    public long getFileDuration() {
        return this.fileDuration;
    }

    public String getFileMD5() {
        return this.fileMD5;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String getFlowId() {
        return this.flowId;
    }

    public Map<String, Integer> getFormatInfo() {
        return this.formatInfo;
    }

    public int getFp2p() {
        return this.fp2p;
    }

    public String getLinkVid() {
        return this.linkVid;
    }

    public String getM3u8() {
        return this.m3u8;
    }

    public String getNonce() {
        return this.nonce;
    }

    public ArrayList<String> getPcdnUrlList() {
        return this.pcdnUrlList;
    }

    public ArrayList<Integer> getPcdnVtList() {
        return this.pcdnVtList;
    }

    public String getPlayDefinition() {
        return this.playDefinition;
    }

    public long getPreloadDuration() {
        return this.preloadDuration;
    }

    public long getPreloadSize() {
        return this.preloadSize;
    }

    public String getRandoms() {
        return this.randoms;
    }

    public String getSavePath() {
        return this.savePath;
    }

    public List<Map<String, String>> getSecondaryM3u8List() {
        return this.secondaryM3u8List;
    }

    public int getStarTimeMS() {
        return this.starTimeMS;
    }

    public int getTaskType() {
        return this.taskType;
    }

    public int getTestid() {
        return this.testid;
    }

    public long getTm() {
        return this.tm;
    }

    public String getUrl() {
        return this.url;
    }

    public ArrayList<Map<String, String>> getUrlCdnidHttpHeaderList() {
        return this.urlCdnidHttpHeaderList;
    }

    public ArrayList<String> getUrlCdnidList() {
        return this.urlCdnidList;
    }

    public ArrayList<String> getUrlCookieList() {
        return this.urlCookieList;
    }

    public int getUrlExpireTime() {
        return this.urlExpireTime;
    }

    public ArrayList<String> getUrlHostList() {
        return this.urlHostList;
    }

    public String getVid() {
        return this.vid;
    }

    public boolean isCharge() {
        return this.isCharge;
    }

    public boolean isExtraParam() {
        return this.extraParam;
    }

    public boolean isNeedEncryptCache() {
        return this.needEncryptCache;
    }

    public boolean isOffline() {
        return this.isOffline;
    }

    public void setAudioTrackKeyId(String str) {
        this.audioTrackKeyId = str;
    }

    public void setBakUrl(String[] strArr) {
        this.bakUrl = strArr;
    }

    public void setBandwidthLevel(int i10) {
        this.bandwidthLevel = i10;
    }

    public void setBase(String str) {
        this.base = str;
    }

    public void setCharge(boolean z10) {
        this.isCharge = z10;
    }

    public void setClipCount(int i10) {
        this.clipCount = i10;
    }

    public void setClipNo(int i10) {
        this.clipNo = i10;
    }

    public void setCurrentFormat(String str) {
        this.currentFormat = str;
    }

    public void setCurrentFormatID(int i10) {
        this.currentFormatID = i10;
    }

    public void setDecKey(String str) {
        this.decKey = str;
    }

    public void setDefInfoList(List<Map<String, String>> list) {
        this.defInfoList = list;
    }

    public void setDlType(int i10) {
        this.dlType = i10;
    }

    public void setDownloadFileID(String str) {
        this.downloadFileID = str;
    }

    public void setEndTimeMS(int i10) {
        this.endTimeMS = i10;
    }

    public void setExpectDelay(int i10) {
        this.expectDelay = i10;
    }

    public void setExtInfoMap(Map<String, String> map) {
        this.extInfoMap = map;
    }

    public void setExtraParam(boolean z10) {
        this.extraParam = z10;
    }

    public void setFileDuration(long j10) {
        this.fileDuration = j10;
    }

    public void setFileMD5(String str) {
        this.fileMD5 = str;
    }

    public void setFileSize(long j10) {
        this.fileSize = j10;
    }

    public void setFlowId(String str) {
        this.flowId = str;
    }

    public void setFormatInfo(Map<String, Integer> map) {
        this.formatInfo = map;
    }

    public void setFp2p(int i10) {
        this.fp2p = i10;
    }

    public void setLinkVid(String str) {
        this.linkVid = str;
    }

    public void setM3u8(String str) {
        this.m3u8 = str;
    }

    public void setNeedEncryptCache(boolean z10) {
        this.needEncryptCache = z10;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setOffline(boolean z10) {
        this.isOffline = z10;
    }

    public void setPcdnUrlList(ArrayList<String> arrayList) {
        this.pcdnUrlList = arrayList;
    }

    public void setPcdnVtList(ArrayList<Integer> arrayList) {
        this.pcdnVtList = arrayList;
    }

    public void setPlayDefinition(String str) {
        this.playDefinition = str;
    }

    public void setPreloadDuration(long j10) {
        this.preloadDuration = j10;
    }

    public void setPreloadSize(long j10) {
        this.preloadSize = j10;
    }

    public void setRandoms(String str) {
        this.randoms = str;
    }

    public void setSavePath(String str) {
        this.savePath = str;
    }

    public void setSecondaryM3u8List(List<Map<String, String>> list) {
        this.secondaryM3u8List = list;
    }

    public void setStarTimeMS(int i10) {
        this.starTimeMS = i10;
    }

    public void setTaskType(int i10) {
        this.taskType = i10;
    }

    public void setTestid(int i10) {
        this.testid = i10;
    }

    public void setTm(long j10) {
        this.tm = j10;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUrlCdnidList(ArrayList<String> arrayList) {
        this.urlCdnidList = arrayList;
    }

    public void setUrlCdnidList(ArrayList<String> arrayList, ArrayList<Map<String, String>> arrayList2) {
        this.urlCdnidList = arrayList;
        this.urlCdnidHttpHeaderList = arrayList2;
    }

    public void setUrlCookieList(ArrayList<String> arrayList) {
        this.urlCookieList = arrayList;
    }

    public void setUrlExpireTime(int i10) {
        this.urlExpireTime = i10;
    }

    public void setUrlHostList(ArrayList<String> arrayList) {
        this.urlHostList = arrayList;
    }

    public void setVid(String str) {
        this.vid = str;
    }
}
