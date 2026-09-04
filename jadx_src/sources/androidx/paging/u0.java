package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.annotation.k1;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: PositionalDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.k(message = "PositionalDataSource is deprecated and has been replaced by PagingSource", replaceWith = @kotlin.s0(expression = "PagingSource<Int, T>", imports = {"androidx.paging.PagingSource"}))
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b'\u0018\u0000 %*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003:\u0005+,-./B\u0007¢\u0006\u0004\b*\u0010(J'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0006\u001a\u00020\nH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0006\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H'J\u001e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H'J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0019*\u00020\u00012\u001e\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001b0\u001aJ6\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0019*\u00020\u00012\u001e\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001b0\u001eJ*\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0019*\u00020\u00012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aJ*\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0019*\u00020\u00012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eR \u0010)\u001a\u00020\"8\u0010X\u0090D¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/paging/u0;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/DataSource;", "", "Landroidx/paging/DataSource$d;", "params", "Landroidx/paging/DataSource$a;", "j", "(Landroidx/paging/DataSource$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/u0$c;", ak.aG, "(Landroidx/paging/u0$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/u0$e;", "v", "(Landroidx/paging/u0$e;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/u0$b;", "callback", "Lkotlin/b2;", "t", "Landroidx/paging/u0$d;", RXScreenCaptureService.KEY_WIDTH, ChannelListActivity.q.f79586f, "r", "(Ljava/lang/Object;)Ljava/lang/Integer;", androidx.exifinterface.media.a.X4, "Lf0/a;", "", "function", ak.aD, "Lkotlin/Function1;", androidx.exifinterface.media.a.W4, "x", "y", "", "g", "Z", RXScreenCaptureService.KEY_HEIGHT, "()Z", "isContiguous$paging_common$annotations", "()V", "isContiguous", "<init>", ak.av, "b", ak.aF, "d", "e", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class u0<T> extends DataSource<Integer, T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isContiguous;

    /* JADX INFO: renamed from: androidx.paging.u0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PositionalDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/paging/u0$a;", "", "Landroidx/paging/u0$c;", "params", "", "totalCount", ak.av, "initialLoadPosition", "b", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public final int a(@dl.d c params, int totalCount) {
            kotlin.jvm.internal.f0.p(params, "params");
            int i10 = params.requestedStartPosition;
            int i11 = params.requestedLoadSize;
            int i12 = params.pageSize;
            return Math.max(0, Math.min(((((totalCount - i11) + i12) - 1) / i12) * i12, (i10 / i12) * i12));
        }

        @xh.m
        public final int b(@dl.d c params, int initialLoadPosition, int totalCount) {
            kotlin.jvm.internal.f0.p(params, "params");
            return Math.min(totalCount - initialLoadPosition, params.requestedLoadSize);
        }
    }

    /* JADX INFO: compiled from: PositionalDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u001e\u0010\n\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\r"}, d2 = {"Landroidx/paging/u0$b;", androidx.exifinterface.media.a.f23244d5, "", "", "data", "", CommonNetImpl.POSITION, "totalCount", "Lkotlin/b2;", "b", ak.av, "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class b<T> {
        public abstract void a(@dl.d List<? extends T> list, int i10);

        public abstract void b(@dl.d List<? extends T> list, int i10, int i11);
    }

    /* JADX INFO: compiled from: PositionalDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/paging/u0$c;", "", "", ak.av, "I", "requestedStartPosition", "b", "requestedLoadSize", ak.aF, "pageSize", "", "d", "Z", "placeholdersEnabled", "<init>", "(IIIZ)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int requestedStartPosition;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int requestedLoadSize;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int pageSize;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final boolean placeholdersEnabled;

        public c(int i10, int i11, int i12, boolean z10) {
            this.requestedStartPosition = i10;
            this.requestedLoadSize = i11;
            this.pageSize = i12;
            this.placeholdersEnabled = z10;
            if (!(i10 >= 0)) {
                throw new IllegalStateException(("invalid start position: " + i10).toString());
            }
            if (!(i11 >= 0)) {
                throw new IllegalStateException(("invalid load size: " + i11).toString());
            }
            if (i12 >= 0) {
                return;
            }
            throw new IllegalStateException(("invalid page size: " + i12).toString());
        }
    }

    /* JADX INFO: compiled from: PositionalDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H&¨\u0006\t"}, d2 = {"Landroidx/paging/u0$d;", androidx.exifinterface.media.a.f23244d5, "", "", "data", "Lkotlin/b2;", ak.av, "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class d<T> {
        public abstract void a(@dl.d List<? extends T> list);
    }

    /* JADX INFO: compiled from: PositionalDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Landroidx/paging/u0$e;", "", "", ak.av, "I", "startPosition", "b", "loadSize", "<init>", "(II)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int startPosition;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public final int loadSize;

        public e(int i10, int i11) {
            this.startPosition = i10;
            this.loadSize = i11;
        }
    }

    /* JADX INFO: compiled from: PositionalDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002J&\u0010\r\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u001e\u0010\u000e\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/paging/PositionalDataSource$loadInitial$2$1", "Landroidx/paging/u0$b;", "Landroidx/paging/u0$c;", "params", "Landroidx/paging/DataSource$a;", "result", "Lkotlin/b2;", ak.aF, "", "data", "", CommonNetImpl.POSITION, "totalCount", "b", ak.av, "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class f extends b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p f26643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0 f26644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f26645c;

        f(kotlinx.coroutines.p pVar, u0 u0Var, c cVar) {
            this.f26643a = pVar;
            this.f26644b = u0Var;
            this.f26645c = cVar;
        }

        private final void c(c cVar, DataSource.a<T> aVar) {
            if (cVar.placeholdersEnabled) {
                aVar.e(cVar.pageSize);
            }
            kotlinx.coroutines.p pVar = this.f26643a;
            Result.a aVar2 = Result.f124476c;
            pVar.resumeWith(Result.b(aVar));
        }

        @Override // androidx.paging.u0.b
        public void a(@dl.d List<? extends T> data, int i10) {
            kotlin.jvm.internal.f0.p(data, "data");
            if (!this.f26644b.i()) {
                c(this.f26645c, new DataSource.a<>(data, i10 == 0 ? null : Integer.valueOf(i10), Integer.valueOf(data.size() + i10), i10, Integer.MIN_VALUE));
                return;
            }
            kotlinx.coroutines.p pVar = this.f26643a;
            DataSource.a<T> aVarB = DataSource.a.INSTANCE.b();
            Result.a aVar = Result.f124476c;
            pVar.resumeWith(Result.b(aVarB));
        }

        @Override // androidx.paging.u0.b
        public void b(@dl.d List<? extends T> data, int i10, int i11) {
            kotlin.jvm.internal.f0.p(data, "data");
            if (!this.f26644b.i()) {
                int size = data.size() + i10;
                c(this.f26645c, new DataSource.a<>(data, i10 == 0 ? null : Integer.valueOf(i10), size == i11 ? null : Integer.valueOf(size), i10, (i11 - data.size()) - i10));
            } else {
                kotlinx.coroutines.p pVar = this.f26643a;
                DataSource.a<T> aVarB = DataSource.a.INSTANCE.b();
                Result.a aVar = Result.f124476c;
                pVar.resumeWith(Result.b(aVarB));
            }
        }
    }

    /* JADX INFO: compiled from: PositionalDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"androidx/paging/PositionalDataSource$loadRange$2$1", "Landroidx/paging/u0$d;", "", "data", "Lkotlin/b2;", ak.av, "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class g extends d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p f26646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0 f26647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f26648c;

        g(kotlinx.coroutines.p pVar, u0 u0Var, e eVar) {
            this.f26646a = pVar;
            this.f26647b = u0Var;
            this.f26648c = eVar;
        }

        @Override // androidx.paging.u0.d
        public void a(@dl.d List<? extends T> data) {
            kotlin.jvm.internal.f0.p(data, "data");
            int i10 = this.f26648c.startPosition;
            Integer numValueOf = i10 == 0 ? null : Integer.valueOf(i10);
            if (this.f26647b.i()) {
                kotlinx.coroutines.p pVar = this.f26646a;
                DataSource.a<T> aVarB = DataSource.a.INSTANCE.b();
                Result.a aVar = Result.f124476c;
                pVar.resumeWith(Result.b(aVarB));
                return;
            }
            kotlinx.coroutines.p pVar2 = this.f26646a;
            DataSource.a aVar2 = new DataSource.a(data, numValueOf, Integer.valueOf(this.f26648c.startPosition + data.size()), 0, 0, 24, null);
            Result.a aVar3 = Result.f124476c;
            pVar2.resumeWith(Result.b(aVar2));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: compiled from: PositionalDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0004*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0001 \u0004*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", androidx.exifinterface.media.a.X4, androidx.exifinterface.media.a.f23244d5, "", "kotlin.jvm.PlatformType", "list", ak.av, "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 4, 2})
    public static final class h<I, O, V> implements f0.a<List<? extends T>, List<? extends V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0.a f26649a;

        h(f0.a aVar) {
            this.f26649a = aVar;
        }

        @Override // f0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<V> apply(List<? extends T> list) {
            kotlin.jvm.internal.f0.o(list, "list");
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.f26649a.apply(it.next()));
            }
            return arrayList;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: compiled from: PositionalDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0004*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0001 \u0004*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", androidx.exifinterface.media.a.X4, androidx.exifinterface.media.a.f23244d5, "", "kotlin.jvm.PlatformType", "list", ak.av, "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 4, 2})
    public static final class i<I, O, V> implements f0.a<List<? extends T>, List<? extends V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.l f26650a;

        i(yh.l lVar) {
            this.f26650a = lVar;
        }

        @Override // f0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<V> apply(List<? extends T> list) {
            kotlin.jvm.internal.f0.o(list, "list");
            yh.l lVar = this.f26650a;
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(lVar.invoke(it.next()));
            }
            return arrayList;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: compiled from: PositionalDataSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0004*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0001 \u0004*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", androidx.exifinterface.media.a.X4, androidx.exifinterface.media.a.f23244d5, "", "kotlin.jvm.PlatformType", "it", ak.av, "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 4, 2})
    public static final class j<I, O, V> implements f0.a<List<? extends T>, List<? extends V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.l f26651a;

        j(yh.l lVar) {
            this.f26651a = lVar;
        }

        @Override // f0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<V> apply(List<? extends T> it) {
            yh.l lVar = this.f26651a;
            kotlin.jvm.internal.f0.o(it, "it");
            return (List) lVar.invoke(it);
        }
    }

    public u0() {
        super(DataSource.KeyType.POSITIONAL);
    }

    @xh.m
    public static final int p(@dl.d c cVar, int i10) {
        return INSTANCE.a(cVar, i10);
    }

    @xh.m
    public static final int q(@dl.d c cVar, int i10, int i11) {
        return INSTANCE.b(cVar, i10, i11);
    }

    public static /* synthetic */ void s() {
    }

    @Override // androidx.paging.DataSource
    @dl.d
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final <V> u0<V> n(@dl.d yh.l<? super List<? extends T>, ? extends List<? extends V>> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return m(new j(function));
    }

    @Override // androidx.paging.DataSource
    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getIsContiguous() {
        return this.isContiguous;
    }

    @Override // androidx.paging.DataSource
    @dl.e
    public final Object j(@dl.d DataSource.d<Integer> dVar, @dl.d kotlin.coroutines.c<? super DataSource.a<T>> cVar) {
        if (dVar.getType() != LoadType.REFRESH) {
            Integer numB = dVar.b();
            kotlin.jvm.internal.f0.m(numB);
            int iIntValue = numB.intValue();
            int pageSize = dVar.getPageSize();
            if (dVar.getType() == LoadType.PREPEND) {
                pageSize = Math.min(pageSize, iIntValue);
                iIntValue -= pageSize;
            }
            return v(new e(iIntValue, pageSize), cVar);
        }
        int initialLoadSize = dVar.getInitialLoadSize();
        int iMax = 0;
        if (dVar.b() != null) {
            int iIntValue2 = dVar.b().intValue();
            if (dVar.getPlaceholdersEnabled()) {
                initialLoadSize = Math.max(initialLoadSize / dVar.getPageSize(), 2) * dVar.getPageSize();
                iMax = Math.max(0, ((iIntValue2 - (initialLoadSize / 2)) / dVar.getPageSize()) * dVar.getPageSize());
            } else {
                iMax = Math.max(0, iIntValue2 - (initialLoadSize / 2));
            }
        }
        return u(new c(iMax, initialLoadSize, dVar.getPageSize(), dVar.getPlaceholdersEnabled()), cVar);
    }

    @Override // androidx.paging.DataSource
    @dl.d
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Integer b(@dl.d T item) {
        kotlin.jvm.internal.f0.p(item, "item");
        throw new IllegalStateException("Cannot get key by item in positionalDataSource");
    }

    @k1
    public abstract void t(@dl.d c cVar, @dl.d b<T> bVar);

    @androidx.annotation.j1
    @dl.e
    public final Object u(@dl.d c cVar, @dl.d kotlin.coroutines.c<? super DataSource.a<T>> cVar2) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar2), 1);
        qVar.F0();
        t(cVar, new f(qVar, this, cVar));
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar2);
        }
        return objT;
    }

    final /* synthetic */ Object v(e eVar, kotlin.coroutines.c<? super DataSource.a<T>> cVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        w(eVar, new g(qVar, this, eVar));
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    @k1
    public abstract void w(@dl.d e eVar, @dl.d d<T> dVar);

    @Override // androidx.paging.DataSource
    @dl.d
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final <V> u0<V> k(@dl.d f0.a<T, V> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return m(new h(function));
    }

    @Override // androidx.paging.DataSource
    @dl.d
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final <V> u0<V> l(@dl.d yh.l<? super T, ? extends V> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return m(new i(function));
    }

    @Override // androidx.paging.DataSource
    @dl.d
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final <V> u0<V> m(@dl.d f0.a<List<T>, List<V>> function) {
        kotlin.jvm.internal.f0.p(function, "function");
        return new j1(this, function);
    }
}
