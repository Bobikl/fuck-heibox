package com.umeng.commonsdk.framework;

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
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.c;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: UMNetWorkSender.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements UMImprintChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HandlerThread f105165a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f105166b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f105167c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f105168d = 200;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f105169e = 273;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f105170f = 274;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f105171g = 512;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f105172h = 769;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static FileObserverC1041a f105173i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static ConnectivityManager f105174j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static NetworkInfo f105175k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static IntentFilter f105176l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f105177m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static ArrayList<UMSenderStateNotify> f105178n = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f105181q = "report_policy";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f105182r = "report_interval";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f105184t = 15;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f105185u = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f105186v = 90;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static Object f105179o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static ReentrantLock f105180p = new ReentrantLock();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f105183s = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f105187w = 15;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static Object f105188x = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static BroadcastReceiver f105189y = new BroadcastReceiver() { // from class: com.umeng.commonsdk.framework.a.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int size;
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                Context appContext = UMModuleRegister.getAppContext();
                try {
                    if (a.f105174j != null) {
                        NetworkInfo unused = a.f105175k = a.f105174j.getActiveNetworkInfo();
                        if (a.f105175k == null || !a.f105175k.isAvailable()) {
                            ULog.i("--->>> network disconnected.");
                            boolean unused2 = a.f105177m = false;
                            return;
                        }
                        ULog.i("--->>> network isAvailable, check if there are any files to send.");
                        boolean unused3 = a.f105177m = true;
                        synchronized (a.f105179o) {
                            if (a.f105178n != null && (size = a.f105178n.size()) > 0) {
                                for (int i10 = 0; i10 < size; i10++) {
                                    ((UMSenderStateNotify) a.f105178n.get(i10)).onConnectionAvailable();
                                }
                            }
                        }
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "网络状态通知：尝试发送 MSG_PROCESS_NEXT");
                        a.d();
                        if (a.f105175k.getType() != 1 || context == null) {
                            return;
                        }
                        try {
                            if (UMWorkDispatch.eventHasExist(com.umeng.commonsdk.internal.a.f105201k)) {
                                return;
                            }
                            UMWorkDispatch.sendEvent(context, com.umeng.commonsdk.internal.a.f105201k, b.a(context).a(), null);
                        } catch (Throwable unused4) {
                        }
                    }
                } catch (Throwable th2) {
                    UMCrashManager.reportCrash(appContext, th2);
                }
            }
        }
    };

    /* JADX INFO: renamed from: com.umeng.commonsdk.framework.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: UMNetWorkSender.java */
    public static class FileObserverC1041a extends FileObserver {
        public FileObserverC1041a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i10, String str) {
            if ((i10 & 8) != 8) {
                return;
            }
            ULog.d("--->>> envelope file created >>> " + str);
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
            a.c(273);
        }
    }

    public a(Context context, Handler handler) {
        Context appContext = UMModuleRegister.getAppContext();
        f105174j = (ConnectivityManager) appContext.getSystemService("connectivity");
        f105167c = handler;
        try {
            if (f105165a == null) {
                HandlerThread handlerThread = new HandlerThread("NetWorkSender");
                f105165a = handlerThread;
                handlerThread.start();
                if (f105173i == null) {
                    FileObserverC1041a fileObserverC1041a = new FileObserverC1041a(UMFrUtils.getEnvelopeDirPath(context));
                    f105173i = fileObserverC1041a;
                    fileObserverC1041a.startWatching();
                    ULog.d("--->>> FileMonitor has already started!");
                }
                if (DeviceConfig.checkPermission(appContext, "android.permission.ACCESS_NETWORK_STATE") && f105174j != null && f105176l == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    f105176l = intentFilter;
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    BroadcastReceiver broadcastReceiver = f105189y;
                    if (broadcastReceiver != null) {
                        appContext.registerReceiver(broadcastReceiver, f105176l);
                    }
                }
                n();
                if (f105166b == null) {
                    f105166b = new Handler(f105165a.getLooper()) { // from class: com.umeng.commonsdk.framework.a.2
                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            int i10 = message.what;
                            if (i10 == 273) {
                                ULog.d("--->>> handleMessage: recv MSG_PROCESS_NEXT msg.");
                                try {
                                    a.f105180p.tryLock(1L, TimeUnit.SECONDS);
                                    try {
                                        a.r();
                                    } catch (Throwable unused) {
                                    }
                                    a.f105180p.unlock();
                                    return;
                                } catch (Throwable unused2) {
                                    return;
                                }
                            }
                            if (i10 == 274) {
                                a.p();
                            } else {
                                if (i10 != 512) {
                                    return;
                                }
                                a.q();
                            }
                        }
                    };
                }
                ImprintHandler.getImprintService(context).registImprintCallback(f105181q, this);
                ImprintHandler.getImprintService(context).registImprintCallback(f105182r, this);
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
        }
    }

    private static void a(int i10, int i11) {
        Handler handler;
        if (!f105177m || (handler = f105166b) == null) {
            return;
        }
        handler.removeMessages(i10);
        Message messageObtainMessage = f105166b.obtainMessage();
        messageObtainMessage.what = i10;
        f105166b.sendMessageDelayed(messageObtainMessage, i11);
    }

    private static void a(int i10, long j10) {
        Handler handler;
        if (!f105177m || (handler = f105166b) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i10;
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> sendMsgDelayed: " + j10);
        f105166b.sendMessageDelayed(messageObtainMessage, j10);
    }

    public static void a(UMSenderStateNotify uMSenderStateNotify) {
        synchronized (f105179o) {
            try {
                if (f105178n == null) {
                    f105178n = new ArrayList<>();
                }
                if (uMSenderStateNotify != null) {
                    for (int i10 = 0; i10 < f105178n.size(); i10++) {
                        if (uMSenderStateNotify == f105178n.get(i10)) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> addConnStateObserver: input item has exist.");
                            return;
                        }
                    }
                    f105178n.add(uMSenderStateNotify);
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th2);
            }
        }
    }

    public static boolean a() {
        boolean z10;
        synchronized (f105188x) {
            z10 = f105183s;
        }
        return z10;
    }

    public static int b() {
        int i10;
        synchronized (f105188x) {
            i10 = f105187w;
        }
        return i10;
    }

    private static void b(int i10) {
        Handler handler;
        if (!f105177m || (handler = f105166b) == null || handler.hasMessages(i10)) {
            return;
        }
        Message messageObtainMessage = f105166b.obtainMessage();
        messageObtainMessage.what = i10;
        f105166b.sendMessage(messageObtainMessage);
    }

    public static void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(int i10) {
        Handler handler;
        if (!f105177m || (handler = f105166b) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i10;
        f105166b.sendMessage(messageObtainMessage);
    }

    public static void d() {
        if (f105180p.tryLock()) {
            try {
                b(273);
            } finally {
                f105180p.unlock();
            }
        }
    }

    public static void e() {
        a(274, 3000);
    }

    private void n() {
        synchronized (f105188x) {
            if ("11".equals(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f105181q, ""))) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                f105183s = true;
                f105187w = 15;
                int iIntValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f105182r, "15")).intValue();
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + iIntValue);
                if (iIntValue < 3 || iIntValue > 90) {
                    f105187w = 15;
                } else {
                    f105187w = iIntValue * 1000;
                }
            } else {
                f105183s = false;
            }
        }
    }

    private static void o() {
        if (f105165a != null) {
            f105165a = null;
        }
        if (f105166b != null) {
            f105166b = null;
        }
        if (f105167c != null) {
            f105167c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p() {
        int size;
        synchronized (f105179o) {
            ArrayList<UMSenderStateNotify> arrayList = f105178n;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    f105178n.get(i10).onSenderIdle();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r() {
        ULog.d("--->>> handleProcessNext: Enter...");
        if (f105177m) {
            Context appContext = UMModuleRegister.getAppContext();
            try {
                if (UMFrUtils.envelopeFileNumber(appContext) > 0) {
                    ULog.d("--->>> The envelope file exists.");
                    if (UMFrUtils.envelopeFileNumber(appContext) > 200) {
                        ULog.d("--->>> Number of envelope files is greater than 200, remove old files first.");
                        UMFrUtils.removeRedundantEnvelopeFiles(appContext, 200);
                    }
                    File envelopeFile = UMFrUtils.getEnvelopeFile(appContext);
                    if (envelopeFile != null) {
                        String path = envelopeFile.getPath();
                        ULog.d("--->>> Ready to send envelope file [" + path + "].");
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send envelope file [ " + path + "].");
                        if (!new c(appContext).a(envelopeFile)) {
                            ULog.d("--->>> Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                        ULog.d("--->>> Send envelope file success, delete it.");
                        if (!UMFrUtils.removeEnvelopeFile(envelopeFile)) {
                            ULog.d("--->>> Failed to delete already processed file. We try again after delete failed.");
                            UMFrUtils.removeEnvelopeFile(envelopeFile);
                        }
                        c(273);
                        return;
                    }
                }
                e();
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(appContext, th2);
            }
        }
    }

    @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
    public void onImprintValueChanged(String str, String str2) {
        synchronized (f105188x) {
            if (f105181q.equals(str)) {
                if ("11".equals(str2)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                    f105183s = true;
                } else {
                    f105183s = false;
                }
            }
            if (f105182r.equals(str)) {
                int iIntValue = Integer.valueOf(str2).intValue();
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + iIntValue);
                if (iIntValue < 3 || iIntValue > 90) {
                    f105187w = 15000;
                } else {
                    f105187w = iIntValue * 1000;
                }
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> really set report_interval value to: " + f105187w);
            }
        }
    }
}
