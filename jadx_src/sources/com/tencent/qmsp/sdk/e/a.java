package com.tencent.qmsp.sdk.e;

import com.tencent.qmsp.sdk.c.f;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: com.tencent.qmsp.sdk.e.a$a, reason: collision with other inner class name */
    public static final class RunnableC0994a implements Runnable {
        RunnableC0994a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.i().b().a(false);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void a() {
        f.i().c().post(new RunnableC0994a());
    }
}
