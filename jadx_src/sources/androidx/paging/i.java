package androidx.paging;

import com.umeng.analytics.pro.ak;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.j1(otherwise = 2)
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J\u0014\u0010\f\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/paging/i;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/PageEvent$a;", androidx.core.app.o0.I0, "Lkotlin/b2;", "e", "Landroidx/paging/PageEvent$Insert;", ak.aF, "Landroidx/paging/PageEvent$b;", "d", "Landroidx/paging/PageEvent;", ak.av, "", "b", "", "I", "placeholdersBefore", "placeholdersAfter", "Ljava/util/ArrayDeque;", "Landroidx/paging/d1;", "Ljava/util/ArrayDeque;", "pages", "Landroidx/paging/z;", "Landroidx/paging/z;", "loadStates", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int placeholdersBefore;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int placeholdersAfter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<TransformablePage<T>> pages = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z loadStates = new z();

    private final void c(PageEvent.Insert<T> insert) {
        this.loadStates.h(insert.o());
        int i10 = h.f26421b[insert.p().ordinal()];
        if (i10 == 1) {
            this.pages.clear();
            this.placeholdersAfter = insert.r();
            this.placeholdersBefore = insert.s();
            this.pages.addAll(insert.q());
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.placeholdersAfter = insert.r();
            this.pages.addAll(insert.q());
            return;
        }
        this.placeholdersBefore = insert.s();
        Iterator<Integer> it = fi.u.k0(insert.q().size() - 1, 0).iterator();
        while (it.hasNext()) {
            this.pages.addFirst(insert.q().get(((kotlin.collections.k0) it).nextInt()));
        }
    }

    private final void d(PageEvent.LoadStateUpdate<T> loadStateUpdate) {
        this.loadStates.j(loadStateUpdate.n(), loadStateUpdate.l(), loadStateUpdate.m());
    }

    private final void e(PageEvent.Drop<T> drop) {
        int i10 = 0;
        this.loadStates.j(drop.m(), false, v.NotLoading.INSTANCE.b());
        int i11 = h.f26420a[drop.m().ordinal()];
        if (i11 == 1) {
            this.placeholdersBefore = drop.q();
            int iP = drop.p();
            while (i10 < iP) {
                this.pages.removeFirst();
                i10++;
            }
            return;
        }
        if (i11 != 2) {
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
        this.placeholdersAfter = drop.q();
        int iP2 = drop.p();
        while (i10 < iP2) {
            this.pages.removeLast();
            i10++;
        }
    }

    public final void a(@dl.d PageEvent<T> event) {
        kotlin.jvm.internal.f0.p(event, "event");
        if (event instanceof PageEvent.Insert) {
            c((PageEvent.Insert) event);
        } else if (event instanceof PageEvent.Drop) {
            e((PageEvent.Drop) event);
        } else if (event instanceof PageEvent.LoadStateUpdate) {
            d((PageEvent.LoadStateUpdate) event);
        }
    }

    @dl.d
    public final List<PageEvent<T>> b() {
        ArrayList arrayList = new ArrayList();
        if (!this.pages.isEmpty()) {
            arrayList.add(PageEvent.Insert.INSTANCE.c(CollectionsKt___CollectionsKt.Q5(this.pages), this.placeholdersBefore, this.placeholdersAfter, this.loadStates.k()));
        } else {
            z zVar = this.loadStates;
            LoadStates loadStates = zVar.source;
            LoadType loadType = LoadType.REFRESH;
            v vVarK = loadStates.k();
            PageEvent.LoadStateUpdate.Companion companion = PageEvent.LoadStateUpdate.INSTANCE;
            if (companion.a(vVarK, false)) {
                arrayList.add(new PageEvent.LoadStateUpdate(loadType, false, vVarK));
            }
            LoadType loadType2 = LoadType.PREPEND;
            v vVarJ = loadStates.j();
            if (companion.a(vVarJ, false)) {
                arrayList.add(new PageEvent.LoadStateUpdate(loadType2, false, vVarJ));
            }
            LoadType loadType3 = LoadType.APPEND;
            v vVarI = loadStates.i();
            if (companion.a(vVarI, false)) {
                arrayList.add(new PageEvent.LoadStateUpdate(loadType3, false, vVarI));
            }
            LoadStates loadStates2 = zVar.mediator;
            if (loadStates2 != null) {
                v vVarK2 = loadStates2.k();
                if (companion.a(vVarK2, true)) {
                    arrayList.add(new PageEvent.LoadStateUpdate(loadType, true, vVarK2));
                }
                v vVarJ2 = loadStates2.j();
                if (companion.a(vVarJ2, true)) {
                    arrayList.add(new PageEvent.LoadStateUpdate(loadType2, true, vVarJ2));
                }
                v vVarI2 = loadStates2.i();
                if (companion.a(vVarI2, true)) {
                    arrayList.add(new PageEvent.LoadStateUpdate(loadType3, true, vVarI2));
                }
            }
        }
        return arrayList;
    }
}
