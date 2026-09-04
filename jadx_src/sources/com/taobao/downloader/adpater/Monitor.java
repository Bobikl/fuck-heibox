package com.taobao.downloader.adpater;

import com.taobao.downloader.util.MonitorUtil;

/* JADX INFO: loaded from: classes4.dex */
public interface Monitor {
    public static final String POINT_ADD = "add";
    public static final String POINT_ALL_CALLBACK = "allcallback";
    public static final String POINT_URL = "url";

    void monitorCount(String str, String str2, String str3, int i10);

    void monitorFail(String str, String str2, String str3, String str4, String str5);

    void monitorSuccess(String str, String str2, String str3);

    void stat(MonitorUtil.DownloadStat downloadStat, String str);
}
