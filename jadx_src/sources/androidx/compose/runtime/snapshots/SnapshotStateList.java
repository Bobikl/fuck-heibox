package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.j2;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b#\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0012B\u0007¢\u0006\u0004\bN\u0010FJ5\u0010\t\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\b\u0007H\u0082\b¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\b\u0007H\u0082\b¢\u0006\u0004\b\u000b\u0010\nJ\"\u0010\r\u001a\u00020\f2\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\f0\u0005H\u0002J0\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\u0005H\u0082\b¢\u0006\u0004\b\u000e\u0010\nJ)\u0010\u0011\u001a\u00020\u00102\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u0005H\u0082\bJ)\u0010\u0012\u001a\u00020\f2\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u0005H\u0082\bJ\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001b\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u0018\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\fH\u0016J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0096\u0002J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010!J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001cH\u0016J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010\u0018J\u001f\u0010+\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u0016\u0010-\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\b\u0010.\u001a\u00020\u0010H\u0016J\u0017\u0010/\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b/\u0010\u0018J\u0016\u00100\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u0017\u00101\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010\u001fJ\u0016\u00102\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J \u00103\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b3\u00104J\u0016\u00105\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001cJ-\u00108\u001a\u00020\u001c2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u001cH\u0000¢\u0006\u0004\b8\u00109R$\u0010?\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u00138\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR \u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068@X\u0080\u0004¢\u0006\f\u0012\u0004\bE\u0010F\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010AR \u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000J8AX\u0080\u0004¢\u0006\f\u0012\u0004\bL\u0010F\u001a\u0004\b;\u0010K¨\u0006O"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", androidx.exifinterface.media.a.f23244d5, "", "Landroidx/compose/runtime/snapshots/b0;", "R", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotStateList$a;", "Lkotlin/t;", "block", "D", "(Lyh/l;)Ljava/lang/Object;", "B", "", "v", ak.aG, "Lu0/h;", "Lkotlin/b2;", androidx.exifinterface.media.a.W4, ak.av, "Landroidx/compose/runtime/snapshots/c0;", "value", RXScreenCaptureService.KEY_HEIGHT, "element", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", UCropPlusActivity.ARG_INDEX, "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "add", "(ILjava/lang/Object;)V", "addAll", "clear", "remove", "removeAll", RXScreenCaptureService.KEY_WIDTH, "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "x", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "y", "(Ljava/util/Collection;II)I", "<set-?>", "b", "Landroidx/compose/runtime/snapshots/c0;", "l", "()Landroidx/compose/runtime/snapshots/c0;", "firstStateRecord", "g", "()I", "modification", "i", "()Landroidx/compose/runtime/snapshots/SnapshotStateList$a;", "getReadable$runtime_release$annotations", "()V", "readable", ak.aB, UiKitSpanObj.TYPE_SIZE, "", "()Ljava/util/List;", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class SnapshotStateList<T> implements List<T>, b0, zh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private c0 firstStateRecord = new a(u0.a.G());

    /* JADX INFO: compiled from: SnapshotStateList.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\b\u0000\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$a;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/snapshots/c0;", "value", "Lkotlin/b2;", ak.av, "b", "", "e", "I", RXScreenCaptureService.KEY_HEIGHT, "()I", "j", "(I)V", "modification", "Lu0/h;", "list", "Lu0/h;", "g", "()Lu0/h;", "i", "(Lu0/h;)V", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a<T> extends c0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private u0.h<? extends T> f13184d;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int modification;

        public a(@dl.d u0.h<? extends T> list) {
            kotlin.jvm.internal.f0.p(list, "list");
            this.f13184d = list;
        }

        @Override // androidx.compose.runtime.snapshots.c0
        public void a(@dl.d c0 value) {
            kotlin.jvm.internal.f0.p(value, "value");
            synchronized (s.f13271a) {
                this.f13184d = ((a) value).f13184d;
                this.modification = ((a) value).modification;
                b2 b2Var = b2.f124493a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.c0
        @dl.d
        public c0 b() {
            return new a(this.f13184d);
        }

        @dl.d
        public final u0.h<T> g() {
            return this.f13184d;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void i(@dl.d u0.h<? extends T> hVar) {
            kotlin.jvm.internal.f0.p(hVar, "<set-?>");
            this.f13184d = hVar;
        }

        public final void j(int i10) {
            this.modification = i10;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A(yh.l<? super u0.h<? extends T>, ? extends u0.h<? extends T>> r9) {
        /*
            r8 = this;
        L0:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r0)
            r1 = 1
            androidx.compose.runtime.snapshots.c0 r2 = r8.getFirstStateRecord()     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r2, r3)     // Catch: java.lang.Throwable -> L96
            androidx.compose.runtime.snapshots.SnapshotStateList$a r2 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r2     // Catch: java.lang.Throwable -> L96
            androidx.compose.runtime.snapshots.c0 r2 = androidx.compose.runtime.snapshots.SnapshotKt.A(r2)     // Catch: java.lang.Throwable -> L96
            androidx.compose.runtime.snapshots.SnapshotStateList$a r2 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r2     // Catch: java.lang.Throwable -> L96
            int r3 = r2.getModification()     // Catch: java.lang.Throwable -> L96
            u0.h r2 = r2.g()     // Catch: java.lang.Throwable -> L96
            kotlin.b2 r4 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L96
            kotlin.jvm.internal.c0.d(r1)
            monitor-exit(r0)
            kotlin.jvm.internal.c0.c(r1)
            kotlin.jvm.internal.f0.m(r2)
            java.lang.Object r0 = r9.invoke(r2)
            u0.h r0 = (u0.h) r0
            boolean r2 = kotlin.jvm.internal.f0.g(r0, r2)
            if (r2 == 0) goto L38
            goto L83
        L38:
            java.lang.Object r2 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r2)
            androidx.compose.runtime.snapshots.c0 r4 = r8.getFirstStateRecord()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r4, r5)     // Catch: java.lang.Throwable -> L8d
            androidx.compose.runtime.snapshots.SnapshotStateList$a r4 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r4     // Catch: java.lang.Throwable -> L8d
            androidx.compose.runtime.snapshots.SnapshotKt.F()     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r5 = androidx.compose.runtime.snapshots.SnapshotKt.D()     // Catch: java.lang.Throwable -> L8d
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L8d
            androidx.compose.runtime.snapshots.f$a r6 = androidx.compose.runtime.snapshots.f.INSTANCE     // Catch: java.lang.Throwable -> L84
            androidx.compose.runtime.snapshots.f r6 = r6.b()     // Catch: java.lang.Throwable -> L84
            androidx.compose.runtime.snapshots.c0 r4 = androidx.compose.runtime.snapshots.SnapshotKt.h0(r4, r8, r6)     // Catch: java.lang.Throwable -> L84
            androidx.compose.runtime.snapshots.SnapshotStateList$a r4 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r4     // Catch: java.lang.Throwable -> L84
            int r7 = r4.getModification()     // Catch: java.lang.Throwable -> L84
            if (r7 != r3) goto L6f
            r4.i(r0)     // Catch: java.lang.Throwable -> L84
            int r0 = r4.getModification()     // Catch: java.lang.Throwable -> L84
            int r0 = r0 + r1
            r4.j(r0)     // Catch: java.lang.Throwable -> L84
            r0 = r1
            goto L70
        L6f:
            r0 = 0
        L70:
            kotlin.jvm.internal.c0.d(r1)     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8d
            kotlin.jvm.internal.c0.c(r1)     // Catch: java.lang.Throwable -> L8d
            androidx.compose.runtime.snapshots.SnapshotKt.M(r6, r8)     // Catch: java.lang.Throwable -> L8d
            kotlin.jvm.internal.c0.d(r1)
            monitor-exit(r2)
            kotlin.jvm.internal.c0.c(r1)
            if (r0 == 0) goto L0
        L83:
            return
        L84:
            r9 = move-exception
            kotlin.jvm.internal.c0.d(r1)     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8d
            kotlin.jvm.internal.c0.c(r1)     // Catch: java.lang.Throwable -> L8d
            throw r9     // Catch: java.lang.Throwable -> L8d
        L8d:
            r9 = move-exception
            kotlin.jvm.internal.c0.d(r1)
            monitor-exit(r2)
            kotlin.jvm.internal.c0.c(r1)
            throw r9
        L96:
            r9 = move-exception
            kotlin.jvm.internal.c0.d(r1)
            monitor-exit(r0)
            kotlin.jvm.internal.c0.c(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.A(yh.l):void");
    }

    private final <R> R B(yh.l<? super a<T>, ? extends R> block) {
        c0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return block.invoke(SnapshotKt.A((a) firstStateRecord));
    }

    private final <R> R D(yh.l<? super a<T>, ? extends R> block) {
        f fVarB;
        R rInvoke;
        c0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
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

    /* JADX WARN: Bottom block not found for handler: all -> 0x008d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean a(yh.l<? super u0.h<? extends T>, ? extends u0.h<? extends T>> r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r0)
            r1 = 1
            androidx.compose.runtime.snapshots.c0 r2 = r9.getFirstStateRecord()     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r2, r3)     // Catch: java.lang.Throwable -> L96
            androidx.compose.runtime.snapshots.SnapshotStateList$a r2 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r2     // Catch: java.lang.Throwable -> L96
            androidx.compose.runtime.snapshots.c0 r2 = androidx.compose.runtime.snapshots.SnapshotKt.A(r2)     // Catch: java.lang.Throwable -> L96
            androidx.compose.runtime.snapshots.SnapshotStateList$a r2 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r2     // Catch: java.lang.Throwable -> L96
            int r3 = r2.getModification()     // Catch: java.lang.Throwable -> L96
            u0.h r2 = r2.g()     // Catch: java.lang.Throwable -> L96
            kotlin.b2 r4 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L96
            kotlin.jvm.internal.c0.d(r1)
            monitor-exit(r0)
            kotlin.jvm.internal.c0.c(r1)
            kotlin.jvm.internal.f0.m(r2)
            java.lang.Object r0 = r10.invoke(r2)
            u0.h r0 = (u0.h) r0
            boolean r2 = kotlin.jvm.internal.f0.g(r0, r2)
            r4 = 0
            if (r2 == 0) goto L3a
            r1 = r4
            goto L83
        L3a:
            java.lang.Object r2 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r2)
            androidx.compose.runtime.snapshots.c0 r5 = r9.getFirstStateRecord()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r5, r6)     // Catch: java.lang.Throwable -> L8d
            androidx.compose.runtime.snapshots.SnapshotStateList$a r5 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r5     // Catch: java.lang.Throwable -> L8d
            androidx.compose.runtime.snapshots.SnapshotKt.F()     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r6 = androidx.compose.runtime.snapshots.SnapshotKt.D()     // Catch: java.lang.Throwable -> L8d
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L8d
            androidx.compose.runtime.snapshots.f$a r7 = androidx.compose.runtime.snapshots.f.INSTANCE     // Catch: java.lang.Throwable -> L84
            androidx.compose.runtime.snapshots.f r7 = r7.b()     // Catch: java.lang.Throwable -> L84
            androidx.compose.runtime.snapshots.c0 r5 = androidx.compose.runtime.snapshots.SnapshotKt.h0(r5, r9, r7)     // Catch: java.lang.Throwable -> L84
            androidx.compose.runtime.snapshots.SnapshotStateList$a r5 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r5     // Catch: java.lang.Throwable -> L84
            int r8 = r5.getModification()     // Catch: java.lang.Throwable -> L84
            if (r8 != r3) goto L70
            r5.i(r0)     // Catch: java.lang.Throwable -> L84
            int r0 = r5.getModification()     // Catch: java.lang.Throwable -> L84
            int r0 = r0 + r1
            r5.j(r0)     // Catch: java.lang.Throwable -> L84
            r4 = r1
        L70:
            kotlin.jvm.internal.c0.d(r1)     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8d
            kotlin.jvm.internal.c0.c(r1)     // Catch: java.lang.Throwable -> L8d
            androidx.compose.runtime.snapshots.SnapshotKt.M(r7, r9)     // Catch: java.lang.Throwable -> L8d
            kotlin.jvm.internal.c0.d(r1)
            monitor-exit(r2)
            kotlin.jvm.internal.c0.c(r1)
            if (r4 == 0) goto L0
        L83:
            return r1
        L84:
            r10 = move-exception
            kotlin.jvm.internal.c0.d(r1)     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8d
            kotlin.jvm.internal.c0.c(r1)     // Catch: java.lang.Throwable -> L8d
            throw r10     // Catch: java.lang.Throwable -> L8d
        L8d:
            r10 = move-exception
            kotlin.jvm.internal.c0.d(r1)
            monitor-exit(r2)
            kotlin.jvm.internal.c0.c(r1)
            throw r10
        L96:
            r10 = move-exception
            kotlin.jvm.internal.c0.d(r1)
            monitor-exit(r0)
            kotlin.jvm.internal.c0.c(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.a(yh.l):boolean");
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void o() {
    }

    private final <R> R u(yh.l<? super List<T>, ? extends R> block) {
        int modification;
        u0.h<T> hVarG;
        R rInvoke;
        f fVarB;
        boolean z10;
        do {
            synchronized (s.f13271a) {
                try {
                    c0 firstStateRecord = getFirstStateRecord();
                    kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    a aVar = (a) SnapshotKt.A((a) firstStateRecord);
                    modification = aVar.getModification();
                    hVarG = aVar.g();
                    b2 b2Var = b2.f124493a;
                    kotlin.jvm.internal.c0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.c0.d(1);
                    kotlin.jvm.internal.c0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.c0.c(1);
            kotlin.jvm.internal.f0.m(hVarG);
            u0.h.a<T> aVarBuilder = hVarG.builder();
            rInvoke = block.invoke(aVarBuilder);
            u0.h<T> hVarBuild = aVarBuilder.build();
            if (kotlin.jvm.internal.f0.g(hVarBuild, hVarG)) {
                break;
            }
            synchronized (s.f13271a) {
                try {
                    c0 firstStateRecord2 = getFirstStateRecord();
                    kotlin.jvm.internal.f0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    a aVar2 = (a) firstStateRecord2;
                    SnapshotKt.F();
                    synchronized (SnapshotKt.D()) {
                        try {
                            fVarB = f.INSTANCE.b();
                            a aVar3 = (a) SnapshotKt.h0(aVar2, this, fVarB);
                            if (aVar3.getModification() == modification) {
                                aVar3.i(hVarBuild);
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

    private final boolean v(yh.l<? super List<T>, Boolean> lVar) {
        int modification;
        u0.h<T> hVarG;
        Boolean boolInvoke;
        f fVarB;
        boolean z10;
        do {
            synchronized (s.f13271a) {
                c0 firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.A((a) firstStateRecord);
                modification = aVar.getModification();
                hVarG = aVar.g();
                b2 b2Var = b2.f124493a;
            }
            kotlin.jvm.internal.f0.m(hVarG);
            u0.h.a<T> aVarBuilder = hVarG.builder();
            boolInvoke = lVar.invoke(aVarBuilder);
            u0.h<T> hVarBuild = aVarBuilder.build();
            if (kotlin.jvm.internal.f0.g(hVarBuild, hVarG)) {
                break;
            }
            synchronized (s.f13271a) {
                c0 firstStateRecord2 = getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) firstStateRecord2;
                SnapshotKt.F();
                synchronized (SnapshotKt.D()) {
                    fVarB = f.INSTANCE.b();
                    a aVar3 = (a) SnapshotKt.h0(aVar2, this, fVarB);
                    z10 = true;
                    if (aVar3.getModification() == modification) {
                        aVar3.i(hVarBuild);
                        aVar3.j(aVar3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.M(fVarB, this);
            }
        } while (!z10);
        return boolInvoke.booleanValue();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0072 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void add(int r9, T r10) {
        /*
            r8 = this;
        L0:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.c0 r1 = r8.getFirstStateRecord()     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r1, r2)     // Catch: java.lang.Throwable -> L75
            androidx.compose.runtime.snapshots.SnapshotStateList$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L75
            androidx.compose.runtime.snapshots.c0 r1 = androidx.compose.runtime.snapshots.SnapshotKt.A(r1)     // Catch: java.lang.Throwable -> L75
            androidx.compose.runtime.snapshots.SnapshotStateList$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L75
            int r2 = r1.getModification()     // Catch: java.lang.Throwable -> L75
            u0.h r1 = r1.g()     // Catch: java.lang.Throwable -> L75
            kotlin.b2 r3 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L75
            monitor-exit(r0)
            kotlin.jvm.internal.f0.m(r1)
            u0.h r0 = r1.add(r9, r10)
            boolean r1 = kotlin.jvm.internal.f0.g(r0, r1)
            if (r1 == 0) goto L2f
            goto L6e
        L2f:
            java.lang.Object r1 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r1)
            androidx.compose.runtime.snapshots.c0 r3 = r8.getFirstStateRecord()     // Catch: java.lang.Throwable -> L72
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r3, r4)     // Catch: java.lang.Throwable -> L72
            androidx.compose.runtime.snapshots.SnapshotStateList$a r3 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r3     // Catch: java.lang.Throwable -> L72
            androidx.compose.runtime.snapshots.SnapshotKt.F()     // Catch: java.lang.Throwable -> L72
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.D()     // Catch: java.lang.Throwable -> L72
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L72
            androidx.compose.runtime.snapshots.f$a r5 = androidx.compose.runtime.snapshots.f.INSTANCE     // Catch: java.lang.Throwable -> L6f
            androidx.compose.runtime.snapshots.f r5 = r5.b()     // Catch: java.lang.Throwable -> L6f
            androidx.compose.runtime.snapshots.c0 r3 = androidx.compose.runtime.snapshots.SnapshotKt.h0(r3, r8, r5)     // Catch: java.lang.Throwable -> L6f
            androidx.compose.runtime.snapshots.SnapshotStateList$a r3 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r3     // Catch: java.lang.Throwable -> L6f
            int r6 = r3.getModification()     // Catch: java.lang.Throwable -> L6f
            r7 = 1
            if (r6 != r2) goto L66
            r3.i(r0)     // Catch: java.lang.Throwable -> L6f
            int r0 = r3.getModification()     // Catch: java.lang.Throwable -> L6f
            int r0 = r0 + r7
            r3.j(r0)     // Catch: java.lang.Throwable -> L6f
            goto L67
        L66:
            r7 = 0
        L67:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L72
            androidx.compose.runtime.snapshots.SnapshotKt.M(r5, r8)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r1)
            if (r7 == 0) goto L0
        L6e:
            return
        L6f:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L72
            throw r9     // Catch: java.lang.Throwable -> L72
        L72:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        L75:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.add(int, java.lang.Object):void");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0073 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean add(T r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.c0 r1 = r9.getFirstStateRecord()     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r1, r2)     // Catch: java.lang.Throwable -> L76
            androidx.compose.runtime.snapshots.SnapshotStateList$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L76
            androidx.compose.runtime.snapshots.c0 r1 = androidx.compose.runtime.snapshots.SnapshotKt.A(r1)     // Catch: java.lang.Throwable -> L76
            androidx.compose.runtime.snapshots.SnapshotStateList$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L76
            int r2 = r1.getModification()     // Catch: java.lang.Throwable -> L76
            u0.h r1 = r1.g()     // Catch: java.lang.Throwable -> L76
            kotlin.b2 r3 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L76
            monitor-exit(r0)
            kotlin.jvm.internal.f0.m(r1)
            u0.h r0 = r1.add(r10)
            boolean r1 = kotlin.jvm.internal.f0.g(r0, r1)
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L31
            goto L6f
        L31:
            java.lang.Object r1 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r1)
            androidx.compose.runtime.snapshots.c0 r5 = r9.getFirstStateRecord()     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r5, r6)     // Catch: java.lang.Throwable -> L73
            androidx.compose.runtime.snapshots.SnapshotStateList$a r5 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r5     // Catch: java.lang.Throwable -> L73
            androidx.compose.runtime.snapshots.SnapshotKt.F()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r6 = androidx.compose.runtime.snapshots.SnapshotKt.D()     // Catch: java.lang.Throwable -> L73
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L73
            androidx.compose.runtime.snapshots.f$a r7 = androidx.compose.runtime.snapshots.f.INSTANCE     // Catch: java.lang.Throwable -> L70
            androidx.compose.runtime.snapshots.f r7 = r7.b()     // Catch: java.lang.Throwable -> L70
            androidx.compose.runtime.snapshots.c0 r5 = androidx.compose.runtime.snapshots.SnapshotKt.h0(r5, r9, r7)     // Catch: java.lang.Throwable -> L70
            androidx.compose.runtime.snapshots.SnapshotStateList$a r5 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r5     // Catch: java.lang.Throwable -> L70
            int r8 = r5.getModification()     // Catch: java.lang.Throwable -> L70
            if (r8 != r2) goto L67
            r5.i(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r5.getModification()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r4
            r5.j(r0)     // Catch: java.lang.Throwable -> L70
            r3 = r4
        L67:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L73
            androidx.compose.runtime.snapshots.SnapshotKt.M(r7, r9)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r1)
            if (r3 == 0) goto L0
            r3 = r4
        L6f:
            return r3
        L70:
            r10 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L73
            throw r10     // Catch: java.lang.Throwable -> L73
        L73:
            r10 = move-exception
            monitor-exit(r1)
            throw r10
        L76:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.add(java.lang.Object):boolean");
    }

    @Override // java.util.List
    public boolean addAll(final int index, @dl.d final Collection<? extends T> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return v(new yh.l<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.addAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d List<T> it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return Boolean.valueOf(it.addAll(index, elements));
            }
        });
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0078 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean addAll(@dl.d java.util.Collection<? extends T> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.f0.p(r10, r0)
        L5:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.c0 r1 = r9.getFirstStateRecord()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r1, r2)     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.SnapshotStateList$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.c0 r1 = androidx.compose.runtime.snapshots.SnapshotKt.A(r1)     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.SnapshotStateList$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L7b
            int r2 = r1.getModification()     // Catch: java.lang.Throwable -> L7b
            u0.h r1 = r1.g()     // Catch: java.lang.Throwable -> L7b
            kotlin.b2 r3 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r0)
            kotlin.jvm.internal.f0.m(r1)
            u0.h r0 = r1.addAll(r10)
            boolean r1 = kotlin.jvm.internal.f0.g(r0, r1)
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L36
            goto L74
        L36:
            java.lang.Object r1 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r1)
            androidx.compose.runtime.snapshots.c0 r5 = r9.getFirstStateRecord()     // Catch: java.lang.Throwable -> L78
            java.lang.String r6 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r5, r6)     // Catch: java.lang.Throwable -> L78
            androidx.compose.runtime.snapshots.SnapshotStateList$a r5 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r5     // Catch: java.lang.Throwable -> L78
            androidx.compose.runtime.snapshots.SnapshotKt.F()     // Catch: java.lang.Throwable -> L78
            java.lang.Object r6 = androidx.compose.runtime.snapshots.SnapshotKt.D()     // Catch: java.lang.Throwable -> L78
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L78
            androidx.compose.runtime.snapshots.f$a r7 = androidx.compose.runtime.snapshots.f.INSTANCE     // Catch: java.lang.Throwable -> L75
            androidx.compose.runtime.snapshots.f r7 = r7.b()     // Catch: java.lang.Throwable -> L75
            androidx.compose.runtime.snapshots.c0 r5 = androidx.compose.runtime.snapshots.SnapshotKt.h0(r5, r9, r7)     // Catch: java.lang.Throwable -> L75
            androidx.compose.runtime.snapshots.SnapshotStateList$a r5 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r5     // Catch: java.lang.Throwable -> L75
            int r8 = r5.getModification()     // Catch: java.lang.Throwable -> L75
            if (r8 != r2) goto L6c
            r5.i(r0)     // Catch: java.lang.Throwable -> L75
            int r0 = r5.getModification()     // Catch: java.lang.Throwable -> L75
            int r0 = r0 + r4
            r5.j(r0)     // Catch: java.lang.Throwable -> L75
            r3 = r4
        L6c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L78
            androidx.compose.runtime.snapshots.SnapshotKt.M(r7, r9)     // Catch: java.lang.Throwable -> L78
            monitor-exit(r1)
            if (r3 == 0) goto L5
            r3 = r4
        L74:
            return r3
        L75:
            r10 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L78
            throw r10     // Catch: java.lang.Throwable -> L78
        L78:
            r10 = move-exception
            monitor-exit(r1)
            throw r10
        L7b:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.addAll(java.util.Collection):boolean");
    }

    @dl.d
    @xh.h(name = "getDebuggerDisplayValue")
    public final List<T> b() {
        c0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) SnapshotKt.A((a) firstStateRecord)).g();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        f fVarB;
        synchronized (s.f13271a) {
            c0 firstStateRecord = getFirstStateRecord();
            kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar = (a) firstStateRecord;
            SnapshotKt.F();
            synchronized (SnapshotKt.D()) {
                fVarB = f.INSTANCE.b();
                a aVar2 = (a) SnapshotKt.h0(aVar, this, fVarB);
                aVar2.i(u0.a.G());
                aVar2.j(aVar2.getModification() + 1);
            }
            SnapshotKt.M(fVarB, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return i().g().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return i().g().containsAll(elements);
    }

    public final int g() {
        c0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) SnapshotKt.A((a) firstStateRecord)).getModification();
    }

    @Override // java.util.List
    public T get(int index) {
        return i().g().get(index);
    }

    @Override // androidx.compose.runtime.snapshots.b0
    public void h(@dl.d c0 value) {
        kotlin.jvm.internal.f0.p(value, "value");
        value.e(getFirstStateRecord());
        this.firstStateRecord = (a) value;
    }

    @dl.d
    public final a<T> i() {
        c0 firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) SnapshotKt.S((a) firstStateRecord, this);
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return i().g().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return i().g().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // androidx.compose.runtime.snapshots.b0
    public /* synthetic */ c0 j(c0 c0Var, c0 c0Var2, c0 c0Var3) {
        return a0.a(this, c0Var, c0Var2, c0Var3);
    }

    @Override // androidx.compose.runtime.snapshots.b0
    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public c0 getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return i().g().lastIndexOf(element);
    }

    @Override // java.util.List
    @dl.d
    public ListIterator<T> listIterator() {
        return new v(this, 0);
    }

    @Override // java.util.List
    @dl.d
    public ListIterator<T> listIterator(int index) {
        return new v(this, index);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return w(i10);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0073 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.c0 r1 = r9.getFirstStateRecord()     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r1, r2)     // Catch: java.lang.Throwable -> L76
            androidx.compose.runtime.snapshots.SnapshotStateList$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L76
            androidx.compose.runtime.snapshots.c0 r1 = androidx.compose.runtime.snapshots.SnapshotKt.A(r1)     // Catch: java.lang.Throwable -> L76
            androidx.compose.runtime.snapshots.SnapshotStateList$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L76
            int r2 = r1.getModification()     // Catch: java.lang.Throwable -> L76
            u0.h r1 = r1.g()     // Catch: java.lang.Throwable -> L76
            kotlin.b2 r3 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L76
            monitor-exit(r0)
            kotlin.jvm.internal.f0.m(r1)
            u0.h r0 = r1.remove(r10)
            boolean r1 = kotlin.jvm.internal.f0.g(r0, r1)
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L31
            goto L6f
        L31:
            java.lang.Object r1 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r1)
            androidx.compose.runtime.snapshots.c0 r5 = r9.getFirstStateRecord()     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r5, r6)     // Catch: java.lang.Throwable -> L73
            androidx.compose.runtime.snapshots.SnapshotStateList$a r5 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r5     // Catch: java.lang.Throwable -> L73
            androidx.compose.runtime.snapshots.SnapshotKt.F()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r6 = androidx.compose.runtime.snapshots.SnapshotKt.D()     // Catch: java.lang.Throwable -> L73
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L73
            androidx.compose.runtime.snapshots.f$a r7 = androidx.compose.runtime.snapshots.f.INSTANCE     // Catch: java.lang.Throwable -> L70
            androidx.compose.runtime.snapshots.f r7 = r7.b()     // Catch: java.lang.Throwable -> L70
            androidx.compose.runtime.snapshots.c0 r5 = androidx.compose.runtime.snapshots.SnapshotKt.h0(r5, r9, r7)     // Catch: java.lang.Throwable -> L70
            androidx.compose.runtime.snapshots.SnapshotStateList$a r5 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r5     // Catch: java.lang.Throwable -> L70
            int r8 = r5.getModification()     // Catch: java.lang.Throwable -> L70
            if (r8 != r2) goto L67
            r5.i(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r5.getModification()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r4
            r5.j(r0)     // Catch: java.lang.Throwable -> L70
            r3 = r4
        L67:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L73
            androidx.compose.runtime.snapshots.SnapshotKt.M(r7, r9)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r1)
            if (r3 == 0) goto L0
            r3 = r4
        L6f:
            return r3
        L70:
            r10 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L73
            throw r10     // Catch: java.lang.Throwable -> L73
        L73:
            r10 = move-exception
            monitor-exit(r1)
            throw r10
        L76:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.remove(java.lang.Object):boolean");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0078 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean removeAll(@dl.d java.util.Collection<? extends java.lang.Object> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.f0.p(r10, r0)
        L5:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.c0 r1 = r9.getFirstStateRecord()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r1, r2)     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.SnapshotStateList$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.c0 r1 = androidx.compose.runtime.snapshots.SnapshotKt.A(r1)     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.SnapshotStateList$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L7b
            int r2 = r1.getModification()     // Catch: java.lang.Throwable -> L7b
            u0.h r1 = r1.g()     // Catch: java.lang.Throwable -> L7b
            kotlin.b2 r3 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r0)
            kotlin.jvm.internal.f0.m(r1)
            u0.h r0 = r1.removeAll(r10)
            boolean r1 = kotlin.jvm.internal.f0.g(r0, r1)
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L36
            goto L74
        L36:
            java.lang.Object r1 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r1)
            androidx.compose.runtime.snapshots.c0 r5 = r9.getFirstStateRecord()     // Catch: java.lang.Throwable -> L78
            java.lang.String r6 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r5, r6)     // Catch: java.lang.Throwable -> L78
            androidx.compose.runtime.snapshots.SnapshotStateList$a r5 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r5     // Catch: java.lang.Throwable -> L78
            androidx.compose.runtime.snapshots.SnapshotKt.F()     // Catch: java.lang.Throwable -> L78
            java.lang.Object r6 = androidx.compose.runtime.snapshots.SnapshotKt.D()     // Catch: java.lang.Throwable -> L78
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L78
            androidx.compose.runtime.snapshots.f$a r7 = androidx.compose.runtime.snapshots.f.INSTANCE     // Catch: java.lang.Throwable -> L75
            androidx.compose.runtime.snapshots.f r7 = r7.b()     // Catch: java.lang.Throwable -> L75
            androidx.compose.runtime.snapshots.c0 r5 = androidx.compose.runtime.snapshots.SnapshotKt.h0(r5, r9, r7)     // Catch: java.lang.Throwable -> L75
            androidx.compose.runtime.snapshots.SnapshotStateList$a r5 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r5     // Catch: java.lang.Throwable -> L75
            int r8 = r5.getModification()     // Catch: java.lang.Throwable -> L75
            if (r8 != r2) goto L6c
            r5.i(r0)     // Catch: java.lang.Throwable -> L75
            int r0 = r5.getModification()     // Catch: java.lang.Throwable -> L75
            int r0 = r0 + r4
            r5.j(r0)     // Catch: java.lang.Throwable -> L75
            r3 = r4
        L6c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L78
            androidx.compose.runtime.snapshots.SnapshotKt.M(r7, r9)     // Catch: java.lang.Throwable -> L78
            monitor-exit(r1)
            if (r3 == 0) goto L5
            r3 = r4
        L74:
            return r3
        L75:
            r10 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L78
            throw r10     // Catch: java.lang.Throwable -> L78
        L78:
            r10 = move-exception
            monitor-exit(r1)
            throw r10
        L7b:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@dl.d final Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return v(new yh.l<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d List<T> it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return Boolean.valueOf(it.retainAll(elements));
            }
        });
    }

    public int s() {
        return i().g().size();
    }

    @Override // java.util.List
    public T set(int index, T element) {
        int modification;
        u0.h<T> hVarG;
        f fVarB;
        boolean z10;
        T t10 = get(index);
        do {
            synchronized (s.f13271a) {
                c0 firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.A((a) firstStateRecord);
                modification = aVar.getModification();
                hVarG = aVar.g();
                b2 b2Var = b2.f124493a;
            }
            kotlin.jvm.internal.f0.m(hVarG);
            u0.h<T> hVar = hVarG.set(index, element);
            if (kotlin.jvm.internal.f0.g(hVar, hVarG)) {
                break;
            }
            synchronized (s.f13271a) {
                c0 firstStateRecord2 = getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) firstStateRecord2;
                SnapshotKt.F();
                synchronized (SnapshotKt.D()) {
                    fVarB = f.INSTANCE.b();
                    a aVar3 = (a) SnapshotKt.h0(aVar2, this, fVarB);
                    z10 = true;
                    if (aVar3.getModification() == modification) {
                        aVar3.i(hVar);
                        aVar3.j(aVar3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.M(fVarB, this);
            }
        } while (!z10);
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return s();
    }

    @Override // java.util.List
    @dl.d
    public List<T> subList(int fromIndex, int toIndex) {
        if ((fromIndex >= 0 && fromIndex <= toIndex) && toIndex <= size()) {
            return new d0(this, fromIndex, toIndex);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        return (T[]) kotlin.jvm.internal.t.b(this, array);
    }

    public T w(int index) {
        int modification;
        u0.h<T> hVarG;
        f fVarB;
        boolean z10;
        T t10 = get(index);
        do {
            synchronized (s.f13271a) {
                c0 firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.A((a) firstStateRecord);
                modification = aVar.getModification();
                hVarG = aVar.g();
                b2 b2Var = b2.f124493a;
            }
            kotlin.jvm.internal.f0.m(hVarG);
            u0.h<T> hVarK0 = hVarG.K0(index);
            if (kotlin.jvm.internal.f0.g(hVarK0, hVarG)) {
                break;
            }
            synchronized (s.f13271a) {
                c0 firstStateRecord2 = getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) firstStateRecord2;
                SnapshotKt.F();
                synchronized (SnapshotKt.D()) {
                    fVarB = f.INSTANCE.b();
                    a aVar3 = (a) SnapshotKt.h0(aVar2, this, fVarB);
                    z10 = true;
                    if (aVar3.getModification() == modification) {
                        aVar3.i(hVarK0);
                        aVar3.j(aVar3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.M(fVarB, this);
            }
        } while (!z10);
        return t10;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(int r9, int r10) {
        /*
            r8 = this;
        L0:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.c0 r1 = r8.getFirstStateRecord()     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r1, r2)     // Catch: java.lang.Throwable -> L80
            androidx.compose.runtime.snapshots.SnapshotStateList$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L80
            androidx.compose.runtime.snapshots.c0 r1 = androidx.compose.runtime.snapshots.SnapshotKt.A(r1)     // Catch: java.lang.Throwable -> L80
            androidx.compose.runtime.snapshots.SnapshotStateList$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L80
            int r2 = r1.getModification()     // Catch: java.lang.Throwable -> L80
            u0.h r1 = r1.g()     // Catch: java.lang.Throwable -> L80
            kotlin.b2 r3 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L80
            monitor-exit(r0)
            kotlin.jvm.internal.f0.m(r1)
            u0.h$a r0 = r1.builder()
            java.util.List r3 = r0.subList(r9, r10)
            r3.clear()
            u0.h r0 = r0.build()
            boolean r1 = kotlin.jvm.internal.f0.g(r0, r1)
            if (r1 != 0) goto L7f
            java.lang.Object r1 = androidx.compose.runtime.snapshots.s.a()
            monitor-enter(r1)
            androidx.compose.runtime.snapshots.c0 r3 = r8.getFirstStateRecord()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.f0.n(r3, r4)     // Catch: java.lang.Throwable -> L7c
            androidx.compose.runtime.snapshots.SnapshotStateList$a r3 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r3     // Catch: java.lang.Throwable -> L7c
            androidx.compose.runtime.snapshots.SnapshotKt.F()     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.D()     // Catch: java.lang.Throwable -> L7c
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L7c
            androidx.compose.runtime.snapshots.f$a r5 = androidx.compose.runtime.snapshots.f.INSTANCE     // Catch: java.lang.Throwable -> L79
            androidx.compose.runtime.snapshots.f r5 = r5.b()     // Catch: java.lang.Throwable -> L79
            androidx.compose.runtime.snapshots.c0 r3 = androidx.compose.runtime.snapshots.SnapshotKt.h0(r3, r8, r5)     // Catch: java.lang.Throwable -> L79
            androidx.compose.runtime.snapshots.SnapshotStateList$a r3 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r3     // Catch: java.lang.Throwable -> L79
            int r6 = r3.getModification()     // Catch: java.lang.Throwable -> L79
            r7 = 1
            if (r6 != r2) goto L70
            r3.i(r0)     // Catch: java.lang.Throwable -> L79
            int r0 = r3.getModification()     // Catch: java.lang.Throwable -> L79
            int r0 = r0 + r7
            r3.j(r0)     // Catch: java.lang.Throwable -> L79
            goto L71
        L70:
            r7 = 0
        L71:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7c
            androidx.compose.runtime.snapshots.SnapshotKt.M(r5, r8)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r1)
            if (r7 == 0) goto L0
            goto L7f
        L79:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7c
            throw r9     // Catch: java.lang.Throwable -> L7c
        L7c:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        L7f:
            return
        L80:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.x(int, int):void");
    }

    public final int y(@dl.d Collection<? extends T> elements, int start, int end) {
        int modification;
        u0.h<T> hVarG;
        f fVarB;
        boolean z10;
        kotlin.jvm.internal.f0.p(elements, "elements");
        int size = size();
        do {
            synchronized (s.f13271a) {
                c0 firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.A((a) firstStateRecord);
                modification = aVar.getModification();
                hVarG = aVar.g();
                b2 b2Var = b2.f124493a;
            }
            kotlin.jvm.internal.f0.m(hVarG);
            u0.h.a<T> aVarBuilder = hVarG.builder();
            aVarBuilder.subList(start, end).retainAll(elements);
            u0.h<T> hVarBuild = aVarBuilder.build();
            if (kotlin.jvm.internal.f0.g(hVarBuild, hVarG)) {
                break;
            }
            synchronized (s.f13271a) {
                c0 firstStateRecord2 = getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) firstStateRecord2;
                SnapshotKt.F();
                synchronized (SnapshotKt.D()) {
                    fVarB = f.INSTANCE.b();
                    a aVar3 = (a) SnapshotKt.h0(aVar2, this, fVarB);
                    z10 = true;
                    if (aVar3.getModification() == modification) {
                        aVar3.i(hVarBuild);
                        aVar3.j(aVar3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.M(fVarB, this);
            }
        } while (!z10);
        return size - size();
    }
}
