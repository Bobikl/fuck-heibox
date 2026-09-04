package androidx.paging;

import androidx.annotation.RestrictTo;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: PagedStorage.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b(\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0001WB\t\b\u0016¢\u0006\u0004\bY\u0010ZB+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\bY\u0010[B\u0017\b\u0012\u0012\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\bY\u0010]J:\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002Jb\u0010\u0017\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00062B\b\u0004\u0010\u0016\u001a<\u0012\u001d\u0012\u001b\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00028\u00010\u0012H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001c\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000JD\u0010 \u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u0017\u0010!\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0000\u0018\u00010%2\u0006\u0010$\u001a\u00020#J\u001a\u0010(\u001a\u0004\u0018\u00018\u00002\u0006\u0010'\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b(\u0010\"J\u0016\u0010)\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006J\u0016\u0010*\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006J\u001e\u0010,\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006J/\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b.\u0010/J/\u00100\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b0\u0010/J-\u00101\u001a\u00020\u000e2\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b1\u00102J-\u00103\u001a\u00020\u000e2\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b3\u00102J\b\u00105\u001a\u000204H\u0016R$\u00109\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u0010?\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R$\u0010B\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R$\u0010\u000b\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b=\u0010<\u001a\u0004\bC\u0010>R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER$\u0010F\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\b7\u0010>R\u0016\u0010G\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010<R\u0014\u0010J\u001a\u00028\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u00028\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010IR$\u0010P\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010>\"\u0004\b<\u0010OR\u0011\u0010R\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bQ\u0010>R\u0016\u0010T\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010IR\u0016\u0010V\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010IR\u0014\u0010X\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010>¨\u0006^"}, d2 = {"Landroidx/paging/m0;", "", androidx.exifinterface.media.a.f23244d5, "Ljava/util/AbstractList;", "Landroidx/paging/LegacyPageFetcher$a;", "Landroidx/paging/b0;", "", "leadingNulls", "Landroidx/paging/q0$b$b;", "page", "trailingNulls", "positionOffset", "", "counted", "Lkotlin/b2;", "y", androidx.exifinterface.media.a.X4, "localIndex", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "pageInternalIndex", "onLastPage", "N", "(ILyh/p;)Ljava/lang/Object;", "maxSize", "requiredRemaining", "localPageIndex", "B", "L", "Landroidx/paging/m0$a;", "callback", "x", RXScreenCaptureService.KEY_HEIGHT, "(I)Ljava/lang/Object;", "Landroidx/paging/PagedList$d;", "config", "Landroidx/paging/t0;", RXScreenCaptureService.KEY_WIDTH, UCropPlusActivity.ARG_INDEX, "get", androidx.exifinterface.media.a.S4, "D", "countToBeAdded", "J", "insertNulls", "R", "(ZIILandroidx/paging/m0$a;)Z", "Q", "F", "(Landroidx/paging/q0$b$b;Landroidx/paging/m0$a;)V", "m", "", "toString", "", "b", "Ljava/util/List;", "pages", "<set-?>", ak.aF, "I", "e", "()I", "placeholdersBefore", "d", "g", "placeholdersAfter", "v", "f", "Z", "storageCount", "lastLoadAroundLocalIndex", "q", "()Ljava/lang/Object;", "firstLoadedItem", "t", "lastLoadedItem", "value", ak.aB, "(I)V", "lastLoadAroundIndex", ak.aG, "middleOfLoadedRange", "j", "prevKey", "i", "nextKey", ak.av, UiKitSpanObj.TYPE_SIZE, "<init>", "()V", "(ILandroidx/paging/q0$b$b;I)V", "other", "(Landroidx/paging/m0;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class m0<T> extends AbstractList<T> implements LegacyPageFetcher.a<Object>, b0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<q0.b.Page<?, T>> pages;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int placeholdersBefore;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int placeholdersAfter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int positionOffset;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean counted;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int storageCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int lastLoadAroundLocalIndex;

    /* JADX INFO: compiled from: PagedStorage.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000f"}, d2 = {"Landroidx/paging/m0$a;", "", "", "count", "Lkotlin/b2;", "e", "leadingNulls", "changed", "added", ak.av, "endPosition", "j", "startOfDrops", "i", RXScreenCaptureService.KEY_HEIGHT, "paging-common"}, k = 1, mv = {1, 4, 2})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public interface a {
        void a(int i10, int i11, int i12);

        void e(int i10);

        void h(int i10, int i11);

        void i(int i10, int i11);

        void j(int i10, int i11, int i12);
    }

    public m0() {
        this.pages = new ArrayList();
        this.counted = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(int i10, @dl.d q0.b.Page<?, T> page, int i11) {
        this();
        kotlin.jvm.internal.f0.p(page, "page");
        y(i10, page, i11, 0, true);
    }

    private m0(m0<T> m0Var) {
        ArrayList arrayList = new ArrayList();
        this.pages = arrayList;
        this.counted = true;
        arrayList.addAll(m0Var.pages);
        this.placeholdersBefore = m0Var.getPlaceholdersBefore();
        this.placeholdersAfter = m0Var.getPlaceholdersAfter();
        this.positionOffset = m0Var.positionOffset;
        this.counted = m0Var.counted;
        this.storageCount = m0Var.getStorageCount();
        this.lastLoadAroundLocalIndex = m0Var.lastLoadAroundLocalIndex;
    }

    public static /* synthetic */ void A(m0 m0Var, int i10, q0.b.Page page, int i11, int i12, a aVar, boolean z10, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            z10 = true;
        }
        m0Var.x(i10, page, i11, i12, aVar, z10);
    }

    private final boolean B(int maxSize, int requiredRemaining, int localPageIndex) {
        return getStorageCount() > maxSize && this.pages.size() > 2 && getStorageCount() - this.pages.get(localPageIndex).i().size() >= requiredRemaining;
    }

    public static /* synthetic */ void G(m0 m0Var, q0.b.Page page, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        m0Var.F(page, aVar);
    }

    private final <V> V N(int localIndex, yh.p<? super q0.b.Page<?, T>, ? super Integer, ? extends V> onLastPage) {
        int size = this.pages.size();
        int i10 = 0;
        while (i10 < size) {
            int size2 = ((q0.b.Page) this.pages.get(i10)).i().size();
            if (size2 > localIndex) {
                break;
            }
            localIndex -= size2;
            i10++;
        }
        return onLastPage.invoke((Object) this.pages.get(i10), Integer.valueOf(localIndex));
    }

    public static /* synthetic */ void o(m0 m0Var, q0.b.Page page, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        m0Var.m(page, aVar);
    }

    private final void y(int i10, q0.b.Page<?, T> page, int i11, int i12, boolean z10) {
        this.placeholdersBefore = i10;
        this.pages.clear();
        this.pages.add(page);
        this.placeholdersAfter = i11;
        this.positionOffset = i12;
        this.storageCount = page.i().size();
        this.counted = z10;
        this.lastLoadAroundLocalIndex = page.i().size() / 2;
    }

    public final boolean D(int maxSize, int requiredRemaining) {
        return B(maxSize, requiredRemaining, this.pages.size() - 1);
    }

    public final boolean E(int maxSize, int requiredRemaining) {
        return B(maxSize, requiredRemaining, 0);
    }

    public final void F(@dl.d q0.b.Page<?, T> page, @dl.e a callback) {
        kotlin.jvm.internal.f0.p(page, "page");
        int size = page.i().size();
        if (size == 0) {
            return;
        }
        this.pages.add(0, page);
        this.storageCount = getStorageCount() + size;
        int iMin = Math.min(getPlaceholdersBefore(), size);
        int i10 = size - iMin;
        if (iMin != 0) {
            this.placeholdersBefore = getPlaceholdersBefore() - iMin;
        }
        this.positionOffset -= i10;
        if (callback != null) {
            callback.a(getPlaceholdersBefore(), iMin, i10);
        }
    }

    public /* bridge */ Object H(int i10) {
        return super.remove(i10);
    }

    public final void I(int i10) {
        this.lastLoadAroundLocalIndex = fi.u.I(i10 - getPlaceholdersBefore(), 0, getStorageCount() - 1);
    }

    public final boolean J(int maxSize, int requiredRemaining, int countToBeAdded) {
        return getStorageCount() + countToBeAdded > maxSize && this.pages.size() > 1 && getStorageCount() >= requiredRemaining;
    }

    @dl.d
    public final m0<T> L() {
        return new m0<>(this);
    }

    public final boolean Q(boolean insertNulls, int maxSize, int requiredRemaining, @dl.d a callback) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        int i10 = 0;
        while (D(maxSize, requiredRemaining)) {
            List<q0.b.Page<?, T>> list = this.pages;
            int size = list.remove(list.size() - 1).i().size();
            i10 += size;
            this.storageCount = getStorageCount() - size;
        }
        this.lastLoadAroundLocalIndex = fi.u.B(this.lastLoadAroundLocalIndex, getStorageCount() - 1);
        if (i10 > 0) {
            int placeholdersBefore = getPlaceholdersBefore() + getStorageCount();
            if (insertNulls) {
                this.placeholdersAfter = getPlaceholdersAfter() + i10;
                callback.h(placeholdersBefore, i10);
            } else {
                callback.i(placeholdersBefore, i10);
            }
        }
        return i10 > 0;
    }

    public final boolean R(boolean insertNulls, int maxSize, int requiredRemaining, @dl.d a callback) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        int i10 = 0;
        while (E(maxSize, requiredRemaining)) {
            int size = this.pages.remove(0).i().size();
            i10 += size;
            this.storageCount = getStorageCount() - size;
        }
        this.lastLoadAroundLocalIndex = fi.u.u(this.lastLoadAroundLocalIndex - i10, 0);
        if (i10 > 0) {
            if (insertNulls) {
                int placeholdersBefore = getPlaceholdersBefore();
                this.placeholdersBefore = getPlaceholdersBefore() + i10;
                callback.h(placeholdersBefore, i10);
            } else {
                this.positionOffset += i10;
                callback.i(getPlaceholdersBefore(), i10);
            }
        }
        return i10 > 0;
    }

    @Override // androidx.paging.b0
    public int a() {
        return getPlaceholdersBefore() + getStorageCount() + getPlaceholdersAfter();
    }

    @Override // androidx.paging.b0
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getStorageCount() {
        return this.storageCount;
    }

    @Override // androidx.paging.b0
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    @Override // androidx.paging.b0
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    @Override // java.util.AbstractList, java.util.List
    @dl.e
    public T get(int index) {
        int placeholdersBefore = index - getPlaceholdersBefore();
        if (index >= 0 && index < size()) {
            if (placeholdersBefore < 0 || placeholdersBefore >= getStorageCount()) {
                return null;
            }
            return h(placeholdersBefore);
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
    }

    @Override // androidx.paging.b0
    @dl.d
    public T h(int localIndex) {
        int size = this.pages.size();
        int i10 = 0;
        while (i10 < size) {
            int size2 = ((q0.b.Page) this.pages.get(i10)).i().size();
            if (size2 > localIndex) {
                break;
            }
            localIndex -= size2;
            i10++;
        }
        return (T) ((q0.b.Page) this.pages.get(i10)).i().get(localIndex);
    }

    @Override // androidx.paging.LegacyPageFetcher.a
    @dl.e
    public Object i() {
        if (!this.counted || getPlaceholdersAfter() > 0) {
            return ((q0.b.Page) CollectionsKt___CollectionsKt.k3(this.pages)).l();
        }
        return null;
    }

    @Override // androidx.paging.LegacyPageFetcher.a
    @dl.e
    public Object j() {
        if (!this.counted || getPlaceholdersBefore() + this.positionOffset > 0) {
            return ((q0.b.Page) CollectionsKt___CollectionsKt.w2(this.pages)).m();
        }
        return null;
    }

    public final void m(@dl.d q0.b.Page<?, T> page, @dl.e a callback) {
        kotlin.jvm.internal.f0.p(page, "page");
        int size = page.i().size();
        if (size == 0) {
            return;
        }
        this.pages.add(page);
        this.storageCount = getStorageCount() + size;
        int iMin = Math.min(getPlaceholdersAfter(), size);
        int i10 = size - iMin;
        if (iMin != 0) {
            this.placeholdersAfter = getPlaceholdersAfter() - iMin;
        }
        if (callback != null) {
            callback.j((getPlaceholdersBefore() + getStorageCount()) - size, iMin, i10);
        }
    }

    @dl.d
    public final T q() {
        return (T) CollectionsKt___CollectionsKt.w2(((q0.b.Page) CollectionsKt___CollectionsKt.w2(this.pages)).i());
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i10) {
        return (T) H(i10);
    }

    public final int s() {
        return getPlaceholdersBefore() + this.lastLoadAroundLocalIndex;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }

    @dl.d
    public final T t() {
        return (T) CollectionsKt___CollectionsKt.k3(((q0.b.Page) CollectionsKt___CollectionsKt.k3(this.pages)).i());
    }

    @Override // java.util.AbstractCollection
    @dl.d
    public String toString() {
        return "leading " + getPlaceholdersBefore() + ", storage " + getStorageCount() + ", trailing " + getPlaceholdersAfter() + ' ' + CollectionsKt___CollectionsKt.h3(this.pages, " ", null, null, 0, null, null, 62, null);
    }

    public final int u() {
        return getPlaceholdersBefore() + (getStorageCount() / 2);
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getPositionOffset() {
        return this.positionOffset;
    }

    @dl.e
    public final PagingState<?, T> w(@dl.d PagedList.d config) {
        kotlin.jvm.internal.f0.p(config, "config");
        if (this.pages.isEmpty()) {
            return null;
        }
        List listQ5 = CollectionsKt___CollectionsKt.Q5(this.pages);
        if (listQ5 != null) {
            return new PagingState<>(listQ5, Integer.valueOf(s()), new n0(config.pageSize, config.prefetchDistance, config.enablePlaceholders, config.initialLoadSizeHint, config.maxSize, 0, 32, null), getPlaceholdersBefore());
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.paging.PagingSource.LoadResult.Page<kotlin.Any, T>>");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void x(int i10, @dl.d q0.b.Page<?, T> page, int i11, int i12, @dl.d a callback, boolean z10) {
        kotlin.jvm.internal.f0.p(page, "page");
        kotlin.jvm.internal.f0.p(callback, "callback");
        y(i10, page, i11, i12, z10);
        callback.e(size());
    }
}
