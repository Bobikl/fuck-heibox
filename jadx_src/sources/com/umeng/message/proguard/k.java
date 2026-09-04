package com.umeng.message.proguard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.taobao.accs.common.Constants;
import com.umeng.message.PushAgent;
import com.umeng.message.common.UPLog;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class k {
    private static void a(final Context context, final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.umeng.message.proguard.k.1
            @Override // java.lang.Runnable
            public final void run() {
                UPLog.e("SelfCheck", str);
                Toast.makeText(context, str, 1).show();
            }
        });
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static boolean a(Context context) {
        Class<?> cls;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        Method declaredMethod = null;
        try {
            cls = Class.forName("com.umeng.commonsdk.framework.UMEnvelopeBuild");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            UPLog.e("SelfCheck", "--->>> common sdk版本不匹配，请确认！<<<--- ");
        } else {
            try {
                declaredMethod = cls.getDeclaredMethod("buildEnvelopeWithExtHeader", Context.class, JSONObject.class, JSONObject.class, String.class, String.class, String.class);
            } catch (Throwable unused2) {
            }
            if (declaredMethod == null) {
                UPLog.e("SelfCheck", "--->>> common sdk版本不匹配，请确认！<<<--- ");
            }
        }
        try {
            if (TextUtils.isEmpty(PushAgent.getInstance(context).getMessageAppkey())) {
                a(context, "please set umeng appkey!");
                return false;
            }
            if (TextUtils.isEmpty(PushAgent.getInstance(context).getMessageSecret())) {
                a(context, "please set umeng message secret!");
                return false;
            }
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction(Constants.ACTION_START_SERVICE);
            Iterator<ResolveInfo> it = context.getPackageManager().queryIntentServices(intent, 64).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                if (it.next().serviceInfo.name.equals(com.taobao.accs.utl.j.channelService)) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                a(context, "please check ChannelService in AndroidManifest!");
                return false;
            }
            Intent intent2 = new Intent();
            intent2.setPackage(context.getPackageName());
            intent2.setAction("com.taobao.accs.intent.action.ELECTION");
            Iterator<ResolveInfo> it2 = context.getPackageManager().queryIntentServices(intent2, 64).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = false;
                    break;
                }
                if (it2.next().serviceInfo.name.equals(com.taobao.accs.utl.j.channelService)) {
                    z11 = true;
                    break;
                }
            }
            if (!z11) {
                a(context, "please check ChannelService in AndroidManifest!");
                return false;
            }
            Intent intent3 = new Intent();
            intent3.setPackage(context.getPackageName());
            intent3.setAction(Constants.ACTION_RECEIVE);
            Iterator<ResolveInfo> it3 = context.getPackageManager().queryIntentServices(intent3, 64).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z12 = false;
                    break;
                }
                if (it3.next().serviceInfo.name.equals(com.taobao.accs.utl.j.msgService)) {
                    z12 = true;
                    break;
                }
            }
            if (!z12) {
                a(context, "please check MsgDistributeService in AndroidManifest!");
                return false;
            }
            Intent intent4 = new Intent();
            intent4.setPackage(context.getPackageName());
            intent4.setAction(Constants.ACTION_RECEIVE);
            Iterator<ResolveInfo> it4 = context.getPackageManager().queryIntentServices(intent4, 64).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z13 = false;
                    break;
                }
                if (it4.next().serviceInfo.name.equals("org.android.agoo.accs.AgooService")) {
                    z13 = true;
                    break;
                }
            }
            if (!z13) {
                a(context, "Please check AgooService in AndroidManifest!");
                return false;
            }
            Intent intent5 = new Intent();
            intent5.setPackage(context.getPackageName());
            intent5.setAction(AgooConstants.INTENT_FROM_AGOO_MESSAGE);
            Iterator<ResolveInfo> it5 = context.getPackageManager().queryIntentServices(intent5, 64).iterator();
            while (true) {
                if (!it5.hasNext()) {
                    z14 = false;
                    break;
                }
                if (it5.next().serviceInfo.name.equals("com.umeng.message.component.UmengIntentService")) {
                    z14 = true;
                    break;
                }
            }
            if (!z14) {
                a(context, "Please check UmengIntentService in AndroidManifest!");
                return false;
            }
            Intent intent6 = new Intent();
            intent6.setClassName(context.getPackageName(), "com.umeng.message.component.UmengNotificationReceiver");
            Iterator<ResolveInfo> it6 = context.getPackageManager().queryBroadcastReceivers(intent6, 65536).iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z15 = false;
                    break;
                }
                ResolveInfo next = it6.next();
                if (next.activityInfo.name.equals("com.umeng.message.component.UmengNotificationReceiver") && TextUtils.equals(next.activityInfo.processName, context.getPackageName())) {
                    z15 = true;
                    break;
                }
            }
            if (!z15) {
                a(context, "please check UmengNotificationReceiver in AndroidManifest!");
                return false;
            }
            Intent intent7 = new Intent("com.umeng.message.action");
            intent7.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it7 = context.getPackageManager().queryIntentServices(intent7, 64).iterator();
            while (true) {
                if (!it7.hasNext()) {
                    z16 = false;
                    break;
                }
                ResolveInfo next2 = it7.next();
                if (next2.serviceInfo.name.equals("com.umeng.message.component.UmengMessageHandlerService") && TextUtils.equals(context.getPackageName(), next2.serviceInfo.processName)) {
                    z16 = true;
                    break;
                }
            }
            if (!z16) {
                a(context, "please check UmengMessageHandlerService in AndroidManifest!");
                return false;
            }
            Intent intent8 = new Intent();
            intent8.setPackage(context.getPackageName());
            intent8.setAction(AgooConstants.BINDER_MSGRECEIVER_ACTION);
            Iterator<ResolveInfo> it8 = context.getPackageManager().queryIntentServices(intent8, 64).iterator();
            while (true) {
                if (!it8.hasNext()) {
                    z17 = false;
                    break;
                }
                if (it8.next().serviceInfo.name.equals("com.umeng.message.component.UmengMessageReceiverService")) {
                    z17 = true;
                    break;
                }
            }
            if (!z17) {
                a(context, "please check UmengMessageReceiverService in AndroidManifest!");
                return false;
            }
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                z18 = false;
                z19 = false;
                z20 = false;
                for (String str : strArr) {
                    if ("android.permission.INTERNET".equals(str)) {
                        z19 = true;
                    } else if ("android.permission.ACCESS_WIFI_STATE".equals(str)) {
                        z20 = true;
                    } else if ("android.permission.ACCESS_NETWORK_STATE".equals(str)) {
                        z18 = true;
                    }
                }
            } else {
                z18 = false;
                z19 = false;
                z20 = false;
            }
            if (!(z19 && z20 && z18)) {
                a(context, "please add required permission in AndroidManifest!");
                return false;
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
