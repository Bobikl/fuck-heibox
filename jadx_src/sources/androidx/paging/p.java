package androidx.paging;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: ItemSnapshotList.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B)\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\u0007\u0010\nR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\n¨\u0006\u0018"}, d2 = {"Landroidx/paging/p;", androidx.exifinterface.media.a.f23244d5, "Lkotlin/collections/b;", "", UCropPlusActivity.ARG_INDEX, "get", "(I)Ljava/lang/Object;", "b", "I", "e", "()I", "placeholdersBefore", ak.aF, "placeholdersAfter", "", "d", "Ljava/util/List;", ak.av, "()Ljava/util/List;", "items", "getSize", UiKitSpanObj.TYPE_SIZE, "<init>", "(IILjava/util/List;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class p<T> extends kotlin.collections.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int placeholdersBefore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int placeholdersAfter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<T> items;

    /* JADX WARN: Multi-variable type inference failed */
    public p(@androidx.annotation.f0(from = 0) int i10, @androidx.annotation.f0(from = 0) int i11, @dl.d List<? extends T> items) {
        kotlin.jvm.internal.f0.p(items, "items");
        this.placeholdersBefore = i10;
        this.placeholdersAfter = i11;
        this.items = items;
    }

    @dl.d
    public final List<T> a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    @Override // kotlin.collections.b, java.util.List
    @dl.e
    public T get(int index) {
        int i10 = this.placeholdersBefore;
        if (index >= 0 && i10 > index) {
            return null;
        }
        int size = this.items.size() + i10;
        if (i10 <= index && size > index) {
            return this.items.get(index - this.placeholdersBefore);
        }
        int size2 = this.placeholdersBefore + this.items.size();
        int size3 = size();
        if (size2 <= index && size3 > index) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + index + " in ItemSnapshotList of size " + size());
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int getF140741e() {
        return this.placeholdersBefore + this.items.size() + this.placeholdersAfter;
    }
}
