package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import com.umeng.analytics.pro.ak;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: WakeLocks.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "WakeLocks")
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0006\u0010\b\u001a\u00020\u0007\"\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroid/content/Context;", com.umeng.analytics.pro.d.R, "", "tag", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "b", "Lkotlin/b2;", ak.av, "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f29272a;

    static {
        String strI = androidx.work.n.i("WakeLocks");
        kotlin.jvm.internal.f0.o(strI, "tagWithPrefix(\"WakeLocks\")");
        f29272a = strI;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b0 b0Var = b0.f29274a;
        synchronized (b0Var) {
            linkedHashMap.putAll(b0Var.a());
            b2 b2Var = b2.f124493a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.n.e().l(f29272a, "WakeLock held for " + str);
            }
        }
    }

    @dl.d
    public static final PowerManager.WakeLock b(@dl.d Context context, @dl.d String tag) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.f0.n(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        b0 b0Var = b0.f29274a;
        synchronized (b0Var) {
            b0Var.a().put(wakeLock, str);
        }
        kotlin.jvm.internal.f0.o(wakeLock, "wakeLock");
        return wakeLock;
    }
}
