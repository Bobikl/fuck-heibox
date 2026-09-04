package anet.channel.util;

import java.net.Inet6Address;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Inet6Address f30011b;

    public f(Inet6Address inet6Address, int i10) {
        this.f30010a = i10;
        this.f30011b = inet6Address;
    }

    public String toString() {
        return this.f30011b.getHostAddress() + "/" + this.f30010a;
    }
}
