package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class StrategyConfig implements Serializable {
    public static final String NO_RESULT = "No_Result";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SerialLruCache<String, String> f29883a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f29884b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient StrategyInfoHolder f29885c = null;

    StrategyConfig() {
    }

    StrategyConfig a() {
        StrategyConfig strategyConfig = new StrategyConfig();
        synchronized (this) {
            strategyConfig.f29883a = new SerialLruCache<>(this.f29883a, 256);
            strategyConfig.f29884b = new ConcurrentHashMap(this.f29884b);
            strategyConfig.f29885c = this.f29885c;
        }
        return strategyConfig;
    }

    String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || !anet.channel.strategy.utils.c.c(str)) {
            return null;
        }
        synchronized (this) {
            str2 = this.f29883a.get(str);
            if (str2 == null) {
                this.f29883a.put(str, NO_RESULT);
            }
        }
        if (str2 == null) {
            this.f29885c.d().a(str, false);
        } else if (NO_RESULT.equals(str2)) {
            return null;
        }
        return str2;
    }

    void a(StrategyInfoHolder strategyInfoHolder) {
        this.f29885c = strategyInfoHolder;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    void a(l.d dVar) {
        if (dVar.f29967b == null) {
            return;
        }
        synchronized (this) {
            int i10 = 0;
            TreeMap treeMap = null;
            while (true) {
                l.b[] bVarArr = dVar.f29967b;
                if (i10 >= bVarArr.length) {
                    break;
                }
                l.b bVar = bVarArr[i10];
                if (bVar.f29961j) {
                    this.f29883a.remove(bVar.f29952a);
                } else if (bVar.f29955d != null) {
                    if (treeMap == null) {
                        treeMap = new TreeMap();
                    }
                    treeMap.put(bVar.f29952a, bVar.f29955d);
                } else {
                    if ("http".equalsIgnoreCase(bVar.f29954c) || "https".equalsIgnoreCase(bVar.f29954c)) {
                        this.f29883a.put(bVar.f29952a, bVar.f29954c);
                    } else {
                        this.f29883a.put(bVar.f29952a, NO_RESULT);
                    }
                    if (TextUtils.isEmpty(bVar.f29956e)) {
                        this.f29884b.remove(bVar.f29952a);
                    } else {
                        this.f29884b.put(bVar.f29952a, bVar.f29956e);
                    }
                }
                i10++;
            }
            if (treeMap != null) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    String str = (String) entry.getValue();
                    if (this.f29883a.containsKey(str)) {
                        this.f29883a.put((String) entry.getKey(), this.f29883a.get(str));
                    } else {
                        this.f29883a.put((String) entry.getKey(), NO_RESULT);
                    }
                }
            }
        }
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.StrategyConfig", "", null, "SchemeMap", this.f29883a.toString());
            ALog.d("awcn.StrategyConfig", "", null, "UnitMap", this.f29884b.toString());
        }
    }

    String b(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            str2 = this.f29884b.get(str);
        }
        return str2;
    }

    void b() {
        if (this.f29883a == null) {
            this.f29883a = new SerialLruCache<>(256);
        }
        if (this.f29884b == null) {
            this.f29884b = new ConcurrentHashMap();
        }
    }
}
