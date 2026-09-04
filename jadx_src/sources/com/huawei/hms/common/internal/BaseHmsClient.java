package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.adapter.InnerBinderAdapter;
import com.huawei.hms.adapter.OuterBinderAdapter;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.FailedBinderCallBack;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.IPCTransport;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseHmsClient implements AidlApiClient {
    protected static final int TIMEOUT_DISCONNECTED = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f60501i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f60502j = new AtomicInteger(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicInteger f60503k = new AtomicInteger(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static BinderAdapter f60504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static BinderAdapter f60505m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f60506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ClientSettings f60508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile IAIDLInvoke f60509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConnectionCallbacks f60510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final OnConnectionFailedListener f60511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f60512g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HuaweiApi.RequestHandler f60513h;
    protected String sessionId;

    public interface ConnectionCallbacks {
        public static final int CAUSE_API_CLIENT_EXPIRED = 3;
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected();

        void onConnectionSuspended(int i10);
    }

    public static final class ConnectionResultWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HuaweiApi.RequestHandler f60518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ConnectionResult f60519b;

        public ConnectionResultWrapper(HuaweiApi.RequestHandler requestHandler, ConnectionResult connectionResult) {
            this.f60518a = requestHandler;
            this.f60519b = connectionResult;
        }

        public ConnectionResult getConnectionResult() {
            return this.f60519b;
        }

        public HuaweiApi.RequestHandler getRequest() {
            return this.f60518a;
        }
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public BaseHmsClient(Context context, ClientSettings clientSettings, OnConnectionFailedListener onConnectionFailedListener, ConnectionCallbacks connectionCallbacks) {
        this.f60506a = context;
        this.f60508c = clientSettings;
        this.f60507b = clientSettings.getAppID();
        this.f60511f = onConnectionFailedListener;
        this.f60510e = connectionCallbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        HMSLog.i("BaseHmsClient", "notifyFailed result: " + i10);
        Message message = new Message();
        message.what = 10012;
        message.obj = new ConnectionResultWrapper(this.f60513h, new ConnectionResult(i10));
        RequestManager.getHandler().sendMessage(message);
        OnConnectionFailedListener onConnectionFailedListener = this.f60511f;
        if (onConnectionFailedListener == null || (onConnectionFailedListener instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        onConnectionFailedListener.onConnectionFailed(new ConnectionResult(i10));
    }

    private void a(int i10, boolean z10) {
        HMSLog.i("BaseHmsClient", "====== HMSSDK version: 60800300 ======");
        int i11 = (this.f60508c.isUseInnerHms() ? f60503k : f60502j).get();
        HMSLog.i("BaseHmsClient", "Enter connect, Connection Status: " + i11);
        if (z10 || !(i11 == 3 || i11 == 5)) {
            if (getMinApkVersion() > i10) {
                i10 = getMinApkVersion();
            }
            HMSLog.i("BaseHmsClient", "connect minVersion:" + i10 + " packageName:" + this.f60508c.getInnerHmsPkg());
            if (this.f60506a.getPackageName().equals(this.f60508c.getInnerHmsPkg())) {
                HMSLog.i("BaseHmsClient", "service packageName is same, bind core service return");
                a();
                return;
            }
            if (!Util.isAvailableLibExist(this.f60506a)) {
                int iIsHuaweiMobileServicesAvailable = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(this.f60506a, i10);
                HMSLog.i("BaseHmsClient", "HuaweiApiAvailability check available result: " + iIsHuaweiMobileServicesAvailable);
                if (iIsHuaweiMobileServicesAvailable == 0) {
                    a();
                    return;
                } else {
                    a(iIsHuaweiMobileServicesAvailable);
                    return;
                }
            }
            AvailableAdapter availableAdapter = new AvailableAdapter(i10);
            int iIsHuaweiMobileServicesAvailable2 = availableAdapter.isHuaweiMobileServicesAvailable(this.f60506a);
            HMSLog.i("BaseHmsClient", "check available result: " + iIsHuaweiMobileServicesAvailable2);
            if (iIsHuaweiMobileServicesAvailable2 == 0) {
                a();
                return;
            }
            if (availableAdapter.isUserResolvableError(iIsHuaweiMobileServicesAvailable2)) {
                HMSLog.i("BaseHmsClient", "bindCoreService3.0 fail, start resolution now.");
                b(availableAdapter, iIsHuaweiMobileServicesAvailable2);
            } else {
                if (availableAdapter.isUserNoticeError(iIsHuaweiMobileServicesAvailable2)) {
                    HMSLog.i("BaseHmsClient", "bindCoreService3.0 fail, start notice now.");
                    a(availableAdapter, iIsHuaweiMobileServicesAvailable2);
                    return;
                }
                HMSLog.i("BaseHmsClient", "bindCoreService3.0 fail: " + iIsHuaweiMobileServicesAvailable2 + " is not resolvable.");
                a(iIsHuaweiMobileServicesAvailable2);
            }
        }
    }

    private void a(AvailableAdapter availableAdapter, int i10) {
        HMSLog.i("BaseHmsClient", "enter notice");
        if (!getClientSettings().isHasActivity()) {
            if (i10 == 29) {
                i10 = 9;
            }
            a(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.f60506a, i10, 0)));
        } else {
            Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
            if (activeActivity != null) {
                availableAdapter.startNotice(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.2
                    @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                    public void onComplete(int i11) {
                        BaseHmsClient.this.a(i11);
                    }
                });
            } else {
                a(26);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ConnectionResult connectionResult) {
        HMSLog.i("BaseHmsClient", "notifyFailed result: " + connectionResult.getErrorCode());
        Message message = new Message();
        message.what = 10012;
        HuaweiApi.RequestHandler requestHandler = this.f60513h;
        this.f60513h = null;
        message.obj = new ConnectionResultWrapper(requestHandler, connectionResult);
        RequestManager.getHandler().sendMessage(message);
        OnConnectionFailedListener onConnectionFailedListener = this.f60511f;
        if (onConnectionFailedListener == null || (onConnectionFailedListener instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        onConnectionFailedListener.onConnectionFailed(connectionResult);
    }

    private void a(String str, String str2) {
        if (this.f60508c.isUseInnerHms()) {
            f60505m = InnerBinderAdapter.getInstance(this.f60506a, str2, str);
            if (!isConnected()) {
                b(5);
                f60505m.binder(c());
                return;
            } else {
                HMSLog.i("BaseHmsClient", "The binder is already connected.");
                getAdapter().updateDelayTask();
                connectedInternal(getAdapter().getServiceBinder());
                return;
            }
        }
        f60504l = OuterBinderAdapter.getInstance(this.f60506a, str2, str);
        if (!isConnected()) {
            b(5);
            f60504l.binder(c());
        } else {
            HMSLog.i("BaseHmsClient", "The binder is already connected.");
            getAdapter().updateDelayTask();
            connectedInternal(getAdapter().getServiceBinder());
        }
    }

    private void b() {
        synchronized (f60501i) {
            Handler handler = this.f60512g;
            if (handler != null) {
                handler.removeMessages(2);
                this.f60512g = null;
            }
        }
    }

    private void b(AvailableAdapter availableAdapter, int i10) {
        HMSLog.i("BaseHmsClient", "enter HmsCore resolution");
        if (!getClientSettings().isHasActivity()) {
            a(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.f60506a, i10, 0)));
            return;
        }
        Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
        if (activeActivity != null) {
            availableAdapter.startResolution(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.3
                @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                public void onComplete(int i11) {
                    if (i11 == 0) {
                        BaseHmsClient.this.a();
                    } else {
                        BaseHmsClient.this.a(i11);
                    }
                }
            });
        } else {
            a(26);
        }
    }

    private BinderAdapter.BinderCallBack c() {
        return new BinderAdapter.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1
            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i10) {
                onBinderFailed(i10, null);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i10, Intent intent) {
                if (intent == null) {
                    HMSLog.i("BaseHmsClient", "onBinderFailed: intent is null!");
                    BaseHmsClient.this.a(new ConnectionResult(10, (PendingIntent) null));
                    BaseHmsClient.this.f60509d = null;
                    return;
                }
                Activity activeActivity = Util.getActiveActivity(BaseHmsClient.this.getClientSettings().getCpActivity(), BaseHmsClient.this.getContext());
                if (activeActivity == null) {
                    HMSLog.i("BaseHmsClient", "onBinderFailed: return pendingIntent to kit and cp");
                    BaseHmsClient.this.a(new ConnectionResult(10, PendingIntent.getActivity(BaseHmsClient.this.f60506a, 11, intent, 67108864)));
                    BaseHmsClient.this.f60509d = null;
                    return;
                }
                HMSLog.i("BaseHmsClient", "onBinderFailed: SDK try to resolve and reConnect!");
                long time = new Timestamp(System.currentTimeMillis()).getTime();
                FailedBinderCallBack.getInstance().setCallBack(Long.valueOf(time), new FailedBinderCallBack.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1.1
                    @Override // com.huawei.hms.api.FailedBinderCallBack.BinderCallBack
                    public void binderCallBack(int i11) {
                        if (i11 != 0) {
                            BaseHmsClient.this.a(new ConnectionResult(10, (PendingIntent) null));
                            BaseHmsClient.this.f60509d = null;
                        }
                    }
                });
                intent.putExtra(FailedBinderCallBack.CALLER_ID, time);
                activeActivity.startActivity(intent);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onNullBinding(ComponentName componentName) {
                BaseHmsClient.this.b(1);
                BaseHmsClient.this.a(10);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                HMSLog.i("BaseHmsClient", "Enter onServiceConnected.");
                BaseHmsClient.this.connectedInternal(iBinder);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceDisconnected(ComponentName componentName) {
                HMSLog.i("BaseHmsClient", "Enter onServiceDisconnected.");
                BaseHmsClient.this.b(1);
                RequestManager.getHandler().sendEmptyMessage(10013);
                if (BaseHmsClient.this.f60510e == null || (BaseHmsClient.this.f60510e instanceof HuaweiApi.RequestHandler)) {
                    return;
                }
                BaseHmsClient.this.f60510e.onConnectionSuspended(1);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onTimedDisconnected() {
                BaseHmsClient.this.b(6);
                if (BaseHmsClient.this.f60510e == null || (BaseHmsClient.this.f60510e instanceof HuaweiApi.RequestHandler)) {
                    return;
                }
                BaseHmsClient.this.f60510e.onConnectionSuspended(1);
            }
        };
    }

    private void d() {
        HMSLog.w("BaseHmsClient", "Failed to get service as interface, trying to unbind.");
        if (this.f60508c.isUseInnerHms()) {
            BinderAdapter binderAdapter = f60505m;
            if (binderAdapter == null) {
                HMSLog.w("BaseHmsClient", "mInnerBinderAdapter is null.");
                return;
            }
            binderAdapter.unBind();
        } else {
            BinderAdapter binderAdapter2 = f60504l;
            if (binderAdapter2 == null) {
                HMSLog.w("BaseHmsClient", "mOuterBinderAdapter is null.");
                return;
            }
            binderAdapter2.unBind();
        }
        b(1);
        a(10);
    }

    private void e() {
        if (this.f60508c.isUseInnerHms()) {
            BinderAdapter binderAdapter = f60505m;
            if (binderAdapter != null) {
                binderAdapter.unBind();
                return;
            }
            return;
        }
        BinderAdapter binderAdapter2 = f60504l;
        if (binderAdapter2 != null) {
            binderAdapter2.unBind();
        }
    }

    void a() {
        String innerHmsPkg = this.f60508c.getInnerHmsPkg();
        String serviceAction = getServiceAction();
        HMSLog.i("BaseHmsClient", "enter bindCoreService, packageName is " + innerHmsPkg + ", serviceAction is " + serviceAction);
        a(innerHmsPkg, serviceAction);
    }

    void b(int i10) {
        if (this.f60508c.isUseInnerHms()) {
            f60503k.set(i10);
        } else {
            f60502j.set(i10);
        }
    }

    protected final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(int i10) {
        a(i10, false);
    }

    public void connect(int i10, boolean z10) {
        a(i10, z10);
    }

    public void connectedInternal(IBinder iBinder) {
        this.f60509d = IAIDLInvoke.Stub.asInterface(iBinder);
        if (this.f60509d != null) {
            onConnecting();
        } else {
            HMSLog.e("BaseHmsClient", "mService is null, try to unBind.");
            d();
        }
    }

    protected final void connectionConnected() {
        b(3);
        RequestManager.getHandler().sendEmptyMessage(10011);
        ConnectionCallbacks connectionCallbacks = this.f60510e;
        if (connectionCallbacks == null || (connectionCallbacks instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        connectionCallbacks.onConnected();
    }

    public void disconnect() {
        int i10 = (this.f60508c.isUseInnerHms() ? f60503k : f60502j).get();
        HMSLog.i("BaseHmsClient", "Enter disconnect, Connection Status: " + i10);
        if (i10 == 3) {
            e();
            b(1);
        } else {
            if (i10 != 5) {
                return;
            }
            b();
            b(1);
        }
    }

    public BinderAdapter getAdapter() {
        HMSLog.i("BaseHmsClient", "getAdapter:isInner:" + this.f60508c.isUseInnerHms() + ", mInnerBinderAdapter:" + f60505m + ", mOuterBinderAdapter:" + f60504l);
        return this.f60508c.isUseInnerHms() ? f60505m : f60504l;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        return this.f60508c.getApiName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.f60507b;
    }

    protected ClientSettings getClientSettings() {
        return this.f60508c;
    }

    public int getConnectionStatus() {
        return (this.f60508c.isUseInnerHms() ? f60503k : f60502j).get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.f60506a;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.f60508c.getCpID();
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.f60508c.getClientPackageName();
    }

    public int getRequestHmsVersionCode() {
        return getMinApkVersion();
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public IAIDLInvoke getService() {
        return this.f60509d;
    }

    public String getServiceAction() {
        HMSPackageManager hMSPackageManager = HMSPackageManager.getInstance(this.f60506a);
        return this.f60508c.isUseInnerHms() ? hMSPackageManager.getInnerServiceAction() : hMSPackageManager.getServiceAction();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public SubAppInfo getSubAppInfo() {
        return this.f60508c.getSubAppID();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        return !this.f60508c.isUseInnerHms() ? f60502j.get() != 3 : f60503k.get() != 3;
    }

    public boolean isConnecting() {
        return (this.f60508c.isUseInnerHms() ? f60503k : f60502j).get() == 5;
    }

    public void onConnecting() {
        connectionConnected();
    }

    public final void setInternalRequest(HuaweiApi.RequestHandler requestHandler) {
        this.f60513h = requestHandler;
    }

    public void setService(IAIDLInvoke iAIDLInvoke) {
        this.f60509d = iAIDLInvoke;
    }
}
