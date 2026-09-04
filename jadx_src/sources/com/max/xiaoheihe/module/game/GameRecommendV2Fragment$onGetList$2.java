package com.max.xiaoheihe.module.game;

import android.content.Context;
import androidx.recyclerview.widget.DiffUtil;
import com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendV2Result;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.b90;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: GameRecommendV2Fragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GameRecommendV2Fragment$onGetList$2", f = "GameRecommendV2Fragment.kt", i = {0, 2, 2, 2}, l = {bb.c.b.f31030x2, bb.c.b.A2, bb.c.b.I2}, m = "invokeSuspend", n = {"listTemp", "listTemp", "preList", "refresh"}, s = {"L$0", "L$0", "L$1", "I$0"})
public final class GameRecommendV2Fragment$onGetList$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f84659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f84660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f84661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f84662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Result<GameRecommendV2Result> f84663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ GameRecommendV2Fragment f84664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f84665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f84666i;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameRecommendV2Fragment$onGetList$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: GameRecommendV2Fragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GameRecommendV2Fragment$onGetList$2$1", f = "GameRecommendV2Fragment.kt", i = {}, l = {bb.c.b.L2, bb.c.b.N2}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f84667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f84668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameRecommendV2Fragment f84669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<GameRecommendBaseObj> f84670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f84671f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList<GameRecommendBaseObj> f84672g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z10, GameRecommendV2Fragment gameRecommendV2Fragment, List<GameRecommendBaseObj> list, boolean z11, ArrayList<GameRecommendBaseObj> arrayList, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f84668c = z10;
            this.f84669d = gameRecommendV2Fragment;
            this.f84670e = list;
            this.f84671f = z11;
            this.f84672g = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 33541, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f84668c, this.f84669d, this.f84670e, this.f84671f, this.f84672g, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33543, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33542, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33540, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f84667b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                BigBrotherAdapterWrapper bigBrotherAdapterWrapper = null;
                if (this.f84668c) {
                    BigBrotherAdapterWrapper bigBrotherAdapterWrapper2 = this.f84669d.f84634d;
                    if (bigBrotherAdapterWrapper2 == null) {
                        kotlin.jvm.internal.f0.S("mBBAdapter");
                    } else {
                        bigBrotherAdapterWrapper = bigBrotherAdapterWrapper2;
                    }
                    List<GameRecommendBaseObj> list = this.f84670e;
                    this.f84667b = 1;
                    if (bigBrotherAdapterWrapper.B(list, this) == objH) {
                        return objH;
                    }
                } else if (this.f84671f) {
                    BigBrotherAdapterWrapper bigBrotherAdapterWrapper3 = this.f84669d.f84634d;
                    if (bigBrotherAdapterWrapper3 == null) {
                        kotlin.jvm.internal.f0.S("mBBAdapter");
                    } else {
                        bigBrotherAdapterWrapper = bigBrotherAdapterWrapper3;
                    }
                    int size = this.f84672g.size();
                    List<GameRecommendBaseObj> list2 = this.f84670e;
                    this.f84667b = 2;
                    if (bigBrotherAdapterWrapper.D(size, list2, this) == objH) {
                        return objH;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return kotlin.b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameRecommendV2Fragment$onGetList$2(Result<GameRecommendV2Result> result, GameRecommendV2Fragment gameRecommendV2Fragment, boolean z10, boolean z11, kotlin.coroutines.c<? super GameRecommendV2Fragment$onGetList$2> cVar) {
        super(2, cVar);
        this.f84663f = result;
        this.f84664g = gameRecommendV2Fragment;
        this.f84665h = z10;
        this.f84666i = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 33537, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GameRecommendV2Fragment$onGetList$2(this.f84663f, this.f84664g, this.f84665h, this.f84666i, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33539, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33538, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GameRecommendV2Fragment$onGetList$2) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0106  */
    /* JADX WARN: Code duplicated, block: B:33:0x010e  */
    /* JADX WARN: Code duplicated, block: B:36:0x011e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x011f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0127  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
    /* JADX WARN: Code duplicated, block: B:43:0x0137  */
    /* JADX WARN: Code duplicated, block: B:45:0x013f  */
    /* JADX WARN: Code duplicated, block: B:49:0x016e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x016f  */
    /* JADX WARN: Code duplicated, block: B:53:0x017b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0191  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01de  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ea  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        List<GameRecommendBaseObj> arrayList;
        int i10;
        ArrayList arrayList2;
        CoroutineDispatcher coroutineDispatcherA;
        AnonymousClass1 anonymousClass1;
        List<GameRecommendBaseObj> list;
        int i11;
        ArrayList arrayList3;
        b90 b90Var;
        GameRecommendAdapter gameRecommendAdapter;
        BigBrotherAdapterWrapper bigBrotherAdapterWrapper;
        BigBrotherAdapterWrapper bigBrotherAdapterWrapper2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33536, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i12 = this.f84662e;
        b90 b90Var2 = null;
        BigBrotherAdapterWrapper bigBrotherAdapterWrapper3 = null;
        BigBrotherAdapterWrapper bigBrotherAdapterWrapper4 = null;
        BigBrotherAdapterWrapper bigBrotherAdapterWrapper5 = null;
        if (i12 == 0) {
            kotlin.t0.n(obj);
            if (this.f84663f.getResult() != null) {
                GameRecommendV2Result result = this.f84663f.getResult();
                kotlin.jvm.internal.f0.m(result);
                List<GameRecommendBaseObj> all_list = result.getAll_list();
                if ((all_list == null || all_list.isEmpty()) == false) {
                    arrayList = new ArrayList<>();
                    GameRecommendV2Result result2 = this.f84663f.getResult();
                    kotlin.jvm.internal.f0.m(result2);
                    List<GameRecommendBaseObj> all_list2 = result2.getAll_list();
                    kotlin.jvm.internal.f0.m(all_list2);
                    arrayList.addAll(all_list2);
                    GameRecommendAdapter.Companion companion = GameRecommendAdapter.f85954d;
                    Context viewContext = this.f84664g.getViewContext();
                    kotlin.jvm.internal.f0.o(viewContext, "viewContext");
                    this.f84659b = arrayList;
                    this.f84662e = 1;
                    if (companion.b(viewContext, arrayList, this) == objH) {
                        return objH;
                    }
                    com.max.heybox.hblog.g.f74531b.q("GameRecommendV2Fragment, onGetList, loadMore = " + this.f84665h + ", size = " + this.f84664g.f84635e.size() + ", listTemp.size = " + arrayList.size() + ' ' + this.f84664g.f84639i + " forMiniProgram = " + this.f84666i);
                    if (this.f84666i) {
                        gameRecommendAdapter = this.f84664g.f84633c;
                        if (gameRecommendAdapter == null) {
                            kotlin.jvm.internal.f0.S("mAdapter");
                            gameRecommendAdapter = null;
                        }
                        this.f84659b = null;
                        this.f84662e = 2;
                        if (gameRecommendAdapter.x(arrayList, this) == objH) {
                            return objH;
                        }
                    } else {
                        if (this.f84664g.f84637g == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        arrayList2 = new ArrayList(this.f84664g.f84635e);
                        if (i10 != 0) {
                            b90Var = this.f84664g.f84632b;
                            if (b90Var == null) {
                                kotlin.jvm.internal.f0.S("binding");
                                b90Var = null;
                            }
                            b90Var.f108880c.b0(false);
                            this.f84664g.f84640j = true;
                        }
                        coroutineDispatcherA = kotlinx.coroutines.e1.a();
                        anonymousClass1 = new AnonymousClass1(i10, this.f84664g, arrayList, this.f84665h, arrayList2, null);
                        this.f84659b = arrayList;
                        this.f84660c = arrayList2;
                        this.f84661d = i10;
                        this.f84662e = 3;
                        if (kotlinx.coroutines.i.h(coroutineDispatcherA, anonymousClass1, this) == objH) {
                            return objH;
                        }
                        list = arrayList;
                        i11 = i10;
                        arrayList3 = arrayList2;
                        com.max.heybox.hblog.g.f74531b.q("GameRecommendV2Fragment, onGetList2");
                        if (i11 != 0) {
                            this.f84664g.f84635e.clear();
                        }
                        this.f84664g.f84635e.addAll(list);
                        if (i11 == 0) {
                            if (this.f84665h) {
                                bigBrotherAdapterWrapper2 = this.f84664g.f84634d;
                                if (bigBrotherAdapterWrapper2 == null) {
                                    kotlin.jvm.internal.f0.S("mBBAdapter");
                                } else {
                                    bigBrotherAdapterWrapper4 = bigBrotherAdapterWrapper2;
                                }
                                bigBrotherAdapterWrapper4.notifyItemRangeInserted(arrayList3.size(), list.size());
                            } else {
                                bigBrotherAdapterWrapper = this.f84664g.f84634d;
                                if (bigBrotherAdapterWrapper == null) {
                                    kotlin.jvm.internal.f0.S("mBBAdapter");
                                } else {
                                    bigBrotherAdapterWrapper5 = bigBrotherAdapterWrapper;
                                }
                                bigBrotherAdapterWrapper5.notifyDataSetChanged();
                            }
                        } else if (this.f84665h) {
                            bigBrotherAdapterWrapper2 = this.f84664g.f84634d;
                            if (bigBrotherAdapterWrapper2 == null) {
                                kotlin.jvm.internal.f0.S("mBBAdapter");
                            } else {
                                bigBrotherAdapterWrapper4 = bigBrotherAdapterWrapper2;
                            }
                            bigBrotherAdapterWrapper4.notifyItemRangeInserted(arrayList3.size(), list.size());
                        } else {
                            bigBrotherAdapterWrapper = this.f84664g.f84634d;
                            if (bigBrotherAdapterWrapper == null) {
                                kotlin.jvm.internal.f0.S("mBBAdapter");
                            } else {
                                bigBrotherAdapterWrapper5 = bigBrotherAdapterWrapper;
                            }
                            bigBrotherAdapterWrapper5.notifyDataSetChanged();
                        }
                        GameRecommendV2Fragment.g4(this.f84664g);
                    }
                }
            }
            if (this.f84664g.f84637g == 0) {
                GameRecommendV2Fragment.h4(this.f84664g);
            } else {
                b90 b90Var3 = this.f84664g.f84632b;
                if (b90Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    b90Var2 = b90Var3;
                }
                b90Var2.f108880c.b0(false);
                this.f84664g.f84640j = false;
            }
        } else if (i12 == 1) {
            arrayList = (List) this.f84659b;
            kotlin.t0.n(obj);
            com.max.heybox.hblog.g.f74531b.q("GameRecommendV2Fragment, onGetList, loadMore = " + this.f84665h + ", size = " + this.f84664g.f84635e.size() + ", listTemp.size = " + arrayList.size() + ' ' + this.f84664g.f84639i + " forMiniProgram = " + this.f84666i);
            if (this.f84666i) {
                gameRecommendAdapter = this.f84664g.f84633c;
                if (gameRecommendAdapter == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                    gameRecommendAdapter = null;
                }
                this.f84659b = null;
                this.f84662e = 2;
                if (gameRecommendAdapter.x(arrayList, this) == objH) {
                    return objH;
                }
            } else {
                if (this.f84664g.f84637g == 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                arrayList2 = new ArrayList(this.f84664g.f84635e);
                if (i10 != 0) {
                    b90Var = this.f84664g.f84632b;
                    if (b90Var == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        b90Var = null;
                    }
                    b90Var.f108880c.b0(false);
                    this.f84664g.f84640j = true;
                }
                coroutineDispatcherA = kotlinx.coroutines.e1.a();
                anonymousClass1 = new AnonymousClass1(i10, this.f84664g, arrayList, this.f84665h, arrayList2, null);
                this.f84659b = arrayList;
                this.f84660c = arrayList2;
                this.f84661d = i10;
                this.f84662e = 3;
                if (kotlinx.coroutines.i.h(coroutineDispatcherA, anonymousClass1, this) == objH) {
                    return objH;
                }
                list = arrayList;
                i11 = i10;
                arrayList3 = arrayList2;
                com.max.heybox.hblog.g.f74531b.q("GameRecommendV2Fragment, onGetList2");
                if (i11 != 0) {
                    this.f84664g.f84635e.clear();
                }
                this.f84664g.f84635e.addAll(list);
                if (i11 == 0) {
                    if (this.f84665h) {
                        bigBrotherAdapterWrapper2 = this.f84664g.f84634d;
                        if (bigBrotherAdapterWrapper2 == null) {
                            kotlin.jvm.internal.f0.S("mBBAdapter");
                        } else {
                            bigBrotherAdapterWrapper4 = bigBrotherAdapterWrapper2;
                        }
                        bigBrotherAdapterWrapper4.notifyItemRangeInserted(arrayList3.size(), list.size());
                    } else {
                        bigBrotherAdapterWrapper = this.f84664g.f84634d;
                        if (bigBrotherAdapterWrapper == null) {
                            kotlin.jvm.internal.f0.S("mBBAdapter");
                        } else {
                            bigBrotherAdapterWrapper5 = bigBrotherAdapterWrapper;
                        }
                        bigBrotherAdapterWrapper5.notifyDataSetChanged();
                    }
                } else if (this.f84665h) {
                    bigBrotherAdapterWrapper2 = this.f84664g.f84634d;
                    if (bigBrotherAdapterWrapper2 == null) {
                        kotlin.jvm.internal.f0.S("mBBAdapter");
                    } else {
                        bigBrotherAdapterWrapper4 = bigBrotherAdapterWrapper2;
                    }
                    bigBrotherAdapterWrapper4.notifyItemRangeInserted(arrayList3.size(), list.size());
                } else {
                    bigBrotherAdapterWrapper = this.f84664g.f84634d;
                    if (bigBrotherAdapterWrapper == null) {
                        kotlin.jvm.internal.f0.S("mBBAdapter");
                    } else {
                        bigBrotherAdapterWrapper5 = bigBrotherAdapterWrapper;
                    }
                    bigBrotherAdapterWrapper5.notifyDataSetChanged();
                }
                GameRecommendV2Fragment.g4(this.f84664g);
            }
        } else if (i12 == 2) {
            kotlin.t0.n(obj);
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f84661d;
            arrayList3 = (ArrayList) this.f84660c;
            list = (List) this.f84659b;
            kotlin.t0.n(obj);
            com.max.heybox.hblog.g.f74531b.q("GameRecommendV2Fragment, onGetList2");
            if (i11 != 0) {
                this.f84664g.f84635e.clear();
            }
            this.f84664g.f84635e.addAll(list);
            if (i11 == 0 && !arrayList3.isEmpty()) {
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new com.max.xiaoheihe.module.game.adapter.recommend.d(arrayList3, this.f84664g.f84635e));
                kotlin.jvm.internal.f0.o(diffResultCalculateDiff, "calculateDiff(GameRecomm…Callback(preList, mList))");
                BigBrotherAdapterWrapper bigBrotherAdapterWrapper6 = this.f84664g.f84634d;
                if (bigBrotherAdapterWrapper6 == null) {
                    kotlin.jvm.internal.f0.S("mBBAdapter");
                } else {
                    bigBrotherAdapterWrapper3 = bigBrotherAdapterWrapper6;
                }
                diffResultCalculateDiff.dispatchUpdatesTo(new com.max.hbcommon.base.j(bigBrotherAdapterWrapper3));
            } else if (this.f84665h) {
                bigBrotherAdapterWrapper2 = this.f84664g.f84634d;
                if (bigBrotherAdapterWrapper2 == null) {
                    kotlin.jvm.internal.f0.S("mBBAdapter");
                } else {
                    bigBrotherAdapterWrapper4 = bigBrotherAdapterWrapper2;
                }
                bigBrotherAdapterWrapper4.notifyItemRangeInserted(arrayList3.size(), list.size());
            } else {
                bigBrotherAdapterWrapper = this.f84664g.f84634d;
                if (bigBrotherAdapterWrapper == null) {
                    kotlin.jvm.internal.f0.S("mBBAdapter");
                } else {
                    bigBrotherAdapterWrapper5 = bigBrotherAdapterWrapper;
                }
                bigBrotherAdapterWrapper5.notifyDataSetChanged();
            }
            GameRecommendV2Fragment.g4(this.f84664g);
        }
        return kotlin.b2.f124493a;
    }
}
