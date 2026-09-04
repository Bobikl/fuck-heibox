package com.tencent.rtmp.downloader;

import android.text.TextUtils;
import com.tencent.rtmp.TXPlayerAuthBuilder;

/* JADX INFO: loaded from: classes4.dex */
public class TXVodDownloadDataSource {
    public static final int QUALITY_1080P = 1080;
    public static final int QUALITY_240P = 240;
    public static final int QUALITY_2K = 5;
    public static final int QUALITY_360P = 360;
    public static final int QUALITY_480P = 480;
    public static final int QUALITY_4K = 6;
    public static final int QUALITY_540P = 540;
    public static final int QUALITY_720P = 720;

    @Deprecated
    public static final int QUALITY_FHD = 4;

    @Deprecated
    public static final int QUALITY_FLU = 1;

    @Deprecated
    public static final int QUALITY_HD = 3;
    public static final int QUALITY_OD = 0;

    @Deprecated
    public static final int QUALITY_SD = 2;
    public static final int QUALITY_UNK = 1000;
    protected int appId;
    protected TXPlayerAuthBuilder authBuilder;
    protected String fileId;
    protected String overlayIv;
    protected String overlayKey;
    protected String pSign;
    protected int quality;
    protected String templateName;
    protected String token;
    protected String userName;

    protected TXVodDownloadDataSource() {
        this.appId = -1;
        this.fileId = "";
        this.pSign = "";
        this.quality = 1000;
        this.userName = "default";
        this.overlayKey = "";
        this.overlayIv = "";
    }

    public TXVodDownloadDataSource(int i10, String str, int i11, String str2, String str3) {
        this.userName = "default";
        this.overlayKey = "";
        this.overlayIv = "";
        this.appId = i10;
        this.fileId = str;
        this.quality = i11;
        this.pSign = str2;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        this.userName = str3;
    }

    @Deprecated
    public TXVodDownloadDataSource(TXPlayerAuthBuilder tXPlayerAuthBuilder, int i10) {
        this.appId = -1;
        this.fileId = "";
        this.pSign = "";
        this.userName = "default";
        this.overlayKey = "";
        this.overlayIv = "";
        this.authBuilder = tXPlayerAuthBuilder;
        this.quality = i10;
    }

    @Deprecated
    public TXVodDownloadDataSource(TXPlayerAuthBuilder tXPlayerAuthBuilder, String str) {
        this.appId = -1;
        this.fileId = "";
        this.pSign = "";
        this.quality = 1000;
        this.userName = "default";
        this.overlayKey = "";
        this.overlayIv = "";
        this.authBuilder = tXPlayerAuthBuilder;
        this.templateName = str;
    }

    public int getAppId() {
        return this.appId;
    }

    @Deprecated
    public TXPlayerAuthBuilder getAuthBuilder() {
        return this.authBuilder;
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getOverlayIv() {
        return this.overlayIv;
    }

    public String getOverlayKey() {
        return this.overlayKey;
    }

    public String getPSign() {
        return this.pSign;
    }

    public int getQuality() {
        return this.quality;
    }

    @Deprecated
    public String getTemplateName() {
        return this.templateName;
    }

    public String getToken() {
        return this.token;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setQuality(int i10) {
        this.quality = i10;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
