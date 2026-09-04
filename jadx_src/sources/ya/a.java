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

/* JADX INFO: compiled from: CoverageClassDataBaseManager.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final C1281a f141620b = new C1281a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final String f141621c = "CoverageClassDataBaseManager";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private static a f141622d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private ClassNameDataBase f141623a;

    /* JADX INFO: renamed from: ya.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CoverageClassDataBaseManager.kt */
    public static final class C1281a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private C1281a() {
        }

        public /* synthetic */ C1281a(u uVar) {
            this();
        }

        @d
        public final synchronized a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.qq, new Class[0], a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            if (a.f141622d == null) {
                a.f141622d = new a();
            }
            a aVar = a.f141622d;
            f0.m(aVar);
            return aVar;
        }
    }

    @d
    public final com.max.hbcoco.room.dao.a c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.pq, new Class[0], com.max.hbcoco.room.dao.a.class);
        return patchProxyResultProxy.isSupported ? (com.max.hbcoco.room.dao.a) patchProxyResultProxy.result : d().Q();
    }

    @d
    public final synchronized ClassNameDataBase d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.oq, new Class[0], ClassNameDataBase.class);
        if (patchProxyResultProxy.isSupported) {
            return (ClassNameDataBase) patchProxyResultProxy.result;
        }
        if (this.f141623a == null) {
            BaseApplication baseApplicationA = BaseApplication.a();
            f0.o(baseApplicationA, "getInstance(...)");
            this.f141623a = (ClassNameDataBase) t1.a(baseApplicationA, ClassNameDataBase.class, f141621c).f();
        }
        ClassNameDataBase classNameDataBase = this.f141623a;
        f0.m(classNameDataBase);
        return classNameDataBase;
    }
}
