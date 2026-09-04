package anet.channel;

import anet.channel.util.HttpConstant;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class k implements anetwork.channel.cache.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f29732a;

    k(j jVar) {
        this.f29732a = jVar;
    }

    @Override // anetwork.channel.cache.b
    public boolean handleCache(String str, Map<String, String> map) {
        return "weex".equals(map.get(HttpConstant.F_REFER));
    }
}
