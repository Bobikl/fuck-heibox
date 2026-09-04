package com.huawei.hms.push;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: CommonHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public class e extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<a> f61245a;

    /* JADX INFO: compiled from: CommonHandler.java */
    public interface a {
        void a(Message message);
    }

    public e(a aVar) {
        this.f61245a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        a aVar = this.f61245a.get();
        if (aVar != null) {
            aVar.a(message);
        }
    }
}
