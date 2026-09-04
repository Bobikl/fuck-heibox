package anet.channel.util;

import anet.channel.statist.NetTypeStat;
import anet.channel.thread.ThreadPoolExecutorFactory;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f30007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ NetTypeStat f30008b;

    d(String str, NetTypeStat netTypeStat) {
        this.f30007a = str;
        this.f30008b = netTypeStat;
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadPoolExecutorFactory.submitPriorityTask(new e(this), ThreadPoolExecutorFactory.Priority.LOW);
    }
}
