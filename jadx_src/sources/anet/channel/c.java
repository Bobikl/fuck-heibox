package anet.channel;

import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<String, Integer> f29623a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Map<String, SessionInfo> f29624b = new ConcurrentHashMap();

    c() {
    }

    SessionInfo a(String str) {
        return this.f29624b.remove(str);
    }

    Collection<SessionInfo> a() {
        return this.f29624b.values();
    }

    void a(SessionInfo sessionInfo) {
        if (sessionInfo == null) {
            throw new NullPointerException("info is null");
        }
        if (TextUtils.isEmpty(sessionInfo.host)) {
            throw new IllegalArgumentException("host cannot be null or empty");
        }
        this.f29624b.put(sessionInfo.host, sessionInfo);
    }

    void a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("host cannot be null or empty");
        }
        synchronized (this.f29623a) {
            this.f29623a.put(str, Integer.valueOf(i10));
        }
    }

    SessionInfo b(String str) {
        return this.f29624b.get(str);
    }

    public int c(String str) {
        Integer num;
        synchronized (this.f29623a) {
            num = this.f29623a.get(str);
        }
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
