package com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l1111l1Il extends l111l1111lI1l {
    private final Context l1111l111111Il;

    l111l1111l1Il(Context context) {
        this.l1111l111111Il = context;
    }

    @Override // com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lI1l
    public final String l1111l111111Il() {
        Uri uri = Uri.parse("content://cn.nubia.identity/identity");
        try {
            int i10 = Build.VERSION.SDK_INT;
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.l1111l111111Il.getContentResolver().acquireContentProviderClient(uri);
            Bundle bundleCall = null;
            if (contentProviderClientAcquireContentProviderClient != null) {
                bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
                if (i10 >= 24) {
                    contentProviderClientAcquireContentProviderClient.close();
                } else {
                    contentProviderClientAcquireContentProviderClient.release();
                }
            }
            return (bundleCall != null ? bundleCall.getInt("code", -1) : -1) == 0 ? bundleCall.getString("id") : "";
        } catch (Exception unused) {
            return "";
        }
    }
}
