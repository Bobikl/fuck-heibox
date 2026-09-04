package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.k2;
import androidx.room.t1;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.SystemIdInfo;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkDatabase.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.room.i(autoMigrations = {@androidx.room.e(from = 13, to = 14), @androidx.room.e(from = 14, spec = b.class, to = 15)}, entities = {androidx.work.impl.model.a.class, androidx.work.impl.model.u.class, androidx.work.impl.model.y.class, SystemIdInfo.class, androidx.work.impl.model.n.class, androidx.work.impl.model.q.class, Preference.class}, version = 16)
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0016"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/RoomDatabase;", "Landroidx/work/impl/model/v;", "X", "Landroidx/work/impl/model/b;", "R", "Landroidx/work/impl/model/z;", "Y", "Landroidx/work/impl/model/j;", "U", "Landroidx/work/impl/model/o;", androidx.exifinterface.media.a.X4, "Landroidx/work/impl/model/r;", androidx.exifinterface.media.a.T4, "Landroidx/work/impl/model/e;", androidx.exifinterface.media.a.R4, "Landroidx/work/impl/model/g;", androidx.exifinterface.media.a.f23244d5, "<init>", "()V", "q", ak.av, "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@k2({androidx.work.e.class, androidx.work.impl.model.b0.class})
public abstract class WorkDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: WorkDatabase.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Landroidx/work/impl/WorkDatabase$a;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Ljava/util/concurrent/Executor;", "queryExecutor", "", "useTestDatabase", "Landroidx/work/impl/WorkDatabase;", "b", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j3.h c(Context context, j3.h.b configuration) {
            kotlin.jvm.internal.f0.p(context, "$context");
            kotlin.jvm.internal.f0.p(configuration, "configuration");
            j3.h.b.a aVarA = j3.h.b.f124214f.a(context);
            aVarA.d(configuration.f124216b).c(configuration.f124217c).e(true).a(true);
            return new androidx.sqlite.db.framework.e().a(aVarA.b());
        }

        @dl.d
        @xh.m
        public final WorkDatabase b(@dl.d final Context context, @dl.d Executor queryExecutor, boolean useTestDatabase) {
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(queryExecutor, "queryExecutor");
            return (WorkDatabase) (useTestDatabase ? t1.c(context, WorkDatabase.class).e() : t1.a(context, WorkDatabase.class, c0.f28922b).q(new j3.h.c() { // from class: androidx.work.impl.y
                @Override // j3.h.c
                public final j3.h a(j3.h.b bVar) {
                    return WorkDatabase.Companion.c(context, bVar);
                }
            })).v(queryExecutor).b(c.f28920a).c(i.f29031c).c(new s(context, 2, 3)).c(j.f29032c).c(k.f29040c).c(new s(context, 5, 6)).c(l.f29044c).c(m.f29050c).c(n.f29197c).c(new h0(context)).c(new s(context, 10, 11)).c(f.f28967c).c(g.f29006c).c(h.f29029c).n().f();
        }
    }

    @dl.d
    @xh.m
    public static final WorkDatabase Q(@dl.d Context context, @dl.d Executor executor, boolean z10) {
        return INSTANCE.b(context, executor, z10);
    }

    @dl.d
    public abstract androidx.work.impl.model.b R();

    @dl.d
    public abstract androidx.work.impl.model.e S();

    @dl.d
    public abstract androidx.work.impl.model.g T();

    @dl.d
    public abstract androidx.work.impl.model.j U();

    @dl.d
    public abstract androidx.work.impl.model.o V();

    @dl.d
    public abstract androidx.work.impl.model.r W();

    @dl.d
    public abstract androidx.work.impl.model.v X();

    @dl.d
    public abstract androidx.work.impl.model.z Y();
}
