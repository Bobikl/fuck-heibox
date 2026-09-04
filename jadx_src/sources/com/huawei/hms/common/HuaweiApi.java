package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.RequestManager;
import com.huawei.hms.common.internal.ResolveClientBean;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.common.internal.TaskApiCallWrapper;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsInnerClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class HuaweiApi<TOption extends Api.ApiOptions> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f60454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TOption f60455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f60456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractClientBuilder<?, TOption> f60457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f60458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f60459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SubAppInfo f60460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f60461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f60462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f60463j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f60464k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f60465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f60466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RequestManager f60467n;

    public static class RequestHandler<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AnyClient f60472b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HuaweiApi<OptionsT> f60474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ResolveClientBean f60475e;
        public final Queue<TaskApiCallbackWrapper> callbackWaitQueue = new LinkedList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<TaskApiCallbackWrapper> f60471a = new LinkedList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ConnectionResult f60473c = null;

        RequestHandler(HuaweiApi<OptionsT> huaweiApi) {
            this.f60474d = huaweiApi;
            this.f60472b = huaweiApi.getClient(RequestManager.getHandler().getLooper(), this);
        }

        private String a(ConnectionResult connectionResult) {
            if (!Util.isAvailableLibExist(this.f60474d.getContext())) {
                int errorCode = connectionResult.getErrorCode();
                if (errorCode != -1) {
                    if (errorCode != 8) {
                        if (errorCode != 10) {
                            return "unknown errorReason";
                        }
                        return "application configuration error, please developer check configuration";
                    }
                    return "internal error";
                }
                return "get update result, but has other error codes";
            }
            int errorCode2 = connectionResult.getErrorCode();
            if (errorCode2 != -1) {
                if (errorCode2 == 3) {
                    return "HuaWei Mobile Service is disabled";
                }
                if (errorCode2 != 8) {
                    if (errorCode2 != 10) {
                        if (errorCode2 == 13) {
                            return "update cancelled";
                        }
                        if (errorCode2 == 21) {
                            return "device is too old to be support";
                        }
                        switch (errorCode2) {
                            case 25:
                                return "failed to get update result";
                            case 26:
                                return "update failed, because no activity incoming, can't pop update page";
                            case 27:
                                return "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while";
                            default:
                                return "unknown errorReason";
                        }
                    }
                    return "application configuration error, please developer check configuration";
                }
                return "internal error";
            }
            return "get update result, but has other error codes";
        }

        private String a(String str, String str2) {
            return TextUtils.isEmpty(str) ? TransactionIdCreater.getId(this.f60474d.getAppID(), str2) : str;
        }

        private void a(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            TaskApiCallWrapper taskApiCallWrapperA = taskApiCallbackWrapper.a();
            ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Suspended");
            responseHeader.setTransactionId(taskApiCallWrapperA.getTaskApiCall().getTransactionId());
            taskApiCallWrapperA.getTaskApiCall().onResponse(this.f60472b, responseHeader, null, taskApiCallWrapperA.getTaskCompletionSource());
        }

        private TaskApiCallbackWrapper b(final TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private AtomicBoolean f60476a = new AtomicBoolean(true);

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    if (!(iMessageEntity instanceof ResponseHeader)) {
                        HMSLog.e("HuaweiApi", "header is not instance of ResponseHeader");
                        return;
                    }
                    ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                    if (responseHeader.getErrorCode() == 11) {
                        RequestHandler.this.a();
                        HMSLog.i("HuaweiApi", "unbind service");
                    }
                    if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                        HMSLog.e("HuaweiApi", "Response has resolution: " + responseHeader.getResolution());
                    }
                    if (this.f60476a.compareAndSet(true, false)) {
                        HiAnalyticsInnerClient.reportEntryExit(RequestHandler.this.f60474d.getContext(), responseHeader, String.valueOf(RequestHandler.this.f60474d.getKitSdkVersion()));
                    }
                    taskApiCallWrapper.getTaskApiCall().onResponse(RequestHandler.this.f60472b, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f60473c = null;
            this.f60471a.clear();
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                postMessage(it.next());
            }
            this.callbackWaitQueue.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(ConnectionResult connectionResult) {
            this.f60473c = connectionResult;
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                TaskApiCallWrapper taskApiCallWrapperA = it.next().a();
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Failed:" + a(connectionResult) + "(" + connectionResult.getErrorCode() + ")");
                responseHeader.setTransactionId(taskApiCallWrapperA.getTaskApiCall().getTransactionId());
                HiAnalyticsInnerClient.reportEntryExit(this.f60474d.getContext(), responseHeader, String.valueOf(this.f60474d.getKitSdkVersion()));
                if (this.f60473c.getResolution() != null && z10) {
                    responseHeader.setParcelable(this.f60473c.getResolution());
                    z10 = false;
                    if (Util.isAvailableLibExist(this.f60474d.getContext()) && this.f60473c.getErrorCode() == 26) {
                        responseHeader.setResolution(CommonCode.Resolution.HAS_RESOLUTION);
                    }
                }
                int errorCode = this.f60473c.getErrorCode();
                if (errorCode == 30 || errorCode == 31) {
                    responseHeader.setErrorCode(errorCode);
                }
                taskApiCallWrapperA.getTaskApiCall().onResponse(this.f60472b, responseHeader, null, taskApiCallWrapperA.getTaskCompletionSource());
            }
            this.callbackWaitQueue.clear();
            this.f60471a.clear();
            this.f60473c = null;
            this.f60472b.disconnect();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            HMSLog.i("HuaweiApi", "wait queue size = " + this.callbackWaitQueue.size());
            HMSLog.i("HuaweiApi", "run queue size = " + this.f60471a.size());
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            Iterator<TaskApiCallbackWrapper> it2 = this.f60471a.iterator();
            while (it2.hasNext()) {
                a(it2.next());
            }
            this.callbackWaitQueue.clear();
            this.f60471a.clear();
            this.f60473c = null;
            this.f60472b.disconnect();
        }

        void a() {
            this.f60472b.disconnect();
        }

        synchronized void a(int i10, TaskApiCallbackWrapper taskApiCallbackWrapper) {
            if (this.f60472b.isConnected()) {
                HMSLog.d("HuaweiApi", "client is connected");
                return;
            }
            if (this.f60472b.isConnecting()) {
                HMSLog.d("HuaweiApi", "client is isConnecting");
                return;
            }
            if (this.f60474d.getActivity() != null) {
                if (this.f60475e == null) {
                    this.f60475e = new ResolveClientBean(this.f60472b, i10);
                }
                if (BindResolveClients.getInstance().isClientRegistered(this.f60475e)) {
                    HMSLog.i("HuaweiApi", "mResolveClientBean has already register, return!");
                    return;
                }
                BindResolveClients.getInstance().register(this.f60475e);
            }
            this.f60472b.connect(i10);
        }

        void a(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.i("HuaweiApi", "sendRequest");
            TaskApiCallbackWrapper taskApiCallbackWrapperB = b(taskApiCallWrapper);
            int hmsVersionCode = HMSPackageManager.getInstance(((HuaweiApi) this.f60474d).f60454a).getHmsVersionCode();
            if ((hmsVersionCode < 40000000 && hmsVersionCode > 0) && this.f60472b.isConnected() && !((HuaweiApi) this.f60474d).f60466m && ((BaseHmsClient) this.f60472b).getAdapter().getServiceAction().equals("com.huawei.hms.core.aidlservice")) {
                int requestHmsVersionCode = this.f60472b.getRequestHmsVersionCode();
                if (requestHmsVersionCode <= taskApiCallWrapper.getTaskApiCall().getMinApkVersion()) {
                    requestHmsVersionCode = taskApiCallWrapper.getTaskApiCall().getMinApkVersion();
                }
                if (requestHmsVersionCode > hmsVersionCode) {
                    this.f60472b.disconnect();
                }
            }
            if (this.f60472b.isConnected()) {
                HMSLog.i("HuaweiApi", "isConnected:true.");
                BinderAdapter adapter = ((BaseHmsClient) this.f60472b).getAdapter();
                adapter.updateDelayTask();
                ((HmsClient) this.f60472b).setService(IAIDLInvoke.Stub.asInterface(adapter.getServiceBinder()));
                postMessage(taskApiCallbackWrapperB);
                return;
            }
            HMSLog.i("HuaweiApi", "isConnected:false.");
            this.callbackWaitQueue.add(taskApiCallbackWrapperB);
            ConnectionResult connectionResult = this.f60473c;
            if (connectionResult == null || connectionResult.getErrorCode() == 0) {
                RequestManager.addRequestToQueue(this);
                Object obj = this.f60472b;
                if (obj instanceof BaseHmsClient) {
                    ((BaseHmsClient) obj).setInternalRequest(this);
                }
                a(taskApiCallWrapper.getTaskApiCall().getMinApkVersion(), taskApiCallbackWrapperB);
                return;
            }
            HMSLog.i("HuaweiApi", "onConnectionFailed, ErrorCode:" + this.f60473c.getErrorCode());
            onConnectionFailed(this.f60473c);
        }

        public AnyClient getClient() {
            return this.f60472b;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.i("HuaweiApi", "onConnected");
            BindResolveClients.getInstance().unRegister(this.f60475e);
            this.f60475e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.4
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.b();
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(final ConnectionResult connectionResult) {
            HMSLog.i("HuaweiApi", "onConnectionFailed");
            BindResolveClients.getInstance().unRegister(this.f60475e);
            this.f60475e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.3
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.b(connectionResult);
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i10) {
            HMSLog.i("HuaweiApi", "onConnectionSuspended");
            BindResolveClients.getInstance().unRegister(this.f60475e);
            this.f60475e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.5
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.c();
                }
            });
        }

        public void postMessage(final TaskApiCallbackWrapper taskApiCallbackWrapper) {
            RequestManager.addToConnectedReqMap(taskApiCallbackWrapper.a().getTaskApiCall().getTransactionId(), this);
            this.f60471a.add(taskApiCallbackWrapper);
            String uri = taskApiCallbackWrapper.a().getTaskApiCall().getUri();
            String packageName = (((HuaweiApi) this.f60474d).f60456c == null ? this.f60474d.getContext() : ((HuaweiApi) this.f60474d).f60456c).getPackageName();
            if (((HuaweiApi) this.f60474d).f60456c != null) {
                HuaweiApi<OptionsT> huaweiApi = this.f60474d;
                huaweiApi.b(((HuaweiApi) huaweiApi).f60456c);
            }
            final RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.f60474d.getAppID() + "|" + this.f60474d.getSubAppID());
            requestHeader.setPkgName(packageName);
            requestHeader.setSessionId(this.f60472b.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.a().getTaskApiCall();
            requestHeader.setTransactionId(a(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.f60474d.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.f60474d.getApiLevel(), taskApiCall.getApiLevel()));
            this.f60472b.post(requestHeader, taskApiCall.getRequestJson(), new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2
                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    AnyClient.CallBack callBackB = taskApiCallbackWrapper.b();
                    if (callBackB != null) {
                        callBackB.onCallback(iMessageEntity, str);
                    }
                    RequestManager.removeReqByTransId(requestHeader.getTransactionId());
                    RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            RequestHandler.this.f60471a.remove(taskApiCallbackWrapper);
                        }
                    });
                }
            });
        }
    }

    public static class TaskApiCallbackWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TaskApiCallWrapper f60487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AnyClient.CallBack f60488b;

        TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.f60487a = taskApiCallWrapper;
            this.f60488b = callBack;
        }

        TaskApiCallWrapper a() {
            return this.f60487a;
        }

        AnyClient.CallBack b() {
            return this.f60488b;
        }
    }

    public static class a<OptionsT extends Api.ApiOptions> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HuaweiApi<OptionsT> f60489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TaskApiCallWrapper f60490b;

        public a(HuaweiApi<OptionsT> huaweiApi, TaskApiCallWrapper taskApiCallWrapper) {
            this.f60489a = huaweiApi;
            this.f60490b = taskApiCallWrapper;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005f  */
        /* JADX WARN: Code duplicated, block: B:29:0x0062  */
        /* JADX WARN: Code duplicated, block: B:30:0x0066  */
        private void a(RequestHandler requestHandler, Throwable th2) {
            Throwable th3;
            AnyClient client;
            String string;
            ResponseHeader responseHeader;
            TaskCompletionSource taskCompletionSource;
            TaskApiCall taskApiCall = null;
            try {
                client = requestHandler.getClient();
                try {
                    responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.INTERNAL_ERROR, th2.getMessage());
                    try {
                        string = new JSONObject().toString();
                        try {
                            taskCompletionSource = this.f60490b.getTaskCompletionSource();
                            try {
                                taskApiCall = this.f60490b.getTaskApiCall();
                            } catch (Throwable th4) {
                                th3 = th4;
                                HMSLog.e("HuaweiApi", "<notifyCpException> " + th3.getMessage());
                            }
                        } catch (Throwable th5) {
                            th3 = th5;
                            taskCompletionSource = null;
                        }
                    } catch (Throwable th6) {
                        th3 = th6;
                        string = null;
                        taskCompletionSource = null;
                    }
                } catch (Throwable th7) {
                    th3 = th7;
                    string = null;
                    responseHeader = null;
                    taskCompletionSource = null;
                    HMSLog.e("HuaweiApi", "<notifyCpException> " + th3.getMessage());
                    if ((client != null || responseHeader == null || string == null || taskCompletionSource == null || taskApiCall == null) ? false : true) {
                        taskApiCall.onResponse(client, responseHeader, string, taskCompletionSource);
                    } else {
                        HMSLog.e("HuaweiApi", "<notifyCpException> isNotify is false, Can not notify CP.");
                    }
                }
            } catch (Throwable th8) {
                th3 = th8;
                client = null;
            }
            if ((client != null || responseHeader == null || string == null || taskCompletionSource == null || taskApiCall == null) ? false : true) {
                taskApiCall.onResponse(client, responseHeader, string, taskCompletionSource);
            } else {
                HMSLog.e("HuaweiApi", "<notifyCpException> isNotify is false, Can not notify CP.");
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestHandler requestHandler = new RequestHandler(this.f60489a);
            try {
                requestHandler.a(this.f60490b);
            } catch (Throwable th2) {
                a(requestHandler, th2);
            }
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f60461h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, 0, null);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i10) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f60461h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, i10, null);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i10, String str) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f60461h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, i10, str);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, 0, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i10) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, i10, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i10, String str) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, i10, str);
    }

    private <TResult, TClient extends AnyClient> Task<TResult> a(TaskApiCall<TClient, TResult> taskApiCall) {
        TaskCompletionSource taskCompletionSource = taskApiCall.getToken() == null ? new TaskCompletionSource() : new TaskCompletionSource(taskApiCall.getToken());
        RequestManager.getHandler().post(new a(this, new TaskApiCallWrapper(taskApiCall, taskCompletionSource)));
        return taskCompletionSource.getTask();
    }

    private void a(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    private void a(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i10, String str) {
        this.f60454a = context.getApplicationContext();
        this.f60455b = toption;
        this.f60457d = abstractClientBuilder;
        b(context);
        this.f60460g = new SubAppInfo("");
        this.f60462i = i10;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(this.f60458e)) {
                HMSLog.e("HuaweiApi", "subAppId is host appid");
            } else {
                HMSLog.i("HuaweiApi", "subAppId is " + str);
                this.f60460g = new SubAppInfo(str);
            }
        }
        a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HuaweiApi<?> huaweiApi, TaskCompletionSource<Boolean> taskCompletionSource) {
        HMSLog.i("HuaweiApi", "innerDisconnect.");
        try {
            huaweiApi.getClient(RequestManager.getHandler().getLooper(), null).disconnect();
            taskCompletionSource.setResult(Boolean.TRUE);
        } catch (Exception e10) {
            HMSLog.w("HuaweiApi", "disconnect the binder failed for:" + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        String appId = Util.getAppId(context);
        this.f60458e = appId;
        this.f60459f = appId;
    }

    @Deprecated
    public Task<Boolean> disconnectService() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        RequestManager.getInstance();
        RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.1
            @Override // java.lang.Runnable
            public void run() {
                HuaweiApi.this.a((HuaweiApi<?>) this, (TaskCompletionSource<Boolean>) taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public <TResult, TClient extends AnyClient> Task<TResult> doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        this.f60464k = true;
        if (taskApiCall == null) {
            HMSLog.e("HuaweiApi", "in doWrite:taskApiCall is null");
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setException(new ApiException(Status.FAILURE));
            return taskCompletionSource.getTask();
        }
        HiAnalyticsInnerClient.reportEntryClient(this.f60454a, taskApiCall.getUri(), TextUtils.isEmpty(this.f60460g.getSubAppID()) ? this.f60459f : this.f60460g.getSubAppID(), taskApiCall.getTransactionId(), String.valueOf(getKitSdkVersion()));
        if (this.f60467n == null) {
            this.f60467n = RequestManager.getInstance();
        }
        return a(taskApiCall);
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.f60461h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getApiLevel() {
        return this.f60463j;
    }

    public String getAppID() {
        return this.f60459f;
    }

    public AnyClient getClient(Looper looper, RequestHandler requestHandler) {
        return this.f60457d.buildClient(this.f60454a, getClientSetting(), requestHandler, requestHandler);
    }

    protected ClientSettings getClientSetting() {
        ClientSettings clientSettings = new ClientSettings(this.f60454a.getPackageName(), this.f60454a.getClass().getName(), getScopes(), this.f60458e, null, this.f60460g);
        if (!this.f60466m) {
            this.f60465l = HMSPackageManager.getInstance(this.f60454a).getHMSPackageNameForMultiService();
            HMSLog.i("HuaweiApi", "No setInnerHms, hms pkg name is " + this.f60465l);
        }
        clientSettings.setInnerHmsPkg(this.f60465l);
        clientSettings.setUseInnerHms(this.f60466m);
        WeakReference<Activity> weakReference = this.f60461h;
        if (weakReference != null) {
            clientSettings.setCpActivity(weakReference.get());
        }
        return clientSettings;
    }

    public Context getContext() {
        return this.f60454a;
    }

    public int getKitSdkVersion() {
        return this.f60462i;
    }

    public TOption getOption() {
        return this.f60455b;
    }

    protected List<Scope> getScopes() {
        return Collections.emptyList();
    }

    public String getSubAppID() {
        return this.f60460g.getSubAppID();
    }

    public void setApiLevel(int i10) {
        this.f60463j = i10;
    }

    public void setHostContext(Context context) {
        this.f60456c = context;
    }

    public void setInnerHms() {
        this.f60465l = this.f60454a.getPackageName();
        this.f60466m = true;
        HMSLog.i("HuaweiApi", "<setInnerHms> init inner hms pkg info:" + this.f60465l);
    }

    public void setKitSdkVersion(int i10) {
        this.f60462i = i10;
    }

    public void setSubAppId(String str) throws ApiException {
        if (!setSubAppInfo(new SubAppInfo(str))) {
            throw new ApiException(Status.FAILURE);
        }
    }

    @Deprecated
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.i("HuaweiApi", "Enter setSubAppInfo");
        SubAppInfo subAppInfo2 = this.f60460g;
        if (subAppInfo2 != null && !TextUtils.isEmpty(subAppInfo2.getSubAppID())) {
            HMSLog.e("HuaweiApi", "subAppInfo is already set");
            return false;
        }
        if (subAppInfo == null) {
            HMSLog.e("HuaweiApi", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.e("HuaweiApi", "subAppId is empty");
            return false;
        }
        if (subAppID.equals(this.f60458e)) {
            HMSLog.e("HuaweiApi", "subAppId is host appid");
            return false;
        }
        if (this.f60464k) {
            HMSLog.e("HuaweiApi", "Client has sent request to Huawei Mobile Services, setting subAppId is not allowed");
            return false;
        }
        this.f60460g = new SubAppInfo(subAppInfo);
        return true;
    }
}
