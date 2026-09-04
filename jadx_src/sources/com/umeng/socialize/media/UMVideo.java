package com.umeng.socialize.media;

import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class UMVideo extends BaseMediaObject {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f106266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f106267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f106268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f106269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f106270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f106271k;

    public UMVideo(File file) {
        this.f106271k = file;
    }

    public UMVideo(String str) {
        super(str);
    }

    public int getDuration() {
        return this.f106270j;
    }

    public String getH5Url() {
        return this.f106269i;
    }

    public String getHighBandDataUrl() {
        return this.f106268h;
    }

    public File getLocalVideoFile() {
        return this.f106271k;
    }

    public String getLowBandDataUrl() {
        return this.f106267g;
    }

    public String getLowBandUrl() {
        return this.f106266f;
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public UMediaObject.MediaType getMediaType() {
        return UMediaObject.MediaType.VEDIO;
    }

    public void setDuration(int i10) {
        this.f106270j = i10;
    }

    public void setH5Url(String str) {
        this.f106269i = str;
    }

    public void setHighBandDataUrl(String str) {
        this.f106268h = str;
    }

    public void setLowBandDataUrl(String str) {
        this.f106267g = str;
    }

    public void setLowBandUrl(String str) {
        this.f106266f = str;
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public byte[] toByte() {
        UMImage uMImage = this.f106227e;
        if (uMImage != null) {
            return uMImage.toByte();
        }
        return null;
    }

    @Override // com.umeng.socialize.media.BaseMediaObject
    public String toString() {
        return "UMVedio [media_url=" + this.f106223a + ", qzone_title=" + this.f106224b + ", qzone_thumb=media_url=" + this.f106223a + ", qzone_title=" + this.f106224b + ", qzone_thumb=]";
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public final Map<String, Object> toUrlExtraParams() {
        HashMap map = new HashMap();
        if (isUrlMedia()) {
            map.put(SocializeProtocolConstants.PROTOCOL_KEY_FURL, this.f106223a);
            map.put(SocializeProtocolConstants.PROTOCOL_KEY_FTYPE, getMediaType());
        }
        return map;
    }
}
