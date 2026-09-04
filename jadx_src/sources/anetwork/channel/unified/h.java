package anetwork.channel.unified;

import anet.channel.thread.ThreadPoolExecutorFactory;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f30322b;

    h(g gVar) {
        this.f30322b = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadPoolExecutorFactory.submitPriorityTask(this.f30322b, ThreadPoolExecutorFactory.Priority.HIGH);
    }
}
