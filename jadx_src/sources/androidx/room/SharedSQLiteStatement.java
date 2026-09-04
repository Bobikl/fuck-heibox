package androidx.room;

import androidx.annotation.RestrictTo;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: SharedSQLiteStatement.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H$J\b\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/room/SharedSQLiteStatement;", "", "Lj3/l;", "d", "", "canUseCached", "g", "", "e", "Lkotlin/b2;", ak.aF, "b", "statement", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/room/RoomDatabase;", ak.av, "Landroidx/room/RoomDatabase;", "database", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Lkotlin/z;", "f", "()Lj3/l;", "stmt", "<init>", "(Landroidx/room/RoomDatabase;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class SharedSQLiteStatement {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RoomDatabase database;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AtomicBoolean lock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.z stmt;

    public SharedSQLiteStatement(@dl.d RoomDatabase database) {
        kotlin.jvm.internal.f0.p(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt = kotlin.b0.c(new yh.a<j3.l>() { // from class: androidx.room.SharedSQLiteStatement$stmt$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j3.l invoke() {
                return this.f27023b.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j3.l d() {
        return this.database.h(e());
    }

    private final j3.l f() {
        return (j3.l) this.stmt.getValue();
    }

    private final j3.l g(boolean canUseCached) {
        return canUseCached ? f() : d();
    }

    @dl.d
    public j3.l b() {
        c();
        return g(this.lock.compareAndSet(false, true));
    }

    protected void c() {
        this.database.c();
    }

    @dl.d
    protected abstract String e();

    public void h(@dl.d j3.l statement) {
        kotlin.jvm.internal.f0.p(statement, "statement");
        if (statement == f()) {
            this.lock.set(false);
        }
    }
}
