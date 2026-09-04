package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class b implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f52397b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BlockingQueue f52398c = new LinkedBlockingQueue();

    @androidx.annotation.n0
    @v8.a
    public IBinder a() throws InterruptedException {
        com.google.android.gms.common.internal.p.k("BlockingServiceConnection.getService() called on main thread");
        if (this.f52397b) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f52397b = true;
        return (IBinder) this.f52398c.take();
    }

    @androidx.annotation.n0
    @v8.a
    public IBinder b(long j10, @androidx.annotation.n0 TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        com.google.android.gms.common.internal.p.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f52397b) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f52397b = true;
        IBinder iBinder = (IBinder) this.f52398c.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@androidx.annotation.n0 ComponentName componentName, @androidx.annotation.n0 IBinder iBinder) {
        this.f52398c.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@androidx.annotation.n0 ComponentName componentName) {
    }
}
