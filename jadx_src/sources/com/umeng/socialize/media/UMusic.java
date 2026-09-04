package com.umeng.socialize.media;

import android.os.Parcel;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class UMusic extends BaseMediaObject {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f106272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f106273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f106274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f106275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f106276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f106277k;

    protected UMusic(Parcel parcel) {
        super(parcel);
    }

    public UMusic(String str) {
        super(str);
    }

    public int getDuration() {
        return this.f106276j;
    }

    public String getH5Url() {
        return this.f106274h;
    }

    public String getHighBandDataUrl() {
        return this.f106273g;
    }

    public String getLowBandDataUrl() {
        return this.f106272f;
    }

    public String getLowBandUrl() {
        return this.f106275i;
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public UMediaObject.MediaType getMediaType() {
        return UMediaObject.MediaType.MUSIC;
    }

    @Override // com.umeng.socialize.media.BaseMediaObject
    public UMImage getThumbImage() {
        return this.f106227e;
    }

    public String getmTargetUrl() {
        return this.f106277k;
    }

    public void setDuration(int i10) {
        this.f106276j = i10;
    }

    public void setH5Url(String str) {
        this.f106274h = str;
    }

    public void setHighBandDataUrl(String str) {
        this.f106273g = str;
    }

    public void setLowBandDataUrl(String str) {
        this.f106272f = str;
    }

    public void setLowBandUrl(String str) {
        this.f106275i = str;
    }

    public void setmTargetUrl(String str) {
        this.f106277k = str;
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
        return "UMusic [title=" + this.f106224b + "media_url=" + this.f106223a + ", qzone_title=" + this.f106224b + ", qzone_thumb=]";
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public final Map<String, Object> toUrlExtraParams() {
        HashMap map = new HashMap();
        if (isUrlMedia()) {
            map.put(SocializeProtocolConstants.PROTOCOL_KEY_FURL, this.f106223a);
            map.put(SocializeProtocolConstants.PROTOCOL_KEY_FTYPE, getMediaType());
            map.put(SocializeProtocolConstants.PROTOCOL_KEY_TITLE, this.f106224b);
        }
        return map;
    }
}
