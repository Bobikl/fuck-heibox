package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: StartStopToken.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/work/impl/w;", "", "Landroidx/work/impl/model/m;", "id", "Landroidx/work/impl/v;", "e", "b", "", "workSpecId", "", "d", "", ak.av, "Landroidx/work/impl/model/u;", "spec", "f", ak.aF, "Ljava/lang/Object;", "lock", "", "Ljava/util/Map;", "runs", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<WorkGenerationalId, v> runs = new LinkedHashMap();

    public final boolean a(@dl.d WorkGenerationalId id2) {
        boolean zContainsKey;
        kotlin.jvm.internal.f0.p(id2, "id");
        synchronized (this.lock) {
            zContainsKey = this.runs.containsKey(id2);
        }
        return zContainsKey;
    }

    @dl.e
    public final v b(@dl.d WorkGenerationalId id2) {
        v vVarRemove;
        kotlin.jvm.internal.f0.p(id2, "id");
        synchronized (this.lock) {
            vVarRemove = this.runs.remove(id2);
        }
        return vVarRemove;
    }

    @dl.e
    public final v c(@dl.d androidx.work.impl.model.u spec) {
        kotlin.jvm.internal.f0.p(spec, "spec");
        return b(androidx.work.impl.model.x.a(spec));
    }

    @dl.d
    public final List<v> d(@dl.d String workSpecId) {
        List<v> listQ5;
        kotlin.jvm.internal.f0.p(workSpecId, "workSpecId");
        synchronized (this.lock) {
            Map<WorkGenerationalId, v> map = this.runs;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<WorkGenerationalId, v> entry : map.entrySet()) {
                if (kotlin.jvm.internal.f0.g(entry.getKey().f(), workSpecId)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                this.runs.remove((WorkGenerationalId) it.next());
            }
            listQ5 = CollectionsKt___CollectionsKt.Q5(linkedHashMap.values());
        }
        return listQ5;
    }

    @dl.d
    public final v e(@dl.d WorkGenerationalId id2) {
        v vVar;
        kotlin.jvm.internal.f0.p(id2, "id");
        synchronized (this.lock) {
            Map<WorkGenerationalId, v> map = this.runs;
            v vVar2 = map.get(id2);
            if (vVar2 == null) {
                vVar2 = new v(id2);
                map.put(id2, vVar2);
            }
            vVar = vVar2;
        }
        return vVar;
    }

    @dl.d
    public final v f(@dl.d androidx.work.impl.model.u spec) {
        kotlin.jvm.internal.f0.p(spec, "spec");
        return e(androidx.work.impl.model.x.a(spec));
    }
}
