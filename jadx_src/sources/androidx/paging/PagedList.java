package androidx.paging;

import androidx.annotation.RestrictTo;
import com.lzy.okgo.model.Progress;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.s1;
import kotlinx.coroutines.v1;

/* JADX INFO: compiled from: PagedList.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData")
@Metadata(bv = {}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b'\u0018\u0000 t*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0006u.4v:=BA\b\u0000\u0012\u0010\u0010D\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000?\u0012\u0006\u0010J\u001a\u00020E\u0012\u0006\u0010P\u001a\u00020K\u0012\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000Q\u0012\u0006\u0010\\\u001a\u00020W¢\u0006\u0004\br\u0010sJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\"\u0010\r\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bH'J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H'J\b\u0010\u0010\u001a\u00020\u000bH&J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\nH\u0017J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0012\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eJ \u0010!\u001a\u00020\u000b2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bJ \u0010\"\u001a\u00020\u000b2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bJ \u0010%\u001a\u00020\u000b2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e2\u0006\u0010\f\u001a\u00020$H\u0007J\u000e\u0010&\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020$J\u000e\u0010'\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020$J\u001f\u0010*\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0000¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0007J\u0018\u0010-\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0007R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00107\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00106R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$09088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R2\u0010>\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b09088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R$\u0010D\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000?8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010J\u001a\u00020E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010P\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR \u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\\\u001a\u00020W8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u00106R$\u0010d\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000_8FX\u0087\u0004¢\u0006\f\u0012\u0004\bb\u0010c\u001a\u0004\b`\u0010aR\u0016\u0010g\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8&X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0011\u0010m\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bl\u00106R\u0014\u0010o\u001a\u00020h8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010jR\u0011\u0010q\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bp\u00106¨\u0006w"}, d2 = {"Landroidx/paging/PagedList;", "", androidx.exifinterface.media.a.f23244d5, "Ljava/util/AbstractList;", "Landroidx/paging/b0;", "F", "", androidx.exifinterface.media.a.R4, "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/v;", "Lkotlin/b2;", "callback", ak.aG, UCropPlusActivity.ARG_INDEX, "U", "t", "loadType", "loadState", "d0", "b0", "Ljava/lang/Runnable;", "refreshRetryCallback", "i0", "type", "state", "v", "(Landroidx/paging/LoadType;Landroidx/paging/v;)V", "get", "(I)Ljava/lang/Object;", "", "k0", com.google.android.gms.common.internal.s.a.f52543a, "q", "a0", "previousSnapshot", "Landroidx/paging/PagedList$c;", "o", "m", "Z", CommonNetImpl.POSITION, "count", androidx.exifinterface.media.a.T4, "(II)V", androidx.exifinterface.media.a.X4, "X", "b", "Ljava/lang/Runnable;", "I", "()Ljava/lang/Runnable;", "h0", "(Ljava/lang/Runnable;)V", ak.aF, "J", "()I", "requiredRemainder", "", "Ljava/lang/ref/WeakReference;", "d", "Ljava/util/List;", "callbacks", "e", "loadStateListeners", "Landroidx/paging/q0;", "f", "Landroidx/paging/q0;", "G", "()Landroidx/paging/q0;", "pagingSource", "Lkotlinx/coroutines/q0;", "g", "Lkotlinx/coroutines/q0;", "x", "()Lkotlinx/coroutines/q0;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", RXScreenCaptureService.KEY_HEIGHT, "Lkotlinx/coroutines/CoroutineDispatcher;", androidx.exifinterface.media.a.S4, "()Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "Landroidx/paging/m0;", "i", "Landroidx/paging/m0;", "N", "()Landroidx/paging/m0;", "storage", "Landroidx/paging/PagedList$d;", "j", "Landroidx/paging/PagedList$d;", RXScreenCaptureService.KEY_WIDTH, "()Landroidx/paging/PagedList$d;", "config", "L", UiKitSpanObj.TYPE_SIZE, "Landroidx/paging/DataSource;", "y", "()Landroidx/paging/DataSource;", "getDataSource$annotations", "()V", "dataSource", "B", "()Ljava/lang/Object;", "lastKey", "", "Q", "()Z", "isDetached", "D", "loadedCount", "R", "isImmutable", "H", "positionOffset", "<init>", "(Landroidx/paging/q0;Lkotlinx/coroutines/q0;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/m0;Landroidx/paging/PagedList$d;)V", "k", ak.av, "Companion", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class PagedList<T> extends AbstractList<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Runnable refreshRetryCallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int requiredRemainder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<WeakReference<c>> callbacks;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<WeakReference<yh.p<LoadType, v, b2>>> loadStateListeners;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private final q0<?, T> pagingSource;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.q0 coroutineScope;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CoroutineDispatcher notifyDispatcher;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m0<T> storage;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d config;

    /* JADX INFO: compiled from: PagedList.kt */
    @Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u008d\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0012\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/paging/PagedList$Companion;", "", "K", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/q0;", "pagingSource", "Landroidx/paging/q0$b$b;", "initialPage", "Lkotlinx/coroutines/q0;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "fetchDispatcher", "Landroidx/paging/PagedList$a;", "boundaryCallback", "Landroidx/paging/PagedList$d;", "config", "key", "Landroidx/paging/PagedList;", ak.av, "(Landroidx/paging/q0;Landroidx/paging/q0$b$b;Lkotlinx/coroutines/q0;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$a;Landroidx/paging/PagedList$d;Ljava/lang/Object;)Landroidx/paging/PagedList;", "", Progress.I, "snapshotSize", "Landroidx/paging/PagedList$c;", "callback", "Lkotlin/b2;", "b", "(IILandroidx/paging/PagedList$c;)V", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final <K, T> PagedList<T> a(@dl.d q0<K, T> pagingSource, @dl.e q0.b.Page<K, T> initialPage, @dl.d kotlinx.coroutines.q0 coroutineScope, @dl.d CoroutineDispatcher notifyDispatcher, @dl.d CoroutineDispatcher fetchDispatcher, @dl.e a<T> boundaryCallback, @dl.d d config, @dl.e K key) {
            q0.b.Page<K, T> page;
            kotlin.jvm.internal.f0.p(pagingSource, "pagingSource");
            kotlin.jvm.internal.f0.p(coroutineScope, "coroutineScope");
            kotlin.jvm.internal.f0.p(notifyDispatcher, "notifyDispatcher");
            kotlin.jvm.internal.f0.p(fetchDispatcher, "fetchDispatcher");
            kotlin.jvm.internal.f0.p(config, "config");
            if (initialPage == null) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.f124891b = (T) new q0.a.d(key, config.initialLoadSizeHint, config.enablePlaceholders);
                page = (q0.b.Page) kotlinx.coroutines.j.b(null, new PagedList$Companion$create$resolvedInitialPage$1(pagingSource, objectRef, null), 1, null);
            } else {
                page = initialPage;
            }
            return new ContiguousPagedList(pagingSource, coroutineScope, notifyDispatcher, fetchDispatcher, boundaryCallback, config, page, key);
        }

        public final void b(int currentSize, int snapshotSize, @dl.d c callback) {
            kotlin.jvm.internal.f0.p(callback, "callback");
            if (snapshotSize < currentSize) {
                if (snapshotSize > 0) {
                    callback.a(0, snapshotSize);
                }
                int i10 = currentSize - snapshotSize;
                if (i10 > 0) {
                    callback.b(snapshotSize, i10);
                    return;
                }
                return;
            }
            if (currentSize > 0) {
                callback.a(0, currentSize);
            }
            int i11 = snapshotSize - currentSize;
            if (i11 != 0) {
                callback.c(currentSize, i11);
            }
        }
    }

    /* JADX INFO: compiled from: PagedList.kt */
    @androidx.annotation.k0
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/paging/PagedList$a;", "", androidx.exifinterface.media.a.f23244d5, "Lkotlin/b2;", ak.aF, "itemAtFront", "b", "(Ljava/lang/Object;)V", "itemAtEnd", ak.av, "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class a<T> {
        public void a(@dl.d T itemAtEnd) {
            kotlin.jvm.internal.f0.p(itemAtEnd, "itemAtEnd");
        }

        public void b(@dl.d T itemAtFront) {
            kotlin.jvm.internal.f0.p(itemAtFront, "itemAtFront");
        }

        public void c() {
        }
    }

    /* JADX INFO: compiled from: PagedList.kt */
    @kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData, which no longer supports constructing snapshots of loaded data manually.", replaceWith = @kotlin.s0(expression = "Pager.flow", imports = {"androidx.paging.Pager"}))
    @Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u0001*\b\b\u0002\u0010\u0003*\u00020\u00012\u00020\u0001B%\b\u0016\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b*\u0010+B%\b\u0016\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b*\u0010.B9\b\u0016\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0019\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b*\u0010/B9\b\u0016\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0019\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001f\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b*\u00100J\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007H\u0007J\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nJ\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0011J#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u0017R\"\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010&R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010'R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u00061"}, d2 = {"Landroidx/paging/PagedList$b;", "", "Key", "Value", "Lkotlinx/coroutines/q0;", "coroutineScope", ak.aF, "Ljava/util/concurrent/Executor;", "notifyExecutor", RXScreenCaptureService.KEY_HEIGHT, "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "g", "fetchExecutor", "e", "fetchDispatcher", "d", "Landroidx/paging/PagedList$a;", "boundaryCallback", "b", "initialKey", "f", "(Ljava/lang/Object;)Landroidx/paging/PagedList$b;", "Landroidx/paging/PagedList;", ak.av, "Landroidx/paging/q0;", "Landroidx/paging/q0;", "pagingSource", "Landroidx/paging/DataSource;", "Landroidx/paging/DataSource;", "dataSource", "Landroidx/paging/q0$b$b;", "Landroidx/paging/q0$b$b;", "initialPage", "Landroidx/paging/PagedList$d;", "Landroidx/paging/PagedList$d;", "config", "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Landroidx/paging/PagedList$a;", "i", "Ljava/lang/Object;", "<init>", "(Landroidx/paging/DataSource;Landroidx/paging/PagedList$d;)V", "", "pageSize", "(Landroidx/paging/DataSource;I)V", "(Landroidx/paging/q0;Landroidx/paging/q0$b$b;Landroidx/paging/PagedList$d;)V", "(Landroidx/paging/q0;Landroidx/paging/q0$b$b;I)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class b<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q0<Key, Value> pagingSource;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private DataSource<Key, Value> dataSource;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final q0.b.Page<Key, Value> initialPage;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final d config;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private kotlinx.coroutines.q0 coroutineScope;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private CoroutineDispatcher notifyDispatcher;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private CoroutineDispatcher fetchDispatcher;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private a<Value> boundaryCallback;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private Key initialKey;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@dl.d DataSource<Key, Value> dataSource, int i10) {
            this(dataSource, k0.b(i10, 0, false, 0, 0, 30, null));
            kotlin.jvm.internal.f0.p(dataSource, "dataSource");
        }

        public b(@dl.d DataSource<Key, Value> dataSource, @dl.d d config) {
            kotlin.jvm.internal.f0.p(dataSource, "dataSource");
            kotlin.jvm.internal.f0.p(config, "config");
            this.coroutineScope = v1.f130503b;
            this.pagingSource = null;
            this.dataSource = dataSource;
            this.initialPage = null;
            this.config = config;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@dl.d q0<Key, Value> pagingSource, @dl.d q0.b.Page<Key, Value> initialPage, int i10) {
            this(pagingSource, initialPage, k0.b(i10, 0, false, 0, 0, 30, null));
            kotlin.jvm.internal.f0.p(pagingSource, "pagingSource");
            kotlin.jvm.internal.f0.p(initialPage, "initialPage");
        }

        public b(@dl.d q0<Key, Value> pagingSource, @dl.d q0.b.Page<Key, Value> initialPage, @dl.d d config) {
            kotlin.jvm.internal.f0.p(pagingSource, "pagingSource");
            kotlin.jvm.internal.f0.p(initialPage, "initialPage");
            kotlin.jvm.internal.f0.p(config, "config");
            this.coroutineScope = v1.f130503b;
            this.pagingSource = pagingSource;
            this.dataSource = null;
            this.initialPage = initialPage;
            this.config = config;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @dl.d
        public final PagedList<Value> a() {
            LegacyPagingSource legacyPagingSource;
            Object obj;
            CoroutineDispatcher coroutineDispatcherC = this.fetchDispatcher;
            if (coroutineDispatcherC == null) {
                coroutineDispatcherC = kotlinx.coroutines.e1.c();
            }
            CoroutineDispatcher coroutineDispatcher = coroutineDispatcherC;
            q0<Key, Value> q0Var = this.pagingSource;
            if (q0Var != null) {
                obj = q0Var;
            } else {
                DataSource<Key, Value> dataSource = this.dataSource;
                if (dataSource != null) {
                    legacyPagingSource = new LegacyPagingSource(coroutineDispatcher, dataSource);
                    legacyPagingSource.m(this.config.pageSize);
                } else {
                    legacyPagingSource = null;
                }
                obj = legacyPagingSource;
            }
            if (!(obj != null)) {
                throw new IllegalStateException("PagedList cannot be built without a PagingSource or DataSource".toString());
            }
            Companion companion = PagedList.INSTANCE;
            q0.b.Page<Key, Value> page = this.initialPage;
            kotlinx.coroutines.q0 q0Var2 = this.coroutineScope;
            CoroutineDispatcher coroutineDispatcherT0 = this.notifyDispatcher;
            if (coroutineDispatcherT0 == null) {
                coroutineDispatcherT0 = kotlinx.coroutines.e1.e().t0();
            }
            return companion.a(obj, page, q0Var2, coroutineDispatcherT0, coroutineDispatcher, this.boundaryCallback, this.config, this.initialKey);
        }

        @dl.d
        public final b<Key, Value> b(@dl.e a<Value> boundaryCallback) {
            this.boundaryCallback = boundaryCallback;
            return this;
        }

        @dl.d
        public final b<Key, Value> c(@dl.d kotlinx.coroutines.q0 coroutineScope) {
            kotlin.jvm.internal.f0.p(coroutineScope, "coroutineScope");
            this.coroutineScope = coroutineScope;
            return this;
        }

        @dl.d
        public final b<Key, Value> d(@dl.d CoroutineDispatcher fetchDispatcher) {
            kotlin.jvm.internal.f0.p(fetchDispatcher, "fetchDispatcher");
            this.fetchDispatcher = fetchDispatcher;
            return this;
        }

        @dl.d
        @kotlin.k(message = "Passing an executor will cause it get wrapped as a CoroutineDispatcher, consider passing a CoroutineDispatcher directly", replaceWith = @kotlin.s0(expression = "setFetchDispatcher(fetchExecutor.asCoroutineDispatcher())", imports = {"kotlinx.coroutines.asCoroutineDispatcher"}))
        public final b<Key, Value> e(@dl.d Executor fetchExecutor) {
            kotlin.jvm.internal.f0.p(fetchExecutor, "fetchExecutor");
            this.fetchDispatcher = s1.c(fetchExecutor);
            return this;
        }

        @dl.d
        public final b<Key, Value> f(@dl.e Key initialKey) {
            this.initialKey = initialKey;
            return this;
        }

        @dl.d
        public final b<Key, Value> g(@dl.d CoroutineDispatcher notifyDispatcher) {
            kotlin.jvm.internal.f0.p(notifyDispatcher, "notifyDispatcher");
            this.notifyDispatcher = notifyDispatcher;
            return this;
        }

        @dl.d
        @kotlin.k(message = "Passing an executor will cause it get wrapped as a CoroutineDispatcher, consider passing a CoroutineDispatcher directly", replaceWith = @kotlin.s0(expression = "setNotifyDispatcher(fetchExecutor.asCoroutineDispatcher())", imports = {"kotlinx.coroutines.asCoroutineDispatcher"}))
        public final b<Key, Value> h(@dl.d Executor notifyExecutor) {
            kotlin.jvm.internal.f0.p(notifyExecutor, "notifyExecutor");
            this.notifyDispatcher = s1.c(notifyExecutor);
            return this;
        }
    }

    /* JADX INFO: compiled from: PagedList.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Landroidx/paging/PagedList$c;", "", "", CommonNetImpl.POSITION, "count", "Lkotlin/b2;", ak.av, "b", ak.aF, "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class c {
        public abstract void a(int i10, int i11);

        public abstract void b(int i10, int i11);

        public abstract void c(int i10, int i11);
    }

    /* JADX INFO: compiled from: PagedList.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0003\u0006B1\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0013"}, d2 = {"Landroidx/paging/PagedList$d;", "", "", ak.av, "I", "pageSize", "b", "prefetchDistance", "", ak.aF, "Z", "enablePlaceholders", "d", "initialLoadSizeHint", "e", "maxSize", "<init>", "(IIZII)V", "g", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f25972f = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int pageSize;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int prefetchDistance;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final boolean enablePlaceholders;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int initialLoadSizeHint;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int maxSize;

        /* JADX INFO: compiled from: PagedList.kt */
        @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u0002J\u0010\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0015"}, d2 = {"Landroidx/paging/PagedList$d$a;", "", "", "pageSize", "e", "prefetchDistance", "f", "", "enablePlaceholders", "b", "initialLoadSizeHint", ak.aF, "maxSize", "d", "Landroidx/paging/PagedList$d;", ak.av, "I", "Z", "<init>", "()V", "g", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f25979f = 3;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private int pageSize = -1;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private int prefetchDistance = -1;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private int initialLoadSizeHint = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private boolean enablePlaceholders = true;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private int maxSize = Integer.MAX_VALUE;

            @dl.d
            public final d a() {
                if (this.prefetchDistance < 0) {
                    this.prefetchDistance = this.pageSize;
                }
                if (this.initialLoadSizeHint < 0) {
                    this.initialLoadSizeHint = this.pageSize * 3;
                }
                if (!this.enablePlaceholders && this.prefetchDistance == 0) {
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                int i10 = this.maxSize;
                if (i10 == Integer.MAX_VALUE || i10 >= this.pageSize + (this.prefetchDistance * 2)) {
                    return new d(this.pageSize, this.prefetchDistance, this.enablePlaceholders, this.initialLoadSizeHint, this.maxSize);
                }
                throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + this.pageSize + ", prefetchDist=" + this.prefetchDistance + ", maxSize=" + this.maxSize);
            }

            @dl.d
            public final a b(boolean enablePlaceholders) {
                this.enablePlaceholders = enablePlaceholders;
                return this;
            }

            @dl.d
            public final a c(@androidx.annotation.f0(from = 1) int initialLoadSizeHint) {
                this.initialLoadSizeHint = initialLoadSizeHint;
                return this;
            }

            @dl.d
            public final a d(@androidx.annotation.f0(from = 2) int maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            @dl.d
            public final a e(@androidx.annotation.f0(from = 1) int pageSize) {
                if (pageSize < 1) {
                    throw new IllegalArgumentException("Page size must be a positive number");
                }
                this.pageSize = pageSize;
                return this;
            }

            @dl.d
            public final a f(@androidx.annotation.f0(from = 0) int prefetchDistance) {
                this.prefetchDistance = prefetchDistance;
                return this;
            }
        }

        /* JADX INFO: renamed from: androidx.paging.PagedList$d$b, reason: from kotlin metadata */
        /* JADX INFO: compiled from: PagedList.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/paging/PagedList$d$b;", "", "", "MAX_SIZE_UNBOUNDED", "I", "getMAX_SIZE_UNBOUNDED$annotations", "()V", "<init>", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public static /* synthetic */ void a() {
            }
        }

        public d(int i10, int i11, boolean z10, int i12, int i13) {
            this.pageSize = i10;
            this.prefetchDistance = i11;
            this.enablePlaceholders = z10;
            this.initialLoadSizeHint = i12;
            this.maxSize = i13;
        }
    }

    /* JADX INFO: compiled from: PagedList.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'J \u0010\u000b\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\tR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006\u001a"}, d2 = {"Landroidx/paging/PagedList$e;", "", "Landroidx/paging/LoadType;", "type", "Landroidx/paging/v;", "state", "Lkotlin/b2;", "i", "e", "Lkotlin/Function2;", "callback", ak.av, "Landroidx/paging/v;", ak.aF, "()Landroidx/paging/v;", "g", "(Landroidx/paging/v;)V", "refreshState", "b", "d", RXScreenCaptureService.KEY_HEIGHT, "startState", "f", "endState", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private v refreshState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private v startState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private v endState;

        public e() {
            v.NotLoading.Companion companion = v.NotLoading.INSTANCE;
            this.refreshState = companion.b();
            this.startState = companion.b();
            this.endState = companion.b();
        }

        public final void a(@dl.d yh.p<? super LoadType, ? super v, b2> callback) {
            kotlin.jvm.internal.f0.p(callback, "callback");
            callback.invoke(LoadType.REFRESH, this.refreshState);
            callback.invoke(LoadType.PREPEND, this.startState);
            callback.invoke(LoadType.APPEND, this.endState);
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final v getEndState() {
            return this.endState;
        }

        @dl.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public final v getRefreshState() {
            return this.refreshState;
        }

        @dl.d
        /* JADX INFO: renamed from: d, reason: from getter */
        public final v getStartState() {
            return this.startState;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract void e(@dl.d LoadType loadType, @dl.d v vVar);

        public final void f(@dl.d v vVar) {
            kotlin.jvm.internal.f0.p(vVar, "<set-?>");
            this.endState = vVar;
        }

        public final void g(@dl.d v vVar) {
            kotlin.jvm.internal.f0.p(vVar, "<set-?>");
            this.refreshState = vVar;
        }

        public final void h(@dl.d v vVar) {
            kotlin.jvm.internal.f0.p(vVar, "<set-?>");
            this.startState = vVar;
        }

        public final void i(@dl.d LoadType type, @dl.d v state) {
            kotlin.jvm.internal.f0.p(type, "type");
            kotlin.jvm.internal.f0.p(state, "state");
            int i10 = j0.f26454a[type.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (kotlin.jvm.internal.f0.g(this.endState, state)) {
                            return;
                        } else {
                            this.endState = state;
                        }
                    }
                } else if (kotlin.jvm.internal.f0.g(this.startState, state)) {
                    return;
                } else {
                    this.startState = state;
                }
            } else if (kotlin.jvm.internal.f0.g(this.refreshState, state)) {
                return;
            } else {
                this.refreshState = state;
            }
            e(type, state);
        }
    }

    public PagedList(@dl.d q0<?, T> pagingSource, @dl.d kotlinx.coroutines.q0 coroutineScope, @dl.d CoroutineDispatcher notifyDispatcher, @dl.d m0<T> storage, @dl.d d config) {
        kotlin.jvm.internal.f0.p(pagingSource, "pagingSource");
        kotlin.jvm.internal.f0.p(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.f0.p(notifyDispatcher, "notifyDispatcher");
        kotlin.jvm.internal.f0.p(storage, "storage");
        kotlin.jvm.internal.f0.p(config, "config");
        this.pagingSource = pagingSource;
        this.coroutineScope = coroutineScope;
        this.notifyDispatcher = notifyDispatcher;
        this.storage = storage;
        this.config = config;
        this.requiredRemainder = (config.prefetchDistance * 2) + config.pageSize;
        this.callbacks = new ArrayList();
        this.loadStateListeners = new ArrayList();
    }

    @kotlin.k(message = "DataSource is deprecated and has been replaced by PagingSource. PagedList offers indirect ways of controlling fetch ('loadAround()', 'retry()') so that you should not need to access the DataSource/PagingSource.")
    public static /* synthetic */ void A() {
    }

    @dl.d
    @xh.m
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <K, T> PagedList<T> s(@dl.d q0<K, T> q0Var, @dl.e q0.b.Page<K, T> page, @dl.d kotlinx.coroutines.q0 q0Var2, @dl.d CoroutineDispatcher coroutineDispatcher, @dl.d CoroutineDispatcher coroutineDispatcher2, @dl.e a<T> aVar, @dl.d d dVar, @dl.e K k10) {
        return INSTANCE.a(q0Var, page, q0Var2, coroutineDispatcher, coroutineDispatcher2, aVar, dVar, k10);
    }

    @dl.e
    public abstract Object B();

    public final int D() {
        return this.storage.getStorageCount();
    }

    @dl.d
    /* JADX INFO: renamed from: E, reason: from getter */
    public final CoroutineDispatcher getNotifyDispatcher() {
        return this.notifyDispatcher;
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final b0<T> F() {
        return this.storage;
    }

    @dl.d
    public q0<?, T> G() {
        return this.pagingSource;
    }

    public final int H() {
        return this.storage.getPositionOffset();
    }

    @dl.e
    /* JADX INFO: renamed from: I, reason: from getter */
    public final Runnable getRefreshRetryCallback() {
        return this.refreshRetryCallback;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final int getRequiredRemainder() {
        return this.requiredRemainder;
    }

    public int L() {
        return this.storage.size();
    }

    @dl.d
    public final m0<T> N() {
        return this.storage;
    }

    /* JADX INFO: renamed from: Q */
    public abstract boolean getIsDetached();

    /* JADX INFO: renamed from: R */
    public boolean getIsImmutable() {
        return getIsDetached();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int S() {
        return this.storage.s();
    }

    public final void T(int i10) {
        if (i10 >= 0 && i10 < size()) {
            this.storage.I(i10);
            U(i10);
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + size());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract void U(int i10);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void V(int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt___CollectionsKt.S4(this.callbacks).iterator();
        while (it.hasNext()) {
            c cVar = (c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                cVar.a(i10, i11);
            }
        }
    }

    public final void W(int position, int count) {
        if (count == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt___CollectionsKt.S4(this.callbacks).iterator();
        while (it.hasNext()) {
            c cVar = (c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                cVar.b(position, count);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void X(int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt___CollectionsKt.S4(this.callbacks).iterator();
        while (it.hasNext()) {
            c cVar = (c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                cVar.c(i10, i11);
            }
        }
    }

    public /* bridge */ Object Y(int i10) {
        return super.remove(i10);
    }

    public final void Z(@dl.d final c callback) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        kotlin.collections.x.I0(this.callbacks, new yh.l<WeakReference<c>, Boolean>() { // from class: androidx.paging.PagedList$removeWeakCallback$1
            {
                super(1);
            }

            public final boolean a(@dl.d WeakReference<PagedList.c> it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return it.get() == null || it.get() == callback;
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(WeakReference<PagedList.c> weakReference) {
                return Boolean.valueOf(a(weakReference));
            }
        });
    }

    public final void a0(@dl.d final yh.p<? super LoadType, ? super v, b2> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        kotlin.collections.x.I0(this.loadStateListeners, new yh.l<WeakReference<yh.p<? super LoadType, ? super v, ? extends b2>>, Boolean>() { // from class: androidx.paging.PagedList$removeWeakLoadStateListener$1
            {
                super(1);
            }

            public final boolean a(@dl.d WeakReference<yh.p<LoadType, v, b2>> it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return it.get() == null || it.get() == listener;
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(WeakReference<yh.p<? super LoadType, ? super v, ? extends b2>> weakReference) {
                return Boolean.valueOf(a(weakReference));
            }
        });
    }

    public void b0() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void d0(@dl.d LoadType loadType, @dl.d v loadState) {
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        kotlin.jvm.internal.f0.p(loadState, "loadState");
    }

    @Override // java.util.AbstractList, java.util.List
    @dl.e
    public T get(int index) {
        return this.storage.get(index);
    }

    public final void h0(@dl.e Runnable runnable) {
        this.refreshRetryCallback = runnable;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void i0(@dl.e Runnable runnable) {
        this.refreshRetryCallback = runnable;
    }

    @dl.d
    public final List<T> k0() {
        return getIsImmutable() ? this : new c1(this);
    }

    public final void m(@dl.d c callback) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        kotlin.collections.x.I0(this.callbacks, new yh.l<WeakReference<c>, Boolean>() { // from class: androidx.paging.PagedList$addWeakCallback$1
            public final boolean a(@dl.d WeakReference<PagedList.c> it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return it.get() == null;
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(WeakReference<PagedList.c> weakReference) {
                return Boolean.valueOf(a(weakReference));
            }
        });
        this.callbacks.add(new WeakReference<>(callback));
    }

    @kotlin.k(message = "Dispatching a diff since snapshot created is behavior that can be instead tracked by attaching a Callback to the PagedList that is mutating, and tracking changes since calling PagedList.snapshot().")
    public final void o(@dl.e List<? extends T> list, @dl.d c callback) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        if (list != null && list != this) {
            INSTANCE.b(size(), list.size(), callback);
        }
        m(callback);
    }

    public final void q(@dl.d yh.p<? super LoadType, ? super v, b2> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        kotlin.collections.x.I0(this.loadStateListeners, new yh.l<WeakReference<yh.p<? super LoadType, ? super v, ? extends b2>>, Boolean>() { // from class: androidx.paging.PagedList$addWeakLoadStateListener$1
            public final boolean a(@dl.d WeakReference<yh.p<LoadType, v, b2>> it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return it.get() == null;
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(WeakReference<yh.p<? super LoadType, ? super v, ? extends b2>> weakReference) {
                return Boolean.valueOf(a(weakReference));
            }
        });
        this.loadStateListeners.add(new WeakReference<>(listener));
        u(listener);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i10) {
        return (T) Y(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return L();
    }

    public abstract void t();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract void u(@dl.d yh.p<? super LoadType, ? super v, b2> pVar);

    public final void v(@dl.d LoadType type, @dl.d v state) {
        kotlin.jvm.internal.f0.p(type, "type");
        kotlin.jvm.internal.f0.p(state, "state");
        kotlinx.coroutines.k.f(this.coroutineScope, this.notifyDispatcher, null, new PagedList$dispatchStateChangeAsync$1(this, type, state, null), 2, null);
    }

    @dl.d
    /* JADX INFO: renamed from: w, reason: from getter */
    public final d getConfig() {
        return this.config;
    }

    @dl.d
    /* JADX INFO: renamed from: x, reason: from getter */
    public final kotlinx.coroutines.q0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @dl.d
    public final DataSource<?, T> y() {
        q0<?, T> q0VarG = G();
        if (q0VarG instanceof LegacyPagingSource) {
            DataSource<?, T> dataSourceK = ((LegacyPagingSource) q0VarG).k();
            if (dataSourceK != null) {
                return dataSourceK;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.DataSource<*, T>");
        }
        throw new IllegalStateException("Attempt to access dataSource on a PagedList that was instantiated with a " + q0VarG.getClass().getSimpleName() + " instead of a DataSource");
    }
}
