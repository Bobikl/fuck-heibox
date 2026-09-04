package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: renamed from: androidx.paging.t0, reason: from toString */
/* JADX INFO: compiled from: PagingState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B=\u0012\u0018\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u001d\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010*\u001a\u00020&\u0012\b\b\u0001\u0010,\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0005J\u000f\u0010\u000f\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0012H\u0016JY\u0010\u001b\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00142\u0006\u0010\t\u001a\u00020\u000726\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00028\u00020\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR)\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010*\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, d2 = {"Landroidx/paging/t0;", "", "Key", "Value", "other", "", "equals", "", "hashCode", "anchorPosition", ak.aF, "(I)Ljava/lang/Object;", "Landroidx/paging/q0$b$b;", "d", "i", "e", "()Ljava/lang/Object;", "j", "", "toString", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function2;", "Lkotlin/m0;", "name", "pageIndex", UCropPlusActivity.ARG_INDEX, "block", "b", "(ILyh/p;)Ljava/lang/Object;", "", ak.av, "Ljava/util/List;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/util/List;", "pages", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "Landroidx/paging/n0;", "Landroidx/paging/n0;", "g", "()Landroidx/paging/n0;", "config", "I", "leadingPlaceholderCount", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Landroidx/paging/n0;I)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class PagingState<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final List<q0.b.Page<Key, Value>> pages;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final Integer anchorPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final n0 config;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int leadingPlaceholderCount;

    public PagingState(@dl.d List<q0.b.Page<Key, Value>> pages, @dl.e Integer num, @dl.d n0 config, @androidx.annotation.f0(from = 0) int i10) {
        kotlin.jvm.internal.f0.p(pages, "pages");
        kotlin.jvm.internal.f0.p(config, "config");
        this.pages = pages;
        this.anchorPosition = num;
        this.config = config;
        this.leadingPlaceholderCount = i10;
    }

    public final <T> T b(int anchorPosition, @dl.d yh.p<? super Integer, ? super Integer, ? extends T> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        int size = anchorPosition - this.leadingPlaceholderCount;
        int i10 = 0;
        while (i10 < CollectionsKt__CollectionsKt.G(h()) && size > CollectionsKt__CollectionsKt.G(h().get(i10).i())) {
            size -= h().get(i10).i().size();
            i10++;
        }
        return block.invoke(Integer.valueOf(i10), Integer.valueOf(size));
    }

    @dl.e
    public final Value c(int anchorPosition) {
        boolean z10;
        List<q0.b.Page<Key, Value>> list = this.pages;
        int i10 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                if (!((q0.b.Page) it.next()).i().isEmpty()) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        if (z10) {
            return null;
        }
        int size = anchorPosition - this.leadingPlaceholderCount;
        while (i10 < CollectionsKt__CollectionsKt.G(h()) && size > CollectionsKt__CollectionsKt.G(h().get(i10).i())) {
            size -= h().get(i10).i().size();
            i10++;
        }
        Iterator<T> it2 = this.pages.iterator();
        while (it2.hasNext()) {
            q0.b.Page page = (q0.b.Page) it2.next();
            if (!page.i().isEmpty()) {
                List<q0.b.Page<Key, Value>> list2 = this.pages;
                ListIterator<q0.b.Page<Key, Value>> listIterator = list2.listIterator(list2.size());
                while (listIterator.hasPrevious()) {
                    q0.b.Page<Key, Value> pagePrevious = listIterator.previous();
                    if (!pagePrevious.i().isEmpty()) {
                        if (size < 0) {
                            return (Value) CollectionsKt___CollectionsKt.w2(page.i());
                        }
                        return (i10 != CollectionsKt__CollectionsKt.G(this.pages) || size <= CollectionsKt__CollectionsKt.G(((q0.b.Page) CollectionsKt___CollectionsKt.k3(this.pages)).i())) ? this.pages.get(i10).i().get(size) : (Value) CollectionsKt___CollectionsKt.k3(pagePrevious.i());
                    }
                }
                throw new NoSuchElementException("List contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @dl.e
    public final q0.b.Page<Key, Value> d(int anchorPosition) {
        List<q0.b.Page<Key, Value>> list = this.pages;
        int i10 = 0;
        boolean z10 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((q0.b.Page) it.next()).i().isEmpty()) {
                    z10 = false;
                    break;
                }
            }
        }
        if (z10) {
            return null;
        }
        int size = anchorPosition - this.leadingPlaceholderCount;
        while (i10 < CollectionsKt__CollectionsKt.G(h()) && size > CollectionsKt__CollectionsKt.G(h().get(i10).i())) {
            size -= h().get(i10).i().size();
            i10++;
        }
        return size < 0 ? (q0.b.Page) CollectionsKt___CollectionsKt.w2(this.pages) : this.pages.get(i10);
    }

    @dl.e
    public final Value e() {
        Object next;
        List<Value> listI;
        Iterator<T> it = this.pages.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!((q0.b.Page) next).i().isEmpty()));
        q0.b.Page page = (q0.b.Page) next;
        if (page == null || (listI = page.i()) == null) {
            return null;
        }
        return (Value) CollectionsKt___CollectionsKt.B2(listI);
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof PagingState) {
            PagingState pagingState = (PagingState) other;
            if (kotlin.jvm.internal.f0.g(this.pages, pagingState.pages) && kotlin.jvm.internal.f0.g(this.anchorPosition, pagingState.anchorPosition) && kotlin.jvm.internal.f0.g(this.config, pagingState.config) && this.leadingPlaceholderCount == pagingState.leadingPlaceholderCount) {
                return true;
            }
        }
        return false;
    }

    @dl.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getAnchorPosition() {
        return this.anchorPosition;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final n0 getConfig() {
        return this.config;
    }

    @dl.d
    public final List<q0.b.Page<Key, Value>> h() {
        return this.pages;
    }

    public int hashCode() {
        int iHashCode = this.pages.hashCode();
        Integer num = this.anchorPosition;
        return iHashCode + (num != null ? num.hashCode() : 0) + this.config.hashCode() + this.leadingPlaceholderCount;
    }

    public final boolean i() {
        List<q0.b.Page<Key, Value>> list = this.pages;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((q0.b.Page) it.next()).i().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @dl.e
    public final Value j() {
        q0.b.Page<Key, Value> pagePrevious;
        List<Value> listI;
        List<q0.b.Page<Key, Value>> list = this.pages;
        ListIterator<q0.b.Page<Key, Value>> listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                pagePrevious = null;
                break;
            }
            pagePrevious = listIterator.previous();
        } while (!(!pagePrevious.i().isEmpty()));
        q0.b.Page<Key, Value> page = pagePrevious;
        if (page == null || (listI = page.i()) == null) {
            return null;
        }
        return (Value) CollectionsKt___CollectionsKt.q3(listI);
    }

    @dl.d
    public String toString() {
        return "PagingState(pages=" + this.pages + ", anchorPosition=" + this.anchorPosition + ", config=" + this.config + ", leadingPlaceholderCount=" + this.leadingPlaceholderCount + ')';
    }
}
