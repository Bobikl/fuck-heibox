package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.activity.internal.ForegroundInnerHeader;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.api.entity.core.CoreNaming;
import com.huawei.hms.utils.Util;

/* JADX INFO: loaded from: classes7.dex */
public class ForegroundIntentBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f60265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RequestHeader f60266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f60267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ForegroundInnerHeader f60268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f60269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f60270f;

    public ForegroundIntentBuilder(Activity activity) throws IllegalArgumentException {
        if (activity == null) {
            throw new IllegalArgumentException("listener must not be null.");
        }
        this.f60265a = activity;
        RequestHeader requestHeader = new RequestHeader();
        this.f60266b = requestHeader;
        requestHeader.setSdkVersion(60800300);
        this.f60267c = "";
        ForegroundInnerHeader foregroundInnerHeader = new ForegroundInnerHeader();
        this.f60268d = foregroundInnerHeader;
        foregroundInnerHeader.setApkVersion(30000000);
    }

    public static void registerResponseCallback(String str, BusResponseCallback busResponseCallback) {
        ForegroundBusResponseMgr.getInstance().registerObserver(str, busResponseCallback);
    }

    public static void unregisterResponseCallback(String str) {
        ForegroundBusResponseMgr.getInstance().unRegisterObserver(str);
    }

    public Intent build() {
        String packageName;
        String appId;
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(this.f60265a, ForegroundBusDelegate.class.getName());
        Context context = this.f60270f;
        if (context != null) {
            packageName = context.getPackageName();
            appId = Util.getAppId(this.f60270f);
        } else {
            packageName = this.f60265a.getPackageName();
            appId = Util.getAppId(this.f60265a);
        }
        if (this.f60266b.getAppID() == null) {
            this.f60266b.setAppID(appId + "|");
        } else {
            this.f60266b.setAppID(appId + "|" + this.f60266b.getAppID());
        }
        if (TextUtils.isEmpty(this.f60266b.getTransactionId())) {
            RequestHeader requestHeader = this.f60266b;
            requestHeader.setTransactionId(TransactionIdCreater.getId(requestHeader.getAppID(), CoreNaming.HUBREQUEST));
        }
        this.f60266b.setPkgName(packageName);
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_HEADER, this.f60266b.toJson());
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_BODY, this.f60267c);
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_INNER, this.f60268d.toJson());
        if (!TextUtils.isEmpty(this.f60269e)) {
            intentStartBridgeActivity.putExtra(ForegroundBusDelegate.INNER_PKG_NAME, this.f60269e);
        }
        return intentStartBridgeActivity;
    }

    public ForegroundIntentBuilder setAction(String str) {
        this.f60266b.setApiName(str);
        return this;
    }

    public ForegroundIntentBuilder setApiLevel(int i10) {
        this.f60266b.setApiLevel(i10);
        return this;
    }

    public ForegroundIntentBuilder setApplicationContext(Context context) {
        this.f60270f = context;
        return this;
    }

    public ForegroundIntentBuilder setInnerHms() {
        this.f60269e = this.f60265a.getPackageName();
        return this;
    }

    public ForegroundIntentBuilder setKitSdkVersion(int i10) {
        this.f60266b.setKitSdkVersion(i10);
        return this;
    }

    public ForegroundIntentBuilder setMinApkVersion(int i10) {
        this.f60268d.setApkVersion(i10);
        return this;
    }

    public ForegroundIntentBuilder setRequestBody(String str) {
        this.f60267c = str;
        return this;
    }

    public ForegroundIntentBuilder setResponseCallback(String str) {
        this.f60268d.setResponseCallbackKey(str);
        return this;
    }

    public ForegroundIntentBuilder setResponseCallback(String str, BusResponseCallback busResponseCallback) {
        this.f60268d.setResponseCallbackKey(str);
        ForegroundBusResponseMgr.getInstance().registerObserver(str, busResponseCallback);
        return this;
    }

    public ForegroundIntentBuilder setServiceName(String str) {
        this.f60266b.setSrvName(str);
        return this;
    }

    public ForegroundIntentBuilder setSubAppId(String str) {
        this.f60266b.setAppID(str);
        return this;
    }

    public ForegroundIntentBuilder setTransactionId(String str) {
        this.f60266b.setTransactionId(str);
        return this;
    }
}
