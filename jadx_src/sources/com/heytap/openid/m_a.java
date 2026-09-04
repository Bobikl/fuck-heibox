package com.heytap.openid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes7.dex */
public interface m_a extends IInterface {

    /* JADX INFO: renamed from: com.heytap.openid.m_a$m_a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0498m_a extends Binder implements m_a {
        public static final String m_a = com.heytap.openid.sdk.m_a.m_a("Y29tLmhleXRhcC5vcGVuaWQuSU9wZW5JRA==");

        /* JADX INFO: renamed from: com.heytap.openid.m_a$m_a$m_a, reason: collision with other inner class name */
        public static class C0499m_a implements m_a {
            public IBinder m_a;

            public C0499m_a(IBinder iBinder) {
                this.m_a = iBinder;
            }

            @Override // android.os.IInterface
            public native IBinder asBinder();

            @Override // com.heytap.openid.m_a
            public native String m_a(String str, String str2, String str3);
        }

        public static native m_a m_a(IBinder iBinder);
    }

    String m_a(String str, String str2, String str3);
}
