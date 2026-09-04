package com.umeng.socialize.utils;

import android.content.Context;
import android.os.Build;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.SocializeConstants;

/* JADX INFO: loaded from: classes4.dex */
public class URLBuilder {
    private String imei;
    private String mac;
    private String model;
    private String network;
    private String os;
    private String protoversion;
    private String sdkversion;
    private String ts;
    private String mReqType = "0";
    private String mHost = null;
    private String mPath = null;
    private String mAppkey = null;
    private String mEntityKey = null;
    private String mOpId = null;
    private String mUID = null;
    private String mSessionId = null;
    private String mPlatfrom = null;

    public URLBuilder(Context context) {
        this.imei = null;
        this.mac = null;
        this.network = null;
        this.model = null;
        this.sdkversion = null;
        this.os = null;
        this.ts = null;
        this.protoversion = null;
        this.imei = DeviceConfig.getDeviceId(context);
        this.mac = DeviceConfig.getMac(context);
        this.network = DeviceConfig.getNetworkAccessMode(context)[0];
        this.model = Build.MODEL;
        this.sdkversion = "7.3.2";
        this.os = "Android";
        this.ts = String.valueOf(System.currentTimeMillis());
        this.protoversion = SocializeConstants.PROTOCOL_VERSON;
    }

    private String buildParams() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("via=");
        sb2.append(this.mPlatfrom.toLowerCase());
        sb2.append("&opid=");
        sb2.append(this.mOpId);
        sb2.append("&ak=");
        sb2.append(this.mAppkey);
        sb2.append("&pcv=");
        sb2.append(this.protoversion);
        sb2.append("&tp=");
        sb2.append(this.mReqType);
        if (this.imei != null) {
            sb2.append("&imei=");
            sb2.append(this.imei);
        }
        if (this.mac != null) {
            sb2.append("&mac=");
            sb2.append(this.mac);
        }
        if (this.network != null) {
            sb2.append("&en=");
            sb2.append(this.network);
        }
        if (this.model != null) {
            sb2.append("&de=");
            sb2.append(this.model);
        }
        if (this.sdkversion != null) {
            sb2.append("&sdkv=");
            sb2.append(this.sdkversion);
        }
        if (this.os != null) {
            sb2.append("&os=");
            sb2.append(this.os);
        }
        if (this.ts != null) {
            sb2.append("&dt=");
            sb2.append(this.ts);
        }
        if (this.mUID != null) {
            sb2.append("&uid=");
            sb2.append(this.mUID);
        }
        if (this.mEntityKey != null) {
            sb2.append("&ek=");
            sb2.append(this.mEntityKey);
        }
        if (this.mSessionId != null) {
            sb2.append("&sid=");
            sb2.append(this.mSessionId);
        }
        return sb2.toString();
    }

    public URLBuilder setAppkey(String str) {
        this.mAppkey = str;
        return this;
    }

    public URLBuilder setEntityKey(String str) {
        this.mEntityKey = str;
        return this;
    }

    public URLBuilder setHost(String str) {
        this.mHost = str;
        return this;
    }

    public URLBuilder setPath(String str) {
        this.mPath = str;
        return this;
    }

    public String to() {
        return this.mHost + this.mPath + this.mAppkey + "/" + this.mEntityKey + "/?" + buildParams();
    }

    public String toEncript() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mHost);
        sb2.append(this.mPath);
        sb2.append(this.mAppkey);
        sb2.append("/");
        sb2.append(this.mEntityKey);
        sb2.append("/?");
        String strBuildParams = buildParams();
        try {
            sb2.append(strBuildParams);
        } catch (Exception unused) {
            sb2.append(strBuildParams);
        }
        return sb2.toString();
    }

    public URLBuilder withMedia(SHARE_MEDIA share_media) {
        this.mPlatfrom = share_media.toString();
        return this;
    }

    public URLBuilder withOpId(String str) {
        this.mOpId = str;
        return this;
    }

    public URLBuilder withSessionId(String str) {
        this.mSessionId = str;
        return this;
    }

    public URLBuilder withUID(String str) {
        this.mUID = str;
        return this;
    }
}
