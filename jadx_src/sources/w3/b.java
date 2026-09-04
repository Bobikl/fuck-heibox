package w3;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicInteger f140983a = new AtomicInteger(0);

    public static String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(16);
        if (str != null) {
            sb2.append(str);
            sb2.append(lg.a.f131414g);
        }
        if (str2 != null) {
            sb2.append(str2);
            sb2.append(f140983a.incrementAndGet() & Integer.MAX_VALUE);
        }
        return sb2.toString();
    }
}
