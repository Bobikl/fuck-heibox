package androidx.paging;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: PagePresenter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0016\b\u0000\u0018\u0000 0*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00026&B\u0015\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b9\u0010:J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bH\u0002J\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001e\u0010\u0015\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u0017\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u001c\u0010 \u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\"\u001a\u00020!J\u000e\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u0004R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010-\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R$\u0010/\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b$\u0010+\u001a\u0004\b.\u0010,R$\u00101\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b0\u0010,R\u0014\u00103\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,R\u0014\u00105\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010,R\u0014\u00107\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010,¨\u0006;"}, d2 = {"Landroidx/paging/PagePresenter;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/b0;", "", UCropPlusActivity.ARG_INDEX, "Lkotlin/b2;", "f", "", "Landroidx/paging/d1;", "k", "Landroidx/paging/PageEvent$Insert;", com.tekartik.sqflite.b.f98589h, "Landroidx/paging/PagePresenter$b;", "callback", "p", "Lfi/l;", "pageOffsetsToDrop", "j", "Landroidx/paging/PageEvent$a;", "drop", "i", "", "toString", "l", "(I)Ljava/lang/Object;", "Landroidx/paging/p;", "r", "localIndex", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/paging/PageEvent;", "pageEvent", "q", "Landroidx/paging/f1$b;", "o", "Landroidx/paging/f1$a;", "d", "", "b", "Ljava/util/List;", "pages", "<set-?>", ak.aF, "I", "()I", "storageCount", "e", "placeholdersBefore", "g", "placeholdersAfter", "m", "originalPageOffsetFirst", "n", "originalPageOffsetLast", ak.av, UiKitSpanObj.TYPE_SIZE, "insertEvent", "<init>", "(Landroidx/paging/PageEvent$Insert;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class PagePresenter<T> implements b0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<TransformablePage<T>> pages;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int storageCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int placeholdersBefore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int placeholdersAfter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final PagePresenter<Object> f25941f = new PagePresenter<>(PageEvent.Insert.INSTANCE.d());

    /* JADX INFO: renamed from: androidx.paging.PagePresenter$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PagePresenter.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/paging/PagePresenter$a;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/PagePresenter;", ak.av, "()Landroidx/paging/PagePresenter;", "INITIAL", "Landroidx/paging/PagePresenter;", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final <T> PagePresenter<T> a() {
            PagePresenter<T> pagePresenter = PagePresenter.f25941f;
            if (pagePresenter != null) {
                return pagePresenter;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.PagePresenter<T>");
        }
    }

    /* JADX INFO: compiled from: PagePresenter.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0010"}, d2 = {"Landroidx/paging/PagePresenter$b;", "", "", CommonNetImpl.POSITION, "count", "Lkotlin/b2;", ak.av, "onInserted", "onRemoved", "Landroidx/paging/LoadType;", "loadType", "", "fromMediator", "Landroidx/paging/v;", "loadState", "b", "paging-common"}, k = 1, mv = {1, 4, 2})
    public interface b {
        void a(int i10, int i11);

        void b(@dl.d LoadType loadType, boolean z10, @dl.d v vVar);

        void onInserted(int i10, int i11);

        void onRemoved(int i10, int i11);
    }

    public PagePresenter(@dl.d PageEvent.Insert<T> insertEvent) {
        kotlin.jvm.internal.f0.p(insertEvent, "insertEvent");
        this.pages = CollectionsKt___CollectionsKt.T5(insertEvent.q());
        this.storageCount = k(insertEvent.q());
        this.placeholdersBefore = insertEvent.s();
        this.placeholdersAfter = insertEvent.r();
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= a()) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + a());
        }
    }

    private final void i(PageEvent.Drop<T> drop, b bVar) {
        int iA = a();
        LoadType loadTypeM = drop.m();
        LoadType loadType = LoadType.PREPEND;
        if (loadTypeM != loadType) {
            int placeholdersAfter = getPlaceholdersAfter();
            this.storageCount = getStorageCount() - j(new fi.l(drop.o(), drop.n()));
            this.placeholdersAfter = drop.q();
            int iA2 = a() - iA;
            if (iA2 > 0) {
                bVar.onInserted(iA, iA2);
            } else if (iA2 < 0) {
                bVar.onRemoved(iA + iA2, -iA2);
            }
            int iQ = drop.q() - (placeholdersAfter - (iA2 < 0 ? Math.min(placeholdersAfter, -iA2) : 0));
            if (iQ > 0) {
                bVar.a(a() - drop.q(), iQ);
            }
            bVar.b(LoadType.APPEND, false, v.NotLoading.INSTANCE.b());
            return;
        }
        int placeholdersBefore = getPlaceholdersBefore();
        this.storageCount = getStorageCount() - j(new fi.l(drop.o(), drop.n()));
        this.placeholdersBefore = drop.q();
        int iA3 = a() - iA;
        if (iA3 > 0) {
            bVar.onInserted(0, iA3);
        } else if (iA3 < 0) {
            bVar.onRemoved(0, -iA3);
        }
        int iMax = Math.max(0, placeholdersBefore + iA3);
        int iQ2 = drop.q() - iMax;
        if (iQ2 > 0) {
            bVar.a(iMax, iQ2);
        }
        bVar.b(loadType, false, v.NotLoading.INSTANCE.b());
    }

    private final int j(fi.l pageOffsetsToDrop) {
        boolean z10;
        Iterator<TransformablePage<T>> it = this.pages.iterator();
        int size = 0;
        while (it.hasNext()) {
            TransformablePage<T> next = it.next();
            int[] iArrK = next.k();
            int length = iArrK.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                if (pageOffsetsToDrop.s(iArrK[i10])) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (z10) {
                size += next.h().size();
                it.remove();
            }
        }
        return size;
    }

    private final int k(List<TransformablePage<T>> list) {
        Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((TransformablePage) it.next()).h().size();
        }
        return size;
    }

    private final int m() {
        Integer numNn = ArraysKt___ArraysKt.Nn(((TransformablePage) CollectionsKt___CollectionsKt.w2(this.pages)).k());
        kotlin.jvm.internal.f0.m(numNn);
        return numNn.intValue();
    }

    private final int n() {
        Integer numPl = ArraysKt___ArraysKt.pl(((TransformablePage) CollectionsKt___CollectionsKt.k3(this.pages)).k());
        kotlin.jvm.internal.f0.m(numPl);
        return numPl.intValue();
    }

    private final void p(PageEvent.Insert<T> insert, final b bVar) {
        int iK = k(insert.q());
        int iA = a();
        int i10 = i0.f26444a[insert.p().ordinal()];
        if (i10 == 1) {
            throw new IllegalArgumentException();
        }
        if (i10 == 2) {
            int iMin = Math.min(getPlaceholdersBefore(), iK);
            int placeholdersBefore = getPlaceholdersBefore() - iMin;
            int i11 = iK - iMin;
            this.pages.addAll(0, insert.q());
            this.storageCount = getStorageCount() + iK;
            this.placeholdersBefore = insert.s();
            bVar.a(placeholdersBefore, iMin);
            bVar.onInserted(0, i11);
            int iA2 = (a() - iA) - i11;
            if (iA2 > 0) {
                bVar.onInserted(0, iA2);
            } else if (iA2 < 0) {
                bVar.onRemoved(0, -iA2);
            }
        } else if (i10 == 3) {
            int iMin2 = Math.min(getPlaceholdersAfter(), iK);
            int placeholdersBefore2 = getPlaceholdersBefore() + getStorageCount();
            int i12 = iK - iMin2;
            List<TransformablePage<T>> list = this.pages;
            list.addAll(list.size(), insert.q());
            this.storageCount = getStorageCount() + iK;
            this.placeholdersAfter = insert.r();
            bVar.a(placeholdersBefore2, iMin2);
            bVar.onInserted(placeholdersBefore2 + iMin2, i12);
            int iA3 = (a() - iA) - i12;
            if (iA3 > 0) {
                bVar.onInserted(a() - iA3, iA3);
            } else if (iA3 < 0) {
                bVar.onRemoved(a(), -iA3);
            }
        }
        insert.o().b(new yh.q<LoadType, Boolean, v, b2>() { // from class: androidx.paging.PagePresenter$insertPage$1
            {
                super(3);
            }

            public final void a(@dl.d LoadType type, boolean z10, @dl.d v state) {
                kotlin.jvm.internal.f0.p(type, "type");
                kotlin.jvm.internal.f0.p(state, "state");
                bVar.b(type, z10, state);
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ b2 invoke(LoadType loadType, Boolean bool, v vVar) {
                a(loadType, bool.booleanValue(), vVar);
                return b2.f124493a;
            }
        });
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

    @dl.d
    public final f1.a d(int index) {
        int i10 = 0;
        int placeholdersBefore = index - getPlaceholdersBefore();
        while (placeholdersBefore >= this.pages.get(i10).h().size() && i10 < CollectionsKt__CollectionsKt.G(this.pages)) {
            placeholdersBefore -= this.pages.get(i10).h().size();
            i10++;
        }
        return this.pages.get(i10).l(placeholdersBefore, index - getPlaceholdersBefore(), ((a() - index) - getPlaceholdersAfter()) - 1, m(), n());
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

    @Override // androidx.paging.b0
    @dl.d
    public T h(int localIndex) {
        int size = this.pages.size();
        int i10 = 0;
        while (i10 < size) {
            int size2 = this.pages.get(i10).h().size();
            if (size2 > localIndex) {
                break;
            }
            localIndex -= size2;
            i10++;
        }
        return this.pages.get(i10).h().get(localIndex);
    }

    @dl.e
    public final T l(int index) {
        f(index);
        int placeholdersBefore = index - getPlaceholdersBefore();
        if (placeholdersBefore < 0 || placeholdersBefore >= getStorageCount()) {
            return null;
        }
        return h(placeholdersBefore);
    }

    @dl.d
    public final f1.b o() {
        int storageCount = getStorageCount() / 2;
        return new f1.b(storageCount, storageCount, m(), n());
    }

    public final void q(@dl.d PageEvent<T> pageEvent, @dl.d b callback) {
        kotlin.jvm.internal.f0.p(pageEvent, "pageEvent");
        kotlin.jvm.internal.f0.p(callback, "callback");
        if (pageEvent instanceof PageEvent.Insert) {
            p((PageEvent.Insert) pageEvent, callback);
            return;
        }
        if (pageEvent instanceof PageEvent.Drop) {
            i((PageEvent.Drop) pageEvent, callback);
        } else if (pageEvent instanceof PageEvent.LoadStateUpdate) {
            PageEvent.LoadStateUpdate loadStateUpdate = (PageEvent.LoadStateUpdate) pageEvent;
            callback.b(loadStateUpdate.n(), loadStateUpdate.l(), loadStateUpdate.m());
        }
    }

    @dl.d
    public final p<T> r() {
        int placeholdersBefore = getPlaceholdersBefore();
        int placeholdersAfter = getPlaceholdersAfter();
        List<TransformablePage<T>> list = this.pages;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.x.n0(arrayList, ((TransformablePage) it.next()).h());
        }
        return new p<>(placeholdersBefore, placeholdersAfter, arrayList);
    }

    @dl.d
    public String toString() {
        int storageCount = getStorageCount();
        ArrayList arrayList = new ArrayList(storageCount);
        for (int i10 = 0; i10 < storageCount; i10++) {
            arrayList.add(h(i10));
        }
        return "[(" + getPlaceholdersBefore() + " placeholders), " + CollectionsKt___CollectionsKt.h3(arrayList, null, null, null, 0, null, null, 63, null) + ", (" + getPlaceholdersAfter() + " placeholders)]";
    }
}
