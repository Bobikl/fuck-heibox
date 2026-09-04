package com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel;

import com.max.hbcommon.base.UiState;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.bean.Result;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.q0;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: GameMaterialLibraryViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialLibraryViewModel$requestHomeData$1", f = "GameMaterialLibraryViewModel.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
public final class GameMaterialLibraryViewModel$requestHomeData$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f87635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GameMaterialLibraryViewModel f87636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f87637d;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialLibraryViewModel$requestHomeData$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: GameMaterialLibraryViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialLibraryViewModel$requestHomeData$1$1", f = "GameMaterialLibraryViewModel.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements q<kotlinx.coroutines.flow.f<? super Result<GameMaterialObj>>, Throwable, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f87638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f87639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameMaterialLibraryViewModel f87640d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GameMaterialLibraryViewModel gameMaterialLibraryViewModel, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.f87640d = gameMaterialLibraryViewModel;
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.f<? super Result<GameMaterialObj>> fVar, Throwable th2, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, th2, cVar}, this, changeQuickRedirect, false, 37815, new Class[]{Object.class, Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(fVar, th2, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.flow.f<? super Result<GameMaterialObj>> fVar, @dl.d Throwable th2, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, th2, cVar}, this, changeQuickRedirect, false, 37814, new Class[]{kotlinx.coroutines.flow.f.class, Throwable.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f87640d, cVar);
            anonymousClass1.f87639c = th2;
            return anonymousClass1.invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37813, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f87638b;
            if (i10 == 0) {
                t0.n(obj);
                Throwable th2 = (Throwable) this.f87639c;
                g.f74531b.q("GameMaterialLibraryViewModel, error = " + th2);
                j jVar = this.f87640d.f87629n;
                UiState.Error error = new UiState.Error(th2);
                this.f87638b = 1;
                if (jVar.emit(error, this) == objH) {
                    return objH;
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

    /* JADX INFO: compiled from: GameMaterialLibraryViewModel.kt */
    @kotlin.jvm.internal.t0({"SMAP\nGameMaterialLibraryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMaterialLibraryViewModel.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/viewmodel/GameMaterialLibraryViewModel$requestHomeData$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1559#2:132\n1590#2,4:133\n*S KotlinDebug\n*F\n+ 1 GameMaterialLibraryViewModel.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/viewmodel/GameMaterialLibraryViewModel$requestHomeData$1$2\n*L\n109#1:132\n109#1:133,4\n*E\n"})
    public static final class a implements kotlinx.coroutines.flow.f<Result<GameMaterialObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameMaterialLibraryViewModel f87641b;

        a(GameMaterialLibraryViewModel gameMaterialLibraryViewModel) {
            this.f87641b = gameMaterialLibraryViewModel;
        }

        @dl.e
        public final Object a(@dl.d Result<GameMaterialObj> result, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            ArrayList arrayList;
            KeyDescObj keyDescObj;
            KeyDescObj keyDescObj2;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result, cVar}, this, changeQuickRedirect, false, 37816, new Class[]{Result.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            GameMaterialObj result2 = result.getResult();
            if (result2 != null) {
                GameMaterialLibraryViewModel gameMaterialLibraryViewModel = this.f87641b;
                j jVar = gameMaterialLibraryViewModel.f87626k;
                ArrayList<KeyDescObj> queryFilter = result2.getQueryFilter();
                if (queryFilter != null) {
                    arrayList = new ArrayList(t.Y(queryFilter, 10));
                    int i10 = 0;
                    for (Object obj : queryFilter) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt__CollectionsKt.W();
                        }
                        arrayList.add(new com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.a(i10, 0));
                        i10 = i11;
                    }
                } else {
                    arrayList = null;
                }
                jVar.setValue(arrayList);
                ArrayList<KeyDescObj> sortFilter = result2.getSortFilter();
                if (sortFilter != null && (keyDescObj2 = sortFilter.get(0)) != null) {
                    keyDescObj2.setIs_default(true);
                    keyDescObj2.setChecked(true);
                    gameMaterialLibraryViewModel.u(keyDescObj2);
                }
                ArrayList<KeyDescObj> sizeFilter = result2.getSizeFilter();
                if (sizeFilter != null && (keyDescObj = sizeFilter.get(0)) != null) {
                    keyDescObj.setChecked(true);
                    keyDescObj.setIs_default(true);
                    gameMaterialLibraryViewModel.t(keyDescObj);
                }
                Object objEmit = gameMaterialLibraryViewModel.f87629n.emit(new UiState.Success(result2), cVar);
                if (objEmit == kotlin.coroutines.intrinsics.b.h()) {
                    return objEmit;
                }
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Result<GameMaterialObj> result, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result, cVar}, this, changeQuickRedirect, false, 37817, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(result, cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameMaterialLibraryViewModel$requestHomeData$1(GameMaterialLibraryViewModel gameMaterialLibraryViewModel, String str, kotlin.coroutines.c<? super GameMaterialLibraryViewModel$requestHomeData$1> cVar) {
        super(2, cVar);
        this.f87636c = gameMaterialLibraryViewModel;
        this.f87637d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37810, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GameMaterialLibraryViewModel$requestHomeData$1(this.f87636c, this.f87637d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37812, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37811, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GameMaterialLibraryViewModel$requestHomeData$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37809, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f87635b;
        if (i10 == 0) {
            t0.n(obj);
            kotlinx.coroutines.flow.e eVarU = kotlinx.coroutines.flow.g.u(this.f87636c.k().c(this.f87637d), new AnonymousClass1(this.f87636c, null));
            a aVar = new a(this.f87636c);
            this.f87635b = 1;
            if (eVarU.a(aVar, this) == objH) {
                return objH;
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
