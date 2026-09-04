package cn.fly.verify;

import android.net.Network;
import cn.fly.verify.common.exception.VerifyException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ae extends s {
    @Override // cn.fly.verify.s
    public Object a(boolean z10) {
        try {
            return ag.d(this.f36982b, this.f36983c);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // cn.fly.verify.s
    public void a(boolean z10, Network network, Object obj, final cn.fly.verify.common.callback.b bVar, e eVar) {
        if (obj != null && (obj instanceof HashMap)) {
            HashMap map = (HashMap) obj;
            new af((HashMap) map.get("params"), (HashMap) map.get("sign")).a(network, "https://auth.wosms.cn/dro/netm/v1.0/qc", new cn.fly.verify.common.callback.b() { // from class: cn.fly.verify.ae.1
                @Override // cn.fly.verify.common.callback.b
                public void a(VerifyException verifyException) {
                    cn.fly.verify.common.callback.b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(verifyException);
                    }
                }

                @Override // cn.fly.verify.common.callback.b
                public void a(Object obj2) {
                    cn.fly.verify.common.callback.b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(obj2);
                    }
                }
            }, this.f36983c);
        } else if (bVar != null) {
            bVar.a(new VerifyException(302002, "params error"));
        }
    }
}
