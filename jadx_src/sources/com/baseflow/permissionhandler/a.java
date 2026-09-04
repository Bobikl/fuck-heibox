package com.baseflow.permissionhandler;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: compiled from: AppSettingsManager.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: com.baseflow.permissionhandler.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppSettingsManager.java */
    @FunctionalInterface
    public interface InterfaceC0316a {
        void onSuccess(boolean z10);
    }

    a() {
    }

    void a(Context context, InterfaceC0316a interfaceC0316a, c cVar) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            cVar.a("PermissionHandler.AppSettingsManager", "Android context cannot be null.");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
            interfaceC0316a.onSuccess(true);
        } catch (Exception unused) {
            interfaceC0316a.onSuccess(false);
        }
    }
}
