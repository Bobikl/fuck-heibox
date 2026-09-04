package eg;

import android.provider.Settings;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RequestSystemAlertWindowPermission.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\f"}, d2 = {"Leg/x;", "Leg/a;", "Lkotlin/b2;", "request", "", "", "permissions", "b", "Leg/r;", "permissionBuilder", "<init>", "(Leg/r;)V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class x extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@dl.d r permissionBuilder) {
        super(permissionBuilder);
        f0.p(permissionBuilder, "permissionBuilder");
    }

    @Override // eg.b
    public void b(@dl.d List<String> permissions) {
        f0.p(permissions, "permissions");
        this.f118617a.v(this);
    }

    @Override // eg.b
    public void request() {
        if (!this.f118617a.D()) {
            finish();
            return;
        }
        if (this.f118617a.k() < 23) {
            this.f118617a.f118669l.add("android.permission.SYSTEM_ALERT_WINDOW");
            this.f118617a.f118665h.remove("android.permission.SYSTEM_ALERT_WINDOW");
            finish();
            return;
        }
        if (Settings.canDrawOverlays(this.f118617a.h())) {
            finish();
            return;
        }
        r rVar = this.f118617a;
        if (rVar.f118675r == null && rVar.f118676s == null) {
            finish();
            return;
        }
        List<String> listP = CollectionsKt__CollectionsKt.P("android.permission.SYSTEM_ALERT_WINDOW");
        r rVar2 = this.f118617a;
        cg.b bVar = rVar2.f118676s;
        if (bVar != null) {
            f0.m(bVar);
            bVar.a(getF118619c(), listP, true);
        } else {
            cg.a aVar = rVar2.f118675r;
            f0.m(aVar);
            aVar.a(getF118619c(), listP);
        }
    }
}
