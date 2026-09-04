package com.taobao.downloader.util;

import com.taobao.downloader.Configuration;
import com.taobao.downloader.adpater.Monitor;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public class MonitorUtil {

    public static class DownloadStat {
        public String biz;
        public long connectTime;
        public double downloadSpeed;
        public long downloadTime;
        public String error_code;
        public String error_msg;
        public boolean range;
        public boolean retry;
        public long size;
        public long startTime = System.currentTimeMillis();
        public boolean success;
        public long traffic;
        public URL url;
    }

    public static void monitorFail(String str, String str2, String str3, String str4) {
        Monitor monitor = Configuration.monitor;
        if (monitor != null) {
            monitor.monitorFail("download-sdk", str, str2, str3, str4);
        }
    }

    public static void monitorSuccess(String str, String str2) {
        try {
            Monitor monitor = Configuration.monitor;
            if (monitor == null || !(monitor instanceof Monitor)) {
                return;
            }
            monitor.monitorSuccess("download-sdk", str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void statDownload(DownloadStat downloadStat, String str) {
        Monitor monitor = Configuration.monitor;
        if (monitor != null) {
            try {
                monitor.stat(downloadStat, str);
            } catch (Throwable th2) {
                Dlog.e("stat", "on exception", th2, new Object[0]);
            }
        }
    }
}
