package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.component.VoteShowItemView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.vote.VoteOptionObj;
import com.max.xiaoheihe.bean.game.vote.VoteQuestionListObj;
import com.max.xiaoheihe.bean.game.vote.VoteQuestionObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: GameImpressionDialogFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GameImpressionDialogFragment extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    public static final a f84468q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f84469r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    public static final String f84470s = "appid";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f84471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f84472k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private LinearLayout f84473l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CircularProgressIndicator f84474m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private b f84475n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f84476o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.q0 f84477p = kotlinx.coroutines.r0.a(kotlinx.coroutines.e1.e());

    /* JADX INFO: compiled from: GameImpressionDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final GameImpressionDialogFragment a(@dl.d String appId) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{appId}, this, changeQuickRedirect, false, 33188, new Class[]{String.class}, GameImpressionDialogFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (GameImpressionDialogFragment) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(appId, "appId");
            GameImpressionDialogFragment gameImpressionDialogFragment = new GameImpressionDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("appid", appId);
            gameImpressionDialogFragment.setArguments(bundle);
            return gameImpressionDialogFragment;
        }
    }

    /* JADX INFO: compiled from: GameImpressionDialogFragment.kt */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: GameImpressionDialogFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33196, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameImpressionDialogFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameImpressionDialogFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33197, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b bVarA4 = GameImpressionDialogFragment.this.a4();
            if (bVarA4 != null) {
                bVarA4.a();
            }
            GameImpressionDialogFragment.this.dismiss();
        }
    }

    public static final /* synthetic */ void V3(GameImpressionDialogFragment gameImpressionDialogFragment, List list) {
        if (PatchProxy.proxy(new Object[]{gameImpressionDialogFragment, list}, null, changeQuickRedirect, true, 33187, new Class[]{GameImpressionDialogFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        gameImpressionDialogFragment.Y3(list);
    }

    private final void Y3(List<VoteQuestionObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 33184, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = this.f84473l;
        if (linearLayout == null) {
            kotlin.jvm.internal.f0.S("ll_game_impression");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        if (com.max.hbcommon.utils.c.w(list)) {
            return;
        }
        kotlin.jvm.internal.f0.m(list);
        for (VoteQuestionObj voteQuestionObj : list) {
            View viewD4 = d4(voteQuestionObj.getQ_desc(), voteQuestionObj.getTotal_cnt());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            LinearLayout linearLayout2 = this.f84473l;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.f0.S("ll_game_impression");
                linearLayout2 = null;
            }
            if (linearLayout2.getChildCount() > 0) {
                layoutParams.topMargin = ViewUtils.f(getContext(), 24.0f);
            }
            layoutParams.bottomMargin = ViewUtils.f(getContext(), 8.0f);
            LinearLayout linearLayout3 = this.f84473l;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.f0.S("ll_game_impression");
                linearLayout3 = null;
            }
            linearLayout3.addView(viewD4, layoutParams);
            if (!com.max.hbcommon.utils.c.w(voteQuestionObj.getOptions())) {
                Context context = getContext();
                kotlin.jvm.internal.f0.m(context);
                CardView cardView = new CardView(context);
                cardView.setCardElevation(0.0f);
                Context context2 = getContext();
                kotlin.jvm.internal.f0.m(context2);
                cardView.setCardBackgroundColor(context2.getResources().getColor(R.color.transparent));
                cardView.setRadius(ViewUtils.m(getContext(), ViewUtils.L(getContext()), ViewUtils.f(getContext(), 138.0f)));
                LinearLayout linearLayout4 = new LinearLayout(getContext());
                linearLayout4.setOrientation(1);
                cardView.addView(linearLayout4);
                List<VoteOptionObj> options = voteQuestionObj.getOptions();
                kotlin.jvm.internal.f0.m(options);
                for (VoteOptionObj voteOptionObj : options) {
                    VoteShowItemView voteShowItemViewB4 = b4(voteOptionObj);
                    List<VoteOptionObj> options2 = voteQuestionObj.getOptions();
                    kotlin.jvm.internal.f0.m(options2);
                    int iIndexOf = options2.indexOf(voteOptionObj);
                    List<VoteOptionObj> options3 = voteQuestionObj.getOptions();
                    kotlin.jvm.internal.f0.m(options3);
                    voteShowItemViewB4.b(iIndexOf != options3.size() - 1);
                    linearLayout4.addView(voteShowItemViewB4, new LinearLayout.LayoutParams(-1, ViewUtils.f(getContext(), 46.0f)));
                }
                LinearLayout linearLayout5 = this.f84473l;
                if (linearLayout5 == null) {
                    kotlin.jvm.internal.f0.S("ll_game_impression");
                    linearLayout5 = null;
                }
                linearLayout5.addView(cardView);
            }
        }
    }

    private final void Z3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33183, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ga(this.f84471j).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<VoteQuestionListObj>>() { // from class: com.max.xiaoheihe.module.game.GameImpressionDialogFragment$getList$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33189, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(e10, "e");
                if (this.f84480b.isActive()) {
                    super.onError(e10);
                }
            }

            public void onNext(@dl.d Result<VoteQuestionListObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33190, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(result, "result");
                if (this.f84480b.isActive()) {
                    super.onNext(result);
                    kotlinx.coroutines.k.f(this.f84480b.f84477p, null, null, new GameImpressionDialogFragment$getList$1$onNext$1(this.f84480b, result, null), 3, null);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33191, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<VoteQuestionListObj>) obj);
            }
        }));
    }

    private final VoteShowItemView b4(VoteOptionObj voteOptionObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{voteOptionObj}, this, changeQuickRedirect, false, 33186, new Class[]{VoteOptionObj.class}, VoteShowItemView.class);
        if (patchProxyResultProxy.isSupported) {
            return (VoteShowItemView) patchProxyResultProxy.result;
        }
        VoteShowItemView voteShowItemView = new VoteShowItemView(getContext());
        voteShowItemView.setVoteDesc(voteOptionObj != null ? voteOptionObj.getO_desc() : null);
        if (com.max.hbcommon.utils.c.u(voteOptionObj != null ? voteOptionObj.getSelected_cnt() : null)) {
            voteShowItemView.getTv_num().setVisibility(8);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.max.hbutils.utils.n.q(voteOptionObj != null ? voteOptionObj.getSelected_cnt() : null));
            sb2.append((char) 20154);
            voteShowItemView.setNum(sb2.toString());
            voteShowItemView.getTv_num().setVisibility(0);
        }
        voteShowItemView.setPercent(com.max.hbutils.utils.n.p(voteOptionObj != null ? voteOptionObj.getSelected_percent() : null));
        voteShowItemView.setChecked(voteOptionObj != null ? voteOptionObj.is_selected() : false);
        return voteShowItemView;
    }

    private final View d4(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 33185, new Class[]{String.class, String.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        Context context = getContext();
        if (context != null) {
            textView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        textView.setLayoutParams(layoutParams);
        relativeLayout.addView(textView);
        if (str2 != null) {
            TextView textView2 = new TextView(getContext());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.max.hbutils.utils.n.q(str2));
            sb2.append((char) 20154);
            textView2.setText(sb2.toString());
            textView2.setTextSize(1, 12.0f);
            Context context2 = getContext();
            if (context2 != null) {
                textView2.setTextColor(context2.getResources().getColor(R.color.text_secondary_1_color));
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(15);
            layoutParams2.addRule(11);
            textView2.setLayoutParams(layoutParams2);
            relativeLayout.addView(textView2);
        }
        return relativeLayout;
    }

    private final void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33180, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.f84471j);
        pageEventObj.setAddition(jsonObject);
        pageEventObj.setType("3");
        pageEventObj.setPath(lb.d.Z2);
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        com.max.hbcommon.analytics.d.c(pageEventObj, true);
    }

    @dl.e
    public final b a4() {
        return this.f84475n;
    }

    public final long c4() {
        return this.f84476o;
    }

    public final void f4(@dl.e b bVar) {
        this.f84475n = bVar;
    }

    public final void g4(long j10) {
        this.f84476o = j10;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 33179, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            kotlin.jvm.internal.f0.m(arguments);
            this.f84471j = arguments.getString("appid");
        }
        e4();
        return inflater.inflate(R.layout.dialog_fragment_game_impression, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33182, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        this.f84476o = System.currentTimeMillis();
        Z3();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 33181, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new c());
        View viewFindViewById = view.findViewById(R.id.tv_post);
        kotlin.jvm.internal.f0.o(viewFindViewById, "view.findViewById(R.id.tv_post)");
        this.f84472k = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ll_game_impression);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "view.findViewById(R.id.ll_game_impression)");
        this.f84473l = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.loading_progress);
        kotlin.jvm.internal.f0.o(viewFindViewById3, "view.findViewById(R.id.loading_progress)");
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) viewFindViewById3;
        this.f84474m = circularProgressIndicator;
        TextView textView = null;
        if (circularProgressIndicator == null) {
            kotlin.jvm.internal.f0.S("loading_progress");
            circularProgressIndicator = null;
        }
        circularProgressIndicator.p();
        TextView textView2 = this.f84472k;
        if (textView2 == null) {
            kotlin.jvm.internal.f0.S("tv_post");
        } else {
            textView = textView2;
        }
        textView.setOnClickListener(new d());
    }
}
