package com.tencent.qimei.j;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.z0;
import com.tencent.qimei.u.d;

/* JADX INFO: compiled from: NetUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    @z0("android.permission.ACCESS_NETWORK_STATE")
    public static NetworkInfo a() {
        ConnectivityManager connectivityManager;
        Context contextF = d.b().F();
        if (contextF == null || (connectivityManager = (ConnectivityManager) contextF.getSystemService("connectivity")) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (SecurityException e10) {
            e10.printStackTrace();
            com.tencent.qimei.n.a.a("网络", "没有网络状态查询权限，请在AndroidManifest文件中添加 <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />", new Object[0]);
            return null;
        }
    }

    @z0("android.permission.ACCESS_NETWORK_STATE")
    public static boolean b() {
        NetworkInfo networkInfoA = a();
        return networkInfoA != null && networkInfoA.isConnected();
    }
}
