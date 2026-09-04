package cn.fly.verify;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static eb f36232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, Integer> f36233b = new HashMap<>();

    private eb() {
    }

    public static synchronized eb a() {
        if (f36232a == null) {
            f36232a = new eb();
        }
        return f36232a;
    }

    public void a(String str, int i10) {
        synchronized (this.f36233b) {
            this.f36233b.put(str, Integer.valueOf(i10));
        }
    }
}
