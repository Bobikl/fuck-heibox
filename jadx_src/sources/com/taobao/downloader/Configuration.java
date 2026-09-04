package com.taobao.downloader;

import android.content.Context;
import com.taobao.downloader.adpater.BizPriManager;
import com.taobao.downloader.adpater.CloundConfigAdapter;
import com.taobao.downloader.adpater.DnsService;
import com.taobao.downloader.adpater.DownloadFactory;
import com.taobao.downloader.adpater.FileCacheManager;
import com.taobao.downloader.adpater.Logger;
import com.taobao.downloader.adpater.Monitor;
import com.taobao.downloader.adpater.TaskManager;
import com.taobao.downloader.adpater.ThreadExecutor;
import com.taobao.downloader.download.protocol.DLConnection;

/* JADX INFO: loaded from: classes4.dex */
public class Configuration {
    public static int CONCURRENT_DOWNLOAD_SIZE = 2;
    public static int MAX_AWAIT_TIME = 10;
    public static BizPriManager bizPriManager = null;
    public static CloundConfigAdapter cloundConfigAdapter = null;
    public static Class<? extends DLConnection> dlConnectionClazz = null;
    public static DnsService dnsService = null;
    public static DownloadFactory downloadFactory = null;
    public static FileCacheManager fileCacheManager = null;
    public static boolean logDebugEnabled = false;
    public static Logger logger;
    public static Monitor monitor;
    public static int networkType;
    public static Context sContext;
    public static TaskManager taskManager;
    public static ThreadExecutor threadExecutor;
}
