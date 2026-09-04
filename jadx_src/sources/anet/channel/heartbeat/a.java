package anet.channel.heartbeat;

import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a implements IHeartbeat, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Session f29721a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f29722b = false;

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f29722b) {
            return;
        }
        this.f29721a.ping(true);
        ThreadPoolExecutorFactory.submitScheduledTask(this, 45000L, TimeUnit.MILLISECONDS);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        if (session == null) {
            throw new NullPointerException("session is null");
        }
        this.f29721a = session;
        run();
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        this.f29722b = true;
    }
}
