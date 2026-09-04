package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.mipush.sdk.COSPushHelper;
import com.xiaomi.mipush.sdk.FTOSPushHelper;
import com.xiaomi.mipush.sdk.HWPushHelper;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.af;
import com.xiaomi.mipush.sdk.ao;
import com.xiaomi.mipush.sdk.au;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.mipush.sdk.e;
import com.xiaomi.push.bg;
import com.xiaomi.push.ig;
import com.xiaomi.push.l;
import com.xiaomi.push.service.ServiceClient;

/* JADX INFO: loaded from: classes4.dex */
public class NetworkStatusReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f108031a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f108032b = true;

    public NetworkStatusReceiver() {
    }

    public NetworkStatusReceiver(Object obj) {
        f108031a = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        if (!ao.a(context).m104a() && b.m111a(context).m120c() && !b.m111a(context).m123f()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                ServiceClient.getInstance(context).startServiceSafely(intent);
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.a(e10);
            }
        }
        ig.m480a(context);
        if (bg.b(context) && ao.a(context).m107b()) {
            ao.a(context).m108c();
        }
        if (bg.b(context)) {
            if ("syncing".equals(af.a(context).a(au.DISABLE_PUSH))) {
                MiPushClient.disablePush(context);
            }
            if ("syncing".equals(af.a(context).a(au.ENABLE_PUSH))) {
                MiPushClient.enablePush(context);
            }
            af afVarA = af.a(context);
            au auVar = au.UPLOAD_HUAWEI_TOKEN;
            if ("syncing".equals(afVarA.a(auVar))) {
                ao.a(context).a((String) null, auVar, e.ASSEMBLE_PUSH_HUAWEI, h5.b.f119111k);
            }
            if ("syncing".equals(af.a(context).a(au.UPLOAD_FCM_TOKEN))) {
                ao.a(context).a((String) null, auVar, e.ASSEMBLE_PUSH_HUAWEI, h5.b.f119111k);
            }
            af afVarA2 = af.a(context);
            au auVar2 = au.UPLOAD_COS_TOKEN;
            if ("syncing".equals(afVarA2.a(auVar2))) {
                ao.a(context).a((String) null, auVar2, e.ASSEMBLE_PUSH_COS, h5.b.f119111k);
            }
            af afVarA3 = af.a(context);
            au auVar3 = au.UPLOAD_FTOS_TOKEN;
            if ("syncing".equals(afVarA3.a(auVar3))) {
                ao.a(context).a((String) null, auVar3, e.ASSEMBLE_PUSH_FTOS, h5.b.f119111k);
            }
            if (HWPushHelper.needConnect() && HWPushHelper.shouldTryConnect(context)) {
                HWPushHelper.setConnectTime(context);
                HWPushHelper.registerHuaWeiAssemblePush(context);
            }
            COSPushHelper.doInNetworkChange(context);
            FTOSPushHelper.doInNetworkChange(context);
        }
    }

    public static boolean a() {
        return f108031a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f108032b) {
            return;
        }
        bg.m178a();
        l.a().post(new a(this, context));
    }
}
