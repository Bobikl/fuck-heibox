package com.max.xiaoheihe.module.game.heybox.gamematerial.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.core.view.n3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.r;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.UiState;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.SystemWindowInsetExtensionsKt;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialItem;
import com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialLibraryViewModel;
import com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.aa;
import java.io.Serializable;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import ng.j;
import xh.m;
import yh.p;

/* JADX INFO: compiled from: GameMaterialListFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameMaterialListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMaterialListFragment.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/GameMaterialListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,177:1\n106#2,15:178\n106#2,15:193\n*S KotlinDebug\n*F\n+ 1 GameMaterialListFragment.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/GameMaterialListFragment\n*L\n26#1:178,15\n27#1:193,15\n*E\n"})
@o(parameters = 0)
public final class GameMaterialListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f87507h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f87508i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final String f87509j = "list_type";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f87510k = "list_index";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final z f87511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final z f87512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private Integer f87513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private KeyDescObj f87514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private aa f87515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private d f87516g;

    /* JADX INFO: compiled from: GameMaterialListFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final GameMaterialListFragment a(int i10, @dl.d KeyDescObj keyDescObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), keyDescObj}, this, changeQuickRedirect, false, 37640, new Class[]{Integer.TYPE, KeyDescObj.class}, GameMaterialListFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (GameMaterialListFragment) patchProxyResultProxy.result;
            }
            f0.p(keyDescObj, "keyDescObj");
            GameMaterialListFragment gameMaterialListFragment = new GameMaterialListFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("list_type", keyDescObj);
            bundle.putSerializable(GameMaterialListFragment.f87510k, Integer.valueOf(i10));
            gameMaterialListFragment.setArguments(bundle);
            return gameMaterialListFragment;
        }
    }

    /* JADX INFO: compiled from: GameMaterialListFragment.kt */
    public static final class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 37643, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            GameMaterialListFragment.N3(GameMaterialListFragment.this).x();
        }
    }

    /* JADX INFO: compiled from: GameMaterialListFragment.kt */
    public static final class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 37644, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            GameMaterialListFragment.N3(GameMaterialListFragment.this).w();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1, reason: invalid class name */
    /* JADX INFO: compiled from: GameMaterialListFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1", f = "GameMaterialListFragment.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f87520b;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: GameMaterialListFragment.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1$1", f = "GameMaterialListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07951 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f87522b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f87523c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ GameMaterialListFragment f87524d;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: GameMaterialListFragment.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1$1$1", f = "GameMaterialListFragment.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
            public static final class C07961 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f87525b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f87526c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ GameMaterialListFragment f87527d;

                /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1$1$1$a */
                /* JADX INFO: compiled from: GameMaterialListFragment.kt */
                @t0({"SMAP\nGameMaterialListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMaterialListFragment.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/GameMaterialListFragment$registerEvents$1$1$1$1\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,177:1\n29#2:178\n5#2,2:179\n22#2:181\n7#2:182\n*S KotlinDebug\n*F\n+ 1 GameMaterialListFragment.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/GameMaterialListFragment$registerEvents$1$1$1$1\n*L\n61#1:178\n61#1:179,2\n61#1:181\n61#1:182\n*E\n"})
                public static final class a implements f<String> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ q0 f87528b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ GameMaterialListFragment f87529c;

                    a(q0 q0Var, GameMaterialListFragment gameMaterialListFragment) {
                        this.f87528b = q0Var;
                        this.f87529c = gameMaterialListFragment;
                    }

                    @dl.e
                    public final Object a(@dl.e String str, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                        String name;
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cVar}, this, changeQuickRedirect, false, 37657, new Class[]{String.class, kotlin.coroutines.c.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        String str2 = "GameMaterialListFragment, registerEvents, topicId " + str;
                        g.a aVar = g.f74531b;
                        StringBuilder sb2 = new StringBuilder();
                        if (q0.class.isAnonymousClass()) {
                            name = q0.class.getName();
                            f0.m(name);
                        } else {
                            name = q0.class.getSimpleName();
                            f0.m(name);
                        }
                        sb2.append(name);
                        sb2.append(", ");
                        sb2.append(str2);
                        aVar.q(sb2.toString());
                        if (str != null) {
                            GameMaterialListFragment.N3(this.f87529c).D(str);
                        }
                        return b2.f124493a;
                    }

                    @Override // kotlinx.coroutines.flow.f
                    public /* bridge */ /* synthetic */ Object emit(String str, kotlin.coroutines.c cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cVar}, this, changeQuickRedirect, false, 37658, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str, cVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C07961(GameMaterialListFragment gameMaterialListFragment, kotlin.coroutines.c<? super C07961> cVar) {
                    super(2, cVar);
                    this.f87527d = gameMaterialListFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37654, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    if (patchProxyResultProxy.isSupported) {
                        return (kotlin.coroutines.c) patchProxyResultProxy.result;
                    }
                    C07961 c07961 = new C07961(this.f87527d, cVar);
                    c07961.f87526c = obj;
                    return c07961;
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37656, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37655, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C07961) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37653, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f87525b;
                    if (i10 == 0) {
                        kotlin.t0.n(obj);
                        q0 q0Var = (q0) this.f87526c;
                        kotlinx.coroutines.flow.u<String> uVarO = GameMaterialListFragment.M3(this.f87527d).o();
                        a aVar = new a(q0Var, this.f87527d);
                        this.f87525b = 1;
                        if (uVarO.a(aVar, this) == objH) {
                            return objH;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: GameMaterialListFragment.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1$1$2", f = "GameMaterialListFragment.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f87530b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ GameMaterialListFragment f87531c;

                /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1$1$2$a */
                /* JADX INFO: compiled from: GameMaterialListFragment.kt */
                public static final class a implements f<KeyDescObj> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ GameMaterialListFragment f87532b;

                    a(GameMaterialListFragment gameMaterialListFragment) {
                        this.f87532b = gameMaterialListFragment;
                    }

                    @dl.e
                    public final Object a(@dl.e KeyDescObj keyDescObj, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj, cVar}, this, changeQuickRedirect, false, 37663, new Class[]{KeyDescObj.class, kotlin.coroutines.c.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        GameMaterialListFragment.N3(this.f87532b).C(keyDescObj);
                        return b2.f124493a;
                    }

                    @Override // kotlinx.coroutines.flow.f
                    public /* bridge */ /* synthetic */ Object emit(KeyDescObj keyDescObj, kotlin.coroutines.c cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj, cVar}, this, changeQuickRedirect, false, 37664, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(keyDescObj, cVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(GameMaterialListFragment gameMaterialListFragment, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.f87531c = gameMaterialListFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37660, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass2(this.f87531c, cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37662, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37661, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37659, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f87530b;
                    if (i10 == 0) {
                        kotlin.t0.n(obj);
                        kotlinx.coroutines.flow.u<KeyDescObj> uVarN = GameMaterialListFragment.M3(this.f87531c).n();
                        a aVar = new a(this.f87531c);
                        this.f87530b = 1;
                        if (uVarN.a(aVar, this) == objH) {
                            return objH;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1$1$3, reason: invalid class name */
            /* JADX INFO: compiled from: GameMaterialListFragment.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1$1$3", f = "GameMaterialListFragment.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass3 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f87533b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ GameMaterialListFragment f87534c;

                /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1$1$3$a */
                /* JADX INFO: compiled from: GameMaterialListFragment.kt */
                public static final class a implements f<KeyDescObj> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ GameMaterialListFragment f87535b;

                    a(GameMaterialListFragment gameMaterialListFragment) {
                        this.f87535b = gameMaterialListFragment;
                    }

                    @dl.e
                    public final Object a(@dl.e KeyDescObj keyDescObj, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj, cVar}, this, changeQuickRedirect, false, 37669, new Class[]{KeyDescObj.class, kotlin.coroutines.c.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        GameMaterialListFragment.N3(this.f87535b).B(keyDescObj);
                        return b2.f124493a;
                    }

                    @Override // kotlinx.coroutines.flow.f
                    public /* bridge */ /* synthetic */ Object emit(KeyDescObj keyDescObj, kotlin.coroutines.c cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj, cVar}, this, changeQuickRedirect, false, 37670, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(keyDescObj, cVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(GameMaterialListFragment gameMaterialListFragment, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
                    super(2, cVar);
                    this.f87534c = gameMaterialListFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37666, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass3(this.f87534c, cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37668, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37667, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37665, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f87533b;
                    if (i10 == 0) {
                        kotlin.t0.n(obj);
                        kotlinx.coroutines.flow.u<KeyDescObj> uVarM = GameMaterialListFragment.M3(this.f87534c).m();
                        a aVar = new a(this.f87534c);
                        this.f87533b = 1;
                        if (uVarM.a(aVar, this) == objH) {
                            return objH;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1$1$4, reason: invalid class name */
            /* JADX INFO: compiled from: GameMaterialListFragment.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1$1$4", f = "GameMaterialListFragment.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass4 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f87536b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ GameMaterialListFragment f87537c;

                /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$1$1$4$a */
                /* JADX INFO: compiled from: GameMaterialListFragment.kt */
                public static final class a implements f<List<? extends com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.a>> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ GameMaterialListFragment f87538b;

                    a(GameMaterialListFragment gameMaterialListFragment) {
                        this.f87538b = gameMaterialListFragment;
                    }

                    @dl.e
                    public final Object a(@dl.e List<com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.a> list, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, cVar}, this, changeQuickRedirect, false, 37675, new Class[]{List.class, kotlin.coroutines.c.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        Integer num = this.f87538b.f87513d;
                        if (num != null) {
                            GameMaterialListFragment gameMaterialListFragment = this.f87538b;
                            com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.a aVar = list != null ? list.get(num.intValue()) : null;
                            if (aVar != null) {
                                GameMaterialListFragment.N3(gameMaterialListFragment).z(aVar.f());
                            }
                        }
                        return b2.f124493a;
                    }

                    @Override // kotlinx.coroutines.flow.f
                    public /* bridge */ /* synthetic */ Object emit(List<? extends com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.a> list, kotlin.coroutines.c cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, cVar}, this, changeQuickRedirect, false, 37676, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(list, cVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(GameMaterialListFragment gameMaterialListFragment, kotlin.coroutines.c<? super AnonymousClass4> cVar) {
                    super(2, cVar);
                    this.f87537c = gameMaterialListFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37672, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass4(this.f87537c, cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37674, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37673, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass4) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37671, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f87536b;
                    if (i10 == 0) {
                        kotlin.t0.n(obj);
                        kotlinx.coroutines.flow.u<List<com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.a>> uVarI = GameMaterialListFragment.M3(this.f87537c).i();
                        a aVar = new a(this.f87537c);
                        this.f87536b = 1;
                        if (uVarI.a(aVar, this) == objH) {
                            return objH;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07951(GameMaterialListFragment gameMaterialListFragment, kotlin.coroutines.c<? super C07951> cVar) {
                super(2, cVar);
                this.f87524d = gameMaterialListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37650, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                if (patchProxyResultProxy.isSupported) {
                    return (kotlin.coroutines.c) patchProxyResultProxy.result;
                }
                C07951 c07951 = new C07951(this.f87524d, cVar);
                c07951.f87523c = obj;
                return c07951;
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37652, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37651, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C07951) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37649, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                kotlin.coroutines.intrinsics.b.h();
                if (this.f87522b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
                q0 q0Var = (q0) this.f87523c;
                k.f(q0Var, null, null, new C07961(this.f87524d, null), 3, null);
                k.f(q0Var, null, null, new AnonymousClass2(this.f87524d, null), 3, null);
                k.f(q0Var, null, null, new AnonymousClass3(this.f87524d, null), 3, null);
                k.f(q0Var, null, null, new AnonymousClass4(this.f87524d, null), 3, null);
                return b2.f124493a;
            }
        }

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37646, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : GameMaterialListFragment.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37648, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37647, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37645, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f87520b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                GameMaterialListFragment gameMaterialListFragment = GameMaterialListFragment.this;
                Lifecycle.State state = Lifecycle.State.RESUMED;
                C07951 c07951 = new C07951(gameMaterialListFragment, null);
                this.f87520b = 1;
                if (RepeatOnLifecycleKt.b(gameMaterialListFragment, state, c07951, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$2, reason: invalid class name */
    /* JADX INFO: compiled from: GameMaterialListFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$2", f = "GameMaterialListFragment.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f87539b;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: GameMaterialListFragment.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$2$1", f = "GameMaterialListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f87541b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f87542c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ GameMaterialListFragment f87543d;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: GameMaterialListFragment.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$2$1$1", f = "GameMaterialListFragment.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
            public static final class C07971 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f87544b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ GameMaterialListFragment f87545c;

                /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$2$1$1$a */
                /* JADX INFO: compiled from: GameMaterialListFragment.kt */
                public static final class a implements f<UiState<? extends com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.c>> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ GameMaterialListFragment f87546b;

                    a(GameMaterialListFragment gameMaterialListFragment) {
                        this.f87546b = gameMaterialListFragment;
                    }

                    @dl.e
                    public final Object a(@dl.d UiState<com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.c> uiState, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                        d dVar;
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiState, cVar}, this, changeQuickRedirect, false, 37689, new Class[]{UiState.class, kotlin.coroutines.c.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        g.f74531b.q("GameMaterialListFragment, uiState = " + uiState);
                        if (uiState instanceof UiState.Error) {
                            GameMaterialListFragment.S3(this.f87546b);
                        } else if (uiState instanceof UiState.Loading) {
                            GameMaterialListFragment.T3(this.f87546b);
                        } else if (uiState instanceof UiState.Success) {
                            GameMaterialListFragment.Q3(this.f87546b);
                            UiState.Success success = (UiState.Success) uiState;
                            List<GameMaterialItem> listH = ((com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.c) success.d()).h();
                            if (listH != null && (dVar = this.f87546b.f87516g) != null) {
                                dVar.r(listH, ((com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.c) success.d()).l());
                            }
                            if (!((com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.c) success.d()).i()) {
                                aa aaVar = this.f87546b.f87515f;
                                if (aaVar == null) {
                                    f0.S("binding");
                                    aaVar = null;
                                }
                                aaVar.f108441c.setNoMoreData(true);
                            }
                            if (com.max.hbcommon.utils.c.w(((com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.c) success.d()).h())) {
                                GameMaterialListFragment.R3(this.f87546b);
                            }
                        }
                        return b2.f124493a;
                    }

                    @Override // kotlinx.coroutines.flow.f
                    public /* bridge */ /* synthetic */ Object emit(UiState<? extends com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.c> uiState, kotlin.coroutines.c cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiState, cVar}, this, changeQuickRedirect, false, 37690, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(uiState, cVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C07971(GameMaterialListFragment gameMaterialListFragment, kotlin.coroutines.c<? super C07971> cVar) {
                    super(2, cVar);
                    this.f87545c = gameMaterialListFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37686, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C07971(this.f87545c, cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37688, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37687, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C07971) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37685, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f87544b;
                    if (i10 == 0) {
                        kotlin.t0.n(obj);
                        kotlinx.coroutines.flow.u<UiState<com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.c>> uVarV = GameMaterialListFragment.N3(this.f87545c).v();
                        a aVar = new a(this.f87545c);
                        this.f87544b = 1;
                        if (uVarV.a(aVar, this) == objH) {
                            return objH;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GameMaterialListFragment gameMaterialListFragment, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.f87543d = gameMaterialListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37682, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                if (patchProxyResultProxy.isSupported) {
                    return (kotlin.coroutines.c) patchProxyResultProxy.result;
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f87543d, cVar);
                anonymousClass1.f87542c = obj;
                return anonymousClass1;
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37684, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37683, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37681, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                kotlin.coroutines.intrinsics.b.h();
                if (this.f87541b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
                k.f((q0) this.f87542c, null, null, new C07971(this.f87543d, null), 3, null);
                return b2.f124493a;
            }
        }

        AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37678, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : GameMaterialListFragment.this.new AnonymousClass2(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37680, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37679, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37677, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f87539b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                GameMaterialListFragment gameMaterialListFragment = GameMaterialListFragment.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(gameMaterialListFragment, null);
                this.f87539b = 1;
                if (RepeatOnLifecycleKt.b(gameMaterialListFragment, state, anonymousClass1, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$3, reason: invalid class name */
    /* JADX INFO: compiled from: GameMaterialListFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$3", f = "GameMaterialListFragment.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f87547b;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$3$a */
        /* JADX INFO: compiled from: GameMaterialListFragment.kt */
        public static final class a implements f<Boolean> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameMaterialListFragment f87549b;

            a(GameMaterialListFragment gameMaterialListFragment) {
                this.f87549b = gameMaterialListFragment;
            }

            @dl.e
            public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, 37695, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                aa aaVar = this.f87549b.f87515f;
                aa aaVar2 = null;
                if (aaVar == null) {
                    f0.S("binding");
                    aaVar = null;
                }
                aaVar.f108441c.p(0);
                aa aaVar3 = this.f87549b.f87515f;
                if (aaVar3 == null) {
                    f0.S("binding");
                } else {
                    aaVar2 = aaVar3;
                }
                aaVar2.f108441c.A(0);
                return b2.f124493a;
            }

            @Override // kotlinx.coroutines.flow.f
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, kotlin.coroutines.c cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, cVar}, this, changeQuickRedirect, false, 37696, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bool.booleanValue(), cVar);
            }
        }

        AnonymousClass3(kotlin.coroutines.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37692, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : GameMaterialListFragment.this.new AnonymousClass3(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37694, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37693, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37691, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f87547b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                n<Boolean> nVarP = GameMaterialListFragment.N3(GameMaterialListFragment.this).p();
                a aVar = new a(GameMaterialListFragment.this);
                this.f87547b = 1;
                if (nVarP.a(aVar, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$4, reason: invalid class name */
    /* JADX INFO: compiled from: GameMaterialListFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$4", f = "GameMaterialListFragment.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f87550b;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$4$a */
        /* JADX INFO: compiled from: GameMaterialListFragment.kt */
        public static final class a implements f<Boolean> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameMaterialListFragment f87552b;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$registerEvents$4$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: GameMaterialListFragment.kt */
            public static final class RunnableC0798a implements Runnable {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ GameMaterialListFragment f87553b;

                RunnableC0798a(GameMaterialListFragment gameMaterialListFragment) {
                    this.f87553b = gameMaterialListFragment;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37703, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    aa aaVar = this.f87553b.f87515f;
                    if (aaVar == null) {
                        f0.S("binding");
                        aaVar = null;
                    }
                    aaVar.f108440b.smoothScrollToPosition(0);
                }
            }

            a(GameMaterialListFragment gameMaterialListFragment) {
                this.f87552b = gameMaterialListFragment;
            }

            @dl.e
            public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, 37701, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                aa aaVar = this.f87552b.f87515f;
                aa aaVar2 = null;
                if (aaVar == null) {
                    f0.S("binding");
                    aaVar = null;
                }
                aaVar.f108440b.post(new RunnableC0798a(this.f87552b));
                aa aaVar3 = this.f87552b.f87515f;
                if (aaVar3 == null) {
                    f0.S("binding");
                } else {
                    aaVar2 = aaVar3;
                }
                aaVar2.f108441c.T();
                return b2.f124493a;
            }

            @Override // kotlinx.coroutines.flow.f
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, kotlin.coroutines.c cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, cVar}, this, changeQuickRedirect, false, 37702, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bool.booleanValue(), cVar);
            }
        }

        AnonymousClass4(kotlin.coroutines.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37698, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : GameMaterialListFragment.this.new AnonymousClass4(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37700, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37699, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass4) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37697, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f87550b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                n<Boolean> nVarT = GameMaterialListFragment.N3(GameMaterialListFragment.this).t();
                a aVar = new a(GameMaterialListFragment.this);
                this.f87550b = 1;
                if (nVarT.a(aVar, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public GameMaterialListFragment() {
        final yh.a<c1> aVar = new yh.a<c1>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$gameMaterialLibraryViewModel$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final c1 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37641, new Class[0], c1.class);
                if (patchProxyResultProxy.isSupported) {
                    return (c1) patchProxyResultProxy.result;
                }
                Fragment fragmentRequireParentFragment = this.f87519b.requireParentFragment();
                f0.o(fragmentRequireParentFragment, "requireParentFragment()");
                return fragmentRequireParentFragment;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.c1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ c1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37642, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final z zVarB = b0.b(lazyThreadSafetyMode, new yh.a<c1>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$special$$inlined$viewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final c1 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37704, new Class[0], c1.class);
                return patchProxyResultProxy.isSupported ? (c1) patchProxyResultProxy.result : (c1) aVar.invoke();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.c1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ c1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37705, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        final yh.a aVar2 = null;
        this.f87511b = FragmentViewModelLazyKt.h(this, n0.d(GameMaterialLibraryViewModel.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$special$$inlined$viewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37706, new Class[0], b1.class);
                return patchProxyResultProxy.isSupported ? (b1) patchProxyResultProxy.result : FragmentViewModelLazyKt.p(zVarB).getViewModelStore();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37707, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$special$$inlined$viewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37709, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar3;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37708, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar4 = aVar2;
                if (aVar4 != null && (aVar3 = (u2.a) aVar4.invoke()) != null) {
                    return aVar3;
                }
                c1 c1VarP = FragmentViewModelLazyKt.p(zVarB);
                r rVar = c1VarP instanceof r ? (r) c1VarP : null;
                return rVar != null ? rVar.getDefaultViewModelCreationExtras() : u2.a.C1270a.f140743b;
            }
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$special$$inlined$viewModels$default$4
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                y0.b defaultViewModelProviderFactory;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37710, new Class[0], y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0.b) patchProxyResultProxy.result;
                }
                c1 c1VarP = FragmentViewModelLazyKt.p(zVarB);
                r rVar = c1VarP instanceof r ? (r) c1VarP : null;
                if (rVar != null && (defaultViewModelProviderFactory = rVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                y0.b defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                f0.o(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37711, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
        final yh.a<Fragment> aVar3 = new yh.a<Fragment>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$special$$inlined$viewModels$default$5
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Fragment a() {
                return this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Fragment invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37712, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        };
        final z zVarB2 = b0.b(lazyThreadSafetyMode, new yh.a<c1>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$special$$inlined$viewModels$default$6
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final c1 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37713, new Class[0], c1.class);
                return patchProxyResultProxy.isSupported ? (c1) patchProxyResultProxy.result : (c1) aVar3.invoke();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.c1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ c1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37714, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f87512c = FragmentViewModelLazyKt.h(this, n0.d(GameMaterialListViewModel.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$special$$inlined$viewModels$default$7
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37715, new Class[0], b1.class);
                return patchProxyResultProxy.isSupported ? (b1) patchProxyResultProxy.result : FragmentViewModelLazyKt.p(zVarB2).getViewModelStore();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37716, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$special$$inlined$viewModels$default$8
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37718, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar4;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37717, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar5 = aVar2;
                if (aVar5 != null && (aVar4 = (u2.a) aVar5.invoke()) != null) {
                    return aVar4;
                }
                c1 c1VarP = FragmentViewModelLazyKt.p(zVarB2);
                r rVar = c1VarP instanceof r ? (r) c1VarP : null;
                return rVar != null ? rVar.getDefaultViewModelCreationExtras() : u2.a.C1270a.f140743b;
            }
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialListFragment$special$$inlined$viewModels$default$9
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                y0.b defaultViewModelProviderFactory;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37719, new Class[0], y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0.b) patchProxyResultProxy.result;
                }
                c1 c1VarP = FragmentViewModelLazyKt.p(zVarB2);
                r rVar = c1VarP instanceof r ? (r) c1VarP : null;
                if (rVar != null && (defaultViewModelProviderFactory = rVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                y0.b defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                f0.o(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37720, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
    }

    public static final /* synthetic */ GameMaterialLibraryViewModel M3(GameMaterialListFragment gameMaterialListFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMaterialListFragment}, null, changeQuickRedirect, true, 37634, new Class[]{GameMaterialListFragment.class}, GameMaterialLibraryViewModel.class);
        return patchProxyResultProxy.isSupported ? (GameMaterialLibraryViewModel) patchProxyResultProxy.result : gameMaterialListFragment.U3();
    }

    public static final /* synthetic */ GameMaterialListViewModel N3(GameMaterialListFragment gameMaterialListFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMaterialListFragment}, null, changeQuickRedirect, true, 37635, new Class[]{GameMaterialListFragment.class}, GameMaterialListViewModel.class);
        return patchProxyResultProxy.isSupported ? (GameMaterialListViewModel) patchProxyResultProxy.result : gameMaterialListFragment.V3();
    }

    public static final /* synthetic */ void Q3(GameMaterialListFragment gameMaterialListFragment) {
        if (PatchProxy.proxy(new Object[]{gameMaterialListFragment}, null, changeQuickRedirect, true, 37638, new Class[]{GameMaterialListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMaterialListFragment.showContentView();
    }

    public static final /* synthetic */ void R3(GameMaterialListFragment gameMaterialListFragment) {
        if (PatchProxy.proxy(new Object[]{gameMaterialListFragment}, null, changeQuickRedirect, true, 37639, new Class[]{GameMaterialListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMaterialListFragment.showEmpty();
    }

    public static final /* synthetic */ void S3(GameMaterialListFragment gameMaterialListFragment) {
        if (PatchProxy.proxy(new Object[]{gameMaterialListFragment}, null, changeQuickRedirect, true, 37636, new Class[]{GameMaterialListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMaterialListFragment.showError();
    }

    public static final /* synthetic */ void T3(GameMaterialListFragment gameMaterialListFragment) {
        if (PatchProxy.proxy(new Object[]{gameMaterialListFragment}, null, changeQuickRedirect, true, 37637, new Class[]{GameMaterialListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMaterialListFragment.showLoading();
    }

    private final GameMaterialLibraryViewModel U3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37625, new Class[0], GameMaterialLibraryViewModel.class);
        return patchProxyResultProxy.isSupported ? (GameMaterialLibraryViewModel) patchProxyResultProxy.result : (GameMaterialLibraryViewModel) this.f87511b.getValue();
    }

    private final GameMaterialListViewModel V3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37626, new Class[0], GameMaterialListViewModel.class);
        return patchProxyResultProxy.isSupported ? (GameMaterialListViewModel) patchProxyResultProxy.result : (GameMaterialListViewModel) this.f87512c.getValue();
    }

    private final void X3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37631, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.mContext;
        aa aaVar = this.f87515f;
        aa aaVar2 = null;
        if (aaVar == null) {
            f0.S("binding");
            aaVar = null;
        }
        RecyclerView recyclerView = aaVar.f108440b;
        f0.o(recyclerView, "binding.rv");
        e.a(activity, recyclerView);
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        aa aaVar3 = this.f87515f;
        if (aaVar3 == null) {
            f0.S("binding");
            aaVar3 = null;
        }
        RecyclerView recyclerView2 = aaVar3.f108440b;
        f0.o(recyclerView2, "binding.rv");
        this.f87516g = new d(mContext, recyclerView2);
        aa aaVar4 = this.f87515f;
        if (aaVar4 == null) {
            f0.S("binding");
            aaVar4 = null;
        }
        aaVar4.f108440b.setAdapter(this.f87516g);
        aa aaVar5 = this.f87515f;
        if (aaVar5 == null) {
            f0.S("binding");
        } else {
            aaVar2 = aaVar5;
        }
        RecyclerView recyclerView3 = aaVar2.f108440b;
        f0.o(recyclerView3, "binding.rv");
        SystemWindowInsetExtensionsKt.c(recyclerView3, n3.m.i(), false, false, false, false, false, false, false, true, 254, null);
    }

    private final void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37630, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        aa aaVar = this.f87515f;
        aa aaVar2 = null;
        if (aaVar == null) {
            f0.S("binding");
            aaVar = null;
        }
        aaVar.f108441c.S(new b());
        aa aaVar3 = this.f87515f;
        if (aaVar3 == null) {
            f0.S("binding");
        } else {
            aaVar2 = aaVar3;
        }
        aaVar2.f108441c.f0(new c());
    }

    @dl.d
    @m
    public static final GameMaterialListFragment Z3(int i10, @dl.d KeyDescObj keyDescObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), keyDescObj}, null, changeQuickRedirect, true, 37633, new Class[]{Integer.TYPE, KeyDescObj.class}, GameMaterialListFragment.class);
        return patchProxyResultProxy.isSupported ? (GameMaterialListFragment) patchProxyResultProxy.result : f87507h.a(i10, keyDescObj);
    }

    @dl.e
    public final String W3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37632, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : V3().r();
    }

    @Override // com.max.hbcommon.base.d
    public void initBaseData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37627, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.initBaseData();
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("list_type") : null;
        if (serializable instanceof KeyDescObj) {
            KeyDescObj keyDescObj = (KeyDescObj) serializable;
            this.f87514e = keyDescObj;
            V3().A(keyDescObj);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            this.f87513d = Integer.valueOf(arguments2.getInt(f87510k));
        }
    }

    @Override // com.max.hbcommon.base.d
    @SuppressLint({"NotifyDataSetChanged"})
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37628, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        aa aaVarC = aa.c(this.mInflater);
        f0.o(aaVarC, "inflate(mInflater)");
        this.f87515f = aaVarC;
        if (aaVarC == null) {
            f0.S("binding");
            aaVarC = null;
        }
        setContentView(aaVarC);
        Y3();
        X3();
    }

    @Override // com.max.hbcommon.base.d
    public void registerEvents() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37629, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.registerEvents();
        k.f(androidx.lifecycle.z.a(this), null, null, new AnonymousClass1(null), 3, null);
        k.f(androidx.lifecycle.z.a(this), null, null, new AnonymousClass2(null), 3, null);
        k.f(androidx.lifecycle.z.a(this), null, null, new AnonymousClass3(null), 3, null);
        k.f(androidx.lifecycle.z.a(this), null, null, new AnonymousClass4(null), 3, null);
    }

    @Override // com.max.hbcommon.base.d
    public boolean shouldKeepViewOnDestroyView() {
        return true;
    }
}
