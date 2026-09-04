package androidx.work.impl.model;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.work.impl.model.m, reason: from toString */
/* JADX INFO: compiled from: WorkSpec.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/work/impl/model/m;", "", "", ak.av, "", "b", "workSpecId", "generation", ak.aF, "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "I", "e", "()I", "<init>", "(Ljava/lang/String;I)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class WorkGenerationalId {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final String workSpecId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int generation;

    public WorkGenerationalId(@dl.d String workSpecId, int i10) {
        f0.p(workSpecId, "workSpecId");
        this.workSpecId = workSpecId;
        this.generation = i10;
    }

    public static /* synthetic */ WorkGenerationalId d(WorkGenerationalId workGenerationalId, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = workGenerationalId.workSpecId;
        }
        if ((i11 & 2) != 0) {
            i10 = workGenerationalId.generation;
        }
        return workGenerationalId.c(str, i10);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getWorkSpecId() {
        return this.workSpecId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    @dl.d
    public final WorkGenerationalId c(@dl.d String workSpecId, int generation) {
        f0.p(workSpecId, "workSpecId");
        return new WorkGenerationalId(workSpecId, generation);
    }

    public final int e() {
        return this.generation;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkGenerationalId)) {
            return false;
        }
        WorkGenerationalId workGenerationalId = (WorkGenerationalId) other;
        return f0.g(this.workSpecId, workGenerationalId.workSpecId) && this.generation == workGenerationalId.generation;
    }

    @dl.d
    public final String f() {
        return this.workSpecId;
    }

    public int hashCode() {
        return (this.workSpecId.hashCode() * 31) + this.generation;
    }

    @dl.d
    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.workSpecId + ", generation=" + this.generation + ')';
    }
}
