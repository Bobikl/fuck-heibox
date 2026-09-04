package p3;

import androidx.work.impl.model.u;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ContraintControllers.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lp3/h;", "Lp3/c;", "", "Landroidx/work/impl/model/u;", "workSpec", ak.aF, "value", "j", "Landroidx/work/impl/constraints/trackers/g;", "tracker", "<init>", "(Landroidx/work/impl/constraints/trackers/g;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class h extends c<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@dl.d androidx.work.impl.constraints.trackers.g<Boolean> tracker) {
        super(tracker);
        f0.p(tracker, "tracker");
    }

    @Override // p3.c
    public boolean c(@dl.d u workSpec) {
        f0.p(workSpec, "workSpec");
        return workSpec.constraints.getRequiresStorageNotLow();
    }

    @Override // p3.c
    public /* bridge */ /* synthetic */ boolean d(Boolean bool) {
        return j(bool.booleanValue());
    }

    public boolean j(boolean value) {
        return !value;
    }
}
