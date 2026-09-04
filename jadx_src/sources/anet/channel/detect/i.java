package anet.channel.detect;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.HorseRaceStat;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class i implements RequestCb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f29659a;

    i(h hVar) {
        this.f29659a = hVar;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z10) {
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i10, String str, RequestStatistic requestStatistic) {
        ALog.i("anet.HorseRaceDetector", "LongLinkTask request finish", this.f29659a.f29655c, HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(i10), "msg", str);
        if (this.f29659a.f29653a.reqErrorCode == 0) {
            this.f29659a.f29653a.reqErrorCode = i10;
        } else {
            HorseRaceStat horseRaceStat = this.f29659a.f29653a;
            horseRaceStat.reqRet = horseRaceStat.reqErrorCode == 200 ? 1 : 0;
        }
        HorseRaceStat horseRaceStat2 = this.f29659a.f29653a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        h hVar = this.f29659a;
        horseRaceStat2.reqTime = (jCurrentTimeMillis - hVar.f29654b) + hVar.f29653a.connTime;
        synchronized (this.f29659a.f29653a) {
            this.f29659a.f29653a.notify();
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        this.f29659a.f29653a.reqErrorCode = i10;
    }
}
