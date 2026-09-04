package com.tencent.msdk.dns;

import com.tencent.msdk.dns.core.LookupResult;
import com.tencent.msdk.dns.core.stat.StatisticsMerge;

/* JADX INFO: loaded from: classes4.dex */
public interface ILookedUpListener {
    void onAsyncLookedUp(String str, LookupResult<StatisticsMerge> lookupResult);

    void onLookedUp(String str, LookupResult<StatisticsMerge> lookupResult);

    void onPreLookedUp(String str, LookupResult<StatisticsMerge> lookupResult);
}
