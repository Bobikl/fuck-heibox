package com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.x0;
import com.max.hbcommon.base.BaseViewModel;
import com.max.hbcommon.base.UiState;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.module.game.heybox.gamematerial.data.GameMaterialRepository;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import yh.p;
import yh.s;

/* JADX INFO: compiled from: GameMaterialListViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameMaterialListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMaterialListViewModel.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/viewmodel/GameMaterialListViewModel\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,254:1\n29#2:255\n5#2,2:256\n22#2:258\n7#2:259\n29#2:260\n5#2,2:261\n22#2:263\n7#2:264\n29#2:265\n5#2,2:266\n22#2:268\n7#2:269\n29#2:270\n5#2,2:271\n22#2:273\n7#2:274\n29#2:275\n5#2,2:276\n22#2:278\n7#2:279\n*S KotlinDebug\n*F\n+ 1 GameMaterialListViewModel.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/viewmodel/GameMaterialListViewModel\n*L\n119#1:255\n119#1:256,2\n119#1:258\n119#1:259\n158#1:260\n158#1:261,2\n158#1:263\n158#1:264\n190#1:265\n190#1:266,2\n190#1:268\n190#1:269\n195#1:270\n195#1:271,2\n195#1:273\n195#1:274\n204#1:275\n204#1:276,2\n204#1:278\n204#1:279\n*E\n"})
@o(parameters = 0)
public final class GameMaterialListViewModel extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f87642q = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final GameMaterialRepository f87643d = new GameMaterialRepository();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private KeyDescObj f87644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final i<Boolean> f87645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final n<Boolean> f87646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final i<Boolean> f87647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final n<Boolean> f87648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final j<String> f87649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final j<b> f87650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final j<String> f87651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final j<String> f87652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final j<String> f87653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final j<UiState<c>> f87654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final u<UiState<c>> f87655p;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: GameMaterialListViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel$1", f = "GameMaterialListViewModel.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f87656b;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: GameMaterialListViewModel.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel$1$1", f = "GameMaterialListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08011 extends SuspendLambda implements s<String, String, String, String, kotlin.coroutines.c<? super f>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f87658b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f87659c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f87660d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f87661e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f87662f;

            C08011(kotlin.coroutines.c<? super C08011> cVar) {
                super(5, cVar);
            }

            @Override // yh.s
            public /* bridge */ /* synthetic */ Object N0(String str, String str2, String str3, String str4, kotlin.coroutines.c<? super f> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, cVar}, this, changeQuickRedirect, false, 37837, new Class[]{Object.class, Object.class, Object.class, Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str, str2, str3, str4, cVar);
            }

            @dl.e
            public final Object a(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e kotlin.coroutines.c<? super f> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, cVar}, this, changeQuickRedirect, false, 37836, new Class[]{String.class, String.class, String.class, String.class, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                C08011 c08011 = new C08011(cVar);
                c08011.f87659c = str;
                c08011.f87660d = str2;
                c08011.f87661e = str3;
                c08011.f87662f = str4;
                return c08011.invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                boolean z10 = true;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37835, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                kotlin.coroutines.intrinsics.b.h();
                if (this.f87658b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
                String str = (String) this.f87659c;
                String str2 = (String) this.f87660d;
                String str3 = (String) this.f87661e;
                String str4 = (String) this.f87662f;
                g.f74531b.q("GameMaterialListViewModel, topicId = " + str + ", sortKey = " + str2 + ", sizeKey = " + str3 + ", filterKey = " + str4);
                if (str == null || str.length() == 0) {
                    return null;
                }
                if (str2 == null || str2.length() == 0) {
                    return null;
                }
                if (str3 == null || str3.length() == 0) {
                    return null;
                }
                if (str4 != null && str4.length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    return null;
                }
                return new f(str, str2, str3, str4);
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: GameMaterialListViewModel.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel$1$2", f = "GameMaterialListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements p<f, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f87663b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f87664c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ GameMaterialListViewModel f87665d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(GameMaterialListViewModel gameMaterialListViewModel, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.f87665d = gameMaterialListViewModel;
            }

            @dl.e
            public final Object a(@dl.d f fVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 37840, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(fVar, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37839, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                if (patchProxyResultProxy.isSupported) {
                    return (kotlin.coroutines.c) patchProxyResultProxy.result;
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f87665d, cVar);
                anonymousClass2.f87664c = obj;
                return anonymousClass2;
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(f fVar, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 37841, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(fVar, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37838, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                kotlin.coroutines.intrinsics.b.h();
                if (this.f87663b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
                f fVar = (f) this.f87664c;
                g.f74531b.q("GameMaterialListViewModel, keyDescObj = " + this.f87665d.s() + ", it = " + fVar);
                this.f87665d.y(fVar.j(), fVar.g(), fVar.i(), fVar.h(), 0, 30);
                return b2.f124493a;
            }
        }

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37832, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : GameMaterialListViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37834, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37833, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37831, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f87656b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                kotlinx.coroutines.flow.e eVarS0 = kotlinx.coroutines.flow.g.s0(kotlinx.coroutines.flow.g.E(GameMaterialListViewModel.this.f87649j, GameMaterialListViewModel.this.f87651l, GameMaterialListViewModel.this.f87652m, GameMaterialListViewModel.this.f87653n, new C08011(null)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(GameMaterialListViewModel.this, null);
                this.f87656b = 1;
                if (kotlinx.coroutines.flow.g.A(eVarS0, anonymousClass2, this) == objH) {
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

    public GameMaterialListViewModel() {
        i<Boolean> iVarB = kotlinx.coroutines.flow.o.b(0, 0, null, 7, null);
        this.f87645f = iVarB;
        this.f87646g = iVarB;
        i<Boolean> iVarB2 = kotlinx.coroutines.flow.o.b(0, 0, null, 7, null);
        this.f87647h = iVarB2;
        this.f87648i = iVarB2;
        this.f87649j = v.a(null);
        this.f87650k = v.a(null);
        this.f87651l = v.a(null);
        this.f87652m = v.a(null);
        this.f87653n = v.a(null);
        j<UiState<c>> jVarA = v.a(UiState.Loading.f66632b);
        this.f87654o = jVarA;
        this.f87655p = jVarA;
        k.f(x0.a(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void A(@dl.e KeyDescObj keyDescObj) {
        this.f87644e = keyDescObj;
    }

    public final void B(@dl.e KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 37828, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f87652m.setValue(keyDescObj != null ? keyDescObj.getKey() : null);
    }

    public final void C(@dl.e KeyDescObj keyDescObj) {
        String name;
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 37827, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        String str = "setTopicId, sortKey = " + keyDescObj;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (GameMaterialListViewModel.class.isAnonymousClass()) {
            name = GameMaterialListViewModel.class.getName();
            f0.m(name);
        } else {
            name = GameMaterialListViewModel.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        this.f87651l.setValue(keyDescObj != null ? keyDescObj.getKey() : null);
    }

    public final void D(@dl.d String topicId) {
        String name;
        if (PatchProxy.proxy(new Object[]{topicId}, this, changeQuickRedirect, false, 37826, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(topicId, "topicId");
        String str = "setTopicId, topicId = " + topicId;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (GameMaterialListViewModel.class.isAnonymousClass()) {
            name = GameMaterialListViewModel.class.getName();
            f0.m(name);
        } else {
            name = GameMaterialListViewModel.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        this.f87649j.setValue(topicId);
    }

    @dl.d
    public final n<Boolean> p() {
        return this.f87646g;
    }

    @dl.e
    public final String r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37830, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        UiState<c> value = this.f87655p.getValue();
        if (value instanceof UiState.Success) {
            return ((c) ((UiState.Success) value).d()).j();
        }
        return null;
    }

    @dl.e
    public final KeyDescObj s() {
        return this.f87644e;
    }

    @dl.d
    public final n<Boolean> t() {
        return this.f87648i;
    }

    @dl.d
    public final GameMaterialRepository u() {
        return this.f87643d;
    }

    @dl.d
    public final u<UiState<c>> v() {
        return this.f87655p;
    }

    public final void w() {
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37824, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String value = this.f87649j.getValue();
        String value2 = this.f87653n.getValue();
        String value3 = this.f87651l.getValue();
        String value4 = this.f87652m.getValue();
        String str = "loadMore, topicId = " + value + ", filterKey = " + value2 + ", sortKey = " + value3 + ", sizeKey = " + value4;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (GameMaterialListViewModel.class.isAnonymousClass()) {
            name = GameMaterialListViewModel.class.getName();
            f0.m(name);
        } else {
            name = GameMaterialListViewModel.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        if (value == null || value.length() == 0) {
            return;
        }
        if (value3 == null || value3.length() == 0) {
            return;
        }
        if (value4 == null || value4.length() == 0) {
            return;
        }
        if (value2 == null || value2.length() == 0) {
            return;
        }
        k.f(x0.a(this), null, null, new GameMaterialListViewModel$loadMore$1(this, value, value2, value3, value4, null), 3, null);
    }

    public final void x() {
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37825, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (GameMaterialListViewModel.class.isAnonymousClass()) {
            name = GameMaterialListViewModel.class.getName();
            f0.m(name);
        } else {
            name = GameMaterialListViewModel.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("refresh");
        aVar.q(sb2.toString());
        k.f(x0.a(this), null, null, new GameMaterialListViewModel$refresh$1(this, null), 3, null);
    }

    public final void y(@dl.d String topicId, @dl.d String filterKey, @dl.d String sortKey, @dl.d String sizeKey, int i10, int i11) {
        Object[] objArr = {topicId, filterKey, sortKey, sizeKey, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37823, new Class[]{String.class, String.class, String.class, String.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(topicId, "topicId");
        f0.p(filterKey, "filterKey");
        f0.p(sortKey, "sortKey");
        f0.p(sizeKey, "sizeKey");
        g.f74531b.q("GameMaterialListViewModel, topicId = " + topicId + ", filterKey = " + filterKey + ", sortKey = " + sortKey + ", sizeKey = " + sizeKey + ", requestData = " + this.f87644e);
        k.f(x0.a(this), null, null, new GameMaterialListViewModel$requestData$1(this, topicId, filterKey, sortKey, sizeKey, i10, i11, null), 3, null);
    }

    public final void z(int i10) {
        String name;
        KeyDescObj keyDescObj;
        List<KeyDescObj> data;
        String key;
        List<KeyDescObj> data2;
        String key2;
        List<KeyDescObj> data3;
        int size = 0;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 37829, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str = "setFilterKey, secondIndex = " + i10 + ", keyDescObj = " + this.f87644e;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (GameMaterialListViewModel.class.isAnonymousClass()) {
            name = GameMaterialListViewModel.class.getName();
            f0.m(name);
        } else {
            name = GameMaterialListViewModel.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        KeyDescObj keyDescObj2 = this.f87644e;
        if (keyDescObj2 == null) {
            return;
        }
        if (!f0.g(keyDescObj2 != null ? keyDescObj2.getMulti() : null, "1")) {
            KeyDescObj keyDescObj3 = this.f87644e;
            if (!((keyDescObj3 == null || (data3 = keyDescObj3.getData()) == null || data3.isEmpty()) ? false : true)) {
                KeyDescObj keyDescObj4 = this.f87644e;
                if (keyDescObj4 == null || (key2 = keyDescObj4.getKey()) == null) {
                    return;
                }
                this.f87653n.setValue(key2);
                return;
            }
        }
        KeyDescObj keyDescObj5 = this.f87644e;
        if (keyDescObj5 != null && (data2 = keyDescObj5.getData()) != null) {
            size = data2.size();
        }
        if (i10 > size - 1 || (keyDescObj = this.f87644e) == null || (data = keyDescObj.getData()) == null || (key = data.get(i10).getKey()) == null) {
            return;
        }
        f0.o(key, "key");
        this.f87653n.setValue(key);
    }
}
