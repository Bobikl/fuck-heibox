package com.ss.bytertc.ktv.data;

import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class DownloadResult {
    public String filePath;
    public DownloadFileType fileType;
    public String musicId;

    @CalledByNative
    public DownloadResult(@n0 String str, @n0 DownloadFileType downloadFileType, @p0 String str2) {
        this.musicId = str;
        this.fileType = downloadFileType;
        this.filePath = str2;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DownloadResult{musicId='");
        sb2.append(this.musicId);
        sb2.append('\'');
        sb2.append(", fileType=");
        sb2.append(this.fileType);
        if (DownloadFileType.MUSIC == this.fileType) {
            str = "";
        } else {
            str = ", filePath='" + this.filePath + '\'';
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
