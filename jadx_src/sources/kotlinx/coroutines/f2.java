package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/f2;", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/b0;", "", "F1", ak.av, "", "exception", "i", ak.aF, "Z", "P0", "()Z", "handlesException", "Q0", "onCancelComplete", "Lkotlinx/coroutines/d2;", "parent", "<init>", "(Lkotlinx/coroutines/d2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class f2 extends JobSupport implements b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean handlesException;

    public f2(@dl.e d2 d2Var) {
        super(true);
        W0(d2Var);
        this.handlesException = F1();
    }

    private final boolean F1() {
        JobSupport jobSupportK0;
        v vVarS0 = S0();
        w wVar = vVarS0 instanceof w ? (w) vVarS0 : null;
        if (wVar != null && (jobSupportK0 = wVar.k0()) != null) {
            while (!jobSupportK0.getHandlesException()) {
                v vVarS1 = jobSupportK0.S0();
                w wVar2 = vVarS1 instanceof w ? (w) vVarS1 : null;
                if (wVar2 == null || (jobSupportK0 = wVar2.k0()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: P0, reason: from getter */
    public boolean getHandlesException() {
        return this.handlesException;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean Q0() {
        return true;
    }

    @Override // kotlinx.coroutines.b0
    public boolean a() {
        return e1(kotlin.b2.f124493a);
    }

    @Override // kotlinx.coroutines.b0
    public boolean i(@dl.d Throwable exception) {
        return e1(new d0(exception, false, 2, null));
    }
}
