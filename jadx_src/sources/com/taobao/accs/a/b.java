package com.taobao.accs.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.k;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class b implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f98156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f98157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f98158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f98159d;

    b(Intent intent, Context context, Context context2, int i10) {
        this.f98156a = intent;
        this.f98157b = context;
        this.f98158c = context2;
        this.f98159d = i10;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ALog.d(a.TAG, "bindService connected", "componentName", componentName.toString());
        try {
            Messenger messenger = new Messenger(iBinder);
            Message message = new Message();
            message.getData().putParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, this.f98156a);
            messenger.send(message);
            try {
                this.f98157b.unbindService(this);
            } catch (Throwable unused) {
            }
            if (!this.f98158c.getPackageName().equals(componentName.getPackageName())) {
            }
        } catch (Throwable th2) {
            try {
                ALog.e(a.TAG, "dispatch intent with exception", th2, new Object[0]);
            } finally {
                try {
                    this.f98157b.unbindService(this);
                } catch (Throwable unused2) {
                }
                if (this.f98158c.getPackageName().equals(componentName.getPackageName())) {
                    k.a("accs", "bind", componentName.getClassName());
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        ALog.d(a.TAG, "bindService on disconnect", "componentName", componentName.toString());
        try {
            this.f98157b.unbindService(this);
        } catch (Throwable unused) {
        }
        if (this.f98158c.getPackageName().equals(componentName.getPackageName())) {
            k.a("accs", "bind", componentName.getClassName(), UtilityImpl.a(this.f98159d - 3), "onServiceDisconnected");
        }
    }
}
