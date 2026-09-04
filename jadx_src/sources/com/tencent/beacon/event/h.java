package com.tencent.beacon.event;

import androidx.annotation.n0;
import com.tencent.beacon.event.open.EventResult;

/* JADX INFO: compiled from: IEventManager.java */
/* JADX INFO: loaded from: classes4.dex */
public interface h {
    EventResult a(String str, @n0 EventBean eventBean);

    void a();

    void a(boolean z10);

    boolean a(Runnable runnable);

    EventResult b(String str, @n0 EventBean eventBean);

    void b();

    void c();
}
