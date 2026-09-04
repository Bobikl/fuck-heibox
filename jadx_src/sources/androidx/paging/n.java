package androidx.paging;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: InvalidatingPagingSourceFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u000b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B!\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002J\u0006\u0010\b\u001a\u00020\u0007R2\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\t8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/paging/n;", "", "Key", "Value", "Lkotlin/Function0;", "Landroidx/paging/q0;", "d", "Lkotlin/b2;", ak.aF, "", "b", "Ljava/util/List;", ak.av, "()Ljava/util/List;", "getPagingSources$paging_common$annotations", "()V", "pagingSources", "pagingSourceFactory", "<init>", "(Lyh/a;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class n<Key, Value> implements yh.a<q0<Key, Value>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<q0<Key, Value>> pagingSources;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yh.a<q0<Key, Value>> f26572c;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@dl.d yh.a<? extends q0<Key, Value>> pagingSourceFactory) {
        kotlin.jvm.internal.f0.p(pagingSourceFactory, "pagingSourceFactory");
        this.f26572c = pagingSourceFactory;
        this.pagingSources = new ArrayList();
    }

    @androidx.annotation.j1
    public static /* synthetic */ void b() {
    }

    @dl.d
    public final List<q0<Key, Value>> a() {
        return this.pagingSources;
    }

    public final void c() {
        while (!this.pagingSources.isEmpty()) {
            q0 q0Var = (q0) kotlin.collections.x.J0(this.pagingSources);
            if (!q0Var.a()) {
                q0Var.g();
            }
        }
    }

    @Override // yh.a
    @dl.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public q0<Key, Value> invoke() {
        q0<Key, Value> q0VarInvoke = this.f26572c.invoke();
        this.pagingSources.add(q0VarInvoke);
        return q0VarInvoke;
    }
}
