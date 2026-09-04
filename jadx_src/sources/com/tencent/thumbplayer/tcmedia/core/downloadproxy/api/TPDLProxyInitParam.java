package com.tencent.thumbplayer.tcmedia.core.downloadproxy.api;

import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class TPDLProxyInitParam implements Serializable {
    private String appVer;
    private String cacheDir;
    private String configStr;
    private String dataDir;
    private String guid;
    private int platform;

    public TPDLProxyInitParam(int i10, String str, String str2) {
        this.cacheDir = "";
        this.dataDir = "";
        this.configStr = "";
        this.platform = i10;
        this.appVer = str;
        this.guid = str2;
    }

    public TPDLProxyInitParam(int i10, String str, String str2, String str3) {
        this(i10, str, str2);
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        this.dataDir = str3;
    }

    public TPDLProxyInitParam(int i10, String str, String str2, String str3, String str4, String str5) {
        this(i10, str, str2, str4);
        if (!TextUtils.isEmpty(str3)) {
            this.cacheDir = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            this.dataDir = str4;
        }
        if (TextUtils.isEmpty(str5)) {
            return;
        }
        this.configStr = str5;
    }

    public String getAppVer() {
        return this.appVer;
    }

    public String getCacheDir() {
        return this.cacheDir;
    }

    public String getConfigStr() {
        return this.configStr;
    }

    public String getDataDir() {
        return this.dataDir;
    }

    public String getGuid() {
        return this.guid;
    }

    public int getPlatform() {
        return this.platform;
    }
}
