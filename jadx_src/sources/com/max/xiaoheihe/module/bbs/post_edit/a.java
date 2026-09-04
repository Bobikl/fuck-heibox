package com.max.xiaoheihe.module.bbs.post_edit;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.max.xiaoheihe.bean.bbs.TopicSelectionResultObj;
import com.max.xiaoheihe.bean.bbs.TopicSelectionSearchResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import df.m7;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nChooseTopicHashFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseTopicHashFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/ChooseTopicHashFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n1855#2,2:921\n766#2:923\n857#2,2:924\n1603#2,9:926\n1855#2:935\n1856#2:937\n1612#2:938\n1855#2,2:939\n1864#2,3:941\n1855#2,2:944\n1855#2,2:946\n1855#2,2:949\n1855#2,2:951\n766#2:953\n857#2,2:954\n1603#2,9:956\n1855#2:965\n1856#2:967\n1612#2:968\n1#3:936\n1#3:948\n1#3:966\n*S KotlinDebug\n*F\n+ 1 ChooseTopicHashFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/ChooseTopicHashFragment\n*L\n198#1:921,2\n355#1:923\n355#1:924,2\n355#1:926,9\n355#1:935\n355#1:937\n355#1:938\n358#1:939,2\n368#1:941,3\n390#1:944,2\n407#1:946,2\n707#1:949,2\n717#1:951,2\n781#1:953\n781#1:954,2\n781#1:956,9\n781#1:965\n781#1:967\n781#1:968\n355#1:936\n781#1:966\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class a extends com.max.hbcommon.base.swipeback.a {

    @dl.d
    public static final C0713a E = new C0713a(null);
    public static final int F = 8;

    @dl.d
    private static final String G = "ARG_LINK_TITLE";

    @dl.d
    private static final String H = "ARG_LINK_CONTENT";

    @dl.d
    private static final String I = "ARG_CHECKED_LIST";

    @dl.d
    private static final String J = "ARG_APPIDS";

    @dl.d
    private static final String K = "ARG_TOPIC_INFO";
    private static final int L = 19;
    private static boolean M;
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.max.hbcommon.base.adapter.s<TopicHashtagWrapper> A;
    private Context C;

    @dl.e
    private String D;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private m7 f82773j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private String f82775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private String f82776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private ArrayList<TopicHashtagWrapper> f82777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private String f82778o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private ArrayList<TopicHashtagWrapper> f82779p;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TopicSelectionResultObj f82784u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private c f82785v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.u<TopicHashtagWrapper> f82786w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.t f82787x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<BBSTopicObj> f82788y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<HashtagObj> f82789z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final b f82774k = new b(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private ArrayList<TopicHashtagWrapper> f82780q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private ArrayList<BBSTopicObj> f82781r = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private ArrayList<HashtagObj> f82782s = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private ArrayList<TopicHashtagWrapper> f82783t = new ArrayList<>();

    @dl.d
    private HashMap<String, Pair<String, Integer>> B = new HashMap<>();

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public static final class C0713a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
        @kotlin.jvm.internal.t0({"SMAP\nChooseTopicHashFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseTopicHashFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/ChooseTopicHashFragment$Companion$startFragment$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n1855#2,2:921\n1855#2:923\n1856#2:925\n1#3:924\n*S KotlinDebug\n*F\n+ 1 ChooseTopicHashFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/ChooseTopicHashFragment$Companion$startFragment$1\n*L\n113#1:921,2\n122#1:923\n122#1:925\n*E\n"})
        public static final class C0714a extends com.max.hbcommon.network.d<Result<TopicSelectionResultObj>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.f f82790b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList<BBSTopicObj> f82791c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<String> f82792d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f82793e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f82794f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f82795g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ FragmentManager f82796h;

            C0714a(com.max.hbcommon.base.f fVar, ArrayList<BBSTopicObj> arrayList, List<String> list, String str, String str2, String str3, FragmentManager fragmentManager) {
                this.f82790b = fVar;
                this.f82791c = arrayList;
                this.f82792d = list;
                this.f82793e = str;
                this.f82794f = str2;
                this.f82795g = str3;
                this.f82796h = fragmentManager;
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29598, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(e10, "e");
                a.E.h(false);
                if (this.f82790b.isActive()) {
                    super.onError(e10);
                }
            }

            public void onNext(@dl.d Result<TopicSelectionResultObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29599, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(result, "result");
                a.E.h(false);
                if (this.f82790b.isActive()) {
                    a aVar = new a();
                    Bundle bundle = new Bundle();
                    ArrayList arrayList = new ArrayList();
                    ArrayList<BBSTopicObj> arrayList2 = this.f82791c;
                    if (arrayList2 != null) {
                        Iterator<T> it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new TopicHashtagWrapper("topic", (BBSTopicObj) it.next(), null));
                        }
                    }
                    List<String> list = this.f82792d;
                    if (list != null) {
                        for (String str : list) {
                            HashtagObj hashtagObj = new HashtagObj();
                            hashtagObj.setName(str);
                            b2 b2Var = b2.f124493a;
                            arrayList.add(new TopicHashtagWrapper("hashtag", null, hashtagObj));
                        }
                    }
                    C0713a c0713a = a.E;
                    bundle.putSerializable(c0713a.b(), arrayList);
                    bundle.putString(c0713a.a(), this.f82793e);
                    bundle.putString(c0713a.d(), this.f82794f);
                    bundle.putString(c0713a.c(), this.f82795g);
                    bundle.putSerializable(c0713a.e(), result.getResult());
                    aVar.setArguments(bundle);
                    aVar.M3(this.f82796h, "choose_topic");
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29600, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<TopicSelectionResultObj>) obj);
            }
        }

        private C0713a() {
        }

        public /* synthetic */ C0713a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29592, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : a.J;
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29591, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : a.I;
        }

        @dl.d
        public final String c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29590, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : a.H;
        }

        @dl.d
        public final String d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29589, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : a.G;
        }

        @dl.d
        public final String e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29593, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : a.K;
        }

        public final int f() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29594, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a.L;
        }

        public final boolean g() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29595, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a.M;
        }

        public final void h(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29596, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            a.M = z10;
        }

        public final void i(@dl.d FragmentManager manager, @dl.d io.reactivex.disposables.a compositeDisposable, @dl.d com.max.hbcommon.base.f baseView, @dl.e ArrayList<BBSTopicObj> arrayList, @dl.e List<String> list, @dl.e String str, @dl.e String str2, @dl.e String str3) {
            if (PatchProxy.proxy(new Object[]{manager, compositeDisposable, baseView, arrayList, list, str, str2, str3}, this, changeQuickRedirect, false, 29597, new Class[]{FragmentManager.class, io.reactivex.disposables.a.class, com.max.hbcommon.base.f.class, ArrayList.class, List.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(manager, "manager");
            kotlin.jvm.internal.f0.p(compositeDisposable, "compositeDisposable");
            kotlin.jvm.internal.f0.p(baseView, "baseView");
            if (g()) {
                return;
            }
            h(true);
            compositeDisposable.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().a4(str, null, str2, str3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0714a(baseView, arrayList, list, str, str2, str3, manager)));
        }
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public static final class b extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final WeakReference<a> f82797a;

        public b(@dl.d a fragment) {
            kotlin.jvm.internal.f0.p(fragment, "fragment");
            this.f82797a = new WeakReference<>(fragment);
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 29601, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(msg, "msg");
            super.handleMessage(msg);
            a aVar = this.f82797a.get();
            if (aVar != null) {
                Object obj = msg.obj;
                kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.String");
                a.p4(aVar, (String) obj);
            }
        }
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public interface c {
        void h2(@dl.e ArrayList<TopicHashtagWrapper> arrayList, boolean z10);
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nChooseTopicHashFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseTopicHashFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/ChooseTopicHashFragment$doSearch$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n1#2:921\n*E\n"})
    public static final class d extends com.max.hbcommon.network.d<Result<TopicSelectionSearchResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f82799c;

        d(String str) {
            this.f82799c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29602, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (a.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<TopicSelectionSearchResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29603, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (a.this.isActive()) {
                a.this.f82783t.clear();
                ArrayList<TopicHashtagWrapper> search_result = result.getResult().getSearch_result();
                if (search_result != null) {
                    a.this.f82783t.addAll(search_result);
                }
                com.max.hbcommon.base.adapter.s sVar = null;
                if (com.max.hbcommon.utils.c.w(a.this.f82783t) || !a1.f82828a.c(a.this.f82783t, this.f82799c)) {
                    ArrayList arrayList = a.this.f82783t;
                    HashtagObj hashtagObj = new HashtagObj();
                    hashtagObj.setName(this.f82799c);
                    b2 b2Var = b2.f124493a;
                    arrayList.add(0, new TopicHashtagWrapper(TopicHashtagWrapper.TYPE_CREATE, null, hashtagObj));
                }
                com.max.hbcommon.base.adapter.s sVar2 = a.this.A;
                if (sVar2 == null) {
                    kotlin.jvm.internal.f0.S("mSearchAdapter");
                } else {
                    sVar = sVar2;
                }
                sVar.notifyDataSetChanged();
                a.x4(a.this, true);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29604, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TopicSelectionSearchResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public static final class e extends com.max.hbcommon.base.adapter.u<TopicHashtagWrapper> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
        public static final class ViewOnClickListenerC0715a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f82801b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TopicHashtagWrapper f82802c;

            ViewOnClickListenerC0715a(a aVar, TopicHashtagWrapper topicHashtagWrapper) {
                this.f82801b = aVar;
                this.f82802c = topicHashtagWrapper;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29609, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f82801b.f82780q.remove(this.f82802c);
                a.y4(this.f82801b);
                com.max.hbcommon.base.adapter.t tVar = this.f82801b.f82787x;
                com.max.hbcommon.base.adapter.s sVar = null;
                if (tVar == null) {
                    kotlin.jvm.internal.f0.S("mCheckedFooterAdapter");
                    tVar = null;
                }
                tVar.notifyDataSetChanged();
                com.max.hbcommon.base.adapter.s sVar2 = this.f82801b.f82789z;
                if (sVar2 == null) {
                    kotlin.jvm.internal.f0.S("mHashtagAdapter");
                } else {
                    sVar = sVar2;
                }
                sVar.notifyDataSetChanged();
            }
        }

        /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f82803b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TopicHashtagWrapper f82804c;

            b(a aVar, TopicHashtagWrapper topicHashtagWrapper) {
                this.f82803b = aVar;
                this.f82804c = topicHashtagWrapper;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29610, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f82803b.f82780q.remove(this.f82804c);
                a.V4(this.f82803b, false, 1, null);
            }
        }

        e(Context context, ArrayList<TopicHashtagWrapper> arrayList) {
            super(context, arrayList);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, TopicHashtagWrapper topicHashtagWrapper) {
            Object[] objArr = {new Integer(i10), topicHashtagWrapper};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29608, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, topicHashtagWrapper);
        }

        public int n(int i10, @dl.d TopicHashtagWrapper data) {
            Object[] objArr = {new Integer(i10), data};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29606, new Class[]{cls, TopicHashtagWrapper.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            kotlin.jvm.internal.f0.p(data, "data");
            return data.isHashtag() ? R.layout.layout_new_topic_selector_checked_hashtag : R.layout.layout_new_topic_selector_topic;
        }

        public void o(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TopicHashtagWrapper data) {
            Context context;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 29605, new Class[]{com.max.hbcommon.base.adapter.s.e.class, TopicHashtagWrapper.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context context2 = a.this.C;
            Context context3 = null;
            if (context2 == null) {
                kotlin.jvm.internal.f0.S("mContext");
                context2 = null;
            }
            int iF = ViewUtils.f(context2, 4.0f);
            Context context4 = a.this.C;
            if (context4 == null) {
                kotlin.jvm.internal.f0.S("mContext");
                context4 = null;
            }
            int iF2 = ViewUtils.f(context4, 4.0f);
            Context context5 = a.this.C;
            if (context5 == null) {
                kotlin.jvm.internal.f0.S("mContext");
                context5 = null;
            }
            marginLayoutParams.setMargins(iF, 0, iF2, ViewUtils.f(context5, 8.0f));
            if (data.isHashtag()) {
                a1 a1Var = a1.f82828a;
                Context context6 = a.this.C;
                if (context6 == null) {
                    kotlin.jvm.internal.f0.S("mContext");
                } else {
                    context3 = context6;
                }
                HashtagObj hashtag = data.getHashtag();
                kotlin.jvm.internal.f0.m(hashtag);
                View view = viewHolder.itemView;
                kotlin.jvm.internal.f0.o(view, "viewHolder.itemView");
                a1Var.g(context3, hashtag, view);
                viewHolder.itemView.setOnClickListener(new ViewOnClickListenerC0715a(a.this, data));
                return;
            }
            a1 a1Var2 = a1.f82828a;
            Context context7 = a.this.C;
            if (context7 == null) {
                kotlin.jvm.internal.f0.S("mContext");
                context = null;
            } else {
                context = context7;
            }
            BBSTopicObj topic = data.getTopic();
            kotlin.jvm.internal.f0.m(topic);
            View view2 = viewHolder.itemView;
            kotlin.jvm.internal.f0.o(view2, "viewHolder.itemView");
            a1.k(a1Var2, context, topic, view2, true, false, 16, null);
            viewHolder.itemView.setOnClickListener(new b(a.this, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 29607, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (TopicHashtagWrapper) obj);
        }
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29611, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (a.c4(a.this) >= 20) {
                com.max.hbutils.utils.c.f("话题数量已达上限");
            } else {
                com.max.xiaoheihe.module.bbs.post_edit.b.f82931l.a().M3(a.this.getChildFragmentManager(), "create_hashtag");
            }
        }
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public static final class g extends com.max.hbcommon.base.adapter.s<HashtagObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.a$g$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
        public static final class ViewOnClickListenerC0716a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f82807b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HashtagObj f82808c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f82809d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Ref.BooleanRef f82810e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ g f82811f;

            ViewOnClickListenerC0716a(a aVar, HashtagObj hashtagObj, com.max.hbcommon.base.adapter.s.e eVar, Ref.BooleanRef booleanRef, g gVar) {
                this.f82807b = aVar;
                this.f82808c = hashtagObj;
                this.f82809d = eVar;
                this.f82810e = booleanRef;
                this.f82811f = gVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29614, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                a.q4(this.f82807b, this.f82808c.getName(), this.f82808c.getRecSrc());
                this.f82809d.getBindingAdapterPosition();
                com.max.hbcommon.base.adapter.t tVar = null;
                com.max.hbcommon.base.adapter.t tVar2 = null;
                Context context = null;
                if (this.f82810e.f124884b) {
                    a1.f82828a.l(this.f82807b.f82780q, this.f82808c);
                    a.y4(this.f82807b);
                    com.max.hbcommon.base.adapter.t tVar3 = this.f82807b.f82787x;
                    if (tVar3 == null) {
                        kotlin.jvm.internal.f0.S("mCheckedFooterAdapter");
                    } else {
                        tVar2 = tVar3;
                    }
                    tVar2.notifyDataSetChanged();
                    this.f82811f.notifyDataSetChanged();
                    return;
                }
                if (a.c4(this.f82807b) >= 5) {
                    Context context2 = this.f82807b.C;
                    if (context2 == null) {
                        kotlin.jvm.internal.f0.S("mContext");
                    } else {
                        context = context2;
                    }
                    com.max.hbutils.utils.c.f(context.getString(R.string.toast_hashtag_count_limit));
                    return;
                }
                this.f82807b.f82780q.add(new TopicHashtagWrapper("hashtag", null, this.f82808c));
                a.y4(this.f82807b);
                com.max.hbcommon.base.adapter.t tVar4 = this.f82807b.f82787x;
                if (tVar4 == null) {
                    kotlin.jvm.internal.f0.S("mCheckedFooterAdapter");
                } else {
                    tVar = tVar4;
                }
                tVar.notifyDataSetChanged();
                this.f82811f.notifyDataSetChanged();
            }
        }

        g(Context context, ArrayList<HashtagObj> arrayList) {
            super(context, arrayList, R.layout.layout_new_topic_selector_hashtag);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d HashtagObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 29612, new Class[]{com.max.hbcommon.base.adapter.s.e.class, HashtagObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context context = a.this.C;
            Context context2 = null;
            if (context == null) {
                kotlin.jvm.internal.f0.S("mContext");
                context = null;
            }
            int iF = ViewUtils.f(context, 3.0f);
            Context context3 = a.this.C;
            if (context3 == null) {
                kotlin.jvm.internal.f0.S("mContext");
                context3 = null;
            }
            int iF2 = ViewUtils.f(context3, 3.0f);
            Context context4 = a.this.C;
            if (context4 == null) {
                kotlin.jvm.internal.f0.S("mContext");
                context4 = null;
            }
            marginLayoutParams.setMargins(iF, 0, iF2, ViewUtils.f(context4, 6.0f));
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            a1 a1Var = a1.f82828a;
            booleanRef.f124884b = a1Var.e(a.this.f82780q, data);
            Context context5 = a.this.C;
            if (context5 == null) {
                kotlin.jvm.internal.f0.S("mContext");
            } else {
                context2 = context5;
            }
            View view = viewHolder.itemView;
            kotlin.jvm.internal.f0.o(view, "viewHolder.itemView");
            a1Var.h(context2, data, view, booleanRef.f124884b);
            viewHolder.itemView.setOnClickListener(new ViewOnClickListenerC0716a(a.this, data, viewHolder, booleanRef, this));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, HashtagObj hashtagObj) {
            if (PatchProxy.proxy(new Object[]{eVar, hashtagObj}, this, changeQuickRedirect, false, 29613, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, hashtagObj);
        }
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public static final class h extends com.max.hbcommon.base.adapter.s<TopicHashtagWrapper> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.a$h$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
        public static final class ViewOnClickListenerC0717a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TopicHashtagWrapper f82813b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f82814c;

            ViewOnClickListenerC0717a(TopicHashtagWrapper topicHashtagWrapper, a aVar) {
                this.f82813b = topicHashtagWrapper;
                this.f82814c = aVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29617, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                m7 m7Var = null;
                Context context = null;
                if (this.f82813b.isTopic() && this.f82813b.getTopic() != null) {
                    ArrayList<String> arrayListA = a1.f82828a.a(this.f82814c.f82780q);
                    BBSTopicObj topic = this.f82813b.getTopic();
                    kotlin.jvm.internal.f0.m(topic);
                    if (arrayListA.contains(topic.getTopic_id())) {
                        com.max.hbutils.utils.c.f("与当前选择分区不相关，无法添加");
                        return;
                    }
                    if (a.b4(this.f82814c) >= 2) {
                        Context context2 = this.f82814c.C;
                        if (context2 == null) {
                            kotlin.jvm.internal.f0.S("mContext");
                        } else {
                            context = context2;
                        }
                        com.max.hbutils.utils.c.f(context.getString(R.string.toast_topic_count_limit));
                        return;
                    }
                    a.s4(this.f82814c, this.f82813b);
                    this.f82814c.f82780q.add(new TopicHashtagWrapper("topic", this.f82813b.getTopic(), null));
                    m7 m7Var2 = this.f82814c.f82773j;
                    if (m7Var2 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        m7Var2 = null;
                    }
                    m7Var2.f113308c.setText("");
                    a.V4(this.f82814c, false, 1, null);
                    a.x4(this.f82814c, false);
                    return;
                }
                if (a.c4(this.f82814c) >= 20) {
                    com.max.hbutils.utils.c.f("话题数量已达上限");
                    return;
                }
                if (kotlin.jvm.internal.f0.g(TopicHashtagWrapper.TYPE_CREATE, this.f82813b.getSearch_type())) {
                    a1 a1Var = a1.f82828a;
                    ArrayList<TopicHashtagWrapper> arrayList = this.f82814c.f82780q;
                    HashtagObj hashtag = this.f82813b.getHashtag();
                    kotlin.jvm.internal.f0.m(hashtag);
                    String name = hashtag.getName();
                    kotlin.jvm.internal.f0.o(name, "data.hashtag!!.name");
                    if (a1Var.c(arrayList, name)) {
                        com.max.hbutils.utils.c.f("相同话题只能添加一个");
                        return;
                    }
                }
                a.s4(this.f82814c, this.f82813b);
                this.f82814c.f82780q.add(new TopicHashtagWrapper("hashtag", null, this.f82813b.getHashtag()));
                a.y4(this.f82814c);
                com.max.hbcommon.base.adapter.t tVar = this.f82814c.f82787x;
                if (tVar == null) {
                    kotlin.jvm.internal.f0.S("mCheckedFooterAdapter");
                    tVar = null;
                }
                int size = this.f82814c.f82780q.size() - 1;
                com.max.hbcommon.base.adapter.t tVar2 = this.f82814c.f82787x;
                if (tVar2 == null) {
                    kotlin.jvm.internal.f0.S("mCheckedFooterAdapter");
                    tVar2 = null;
                }
                tVar.notifyItemInserted(size + tVar2.s());
                m7 m7Var3 = this.f82814c.f82773j;
                if (m7Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    m7Var = m7Var3;
                }
                m7Var.f113308c.setText("");
                a.x4(this.f82814c, false);
            }
        }

        h(Context context, ArrayList<TopicHashtagWrapper> arrayList) {
            super(context, arrayList, R.layout.layout_new_topic_selector_search_item);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TopicHashtagWrapper data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 29615, new Class[]{com.max.hbcommon.base.adapter.s.e.class, TopicHashtagWrapper.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            a1 a1Var = a1.f82828a;
            Context context = a.this.C;
            if (context == null) {
                kotlin.jvm.internal.f0.S("mContext");
                context = null;
            }
            View view = viewHolder.itemView;
            kotlin.jvm.internal.f0.o(view, "viewHolder.itemView");
            a1Var.i(context, data, view);
            viewHolder.itemView.setOnClickListener(new ViewOnClickListenerC0717a(data, a.this));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, TopicHashtagWrapper topicHashtagWrapper) {
            if (PatchProxy.proxy(new Object[]{eVar, topicHashtagWrapper}, this, changeQuickRedirect, false, 29616, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, topicHashtagWrapper);
        }
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public static final class i extends com.max.hbcommon.base.adapter.s<BBSTopicObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.a$i$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
        public static final class ViewOnClickListenerC0718a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f82816b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSTopicObj f82817c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f82818d;

            ViewOnClickListenerC0718a(a aVar, BBSTopicObj bBSTopicObj, boolean z10) {
                this.f82816b = aVar;
                this.f82817c = bBSTopicObj;
                this.f82818d = z10;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29620, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                a.t4(this.f82816b, this.f82817c.getTopic_id(), this.f82817c.getRecSrc());
                Context context = null;
                if (this.f82818d) {
                    a1.f82828a.m(this.f82816b.f82780q, this.f82817c);
                    a.V4(this.f82816b, false, 1, null);
                } else {
                    if (a.b4(this.f82816b) < 2) {
                        this.f82816b.f82780q.add(new TopicHashtagWrapper("topic", this.f82817c, null));
                        a.V4(this.f82816b, false, 1, null);
                        return;
                    }
                    Context context2 = this.f82816b.C;
                    if (context2 == null) {
                        kotlin.jvm.internal.f0.S("mContext");
                    } else {
                        context = context2;
                    }
                    com.max.hbutils.utils.c.f(context.getString(R.string.toast_topic_count_limit));
                }
            }
        }

        i(Context context, ArrayList<BBSTopicObj> arrayList) {
            super(context, arrayList, R.layout.layout_new_topic_selector_topic);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSTopicObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 29618, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            com.max.heybox.hblog.g.f74531b.q("ChooseTopicHashFragment, onBindViewHolder, data = " + data + " size = " + a.this.f82781r.size());
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context context = a.this.C;
            if (context == null) {
                kotlin.jvm.internal.f0.S("mContext");
                context = null;
            }
            int iF = ViewUtils.f(context, 4.0f);
            Context context2 = a.this.C;
            if (context2 == null) {
                kotlin.jvm.internal.f0.S("mContext");
                context2 = null;
            }
            int iF2 = ViewUtils.f(context2, 4.0f);
            Context context3 = a.this.C;
            if (context3 == null) {
                kotlin.jvm.internal.f0.S("mContext");
                context3 = null;
            }
            marginLayoutParams.setMargins(iF, 0, iF2, ViewUtils.f(context3, 8.0f));
            a1 a1Var = a1.f82828a;
            boolean zD = a1Var.d(a.this.f82780q, data);
            Context context4 = a.this.C;
            if (context4 == null) {
                kotlin.jvm.internal.f0.S("mContext");
                context4 = null;
            }
            View view = viewHolder.itemView;
            kotlin.jvm.internal.f0.o(view, "viewHolder.itemView");
            a1Var.j(context4, data, view, false, zD);
            viewHolder.itemView.setOnClickListener(new ViewOnClickListenerC0718a(a.this, data, zD));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 29619, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSTopicObj);
        }
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public static final class j implements DialogInterface.OnKeyListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 29621, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 != 4 || keyEvent.getAction() != 1) {
                return false;
            }
            a.this.dismiss();
            return true;
        }
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29622, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public static final class l implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f82821b = new l();
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29623, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            m7 m7Var = a.this.f82773j;
            if (m7Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                m7Var = null;
            }
            m7Var.f113308c.setText("");
        }
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public static final class n implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.d Editable s10) {
            if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 29626, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
            m7 m7Var = null;
            a.this.f82774k.removeCallbacksAndMessages(null);
            Message messageObtainMessage = a.this.f82774k.obtainMessage();
            kotlin.jvm.internal.f0.o(messageObtainMessage, "mFragmentHandler.obtainMessage()");
            messageObtainMessage.obj = com.max.xiaoheihe.utils.d.M1(s10.toString());
            a.this.f82774k.sendMessageDelayed(messageObtainMessage, 100L);
            if (s10.length() > 0) {
                m7 m7Var2 = a.this.f82773j;
                if (m7Var2 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    m7Var = m7Var2;
                }
                m7Var.f113311f.setVisibility(0);
                a.r4(a.this, s10.toString());
                return;
            }
            m7 m7Var3 = a.this.f82773j;
            if (m7Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                m7Var3 = null;
            }
            m7Var3.f113311f.setVisibility(8);
            a.this.D = null;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29624, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29625, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
        }
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29627, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a aVar = a.this;
            ChooseTopicActivityV2.b bVar = ChooseTopicActivityV2.V;
            Context context = aVar.C;
            if (context == null) {
                kotlin.jvm.internal.f0.S("mContext");
                context = null;
            }
            aVar.startActivityForResult(bVar.a(context, a.this.f82780q, a.this.f82778o), a.E.f());
        }
    }

    /* JADX INFO: compiled from: ChooseTopicHashFragment.kt */
    public static final class p extends com.max.hbcommon.network.d<Result<TopicSelectionResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f82826c;

        p(List<String> list) {
            this.f82826c = list;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29628, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (a.this.isActive()) {
                a.w4(a.this, false, true);
                super.onError(e10);
            }
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public void onNext(@dl.d Result<TopicSelectionResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29629, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (a.this.isActive() && a1.f82828a.n(a.this.f82780q, this.f82826c)) {
                com.max.hbcommon.base.adapter.s sVar = null;
                a.R4(a.this, false, false, 2, null);
                ArrayList<HashtagObj> hashtag_list = result.getResult().getHashtag_list();
                if (hashtag_list != null) {
                    a aVar = a.this;
                    if (com.max.hbcommon.utils.c.w(hashtag_list)) {
                        return;
                    }
                    aVar.f82782s.addAll(0, hashtag_list);
                    com.max.hbcommon.base.adapter.s sVar2 = aVar.f82789z;
                    if (sVar2 == null) {
                        kotlin.jvm.internal.f0.S("mHashtagAdapter");
                    } else {
                        sVar = sVar2;
                    }
                    sVar.notifyDataSetChanged();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29630, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TopicSelectionResultObj>) obj);
        }
    }

    @SuppressLint({"AutoDispose"})
    private final void A4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29571, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().P3(str, 0).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str)));
    }

    private final int B4() {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29568, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Iterator<T> it = this.f82780q.iterator();
        while (it.hasNext()) {
            if (((TopicHashtagWrapper) it.next()).getTopic() != null) {
                i10++;
            }
        }
        return i10;
    }

    private final int C4() {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29569, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Iterator<T> it = this.f82780q.iterator();
        while (it.hasNext()) {
            if (((TopicHashtagWrapper) it.next()).getHashtag() != null) {
                i10++;
            }
        }
        return i10;
    }

    private final int D4(String str) {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29559, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        for (Object obj : this.f82782s) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            if (kotlin.jvm.internal.f0.g(((HashtagObj) obj).getName(), str)) {
                return i10;
            }
            i10 = i11;
        }
        return -1;
    }

    private final void E4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29570, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzztopichash", "keywords= " + str);
        if (com.max.hbcommon.utils.c.u(str)) {
            T4(false);
        } else {
            kotlin.jvm.internal.f0.m(str);
            A4(str);
        }
    }

    private final void F4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29566, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m7 m7Var = this.f82773j;
        com.max.hbcommon.base.adapter.t tVar = null;
        if (m7Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var = null;
        }
        m7Var.f113315j.setLayoutManager(new FlexboxLayoutManager(getContext()));
        e eVar = new e(getContext(), this.f82780q);
        this.f82786w = eVar;
        this.f82787x = new com.max.hbcommon.base.adapter.t(eVar);
        LayoutInflater layoutInflater = getLayoutInflater();
        m7 m7Var2 = this.f82773j;
        if (m7Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var2 = null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_new_topic_selector_create_btn, (ViewGroup) m7Var2.f113315j, false);
        viewInflate.setBackground(com.max.hbutils.utils.q.o(getContext(), R.color.background_card_1_color, 3.0f));
        viewInflate.setOnClickListener(new f());
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context = this.C;
        if (context == null) {
            kotlin.jvm.internal.f0.S("mContext");
            context = null;
        }
        int iF = ViewUtils.f(context, 4.0f);
        Context context2 = this.C;
        if (context2 == null) {
            kotlin.jvm.internal.f0.S("mContext");
            context2 = null;
        }
        int iF2 = ViewUtils.f(context2, 4.0f);
        Context context3 = this.C;
        if (context3 == null) {
            kotlin.jvm.internal.f0.S("mContext");
            context3 = null;
        }
        marginLayoutParams.setMargins(iF, 0, iF2, ViewUtils.f(context3, 8.0f));
        com.max.hbcommon.base.adapter.t tVar2 = this.f82787x;
        if (tVar2 == null) {
            kotlin.jvm.internal.f0.S("mCheckedFooterAdapter");
            tVar2 = null;
        }
        tVar2.m(R.layout.item_new_topic_selector_create_btn, viewInflate);
        m7 m7Var3 = this.f82773j;
        if (m7Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var3 = null;
        }
        RecyclerView recyclerView = m7Var3.f113315j;
        com.max.hbcommon.base.adapter.t tVar3 = this.f82787x;
        if (tVar3 == null) {
            kotlin.jvm.internal.f0.S("mCheckedFooterAdapter");
        } else {
            tVar = tVar3;
        }
        recyclerView.setAdapter(tVar);
    }

    private final void G4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29563, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        F4();
        I4();
        H4();
    }

    private final void H4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29564, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m7 m7Var = this.f82773j;
        com.max.hbcommon.base.adapter.s<TopicHashtagWrapper> sVar = null;
        if (m7Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var = null;
        }
        m7Var.f113316k.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.f82789z = new g(getContext(), this.f82782s);
        m7 m7Var2 = this.f82773j;
        if (m7Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var2 = null;
        }
        RecyclerView recyclerView = m7Var2.f113316k;
        com.max.hbcommon.base.adapter.s<HashtagObj> sVar2 = this.f82789z;
        if (sVar2 == null) {
            kotlin.jvm.internal.f0.S("mHashtagAdapter");
            sVar2 = null;
        }
        recyclerView.setAdapter(sVar2);
        m7 m7Var3 = this.f82773j;
        if (m7Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var3 = null;
        }
        RecyclerView recyclerView2 = m7Var3.f113317l;
        Context context = this.C;
        if (context == null) {
            kotlin.jvm.internal.f0.S("mContext");
            context = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(context));
        this.A = new h(getContext(), this.f82783t);
        m7 m7Var4 = this.f82773j;
        if (m7Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var4 = null;
        }
        RecyclerView recyclerView3 = m7Var4.f113317l;
        com.max.hbcommon.base.adapter.s<TopicHashtagWrapper> sVar3 = this.A;
        if (sVar3 == null) {
            kotlin.jvm.internal.f0.S("mSearchAdapter");
        } else {
            sVar = sVar3;
        }
        recyclerView3.setAdapter(sVar);
    }

    private final void I4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29565, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m7 m7Var = this.f82773j;
        com.max.hbcommon.base.adapter.s<BBSTopicObj> sVar = null;
        if (m7Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var = null;
        }
        m7Var.f113318m.setLayoutManager(new FlexboxLayoutManager(getContext()));
        this.f82788y = new i(getContext(), this.f82781r);
        m7 m7Var2 = this.f82773j;
        if (m7Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var2 = null;
        }
        RecyclerView recyclerView = m7Var2.f113318m;
        com.max.hbcommon.base.adapter.s<BBSTopicObj> sVar2 = this.f82788y;
        if (sVar2 == null) {
            kotlin.jvm.internal.f0.S("mTopicAdapter");
        } else {
            sVar = sVar2;
        }
        recyclerView.setAdapter(sVar);
    }

    private final void J4() {
        c cVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29556, new Class[0], Void.TYPE).isSupported || (cVar = this.f82785v) == null) {
            return;
        }
        cVar.h2(this.f82780q, z4());
    }

    private final void L4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29552, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        if (str != null) {
            jsonObject.addProperty("hashtag", str);
        }
        if (str2 != null) {
            jsonObject.addProperty("rec_src", str2);
        }
        com.max.hbcommon.analytics.d.e("1", lb.d.I0, null, null, jsonObject, null, true);
    }

    private final void M4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29550, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.analytics.d.e("1", lb.d.E0, null, null, null, null, true);
    }

    private final void N4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29577, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.D)) {
            PageEventObj pageEventObj = new PageEventObj();
            pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
            pageEventObj.setPath(lb.d.L0);
            pageEventObj.setType("4");
            com.max.hbcommon.analytics.d.c(pageEventObj, true);
        }
        this.D = str;
    }

    private final void O4(TopicHashtagWrapper topicHashtagWrapper) {
        if (PatchProxy.proxy(new Object[]{topicHashtagWrapper}, this, changeQuickRedirect, false, 29578, new Class[]{TopicHashtagWrapper.class}, Void.TYPE).isSupported) {
            return;
        }
        String str = this.D;
        String name = null;
        if (kotlin.jvm.internal.f0.g(TopicHashtagWrapper.TYPE_CREATE, topicHashtagWrapper.getSearch_type()) || topicHashtagWrapper.isHashtag()) {
            HashtagObj hashtag = topicHashtagWrapper.getHashtag();
            if (hashtag != null) {
                name = hashtag.getName();
            }
        } else {
            BBSTopicObj topic = topicHashtagWrapper.getTopic();
            if (topic != null) {
                name = topic.getName();
            }
        }
        JsonObject jsonObject = new JsonObject();
        if (str != null) {
            jsonObject.addProperty("query", str);
        }
        if (name != null) {
            jsonObject.addProperty("name", name);
        }
        com.max.hbcommon.analytics.d.e("4", lb.d.M0, null, null, jsonObject, null, true);
    }

    private final void P4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29551, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        if (str != null) {
            jsonObject.addProperty("topic_id", str);
        }
        if (str2 != null) {
            jsonObject.addProperty("rec_src", str2);
        }
        com.max.hbcommon.analytics.d.e("4", lb.d.H0, null, null, jsonObject, null, true);
    }

    private final void Q4(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29573, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        m7 m7Var = null;
        if (z10) {
            m7 m7Var2 = this.f82773j;
            if (m7Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                m7Var2 = null;
            }
            m7Var2.f113310e.setVisibility(0);
            m7 m7Var3 = this.f82773j;
            if (m7Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                m7Var3 = null;
            }
            m7Var3.f113309d.setVisibility(0);
            m7 m7Var4 = this.f82773j;
            if (m7Var4 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                m7Var = m7Var4;
            }
            m7Var.f113316k.setVisibility(8);
            return;
        }
        m7 m7Var5 = this.f82773j;
        if (m7Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var5 = null;
        }
        m7Var5.f113310e.setVisibility(8);
        m7 m7Var6 = this.f82773j;
        if (m7Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var6 = null;
        }
        m7Var6.f113309d.setVisibility(8);
        if (z11) {
            return;
        }
        m7 m7Var7 = this.f82773j;
        if (m7Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            m7Var = m7Var7;
        }
        m7Var.f113316k.setVisibility(0);
    }

    static /* synthetic */ void R4(a aVar, boolean z10, boolean z11, int i10, Object obj) {
        Object[] objArr = {aVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 29574, new Class[]{a.class, cls, cls, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        aVar.Q4(z10, z11);
    }

    private final void S4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29562, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f82780q.clear();
        this.f82781r.clear();
        this.f82782s.clear();
        TopicSelectionResultObj topicSelectionResultObj = this.f82784u;
        com.max.hbcommon.base.adapter.s<HashtagObj> sVar = null;
        if (topicSelectionResultObj == null) {
            kotlin.jvm.internal.f0.S("mOriginTopicList");
            topicSelectionResultObj = null;
        }
        ArrayList<HashtagObj> hashtag_list = topicSelectionResultObj.getHashtag_list();
        if (hashtag_list != null) {
            this.f82782s.addAll(hashtag_list);
        }
        ArrayList<TopicHashtagWrapper> arrayList = this.f82777n;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                this.f82780q.add((TopicHashtagWrapper) it.next());
            }
        }
        U4(false);
        com.max.hbcommon.base.adapter.s<HashtagObj> sVar2 = this.f82789z;
        if (sVar2 == null) {
            kotlin.jvm.internal.f0.S("mHashtagAdapter");
        } else {
            sVar = sVar2;
        }
        sVar.notifyDataSetChanged();
    }

    private final void T4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29576, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        m7 m7Var = null;
        if (!z10) {
            W4();
            m7 m7Var2 = this.f82773j;
            if (m7Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                m7Var2 = null;
            }
            m7Var2.f113314i.setVisibility(0);
            m7 m7Var3 = this.f82773j;
            if (m7Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                m7Var3 = null;
            }
            m7Var3.f113321p.setVisibility(0);
            m7 m7Var4 = this.f82773j;
            if (m7Var4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                m7Var4 = null;
            }
            m7Var4.f113313h.setVisibility(0);
            m7 m7Var5 = this.f82773j;
            if (m7Var5 == null) {
                kotlin.jvm.internal.f0.S("binding");
                m7Var5 = null;
            }
            m7Var5.f113316k.setVisibility(0);
            m7 m7Var6 = this.f82773j;
            if (m7Var6 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                m7Var = m7Var6;
            }
            m7Var.f113317l.setVisibility(8);
            return;
        }
        m7 m7Var7 = this.f82773j;
        if (m7Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var7 = null;
        }
        m7Var7.f113320o.setVisibility(8);
        m7 m7Var8 = this.f82773j;
        if (m7Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var8 = null;
        }
        m7Var8.f113312g.setVisibility(8);
        m7 m7Var9 = this.f82773j;
        if (m7Var9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var9 = null;
        }
        m7Var9.f113315j.setVisibility(8);
        m7 m7Var10 = this.f82773j;
        if (m7Var10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var10 = null;
        }
        m7Var10.f113314i.setVisibility(8);
        m7 m7Var11 = this.f82773j;
        if (m7Var11 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var11 = null;
        }
        m7Var11.f113321p.setVisibility(8);
        m7 m7Var12 = this.f82773j;
        if (m7Var12 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var12 = null;
        }
        m7Var12.f113313h.setVisibility(8);
        m7 m7Var13 = this.f82773j;
        if (m7Var13 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var13 = null;
        }
        m7Var13.f113316k.setVisibility(8);
        m7 m7Var14 = this.f82773j;
        if (m7Var14 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            m7Var = m7Var14;
        }
        m7Var.f113317l.setVisibility(0);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void U4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29560, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList<String> arrayListA = a1.f82828a.a(this.f82780q);
        if (z10) {
            X4();
        }
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChooseTopicHashFragment, updateCheckedTopic, list = ");
        sb2.append(arrayListA);
        sb2.append(", mCheckedList = ");
        sb2.append(this.f82780q);
        sb2.append(", topic_list = ");
        TopicSelectionResultObj topicSelectionResultObj = this.f82784u;
        com.max.hbcommon.base.adapter.s<BBSTopicObj> sVar = null;
        if (topicSelectionResultObj == null) {
            kotlin.jvm.internal.f0.S("mOriginTopicList");
            topicSelectionResultObj = null;
        }
        sb2.append(topicSelectionResultObj.getTopic_list());
        sb2.append(", size = ");
        TopicSelectionResultObj topicSelectionResultObj2 = this.f82784u;
        if (topicSelectionResultObj2 == null) {
            kotlin.jvm.internal.f0.S("mOriginTopicList");
            topicSelectionResultObj2 = null;
        }
        ArrayList<BBSTopicObj> topic_list = topicSelectionResultObj2.getTopic_list();
        sb2.append(topic_list != null ? Integer.valueOf(topic_list.size()) : null);
        aVar.q(sb2.toString());
        this.f82781r.clear();
        TopicSelectionResultObj topicSelectionResultObj3 = this.f82784u;
        if (topicSelectionResultObj3 == null) {
            kotlin.jvm.internal.f0.S("mOriginTopicList");
            topicSelectionResultObj3 = null;
        }
        ArrayList<BBSTopicObj> topic_list2 = topicSelectionResultObj3.getTopic_list();
        if (topic_list2 != null) {
            for (BBSTopicObj bBSTopicObj : topic_list2) {
                if (bBSTopicObj.getTopic_id() == null || !arrayListA.contains(bBSTopicObj.getTopic_id())) {
                    this.f82781r.add(bBSTopicObj);
                }
            }
        }
        W4();
        com.max.hbcommon.base.adapter.t tVar = this.f82787x;
        if (tVar == null) {
            kotlin.jvm.internal.f0.S("mCheckedFooterAdapter");
            tVar = null;
        }
        tVar.notifyDataSetChanged();
        com.max.hbcommon.base.adapter.s<BBSTopicObj> sVar2 = this.f82788y;
        if (sVar2 == null) {
            kotlin.jvm.internal.f0.S("mTopicAdapter");
        } else {
            sVar = sVar2;
        }
        sVar.notifyDataSetChanged();
    }

    static /* synthetic */ void V4(a aVar, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{aVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 29561, new Class[]{a.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        aVar.U4(z10);
    }

    private final void W4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29575, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (TopicHashtagWrapper topicHashtagWrapper : this.f82780q) {
            if (!topicHashtagWrapper.isTopic()) {
                topicHashtagWrapper.isHashtag();
            }
        }
        m7 m7Var = this.f82773j;
        m7 m7Var2 = null;
        if (m7Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var = null;
        }
        ListSectionHeader listSectionHeader = m7Var.f113314i;
        Context context = this.C;
        if (context == null) {
            kotlin.jvm.internal.f0.S("mContext");
            context = null;
        }
        listSectionHeader.setDescText(context.getString(R.string.select_topic_count_limit_tip));
        m7 m7Var3 = this.f82773j;
        if (m7Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var3 = null;
        }
        ListSectionHeader listSectionHeader2 = m7Var3.f113313h;
        Context context2 = this.C;
        if (context2 == null) {
            kotlin.jvm.internal.f0.S("mContext");
            context2 = null;
        }
        listSectionHeader2.setDescText(context2.getString(R.string.select_hashtag_count_limit_tip));
        m7 m7Var4 = this.f82773j;
        if (m7Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var4 = null;
        }
        m7Var4.f113312g.setVisibility(0);
        m7 m7Var5 = this.f82773j;
        if (m7Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var5 = null;
        }
        m7Var5.f113315j.setVisibility(0);
        m7 m7Var6 = this.f82773j;
        if (m7Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            m7Var2 = m7Var6;
        }
        m7Var2.f113320o.setVisibility(8);
    }

    @SuppressLint({"AutoDispose"})
    private final void X4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29572, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f82782s.clear();
        ArrayList<TopicHashtagWrapper> arrayList = this.f82780q;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((TopicHashtagWrapper) obj).isTopic()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                R4(this, true, false, 2, null);
                com.max.heybox.hblog.g.f74531b.q("ChooseTopicHashFragment, updateTopicRelatedHashTag, mCheckedList = " + this.f82780q + ", checkedTopics = " + arrayList3);
                addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h3(CollectionsKt___CollectionsKt.h3(arrayList3, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null), this.f82775l, this.f82776m).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p(arrayList3)));
                return;
            }
            BBSTopicObj topic = ((TopicHashtagWrapper) it.next()).getTopic();
            String topic_id = topic != null ? topic.getTopic_id() : null;
            if (topic_id != null) {
                arrayList3.add(topic_id);
            }
        }
    }

    public static final /* synthetic */ int b4(a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 29583, new Class[]{a.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : aVar.B4();
    }

    public static final /* synthetic */ int c4(a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 29582, new Class[]{a.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : aVar.C4();
    }

    public static final /* synthetic */ void p4(a aVar, String str) {
        if (PatchProxy.proxy(new Object[]{aVar, str}, null, changeQuickRedirect, true, 29587, new Class[]{a.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.E4(str);
    }

    public static final /* synthetic */ void q4(a aVar, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{aVar, str, str2}, null, changeQuickRedirect, true, 29580, new Class[]{a.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.L4(str, str2);
    }

    public static final /* synthetic */ void r4(a aVar, String str) {
        if (PatchProxy.proxy(new Object[]{aVar, str}, null, changeQuickRedirect, true, 29579, new Class[]{a.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.N4(str);
    }

    public static final /* synthetic */ void s4(a aVar, TopicHashtagWrapper topicHashtagWrapper) {
        if (PatchProxy.proxy(new Object[]{aVar, topicHashtagWrapper}, null, changeQuickRedirect, true, 29584, new Class[]{a.class, TopicHashtagWrapper.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.O4(topicHashtagWrapper);
    }

    public static final /* synthetic */ void t4(a aVar, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{aVar, str, str2}, null, changeQuickRedirect, true, 29586, new Class[]{a.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.P4(str, str2);
    }

    public static final /* synthetic */ void w4(a aVar, boolean z10, boolean z11) {
        Object[] objArr = {aVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 29588, new Class[]{a.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        aVar.Q4(z10, z11);
    }

    public static final /* synthetic */ void x4(a aVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{aVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 29585, new Class[]{a.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        aVar.T4(z10);
    }

    public static final /* synthetic */ void y4(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 29581, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.W4();
    }

    private final boolean z4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29557, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ArrayList<TopicHashtagWrapper> arrayList = this.f82779p;
        if (arrayList == null) {
            return true;
        }
        return !kotlin.jvm.internal.f0.g(CollectionsKt___CollectionsKt.V5(arrayList), CollectionsKt___CollectionsKt.V5(this.f82780q));
    }

    public final boolean K4(@dl.d String hashtag) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hashtag}, this, changeQuickRedirect, false, 29567, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(hashtag, "hashtag");
        if (a1.f82828a.c(this.f82780q, hashtag)) {
            com.max.hbutils.utils.c.f("相同话题只能添加一个");
            return false;
        }
        ArrayList<TopicHashtagWrapper> arrayList = this.f82780q;
        HashtagObj hashtagObj = new HashtagObj();
        hashtagObj.setName(hashtag);
        b2 b2Var = b2.f124493a;
        com.max.hbcommon.base.adapter.t tVar = null;
        arrayList.add(new TopicHashtagWrapper("hashtag", null, hashtagObj));
        W4();
        com.max.hbcommon.base.adapter.t tVar2 = this.f82787x;
        if (tVar2 == null) {
            kotlin.jvm.internal.f0.S("mCheckedFooterAdapter");
            tVar2 = null;
        }
        int size = this.f82780q.size() - 1;
        com.max.hbcommon.base.adapter.t tVar3 = this.f82787x;
        if (tVar3 == null) {
            kotlin.jvm.internal.f0.S("mCheckedFooterAdapter");
        } else {
            tVar = tVar3;
        }
        tVar2.notifyItemInserted(size + tVar.s());
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        List<String> listE;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29558, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 != L || intent == null) {
            return;
        }
        ArrayList<TopicHashtagWrapper> arrayList = (ArrayList) intent.getSerializableExtra("choosed_topics");
        this.f82777n = arrayList;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((TopicHashtagWrapper) obj).isTopic()) {
                    arrayList2.add(obj);
                }
            }
            listE = new ArrayList<>();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                BBSTopicObj topic = ((TopicHashtagWrapper) it.next()).getTopic();
                String topic_id = topic != null ? topic.getTopic_id() : null;
                if (topic_id != null) {
                    listE.add(topic_id);
                }
            }
        } else {
            listE = null;
        }
        a1 a1Var = a1.f82828a;
        ArrayList<TopicHashtagWrapper> arrayList3 = this.f82780q;
        if (listE == null) {
            listE = CollectionsKt__CollectionsKt.E();
        }
        if (a1Var.n(arrayList3, listE)) {
            return;
        }
        this.f82780q.clear();
        ArrayList<TopicHashtagWrapper> arrayList4 = this.f82777n;
        if (arrayList4 != null) {
            Iterator<T> it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                this.f82780q.add((TopicHashtagWrapper) it2.next());
            }
        }
        V4(this, false, 1, null);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        c cVar;
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 29553, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        super.onAttach(context);
        if (getParentFragment() instanceof c) {
            cVar = (c) getParentFragment();
        } else {
            if (!(context instanceof c)) {
                throw new RuntimeException(getParentFragment() + " or " + context + " must implement PostInteractionListener");
            }
            cVar = (c) context;
        }
        this.f82785v = cVar;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 29548, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_choose_topic_hashtag, viewGroup, false);
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@dl.d DialogInterface dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 29554, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(dialog, "dialog");
        super.onDismiss(dialog);
        J4();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29555, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new j());
        }
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        ArrayList<TopicHashtagWrapper> arrayList;
        TopicHashtagWrapper topicHashtagWrapperCopy$default;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 29549, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new k());
        Context viewContext = getViewContext();
        kotlin.jvm.internal.f0.o(viewContext, "getViewContext()");
        this.C = viewContext;
        this.f82778o = requireArguments().getString(J);
        this.f82775l = requireArguments().getString(G);
        this.f82776m = requireArguments().getString(H);
        ArrayList<TopicHashtagWrapper> arrayList2 = (ArrayList) requireArguments().getSerializable(I);
        this.f82777n = arrayList2;
        m7 m7Var = null;
        if (arrayList2 != null) {
            arrayList = new ArrayList<>();
            for (TopicHashtagWrapper topicHashtagWrapper : arrayList2) {
                if (topicHashtagWrapper.isHashtag()) {
                    HashtagObj hashtagObj = new HashtagObj();
                    HashtagObj hashtag = topicHashtagWrapper.getHashtag();
                    hashtagObj.setName(hashtag != null ? hashtag.getName() : null);
                    topicHashtagWrapperCopy$default = TopicHashtagWrapper.copy$default(topicHashtagWrapper, null, null, hashtagObj, 3, null);
                } else {
                    BBSTopicObj bBSTopicObj = new BBSTopicObj();
                    BBSTopicObj topic = topicHashtagWrapper.getTopic();
                    bBSTopicObj.setTopic_id(topic != null ? topic.getTopic_id() : null);
                    topicHashtagWrapperCopy$default = TopicHashtagWrapper.copy$default(topicHashtagWrapper, null, bBSTopicObj, null, 5, null);
                }
                arrayList.add(topicHashtagWrapperCopy$default);
            }
        } else {
            arrayList = null;
        }
        this.f82779p = arrayList;
        Serializable serializable = requireArguments().getSerializable(K);
        kotlin.jvm.internal.f0.n(serializable, "null cannot be cast to non-null type com.max.xiaoheihe.bean.bbs.TopicSelectionResultObj");
        this.f82784u = (TopicSelectionResultObj) serializable;
        m7 m7VarA = m7.a(view);
        kotlin.jvm.internal.f0.o(m7VarA, "bind(view)");
        this.f82773j = m7VarA;
        if (m7VarA == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7VarA = null;
        }
        m7VarA.f113307b.setOnClickListener(l.f82821b);
        m7 m7Var2 = this.f82773j;
        if (m7Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var2 = null;
        }
        m7Var2.f113311f.setOnClickListener(new m());
        m7 m7Var3 = this.f82773j;
        if (m7Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m7Var3 = null;
        }
        m7Var3.f113308c.addTextChangedListener(new n());
        m7 m7Var4 = this.f82773j;
        if (m7Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            m7Var = m7Var4;
        }
        m7Var.f113314i.setMoreClickListener(new o());
        G4();
        S4();
        M4();
    }
}
