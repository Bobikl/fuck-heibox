package com.heytap.openid.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes7.dex */
public class m_i extends com.heytap.openid.base.m_c {

    public class m_a implements ServiceConnection {
        public m_a() {
        }

        @Override // android.content.ServiceConnection
        public native void onServiceConnected(ComponentName componentName, IBinder iBinder);

        @Override // android.content.ServiceConnection
        public native void onServiceDisconnected(ComponentName componentName);
    }

    public static class m_b {
        public static final m_i m_a = new m_i();
    }

    public m_i() {
        this.m_e = new m_a();
    }

    @Override // com.heytap.openid.base.m_c
    public native Intent m_a();

    @Override // com.heytap.openid.base.m_c
    public native void m_a(Context context, String str, String str2);

    @Override // com.heytap.openid.base.m_c
    public native boolean m_a(String str);

    @Override // com.heytap.openid.base.m_c
    public native boolean m_b(String str);

    @Override // com.heytap.openid.base.m_c
    public native String m_c(String str);
}
