package com.max.xiaoheihe.module.account;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbcustomview.CubicBezierInterpolators;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbcustomview.recyclerview.UpdateInsetsGridLayoutManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.InterestProfileGroupObj;
import com.max.xiaoheihe.bean.account.InterestProfileObj;
import com.max.xiaoheihe.bean.account.InterestProfileTopicResult;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.TopicWrapper;
import com.max.xiaoheihe.module.game.EpicAddFreeGamesV2Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import com.xiaomi.mipush.sdk.Constants;
import df.ap;
import df.qe;
import df.y0;
import df.zo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: InterestInitV2Activity.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.jvm.internal.t0({"SMAP\nInterestInitV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterestInitV2Activity.kt\ncom/max/xiaoheihe/module/account/InterestInitV2Activity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,781:1\n766#2:782\n857#2,2:783\n766#2:785\n857#2,2:786\n1855#2,2:788\n1855#2,2:790\n1855#2,2:792\n*S KotlinDebug\n*F\n+ 1 InterestInitV2Activity.kt\ncom/max/xiaoheihe/module/account/InterestInitV2Activity\n*L\n521#1:782\n521#1:783,2\n598#1:785\n598#1:786,2\n630#1:788,2\n638#1:790,2\n645#1:792,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class InterestInitV2Activity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @dl.d
    private static final String f77934p3 = "arg_profile";
    private final int M;
    private y0 O;
    private int P;
    private com.max.hbcommon.base.adapter.s<InterestProfileGroupObj> S;
    private com.max.hbcommon.base.adapter.u<TopicWrapper> T;
    private InterestProfileObj U;

    @dl.e
    private InterestProfileTopicResult V;
    private int X;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f77937b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f77938c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.e
    private RecyclerView.ItemDecoration f77939p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.e
    private LoadingDialog f77940p2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private long f77941x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.e
    private TextView f77943y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @dl.d
    public static final a f77935y2 = new a(null);
    public static final int G2 = 8;
    private final int L = 8;
    private final int N = 101;

    @dl.d
    private final ArrayList<InterestProfileGroupObj> Q = new ArrayList<>();

    @dl.d
    private final ArrayList<TopicWrapper> R = new ArrayList<>();

    @dl.d
    private ArrayList<String> W = new ArrayList<>();

    @dl.d
    private Paint Y = new Paint();

    @dl.d
    private final String Z = "为你推荐";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    private final String f77936a0 = "近期热门";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f77942x2 = 8;

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.e Context context, @dl.e InterestProfileObj interestProfileObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, interestProfileObj}, this, changeQuickRedirect, false, 23197, new Class[]{Context.class, InterestProfileObj.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            Intent intent = new Intent(context, (Class<?>) InterestInitV2Activity.class);
            intent.putExtra("arg_profile", interestProfileObj);
            return intent;
        }
    }

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23198, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            InterestInitV2Activity.m2(InterestInitV2Activity.this, true);
            InterestInitV2Activity.p2(InterestInitV2Activity.this);
        }
    }

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<InterestProfileTopicResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 23199, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (InterestInitV2Activity.this.isActive()) {
                InterestInitV2Activity.f2(InterestInitV2Activity.this);
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<InterestProfileTopicResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23200, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (InterestInitV2Activity.this.isActive()) {
                InterestInitV2Activity.f2(InterestInitV2Activity.this);
                InterestInitV2Activity.this.V = result.getResult();
                InterestInitV2Activity.l2(InterestInitV2Activity.this);
                com.max.hbcommon.base.adapter.u uVar = InterestInitV2Activity.this.T;
                if (uVar == null) {
                    kotlin.jvm.internal.f0.S("mTopicAdapter");
                    uVar = null;
                }
                uVar.notifyDataSetChanged();
                InterestInitV2Activity.m2(InterestInitV2Activity.this, false);
                InterestInitV2Activity.o2(InterestInitV2Activity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23201, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<InterestProfileTopicResult>) obj);
        }
    }

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class d extends com.max.hbcommon.base.adapter.s<InterestProfileGroupObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: InterestInitV2Activity.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterestInitV2Activity f77947b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterestProfileGroupObj f77948c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<zo> f77949d;

            a(InterestInitV2Activity interestInitV2Activity, InterestProfileGroupObj interestProfileGroupObj, Ref.ObjectRef<zo> objectRef) {
                this.f77947b = interestInitV2Activity;
                this.f77948c = interestProfileGroupObj;
                this.f77949d = objectRef;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23206, new Class[]{View.class}, Void.TYPE).isSupported && System.currentTimeMillis() - this.f77947b.f77941x1 >= 300) {
                    this.f77947b.f77941x1 = System.currentTimeMillis();
                    InterestProfileGroupObj interestProfileGroupObj = this.f77948c;
                    interestProfileGroupObj.setCustom_checked(true ^ interestProfileGroupObj.getCustom_checked());
                    InterestInitV2Activity interestInitV2Activity = this.f77947b;
                    ImageView imageView = this.f77949d.f124891b.f118414d;
                    kotlin.jvm.internal.f0.o(imageView, "itemBinding.ivGroupIconBg");
                    TextView textView = this.f77949d.f124891b.f118415e;
                    kotlin.jvm.internal.f0.o(textView, "itemBinding.tvGroupName");
                    InterestInitV2Activity.q2(interestInitV2Activity, imageView, textView, this.f77948c.getCustom_checked(), com.max.xiaoheihe.utils.d.e1(this.f77948c.getBg_color()));
                }
            }
        }

        d(Activity activity, ArrayList<InterestProfileGroupObj> arrayList) {
            super(activity, arrayList, R.layout.item_interest_group_v5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v2, types: [T, df.zo, java.lang.Object] */
        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d InterestProfileGroupObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 23204, new Class[]{com.max.hbcommon.base.adapter.s.e.class, InterestProfileGroupObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? A = zo.a(viewHolder.itemView);
            kotlin.jvm.internal.f0.o(A, "bind(viewHolder.itemView)");
            objectRef.f124891b = A;
            com.max.hbimage.b.K(data.getIcon(), ((zo) objectRef.f124891b).f118413c);
            ((zo) objectRef.f124891b).f118415e.setText(data.getGroup_name());
            ((zo) objectRef.f124891b).f118412b.setBackgroundColor(com.max.xiaoheihe.utils.d.e1(data.getBg_color()));
            ((zo) objectRef.f124891b).f118414d.setBackground(com.max.hbutils.utils.q.v(((BaseActivity) InterestInitV2Activity.this).f66601b, com.max.xiaoheihe.utils.d.e1(data.getBg_color()), 5.0f));
            if (data.getCustom_checked()) {
                ((zo) objectRef.f124891b).f118414d.setScaleX(10.0f);
                ((zo) objectRef.f124891b).f118414d.setScaleY(10.0f);
                ((zo) objectRef.f124891b).f118415e.setTextColor(((BaseActivity) InterestInitV2Activity.this).f66601b.getResources().getColor(R.color.background_layer_2_color));
            } else {
                ((zo) objectRef.f124891b).f118414d.setScaleX(1.0f);
                ((zo) objectRef.f124891b).f118414d.setScaleY(1.0f);
                ((zo) objectRef.f124891b).f118415e.setTextColor(((BaseActivity) InterestInitV2Activity.this).f66601b.getResources().getColor(R.color.text_primary_1_color));
            }
            ((zo) objectRef.f124891b).b().setOnClickListener(new a(InterestInitV2Activity.this, data, objectRef));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, InterestProfileGroupObj interestProfileGroupObj) {
            if (PatchProxy.proxy(new Object[]{eVar, interestProfileGroupObj}, this, changeQuickRedirect, false, 23205, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, interestProfileGroupObj);
        }
    }

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class e extends com.max.hbcommon.base.adapter.u<TopicWrapper> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: InterestInitV2Activity.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterestInitV2Activity f77951b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f77952c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ BBSTopicObj f77953d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ e f77954e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ ap f77955f;

            a(InterestInitV2Activity interestInitV2Activity, com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj, e eVar2, ap apVar) {
                this.f77951b = interestInitV2Activity;
                this.f77952c = eVar;
                this.f77953d = bBSTopicObj;
                this.f77954e = eVar2;
                this.f77955f = apVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23211, new Class[]{View.class}, Void.TYPE).isSupported && System.currentTimeMillis() - this.f77951b.f77941x1 >= 300) {
                    this.f77951b.f77941x1 = System.currentTimeMillis();
                    int adapterPosition = this.f77952c.getAdapterPosition();
                    if (this.f77951b.W.contains(this.f77953d.getTopic_id())) {
                        this.f77951b.W.remove(this.f77953d.getTopic_id());
                        int i10 = this.f77951b.f77938c0;
                        InterestInitV2Activity.r2(this.f77951b, adapterPosition, i10);
                        this.f77954e.notifyItemMoved(adapterPosition, i10);
                        InterestInitV2Activity.x2(this.f77951b);
                        com.max.xiaoheihe.module.bbs.adapter.v vVar = com.max.xiaoheihe.module.bbs.adapter.v.f80640a;
                        Activity mContext = ((BaseActivity) this.f77951b).f66601b;
                        kotlin.jvm.internal.f0.o(mContext, "mContext");
                        vVar.e(mContext, false, this.f77955f);
                    } else {
                        if (this.f77951b.W.size() >= this.f77951b.f77942x2) {
                            com.max.hbutils.utils.c.f("偏好已满");
                            return;
                        }
                        this.f77951b.W.add(this.f77953d.getTopic_id());
                        int i11 = this.f77951b.f77937b0;
                        InterestInitV2Activity.r2(this.f77951b, adapterPosition, i11);
                        this.f77954e.notifyItemMoved(adapterPosition, i11);
                        InterestInitV2Activity.x2(this.f77951b);
                        com.max.xiaoheihe.module.bbs.adapter.v vVar2 = com.max.xiaoheihe.module.bbs.adapter.v.f80640a;
                        Activity mContext2 = ((BaseActivity) this.f77951b).f66601b;
                        kotlin.jvm.internal.f0.o(mContext2, "mContext");
                        vVar2.e(mContext2, true, this.f77955f);
                    }
                    TextView textView = this.f77951b.f77943y1;
                    if (textView == null) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f77951b.W.size());
                    sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
                    sb2.append(this.f77951b.f77942x2);
                    textView.setText(sb2.toString());
                }
            }
        }

        e(Activity activity, ArrayList<TopicWrapper> arrayList) {
            super(activity, arrayList);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, TopicWrapper topicWrapper) {
            Object[] objArr = {new Integer(i10), topicWrapper};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23210, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, topicWrapper);
        }

        public int n(int i10, @dl.d TopicWrapper data) {
            Object[] objArr = {new Integer(i10), data};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23208, new Class[]{cls, TopicWrapper.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            kotlin.jvm.internal.f0.p(data, "data");
            return data.getTopic() != null ? R.layout.item_interest_init_topic : R.layout.item_interest_init_topic_title;
        }

        public void o(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TopicWrapper wrapper) {
            if (PatchProxy.proxy(new Object[]{viewHolder, wrapper}, this, changeQuickRedirect, false, 23207, new Class[]{com.max.hbcommon.base.adapter.s.e.class, TopicWrapper.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(wrapper, "wrapper");
            if (viewHolder.d() != R.layout.item_interest_init_topic_title) {
                BBSTopicObj topic = wrapper.getTopic();
                kotlin.jvm.internal.f0.m(topic);
                ap apVarA = ap.a(viewHolder.itemView);
                kotlin.jvm.internal.f0.o(apVarA, "bind(viewHolder.itemView)");
                com.max.xiaoheihe.module.bbs.adapter.v vVar = com.max.xiaoheihe.module.bbs.adapter.v.f80640a;
                Activity mContext = ((BaseActivity) InterestInitV2Activity.this).f66601b;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                vVar.f(mContext, apVarA, topic);
                Activity mContext2 = ((BaseActivity) InterestInitV2Activity.this).f66601b;
                kotlin.jvm.internal.f0.o(mContext2, "mContext");
                vVar.e(mContext2, InterestInitV2Activity.this.W.contains(topic.getTopic_id()), apVarA);
                apVarA.b().setOnClickListener(new a(InterestInitV2Activity.this, viewHolder, topic, this, apVarA));
                return;
            }
            ((TextView) viewHolder.i(R.id.tv_title)).setText(wrapper.getTitle());
            TextView textView = (TextView) viewHolder.i(R.id.tv_desc);
            if (viewHolder.getAbsoluteAdapterPosition() == 0) {
                textView.setVisibility(0);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(InterestInitV2Activity.this.W.size());
                sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb2.append(InterestInitV2Activity.this.f77942x2);
                textView.setText(sb2.toString());
                InterestInitV2Activity.this.f77943y1 = textView;
            } else {
                textView.setVisibility(8);
            }
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (InterestInitV2Activity.this.f77938c0 - InterestInitV2Activity.this.f77937b0 == 1 && kotlin.jvm.internal.f0.g(wrapper.getTitle(), InterestInitV2Activity.this.Z)) {
                layoutParams.height = 0;
                viewHolder.itemView.setLayoutParams(layoutParams);
            } else {
                layoutParams.height = ViewUtils.f(((BaseActivity) InterestInitV2Activity.this).f66601b, 46.0f);
                viewHolder.itemView.setLayoutParams(layoutParams);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 23209, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (TopicWrapper) obj);
        }
    }

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class f extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 23213, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(outRect, "outRect");
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(parent, "parent");
            kotlin.jvm.internal.f0.p(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            com.max.hbcommon.utils.d.b("zzzzgetItemOffsets", "view pos==" + childAdapterPosition);
            if (childAdapterPosition < 0 || childAdapterPosition >= InterestInitV2Activity.this.R.size() || ((TopicWrapper) InterestInitV2Activity.this.R.get(childAdapterPosition)).getTopic() == null) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
            kotlin.jvm.internal.f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            int spanIndex = ((GridLayoutManager) layoutManager).getSpanSizeLookup().getSpanIndex(childAdapterPosition, 4) % 4;
            outRect.left = (InterestInitV2Activity.this.X * spanIndex) / 4;
            outRect.right = InterestInitV2Activity.this.X - (((spanIndex + 1) * InterestInitV2Activity.this.X) / 4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(@dl.d Canvas c10, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{c10, parent, state}, this, changeQuickRedirect, false, 23212, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(c10, "c");
            kotlin.jvm.internal.f0.p(parent, "parent");
            kotlin.jvm.internal.f0.p(state, "state");
            int childCount = parent.getChildCount();
            if (childCount > 0) {
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = parent.getChildAt(i10);
                    int childAdapterPosition = parent.getChildAdapterPosition(childAt);
                    RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
                    kotlin.jvm.internal.f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
                    GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) layoutParams;
                    com.max.hbcommon.utils.d.b("zzzzrvtest", "params.spanIndex ==" + layoutParams2.getSpanIndex());
                    float top = (float) childAt.getTop();
                    float bottom = (float) childAt.getBottom();
                    if (childAdapterPosition != 0) {
                        top -= ViewUtils.f(((BaseActivity) InterestInitV2Activity.this).f66601b, 4.0f);
                        bottom += ViewUtils.f(((BaseActivity) InterestInitV2Activity.this).f66601b, 4.0f);
                    }
                    float f10 = bottom;
                    if (childAdapterPosition < InterestInitV2Activity.this.f77937b0 && layoutParams2.getSpanIndex() == 0) {
                        c10.drawRect(parent.getLeft(), top, parent.getRight(), f10, InterestInitV2Activity.this.Y);
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class g extends GridLayoutManager.SpanSizeLookup {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UpdateInsetsGridLayoutManager f77958b;

        g(UpdateInsetsGridLayoutManager updateInsetsGridLayoutManager) {
            this.f77958b = updateInsetsGridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23214, new Class[]{cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (((TopicWrapper) InterestInitV2Activity.this.R.get(i10)).getTopic() != null) {
                return 1;
            }
            return this.f77958b.getSpanCount();
        }
    }

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class h implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23215, new Class[0], Void.TYPE).isSupported && InterestInitV2Activity.this.isActive()) {
                InterestInitV2Activity.M1(InterestInitV2Activity.this);
            }
        }
    }

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23216, new Class[]{View.class}, Void.TYPE).isSupported && System.currentTimeMillis() - InterestInitV2Activity.this.f77941x1 >= 300) {
                InterestInitV2Activity.this.f77941x1 = System.currentTimeMillis();
                if (InterestInitV2Activity.this.P == InterestInitV2Activity.this.D2()) {
                    InterestInitV2Activity.c2(InterestInitV2Activity.this);
                } else {
                    InterestInitV2Activity.h2(InterestInitV2Activity.this);
                    InterestInitV2Activity.i2(InterestInitV2Activity.this);
                }
            }
        }
    }

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class j extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 23221, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (InterestInitV2Activity.this.isActive()) {
                InterestInitV2Activity.f2(InterestInitV2Activity.this);
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23222, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (InterestInitV2Activity.this.isActive()) {
                InterestInitV2Activity.f2(InterestInitV2Activity.this);
                InterestInitV2Activity.v2(InterestInitV2Activity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23223, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class k implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f77963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterestInitV2Activity f77964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f77965d;

        k(View view, InterestInitV2Activity interestInitV2Activity, int i10) {
            this.f77963b = view;
            this.f77964c = interestInitV2Activity;
            this.f77965d = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 23226, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
            Object animatedValue = animation.getAnimatedValue();
            kotlin.jvm.internal.f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            this.f77963b.setBackground(com.max.hbutils.utils.q.v(((BaseActivity) this.f77964c).f66601b, this.f77965d, ((Float) animatedValue).floatValue()));
        }
    }

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class l implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f77966b;

        l(View view) {
            this.f77966b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 23227, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
            Object animatedValue = animation.getAnimatedValue();
            kotlin.jvm.internal.f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            this.f77966b.setScaleX(fFloatValue);
            this.f77966b.setScaleY(fFloatValue);
        }
    }

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class m implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f77967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<ArgbEvaluator> f77968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterestInitV2Activity f77969d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f77970e;

        m(boolean z10, Ref.ObjectRef<ArgbEvaluator> objectRef, InterestInitV2Activity interestInitV2Activity, TextView textView) {
            this.f77967b = z10;
            this.f77968c = objectRef;
            this.f77969d = interestInitV2Activity;
            this.f77970e = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator animation) {
            int iIntValue;
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 23228, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
            Object animatedValue = animation.getAnimatedValue();
            kotlin.jvm.internal.f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            if (this.f77967b) {
                Object objEvaluate = this.f77968c.f124891b.evaluate(fFloatValue, Integer.valueOf(this.f77969d.getResources().getColor(R.color.text_primary_1_color)), Integer.valueOf(this.f77969d.getResources().getColor(R.color.background_layer_2_color)));
                kotlin.jvm.internal.f0.n(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                iIntValue = ((Integer) objEvaluate).intValue();
            } else {
                Object objEvaluate2 = this.f77968c.f124891b.evaluate(fFloatValue, Integer.valueOf(this.f77969d.getResources().getColor(R.color.background_layer_2_color)), Integer.valueOf(this.f77969d.getResources().getColor(R.color.text_primary_1_color)));
                kotlin.jvm.internal.f0.n(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                iIntValue = ((Integer) objEvaluate2).intValue();
            }
            this.f77970e.setTextColor(iIntValue);
        }
    }

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class n implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23229, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            InterestInitV2Activity.u2(InterestInitV2Activity.this);
            InterestInitV2Activity.this.overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
        }
    }

    /* JADX INFO: compiled from: InterestInitV2Activity.kt */
    public static final class o implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23230, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzinit", "update title mRecommendGroupIndex==" + InterestInitV2Activity.this.f77937b0);
            com.max.hbcommon.base.adapter.u uVar = InterestInitV2Activity.this.T;
            if (uVar == null) {
                kotlin.jvm.internal.f0.S("mTopicAdapter");
                uVar = null;
            }
            uVar.notifyItemChanged(InterestInitV2Activity.this.f77937b0);
        }
    }

    private final void B2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23171, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f77940p2 = new LoadingDialog(this, "").r();
        ArrayList<InterestProfileGroupObj> arrayList = this.Q;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((InterestProfileGroupObj) obj).getCustom_checked()) {
                arrayList2.add(obj);
            }
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().e3(CollectionsKt___CollectionsKt.h3(arrayList2, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<InterestProfileGroupObj, CharSequence>() { // from class: com.max.xiaoheihe.module.account.InterestInitV2Activity$getTopicList$keys$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public final CharSequence a(@dl.d InterestProfileGroupObj it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 23202, new Class[]{InterestProfileGroupObj.class}, CharSequence.class);
                if (patchProxyResultProxy.isSupported) {
                    return (CharSequence) patchProxyResultProxy.result;
                }
                kotlin.jvm.internal.f0.p(it, "it");
                return it.getGroup_key();
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ CharSequence invoke(InterestProfileGroupObj interestProfileGroupObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{interestProfileGroupObj}, this, changeQuickRedirect, false, 23203, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(interestProfileGroupObj);
            }
        }, 30, null)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void E2() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23172, new Class[0], Void.TYPE).isSupported || (loadingDialog = this.f77940p2) == null) {
            return;
        }
        loadingDialog.c();
    }

    private final void G2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23165, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.S = new d(this.f66601b, this.Q);
        y0 y0Var = this.O;
        com.max.hbcommon.base.adapter.u<TopicWrapper> uVar = null;
        if (y0Var == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var = null;
        }
        y0Var.f117686c.setLayoutManager(new GridLayoutManager(this.f66601b, 2));
        y0 y0Var2 = this.O;
        if (y0Var2 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var2 = null;
        }
        RecyclerView recyclerView = y0Var2.f117686c;
        com.max.hbcommon.base.adapter.s<InterestProfileGroupObj> sVar = this.S;
        if (sVar == null) {
            kotlin.jvm.internal.f0.S("mGroupAdapter");
            sVar = null;
        }
        recyclerView.setAdapter(sVar);
        this.T = new e(this.f66601b, this.R);
        UpdateInsetsGridLayoutManager updateInsetsGridLayoutManager = new UpdateInsetsGridLayoutManager(this.f66601b, 4);
        updateInsetsGridLayoutManager.setSpanSizeLookup(new g(updateInsetsGridLayoutManager));
        y0 y0Var3 = this.O;
        if (y0Var3 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var3 = null;
        }
        y0Var3.f117687d.setLayoutManager(updateInsetsGridLayoutManager);
        this.f77939p1 = new f();
        y0 y0Var4 = this.O;
        if (y0Var4 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var4 = null;
        }
        RecyclerView recyclerView2 = y0Var4.f117687d;
        RecyclerView.ItemDecoration itemDecoration = this.f77939p1;
        kotlin.jvm.internal.f0.m(itemDecoration);
        recyclerView2.addItemDecoration(itemDecoration);
        int iF = ViewUtils.f(this.f66601b, 19.0f);
        y0 y0Var5 = this.O;
        if (y0Var5 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var5 = null;
        }
        y0Var5.f117687d.setPadding(iF, 0, iF, 0);
        y0 y0Var6 = this.O;
        if (y0Var6 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var6 = null;
        }
        RecyclerView recyclerView3 = y0Var6.f117687d;
        com.max.hbcommon.base.adapter.u<TopicWrapper> uVar2 = this.T;
        if (uVar2 == null) {
            kotlin.jvm.internal.f0.S("mTopicAdapter");
        } else {
            uVar = uVar2;
        }
        recyclerView3.setAdapter(uVar);
    }

    private final void H2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23175, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        ArrayList<InterestProfileGroupObj> arrayList = this.Q;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((InterestProfileGroupObj) obj).getCustom_checked()) {
                arrayList2.add(obj);
            }
        }
        String strH3 = CollectionsKt___CollectionsKt.h3(arrayList2, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<InterestProfileGroupObj, CharSequence>() { // from class: com.max.xiaoheihe.module.account.InterestInitV2Activity$reportClickAction$keys$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public final CharSequence a(@dl.d InterestProfileGroupObj it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 23219, new Class[]{InterestProfileGroupObj.class}, CharSequence.class);
                if (patchProxyResultProxy.isSupported) {
                    return (CharSequence) patchProxyResultProxy.result;
                }
                kotlin.jvm.internal.f0.p(it, "it");
                return it.getGroup_key();
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ CharSequence invoke(InterestProfileGroupObj interestProfileGroupObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{interestProfileGroupObj}, this, changeQuickRedirect, false, 23220, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(interestProfileGroupObj);
            }
        }, 30, null);
        String strH4 = CollectionsKt___CollectionsKt.h3(this.W, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<String, CharSequence>() { // from class: com.max.xiaoheihe.module.account.InterestInitV2Activity$reportClickAction$ids$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public final CharSequence a(@dl.d String it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 23217, new Class[]{String.class}, CharSequence.class);
                if (patchProxyResultProxy.isSupported) {
                    return (CharSequence) patchProxyResultProxy.result;
                }
                kotlin.jvm.internal.f0.p(it, "it");
                return it;
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23218, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
            }
        }, 30, null);
        jsonObject.addProperty("group_keys", strH3);
        jsonObject.addProperty(EpicAddFreeGamesV2Activity.f84073y1, strH4);
        com.max.hbcommon.analytics.l.f66572a.l(lb.d.f131220o1, jsonObject);
    }

    private final void I2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23176, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setType("3");
        pageEventObj.setPath(lb.d.f131213n1);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("page_type", str);
        pageEventObj.setAddition(jsonObject);
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        com.max.hbcommon.analytics.d.c(pageEventObj, true);
    }

    private final void J2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23174, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f77940p2 = new LoadingDialog(this, "").r();
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().x0(CollectionsKt___CollectionsKt.h3(this.W, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<String, CharSequence>() { // from class: com.max.xiaoheihe.module.account.InterestInitV2Activity$setFavOptions$ids$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public final CharSequence a(@dl.d String it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 23224, new Class[]{String.class}, CharSequence.class);
                if (patchProxyResultProxy.isSupported) {
                    return (CharSequence) patchProxyResultProxy.result;
                }
                kotlin.jvm.internal.f0.p(it, "it");
                return it;
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23225, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
            }
        }, 30, null), "topic").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j()));
    }

    private final void K2() {
        ArrayList<BBSTopicObj> hots;
        ArrayList<BBSTopicObj> recommends;
        ArrayList<BBSTopicObj> followed;
        Integer follow_topic_limit;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23177, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.R.clear();
        this.W.clear();
        InterestProfileTopicResult interestProfileTopicResult = this.V;
        if (interestProfileTopicResult != null) {
            if (interestProfileTopicResult != null && (follow_topic_limit = interestProfileTopicResult.getFollow_topic_limit()) != null) {
                this.f77942x2 = follow_topic_limit.intValue();
            }
            InterestProfileTopicResult interestProfileTopicResult2 = this.V;
            if (interestProfileTopicResult2 != null && (followed = interestProfileTopicResult2.getFollowed()) != null) {
                this.R.add(new TopicWrapper("我的偏好", null));
                for (BBSTopicObj bBSTopicObj : followed) {
                    this.R.add(new TopicWrapper(null, bBSTopicObj));
                    this.W.add(bBSTopicObj.getTopic_id());
                }
            }
            InterestProfileTopicResult interestProfileTopicResult3 = this.V;
            if (interestProfileTopicResult3 != null && (recommends = interestProfileTopicResult3.getRecommends()) != null) {
                this.R.add(new TopicWrapper(this.Z, null));
                Iterator<T> it = recommends.iterator();
                while (it.hasNext()) {
                    this.R.add(new TopicWrapper(null, (BBSTopicObj) it.next()));
                }
            }
            InterestProfileTopicResult interestProfileTopicResult4 = this.V;
            if (interestProfileTopicResult4 != null && (hots = interestProfileTopicResult4.getHots()) != null) {
                this.R.add(new TopicWrapper(this.f77936a0, null));
                Iterator<T> it2 = hots.iterator();
                while (it2.hasNext()) {
                    this.R.add(new TopicWrapper(null, (BBSTopicObj) it2.next()));
                }
            }
        }
        W2();
    }

    private final void L2(boolean z10) {
        y0 y0Var;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23168, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        long j10 = !z10 ? 0L : 200L;
        long j11 = z10 ? 0L : 200L;
        AutoTransition autoTransition = new AutoTransition();
        y0 y0Var2 = this.O;
        if (y0Var2 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var2 = null;
        }
        BaseBottomButton rightbutton = y0Var2.f117685b.getRightbutton();
        kotlin.jvm.internal.f0.m(rightbutton);
        autoTransition.c(rightbutton);
        y0 y0Var3 = this.O;
        if (y0Var3 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var3 = null;
        }
        LinearLayout leftView = y0Var3.f117685b.getLeftView();
        kotlin.jvm.internal.f0.m(leftView);
        autoTransition.c(leftView);
        autoTransition.w0(300L);
        autoTransition.E0(j10);
        com.max.hbcustomview.transition.b bVar = new com.max.hbcustomview.transition.b(1, ViewUtils.f(this.f66601b, 0.0f), -ViewUtils.f(this.f66601b, 40.0f));
        y0 y0Var4 = this.O;
        if (y0Var4 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var4 = null;
        }
        bVar.c(y0Var4.f117692i);
        bVar.w0(300L);
        bVar.E0(j10);
        Fade fade = new Fade();
        y0 y0Var5 = this.O;
        if (y0Var5 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var5 = null;
        }
        fade.c(y0Var5.f117692i);
        fade.w0(300L);
        fade.E0(j10);
        com.max.hbcustomview.transition.b bVar2 = new com.max.hbcustomview.transition.b(1, ViewUtils.f(this.f66601b, 0.0f), ViewUtils.f(this.f66601b, 40.0f));
        y0 y0Var6 = this.O;
        if (y0Var6 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var6 = null;
        }
        bVar2.c(y0Var6.f117693j);
        bVar2.w0(300L);
        bVar2.E0(j11);
        Fade fade2 = new Fade();
        y0 y0Var7 = this.O;
        if (y0Var7 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var7 = null;
        }
        fade2.c(y0Var7.f117693j);
        fade2.w0(300L);
        fade2.E0(j11);
        com.max.hbcustomview.transition.b bVar3 = new com.max.hbcustomview.transition.b(1, -ViewUtils.f(this.f66601b, 50.0f), 0);
        y0 y0Var8 = this.O;
        if (y0Var8 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var8 = null;
        }
        bVar3.c(y0Var8.f117686c);
        bVar3.w0(300L);
        bVar3.E0(j10);
        Fade fade3 = new Fade();
        y0 y0Var9 = this.O;
        if (y0Var9 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var9 = null;
        }
        fade3.c(y0Var9.f117686c);
        fade3.w0(300L);
        fade3.E0(j10);
        com.max.hbcustomview.transition.b bVar4 = new com.max.hbcustomview.transition.b(1, ViewUtils.f(this.f66601b, 50.0f), 0);
        y0 y0Var10 = this.O;
        if (y0Var10 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var10 = null;
        }
        bVar4.c(y0Var10.f117687d);
        bVar4.w0(300L);
        bVar4.E0(j11);
        Fade fade4 = new Fade();
        y0 y0Var11 = this.O;
        if (y0Var11 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var11 = null;
        }
        fade4.c(y0Var11.f117687d);
        fade4.w0(300L);
        fade4.E0(j11);
        transitionSet.N0(bVar).N0(fade).N0(bVar2).N0(fade2).N0(bVar3).N0(fade3).N0(bVar4).N0(fade4).y0(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE));
        y0 y0Var12 = this.O;
        if (y0Var12 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var = null;
        } else {
            y0Var = y0Var12;
        }
        androidx.transition.v.b(y0Var.b(), transitionSet);
    }

    public static final /* synthetic */ void M1(InterestInitV2Activity interestInitV2Activity) {
        if (PatchProxy.proxy(new Object[]{interestInitV2Activity}, null, changeQuickRedirect, true, 23183, new Class[]{InterestInitV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        interestInitV2Activity.y2();
    }

    private final void O2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23170, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I2("topic");
        this.P = this.N;
        y0 y0Var = this.O;
        y0 y0Var2 = null;
        if (y0Var == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var = null;
        }
        TextView textView = y0Var.f117691h;
        InterestProfileTopicResult interestProfileTopicResult = this.V;
        textView.setText(interestProfileTopicResult != null ? interestProfileTopicResult.getTitle() : null);
        y0 y0Var3 = this.O;
        if (y0Var3 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var3 = null;
        }
        TextView textView2 = y0Var3.f117689f;
        InterestProfileTopicResult interestProfileTopicResult2 = this.V;
        textView2.setText(interestProfileTopicResult2 != null ? interestProfileTopicResult2.getDesc() : null);
        y0 y0Var4 = this.O;
        if (y0Var4 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var4 = null;
        }
        y0Var4.f117687d.setVisibility(0);
        y0 y0Var5 = this.O;
        if (y0Var5 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var5 = null;
        }
        y0Var5.f117686c.setVisibility(8);
        y0 y0Var6 = this.O;
        if (y0Var6 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var6 = null;
        }
        y0Var6.f117692i.setVisibility(8);
        y0 y0Var7 = this.O;
        if (y0Var7 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var7 = null;
        }
        y0Var7.f117693j.setVisibility(0);
        Activity mContext = this.f66601b;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        View viewZ2 = z2(mContext);
        y0 y0Var8 = this.O;
        if (y0Var8 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var8 = null;
        }
        y0Var8.f117685b.h();
        y0 y0Var9 = this.O;
        if (y0Var9 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var9 = null;
        }
        y0Var9.f117685b.b(viewZ2);
        y0 y0Var10 = this.O;
        if (y0Var10 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
        } else {
            y0Var2 = y0Var10;
        }
        y0Var2.f117685b.setRightText("开启黑盒之旅");
    }

    private final void P2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23166, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I2("type");
        this.P = this.M;
        y0 y0Var = this.O;
        y0 y0Var2 = null;
        if (y0Var == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var = null;
        }
        TextView textView = y0Var.f117690g;
        InterestProfileObj interestProfileObj = this.U;
        if (interestProfileObj == null) {
            kotlin.jvm.internal.f0.S("mInterestProfileObj");
            interestProfileObj = null;
        }
        textView.setText(interestProfileObj.getTitle());
        y0 y0Var3 = this.O;
        if (y0Var3 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var3 = null;
        }
        TextView textView2 = y0Var3.f117688e;
        InterestProfileObj interestProfileObj2 = this.U;
        if (interestProfileObj2 == null) {
            kotlin.jvm.internal.f0.S("mInterestProfileObj");
            interestProfileObj2 = null;
        }
        textView2.setText(interestProfileObj2.getDescription());
        y0 y0Var4 = this.O;
        if (y0Var4 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var4 = null;
        }
        y0Var4.f117687d.setVisibility(8);
        y0 y0Var5 = this.O;
        if (y0Var5 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var5 = null;
        }
        y0Var5.f117686c.setVisibility(0);
        y0 y0Var6 = this.O;
        if (y0Var6 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var6 = null;
        }
        y0Var6.f117692i.setVisibility(0);
        y0 y0Var7 = this.O;
        if (y0Var7 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var7 = null;
        }
        y0Var7.f117693j.setVisibility(8);
        y0 y0Var8 = this.O;
        if (y0Var8 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var8 = null;
        }
        y0Var8.f117685b.h();
        y0 y0Var9 = this.O;
        if (y0Var9 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var9 = null;
        }
        y0Var9.f117685b.setRightText("下一步");
        y0 y0Var10 = this.O;
        if (y0Var10 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
        } else {
            y0Var2 = y0Var10;
        }
        y0Var2.f117685b.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, android.animation.ArgbEvaluator] */
    private final void Q2(View view, TextView textView, boolean z10, int i10) {
        ValueAnimator valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2;
        if (PatchProxy.proxy(new Object[]{view, textView, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, this, changeQuickRedirect, false, 23182, new Class[]{View.class, TextView.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        float[] fArr = {125.0f, 5.0f};
        if (z10) {
            // fill-array-data instruction
            fArr[0] = 5.0f;
            fArr[1] = 125.0f;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        }
        valueAnimatorOfFloat.setDuration(300L);
        CubicBezierInterpolators.Type type = CubicBezierInterpolators.Type.EASE;
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolators.a(type));
        valueAnimatorOfFloat.addUpdateListener(new k(view, this, i10));
        valueAnimatorOfFloat.start();
        float fL = (((((ViewUtils.L(this.f66601b) - ViewUtils.f(this.f66601b, 70.0f)) / 2) - ViewUtils.f(this.f66601b, 10.0f)) - ViewUtils.f(this.f66601b, 23.0f)) / ViewUtils.f(this.f66601b, 23.0f)) + 1;
        float[] fArr2 = new float[2];
        if (z10) {
            fArr2[0] = 1.0f;
            fArr2[1] = fL;
            valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr2);
        } else {
            fArr2[0] = fL;
            fArr2[1] = 1.0f;
            valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr2);
        }
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.setInterpolator(CubicBezierInterpolators.a(type));
        valueAnimatorOfFloat2.addUpdateListener(new l(view));
        valueAnimatorOfFloat2.start();
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setDuration(300L);
        valueAnimatorOfFloat3.setInterpolator(CubicBezierInterpolators.a(type));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = new ArgbEvaluator();
        valueAnimatorOfFloat3.addUpdateListener(new m(z10, objectRef, this, textView));
        valueAnimatorOfFloat3.start();
        addValueAnimator(valueAnimatorOfFloat2);
        addValueAnimator(valueAnimatorOfFloat3);
    }

    private final void S2(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23181, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 < i11) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                Collections.swap(this.R, i10, i12);
                i10 = i12;
            }
            return;
        }
        int i13 = i11 + 1;
        if (i13 > i10) {
            return;
        }
        while (true) {
            Collections.swap(this.R, i10, i10 - 1);
            if (i10 == i13) {
                return;
            } else {
                i10--;
            }
        }
    }

    private final void T2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23173, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.d.U0(this);
    }

    private final void V2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23169, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.N0(new com.max.hbcustomview.transition.b(1, -ViewUtils.f(this.f66601b, 50.0f), 0)).N0(new Fade()).y0(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE)).w0(300L);
        y0 y0Var = this.O;
        y0 y0Var2 = null;
        if (y0Var == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var = null;
        }
        androidx.transition.v.b(y0Var.b(), transitionSet);
        y0 y0Var3 = this.O;
        if (y0Var3 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var3 = null;
        }
        y0Var3.f117686c.setVisibility(8);
        y0 y0Var4 = this.O;
        if (y0Var4 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var4 = null;
        }
        y0Var4.f117687d.setVisibility(8);
        y0 y0Var5 = this.O;
        if (y0Var5 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var5 = null;
        }
        y0Var5.f117692i.setVisibility(8);
        y0 y0Var6 = this.O;
        if (y0Var6 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var6 = null;
        }
        y0Var6.f117693j.setVisibility(8);
        y0 y0Var7 = this.O;
        if (y0Var7 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var7 = null;
        }
        y0Var7.f117685b.setVisibility(8);
        y0 y0Var8 = this.O;
        if (y0Var8 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
        } else {
            y0Var2 = y0Var8;
        }
        y0Var2.b().postDelayed(new n(), 1000L);
    }

    private final void W2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23178, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int size = this.R.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.R.get(i10).getTopic() == null) {
                if (!kotlin.jvm.internal.f0.g(this.Z, this.R.get(i10).getTitle())) {
                    if (kotlin.jvm.internal.f0.g(this.f77936a0, this.R.get(i10).getTitle())) {
                        this.f77938c0 = i10;
                        break;
                    }
                } else {
                    this.f77937b0 = i10;
                }
            }
        }
        if (this.f77938c0 - this.f77937b0 == 1) {
            y0 y0Var = this.O;
            if (y0Var == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                y0Var = null;
            }
            y0Var.f117687d.post(new o());
        }
    }

    public static final /* synthetic */ void c2(InterestInitV2Activity interestInitV2Activity) {
        if (PatchProxy.proxy(new Object[]{interestInitV2Activity}, null, changeQuickRedirect, true, 23184, new Class[]{InterestInitV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        interestInitV2Activity.B2();
    }

    public static final /* synthetic */ void f2(InterestInitV2Activity interestInitV2Activity) {
        if (PatchProxy.proxy(new Object[]{interestInitV2Activity}, null, changeQuickRedirect, true, 23191, new Class[]{InterestInitV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        interestInitV2Activity.E2();
    }

    public static final /* synthetic */ void h2(InterestInitV2Activity interestInitV2Activity) {
        if (PatchProxy.proxy(new Object[]{interestInitV2Activity}, null, changeQuickRedirect, true, 23185, new Class[]{InterestInitV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        interestInitV2Activity.H2();
    }

    public static final /* synthetic */ void i2(InterestInitV2Activity interestInitV2Activity) {
        if (PatchProxy.proxy(new Object[]{interestInitV2Activity}, null, changeQuickRedirect, true, 23186, new Class[]{InterestInitV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        interestInitV2Activity.J2();
    }

    public static final /* synthetic */ void l2(InterestInitV2Activity interestInitV2Activity) {
        if (PatchProxy.proxy(new Object[]{interestInitV2Activity}, null, changeQuickRedirect, true, 23192, new Class[]{InterestInitV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        interestInitV2Activity.K2();
    }

    public static final /* synthetic */ void m2(InterestInitV2Activity interestInitV2Activity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{interestInitV2Activity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23193, new Class[]{InterestInitV2Activity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        interestInitV2Activity.L2(z10);
    }

    public static final /* synthetic */ void o2(InterestInitV2Activity interestInitV2Activity) {
        if (PatchProxy.proxy(new Object[]{interestInitV2Activity}, null, changeQuickRedirect, true, 23194, new Class[]{InterestInitV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        interestInitV2Activity.O2();
    }

    public static final /* synthetic */ void p2(InterestInitV2Activity interestInitV2Activity) {
        if (PatchProxy.proxy(new Object[]{interestInitV2Activity}, null, changeQuickRedirect, true, 23196, new Class[]{InterestInitV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        interestInitV2Activity.P2();
    }

    public static final /* synthetic */ void q2(InterestInitV2Activity interestInitV2Activity, View view, TextView textView, boolean z10, int i10) {
        if (PatchProxy.proxy(new Object[]{interestInitV2Activity, view, textView, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, null, changeQuickRedirect, true, 23187, new Class[]{InterestInitV2Activity.class, View.class, TextView.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        interestInitV2Activity.Q2(view, textView, z10, i10);
    }

    public static final /* synthetic */ void r2(InterestInitV2Activity interestInitV2Activity, int i10, int i11) {
        Object[] objArr = {interestInitV2Activity, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 23188, new Class[]{InterestInitV2Activity.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        interestInitV2Activity.S2(i10, i11);
    }

    public static final /* synthetic */ void u2(InterestInitV2Activity interestInitV2Activity) {
        if (PatchProxy.proxy(new Object[]{interestInitV2Activity}, null, changeQuickRedirect, true, 23190, new Class[]{InterestInitV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        interestInitV2Activity.T2();
    }

    public static final /* synthetic */ void v2(InterestInitV2Activity interestInitV2Activity) {
        if (PatchProxy.proxy(new Object[]{interestInitV2Activity}, null, changeQuickRedirect, true, 23195, new Class[]{InterestInitV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        interestInitV2Activity.V2();
    }

    public static final /* synthetic */ void x2(InterestInitV2Activity interestInitV2Activity) {
        if (PatchProxy.proxy(new Object[]{interestInitV2Activity}, null, changeQuickRedirect, true, 23189, new Class[]{InterestInitV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        interestInitV2Activity.W2();
    }

    private final void y2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23167, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        com.max.hbcustomview.transition.b bVar = new com.max.hbcustomview.transition.b(1, ViewUtils.f(this.f66601b, 30.0f), 0);
        y0 y0Var = this.O;
        y0 y0Var2 = null;
        if (y0Var == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var = null;
        }
        bVar.c(y0Var.f117686c);
        y0 y0Var3 = this.O;
        if (y0Var3 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var3 = null;
        }
        bVar.c(y0Var3.f117692i);
        Fade fade = new Fade(1);
        y0 y0Var4 = this.O;
        if (y0Var4 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var4 = null;
        }
        fade.c(y0Var4.f117686c);
        y0 y0Var5 = this.O;
        if (y0Var5 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var5 = null;
        }
        fade.c(y0Var5.f117692i);
        com.max.hbcustomview.transition.b bVar2 = new com.max.hbcustomview.transition.b(1, 0, ViewUtils.f(this.f66601b, 88.0f));
        y0 y0Var6 = this.O;
        if (y0Var6 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var6 = null;
        }
        bVar2.c(y0Var6.f117685b);
        transitionSet.N0(bVar).N0(fade).N0(bVar2).y0(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE)).w0(300L);
        y0 y0Var7 = this.O;
        if (y0Var7 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
        } else {
            y0Var2 = y0Var7;
        }
        androidx.transition.v.b(y0Var2.b(), transitionSet);
        P2();
    }

    public final int A2() {
        return this.L;
    }

    public final int C2() {
        return this.N;
    }

    public final int D2() {
        return this.M;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23163, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        y0 y0VarC = y0.c(this.f66602c);
        kotlin.jvm.internal.f0.o(y0VarC, "inflate(mInflater)");
        this.O = y0VarC;
        y0 y0Var = null;
        if (y0VarC == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0VarC = null;
        }
        setContentView(y0VarC.b());
        com.max.hbutils.utils.t.X(this, 0, null);
        com.max.hbutils.utils.t.M(this.f66601b, true);
        if (getIntent() != null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("arg_profile");
            kotlin.jvm.internal.f0.n(serializableExtra, "null cannot be cast to non-null type com.max.xiaoheihe.bean.account.InterestProfileObj");
            InterestProfileObj interestProfileObj = (InterestProfileObj) serializableExtra;
            this.U = interestProfileObj;
            if (interestProfileObj == null) {
                kotlin.jvm.internal.f0.S("mInterestProfileObj");
                interestProfileObj = null;
            }
            List<InterestProfileGroupObj> topic_group_list = interestProfileObj.getTopic_group_list();
            if (topic_group_list != null) {
                this.Q.addAll(topic_group_list);
            }
        }
        com.max.xiaoheihe.module.bbs.adapter.v vVar = com.max.xiaoheihe.module.bbs.adapter.v.f80640a;
        Activity mContext = this.f66601b;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        this.X = vVar.a(mContext, ViewUtils.f(this.f66601b, 19.0f), ViewUtils.f(this.f66601b, 70.0f), 4);
        this.Y.setColor(getResources().getColor(R.color.background_layer_2_color));
        this.P = this.M;
        G2();
        y0 y0Var2 = this.O;
        if (y0Var2 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
        } else {
            y0Var = y0Var2;
        }
        y0Var.b().postDelayed(new h(), 500L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23179, new Class[0], Void.TYPE).isSupported && this.P == this.N) {
            L2(true);
            P2();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23164, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        y0 y0Var = this.O;
        if (y0Var == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            y0Var = null;
        }
        y0Var.f117685b.setRightClickListener(new i());
    }

    @dl.d
    public final View z2(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 23180, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        qe qeVarC = qe.c(LayoutInflater.from(context));
        kotlin.jvm.internal.f0.o(qeVarC, "inflate(LayoutInflater.from(context))");
        qeVarC.f114869b.setImageResource(R.drawable.special_refresh_small_line_24x24);
        qeVarC.f114869b.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        qeVarC.f114870c.setVisibility(8);
        qeVarC.f114871d.setText("上一步");
        qeVarC.b().setOnClickListener(new b());
        ConstraintLayout constraintLayoutB = qeVarC.b();
        kotlin.jvm.internal.f0.o(constraintLayoutB, "containerView.getRoot()");
        return constraintLayoutB;
    }
}
