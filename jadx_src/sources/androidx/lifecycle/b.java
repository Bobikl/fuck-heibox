package androidx.lifecycle;

import android.app.Application;

/* JADX INFO: compiled from: AndroidViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
public class b extends w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Application f24178b;

    public b(@dl.d Application application) {
        kotlin.jvm.internal.f0.p(application, "application");
        this.f24178b = application;
    }

    @dl.d
    public <T extends Application> T c() {
        T t10 = (T) this.f24178b;
        kotlin.jvm.internal.f0.n(t10, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t10;
    }
}
