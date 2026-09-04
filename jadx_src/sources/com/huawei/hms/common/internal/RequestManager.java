package com.huawei.hms.common.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.support.log.HMSLog;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes7.dex */
public class RequestManager implements Handler.Callback {
    public static final int NOTIFY_CONNECT_FAILED = 10012;
    public static final int NOTIFY_CONNECT_SUCCESS = 10011;
    public static final int NOTIFY_CONNECT_SUSPENDED = 10013;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile RequestManager f60542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f60543c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f60541a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Queue<HuaweiApi.RequestHandler> f60544d = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Map<String, HuaweiApi.RequestHandler> f60545e = new LinkedHashMap();

    private RequestManager(Looper looper) {
        f60543c = new Handler(looper, this);
    }

    private void a(Message message) {
        HMSLog.i("RequestManager", "NOTIFY_CONNECT_FAILED.");
        try {
            BaseHmsClient.ConnectionResultWrapper connectionResultWrapper = (BaseHmsClient.ConnectionResultWrapper) message.obj;
            HuaweiApi.RequestHandler request = connectionResultWrapper.getRequest();
            f60544d.remove(request);
            request.onConnectionFailed(connectionResultWrapper.getConnectionResult());
        } catch (RuntimeException e10) {
            HMSLog.e("RequestManager", "<handleConnectFailed> handle Failed" + e10.getMessage());
        }
    }

    public static void addRequestToQueue(HuaweiApi.RequestHandler requestHandler) {
        f60544d.add(requestHandler);
    }

    public static void addToConnectedReqMap(final String str, final HuaweiApi.RequestHandler requestHandler) {
        if (f60543c == null) {
            return;
        }
        HMSLog.i("RequestManager", "addToConnectedReqMap");
        f60543c.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.1
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.f60545e.put(str, requestHandler);
            }
        });
    }

    private void b() {
        while (!f60544d.isEmpty()) {
            HuaweiApi.RequestHandler requestHandlerPoll = f60544d.poll();
            if (requestHandlerPoll != null) {
                Object client = requestHandlerPoll.getClient();
                if (client instanceof BaseHmsClient) {
                    BaseHmsClient baseHmsClient = (BaseHmsClient) client;
                    baseHmsClient.setService(IAIDLInvoke.Stub.asInterface(baseHmsClient.getAdapter().getServiceBinder()));
                    requestHandlerPoll.onConnected();
                }
            }
        }
    }

    private void c() {
        HMSLog.i("RequestManager", "NOTIFY_CONNECT_SUSPENDED.");
        while (!f60544d.isEmpty()) {
            f60544d.poll().onConnectionSuspended(1);
        }
        d();
    }

    private void d() {
        HMSLog.i("RequestManager", "notifyRunningRequestConnectSuspend, connectedReqMap.size(): " + f60545e.size());
        Iterator<Map.Entry<String, HuaweiApi.RequestHandler>> it = f60545e.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().onConnectionSuspended(1);
            } catch (RuntimeException e10) {
                HMSLog.e("RequestManager", "NOTIFY_CONNECT_SUSPENDED Exception: " + e10.getMessage());
            }
            it.remove();
        }
    }

    public static Handler getHandler() {
        return f60543c;
    }

    public static RequestManager getInstance() {
        synchronized (f60541a) {
            if (f60542b == null) {
                HandlerThread handlerThread = new HandlerThread("RequestManager");
                handlerThread.start();
                f60542b = new RequestManager(handlerThread.getLooper());
            }
        }
        return f60542b;
    }

    public static void removeReqByTransId(final String str) {
        if (f60543c == null) {
            return;
        }
        HMSLog.i("RequestManager", "removeReqByTransId");
        f60543c.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.2
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.f60545e.remove(str);
            }
        });
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message == null) {
            return false;
        }
        HMSLog.i("RequestManager", "RequestManager handleMessage.");
        switch (message.what) {
            case 10011:
                b();
                return true;
            case 10012:
                a(message);
                return true;
            case 10013:
                c();
                return true;
            default:
                HMSLog.i("RequestManager", "handleMessage unknown msg:" + message.what);
                return false;
        }
    }
}
