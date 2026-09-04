package anet.channel.strategy;

import anet.channel.util.ALog;
import java.net.InetAddress;
import java.util.Collections;
import java.util.LinkedList;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f29906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f29907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ a f29908c;

    b(a aVar, String str, Object obj) {
        this.f29908c = aVar;
        this.f29906a = str;
        this.f29907b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                String hostAddress = InetAddress.getByName(this.f29906a).getHostAddress();
                LinkedList linkedList = new LinkedList();
                ConnProtocol connProtocol = StrategyTemplate.getInstance().getConnProtocol(this.f29906a);
                if (connProtocol != null) {
                    linkedList.add(IPConnStrategy.a(hostAddress, !this.f29908c.a(connProtocol) ? 80 : 443, connProtocol, 0, 0, 1, 45000));
                }
                linkedList.add(IPConnStrategy.a(hostAddress, 80, ConnProtocol.HTTP, 0, 0, 0, 0));
                linkedList.add(IPConnStrategy.a(hostAddress, 443, ConnProtocol.HTTPS, 0, 0, 0, 0));
                this.f29908c.f29904a.put(this.f29906a, linkedList);
                if (ALog.isPrintLog(1)) {
                    ALog.d("awcn.LocalDnsStrategyTable", "resolve ip by local dns", null, "host", this.f29906a, "ip", hostAddress, "list", linkedList);
                }
                synchronized (this.f29908c.f29905b) {
                    this.f29908c.f29905b.remove(this.f29906a);
                }
                synchronized (this.f29907b) {
                    this.f29907b.notifyAll();
                }
            } catch (Exception unused) {
                if (ALog.isPrintLog(1)) {
                    ALog.d("awcn.LocalDnsStrategyTable", "resolve ip by local dns failed", null, "host", this.f29906a);
                }
                this.f29908c.f29904a.put(this.f29906a, Collections.EMPTY_LIST);
                synchronized (this.f29908c.f29905b) {
                    this.f29908c.f29905b.remove(this.f29906a);
                    synchronized (this.f29907b) {
                        this.f29907b.notifyAll();
                    }
                }
            }
        } catch (Throwable th2) {
            synchronized (this.f29908c.f29905b) {
                this.f29908c.f29905b.remove(this.f29906a);
                synchronized (this.f29907b) {
                    this.f29907b.notifyAll();
                    throw th2;
                }
            }
        }
    }
}
