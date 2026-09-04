package com.huawei.hms.adapter;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.adapter.ui.BaseResolutionAdapter;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.ResponseWrap;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IntentUtil;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.Util;
import com.taobao.accs.common.Constants;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<ApiClient> f60286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<Activity> f60287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseCallBack f60288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f60289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f60290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Parcelable f60291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BaseCallBack f60292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f60293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f60294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RequestHeader f60295j = new RequestHeader();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ResponseHeader f60296k = new ResponseHeader();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private SystemObserver f60297l;

    public interface BaseCallBack {
        void onComplete(String str, String str2, Parcelable parcelable);

        void onError(String str);
    }

    public class BaseRequestResultCallback implements ResultCallback<ResolveResult<CoreBaseResponse>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AtomicBoolean f60301a = new AtomicBoolean(true);

        public BaseRequestResultCallback() {
        }

        private void a(final BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
            if (!Util.isAvailableLibExist(BaseAdapter.this.f60294i)) {
                HMSLog.i("BaseAdapter", "handleSolutionForHms: no Available lib exist");
                baseCallBack.onError(BaseAdapter.this.b(-9));
                return;
            }
            Activity activityC = BaseAdapter.this.c();
            if (activityC != null && !activityC.isFinishing()) {
                HMSLog.i("BaseAdapter", "start handleSolutionForHMS");
                AvailableAdapter availableAdapter = new AvailableAdapter(ExceptionCode.CRASH_EXCEPTION);
                availableAdapter.setCalledBySolutionInstallHms(true);
                availableAdapter.startResolution(activityC, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.adapter.BaseAdapter.BaseRequestResultCallback.1
                    @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                    public void onComplete(int i10) {
                        HMSLog.i("BaseAdapter", "complete handleSolutionForHMS, result: " + i10);
                        if (i10 != 0) {
                            BaseAdapter baseAdapter = BaseAdapter.this;
                            baseCallBack.onError(baseAdapter.a(i10, baseAdapter.a(i10)).toJson());
                        } else {
                            HMSPackageManager.getInstance(BaseAdapter.this.f60294i).resetMultiServiceState();
                            BaseAdapter baseAdapter2 = BaseAdapter.this;
                            baseCallBack.onError(baseAdapter2.a(11, baseAdapter2.a(11)).toJson());
                            BaseAdapter.this.i();
                        }
                    }
                });
                return;
            }
            HMSLog.e("BaseAdapter", "activity is null");
            try {
                if (BaseAdapter.this.f60294i == null || !AvailableUtil.isInstallerLibExist(BaseAdapter.this.f60294i)) {
                    HMSLog.i("BaseAdapter", "pass ACTIVITY_NULL error");
                    BaseAdapter baseAdapter = BaseAdapter.this;
                    baseCallBack.onError(baseAdapter.a(-3, baseAdapter.a(-3)).toJson());
                } else {
                    HMSLog.i("BaseAdapter", "pass installHMS intent");
                    Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(BaseAdapter.this.f60294i, UpdateAdapter.class.getName());
                    intentStartBridgeActivity.putExtra(CommonCode.MapKey.UPDATE_VERSION, ExceptionCode.CRASH_EXCEPTION);
                    intentStartBridgeActivity.putExtra("installHMS", "installHMS");
                    coreBaseResponse.setIntent(intentStartBridgeActivity);
                    BaseAdapter.this.a(baseCallBack, coreBaseResponse);
                }
            } catch (RuntimeException unused) {
                HMSLog.e("BaseAdapter", "handleSolutionForHms pass result failed");
            }
        }

        private void a(String str, BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse, int i10) {
            if (!com.huawei.hms.support.api.entity.core.CommonCode.Resolution.HAS_RESOLUTION_FROM_APK.equals(str)) {
                if (!"installHMS".equals(str)) {
                    BaseAdapter.this.a(baseCallBack, coreBaseResponse);
                    return;
                } else {
                    HMSLog.i("BaseAdapter", "has resolutin: installHMS");
                    a(baseCallBack, coreBaseResponse);
                    return;
                }
            }
            Activity activityC = BaseAdapter.this.c();
            HMSLog.i("BaseAdapter", "activity is: " + activityC);
            if (activityC == null || activityC.isFinishing()) {
                HMSLog.e("BaseAdapter", "activity null");
                BaseAdapter.this.a(baseCallBack, coreBaseResponse);
                return;
            }
            PendingIntent pendingIntent = coreBaseResponse.getPendingIntent();
            if (pendingIntent != null) {
                if (Util.isAvailableLibExist(BaseAdapter.this.f60294i)) {
                    BaseAdapter.this.a(activityC, pendingIntent, coreBaseResponse);
                    return;
                } else {
                    baseCallBack.onError(BaseAdapter.this.b(-9));
                    return;
                }
            }
            Intent intent = coreBaseResponse.getIntent();
            if (intent != null) {
                if (Util.isAvailableLibExist(BaseAdapter.this.f60294i)) {
                    BaseAdapter.this.a(activityC, intent, coreBaseResponse);
                    return;
                } else {
                    baseCallBack.onError(BaseAdapter.this.b(-9));
                    return;
                }
            }
            if (i10 == 2) {
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseCallBack.onError(baseAdapter.b(baseAdapter.f60296k.getErrorCode()));
            } else {
                HMSLog.e("BaseAdapter", "hasResolution is true but NO_SOLUTION");
                baseCallBack.onError(BaseAdapter.this.b(-4));
            }
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        public void onResult(ResolveResult<CoreBaseResponse> resolveResult) {
            BaseCallBack baseCallBackB = BaseAdapter.this.b();
            if (baseCallBackB == null) {
                HMSLog.e("BaseAdapter", "onResult baseCallBack null");
                return;
            }
            if (resolveResult == null) {
                HMSLog.e("BaseAdapter", "result null");
                baseCallBackB.onError(BaseAdapter.this.b(-1));
                return;
            }
            CoreBaseResponse value = resolveResult.getValue();
            if (value == null) {
                HMSLog.e("BaseAdapter", "response null");
                baseCallBackB.onError(BaseAdapter.this.b(-1));
                return;
            }
            if (TextUtils.isEmpty(value.getJsonHeader())) {
                HMSLog.e("BaseAdapter", "jsonHeader null");
                baseCallBackB.onError(BaseAdapter.this.b(-1));
                return;
            }
            JsonUtil.jsonToEntity(value.getJsonHeader(), BaseAdapter.this.f60296k);
            if (this.f60301a.compareAndSet(true, false)) {
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseAdapter.a(baseAdapter.f60294i, BaseAdapter.this.f60296k);
            }
            String resolution = BaseAdapter.this.f60296k.getResolution();
            int statusCode = BaseAdapter.this.f60296k.getStatusCode();
            HMSLog.i("BaseAdapter", "api is: " + BaseAdapter.this.f60296k.getApiName() + ", resolution: " + resolution + ", status_code: " + statusCode);
            a(resolution, baseCallBackB, value, statusCode);
        }
    }

    public static class a extends PendingResultImpl<ResolveResult<CoreBaseResponse>, CoreBaseResponse> {
        public a(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResolveResult<CoreBaseResponse> onComplete(CoreBaseResponse coreBaseResponse) {
            ResolveResult<CoreBaseResponse> resolveResult = new ResolveResult<>(coreBaseResponse);
            resolveResult.setStatus(Status.SUCCESS);
            return resolveResult;
        }
    }

    public BaseAdapter(ApiClient apiClient) {
        this.f60286a = new WeakReference<>(apiClient);
        this.f60294i = apiClient.getContext().getApplicationContext();
        HMSLog.i("BaseAdapter", "In constructor, WeakReference is " + this.f60286a);
    }

    public BaseAdapter(ApiClient apiClient, Activity activity) {
        this.f60286a = new WeakReference<>(apiClient);
        this.f60287b = new WeakReference<>(activity);
        this.f60294i = activity.getApplicationContext();
        HMSLog.i("BaseAdapter", "In constructor, activityWeakReference is " + this.f60287b + ", activity is " + this.f60287b.get());
    }

    private BaseCallBack a() {
        return this.f60292g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResponseWrap a(int i10, String str) {
        c(i10);
        ResponseWrap responseWrap = new ResponseWrap(this.f60296k);
        responseWrap.setBody(str);
        return responseWrap;
    }

    private PendingResult<ResolveResult<CoreBaseResponse>> a(ApiClient apiClient, String str, CoreBaseRequest coreBaseRequest) {
        return new a(apiClient, str, coreBaseRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.KEY_ERROR_CODE, i10);
        } catch (JSONException e10) {
            HMSLog.e("BaseAdapter", "buildBodyStr failed: " + e10.getMessage());
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, Parcelable parcelable, CoreBaseResponse coreBaseResponse) {
        HMSLog.i("BaseAdapter", "startResolution");
        RequestHeader requestHeader = this.f60295j;
        if (requestHeader != null) {
            b(this.f60294i, requestHeader);
        }
        if (this.f60297l == null) {
            g();
        }
        SystemManager.getSystemNotifier().registerObserver(this.f60297l);
        if (Build.VERSION.SDK_INT >= 29) {
            a(coreBaseResponse);
        }
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, BaseResolutionAdapter.class.getName());
        Bundle bundle = new Bundle();
        bundle.putParcelable("resolution", parcelable);
        intentStartBridgeActivity.putExtras(bundle);
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.TRANSACTION_ID, this.f60293h);
        activity.startActivity(intentStartBridgeActivity);
    }

    private void a(Context context, RequestHeader requestHeader) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, mapFromRequestHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, ResponseHeader responseHeader) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f60295j.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, mapFromRequestHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, ResponseHeader responseHeader, long j10) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(j10));
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f60295j.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, mapFromRequestHeader);
    }

    private void a(Parcelable parcelable) {
        this.f60291f = parcelable;
    }

    private void a(BaseCallBack baseCallBack) {
        this.f60292g = baseCallBack;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
        HMSLog.i("BaseAdapter", "baseCallBack.onComplete");
        PendingIntent pendingIntent = coreBaseResponse.getPendingIntent();
        if (pendingIntent != null) {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), pendingIntent);
            return;
        }
        Intent intentModifyIntentBehaviorsSafe = IntentUtil.modifyIntentBehaviorsSafe(coreBaseResponse.getIntent());
        if (intentModifyIntentBehaviorsSafe != null) {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), intentModifyIntentBehaviorsSafe);
        } else {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), null);
        }
    }

    private void a(final CoreBaseResponse coreBaseResponse) {
        HMSLog.i("BaseAdapter", "postResolutionTimeoutHandle");
        ApkResolutionFailedManager.getInstance().postTask(this.f60293h, new Runnable() { // from class: com.huawei.hms.adapter.BaseAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                HMSLog.i("BaseAdapter", "postResolutionTimeoutHandle handle");
                SystemManager.getSystemNotifier().unRegisterObserver(BaseAdapter.this.f60297l);
                ApkResolutionFailedManager.getInstance().removeValueOnly(BaseAdapter.this.f60293h);
                BaseCallBack baseCallBackB = BaseAdapter.this.b();
                if (baseCallBackB == null) {
                    HMSLog.e("BaseAdapter", "timeoutRunnable callBack is null");
                } else {
                    BaseAdapter.this.a(baseCallBackB, coreBaseResponse);
                }
            }
        });
    }

    private void a(String str) {
        this.f60289d = str;
    }

    private void a(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
        a(str);
        b(str2);
        a(parcelable);
        a(baseCallBack);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Intent intent, BaseCallBack baseCallBack) {
        if (!intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            return false;
        }
        int intExtra = intent.getIntExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, 1001);
        if (intExtra != 1001) {
            HMSLog.i("BaseAdapter", "privacy_statement_confirm_result rejected: " + intExtra);
            baseCallBack.onError(a(CommonCode.BusInterceptor.PRIVACY_CNCEL_ERROR_CODE, a(CommonCode.BusInterceptor.PRIVACY_CNCEL_ERROR_CODE)).toJson());
            return true;
        }
        HMSLog.i("BaseAdapter", "privacy_statement_confirm_result agreed: " + intExtra + ", replay request");
        h();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BaseCallBack b() {
        BaseCallBack baseCallBack = this.f60288c;
        if (baseCallBack != null) {
            return baseCallBack;
        }
        HMSLog.e("BaseAdapter", "callback null");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(int i10) {
        c(i10);
        return this.f60296k.toJson();
    }

    private void b(Context context, RequestHeader requestHeader) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, mapFromRequestHeader);
    }

    private void b(String str) {
        this.f60290e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Intent intent, BaseCallBack baseCallBack) {
        if (!intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT)) {
            return false;
        }
        int intExtra = intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0);
        HMSLog.i("BaseAdapter", "kit_update_result is " + intExtra);
        if (intExtra == 1) {
            HMSLog.e("BaseAdapter", "kit update success,replay request");
            h();
        } else {
            HMSLog.e("BaseAdapter", "kit update failed");
            baseCallBack.onError(a(-10, a(intExtra)).toJson());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity c() {
        if (this.f60287b == null) {
            HMSLog.i("BaseAdapter", "activityWeakReference is " + this.f60287b);
            return null;
        }
        ApiClient apiClient = this.f60286a.get();
        if (apiClient == null) {
            HMSLog.i("BaseAdapter", "tmpApi is null");
            return null;
        }
        HMSLog.i("BaseAdapter", "activityWeakReference has " + this.f60287b.get());
        return Util.getActiveActivity(this.f60287b.get(), apiClient.getContext());
    }

    private void c(int i10) {
        this.f60296k.setTransactionId(this.f60295j.getTransactionId());
        this.f60296k.setAppID(this.f60295j.getAppID());
        this.f60296k.setApiName(this.f60295j.getApiName());
        this.f60296k.setSrvName(this.f60295j.getSrvName());
        this.f60296k.setPkgName(this.f60295j.getPkgName());
        this.f60296k.setStatusCode(1);
        this.f60296k.setErrorCode(i10);
        this.f60296k.setErrorReason("Core error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0035  */
    public void c(Intent intent, BaseCallBack baseCallBack) {
        long jLongValue;
        String stringExtra = intent.getStringExtra(CommonCode.MapKey.JSON_HEADER);
        String stringExtra2 = intent.getStringExtra(CommonCode.MapKey.JSON_BODY);
        Object infoFromJsonobject = JsonUtil.getInfoFromJsonobject(stringExtra, "status_code");
        Object infoFromJsonobject2 = JsonUtil.getInfoFromJsonobject(stringExtra, "error_code");
        if (intent.hasExtra(CommonCode.MapKey.HMS_FOREGROUND_RES_UI)) {
            Object infoFromJsonobject3 = JsonUtil.getInfoFromJsonobject(intent.getStringExtra(CommonCode.MapKey.HMS_FOREGROUND_RES_UI), "uiDuration");
            if (infoFromJsonobject3 instanceof Long) {
                jLongValue = ((Long) infoFromJsonobject3).longValue();
            } else {
                jLongValue = 0;
            }
        } else {
            jLongValue = 0;
        }
        if ((infoFromJsonobject instanceof Integer) && (infoFromJsonobject2 instanceof Integer)) {
            int iIntValue = ((Integer) infoFromJsonobject).intValue();
            b(((Integer) infoFromJsonobject2).intValue());
            this.f60296k.setStatusCode(iIntValue);
            a(this.f60294i, this.f60296k, jLongValue);
        } else {
            b(-8);
            a(this.f60294i, this.f60296k, jLongValue);
        }
        baseCallBack.onComplete(stringExtra, stringExtra2, null);
    }

    private String d() {
        return this.f60289d;
    }

    private String e() {
        return this.f60290e;
    }

    private Parcelable f() {
        return this.f60291f;
    }

    private void g() {
        this.f60297l = new SystemObserver() { // from class: com.huawei.hms.adapter.BaseAdapter.2
            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onNoticeResult(int i10) {
                return false;
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onSolutionResult(Intent intent, String str) {
                if (TextUtils.isEmpty(str)) {
                    HMSLog.e("BaseAdapter", "onSolutionResult but id is null");
                    BaseCallBack baseCallBackB = BaseAdapter.this.b();
                    if (baseCallBackB == null) {
                        HMSLog.e("BaseAdapter", "onSolutionResult baseCallBack null");
                        return true;
                    }
                    baseCallBackB.onError(BaseAdapter.this.b(-6));
                    return true;
                }
                if (!str.equals(BaseAdapter.this.f60293h)) {
                    return false;
                }
                HMSLog.i("BaseAdapter", "onSolutionResult + id is :" + str);
                BaseCallBack baseCallBackB2 = BaseAdapter.this.b();
                if (baseCallBackB2 == null) {
                    HMSLog.e("BaseAdapter", "onResult baseCallBack null");
                    return true;
                }
                if (intent == null) {
                    HMSLog.e("BaseAdapter", "onSolutionResult but data is null");
                    String strB = BaseAdapter.this.b(-7);
                    BaseAdapter baseAdapter = BaseAdapter.this;
                    baseAdapter.a(baseAdapter.f60294i, BaseAdapter.this.f60296k, 0L);
                    baseCallBackB2.onError(strB);
                    return true;
                }
                if (BaseAdapter.this.b(intent, baseCallBackB2) || BaseAdapter.this.a(intent, baseCallBackB2)) {
                    return true;
                }
                HMSLog.e("BaseAdapter", "onComplete for on activity result");
                BaseAdapter.this.c(intent, baseCallBackB2);
                return true;
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onUpdateResult(int i10) {
                return false;
            }
        };
    }

    private void h() {
        if (this.f60289d == null || this.f60292g == null) {
            return;
        }
        this.f60296k = null;
        this.f60296k = new ResponseHeader();
        baseRequest(d(), e(), f(), a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f60294i == null) {
            HMSLog.e("BaseAdapter", "sendBroadcastAfterResolutionHms, context is null");
            return;
        }
        Intent intent = new Intent("com.huawei.hms.core.action.SESSION_INVALID");
        try {
            intent.setPackage(this.f60294i.getPackageName());
            this.f60294i.sendBroadcast(intent);
        } catch (IllegalArgumentException unused) {
            HMSLog.e("BaseAdapter", "IllegalArgumentException when sendBroadcastAfterResolutionHms intent.setPackage");
        }
    }

    public void baseRequest(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
        a(str, str2, parcelable, baseCallBack);
        if (this.f60286a == null) {
            HMSLog.e("BaseAdapter", "client is null");
            baseCallBack.onError(b(-2));
            return;
        }
        this.f60288c = baseCallBack;
        JsonUtil.jsonToEntity(str, this.f60295j);
        CoreBaseRequest coreBaseRequest = new CoreBaseRequest();
        coreBaseRequest.setJsonObject(str2);
        coreBaseRequest.setJsonHeader(str);
        coreBaseRequest.setParcelable(parcelable);
        String apiName = this.f60295j.getApiName();
        if (TextUtils.isEmpty(apiName)) {
            HMSLog.e("BaseAdapter", "get uri null");
            baseCallBack.onError(b(-5));
            return;
        }
        String transactionId = this.f60295j.getTransactionId();
        this.f60293h = transactionId;
        if (TextUtils.isEmpty(transactionId)) {
            HMSLog.e("BaseAdapter", "get transactionId null");
            baseCallBack.onError(b(-6));
            return;
        }
        HMSLog.i("BaseAdapter", "in baseRequest + uri is :" + apiName + ", transactionId is : " + this.f60293h);
        a(this.f60294i, this.f60295j);
        a(this.f60286a.get(), apiName, coreBaseRequest).setResultCallback(new BaseRequestResultCallback());
    }
}
