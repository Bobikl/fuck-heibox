package com.max.xiaoheihe.module.bbs.post_edit;

import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.max.hbcommon.base.BaseViewModel;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.BBSTopicIndexObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.bean.bbs.TopicListObj;
import com.max.xiaoheihe.bean.bbs.TopicSelectionResultObj;
import com.max.xiaoheihe.bean.bbs.TopicSelectionSearchResultObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: PictureVideoEditPostFragmentViewModel.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nPictureVideoEditPostFragmentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureVideoEditPostFragmentViewModel.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoEditPostFragmentViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,411:1\n766#2:412\n857#2,2:413\n1855#2,2:416\n1855#2,2:418\n1#3:415\n*S KotlinDebug\n*F\n+ 1 PictureVideoEditPostFragmentViewModel.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoEditPostFragmentViewModel\n*L\n111#1:412\n111#1:413,2\n305#1:416,2\n353#1:418,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class PictureVideoEditPostFragmentViewModel extends BaseViewModel {

    @dl.d
    public static final a B = new a(null);
    public static final int C = 8;
    public static final int D = 2;
    public static final int E = 5;

    @dl.d
    private static final String F = "PictureVideoEditPostFragmentViewModel";

    @dl.d
    private static final String G = "cache_key_topic_index_result";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final LiveData<Pair<Result<TopicListObj>, String>> A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f82471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Set<Uri> f82472e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<m> f82473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final LiveData<m> f82474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<CharSequence> f82475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final LiveData<CharSequence> f82476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<KeyDescObj> f82477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final LiveData<KeyDescObj> f82478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<List<BBSTopicObj>> f82479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final LiveData<List<BBSTopicObj>> f82480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<List<String>> f82481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final LiveData<List<String>> f82482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<Boolean> f82483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final LiveData<Boolean> f82484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<Boolean> f82485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final LiveData<Boolean> f82486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<Result<BBSTopicIndexObj>> f82487t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final LiveData<Result<BBSTopicIndexObj>> f82488u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<Result<TopicSelectionResultObj>> f82489v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final LiveData<Result<TopicSelectionResultObj>> f82490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<Pair<Result<TopicSelectionSearchResultObj>, String>> f82491x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private final LiveData<Pair<Result<TopicSelectionSearchResultObj>, String>> f82492y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<Pair<Result<TopicListObj>, String>> f82493z;

    /* JADX INFO: compiled from: PictureVideoEditPostFragmentViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: PictureVideoEditPostFragmentViewModel.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TopicSelectionResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<Boolean> f82494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PictureVideoEditPostFragmentViewModel f82495c;

        b(yh.a<Boolean> aVar, PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel) {
            this.f82494b = aVar;
            this.f82495c = pictureVideoEditPostFragmentViewModel;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 30466, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (this.f82494b.invoke().booleanValue()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<TopicSelectionResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30467, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (this.f82494b.invoke().booleanValue()) {
                this.f82495c.f82489v.o(result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30468, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TopicSelectionResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: PictureVideoEditPostFragmentViewModel.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<BBSTopicIndexObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<Boolean> f82496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PictureVideoEditPostFragmentViewModel f82497c;

        c(yh.a<Boolean> aVar, PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel) {
            this.f82496b = aVar;
            this.f82497c = pictureVideoEditPostFragmentViewModel;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30469, new Class[0], Void.TYPE).isSupported && this.f82496b.invoke().booleanValue()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 30470, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (this.f82496b.invoke().booleanValue()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<BBSTopicIndexObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30471, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (this.f82496b.invoke().booleanValue()) {
                super.onNext(result);
                this.f82497c.f82487t.o(result);
                PictureVideoEditPostFragmentViewModel.n(this.f82497c, result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30472, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSTopicIndexObj>) obj);
        }
    }

    /* JADX INFO: compiled from: PictureVideoEditPostFragmentViewModel.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<TopicSelectionSearchResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<Boolean> f82498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PictureVideoEditPostFragmentViewModel f82499c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f82500d;

        d(yh.a<Boolean> aVar, PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel, String str) {
            this.f82498b = aVar;
            this.f82499c = pictureVideoEditPostFragmentViewModel;
            this.f82500d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 30473, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (this.f82498b.invoke().booleanValue()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<TopicSelectionSearchResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30474, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (this.f82498b.invoke().booleanValue()) {
                this.f82499c.f82491x.o(new Pair(result, this.f82500d));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30475, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TopicSelectionSearchResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: PictureVideoEditPostFragmentViewModel.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<TopicListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<Boolean> f82501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PictureVideoEditPostFragmentViewModel f82502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f82503d;

        e(yh.a<Boolean> aVar, PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel, String str) {
            this.f82501b = aVar;
            this.f82502c = pictureVideoEditPostFragmentViewModel;
            this.f82503d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 30476, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (this.f82501b.invoke().booleanValue()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<TopicListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30477, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (this.f82501b.invoke().booleanValue()) {
                this.f82502c.f82493z.o(new Pair(result, this.f82503d));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30478, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TopicListObj>) obj);
        }
    }

    public PictureVideoEditPostFragmentViewModel() {
        androidx.lifecycle.i0<m> i0Var = new androidx.lifecycle.i0<>();
        this.f82473f = i0Var;
        this.f82474g = i0Var;
        androidx.lifecycle.i0<CharSequence> i0Var2 = new androidx.lifecycle.i0<>();
        this.f82475h = i0Var2;
        this.f82476i = i0Var2;
        androidx.lifecycle.i0<KeyDescObj> i0Var3 = new androidx.lifecycle.i0<>();
        this.f82477j = i0Var3;
        this.f82478k = i0Var3;
        androidx.lifecycle.i0<List<BBSTopicObj>> i0Var4 = new androidx.lifecycle.i0<>();
        this.f82479l = i0Var4;
        this.f82480m = i0Var4;
        androidx.lifecycle.i0<List<String>> i0Var5 = new androidx.lifecycle.i0<>();
        this.f82481n = i0Var5;
        this.f82482o = i0Var5;
        androidx.lifecycle.i0<Boolean> i0Var6 = new androidx.lifecycle.i0<>();
        this.f82483p = i0Var6;
        this.f82484q = i0Var6;
        androidx.lifecycle.i0<Boolean> i0Var7 = new androidx.lifecycle.i0<>();
        this.f82485r = i0Var7;
        this.f82486s = i0Var7;
        androidx.lifecycle.i0<Result<BBSTopicIndexObj>> i0Var8 = new androidx.lifecycle.i0<>();
        this.f82487t = i0Var8;
        this.f82488u = i0Var8;
        androidx.lifecycle.i0<Result<TopicSelectionResultObj>> i0Var9 = new androidx.lifecycle.i0<>();
        this.f82489v = i0Var9;
        this.f82490w = i0Var9;
        androidx.lifecycle.i0<Pair<Result<TopicSelectionSearchResultObj>, String>> i0Var10 = new androidx.lifecycle.i0<>();
        this.f82491x = i0Var10;
        this.f82492y = i0Var10;
        androidx.lifecycle.i0<Pair<Result<TopicListObj>, String>> i0Var11 = new androidx.lifecycle.i0<>();
        this.f82493z = i0Var11;
        this.A = i0Var11;
    }

    private final Result<BBSTopicIndexObj> G() {
        Object objB;
        Result result;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30444, new Class[0], Result.class);
        if (patchProxyResultProxy.isSupported) {
            return (Result) patchProxyResultProxy.result;
        }
        try {
            kotlin.Result.a aVar = kotlin.Result.f124476c;
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            com.max.hbmmkv.c.b(null, new yh.l<com.max.hbmmkv.b, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragmentViewModel$loadTopicIndexResultCache$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.String] */
                public final void a(@dl.d com.max.hbmmkv.b withMMKV) {
                    if (PatchProxy.proxy(new Object[]{withMMKV}, this, changeQuickRedirect, false, 30458, new Class[]{com.max.hbmmkv.b.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    kotlin.jvm.internal.f0.p(withMMKV, "$this$withMMKV");
                    objectRef.f124891b = withMMKV.f("cache_key_topic_index_result", "", true);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(com.max.hbmmkv.b bVar) {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 30459, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    a(bVar);
                    return b2.f124493a;
                }
            }, 1, null);
            Object obj = objectRef.f124891b;
            String str = (String) obj;
            if (!(!(str == null || kotlin.text.u.V1(str)))) {
                obj = null;
            }
            String str2 = (String) obj;
            if (str2 != null) {
                BBSTopicIndexObj bBSTopicIndexObj = (BBSTopicIndexObj) com.max.hbutils.utils.k.a(str2, BBSTopicIndexObj.class);
                result = new Result();
                result.setResult(bBSTopicIndexObj);
            } else {
                result = null;
            }
            objB = kotlin.Result.b(result);
        } catch (Throwable th2) {
            kotlin.Result.a aVar2 = kotlin.Result.f124476c;
            objB = kotlin.Result.b(kotlin.t0.a(th2));
        }
        return (Result) (kotlin.Result.i(objB) ? null : objB);
    }

    private final String P(List<? extends GameObj> list) {
        List listN2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 30446, new Class[]{List.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        if (list != null && (listN2 = CollectionsKt___CollectionsKt.n2(list)) != null) {
            Iterator it = listN2.iterator();
            while (it.hasNext()) {
                sb2.append(((GameObj) it.next()).getAppid());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        if (sb2.length() > 0) {
            return sb2.deleteCharAt(sb2.length() - 1).toString();
        }
        return null;
    }

    private final void R(Result<BBSTopicIndexObj> result) {
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30443, new Class[]{Result.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(androidx.lifecycle.x0.a(this), e1.c(), null, new PictureVideoEditPostFragmentViewModel$saveTopicIndexResultCache$1(result, null), 2, null);
    }

    public static final /* synthetic */ void n(PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel, Result result) {
        if (PatchProxy.proxy(new Object[]{pictureVideoEditPostFragmentViewModel, result}, null, changeQuickRedirect, true, 30452, new Class[]{PictureVideoEditPostFragmentViewModel.class, Result.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoEditPostFragmentViewModel.R(result);
    }

    @dl.d
    public final LiveData<Pair<Result<TopicListObj>, String>> A() {
        return this.A;
    }

    public final boolean B(@dl.d HashtagObj hashtagObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hashtagObj}, this, changeQuickRedirect, false, 30450, new Class[]{HashtagObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(hashtagObj, "hashtagObj");
        String name = hashtagObj.getName();
        if (name == null || kotlin.text.u.V1(name)) {
            return true;
        }
        List<String> listF = this.f82482o.f();
        if (listF != null) {
            return listF.contains(hashtagObj.getName());
        }
        return false;
    }

    public final boolean C(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30451, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str == null || kotlin.text.u.V1(str)) {
            return true;
        }
        List<String> listF = this.f82482o.f();
        if (listF != null) {
            return listF.contains(str);
        }
        return false;
    }

    public final boolean D() {
        return this.f82471d;
    }

    public final boolean E(@dl.e BBSTopicObj bBSTopicObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 30449, new Class[]{BBSTopicObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (bBSTopicObj == null) {
            return true;
        }
        List<BBSTopicObj> listF = this.f82480m.f();
        if (listF != null) {
            return listF.contains(bBSTopicObj);
        }
        return false;
    }

    public final void F() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30433, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(androidx.lifecycle.x0.a(this), e1.c(), null, new PictureVideoEditPostFragmentViewModel$launchTaskAfterTriggerPost$1(this, null), 2, null);
    }

    public final void H(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30439, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f82483p.o(Boolean.valueOf(z10));
    }

    public final void I(@dl.e List<String> list) {
        List<String> listE;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 30438, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list == null || (listE = CollectionsKt___CollectionsKt.n2(list)) == null) {
            listE = CollectionsKt__CollectionsKt.E();
        }
        this.f82481n.o(listE);
    }

    public final void J(@dl.e List<? extends BBSTopicObj> list) {
        List<BBSTopicObj> listE;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 30437, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list == null || (listE = CollectionsKt___CollectionsKt.n2(list)) == null) {
            listE = CollectionsKt__CollectionsKt.E();
        }
        this.f82479l.o(listE);
    }

    public final void K(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30440, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f82485r.o(Boolean.valueOf(z10));
    }

    public final void L(@dl.e KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 30436, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f82477j.o(keyDescObj);
    }

    public final void M(@dl.e m mVar) {
        if (PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, 30434, new Class[]{m.class}, Void.TYPE).isSupported || mVar == null) {
            return;
        }
        this.f82473f.o(mVar);
    }

    public final void N(@dl.e CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 30435, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        androidx.lifecycle.i0<CharSequence> i0Var = this.f82475h;
        if (charSequence == null) {
            charSequence = "";
        }
        i0Var.o(charSequence);
    }

    public final void O(@dl.e String str) {
        Object objB;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30432, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        try {
            kotlin.Result.a aVar = kotlin.Result.f124476c;
            Set<Uri> set = this.f82472e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (kotlin.jvm.internal.f0.g(((Uri) obj).getPath(), str)) {
                    arrayList.add(obj);
                }
            }
            boolean zRemoveAll = this.f82472e.removeAll(CollectionsKt___CollectionsKt.V5(arrayList));
            com.max.heybox.hblog.g.f74531b.q(StringsKt__IndentKt.p("\n                        [PictureVideoEditPostFragmentViewModel][removeEditedImageUriByPath]\n                        remove path: " + str + "\n                        result: " + zRemoveAll + "\n                    "));
            objB = kotlin.Result.b(b2.f124493a);
        } catch (Throwable th2) {
            kotlin.Result.a aVar2 = kotlin.Result.f124476c;
            objB = kotlin.Result.b(kotlin.t0.a(th2));
        }
        if (kotlin.Result.e(objB) != null) {
            com.max.heybox.hblog.g.f74531b.v("[PictureVideoEditPostFragmentViewModel][removeEditedImageUriByPath] remove uri for path: " + str + " fail");
        }
    }

    @androidx.annotation.k0
    public final void Q(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.d yh.a<Boolean> onCheckIsActive) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, onCheckIsActive}, this, changeQuickRedirect, false, 30441, new Class[]{String.class, String.class, String.class, String.class, String.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(onCheckIsActive, "onCheckIsActive");
        Result<BBSTopicIndexObj> resultG = G();
        if (resultG != null) {
            this.f82487t.r(resultG);
        }
        U(str, str2, str3, str4, str5, onCheckIsActive);
    }

    public final void S(boolean z10) {
        this.f82471d = z10;
    }

    public final void T(@dl.e com.max.xiaoheihe.module.bbs.post_edit.d dVar, @dl.d yh.a<Boolean> onCheckIsActive) {
        if (PatchProxy.proxy(new Object[]{dVar, onCheckIsActive}, this, changeQuickRedirect, false, 30445, new Class[]{com.max.xiaoheihe.module.bbs.post_edit.d.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(onCheckIsActive, "onCheckIsActive");
        c((b) com.max.xiaoheihe.network.i.a().a4(P(dVar != null ? dVar.h() : null), "1", dVar != null ? dVar.g() : null, dVar != null ? dVar.f() : null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(onCheckIsActive, this)));
    }

    public final void U(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.d yh.a<Boolean> onCheckIsActive) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, onCheckIsActive}, this, changeQuickRedirect, false, 30442, new Class[]{String.class, String.class, String.class, String.class, String.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(onCheckIsActive, "onCheckIsActive");
        c((c) com.max.xiaoheihe.network.i.a().b0(str, str2, str3, str4, str5).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(onCheckIsActive, this)));
    }

    public final void V(@dl.d String searchQ, @dl.d yh.a<Boolean> onCheckIsActive) {
        if (PatchProxy.proxy(new Object[]{searchQ, onCheckIsActive}, this, changeQuickRedirect, false, 30447, new Class[]{String.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(searchQ, "searchQ");
        kotlin.jvm.internal.f0.p(onCheckIsActive, "onCheckIsActive");
        c((d) com.max.xiaoheihe.network.i.a().P3(searchQ, 1).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(onCheckIsActive, this, searchQ)));
    }

    public final void W(@dl.d String searchQ, @dl.d yh.a<Boolean> onCheckIsActive) {
        if (PatchProxy.proxy(new Object[]{searchQ, onCheckIsActive}, this, changeQuickRedirect, false, 30448, new Class[]{String.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(searchQ, "searchQ");
        kotlin.jvm.internal.f0.p(onCheckIsActive, "onCheckIsActive");
        ArrayList arrayList = new ArrayList();
        List<BBSTopicObj> listF = this.f82480m.f();
        if (listF != null) {
            Iterator<T> it = listF.iterator();
            while (it.hasNext()) {
                String topic_id = ((BBSTopicObj) it.next()).getTopic_id();
                if (topic_id != null) {
                    kotlin.jvm.internal.f0.o(topic_id, "topic_id");
                    arrayList.add(topic_id);
                }
            }
        }
        c((e) com.max.xiaoheihe.network.i.a().T4(searchQ, TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, arrayList), "1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(onCheckIsActive, this, searchQ)));
    }

    public final void o(@dl.e Uri uri) {
        if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, 30431, new Class[]{Uri.class}, Void.TYPE).isSupported || uri == null) {
            return;
        }
        this.f82472e.add(uri);
        com.max.heybox.hblog.g.f74531b.q(StringsKt__IndentKt.p("\n                [PictureVideoEditPostFragmentViewModel][addEditedImageUri] add uri: " + uri + "\n                isFileScheme: " + kotlin.text.u.M1(uri.getScheme(), "file", false, 2, null) + "\n                isContentScheme: " + kotlin.text.u.M1(uri.getScheme(), "content", false, 2, null) + "\n            "));
    }

    @dl.d
    public final LiveData<Boolean> p() {
        return this.f82484q;
    }

    @dl.d
    public final LiveData<List<String>> r() {
        return this.f82482o;
    }

    @dl.d
    public final LiveData<List<BBSTopicObj>> s() {
        return this.f82480m;
    }

    @dl.d
    public final LiveData<CharSequence> t() {
        return this.f82476i;
    }

    @dl.d
    public final LiveData<Boolean> u() {
        return this.f82486s;
    }

    @dl.d
    public final LiveData<Result<TopicSelectionResultObj>> v() {
        return this.f82490w;
    }

    @dl.d
    public final LiveData<Pair<Result<TopicSelectionSearchResultObj>, String>> w() {
        return this.f82492y;
    }

    @dl.d
    public final LiveData<KeyDescObj> x() {
        return this.f82478k;
    }

    @dl.d
    public final LiveData<m> y() {
        return this.f82474g;
    }

    @dl.d
    public final LiveData<Result<BBSTopicIndexObj>> z() {
        return this.f82488u;
    }
}
