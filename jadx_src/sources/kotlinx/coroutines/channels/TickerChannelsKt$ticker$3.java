package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: TickerChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {72, 73}, m = "invokeSuspend", n = {}, s = {})
public final class TickerChannelsKt$ticker$3 extends SuspendLambda implements yh.p<w<? super b2>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TickerMode f129017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f129018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f129019f;

    /* JADX INFO: compiled from: TickerChannels.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129020a;

        static {
            int[] iArr = new int[TickerMode.values().length];
            iArr[TickerMode.FIXED_PERIOD.ordinal()] = 1;
            iArr[TickerMode.FIXED_DELAY.ordinal()] = 2;
            f129020a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TickerChannelsKt$ticker$3(TickerMode tickerMode, long j10, long j11, kotlin.coroutines.c<? super TickerChannelsKt$ticker$3> cVar) {
        super(2, cVar);
        this.f129017d = tickerMode;
        this.f129018e = j10;
        this.f129019f = j11;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<? super b2> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((TickerChannelsKt$ticker$3) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TickerChannelsKt$ticker$3 tickerChannelsKt$ticker$3 = new TickerChannelsKt$ticker$3(this.f129017d, this.f129018e, this.f129019f, cVar);
        tickerChannelsKt$ticker$3.f129016c = obj;
        return tickerChannelsKt$ticker$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129015b;
        if (i10 == 0) {
            t0.n(obj);
            w wVar = (w) this.f129016c;
            int i11 = a.f129020a[this.f129017d.ordinal()];
            if (i11 == 1) {
                long j10 = this.f129018e;
                long j11 = this.f129019f;
                b0 b0VarC = wVar.c();
                this.f129015b = 1;
                if (TickerChannelsKt.d(j10, j11, b0VarC, this) == objH) {
                    return objH;
                }
            } else if (i11 == 2) {
                long j12 = this.f129018e;
                long j13 = this.f129019f;
                b0 b0VarC2 = wVar.c();
                this.f129015b = 2;
                if (TickerChannelsKt.c(j12, j13, b0VarC2, this) == objH) {
                    return objH;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
