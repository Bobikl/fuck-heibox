package com.umeng.commonsdk.framework;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.UMUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UMWorkDispatch {
    public static final String GENERAL_CONTENT = "content";
    public static final String GENERAL_HEADER = "header";
    public static final String KEY_EXCEPTION = "exception";
    private static final int MSG_AUTO_PROCESS = 769;
    private static final int MSG_CHECKER_TIMER = 771;
    private static final int MSG_DELAY_PROCESS = 770;
    private static final int MSG_QUIT = 784;
    private static final int MSG_SEND_EVENT = 768;
    private static HandlerThread mNetTask;
    private static a mSender;
    private static Object mSenderInitLock = new Object();
    private static Handler mTaskHandler;

    private UMWorkDispatch() {
    }

    public static void Quit() {
        Handler handler = mTaskHandler;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = 784;
            mTaskHandler.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void delayProcess() {
        JSONObject jSONObjectBuildEnvelopeWithExtHeader;
        ULog.d("--->>> delayProcess Enter...");
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> delayProcess Enter...");
        Context appContext = UMModuleRegister.getAppContext();
        if (appContext == null || !UMFrUtils.isOnline(appContext)) {
            return;
        }
        long jMaxDataSpace = UMEnvelopeBuild.maxDataSpace(appContext);
        UMLogDataProtocol callbackFromModuleName = UMModuleRegister.getCallbackFromModuleName("analytics");
        JSONObject jSONObject = null;
        if (callbackFromModuleName != null) {
            try {
                jSONObject = callbackFromModuleName.setupReportData(jMaxDataSpace);
                if (jSONObject == null) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> analyticsCB.setupReportData() return null");
                    return;
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(appContext, th2);
                return;
            }
        }
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.opt("header");
        JSONObject jSONObject3 = (JSONObject) jSONObject.opt("content");
        if (jSONObject2 == null || jSONObject3 == null || (jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(appContext, jSONObject2, jSONObject3)) == null) {
            return;
        }
        try {
            if (jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> autoProcess: Build envelope error code: " + jSONObjectBuildEnvelopeWithExtHeader.getInt("exception"));
            }
        } catch (Throwable unused) {
        }
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> autoProcess: removeCacheData ... ");
        callbackFromModuleName.removeCacheData(jSONObjectBuildEnvelopeWithExtHeader);
    }

    public static synchronized boolean eventHasExist() {
        Handler handler = mTaskHandler;
        if (handler == null) {
            return false;
        }
        return handler.hasMessages(771);
    }

    public static synchronized boolean eventHasExist(int i10) {
        Handler handler = mTaskHandler;
        if (handler == null) {
            return false;
        }
        return handler.hasMessages(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleEvent(Message message) {
        int i10 = message.arg1;
        Object obj = message.obj;
        UMLogDataProtocol callbackFromModuleName = UMModuleRegister.getCallbackFromModuleName(UMModuleRegister.eventType2ModuleName(i10));
        if (callbackFromModuleName != null) {
            ULog.d("--->>> dispatch:handleEvent: call back workEvent with msg type [ 0x" + Integer.toHexString(i10) + "]");
            callbackFromModuleName.workEvent(obj, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleQuit() {
        if (mSender == null || mNetTask == null) {
            return;
        }
        a.c();
        ULog.d("--->>> handleQuit: Quit dispatch thread.");
        mNetTask.quit();
        teardown();
    }

    private static synchronized void init() {
        ULog.d("--->>> Dispatch: init Enter...");
        try {
            if (mNetTask == null) {
                HandlerThread handlerThread = new HandlerThread("work_thread");
                mNetTask = handlerThread;
                handlerThread.start();
                if (mTaskHandler == null) {
                    mTaskHandler = new Handler(mNetTask.getLooper()) { // from class: com.umeng.commonsdk.framework.UMWorkDispatch.1
                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            int i10 = message.what;
                            if (i10 == 768) {
                                UMWorkDispatch.handleEvent(message);
                                return;
                            }
                            if (i10 == 784) {
                                UMWorkDispatch.handleQuit();
                            } else if (i10 == 770) {
                                UMWorkDispatch.delayProcess();
                            } else {
                                if (i10 != 771) {
                                    return;
                                }
                                UMWorkDispatch.handleEvent(message);
                            }
                        }
                    };
                }
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th2);
        }
        ULog.d("--->>> Dispatch: init Exit...");
    }

    public static void registerConnStateObserver(UMSenderStateNotify uMSenderStateNotify) {
        if (mSender != null) {
            a.a(uMSenderStateNotify);
        }
    }

    public static synchronized void removeEvent() {
        Handler handler = mTaskHandler;
        if (handler == null) {
            return;
        }
        handler.removeMessages(771);
    }

    public static synchronized void removeEvent(int i10) {
        Handler handler = mTaskHandler;
        if (handler == null) {
            return;
        }
        handler.removeMessages(i10);
    }

    public static void sendDelayProcessMsg(long j10) {
        Handler handler = mTaskHandler;
        if (handler != null) {
            if (handler.hasMessages(770)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> MSG_DELAY_PROCESS has exist. do nothing.");
                return;
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> MSG_DELAY_PROCESS not exist. send it.");
            Message messageObtainMessage = mTaskHandler.obtainMessage();
            messageObtainMessage.what = 770;
            mTaskHandler.sendMessageDelayed(messageObtainMessage, j10);
        }
    }

    public static void sendEvent(Context context, int i10, UMLogDataProtocol uMLogDataProtocol, Object obj) {
        sendEventInternal(context, 768, i10, uMLogDataProtocol, obj, 0L);
    }

    public static void sendEvent(Context context, int i10, UMLogDataProtocol uMLogDataProtocol, Object obj, long j10) {
        sendEventInternal(context, 768, i10, uMLogDataProtocol, obj, j10);
    }

    public static void sendEventEx(Context context, int i10, UMLogDataProtocol uMLogDataProtocol, Object obj, long j10) {
        sendEventInternal(context, 771, i10, uMLogDataProtocol, obj, j10);
    }

    public static void sendEventInternal(Context context, int i10, int i11, UMLogDataProtocol uMLogDataProtocol, Object obj, long j10) {
        if (context == null || uMLogDataProtocol == null) {
            ULog.d("--->>> Context or UMLogDataProtocol parameter cannot be null!");
            return;
        }
        UMModuleRegister.registerAppContext(context.getApplicationContext());
        if (UMModuleRegister.registerCallback(i11, uMLogDataProtocol)) {
            if (mNetTask == null || mTaskHandler == null) {
                init();
            }
            try {
                if (mTaskHandler != null) {
                    if (UMUtils.isMainProgress(context)) {
                        synchronized (mSenderInitLock) {
                            if (mSender == null) {
                                UMFrUtils.syncLegacyEnvelopeIfNeeded(context);
                                mSender = new a(context, mTaskHandler);
                            }
                        }
                    }
                    Message messageObtainMessage = mTaskHandler.obtainMessage();
                    messageObtainMessage.what = i10;
                    messageObtainMessage.arg1 = i11;
                    messageObtainMessage.obj = obj;
                    mTaskHandler.sendMessageDelayed(messageObtainMessage, j10);
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th2);
            }
        }
    }

    private static void teardown() {
        if (mNetTask != null) {
            mNetTask = null;
        }
        if (mTaskHandler != null) {
            mTaskHandler = null;
        }
        if (mSender != null) {
            mSender = null;
        }
    }
}
