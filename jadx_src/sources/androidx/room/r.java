package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: EntityDeletionOrUpdateAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H$J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u001d\u0010\u0012\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/room/r;", androidx.exifinterface.media.a.f23244d5, "Landroidx/room/SharedSQLiteStatement;", "", "e", "Lj3/l;", "statement", "entity", "Lkotlin/b2;", "i", "(Lj3/l;Ljava/lang/Object;)V", "", "j", "(Ljava/lang/Object;)I", "", "entities", "k", "", "l", "([Ljava/lang/Object;)I", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class r<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@dl.d RoomDatabase database) {
        super(database);
        kotlin.jvm.internal.f0.p(database, "database");
    }

    @Override // androidx.room.SharedSQLiteStatement
    @dl.d
    protected abstract String e();

    protected abstract void i(@dl.d j3.l statement, T entity);

    public final int j(T entity) {
        j3.l lVarB = b();
        try {
            i(lVarB, entity);
            return lVarB.y();
        } finally {
            h(lVarB);
        }
    }

    public final int k(@dl.d Iterable<? extends T> entities) {
        kotlin.jvm.internal.f0.p(entities, "entities");
        j3.l lVarB = b();
        int iY = 0;
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                i(lVarB, it.next());
                iY += lVarB.y();
            }
            h(lVarB);
            return iY;
        } catch (Throwable th2) {
            h(lVarB);
            throw th2;
        }
    }

    public final int l(@dl.d T[] entities) {
        kotlin.jvm.internal.f0.p(entities, "entities");
        j3.l lVarB = b();
        try {
            int iY = 0;
            for (T t10 : entities) {
                i(lVarB, t10);
                iY += lVarB.y();
            }
            h(lVarB);
            return iY;
        } catch (Throwable th2) {
            h(lVarB);
            throw th2;
        }
    }
}
