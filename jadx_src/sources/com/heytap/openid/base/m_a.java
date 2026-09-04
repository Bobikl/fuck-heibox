package com.heytap.openid.base;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class m_a implements Runnable {
    public final /* synthetic */ Context m_a;
    public final /* synthetic */ List m_b;
    public final /* synthetic */ m_b m_c;

    public m_a(m_b m_bVar, Context context, List list) {
        this.m_c = m_bVar;
        this.m_a = context;
        this.m_b = list;
    }

    @Override // java.lang.Runnable
    public native void run();
}
