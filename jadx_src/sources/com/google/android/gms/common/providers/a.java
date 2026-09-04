package com.google.android.gms.common.providers;

import androidx.annotation.n0;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
@Deprecated
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static InterfaceC0411a f52622a;

    /* JADX INFO: renamed from: com.google.android.gms.common.providers.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface InterfaceC0411a {
        @n0
        @v8.a
        @Deprecated
        ScheduledExecutorService a();
    }

    private a() {
    }

    @n0
    @v8.a
    @Deprecated
    public static synchronized InterfaceC0411a a() {
        if (f52622a == null) {
            f52622a = new b();
        }
        return f52622a;
    }
}
