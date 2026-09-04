package anet.channel.strategy;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f29909a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29910b = true;

    /* JADX INFO: compiled from: Taobao */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static c f29911a = new c();

        private a() {
        }
    }

    public String a(String str) {
        if (!this.f29910b) {
            return null;
        }
        String str2 = this.f29909a.get(str);
        if (str2 != null) {
            return str2;
        }
        this.f29909a.put(str, "https");
        return "https";
    }

    public void a(boolean z10) {
        this.f29910b = z10;
    }

    public void b(String str) {
        this.f29909a.put(str, "http");
    }
}
