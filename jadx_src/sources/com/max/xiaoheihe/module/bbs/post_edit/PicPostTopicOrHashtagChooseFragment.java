package com.max.xiaoheihe.module.bbs.post_edit;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicCategoryObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicIndexObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.HashtagNumObj;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.max.xiaoheihe.bean.bbs.TopicListObj;
import com.max.xiaoheihe.bean.bbs.TopicSelectionResultObj;
import com.max.xiaoheihe.bean.bbs.TopicSelectionSearchResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.Cdo;
import df.n7;
import df.pz;
import df.rb0;
import df.z60;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nPicPostTopicOrHashtagChooseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PicPostTopicOrHashtagChooseFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PicPostTopicOrHashtagChooseFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,689:1\n262#2,2:690\n262#2,2:692\n262#2,2:694\n262#2,2:696\n262#2,2:698\n262#2,2:700\n262#2,2:702\n262#2,2:704\n262#2,2:706\n262#2,2:708\n262#2,2:710\n262#2,2:712\n262#2,2:714\n262#2,2:716\n262#2,2:718\n262#2,2:720\n262#2,2:722\n262#2,2:724\n262#2,2:726\n262#2,2:728\n262#2,2:730\n262#2,2:733\n262#2,2:735\n262#2,2:737\n1#3:732\n*S KotlinDebug\n*F\n+ 1 PicPostTopicOrHashtagChooseFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PicPostTopicOrHashtagChooseFragment\n*L\n170#1:690,2\n171#1:692,2\n172#1:694,2\n173#1:696,2\n174#1:698,2\n176#1:700,2\n180#1:702,2\n181#1:704,2\n183#1:706,2\n184#1:708,2\n192#1:710,2\n193#1:712,2\n194#1:714,2\n195#1:716,2\n196#1:718,2\n198#1:720,2\n202#1:722,2\n203#1:724,2\n205#1:726,2\n206#1:728,2\n281#1:730,2\n390#1:733,2\n396#1:735,2\n421#1:737,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class PicPostTopicOrHashtagChooseFragment extends com.max.hbcommon.base.swipeback.a {

    @dl.d
    private static final String A = "TopicOrHashtagChooseFragment-dbg";

    @dl.d
    private static final String B = "is_choose_topic";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    public static final a f82271y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f82272z = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f82273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private String f82274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f82275l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private PictureVideoEditPostFragmentViewModel f82276m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private n7 f82277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private rb0 f82278o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.base.adapter.s<BBSTopicObj> f82279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private c f82280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.base.adapter.s<BBSTopicObj> f82281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private z60 f82282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.base.adapter.s<HashtagObj> f82283t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.base.adapter.s<HashtagObj> f82284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private yh.a<b2> f82285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private d2 f82286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f82287x;

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final PicPostTopicOrHashtagChooseFragment a(boolean z10, @dl.d yh.a<b2> onDismiss) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), onDismiss}, this, changeQuickRedirect, false, 30063, new Class[]{Boolean.TYPE, yh.a.class}, PicPostTopicOrHashtagChooseFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (PicPostTopicOrHashtagChooseFragment) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(onDismiss, "onDismiss");
            PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment = new PicPostTopicOrHashtagChooseFragment();
            picPostTopicOrHashtagChooseFragment.setArguments(androidx.core.os.e.b(c1.a(PicPostTopicOrHashtagChooseFragment.B, Boolean.valueOf(z10))));
            picPostTopicOrHashtagChooseFragment.f82285v = onDismiss;
            return picPostTopicOrHashtagChooseFragment;
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class b extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f82288d = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final RecyclerView f82289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final com.max.hbcommon.base.adapter.s<BBSTopicObj> f82290c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d RecyclerView topicListRV, @dl.d com.max.hbcommon.base.adapter.s<BBSTopicObj> adapter) {
            super(topicListRV);
            kotlin.jvm.internal.f0.p(topicListRV, "topicListRV");
            kotlin.jvm.internal.f0.p(adapter, "adapter");
            this.f82289b = topicListRV;
            this.f82290c = adapter;
        }

        @dl.d
        public final com.max.hbcommon.base.adapter.s<BBSTopicObj> a() {
            return this.f82290c;
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    public final class c extends RecyclerView.Adapter<b> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Context f82291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private List<? extends BBSTopicCategoryObj> f82292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PicPostTopicOrHashtagChooseFragment f82293d;

        /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
        public static final class a extends com.max.hbcommon.base.adapter.s<BBSTopicObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PicPostTopicOrHashtagChooseFragment f82294b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, Context context, ArrayList<BBSTopicObj> arrayList) {
                super(context, arrayList, R.layout.item_topic_choose_new_entry);
                this.f82294b = picPostTopicOrHashtagChooseFragment;
            }

            public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e BBSTopicObj bBSTopicObj) {
                if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 30070, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                PicPostTopicOrHashtagChooseFragment.z4(this.f82294b, eVar, bBSTopicObj, false, 4, null);
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
                if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 30071, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, bBSTopicObj);
            }
        }

        public c(@dl.d PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, @dl.d Context context, List<? extends BBSTopicCategoryObj> sectionDataList) {
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(sectionDataList, "sectionDataList");
            this.f82293d = picPostTopicOrHashtagChooseFragment;
            this.f82291b = context;
            this.f82292c = sectionDataList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30066, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f82292c.size();
        }

        @dl.d
        public final List<BBSTopicCategoryObj> m() {
            return this.f82292c;
        }

        public void n(@dl.d b holder, int i10) {
            List<BBSTopicObj> children;
            if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, 30067, new Class[]{b.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(holder, "holder");
            BBSTopicCategoryObj bBSTopicCategoryObj = (BBSTopicCategoryObj) CollectionsKt___CollectionsKt.R2(this.f82292c, i10);
            if (bBSTopicCategoryObj == null || (children = bBSTopicCategoryObj.getChildren()) == null) {
                return;
            }
            com.max.hbcommon.base.adapter.d.b(holder.a(), children, com.max.xiaoheihe.module.bbs.adapter.b.f80312a);
        }

        @dl.d
        public b o(@dl.d ViewGroup parent, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 30065, new Class[]{ViewGroup.class, Integer.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(parent, "parent");
            a aVar = new a(this.f82293d, this.f82291b, new ArrayList());
            RecyclerView recyclerView = new RecyclerView(this.f82291b);
            PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment = this.f82293d;
            recyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(aVar);
            recyclerView.setOverScrollMode(2);
            Context viewContext = picPostTopicOrHashtagChooseFragment.getViewContext();
            kotlin.jvm.internal.f0.o(viewContext, "viewContext");
            com.max.xiaoheihe.module.bbs.post_edit.l.a(recyclerView, viewContext, 10);
            return new b(recyclerView, aVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 30069, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            n((b) viewHolder, i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 30068, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
            return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : o(viewGroup, i10);
        }

        public final void p(@dl.d List<? extends BBSTopicCategoryObj> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 30064, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(list, "<set-?>");
            this.f82292c = list;
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPicPostTopicOrHashtagChooseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PicPostTopicOrHashtagChooseFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PicPostTopicOrHashtagChooseFragment$bindHashtagVH$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,689:1\n1#2:690\n*E\n"})
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HashtagObj f82296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f82297d;

        d(HashtagObj hashtagObj, boolean z10) {
            this.f82296c = hashtagObj;
            this.f82297d = z10;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LiveData<List<String>> liveDataR;
            List<String> listF;
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30072, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel = PicPostTopicOrHashtagChooseFragment.this.f82276m;
            if (pictureVideoEditPostFragmentViewModel != null && (liveDataR = pictureVideoEditPostFragmentViewModel.r()) != null && (listF = liveDataR.f()) != null) {
                if (!(listF.size() >= 5)) {
                    listF = null;
                }
                if (listF != null) {
                    com.max.hbutils.utils.c.f("最多选择5个推荐话题");
                    return;
                }
            }
            String name = this.f82296c.getName();
            if (name != null) {
                PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel2 = PicPostTopicOrHashtagChooseFragment.this.f82276m;
                if (pictureVideoEditPostFragmentViewModel2 != null && !pictureVideoEditPostFragmentViewModel2.C(name)) {
                    z10 = true;
                }
                String str = z10 ? name : null;
                if (str != null) {
                    PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment = PicPostTopicOrHashtagChooseFragment.this;
                    HashtagObj hashtagObj = this.f82296c;
                    boolean z11 = this.f82297d;
                    PicPostTopicOrHashtagChooseFragment.n4(picPostTopicOrHashtagChooseFragment, str, hashtagObj.getRecSrc());
                    if (z11) {
                        PicPostTopicOrHashtagChooseFragment.p4(picPostTopicOrHashtagChooseFragment, picPostTopicOrHashtagChooseFragment.f82274k, str);
                    }
                    com.max.xiaoheihe.module.bbs.post_edit.m.a aVar = new com.max.xiaoheihe.module.bbs.post_edit.m.a(str, true);
                    PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel3 = picPostTopicOrHashtagChooseFragment.f82276m;
                    if (pictureVideoEditPostFragmentViewModel3 != null) {
                        pictureVideoEditPostFragmentViewModel3.M(aVar);
                    }
                }
            }
            PicPostTopicOrHashtagChooseFragment.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.PicPostTopicOrHashtagChooseFragment$dismiss$2, reason: invalid class name */
    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.PicPostTopicOrHashtagChooseFragment$dismiss$2", f = "PicPostTopicOrHashtagChooseFragment.kt", i = {}, l = {bb.c.b.B8}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f82298b;

        AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30075, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : PicPostTopicOrHashtagChooseFragment.this.new AnonymousClass2(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30077, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30076, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30074, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f82298b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                this.f82298b = 1;
                if (DelayKt.b(60L, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            PicPostTopicOrHashtagChooseFragment.X3(PicPostTopicOrHashtagChooseFragment.this);
            return b2.f124493a;
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPicPostTopicOrHashtagChooseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PicPostTopicOrHashtagChooseFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PicPostTopicOrHashtagChooseFragment$bindTopicVH$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,689:1\n1#2:690\n*E\n"})
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f82301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f82302d;

        e(BBSTopicObj bBSTopicObj, boolean z10) {
            this.f82301c = bBSTopicObj;
            this.f82302d = z10;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LiveData<List<BBSTopicObj>> liveDataS;
            List<BBSTopicObj> listF;
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30073, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel = PicPostTopicOrHashtagChooseFragment.this.f82276m;
            if (pictureVideoEditPostFragmentViewModel != null && (liveDataS = pictureVideoEditPostFragmentViewModel.s()) != null && (listF = liveDataS.f()) != null) {
                if (!(listF.size() >= 2)) {
                    listF = null;
                }
                if (listF != null) {
                    com.max.hbutils.utils.c.f("最多选择2个必选分区");
                    return;
                }
            }
            PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel2 = PicPostTopicOrHashtagChooseFragment.this.f82276m;
            if (pictureVideoEditPostFragmentViewModel2 != null && !pictureVideoEditPostFragmentViewModel2.E(this.f82301c)) {
                z10 = true;
            }
            if (z10) {
                PicPostTopicOrHashtagChooseFragment.q4(PicPostTopicOrHashtagChooseFragment.this, this.f82301c.getTopic_id(), this.f82301c.getRecSrc());
                if (this.f82302d) {
                    PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment = PicPostTopicOrHashtagChooseFragment.this;
                    PicPostTopicOrHashtagChooseFragment.p4(picPostTopicOrHashtagChooseFragment, picPostTopicOrHashtagChooseFragment.f82273j, this.f82301c.getName());
                }
                com.max.xiaoheihe.module.bbs.post_edit.m.f fVar = new com.max.xiaoheihe.module.bbs.post_edit.m.f(this.f82301c, true);
                PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel3 = PicPostTopicOrHashtagChooseFragment.this.f82276m;
                if (pictureVideoEditPostFragmentViewModel3 != null) {
                    pictureVideoEditPostFragmentViewModel3.M(fVar);
                }
            }
            PicPostTopicOrHashtagChooseFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPicPostTopicOrHashtagChooseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PicPostTopicOrHashtagChooseFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PicPostTopicOrHashtagChooseFragment$initHashtagChooseLiveDataObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,689:1\n766#2:690\n857#2,2:691\n*S KotlinDebug\n*F\n+ 1 PicPostTopicOrHashtagChooseFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PicPostTopicOrHashtagChooseFragment$initHashtagChooseLiveDataObserver$1\n*L\n478#1:690\n478#1:691,2\n*E\n"})
    public static final class f implements androidx.lifecycle.j0<Result<TopicSelectionResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PictureVideoEditPostFragmentViewModel f82303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PicPostTopicOrHashtagChooseFragment f82304b;

        f(PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel, PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment) {
            this.f82303a = pictureVideoEditPostFragmentViewModel;
            this.f82304b = picPostTopicOrHashtagChooseFragment;
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Result<TopicSelectionResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30079, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(result);
        }

        public final void b(Result<TopicSelectionResultObj> result) {
            TopicSelectionResultObj result2;
            ArrayList<HashtagObj> hashtag_list;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30078, new Class[]{Result.class}, Void.TYPE).isSupported || (result2 = result.getResult()) == null || (hashtag_list = result2.getHashtag_list()) == null) {
                return;
            }
            PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel = this.f82303a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : hashtag_list) {
                if (!pictureVideoEditPostFragmentViewModel.B((HashtagObj) obj)) {
                    arrayList.add(obj);
                }
            }
            com.max.hbcommon.base.adapter.s sVar = this.f82304b.f82283t;
            if (sVar != null) {
                com.max.hbcommon.base.adapter.d.b(sVar, arrayList, com.max.xiaoheihe.module.bbs.adapter.i.f80520a);
            }
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPicPostTopicOrHashtagChooseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PicPostTopicOrHashtagChooseFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PicPostTopicOrHashtagChooseFragment$initHashtagChooseLiveDataObserver$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,689:1\n1603#2,9:690\n1855#2:699\n1856#2:701\n1612#2:702\n766#2:703\n857#2,2:704\n1#3:700\n1#3:708\n262#4,2:706\n262#4,2:709\n*S KotlinDebug\n*F\n+ 1 PicPostTopicOrHashtagChooseFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PicPostTopicOrHashtagChooseFragment$initHashtagChooseLiveDataObserver$2\n*L\n492#1:690,9\n492#1:699\n492#1:701\n492#1:702\n494#1:703\n494#1:704,2\n492#1:700\n501#1:706,2\n504#1:709,2\n*E\n"})
    public static final class g implements androidx.lifecycle.j0<Pair<? extends Result<TopicSelectionSearchResultObj>, ? extends String>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PictureVideoEditPostFragmentViewModel f82306b;

        g(PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel) {
            this.f82306b = pictureVideoEditPostFragmentViewModel;
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Pair<? extends Result<TopicSelectionSearchResultObj>, ? extends String> pair) {
            if (PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, 30081, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(pair);
        }

        public final void b(Pair<? extends Result<TopicSelectionSearchResultObj>, String> pair) {
            ArrayList<TopicHashtagWrapper> search_result;
            Object next;
            RecyclerView recyclerView;
            EditText editText;
            Editable text;
            if (PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, 30080, new Class[]{Pair.class}, Void.TYPE).isSupported) {
                return;
            }
            Result<TopicSelectionSearchResultObj> resultA = pair.a();
            String strB = pair.b();
            n7 n7Var = PicPostTopicOrHashtagChooseFragment.this.f82277n;
            if (kotlin.jvm.internal.f0.g(strB, (n7Var == null || (editText = n7Var.f113716c) == null || (text = editText.getText()) == null) ? null : text.toString())) {
                PicPostTopicOrHashtagChooseFragment.this.f82274k = strB;
                boolean zC = this.f82306b.C(strB);
                TopicSelectionSearchResultObj result = resultA.getResult();
                if (result == null || (search_result = result.getSearch_result()) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (TopicHashtagWrapper topicHashtagWrapper : search_result) {
                    HashtagObj hashtag = topicHashtagWrapper != null ? topicHashtagWrapper.getHashtag() : null;
                    if (hashtag != null) {
                        arrayList.add(hashtag);
                    }
                }
                PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel = this.f82306b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!pictureVideoEditPostFragmentViewModel.B((HashtagObj) obj)) {
                        arrayList2.add(obj);
                    }
                }
                PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment = PicPostTopicOrHashtagChooseFragment.this;
                com.max.hbcommon.base.adapter.s sVar = picPostTopicOrHashtagChooseFragment.f82284u;
                if (sVar != null) {
                    com.max.hbcommon.base.adapter.d.b(sVar, arrayList2, com.max.xiaoheihe.module.bbs.adapter.i.f80520a);
                }
                z60 z60Var = picPostTopicOrHashtagChooseFragment.f82282s;
                if (z60Var != null && (recyclerView = z60Var.f118231d) != null) {
                    recyclerView.smoothScrollToPosition(0);
                }
                if (zC) {
                    z60 z60Var2 = picPostTopicOrHashtagChooseFragment.f82282s;
                    FrameLayout flSearchCreateHashtag = z60Var2 != null ? z60Var2.f118229b : null;
                    if (flSearchCreateHashtag == null) {
                        return;
                    }
                    kotlin.jvm.internal.f0.o(flSearchCreateHashtag, "flSearchCreateHashtag");
                    flSearchCreateHashtag.setVisibility(8);
                    return;
                }
                Iterator it = arrayList2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.f0.g(((HashtagObj) next).getName(), strB));
                if (((HashtagObj) next) == null) {
                    z60 z60Var3 = picPostTopicOrHashtagChooseFragment.f82282s;
                    FrameLayout flSearchCreateHashtag2 = z60Var3 != null ? z60Var3.f118229b : null;
                    if (flSearchCreateHashtag2 != null) {
                        kotlin.jvm.internal.f0.o(flSearchCreateHashtag2, "flSearchCreateHashtag");
                        flSearchCreateHashtag2.setVisibility(0);
                    }
                    z60 z60Var4 = picPostTopicOrHashtagChooseFragment.f82282s;
                    TextView textView = z60Var4 != null ? z60Var4.f118233f : null;
                    if (textView != null) {
                        textView.setText(strB);
                    }
                    b2 b2Var = b2.f124493a;
                }
            }
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    public static final class h extends com.max.hbcommon.base.adapter.s<HashtagObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f82307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PicPostTopicOrHashtagChooseFragment f82308c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, ArrayList<HashtagObj> arrayList) {
            super(context, arrayList, R.layout.item_hashtag_choose_new_entry);
            this.f82307b = context;
            this.f82308c = picPostTopicOrHashtagChooseFragment;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e HashtagObj hashtagObj) {
            if (PatchProxy.proxy(new Object[]{eVar, hashtagObj}, this, changeQuickRedirect, false, 30082, new Class[]{com.max.hbcommon.base.adapter.s.e.class, HashtagObj.class}, Void.TYPE).isSupported) {
                return;
            }
            PicPostTopicOrHashtagChooseFragment.x4(this.f82308c, eVar, hashtagObj, this.f82307b, false, 8, null);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, HashtagObj hashtagObj) {
            if (PatchProxy.proxy(new Object[]{eVar, hashtagObj}, this, changeQuickRedirect, false, 30083, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, hashtagObj);
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPicPostTopicOrHashtagChooseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PicPostTopicOrHashtagChooseFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PicPostTopicOrHashtagChooseFragment$initHashtagChooseView$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,689:1\n1#2:690\n*E\n"})
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TextView textView;
            CharSequence text;
            String string;
            LiveData<List<String>> liveDataR;
            List<String> listF;
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30084, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel = PicPostTopicOrHashtagChooseFragment.this.f82276m;
            if (pictureVideoEditPostFragmentViewModel != null && (liveDataR = pictureVideoEditPostFragmentViewModel.r()) != null && (listF = liveDataR.f()) != null) {
                if (!(listF.size() >= 5)) {
                    listF = null;
                }
                if (listF != null) {
                    com.max.hbutils.utils.c.f("最多选择5个推荐话题");
                    return;
                }
            }
            z60 z60Var = PicPostTopicOrHashtagChooseFragment.this.f82282s;
            if (z60Var != null && (textView = z60Var.f118233f) != null && (text = textView.getText()) != null && (string = text.toString()) != null) {
                PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel2 = PicPostTopicOrHashtagChooseFragment.this.f82276m;
                if (pictureVideoEditPostFragmentViewModel2 != null && !pictureVideoEditPostFragmentViewModel2.C(string)) {
                    z10 = true;
                }
                if (!z10) {
                    string = null;
                }
                if (string != null) {
                    PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment = PicPostTopicOrHashtagChooseFragment.this;
                    PicPostTopicOrHashtagChooseFragment.n4(picPostTopicOrHashtagChooseFragment, string, null);
                    PicPostTopicOrHashtagChooseFragment.p4(picPostTopicOrHashtagChooseFragment, string, string);
                    com.max.xiaoheihe.module.bbs.post_edit.m.a aVar = new com.max.xiaoheihe.module.bbs.post_edit.m.a(string, true);
                    PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel3 = picPostTopicOrHashtagChooseFragment.f82276m;
                    if (pictureVideoEditPostFragmentViewModel3 != null) {
                        pictureVideoEditPostFragmentViewModel3.M(aVar);
                    }
                }
            }
            PicPostTopicOrHashtagChooseFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    public static final class j extends com.max.hbcommon.base.adapter.s<HashtagObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f82317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PicPostTopicOrHashtagChooseFragment f82318c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Context context, PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, ArrayList<HashtagObj> arrayList) {
            super(context, arrayList, R.layout.item_hashtag_choose_new_entry);
            this.f82317b = context;
            this.f82318c = picPostTopicOrHashtagChooseFragment;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e HashtagObj hashtagObj) {
            if (PatchProxy.proxy(new Object[]{eVar, hashtagObj}, this, changeQuickRedirect, false, 30085, new Class[]{com.max.hbcommon.base.adapter.s.e.class, HashtagObj.class}, Void.TYPE).isSupported) {
                return;
            }
            PicPostTopicOrHashtagChooseFragment.V3(this.f82318c, eVar, hashtagObj, this.f82317b, true);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, HashtagObj hashtagObj) {
            if (PatchProxy.proxy(new Object[]{eVar, hashtagObj}, this, changeQuickRedirect, false, 30086, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, hashtagObj);
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            n7 n7Var;
            EditText editText;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30087, new Class[]{View.class}, Void.TYPE).isSupported || (n7Var = PicPostTopicOrHashtagChooseFragment.this.f82277n) == null || (editText = n7Var.f113716c) == null) {
                return;
            }
            editText.setText("");
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPicPostTopicOrHashtagChooseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PicPostTopicOrHashtagChooseFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PicPostTopicOrHashtagChooseFragment$initTopicChooseLiveDataObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,689:1\n766#2:690\n857#2,2:691\n1549#2:693\n1620#2,2:694\n766#2:696\n857#2,2:697\n1622#2:699\n*S KotlinDebug\n*F\n+ 1 PicPostTopicOrHashtagChooseFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PicPostTopicOrHashtagChooseFragment$initTopicChooseLiveDataObserver$1\n*L\n342#1:690\n342#1:691,2\n347#1:693\n347#1:694,2\n348#1:696\n348#1:697,2\n347#1:699\n*E\n"})
    public static final class l implements androidx.lifecycle.j0<Result<BBSTopicIndexObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PictureVideoEditPostFragmentViewModel f82320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PicPostTopicOrHashtagChooseFragment f82321b;

        l(PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel, PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment) {
            this.f82320a = pictureVideoEditPostFragmentViewModel;
            this.f82321b = picPostTopicOrHashtagChooseFragment;
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Result<BBSTopicIndexObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30096, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(result);
        }

        public final void b(Result<BBSTopicIndexObj> result) {
            BBSTopicIndexObj.TopicsListV2Obj topics_list_v2;
            List<BBSTopicCategoryObj> section_topics;
            ArrayList arrayList;
            List<BBSTopicObj> children;
            BBSTopicIndexObj.TopicsListV2Obj topics_list_v3;
            List<BBSTopicObj> recommend_topics;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30095, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSTopicIndexObj result2 = result.getResult();
            if (result2 != null && (topics_list_v3 = result2.getTopics_list_v2()) != null && (recommend_topics = topics_list_v3.getRecommend_topics()) != null) {
                PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel = this.f82320a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : recommend_topics) {
                    if (!pictureVideoEditPostFragmentViewModel.E((BBSTopicObj) obj)) {
                        arrayList2.add(obj);
                    }
                }
                com.max.hbcommon.base.adapter.s sVar = this.f82321b.f82279p;
                if (sVar != null) {
                    com.max.hbcommon.base.adapter.d.b(sVar, arrayList2, com.max.xiaoheihe.module.bbs.adapter.b.f80312a);
                }
            }
            BBSTopicIndexObj result3 = result.getResult();
            if (result3 == null || (topics_list_v2 = result3.getTopics_list_v2()) == null || (section_topics = topics_list_v2.getSection_topics()) == null) {
                return;
            }
            PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel2 = this.f82320a;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.t.Y(section_topics, 10));
            for (BBSTopicCategoryObj bBSTopicCategoryObj : section_topics) {
                if (bBSTopicCategoryObj == null || (children = bBSTopicCategoryObj.getChildren()) == null) {
                    arrayList = null;
                } else {
                    kotlin.jvm.internal.f0.o(children, "children");
                    arrayList = new ArrayList();
                    for (Object obj2 : children) {
                        if (!pictureVideoEditPostFragmentViewModel2.E((BBSTopicObj) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                }
                bBSTopicCategoryObj.setChildren(arrayList);
                arrayList3.add(bBSTopicCategoryObj);
            }
            PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment = this.f82321b;
            c cVar = picPostTopicOrHashtagChooseFragment.f82280q;
            if (cVar != null) {
                cVar.p(arrayList3);
            }
            c cVar2 = picPostTopicOrHashtagChooseFragment.f82280q;
            if (cVar2 != null) {
                cVar2.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPicPostTopicOrHashtagChooseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PicPostTopicOrHashtagChooseFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PicPostTopicOrHashtagChooseFragment$initTopicChooseLiveDataObserver$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,689:1\n766#2:690\n857#2,2:691\n*S KotlinDebug\n*F\n+ 1 PicPostTopicOrHashtagChooseFragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PicPostTopicOrHashtagChooseFragment$initTopicChooseLiveDataObserver$2\n*L\n366#1:690\n366#1:691,2\n*E\n"})
    public static final class m implements androidx.lifecycle.j0<Pair<? extends Result<TopicListObj>, ? extends String>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PictureVideoEditPostFragmentViewModel f82323b;

        m(PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel) {
            this.f82323b = pictureVideoEditPostFragmentViewModel;
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Pair<? extends Result<TopicListObj>, ? extends String> pair) {
            if (PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, 30098, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(pair);
        }

        public final void b(Pair<? extends Result<TopicListObj>, String> pair) {
            List<BBSTopicObj> topics;
            RecyclerView recyclerView;
            EditText editText;
            Editable text;
            if (PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, 30097, new Class[]{Pair.class}, Void.TYPE).isSupported) {
                return;
            }
            Result<TopicListObj> resultA = pair.a();
            String strB = pair.b();
            n7 n7Var = PicPostTopicOrHashtagChooseFragment.this.f82277n;
            if (kotlin.jvm.internal.f0.g(strB, (n7Var == null || (editText = n7Var.f113716c) == null || (text = editText.getText()) == null) ? null : text.toString())) {
                PicPostTopicOrHashtagChooseFragment.this.f82273j = strB;
                TopicListObj result = resultA.getResult();
                if (result == null || (topics = result.getTopics()) == null) {
                    return;
                }
                PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel = this.f82323b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : topics) {
                    if (!pictureVideoEditPostFragmentViewModel.E((BBSTopicObj) obj)) {
                        arrayList.add(obj);
                    }
                }
                PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment = PicPostTopicOrHashtagChooseFragment.this;
                com.max.hbcommon.base.adapter.s sVar = picPostTopicOrHashtagChooseFragment.f82281r;
                if (sVar != null) {
                    com.max.hbcommon.base.adapter.d.b(sVar, arrayList, com.max.xiaoheihe.module.bbs.adapter.b.f80312a);
                }
                rb0 rb0Var = picPostTopicOrHashtagChooseFragment.f82278o;
                if (rb0Var == null || (recyclerView = rb0Var.f115171c) == null) {
                    return;
                }
                recyclerView.smoothScrollToPosition(0);
            }
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    public static final class n extends com.max.hbcommon.base.adapter.s<BBSTopicObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PicPostTopicOrHashtagChooseFragment f82324b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Context context, PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, ArrayList<BBSTopicObj> arrayList) {
            super(context, arrayList, R.layout.item_topic_choose_new_entry);
            this.f82324b = picPostTopicOrHashtagChooseFragment;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 30099, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
                return;
            }
            PicPostTopicOrHashtagChooseFragment.z4(this.f82324b, eVar, bBSTopicObj, false, 4, null);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 30100, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSTopicObj);
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    public static final class o implements com.google.android.material.tabs.d.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f82326b;

        o(Context context) {
            this.f82326b = context;
        }

        @Override // com.google.android.material.tabs.d.b
        public final void a(@dl.d TabLayout.h tab, int i10) {
            if (PatchProxy.proxy(new Object[]{tab, new Integer(i10)}, this, changeQuickRedirect, false, 30101, new Class[]{TabLayout.h.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(tab, "tab");
            View viewL4 = PicPostTopicOrHashtagChooseFragment.l4(PicPostTopicOrHashtagChooseFragment.this, this.f82326b, i10);
            if (viewL4 != null) {
                tab.v(viewL4);
            }
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    public static final class p implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f82327a;

        p(Context context) {
            this.f82327a = context;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.e TabLayout.h hVar) {
            View viewG;
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 30102, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported || hVar == null || (viewG = hVar.g()) == null) {
                return;
            }
            Context context = this.f82327a;
            TextView textView = viewG instanceof TextView ? (TextView) viewG : null;
            if (textView != null) {
                textView.setTextColor(context.getColor(R.color.text_primary_1_color));
                textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.e TabLayout.h hVar) {
            View viewG;
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 30103, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported || hVar == null || (viewG = hVar.g()) == null) {
                return;
            }
            Context context = this.f82327a;
            TextView textView = viewG instanceof TextView ? (TextView) viewG : null;
            if (textView != null) {
                textView.setTextColor(context.getColor(R.color.text_primary_2_color));
                textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.e TabLayout.h hVar) {
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    public static final class q extends com.max.hbcommon.base.adapter.s<BBSTopicObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PicPostTopicOrHashtagChooseFragment f82328b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Context context, PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, ArrayList<BBSTopicObj> arrayList) {
            super(context, arrayList, R.layout.item_topic_choose_new_entry);
            this.f82328b = picPostTopicOrHashtagChooseFragment;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 30104, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
                return;
            }
            PicPostTopicOrHashtagChooseFragment.W3(this.f82328b, eVar, bBSTopicObj, true);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 30105, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSTopicObj);
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    public static final class r implements DialogInterface.OnKeyListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 30106, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 != 4 || keyEvent.getAction() != 1) {
                return false;
            }
            PicPostTopicOrHashtagChooseFragment.this.dismiss();
            return true;
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    public static final class s implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f82330b;

        s(EditText editText) {
            this.f82330b = editText;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30107, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ViewUtils.r0(this.f82330b);
        }
    }

    /* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
    public static final class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30108, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PicPostTopicOrHashtagChooseFragment.this.dismiss();
        }
    }

    private final void A4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30033, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.f82275l) {
            z60 z60Var = this.f82282s;
            if (z60Var != null) {
                RecyclerView rvHashtagRecommend = z60Var.f118230c;
                kotlin.jvm.internal.f0.o(rvHashtagRecommend, "rvHashtagRecommend");
                rvHashtagRecommend.setVisibility(0);
                TextView tvHashtagRecommendW500 = z60Var.f118232e;
                kotlin.jvm.internal.f0.o(tvHashtagRecommendW500, "tvHashtagRecommendW500");
                tvHashtagRecommendW500.setVisibility(0);
                FrameLayout flSearchCreateHashtag = z60Var.f118229b;
                kotlin.jvm.internal.f0.o(flSearchCreateHashtag, "flSearchCreateHashtag");
                flSearchCreateHashtag.setVisibility(8);
                RecyclerView rvHashtagSearch = z60Var.f118231d;
                kotlin.jvm.internal.f0.o(rvHashtagSearch, "rvHashtagSearch");
                rvHashtagSearch.setVisibility(8);
                return;
            }
            return;
        }
        rb0 rb0Var = this.f82278o;
        if (rb0Var != null) {
            TextView tvTopicRecommend4youW500 = rb0Var.f115173e;
            kotlin.jvm.internal.f0.o(tvTopicRecommend4youW500, "tvTopicRecommend4youW500");
            tvTopicRecommend4youW500.setVisibility(0);
            RecyclerView rvTopicRecommend4you = rb0Var.f115170b;
            kotlin.jvm.internal.f0.o(rvTopicRecommend4you, "rvTopicRecommend4you");
            rvTopicRecommend4you.setVisibility(0);
            View vTopicRecommend4youDivider = rb0Var.f115174f;
            kotlin.jvm.internal.f0.o(vTopicRecommend4youDivider, "vTopicRecommend4youDivider");
            vTopicRecommend4youDivider.setVisibility(0);
            TabLayout tabTopicSection = rb0Var.f115172d;
            kotlin.jvm.internal.f0.o(tabTopicSection, "tabTopicSection");
            tabTopicSection.setVisibility(0);
            ViewPager2 vp2TopicSection = rb0Var.f115175g;
            kotlin.jvm.internal.f0.o(vp2TopicSection, "vp2TopicSection");
            vp2TopicSection.setVisibility(0);
            RecyclerView rvTopicSearch = rb0Var.f115171c;
            kotlin.jvm.internal.f0.o(rvTopicSearch, "rvTopicSearch");
            rvTopicSearch.setVisibility(8);
        }
    }

    private final void B4() {
        PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30043, new Class[0], Void.TYPE).isSupported || (pictureVideoEditPostFragmentViewModel = this.f82276m) == null) {
            return;
        }
        pictureVideoEditPostFragmentViewModel.v().k(this, new f(pictureVideoEditPostFragmentViewModel, this));
        pictureVideoEditPostFragmentViewModel.w().k(this, new g(pictureVideoEditPostFragmentViewModel));
    }

    private final void C4() {
        z60 z60Var;
        LinearLayout linearLayoutB;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30040, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n7 n7Var = this.f82277n;
        Context context = (n7Var == null || (linearLayoutB = n7Var.b()) == null) ? null : linearLayoutB.getContext();
        if (context == null || (z60Var = this.f82282s) == null) {
            return;
        }
        z60Var.f118232e.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        this.f82283t = new h(context, this, new ArrayList());
        RecyclerView initHashtagChooseView$lambda$18$lambda$16 = z60Var.f118230c;
        kotlin.jvm.internal.f0.o(initHashtagChooseView$lambda$18$lambda$16, "initHashtagChooseView$lambda$18$lambda$16");
        initHashtagChooseView$lambda$18$lambda$16.setVisibility(0);
        initHashtagChooseView$lambda$18$lambda$16.setAdapter(this.f82283t);
        initHashtagChooseView$lambda$18$lambda$16.setLayoutManager(new LinearLayoutManager(context, 1, false));
        com.max.xiaoheihe.module.bbs.post_edit.l.a(initHashtagChooseView$lambda$18$lambda$16, context, 10);
        FrameLayout flSearchCreateHashtag = z60Var.f118229b;
        kotlin.jvm.internal.f0.o(flSearchCreateHashtag, "flSearchCreateHashtag");
        flSearchCreateHashtag.setVisibility(8);
        z60Var.f118229b.setOnClickListener(new i());
        this.f82284u = new j(context, this, new ArrayList());
        RecyclerView initHashtagChooseView$lambda$18$lambda$17 = z60Var.f118231d;
        kotlin.jvm.internal.f0.o(initHashtagChooseView$lambda$18$lambda$17, "initHashtagChooseView$lambda$18$lambda$17");
        initHashtagChooseView$lambda$18$lambda$17.setVisibility(8);
        initHashtagChooseView$lambda$18$lambda$17.setAdapter(this.f82284u);
        initHashtagChooseView$lambda$18$lambda$17.setLayoutManager(new LinearLayoutManager(context, 1, false));
        com.max.xiaoheihe.module.bbs.post_edit.l.a(initHashtagChooseView$lambda$18$lambda$17, context, 10);
    }

    private final void D4() {
        final n7 n7Var;
        final Context context;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30031, new Class[0], Void.TYPE).isSupported || (n7Var = this.f82277n) == null || (context = n7Var.b().getContext()) == null) {
            return;
        }
        TextView textView = n7Var.f113719f;
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        textView.setText(this.f82275l ? "选择社区" : "添加话题");
        n7Var.f113717d.setOnClickListener(new k());
        n7Var.f113716c.setHint(this.f82275l ? "搜索社区" : "搜索话题");
        n7Var.f113716c.addTextChangedListener(new TextWatcher() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PicPostTopicOrHashtagChooseFragment$initTitleAndSearchView$1$3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.text.TextWatcher
            public void afterTextChanged(@dl.d Editable s10) {
                ImageView imageView;
                ImageView imageView2;
                ImageView imageView3;
                ImageView imageView4;
                if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 30090, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(s10, "s");
                if (!(s10.length() > 0)) {
                    n7 n7Var2 = this.f82310b.f82277n;
                    if (n7Var2 != null && (imageView2 = n7Var2.f113717d) != null) {
                        imageView2.setVisibility(8);
                    }
                    n7 n7Var3 = this.f82310b.f82277n;
                    if (n7Var3 != null && (imageView = n7Var3.f113718e) != null) {
                        imageView.setColorFilter(context.getColor(R.color.text_secondary_2_color));
                    }
                    PicPostTopicOrHashtagChooseFragment.k4(this.f82310b);
                    return;
                }
                n7 n7Var4 = this.f82310b.f82277n;
                if (n7Var4 != null && (imageView4 = n7Var4.f113717d) != null) {
                    imageView4.setVisibility(0);
                }
                n7 n7Var5 = this.f82310b.f82277n;
                if (n7Var5 != null && (imageView3 = n7Var5.f113718e) != null) {
                    imageView3.setColorFilter(context.getColor(R.color.text_primary_2_color));
                }
                PicPostTopicOrHashtagChooseFragment.o4(this.f82310b, s10.toString());
                PicPostTopicOrHashtagChooseFragment.v4(this.f82310b);
                d2 d2Var = this.f82310b.f82286w;
                if (d2Var != null) {
                    d2.a.b(d2Var, null, 1, null);
                }
                PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment = this.f82310b;
                picPostTopicOrHashtagChooseFragment.f82286w = kotlinx.coroutines.k.f(androidx.lifecycle.z.a(picPostTopicOrHashtagChooseFragment), null, null, new PicPostTopicOrHashtagChooseFragment$initTitleAndSearchView$1$3$afterTextChanged$1(n7Var, this.f82310b, null), 3, null);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
                Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30088, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(s10, "s");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
                Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30089, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(s10, "s");
            }
        });
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void E4() {
        PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30039, new Class[0], Void.TYPE).isSupported || (pictureVideoEditPostFragmentViewModel = this.f82276m) == null) {
            return;
        }
        pictureVideoEditPostFragmentViewModel.z().k(this, new l(pictureVideoEditPostFragmentViewModel, this));
        pictureVideoEditPostFragmentViewModel.A().k(this, new m(pictureVideoEditPostFragmentViewModel));
    }

    private final void F4() {
        rb0 rb0Var;
        LinearLayout linearLayoutB;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30035, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n7 n7Var = this.f82277n;
        Context context = (n7Var == null || (linearLayoutB = n7Var.b()) == null) ? null : linearLayoutB.getContext();
        if (context == null || (rb0Var = this.f82278o) == null) {
            return;
        }
        rb0Var.f115173e.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        n nVar = new n(context, this, new ArrayList());
        this.f82279p = nVar;
        RecyclerView initTopicChooseView$lambda$12$lambda$10 = rb0Var.f115170b;
        initTopicChooseView$lambda$12$lambda$10.setAdapter(nVar);
        initTopicChooseView$lambda$12$lambda$10.setLayoutManager(new LinearLayoutManager(context, 1, false));
        kotlin.jvm.internal.f0.o(initTopicChooseView$lambda$12$lambda$10, "initTopicChooseView$lambda$12$lambda$10");
        com.max.xiaoheihe.module.bbs.post_edit.l.a(initTopicChooseView$lambda$12$lambda$10, context, 10);
        c cVar = new c(this, context, new ArrayList());
        this.f82280q = cVar;
        rb0Var.f115175g.setAdapter(cVar);
        new com.google.android.material.tabs.d(rb0Var.f115172d, rb0Var.f115175g, true, true, new o(context)).a();
        rb0Var.f115172d.h(new p(context));
        this.f82281r = new q(context, this, new ArrayList());
        RecyclerView initTopicChooseView$lambda$12$lambda$11 = rb0Var.f115171c;
        kotlin.jvm.internal.f0.o(initTopicChooseView$lambda$12$lambda$11, "initTopicChooseView$lambda$12$lambda$11");
        initTopicChooseView$lambda$12$lambda$11.setVisibility(8);
        initTopicChooseView$lambda$12$lambda$11.setAdapter(this.f82281r);
        initTopicChooseView$lambda$12$lambda$11.setLayoutManager(new LinearLayoutManager(context, 1, false));
        com.max.xiaoheihe.module.bbs.post_edit.l.a(initTopicChooseView$lambda$12$lambda$11, context, 10);
    }

    private final View G4(Context context, int i10) {
        List<BBSTopicCategoryObj> section_topics;
        BBSTopicCategoryObj bBSTopicCategoryObj;
        LiveData<Result<BBSTopicIndexObj>> liveDataZ;
        Result<BBSTopicIndexObj> resultF;
        BBSTopicIndexObj result;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, 30036, new Class[]{Context.class, Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel = this.f82276m;
        BBSTopicIndexObj.TopicsListV2Obj topics_list_v2 = (pictureVideoEditPostFragmentViewModel == null || (liveDataZ = pictureVideoEditPostFragmentViewModel.z()) == null || (resultF = liveDataZ.f()) == null || (result = resultF.getResult()) == null) ? null : result.getTopics_list_v2();
        String name = (topics_list_v2 == null || (section_topics = topics_list_v2.getSection_topics()) == null || (bBSTopicCategoryObj = (BBSTopicCategoryObj) CollectionsKt___CollectionsKt.R2(section_topics, i10)) == null) ? null : bBSTopicCategoryObj.getName();
        if (name == null) {
            return null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        TextView textView = new TextView(context);
        textView.setLayoutParams(layoutParams);
        textView.setText(name);
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        return textView;
    }

    private final void H4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30034, new Class[]{String.class}, Void.TYPE).isSupported || kotlin.text.u.V1(str)) {
            return;
        }
        if (this.f82275l) {
            PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel = this.f82276m;
            if (pictureVideoEditPostFragmentViewModel != null) {
                pictureVideoEditPostFragmentViewModel.W(str, new PicPostTopicOrHashtagChooseFragment$performStartSearch$1(this));
                return;
            }
            return;
        }
        PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel2 = this.f82276m;
        if (pictureVideoEditPostFragmentViewModel2 != null) {
            pictureVideoEditPostFragmentViewModel2.V(str, new PicPostTopicOrHashtagChooseFragment$performStartSearch$2(this));
        }
    }

    private final void I4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 30045, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
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

    private final void J4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30048, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.analytics.d.e("1", lb.d.E0, null, null, null, null, true);
    }

    private final void K4(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30046, new Class[]{String.class}, Void.TYPE).isSupported && com.max.hbcommon.utils.c.u(str)) {
            PageEventObj pageEventObj = new PageEventObj();
            pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
            pageEventObj.setPath(lb.d.L0);
            pageEventObj.setType("4");
            com.max.hbcommon.analytics.d.c(pageEventObj, true);
        }
    }

    private final void L4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 30051, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        if (str != null) {
            jsonObject.addProperty("query", str);
        }
        if (str2 != null) {
            jsonObject.addProperty("name", str2);
        }
        com.max.hbcommon.analytics.d.e("4", lb.d.M0, null, null, jsonObject, null, true);
    }

    private final void M4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 30044, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
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

    private final void N4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30032, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.f82275l) {
            z60 z60Var = this.f82282s;
            if (z60Var != null) {
                RecyclerView rvHashtagRecommend = z60Var.f118230c;
                kotlin.jvm.internal.f0.o(rvHashtagRecommend, "rvHashtagRecommend");
                rvHashtagRecommend.setVisibility(8);
                TextView tvHashtagRecommendW500 = z60Var.f118232e;
                kotlin.jvm.internal.f0.o(tvHashtagRecommendW500, "tvHashtagRecommendW500");
                tvHashtagRecommendW500.setVisibility(8);
                FrameLayout flSearchCreateHashtag = z60Var.f118229b;
                kotlin.jvm.internal.f0.o(flSearchCreateHashtag, "flSearchCreateHashtag");
                flSearchCreateHashtag.setVisibility(8);
                RecyclerView rvHashtagSearch = z60Var.f118231d;
                kotlin.jvm.internal.f0.o(rvHashtagSearch, "rvHashtagSearch");
                rvHashtagSearch.setVisibility(0);
                return;
            }
            return;
        }
        rb0 rb0Var = this.f82278o;
        if (rb0Var != null) {
            TextView tvTopicRecommend4youW500 = rb0Var.f115173e;
            kotlin.jvm.internal.f0.o(tvTopicRecommend4youW500, "tvTopicRecommend4youW500");
            tvTopicRecommend4youW500.setVisibility(8);
            RecyclerView rvTopicRecommend4you = rb0Var.f115170b;
            kotlin.jvm.internal.f0.o(rvTopicRecommend4you, "rvTopicRecommend4you");
            rvTopicRecommend4you.setVisibility(8);
            View vTopicRecommend4youDivider = rb0Var.f115174f;
            kotlin.jvm.internal.f0.o(vTopicRecommend4youDivider, "vTopicRecommend4youDivider");
            vTopicRecommend4youDivider.setVisibility(8);
            TabLayout tabTopicSection = rb0Var.f115172d;
            kotlin.jvm.internal.f0.o(tabTopicSection, "tabTopicSection");
            tabTopicSection.setVisibility(8);
            ViewPager2 vp2TopicSection = rb0Var.f115175g;
            kotlin.jvm.internal.f0.o(vp2TopicSection, "vp2TopicSection");
            vp2TopicSection.setVisibility(8);
            RecyclerView rvTopicSearch = rb0Var.f115171c;
            kotlin.jvm.internal.f0.o(rvTopicSearch, "rvTopicSearch");
            rvTopicSearch.setVisibility(0);
        }
    }

    public static final /* synthetic */ void V3(PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, com.max.hbcommon.base.adapter.s.e eVar, HashtagObj hashtagObj, Context context, boolean z10) {
        if (PatchProxy.proxy(new Object[]{picPostTopicOrHashtagChooseFragment, eVar, hashtagObj, context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 30062, new Class[]{PicPostTopicOrHashtagChooseFragment.class, com.max.hbcommon.base.adapter.s.e.class, HashtagObj.class, Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        picPostTopicOrHashtagChooseFragment.w4(eVar, hashtagObj, context, z10);
    }

    public static final /* synthetic */ void W3(PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{picPostTopicOrHashtagChooseFragment, eVar, bBSTopicObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 30058, new Class[]{PicPostTopicOrHashtagChooseFragment.class, com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        picPostTopicOrHashtagChooseFragment.y4(eVar, bBSTopicObj, z10);
    }

    public static final /* synthetic */ void X3(PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment) {
        if (PatchProxy.proxy(new Object[]{picPostTopicOrHashtagChooseFragment}, null, changeQuickRedirect, true, 30052, new Class[]{PicPostTopicOrHashtagChooseFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        super.dismiss();
    }

    public static final /* synthetic */ void k4(PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment) {
        if (PatchProxy.proxy(new Object[]{picPostTopicOrHashtagChooseFragment}, null, changeQuickRedirect, true, 30056, new Class[]{PicPostTopicOrHashtagChooseFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        picPostTopicOrHashtagChooseFragment.A4();
    }

    public static final /* synthetic */ View l4(PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{picPostTopicOrHashtagChooseFragment, context, new Integer(i10)}, null, changeQuickRedirect, true, 30057, new Class[]{PicPostTopicOrHashtagChooseFragment.class, Context.class, Integer.TYPE}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : picPostTopicOrHashtagChooseFragment.G4(context, i10);
    }

    public static final /* synthetic */ void m4(PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, String str) {
        if (PatchProxy.proxy(new Object[]{picPostTopicOrHashtagChooseFragment, str}, null, changeQuickRedirect, true, 30055, new Class[]{PicPostTopicOrHashtagChooseFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        picPostTopicOrHashtagChooseFragment.H4(str);
    }

    public static final /* synthetic */ void n4(PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{picPostTopicOrHashtagChooseFragment, str, str2}, null, changeQuickRedirect, true, 30061, new Class[]{PicPostTopicOrHashtagChooseFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        picPostTopicOrHashtagChooseFragment.I4(str, str2);
    }

    public static final /* synthetic */ void o4(PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, String str) {
        if (PatchProxy.proxy(new Object[]{picPostTopicOrHashtagChooseFragment, str}, null, changeQuickRedirect, true, 30053, new Class[]{PicPostTopicOrHashtagChooseFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        picPostTopicOrHashtagChooseFragment.K4(str);
    }

    public static final /* synthetic */ void p4(PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{picPostTopicOrHashtagChooseFragment, str, str2}, null, changeQuickRedirect, true, 30060, new Class[]{PicPostTopicOrHashtagChooseFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        picPostTopicOrHashtagChooseFragment.L4(str, str2);
    }

    public static final /* synthetic */ void q4(PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{picPostTopicOrHashtagChooseFragment, str, str2}, null, changeQuickRedirect, true, 30059, new Class[]{PicPostTopicOrHashtagChooseFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        picPostTopicOrHashtagChooseFragment.M4(str, str2);
    }

    public static final /* synthetic */ void v4(PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment) {
        if (PatchProxy.proxy(new Object[]{picPostTopicOrHashtagChooseFragment}, null, changeQuickRedirect, true, 30054, new Class[]{PicPostTopicOrHashtagChooseFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        picPostTopicOrHashtagChooseFragment.N4();
    }

    private final void w4(com.max.hbcommon.base.adapter.s.e eVar, HashtagObj hashtagObj, Context context, boolean z10) {
        View viewB;
        Cdo cdoA;
        if (PatchProxy.proxy(new Object[]{eVar, hashtagObj, context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30041, new Class[]{com.max.hbcommon.base.adapter.s.e.class, HashtagObj.class, Context.class, Boolean.TYPE}, Void.TYPE).isSupported || eVar == null || hashtagObj == null || (viewB = eVar.b()) == null || (cdoA = Cdo.a(viewB)) == null) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(hashtagObj.getSub_title())) {
            cdoA.f109844f.setVisibility(8);
        } else {
            cdoA.f109844f.setText(hashtagObj.getSub_title());
            cdoA.f109844f.setVisibility(0);
            cdoA.f109844f.setBackground(ViewUtils.x(ViewUtils.f(context, 2.0f), com.max.xiaoheihe.utils.d.e1(hashtagObj.getStart_color()), com.max.xiaoheihe.utils.d.e1(hashtagObj.getEnd_color())));
        }
        cdoA.f109843e.setText(hashtagObj.getName());
        TextView textView = cdoA.f109841c;
        Object[] objArr = new Object[1];
        HashtagNumObj num = hashtagObj.getNum();
        String content_num = num != null ? num.getContent_num() : null;
        String str = "0";
        if (content_num == null) {
            content_num = "0";
        } else {
            kotlin.jvm.internal.f0.o(content_num, "data.num?.content_num ?: \"0\"");
        }
        objArr[0] = content_num;
        textView.setText(context.getString(R.string.hashtag_discuss_num_placeholder, objArr));
        TextView textView2 = cdoA.f109842d;
        Object[] objArr2 = new Object[1];
        HashtagNumObj num2 = hashtagObj.getNum();
        String participant_num = num2 != null ? num2.getParticipant_num() : null;
        if (participant_num != null) {
            kotlin.jvm.internal.f0.o(participant_num, "data.num?.participant_num ?: \"0\"");
            str = participant_num;
        }
        objArr2[0] = str;
        textView2.setText(context.getString(R.string.hashtag_participate_num_placeholder, objArr2));
        cdoA.b().setOnClickListener(new d(hashtagObj, z10));
    }

    static /* synthetic */ void x4(PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, com.max.hbcommon.base.adapter.s.e eVar, HashtagObj hashtagObj, Context context, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{picPostTopicOrHashtagChooseFragment, eVar, hashtagObj, context, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 30042, new Class[]{PicPostTopicOrHashtagChooseFragment.class, com.max.hbcommon.base.adapter.s.e.class, HashtagObj.class, Context.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        picPostTopicOrHashtagChooseFragment.w4(eVar, hashtagObj, context, (i10 & 8) == 0 ? z10 ? 1 : 0 : false);
    }

    private final void y4(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj, boolean z10) {
        View viewB;
        pz pzVarA;
        if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30037, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class, Boolean.TYPE}, Void.TYPE).isSupported || eVar == null || bBSTopicObj == null || (viewB = eVar.b()) == null || (pzVarA = pz.a(viewB)) == null) {
            return;
        }
        pzVarA.f114635d.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        pzVarA.f114635d.setText(bBSTopicObj.getName());
        pzVarA.f114634c.setText(bBSTopicObj.getShow_desc());
        com.max.hbimage.b.K(bBSTopicObj.getPic_url(), pzVarA.f114633b);
        pzVarA.b().setOnClickListener(new e(bBSTopicObj, z10));
    }

    static /* synthetic */ void z4(PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{picPostTopicOrHashtagChooseFragment, eVar, bBSTopicObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 30038, new Class[]{PicPostTopicOrHashtagChooseFragment.class, com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        picPostTopicOrHashtagChooseFragment.y4(eVar, bBSTopicObj, z10);
    }

    @Override // com.max.hbcommon.base.swipeback.a, androidx.fragment.app.j
    public void dismiss() {
        EditText editText;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30049, new Class[0], Void.TYPE).isSupported || this.f82287x) {
            return;
        }
        this.f82287x = true;
        n7 n7Var = this.f82277n;
        if (n7Var != null && (editText = n7Var.f113716c) != null) {
            ViewUtils.X(editText);
        }
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), e1.e(), null, new AnonymousClass2(null), 2, null);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 30028, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f82275l = arguments.getBoolean(B);
        }
        Fragment parentFragment = getParentFragment();
        this.f82276m = parentFragment != null ? (PictureVideoEditPostFragmentViewModel) new androidx.lifecycle.y0(parentFragment).a(PictureVideoEditPostFragmentViewModel.class) : null;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 30029, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_choose_topic_or_hashtag_new_entry, viewGroup, false);
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@dl.d DialogInterface dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 30050, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(dialog, "dialog");
        super.onDismiss(dialog);
        yh.a<b2> aVar = this.f82285v;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        EditText editText;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30047, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new r());
        }
        J4();
        n7 n7Var = this.f82277n;
        if (n7Var == null || (editText = n7Var.f113716c) == null) {
            return;
        }
        if (!(!this.f82275l)) {
            editText = null;
        }
        if (editText != null) {
            editText.post(new s(editText));
        }
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        ViewStub viewStub;
        View viewInflate;
        ViewStub viewStub2;
        View viewInflate2;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 30030, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new t());
        this.f82277n = n7.a(view);
        D4();
        if (this.f82275l) {
            n7 n7Var = this.f82277n;
            if (n7Var != null && (viewStub2 = n7Var.f113722i) != null && (viewInflate2 = viewStub2.inflate()) != null) {
                this.f82278o = rb0.a(viewInflate2);
            }
            F4();
            E4();
            return;
        }
        n7 n7Var2 = this.f82277n;
        if (n7Var2 != null && (viewStub = n7Var2.f113721h) != null && (viewInflate = viewStub.inflate()) != null) {
            this.f82282s = z60.a(viewInflate);
        }
        C4();
        B4();
    }
}
