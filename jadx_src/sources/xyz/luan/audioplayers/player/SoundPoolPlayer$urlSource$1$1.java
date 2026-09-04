package xyz.luan.audioplayers.player;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import nl.UrlSource;
import yh.p;

/* JADX INFO: compiled from: SoundPoolPlayer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "xyz.luan.audioplayers.player.SoundPoolPlayer$urlSource$1$1", f = "SoundPoolPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SoundPoolPlayer$urlSource$1$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f141358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ UrlSource f141359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SoundPoolPlayer f141360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ SoundPoolPlayer f141361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f141362f;

    /* JADX INFO: renamed from: xyz.luan.audioplayers.player.SoundPoolPlayer$urlSource$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SoundPoolPlayer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "xyz.luan.audioplayers.player.SoundPoolPlayer$urlSource$1$1$1", f = "SoundPoolPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f141363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f141364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SoundPoolPlayer f141365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f141366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SoundPoolPlayer f141367f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ UrlSource f141368g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f141369h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SoundPoolPlayer soundPoolPlayer, String str, SoundPoolPlayer soundPoolPlayer2, UrlSource urlSource, long j10, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f141365d = soundPoolPlayer;
            this.f141366e = str;
            this.f141367f = soundPoolPlayer2;
            this.f141368g = urlSource;
            this.f141369h = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f141365d, this.f141366e, this.f141367f, this.f141368g, this.f141369h, cVar);
            anonymousClass1.f141364c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.h();
            if (this.f141363b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            q0 q0Var = (q0) this.f141364c;
            this.f141365d.getWrappedPlayer().x("Now loading " + this.f141366e);
            int iLoad = this.f141365d.k().load(this.f141366e, 1);
            this.f141365d.soundPoolWrapper.b().put(kotlin.coroutines.jvm.internal.a.f(iLoad), this.f141367f);
            this.f141365d.p(kotlin.coroutines.jvm.internal.a.f(iLoad));
            this.f141365d.getWrappedPlayer().x("time to call load() for " + this.f141368g + ": " + (System.currentTimeMillis() - this.f141369h) + " player=" + q0Var);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoundPoolPlayer$urlSource$1$1(UrlSource urlSource, SoundPoolPlayer soundPoolPlayer, SoundPoolPlayer soundPoolPlayer2, long j10, kotlin.coroutines.c<? super SoundPoolPlayer$urlSource$1$1> cVar) {
        super(2, cVar);
        this.f141359c = urlSource;
        this.f141360d = soundPoolPlayer;
        this.f141361e = soundPoolPlayer2;
        this.f141362f = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new SoundPoolPlayer$urlSource$1$1(this.f141359c, this.f141360d, this.f141361e, this.f141362f, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SoundPoolPlayer$urlSource$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f141358b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        kotlinx.coroutines.k.f(this.f141360d.mainScope, e1.e(), null, new AnonymousClass1(this.f141360d, this.f141359c.h(), this.f141361e, this.f141359c, this.f141362f, null), 2, null);
        return b2.f124493a;
    }
}
