package com.tencent.rtmp;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TXPlayInfoParams {
    int mAppId;
    int mEncryptedMp4Level;
    String mFileId;
    private Map<String, String> mHeaders;
    int mMediaType = 0;
    String mPSign;
    String mUrl;

    public TXPlayInfoParams(int i10, String str, String str2) {
        this.mAppId = i10;
        this.mFileId = str;
        this.mPSign = str2;
    }

    public TXPlayInfoParams(String str) {
        this.mUrl = str;
    }

    public int getAppId() {
        return this.mAppId;
    }

    public int getEncryptedMp4Level() {
        return this.mEncryptedMp4Level;
    }

    public String getFileId() {
        return this.mFileId;
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public int getMediaType() {
        return this.mMediaType;
    }

    public String getPSign() {
        return this.mPSign;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public void setEncryptedMp4Level(int i10) {
        this.mEncryptedMp4Level = i10;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setMediaType(int i10) {
        this.mMediaType = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TXPlayInfoParams{");
        if (!TextUtils.isEmpty(this.mFileId)) {
            sb2.append("mAppId=");
            sb2.append(this.mAppId);
            sb2.append(", mFileId='");
            sb2.append(this.mFileId);
            sb2.append('\'');
            sb2.append(", mPSign='");
            sb2.append(this.mPSign);
            sb2.append('\'');
            sb2.append(", mMediaType='");
            sb2.append(this.mMediaType);
            sb2.append('\'');
        } else if (!TextUtils.isEmpty(this.mUrl)) {
            sb2.append(", mUrl='");
            sb2.append(this.mUrl);
            sb2.append('\'');
            sb2.append(", mMediaType='");
            sb2.append(this.mMediaType);
            sb2.append('\'');
        }
        sb2.append(", header='");
        sb2.append(this.mHeaders);
        sb2.append('\'');
        sb2.append('}');
        return sb2.toString();
    }
}
