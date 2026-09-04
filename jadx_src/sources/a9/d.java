package a9;

import android.os.Process;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f1190b;

    public d(Runnable runnable, int i10) {
        this.f1190b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f1190b.run();
    }
}
