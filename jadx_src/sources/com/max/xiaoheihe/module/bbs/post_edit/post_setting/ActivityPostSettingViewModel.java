package com.max.xiaoheihe.module.bbs.post_edit.post_setting;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import com.max.hbcommon.base.BaseViewModel;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.post_edit.PostCompilationItemObj;
import com.max.xiaoheihe.bean.bbs.post_edit.PostCompilationsObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.b0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: ActivityPostSettingViewModel.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nActivityPostSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityPostSettingViewModel.kt\ncom/max/xiaoheihe/module/bbs/post_edit/post_setting/ActivityPostSettingViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
@o(parameters = 0)
public final class ActivityPostSettingViewModel extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @d
    public static final a f83027n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f83028o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f83029p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f83030q = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f83031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final i0<List<PostCompilationItemObj>> f83032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final LiveData<List<PostCompilationItemObj>> f83033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final i0<Integer> f83034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    private final LiveData<Integer> f83035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    private final i0<String> f83036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    private final LiveData<String> f83037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    private final z f83038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d
    private final i0<Integer> f83039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    private final LiveData<Integer> f83040m;

    /* JADX INFO: compiled from: ActivityPostSettingViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ActivityPostSettingViewModel.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<PostCompilationsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<Boolean> f83041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f83042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ActivityPostSettingViewModel f83043d;

        b(yh.a<Boolean> aVar, boolean z10, ActivityPostSettingViewModel activityPostSettingViewModel) {
            this.f83041b = aVar;
            this.f83042c = z10;
            this.f83043d = activityPostSettingViewModel;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 30946, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (this.f83041b.invoke().booleanValue()) {
                super.onError(e10);
            }
        }

        public void onNext(@d Result<PostCompilationsObj> postCompilationsObjResult) {
            List arrayList;
            if (PatchProxy.proxy(new Object[]{postCompilationsObjResult}, this, changeQuickRedirect, false, 30947, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(postCompilationsObjResult, "postCompilationsObjResult");
            PostCompilationsObj result = postCompilationsObjResult.getResult();
            if (!this.f83041b.invoke().booleanValue() || result == null) {
                return;
            }
            if (!this.f83042c) {
                this.f83043d.f83034g.r(Integer.valueOf(result.getCount()));
            }
            List<PostCompilationItemObj> collections = result.getCollections();
            if (collections == null) {
                collections = CollectionsKt__CollectionsKt.E();
            }
            if (this.f83043d.f83031d == 0) {
                this.f83043d.f83032e.r(collections);
                return;
            }
            List list = (List) this.f83043d.f83032e.f();
            if (list == null || (arrayList = CollectionsKt___CollectionsKt.T5(list)) == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(collections);
            this.f83043d.f83032e.r(arrayList);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30948, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PostCompilationsObj>) obj);
        }
    }

    public ActivityPostSettingViewModel() {
        i0<List<PostCompilationItemObj>> i0Var = new i0<>(CollectionsKt__CollectionsKt.E());
        this.f83032e = i0Var;
        this.f83033f = i0Var;
        i0<Integer> i0Var2 = new i0<>(0);
        this.f83034g = i0Var2;
        this.f83035h = i0Var2;
        i0<String> i0Var3 = new i0<>(null);
        this.f83036i = i0Var3;
        this.f83037j = i0Var3;
        this.f83038k = b0.c(new yh.a<g0<PostCompilationItemObj>>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.post_setting.ActivityPostSettingViewModel$selectedCompilationLiveData$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: ActivityPostSettingViewModel.kt */
            public static final class a implements j0<List<? extends PostCompilationItemObj>> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ ActivityPostSettingViewModel f83045a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ g0<PostCompilationItemObj> f83046b;

                a(ActivityPostSettingViewModel activityPostSettingViewModel, g0<PostCompilationItemObj> g0Var) {
                    this.f83045a = activityPostSettingViewModel;
                    this.f83046b = g0Var;
                }

                @Override // androidx.lifecycle.j0
                public /* bridge */ /* synthetic */ void a(List<? extends PostCompilationItemObj> list) {
                    if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 30943, new Class[]{Object.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    b(list);
                }

                public final void b(List<PostCompilationItemObj> list) {
                    if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 30942, new Class[]{List.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    ActivityPostSettingViewModel activityPostSettingViewModel = this.f83045a;
                    this.f83046b.r(ActivityPostSettingViewModel.g(activityPostSettingViewModel, activityPostSettingViewModel.p().f(), list));
                }
            }

            /* JADX INFO: compiled from: ActivityPostSettingViewModel.kt */
            public static final class b implements j0<String> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ ActivityPostSettingViewModel f83047a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ g0<PostCompilationItemObj> f83048b;

                b(ActivityPostSettingViewModel activityPostSettingViewModel, g0<PostCompilationItemObj> g0Var) {
                    this.f83047a = activityPostSettingViewModel;
                    this.f83048b = g0Var;
                }

                @Override // androidx.lifecycle.j0
                public /* bridge */ /* synthetic */ void a(String str) {
                    if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30945, new Class[]{Object.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    b(str);
                }

                public final void b(@e String str) {
                    if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30944, new Class[]{String.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    ActivityPostSettingViewModel activityPostSettingViewModel = this.f83047a;
                    this.f83048b.r(ActivityPostSettingViewModel.g(activityPostSettingViewModel, str, activityPostSettingViewModel.n().f()));
                }
            }

            {
                super(0);
            }

            @d
            public final g0<PostCompilationItemObj> a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30940, new Class[0], g0.class);
                if (patchProxyResultProxy.isSupported) {
                    return (g0) patchProxyResultProxy.result;
                }
                g0<PostCompilationItemObj> g0Var = new g0<>();
                g0Var.s(this.f83044b.n(), new a(this.f83044b, g0Var));
                g0Var.s(this.f83044b.p(), new b(this.f83044b, g0Var));
                return g0Var;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.g0<com.max.xiaoheihe.bean.bbs.post_edit.PostCompilationItemObj>, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ g0<PostCompilationItemObj> invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30941, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        i0<Integer> i0Var4 = new i0<>(0);
        this.f83039l = i0Var4;
        this.f83040m = i0Var4;
    }

    public static final /* synthetic */ PostCompilationItemObj g(ActivityPostSettingViewModel activityPostSettingViewModel, String str, List list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activityPostSettingViewModel, str, list}, null, changeQuickRedirect, true, 30939, new Class[]{ActivityPostSettingViewModel.class, String.class, List.class}, PostCompilationItemObj.class);
        return patchProxyResultProxy.isSupported ? (PostCompilationItemObj) patchProxyResultProxy.result : activityPostSettingViewModel.m(str, list);
    }

    private final PostCompilationItemObj m(String str, List<PostCompilationItemObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 30934, new Class[]{String.class, List.class}, PostCompilationItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostCompilationItemObj) patchProxyResultProxy.result;
        }
        Object obj = null;
        if ((str == null || str.length() == 0) || list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (f0.g(((PostCompilationItemObj) obj2).getObj_id(), str)) {
                obj = obj2;
                break;
            }
        }
        return (PostCompilationItemObj) obj;
    }

    @d
    public final LiveData<List<PostCompilationItemObj>> n() {
        return this.f83033f;
    }

    @d
    public final LiveData<Integer> o() {
        return this.f83040m;
    }

    @d
    public final LiveData<String> p() {
        return this.f83037j;
    }

    @d
    public final LiveData<PostCompilationItemObj> r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30933, new Class[0], LiveData.class);
        return patchProxyResultProxy.isSupported ? (LiveData) patchProxyResultProxy.result : (LiveData) this.f83038k.getValue();
    }

    @d
    public final LiveData<Integer> s() {
        return this.f83035h;
    }

    public final void t(@d PostCompilationItemObj newCompilationItemObj) {
        if (PatchProxy.proxy(new Object[]{newCompilationItemObj}, this, changeQuickRedirect, false, 30936, new Class[]{PostCompilationItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(newCompilationItemObj, "newCompilationItemObj");
        List<PostCompilationItemObj> listP = CollectionsKt__CollectionsKt.P(newCompilationItemObj);
        List<PostCompilationItemObj> listF = this.f83032e.f();
        List<PostCompilationItemObj> list = listF;
        if (!(!(list == null || list.isEmpty()))) {
            listF = null;
        }
        List<PostCompilationItemObj> list2 = listF;
        if (list2 != null) {
            listP.addAll(list2);
        }
        this.f83032e.r(listP);
        i0<Integer> i0Var = this.f83034g;
        Integer numF = i0Var.f();
        if (numF == null) {
            numF = 0;
        }
        i0Var.r(Integer.valueOf(numF.intValue() + 1));
    }

    public final void u(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 30938, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f83039l.r(Integer.valueOf(i10));
    }

    public final void v(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30935, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f83036i.o(str);
    }

    public final void w(boolean z10, @d yh.a<Boolean> activeChecker) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), activeChecker}, this, changeQuickRedirect, false, 30937, new Class[]{Boolean.TYPE, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activeChecker, "activeChecker");
        if (z10) {
            this.f83031d += 30;
        } else {
            this.f83031d = 0;
        }
        c((b) i.a().U1(com.max.xiaoheihe.utils.i0.j(), this.f83031d, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(activeChecker, z10, this)));
    }
}
