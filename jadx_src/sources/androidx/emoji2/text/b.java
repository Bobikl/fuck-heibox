package androidx.emoji2.text;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f22938b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f22938b.post(runnable);
    }
}
