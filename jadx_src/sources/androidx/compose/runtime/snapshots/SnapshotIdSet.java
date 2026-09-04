package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: SnapshotIdSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\b\b\u0001\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B+\b\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0096\u0002J \u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086\bø\u0001\u0000J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "bit", "", ak.aB, RXScreenCaptureService.KEY_WIDTH, "l", "bits", "j", "i", "v", "", "iterator", "Lkotlin/Function1;", "Lkotlin/b2;", "block", "o", "default", ak.aG, "", "toString", "", "b", "J", "upperSet", ak.aF, "lowerSet", "d", "I", "lowerBound", "", "e", "[I", "belowBound", "<init>", "(JJI[I)V", "f", ak.av, "runtime_release"}, k = 1, mv = {1, 7, 1})
@m0
public final class SnapshotIdSet implements Iterable<Integer>, zh.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final SnapshotIdSet f13154g = new SnapshotIdSet(0, 0, 0, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long upperSet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long lowerSet;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int lowerBound;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final int[] belowBound;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SnapshotIdSet.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$a;", "", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", ak.av, "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final SnapshotIdSet a() {
            return SnapshotIdSet.f13154g;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapshotIdSet.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/o;", "", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {bb.c.b.J2, 300, 307}, m = "invokeSuspend", n = {"$this$sequence", "belowBound", "$this$sequence", UCropPlusActivity.ARG_INDEX, "$this$sequence", UCropPlusActivity.ARG_INDEX}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements yh.p<kotlin.sequences.o<? super Integer>, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f13159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f13162f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f13163g;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d kotlin.sequences.o<? super Integer> oVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(oVar, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = SnapshotIdSet.this.new AnonymousClass1(cVar);
            anonymousClass1.f13163g = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x008f  */
        /* JADX WARN: Code duplicated, block: B:28:0x009d  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:19:0x007b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009b -> B:31:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b4 -> B:31:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f0 -> B:43:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f3 -> B:43:0x00f4). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:26:0x008f
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private SnapshotIdSet(long j10, long j11, int i10, int[] iArr) {
        this.upperSet = j10;
        this.lowerSet = j11;
        this.lowerBound = i10;
        this.belowBound = iArr;
    }

    @dl.d
    public final SnapshotIdSet i(@dl.d SnapshotIdSet bits) {
        kotlin.jvm.internal.f0.p(bits, "bits");
        SnapshotIdSet snapshotIdSetW = f13154g;
        if (kotlin.jvm.internal.f0.g(bits, snapshotIdSetW) || kotlin.jvm.internal.f0.g(this, snapshotIdSetW)) {
            return snapshotIdSetW;
        }
        int i10 = bits.lowerBound;
        int i11 = this.lowerBound;
        if (i10 == i11) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                long j10 = this.upperSet;
                long j11 = bits.upperSet;
                long j12 = j10 & j11;
                long j13 = this.lowerSet;
                long j14 = bits.lowerSet;
                return (j12 == 0 && (j13 & j14) == 0 && iArr2 == null) ? snapshotIdSetW : new SnapshotIdSet(j11 & j10, j13 & j14, i11, iArr2);
            }
        }
        if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (bits.s(iIntValue)) {
                    snapshotIdSetW = snapshotIdSetW.w(iIntValue);
                }
            }
            return snapshotIdSetW;
        }
        Iterator<Integer> it2 = bits.iterator();
        while (it2.hasNext()) {
            int iIntValue2 = it2.next().intValue();
            if (s(iIntValue2)) {
                snapshotIdSetW = snapshotIdSetW.w(iIntValue2);
            }
        }
        return snapshotIdSetW;
    }

    @Override // java.lang.Iterable
    @dl.d
    public Iterator<Integer> iterator() {
        return kotlin.sequences.q.b(new AnonymousClass1(null)).iterator();
    }

    @dl.d
    public final SnapshotIdSet j(@dl.d SnapshotIdSet bits) {
        kotlin.jvm.internal.f0.p(bits, "bits");
        SnapshotIdSet snapshotIdSet = f13154g;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return snapshotIdSet;
        }
        int i10 = bits.lowerBound;
        int i11 = this.lowerBound;
        if (i10 == i11) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet & (~bits.upperSet), this.lowerSet & (~bits.lowerSet), i11, iArr2);
            }
        }
        Iterator<Integer> it = bits.iterator();
        SnapshotIdSet snapshotIdSetL = this;
        while (it.hasNext()) {
            snapshotIdSetL = snapshotIdSetL.l(it.next().intValue());
        }
        return snapshotIdSetL;
    }

    @dl.d
    public final SnapshotIdSet l(int bit) {
        int[] iArr;
        int iB;
        int i10 = this.lowerBound;
        int i11 = bit - i10;
        if (i11 >= 0 && i11 < 64) {
            long j10 = 1 << i11;
            long j11 = this.lowerSet;
            if ((j11 & j10) != 0) {
                return new SnapshotIdSet(this.upperSet, j11 & (~j10), i10, this.belowBound);
            }
        } else if (i11 >= 64 && i11 < 128) {
            long j12 = 1 << (i11 - 64);
            long j13 = this.upperSet;
            if ((j13 & j12) != 0) {
                return new SnapshotIdSet(j13 & (~j12), this.lowerSet, i10, this.belowBound);
            }
        } else if (i11 < 0 && (iArr = this.belowBound) != null && (iB = m.b(iArr, bit)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[length];
            if (iB > 0) {
                kotlin.collections.m.a1(iArr, iArr2, 0, 0, iB);
            }
            if (iB < length) {
                kotlin.collections.m.a1(iArr, iArr2, iB, iB + 1, length + 1);
            }
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final void o(@dl.d yh.l<? super Integer, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        int[] iArr = this.belowBound;
        if (iArr != null) {
            for (int i10 : iArr) {
                block.invoke(Integer.valueOf(i10));
            }
        }
        if (this.lowerSet != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((this.lowerSet & (1 << i11)) != 0) {
                    block.invoke(Integer.valueOf(this.lowerBound + i11));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((this.upperSet & (1 << i12)) != 0) {
                    block.invoke(Integer.valueOf(i12 + 64 + this.lowerBound));
                }
            }
        }
    }

    public final boolean s(int bit) {
        int[] iArr;
        int i10 = bit - this.lowerBound;
        if (i10 >= 0 && i10 < 64) {
            return ((1 << i10) & this.lowerSet) != 0;
        }
        if (i10 >= 64 && i10 < 128) {
            return ((1 << (i10 - 64)) & this.upperSet) != 0;
        }
        if (i10 <= 0 && (iArr = this.belowBound) != null) {
            return m.b(iArr, bit) >= 0;
        }
        return false;
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb2.append(a.k(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }

    public final int u(int i10) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j10 = this.lowerSet;
        if (j10 != 0) {
            return this.lowerBound + m.c(j10);
        }
        long j11 = this.upperSet;
        return j11 != 0 ? this.lowerBound + 64 + m.c(j11) : i10;
    }

    @dl.d
    public final SnapshotIdSet v(@dl.d SnapshotIdSet bits) {
        kotlin.jvm.internal.f0.p(bits, "bits");
        SnapshotIdSet snapshotIdSet = f13154g;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return bits;
        }
        int i10 = bits.lowerBound;
        int i11 = this.lowerBound;
        if (i10 == i11) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet | bits.upperSet, this.lowerSet | bits.lowerSet, i11, iArr2);
            }
        }
        if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                bits = bits.w(it.next().intValue());
            }
            return bits;
        }
        Iterator<Integer> it2 = bits.iterator();
        SnapshotIdSet snapshotIdSetW = this;
        while (it2.hasNext()) {
            snapshotIdSetW = snapshotIdSetW.w(it2.next().intValue());
        }
        return snapshotIdSetW;
    }

    @dl.d
    public final SnapshotIdSet w(int bit) {
        int i10;
        int[] iArrP5;
        int i11 = this.lowerBound;
        int i12 = bit - i11;
        long j10 = 0;
        if (i12 >= 0 && i12 < 64) {
            long j11 = 1 << i12;
            long j12 = this.lowerSet;
            if ((j12 & j11) == 0) {
                return new SnapshotIdSet(this.upperSet, j12 | j11, i11, this.belowBound);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j13 = 1 << (i12 - 64);
            long j14 = this.upperSet;
            if ((j14 & j13) == 0) {
                return new SnapshotIdSet(j14 | j13, this.lowerSet, i11, this.belowBound);
            }
        } else if (i12 < 128) {
            int[] iArr = this.belowBound;
            if (iArr == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, i11, new int[]{bit});
            }
            int iB = m.b(iArr, bit);
            if (iB < 0) {
                int i13 = -(iB + 1);
                int length = iArr.length + 1;
                int[] iArr2 = new int[length];
                kotlin.collections.m.a1(iArr, iArr2, 0, 0, i13);
                kotlin.collections.m.a1(iArr, iArr2, i13 + 1, i13, length - 1);
                iArr2[i13] = bit;
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
            }
        } else if (!s(bit)) {
            long j15 = this.upperSet;
            long j16 = this.lowerSet;
            int i14 = this.lowerBound;
            ArrayList arrayList = null;
            int i15 = ((bit + 1) / 64) * 64;
            long j17 = j16;
            long j18 = j15;
            while (true) {
                if (i14 >= i15) {
                    i10 = i14;
                    break;
                }
                if (j17 != j10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr3 = this.belowBound;
                        if (iArr3 != null) {
                            for (int i16 : iArr3) {
                                arrayList.add(Integer.valueOf(i16));
                            }
                        }
                    }
                    for (int i17 = 0; i17 < 64; i17++) {
                        if (((1 << i17) & j17) != 0) {
                            arrayList.add(Integer.valueOf(i17 + i14));
                        }
                    }
                    j10 = 0;
                }
                if (j18 == j10) {
                    j17 = j10;
                    i10 = i15;
                    break;
                }
                i14 += 64;
                j17 = j18;
                j18 = j10;
            }
            if (arrayList == null || (iArrP5 = CollectionsKt___CollectionsKt.P5(arrayList)) == null) {
                iArrP5 = this.belowBound;
            }
            return new SnapshotIdSet(j18, j17, i10, iArrP5).w(bit);
        }
        return this;
    }
}
