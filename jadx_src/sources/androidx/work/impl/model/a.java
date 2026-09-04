package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Index;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dependency.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.room.q(foreignKeys = {@androidx.room.w(childColumns = {"work_spec_id"}, entity = u.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @androidx.room.w(childColumns = {"prerequisite_id"}, entity = u.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"}), @Index({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/model/a;", "", "", ak.av, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "workSpecId", "prerequisiteId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @androidx.room.f(name = "work_spec_id")
    private final String workSpecId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @androidx.room.f(name = "prerequisite_id")
    private final String prerequisiteId;

    public a(@dl.d String workSpecId, @dl.d String prerequisiteId) {
        f0.p(workSpecId, "workSpecId");
        f0.p(prerequisiteId, "prerequisiteId");
        this.workSpecId = workSpecId;
        this.prerequisiteId = prerequisiteId;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPrerequisiteId() {
        return this.prerequisiteId;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
