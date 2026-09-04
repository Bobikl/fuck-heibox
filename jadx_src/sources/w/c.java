package w;

import com.tencent.msdk.dns.core.LookupResult;
import com.tencent.msdk.dns.core.stat.StatisticsMerge;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CacheStatisticsReport.java */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Object[]> f140914a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f140915b = true;

    public static void a(LookupResult lookupResult) {
        String[] strArrSplit;
        if (lookupResult == null) {
            throw new IllegalArgumentException("lookupResult".concat(" can not be null"));
        }
        Statistics statistics = lookupResult.stat;
        if (!(statistics instanceof StatisticsMerge)) {
            f.b.g("lookupResult.stat is not instanceof StatisticsMerge", new Object[0]);
            return;
        }
        StatisticsMerge statisticsMerge = (StatisticsMerge) statistics;
        if (statisticsMerge.lookupPartCached()) {
            String[] strArrSplit2 = statisticsMerge.hostname.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            String[] strArrSplit3 = statisticsMerge.requestHostname.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            ArrayList arrayList = new ArrayList();
            List listAsList = Arrays.asList(strArrSplit3);
            for (String str : strArrSplit2) {
                if (!listAsList.contains(str)) {
                    arrayList.add(str);
                }
            }
            strArrSplit = (String[]) arrayList.toArray(new String[arrayList.size()]);
        } else {
            strArrSplit = statisticsMerge.hostname.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        for (String str2 : strArrSplit) {
            Map<String, Object[]> map = f140914a;
            if (map.containsKey(str2)) {
                Object[] objArr = map.get(str2);
                if (!f140915b && objArr == null) {
                    throw new AssertionError();
                }
                objArr[0] = Integer.valueOf(((Integer) objArr[0]).intValue() + statisticsMerge.restDnsStat.costTimeMills);
                if (statisticsMerge.lookupSuccess()) {
                    objArr[2] = Integer.valueOf(((Integer) objArr[2]).intValue() + 1);
                } else {
                    objArr[1] = Integer.valueOf(((Integer) objArr[1]).intValue() + 1);
                }
                map.put(str2, objArr);
            } else if (statisticsMerge.lookupSuccess()) {
                map.put(str2, new Object[]{Integer.valueOf(statisticsMerge.restDnsStat.costTimeMills), 0, 1});
            } else {
                map.put(str2, new Object[]{Integer.valueOf(statisticsMerge.restDnsStat.costTimeMills), 1, 0});
            }
        }
    }
}
