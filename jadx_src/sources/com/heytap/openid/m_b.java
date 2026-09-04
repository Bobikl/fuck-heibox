package com.heytap.openid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes7.dex */
public interface m_b extends IInterface {

    public static abstract class m_a extends Binder implements m_b {

        /* JADX INFO: renamed from: com.heytap.openid.m_b$m_a$m_a, reason: collision with other inner class name */
        public static class C0500m_a implements m_b {
            public IBinder m_a;

            public C0500m_a(IBinder iBinder) {
                this.m_a = iBinder;
            }

            @Override // android.os.IInterface
            public native IBinder asBinder();

            @Override // com.heytap.openid.m_b
            public native String m_b(String str, String str2, String str3);
        }

        public static native m_b m_a(IBinder iBinder);
    }

    String m_b(String str, String str2, String str3);
}
