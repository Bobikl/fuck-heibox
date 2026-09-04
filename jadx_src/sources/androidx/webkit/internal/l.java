package androidx.webkit.internal;

import androidx.webkit.j0;
import org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface;

/* JADX INFO: compiled from: VisualStateCallbackAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class l implements VisualStateCallbackBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j0.b f28381a;

    public l(j0.b bVar) {
        this.f28381a = bVar;
    }

    @Override // org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface
    public void onComplete(long j10) {
        this.f28381a.onComplete(j10);
    }
}
