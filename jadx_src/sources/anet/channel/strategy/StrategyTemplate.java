package anet.channel.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class StrategyTemplate {
    Map<String, ConnProtocol> templateMap = new ConcurrentHashMap();

    /* JADX INFO: compiled from: Taobao */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static StrategyTemplate f29903a = new StrategyTemplate();

        a() {
        }
    }

    public static StrategyTemplate getInstance() {
        return a.f29903a;
    }

    public ConnProtocol getConnProtocol(String str) {
        return this.templateMap.get(str);
    }

    public void registerConnProtocol(String str, ConnProtocol connProtocol) {
        if (connProtocol != null) {
            this.templateMap.put(str, connProtocol);
            try {
                IStrategyInstance strategyCenter = StrategyCenter.getInstance();
                if (strategyCenter instanceof g) {
                    ((g) strategyCenter).f29933b.f29888c.a(str, connProtocol);
                }
            } catch (Exception unused) {
            }
        }
    }
}
