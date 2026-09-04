package cn.fly.verify;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class go {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f36803a = ec.a("003]fabidd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f36804b = ec.a("005JeabbbbcjWh");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f36805c = ec.a("009.cdbbbbbf2a+bddgbffd");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f36806d = ec.a("0137bdbiddbf aSbibdbdbi.c$dgbffd");

    public static synchronized boolean a() {
        boolean z10;
        File file = new File(new File(ax.g().getFilesDir(), f36803a), f36806d);
        if (!file.exists() || file.length() <= 0) {
            z10 = false;
        } else {
            File file2 = new File(ax.g().getFilesDir(), f36804b);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            gc.a(file, new File(file2, f36805c));
            bv.a().a((ArrayList<String>) null);
            z10 = true;
        }
        return z10;
    }

    public static synchronized boolean b() {
        File file = new File(new File(ax.g().getFilesDir(), ec.a("007TfabiddejBd^bhdg")), ec.a("008Kbdbiddbfba8f?bffd"));
        if (!file.exists() || file.length() <= 1024) {
            return false;
        }
        bv.a().a(bv.f35909e, 1);
        return true;
    }
}
