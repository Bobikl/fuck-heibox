package com.xiaomi.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public class bi implements Callable<bj> {
    bi() {
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bj call() {
        NetworkInfo activeNetworkInfo;
        Context contextM655a = C1339r.m655a();
        if (contextM655a == null) {
            return null;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) contextM655a.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return null;
            }
            return new bj(activeNetworkInfo);
        } catch (Exception unused) {
            return null;
        }
    }
}
