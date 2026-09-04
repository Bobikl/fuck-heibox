package anetwork.channel.stat;

import anet.channel.util.StringUtils;
import anetwork.channel.statist.StatisticData;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import z5.g;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class c implements anetwork.channel.stat.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f30259b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f30260c = "{\"oneWayTime\" : 0, \"totalSize\" : 0}";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f30261a;

    /* JADX INFO: compiled from: Taobao */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static c f30262a = new c();

        private a() {
        }
    }

    private c() {
        this.f30261a = Collections.synchronizedMap(new LinkedHashMap<String, String>() { // from class: anetwork.channel.stat.NetworkStatCache$1
            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<String, String> entry) {
                return size() > 100;
            }
        });
    }

    public static c c() {
        return a.f30262a;
    }

    @Override // anetwork.channel.stat.a
    public void a(String str) {
        if (this.f30261a.containsKey(str)) {
            this.f30261a.put(str, f30260c);
        }
    }

    @Override // anetwork.channel.stat.a
    public void b(String str, StatisticData statisticData) {
        if (StringUtils.isBlank(str)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("{\"oneWayTime\" : ");
        sb2.append(statisticData.f30275n);
        sb2.append(", \"totalSize\" : ");
        sb2.append(statisticData.C);
        sb2.append(g.f141884d);
        this.f30261a.put(str, sb2.toString());
    }

    @Override // anetwork.channel.stat.a
    public String get(String str) {
        return this.f30261a.get(str);
    }
}
