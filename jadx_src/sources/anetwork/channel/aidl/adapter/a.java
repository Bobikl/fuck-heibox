package anetwork.channel.aidl.adapter;

import android.os.RemoteException;
import anet.channel.util.ErrorConstant;
import anetwork.channel.statist.StatisticData;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a extends anetwork.channel.aidl.a.AbstractBinderC0245a implements s3.d.a, s3.d.b, s3.d.InterfaceC1266d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f30067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f30068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f30069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, List<String>> f30070l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private StatisticData f30071m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CountDownLatch f30072n = new CountDownLatch(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CountDownLatch f30073o = new CountDownLatch(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private anetwork.channel.aidl.e f30074p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private anetwork.channel.entity.k f30075q;

    public a(int i10) {
        this.f30068j = i10;
        this.f30069k = ErrorConstant.getErrMsg(i10);
    }

    public a(anetwork.channel.entity.k kVar) {
        this.f30075q = kVar;
    }

    private RemoteException r1(String str) {
        return new RemoteException(str);
    }

    private void t1(CountDownLatch countDownLatch) throws RemoteException {
        try {
            if (countDownLatch.await(this.f30075q.e() + 1000, TimeUnit.MILLISECONDS)) {
                return;
            }
            anetwork.channel.aidl.e eVar = this.f30074p;
            if (eVar != null) {
                eVar.cancel(true);
            }
            throw r1("wait time out");
        } catch (InterruptedException unused) {
            throw r1("thread interrupt");
        }
    }

    @Override // anetwork.channel.aidl.a
    public Map<String, List<String>> C() throws RemoteException {
        t1(this.f30072n);
        return this.f30070l;
    }

    @Override // s3.d.InterfaceC1266d
    public boolean N(int i10, Map<String, List<String>> map, Object obj) {
        this.f30068j = i10;
        this.f30069k = ErrorConstant.getErrMsg(i10);
        this.f30070l = map;
        this.f30072n.countDown();
        return false;
    }

    @Override // anetwork.channel.aidl.a
    public void cancel() throws RemoteException {
        anetwork.channel.aidl.e eVar = this.f30074p;
        if (eVar != null) {
            eVar.cancel(true);
        }
    }

    @Override // s3.d.b
    public void g(anetwork.channel.aidl.f fVar, Object obj) {
        this.f30067i = (d) fVar;
        this.f30073o.countDown();
    }

    @Override // anetwork.channel.aidl.a
    public anetwork.channel.aidl.f getInputStream() throws RemoteException {
        t1(this.f30073o);
        return this.f30067i;
    }

    @Override // anetwork.channel.aidl.a
    public int getStatusCode() throws RemoteException {
        t1(this.f30072n);
        return this.f30068j;
    }

    @Override // s3.d.a
    public void r0(s3.e.a aVar, Object obj) {
        this.f30068j = aVar.a();
        this.f30069k = aVar.w() != null ? aVar.w() : ErrorConstant.getErrMsg(this.f30068j);
        this.f30071m = aVar.z();
        d dVar = this.f30067i;
        if (dVar != null) {
            dVar.q1();
        }
        this.f30073o.countDown();
        this.f30072n.countDown();
    }

    public void s1(anetwork.channel.aidl.e eVar) {
        this.f30074p = eVar;
    }

    @Override // anetwork.channel.aidl.a
    public String w() throws RemoteException {
        t1(this.f30072n);
        return this.f30069k;
    }

    @Override // anetwork.channel.aidl.a
    public StatisticData z() {
        return this.f30071m;
    }
}
