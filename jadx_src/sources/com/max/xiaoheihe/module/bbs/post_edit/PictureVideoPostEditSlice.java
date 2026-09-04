package com.max.xiaoheihe.module.bbs.post_edit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbmmkv.MMKVManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicIndexObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.sb0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;

/* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nPictureVideoPostEditSlice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,599:1\n262#2,2:600\n262#2,2:602\n262#2,2:604\n262#2,2:606\n262#2,2:608\n262#2,2:610\n262#2,2:612\n262#2,2:614\n262#2,2:616\n262#2,2:618\n262#2,2:620\n262#2,2:622\n262#2,2:624\n262#2,2:626\n262#2,2:628\n262#2,2:630\n262#2,2:632\n262#2,2:634\n262#2,2:636\n262#2,2:638\n262#2,2:640\n262#2,2:642\n262#2,2:644\n262#2,2:646\n*S KotlinDebug\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice\n*L\n122#1:600,2\n134#1:602,2\n140#1:604,2\n142#1:606,2\n147#1:608,2\n149#1:610,2\n154#1:612,2\n156#1:614,2\n157#1:616,2\n161#1:618,2\n162#1:620,2\n169#1:622,2\n170#1:624,2\n171#1:626,2\n176#1:628,2\n179#1:630,2\n210#1:632,2\n220#1:634,2\n240#1:636,2\n258#1:638,2\n495#1:640,2\n496#1:642,2\n500#1:644,2\n507#1:646,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class PictureVideoPostEditSlice implements com.max.xiaoheihe.module.bbs.post_edit.f {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final a f82511o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f82512p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final String f82513q = "PicturePostEditSlice-dbg";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Activity f82514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final PictureVideoEditPostFragment f82515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final PictureVideoEditPostFragmentViewModel f82516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final PictureVideoEditPostFragment.POST_EDIT_TYPE f82517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private final Boolean f82518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private yh.a<com.max.xiaoheihe.module.bbs.post_edit.d> f82519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final kotlin.z f82520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private df.o f82521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private sb0 f82522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f82523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f82524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.base.adapter.s<BBSTopicObj> f82525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.base.adapter.s<BBSTopicObj> f82526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.base.adapter.s<String> f82527n;

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public final boolean a(@dl.e PictureVideoEditPostFragment.POST_EDIT_TYPE post_edit_type) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{post_edit_type}, this, changeQuickRedirect, false, 30509, new Class[]{PictureVideoEditPostFragment.POST_EDIT_TYPE.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (post_edit_type == PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_VIDEO) {
                return false;
            }
            return ad.a.a(ad.a.f1212s, false);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPictureVideoPostEditSlice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$refreshHashtagTemplateInfoView$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,599:1\n262#2,2:600\n262#2,2:602\n*S KotlinDebug\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$refreshHashtagTemplateInfoView$1\n*L\n192#1:600,2\n196#1:602,2\n*E\n"})
    public static final class a0 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ df.o f82529c;

        a0(df.o oVar) {
            this.f82529c = oVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30554, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            KeyDescObj keyDescObjF = PictureVideoPostEditSlice.this.f82516c.x().f();
            if (keyDescObjF == null) {
                LinearLayout linearLayout = this.f82529c.N;
                kotlin.jvm.internal.f0.o(linearLayout, "viewBinding.vgHashtagTemplateInfo");
                linearLayout.setVisibility(8);
            } else {
                LinearLayout linearLayout2 = this.f82529c.N;
                kotlin.jvm.internal.f0.o(linearLayout2, "viewBinding.vgHashtagTemplateInfo");
                linearLayout2.setVisibility(0);
                com.max.hbimage.b.K(keyDescObjF.getIcon(), this.f82529c.f113992l);
                this.f82529c.B.setText(keyDescObjF.getDesc());
            }
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPictureVideoPostEditSlice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$animViewWithBottomMarginValue$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,599:1\n262#2,2:600\n262#2,2:602\n*S KotlinDebug\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$animViewWithBottomMarginValue$1\n*L\n532#1:600,2\n535#1:602,2\n*E\n"})
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference<View> f82531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f82532d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f82533e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f82534f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f82535g;

        b(WeakReference<View> weakReference, float f10, boolean z10, float f11, yh.a<b2> aVar) {
            this.f82531c = weakReference;
            this.f82532d = f10;
            this.f82533e = z10;
            this.f82534f = f11;
            this.f82535g = aVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator valueAnimator) {
            View view;
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 30510, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(valueAnimator, "valueAnimator");
            if (PictureVideoPostEditSlice.this.f82515b.isActive() && (view = this.f82531c.get()) != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams == null) {
                    return;
                }
                Object animatedValue = valueAnimator.getAnimatedValue();
                Float f10 = animatedValue instanceof Float ? (Float) animatedValue : null;
                float fFloatValue = f10 != null ? f10.floatValue() : this.f82532d;
                marginLayoutParams.bottomMargin = (int) (marginLayoutParams.height * fFloatValue);
                view.setLayoutParams(marginLayoutParams);
                if (this.f82533e && Math.abs(fFloatValue - this.f82534f) <= 0.1f) {
                    view.setVisibility(0);
                }
                if (this.f82533e || Math.abs(fFloatValue - this.f82532d) > 0.1f) {
                    return;
                }
                view.setVisibility(8);
                this.f82535g.invoke();
            }
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class c extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f82536b;

        c(yh.a<b2> aVar) {
            this.f82536b = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 30511, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
            this.f82536b.invoke();
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f82538c;

        d(BBSTopicObj bBSTopicObj) {
            this.f82538c = bBSTopicObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30512, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoPostEditSlice.this.f82516c.M(new com.max.xiaoheihe.module.bbs.post_edit.m.f(this.f82538c, true));
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f82540c;

        e(String str) {
            this.f82540c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30513, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoPostEditSlice.this.f82516c.M(new com.max.xiaoheihe.module.bbs.post_edit.m.a(this.f82540c, false));
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f82542c;

        f(BBSTopicObj bBSTopicObj) {
            this.f82542c = bBSTopicObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30514, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoPostEditSlice.this.f82516c.M(new com.max.xiaoheihe.module.bbs.post_edit.m.f(this.f82542c, false));
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30515, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoPostEditSlice.this.f82516c.M(com.max.xiaoheihe.module.bbs.post_edit.m.g.f83018b);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30516, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoPostEditSlice.this.f82516c.M(com.max.xiaoheihe.module.bbs.post_edit.m.c.f83009b);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30517, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoPostEditSlice.t(PictureVideoPostEditSlice.this);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30518, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoPostEditSlice.this.f82516c.M(com.max.xiaoheihe.module.bbs.post_edit.m.b.f83007b);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30519, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoPostEditSlice.this.f82516c.M(com.max.xiaoheihe.module.bbs.post_edit.m.d.f83011b);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ df.o f82549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PictureVideoPostEditSlice f82550c;

        l(df.o oVar, PictureVideoPostEditSlice pictureVideoPostEditSlice) {
            this.f82549b = oVar;
            this.f82550c = pictureVideoPostEditSlice;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30520, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            FrameLayout vgPostSettingBubble = this.f82549b.P;
            kotlin.jvm.internal.f0.o(vgPostSettingBubble, "vgPostSettingBubble");
            com.max.xiaoheihe.accelworld.s.b(vgPostSettingBubble);
            this.f82550c.f82516c.M(com.max.xiaoheihe.module.bbs.post_edit.m.e.f83013b);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ df.o f82551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PictureVideoPostEditSlice f82552c;

        m(df.o oVar, PictureVideoPostEditSlice pictureVideoPostEditSlice) {
            this.f82551b = oVar;
            this.f82552c = pictureVideoPostEditSlice;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30521, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            FrameLayout vgPostSettingBubble = this.f82551b.P;
            kotlin.jvm.internal.f0.o(vgPostSettingBubble, "vgPostSettingBubble");
            com.max.xiaoheihe.accelworld.s.b(vgPostSettingBubble);
            this.f82552c.f82516c.M(com.max.xiaoheihe.module.bbs.post_edit.m.e.f83013b);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class n extends com.max.hbcommon.base.adapter.s<BBSTopicObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n(Activity activity, ArrayList<BBSTopicObj> arrayList) {
            super(activity, arrayList, R.layout.item_topics_new);
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 30522, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoPostEditSlice.f(PictureVideoPostEditSlice.this, eVar, bBSTopicObj);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 30523, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSTopicObj);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30524, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoPostEditSlice.u(PictureVideoPostEditSlice.this);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class p extends com.max.hbcommon.base.adapter.s<BBSTopicObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        p(Activity activity, ArrayList<BBSTopicObj> arrayList) {
            super(activity, arrayList, R.layout.item_recommended_topic_v2);
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 30525, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoPostEditSlice.d(PictureVideoPostEditSlice.this, eVar, bBSTopicObj);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 30526, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSTopicObj);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class q extends com.max.hbcommon.base.adapter.s<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        q(Activity activity, ArrayList<String> arrayList) {
            super(activity, arrayList, R.layout.item_topics_new);
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 30527, new Class[]{com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoPostEditSlice.e(PictureVideoPostEditSlice.this, eVar, str);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 30528, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, str);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30529, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoPostEditSlice.t(PictureVideoPostEditSlice.this);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class s implements androidx.lifecycle.j0<CharSequence> {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(CharSequence charSequence) {
            if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 30535, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(charSequence);
        }

        public final void b(CharSequence charSequence) {
            if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 30534, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
                return;
            }
            df.o oVar = PictureVideoPostEditSlice.this.f82521h;
            TextView textView = oVar != null ? oVar.G : null;
            if (textView == null) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class t implements androidx.lifecycle.j0<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 30537, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(keyDescObj);
        }

        public final void b(@dl.e KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 30536, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoPostEditSlice.s(PictureVideoPostEditSlice.this);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class u implements androidx.lifecycle.j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 30539, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean bool) {
            if (!PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 30538, new Class[]{Boolean.class}, Void.TYPE).isSupported && PictureVideoPostEditSlice.q(PictureVideoPostEditSlice.this) && kotlin.jvm.internal.f0.g(bool, Boolean.TRUE)) {
                PictureVideoPostEditSlice.r(PictureVideoPostEditSlice.this);
            }
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPictureVideoPostEditSlice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$initViewLiveDataObserver$4\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,599:1\n262#2,2:600\n*S KotlinDebug\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$initViewLiveDataObserver$4\n*L\n411#1:600,2\n*E\n"})
    public static final class v implements androidx.lifecycle.j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 30541, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean isVisible) {
            if (PatchProxy.proxy(new Object[]{isVisible}, this, changeQuickRedirect, false, 30540, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                return;
            }
            sb0 sb0Var = PictureVideoPostEditSlice.this.f82522i;
            View view = sb0Var != null ? sb0Var.f115589u : null;
            if (view == null) {
                return;
            }
            kotlin.jvm.internal.f0.o(isVisible, "isVisible");
            view.setVisibility(isVisible.booleanValue() ? 0 : 8);
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPictureVideoPostEditSlice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$initViewLiveDataObserver$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,599:1\n766#2:600\n857#2,2:601\n*S KotlinDebug\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$initViewLiveDataObserver$5\n*L\n419#1:600\n419#1:601,2\n*E\n"})
    public static final class w implements androidx.lifecycle.j0<Result<BBSTopicIndexObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
        @kotlin.jvm.internal.t0({"SMAP\nPictureVideoPostEditSlice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$initViewLiveDataObserver$5$onChanged$2$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,599:1\n262#2,2:600\n*S KotlinDebug\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$initViewLiveDataObserver$5$onChanged$2$1$1\n*L\n425#1:600,2\n*E\n"})
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PictureVideoPostEditSlice f82565b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecyclerView f82566c;

            a(PictureVideoPostEditSlice pictureVideoPostEditSlice, RecyclerView recyclerView) {
                this.f82565b = pictureVideoPostEditSlice;
                this.f82566c = recyclerView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30544, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                sb0 sb0Var = this.f82565b.f82522i;
                View view = sb0Var != null ? sb0Var.f115590v : null;
                if (view == null) {
                    return;
                }
                PictureVideoPostEditSlice pictureVideoPostEditSlice = this.f82565b;
                RecyclerView run = this.f82566c;
                kotlin.jvm.internal.f0.o(run, "run");
                view.setVisibility(kotlin.jvm.internal.f0.g(PictureVideoPostEditSlice.p(pictureVideoPostEditSlice, run), Boolean.FALSE) ? 0 : 8);
            }
        }

        w() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Result<BBSTopicIndexObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30543, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(result);
        }

        public final void b(Result<BBSTopicIndexObj> result) {
            List<BBSTopicObj> recommend_topics;
            RecyclerView recyclerView;
            BBSTopicIndexObj result2;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30542, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSTopicIndexObj.TopicsListV2Obj topics_list_v2 = (result == null || (result2 = result.getResult()) == null) ? null : result2.getTopics_list_v2();
            if (!PictureVideoPostEditSlice.q(PictureVideoPostEditSlice.this) || topics_list_v2 == null || (recommend_topics = topics_list_v2.getRecommend_topics()) == null) {
                return;
            }
            PictureVideoPostEditSlice pictureVideoPostEditSlice = PictureVideoPostEditSlice.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : recommend_topics) {
                if (!pictureVideoPostEditSlice.f82516c.E((BBSTopicObj) obj)) {
                    arrayList.add(obj);
                }
            }
            PictureVideoPostEditSlice pictureVideoPostEditSlice2 = PictureVideoPostEditSlice.this;
            com.max.hbcommon.base.adapter.s sVar = pictureVideoPostEditSlice2.f82526m;
            if (sVar != null) {
                com.max.hbcommon.base.adapter.d.b(sVar, arrayList, com.max.xiaoheihe.module.bbs.adapter.b.f80312a);
            }
            sb0 sb0Var = pictureVideoPostEditSlice2.f82522i;
            if (sb0Var == null || (recyclerView = sb0Var.f115575g) == null) {
                return;
            }
            recyclerView.post(new a(pictureVideoPostEditSlice2, recyclerView));
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPictureVideoPostEditSlice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$initViewLiveDataObserver$6\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,599:1\n262#2,2:600\n262#2,2:602\n262#2,2:604\n262#2,2:606\n262#2,2:608\n*S KotlinDebug\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$initViewLiveDataObserver$6\n*L\n437#1:600,2\n438#1:602,2\n439#1:604,2\n448#1:606,2\n449#1:608,2\n*E\n"})
    public static final class x implements androidx.lifecycle.j0<List<? extends BBSTopicObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
        @kotlin.jvm.internal.t0({"SMAP\nPictureVideoPostEditSlice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$initViewLiveDataObserver$6$onChanged$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,599:1\n262#2,2:600\n*S KotlinDebug\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$initViewLiveDataObserver$6$onChanged$1$1\n*L\n444#1:600,2\n*E\n"})
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PictureVideoPostEditSlice f82568b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecyclerView f82569c;

            a(PictureVideoPostEditSlice pictureVideoPostEditSlice, RecyclerView recyclerView) {
                this.f82568b = pictureVideoPostEditSlice;
                this.f82569c = recyclerView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30547, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                sb0 sb0Var = this.f82568b.f82522i;
                View view = sb0Var != null ? sb0Var.f115592x : null;
                if (view == null) {
                    return;
                }
                PictureVideoPostEditSlice pictureVideoPostEditSlice = this.f82568b;
                RecyclerView run = this.f82569c;
                kotlin.jvm.internal.f0.o(run, "run");
                view.setVisibility(kotlin.jvm.internal.f0.g(PictureVideoPostEditSlice.p(pictureVideoPostEditSlice, run), Boolean.FALSE) ? 0 : 8);
            }
        }

        x() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(List<? extends BBSTopicObj> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 30546, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(list);
        }

        public final void b(List<? extends BBSTopicObj> checkTopicList) {
            RecyclerView recyclerView;
            if (!PatchProxy.proxy(new Object[]{checkTopicList}, this, changeQuickRedirect, false, 30545, new Class[]{List.class}, Void.TYPE).isSupported && PictureVideoPostEditSlice.q(PictureVideoPostEditSlice.this)) {
                kotlin.jvm.internal.f0.o(checkTopicList, "checkTopicList");
                if (!checkTopicList.isEmpty()) {
                    PictureVideoPostEditSlice.r(PictureVideoPostEditSlice.this);
                    sb0 sb0Var = PictureVideoPostEditSlice.this.f82522i;
                    Group group = sb0Var != null ? sb0Var.f115570b : null;
                    if (group != null) {
                        group.setVisibility(8);
                    }
                    sb0 sb0Var2 = PictureVideoPostEditSlice.this.f82522i;
                    TextView textView = sb0Var2 != null ? sb0Var2.f115578j : null;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    sb0 sb0Var3 = PictureVideoPostEditSlice.this.f82522i;
                    RecyclerView recyclerView2 = sb0Var3 != null ? sb0Var3.f115577i : null;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(0);
                    }
                    com.max.hbcommon.base.adapter.s sVar = PictureVideoPostEditSlice.this.f82525l;
                    if (sVar != null) {
                        com.max.hbcommon.base.adapter.d.b(sVar, checkTopicList, com.max.xiaoheihe.module.bbs.adapter.b.f80312a);
                    }
                    sb0 sb0Var4 = PictureVideoPostEditSlice.this.f82522i;
                    if (sb0Var4 != null && (recyclerView = sb0Var4.f115577i) != null) {
                        recyclerView.post(new a(PictureVideoPostEditSlice.this, recyclerView));
                    }
                } else {
                    sb0 sb0Var5 = PictureVideoPostEditSlice.this.f82522i;
                    TextView textView2 = sb0Var5 != null ? sb0Var5.f115578j : null;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    sb0 sb0Var6 = PictureVideoPostEditSlice.this.f82522i;
                    RecyclerView recyclerView3 = sb0Var6 != null ? sb0Var6.f115577i : null;
                    if (recyclerView3 != null) {
                        recyclerView3.setVisibility(8);
                    }
                }
                sb0 sb0Var7 = PictureVideoPostEditSlice.this.f82522i;
                TextView textView3 = sb0Var7 != null ? sb0Var7.f115583o : null;
                if (textView3 == null) {
                    return;
                }
                textView3.setText(PictureVideoPostEditSlice.this.f82514a.getString(R.string.selected_and_total_available, Integer.valueOf(checkTopicList.size()), 2));
            }
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPictureVideoPostEditSlice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$initViewLiveDataObserver$7\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,599:1\n262#2,2:600\n262#2,2:602\n262#2,2:604\n*S KotlinDebug\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$initViewLiveDataObserver$7\n*L\n464#1:600,2\n465#1:602,2\n474#1:604,2\n*E\n"})
    public static final class y implements androidx.lifecycle.j0<List<? extends String>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
        @kotlin.jvm.internal.t0({"SMAP\nPictureVideoPostEditSlice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$initViewLiveDataObserver$7$onChanged$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,599:1\n262#2,2:600\n*S KotlinDebug\n*F\n+ 1 PictureVideoPostEditSlice.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PictureVideoPostEditSlice$initViewLiveDataObserver$7$onChanged$1$1\n*L\n470#1:600,2\n*E\n"})
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PictureVideoPostEditSlice f82571b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecyclerView f82572c;

            a(PictureVideoPostEditSlice pictureVideoPostEditSlice, RecyclerView recyclerView) {
                this.f82571b = pictureVideoPostEditSlice;
                this.f82572c = recyclerView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30550, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                sb0 sb0Var = this.f82571b.f82522i;
                View view = sb0Var != null ? sb0Var.f115591w : null;
                if (view == null) {
                    return;
                }
                PictureVideoPostEditSlice pictureVideoPostEditSlice = this.f82571b;
                RecyclerView run = this.f82572c;
                kotlin.jvm.internal.f0.o(run, "run");
                view.setVisibility(kotlin.jvm.internal.f0.g(PictureVideoPostEditSlice.p(pictureVideoPostEditSlice, run), Boolean.FALSE) ? 0 : 8);
            }
        }

        y() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(List<? extends String> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 30549, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(list);
        }

        public final void b(List<String> checkedHashtagList) {
            RecyclerView recyclerView;
            if (!PatchProxy.proxy(new Object[]{checkedHashtagList}, this, changeQuickRedirect, false, 30548, new Class[]{List.class}, Void.TYPE).isSupported && PictureVideoPostEditSlice.q(PictureVideoPostEditSlice.this)) {
                kotlin.jvm.internal.f0.o(checkedHashtagList, "checkedHashtagList");
                if (!checkedHashtagList.isEmpty()) {
                    PictureVideoPostEditSlice.r(PictureVideoPostEditSlice.this);
                    sb0 sb0Var = PictureVideoPostEditSlice.this.f82522i;
                    Group group = sb0Var != null ? sb0Var.f115570b : null;
                    if (group != null) {
                        group.setVisibility(8);
                    }
                    sb0 sb0Var2 = PictureVideoPostEditSlice.this.f82522i;
                    Group group2 = sb0Var2 != null ? sb0Var2.f115571c : null;
                    if (group2 != null) {
                        group2.setVisibility(0);
                    }
                    com.max.hbcommon.base.adapter.s sVar = PictureVideoPostEditSlice.this.f82527n;
                    if (sVar != null) {
                        com.max.hbcommon.base.adapter.d.b(sVar, checkedHashtagList, com.max.xiaoheihe.module.bbs.adapter.j.f80522a);
                    }
                    sb0 sb0Var3 = PictureVideoPostEditSlice.this.f82522i;
                    if (sb0Var3 != null && (recyclerView = sb0Var3.f115576h) != null) {
                        recyclerView.post(new a(PictureVideoPostEditSlice.this, recyclerView));
                    }
                } else {
                    sb0 sb0Var4 = PictureVideoPostEditSlice.this.f82522i;
                    Group group3 = sb0Var4 != null ? sb0Var4.f115571c : null;
                    if (group3 != null) {
                        group3.setVisibility(8);
                    }
                }
                sb0 sb0Var5 = PictureVideoPostEditSlice.this.f82522i;
                TextView textView = sb0Var5 != null ? sb0Var5.f115579k : null;
                if (textView == null) {
                    return;
                }
                textView.setText(PictureVideoPostEditSlice.this.f82514a.getString(R.string.selected_and_total_available, Integer.valueOf(checkedHashtagList.size()), 5));
            }
        }
    }

    /* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
    public static final class z implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f82573b;

        z(ImageView imageView) {
            this.f82573b = imageView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ImageView imageView;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30553, new Class[]{View.class}, Void.TYPE).isSupported || (imageView = this.f82573b) == null) {
                return;
            }
            imageView.performClick();
        }
    }

    public PictureVideoPostEditSlice(@dl.d Activity hostContext, @dl.d PictureVideoEditPostFragment hostFragment, @dl.d PictureVideoEditPostFragmentViewModel hostFragmentViewModel, @dl.e PictureVideoEditPostFragment.POST_EDIT_TYPE post_edit_type, @dl.e Boolean bool) {
        kotlin.jvm.internal.f0.p(hostContext, "hostContext");
        kotlin.jvm.internal.f0.p(hostFragment, "hostFragment");
        kotlin.jvm.internal.f0.p(hostFragmentViewModel, "hostFragmentViewModel");
        this.f82514a = hostContext;
        this.f82515b = hostFragment;
        this.f82516c = hostFragmentViewModel;
        this.f82517d = post_edit_type;
        this.f82518e = bool;
        this.f82520g = kotlin.b0.c(new yh.a<Boolean>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PictureVideoPostEditSlice$isNewTopicHashtagEntryEnabled$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Boolean a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30551, new Class[0], Boolean.class);
                return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(PictureVideoPostEditSlice.f82511o.a(this.f82546b.f82517d));
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Boolean invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30552, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
    }

    @xh.m
    public static final boolean A(@dl.e PictureVideoEditPostFragment.POST_EDIT_TYPE post_edit_type) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{post_edit_type}, null, changeQuickRedirect, true, 30499, new Class[]{PictureVideoEditPostFragment.POST_EDIT_TYPE.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f82511o.a(post_edit_type);
    }

    private final void B(df.o oVar) {
        if (PatchProxy.proxy(new Object[]{oVar}, this, changeQuickRedirect, false, 30484, new Class[]{df.o.class}, Void.TYPE).isSupported) {
            return;
        }
        RelativeLayout llAdditonCard = oVar.f113997q;
        kotlin.jvm.internal.f0.o(llAdditonCard, "llAdditonCard");
        llAdditonCard.setVisibility(0);
        LinearLayout vgTopicNew = oVar.R;
        kotlin.jvm.internal.f0.o(vgTopicNew, "vgTopicNew");
        vgTopicNew.setVisibility(0);
        LinearLayout vgAddTopicsNew = oVar.K;
        kotlin.jvm.internal.f0.o(vgAddTopicsNew, "vgAddTopicsNew");
        vgAddTopicsNew.setVisibility(0);
        oVar.K.setOnClickListener(new g());
        LinearLayout vgHashtagTemplateInfo = oVar.N;
        kotlin.jvm.internal.f0.o(vgHashtagTemplateInfo, "vgHashtagTemplateInfo");
        vgHashtagTemplateInfo.setVisibility(8);
        if (J()) {
            RelativeLayout llAdditonCard2 = oVar.f113997q;
            kotlin.jvm.internal.f0.o(llAdditonCard2, "llAdditonCard");
            llAdditonCard2.setVisibility(8);
        }
    }

    private final void C(df.o oVar) {
        if (PatchProxy.proxy(new Object[]{oVar}, this, changeQuickRedirect, false, 30482, new Class[]{df.o.class}, Void.TYPE).isSupported) {
            return;
        }
        oVar.f113989i.setOnClickListener(new h());
        oVar.f113991k.setOnClickListener(new i());
        ImageView ivHashtagEntry = oVar.f113991k;
        kotlin.jvm.internal.f0.o(ivHashtagEntry, "ivHashtagEntry");
        ivHashtagEntry.setVisibility(J() ? 0 : 8);
        oVar.f113988h.setOnClickListener(new j());
        oVar.f113988h.setVisibility(this.f82517d == PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_VIDEO ? 8 : 0);
        oVar.f113990j.setOnClickListener(new k());
        LinearLayout llButtonContainer = oVar.f113998r;
        kotlin.jvm.internal.f0.o(llButtonContainer, "llButtonContainer");
        llButtonContainer.setVisibility(true ^ J() ? 0 : 8);
    }

    private final void D(df.o oVar) {
        if (PatchProxy.proxy(new Object[]{oVar}, this, changeQuickRedirect, false, 30483, new Class[]{df.o.class}, Void.TYPE).isSupported) {
            return;
        }
        FrameLayout vgPostSettingBubble = oVar.P;
        kotlin.jvm.internal.f0.o(vgPostSettingBubble, "vgPostSettingBubble");
        vgPostSettingBubble.setVisibility(8);
        if (this.f82517d == PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_PICTURE && kotlin.jvm.internal.f0.g(this.f82518e, Boolean.TRUE)) {
            ImageView ivSetting = oVar.f113995o;
            kotlin.jvm.internal.f0.o(ivSetting, "ivSetting");
            ivSetting.setVisibility(0);
            oVar.f113995o.setOnClickListener(new l(oVar, this));
            TextView tvTotalTextNum = oVar.G;
            kotlin.jvm.internal.f0.o(tvTotalTextNum, "tvTotalTextNum");
            tvTotalTextNum.setVisibility(8);
        } else if (this.f82517d == PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_VIDEO && kotlin.jvm.internal.f0.g(this.f82518e, Boolean.TRUE)) {
            ImageView ivSetting2 = oVar.f113995o;
            kotlin.jvm.internal.f0.o(ivSetting2, "ivSetting");
            ivSetting2.setVisibility(0);
            oVar.f113995o.setOnClickListener(new m(oVar, this));
            TextView tvTotalTextNum2 = oVar.G;
            kotlin.jvm.internal.f0.o(tvTotalTextNum2, "tvTotalTextNum");
            tvTotalTextNum2.setVisibility(0);
        } else {
            ImageView ivSetting3 = oVar.f113995o;
            kotlin.jvm.internal.f0.o(ivSetting3, "ivSetting");
            ivSetting3.setVisibility(8);
            TextView tvTotalTextNum3 = oVar.G;
            kotlin.jvm.internal.f0.o(tvTotalTextNum3, "tvTotalTextNum");
            tvTotalTextNum3.setVisibility(0);
        }
        if (J()) {
            TextView tvTotalTextNum4 = oVar.G;
            kotlin.jvm.internal.f0.o(tvTotalTextNum4, "tvTotalTextNum");
            tvTotalTextNum4.setVisibility(8);
            ImageView ivSetting4 = oVar.f113995o;
            kotlin.jvm.internal.f0.o(ivSetting4, "ivSetting");
            ivSetting4.setVisibility(8);
        }
    }

    private final void E(df.o oVar) {
        if (!PatchProxy.proxy(new Object[]{oVar}, this, changeQuickRedirect, false, 30486, new Class[]{df.o.class}, Void.TYPE).isSupported && J()) {
            sb0 sb0VarA = sb0.a(oVar.T.inflate());
            this.f82522i = sb0VarA;
            kotlin.jvm.internal.f0.o(sb0VarA, "bind(inflatedViewStubVie…tryBinding = it\n        }");
            LinearLayout llSelectedTopic = sb0VarA.f115574f;
            kotlin.jvm.internal.f0.o(llSelectedTopic, "llSelectedTopic");
            llSelectedTopic.setVisibility(0);
            sb0VarA.f115583o.setText(this.f82514a.getString(R.string.selected_and_total_available, 0, 2));
            sb0VarA.f115583o.setTypeface(bb.d.a().b(2));
            TextView textView = sb0VarA.f115582n;
            com.max.hbresource.a aVar = com.max.hbresource.a.f71893a;
            int i10 = com.max.hbresource.a.f71895c;
            textView.setTypeface(aVar.a(i10));
            TextView tvEmptySelectedTopicTip = sb0VarA.f115578j;
            kotlin.jvm.internal.f0.o(tvEmptySelectedTopicTip, "tvEmptySelectedTopicTip");
            tvEmptySelectedTopicTip.setVisibility(0);
            n nVar = new n(this.f82514a, new ArrayList());
            this.f82525l = nVar;
            sb0VarA.f115577i.setAdapter(nVar);
            sb0VarA.f115577i.setLayoutManager(new LinearLayoutManager(this.f82514a, 0, false));
            if (sb0VarA.f115577i.getItemDecorationCount() <= 0) {
                sb0VarA.f115577i.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.f82514a, 6.0f), 0));
            }
            sb0VarA.f115574f.setOnClickListener(new o());
            Group groupRecommendTopics = sb0VarA.f115570b;
            kotlin.jvm.internal.f0.o(groupRecommendTopics, "groupRecommendTopics");
            groupRecommendTopics.setVisibility(0);
            p pVar = new p(this.f82514a, new ArrayList());
            this.f82526m = pVar;
            sb0VarA.f115575g.setAdapter(pVar);
            sb0VarA.f115575g.setItemAnimator(null);
            sb0VarA.f115575g.setLayoutManager(new LinearLayoutManager(this.f82514a, 0, false));
            if (sb0VarA.f115575g.getItemDecorationCount() <= 0) {
                sb0VarA.f115575g.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.f82514a, 6.0f), 0));
            }
            Group groupSelectedHashtags = sb0VarA.f115571c;
            kotlin.jvm.internal.f0.o(groupSelectedHashtags, "groupSelectedHashtags");
            groupSelectedHashtags.setVisibility(8);
            sb0VarA.f115579k.setText(this.f82514a.getString(R.string.selected_and_total_available, 0, 5));
            sb0VarA.f115579k.setTypeface(bb.d.a().b(2));
            sb0VarA.f115581m.setTypeface(aVar.a(i10));
            q qVar = new q(this.f82514a, new ArrayList());
            this.f82527n = qVar;
            sb0VarA.f115576h.setAdapter(qVar);
            sb0VarA.f115576h.setLayoutManager(new LinearLayoutManager(this.f82514a, 0, false));
            if (sb0VarA.f115576h.getItemDecorationCount() <= 0) {
                sb0VarA.f115576h.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.f82514a, 6.0f), 0));
            }
            sb0VarA.f115585q.setOnClickListener(new r());
        }
    }

    private final void F(ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 30481, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        df.o oVarA = df.o.a(viewGroup);
        this.f82521h = oVarA;
        if (oVarA == null) {
            return;
        }
        C(oVarA);
        D(oVarA);
        B(oVarA);
        E(oVarA);
    }

    private final void G() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30496, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel = this.f82516c;
        String str = MainActivity.E4 ? "1" : null;
        Bundle arguments = this.f82515b.getArguments();
        pictureVideoEditPostFragmentViewModel.Q("list", null, str, arguments != null ? arguments.getString("h_src", "") : null, J() ? "1" : null, new PictureVideoPostEditSlice$initSliceViewData$1(this.f82515b));
        if (J()) {
            PictureVideoEditPostFragmentViewModel pictureVideoEditPostFragmentViewModel2 = this.f82516c;
            yh.a<com.max.xiaoheihe.module.bbs.post_edit.d> aVar = this.f82519f;
            pictureVideoEditPostFragmentViewModel2.T(aVar != null ? aVar.invoke() : null, new PictureVideoPostEditSlice$initSliceViewData$2(this.f82515b));
        }
    }

    private final void H() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30492, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f82516c.t().k(this.f82515b, new s());
        this.f82516c.x().k(this.f82515b, new t());
        this.f82516c.p().k(this.f82515b, new u());
        this.f82516c.u().k(this.f82515b, new v());
        this.f82516c.z().k(this.f82515b, new w());
        this.f82516c.s().k(this.f82515b, new x());
        this.f82516c.r().k(this.f82515b, new y());
    }

    private final Boolean I(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 30498, new Class[]{RecyclerView.class}, Boolean.class);
        if (patchProxyResultProxy.isSupported) {
            return (Boolean) patchProxyResultProxy.result;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (adapter = recyclerView.getAdapter()) == null) {
            return null;
        }
        return Boolean.valueOf(linearLayoutManager.findLastCompletelyVisibleItemPosition() >= adapter.getItemCount() - 1);
    }

    private final boolean J() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30479, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : ((Boolean) this.f82520g.getValue()).booleanValue();
    }

    private final void K() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30493, new Class[0], Void.TYPE).isSupported || this.f82524k) {
            return;
        }
        this.f82524k = true;
        df.o oVar = this.f82521h;
        LinearLayout linearLayout = oVar != null ? oVar.f113998r : null;
        sb0 sb0Var = this.f82522i;
        View view = sb0Var != null ? sb0Var.f115586r : null;
        ImageView imageView = oVar != null ? oVar.f113995o : null;
        FrameLayout frameLayout = oVar != null ? oVar.P : null;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        if (view != null) {
            view.setVisibility(0);
        }
        if (this.f82517d == PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_PICTURE && kotlin.jvm.internal.f0.g(this.f82518e, Boolean.TRUE)) {
            if (MMKVManager.f71329a.d(ad.e.f1248a, ad.e.f1253f, true, false) && frameLayout != null) {
                frameLayout.setVisibility(0);
                com.max.xiaoheihe.accelworld.s.c(frameLayout);
                frameLayout.setOnClickListener(new z(imageView));
            }
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(0);
        }
    }

    private final void L() {
        df.o oVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30485, new Class[0], Void.TYPE).isSupported || (oVar = this.f82521h) == null) {
            return;
        }
        oVar.N.post(new a0(oVar));
    }

    private final void M() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30491, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PicPostTopicOrHashtagChooseFragment.f82271y.a(false, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PictureVideoPostEditSlice$startEnterNewHashtagSelectEntry$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30556, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30555, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f82559b.f82515b.n8(false);
            }
        }).M3(this.f82515b.getChildFragmentManager(), "");
        this.f82515b.n8(true);
    }

    private final void N() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30490, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PicPostTopicOrHashtagChooseFragment.f82271y.a(true, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PictureVideoPostEditSlice$startEnterNewTopicSelectEntry$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30558, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30557, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f82560b.f82515b.n8(false);
            }
        }).M3(this.f82515b.getChildFragmentManager(), "");
        this.f82515b.n8(true);
    }

    public static final /* synthetic */ void d(PictureVideoPostEditSlice pictureVideoPostEditSlice, com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{pictureVideoPostEditSlice, eVar, bBSTopicObj}, null, changeQuickRedirect, true, 30507, new Class[]{PictureVideoPostEditSlice.class, com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoPostEditSlice.x(eVar, bBSTopicObj);
    }

    public static final /* synthetic */ void e(PictureVideoPostEditSlice pictureVideoPostEditSlice, com.max.hbcommon.base.adapter.s.e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{pictureVideoPostEditSlice, eVar, str}, null, changeQuickRedirect, true, 30508, new Class[]{PictureVideoPostEditSlice.class, com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoPostEditSlice.y(eVar, str);
    }

    public static final /* synthetic */ void f(PictureVideoPostEditSlice pictureVideoPostEditSlice, com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{pictureVideoPostEditSlice, eVar, bBSTopicObj}, null, changeQuickRedirect, true, 30505, new Class[]{PictureVideoPostEditSlice.class, com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoPostEditSlice.z(eVar, bBSTopicObj);
    }

    public static final /* synthetic */ Boolean p(PictureVideoPostEditSlice pictureVideoPostEditSlice, RecyclerView recyclerView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pictureVideoPostEditSlice, recyclerView}, null, changeQuickRedirect, true, 30503, new Class[]{PictureVideoPostEditSlice.class, RecyclerView.class}, Boolean.class);
        return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : pictureVideoPostEditSlice.I(recyclerView);
    }

    public static final /* synthetic */ boolean q(PictureVideoPostEditSlice pictureVideoPostEditSlice) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pictureVideoPostEditSlice}, null, changeQuickRedirect, true, 30501, new Class[]{PictureVideoPostEditSlice.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : pictureVideoPostEditSlice.J();
    }

    public static final /* synthetic */ void r(PictureVideoPostEditSlice pictureVideoPostEditSlice) {
        if (PatchProxy.proxy(new Object[]{pictureVideoPostEditSlice}, null, changeQuickRedirect, true, 30502, new Class[]{PictureVideoPostEditSlice.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoPostEditSlice.K();
    }

    public static final /* synthetic */ void s(PictureVideoPostEditSlice pictureVideoPostEditSlice) {
        if (PatchProxy.proxy(new Object[]{pictureVideoPostEditSlice}, null, changeQuickRedirect, true, 30500, new Class[]{PictureVideoPostEditSlice.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoPostEditSlice.L();
    }

    public static final /* synthetic */ void t(PictureVideoPostEditSlice pictureVideoPostEditSlice) {
        if (PatchProxy.proxy(new Object[]{pictureVideoPostEditSlice}, null, changeQuickRedirect, true, 30504, new Class[]{PictureVideoPostEditSlice.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoPostEditSlice.M();
    }

    public static final /* synthetic */ void u(PictureVideoPostEditSlice pictureVideoPostEditSlice) {
        if (PatchProxy.proxy(new Object[]{pictureVideoPostEditSlice}, null, changeQuickRedirect, true, 30506, new Class[]{PictureVideoPostEditSlice.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureVideoPostEditSlice.N();
    }

    private final void v(View view, boolean z10, long j10, long j11, yh.a<b2> aVar) {
        Object[] objArr = {view, new Byte(z10 ? (byte) 1 : (byte) 0), new Long(j10), new Long(j11), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30494, new Class[]{View.class, Boolean.TYPE, cls, cls, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        WeakReference weakReference = new WeakReference(view);
        float f10 = z10 ? -1.0f : 0.0f;
        float f11 = z10 ? 0.0f : -1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        valueAnimatorOfFloat.addUpdateListener(new b(weakReference, f11, z10, f10, aVar));
        valueAnimatorOfFloat.addListener(new c(aVar));
        valueAnimatorOfFloat.setStartDelay(j10);
        valueAnimatorOfFloat.setDuration(j11);
        valueAnimatorOfFloat.start();
    }

    static /* synthetic */ void w(PictureVideoPostEditSlice pictureVideoPostEditSlice, View view, boolean z10, long j10, long j11, yh.a aVar, int i10, Object obj) {
        long j12 = j11;
        Object[] objArr = {pictureVideoPostEditSlice, view, new Byte(z10 ? (byte) 1 : (byte) 0), new Long(j10), new Long(j12), aVar, new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 30495, new Class[]{PictureVideoPostEditSlice.class, View.class, Boolean.TYPE, cls, cls, yh.a.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        long j13 = (i10 & 4) != 0 ? 100L : j10;
        if ((i10 & 8) != 0) {
            j12 = 100;
        }
        pictureVideoPostEditSlice.v(view, z10, j13, j12, aVar);
    }

    private final void x(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 30488, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported || eVar == null || bBSTopicObj == null) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_topic_icon);
        if (imageView != null) {
            com.max.hbimage.b.K(bBSTopicObj.getPic_url(), imageView);
        }
        TextView textView = (TextView) eVar.i(R.id.tv_topic_name);
        if (textView != null) {
            textView.setText(bBSTopicObj.getName());
        }
        View viewB = eVar.b();
        if (viewB != null) {
            viewB.setOnClickListener(new d(bBSTopicObj));
        }
    }

    private final void y(com.max.hbcommon.base.adapter.s.e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 30489, new Class[]{com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported || eVar == null || str == null) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_topic_icon);
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                kotlin.jvm.internal.f0.o(layoutParams, "layoutParams");
                layoutParams.width = ViewUtils.f(this.f82514a, 10.0f);
                layoutParams.height = ViewUtils.f(this.f82514a, 10.0f);
            } else {
                layoutParams = null;
            }
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.bbs_topic_filled_24x24);
            imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
        }
        TextView textView = (TextView) eVar.i(R.id.tv_topic_name);
        if (textView != null) {
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
            textView.setText(str);
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        }
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_close);
        if (imageView2 != null) {
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.leftMargin = ViewUtils.f(this.f82514a, 2.0f);
            } else {
                marginLayoutParams2 = null;
            }
            imageView2.setLayoutParams(marginLayoutParams2);
        }
        View viewB = eVar.b();
        if (viewB != null) {
            ViewGroup.LayoutParams layoutParams3 = viewB.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.setMarginEnd(0);
                marginLayoutParams = marginLayoutParams3;
            }
            viewB.setLayoutParams(marginLayoutParams);
            viewB.setPadding(ViewUtils.f(this.f82514a, 6.0f), 0, ViewUtils.f(this.f82514a, 8.0f), 0);
            viewB.setOnClickListener(new e(str));
        }
    }

    private final void z(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 30487, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported || eVar == null || bBSTopicObj == null) {
            return;
        }
        int iF = ViewUtils.f(this.f82514a, 15.0f);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_topic_icon);
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                kotlin.jvm.internal.f0.o(layoutParams, "layoutParams");
                layoutParams.width = iF;
                layoutParams.height = iF;
            } else {
                layoutParams = null;
            }
            imageView.setLayoutParams(layoutParams);
            com.max.hbimage.b.K(bBSTopicObj.getPic_url(), imageView);
        }
        TextView textView = (TextView) eVar.i(R.id.tv_topic_name);
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.leftMargin = ViewUtils.f(this.f82514a, 4.0f);
            } else {
                marginLayoutParams2 = null;
            }
            textView.setLayoutParams(marginLayoutParams2);
            textView.setText(bBSTopicObj.getName());
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        }
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_close);
        if (imageView2 != null) {
            imageView2.setColorFilter(this.f82514a.getColor(R.color.text_secondary_2_color));
        }
        View viewB = eVar.b();
        if (viewB != null) {
            ViewGroup.LayoutParams layoutParams3 = viewB.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.setMarginEnd(0);
                marginLayoutParams = marginLayoutParams3;
            }
            viewB.setLayoutParams(marginLayoutParams);
            viewB.setPadding(ViewUtils.f(this.f82514a, 4.0f), 0, ViewUtils.f(this.f82514a, 6.0f), 0);
            viewB.setOnClickListener(new f(bBSTopicObj));
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.f
    public void a() {
        this.f82521h = null;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.f
    public void b(@dl.d yh.a<com.max.xiaoheihe.module.bbs.post_edit.d> onGetEditingData) {
        if (PatchProxy.proxy(new Object[]{onGetEditingData}, this, changeQuickRedirect, false, 30497, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(onGetEditingData, "onGetEditingData");
        this.f82519f = onGetEditingData;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.f
    public void c(@dl.e ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 30480, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        if (viewGroup == null) {
            com.max.heybox.hblog.g.f74531b.v("[PicturePostEditSlice-dbg][initSlice] hostContentViewGroup should not be null!");
            return;
        }
        if (this.f82523j) {
            com.max.heybox.hblog.g.f74531b.v("[PicturePostEditSlice-dbg][initSlice] slice should only init once!");
            return;
        }
        this.f82523j = true;
        G();
        F(viewGroup);
        H();
    }
}
