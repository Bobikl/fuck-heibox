package com.apm.lite.i;

import android.os.Handler;
import android.text.TextUtils;
import com.apm.lite.e;
import com.apm.lite.k.q;

/* JADX INFO: loaded from: classes6.dex */
public class c extends a {
    c(Handler handler, long j10, long j11) {
        super(handler, j10, j11);
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (e.h().c()) {
            q.a("[DeviceIdTask] did is done, stop check.");
            return;
        }
        String strF = e.a().f();
        if (TextUtils.isEmpty(strF) || "0".equals(strF)) {
            b(d());
            str = "[DeviceIdTask] did is null, continue check.";
        } else {
            e.h().b(strF);
            str = "[DeviceIdTask] did is " + strF;
        }
        q.a(str);
    }
}
