package com.tencent.msdk.dns.core.local;

import android.text.TextUtils;
import com.tencent.msdk.dns.core.LookupResult;
import com.tencent.msdk.dns.core.stat.AbsStatistics;
import com.xiaomi.mipush.sdk.Constants;
import f.b;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import k.a;
import k.e;
import k.g;
import k.k;
import k.m;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalDns implements g<g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f100953a = new e("Local", 3);

    public static class Statistics extends AbsStatistics {
        public static final Statistics NOT_LOOKUP = new Statistics();

        @Override // com.tencent.msdk.dns.core.stat.AbsStatistics, k.g.c
        public boolean lookupPartCached() {
            return false;
        }

        public String toString() {
            return "Statistics{ips=" + Arrays.toString(this.ips) + ", costTimeMills=" + this.costTimeMills + '}';
        }
    }

    @Override // k.g
    public LookupResult a(m mVar) {
        String[] strArr;
        if (mVar == null) {
            throw new IllegalArgumentException("lookupParams".concat(" can not be null"));
        }
        Statistics statistics = new Statistics();
        statistics.startLookup();
        String str = mVar.f124407o;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("hostname".concat(" can not be empty"));
        }
        String[] strArr2 = a.f124360a;
        String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (strArrSplit.length > 1) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : strArrSplit) {
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str2);
                    String[] strArr3 = new String[allByName.length];
                    for (InetAddress inetAddress : allByName) {
                        arrayList.add(str2 + ":" + inetAddress.getHostAddress());
                    }
                } catch (UnknownHostException e10) {
                    b.a(3, e10, "LocalDns lookup %s failed", str2);
                }
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            if (b.d(3)) {
                b.b("LocalDns lookup for %s result: %s", str, Arrays.toString(strArr));
            }
        } else {
            try {
                InetAddress[] allByName2 = InetAddress.getAllByName(str);
                strArr2 = new String[allByName2.length];
                for (int i10 = 0; i10 < allByName2.length; i10++) {
                    strArr2[i10] = allByName2[i10].getHostAddress();
                }
                if (b.d(3)) {
                    b.b("LocalDns lookup for %s result: %s", str, Arrays.toString(strArr2));
                }
            } catch (UnknownHostException e11) {
                b.a(3, e11, "LocalDns lookup %s failed", str);
            }
            strArr = strArr2;
        }
        statistics.endLookup();
        statistics.ips = strArr;
        return new LookupResult(b.a.s(strArr, mVar), statistics);
    }

    @Override // k.g
    public e a() {
        return this.f100953a;
    }

    @Override // k.g
    public g.b a(k kVar) {
        return null;
    }

    @Override // k.g
    public LookupResult b(m mVar) {
        Statistics statistics = new Statistics();
        statistics.startLookup();
        statistics.endLookup();
        return new LookupResult(statistics.ips, statistics);
    }
}
