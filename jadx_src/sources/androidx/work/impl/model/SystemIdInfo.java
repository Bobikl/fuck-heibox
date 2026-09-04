package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.work.impl.model.i, reason: from toString */
/* JADX INFO: compiled from: SystemIdInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.room.q(foreignKeys = {@androidx.room.w(childColumns = {"work_spec_id"}, entity = u.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, primaryKeys = {"work_spec_id", "generation"})
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/work/impl/model/i;", "", "", ak.av, "", "b", ak.aF, "workSpecId", "generation", "systemId", "d", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "I", "f", "()I", "<init>", "(Ljava/lang/String;II)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final /* data */ class SystemIdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    @xh.e
    @androidx.room.f(name = "work_spec_id")
    public final String workSpecId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @androidx.room.f(defaultValue = "0")
    private final int generation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @xh.e
    @androidx.room.f(name = "system_id")
    public final int systemId;

    public SystemIdInfo(@dl.d String workSpecId, int i10, int i11) {
        f0.p(workSpecId, "workSpecId");
        this.workSpecId = workSpecId;
        this.generation = i10;
        this.systemId = i11;
    }

    public static /* synthetic */ SystemIdInfo e(SystemIdInfo systemIdInfo, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = systemIdInfo.workSpecId;
        }
        if ((i12 & 2) != 0) {
            i10 = systemIdInfo.generation;
        }
        if ((i12 & 4) != 0) {
            i11 = systemIdInfo.systemId;
        }
        return systemIdInfo.d(str, i10, i11);
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

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSystemId() {
        return this.systemId;
    }

    @dl.d
    public final SystemIdInfo d(@dl.d String workSpecId, int generation, int systemId) {
        f0.p(workSpecId, "workSpecId");
        return new SystemIdInfo(workSpecId, generation, systemId);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) other;
        return f0.g(this.workSpecId, systemIdInfo.workSpecId) && this.generation == systemIdInfo.generation && this.systemId == systemIdInfo.systemId;
    }

    public final int f() {
        return this.generation;
    }

    public int hashCode() {
        return (((this.workSpecId.hashCode() * 31) + this.generation) * 31) + this.systemId;
    }

    @dl.d
    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.workSpecId + ", generation=" + this.generation + ", systemId=" + this.systemId + ')';
    }
}
