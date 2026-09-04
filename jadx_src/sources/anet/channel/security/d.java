package anet.channel.security;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements ISecurityFactory {
    d() {
    }

    @Override // anet.channel.security.ISecurityFactory
    public ISecurity createNonSecurity(String str) {
        return new a(str);
    }

    @Override // anet.channel.security.ISecurityFactory
    public ISecurity createSecurity(String str) {
        return new b(str);
    }
}
