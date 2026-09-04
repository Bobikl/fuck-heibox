package com.vivo.push.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: OnChangePushStatusReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends com.vivo.push.l {
    f(com.vivo.push.o oVar) {
        super(oVar);
    }

    public static boolean a(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, bb.c.b.f30606e8);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
            com.vivo.push.util.p.a("OnChangePushStatusTask", "enableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, listQueryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) == 1) {
            com.vivo.push.util.p.d("OnChangePushStatusTask", "push service has enabled");
            return false;
        }
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
        com.vivo.push.util.p.d("OnChangePushStatusTask", "enableService push service.");
        return true;
    }

    public static boolean b(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, bb.c.b.f30606e8);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
            com.vivo.push.util.p.a("OnChangePushStatusTask", "disableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, listQueryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) == 2) {
            com.vivo.push.util.p.d("OnChangePushStatusTask", "push service has disabled");
            return false;
        }
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
        com.vivo.push.util.p.d("OnChangePushStatusTask", "disableService push service.");
        return true;
    }

    private static List<ResolveInfo> c(Context context) {
        List<ResolveInfo> listQueryBroadcastReceivers;
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        try {
            listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, bb.c.b.f30606e8);
        } catch (Exception unused) {
            listQueryBroadcastReceivers = null;
        }
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            return listQueryBroadcastReceivers;
        }
        Intent intent2 = new Intent("com.vivo.pushclient.action.RECEIVE");
        intent2.setPackage(context.getPackageName());
        try {
            return context.getPackageManager().queryBroadcastReceivers(intent2, bb.c.b.f30606e8);
        } catch (Exception unused2) {
            return listQueryBroadcastReceivers;
        }
    }

    @Override // com.vivo.push.l
    protected final void a(com.vivo.push.o oVar) {
        if (this.f106610a.getPackageName().equals(com.vivo.push.util.t.b(this.f106610a))) {
            return;
        }
        com.vivo.push.b.j jVar = (com.vivo.push.b.j) oVar;
        int iD = jVar.d();
        int iE = jVar.e();
        com.vivo.push.util.p.d("OnChangePushStatusTask", "OnChangePushStatusTask serviceStatus is " + iD + " ; receiverStatus is " + iE);
        if (iD == 2) {
            b(this.f106610a);
        } else if (iD == 1) {
            a(this.f106610a);
        } else if (iD == 0) {
            Context context = this.f106610a;
            Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, bb.c.b.f30606e8);
            if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                com.vivo.push.util.p.a("OnChangePushStatusTask", "defaultService error: can not find push service.");
            } else {
                PackageManager packageManager = context.getPackageManager();
                ComponentName componentName = new ComponentName(context, listQueryIntentServices.get(0).serviceInfo.name);
                if (packageManager.getComponentEnabledSetting(componentName) != 0) {
                    packageManager.setComponentEnabledSetting(componentName, 0, 1);
                    com.vivo.push.util.p.d("OnChangePushStatusTask", "defaultService push service.");
                } else {
                    com.vivo.push.util.p.d("OnChangePushStatusTask", "push service has defaulted");
                }
            }
        }
        if (iE == 2) {
            Context context2 = this.f106610a;
            List<ResolveInfo> listC = c(context2);
            if (listC == null || listC.size() <= 0) {
                com.vivo.push.util.p.a("OnChangePushStatusTask", "disableReceiver error: can not find push service.");
            } else {
                String str = listC.get(0).activityInfo.name;
                if (TextUtils.isEmpty(str)) {
                    com.vivo.push.util.p.d("OnChangePushStatusTask", "disableReceiver error: className is null. ");
                } else {
                    PackageManager packageManager2 = context2.getPackageManager();
                    ComponentName componentName2 = new ComponentName(context2, str);
                    if (packageManager2.getComponentEnabledSetting(componentName2) != 2) {
                        packageManager2.setComponentEnabledSetting(componentName2, 2, 1);
                        com.vivo.push.util.p.d("OnChangePushStatusTask", "push service disableReceiver ");
                    } else {
                        com.vivo.push.util.p.d("OnChangePushStatusTask", "push service has disableReceiver ");
                    }
                }
            }
            com.vivo.push.sdk.a.a().b();
            return;
        }
        if (iE == 1) {
            Context context3 = this.f106610a;
            List<ResolveInfo> listC2 = c(context3);
            if (listC2 == null || listC2.size() <= 0) {
                com.vivo.push.util.p.a("OnChangePushStatusTask", "enableReceiver error: can not find push service.");
                return;
            }
            String str2 = listC2.get(0).activityInfo.name;
            if (TextUtils.isEmpty(str2)) {
                com.vivo.push.util.p.d("OnChangePushStatusTask", "enableReceiver error: className is null. ");
                return;
            }
            PackageManager packageManager3 = context3.getPackageManager();
            ComponentName componentName3 = new ComponentName(context3, str2);
            if (packageManager3.getComponentEnabledSetting(componentName3) == 1) {
                com.vivo.push.util.p.d("OnChangePushStatusTask", "push service has enableReceiver ");
                return;
            } else {
                packageManager3.setComponentEnabledSetting(componentName3, 1, 1);
                com.vivo.push.util.p.d("OnChangePushStatusTask", "push service enableReceiver ");
                return;
            }
        }
        if (iE == 0) {
            Context context4 = this.f106610a;
            List<ResolveInfo> listC3 = c(context4);
            if (listC3 == null || listC3.size() <= 0) {
                com.vivo.push.util.p.a("OnChangePushStatusTask", "defaultReceiver error: can not find push service.");
                return;
            }
            String str3 = listC3.get(0).activityInfo.name;
            if (TextUtils.isEmpty(str3)) {
                com.vivo.push.util.p.d("OnChangePushStatusTask", "defaultReceiver error: className is null. ");
                return;
            }
            PackageManager packageManager4 = context4.getPackageManager();
            ComponentName componentName4 = new ComponentName(context4, str3);
            if (packageManager4.getComponentEnabledSetting(componentName4) == 0) {
                com.vivo.push.util.p.d("OnChangePushStatusTask", "push service has defaulted");
            } else {
                packageManager4.setComponentEnabledSetting(componentName4, 0, 1);
                com.vivo.push.util.p.d("OnChangePushStatusTask", "push service defaultReceiver ");
            }
        }
    }
}
