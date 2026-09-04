package com.max.xiaoheihe.module.bbs.post_edit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import com.google.gson.JsonObject;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.post_edit.RecommendedTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.hw;
import df.iw;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: RecommendedTopicsController.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nRecommendedTopicsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendedTopicsController.kt\ncom/max/xiaoheihe/module/bbs/post_edit/RecommendedTopicsController\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,329:1\n29#2:330\n5#2,2:331\n22#2:333\n7#2:334\n29#2:335\n5#2,2:336\n22#2:338\n7#2:339\n29#2:340\n5#2,2:341\n22#2:343\n7#2:344\n29#2:345\n5#2,2:346\n22#2:348\n7#2:349\n*S KotlinDebug\n*F\n+ 1 RecommendedTopicsController.kt\ncom/max/xiaoheihe/module/bbs/post_edit/RecommendedTopicsController\n*L\n198#1:330\n198#1:331,2\n198#1:333\n198#1:334\n207#1:335\n207#1:336,2\n207#1:338\n207#1:339\n311#1:340\n311#1:341,2\n311#1:343\n311#1:344\n321#1:345\n321#1:346,2\n321#1:348\n321#1:349\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class RecommendedTopicsController {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f82736l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final y0 f82737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final RecommendTopicViewModel f82738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Context f82739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final RecommendTopicContainer f82740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.y f82741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private com.max.hbcommon.base.adapter.s<RecommendedTopicObj> f82742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f82743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private String f82744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f82745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private d2 f82746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final kotlin.z f82747k;

    /* JADX INFO: compiled from: RecommendedTopicsController.kt */
    public static final class a extends com.max.hbcommon.base.adapter.u<RecommendedTopicObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.RecommendedTopicsController$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RecommendedTopicsController.kt */
        public static final class C0711a extends com.bumptech.glide.request.target.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ iw f82749l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0711a(iw iwVar, QMUIRadiusImageView qMUIRadiusImageView) {
                super(qMUIRadiusImageView);
                this.f82749l = iwVar;
            }

            @Override // com.bumptech.glide.request.target.g, com.bumptech.glide.request.target.j
            public /* bridge */ /* synthetic */ void m(Drawable drawable) {
                if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 30808, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(drawable);
            }

            @Override // com.bumptech.glide.request.target.g
            /* JADX INFO: renamed from: o */
            public void m(@dl.e Drawable drawable) {
                if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 30807, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f82749l.f111902b.setImageDrawable(drawable);
                this.f82749l.f111902b.setAlpha(0.5f);
            }
        }

        /* JADX INFO: compiled from: RecommendedTopicsController.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RecommendedTopicsController f82750b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecommendedTopicObj f82751c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f82752d;

            b(RecommendedTopicsController recommendedTopicsController, RecommendedTopicObj recommendedTopicObj, com.max.hbcommon.base.adapter.s.e eVar) {
                this.f82750b = recommendedTopicsController;
                this.f82751c = recommendedTopicObj;
                this.f82752d = eVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30809, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                RecommendedTopicsController.j(this.f82750b, this.f82751c, this.f82752d.getBindingAdapterPosition());
            }
        }

        a(Context context, ArrayList<RecommendedTopicObj> arrayList) {
            super(context, arrayList);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, RecommendedTopicObj recommendedTopicObj) {
            Object[] objArr = {new Integer(i10), recommendedTopicObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30806, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, recommendedTopicObj);
        }

        public int n(int i10, @dl.d RecommendedTopicObj data) {
            Object[] objArr = {new Integer(i10), data};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30804, new Class[]{cls, RecommendedTopicObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            kotlin.jvm.internal.f0.p(data, "data");
            return data.isHashtag() ? R.layout.item_recommended_hashtag : R.layout.item_recommended_topic;
        }

        public void o(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d RecommendedTopicObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 30803, new Class[]{com.max.hbcommon.base.adapter.s.e.class, RecommendedTopicObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            if (data.isHashtag()) {
                hw hwVarA = hw.a(viewHolder.itemView);
                kotlin.jvm.internal.f0.o(hwVarA, "bind(viewHolder.itemView)");
                hwVarA.f111535c.setText(data.getName());
            } else {
                iw iwVarA = iw.a(viewHolder.itemView);
                kotlin.jvm.internal.f0.o(iwVarA, "bind(viewHolder.itemView)");
                Glide.F(RecommendedTopicsController.this.t()).load(data.getPicUrl()).z1(new C0711a(iwVarA, iwVarA.f111902b));
                iwVarA.f111903c.setText(data.getName());
            }
            viewHolder.itemView.setOnClickListener(new b(RecommendedTopicsController.this, data, viewHolder));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 30805, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (RecommendedTopicObj) obj);
        }
    }

    /* JADX INFO: compiled from: RecommendedTopicsController.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30810, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            RecommendedTopicsController.k(RecommendedTopicsController.this);
            RecommendedTopicsController.a(RecommendedTopicsController.this);
            RecommendedTopicsController.h(RecommendedTopicsController.this);
            RecommendedTopicsController.this.f82743g = true;
            d2 d2Var = RecommendedTopicsController.this.f82746j;
            if (d2Var != null) {
                d2.a.b(d2Var, null, 1, null);
            }
        }
    }

    /* JADX INFO: compiled from: RecommendedTopicsController.kt */
    public static final class c extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 30829, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
            super.onAnimationEnd(animation);
            RecommendedTopicsController.this.s().setVisibility(8);
        }
    }

    public RecommendedTopicsController(@dl.d y0 recommendTopicPostEditor, @dl.d RecommendTopicViewModel recommendTopicViewModel) {
        kotlin.jvm.internal.f0.p(recommendTopicPostEditor, "recommendTopicPostEditor");
        kotlin.jvm.internal.f0.p(recommendTopicViewModel, "recommendTopicViewModel");
        this.f82737a = recommendTopicPostEditor;
        this.f82738b = recommendTopicViewModel;
        Context context = recommendTopicPostEditor.getContext();
        this.f82739c = context;
        RecommendTopicContainer recommendTopicContainerF2 = recommendTopicPostEditor.f2();
        this.f82740d = recommendTopicContainerF2;
        this.f82741e = recommendTopicPostEditor.P2();
        this.f82747k = kotlin.b0.c(new yh.a<RotateAnimation>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.RecommendedTopicsController$rotateAnimation$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public final RotateAnimation a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30836, new Class[0], RotateAnimation.class);
                if (patchProxyResultProxy.isSupported) {
                    return (RotateAnimation) patchProxyResultProxy.result;
                }
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(1200L);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setRepeatCount(-1);
                return rotateAnimation;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.RotateAnimation, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ RotateAnimation invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30837, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f82742f = new a(context, new ArrayList());
        recommendTopicContainerF2.getBinding().f111620c.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recommendTopicContainerF2.getBinding().f111620c.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(context, 6.0f), 0));
        recommendTopicContainerF2.getBinding().f111620c.setAdapter(this.f82742f);
        recommendTopicContainerF2.getBinding().f111619b.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        recommendTopicContainerF2.getBinding().f111619b.setOnClickListener(new b());
        q();
    }

    private final void A(RecommendedTopicObj recommendedTopicObj) {
        String name;
        String topicId;
        if (PatchProxy.proxy(new Object[]{recommendedTopicObj}, this, changeQuickRedirect, false, 30790, new Class[]{RecommendedTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        if (recommendedTopicObj.isTopic() && (topicId = recommendedTopicObj.getTopicId()) != null) {
            jsonObject.addProperty("topic_id", topicId);
        }
        if (recommendedTopicObj.isHashtag() && (name = recommendedTopicObj.getName()) != null) {
            jsonObject.addProperty("hashtag", name);
        }
        String recSrc = recommendedTopicObj.getRecSrc();
        if (recSrc != null) {
            jsonObject.addProperty("rec_src", recSrc);
        }
        com.max.hbcommon.analytics.d.e("4", lb.d.F0, null, null, jsonObject, null, true);
    }

    private final void B(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 30793, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f82746j = kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this.f82741e), null, null, new RecommendedTopicsController$requestRecommendTopics$1(this, str, str2, str3, null), 3, null);
    }

    private final void C() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30788, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RecommendTopicContainer recommendTopicContainer = this.f82740d;
        if (recommendTopicContainer.getVisibility() == 8) {
            z();
            recommendTopicContainer.setAlpha(0.0f);
            recommendTopicContainer.setTranslationY(ViewUtils.f(recommendTopicContainer.getContext(), 40.0f));
            recommendTopicContainer.setVisibility(0);
            recommendTopicContainer.animate().translationY(0.0f).alpha(1.0f).setDuration(200L).setListener(null);
        }
    }

    private final void D() {
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30794, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (RecommendedTopicsController.class.isAnonymousClass()) {
            name = RecommendedTopicsController.class.getName();
            kotlin.jvm.internal.f0.m(name);
        } else {
            name = RecommendedTopicsController.class.getSimpleName();
            kotlin.jvm.internal.f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("startLoading");
        aVar.q(sb2.toString());
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this.f82741e), e1.e(), null, new RecommendedTopicsController$startLoading$1(this, null), 2, null);
    }

    public static final /* synthetic */ void a(RecommendedTopicsController recommendedTopicsController) {
        if (PatchProxy.proxy(new Object[]{recommendedTopicsController}, null, changeQuickRedirect, true, 30798, new Class[]{RecommendedTopicsController.class}, Void.TYPE).isSupported) {
            return;
        }
        recommendedTopicsController.r();
    }

    public static final /* synthetic */ RotateAnimation g(RecommendedTopicsController recommendedTopicsController) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recommendedTopicsController}, null, changeQuickRedirect, true, 30799, new Class[]{RecommendedTopicsController.class}, RotateAnimation.class);
        return patchProxyResultProxy.isSupported ? (RotateAnimation) patchProxyResultProxy.result : recommendedTopicsController.u();
    }

    public static final /* synthetic */ void h(RecommendedTopicsController recommendedTopicsController) {
        if (PatchProxy.proxy(new Object[]{recommendedTopicsController}, null, changeQuickRedirect, true, 30802, new Class[]{RecommendedTopicsController.class}, Void.TYPE).isSupported) {
            return;
        }
        recommendedTopicsController.v();
    }

    public static final /* synthetic */ void j(RecommendedTopicsController recommendedTopicsController, RecommendedTopicObj recommendedTopicObj, int i10) {
        if (PatchProxy.proxy(new Object[]{recommendedTopicsController, recommendedTopicObj, new Integer(i10)}, null, changeQuickRedirect, true, 30800, new Class[]{RecommendedTopicsController.class, RecommendedTopicObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        recommendedTopicsController.x(recommendedTopicObj, i10);
    }

    public static final /* synthetic */ void k(RecommendedTopicsController recommendedTopicsController) {
        if (PatchProxy.proxy(new Object[]{recommendedTopicsController}, null, changeQuickRedirect, true, 30801, new Class[]{RecommendedTopicsController.class}, Void.TYPE).isSupported) {
            return;
        }
        recommendedTopicsController.y();
    }

    public static final /* synthetic */ void o(RecommendedTopicsController recommendedTopicsController) {
        if (PatchProxy.proxy(new Object[]{recommendedTopicsController}, null, changeQuickRedirect, true, 30796, new Class[]{RecommendedTopicsController.class}, Void.TYPE).isSupported) {
            return;
        }
        recommendedTopicsController.C();
    }

    public static final /* synthetic */ void p(RecommendedTopicsController recommendedTopicsController) {
        if (PatchProxy.proxy(new Object[]{recommendedTopicsController}, null, changeQuickRedirect, true, 30797, new Class[]{RecommendedTopicsController.class}, Void.TYPE).isSupported) {
            return;
        }
        recommendedTopicsController.D();
    }

    private final void q() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30785, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this.f82741e), null, null, new RecommendedTopicsController$attachTopicList$1(this, null), 3, null);
    }

    private final void r() {
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30795, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (RecommendedTopicsController.class.isAnonymousClass()) {
            name = RecommendedTopicsController.class.getName();
            kotlin.jvm.internal.f0.m(name);
        } else {
            name = RecommendedTopicsController.class.getSimpleName();
            kotlin.jvm.internal.f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("endLoading");
        aVar.q(sb2.toString());
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this.f82741e), e1.e(), null, new RecommendedTopicsController$endLoading$1(this, null), 2, null);
    }

    private final RotateAnimation u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30784, new Class[0], RotateAnimation.class);
        return patchProxyResultProxy.isSupported ? (RotateAnimation) patchProxyResultProxy.result : (RotateAnimation) this.f82747k.getValue();
    }

    private final void v() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30792, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RecommendTopicContainer recommendTopicContainer = this.f82740d;
        if (recommendTopicContainer.getVisibility() == 0) {
            recommendTopicContainer.animate().translationY(ViewUtils.f(recommendTopicContainer.getContext(), 40.0f)).alpha(0.0f).setDuration(200L).setListener(new c());
        }
    }

    private final void x(RecommendedTopicObj recommendedTopicObj, int i10) {
        String name;
        if (PatchProxy.proxy(new Object[]{recommendedTopicObj, new Integer(i10)}, this, changeQuickRedirect, false, 30787, new Class[]{RecommendedTopicObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str = "onItemClicked, item = " + recommendedTopicObj;
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (RecommendedTopicsController.class.isAnonymousClass()) {
            name = RecommendedTopicsController.class.getName();
            kotlin.jvm.internal.f0.m(name);
        } else {
            name = RecommendedTopicsController.class.getSimpleName();
            kotlin.jvm.internal.f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        A(recommendedTopicObj);
        this.f82742f.getDataList().remove(i10);
        this.f82742f.notifyItemRemoved(i10);
        List<RecommendedTopicObj> dataList = this.f82742f.getDataList();
        if (dataList == null || dataList.isEmpty()) {
            v();
        }
        this.f82737a.w3(recommendedTopicObj);
    }

    private final void y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30791, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.analytics.d.e("4", lb.d.G0, null, null, null, null, true);
    }

    private final void z() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30789, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.analytics.d.e("3", lb.d.F0, null, null, null, null, true);
    }

    @dl.d
    public final RecommendTopicContainer s() {
        return this.f82740d;
    }

    @dl.d
    public final Context t() {
        return this.f82739c;
    }

    public final void w() {
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30786, new Class[0], Void.TYPE).isSupported || this.f82743g) {
            return;
        }
        String content = this.f82737a.getContent();
        String title = this.f82737a.getTitle();
        String strK1 = this.f82737a.k1();
        int length = strK1 != null ? strK1.length() : 0;
        String str = this.f82744h;
        boolean z10 = length != (str != null ? str.length() : 0);
        int length2 = content.length() + title.length();
        String str2 = "onContentChange, newContentLength = " + length2 + ", lastReommendTopicContentLength = " + this.f82745i + ", lastAppIds = " + this.f82744h + ", newAppIds = " + strK1;
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (RecommendedTopicsController.class.isAnonymousClass()) {
            name = RecommendedTopicsController.class.getName();
            kotlin.jvm.internal.f0.m(name);
        } else {
            name = RecommendedTopicsController.class.getSimpleName();
            kotlin.jvm.internal.f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str2);
        aVar.q(sb2.toString());
        r();
        d2 d2Var = this.f82746j;
        if (d2Var != null) {
            d2.a.b(d2Var, null, 1, null);
        }
        if (Math.abs(length2 - this.f82745i) >= 4 || z10) {
            B(strK1, title, content);
        }
    }
}
