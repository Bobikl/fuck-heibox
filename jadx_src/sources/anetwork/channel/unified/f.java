package anetwork.channel.unified;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class f implements Future<s3.i> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f30302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30303c;

    public f(m mVar) {
        this.f30302b = mVar;
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public s3.i get() throws ExecutionException, InterruptedException {
        throw new RuntimeException("NOT SUPPORT!");
    }

    public s3.i b() throws ExecutionException, InterruptedException, TimeoutException {
        throw new RuntimeException("NOT SUPPORT!");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (!this.f30303c) {
            this.f30302b.c();
            this.f30303c = true;
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public /* synthetic */ s3.i get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return b();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f30303c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        throw new RuntimeException("NOT SUPPORT!");
    }
}
