package anet.channel.detect;

import anet.channel.AwcnConfig;
import anet.channel.strategy.IStrategyListener;
import anet.channel.util.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class e implements IStrategyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f29650a;

    e(d dVar) {
        this.f29650a = dVar;
    }

    @Override // anet.channel.strategy.IStrategyListener
    public void onStrategyUpdated(anet.channel.strategy.l.d dVar) {
        anet.channel.strategy.l.c[] cVarArr;
        int i10 = 0;
        ALog.i("anet.HorseRaceDetector", "onStrategyUpdated", null, new Object[0]);
        if (!AwcnConfig.isHorseRaceEnable() || (cVarArr = dVar.f29968c) == null || cVarArr.length == 0) {
            return;
        }
        synchronized (this.f29650a.f29648a) {
            while (true) {
                anet.channel.strategy.l.c[] cVarArr2 = dVar.f29968c;
                if (i10 < cVarArr2.length) {
                    anet.channel.strategy.l.c cVar = cVarArr2[i10];
                    this.f29650a.f29648a.put(cVar.f29964a, cVar);
                    i10++;
                }
            }
        }
    }
}
