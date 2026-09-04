package v;

import android.content.Context;
import com.tencent.msdk.dns.core.IStatisticsMerge;
import com.tencent.msdk.dns.core.IStatisticsMerge.IFactory.AnonymousClass1.C09731;
import com.tencent.msdk.dns.core.stat.StatisticsMerge;
import com.umeng.analytics.pro.d;
import k.g;
import r.e;

/* JADX INFO: compiled from: StatisticsMergeFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements IStatisticsMerge.IFactory {
    @Override // com.tencent.msdk.dns.core.IStatisticsMerge.IFactory
    public <LookupExtraImplT extends g.a> IStatisticsMerge<LookupExtraImplT> a(Class<LookupExtraImplT> cls, Context context) {
        if (cls == null) {
            throw new IllegalArgumentException("klass".concat(" can not be null"));
        }
        if (context != null) {
            return e.class.equals(cls) ? new StatisticsMerge(context) : ((IStatisticsMerge.IFactory.AnonymousClass1) IStatisticsMerge.IFactory.f100952a).new C09731();
        }
        throw new IllegalArgumentException(d.R.concat(" can not be null"));
    }
}
