package cn.fly.verify;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class dg implements dm<dg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private df f36099a;

    private ConnectivityManager.NetworkCallback a() {
        return new ConnectivityManager.NetworkCallback() { // from class: cn.fly.verify.dg.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                super.onAvailable(network);
                ArrayList<Object> arrayList = new ArrayList<>();
                arrayList.add(network);
                dg.this.f36099a.a(ec.a("011<biZcTdbbbCb(bgDebIddHed"), arrayList);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                super.onLost(network);
                ArrayList<Object> arrayList = new ArrayList<>();
                arrayList.add(network);
                dg.this.f36099a.a(ec.a("006Cbi0cZdcbidg<g"), arrayList);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onUnavailable() {
                super.onUnavailable();
            }
        };
    }

    public void a(df dfVar) {
        this.f36099a = dfVar;
    }

    @Override // cn.fly.verify.dm
    public boolean a(dg dgVar, Class<dg> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        Object obj;
        if ("setHandler".equals(str) && objArr.length == 1 && (obj = objArr[0]) != null && (obj instanceof df)) {
            dgVar.a((df) obj);
        } else {
            if (!ec.a("019:bgWcYbgVgSce^dg(debibhcfcb*bee8ddEba cf").equals(str) || objArr.length != 0) {
                return false;
            }
            objArr2[0] = dgVar.a();
        }
        return true;
    }
}
