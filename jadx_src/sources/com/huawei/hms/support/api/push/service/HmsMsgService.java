package com.huawei.hms.support.api.push.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.huawei.hms.push.b;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.g;
import com.huawei.hms.push.r;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class HmsMsgService extends Service {

    public static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f62675a;

        a(Context context) {
            this.f62675a = context;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            if (Objects.equals(this.f62675a.getApplicationContext().getPackageManager().getNameForUid(message.sendingUid), HMSPackageManager.getInstance(this.f62675a).getHMSPackageName()) && data != null) {
                if (HMSPackageManager.getInstance(this.f62675a).getHMSPackageStates() != PackageManagerHelper.PackageStates.ENABLED) {
                    HMSLog.i("HmsMsgService", "service not start by hms");
                } else {
                    HMSLog.i("HmsMsgService", "chose push type");
                    if (Objects.equals(b.b(data, "push_action"), "com.huawei.push.msg.NOTIFY_MSG")) {
                        if (ResourceLoaderUtil.getmContext() == null) {
                            ResourceLoaderUtil.setmContext(this.f62675a.getApplicationContext());
                        }
                        HMSLog.i("HmsMsgService", "invokeSelfShow");
                        HmsMsgService.c(this.f62675a, data);
                    } else if (Objects.equals(b.b(data, "push_action"), "com.huawei.push.msg.PASSBY_MSG")) {
                        HMSLog.i("HmsMsgService", "sendBroadcastToHms");
                        HmsMsgService.d(this.f62675a, data);
                    }
                }
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, Bundle bundle) {
        if (!g.a(context)) {
            HMSLog.i("HmsMsgService", context.getPackageName() + " disable display notification.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.huawei.push.msg.NOTIFY_MSG");
        intent.putExtra("selfshow_info", b.a(bundle, "selfshow_info"));
        intent.putExtra("selfshow_token", b.a(bundle, "selfshow_token"));
        intent.setPackage(b.c(bundle, "push_package"));
        r.a(context, intent);
        HMSLog.i("HmsMsgService", "invokeSelfShow done");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, Bundle bundle) {
        try {
            Intent intent = new Intent();
            intent.setAction("com.huawei.android.push.intent.RECEIVE");
            intent.putExtra("msg_data", b.a(bundle, "msg_data"));
            intent.putExtra(RemoteMessageConst.DEVICE_TOKEN, b.a(bundle, RemoteMessageConst.DEVICE_TOKEN));
            intent.putExtra("msgIdStr", b.c(bundle, "msgIdStr"));
            intent.setFlags(32);
            intent.setPackage(b.c(bundle, "push_package"));
            context.sendBroadcast(intent, context.getPackageName() + ".permission.PROCESS_PUSH_MSG");
            HMSLog.i("HmsMsgService", "send broadcast passby done");
        } catch (SecurityException unused) {
            HMSLog.i("HmsMsgService", "send broadcast SecurityException");
        } catch (Exception unused2) {
            HMSLog.i("HmsMsgService", "send broadcast Exception");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        HMSLog.i("HmsMsgService", "onBind");
        return new Messenger(new a(this)).getBinder();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        HMSLog.i("HmsMsgService", "Enter onStartCommand.");
        return 2;
    }
}
