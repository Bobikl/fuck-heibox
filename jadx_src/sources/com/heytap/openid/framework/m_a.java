package com.heytap.openid.framework;

import android.app.OplusNotificationManager;
import android.os.Build;
import com.android.id.impl.IdProviderImpl;
import com.heytap.openid.sdk.m_h;

/* JADX INFO: loaded from: classes7.dex */
public class m_a {
    public IdProviderImpl m_a;
    public OplusNotificationManager m_b = null;

    /* JADX INFO: renamed from: com.heytap.openid.framework.m_a$m_a, reason: collision with other inner class name */
    public static class C0497m_a {
        public static final m_a m_a = new m_a();
    }

    public m_a() {
        this.m_a = null;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 31 && i10 != 32) {
            try {
                this.m_a = new IdProviderImpl();
                return;
            } catch (Error | Exception e10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("1084: ");
                sb2.append(e10.getMessage() != null ? e10.getMessage() : e10.getLocalizedMessage());
                m_h.m_b(sb2.toString());
            }
        }
        m_a();
    }

    public final native void m_a();
}
