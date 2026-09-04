package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import androidx.annotation.RestrictTo;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: EntityUpsertionAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000 \u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00052\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0017\u001a\u00020\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016J%\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$¨\u0006("}, d2 = {"Landroidx/room/t;", androidx.exifinterface.media.a.f23244d5, "", "Landroid/database/sqlite/SQLiteConstraintException;", "ex", "Lkotlin/b2;", ak.av, "entity", ak.aF, "(Ljava/lang/Object;)V", "", "entities", "d", "([Ljava/lang/Object;)V", "", "b", "", "e", "(Ljava/lang/Object;)J", "", "g", "([Ljava/lang/Object;)[J", "", "f", "", "k", "([Ljava/lang/Object;)Ljava/util/List;", "j", "i", "([Ljava/lang/Object;)[Ljava/lang/Long;", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/util/Collection;)[Ljava/lang/Long;", "Landroidx/room/s;", "Landroidx/room/s;", "insertionAdapter", "Landroidx/room/r;", "Landroidx/room/r;", "updateAdapter", "<init>", "(Landroidx/room/s;Landroidx/room/r;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final s<T> insertionAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final r<T> updateAdapter;

    public t(@dl.d s<T> insertionAdapter, @dl.d r<T> updateAdapter) {
        kotlin.jvm.internal.f0.p(insertionAdapter, "insertionAdapter");
        kotlin.jvm.internal.f0.p(updateAdapter, "updateAdapter");
        this.insertionAdapter = insertionAdapter;
        this.updateAdapter = updateAdapter;
    }

    private final void a(SQLiteConstraintException sQLiteConstraintException) {
        String message = sQLiteConstraintException.getMessage();
        if (message == null || !StringsKt__StringsKt.T2(message, "1555", true)) {
            throw sQLiteConstraintException;
        }
    }

    public final void b(@dl.d Iterable<? extends T> entities) {
        kotlin.jvm.internal.f0.p(entities, "entities");
        for (T t10 : entities) {
            try {
                this.insertionAdapter.k(t10);
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.updateAdapter.j(t10);
            }
        }
    }

    public final void c(T entity) {
        try {
            this.insertionAdapter.k(entity);
        } catch (SQLiteConstraintException e10) {
            a(e10);
            this.updateAdapter.j(entity);
        }
    }

    public final void d(@dl.d T[] entities) {
        kotlin.jvm.internal.f0.p(entities, "entities");
        for (T t10 : entities) {
            try {
                this.insertionAdapter.k(t10);
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.updateAdapter.j(t10);
            }
        }
    }

    public final long e(T entity) {
        try {
            return this.insertionAdapter.m(entity);
        } catch (SQLiteConstraintException e10) {
            a(e10);
            this.updateAdapter.j(entity);
            return -1L;
        }
    }

    @dl.d
    public final long[] f(@dl.d Collection<? extends T> entities) {
        long jM;
        kotlin.jvm.internal.f0.p(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            T next = it.next();
            try {
                jM = this.insertionAdapter.m(next);
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.updateAdapter.j(next);
                jM = -1;
            }
            jArr[i10] = jM;
        }
        return jArr;
    }

    @dl.d
    public final long[] g(@dl.d T[] entities) {
        long jM;
        kotlin.jvm.internal.f0.p(entities, "entities");
        int length = entities.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jM = this.insertionAdapter.m(entities[i10]);
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.updateAdapter.j(entities[i10]);
                jM = -1;
            }
            jArr[i10] = jM;
        }
        return jArr;
    }

    @dl.d
    public final Long[] h(@dl.d Collection<? extends T> entities) {
        long jM;
        kotlin.jvm.internal.f0.p(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        Long[] lArr = new Long[size];
        for (int i10 = 0; i10 < size; i10++) {
            T next = it.next();
            try {
                jM = this.insertionAdapter.m(next);
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.updateAdapter.j(next);
                jM = -1;
            }
            lArr[i10] = Long.valueOf(jM);
        }
        return lArr;
    }

    @dl.d
    public final Long[] i(@dl.d T[] entities) {
        long jM;
        kotlin.jvm.internal.f0.p(entities, "entities");
        int length = entities.length;
        Long[] lArr = new Long[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jM = this.insertionAdapter.m(entities[i10]);
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.updateAdapter.j(entities[i10]);
                jM = -1;
            }
            lArr[i10] = Long.valueOf(jM);
        }
        return lArr;
    }

    @dl.d
    public final List<Long> j(@dl.d Collection<? extends T> entities) {
        kotlin.jvm.internal.f0.p(entities, "entities");
        List listI = kotlin.collections.s.i();
        for (T t10 : entities) {
            try {
                listI.add(Long.valueOf(this.insertionAdapter.m(t10)));
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.updateAdapter.j(t10);
                listI.add(-1L);
            }
        }
        return kotlin.collections.s.a(listI);
    }

    @dl.d
    public final List<Long> k(@dl.d T[] entities) {
        kotlin.jvm.internal.f0.p(entities, "entities");
        List listI = kotlin.collections.s.i();
        for (T t10 : entities) {
            try {
                listI.add(Long.valueOf(this.insertionAdapter.m(t10)));
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.updateAdapter.j(t10);
                listI.add(-1L);
            }
        }
        return kotlin.collections.s.a(listI);
    }
}
