package com.igexin.push.core.d;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class n extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f63724e;

    public n() {
        super("cn.nubia.identity", "identity");
    }

    @Override // com.igexin.push.core.d.g, com.igexin.push.core.d.c
    public String b(Context context) {
        Bundle bundleCall;
        if (TextUtils.isEmpty(f63724e)) {
            try {
                Uri uri = Uri.parse("content://" + this.f63714a + "/" + this.f63715b);
                int i10 = Build.VERSION.SDK_INT;
                ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(uri);
                if (contentProviderClientAcquireContentProviderClient != null) {
                    bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
                    if (i10 >= 24) {
                        Class.forName("android.content.ContentProviderClient").getMethod("close", new Class[0]).invoke(contentProviderClientAcquireContentProviderClient, new Object[0]);
                    } else {
                        contentProviderClientAcquireContentProviderClient.release();
                    }
                } else {
                    bundleCall = null;
                }
                if (bundleCall == null) {
                    return null;
                }
                if (bundleCall.getInt("code", -1) != 0) {
                    bundleCall.getString("message");
                } else {
                    f63724e = bundleCall.getString("id");
                }
            } catch (Throwable unused) {
            }
        }
        return f63724e;
    }
}
