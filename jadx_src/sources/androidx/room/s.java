package androidx.room;

import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: EntityInsertionAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0016\u001a\u00020\u00152\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u001d\u0010\u0017\u001a\u00020\u00152\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¨\u0006%"}, d2 = {"Landroidx/room/s;", androidx.exifinterface.media.a.f23244d5, "Landroidx/room/SharedSQLiteStatement;", "Lj3/l;", "statement", "entity", "Lkotlin/b2;", "i", "(Lj3/l;Ljava/lang/Object;)V", "k", "(Ljava/lang/Object;)V", "", "entities", "l", "([Ljava/lang/Object;)V", "", "j", "", "m", "(Ljava/lang/Object;)J", "", "", "n", "o", "([Ljava/lang/Object;)[J", "p", "(Ljava/util/Collection;)[Ljava/lang/Long;", "q", "([Ljava/lang/Object;)[Ljava/lang/Long;", "", ak.aB, "([Ljava/lang/Object;)Ljava/util/List;", "r", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class s<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@dl.d RoomDatabase database) {
        super(database);
        kotlin.jvm.internal.f0.p(database, "database");
    }

    protected abstract void i(@dl.e j3.l statement, T entity);

    public final void j(@dl.d Iterable<? extends T> entities) {
        kotlin.jvm.internal.f0.p(entities, "entities");
        j3.l lVarB = b();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                i(lVarB, it.next());
                lVarB.k1();
            }
            h(lVarB);
        } catch (Throwable th2) {
            h(lVarB);
            throw th2;
        }
    }

    public final void k(T entity) {
        j3.l lVarB = b();
        try {
            i(lVarB, entity);
            lVarB.k1();
        } finally {
            h(lVarB);
        }
    }

    public final void l(@dl.d T[] entities) {
        kotlin.jvm.internal.f0.p(entities, "entities");
        j3.l lVarB = b();
        try {
            for (T t10 : entities) {
                i(lVarB, t10);
                lVarB.k1();
            }
            h(lVarB);
        } catch (Throwable th2) {
            h(lVarB);
            throw th2;
        }
    }

    public final long m(T entity) {
        j3.l lVarB = b();
        try {
            i(lVarB, entity);
            return lVarB.k1();
        } finally {
            h(lVarB);
        }
    }

    @dl.d
    public final long[] n(@dl.d Collection<? extends T> entities) {
        kotlin.jvm.internal.f0.p(entities, "entities");
        j3.l lVarB = b();
        try {
            long[] jArr = new long[entities.size()];
            int i10 = 0;
            for (T t10 : entities) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.W();
                }
                i(lVarB, t10);
                jArr[i10] = lVarB.k1();
                i10 = i11;
            }
            return jArr;
        } finally {
            h(lVarB);
        }
    }

    @dl.d
    public final long[] o(@dl.d T[] entities) {
        kotlin.jvm.internal.f0.p(entities, "entities");
        j3.l lVarB = b();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1;
                i(lVarB, entities[i10]);
                jArr[i11] = lVarB.k1();
                i10++;
                i11 = i12;
            }
            h(lVarB);
            return jArr;
        } catch (Throwable th2) {
            h(lVarB);
            throw th2;
        }
    }

    @dl.d
    public final Long[] p(@dl.d Collection<? extends T> entities) {
        kotlin.jvm.internal.f0.p(entities, "entities");
        j3.l lVarB = b();
        Iterator<? extends T> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i10 = 0; i10 < size; i10++) {
                i(lVarB, it.next());
                lArr[i10] = Long.valueOf(lVarB.k1());
            }
            h(lVarB);
            return lArr;
        } catch (Throwable th2) {
            h(lVarB);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final Long[] q(@dl.d T[] entities) {
        kotlin.jvm.internal.f0.p(entities, "entities");
        j3.l lVarB = b();
        Iterator itA = kotlin.jvm.internal.h.a(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i10 = 0; i10 < length; i10++) {
                i(lVarB, itA.next());
                lArr[i10] = Long.valueOf(lVarB.k1());
            }
            h(lVarB);
            return lArr;
        } catch (Throwable th2) {
            h(lVarB);
            throw th2;
        }
    }

    @dl.d
    public final List<Long> r(@dl.d Collection<? extends T> entities) {
        kotlin.jvm.internal.f0.p(entities, "entities");
        j3.l lVarB = b();
        try {
            List listI = kotlin.collections.s.i();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                i(lVarB, it.next());
                listI.add(Long.valueOf(lVarB.k1()));
            }
            return kotlin.collections.s.a(listI);
        } finally {
            h(lVarB);
        }
    }

    @dl.d
    public final List<Long> s(@dl.d T[] entities) {
        kotlin.jvm.internal.f0.p(entities, "entities");
        j3.l lVarB = b();
        try {
            List listI = kotlin.collections.s.i();
            for (T t10 : entities) {
                i(lVarB, t10);
                listI.add(Long.valueOf(lVarB.k1()));
            }
            return kotlin.collections.s.a(listI);
        } finally {
            h(lVarB);
        }
    }
}
