package p3;

import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.n;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import o3.NetworkState;

/* JADX INFO: compiled from: ContraintControllers.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lp3/e;", "Lp3/c;", "Lo3/b;", "Landroidx/work/impl/model/u;", "workSpec", "", ak.aF, "value", "j", "Landroidx/work/impl/constraints/trackers/g;", "tracker", "<init>", "(Landroidx/work/impl/constraints/trackers/g;)V", ak.av, "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class e extends c<NetworkState> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f138146f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final String f138147g;

    /* JADX INFO: compiled from: ContraintControllers.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lp3/e$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    static {
        String strI = n.i("NetworkMeteredCtrlr");
        f0.o(strI, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f138147g = strI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d androidx.work.impl.constraints.trackers.g<NetworkState> tracker) {
        super(tracker);
        f0.p(tracker, "tracker");
    }

    @Override // p3.c
    public boolean c(@dl.d androidx.work.impl.model.u workSpec) {
        f0.p(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkType() == NetworkType.METERED;
    }

    @Override // p3.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean d(@dl.d NetworkState value) {
        f0.p(value, "value");
        if (Build.VERSION.SDK_INT < 26) {
            n.e().a(f138147g, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (value.g()) {
                return false;
            }
        } else if (value.g() && value.h()) {
            return false;
        }
        return true;
    }
}
