package com.umeng.commonsdk.stateless;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.ak;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;
import java.util.LinkedList;

/* JADX INFO: compiled from: UMSLNetWorkSender.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f105253a = 273;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f105254b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HandlerThread f105255c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Handler f105256d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f105258f = 274;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f105259g = 275;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f105260h = 512;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static a f105261i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static IntentFilter f105262j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f105263k = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Object f105257e = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static LinkedList<String> f105264l = new LinkedList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static BroadcastReceiver f105265m = new BroadcastReceiver() { // from class: com.umeng.commonsdk.stateless.b.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ConnectivityManager connectivityManager;
            if (context == null || intent == null) {
                return;
            }
            try {
                if (intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    Context unused = b.f105254b = context.getApplicationContext();
                    if (b.f105254b != null && (connectivityManager = (ConnectivityManager) b.f105254b.getSystemService("connectivity")) != null) {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>网络断连： 2号数据仓");
                            boolean unused2 = b.f105263k = false;
                        } else {
                            boolean unused3 = b.f105263k = true;
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>网络可用： 触发2号数据仓信封消费动作。");
                            b.b(274);
                        }
                    }
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(context, th2);
            }
        }
    };

    /* JADX INFO: compiled from: UMSLNetWorkSender.java */
    public static class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i10, String str) {
            if ((i10 & 8) != 8) {
                return;
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
            b.a(274);
        }
    }

    public b(Context context) {
        synchronized (f105257e) {
            if (context != null) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    f105254b = applicationContext;
                    if (applicationContext != null && f105255c == null) {
                        HandlerThread handlerThread = new HandlerThread("SL-NetWorkSender");
                        f105255c = handlerThread;
                        handlerThread.start();
                        if (f105261i == null) {
                            String str = f105254b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.f105247f;
                            File file = new File(str);
                            if (!file.exists()) {
                                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓目录不存在，创建之。");
                                file.mkdir();
                            }
                            a aVar = new a(str);
                            f105261i = aVar;
                            aVar.startWatching();
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓File Monitor启动.");
                        }
                        if (f105256d == null) {
                            f105256d = new Handler(f105255c.getLooper()) { // from class: com.umeng.commonsdk.stateless.b.2
                                @Override // android.os.Handler
                                public void handleMessage(Message message) {
                                    int i10 = message.what;
                                    if (i10 != 512) {
                                        switch (i10) {
                                            case 273:
                                                b.m();
                                                return;
                                            case 274:
                                                b.o();
                                                return;
                                            case 275:
                                                b.q();
                                                break;
                                            default:
                                                return;
                                        }
                                    }
                                    b.r();
                                }
                            };
                        }
                        if (DeviceConfig.checkPermission(f105254b, "android.permission.ACCESS_NETWORK_STATE")) {
                            ULog.i("walle", "[stateless] begin register receiver");
                            if (f105262j == null) {
                                IntentFilter intentFilter = new IntentFilter();
                                f105262j = intentFilter;
                                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                                if (f105265m != null) {
                                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓：注册网络状态监听器。");
                                    f105254b.registerReceiver(f105265m, f105262j);
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    UMCrashManager.reportCrash(context, th2);
                }
            }
        }
    }

    public static void a(int i10) {
        Handler handler;
        if (!f105263k || (handler = f105256d) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i10;
        f105256d.sendMessage(messageObtainMessage);
    }

    public static boolean a() {
        synchronized (f105257e) {
            return f105261i != null;
        }
    }

    public static void b() {
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>信封构建成功： 触发2号数据仓信封消费动作。");
        b(274);
    }

    public static void b(int i10) {
        Handler handler;
        try {
            if (!f105263k || (handler = f105256d) == null || handler.hasMessages(i10)) {
                return;
            }
            Message messageObtainMessage = f105256d.obtainMessage();
            messageObtainMessage.what = i10;
            f105256d.sendMessage(messageObtainMessage);
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(f105254b, th2);
        }
    }

    public static void c() {
        b(275);
    }

    public static void d() {
        b(512);
    }

    private static void j() {
        File[] fileArrC = d.c(f105254b);
        if (fileArrC != null) {
            if (f105264l.size() > 0) {
                f105264l.clear();
            }
            for (File file : fileArrC) {
                f105264l.add(file.getAbsolutePath());
            }
        }
    }

    private static String k() {
        String str = null;
        try {
            String strPeek = f105264l.peek();
            if (strPeek == null) {
                return strPeek;
            }
            try {
                f105264l.removeFirst();
                return strPeek;
            } catch (Throwable unused) {
                str = strPeek;
                return str;
            }
        } catch (Throwable unused2) {
        }
    }

    private static void l() {
        String strPollFirst;
        if (f105264l.size() <= 0) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> todoList无内容，无需处理。");
            return;
        }
        do {
            strPollFirst = f105264l.pollFirst();
            if (!TextUtils.isEmpty(strPollFirst)) {
                File file = new File(strPollFirst);
                if (file.exists()) {
                    c cVar = new c(f105254b);
                    byte[] bArrA = null;
                    try {
                        bArrA = d.a(strPollFirst);
                    } catch (Exception unused) {
                    }
                    String name = file.getName();
                    String strSubstring = !TextUtils.isEmpty(name) ? name.substring(0, 1) : ak.aG;
                    String strD = d.d(name);
                    String str = com.umeng.commonsdk.stateless.a.f105251j;
                    String strC = d.c(strD);
                    if (com.umeng.commonsdk.vchannel.a.f105546c.equalsIgnoreCase(strC)) {
                        str = com.umeng.commonsdk.vchannel.a.f105544a;
                    }
                    if (cVar.a(bArrA, strC, str, strSubstring) && !file.delete()) {
                        file.delete();
                    }
                } else {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 信封文件不存在，处理下一个文件。");
                }
            }
        } while (strPollFirst != null);
        f105264l.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m() {
        File fileA;
        if (!f105263k || f105254b == null) {
            return;
        }
        do {
            try {
                fileA = d.a(f105254b);
                if (fileA != null && fileA.getParentFile() != null && !TextUtils.isEmpty(fileA.getParentFile().getName())) {
                    c cVar = new c(f105254b);
                    String str = new String(Base64.decode(fileA.getParentFile().getName(), 0));
                    if (com.umeng.commonsdk.internal.a.f105191a.equalsIgnoreCase(str) || com.umeng.commonsdk.internal.a.f105192b.equalsIgnoreCase(str) || com.umeng.commonsdk.internal.a.D.equalsIgnoreCase(str)) {
                        new File(fileA.getAbsolutePath()).delete();
                    } else {
                        ULog.i("walle", "[stateless] handleProcessNext, pathUrl is " + str);
                        byte[] bArrA = null;
                        try {
                            bArrA = d.a(fileA.getAbsolutePath());
                        } catch (Exception unused) {
                        }
                        String str2 = com.umeng.commonsdk.vchannel.a.f105546c.equalsIgnoreCase(str) ? com.umeng.commonsdk.vchannel.a.f105544a : "";
                        String str3 = ak.aG;
                        if (UMServerURL.PATH_SHARE.equalsIgnoreCase(str)) {
                            str3 = ak.aB;
                        }
                        if (UMServerURL.PATH_PUSH_LAUNCH.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_REGIST.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_LOG.equalsIgnoreCase(str)) {
                            str3 = "p";
                        }
                        if (!cVar.a(bArrA, str, str2, str3)) {
                            ULog.i("walle", "[stateless] Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                        ULog.i("walle", "[stateless] Send envelope file success, delete it.");
                        File file = new File(fileA.getAbsolutePath());
                        if (!file.delete()) {
                            ULog.i("walle", "[stateless] Failed to delete already processed file. We try again after delete failed.");
                            file.delete();
                        }
                    }
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(f105254b, th2);
            }
        } while (fileA != null);
        n();
    }

    private static void n() {
        try {
            File file = new File(f105254b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.f105246e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓：删除stateless目录。");
                d.a(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o() {
        if (!f105263k || f105254b == null) {
            return;
        }
        j();
        l();
        c();
    }

    private static void p() {
        try {
            File file = new File(f105254b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.f105246e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>2号数据仓：检测到stateless目录。");
                b(273);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q() {
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r() {
    }
}
