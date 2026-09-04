package com.taobao.accs.internal;

import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.l;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class a implements l.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ACCSManagerImpl f98287a;

    a(ACCSManagerImpl aCCSManagerImpl) {
        this.f98287a = aCCSManagerImpl;
    }

    @Override // com.taobao.accs.utl.l.b
    public void a() {
        try {
            ALog.e(ACCSManagerImpl.f98276c, "onForeState", new Object[0]);
            if (AccsClientConfig.getConfigByTag(this.f98287a.f98278b).isForePingEnable()) {
                ACCSManagerImpl aCCSManagerImpl = this.f98287a;
                aCCSManagerImpl.a(aCCSManagerImpl.f98279d);
            }
        } catch (Exception e10) {
            ALog.e(ACCSManagerImpl.f98276c, "onForeState error, Error:", e10, new Object[0]);
        }
    }

    @Override // com.taobao.accs.utl.l.b
    public void b() {
        ALog.e(ACCSManagerImpl.f98276c, "onBackState", new Object[0]);
    }
}
