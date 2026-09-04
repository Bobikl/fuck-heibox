package anet.channel.util;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicInteger f30017a = new AtomicInteger();

    public static String a(String str) {
        if (f30017a.get() == Integer.MAX_VALUE) {
            f30017a.set(0);
        }
        return !TextUtils.isEmpty(str) ? StringUtils.concatString(str, ".AWCN", String.valueOf(f30017a.incrementAndGet())) : StringUtils.concatString("AWCN", String.valueOf(f30017a.incrementAndGet()));
    }
}
