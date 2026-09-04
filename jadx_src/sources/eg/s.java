package eg;

import android.os.Build;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RequestBackgroundLocationPermission.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\r"}, d2 = {"Leg/s;", "Leg/a;", "Lkotlin/b2;", "request", "", "", "permissions", "b", "Leg/r;", "permissionBuilder", "<init>", "(Leg/r;)V", ak.av, "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class s extends eg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f118678e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final String f118679f = "android.permission.ACCESS_BACKGROUND_LOCATION";

    /* JADX INFO: compiled from: RequestBackgroundLocationPermission.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Leg/s$a;", "", "", "ACCESS_BACKGROUND_LOCATION", "Ljava/lang/String;", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@dl.d r permissionBuilder) {
        super(permissionBuilder);
        f0.p(permissionBuilder, "permissionBuilder");
    }

    @Override // eg.b
    public void b(@dl.d List<String> permissions) {
        f0.p(permissions, "permissions");
        this.f118617a.r(this);
    }

    @Override // eg.b
    public void request() {
        if (this.f118617a.A()) {
            if (Build.VERSION.SDK_INT < 29) {
                this.f118617a.f118665h.remove(f118679f);
                this.f118617a.f118668k.add(f118679f);
            }
            if (bg.c.c(this.f118617a.h(), f118679f)) {
                finish();
                return;
            }
            boolean zC = bg.c.c(this.f118617a.h(), "android.permission.ACCESS_FINE_LOCATION");
            boolean zC2 = bg.c.c(this.f118617a.h(), "android.permission.ACCESS_COARSE_LOCATION");
            if (zC || zC2) {
                r rVar = this.f118617a;
                if (rVar.f118675r == null && rVar.f118676s == null) {
                    b(CollectionsKt__CollectionsKt.E());
                    return;
                }
                List<String> listP = CollectionsKt__CollectionsKt.P(f118679f);
                r rVar2 = this.f118617a;
                cg.b bVar = rVar2.f118676s;
                if (bVar != null) {
                    f0.m(bVar);
                    bVar.a(getF118619c(), listP, true);
                    return;
                } else {
                    cg.a aVar = rVar2.f118675r;
                    f0.m(aVar);
                    aVar.a(getF118619c(), listP);
                    return;
                }
            }
        }
        finish();
    }
}
