package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: PagingSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0014\u001cB\u0007¢\u0006\u0004\b%\u0010\u0019J\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J-\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012R,\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u00138\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010 R\u0014\u0010#\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010$\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/paging/q0;", "", "Key", "Value", "Lkotlin/b2;", "g", "Lkotlin/Function0;", "onInvalidatedCallback", "i", "j", "Landroidx/paging/q0$a;", "params", "Landroidx/paging/q0$b;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/paging/q0$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/t0;", "state", "f", "(Landroidx/paging/t0;)Ljava/lang/Object;", "Ljava/util/concurrent/CopyOnWriteArrayList;", ak.av, "Ljava/util/concurrent/CopyOnWriteArrayList;", "d", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getOnInvalidatedCallbacks$paging_common$annotations", "()V", "onInvalidatedCallbacks", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_invalid", "", "()Z", "jumpingSupported", ak.aF, "keyReuseSupported", "invalid", "<init>", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class q0<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CopyOnWriteArrayList<yh.a<b2>> onInvalidatedCallbacks = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean _invalid = new AtomicBoolean(false);

    /* JADX INFO: compiled from: PagingSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0004\u0006\u000b\u0012B\u0019\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00018\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u000e\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Landroidx/paging/q0$a;", "", "Key", "", ak.av, "I", "b", "()I", "loadSize", "", "Z", ak.aF, "()Z", "placeholdersEnabled", "()Ljava/lang/Object;", "key", "<init>", "(IZ)V", "d", "Landroidx/paging/q0$a$d;", "Landroidx/paging/q0$a$a;", "Landroidx/paging/q0$a$c;", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class a<Key> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int loadSize;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean placeholdersEnabled;

        /* JADX INFO: renamed from: androidx.paging.q0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PagingSource.kt */
        @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\b\u001a\u00028\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/paging/q0$a$a;", "", "Key", "Landroidx/paging/q0$a;", "d", "Ljava/lang/Object;", ak.av, "()Ljava/lang/Object;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class C0204a<Key> extends a<Key> {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @dl.d
            private final Key key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0204a(@dl.d Key key, int i10, boolean z10) {
                super(i10, z10, null);
                kotlin.jvm.internal.f0.p(key, "key");
                this.key = key;
            }

            @Override // androidx.paging.q0.a
            @dl.d
            public Key a() {
                return this.key;
            }
        }

        /* JADX INFO: renamed from: androidx.paging.q0$a$b, reason: from kotlin metadata */
        /* JADX INFO: compiled from: PagingSource.kt */
        @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00030\n\"\b\b\u0003\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/paging/q0$a$b;", "", "Key", "Landroidx/paging/LoadType;", "loadType", "key", "", "loadSize", "", "placeholdersEnabled", "Landroidx/paging/q0$a;", ak.av, "(Landroidx/paging/LoadType;Ljava/lang/Object;IZ)Landroidx/paging/q0$a;", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.d
            public final <Key> a<Key> a(@dl.d LoadType loadType, @dl.e Key key, int loadSize, boolean placeholdersEnabled) {
                kotlin.jvm.internal.f0.p(loadType, "loadType");
                int i10 = r0.f26610a[loadType.ordinal()];
                if (i10 == 1) {
                    return new d(key, loadSize, placeholdersEnabled);
                }
                if (i10 == 2) {
                    if (key != null) {
                        return new c(key, loadSize, placeholdersEnabled);
                    }
                    throw new IllegalArgumentException("key cannot be null for prepend".toString());
                }
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (key != null) {
                    return new C0204a(key, loadSize, placeholdersEnabled);
                }
                throw new IllegalArgumentException("key cannot be null for append".toString());
            }
        }

        /* JADX INFO: compiled from: PagingSource.kt */
        @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\b\u001a\u00028\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/paging/q0$a$c;", "", "Key", "Landroidx/paging/q0$a;", "d", "Ljava/lang/Object;", ak.av, "()Ljava/lang/Object;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class c<Key> extends a<Key> {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @dl.d
            private final Key key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@dl.d Key key, int i10, boolean z10) {
                super(i10, z10, null);
                kotlin.jvm.internal.f0.p(key, "key");
                this.key = key;
            }

            @Override // androidx.paging.q0.a
            @dl.d
            public Key a() {
                return this.key;
            }
        }

        /* JADX INFO: compiled from: PagingSource.kt */
        @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B!\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00018\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/paging/q0$a$d;", "", "Key", "Landroidx/paging/q0$a;", "d", "Ljava/lang/Object;", ak.av, "()Ljava/lang/Object;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class d<Key> extends a<Key> {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @dl.e
            private final Key key;

            public d(@dl.e Key key, int i10, boolean z10) {
                super(i10, z10, null);
                this.key = key;
            }

            @Override // androidx.paging.q0.a
            @dl.e
            public Key a() {
                return this.key;
            }
        }

        private a(int i10, boolean z10) {
            this.loadSize = i10;
            this.placeholdersEnabled = z10;
        }

        public /* synthetic */ a(int i10, boolean z10, kotlin.jvm.internal.u uVar) {
            this(i10, z10);
        }

        @dl.e
        public abstract Key a();

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getLoadSize() {
            return this.loadSize;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getPlaceholdersEnabled() {
            return this.placeholdersEnabled;
        }
    }

    /* JADX INFO: compiled from: PagingSource.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/paging/q0$b;", "", "Key", "Value", "<init>", "()V", ak.av, "b", "Landroidx/paging/q0$b$a;", "Landroidx/paging/q0$b$b;", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static abstract class b<Key, Value> {

        /* JADX INFO: renamed from: androidx.paging.q0$b$a, reason: from toString */
        /* JADX INFO: compiled from: PagingSource.kt */
        @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/paging/q0$b$a;", "", "Key", "Value", "Landroidx/paging/q0$b;", "", ak.av, "throwable", "b", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Throwable;", "d", "()Ljava/lang/Throwable;", "<init>", "(Ljava/lang/Throwable;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final /* data */ class Error<Key, Value> extends b<Key, Value> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @dl.d
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@dl.d Throwable throwable) {
                super(null);
                kotlin.jvm.internal.f0.p(throwable, "throwable");
                this.throwable = throwable;
            }

            public static /* synthetic */ Error c(Error error, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    th2 = error.throwable;
                }
                return error.b(th2);
            }

            @dl.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @dl.d
            public final Error<Key, Value> b(@dl.d Throwable throwable) {
                kotlin.jvm.internal.f0.p(throwable, "throwable");
                return new Error<>(throwable);
            }

            @dl.d
            public final Throwable d() {
                return this.throwable;
            }

            public boolean equals(@dl.e Object other) {
                if (this != other) {
                    return (other instanceof Error) && kotlin.jvm.internal.f0.g(this.throwable, ((Error) other).throwable);
                }
                return true;
            }

            public int hashCode() {
                Throwable th2 = this.throwable;
                if (th2 != null) {
                    return th2.hashCode();
                }
                return 0;
            }

            @dl.d
            public String toString() {
                return "Error(throwable=" + this.throwable + ")";
            }
        }

        /* JADX INFO: renamed from: androidx.paging.q0$b$b, reason: collision with other inner class name and from toString */
        /* JADX INFO: compiled from: PagingSource.kt */
        @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 (*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004:\u0001\u001aB=\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00050\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00018\u0004\u0012\b\b\u0003\u0010\u0010\u001a\u00020\n\u0012\b\b\u0003\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b%\u0010&B+\b\u0016\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00050\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00018\u0004¢\u0006\u0004\b%\u0010'J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00050\u0005HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0004HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00018\u0004HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003JX\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00050\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00018\u00042\b\b\u0003\u0010\u0010\u001a\u00020\n2\b\b\u0003\u0010\u0011\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00050\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\bR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b$\u0010#¨\u0006)"}, d2 = {"Landroidx/paging/q0$b$b;", "", "Key", "Value", "Landroidx/paging/q0$b;", "", "b", ak.aF, "()Ljava/lang/Object;", "d", "", "e", "f", "data", "prevKey", "nextKey", "itemsBefore", "itemsAfter", "g", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)Landroidx/paging/q0$b$b;", "", "toString", "hashCode", "other", "", "equals", ak.av, "Ljava/util/List;", "i", "()Ljava/util/List;", "Ljava/lang/Object;", "m", "l", "I", "k", "()I", "j", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", RXScreenCaptureService.KEY_HEIGHT, "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final /* data */ class Page<Key, Value> extends b<Key, Value> {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f26601f = Integer.MIN_VALUE;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @dl.d
            private final List<Value> data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            @dl.e
            private final Key prevKey;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @dl.e
            private final Key nextKey;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int itemsBefore;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final int itemsAfter;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @dl.d
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @dl.d
            private static final Page f26602g = new Page(CollectionsKt__CollectionsKt.E(), null, null, 0, 0);

            /* JADX INFO: renamed from: androidx.paging.q0$b$b$a, reason: from kotlin metadata */
            /* JADX INFO: compiled from: PagingSource.kt */
            @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\fJ/\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0004\"\b\b\u0006\u0010\u0002*\u00020\u0001\"\b\b\u0007\u0010\u0003*\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00048\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/paging/q0$b$b$a;", "", "Key", "Value", "Landroidx/paging/q0$b$b;", ak.av, "()Landroidx/paging/q0$b$b;", "", "EMPTY", "Landroidx/paging/q0$b$b;", "b", "getEMPTY$paging_common$annotations", "()V", "", "COUNT_UNDEFINED", "I", "<init>", "paging-common"}, k = 1, mv = {1, 4, 2})
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                    this();
                }

                public static /* synthetic */ void c() {
                }

                @dl.d
                public final <Key, Value> Page<Key, Value> a() {
                    Page<Key, Value> pageB = b();
                    if (pageB != null) {
                        return pageB;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key, Value>");
                }

                @dl.d
                public final Page b() {
                    return Page.f26602g;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Page(@dl.d List<? extends Value> data, @dl.e Key key, @dl.e Key key2) {
                this(data, key, key2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                kotlin.jvm.internal.f0.p(data, "data");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Page(@dl.d List<? extends Value> data, @dl.e Key key, @dl.e Key key2, @androidx.annotation.f0(from = -2147483648L) int i10, @androidx.annotation.f0(from = -2147483648L) int i11) {
                super(null);
                kotlin.jvm.internal.f0.p(data, "data");
                this.data = data;
                this.prevKey = key;
                this.nextKey = key2;
                this.itemsBefore = i10;
                this.itemsAfter = i11;
                if (!(i10 == Integer.MIN_VALUE || i10 >= 0)) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative".toString());
                }
                if (!(i11 == Integer.MIN_VALUE || i11 >= 0)) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative".toString());
                }
            }

            public /* synthetic */ Page(List list, Object obj, Object obj2, int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
                this(list, obj, obj2, (i12 & 8) != 0 ? Integer.MIN_VALUE : i10, (i12 & 16) != 0 ? Integer.MIN_VALUE : i11);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Page h(Page page, List list, Object obj, Object obj2, int i10, int i11, int i12, Object obj3) {
                if ((i12 & 1) != 0) {
                    list = page.data;
                }
                if ((i12 & 2) != 0) {
                    obj = page.prevKey;
                }
                Object obj4 = obj;
                if ((i12 & 4) != 0) {
                    obj2 = page.nextKey;
                }
                Object obj5 = obj2;
                if ((i12 & 8) != 0) {
                    i10 = page.itemsBefore;
                }
                int i13 = i10;
                if ((i12 & 16) != 0) {
                    i11 = page.itemsAfter;
                }
                return page.g(list, obj4, obj5, i13, i11);
            }

            @dl.d
            public final List<Value> b() {
                return this.data;
            }

            @dl.e
            public final Key c() {
                return this.prevKey;
            }

            @dl.e
            public final Key d() {
                return this.nextKey;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final int getItemsBefore() {
                return this.itemsBefore;
            }

            public boolean equals(@dl.e Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Page)) {
                    return false;
                }
                Page page = (Page) other;
                return kotlin.jvm.internal.f0.g(this.data, page.data) && kotlin.jvm.internal.f0.g(this.prevKey, page.prevKey) && kotlin.jvm.internal.f0.g(this.nextKey, page.nextKey) && this.itemsBefore == page.itemsBefore && this.itemsAfter == page.itemsAfter;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final int getItemsAfter() {
                return this.itemsAfter;
            }

            @dl.d
            public final Page<Key, Value> g(@dl.d List<? extends Value> data, @dl.e Key prevKey, @dl.e Key nextKey, @androidx.annotation.f0(from = -2147483648L) int itemsBefore, @androidx.annotation.f0(from = -2147483648L) int itemsAfter) {
                kotlin.jvm.internal.f0.p(data, "data");
                return new Page<>(data, prevKey, nextKey, itemsBefore, itemsAfter);
            }

            public int hashCode() {
                List<Value> list = this.data;
                int iHashCode = (list != null ? list.hashCode() : 0) * 31;
                Key key = this.prevKey;
                int iHashCode2 = (iHashCode + (key != null ? key.hashCode() : 0)) * 31;
                Key key2 = this.nextKey;
                return ((((iHashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31) + this.itemsBefore) * 31) + this.itemsAfter;
            }

            @dl.d
            public final List<Value> i() {
                return this.data;
            }

            public final int j() {
                return this.itemsAfter;
            }

            public final int k() {
                return this.itemsBefore;
            }

            @dl.e
            public final Key l() {
                return this.nextKey;
            }

            @dl.e
            public final Key m() {
                return this.prevKey;
            }

            @dl.d
            public String toString() {
                return "Page(data=" + this.data + ", prevKey=" + this.prevKey + ", nextKey=" + this.nextKey + ", itemsBefore=" + this.itemsBefore + ", itemsAfter=" + this.itemsAfter + ")";
            }
        }

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    @androidx.annotation.j1
    public static /* synthetic */ void e() {
    }

    public final boolean a() {
        return this._invalid.get();
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    @dl.d
    public final CopyOnWriteArrayList<yh.a<b2>> d() {
        return this.onInvalidatedCallbacks;
    }

    @dl.e
    public abstract Key f(@dl.d PagingState<Key, Value> state);

    public final void g() {
        if (this._invalid.compareAndSet(false, true)) {
            Iterator<T> it = this.onInvalidatedCallbacks.iterator();
            while (it.hasNext()) {
                ((yh.a) it.next()).invoke();
            }
        }
    }

    @dl.e
    public abstract Object h(@dl.d a<Key> aVar, @dl.d kotlin.coroutines.c<? super b<Key, Value>> cVar);

    public final void i(@dl.d yh.a<b2> onInvalidatedCallback) {
        kotlin.jvm.internal.f0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.onInvalidatedCallbacks.add(onInvalidatedCallback);
    }

    public final void j(@dl.d yh.a<b2> onInvalidatedCallback) {
        kotlin.jvm.internal.f0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.onInvalidatedCallbacks.remove(onInvalidatedCallback);
    }
}
