package com.umeng.socialize.media;

import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class UMQQMini extends BaseMediaObject {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f106263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f106264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f106265h;

    public UMQQMini(String str) {
        super(str);
        this.f106263f = "";
        this.f106264g = "";
        this.f106265h = "";
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public UMediaObject.MediaType getMediaType() {
        return UMediaObject.MediaType.WEBPAGE;
    }

    public String getMiniAppId() {
        return this.f106263f;
    }

    public String getPath() {
        return this.f106264g;
    }

    public String getType() {
        return this.f106265h;
    }

    public void setMiniAppId(String str) {
        this.f106263f = str;
    }

    public void setPath(String str) {
        this.f106264g = str;
    }

    public void setType(String str) {
        this.f106265h = str;
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public byte[] toByte() {
        UMImage uMImage = this.f106227e;
        if (uMImage != null) {
            return uMImage.toByte();
        }
        return null;
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public Map<String, Object> toUrlExtraParams() {
        HashMap map = new HashMap();
        if (isUrlMedia()) {
            map.put(SocializeProtocolConstants.PROTOCOL_KEY_FURL, this.f106223a);
            map.put(SocializeProtocolConstants.PROTOCOL_KEY_FTYPE, getMediaType());
            map.put(SocializeProtocolConstants.PROTOCOL_KEY_TITLE, this.f106224b);
        }
        return map;
    }
}
