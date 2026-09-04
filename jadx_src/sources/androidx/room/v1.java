package androidx.room;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: RoomOpenHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u0000 \u00052\u00020\u0001:\u0003\u001d\b\u001eB'\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017¨\u0006\u001f"}, d2 = {"Landroidx/room/v1;", "Lj3/h$a;", "Lj3/g;", "db", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "j", "i", "b", "d", "", "oldVersion", "newVersion", "g", "e", "f", "Landroidx/room/j;", "Landroidx/room/j;", "configuration", "Landroidx/room/v1$b;", "Landroidx/room/v1$b;", "delegate", "", "Ljava/lang/String;", "identityHash", "legacyHash", "<init>", "(Landroidx/room/j;Landroidx/room/v1$b;Ljava/lang/String;Ljava/lang/String;)V", "(Landroidx/room/j;Landroidx/room/v1$b;Ljava/lang/String;)V", ak.av, ak.aF, "room-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class v1 extends j3.h.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private j configuration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b delegate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String identityHash;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String legacyHash;

    /* JADX INFO: renamed from: androidx.room.v1$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: RoomOpenHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/room/v1$a;", "", "Lj3/g;", "db", "", "b", "(Lj3/g;)Z", ak.av, "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final boolean a(@dl.d j3.g db2) {
            kotlin.jvm.internal.f0.p(db2, "db");
            Cursor cursorD1 = db2.D1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z10 = false;
                if (cursorD1.moveToFirst() && cursorD1.getInt(0) == 0) {
                    z10 = true;
                }
                kotlin.io.b.a(cursorD1, null);
                return z10;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.b.a(cursorD1, th2);
                    throw th3;
                }
            }
        }

        public final boolean b(@dl.d j3.g db2) {
            kotlin.jvm.internal.f0.p(db2, "db");
            Cursor cursorD1 = db2.D1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z10 = false;
                if (cursorD1.moveToFirst() && cursorD1.getInt(0) != 0) {
                    z10 = true;
                }
                kotlin.io.b.a(cursorD1, null);
                return z10;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.b.a(cursorD1, th2);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: compiled from: RoomOpenHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0015J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/room/v1$b;", "", "Lj3/g;", "database", "Lkotlin/b2;", "b", ak.av, "d", ak.aF, "db", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/room/v1$c;", "g", "f", "e", "", "I", "version", "<init>", "(I)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int version;

        public b(int i10) {
            this.version = i10;
        }

        public abstract void a(@dl.d j3.g gVar);

        public abstract void b(@dl.d j3.g gVar);

        public abstract void c(@dl.d j3.g gVar);

        public abstract void d(@dl.d j3.g gVar);

        public void e(@dl.d j3.g database) {
            kotlin.jvm.internal.f0.p(database, "database");
        }

        public void f(@dl.d j3.g database) {
            kotlin.jvm.internal.f0.p(database, "database");
        }

        @dl.d
        public c g(@dl.d j3.g db2) {
            kotlin.jvm.internal.f0.p(db2, "db");
            h(db2);
            return new c(true, null);
        }

        @kotlin.k(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
        protected void h(@dl.d j3.g db2) {
            kotlin.jvm.internal.f0.p(db2, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* JADX INFO: compiled from: RoomOpenHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/room/v1$c;", "", "", ak.av, "Z", "isValid", "", "b", "Ljava/lang/String;", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final boolean isValid;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        @xh.e
        public final String expectedFoundMsg;

        public c(boolean z10, @dl.e String str) {
            this.isValid = z10;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v1(@dl.d j configuration, @dl.d b delegate, @dl.d String legacyHash) {
        this(configuration, delegate, "", legacyHash);
        kotlin.jvm.internal.f0.p(configuration, "configuration");
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        kotlin.jvm.internal.f0.p(legacyHash, "legacyHash");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(@dl.d j configuration, @dl.d b delegate, @dl.d String identityHash, @dl.d String legacyHash) {
        super(delegate.version);
        kotlin.jvm.internal.f0.p(configuration, "configuration");
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        kotlin.jvm.internal.f0.p(identityHash, "identityHash");
        kotlin.jvm.internal.f0.p(legacyHash, "legacyHash");
        this.configuration = configuration;
        this.delegate = delegate;
        this.identityHash = identityHash;
        this.legacyHash = legacyHash;
    }

    private final void h(j3.g gVar) {
        if (!INSTANCE.b(gVar)) {
            c cVarG = this.delegate.g(gVar);
            if (cVarG.isValid) {
                this.delegate.e(gVar);
                j(gVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.expectedFoundMsg);
            }
        }
        Cursor cursorU1 = gVar.u1(new j3.b(u1.READ_QUERY));
        try {
            String string = cursorU1.moveToFirst() ? cursorU1.getString(0) : null;
            kotlin.io.b.a(cursorU1, null);
            if (kotlin.jvm.internal.f0.g(this.identityHash, string) || kotlin.jvm.internal.f0.g(this.legacyHash, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + string);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(cursorU1, th2);
                throw th3;
            }
        }
    }

    private final void i(j3.g gVar) {
        gVar.y0(u1.CREATE_QUERY);
    }

    private final void j(j3.g gVar) {
        i(gVar);
        gVar.y0(u1.a(this.identityHash));
    }

    @Override // j3.h.a
    public void b(@dl.d j3.g db2) {
        kotlin.jvm.internal.f0.p(db2, "db");
        super.b(db2);
    }

    @Override // j3.h.a
    public void d(@dl.d j3.g db2) {
        kotlin.jvm.internal.f0.p(db2, "db");
        boolean zA = INSTANCE.a(db2);
        this.delegate.a(db2);
        if (!zA) {
            c cVarG = this.delegate.g(db2);
            if (!cVarG.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.expectedFoundMsg);
            }
        }
        j(db2);
        this.delegate.c(db2);
    }

    @Override // j3.h.a
    public void e(@dl.d j3.g db2, int i10, int i11) {
        kotlin.jvm.internal.f0.p(db2, "db");
        g(db2, i10, i11);
    }

    @Override // j3.h.a
    public void f(@dl.d j3.g db2) {
        kotlin.jvm.internal.f0.p(db2, "db");
        super.f(db2);
        h(db2);
        this.delegate.d(db2);
        this.configuration = null;
    }

    @Override // j3.h.a
    public void g(@dl.d j3.g db2, int i10, int i11) {
        List<f3.c> listE;
        kotlin.jvm.internal.f0.p(db2, "db");
        j jVar = this.configuration;
        boolean z10 = false;
        if (jVar != null && (listE = jVar.migrationContainer.e(i10, i11)) != null) {
            this.delegate.f(db2);
            Iterator<T> it = listE.iterator();
            while (it.hasNext()) {
                ((f3.c) it.next()).a(db2);
            }
            c cVarG = this.delegate.g(db2);
            if (!cVarG.isValid) {
                throw new IllegalStateException("Migration didn't properly handle: " + cVarG.expectedFoundMsg);
            }
            this.delegate.e(db2);
            j(db2);
            z10 = true;
        }
        if (z10) {
            return;
        }
        j jVar2 = this.configuration;
        if (jVar2 != null && !jVar2.a(i10, i11)) {
            this.delegate.b(db2);
            this.delegate.a(db2);
            return;
        }
        throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}
