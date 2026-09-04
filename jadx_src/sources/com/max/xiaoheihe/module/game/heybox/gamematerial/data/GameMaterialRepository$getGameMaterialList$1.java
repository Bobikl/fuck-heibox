package com.max.xiaoheihe.module.game.heybox.gamematerial.data;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.flow.f;
import yh.p;

/* JADX INFO: compiled from: GameMaterialRepository.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.data.GameMaterialRepository$getGameMaterialList$1", f = "GameMaterialRepository.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
public final class GameMaterialRepository$getGameMaterialList$1 extends SuspendLambda implements p<f<? super Result<GameMaterialListObj>>, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f87458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f87459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ GameMaterialRepository f87460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f87461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f87462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f87463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f87464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f87465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f87466j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameMaterialRepository$getGameMaterialList$1(GameMaterialRepository gameMaterialRepository, String str, String str2, String str3, String str4, int i10, int i11, c<? super GameMaterialRepository$getGameMaterialList$1> cVar) {
        super(2, cVar);
        this.f87460d = gameMaterialRepository;
        this.f87461e = str;
        this.f87462f = str2;
        this.f87463g = str3;
        this.f87464h = str4;
        this.f87465i = i10;
        this.f87466j = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37530, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        GameMaterialRepository$getGameMaterialList$1 gameMaterialRepository$getGameMaterialList$1 = new GameMaterialRepository$getGameMaterialList$1(this.f87460d, this.f87461e, this.f87462f, this.f87463g, this.f87464h, this.f87465i, this.f87466j, cVar);
        gameMaterialRepository$getGameMaterialList$1.f87459c = obj;
        return gameMaterialRepository$getGameMaterialList$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(f<? super Result<GameMaterialListObj>> fVar, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 37532, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(fVar, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d f<? super Result<GameMaterialListObj>> fVar, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 37531, new Class[]{f.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GameMaterialRepository$getGameMaterialList$1) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37529, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f87458b;
        if (i10 == 0) {
            t0.n(obj);
            f fVar = (f) this.f87459c;
            Result resultA = GameMaterialRepository.a(this.f87460d, this.f87461e, this.f87462f, this.f87463g, this.f87464h, this.f87465i, this.f87466j);
            if (resultA != null) {
                this.f87458b = 1;
                if (fVar.emit(resultA, this) == objH) {
                    return objH;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
