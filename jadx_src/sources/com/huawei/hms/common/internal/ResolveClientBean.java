package com.huawei.hms.common.internal;

/* JADX INFO: loaded from: classes7.dex */
public class ResolveClientBean {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AnyClient f60550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60551c;

    public ResolveClientBean(AnyClient anyClient, int i10) {
        this.f60550b = anyClient;
        this.f60549a = Objects.hashCode(anyClient);
        this.f60551c = i10;
    }

    public void clientReconnect() {
        this.f60550b.connect(this.f60551c, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ResolveClientBean)) {
            return false;
        }
        return this.f60550b.equals(((ResolveClientBean) obj).f60550b);
    }

    public AnyClient getClient() {
        return this.f60550b;
    }

    public int hashCode() {
        return this.f60549a;
    }
}
