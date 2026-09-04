package k;

import com.tencent.msdk.dns.core.IStatisticsMerge;
import java.nio.channels.Selector;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import k.g.a;

/* JADX INFO: compiled from: LookupContext.java */
/* JADX INFO: loaded from: classes.dex */
public final class k<LookupExtra extends g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m<LookupExtra> f124382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f124383b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f124384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IStatisticsMerge f124385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f124386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CountDownLatch f124387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Selector f124388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Set<g> f124389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<g.b> f124390i;

    public k(m<LookupExtra> mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("lookupParams".concat(" can not be null"));
        }
        this.f124382a = mVar;
    }

    public int a() {
        return this.f124382a.f124405m;
    }

    public k<LookupExtra> b(int i10) {
        if (b.a.x(i10)) {
            throw new IllegalArgumentException("curNetStack".concat(" is invalid"));
        }
        this.f124383b = i10;
        return this;
    }

    public k<LookupExtra> c(IStatisticsMerge iStatisticsMerge) {
        if (iStatisticsMerge == null) {
            throw new IllegalArgumentException("statMerge".concat(" can not be null"));
        }
        this.f124385d = iStatisticsMerge;
        return this;
    }

    public k<LookupExtra> d(j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("sorter".concat(" can not be null"));
        }
        this.f124384c = jVar;
        return this;
    }

    public k<LookupExtra> e(m<LookupExtra> mVar) {
        k<LookupExtra> kVarC = new k(mVar).b(this.f124383b).d(this.f124384c).c(this.f124385d);
        d dVar = this.f124386e;
        if (dVar == null) {
            throw new IllegalArgumentException("transaction".concat(" can not be null"));
        }
        kVarC.f124386e = dVar;
        CountDownLatch countDownLatch = this.f124387f;
        if (countDownLatch == null) {
            throw new IllegalArgumentException("countDownLatch".concat(" can not be null"));
        }
        kVarC.f124387f = countDownLatch;
        kVarC.f124388g = this.f124388g;
        Set<g> set = this.f124389h;
        if (set == null) {
            throw new IllegalArgumentException("dnses".concat(" can not be null"));
        }
        kVarC.f124389h = set;
        List<g.b> list = this.f124390i;
        if (list == null) {
            throw new IllegalArgumentException(com.umeng.analytics.pro.d.f104707n.concat(" can not be null"));
        }
        kVarC.f124390i = list;
        return kVarC;
    }

    public int f() {
        if (b.a.x(this.f124383b)) {
            throw new IllegalStateException("mCurNetStack".concat(" is not initialized yet"));
        }
        return this.f124383b;
    }

    public String g() {
        return this.f124382a.f124396d;
    }

    public Set<g> h() {
        Set<g> set = this.f124389h;
        if (set != null) {
            return set;
        }
        throw new IllegalStateException("mDnses".concat(" is not initialized yet"));
    }

    public boolean i() {
        return this.f124382a.f124404l;
    }

    public String j() {
        return this.f124382a.f124394b;
    }

    public boolean k() {
        return this.f124382a.f124406n;
    }

    public Selector l() {
        return this.f124388g;
    }

    public List<g.b> m() {
        List<g.b> list = this.f124390i;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("mSessions".concat(" is not initialized yet"));
    }

    public j n() {
        j jVar = this.f124384c;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("mSorter".concat(" is not initialized yet"));
    }

    public IStatisticsMerge o() {
        IStatisticsMerge iStatisticsMerge = this.f124385d;
        if (iStatisticsMerge != null) {
            return iStatisticsMerge;
        }
        throw new IllegalStateException("mStatMerge".concat(" is not initialized yet"));
    }

    public d p() {
        d dVar = this.f124386e;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("mTransaction".concat(" is not initialized yet"));
    }

    public String toString() {
        return "LookupContext{mLookupParams=" + this.f124382a + ", mCurNetStack=" + this.f124383b + ", mSorter=" + this.f124384c + ", mStatMerge=" + this.f124385d + ", mTransaction=" + this.f124386e + ", mCountDownLatch=" + this.f124387f + ", mSelector=" + this.f124388g + ", mDnses=" + this.f124389h + ", mSessions=" + this.f124390i + '}';
    }
}
