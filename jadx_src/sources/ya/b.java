package ya;

import androidx.room.t1;
import bb.c;
import com.max.hbcoco.room.database.ClassNameDataBase;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ReportCoverageClassDataBaseManager.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final a f141624b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final String f141625c = "ReportCoverageClassDataBaseManager";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private static b f141626d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private ClassNameDataBase f141627a;

    /* JADX INFO: compiled from: ReportCoverageClassDataBaseManager.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @d
        public final synchronized b a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.tq, new Class[0], b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            if (b.f141626d == null) {
                b.f141626d = new b();
            }
            b bVar = b.f141626d;
            f0.m(bVar);
            return bVar;
        }
    }

    @d
    public final com.max.hbcoco.room.dao.a c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.sq, new Class[0], com.max.hbcoco.room.dao.a.class);
        return patchProxyResultProxy.isSupported ? (com.max.hbcoco.room.dao.a) patchProxyResultProxy.result : d().Q();
    }

    @d
    public final synchronized ClassNameDataBase d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.rq, new Class[0], ClassNameDataBase.class);
        if (patchProxyResultProxy.isSupported) {
            return (ClassNameDataBase) patchProxyResultProxy.result;
        }
        if (this.f141627a == null) {
            BaseApplication baseApplicationA = BaseApplication.a();
            f0.o(baseApplicationA, "getInstance(...)");
            this.f141627a = (ClassNameDataBase) t1.a(baseApplicationA, ClassNameDataBase.class, f141625c).f();
        }
        ClassNameDataBase classNameDataBase = this.f141627a;
        f0.m(classNameDataBase);
        return classNameDataBase;
    }
}
