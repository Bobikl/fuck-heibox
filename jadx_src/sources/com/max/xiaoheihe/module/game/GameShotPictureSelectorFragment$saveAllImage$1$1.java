package com.max.xiaoheihe.module.game;

import android.net.Uri;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.xiaoheihe.bean.game.CacheGameShotObj;
import com.max.xiaoheihe.bean.game.GameScreenPicShotObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment$saveAllImage$1$1", f = "GameShotPictureSelectorFragment.kt", i = {}, l = {bb.c.b.f30717j4}, m = "invokeSuspend", n = {}, s = {})
public final class GameShotPictureSelectorFragment$saveAllImage$1$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f84805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GameShotPictureSelectorFragment f84806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ List<GameScreenPicShotObj> f84807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ GameShotPictureSelectorFragment.b f84808e;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment$saveAllImage$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment$saveAllImage$1$1$1", f = "GameShotPictureSelectorFragment.kt", i = {0, 0, 0, 1, 1, 1}, l = {bb.c.b.f30809n4, bb.c.b.f30832o4}, m = "invokeSuspend", n = {"successNumber", "uris", "cacheGameShotObj", "successNumber", "uris", "cacheGameShotObj"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f84809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f84810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f84811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f84812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f84813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ GameShotPictureSelectorFragment f84814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<GameScreenPicShotObj> f84815h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ GameShotPictureSelectorFragment.b f84816i;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment$saveAllImage$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment$saveAllImage$1$1$1$1", f = "GameShotPictureSelectorFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07531 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f84817b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f84818c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<GameScreenPicShotObj> f84819d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<CacheGameShotObj> f84820e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ ArrayList<Uri> f84821f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Ref.IntRef f84822g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ GameShotPictureSelectorFragment f84823h;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment$saveAllImage$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment$saveAllImage$1$1$1$1$1", f = "GameShotPictureSelectorFragment.kt", i = {}, l = {bb.c.b.C4}, m = "invokeSuspend", n = {}, s = {})
            public static final class C07541 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f84824b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ GameShotPictureSelectorFragment f84825c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f84826d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef<CacheGameShotObj> f84827e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ ArrayList<Uri> f84828f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ int f84829g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ Ref.IntRef f84830h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C07541(GameShotPictureSelectorFragment gameShotPictureSelectorFragment, String str, Ref.ObjectRef<CacheGameShotObj> objectRef, ArrayList<Uri> arrayList, int i10, Ref.IntRef intRef, kotlin.coroutines.c<? super C07541> cVar) {
                    super(2, cVar);
                    this.f84825c = gameShotPictureSelectorFragment;
                    this.f84826d = str;
                    this.f84827e = objectRef;
                    this.f84828f = arrayList;
                    this.f84829g = i10;
                    this.f84830h = intRef;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 33762, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C07541(this.f84825c, this.f84826d, this.f84827e, this.f84828f, this.f84829g, this.f84830h, cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33764, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33763, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C07541) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
                }

                /* JADX WARN: Type inference failed for: r2v9, types: [T, com.max.xiaoheihe.bean.game.CacheGameShotObj] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    CacheGameShotObj cacheGameShotObj;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33761, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f84824b;
                    if (i10 == 0) {
                        kotlin.t0.n(obj);
                        GameShotPictureSelectorFragment gameShotPictureSelectorFragment = this.f84825c;
                        String str = this.f84826d;
                        this.f84824b = 1;
                        obj = GameShotPictureSelectorFragment.a4(gameShotPictureSelectorFragment, str, this);
                        if (obj == objH) {
                            return objH;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                    }
                    String str2 = (String) obj;
                    if (!com.max.hbcommon.utils.c.u(str2)) {
                        Ref.ObjectRef<CacheGameShotObj> objectRef = this.f84827e;
                        if (objectRef.f124891b == null) {
                            objectRef.f124891b = new CacheGameShotObj(null, 1, null);
                        }
                        CacheGameShotObj cacheGameShotObj2 = this.f84827e.f124891b;
                        if ((cacheGameShotObj2 != null ? cacheGameShotObj2.getMap() : null) == null && (cacheGameShotObj = this.f84827e.f124891b) != null) {
                            cacheGameShotObj.setMap(new HashMap<>());
                        }
                        CacheGameShotObj cacheGameShotObj3 = this.f84827e.f124891b;
                        kotlin.jvm.internal.f0.m(cacheGameShotObj3);
                        HashMap<String, String> map = cacheGameShotObj3.getMap();
                        kotlin.jvm.internal.f0.m(map);
                        map.put(this.f84826d, str2);
                        this.f84828f.set(this.f84829g, Uri.fromFile(new File(str2)));
                        this.f84830h.f124889b++;
                    }
                    return kotlin.b2.f124493a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07531(List<GameScreenPicShotObj> list, Ref.ObjectRef<CacheGameShotObj> objectRef, ArrayList<Uri> arrayList, Ref.IntRef intRef, GameShotPictureSelectorFragment gameShotPictureSelectorFragment, kotlin.coroutines.c<? super C07531> cVar) {
                super(2, cVar);
                this.f84819d = list;
                this.f84820e = objectRef;
                this.f84821f = arrayList;
                this.f84822g = intRef;
                this.f84823h = gameShotPictureSelectorFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 33758, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                if (patchProxyResultProxy.isSupported) {
                    return (kotlin.coroutines.c) patchProxyResultProxy.result;
                }
                C07531 c07531 = new C07531(this.f84819d, this.f84820e, this.f84821f, this.f84822g, this.f84823h, cVar);
                c07531.f84818c = obj;
                return c07531;
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33760, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33759, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C07531) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                HashMap<String, String> map;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33757, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                kotlin.coroutines.intrinsics.b.h();
                if (this.f84817b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
                kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f84818c;
                int size = this.f84819d.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String img_url = this.f84819d.get(i10).getImg_url();
                    CacheGameShotObj cacheGameShotObj = this.f84820e.f124891b;
                    String str = (cacheGameShotObj == null || (map = cacheGameShotObj.getMap()) == null) ? null : map.get(img_url);
                    if (!com.max.hbcommon.utils.c.u(str) && new File(str).exists() && new File(str).isFile()) {
                        this.f84821f.add(Uri.fromFile(new File(str)));
                        this.f84822g.f124889b++;
                    } else {
                        this.f84821f.add(Uri.parse(img_url));
                        kotlinx.coroutines.k.b(q0Var, null, null, new C07541(this.f84823h, img_url, this.f84820e, this.f84821f, i10, this.f84822g, null), 3, null);
                    }
                }
                return kotlin.b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GameShotPictureSelectorFragment gameShotPictureSelectorFragment, List<GameScreenPicShotObj> list, GameShotPictureSelectorFragment.b bVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f84814g = gameShotPictureSelectorFragment;
            this.f84815h = list;
            this.f84816i = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 33754, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f84814g, this.f84815h, this.f84816i, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33756, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33755, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:27:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Ref.IntRef intRef;
            T t10;
            ArrayList<Uri> arrayList;
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            Ref.ObjectRef objectRef3;
            ArrayList<Uri> arrayList2;
            Ref.IntRef intRef2;
            T t11;
            LoadingDialog loadingDialog;
            GameShotPictureSelectorFragment.b bVar;
            GameShotPictureSelectorFragment.b bVar2;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33753, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f84813f;
            if (i10 != 0) {
                if (i10 == 1) {
                    objectRef = (Ref.ObjectRef) this.f84812e;
                    objectRef2 = (Ref.ObjectRef) this.f84811d;
                    ArrayList<Uri> arrayList3 = (ArrayList) this.f84810c;
                    Ref.IntRef intRef3 = (Ref.IntRef) this.f84809b;
                    kotlin.t0.n(obj);
                    arrayList = arrayList3;
                    intRef = intRef3;
                    t10 = obj;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef3 = (Ref.ObjectRef) this.f84811d;
                    arrayList2 = (ArrayList) this.f84810c;
                    intRef2 = (Ref.IntRef) this.f84809b;
                    kotlin.t0.n(obj);
                }
                t11 = objectRef3.f124891b;
                if (((CacheGameShotObj) t11) != null) {
                    com.max.hbcache.b.h(GameShotPictureSelectorFragment.f84763r, t11);
                }
                loadingDialog = this.f84814g.f84776m;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
                if (intRef2.f124889b == this.f84815h.size()) {
                    bVar2 = this.f84816i;
                    if (bVar2 != null) {
                        bVar2.b(arrayList2);
                    }
                } else {
                    bVar = this.f84816i;
                    if (bVar != null) {
                        bVar.a();
                    }
                }
                return kotlin.b2.f124493a;
            }
            kotlin.t0.n(obj);
            GameShotPictureSelectorFragment.k4(this.f84814g);
            Ref.IntRef intRef4 = new Ref.IntRef();
            ArrayList<Uri> arrayList4 = new ArrayList<>();
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            GameShotPictureSelectorFragment gameShotPictureSelectorFragment = this.f84814g;
            this.f84809b = intRef4;
            this.f84810c = arrayList4;
            this.f84811d = objectRef4;
            this.f84812e = objectRef4;
            this.f84813f = 1;
            Object objO3 = GameShotPictureSelectorFragment.O3(gameShotPictureSelectorFragment, this);
            if (objO3 == objH) {
                return objH;
            }
            intRef = intRef4;
            t10 = objO3;
            arrayList = arrayList4;
            objectRef = objectRef4;
            objectRef2 = objectRef;
            objectRef.f124891b = t10;
            C07531 c07531 = new C07531(this.f84815h, objectRef2, arrayList, intRef, this.f84814g, null);
            this.f84809b = intRef;
            this.f84810c = arrayList;
            this.f84811d = objectRef2;
            this.f84812e = null;
            this.f84813f = 2;
            if (kotlinx.coroutines.r0.g(c07531, this) == objH) {
                return objH;
            }
            objectRef3 = objectRef2;
            arrayList2 = arrayList;
            intRef2 = intRef;
            t11 = objectRef3.f124891b;
            if (((CacheGameShotObj) t11) != null) {
                com.max.hbcache.b.h(GameShotPictureSelectorFragment.f84763r, t11);
            }
            loadingDialog = this.f84814g.f84776m;
            if (loadingDialog != null) {
                loadingDialog.c();
            }
            if (intRef2.f124889b == this.f84815h.size()) {
                bVar2 = this.f84816i;
                if (bVar2 != null) {
                    bVar2.b(arrayList2);
                }
            } else {
                bVar = this.f84816i;
                if (bVar != null) {
                    bVar.a();
                }
            }
            return kotlin.b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameShotPictureSelectorFragment$saveAllImage$1$1(GameShotPictureSelectorFragment gameShotPictureSelectorFragment, List<GameScreenPicShotObj> list, GameShotPictureSelectorFragment.b bVar, kotlin.coroutines.c<? super GameShotPictureSelectorFragment$saveAllImage$1$1> cVar) {
        super(2, cVar);
        this.f84806c = gameShotPictureSelectorFragment;
        this.f84807d = list;
        this.f84808e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 33750, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GameShotPictureSelectorFragment$saveAllImage$1$1(this.f84806c, this.f84807d, this.f84808e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33752, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33751, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GameShotPictureSelectorFragment$saveAllImage$1$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33749, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f84805b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f84806c, this.f84807d, this.f84808e, null);
            this.f84805b = 1;
            if (kotlinx.coroutines.r0.g(anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return kotlin.b2.f124493a;
    }
}
