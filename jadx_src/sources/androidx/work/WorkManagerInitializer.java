package androidx.work;

import android.content.Context;
import androidx.annotation.n0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class WorkManagerInitializer implements androidx.startup.b<WorkManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f28704a = n.i("WrkMgrInitializer");

    @Override // androidx.startup.b
    @n0
    public List<Class<? extends androidx.startup.b<?>>> b() {
        return Collections.emptyList();
    }

    @Override // androidx.startup.b
    @n0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public WorkManager a(@n0 Context context) {
        n.e().a(f28704a, "Initializing WorkManager with default configuration.");
        WorkManager.B(context, new a.b().a());
        return WorkManager.q(context);
    }
}
