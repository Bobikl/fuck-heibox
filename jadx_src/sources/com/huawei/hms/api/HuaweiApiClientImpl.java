package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.common.api.ConnectionPostProcessor;
import com.huawei.hms.common.internal.AutoLifecycleFragment;
import com.huawei.hms.core.aidl.CodecLookup;
import com.huawei.hms.core.aidl.DataBuffer;
import com.huawei.hms.core.aidl.IAIDLCallback;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.MessageCodec;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.core.aidl.ResponseHeader;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.BundleResult;
import com.huawei.hms.support.api.client.InnerApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.core.ConnectService;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public class HuaweiApiClientImpl extends HuaweiApiClient implements InnerApiClient, ServiceConnection {
    private static final Object A = new Object();
    private static final Object B = new Object();
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f60388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f60389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f60390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f60391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile IAIDLInvoke f60392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f60393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f60394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakReference<Activity> f60395i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Scope> f60398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<PermissionInfo> f60399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<Api<?>, Api.ApiOptions> f60400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SubAppInfo f60401o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ReentrantLock f60405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Condition f60406t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ConnectionResult f60407u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private HuaweiApiClient.ConnectionCallbacks f60408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private HuaweiApiClient.OnConnectionFailedListener f60409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Handler f60410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Handler f60411y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CheckUpdatelistener f60412z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f60387a = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f60396j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AtomicInteger f60397k = new AtomicInteger(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f60402p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f60403q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f60404r = new Object();

    public class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 2) {
                return false;
            }
            HMSLog.e("HuaweiApiClientImpl", "In connect, bind core service time out");
            if (HuaweiApiClientImpl.this.f60397k.get() == 5) {
                HuaweiApiClientImpl.this.c(1);
                HuaweiApiClientImpl.this.b();
            }
            return true;
        }
    }

    public class b implements Handler.Callback {
        b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 3) {
                return false;
            }
            HMSLog.e("HuaweiApiClientImpl", "In connect, process time out");
            if (HuaweiApiClientImpl.this.f60397k.get() == 2) {
                HuaweiApiClientImpl.this.c(1);
                HuaweiApiClientImpl.this.b();
            }
            return true;
        }
    }

    public class c extends IAIDLCallback.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ResultCallback f60415a;

        c(ResultCallback resultCallback) {
            this.f60415a = resultCallback;
        }

        @Override // com.huawei.hms.core.aidl.IAIDLCallback
        public void call(DataBuffer dataBuffer) {
            if (dataBuffer == null) {
                HMSLog.i("HuaweiApiClientImpl", "Exit asyncRequest onResult -1");
                this.f60415a.onResult(new BundleResult(-1, null));
                return;
            }
            MessageCodec messageCodecFind = CodecLookup.find(dataBuffer.getProtocol());
            ResponseHeader responseHeader = new ResponseHeader();
            messageCodecFind.decode(dataBuffer.header, responseHeader);
            BundleResult bundleResult = new BundleResult(responseHeader.getStatusCode(), dataBuffer.getBody());
            HMSLog.i("HuaweiApiClientImpl", "Exit asyncRequest onResult");
            this.f60415a.onResult(bundleResult);
        }
    }

    public static class d extends PendingResultImpl<Status, IMessageEntity> {
        public d(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Status onComplete(IMessageEntity iMessageEntity) {
            return new Status(0);
        }
    }

    public class e implements ResultCallback<ResolveResult<ConnectResp>> {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ResolveResult f60418a;

            a(ResolveResult resolveResult) {
                this.f60418a = resolveResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApiClientImpl.this.a((ResolveResult<ConnectResp>) this.f60418a);
            }
        }

        private e() {
        }

        /* synthetic */ e(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
            this();
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<ConnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new a(resolveResult));
        }
    }

    public class f implements ResultCallback<ResolveResult<DisconnectResp>> {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ResolveResult f60421a;

            a(ResolveResult resolveResult) {
                this.f60421a = resolveResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApiClientImpl.this.b((ResolveResult<DisconnectResp>) this.f60421a);
            }
        }

        private f() {
        }

        /* synthetic */ f(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
            this();
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<DisconnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new a(resolveResult));
        }
    }

    public class g implements ResultCallback<ResolveResult<JosGetNoticeResp>> {
        private g() {
        }

        /* synthetic */ g(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
            this();
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<JosGetNoticeResp> resolveResult) {
            JosGetNoticeResp value;
            Intent noticeIntent;
            if (resolveResult == null || !resolveResult.getStatus().isSuccess() || (noticeIntent = (value = resolveResult.getValue()).getNoticeIntent()) == null || value.getStatusCode() != 0) {
                return;
            }
            HMSLog.i("HuaweiApiClientImpl", "get notice has intent.");
            Activity validActivity = Util.getValidActivity((Activity) HuaweiApiClientImpl.this.f60394h.get(), HuaweiApiClientImpl.this.getTopActivity());
            if (validActivity == null) {
                HMSLog.e("HuaweiApiClientImpl", "showNotice no valid activity!");
            } else {
                HuaweiApiClientImpl.this.f60396j = true;
                validActivity.startActivity(noticeIntent);
            }
        }
    }

    public HuaweiApiClientImpl(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f60405s = reentrantLock;
        this.f60406t = reentrantLock.newCondition();
        this.f60410x = null;
        this.f60411y = null;
        this.f60412z = null;
        this.f60388b = context;
        String appId = Util.getAppId(context);
        this.f60389c = appId;
        this.f60390d = appId;
        this.f60391e = Util.getCpId(context);
    }

    private void a() {
        Intent intent = new Intent(HMSPackageManager.getInstance(this.f60388b).getServiceAction());
        HMSPackageManager.getInstance(this.f60388b).refreshForMultiService();
        try {
            intent.setPackage(HMSPackageManager.getInstance(this.f60388b).getHMSPackageNameForMultiService());
            synchronized (A) {
                if (this.f60388b.bindService(intent, this, 1)) {
                    h();
                    return;
                }
                c(1);
                HMSLog.e("HuaweiApiClientImpl", "In connect, bind core service fail");
                b();
            }
        } catch (IllegalArgumentException unused) {
            HMSLog.e("HuaweiApiClientImpl", "IllegalArgumentException when bindCoreService intent.setPackage");
            c(1);
            HMSLog.e("HuaweiApiClientImpl", "In connect, bind core service fail");
            b();
        }
    }

    private void a(int i10) {
        if (i10 == 2) {
            synchronized (A) {
                Handler handler = this.f60410x;
                if (handler != null) {
                    handler.removeMessages(i10);
                    this.f60410x = null;
                }
            }
        }
        if (i10 == 3) {
            synchronized (B) {
                Handler handler2 = this.f60411y;
                if (handler2 != null) {
                    handler2.removeMessages(i10);
                    this.f60411y = null;
                }
            }
        }
        synchronized (A) {
            Handler handler3 = this.f60410x;
            if (handler3 != null) {
                handler3.removeMessages(2);
                this.f60410x = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ResolveResult<ConnectResp> resolveResult) {
        HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult");
        if (this.f60392f == null || this.f60397k.get() != 2) {
            HMSLog.e("HuaweiApiClientImpl", "Invalid onConnectionResult");
            return;
        }
        a(3);
        ConnectResp value = resolveResult.getValue();
        if (value != null) {
            this.f60393g = value.sessionId;
        }
        SubAppInfo subAppInfo = this.f60401o;
        PendingIntent resolveErrorPendingIntent = null;
        String subAppID = subAppInfo == null ? null : subAppInfo.getSubAppID();
        if (!TextUtils.isEmpty(subAppID)) {
            this.f60390d = subAppID;
        }
        int statusCode = resolveResult.getStatus().getStatusCode();
        HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult, connect to server result: " + statusCode);
        if (Status.SUCCESS.equals(resolveResult.getStatus())) {
            c(resolveResult);
            return;
        }
        if (resolveResult.getStatus() != null && resolveResult.getStatus().getStatusCode() == 1001) {
            n();
            c(1);
            HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f60408v;
            if (connectionCallbacks != null) {
                connectionCallbacks.onConnectionSuspended(3);
                return;
            }
            return;
        }
        n();
        c(1);
        if (this.f60409w != null) {
            WeakReference<Activity> weakReference = this.f60394h;
            if (weakReference != null && weakReference.get() != null) {
                resolveErrorPendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f60394h.get(), statusCode);
            }
            ConnectionResult connectionResult = new ConnectionResult(statusCode, resolveErrorPendingIntent);
            this.f60409w.onConnectionFailed(connectionResult);
            this.f60407u = connectionResult;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        n();
        if (this.f60409w != null) {
            int i10 = UIUtil.isBackground(this.f60388b) ? 7 : 6;
            PendingIntent resolveErrorPendingIntent = null;
            WeakReference<Activity> weakReference = this.f60394h;
            if (weakReference != null && weakReference.get() != null) {
                resolveErrorPendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f60394h.get(), i10);
            }
            ConnectionResult connectionResult = new ConnectionResult(i10, resolveErrorPendingIntent);
            this.f60409w.onConnectionFailed(connectionResult);
            this.f60407u = connectionResult;
        }
    }

    private void b(int i10) {
        PendingIntent resolveErrorPendingIntent;
        WeakReference<Activity> weakReference = this.f60394h;
        if (weakReference == null || weakReference.get() == null) {
            resolveErrorPendingIntent = null;
        } else {
            resolveErrorPendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f60394h.get(), i10);
            HMSLog.i("HuaweiApiClientImpl", "connect 2.0 fail: " + i10);
        }
        ConnectionResult connectionResult = new ConnectionResult(i10, resolveErrorPendingIntent);
        this.f60409w.onConnectionFailed(connectionResult);
        this.f60407u = connectionResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ResolveResult<DisconnectResp> resolveResult) {
        HMSLog.i("HuaweiApiClientImpl", "Enter onDisconnectionResult, disconnect from server result: " + resolveResult.getStatus().getStatusCode());
        n();
        c(1);
    }

    private ConnectInfo c() {
        String packageSignature = new PackageManagerHelper(this.f60388b).getPackageSignature(this.f60388b.getPackageName());
        if (packageSignature == null) {
            packageSignature = "";
        }
        SubAppInfo subAppInfo = this.f60401o;
        return new ConnectInfo(getApiNameList(), this.f60398l, packageSignature, subAppInfo == null ? null : subAppInfo.getSubAppID());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i10) {
        this.f60397k.set(i10);
        if (i10 == 1 || i10 == 3 || i10 == 2) {
            this.f60405s.lock();
            try {
                this.f60406t.signalAll();
            } finally {
                this.f60405s.unlock();
            }
        }
    }

    private void c(ResolveResult<ConnectResp> resolveResult) {
        if (resolveResult.getValue() != null) {
            ProtocolNegotiate.getInstance().negotiate(resolveResult.getValue().protocolVersion);
        }
        c(3);
        this.f60407u = null;
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f60408v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnected();
        }
        if (this.f60394h != null) {
            m();
        }
        for (Map.Entry<Api<?>, Api.ApiOptions> entry : getApiMap().entrySet()) {
            if (entry.getKey().getmConnetctPostList() != null && !entry.getKey().getmConnetctPostList().isEmpty()) {
                HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult, get the ConnetctPostList ");
                for (ConnectionPostProcessor connectionPostProcessor : entry.getKey().getmConnetctPostList()) {
                    HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult, processor.run");
                    connectionPostProcessor.run(this, this.f60394h);
                }
            }
        }
    }

    private DisconnectInfo d() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f60400n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getApiName());
            }
        }
        return new DisconnectInfo(this.f60398l, arrayList);
    }

    private int e() {
        int hmsVersion = Util.getHmsVersion(this.f60388b);
        if (hmsVersion != 0 && hmsVersion >= 20503000) {
            return hmsVersion;
        }
        int iF = f();
        if (g()) {
            if (iF < 20503000) {
                return 20503000;
            }
            return iF;
        }
        if (iF < 20600000) {
            return 20600000;
        }
        return iF;
    }

    private int f() {
        Integer num;
        int iIntValue;
        Map<Api<?>, Api.ApiOptions> apiMap = getApiMap();
        int i10 = 0;
        if (apiMap == null) {
            return 0;
        }
        Iterator<Api<?>> it = apiMap.keySet().iterator();
        while (it.hasNext()) {
            String apiName = it.next().getApiName();
            if (!TextUtils.isEmpty(apiName) && (num = HuaweiApiAvailability.getApiMap().get(apiName)) != null && (iIntValue = num.intValue()) > i10) {
                i10 = iIntValue;
            }
        }
        return i10;
    }

    private boolean g() {
        Map<Api<?>, Api.ApiOptions> map = this.f60400n;
        if (map == null) {
            return false;
        }
        Iterator<Api<?>> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (HuaweiApiAvailability.HMS_API_NAME_GAME.equals(it.next().getApiName())) {
                return true;
            }
        }
        return false;
    }

    private void h() {
        Handler handler = this.f60410x;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.f60410x = new Handler(Looper.getMainLooper(), new a());
        }
        this.f60410x.sendEmptyMessageDelayed(2, 5000L);
    }

    private void i() {
        synchronized (B) {
            Handler handler = this.f60411y;
            if (handler != null) {
                handler.removeMessages(3);
            } else {
                this.f60411y = new Handler(Looper.getMainLooper(), new b());
            }
            HMSLog.d("HuaweiApiClientImpl", "sendEmptyMessageDelayed for onConnectionResult 3 seconds. the result is : " + this.f60411y.sendEmptyMessageDelayed(3, 3000L));
        }
    }

    private void j() {
        HMSLog.i("HuaweiApiClientImpl", "Enter sendConnectApiServceRequest.");
        ConnectService.connect(this, c()).setResultCallback(new e(this, null));
    }

    private void k() {
        ConnectService.disconnect(this, d()).setResultCallback(new f(this, null));
    }

    private void l() {
        HMSLog.i("HuaweiApiClientImpl", "Enter sendForceConnectApiServceRequest.");
        ConnectService.forceConnect(this, c()).setResultCallback(new e(this, null));
    }

    private void m() {
        if (this.f60396j) {
            HMSLog.i("HuaweiApiClientImpl", "Connect notice has been shown.");
        } else if (HuaweiApiAvailability.getInstance().isHuaweiMobileNoticeAvailable(this.f60388b) == 0) {
            ConnectService.getNotice(this, 0, "6.8.0.300").setResultCallback(new g(this, null));
        }
    }

    private void n() {
        Util.unBindServiceCatchException(this.f60388b, this);
        this.f60392f = null;
    }

    public int asyncRequest(Bundle bundle, String str, int i10, ResultCallback<BundleResult> resultCallback) {
        HMSLog.i("HuaweiApiClientImpl", "Enter asyncRequest.");
        if (resultCallback == null || str == null || bundle == null) {
            HMSLog.e("HuaweiApiClientImpl", "arguments is invalid.");
            return CommonCode.ErrorCode.ARGUMENTS_INVALID;
        }
        if (!innerIsConnected()) {
            HMSLog.e("HuaweiApiClientImpl", "client is unConnect.");
            return CommonCode.ErrorCode.CLIENT_API_INVALID;
        }
        DataBuffer dataBuffer = new DataBuffer(str, i10);
        MessageCodec messageCodecFind = CodecLookup.find(dataBuffer.getProtocol());
        dataBuffer.addBody(bundle);
        RequestHeader requestHeader = new RequestHeader(getAppID(), getPackageName(), 60800300, getSessionId());
        requestHeader.setApiNameList(getApiNameList());
        dataBuffer.header = messageCodecFind.encode(requestHeader, new Bundle());
        try {
            getService().asyncCall(dataBuffer, new c(resultCallback));
            return 0;
        } catch (RemoteException e10) {
            HMSLog.e("HuaweiApiClientImpl", "remote exception:" + e10.getMessage());
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener) {
        if (checkUpdatelistener == null) {
            HMSLog.e("HuaweiApiClientImpl", "listener is null!");
            return;
        }
        if (activity == null || activity.isFinishing()) {
            HMSLog.e("HuaweiApiClientImpl", "checkUpdate, activity is illegal: " + activity);
            checkUpdatelistener.onResult(-1);
            return;
        }
        this.f60412z = checkUpdatelistener;
        try {
            Class<?> cls = Class.forName("com.huawei.hms.update.manager.CheckUpdateLegacy");
            cls.getMethod("initCheckUpdateCallBack", Object.class, Activity.class).invoke(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), this, activity);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            HMSLog.e("HuaweiApiClientImpl", "invoke CheckUpdateLegacy.initCheckUpdateCallBack fail. " + e10.getMessage());
            checkUpdatelistener.onResult(-1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(int i10) {
        connect((Activity) null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(Activity activity) {
        HMSLog.i("HuaweiApiClientImpl", "====== HMSSDK version: 60800300 ======");
        int i10 = this.f60397k.get();
        HMSLog.i("HuaweiApiClientImpl", "Enter connect, Connection Status: " + i10);
        if (i10 == 3 || i10 == 5 || i10 == 2 || i10 == 4) {
            return;
        }
        if (activity != null) {
            this.f60394h = new WeakReference<>(activity);
            this.f60395i = new WeakReference<>(activity);
        }
        this.f60390d = TextUtils.isEmpty(this.f60389c) ? Util.getAppId(this.f60388b) : this.f60389c;
        int iE = e();
        HMSLog.i("HuaweiApiClientImpl", "connect minVersion:" + iE);
        HuaweiApiAvailability.setServicesVersionCode(iE);
        int iIsHuaweiMobileServicesAvailable = HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(this.f60388b, iE);
        HMSLog.i("HuaweiApiClientImpl", "In connect, isHuaweiMobileServicesAvailable result: " + iIsHuaweiMobileServicesAvailable);
        this.f60403q = HMSPackageManager.getInstance(this.f60388b).getHmsMultiServiceVersion();
        if (iIsHuaweiMobileServicesAvailable != 0) {
            if (this.f60409w != null) {
                b(iIsHuaweiMobileServicesAvailable);
                return;
            }
            return;
        }
        c(5);
        if (this.f60392f == null) {
            a();
            return;
        }
        c(2);
        j();
        i();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connectForeground() {
        HMSLog.i("HuaweiApiClientImpl", "====== HMSSDK version: 60800300 ======");
        int i10 = this.f60397k.get();
        HMSLog.i("HuaweiApiClientImpl", "Enter forceConnect, Connection Status: " + i10);
        if (i10 == 3 || i10 == 5 || i10 == 2 || i10 == 4) {
            return;
        }
        this.f60390d = TextUtils.isEmpty(this.f60389c) ? Util.getAppId(this.f60388b) : this.f60389c;
        l();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disableLifeCycleManagement(Activity activity) {
        if (this.f60387a < 0) {
            throw new IllegalStateException("disableLifeCycleManagement failed");
        }
        AutoLifecycleFragment.getInstance(activity).stopAutoManage(this.f60387a);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public PendingResult<Status> discardAndReconnect() {
        return new d(this, null, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disconnect() {
        int i10 = this.f60397k.get();
        HMSLog.i("HuaweiApiClientImpl", "Enter disconnect, Connection Status: " + i10);
        if (i10 == 2) {
            c(4);
            return;
        }
        if (i10 == 3) {
            c(4);
            k();
        } else {
            if (i10 != 5) {
                return;
            }
            a(2);
            c(4);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Map<Api<?>, Api.ApiOptions> getApiMap() {
        return this.f60400n;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f60400n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getApiName());
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.f60390d;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult getConnectionResult(Api<?> api) {
        if (isConnected()) {
            this.f60407u = null;
            return new ConnectionResult(0, (PendingIntent) null);
        }
        ConnectionResult connectionResult = this.f60407u;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.f60388b;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.f60391e;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.f60388b.getPackageName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<PermissionInfo> getPermissionInfos() {
        return this.f60399m;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<Scope> getScopes() {
        return this.f60398l;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public IAIDLInvoke getService() {
        return this.f60392f;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.f60393g;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public final SubAppInfo getSubAppInfo() {
        return this.f60401o;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Activity getTopActivity() {
        WeakReference<Activity> weakReference = this.f60395i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectedApi(Api<?> api) {
        return isConnected();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f60404r) {
            return this.f60409w == onConnectionFailedListener;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f60404r) {
            return this.f60408v == connectionCallbacks;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("blockingConnect must not be called on the UI thread");
        }
        this.f60405s.lock();
        try {
            connect((Activity) null);
            while (isConnecting()) {
                try {
                    this.f60406t.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    ConnectionResult connectionResult = new ConnectionResult(15, (PendingIntent) null);
                    this.f60405s.unlock();
                    return connectionResult;
                }
            }
            if (isConnected()) {
                this.f60407u = null;
                ConnectionResult connectionResult2 = new ConnectionResult(0, (PendingIntent) null);
                this.f60405s.unlock();
                return connectionResult2;
            }
            ConnectionResult connectionResult3 = this.f60407u;
            if (connectionResult3 != null) {
                this.f60405s.unlock();
                return connectionResult3;
            }
            ConnectionResult connectionResult4 = new ConnectionResult(13, (PendingIntent) null);
            this.f60405s.unlock();
            return connectionResult4;
        } catch (Throwable th2) {
            this.f60405s.unlock();
            throw th2;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect(long j10, TimeUnit timeUnit) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("blockingConnect must not be called on the UI thread");
        }
        this.f60405s.lock();
        try {
            connect((Activity) null);
            long nanos = timeUnit.toNanos(j10);
            while (isConnecting()) {
                if (nanos <= 0) {
                    disconnect();
                    ConnectionResult connectionResult = new ConnectionResult(14, (PendingIntent) null);
                    this.f60405s.unlock();
                    return connectionResult;
                }
                try {
                    nanos = this.f60406t.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    ConnectionResult connectionResult2 = new ConnectionResult(15, (PendingIntent) null);
                    this.f60405s.unlock();
                    return connectionResult2;
                }
            }
            if (isConnected()) {
                this.f60407u = null;
                ConnectionResult connectionResult3 = new ConnectionResult(0, (PendingIntent) null);
                this.f60405s.unlock();
                return connectionResult3;
            }
            ConnectionResult connectionResult4 = this.f60407u;
            if (connectionResult4 != null) {
                this.f60405s.unlock();
                return connectionResult4;
            }
            ConnectionResult connectionResult5 = new ConnectionResult(13, (PendingIntent) null);
            this.f60405s.unlock();
            return connectionResult5;
        } catch (Throwable th2) {
            this.f60405s.unlock();
            throw th2;
        }
    }

    @Override // com.huawei.hms.support.api.client.InnerApiClient
    public boolean innerIsConnected() {
        return this.f60397k.get() == 3 || this.f60397k.get() == 4;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient, com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        if (this.f60403q == 0) {
            this.f60403q = HMSPackageManager.getInstance(this.f60388b).getHmsMultiServiceVersion();
        }
        if (this.f60403q >= 20504000) {
            return innerIsConnected();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f60402p;
        if (jCurrentTimeMillis > 0 && jCurrentTimeMillis < 300000) {
            return innerIsConnected();
        }
        if (!innerIsConnected()) {
            return false;
        }
        Status status = ((ResolveResult) ConnectService.checkconnect(this, new CheckConnectInfo()).awaitOnAnyThread(2000L, TimeUnit.MILLISECONDS)).getStatus();
        if (status.isSuccess()) {
            this.f60402p = System.currentTimeMillis();
            return true;
        }
        int statusCode = status.getStatusCode();
        HMSLog.i("HuaweiApiClientImpl", "isConnected is false, statuscode:" + statusCode);
        if (statusCode == 907135004) {
            return false;
        }
        n();
        c(1);
        this.f60402p = System.currentTimeMillis();
        return false;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean isConnecting() {
        int i10 = this.f60397k.get();
        return i10 == 2 || i10 == 5;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onPause(Activity activity) {
        HMSLog.i("HuaweiApiClientImpl", "onPause");
    }

    public void onResult(int i10) {
        this.f60412z.onResult(i10);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onResume(Activity activity) {
        if (activity != null) {
            HMSLog.i("HuaweiApiClientImpl", "onResume");
            this.f60395i = new WeakReference<>(activity);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HMSLog.i("HuaweiApiClientImpl", "HuaweiApiClientImpl Enter onServiceConnected.");
        a(2);
        this.f60392f = IAIDLInvoke.Stub.asInterface(iBinder);
        if (this.f60392f != null) {
            if (this.f60397k.get() == 5) {
                c(2);
                j();
                i();
                return;
            } else {
                if (this.f60397k.get() != 3) {
                    n();
                    return;
                }
                return;
            }
        }
        HMSLog.e("HuaweiApiClientImpl", "In onServiceConnected, mCoreService must not be null.");
        n();
        c(1);
        if (this.f60409w != null) {
            PendingIntent resolveErrorPendingIntent = null;
            WeakReference<Activity> weakReference = this.f60394h;
            if (weakReference != null && weakReference.get() != null) {
                resolveErrorPendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f60394h.get(), 10);
            }
            ConnectionResult connectionResult = new ConnectionResult(10, resolveErrorPendingIntent);
            this.f60409w.onConnectionFailed(connectionResult);
            this.f60407u = connectionResult;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.i("HuaweiApiClientImpl", "Enter onServiceDisconnected.");
        this.f60392f = null;
        c(1);
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f60408v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnectionSuspended(1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void print(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void reconnect() {
        disconnect();
        connect((Activity) null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f60404r) {
            if (this.f60409w != onConnectionFailedListener) {
                HMSLog.w("HuaweiApiClientImpl", "unregisterConnectionFailedListener: this onConnectionFailedListener has not been registered");
            } else {
                this.f60409w = null;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f60404r) {
            if (this.f60408v != connectionCallbacks) {
                HMSLog.w("HuaweiApiClientImpl", "unregisterConnectionCallback: this connectionCallbacksListener has not been registered");
            } else {
                this.f60408v = null;
            }
        }
    }

    public void resetListener() {
        this.f60412z = null;
    }

    public void setApiMap(Map<Api<?>, Api.ApiOptions> map) {
        this.f60400n = map;
    }

    protected void setAutoLifecycleClientId(int i10) {
        this.f60387a = i10;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionCallbacks(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f60408v = connectionCallbacks;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionFailedListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f60409w = onConnectionFailedListener;
    }

    public void setHasShowNotice(boolean z10) {
        this.f60396j = z10;
    }

    public void setPermissionInfos(List<PermissionInfo> list) {
        this.f60399m = list;
    }

    public void setScopes(List<Scope> list) {
        this.f60398l = list;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.i("HuaweiApiClientImpl", "Enter setSubAppInfo");
        if (subAppInfo == null) {
            HMSLog.e("HuaweiApiClientImpl", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.e("HuaweiApiClientImpl", "subAppId is empty");
            return false;
        }
        if (subAppID.equals(TextUtils.isEmpty(this.f60389c) ? Util.getAppId(this.f60388b) : this.f60389c)) {
            HMSLog.e("HuaweiApiClientImpl", "subAppId is host appid");
            return false;
        }
        this.f60401o = new SubAppInfo(subAppInfo);
        return true;
    }
}
