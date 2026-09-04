package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: PageEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0003\r\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJM\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00012(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ=\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\b\u0082\u0001\u0003\u0012\u0013\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/paging/PageEvent;", "", androidx.exifinterface.media.a.f23244d5, "R", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "transform", "e", "(Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", ak.aF, "", "predicate", ak.av, "<init>", "()V", "Insert", "b", "Landroidx/paging/PageEvent$Insert;", "Landroidx/paging/PageEvent$a;", "Landroidx/paging/PageEvent$b;", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class PageEvent<T> {

    /* JADX INFO: compiled from: PageEvent.kt */
    @Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\b\u0018\u0000 9*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0014B=\b\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0015\u0012\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\t\u0012\u0006\u0010\u001f\u001a\u00020\u0018\u0012\u0006\u0010 \u001a\u00020\u0018\u0012\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b7\u00108J9\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u0005H\u0082\bJO\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012*\u0010\u0007\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\t\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\t0\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u0004*\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0096@ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJM\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u0004*\u00020\u00012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000fJ=\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\t\u0010\u0016\u001a\u00020\u0015HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0018HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0018HÆ\u0003J\t\u0010\u001c\u001a\u00020\u001bHÆ\u0003JM\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00152\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\t2\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u001bHÆ\u0001J\t\u0010$\u001a\u00020#HÖ\u0001J\t\u0010%\u001a\u00020\u0018HÖ\u0001J\u0013\u0010'\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u001d\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b)\u0010*R#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u001f\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101R\u0017\u0010 \u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0017\u0010!\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u00106\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006:"}, d2 = {"Landroidx/paging/PageEvent$Insert;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/PageEvent;", "R", "Lkotlin/Function1;", "Landroidx/paging/d1;", "transform", "t", "", ak.aG, "(Lyh/l;)Landroidx/paging/PageEvent$Insert;", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "e", "(Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", ak.aF, "", "predicate", ak.av, "Landroidx/paging/LoadType;", RXScreenCaptureService.KEY_HEIGHT, "i", "", "j", "k", "Landroidx/paging/d;", "l", "loadType", "pages", "placeholdersBefore", "placeholdersAfter", "combinedLoadStates", "m", "", "toString", "hashCode", "other", "equals", "Landroidx/paging/LoadType;", "p", "()Landroidx/paging/LoadType;", "b", "Ljava/util/List;", "q", "()Ljava/util/List;", "I", ak.aB, "()I", "d", "r", "Landroidx/paging/d;", "o", "()Landroidx/paging/d;", "<init>", "(Landroidx/paging/LoadType;Ljava/util/List;IILandroidx/paging/d;)V", "g", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final /* data */ class Insert<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        private static final Insert<Object> f25654f;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private final LoadType loadType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private final List<TransformablePage<T>> pages;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int placeholdersBefore;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int placeholdersAfter;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private final CombinedLoadStates combinedLoadStates;

        /* JADX INFO: renamed from: androidx.paging.PageEvent$Insert$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: PageEvent.kt */
        @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\b\b\u0002\u0010\u0002*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ:\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\b\b\u0002\u0010\u0002*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ:\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\b\b\u0002\u0010\u0002*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/paging/PageEvent$Insert$a;", "", androidx.exifinterface.media.a.f23244d5, "", "Landroidx/paging/d1;", "pages", "", "placeholdersBefore", "placeholdersAfter", "Landroidx/paging/d;", "combinedLoadStates", "Landroidx/paging/PageEvent$Insert;", ak.aF, "b", ak.av, "EMPTY_REFRESH_LOCAL", "Landroidx/paging/PageEvent$Insert;", "d", "()Landroidx/paging/PageEvent$Insert;", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.d
            public final <T> Insert<T> a(@dl.d List<TransformablePage<T>> pages, int placeholdersAfter, @dl.d CombinedLoadStates combinedLoadStates) {
                kotlin.jvm.internal.f0.p(pages, "pages");
                kotlin.jvm.internal.f0.p(combinedLoadStates, "combinedLoadStates");
                return new Insert<>(LoadType.APPEND, pages, -1, placeholdersAfter, combinedLoadStates, null);
            }

            @dl.d
            public final <T> Insert<T> b(@dl.d List<TransformablePage<T>> pages, int placeholdersBefore, @dl.d CombinedLoadStates combinedLoadStates) {
                kotlin.jvm.internal.f0.p(pages, "pages");
                kotlin.jvm.internal.f0.p(combinedLoadStates, "combinedLoadStates");
                return new Insert<>(LoadType.PREPEND, pages, placeholdersBefore, -1, combinedLoadStates, null);
            }

            @dl.d
            public final <T> Insert<T> c(@dl.d List<TransformablePage<T>> pages, int placeholdersBefore, int placeholdersAfter, @dl.d CombinedLoadStates combinedLoadStates) {
                kotlin.jvm.internal.f0.p(pages, "pages");
                kotlin.jvm.internal.f0.p(combinedLoadStates, "combinedLoadStates");
                return new Insert<>(LoadType.REFRESH, pages, placeholdersBefore, placeholdersAfter, combinedLoadStates, null);
            }

            @dl.d
            public final Insert<Object> d() {
                return Insert.f25654f;
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            List<TransformablePage<T>> listK = kotlin.collections.s.k(TransformablePage.INSTANCE.b());
            v.NotLoading.Companion companion2 = v.NotLoading.INSTANCE;
            f25654f = companion.c(listK, 0, 0, new CombinedLoadStates(companion2.b(), companion2.a(), companion2.a(), new LoadStates(companion2.b(), companion2.a(), companion2.a()), null, 16, null));
        }

        private Insert(LoadType loadType, List<TransformablePage<T>> list, int i10, int i11, CombinedLoadStates combinedLoadStates) {
            super(null);
            this.loadType = loadType;
            this.pages = list;
            this.placeholdersBefore = i10;
            this.placeholdersAfter = i11;
            this.combinedLoadStates = combinedLoadStates;
            if (!(loadType == LoadType.APPEND || i10 >= 0)) {
                throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + i10).toString());
            }
            if (loadType == LoadType.PREPEND || i11 >= 0) {
                if (!(loadType != LoadType.REFRESH || (list.isEmpty() ^ true))) {
                    throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
                }
            } else {
                throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + i11).toString());
            }
        }

        public /* synthetic */ Insert(LoadType loadType, List list, int i10, int i11, CombinedLoadStates combinedLoadStates, kotlin.jvm.internal.u uVar) {
            this(loadType, list, i10, i11, combinedLoadStates);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Insert n(Insert insert, LoadType loadType, List list, int i10, int i11, CombinedLoadStates combinedLoadStates, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                loadType = insert.loadType;
            }
            if ((i12 & 2) != 0) {
                list = insert.pages;
            }
            List list2 = list;
            if ((i12 & 4) != 0) {
                i10 = insert.placeholdersBefore;
            }
            int i13 = i10;
            if ((i12 & 8) != 0) {
                i11 = insert.placeholdersAfter;
            }
            int i14 = i11;
            if ((i12 & 16) != 0) {
                combinedLoadStates = insert.combinedLoadStates;
            }
            return insert.m(loadType, list2, i13, i14, combinedLoadStates);
        }

        private final <R> Insert<R> t(yh.l<? super TransformablePage<T>, TransformablePage<R>> lVar) {
            LoadType loadTypeP = p();
            List<TransformablePage<T>> listQ = q();
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listQ, 10));
            Iterator<T> it = listQ.iterator();
            while (it.hasNext()) {
                arrayList.add(lVar.invoke(it.next()));
            }
            return new Insert<>(loadTypeP, arrayList, s(), r(), o(), null);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0099  */
        /* JADX WARN: Code duplicated, block: B:20:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:22:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:25:0x0101 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0102  */
        /* JADX WARN: Code duplicated, block: B:36:0x0143  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0099 -> B:18:0x00bb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0102 -> B:27:0x0114). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.PageEvent
        @dl.e
        public java.lang.Object a(@dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super java.lang.Boolean>, ? extends java.lang.Object> r20, @dl.d kotlin.coroutines.c<? super androidx.paging.PageEvent<T>> r21) {
            /*
                Method dump skipped, instruction units count: 364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.a(yh.p, kotlin.coroutines.c):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0098  */
        /* JADX WARN: Code duplicated, block: B:20:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:22:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:25:0x00ff A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0100  */
        /* JADX WARN: Code duplicated, block: B:36:0x0144  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0098 -> B:18:0x00b9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0100 -> B:27:0x010f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.PageEvent
        @dl.e
        public <R> java.lang.Object c(@dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> r19, @dl.d kotlin.coroutines.c<? super androidx.paging.PageEvent<R>> r20) {
            /*
                Method dump skipped, instruction units count: 366
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.c(yh.p, kotlin.coroutines.c):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:17:0x008f  */
        /* JADX WARN: Code duplicated, block: B:20:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:22:0x00e3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:25:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008f -> B:18:0x00b0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00e4 -> B:24:0x00ec). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.PageEvent
        @dl.e
        public <R> java.lang.Object e(@dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends java.lang.Object> r18, @dl.d kotlin.coroutines.c<? super androidx.paging.PageEvent<R>> r19) {
            /*
                Method dump skipped, instruction units count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.e(yh.p, kotlin.coroutines.c):java.lang.Object");
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Insert)) {
                return false;
            }
            Insert insert = (Insert) other;
            return kotlin.jvm.internal.f0.g(this.loadType, insert.loadType) && kotlin.jvm.internal.f0.g(this.pages, insert.pages) && this.placeholdersBefore == insert.placeholdersBefore && this.placeholdersAfter == insert.placeholdersAfter && kotlin.jvm.internal.f0.g(this.combinedLoadStates, insert.combinedLoadStates);
        }

        @dl.d
        /* JADX INFO: renamed from: h, reason: from getter */
        public final LoadType getLoadType() {
            return this.loadType;
        }

        public int hashCode() {
            LoadType loadType = this.loadType;
            int iHashCode = (loadType != null ? loadType.hashCode() : 0) * 31;
            List<TransformablePage<T>> list = this.pages;
            int iHashCode2 = (((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.placeholdersBefore) * 31) + this.placeholdersAfter) * 31;
            CombinedLoadStates combinedLoadStates = this.combinedLoadStates;
            return iHashCode2 + (combinedLoadStates != null ? combinedLoadStates.hashCode() : 0);
        }

        @dl.d
        public final List<TransformablePage<T>> i() {
            return this.pages;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        @dl.d
        /* JADX INFO: renamed from: l, reason: from getter */
        public final CombinedLoadStates getCombinedLoadStates() {
            return this.combinedLoadStates;
        }

        @dl.d
        public final Insert<T> m(@dl.d LoadType loadType, @dl.d List<TransformablePage<T>> pages, int placeholdersBefore, int placeholdersAfter, @dl.d CombinedLoadStates combinedLoadStates) {
            kotlin.jvm.internal.f0.p(loadType, "loadType");
            kotlin.jvm.internal.f0.p(pages, "pages");
            kotlin.jvm.internal.f0.p(combinedLoadStates, "combinedLoadStates");
            return new Insert<>(loadType, pages, placeholdersBefore, placeholdersAfter, combinedLoadStates);
        }

        @dl.d
        public final CombinedLoadStates o() {
            return this.combinedLoadStates;
        }

        @dl.d
        public final LoadType p() {
            return this.loadType;
        }

        @dl.d
        public final List<TransformablePage<T>> q() {
            return this.pages;
        }

        public final int r() {
            return this.placeholdersAfter;
        }

        public final int s() {
            return this.placeholdersBefore;
        }

        @dl.d
        public String toString() {
            return "Insert(loadType=" + this.loadType + ", pages=" + this.pages + ", placeholdersBefore=" + this.placeholdersBefore + ", placeholdersAfter=" + this.placeholdersAfter + ", combinedLoadStates=" + this.combinedLoadStates + ")";
        }

        @dl.d
        public final <R> Insert<R> u(@dl.d yh.l<? super List<TransformablePage<T>>, ? extends List<TransformablePage<R>>> transform) {
            kotlin.jvm.internal.f0.p(transform, "transform");
            return new Insert<>(p(), transform.invoke(q()), s(), r(), o(), null);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageEvent$a, reason: from toString */
    /* JADX INFO: compiled from: PageEvent.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B'\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0011\u0010\"\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\u001c¨\u0006%"}, d2 = {"Landroidx/paging/PageEvent$a;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/PageEvent;", "Landroidx/paging/LoadType;", "g", "", RXScreenCaptureService.KEY_HEIGHT, "i", "j", "loadType", "minPageOffset", "maxPageOffset", "placeholdersRemaining", "k", "", "toString", "hashCode", "other", "", "equals", ak.av, "Landroidx/paging/LoadType;", "m", "()Landroidx/paging/LoadType;", "b", "I", "o", "()I", ak.aF, "n", "d", "q", "p", "pageCount", "<init>", "(Landroidx/paging/LoadType;III)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final /* data */ class Drop<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private final LoadType loadType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int minPageOffset;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxPageOffset;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int placeholdersRemaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Drop(@dl.d LoadType loadType, int i10, int i11, int i12) {
            super(null);
            kotlin.jvm.internal.f0.p(loadType, "loadType");
            this.loadType = loadType;
            this.minPageOffset = i10;
            this.maxPageOffset = i11;
            this.placeholdersRemaining = i12;
            if (!(loadType != LoadType.REFRESH)) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
            }
            if (!(p() > 0)) {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + p()).toString());
            }
            if (i12 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("Invalid placeholdersRemaining " + i12).toString());
        }

        public static /* synthetic */ Drop l(Drop drop, LoadType loadType, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                loadType = drop.loadType;
            }
            if ((i13 & 2) != 0) {
                i10 = drop.minPageOffset;
            }
            if ((i13 & 4) != 0) {
                i11 = drop.maxPageOffset;
            }
            if ((i13 & 8) != 0) {
                i12 = drop.placeholdersRemaining;
            }
            return drop.k(loadType, i10, i11, i12);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Drop)) {
                return false;
            }
            Drop drop = (Drop) other;
            return kotlin.jvm.internal.f0.g(this.loadType, drop.loadType) && this.minPageOffset == drop.minPageOffset && this.maxPageOffset == drop.maxPageOffset && this.placeholdersRemaining == drop.placeholdersRemaining;
        }

        @dl.d
        /* JADX INFO: renamed from: g, reason: from getter */
        public final LoadType getLoadType() {
            return this.loadType;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getMinPageOffset() {
            return this.minPageOffset;
        }

        public int hashCode() {
            LoadType loadType = this.loadType;
            return ((((((loadType != null ? loadType.hashCode() : 0) * 31) + this.minPageOffset) * 31) + this.maxPageOffset) * 31) + this.placeholdersRemaining;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getMaxPageOffset() {
            return this.maxPageOffset;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getPlaceholdersRemaining() {
            return this.placeholdersRemaining;
        }

        @dl.d
        public final Drop<T> k(@dl.d LoadType loadType, int minPageOffset, int maxPageOffset, int placeholdersRemaining) {
            kotlin.jvm.internal.f0.p(loadType, "loadType");
            return new Drop<>(loadType, minPageOffset, maxPageOffset, placeholdersRemaining);
        }

        @dl.d
        public final LoadType m() {
            return this.loadType;
        }

        public final int n() {
            return this.maxPageOffset;
        }

        public final int o() {
            return this.minPageOffset;
        }

        public final int p() {
            return (this.maxPageOffset - this.minPageOffset) + 1;
        }

        public final int q() {
            return this.placeholdersRemaining;
        }

        @dl.d
        public String toString() {
            return "Drop(loadType=" + this.loadType + ", minPageOffset=" + this.minPageOffset + ", maxPageOffset=" + this.maxPageOffset + ", placeholdersRemaining=" + this.placeholdersRemaining + ")";
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageEvent$b, reason: from toString */
    /* JADX INFO: compiled from: PageEvent.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 \"*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0014B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/paging/PageEvent$b;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/PageEvent;", "Landroidx/paging/LoadType;", "g", "", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/paging/v;", "i", "loadType", "fromMediator", "loadState", "j", "", "toString", "", "hashCode", "other", "equals", ak.av, "Landroidx/paging/LoadType;", "n", "()Landroidx/paging/LoadType;", "b", "Z", "l", "()Z", ak.aF, "Landroidx/paging/v;", "m", "()Landroidx/paging/v;", "<init>", "(Landroidx/paging/LoadType;ZLandroidx/paging/v;)V", "d", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final /* data */ class LoadStateUpdate<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private final LoadType loadType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean fromMediator;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private final v loadState;

        /* JADX INFO: renamed from: androidx.paging.PageEvent$b$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: PageEvent.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/paging/PageEvent$b$a;", "", "Landroidx/paging/v;", "loadState", "", "fromMediator", ak.av, "(Landroidx/paging/v;Z)Z", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final boolean a(@dl.d v loadState, boolean fromMediator) {
                kotlin.jvm.internal.f0.p(loadState, "loadState");
                return (loadState instanceof v.Loading) || (loadState instanceof v.Error) || fromMediator;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadStateUpdate(@dl.d LoadType loadType, boolean z10, @dl.d v loadState) {
            super(null);
            kotlin.jvm.internal.f0.p(loadType, "loadType");
            kotlin.jvm.internal.f0.p(loadState, "loadState");
            this.loadType = loadType;
            this.fromMediator = z10;
            this.loadState = loadState;
            if (!((loadType == LoadType.REFRESH && !z10 && (loadState instanceof v.NotLoading) && loadState.getEndOfPaginationReached()) ? false : true)) {
                throw new IllegalArgumentException("LoadStateUpdate for local REFRESH may not set endOfPaginationReached = true".toString());
            }
            if (!INSTANCE.a(loadState, z10)) {
                throw new IllegalArgumentException("LoadStateUpdates cannot be used to dispatch NotLoading unless it is from remote mediator and remote mediator reached end of pagination.".toString());
            }
        }

        public static /* synthetic */ LoadStateUpdate k(LoadStateUpdate loadStateUpdate, LoadType loadType, boolean z10, v vVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                loadType = loadStateUpdate.loadType;
            }
            if ((i10 & 2) != 0) {
                z10 = loadStateUpdate.fromMediator;
            }
            if ((i10 & 4) != 0) {
                vVar = loadStateUpdate.loadState;
            }
            return loadStateUpdate.j(loadType, z10, vVar);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadStateUpdate)) {
                return false;
            }
            LoadStateUpdate loadStateUpdate = (LoadStateUpdate) other;
            return kotlin.jvm.internal.f0.g(this.loadType, loadStateUpdate.loadType) && this.fromMediator == loadStateUpdate.fromMediator && kotlin.jvm.internal.f0.g(this.loadState, loadStateUpdate.loadState);
        }

        @dl.d
        /* JADX INFO: renamed from: g, reason: from getter */
        public final LoadType getLoadType() {
            return this.loadType;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getFromMediator() {
            return this.fromMediator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public int hashCode() {
            LoadType loadType = this.loadType;
            int iHashCode = (loadType != null ? loadType.hashCode() : 0) * 31;
            boolean z10 = this.fromMediator;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int i10 = (iHashCode + r10) * 31;
            v vVar = this.loadState;
            return i10 + (vVar != null ? vVar.hashCode() : 0);
        }

        @dl.d
        /* JADX INFO: renamed from: i, reason: from getter */
        public final v getLoadState() {
            return this.loadState;
        }

        @dl.d
        public final LoadStateUpdate<T> j(@dl.d LoadType loadType, boolean fromMediator, @dl.d v loadState) {
            kotlin.jvm.internal.f0.p(loadType, "loadType");
            kotlin.jvm.internal.f0.p(loadState, "loadState");
            return new LoadStateUpdate<>(loadType, fromMediator, loadState);
        }

        public final boolean l() {
            return this.fromMediator;
        }

        @dl.d
        public final v m() {
            return this.loadState;
        }

        @dl.d
        public final LoadType n() {
            return this.loadType;
        }

        @dl.d
        public String toString() {
            return "LoadStateUpdate(loadType=" + this.loadType + ", fromMediator=" + this.fromMediator + ", loadState=" + this.loadState + ")";
        }
    }

    private PageEvent() {
    }

    public /* synthetic */ PageEvent(kotlin.jvm.internal.u uVar) {
        this();
    }

    static /* synthetic */ Object b(PageEvent pageEvent, yh.p pVar, kotlin.coroutines.c cVar) {
        return pageEvent;
    }

    static /* synthetic */ Object d(PageEvent pageEvent, yh.p pVar, kotlin.coroutines.c cVar) {
        if (pageEvent != null) {
            return pageEvent;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.paging.PageEvent<R>");
    }

    static /* synthetic */ Object f(PageEvent pageEvent, yh.p pVar, kotlin.coroutines.c cVar) {
        if (pageEvent != null) {
            return pageEvent;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.paging.PageEvent<R>");
    }

    @dl.e
    public Object a(@dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super PageEvent<T>> cVar) {
        return b(this, pVar, cVar);
    }

    @dl.e
    public <R> Object c(@dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Iterable<? extends R>>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super PageEvent<R>> cVar) {
        return d(this, pVar, cVar);
    }

    @dl.e
    public <R> Object e(@dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super PageEvent<R>> cVar) {
        return f(this, pVar, cVar);
    }
}
