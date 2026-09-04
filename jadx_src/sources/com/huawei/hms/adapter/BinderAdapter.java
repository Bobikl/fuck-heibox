package com.huawei.hms.adapter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.api.BindingFailedResolution;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;

/* JADX INFO: loaded from: classes7.dex */
public class BinderAdapter implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f60305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f60306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f60307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BinderCallBack f60308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private IBinder f60309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f60310f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f60311g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f60312h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f60313i = null;

    public interface BinderCallBack {
        void onBinderFailed(int i10);

        void onBinderFailed(int i10, Intent intent);

        void onNullBinding(ComponentName componentName);

        void onServiceConnected(ComponentName componentName, IBinder iBinder);

        void onServiceDisconnected(ComponentName componentName);

        void onTimedDisconnected();
    }

    public BinderAdapter(Context context, String str, String str2) {
        this.f60305a = context;
        this.f60306b = str;
        this.f60307c = str2;
    }

    private void a() {
        if (TextUtils.isEmpty(this.f60306b) || TextUtils.isEmpty(this.f60307c)) {
            e();
        }
        Intent intent = new Intent(this.f60306b);
        try {
            intent.setPackage(this.f60307c);
        } catch (IllegalArgumentException unused) {
            HMSLog.e("BinderAdapter", "IllegalArgumentException when bindCoreService intent.setPackage");
            e();
        }
        synchronized (this.f60310f) {
            if (this.f60305a.bindService(intent, this, 1)) {
                g();
            } else {
                this.f60311g = true;
                e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        BinderCallBack binderCallBackF = f();
        if (binderCallBackF != null) {
            binderCallBackF.onBinderFailed(-1);
        }
    }

    private void c() {
        synchronized (this.f60310f) {
            Handler handler = this.f60312h;
            if (handler != null) {
                handler.removeMessages(getConnTimeOut());
                this.f60312h = null;
            }
        }
    }

    private void d() {
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.huawei.hms.adapter.BinderAdapter.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message == null || message.what != BinderAdapter.this.getMsgDelayDisconnect()) {
                    return false;
                }
                HMSLog.i("BinderAdapter", "The serviceConnection has been bind for 1800s, need to unbind.");
                BinderAdapter.this.unBind();
                BinderCallBack binderCallBackF = BinderAdapter.this.f();
                if (binderCallBackF == null) {
                    return true;
                }
                binderCallBackF.onTimedDisconnected();
                return true;
            }
        });
        this.f60313i = handler;
        handler.sendEmptyMessageDelayed(getMsgDelayDisconnect(), 1800000L);
    }

    private void e() {
        HMSLog.e("BinderAdapter", "In connect, bind core service fail");
        try {
            ComponentName componentName = new ComponentName(this.f60305a.getApplicationInfo().packageName, "com.huawei.hms.activity.BridgeActivity");
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.putExtra(BridgeActivity.EXTRA_DELEGATE_CLASS_NAME, BindingFailedResolution.class.getName());
            BinderCallBack binderCallBackF = f();
            if (binderCallBackF != null) {
                binderCallBackF.onBinderFailed(-1, intent);
            }
        } catch (RuntimeException e10) {
            HMSLog.e("BinderAdapter", "getBindFailPendingIntent failed " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BinderCallBack f() {
        return this.f60308d;
    }

    private void g() {
        Handler handler = this.f60312h;
        if (handler != null) {
            handler.removeMessages(getConnTimeOut());
        } else {
            this.f60312h = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.huawei.hms.adapter.BinderAdapter.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    if (message == null || message.what != BinderAdapter.this.getConnTimeOut()) {
                        return false;
                    }
                    HMSLog.e("BinderAdapter", "In connect, bind core service time out");
                    BinderAdapter.this.b();
                    return true;
                }
            });
        }
        this.f60312h.sendEmptyMessageDelayed(getConnTimeOut(), 10000L);
    }

    private void h() {
        HMSLog.d("BinderAdapter", "removeDelayDisconnectTask.");
        synchronized (BinderAdapter.class) {
            Handler handler = this.f60313i;
            if (handler != null) {
                handler.removeMessages(getMsgDelayDisconnect());
            }
        }
    }

    public void binder(BinderCallBack binderCallBack) {
        if (binderCallBack == null) {
            return;
        }
        this.f60308d = binderCallBack;
        a();
    }

    protected int getConnTimeOut() {
        return 0;
    }

    protected int getMsgDelayDisconnect() {
        return 0;
    }

    public String getServiceAction() {
        return this.f60306b;
    }

    public IBinder getServiceBinder() {
        return this.f60309e;
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        HMSLog.e("BinderAdapter", "Enter onNullBinding, than unBind.");
        if (this.f60311g) {
            this.f60311g = false;
            return;
        }
        unBind();
        c();
        BinderCallBack binderCallBackF = f();
        if (binderCallBackF != null) {
            binderCallBackF.onNullBinding(componentName);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HMSLog.i("BinderAdapter", "BinderAdapter Enter onServiceConnected.");
        this.f60309e = iBinder;
        c();
        BinderCallBack binderCallBackF = f();
        if (binderCallBackF != null) {
            binderCallBackF.onServiceConnected(componentName, iBinder);
        }
        d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.i("BinderAdapter", "Enter onServiceDisconnected.");
        BinderCallBack binderCallBackF = f();
        if (binderCallBackF != null) {
            binderCallBackF.onServiceDisconnected(componentName);
        }
        h();
    }

    public void unBind() {
        Util.unBindServiceCatchException(this.f60305a, this);
    }

    public void updateDelayTask() {
        HMSLog.d("BinderAdapter", "updateDelayTask.");
        synchronized (BinderAdapter.class) {
            Handler handler = this.f60313i;
            if (handler != null) {
                handler.removeMessages(getMsgDelayDisconnect());
                this.f60313i.sendEmptyMessageDelayed(getMsgDelayDisconnect(), 1800000L);
            }
        }
    }
}
