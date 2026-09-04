package androidx.sqlite.db.framework;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FrameworkSQLiteOpenHelperFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Landroidx/sqlite/db/framework/e;", "Lj3/h$c;", "Lj3/h$b;", "configuration", "Lj3/h;", ak.av, "<init>", "()V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
public final class e implements j3.h.c {
    @Override // j3.h.c
    @dl.d
    public j3.h a(@dl.d j3.h.b configuration) {
        f0.p(configuration, "configuration");
        return new FrameworkSQLiteOpenHelper(configuration.f124215a, configuration.f124216b, configuration.f124217c, configuration.f124218d, configuration.f124219e);
    }
}
