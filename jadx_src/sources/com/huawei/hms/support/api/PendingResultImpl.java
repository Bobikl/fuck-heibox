package com.huawei.hms.support.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.adapter.BaseAdapter;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.gentyref.GenericTypeReflector;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PendingResultImpl<R extends Result, T extends IMessageEntity> extends InnerPendingResult<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CountDownLatch f62650a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<ApiClient> f62652c;
    protected DatagramTransport transport = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private R f62651b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f62653d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f62654e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f62655f = true;

    public class a implements DatagramTransport.a {
        a() {
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.a
        public void a(int i10, IMessageEntity iMessageEntity) {
            PendingResultImpl.this.a(i10, iMessageEntity);
            PendingResultImpl.this.f62650a.countDown();
        }
    }

    public class b implements DatagramTransport.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f62657a;

        b(AtomicBoolean atomicBoolean) {
            this.f62657a = atomicBoolean;
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.a
        public void a(int i10, IMessageEntity iMessageEntity) {
            if (!this.f62657a.get()) {
                PendingResultImpl.this.a(i10, iMessageEntity);
            }
            PendingResultImpl.this.f62650a.countDown();
        }
    }

    public class c implements DatagramTransport.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f62659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ResultCallback f62660b;

        c(d dVar, ResultCallback resultCallback) {
            this.f62659a = dVar;
            this.f62660b = resultCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.huawei.hms.support.api.transport.DatagramTransport.a
        public void a(int i10, IMessageEntity iMessageEntity) {
            PendingResultImpl.this.a(i10, iMessageEntity);
            this.f62659a.a(this.f62660b, PendingResultImpl.this.f62651b);
        }
    }

    public static class d<R extends Result> extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        public void a(ResultCallback<? super R> resultCallback, R r10) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r10)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected void b(ResultCallback<? super R> resultCallback, R r10) {
            resultCallback.onResult(r10);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            Pair pair = (Pair) message.obj;
            b((ResultCallback) pair.first, (Result) pair.second);
        }
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        a(apiClient, str, iMessageEntity, getResponseType(), 0);
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, int i10) {
        a(apiClient, str, iMessageEntity, getResponseType(), i10);
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls) {
        a(apiClient, str, iMessageEntity, cls, 0);
    }

    private void a(int i10, int i11) {
        SubAppInfo subAppInfo;
        HMSLog.i("PendingResultImpl", "biReportEvent ====== ");
        ApiClient apiClient = this.f62652c.get();
        if (apiClient == null || this.f62653d == null || HiAnalyticsUtil.getInstance().hasError(apiClient.getContext())) {
            HMSLog.e("PendingResultImpl", "<biReportEvent> has some error.");
            return;
        }
        HashMap map = new HashMap();
        map.put("package", apiClient.getPackageName());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.8.0.300");
        if (i11 == 1) {
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        } else {
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
            map.put("result", String.valueOf(i10));
            R r10 = this.f62651b;
            if (r10 != null && r10.getStatus() != null) {
                map.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(this.f62651b.getStatus().getStatusCode()));
            }
        }
        map.put("version", "0");
        String appId = Util.getAppId(apiClient.getContext());
        if (TextUtils.isEmpty(appId) && (subAppInfo = apiClient.getSubAppInfo()) != null) {
            appId = subAppInfo.getSubAppID();
        }
        map.put("appid", appId);
        if (TextUtils.isEmpty(this.f62654e)) {
            String id2 = TransactionIdCreater.getId(appId, this.f62653d);
            this.f62654e = id2;
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, id2);
        } else {
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, this.f62654e);
            this.f62654e = null;
        }
        String[] strArrSplit = this.f62653d.split("\\.");
        if (strArrSplit.length >= 2) {
            map.put("service", strArrSplit[0]);
            map.put("apiName", strArrSplit[1]);
        }
        map.put("callTime", String.valueOf(System.currentTimeMillis()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onEvent(apiClient.getContext(), HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, IMessageEntity iMessageEntity) {
        Status status;
        HMSLog.i("PendingResultImpl", "setResult:" + i10);
        Status commonStatus = iMessageEntity instanceof AbstractMessageEntity ? ((AbstractMessageEntity) iMessageEntity).getCommonStatus() : null;
        if (i10 == 0) {
            this.f62651b = (R) onComplete(iMessageEntity);
        } else {
            this.f62651b = (R) onError(i10);
        }
        if (this.f62655f) {
            a(i10, 2);
        }
        R r10 = this.f62651b;
        if (r10 == null || (status = r10.getStatus()) == null || commonStatus == null) {
            return;
        }
        int statusCode = status.getStatusCode();
        String statusMessage = status.getStatusMessage();
        int statusCode2 = commonStatus.getStatusCode();
        String statusMessage2 = commonStatus.getStatusMessage();
        if (statusCode == statusCode2) {
            if (!TextUtils.isEmpty(statusMessage) || TextUtils.isEmpty(statusMessage2)) {
                return;
            }
            HMSLog.i("PendingResultImpl", "rstStatus msg (" + statusMessage + ") is not equal commonStatus msg (" + statusMessage2 + ")");
            this.f62651b.setStatus(new Status(statusCode, statusMessage2, status.getResolution()));
            return;
        }
        HMSLog.e("PendingResultImpl", "rstStatus code (" + statusCode + ") is not equal commonStatus code (" + statusCode2 + ")");
        HMSLog.e("PendingResultImpl", "rstStatus msg (" + statusMessage + ") is not equal commonStatus msg (" + statusMessage2 + ")");
    }

    private void a(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls, int i10) {
        HMSLog.i("PendingResultImpl", "init uri:" + str);
        this.f62653d = str;
        if (apiClient == null) {
            HMSLog.e("PendingResultImpl", "client is null");
            return;
        }
        this.f62652c = new WeakReference<>(apiClient);
        this.f62650a = new CountDownLatch(1);
        try {
            this.transport = (DatagramTransport) Class.forName(apiClient.getTransportName()).getConstructor(String.class, IMessageEntity.class, Class.class, Integer.TYPE).newInstance(str, iMessageEntity, cls, Integer.valueOf(i10));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            HMSLog.e("PendingResultImpl", "gen transport error:" + e10.getMessage());
            throw new IllegalStateException("Instancing transport exception, " + e10.getMessage(), e10);
        }
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        HMSLog.i("PendingResultImpl", "await");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return (R) awaitOnAnyThread();
        }
        HMSLog.e("PendingResultImpl", "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j10, TimeUnit timeUnit) {
        HMSLog.i("PendingResultImpl", "await timeout:" + j10 + " unit:" + timeUnit.toString());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return (R) awaitOnAnyThread(j10, timeUnit);
        }
        HMSLog.i("PendingResultImpl", "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread() {
        HMSLog.i("PendingResultImpl", "awaitOnAnyThread");
        WeakReference<ApiClient> weakReference = this.f62652c;
        if (weakReference == null) {
            HMSLog.e("PendingResultImpl", "api is null");
            a(CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return this.f62651b;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.e("PendingResultImpl", "client invalid");
            a(CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return this.f62651b;
        }
        if (this.f62655f) {
            a(0, 1);
        }
        this.transport.send(apiClient, new a());
        try {
            this.f62650a.await();
        } catch (InterruptedException unused) {
            HMSLog.e("PendingResultImpl", "await in anythread InterruptedException");
            a(CommonCode.ErrorCode.INTERNAL_ERROR, (IMessageEntity) null);
        }
        return this.f62651b;
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread(long j10, TimeUnit timeUnit) {
        HMSLog.i("PendingResultImpl", "awaitOnAnyThread timeout:" + j10 + " unit:" + timeUnit.toString());
        WeakReference<ApiClient> weakReference = this.f62652c;
        if (weakReference == null) {
            HMSLog.e("PendingResultImpl", "api is null");
            a(CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return this.f62651b;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.e("PendingResultImpl", "client invalid");
            a(CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return this.f62651b;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        if (this.f62655f) {
            a(0, 1);
        }
        this.transport.post(apiClient, new b(atomicBoolean));
        try {
            if (!this.f62650a.await(j10, timeUnit)) {
                atomicBoolean.set(true);
                a(CommonCode.ErrorCode.EXECUTE_TIMEOUT, (IMessageEntity) null);
            }
        } catch (InterruptedException unused) {
            HMSLog.e("PendingResultImpl", "awaitOnAnyThread InterruptedException");
            a(CommonCode.ErrorCode.INTERNAL_ERROR, (IMessageEntity) null);
        }
        return this.f62651b;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void cancel() {
    }

    protected boolean checkApiClient(ApiClient apiClient) {
        return true;
    }

    protected Class<T> getResponseType() {
        Type type;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass == null || (type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1]) == null) {
            return null;
        }
        return (Class) type;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public boolean isCanceled() {
        return false;
    }

    public abstract R onComplete(T t10);

    protected R onError(int i10) {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Type type = genericSuperclass != null ? ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0] : null;
        Class<?> type2 = type != null ? GenericTypeReflector.getType(type) : null;
        if (type2 != null) {
            try {
                R r10 = (R) type2.newInstance();
                this.f62651b = r10;
                r10.setStatus(new Status(i10));
            } catch (Exception e10) {
                HMSLog.e("PendingResultImpl", "on Error:" + e10.getMessage());
                return null;
            }
        }
        return this.f62651b;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
        HMSLog.i("PendingResultImpl", "setResultCallback");
        if (looper == null) {
            looper = Looper.myLooper();
        }
        d dVar = new d(looper);
        WeakReference<ApiClient> weakReference = this.f62652c;
        if (weakReference == null) {
            HMSLog.e("PendingResultImpl", "api is null");
            a(CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return;
        }
        ApiClient apiClient = weakReference.get();
        if (checkApiClient(apiClient)) {
            if (this.f62655f) {
                a(0, 1);
            }
            this.transport.post(apiClient, new c(dVar, resultCallback));
        } else {
            HMSLog.e("PendingResultImpl", "client is invalid");
            a(CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            dVar.a(resultCallback, this.f62651b);
        }
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback) {
        this.f62655f = !(resultCallback instanceof BaseAdapter.BaseRequestResultCallback);
        setResultCallback(Looper.getMainLooper(), resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void setResultCallback(ResultCallback<R> resultCallback, long j10, TimeUnit timeUnit) {
        setResultCallback(resultCallback);
    }
}
