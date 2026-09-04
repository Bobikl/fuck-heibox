package androidx.compose.runtime.snapshots;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J4\u0010\t\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0010\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "Landroidx/compose/runtime/snapshots/b;", "Lkotlin/Function1;", "", "Lkotlin/b2;", "readObserver", "Landroidx/compose/runtime/snapshots/f;", androidx.exifinterface.media.a.W4, "writeObserver", "X", ak.aB, "()V", "snapshot", "", "c0", "(Landroidx/compose/runtime/snapshots/f;)Ljava/lang/Void;", "b0", "Landroidx/compose/runtime/snapshots/g;", "J", "d", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class GlobalSnapshot extends b {
    public GlobalSnapshot(int i10, @dl.d SnapshotIdSet invalid) {
        yh.l<Object, b2> lVar;
        kotlin.jvm.internal.f0.p(invalid, "invalid");
        synchronized (SnapshotKt.D()) {
            final List listT5 = SnapshotKt.f13173i.isEmpty() ^ true ? CollectionsKt___CollectionsKt.T5(SnapshotKt.f13173i) : null;
            if (listT5 != null) {
                lVar = (yh.l) CollectionsKt___CollectionsKt.f5(listT5);
                if (lVar == null) {
                    lVar = new yh.l<Object, b2>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                            invoke2(obj);
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@dl.d Object state) {
                            kotlin.jvm.internal.f0.p(state, "state");
                            List<yh.l<Object, b2>> list = listT5;
                            int size = list.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                list.get(i11).invoke(state);
                            }
                        }
                    };
                }
            } else {
                lVar = null;
            }
        }
        super(i10, invalid, null, lVar);
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    @dl.d
    public f A(@dl.e final yh.l<Object, b2> lVar) {
        return SnapshotKt.Y(new yh.l<SnapshotIdSet, e>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedSnapshot$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e invoke(@dl.d SnapshotIdSet invalid) {
                int i10;
                kotlin.jvm.internal.f0.p(invalid, "invalid");
                synchronized (SnapshotKt.D()) {
                    i10 = SnapshotKt.f13170f;
                    SnapshotKt.f13170f = i10 + 1;
                }
                return new e(i10, invalid, lVar);
            }
        });
    }

    @Override // androidx.compose.runtime.snapshots.b
    @dl.d
    public g J() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // androidx.compose.runtime.snapshots.b
    @dl.d
    public b X(@dl.e final yh.l<Object, b2> lVar, @dl.e final yh.l<Object, b2> lVar2) {
        return (b) SnapshotKt.Y(new yh.l<SnapshotIdSet, b>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedMutableSnapshot$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b invoke(@dl.d SnapshotIdSet invalid) {
                int i10;
                kotlin.jvm.internal.f0.p(invalid, "invalid");
                synchronized (SnapshotKt.D()) {
                    i10 = SnapshotKt.f13170f;
                    SnapshotKt.f13170f = i10 + 1;
                }
                return new b(i10, invalid, lVar, lVar2);
            }
        });
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    @dl.d
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public Void q(@dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    @dl.d
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public Void r(@dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public void d() {
        synchronized (SnapshotKt.D()) {
            u();
            b2 b2Var = b2.f124493a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public void s() {
        SnapshotKt.x();
    }
}
