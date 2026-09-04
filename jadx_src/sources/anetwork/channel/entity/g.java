package anetwork.channel.entity;

import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class g implements v3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private anetwork.channel.aidl.g f30222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private anetwork.channel.aidl.adapter.d f30224c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f30226e;

    public g(anetwork.channel.aidl.g gVar, k kVar) {
        this.f30225d = false;
        this.f30222a = gVar;
        this.f30226e = kVar;
        if (gVar != null) {
            try {
                if ((gVar.C0() & 8) != 0) {
                    this.f30225d = true;
                }
            } catch (RemoteException unused) {
            }
        }
    }

    private void d(Runnable runnable) {
        if (this.f30226e.h()) {
            runnable.run();
        } else {
            String str = this.f30223b;
            e.b(str != null ? str.hashCode() : hashCode(), runnable);
        }
    }

    @Override // v3.a
    public void a(int i10, int i11, ByteArray byteArray) {
        anetwork.channel.aidl.g gVar = this.f30222a;
        if (gVar != null) {
            d(new i(this, i10, byteArray, i11, gVar));
        }
    }

    @Override // v3.a
    public void b(DefaultFinishEvent defaultFinishEvent) {
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.Repeater", "[onFinish] ", this.f30223b, new Object[0]);
        }
        anetwork.channel.aidl.g gVar = this.f30222a;
        if (gVar != null) {
            j jVar = new j(this, defaultFinishEvent, gVar);
            RequestStatistic requestStatistic = defaultFinishEvent.f30025f;
            if (requestStatistic != null) {
                requestStatistic.rspCbDispatch = System.currentTimeMillis();
            }
            d(jVar);
        }
        this.f30222a = null;
    }

    public void e(String str) {
        this.f30223b = str;
    }

    @Override // v3.a
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.Repeater", "[onResponseCode]", this.f30223b, new Object[0]);
        }
        anetwork.channel.aidl.g gVar = this.f30222a;
        if (gVar != null) {
            d(new h(this, gVar, i10, map));
        }
    }
}
