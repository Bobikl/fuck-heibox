package p3;

import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.model.u;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import o3.NetworkState;

/* JADX INFO: compiled from: ContraintControllers.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lp3/d;", "Lp3/c;", "Lo3/b;", "Landroidx/work/impl/model/u;", "workSpec", "", ak.aF, "value", "j", "Landroidx/work/impl/constraints/trackers/g;", "tracker", "<init>", "(Landroidx/work/impl/constraints/trackers/g;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class d extends c<NetworkState> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d androidx.work.impl.constraints.trackers.g<NetworkState> tracker) {
        super(tracker);
        f0.p(tracker, "tracker");
    }

    @Override // p3.c
    public boolean c(@dl.d u workSpec) {
        f0.p(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkType() == NetworkType.CONNECTED;
    }

    @Override // p3.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean d(@dl.d NetworkState value) {
        f0.p(value, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            if (!value.g() || !value.j()) {
                return true;
            }
        } else if (!value.g()) {
            return true;
        }
        return false;
    }
}
