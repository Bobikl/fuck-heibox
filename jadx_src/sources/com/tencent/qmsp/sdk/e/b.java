package com.tencent.qmsp.sdk.e;

import com.tencent.qmsp.sdk.c.f;
import com.tencent.qmsp.sdk.c.h;
import com.tencent.qmsp.sdk.c.i;
import com.tencent.qmsp.sdk.f.g;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.tencent.qmsp.sdk.app.a.getContext() != null) {
                    h.a(com.tencent.qmsp.sdk.app.a.getContext());
                } else {
                    g.d("qmsp.cbid", 2, "Context is null!");
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void a() {
        f.i().c().postDelayed(new a(), i.f101810f);
    }
}
