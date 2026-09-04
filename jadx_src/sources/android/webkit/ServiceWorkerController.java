package android.webkit;

import android.annotation.NonNull;
import android.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class ServiceWorkerController {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ ServiceWorkerController getInstance();

    @NonNull
    public abstract /* synthetic */ ServiceWorkerWebSettings getServiceWorkerWebSettings();

    public abstract /* synthetic */ void setServiceWorkerClient(@Nullable ServiceWorkerClient serviceWorkerClient);
}
