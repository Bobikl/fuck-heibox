package com.heytap.openid.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes7.dex */
public class m_d extends Handler {
    public final /* synthetic */ m_c m_a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m_d(m_c m_cVar, Looper looper) {
        super(looper);
        this.m_a = m_cVar;
    }

    @Override // android.os.Handler
    public native void handleMessage(Message message);
}
