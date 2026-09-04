package anetwork.channel.cookie;

import android.text.TextUtils;
import anet.channel.util.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements Runnable {
    b() {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (TextUtils.isEmpty(a.i())) {
                return;
            }
            a.C0254a unused = a.f30168e = new a.C0254a(a.i());
        } catch (Exception e10) {
            ALog.e(a.f30164a, "", null, e10, new Object[0]);
        }
    }
}
