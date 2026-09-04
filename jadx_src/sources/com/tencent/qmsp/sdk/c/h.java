package com.tencent.qmsp.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.qmsp.sdk.u.U;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SharedPreferences f101803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f101804b = 23;

    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.b();
        }
    }

    public static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.b();
        }
    }

    private static void a() {
        String str;
        try {
            int i10 = f101804b;
            String[] strArr = new String[i10];
            f.a(10L, 0L, 0L, 0L, null, null, null, strArr);
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            for (int i11 = 0; i11 < i10; i11++) {
                String strA = com.tencent.qmsp.sdk.f.i.a(strArr[i11]);
                strArr[i11] = strA;
                sb2.append(strA);
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                if (i11 == 0) {
                    sb3.append(String.format("k%d:", Integer.valueOf(i11 + 1)));
                    str = strArr[i11];
                } else {
                    sb3.append(String.format(";k%d:", Integer.valueOf(i11 + 1)));
                    str = strArr[i11];
                }
                sb3.append(str);
            }
            sb3.append(String.format(";k%d:", Integer.valueOf(i10 + 1)));
            sb3.append(U.BEACON_ID_VERSION);
            sb2.append(sb3.toString());
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb2.append(com.tencent.qmsp.sdk.a.c.a(sb3.toString()));
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Java -- cbid: ");
            sb4.append(sb2.toString());
            sb4.append(" bidMd5: ");
            sb4.append(com.tencent.qmsp.sdk.a.c.a(sb3.toString()));
            com.tencent.qmsp.sdk.f.g.b("cbid", 0, sb4.toString());
            com.tencent.qmsp.sdk.a.f.a(sb2.toString(), 5);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void a(long j10) {
        f.i().c().postDelayed(new b(), j10);
    }

    public static void a(Context context) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.tencent.qmsp.sdk.c.b.f101769a);
            sb2.append("qmsp_cbid_time");
            f101803a = context.getSharedPreferences(sb2.toString(), 0);
            b();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void b() {
        try {
            if (!com.tencent.qmsp.sdk.app.a.getTaskStatus()) {
                com.tencent.qmsp.sdk.f.g.a("cbid", 1, "Cbid Task Finish！");
                return;
            }
            if (f101803a != null) {
                long j10 = 28800000;
                if (!f.i().a(1002).booleanValue()) {
                    a(28800000L);
                    return;
                }
                long j11 = 0;
                long j12 = f101803a.getLong("cbid_last_time", 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j13 = jCurrentTimeMillis - j12;
                if (j13 >= 0) {
                    j11 = j13;
                }
                if (j11 > 28800000) {
                    a();
                    SharedPreferences.Editor editorEdit = f101803a.edit();
                    editorEdit.putLong("cbid_last_time", jCurrentTimeMillis);
                    editorEdit.commit();
                } else {
                    j10 = 28800000 - j11;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("cbid rpt after: ");
                sb2.append(j10);
                com.tencent.qmsp.sdk.f.g.a("cbid", 1, sb2.toString());
                f.i().c().postDelayed(new a(), j10);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
