package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.j2;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\b\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00020\u0004:\u0001*B\u0007¢\u0006\u0004\bL\u0010GJ;\u0010\n\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00052#\u0010\t\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0002\b\bH\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\f\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00052#\u0010\t\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0002\b\bH\u0082\b¢\u0006\u0004\b\f\u0010\u000bJ6\u0010\r\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00052\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u00020\u0006H\u0082\b¢\u0006\u0004\b\r\u0010\u000bJ5\u0010\u0010\u001a\u00020\u000f2*\u0010\t\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\u0006H\u0082\bJ\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J!\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010!\u001a\u00020\u000f2\u0014\u0010 \u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0016J\u0019\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010\u001aJ\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00028\u0001H\u0000¢\u0006\u0004\b#\u0010\u0017J3\u0010&\u001a\u00020\u00152\u001e\u0010%\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$\u0012\u0004\u0012\u00020\u00150\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b&\u0010'J3\u0010)\u001a\u00020\u00152\u001e\u0010%\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(\u0012\u0004\u0012\u00020\u00150\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b)\u0010'J3\u0010*\u001a\u00020\u00152\u001e\u0010%\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(\u0012\u0004\u0012\u00020\u00150\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b*\u0010'R$\u0010/\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00118\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b-\u0010.R,\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u00108\u001a\b\u0012\u0004\u0012\u00028\u0000008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R \u0010=\u001a\b\u0012\u0004\u0012\u00028\u0001098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020>8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@R&\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078@X\u0080\u0004¢\u0006\f\u0012\u0004\bF\u0010G\u001a\u0004\bD\u0010ER&\u0010K\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f8AX\u0080\u0004¢\u0006\f\u0012\u0004\bJ\u0010G\u001a\u0004\b1\u0010I\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006M"}, d2 = {"Landroidx/compose/runtime/snapshots/t;", "K", androidx.exifinterface.media.a.X4, "", "Landroidx/compose/runtime/snapshots/b0;", "R", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/t$a;", "Lkotlin/t;", "block", ak.aD, "(Lyh/l;)Ljava/lang/Object;", androidx.exifinterface.media.a.W4, "v", "Lu0/i;", "Lkotlin/b2;", "y", "Landroidx/compose/runtime/snapshots/c0;", "value", RXScreenCaptureService.KEY_HEIGHT, "key", "", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "remove", "x", "", "predicate", RXScreenCaptureService.KEY_WIDTH, "(Lyh/l;)Z", "", "b", ak.av, "<set-?>", "Landroidx/compose/runtime/snapshots/c0;", "l", "()Landroidx/compose/runtime/snapshots/c0;", "firstStateRecord", "", ak.aF, "Ljava/util/Set;", "e", "()Ljava/util/Set;", "entries", "d", "g", Constants.PARAM_KEYS, "", "Ljava/util/Collection;", ak.aG, "()Ljava/util/Collection;", "values", "", "r", "()I", UiKitSpanObj.TYPE_SIZE, "i", "modification", "n", "()Landroidx/compose/runtime/snapshots/t$a;", "getReadable$runtime_release$annotations", "()V", "readable", "()Ljava/util/Map;", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class t<K, V> implements Map<K, V>, b0, zh.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private c0 firstStateRecord = new a(u0.a.C());

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Set<Map.Entry<K, V>> entries = new n(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Set<K> keys = new o(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Collection<V> values = new q(this);

    /* JADX INFO: compiled from: SnapshotStateMap.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001d\b\u0000\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/snapshots/t$a;", "K", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/snapshots/c0;", "value", "Lkotlin/b2;", ak.av, "b", "", "e", "I", RXScreenCaptureService.KEY_HEIGHT, "()I", "j", "(I)V", "modification", "Lu0/i;", "map", "Lu0/i;", "g", "()Lu0/i;", "i", "(Lu0/i;)V", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a<K, V> extends c0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private u0.i<K, ? extends V> f13276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int modification;

        public a(@dl.d u0.i<K, ? extends V> map) {
            kotlin.jvm.internal.f0.p(map, "map");
            this.f13276d = map;
        }

        @Override // androidx.compose.runtime.snapshots.c0
        public void a(@dl.d c0 value) {
            kotlin.jvm.internal.f0.p(value, "value");
            a aVar = (a) value;
            synchronized (u.f13278a) {
                this.f13276d = aVar.f13276d;
                this.modification = aVar.modification;
                b2 b2Var = b2.f124493a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.c0
        @dl.d
        public c0 b() {
            return new a(this.f13276d);
        }

        @dl.d
        public final u0.i<K, V> g() {
            return this.f13276d;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void i(@dl.d u0.i<K, ? extends V> iVar) {
            kotlin.jvm.internal.f0.p(iVar, "<set-?>");
            this.f13276d = iVar;
        }

        public final void j(int i10) {
            this.modification = i10;
        }
    }

    private final <R> R A(yh.l<? super a<K, V>, ? extends R> block) {
        f fVarB;
        R rInvoke;
        c0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) firstStateRecord;
        SnapshotKt.F();
        synchronized (SnapshotKt.D()) {
            try {
                fVarB = f.INSTANCE.b();
                rInvoke = block.invoke(SnapshotKt.h0(aVar, this, fVarB));
                kotlin.jvm.internal.c0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.c0.d(1);
                kotlin.jvm.internal.c0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.c0.c(1);
        SnapshotKt.M(fVarB, this);
        return rInvoke;
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void p() {
    }

    private final <R> R v(yh.l<? super Map<K, V>, ? extends R> block) {
        u0.i<K, V> iVarG;
        int modification;
        R rInvoke;
        f fVarB;
        boolean z10;
        do {
            synchronized (u.f13278a) {
                try {
                    c0 firstStateRecord = getFirstStateRecord();
                    kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    a aVar = (a) SnapshotKt.A((a) firstStateRecord);
                    iVarG = aVar.g();
                    modification = aVar.getModification();
                    b2 b2Var = b2.f124493a;
                    kotlin.jvm.internal.c0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.c0.d(1);
                    kotlin.jvm.internal.c0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.c0.c(1);
            kotlin.jvm.internal.f0.m(iVarG);
            u0.i.a<K, V> aVarBuilder = iVarG.builder();
            rInvoke = block.invoke(aVarBuilder);
            u0.i<K, V> iVarBuild = aVarBuilder.build();
            if (kotlin.jvm.internal.f0.g(iVarBuild, iVarG)) {
                break;
            }
            synchronized (u.f13278a) {
                try {
                    c0 firstStateRecord2 = getFirstStateRecord();
                    kotlin.jvm.internal.f0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    a aVar2 = (a) firstStateRecord2;
                    SnapshotKt.F();
                    synchronized (SnapshotKt.D()) {
                        try {
                            fVarB = f.INSTANCE.b();
                            a aVar3 = (a) SnapshotKt.h0(aVar2, this, fVarB);
                            if (aVar3.getModification() == modification) {
                                aVar3.i(iVarBuild);
                                aVar3.j(aVar3.getModification() + 1);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            kotlin.jvm.internal.c0.d(1);
                        } catch (Throwable th3) {
                            kotlin.jvm.internal.c0.d(1);
                            kotlin.jvm.internal.c0.c(1);
                            throw th3;
                        }
                    }
                    kotlin.jvm.internal.c0.c(1);
                    SnapshotKt.M(fVarB, this);
                    kotlin.jvm.internal.c0.d(1);
                } catch (Throwable th4) {
                    kotlin.jvm.internal.c0.d(1);
                    kotlin.jvm.internal.c0.c(1);
                    throw th4;
                }
            }
            kotlin.jvm.internal.c0.c(1);
        } while (!z10);
        return rInvoke;
    }

    private final void y(yh.l<? super u0.i<K, ? extends V>, ? extends u0.i<K, ? extends V>> lVar) {
        f fVarB;
        c0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) SnapshotKt.A((a) firstStateRecord);
        u0.i<K, ? extends V> iVarInvoke = lVar.invoke(aVar.g());
        if (iVarInvoke != aVar.g()) {
            synchronized (u.f13278a) {
                try {
                    c0 firstStateRecord2 = getFirstStateRecord();
                    kotlin.jvm.internal.f0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    a aVar2 = (a) firstStateRecord2;
                    SnapshotKt.F();
                    synchronized (SnapshotKt.D()) {
                        try {
                            fVarB = f.INSTANCE.b();
                            a aVar3 = (a) SnapshotKt.h0(aVar2, this, fVarB);
                            aVar3.i(iVarInvoke);
                            aVar3.j(aVar3.getModification() + 1);
                            kotlin.jvm.internal.c0.d(1);
                        } finally {
                            kotlin.jvm.internal.c0.d(1);
                            kotlin.jvm.internal.c0.c(1);
                        }
                    }
                    kotlin.jvm.internal.c0.c(1);
                    SnapshotKt.M(fVarB, this);
                    kotlin.jvm.internal.c0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.c0.d(1);
                    kotlin.jvm.internal.c0.c(1);
                    throw th2;
                }
            }
        }
    }

    private final <R> R z(yh.l<? super a<K, V>, ? extends R> block) {
        c0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return block.invoke(SnapshotKt.A((a) firstStateRecord));
    }

    public final boolean a(@dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Iterator<E> it = ((u0.f) n().g().entrySet()).iterator();
        while (it.hasNext()) {
            if (!predicate.invoke((Map.Entry) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(@dl.d yh.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Iterator<E> it = ((u0.f) n().g().entrySet()).iterator();
        while (it.hasNext()) {
            if (predicate.invoke((Map.Entry) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    @xh.h(name = "getDebuggerDisplayValue")
    public final Map<K, V> c() {
        c0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((a) SnapshotKt.A((a) firstStateRecord)).g();
    }

    @Override // java.util.Map
    public void clear() {
        f fVarB;
        c0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) SnapshotKt.A((a) firstStateRecord);
        aVar.g();
        u0.i<K, V> iVarC = u0.a.C();
        if (iVarC != aVar.g()) {
            synchronized (u.f13278a) {
                c0 firstStateRecord2 = getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) firstStateRecord2;
                SnapshotKt.F();
                synchronized (SnapshotKt.D()) {
                    fVarB = f.INSTANCE.b();
                    a aVar3 = (a) SnapshotKt.h0(aVar2, this, fVarB);
                    aVar3.i(iVarC);
                    aVar3.j(aVar3.getModification() + 1);
                }
                SnapshotKt.M(fVarB, this);
            }
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return n().g().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return n().g().containsValue(value);
    }

    @dl.d
    public Set<Map.Entry<K, V>> e() {
        return this.entries;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return e();
    }

    @dl.d
    public Set<K> g() {
        return this.keys;
    }

    @Override // java.util.Map
    @dl.e
    public V get(Object key) {
        return n().g().get(key);
    }

    @Override // androidx.compose.runtime.snapshots.b0
    public void h(@dl.d c0 value) {
        kotlin.jvm.internal.f0.p(value, "value");
        this.firstStateRecord = (a) value;
    }

    public final int i() {
        return n().getModification();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return n().g().isEmpty();
    }

    @Override // androidx.compose.runtime.snapshots.b0
    public /* synthetic */ c0 j(c0 c0Var, c0 c0Var2, c0 c0Var3) {
        return a0.a(this, c0Var, c0Var2, c0Var3);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return g();
    }

    @Override // androidx.compose.runtime.snapshots.b0
    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public c0 getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @dl.d
    public final a<K, V> n() {
        c0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) SnapshotKt.S((a) firstStateRecord, this);
    }

    @Override // java.util.Map
    @dl.e
    public V put(K key, V value) {
        u0.i<K, V> iVarG;
        int modification;
        V vPut;
        f fVarB;
        boolean z10;
        do {
            synchronized (u.f13278a) {
                c0 firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) SnapshotKt.A((a) firstStateRecord);
                iVarG = aVar.g();
                modification = aVar.getModification();
                b2 b2Var = b2.f124493a;
            }
            kotlin.jvm.internal.f0.m(iVarG);
            u0.i.a<K, V> aVarBuilder = iVarG.builder();
            vPut = aVarBuilder.put(key, value);
            u0.i<K, V> iVarBuild = aVarBuilder.build();
            if (kotlin.jvm.internal.f0.g(iVarBuild, iVarG)) {
                break;
            }
            synchronized (u.f13278a) {
                c0 firstStateRecord2 = getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) firstStateRecord2;
                SnapshotKt.F();
                synchronized (SnapshotKt.D()) {
                    fVarB = f.INSTANCE.b();
                    a aVar3 = (a) SnapshotKt.h0(aVar2, this, fVarB);
                    z10 = true;
                    if (aVar3.getModification() == modification) {
                        aVar3.i(iVarBuild);
                        aVar3.j(aVar3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.M(fVarB, this);
            }
        } while (!z10);
        return vPut;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007d */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void putAll(@dl.d java.util.Map<? extends K, ? extends V> r9) {
        /*
            r8 = this;
            java.lang.String r0 = "from"
            kotlin.jvm.internal.f0.p(r9, r0)
        L5:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.u.a()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.c0 r1 = r8.getFirstStateRecord()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"
            kotlin.jvm.internal.f0.n(r1, r2)     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.t$a r1 = (androidx.compose.runtime.snapshots.t.a) r1     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.c0 r1 = androidx.compose.runtime.snapshots.SnapshotKt.A(r1)     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.t$a r1 = (androidx.compose.runtime.snapshots.t.a) r1     // Catch: java.lang.Throwable -> L81
            u0.i r2 = r1.g()     // Catch: java.lang.Throwable -> L81
            int r1 = r1.getModification()     // Catch: java.lang.Throwable -> L81
            kotlin.b2 r3 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)
            kotlin.jvm.internal.f0.m(r2)
            u0.i$a r0 = r2.builder()
            r0.putAll(r9)
            u0.i r0 = r0.build()
            boolean r2 = kotlin.jvm.internal.f0.g(r0, r2)
            if (r2 != 0) goto L80
            java.lang.Object r2 = androidx.compose.runtime.snapshots.u.a()
            monitor-enter(r2)
            androidx.compose.runtime.snapshots.c0 r3 = r8.getFirstStateRecord()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"
            kotlin.jvm.internal.f0.n(r3, r4)     // Catch: java.lang.Throwable -> L7d
            androidx.compose.runtime.snapshots.t$a r3 = (androidx.compose.runtime.snapshots.t.a) r3     // Catch: java.lang.Throwable -> L7d
            androidx.compose.runtime.snapshots.SnapshotKt.F()     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.D()     // Catch: java.lang.Throwable -> L7d
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L7d
            androidx.compose.runtime.snapshots.f$a r5 = androidx.compose.runtime.snapshots.f.INSTANCE     // Catch: java.lang.Throwable -> L7a
            androidx.compose.runtime.snapshots.f r5 = r5.b()     // Catch: java.lang.Throwable -> L7a
            androidx.compose.runtime.snapshots.c0 r3 = androidx.compose.runtime.snapshots.SnapshotKt.h0(r3, r8, r5)     // Catch: java.lang.Throwable -> L7a
            androidx.compose.runtime.snapshots.t$a r3 = (androidx.compose.runtime.snapshots.t.a) r3     // Catch: java.lang.Throwable -> L7a
            int r6 = r3.getModification()     // Catch: java.lang.Throwable -> L7a
            r7 = 1
            if (r6 != r1) goto L71
            r3.i(r0)     // Catch: java.lang.Throwable -> L7a
            int r0 = r3.getModification()     // Catch: java.lang.Throwable -> L7a
            int r0 = r0 + r7
            r3.j(r0)     // Catch: java.lang.Throwable -> L7a
            goto L72
        L71:
            r7 = 0
        L72:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            androidx.compose.runtime.snapshots.SnapshotKt.M(r5, r8)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r2)
            if (r7 == 0) goto L5
            goto L80
        L7a:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            throw r9     // Catch: java.lang.Throwable -> L7d
        L7d:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        L80:
            return
        L81:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.t.putAll(java.util.Map):void");
    }

    public int r() {
        return n().g().size();
    }

    @Override // java.util.Map
    @dl.e
    public V remove(Object key) {
        u0.i<K, V> iVarG;
        int modification;
        V vRemove;
        f fVarB;
        boolean z10;
        do {
            synchronized (u.f13278a) {
                c0 firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) SnapshotKt.A((a) firstStateRecord);
                iVarG = aVar.g();
                modification = aVar.getModification();
                b2 b2Var = b2.f124493a;
            }
            kotlin.jvm.internal.f0.m(iVarG);
            u0.i.a<K, V> aVarBuilder = iVarG.builder();
            vRemove = aVarBuilder.remove(key);
            u0.i<K, V> iVarBuild = aVarBuilder.build();
            if (kotlin.jvm.internal.f0.g(iVarBuild, iVarG)) {
                break;
            }
            synchronized (u.f13278a) {
                c0 firstStateRecord2 = getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) firstStateRecord2;
                SnapshotKt.F();
                synchronized (SnapshotKt.D()) {
                    fVarB = f.INSTANCE.b();
                    a aVar3 = (a) SnapshotKt.h0(aVar2, this, fVarB);
                    z10 = true;
                    if (aVar3.getModification() == modification) {
                        aVar3.i(iVarBuild);
                        aVar3.j(aVar3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.M(fVarB, this);
            }
        } while (!z10);
        return vRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return r();
    }

    @dl.d
    public Collection<V> u() {
        return this.values;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return u();
    }

    public final boolean w(@dl.d yh.l<? super Map.Entry<K, V>, Boolean> predicate) {
        u0.i<K, V> iVarG;
        int modification;
        f fVarB;
        boolean z10;
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        boolean z11 = false;
        do {
            synchronized (u.f13278a) {
                try {
                    c0 firstStateRecord = getFirstStateRecord();
                    kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    a aVar = (a) SnapshotKt.A((a) firstStateRecord);
                    iVarG = aVar.g();
                    modification = aVar.getModification();
                    b2 b2Var = b2.f124493a;
                    kotlin.jvm.internal.c0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.c0.d(1);
                    kotlin.jvm.internal.c0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.c0.c(1);
            kotlin.jvm.internal.f0.m(iVarG);
            u0.i.a<K, V> aVarBuilder = iVarG.builder();
            for (Map.Entry<K, V> entry : entrySet()) {
                if (predicate.invoke(entry).booleanValue()) {
                    aVarBuilder.remove(entry.getKey());
                    z11 = true;
                }
            }
            b2 b2Var2 = b2.f124493a;
            u0.i<K, V> iVarBuild = aVarBuilder.build();
            if (kotlin.jvm.internal.f0.g(iVarBuild, iVarG)) {
                break;
            }
            synchronized (u.f13278a) {
                try {
                    c0 firstStateRecord2 = getFirstStateRecord();
                    kotlin.jvm.internal.f0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    a aVar2 = (a) firstStateRecord2;
                    SnapshotKt.F();
                    synchronized (SnapshotKt.D()) {
                        try {
                            fVarB = f.INSTANCE.b();
                            a aVar3 = (a) SnapshotKt.h0(aVar2, this, fVarB);
                            if (aVar3.getModification() == modification) {
                                aVar3.i(iVarBuild);
                                aVar3.j(aVar3.getModification() + 1);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            kotlin.jvm.internal.c0.d(1);
                        } catch (Throwable th3) {
                            kotlin.jvm.internal.c0.d(1);
                            kotlin.jvm.internal.c0.c(1);
                            throw th3;
                        }
                    }
                    kotlin.jvm.internal.c0.c(1);
                    SnapshotKt.M(fVarB, this);
                    kotlin.jvm.internal.c0.d(1);
                } catch (Throwable th4) {
                    kotlin.jvm.internal.c0.d(1);
                    kotlin.jvm.internal.c0.c(1);
                    throw th4;
                }
            }
            kotlin.jvm.internal.c0.c(1);
        } while (!z10);
        return z11;
    }

    public final boolean x(V value) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.f0.g(((Map.Entry) next).getValue(), value));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }
}
