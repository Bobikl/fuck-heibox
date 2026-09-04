package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;

/* JADX INFO: compiled from: ViewportHint.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\fB)\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u0007\u0010\nR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Landroidx/paging/f1;", "", "other", "", "equals", "", "hashCode", ak.av, "I", "d", "()I", "presentedItemsBefore", "b", ak.aF, "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIII)V", "Landroidx/paging/f1$b;", "Landroidx/paging/f1$a;", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int presentedItemsBefore;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int presentedItemsAfter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int originalPageOffsetFirst;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int originalPageOffsetLast;

    /* JADX INFO: compiled from: ViewportHint.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0016"}, d2 = {"Landroidx/paging/f1$a;", "Landroidx/paging/f1;", "", "other", "", "equals", "", "hashCode", "", "toString", "e", "I", "f", "()I", "pageOffset", "indexInPage", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIIIII)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class a extends f1 {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int pageOffset;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final int indexInPage;

        public a(int i10, int i11, int i12, int i13, int i14, int i15) {
            super(i12, i13, i14, i15, null);
            this.pageOffset = i10;
            this.indexInPage = i11;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getIndexInPage() {
            return this.indexInPage;
        }

        @Override // androidx.paging.f1
        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.pageOffset == aVar.pageOffset && this.indexInPage == aVar.indexInPage && getPresentedItemsBefore() == aVar.getPresentedItemsBefore() && getPresentedItemsAfter() == aVar.getPresentedItemsAfter() && getOriginalPageOffsetFirst() == aVar.getOriginalPageOffsetFirst() && getOriginalPageOffsetLast() == aVar.getOriginalPageOffsetLast();
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getPageOffset() {
            return this.pageOffset;
        }

        @Override // androidx.paging.f1
        public int hashCode() {
            return super.hashCode() + this.pageOffset + this.indexInPage;
        }

        @dl.d
        public String toString() {
            return StringsKt__IndentKt.r("ViewportHint.Access(\n            |    pageOffset=" + this.pageOffset + ",\n            |    indexInPage=" + this.indexInPage + ",\n            |    presentedItemsBefore=" + getPresentedItemsBefore() + ",\n            |    presentedItemsAfter=" + getPresentedItemsAfter() + ",\n            |    originalPageOffsetFirst=" + getOriginalPageOffsetFirst() + ",\n            |    originalPageOffsetLast=" + getOriginalPageOffsetLast() + ",\n            |)", null, 1, null);
        }
    }

    /* JADX INFO: compiled from: ViewportHint.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Landroidx/paging/f1$b;", "Landroidx/paging/f1;", "", "toString", "", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIII)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class b extends f1 {
        public b(int i10, int i11, int i12, int i13) {
            super(i10, i11, i12, i13, null);
        }

        @dl.d
        public String toString() {
            return StringsKt__IndentKt.r("ViewportHint.Initial(\n            |    presentedItemsBefore=" + getPresentedItemsBefore() + ",\n            |    presentedItemsAfter=" + getPresentedItemsAfter() + ",\n            |    originalPageOffsetFirst=" + getOriginalPageOffsetFirst() + ",\n            |    originalPageOffsetLast=" + getOriginalPageOffsetLast() + ",\n            |)", null, 1, null);
        }
    }

    private f1(int i10, int i11, int i12, int i13) {
        this.presentedItemsBefore = i10;
        this.presentedItemsAfter = i11;
        this.originalPageOffsetFirst = i12;
        this.originalPageOffsetLast = i13;
    }

    public /* synthetic */ f1(int i10, int i11, int i12, int i13, kotlin.jvm.internal.u uVar) {
        this(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getOriginalPageOffsetFirst() {
        return this.originalPageOffsetFirst;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getOriginalPageOffsetLast() {
        return this.originalPageOffsetLast;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPresentedItemsAfter() {
        return this.presentedItemsAfter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPresentedItemsBefore() {
        return this.presentedItemsBefore;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) other;
        return this.presentedItemsBefore == f1Var.presentedItemsBefore && this.presentedItemsAfter == f1Var.presentedItemsAfter && this.originalPageOffsetFirst == f1Var.originalPageOffsetFirst && this.originalPageOffsetLast == f1Var.originalPageOffsetLast;
    }

    public int hashCode() {
        return this.presentedItemsBefore + this.presentedItemsAfter + this.originalPageOffsetFirst + this.originalPageOffsetLast;
    }
}
