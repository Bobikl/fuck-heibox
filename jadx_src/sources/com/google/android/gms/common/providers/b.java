package com.google.android.gms.common.providers;

import com.google.android.gms.internal.common.o;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements a.InterfaceC0411a {
    b() {
    }

    @Override // com.google.android.gms.common.providers.a.InterfaceC0411a
    public final ScheduledExecutorService a() {
        o.a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
