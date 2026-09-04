package com.max.xiaoheihe.module.bbs.post_edit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.activity.OnBackPressedDispatcher;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicCategoryObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicIndexObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.max.xiaoheihe.bean.bbs.TopicListObj;
import com.max.xiaoheihe.bean.bbs.TopicWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: ChooseTopicActivityV2.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nChooseTopicActivityV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseTopicActivityV2.kt\ncom/max/xiaoheihe/module/bbs/post_edit/ChooseTopicActivityV2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,466:1\n1855#2,2:467\n*S KotlinDebug\n*F\n+ 1 ChooseTopicActivityV2.kt\ncom/max/xiaoheihe/module/bbs/post_edit/ChooseTopicActivityV2\n*L\n352#1:467,2\n*E\n"})
@com.max.hbcommon.analytics.m(path = lb.d.D0)
@androidx.compose.runtime.internal.o(parameters = 0)
public final class ChooseTopicActivityV2 extends BaseActivity {

    @dl.d
    public static final b V = new b(null);
    public static final int W = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private df.n L;

    @dl.e
    private ArrayList<TopicHashtagWrapper> M;

    @dl.e
    private String N;
    private com.max.hbcommon.base.adapter.u<TopicWrapper> S;
    private com.max.hbcommon.base.adapter.u<TopicHashtagWrapper> T;

    @dl.d
    private final a O = new a(this);

    @dl.d
    private ArrayList<TopicWrapper> P = new ArrayList<>();

    @dl.d
    private ArrayList<TopicWrapper> Q = new ArrayList<>();

    @dl.d
    private ArrayList<TopicHashtagWrapper> R = new ArrayList<>();

    @dl.e
    private String U = "";

    /* JADX INFO: compiled from: ChooseTopicActivityV2.kt */
    public static final class a extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final WeakReference<ChooseTopicActivityV2> f82040a;

        public a(@dl.d ChooseTopicActivityV2 activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            this.f82040a = new WeakReference<>(activity);
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 29521, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(msg, "msg");
            super.handleMessage(msg);
            ChooseTopicActivityV2 chooseTopicActivityV2 = this.f82040a.get();
            if (chooseTopicActivityV2 != null) {
                Object obj = msg.obj;
                kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.String");
                ChooseTopicActivityV2.Y1(chooseTopicActivityV2, (String) obj);
            }
        }
    }

    /* JADX INFO: compiled from: ChooseTopicActivityV2.kt */
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.e Context context, @dl.e ArrayList<TopicHashtagWrapper> arrayList, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, arrayList, str}, this, changeQuickRedirect, false, 29522, new Class[]{Context.class, ArrayList.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            Intent intent = new Intent(context, (Class<?>) ChooseTopicActivityV2.class);
            intent.putExtra(NewLinkEditFragment.W4, arrayList);
            intent.putExtra("appids", str);
            return intent;
        }
    }

    /* JADX INFO: compiled from: ChooseTopicActivityV2.kt */
    @kotlin.jvm.internal.t0({"SMAP\nChooseTopicActivityV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseTopicActivityV2.kt\ncom/max/xiaoheihe/module/bbs/post_edit/ChooseTopicActivityV2$getTopicIndex$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,466:1\n1855#2:467\n1855#2,2:468\n1856#2:470\n*S KotlinDebug\n*F\n+ 1 ChooseTopicActivityV2.kt\ncom/max/xiaoheihe/module/bbs/post_edit/ChooseTopicActivityV2$getTopicIndex$1\n*L\n328#1:467\n332#1:468,2\n328#1:470\n*E\n"})
    public static final class c extends com.max.hbcommon.network.d<Result<BBSTopicIndexObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29523, new Class[0], Void.TYPE).isSupported && ChooseTopicActivityV2.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29524, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (ChooseTopicActivityV2.this.isActive()) {
                ChooseTopicActivityV2.c2(ChooseTopicActivityV2.this);
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<BBSTopicIndexObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29525, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (ChooseTopicActivityV2.this.isActive()) {
                ChooseTopicActivityV2.b2(ChooseTopicActivityV2.this);
                ArrayList<BBSTopicCategoryObj> arrayList = new ArrayList();
                if (!com.max.hbcommon.utils.c.u(result.getResult().getNotify())) {
                    com.max.hbcache.c.C("write_post_notify", result.getResult().getNotify());
                }
                if (!com.max.hbcommon.utils.c.u(result.getResult().getTitle_notify())) {
                    com.max.hbcache.c.C("write_post_title_notify", result.getResult().getTitle_notify());
                }
                if (!com.max.hbcommon.utils.c.w(result.getResult().getTopics_list())) {
                    Iterator<BBSTopicCategoryObj> it = result.getResult().getTopics_list().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                }
                ChooseTopicActivityV2.this.P.clear();
                ChooseTopicActivityV2.this.Q.clear();
                ChooseTopicActivityV2 chooseTopicActivityV2 = ChooseTopicActivityV2.this;
                for (BBSTopicCategoryObj bBSTopicCategoryObj : arrayList) {
                    chooseTopicActivityV2.Q.add(new TopicWrapper(bBSTopicCategoryObj.getName(), null));
                    List<BBSTopicObj> children = bBSTopicCategoryObj.getChildren();
                    if (children != null) {
                        kotlin.jvm.internal.f0.o(children, "children");
                        Iterator<T> it2 = children.iterator();
                        while (it2.hasNext()) {
                            TopicWrapper topicWrapper = new TopicWrapper(null, (BBSTopicObj) it2.next());
                            topicWrapper.setParent_key(bBSTopicCategoryObj.getKey());
                            chooseTopicActivityV2.Q.add(topicWrapper);
                        }
                    }
                }
                ChooseTopicActivityV2.e2(ChooseTopicActivityV2.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29526, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSTopicIndexObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ChooseTopicActivityV2.kt */
    public static final class d extends com.max.hbcommon.base.adapter.u<TopicWrapper> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ChooseTopicActivityV2.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ChooseTopicActivityV2 f82043b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ref.BooleanRef f82044c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<BBSTopicObj> f82045d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ TopicWrapper f82046e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f82047f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ d f82048g;

            a(ChooseTopicActivityV2 chooseTopicActivityV2, Ref.BooleanRef booleanRef, Ref.ObjectRef<BBSTopicObj> objectRef, TopicWrapper topicWrapper, com.max.hbcommon.base.adapter.s.e eVar, d dVar) {
                this.f82043b = chooseTopicActivityV2;
                this.f82044c = booleanRef;
                this.f82045d = objectRef;
                this.f82046e = topicWrapper;
                this.f82047f = eVar;
                this.f82048g = dVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29531, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                df.n nVar = null;
                if (com.max.hbcommon.utils.c.u(this.f82043b.U)) {
                    if (this.f82044c.f124884b) {
                        a1.f82828a.m(this.f82043b.R, this.f82045d.f124891b);
                        ChooseTopicActivityV2.e2(this.f82043b);
                        return;
                    } else {
                        if (a1.f82828a.b(this.f82043b.R) >= 2) {
                            com.max.hbutils.utils.c.f(this.f82043b.getString(R.string.toast_topic_count_limit));
                            return;
                        }
                        this.f82043b.R.add(new TopicHashtagWrapper("topic", this.f82045d.f124891b, null));
                        ChooseTopicActivityV2.e2(this.f82043b);
                        if (kotlin.jvm.internal.f0.g(this.f82046e.getParent_key(), "rec")) {
                            ChooseTopicActivityV2.a2(this.f82043b);
                            return;
                        }
                        return;
                    }
                }
                if (this.f82044c.f124884b) {
                    a1.f82828a.m(this.f82043b.R, this.f82045d.f124891b);
                    this.f82048g.notifyItemChanged(this.f82047f.getBindingAdapterPosition());
                    return;
                }
                a1 a1Var = a1.f82828a;
                if (a1Var.a(this.f82043b.R).contains(this.f82045d.f124891b.getTopic_id())) {
                    com.max.hbutils.utils.c.f("与当前选择分区不相关，无法添加");
                    return;
                }
                if (a1Var.b(this.f82043b.R) >= 2) {
                    com.max.hbutils.utils.c.f(this.f82043b.getString(R.string.toast_topic_count_limit));
                    return;
                }
                this.f82043b.R.add(new TopicHashtagWrapper("topic", this.f82045d.f124891b, null));
                df.n nVar2 = this.f82043b.L;
                if (nVar2 == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                } else {
                    nVar = nVar2;
                }
                nVar.f113561g.f112967b.setText("");
                ChooseTopicActivityV2.e2(this.f82043b);
            }
        }

        d(Activity activity, ArrayList<TopicWrapper> arrayList) {
            super(activity, arrayList);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, TopicWrapper topicWrapper) {
            Object[] objArr = {new Integer(i10), topicWrapper};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29530, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, topicWrapper);
        }

        public int n(int i10, @dl.d TopicWrapper data) {
            Object[] objArr = {new Integer(i10), data};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29528, new Class[]{cls, TopicWrapper.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            kotlin.jvm.internal.f0.p(data, "data");
            return data.getTopic() != null ? R.layout.layout_new_topic_selector_topic : R.layout.layout_group_bar_title;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v15, types: [T, com.max.xiaoheihe.bean.bbs.BBSTopicObj, java.lang.Object] */
        public void o(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TopicWrapper data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 29527, new Class[]{com.max.hbcommon.base.adapter.s.e.class, TopicWrapper.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            if (viewHolder.d() != R.layout.layout_new_topic_selector_topic) {
                ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
                kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = viewHolder.getBindingAdapterPosition() == 0 ? 0 : ViewUtils.f(((BaseActivity) ChooseTopicActivityV2.this).f66601b, 12.0f);
                marginLayoutParams.leftMargin = -ViewUtils.f(((BaseActivity) ChooseTopicActivityV2.this).f66601b, 8.0f);
                ListSectionHeader listSectionHeader = (ListSectionHeader) viewHolder.i(R.id.lsh_group_title);
                listSectionHeader.setTitleText(data.getTitle());
                listSectionHeader.setMoreButtonVisible(false);
                return;
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? topic = data.getTopic();
            kotlin.jvm.internal.f0.m(topic);
            objectRef.f124891b = topic;
            ViewGroup.LayoutParams layoutParams2 = viewHolder.itemView.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(ViewUtils.f(((BaseActivity) ChooseTopicActivityV2.this).f66601b, 4.0f), 0, ViewUtils.f(((BaseActivity) ChooseTopicActivityV2.this).f66601b, 4.0f), ViewUtils.f(((BaseActivity) ChooseTopicActivityV2.this).f66601b, 8.0f));
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            a1 a1Var = a1.f82828a;
            booleanRef.f124884b = a1Var.d(ChooseTopicActivityV2.this.R, (BBSTopicObj) objectRef.f124891b);
            Activity mContext = ((BaseActivity) ChooseTopicActivityV2.this).f66601b;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            BBSTopicObj bBSTopicObj = (BBSTopicObj) objectRef.f124891b;
            View view = viewHolder.itemView;
            kotlin.jvm.internal.f0.o(view, "viewHolder.itemView");
            a1Var.j(mContext, bBSTopicObj, view, false, booleanRef.f124884b);
            viewHolder.itemView.setOnClickListener(new a(ChooseTopicActivityV2.this, booleanRef, objectRef, data, viewHolder, this));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 29529, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (TopicWrapper) obj);
        }
    }

    /* JADX INFO: compiled from: ChooseTopicActivityV2.kt */
    public static final class e extends com.max.hbcommon.base.adapter.u<TopicHashtagWrapper> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ChooseTopicActivityV2.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ChooseTopicActivityV2 f82050b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TopicHashtagWrapper f82051c;

            a(ChooseTopicActivityV2 chooseTopicActivityV2, TopicHashtagWrapper topicHashtagWrapper) {
                this.f82050b = chooseTopicActivityV2;
                this.f82051c = topicHashtagWrapper;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29536, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (com.max.hbcommon.utils.c.u(this.f82050b.U)) {
                    this.f82050b.R.remove(this.f82051c);
                    ChooseTopicActivityV2.e2(this.f82050b);
                    return;
                }
                this.f82050b.R.remove(this.f82051c);
                com.max.hbcommon.base.adapter.u uVar = this.f82050b.S;
                com.max.hbcommon.base.adapter.u uVar2 = null;
                if (uVar == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                    uVar = null;
                }
                uVar.notifyDataSetChanged();
                com.max.hbcommon.base.adapter.u uVar3 = this.f82050b.T;
                if (uVar3 == null) {
                    kotlin.jvm.internal.f0.S("mCheckedAdapter");
                } else {
                    uVar2 = uVar3;
                }
                uVar2.notifyDataSetChanged();
                ChooseTopicActivityV2.f2(this.f82050b);
            }
        }

        e(Activity activity, ArrayList<TopicHashtagWrapper> arrayList) {
            super(activity, arrayList);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, TopicHashtagWrapper topicHashtagWrapper) {
            Object[] objArr = {new Integer(i10), topicHashtagWrapper};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29535, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, topicHashtagWrapper);
        }

        public int n(int i10, @dl.d TopicHashtagWrapper data) {
            Object[] objArr = {new Integer(i10), data};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29533, new Class[]{cls, TopicHashtagWrapper.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            kotlin.jvm.internal.f0.p(data, "data");
            return data.isHashtag() ? R.layout.layout_new_topic_selector_checked_hashtag : R.layout.layout_new_topic_selector_topic;
        }

        public void o(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TopicHashtagWrapper data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 29532, new Class[]{com.max.hbcommon.base.adapter.s.e.class, TopicHashtagWrapper.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(ViewUtils.f(((BaseActivity) ChooseTopicActivityV2.this).f66601b, 4.0f), 0, ViewUtils.f(((BaseActivity) ChooseTopicActivityV2.this).f66601b, 4.0f), ViewUtils.f(((BaseActivity) ChooseTopicActivityV2.this).f66601b, 8.0f));
            if (data.isHashtag()) {
                a1 a1Var = a1.f82828a;
                Activity mContext = ((BaseActivity) ChooseTopicActivityV2.this).f66601b;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                HashtagObj hashtag = data.getHashtag();
                kotlin.jvm.internal.f0.m(hashtag);
                View view = viewHolder.itemView;
                kotlin.jvm.internal.f0.o(view, "viewHolder.itemView");
                a1Var.g(mContext, hashtag, view);
            } else {
                a1 a1Var2 = a1.f82828a;
                Activity mContext2 = ((BaseActivity) ChooseTopicActivityV2.this).f66601b;
                kotlin.jvm.internal.f0.o(mContext2, "mContext");
                BBSTopicObj topic = data.getTopic();
                kotlin.jvm.internal.f0.m(topic);
                View view2 = viewHolder.itemView;
                kotlin.jvm.internal.f0.o(view2, "viewHolder.itemView");
                a1.k(a1Var2, mContext2, topic, view2, true, false, 16, null);
            }
            viewHolder.itemView.setOnClickListener(new a(ChooseTopicActivityV2.this, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 29534, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (TopicHashtagWrapper) obj);
        }
    }

    /* JADX INFO: compiled from: ChooseTopicActivityV2.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29537, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            df.n nVar = ChooseTopicActivityV2.this.L;
            if (nVar == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                nVar = null;
            }
            nVar.f113561g.f112967b.setText("");
        }
    }

    /* JADX INFO: compiled from: ChooseTopicActivityV2.kt */
    public static final class g implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.d Editable s10) {
            if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 29540, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
            df.n nVar = null;
            ChooseTopicActivityV2.this.O.removeCallbacksAndMessages(null);
            Message messageObtainMessage = ChooseTopicActivityV2.this.O.obtainMessage();
            kotlin.jvm.internal.f0.o(messageObtainMessage, "mActivityHandler.obtainMessage()");
            messageObtainMessage.obj = com.max.xiaoheihe.utils.d.M1(s10.toString());
            ChooseTopicActivityV2.this.O.sendMessageDelayed(messageObtainMessage, 100L);
            if (s10.length() > 0) {
                df.n nVar2 = ChooseTopicActivityV2.this.L;
                if (nVar2 == null) {
                    kotlin.jvm.internal.f0.S("mBinding");
                } else {
                    nVar = nVar2;
                }
                nVar.f113561g.f112968c.setVisibility(0);
                return;
            }
            df.n nVar3 = ChooseTopicActivityV2.this.L;
            if (nVar3 == null) {
                kotlin.jvm.internal.f0.S("mBinding");
            } else {
                nVar = nVar3;
            }
            nVar.f113561g.f112968c.setVisibility(8);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29538, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29539, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
        }
    }

    /* JADX INFO: compiled from: ChooseTopicActivityV2.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29541, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ChooseTopicActivityV2.Z1(ChooseTopicActivityV2.this);
        }
    }

    /* JADX INFO: compiled from: ChooseTopicActivityV2.kt */
    @kotlin.jvm.internal.t0({"SMAP\nChooseTopicActivityV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseTopicActivityV2.kt\ncom/max/xiaoheihe/module/bbs/post_edit/ChooseTopicActivityV2$searchTopics$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,466:1\n1855#2,2:467\n*S KotlinDebug\n*F\n+ 1 ChooseTopicActivityV2.kt\ncom/max/xiaoheihe/module/bbs/post_edit/ChooseTopicActivityV2$searchTopics$2\n*L\n424#1:467,2\n*E\n"})
    public static final class i extends com.max.hbcommon.network.d<Result<TopicListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f82055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ChooseTopicActivityV2 f82056c;

        i(String str, ChooseTopicActivityV2 chooseTopicActivityV2) {
            this.f82055b = str;
            this.f82056c = chooseTopicActivityV2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29545, new Class[0], Void.TYPE).isSupported && kotlin.jvm.internal.f0.g(this.f82055b, this.f82056c.U) && this.f82056c.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29544, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (kotlin.jvm.internal.f0.g(this.f82055b, this.f82056c.U) && this.f82056c.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<TopicListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29546, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (kotlin.jvm.internal.f0.g(this.f82055b, this.f82056c.U) && this.f82056c.isActive() && result.getResult() != null) {
                this.f82056c.P.clear();
                com.max.hbcommon.base.adapter.u uVar = null;
                this.f82056c.P.add(new TopicWrapper("搜索结果", null));
                TopicListObj result2 = result.getResult();
                kotlin.jvm.internal.f0.m(result2);
                List<BBSTopicObj> topics = result2.getTopics();
                if (topics != null) {
                    ChooseTopicActivityV2 chooseTopicActivityV2 = this.f82056c;
                    Iterator<T> it = topics.iterator();
                    while (it.hasNext()) {
                        chooseTopicActivityV2.P.add(new TopicWrapper(null, (BBSTopicObj) it.next()));
                    }
                }
                com.max.hbcommon.base.adapter.u uVar2 = this.f82056c.T;
                if (uVar2 == null) {
                    kotlin.jvm.internal.f0.S("mCheckedAdapter");
                    uVar2 = null;
                }
                uVar2.notifyDataSetChanged();
                com.max.hbcommon.base.adapter.u uVar3 = this.f82056c.S;
                if (uVar3 == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                } else {
                    uVar = uVar3;
                }
                uVar.notifyDataSetChanged();
                ChooseTopicActivityV2.f2(this.f82056c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29547, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TopicListObj>) obj);
        }
    }

    public static final /* synthetic */ void Y1(ChooseTopicActivityV2 chooseTopicActivityV2, String str) {
        if (PatchProxy.proxy(new Object[]{chooseTopicActivityV2, str}, null, changeQuickRedirect, true, 29520, new Class[]{ChooseTopicActivityV2.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        chooseTopicActivityV2.j2(str);
    }

    public static final /* synthetic */ void Z1(ChooseTopicActivityV2 chooseTopicActivityV2) {
        if (PatchProxy.proxy(new Object[]{chooseTopicActivityV2}, null, changeQuickRedirect, true, 29514, new Class[]{ChooseTopicActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        chooseTopicActivityV2.l2();
    }

    public static final /* synthetic */ void a2(ChooseTopicActivityV2 chooseTopicActivityV2) {
        if (PatchProxy.proxy(new Object[]{chooseTopicActivityV2}, null, changeQuickRedirect, true, 29516, new Class[]{ChooseTopicActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        chooseTopicActivityV2.m2();
    }

    public static final /* synthetic */ void b2(ChooseTopicActivityV2 chooseTopicActivityV2) {
        if (PatchProxy.proxy(new Object[]{chooseTopicActivityV2}, null, changeQuickRedirect, true, 29519, new Class[]{ChooseTopicActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        chooseTopicActivityV2.x1();
    }

    public static final /* synthetic */ void c2(ChooseTopicActivityV2 chooseTopicActivityV2) {
        if (PatchProxy.proxy(new Object[]{chooseTopicActivityV2}, null, changeQuickRedirect, true, 29518, new Class[]{ChooseTopicActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        chooseTopicActivityV2.C1();
    }

    public static final /* synthetic */ void e2(ChooseTopicActivityV2 chooseTopicActivityV2) {
        if (PatchProxy.proxy(new Object[]{chooseTopicActivityV2}, null, changeQuickRedirect, true, 29515, new Class[]{ChooseTopicActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        chooseTopicActivityV2.o2();
    }

    public static final /* synthetic */ void f2(ChooseTopicActivityV2 chooseTopicActivityV2) {
        if (PatchProxy.proxy(new Object[]{chooseTopicActivityV2}, null, changeQuickRedirect, true, 29517, new Class[]{ChooseTopicActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        chooseTopicActivityV2.p2();
    }

    private final void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29507, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<String> arrayListA = a1.f82828a.a(this.R);
        this.P.clear();
        for (TopicWrapper topicWrapper : this.Q) {
            BBSTopicObj topic = topicWrapper.getTopic();
            if ((topic != null ? topic.getTopic_id() : null) != null) {
                BBSTopicObj topic2 = topicWrapper.getTopic();
                kotlin.jvm.internal.f0.m(topic2);
                if (!arrayListA.contains(topic2.getTopic_id())) {
                }
            }
            this.P.add(topicWrapper);
        }
    }

    private final void i2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29506, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().d5("list", null, "1", MainActivity.E4 ? "1" : null, this.N).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void j2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29512, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.U = str;
        if (com.max.hbcommon.utils.c.u(str)) {
            o2();
            return;
        }
        String str2 = this.U;
        kotlin.jvm.internal.f0.m(str2);
        n2(str2);
    }

    private final void k2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29504, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.S = new d(this.f66601b, this.P);
        this.T = new e(this.f66601b, this.R);
        df.n nVar = this.L;
        com.max.hbcommon.base.adapter.u<TopicWrapper> uVar = null;
        if (nVar == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            nVar = null;
        }
        nVar.f113559e.setLayoutManager(new FlexboxLayoutManager(this.f66601b));
        df.n nVar2 = this.L;
        if (nVar2 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            nVar2 = null;
        }
        nVar2.f113558d.setLayoutManager(new FlexboxLayoutManager(this.f66601b));
        df.n nVar3 = this.L;
        if (nVar3 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            nVar3 = null;
        }
        RecyclerView recyclerView = nVar3.f113558d;
        com.max.hbcommon.base.adapter.u<TopicHashtagWrapper> uVar2 = this.T;
        if (uVar2 == null) {
            kotlin.jvm.internal.f0.S("mCheckedAdapter");
            uVar2 = null;
        }
        recyclerView.setAdapter(uVar2);
        df.n nVar4 = this.L;
        if (nVar4 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            nVar4 = null;
        }
        RecyclerView recyclerView2 = nVar4.f113559e;
        com.max.hbcommon.base.adapter.u<TopicWrapper> uVar3 = this.S;
        if (uVar3 == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
        } else {
            uVar = uVar3;
        }
        recyclerView2.setAdapter(uVar);
    }

    private final void l2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29509, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("choosed_topics", this.R);
        setResult(-1, intent);
        finish();
    }

    private final void m2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29513, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        pageEventObj.setPath(lb.d.J0);
        pageEventObj.setType("4");
        com.max.hbcommon.analytics.d.c(pageEventObj, true);
    }

    private final void n2(String str) {
        String topic_id;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29510, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<TopicHashtagWrapper> arrayList2 = this.M;
        kotlin.jvm.internal.f0.m(arrayList2);
        Iterator<TopicHashtagWrapper> it = arrayList2.iterator();
        while (it.hasNext()) {
            BBSTopicObj topic = it.next().getTopic();
            if (topic != null && (topic_id = topic.getTopic_id()) != null) {
                arrayList.add(topic_id);
            }
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().T4(str, TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, arrayList), null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i(str, this)));
    }

    private final void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29508, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        h2();
        com.max.hbcommon.base.adapter.u<TopicHashtagWrapper> uVar = this.T;
        com.max.hbcommon.base.adapter.u<TopicWrapper> uVar2 = null;
        if (uVar == null) {
            kotlin.jvm.internal.f0.S("mCheckedAdapter");
            uVar = null;
        }
        uVar.notifyDataSetChanged();
        com.max.hbcommon.base.adapter.u<TopicWrapper> uVar3 = this.S;
        if (uVar3 == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
        } else {
            uVar2 = uVar3;
        }
        uVar2.notifyDataSetChanged();
        p2();
    }

    private final void p2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29511, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        df.n nVar = null;
        if (com.max.hbcommon.utils.c.w(this.R)) {
            df.n nVar2 = this.L;
            if (nVar2 == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                nVar2 = null;
            }
            nVar2.f113558d.setVisibility(8);
            df.n nVar3 = this.L;
            if (nVar3 == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                nVar3 = null;
            }
            nVar3.f113557c.setVisibility(8);
            df.n nVar4 = this.L;
            if (nVar4 == null) {
                kotlin.jvm.internal.f0.S("mBinding");
            } else {
                nVar = nVar4;
            }
            nVar.f113560f.getRoot().setVisibility(8);
            return;
        }
        df.n nVar5 = this.L;
        if (nVar5 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            nVar5 = null;
        }
        nVar5.f113558d.setVisibility(0);
        df.n nVar6 = this.L;
        if (nVar6 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            nVar6 = null;
        }
        nVar6.f113557c.setVisibility(0);
        df.n nVar7 = this.L;
        if (nVar7 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
        } else {
            nVar = nVar7;
        }
        nVar.f113560f.getRoot().setVisibility(0);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29503, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        df.n nVarC = df.n.c(this.f66602c);
        kotlin.jvm.internal.f0.o(nVarC, "inflate(mInflater)");
        this.L = nVarC;
        df.n nVar = null;
        if (nVarC == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            nVarC = null;
        }
        setContentView(nVarC.b());
        if (getIntent() != null) {
            Intent intent = getIntent();
            this.M = (ArrayList) intent.getSerializableExtra(NewLinkEditFragment.W4);
            this.N = intent.getStringExtra("appids");
        }
        this.f66616q.setTitle("分区");
        k2();
        df.n nVar2 = this.L;
        if (nVar2 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            nVar2 = null;
        }
        EditText editText = nVar2.f113561g.f112967b;
        editText.setHint("搜索分区");
        editText.setHintTextColor(this.f66601b.getColor(R.color.text_secondary_2_color));
        editText.setTextSize(14.0f);
        df.n nVar3 = this.L;
        if (nVar3 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            nVar3 = null;
        }
        nVar3.f113561g.f112968c.setOnClickListener(new f());
        df.n nVar4 = this.L;
        if (nVar4 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            nVar4 = null;
        }
        nVar4.f113561g.f112967b.addTextChangedListener(new g());
        df.n nVar5 = this.L;
        if (nVar5 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
        } else {
            nVar = nVar5;
        }
        nVar.f113556b.setRightClickListener(new h());
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        kotlin.jvm.internal.f0.o(onBackPressedDispatcher, "onBackPressedDispatcher");
        androidx.activity.q.b(onBackPressedDispatcher, null, false, new yh.l<androidx.activity.o, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.ChooseTopicActivityV2$installViews$5
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d androidx.activity.o addCallback) {
                if (PatchProxy.proxy(new Object[]{addCallback}, this, changeQuickRedirect, false, 29542, new Class[]{androidx.activity.o.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(addCallback, "$this$addCallback");
                ChooseTopicActivityV2.Z1(this.f82057b);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.activity.o oVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oVar}, this, changeQuickRedirect, false, 29543, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(oVar);
                return b2.f124493a;
            }
        }, 3, null);
        this.R.clear();
        ArrayList<TopicHashtagWrapper> arrayList = this.M;
        if (arrayList != null) {
            this.R.addAll(arrayList);
        }
        E1();
        i2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29505, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i2();
    }
}
