package anet.channel.strategy.dispatch;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface IAmdcSign {
    String getAppkey();

    String sign(String str);

    boolean useSecurityGuard();
}
