package anet.channel.security;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ISecurityFactory f29819a;

    public static ISecurityFactory a() {
        if (f29819a == null) {
            f29819a = new d();
        }
        return f29819a;
    }
}
