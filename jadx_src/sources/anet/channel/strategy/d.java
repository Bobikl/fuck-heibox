package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.util.ALog;
import java.io.File;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f29912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ StrategyInfoHolder f29913b;

    d(StrategyInfoHolder strategyInfoHolder, String str) {
        this.f29913b = strategyInfoHolder;
        this.f29912a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ALog.i("awcn.StrategyInfoHolder", "start loading strategy files", null, new Object[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (AwcnConfig.isAsyncLoadStrategyEnable()) {
                ALog.i("awcn.StrategyInfoHolder", "load strategy async", null, new Object[0]);
                if (!TextUtils.isEmpty(this.f29912a)) {
                    this.f29913b.a(this.f29912a, true);
                }
                StrategyConfig strategyConfig = (StrategyConfig) m.a("StrategyConfig", null);
                if (strategyConfig != null) {
                    strategyConfig.b();
                    strategyConfig.a(this.f29913b);
                    synchronized (this.f29913b) {
                        this.f29913b.f29887b = strategyConfig;
                    }
                }
            }
            File[] fileArrB = m.b();
            if (fileArrB == null) {
                return;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < fileArrB.length && i10 < 2; i11++) {
                File file = fileArrB[i11];
                if (!file.isDirectory()) {
                    String name = file.getName();
                    if (!name.equals(this.f29912a) && !name.startsWith("StrategyConfig")) {
                        this.f29913b.a(name, false);
                        i10++;
                    }
                }
            }
            ALog.i("awcn.StrategyInfoHolder", "end loading strategy files", null, "total cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Exception unused) {
        }
    }
}
