package androidx.paging;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.r3;

/* JADX INFO: compiled from: PagingDataDiffer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "androidx/paging/PagingDataDiffer$collectFrom$2$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PagingDataDiffer$collectFrom$2$1$1", f = "PagingDataDiffer.kt", i = {0, 0}, l = {142, 180}, m = "invokeSuspend", n = {"newPresenter", "onListPresentableCalled"}, s = {"L$0", "L$1"})
public final class PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f26036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f26037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f26038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ PageEvent f26039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 f26040f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1(PageEvent pageEvent, kotlin.coroutines.c cVar, PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1) {
        super(2, cVar);
        this.f26039e = pageEvent;
        this.f26040f = pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1(this.f26039e, completion, this.f26040f);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:22:0x009f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00da  */
    /* JADX WARN: Code duplicated, block: B:37:0x011a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
    /* JADX WARN: Code duplicated, block: B:54:0x017b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0185  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0202  */
    /* JADX WARN: Code duplicated, block: B:75:0x020e  */
    /* JADX WARN: Code duplicated, block: B:76:0x022a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[LOOP:0: B:55:0x017f->B:81:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        final PagePresenter pagePresenter;
        Ref.BooleanRef booleanRef;
        Integer num;
        e1 e1Var;
        e1 e1Var2;
        PageEvent pageEvent;
        boolean z10;
        List listQ;
        Iterator it;
        boolean z11;
        e1 e1Var3;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26038d;
        boolean z12 = true;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            PageEvent pageEvent2 = this.f26039e;
            if ((pageEvent2 instanceof PageEvent.Insert) && ((PageEvent.Insert) pageEvent2).p() == LoadType.REFRESH) {
                this.f26040f.f26035b.f26033c.lastAccessedIndexUnfulfilled = false;
                pagePresenter = new PagePresenter((PageEvent.Insert) this.f26039e);
                final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                booleanRef2.f124884b = false;
                PagingDataDiffer pagingDataDiffer = this.f26040f.f26035b.f26033c;
                PagePresenter pagePresenter2 = pagingDataDiffer.presenter;
                CombinedLoadStates combinedLoadStatesO = ((PageEvent.Insert) this.f26039e).o();
                int i11 = this.f26040f.f26035b.f26033c.lastAccessedIndex;
                yh.a<b2> aVar = new yh.a<b2>() { // from class: androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1.this.f26040f.f26035b.f26033c.presenter = pagePresenter;
                        booleanRef2.f124884b = true;
                    }
                };
                this.f26036b = pagePresenter;
                this.f26037c = booleanRef2;
                this.f26038d = 1;
                Object objX = pagingDataDiffer.x(pagePresenter2, pagePresenter, combinedLoadStatesO, i11, aVar, this);
                if (objX == objH) {
                    return objH;
                }
                booleanRef = booleanRef2;
                obj = objX;
                num = (Integer) obj;
                if (booleanRef.f124884b) {
                    throw new IllegalStateException("Missing call to onListPresentable after new list was presented. If you are seeing this exception, it is generally an indication of an issue with Paging. Please file a bug so we can fix it at: https://issuetracker.google.com/issues/new?component=413106".toString());
                }
                this.f26040f.f26035b.f26033c.r(((PageEvent.Insert) this.f26039e).o());
                if (num == null) {
                    e1Var2 = this.f26040f.f26035b.f26033c.com.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String;
                    if (e1Var2 != null) {
                        e1Var2.I(pagePresenter.o());
                    }
                } else {
                    this.f26040f.f26035b.f26033c.lastAccessedIndex = num.intValue();
                    e1Var = this.f26040f.f26035b.f26033c.com.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String;
                    if (e1Var != null) {
                        e1Var.I(pagePresenter.d(num.intValue()));
                    }
                }
            } else {
                if (this.f26040f.f26035b.f26033c.w()) {
                    this.f26038d = 2;
                    if (r3.a(this) == objH) {
                        return objH;
                    }
                }
                this.f26040f.f26035b.f26033c.presenter.q(this.f26039e, this.f26040f.f26035b.f26033c.processPageEventCallback);
                if (this.f26039e instanceof PageEvent.Drop) {
                    this.f26040f.f26035b.f26033c.lastAccessedIndexUnfulfilled = false;
                }
                pageEvent = this.f26039e;
                if (pageEvent instanceof PageEvent.Insert) {
                    if (((PageEvent.Insert) this.f26039e).p() == LoadType.PREPEND) {
                    }
                    listQ = ((PageEvent.Insert) this.f26039e).q();
                    if (!(listQ instanceof Collection)) {
                        it = listQ.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = true;
                                break;
                            }
                            if (!kotlin.coroutines.jvm.internal.a.a(((TransformablePage) it.next()).h().isEmpty()).booleanValue()) {
                                z11 = false;
                                break;
                            }
                        }
                    } else {
                        it = listQ.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = true;
                                break;
                            }
                            if (!kotlin.coroutines.jvm.internal.a.a(((TransformablePage) it.next()).h().isEmpty()).booleanValue()) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    if (!z10) {
                        this.f26040f.f26035b.f26033c.lastAccessedIndexUnfulfilled = false;
                    } else if (this.f26040f.f26035b.f26033c.lastAccessedIndexUnfulfilled) {
                        if (!z11) {
                            z12 = false;
                        }
                        if (z12) {
                            e1Var3 = this.f26040f.f26035b.f26033c.com.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String;
                            if (e1Var3 != null) {
                                e1Var3.I(this.f26040f.f26035b.f26033c.presenter.d(this.f26040f.f26035b.f26033c.lastAccessedIndex));
                            }
                        } else {
                            this.f26040f.f26035b.f26033c.lastAccessedIndexUnfulfilled = false;
                        }
                    } else {
                        if (!z11) {
                            z12 = false;
                        }
                        if (z12) {
                            e1Var3 = this.f26040f.f26035b.f26033c.com.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String;
                            if (e1Var3 != null) {
                                e1Var3.I(this.f26040f.f26035b.f26033c.presenter.d(this.f26040f.f26035b.f26033c.lastAccessedIndex));
                            }
                        } else {
                            this.f26040f.f26035b.f26033c.lastAccessedIndexUnfulfilled = false;
                        }
                    }
                }
            }
        } else if (i10 == 1) {
            booleanRef = (Ref.BooleanRef) this.f26037c;
            pagePresenter = (PagePresenter) this.f26036b;
            kotlin.t0.n(obj);
            num = (Integer) obj;
            if (booleanRef.f124884b) {
                throw new IllegalStateException("Missing call to onListPresentable after new list was presented. If you are seeing this exception, it is generally an indication of an issue with Paging. Please file a bug so we can fix it at: https://issuetracker.google.com/issues/new?component=413106".toString());
            }
            this.f26040f.f26035b.f26033c.r(((PageEvent.Insert) this.f26039e).o());
            if (num == null) {
                e1Var2 = this.f26040f.f26035b.f26033c.com.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String;
                if (e1Var2 != null) {
                    e1Var2.I(pagePresenter.o());
                }
            } else {
                this.f26040f.f26035b.f26033c.lastAccessedIndex = num.intValue();
                e1Var = this.f26040f.f26035b.f26033c.com.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String;
                if (e1Var != null) {
                    e1Var.I(pagePresenter.d(num.intValue()));
                }
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            this.f26040f.f26035b.f26033c.presenter.q(this.f26039e, this.f26040f.f26035b.f26033c.processPageEventCallback);
            if (this.f26039e instanceof PageEvent.Drop) {
                this.f26040f.f26035b.f26033c.lastAccessedIndexUnfulfilled = false;
            }
            pageEvent = this.f26039e;
            if (pageEvent instanceof PageEvent.Insert) {
                z10 = (((PageEvent.Insert) this.f26039e).p() == LoadType.PREPEND || !((PageEvent.Insert) pageEvent).o().getPrepend().getEndOfPaginationReached()) && !(((PageEvent.Insert) this.f26039e).p() == LoadType.APPEND && ((PageEvent.Insert) this.f26039e).o().getAppend().getEndOfPaginationReached());
                listQ = ((PageEvent.Insert) this.f26039e).q();
                if (!(listQ instanceof Collection) || !listQ.isEmpty()) {
                    it = listQ.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z11 = true;
                            break;
                        }
                        if (!kotlin.coroutines.jvm.internal.a.a(((TransformablePage) it.next()).h().isEmpty()).booleanValue()) {
                            z11 = false;
                            break;
                        }
                    }
                } else {
                    z11 = true;
                    break;
                }
                if (!z10) {
                    this.f26040f.f26035b.f26033c.lastAccessedIndexUnfulfilled = false;
                } else if (this.f26040f.f26035b.f26033c.lastAccessedIndexUnfulfilled || z11) {
                    if (!z11 && this.f26040f.f26035b.f26033c.lastAccessedIndex >= this.f26040f.f26035b.f26033c.presenter.getPlaceholdersBefore() && this.f26040f.f26035b.f26033c.lastAccessedIndex <= this.f26040f.f26035b.f26033c.presenter.getPlaceholdersBefore() + this.f26040f.f26035b.f26033c.presenter.getStorageCount()) {
                        z12 = false;
                    }
                    if (z12) {
                        e1Var3 = this.f26040f.f26035b.f26033c.com.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String;
                        if (e1Var3 != null) {
                            e1Var3.I(this.f26040f.f26035b.f26033c.presenter.d(this.f26040f.f26035b.f26033c.lastAccessedIndex));
                        }
                    } else {
                        this.f26040f.f26035b.f26033c.lastAccessedIndexUnfulfilled = false;
                    }
                }
            }
        }
        return b2.f124493a;
    }
}
