package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.runtime.SnapshotMutableStateImpl, reason: from toString */
/* JADX INFO: compiled from: SnapshotState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0015B\u001d\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0010H\u0096\u0002R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR*\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010%\u001a\u00028\u00008G¢\u0006\f\u0012\u0004\b$\u0010 \u001a\u0004\b\u0019\u0010\u000f¨\u0006("}, d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/snapshots/b0;", "Landroidx/compose/runtime/snapshots/r;", "Landroidx/compose/runtime/snapshots/c0;", "value", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "previous", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "applied", "j", "", "toString", "n", "()Ljava/lang/Object;", "Lkotlin/Function1;", "f", "Landroidx/compose/runtime/d2;", "b", "Landroidx/compose/runtime/d2;", ak.av, "()Landroidx/compose/runtime/d2;", ak.bo, "Landroidx/compose/runtime/SnapshotMutableStateImpl$a;", ak.aF, "Landroidx/compose/runtime/SnapshotMutableStateImpl$a;", "next", "getValue", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "l", "()Landroidx/compose/runtime/snapshots/c0;", "firstStateRecord", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/d2;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public class MutableState<T> implements androidx.compose.runtime.snapshots.b0, androidx.compose.runtime.snapshots.r<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d2<T> policy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private a<T> next;

    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotMutableStateImpl$a */
    /* JADX INFO: compiled from: SnapshotState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\"\u0010\u0003\u001a\u00028\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl$a;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/snapshots/c0;", "value", "Lkotlin/b2;", ak.av, "b", "d", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;)V", "myValue", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a<T> extends androidx.compose.runtime.snapshots.c0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private T value;

        public a(T t10) {
            this.value = t10;
        }

        @Override // androidx.compose.runtime.snapshots.c0
        public void a(@dl.d androidx.compose.runtime.snapshots.c0 value) {
            kotlin.jvm.internal.f0.p(value, "value");
            this.value = ((a) value).value;
        }

        @Override // androidx.compose.runtime.snapshots.c0
        @dl.d
        public androidx.compose.runtime.snapshots.c0 b() {
            return new a(this.value);
        }

        public final T g() {
            return this.value;
        }

        public final void h(T t10) {
            this.value = t10;
        }
    }

    public MutableState(T t10, @dl.d d2<T> policy) {
        kotlin.jvm.internal.f0.p(policy, "policy");
        this.policy = policy;
        this.next = new a<>(t10);
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void r() {
    }

    @Override // androidx.compose.runtime.snapshots.r
    @dl.d
    public d2<T> a() {
        return this.policy;
    }

    @xh.h(name = "getDebuggerDisplayValue")
    public final T c() {
        return (T) ((a) SnapshotKt.A(this.next)).g();
    }

    @Override // androidx.compose.runtime.a1
    @dl.d
    public yh.l<T, kotlin.b2> f() {
        return new yh.l<T, kotlin.b2>(this) { // from class: androidx.compose.runtime.SnapshotMutableStateImpl$component2$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MutableState<T> f12548b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f12548b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj) {
                invoke2(obj);
                return kotlin.b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t10) {
                this.f12548b.setValue(t10);
            }
        };
    }

    @Override // androidx.compose.runtime.a1, androidx.compose.runtime.m2
    public T getValue() {
        return (T) ((a) SnapshotKt.S(this.next, this)).g();
    }

    @Override // androidx.compose.runtime.snapshots.b0
    public void h(@dl.d androidx.compose.runtime.snapshots.c0 value) {
        kotlin.jvm.internal.f0.p(value, "value");
        this.next = (a) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.snapshots.b0
    @dl.e
    public androidx.compose.runtime.snapshots.c0 j(@dl.d androidx.compose.runtime.snapshots.c0 previous, @dl.d androidx.compose.runtime.snapshots.c0 current, @dl.d androidx.compose.runtime.snapshots.c0 applied) {
        kotlin.jvm.internal.f0.p(previous, "previous");
        kotlin.jvm.internal.f0.p(current, "current");
        kotlin.jvm.internal.f0.p(applied, "applied");
        a aVar = (a) previous;
        a aVar2 = (a) current;
        a aVar3 = (a) applied;
        if (a().a(aVar2.g(), aVar3.g())) {
            return current;
        }
        Object objB = a().b(aVar.g(), aVar2.g(), aVar3.g());
        if (objB == null) {
            return null;
        }
        androidx.compose.runtime.snapshots.c0 c0VarB = aVar3.b();
        kotlin.jvm.internal.f0.n(c0VarB, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda-2>");
        ((a) c0VarB).h(objB);
        return c0VarB;
    }

    @Override // androidx.compose.runtime.snapshots.b0
    @dl.d
    /* JADX INFO: renamed from: l */
    public androidx.compose.runtime.snapshots.c0 getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.a1
    public T n() {
        return getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.a1
    public void setValue(T t10) {
        androidx.compose.runtime.snapshots.f fVarB;
        a aVar = (a) SnapshotKt.A(this.next);
        if (a().a(aVar.g(), t10)) {
            return;
        }
        a<T> aVar2 = this.next;
        SnapshotKt.F();
        synchronized (SnapshotKt.D()) {
            fVarB = androidx.compose.runtime.snapshots.f.INSTANCE.b();
            ((a) SnapshotKt.P(aVar2, this, fVarB, aVar)).h(t10);
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
        SnapshotKt.M(fVarB, this);
    }

    @dl.d
    public String toString() {
        return "MutableState(value=" + ((a) SnapshotKt.A(this.next)).g() + ")@" + hashCode();
    }
}
