package com.umeng.socialize.net.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.socialize.Config;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMMin;
import com.umeng.socialize.media.UMVideo;
import com.umeng.socialize.media.UMWeb;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.media.UMusic;
import com.umeng.socialize.net.base.SocializeRequest;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.umeng.socialize.net.utils.URequest;
import com.umeng.socialize.utils.SocializeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class AnalyticsReqeust extends SocializeRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f106285a = "/share/multi_add/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f106286b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f106287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f106288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f106289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f106290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f106291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f106292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f106293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private UMediaObject f106294j;

    public AnalyticsReqeust(Context context, String str, String str2) {
        super(context, "", AnalyticsResponse.class, 9, URequest.RequestMethod.POST);
        this.mContext = context;
        this.f106288d = str;
        this.f106293i = str2;
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest
    protected String getPath() {
        return f106285a + SocializeUtils.getAppkey(this.mContext) + "/" + Config.EntityKey + "/";
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest, com.umeng.socialize.net.utils.URequest
    public void onPrepareRequest() {
        super.onPrepareRequest();
        Object[] objArr = new Object[2];
        objArr[0] = this.f106288d;
        String str = this.f106287c;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        String str2 = String.format("{\"%s\":\"%s\"}", objArr);
        String appkey = SocializeUtils.getAppkey(this.mContext);
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_DESCRIPTOR, Config.Descriptor);
        addStringParams("to", str2);
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_SHARE_SNS, str2);
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_AK, appkey);
        addStringParams("type", this.f106290f);
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_SHARE_USID, this.f106287c);
        addStringParams("ct", this.f106293i);
        if (!TextUtils.isEmpty(this.f106292h)) {
            addStringParams("url", this.f106292h);
        }
        if (!TextUtils.isEmpty(this.f106291g)) {
            addStringParams("title", this.f106291g);
        }
        addMediaParams(this.f106294j);
    }

    public void setMedia(UMediaObject uMediaObject) {
        if (uMediaObject instanceof UMImage) {
            this.f106294j = uMediaObject;
            return;
        }
        if (uMediaObject instanceof UMusic) {
            UMusic uMusic = (UMusic) uMediaObject;
            this.f106291g = uMusic.getTitle();
            this.f106292h = uMusic.toUrl();
            this.f106293i = uMusic.getDescription();
            this.f106294j = uMusic.getThumbImage();
            return;
        }
        if (uMediaObject instanceof UMVideo) {
            UMVideo uMVideo = (UMVideo) uMediaObject;
            this.f106291g = uMVideo.getTitle();
            this.f106292h = uMVideo.toUrl();
            this.f106293i = uMVideo.getDescription();
            this.f106294j = uMVideo.getThumbImage();
            return;
        }
        if (uMediaObject instanceof UMWeb) {
            UMWeb uMWeb = (UMWeb) uMediaObject;
            this.f106291g = uMWeb.getTitle();
            this.f106292h = uMWeb.toUrl();
            this.f106293i = uMWeb.getDescription();
            this.f106294j = uMWeb.getThumbImage();
            return;
        }
        if (uMediaObject instanceof UMMin) {
            UMMin uMMin = (UMMin) uMediaObject;
            this.f106291g = uMMin.getTitle();
            this.f106292h = uMMin.toUrl();
            this.f106293i = uMMin.getDescription();
            this.f106294j = uMMin.getThumbImage();
        }
    }

    public void setPlatform(String str) {
        this.f106288d = str;
    }

    public void setText(String str) {
        this.f106293i = str;
    }

    public void setType(String str) {
        this.f106290f = str;
    }

    public void setUID(String str) {
        this.f106289e = str;
    }

    public void setmUsid(String str) {
        this.f106287c = str;
    }
}
