package androidx.room;

import androidx.lifecycle.LiveData;
import com.umeng.analytics.pro.ak;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;

/* JADX INFO: compiled from: InvalidationLiveDataContainer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\nJ\u0012\u0010\u0010\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\nR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R$\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/room/d0;", "", androidx.exifinterface.media.a.f23244d5, "", "", "tableNames", "", com.tekartik.sqflite.b.f98597p, "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", ak.av, "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "liveData", "Lkotlin/b2;", ak.aF, "d", "Landroidx/room/RoomDatabase;", "Landroidx/room/RoomDatabase;", "database", "", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "liveDataSet", "<init>", "(Landroidx/room/RoomDatabase;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RoomDatabase database;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Set<LiveData<?>> liveDataSet;

    public d0(@dl.d RoomDatabase database) {
        kotlin.jvm.internal.f0.p(database, "database");
        this.database = database;
        Set<LiveData<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        kotlin.jvm.internal.f0.o(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.liveDataSet = setNewSetFromMap;
    }

    @dl.d
    public final <T> LiveData<T> a(@dl.d String[] tableNames, boolean inTransaction, @dl.d Callable<T> computeFunction) {
        kotlin.jvm.internal.f0.p(tableNames, "tableNames");
        kotlin.jvm.internal.f0.p(computeFunction, "computeFunction");
        return new z1(this.database, this, inTransaction, computeFunction, tableNames);
    }

    @dl.d
    public final Set<LiveData<?>> b() {
        return this.liveDataSet;
    }

    public final void c(@dl.d LiveData<?> liveData) {
        kotlin.jvm.internal.f0.p(liveData, "liveData");
        this.liveDataSet.add(liveData);
    }

    public final void d(@dl.d LiveData<?> liveData) {
        kotlin.jvm.internal.f0.p(liveData, "liveData");
        this.liveDataSet.remove(liveData);
    }
}
