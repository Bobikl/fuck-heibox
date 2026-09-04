package androidx.paging;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: NullPaddedListDiffHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a8\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000\u001a:\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0000\u001a,\u0010\u000f\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0000¨\u0006\u0010"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/b0;", "newList", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "Landroidx/paging/a0;", ak.av, "Landroidx/recyclerview/widget/ListUpdateCallback;", "callback", "diffResult", "Lkotlin/b2;", "b", "", "oldPosition", ak.aF, "paging-runtime_release"}, k = 2, mv = {1, 4, 2})
public final class c0 {

    /* JADX INFO: compiled from: NullPaddedListDiffHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"androidx/paging/c0$a", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "", "oldItemPosition", "newItemPosition", "", "getChangePayload", "getOldListSize", "getNewListSize", "", "areItemsTheSame", "areContentsTheSame", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
    public static final class a extends DiffUtil.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0 f26371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f26372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DiffUtil.ItemCallback f26373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f26375e;

        a(b0<T> b0Var, b0 b0Var2, DiffUtil.ItemCallback itemCallback, int i10, int i11) {
            this.f26371a = b0Var;
            this.f26372b = b0Var2;
            this.f26373c = itemCallback;
            this.f26374d = i10;
            this.f26375e = i11;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            Object objH = this.f26371a.h(oldItemPosition);
            Object objH2 = this.f26372b.h(newItemPosition);
            if (objH == objH2) {
                return true;
            }
            return this.f26373c.areContentsTheSame(objH, objH2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            Object objH = this.f26371a.h(oldItemPosition);
            Object objH2 = this.f26372b.h(newItemPosition);
            if (objH == objH2) {
                return true;
            }
            return this.f26373c.areItemsTheSame(objH, objH2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        @dl.e
        public Object getChangePayload(int oldItemPosition, int newItemPosition) {
            Object objH = this.f26371a.h(oldItemPosition);
            Object objH2 = this.f26372b.h(newItemPosition);
            return objH == objH2 ? Boolean.TRUE : this.f26373c.getChangePayload(objH, objH2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* JADX INFO: renamed from: getNewListSize, reason: from getter */
        public int getF26375e() {
            return this.f26375e;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* JADX INFO: renamed from: getOldListSize, reason: from getter */
        public int getF26374d() {
            return this.f26374d;
        }
    }

    @dl.d
    public static final <T> a0 a(@dl.d b0<T> computeDiff, @dl.d b0<T> newList, @dl.d DiffUtil.ItemCallback<T> diffCallback) {
        kotlin.jvm.internal.f0.p(computeDiff, "$this$computeDiff");
        kotlin.jvm.internal.f0.p(newList, "newList");
        kotlin.jvm.internal.f0.p(diffCallback, "diffCallback");
        a aVar = new a(computeDiff, newList, diffCallback, computeDiff.getStorageCount(), newList.getStorageCount());
        boolean z10 = true;
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(aVar, true);
        kotlin.jvm.internal.f0.o(diffResultCalculateDiff, "DiffUtil.calculateDiff(\n…    },\n        true\n    )");
        Iterable iterableW1 = fi.u.W1(0, computeDiff.getStorageCount());
        if ((iterableW1 instanceof Collection) && ((Collection) iterableW1).isEmpty()) {
            z10 = false;
        } else {
            Iterator<T> it = iterableW1.iterator();
            while (it.hasNext()) {
                if (diffResultCalculateDiff.convertOldPositionToNew(((kotlin.collections.k0) it).nextInt()) != -1) {
                }
            }
            z10 = false;
        }
        return new a0(diffResultCalculateDiff, z10);
    }

    public static final <T> void b(@dl.d b0<T> dispatchDiff, @dl.d ListUpdateCallback callback, @dl.d b0<T> newList, @dl.d a0 diffResult) {
        kotlin.jvm.internal.f0.p(dispatchDiff, "$this$dispatchDiff");
        kotlin.jvm.internal.f0.p(callback, "callback");
        kotlin.jvm.internal.f0.p(newList, "newList");
        kotlin.jvm.internal.f0.p(diffResult, "diffResult");
        if (diffResult.getHasOverlap()) {
            e0.f26394a.a(dispatchDiff, newList, callback, diffResult);
        } else {
            f.f26407a.b(callback, dispatchDiff, newList);
        }
    }

    public static final int c(@dl.d b0<?> transformAnchorIndex, @dl.d a0 diffResult, @dl.d b0<?> newList, int i10) {
        int iConvertOldPositionToNew;
        kotlin.jvm.internal.f0.p(transformAnchorIndex, "$this$transformAnchorIndex");
        kotlin.jvm.internal.f0.p(diffResult, "diffResult");
        kotlin.jvm.internal.f0.p(newList, "newList");
        if (!diffResult.getHasOverlap()) {
            return fi.u.J(i10, fi.u.W1(0, newList.a()));
        }
        int iE = i10 - transformAnchorIndex.getPlaceholdersBefore();
        int iB = transformAnchorIndex.getStorageCount();
        if (iE >= 0 && iB > iE) {
            for (int i11 = 0; i11 <= 29; i11++) {
                int i12 = ((i11 / 2) * (i11 % 2 == 1 ? -1 : 1)) + iE;
                if (i12 >= 0 && i12 < transformAnchorIndex.getStorageCount() && (iConvertOldPositionToNew = diffResult.getDiff().convertOldPositionToNew(i12)) != -1) {
                    return iConvertOldPositionToNew + newList.getPlaceholdersBefore();
                }
            }
        }
        return fi.u.J(i10, fi.u.W1(0, newList.a()));
    }
}
