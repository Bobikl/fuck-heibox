package androidx.compose.foundation.lazy.grid;

import com.lzy.okgo.model.Progress;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0013\u0006\u000eB\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b-\u0010.J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002J\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001bR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b%\u0010#R*\u0010*\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001e\u0010(\"\u0004\b%\u0010)R\u0014\u0010+\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010(R\u0011\u0010,\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010(\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "", "currentSlotsPerLine", "", "Landroidx/compose/foundation/lazy/grid/d;", "b", "itemIndex", "maxSpan", "i", "Lkotlin/b2;", "g", "lineIndex", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$c;", ak.aF, "Landroidx/compose/foundation/lazy/grid/a0;", "d", "(I)I", "Landroidx/compose/foundation/lazy/grid/j;", ak.av, "Landroidx/compose/foundation/lazy/grid/j;", "itemProvider", "Ljava/util/ArrayList;", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$a;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "buckets", "I", "lastLineIndex", "lastLineStartItemIndex", "e", "lastLineStartKnownSpan", "f", "cachedBucketIndex", "", "Ljava/util/List;", "cachedBucket", RXScreenCaptureService.KEY_HEIGHT, "previousDefaultSpans", "value", "()I", "(I)V", "slotsPerLine", "bucketSize", Progress.H, "<init>", "(Landroidx/compose/foundation/lazy/grid/j;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazyGridSpanLayoutProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final j itemProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ArrayList<a> buckets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int lastLineIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int lastLineStartItemIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int lastLineStartKnownSpan;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int cachedBucketIndex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Integer> cachedBucket;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private List<d> previousDefaultSpans;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int slotsPerLine;

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$a;", "", "", ak.av, "I", "()I", "firstItemIndex", "b", "firstItemKnownSpan", "<init>", "(II)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int firstItemIndex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int firstItemKnownSpan;

        public a(int i10, int i11) {
            this.firstItemIndex = i10;
            this.firstItemKnownSpan = i11;
        }

        public /* synthetic */ a(int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
            this(i10, (i12 & 2) != 0 ? 0 : i11);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }
    }

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$b;", "Landroidx/compose/foundation/lazy/grid/m;", "", "b", "I", ak.av, "()I", ak.aF, "(I)V", "maxCurrentLineSpan", "d", "maxLineSpan", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final b f6824a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static int maxCurrentLineSpan;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static int maxLineSpan;

        private b() {
        }

        @Override // androidx.compose.foundation.lazy.grid.m
        public int a() {
            return maxCurrentLineSpan;
        }

        @Override // androidx.compose.foundation.lazy.grid.m
        public int b() {
            return maxLineSpan;
        }

        public void c(int i10) {
            maxCurrentLineSpan = i10;
        }

        public void d(int i10) {
            maxLineSpan = i10;
        }
    }

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$c;", "", "", ak.av, "I", "()I", "firstItemIndex", "", "Landroidx/compose/foundation/lazy/grid/d;", "b", "Ljava/util/List;", "()Ljava/util/List;", "spans", "<init>", "(ILjava/util/List;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f6827c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int firstItemIndex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<d> spans;

        public c(int i10, @dl.d List<d> spans) {
            f0.p(spans, "spans");
            this.firstItemIndex = i10;
            this.spans = spans;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        @dl.d
        public final List<d> b() {
            return this.spans;
        }
    }

    public LazyGridSpanLayoutProvider(@dl.d j itemProvider) {
        f0.p(itemProvider, "itemProvider");
        this.itemProvider = itemProvider;
        ArrayList<a> arrayList = new ArrayList<>();
        int i10 = 0;
        arrayList.add(new a(i10, i10, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = CollectionsKt__CollectionsKt.E();
    }

    private final int a() {
        return ((int) Math.sqrt((((double) f()) * 1.0d) / ((double) this.slotsPerLine))) + 1;
    }

    private final List<d> b(int currentSlotsPerLine) {
        if (currentSlotsPerLine == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(currentSlotsPerLine);
        for (int i10 = 0; i10 < currentSlotsPerLine; i10++) {
            arrayList.add(d.a(v.a(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    private final void g() {
        this.buckets.clear();
        int i10 = 0;
        this.buckets.add(new a(i10, i10, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final int i(int itemIndex, int maxSpan) {
        j jVar = this.itemProvider;
        b bVar = b.f6824a;
        bVar.c(maxSpan);
        bVar.d(this.slotsPerLine);
        return fi.u.I(d.f(jVar.f(bVar, itemIndex)), 1, this.slotsPerLine);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    @dl.d
    public final c c(int lineIndex) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        if (!this.itemProvider.g()) {
            int i13 = lineIndex * this.slotsPerLine;
            return new c(i13, b(fi.u.u(fi.u.B(this.slotsPerLine, f() - i13), 0)));
        }
        int iMin = Math.min(lineIndex / a(), this.buckets.size() - 1);
        int iA = a() * iMin;
        int firstItemIndex = this.buckets.get(iMin).getFirstItemIndex();
        int firstItemKnownSpan = this.buckets.get(iMin).getFirstItemKnownSpan();
        int i14 = this.lastLineIndex;
        if (iA <= i14 && i14 <= lineIndex) {
            firstItemIndex = this.lastLineStartItemIndex;
            firstItemKnownSpan = this.lastLineStartKnownSpan;
            iA = i14;
        } else if (iMin == this.cachedBucketIndex && (i10 = lineIndex - iA) < this.cachedBucket.size()) {
            firstItemIndex = this.cachedBucket.get(i10).intValue();
            iA = lineIndex;
            firstItemKnownSpan = 0;
        }
        if (iA % a() == 0) {
            int i15 = lineIndex - iA;
            if (2 <= i15 && i15 < a()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            this.cachedBucketIndex = iMin;
            this.cachedBucket.clear();
        }
        if (!(iA <= lineIndex)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        while (iA < lineIndex && firstItemIndex < f()) {
            if (z10) {
                this.cachedBucket.add(Integer.valueOf(firstItemIndex));
            }
            int i16 = 0;
            while (i16 < this.slotsPerLine && firstItemIndex < f()) {
                if (firstItemKnownSpan == 0) {
                    i12 = firstItemKnownSpan;
                    firstItemKnownSpan = i(firstItemIndex, this.slotsPerLine - i16);
                } else {
                    i12 = 0;
                }
                i16 += firstItemKnownSpan;
                if (i16 > this.slotsPerLine) {
                    break;
                }
                firstItemIndex++;
                firstItemKnownSpan = i12;
            }
            iA++;
            if (iA % a() == 0 && firstItemIndex < f()) {
                if (!(this.buckets.size() == iA / a())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                this.buckets.add(new a(firstItemIndex, firstItemKnownSpan));
            }
        }
        this.lastLineIndex = lineIndex;
        this.lastLineStartItemIndex = firstItemIndex;
        this.lastLineStartKnownSpan = firstItemKnownSpan;
        ArrayList arrayList = new ArrayList();
        int i17 = 0;
        int i18 = firstItemIndex;
        while (i17 < this.slotsPerLine && i18 < f()) {
            if (firstItemKnownSpan == 0) {
                int i19 = firstItemKnownSpan;
                firstItemKnownSpan = i(i18, this.slotsPerLine - i17);
                i11 = i19;
            } else {
                i11 = 0;
            }
            i17 += firstItemKnownSpan;
            if (i17 > this.slotsPerLine) {
                break;
            }
            i18++;
            arrayList.add(d.a(v.a(firstItemKnownSpan)));
            firstItemKnownSpan = i11;
        }
        return new c(firstItemIndex, arrayList);
    }

    public final int d(final int itemIndex) {
        int i10 = 0;
        if (f() <= 0) {
            return a0.c(0);
        }
        if (!(itemIndex < f())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.itemProvider.g()) {
            return a0.c(itemIndex / this.slotsPerLine);
        }
        int iW = CollectionsKt__CollectionsKt.w(this.buckets, 0, 0, new yh.l<a, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@dl.d LazyGridSpanLayoutProvider.a it) {
                f0.p(it, "it");
                return Integer.valueOf(it.getFirstItemIndex() - itemIndex);
            }
        }, 3, null);
        int i11 = 2;
        if (iW < 0) {
            iW = (-iW) - 2;
        }
        int iA = a() * iW;
        int firstItemIndex = this.buckets.get(iW).getFirstItemIndex();
        if (!(firstItemIndex <= itemIndex)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i12 = 0;
        while (firstItemIndex < itemIndex) {
            int i13 = firstItemIndex + 1;
            int i14 = i(firstItemIndex, this.slotsPerLine - i12);
            i12 += i14;
            int i15 = this.slotsPerLine;
            if (i12 >= i15) {
                if (i12 == i15) {
                    iA++;
                    i12 = 0;
                } else {
                    iA++;
                    i12 = i14;
                }
            }
            if (iA % a() == 0 && iA / a() >= this.buckets.size()) {
                this.buckets.add(new a(i13 - (i12 > 0 ? 1 : 0), i10, i11, null));
            }
            firstItemIndex = i13;
        }
        if (i12 + i(itemIndex, this.slotsPerLine - i12) > this.slotsPerLine) {
            iA++;
        }
        return a0.c(iA);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int f() {
        return this.itemProvider.a();
    }

    public final void h(int i10) {
        if (i10 != this.slotsPerLine) {
            this.slotsPerLine = i10;
            g();
        }
    }
}
