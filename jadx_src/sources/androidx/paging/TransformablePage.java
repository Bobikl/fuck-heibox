package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: renamed from: androidx.paging.d1, reason: from toString */
/* JADX INFO: compiled from: TransformablePage.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\b\u0018\u0000 \u0019*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u001cB5\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011¢\u0006\u0004\b'\u0010(B\u001f\b\u0016\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b'\u0010*J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011HÆ\u0003JE\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00032\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b&\u0010\"¨\u0006+"}, d2 = {"Landroidx/paging/d1;", "", androidx.exifinterface.media.a.f23244d5, "", UCropPlusActivity.ARG_INDEX, "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "Landroidx/paging/f1$a;", "l", "other", "", "equals", "hashCode", "", "b", "", ak.aF, "d", "e", "originalPageOffsets", "data", "hintOriginalPageOffset", "hintOriginalIndices", "f", "", "toString", ak.av, "[I", "k", "()[I", "Ljava/util/List;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/util/List;", "I", "j", "()I", "i", "<init>", "([ILjava/util/List;ILjava/util/List;)V", "originalPageOffset", "(ILjava/util/List;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final /* data */ class TransformablePage<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final int[] originalPageOffsets;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final List<T> data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int hintOriginalPageOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final List<Integer> hintOriginalIndices;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final TransformablePage<Object> f26388e = new TransformablePage<>(0, CollectionsKt__CollectionsKt.E());

    /* JADX INFO: renamed from: androidx.paging.d1$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TransformablePage.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0001R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/paging/d1$a;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/d1;", ak.av, "EMPTY_INITIAL_PAGE", "Landroidx/paging/d1;", "b", "()Landroidx/paging/d1;", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final <T> TransformablePage<T> a() {
            TransformablePage<T> transformablePage = (TransformablePage<T>) b();
            if (transformablePage != null) {
                return transformablePage;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.TransformablePage<T>");
        }

        @dl.d
        public final TransformablePage<Object> b() {
            return TransformablePage.f26388e;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransformablePage(int i10, @dl.d List<? extends T> data) {
        this(new int[]{i10}, data, i10, null);
        kotlin.jvm.internal.f0.p(data, "data");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransformablePage(@dl.d int[] originalPageOffsets, @dl.d List<? extends T> data, int i10, @dl.e List<Integer> list) {
        kotlin.jvm.internal.f0.p(originalPageOffsets, "originalPageOffsets");
        kotlin.jvm.internal.f0.p(data, "data");
        this.originalPageOffsets = originalPageOffsets;
        this.data = data;
        this.hintOriginalPageOffset = i10;
        this.hintOriginalIndices = list;
        if (!(!(originalPageOffsets.length == 0))) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage".toString());
        }
        if (list == null || list.size() == data.size()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("If originalIndices (size = ");
        kotlin.jvm.internal.f0.m(list);
        sb2.append(list.size());
        sb2.append(") is provided,");
        sb2.append(" it must be same length as data (size = ");
        sb2.append(data.size());
        sb2.append(')');
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransformablePage g(TransformablePage transformablePage, int[] iArr, List list, int i10, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iArr = transformablePage.originalPageOffsets;
        }
        if ((i11 & 2) != 0) {
            list = transformablePage.data;
        }
        if ((i11 & 4) != 0) {
            i10 = transformablePage.hintOriginalPageOffset;
        }
        if ((i11 & 8) != 0) {
            list2 = transformablePage.hintOriginalIndices;
        }
        return transformablePage.f(iArr, list, i10, list2);
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int[] getOriginalPageOffsets() {
        return this.originalPageOffsets;
    }

    @dl.d
    public final List<T> c() {
        return this.data;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getHintOriginalPageOffset() {
        return this.hintOriginalPageOffset;
    }

    @dl.e
    public final List<Integer> e() {
        return this.hintOriginalIndices;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.f0.g(TransformablePage.class, other != null ? other.getClass() : null)) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
        }
        TransformablePage transformablePage = (TransformablePage) other;
        return Arrays.equals(this.originalPageOffsets, transformablePage.originalPageOffsets) && !(kotlin.jvm.internal.f0.g(this.data, transformablePage.data) ^ true) && this.hintOriginalPageOffset == transformablePage.hintOriginalPageOffset && !(kotlin.jvm.internal.f0.g(this.hintOriginalIndices, transformablePage.hintOriginalIndices) ^ true);
    }

    @dl.d
    public final TransformablePage<T> f(@dl.d int[] originalPageOffsets, @dl.d List<? extends T> data, int hintOriginalPageOffset, @dl.e List<Integer> hintOriginalIndices) {
        kotlin.jvm.internal.f0.p(originalPageOffsets, "originalPageOffsets");
        kotlin.jvm.internal.f0.p(data, "data");
        return new TransformablePage<>(originalPageOffsets, data, hintOriginalPageOffset, hintOriginalIndices);
    }

    @dl.d
    public final List<T> h() {
        return this.data;
    }

    public int hashCode() {
        int iHashCode = ((((Arrays.hashCode(this.originalPageOffsets) * 31) + this.data.hashCode()) * 31) + this.hintOriginalPageOffset) * 31;
        List<Integer> list = this.hintOriginalIndices;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @dl.e
    public final List<Integer> i() {
        return this.hintOriginalIndices;
    }

    public final int j() {
        return this.hintOriginalPageOffset;
    }

    @dl.d
    public final int[] k() {
        return this.originalPageOffsets;
    }

    @dl.d
    public final f1.a l(int index, int presentedItemsBefore, int presentedItemsAfter, int originalPageOffsetFirst, int originalPageOffsetLast) {
        fi.l lVarF;
        int i10 = this.hintOriginalPageOffset;
        List<Integer> list = this.hintOriginalIndices;
        if (list != null && (lVarF = CollectionsKt__CollectionsKt.F(list)) != null && lVarF.s(index)) {
            index = this.hintOriginalIndices.get(index).intValue();
        }
        return new f1.a(i10, index, presentedItemsBefore, presentedItemsAfter, originalPageOffsetFirst, originalPageOffsetLast);
    }

    @dl.d
    public String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.originalPageOffsets) + ", data=" + this.data + ", hintOriginalPageOffset=" + this.hintOriginalPageOffset + ", hintOriginalIndices=" + this.hintOriginalIndices + ")";
    }
}
