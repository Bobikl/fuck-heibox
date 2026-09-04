package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: Separators.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\u00020\u0001B`\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012L\u0010F\u001aH\b\u0001\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(D\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000E\u0012\u0006\u0012\u0004\u0018\u00010\u00010@ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\b\b\u0002\u0010\u0003*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004H\u0002J'\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00010\u000bJ\"\u0010\u0010\u001a\u00020\u000f\"\b\b\u0002\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\"\u0010\u0011\u001a\u00020\u000f\"\b\b\u0002\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00198\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00108\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\"\u0010:\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b$\u0010 \"\u0004\b9\u0010\"R\"\u0010<\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001f\u001a\u0004\b/\u0010 \"\u0004\b;\u0010\"R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u0010=\u001a\u0004\b>\u0010?R`\u0010F\u001aH\b\u0001\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(D\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000E\u0012\u0006\u0012\u0004\u0018\u00010\u00010@8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b)\u0010H\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, d2 = {"Landroidx/paging/SeparatorState;", "", "R", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/d1;", "originalPage", "x", "Landroidx/paging/PageEvent;", androidx.core.app.o0.I0, "m", "(Landroidx/paging/PageEvent;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/PageEvent$Insert;", ak.av, "Landroidx/paging/TerminalSeparatorType;", "terminalSeparatorType", "", RXScreenCaptureService.KEY_WIDTH, "v", "n", "(Landroidx/paging/PageEvent$Insert;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/PageEvent$a;", "l", "Landroidx/paging/PageEvent$b;", "o", "(Landroidx/paging/PageEvent$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "Ljava/util/List;", "g", "()Ljava/util/List;", "pageStash", "b", "Z", "()Z", "p", "(Z)V", "endTerminalSeparatorDeferred", ak.aF, "j", ak.aG, "startTerminalSeparatorDeferred", "Landroidx/paging/z;", "d", "Landroidx/paging/z;", "f", "()Landroidx/paging/z;", "loadStates", "", "e", "I", "i", "()I", "t", "(I)V", "placeholdersBefore", RXScreenCaptureService.KEY_HEIGHT, ak.aB, "placeholdersAfter", "q", "footerAdded", "r", "headerAdded", "Landroidx/paging/TerminalSeparatorType;", "k", "()Landroidx/paging/TerminalSeparatorType;", "Lkotlin/Function3;", "Lkotlin/m0;", "name", com.google.android.exoplayer2.text.ttml.d.f49784c0, com.google.android.exoplayer2.text.ttml.d.f49785d0, "Lkotlin/coroutines/c;", "generator", "Lyh/q;", "()Lyh/q;", "<init>", "(Landroidx/paging/TerminalSeparatorType;Lyh/q;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class SeparatorState<R, T extends R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<TransformablePage<T>> pageStash;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean endTerminalSeparatorDeferred;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean startTerminalSeparatorDeferred;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z loadStates;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int placeholdersBefore;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int placeholdersAfter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean footerAdded;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean headerAdded;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TerminalSeparatorType terminalSeparatorType;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final yh.q<T, T, kotlin.coroutines.c<? super R>, Object> f26250j;

    /* JADX WARN: Multi-variable type inference failed */
    public SeparatorState(@dl.d TerminalSeparatorType terminalSeparatorType, @dl.d yh.q<? super T, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> generator) {
        kotlin.jvm.internal.f0.p(terminalSeparatorType, "terminalSeparatorType");
        kotlin.jvm.internal.f0.p(generator, "generator");
        this.terminalSeparatorType = terminalSeparatorType;
        this.f26250j = generator;
        this.pageStash = new ArrayList();
        this.loadStates = new z();
    }

    private final <T> TransformablePage<T> x(TransformablePage<T> originalPage) {
        Integer num;
        Integer num2;
        int[] iArrK = originalPage.k();
        List listL = CollectionsKt__CollectionsKt.L(CollectionsKt___CollectionsKt.w2(originalPage.h()), CollectionsKt___CollectionsKt.k3(originalPage.h()));
        int iJ = originalPage.j();
        Integer[] numArr = new Integer[2];
        List<Integer> listI = originalPage.i();
        numArr[0] = Integer.valueOf((listI == null || (num2 = (Integer) CollectionsKt___CollectionsKt.w2(listI)) == null) ? 0 : num2.intValue());
        List<Integer> listI2 = originalPage.i();
        numArr[1] = Integer.valueOf((listI2 == null || (num = (Integer) CollectionsKt___CollectionsKt.k3(listI2)) == null) ? CollectionsKt__CollectionsKt.G(originalPage.h()) : num.intValue());
        return new TransformablePage<>(iArrK, listL, iJ, CollectionsKt__CollectionsKt.L(numArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final PageEvent.Insert<R> a(@dl.d PageEvent.Insert<T> asRType) {
        kotlin.jvm.internal.f0.p(asRType, "$this$asRType");
        return asRType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEndTerminalSeparatorDeferred() {
        return this.endTerminalSeparatorDeferred;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getFooterAdded() {
        return this.footerAdded;
    }

    @dl.d
    public final yh.q<T, T, kotlin.coroutines.c<? super R>, Object> d() {
        return this.f26250j;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getHeaderAdded() {
        return this.headerAdded;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final z getLoadStates() {
        return this.loadStates;
    }

    @dl.d
    public final List<TransformablePage<T>> g() {
        return this.pageStash;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getStartTerminalSeparatorDeferred() {
        return this.startTerminalSeparatorDeferred;
    }

    @dl.d
    /* JADX INFO: renamed from: k, reason: from getter */
    public final TerminalSeparatorType getTerminalSeparatorType() {
        return this.terminalSeparatorType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final PageEvent.Drop<R> l(@dl.d PageEvent.Drop<T> event) {
        kotlin.jvm.internal.f0.p(event, "event");
        this.loadStates.j(event.m(), false, v.NotLoading.INSTANCE.b());
        LoadType loadTypeM = event.m();
        LoadType loadType = LoadType.PREPEND;
        if (loadTypeM == loadType) {
            this.placeholdersBefore = event.q();
            this.headerAdded = false;
        } else if (event.m() == LoadType.APPEND) {
            this.placeholdersAfter = event.q();
            this.footerAdded = false;
        }
        if (this.pageStash.isEmpty()) {
            if (event.m() == loadType) {
                this.startTerminalSeparatorDeferred = false;
            } else {
                this.endTerminalSeparatorDeferred = false;
            }
        }
        final fi.l lVar = new fi.l(event.o(), event.n());
        kotlin.collections.x.I0(this.pageStash, new yh.l<TransformablePage<T>, Boolean>() { // from class: androidx.paging.SeparatorState$onDrop$1
            {
                super(1);
            }

            public final boolean a(@dl.d TransformablePage<T> stash) {
                kotlin.jvm.internal.f0.p(stash, "stash");
                for (int i10 : stash.k()) {
                    if (lVar.s(i10)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return Boolean.valueOf(a((TransformablePage) obj));
            }
        });
        return event;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.paging.SeparatorState, androidx.paging.SeparatorState<R, T extends R>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.paging.SeparatorState] */
    @dl.e
    public final Object m(@dl.d PageEvent<T> pageEvent, @dl.d kotlin.coroutines.c<? super PageEvent<R>> cVar) throws Throwable {
        SeparatorState$onEvent$1 separatorState$onEvent$1;
        ?? r10;
        Object objL;
        ?? r11;
        ?? r12;
        if (cVar instanceof SeparatorState$onEvent$1) {
            separatorState$onEvent$1 = (SeparatorState$onEvent$1) cVar;
            int i10 = separatorState$onEvent$1.f26253c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                separatorState$onEvent$1.f26253c = i10 - Integer.MIN_VALUE;
            } else {
                separatorState$onEvent$1 = new SeparatorState$onEvent$1(this, cVar);
            }
        } else {
            separatorState$onEvent$1 = new SeparatorState$onEvent$1(this, cVar);
        }
        Object objO = separatorState$onEvent$1.f26252b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = separatorState$onEvent$1.f26253c;
        if (i11 == 0) {
            kotlin.t0.n(objO);
            if (pageEvent instanceof PageEvent.Insert) {
                separatorState$onEvent$1.f26255e = this;
                separatorState$onEvent$1.f26253c = 1;
                objO = n((PageEvent.Insert) pageEvent, separatorState$onEvent$1);
                if (objO == objH) {
                    return objH;
                }
                r12 = this;
                objL = (PageEvent) objO;
                r11 = r12;
            } else if (pageEvent instanceof PageEvent.Drop) {
                objL = l((PageEvent.Drop) pageEvent);
                r11 = this;
            } else {
                if (!(pageEvent instanceof PageEvent.LoadStateUpdate)) {
                    throw new NoWhenBranchMatchedException();
                }
                separatorState$onEvent$1.f26255e = this;
                separatorState$onEvent$1.f26253c = 2;
                objO = o((PageEvent.LoadStateUpdate) pageEvent, separatorState$onEvent$1);
                if (objO == objH) {
                    return objH;
                }
                r10 = this;
                objL = (PageEvent) objO;
                r11 = r10;
            }
        } else if (i11 == 1) {
            SeparatorState separatorState = (SeparatorState) separatorState$onEvent$1.f26255e;
            kotlin.t0.n(objO);
            r12 = separatorState;
            objL = (PageEvent) objO;
            r11 = r12;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SeparatorState separatorState2 = (SeparatorState) separatorState$onEvent$1.f26255e;
            kotlin.t0.n(objO);
            r10 = separatorState2;
            objL = (PageEvent) objO;
            r11 = r10;
        }
        if (r11.endTerminalSeparatorDeferred && !r11.pageStash.isEmpty()) {
            throw new IllegalStateException("deferred endTerm, page stash should be empty".toString());
        }
        if (!r11.startTerminalSeparatorDeferred || r11.pageStash.isEmpty()) {
            return objL;
        }
        throw new IllegalStateException("deferred startTerm, page stash should be empty".toString());
    }

    /* JADX WARN: Code duplicated, block: B:135:0x043f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0473 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:138:0x0474  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0474 -> B:139:0x047b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x0691 -> B:17:0x00d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:225:0x077d -> B:226:0x077e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public final java.lang.Object n(@dl.d androidx.paging.PageEvent.Insert<T> r30, @dl.d kotlin.coroutines.c<? super androidx.paging.PageEvent.Insert<R>> r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.n(androidx.paging.PageEvent$Insert, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final Object o(@dl.d PageEvent.LoadStateUpdate<T> loadStateUpdate, @dl.d kotlin.coroutines.c<? super PageEvent<R>> cVar) {
        if (kotlin.jvm.internal.f0.g(this.loadStates.g(loadStateUpdate.n(), loadStateUpdate.l()), loadStateUpdate.m())) {
            return loadStateUpdate;
        }
        this.loadStates.j(loadStateUpdate.n(), loadStateUpdate.l(), loadStateUpdate.m());
        if (loadStateUpdate.n() != LoadType.REFRESH && loadStateUpdate.l() && loadStateUpdate.m().getEndOfPaginationReached()) {
            return n(loadStateUpdate.n() == LoadType.PREPEND ? PageEvent.Insert.INSTANCE.b(CollectionsKt__CollectionsKt.E(), this.placeholdersBefore, this.loadStates.k()) : PageEvent.Insert.INSTANCE.a(CollectionsKt__CollectionsKt.E(), this.placeholdersAfter, this.loadStates.k()), cVar);
        }
        return loadStateUpdate;
    }

    public final void p(boolean z10) {
        this.endTerminalSeparatorDeferred = z10;
    }

    public final void q(boolean z10) {
        this.footerAdded = z10;
    }

    public final void r(boolean z10) {
        this.headerAdded = z10;
    }

    public final void s(int i10) {
        this.placeholdersAfter = i10;
    }

    public final void t(int i10) {
        this.placeholdersBefore = i10;
    }

    public final void u(boolean z10) {
        this.startTerminalSeparatorDeferred = z10;
    }

    public final <T> boolean v(@dl.d PageEvent.Insert<T> terminatesEnd, @dl.d TerminalSeparatorType terminalSeparatorType) {
        LoadStates mediator;
        v vVarI;
        kotlin.jvm.internal.f0.p(terminatesEnd, "$this$terminatesEnd");
        kotlin.jvm.internal.f0.p(terminalSeparatorType, "terminalSeparatorType");
        if (terminatesEnd.p() == LoadType.PREPEND) {
            return this.endTerminalSeparatorDeferred;
        }
        int i10 = a1.f26366b[terminalSeparatorType.ordinal()];
        if (i10 == 1) {
            return terminatesEnd.o().getSource().i().getEndOfPaginationReached() && ((mediator = terminatesEnd.o().getMediator()) == null || (vVarI = mediator.i()) == null || vVarI.getEndOfPaginationReached());
        }
        if (i10 == 2) {
            return terminatesEnd.o().getSource().i().getEndOfPaginationReached();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final <T> boolean w(@dl.d PageEvent.Insert<T> terminatesStart, @dl.d TerminalSeparatorType terminalSeparatorType) {
        LoadStates mediator;
        v vVarJ;
        kotlin.jvm.internal.f0.p(terminatesStart, "$this$terminatesStart");
        kotlin.jvm.internal.f0.p(terminalSeparatorType, "terminalSeparatorType");
        if (terminatesStart.p() == LoadType.APPEND) {
            return this.startTerminalSeparatorDeferred;
        }
        int i10 = a1.f26365a[terminalSeparatorType.ordinal()];
        if (i10 == 1) {
            return terminatesStart.o().getSource().j().getEndOfPaginationReached() && ((mediator = terminatesStart.o().getMediator()) == null || (vVarJ = mediator.j()) == null || vVarJ.getEndOfPaginationReached());
        }
        if (i10 == 2) {
            return terminatesStart.o().getSource().j().getEndOfPaginationReached();
        }
        throw new NoWhenBranchMatchedException();
    }
}
