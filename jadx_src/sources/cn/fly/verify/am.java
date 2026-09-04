package cn.fly.verify;

import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile String f35757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ExecutorService f35758b = Executors.newSingleThreadExecutor();

    public static String a() {
        if (TextUtils.isEmpty(f35757a)) {
            f35757a = bx.a(new be());
        }
        return f35757a;
    }
}
