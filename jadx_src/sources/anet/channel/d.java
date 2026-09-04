package anet.channel;

import anet.channel.security.ISecurity;
import anet.channel.strategy.dispatch.IAmdcSign;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class d implements IAmdcSign {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f29627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ISecurity f29628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SessionCenter f29629c;

    d(SessionCenter sessionCenter, String str, ISecurity iSecurity) {
        this.f29629c = sessionCenter;
        this.f29627a = str;
        this.f29628b = iSecurity;
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public String getAppkey() {
        return this.f29627a;
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public String sign(String str) {
        return this.f29628b.sign(this.f29629c.f29568b, ISecurity.SIGN_ALGORITHM_HMAC_SHA1, getAppkey(), str);
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public boolean useSecurityGuard() {
        return !this.f29628b.isSecOff();
    }
}
