package com.huawei.hms.hatool;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f60995a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f60996b = 4;

    private static String a() {
        return "FormalHASDK_2.2.0.314" + p.a();
    }

    public void a(int i10) {
        Log.i("FormalHASDK", System.lineSeparator() + "======================================= " + System.lineSeparator() + a() + "" + System.lineSeparator() + "=======================================");
        this.f60996b = i10;
        this.f60995a = true;
    }

    public void a(int i10, String str, String str2) {
        if (i10 == 3) {
            Log.d(str, str2);
            return;
        }
        if (i10 == 5) {
            Log.w(str, str2);
        } else if (i10 != 6) {
            Log.i(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    public void b(int i10, String str, String str2) {
        a(i10, "FormalHASDK", str + "=> " + str2);
    }

    public boolean b(int i10) {
        return this.f60995a && i10 >= this.f60996b;
    }
}
