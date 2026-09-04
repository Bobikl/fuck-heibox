package anet.channel.security;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface ISecurityFactory {
    ISecurity createNonSecurity(String str);

    ISecurity createSecurity(String str);
}
