package com.tencent.msdk.dns.core;

import android.content.Context;
import k.g;
import k.g.a;
import k.k;

/* JADX INFO: loaded from: classes4.dex */
public interface IStatisticsMerge<LookupExtra extends g.a> extends g.c {

    public interface IFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IFactory f100952a = new IFactory() { // from class: com.tencent.msdk.dns.core.IStatisticsMerge.IFactory.1

            /* JADX INFO: Add missing generic type declarations: [LookupExtraT] */
            /* JADX INFO: renamed from: com.tencent.msdk.dns.core.IStatisticsMerge$IFactory$1$1, reason: invalid class name and collision with other inner class name */
            public class C09731<LookupExtraT> implements IStatisticsMerge<LookupExtraT> {
                public C09731() {
                }

                @Override // com.tencent.msdk.dns.core.IStatisticsMerge, k.g.c
                public boolean lookupFailed() {
                    return false;
                }

                @Override // com.tencent.msdk.dns.core.IStatisticsMerge
                public boolean lookupNeedRetry() {
                    return false;
                }

                @Override // com.tencent.msdk.dns.core.IStatisticsMerge, k.g.c
                public boolean lookupPartCached() {
                    return false;
                }

                @Override // com.tencent.msdk.dns.core.IStatisticsMerge, k.g.c
                public boolean lookupSuccess() {
                    return false;
                }

                @Override // com.tencent.msdk.dns.core.IStatisticsMerge
                public void merge(g gVar, g.c cVar) {
                }

                @Override // com.tencent.msdk.dns.core.IStatisticsMerge
                public void statContext(k kVar) {
                }

                @Override // com.tencent.msdk.dns.core.IStatisticsMerge
                public void statResult(IpSet ipSet) {
                }

                @Override // com.tencent.msdk.dns.core.IStatisticsMerge
                public String toJsonResult() {
                    return "{\"v4_ips\":\"\",\"v4_ttl\":\"\",\"v4_client_ip\":\"\",\"v6_ips\":\"\",\"v6_ttl\":\"\",\"v6_client_ip\":\"\"}";
                }
            }

            @Override // com.tencent.msdk.dns.core.IStatisticsMerge.IFactory
            public <LookupExtraT extends g.a> IStatisticsMerge<LookupExtraT> a(Class<LookupExtraT> cls, Context context) {
                return new C09731();
            }
        };

        <LookupExtraT extends g.a> IStatisticsMerge<LookupExtraT> a(Class<LookupExtraT> cls, Context context);
    }

    @Override // k.g.c
    /* synthetic */ boolean lookupFailed();

    /* synthetic */ boolean lookupNeedRetry();

    @Override // k.g.c
    /* synthetic */ boolean lookupPartCached();

    @Override // k.g.c
    /* synthetic */ boolean lookupSuccess();

    <StatisticsT extends g.c> void merge(g gVar, StatisticsT statisticst);

    void statContext(k<LookupExtra> kVar);

    void statResult(IpSet ipSet);

    String toJsonResult();
}
