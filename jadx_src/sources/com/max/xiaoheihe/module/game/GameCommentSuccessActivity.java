package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ResultVerifyInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.SyncSteamCommentObj;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.max.xiaoheihe.module.game.component.GameTimeAchieveItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: GameCommentSuccessActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.A2)
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GameCommentSuccessActivity extends BaseActivity {

    @dl.d
    public static final a R = new a(null);
    public static final int S = 8;

    @dl.d
    public static final String T = "comment_result";

    @dl.d
    public static final String U = "comment";

    @dl.d
    public static final String V = "appid";

    @dl.d
    public static final String W = "game_impression_post_type";

    @dl.d
    public static final String X = "/bbs/app/api/link/sync_steam";
    public static ChangeQuickRedirect changeQuickRedirect;
    private df.c0 L;

    @dl.e
    private ResultVerifyInfoObj M;

    @dl.e
    private LinkInfoObj N;

    @dl.e
    private String O;

    @dl.e
    private String P;

    @dl.d
    private final kotlinx.coroutines.q0 Q = kotlinx.coroutines.r0.a(kotlinx.coroutines.e1.e());

    /* JADX INFO: compiled from: GameCommentSuccessActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.d ResultVerifyInfoObj result, @dl.d LinkInfoObj comment, @dl.d String appid, @dl.d String game_impression_post_type) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, result, comment, appid, game_impression_post_type}, this, changeQuickRedirect, false, 32526, new Class[]{Context.class, ResultVerifyInfoObj.class, LinkInfoObj.class, String.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(result, "result");
            kotlin.jvm.internal.f0.p(comment, "comment");
            kotlin.jvm.internal.f0.p(appid, "appid");
            kotlin.jvm.internal.f0.p(game_impression_post_type, "game_impression_post_type");
            Intent intent = new Intent(context, (Class<?>) GameCommentSuccessActivity.class);
            intent.putExtra(GameCommentSuccessActivity.T, result);
            intent.putExtra("comment", comment);
            intent.putExtra("appid", appid);
            intent.putExtra(GameCommentSuccessActivity.W, game_impression_post_type);
            return intent;
        }
    }

    /* JADX INFO: compiled from: GameCommentSuccessActivity.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32527, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameCommentSuccessActivity.this.onBackPressed();
        }
    }

    /* JADX INFO: compiled from: GameCommentSuccessActivity.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ResultVerifyInfoObj f84132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameCommentSuccessActivity f84133c;

        c(ResultVerifyInfoObj resultVerifyInfoObj, GameCommentSuccessActivity gameCommentSuccessActivity) {
            this.f84132b = resultVerifyInfoObj;
            this.f84133c = gameCommentSuccessActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32528, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(this.f84132b.getSync_steam_protocol())) {
                Activity mContext = ((BaseActivity) this.f84133c).f66601b;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                com.max.xiaoheihe.base.router.b.j0(mContext, this.f84132b.getSync_steam_protocol());
                return;
            }
            String str = this.f84133c.O;
            LinkInfoObj linkInfoObj = this.f84133c.N;
            String description = linkInfoObj != null ? linkInfoObj.getDescription() : null;
            LinkInfoObj linkInfoObj2 = this.f84133c.N;
            String score = linkInfoObj2 != null ? linkInfoObj2.getScore() : null;
            LinkInfoObj linkInfoObj3 = this.f84133c.N;
            d2.v4(new SyncSteamCommentObj(str, description, score, null, linkInfoObj3 != null ? linkInfoObj3.getLinkid() : null, null)).show(this.f84133c.getSupportFragmentManager(), "syncfragment");
            GameCommentSuccessActivity.M1(this.f84133c, "sync");
        }
    }

    /* JADX INFO: compiled from: GameCommentSuccessActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: GameCommentSuccessActivity.kt */
        public static final class a implements com.max.xiaoheihe.module.bbs.z.b {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ GameCommentSuccessActivity f84135a;

            a(GameCommentSuccessActivity gameCommentSuccessActivity) {
                this.f84135a = gameCommentSuccessActivity;
            }

            @Override // com.max.xiaoheihe.module.bbs.z.b
            public void a() {
            }

            @Override // com.max.xiaoheihe.module.bbs.z.b
            public void onSuccess() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32530, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f84135a.finish();
            }
        }

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32529, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            LinkInfoObj linkInfoObj = GameCommentSuccessActivity.this.N;
            com.max.xiaoheihe.module.bbs.z zVarP3 = com.max.xiaoheihe.module.bbs.z.P3(linkInfoObj != null ? linkInfoObj.getLinkid() : null);
            zVarP3.Q3(new a(GameCommentSuccessActivity.this));
            zVarP3.show(GameCommentSuccessActivity.this.getSupportFragmentManager(), "PostNativeRouterDialogFragmentComment");
        }
    }

    /* JADX INFO: compiled from: GameCommentSuccessActivity.kt */
    public static final class e extends com.max.hbcommon.base.adapter.s<GameObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ResultVerifyInfoObj f84136b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ResultVerifyInfoObj resultVerifyInfoObj, Activity activity, List<GameObj> list) {
            super(activity, list, R.layout.item_my_game_with_time_and_achieve);
            this.f84136b = resultVerifyInfoObj;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 32531, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            ResultVerifyInfoObj resultVerifyInfoObj = this.f84136b;
            if (gameObj != null) {
                com.max.xiaoheihe.module.account.utils.l.P((GameTimeAchieveItemView) eVar.i(R.id.gtaiv), gameObj, 0, eVar.getAbsoluteAdapterPosition() == resultVerifyInfoObj.getRecommend_comment_game_list().size(), null, null, null, GameTimeAchieveItemView.Type.Comment, "");
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 32532, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameObj);
        }
    }

    public static final /* synthetic */ void M1(GameCommentSuccessActivity gameCommentSuccessActivity, String str) {
        if (PatchProxy.proxy(new Object[]{gameCommentSuccessActivity, str}, null, changeQuickRedirect, true, 32525, new Class[]{GameCommentSuccessActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCommentSuccessActivity.T1(str);
    }

    private final void T1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32522, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setType("4");
        pageEventObj.setPath(X);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("action", str);
        pageEventObj.setAddition(jsonObject);
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        com.max.hbcommon.analytics.d.c(pageEventObj, true);
    }

    private final void V1() {
        Intent intent;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32519, new Class[0], Void.TYPE).isSupported || (intent = getIntent()) == null) {
            return;
        }
        this.M = (ResultVerifyInfoObj) intent.getSerializableExtra(T);
        this.N = (LinkInfoObj) intent.getSerializableExtra("comment");
        this.O = intent.getStringExtra("appid");
        this.P = intent.getStringExtra(W);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0199  */
    /* JADX WARN: Code duplicated, block: B:74:0x019d  */
    private final void W1() {
        boolean z10;
        boolean z11;
        df.c0 c0Var;
        int i10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32520, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int iP = com.max.hbutils.utils.t.p(this.f66601b);
        df.c0 c0Var2 = this.L;
        df.c0 c0Var3 = null;
        if (c0Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            c0Var2 = null;
        }
        ViewGroup.LayoutParams layoutParams = c0Var2.f109090k.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iP;
        df.c0 c0Var4 = this.L;
        if (c0Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            c0Var4 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = c0Var4.f109089j.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = iP + ViewUtils.f(this.f66601b, 30.0f);
        df.c0 c0Var5 = this.L;
        if (c0Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            c0Var5 = null;
        }
        c0Var5.f109084e.setOnClickListener(new b());
        df.c0 c0Var6 = this.L;
        if (c0Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            c0Var6 = null;
        }
        c0Var6.f109086g.setBackground(com.max.hbutils.utils.q.o(this.f66601b, R.color.battery_charging, 10.0f));
        int iE = com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("这是你发布的");
        ResultVerifyInfoObj resultVerifyInfoObj = this.M;
        if (com.max.hbutils.utils.n.q(resultVerifyInfoObj != null ? resultVerifyInfoObj.getGame_comment_num() : null) > 0) {
            int length = spannableStringBuilder.length() + 1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("第 ");
            ResultVerifyInfoObj resultVerifyInfoObj2 = this.M;
            sb2.append(resultVerifyInfoObj2 != null ? resultVerifyInfoObj2.getGame_comment_num() : null);
            sb2.append(" 条评价");
            spannableStringBuilder.append((CharSequence) sb2.toString());
            int length2 = spannableStringBuilder.length() - 3;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(iE), length, length2, 33);
            spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.g(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c)), length, length2, 33);
            z10 = true;
        } else {
            z10 = false;
        }
        ResultVerifyInfoObj resultVerifyInfoObj3 = this.M;
        if (com.max.hbutils.utils.n.q(resultVerifyInfoObj3 != null ? resultVerifyInfoObj3.getGame_impression_num() : null) > 0) {
            int length3 = spannableStringBuilder.length();
            if (z10) {
                spannableStringBuilder.append((CharSequence) "和");
                i10 = 2;
            } else {
                i10 = 1;
            }
            int i11 = length3 + i10;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("第 ");
            ResultVerifyInfoObj resultVerifyInfoObj4 = this.M;
            sb3.append(resultVerifyInfoObj4 != null ? resultVerifyInfoObj4.getGame_impression_num() : null);
            sb3.append(" 个游戏印象");
            spannableStringBuilder.append((CharSequence) sb3.toString());
            int length4 = spannableStringBuilder.length() - 5;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(iE), i11, length4, 33);
            spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.g(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c)), i11, length4, 33);
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 || z11) {
            df.c0 c0Var7 = this.L;
            if (c0Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                c0Var7 = null;
            }
            c0Var7.f109088i.setText(spannableStringBuilder);
            df.c0 c0Var8 = this.L;
            if (c0Var8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                c0Var8 = null;
            }
            c0Var8.f109088i.setVisibility(0);
        } else {
            df.c0 c0Var9 = this.L;
            if (c0Var9 == null) {
                kotlin.jvm.internal.f0.S("binding");
                c0Var9 = null;
            }
            c0Var9.f109088i.setVisibility(8);
        }
        LinkInfoObj linkInfoObj = this.N;
        if (linkInfoObj == null) {
            c0Var = this.L;
            if (c0Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                c0Var = null;
            }
            c0Var.f109081b.setVisibility(8);
        } else {
            if (com.max.hbcommon.utils.c.u(linkInfoObj != null ? linkInfoObj.getLinkid() : null)) {
                c0Var = this.L;
                if (c0Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    c0Var = null;
                }
                c0Var.f109081b.setVisibility(8);
            } else {
                df.c0 c0Var10 = this.L;
                if (c0Var10 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    c0Var10 = null;
                }
                c0Var10.f109081b.setVisibility(0);
            }
        }
        ResultVerifyInfoObj resultVerifyInfoObj5 = this.M;
        if (resultVerifyInfoObj5 != null) {
            if (com.max.hbcommon.utils.c.x(resultVerifyInfoObj5.getCan_sync())) {
                df.c0 c0Var11 = this.L;
                if (c0Var11 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    c0Var11 = null;
                }
                c0Var11.f109082c.setVisibility(0);
                df.c0 c0Var12 = this.L;
                if (c0Var12 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    c0Var12 = null;
                }
                c0Var12.f109082c.setOnClickListener(new c(resultVerifyInfoObj5, this));
            } else {
                df.c0 c0Var13 = this.L;
                if (c0Var13 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    c0Var13 = null;
                }
                c0Var13.f109082c.setVisibility(8);
            }
            df.c0 c0Var14 = this.L;
            if (c0Var14 == null) {
                kotlin.jvm.internal.f0.S("binding");
                c0Var14 = null;
            }
            c0Var14.f109081b.setOnClickListener(new d());
            if (com.max.hbcommon.utils.c.w(resultVerifyInfoObj5.getRecommend_comment_game_list())) {
                return;
            }
            df.c0 c0Var15 = this.L;
            if (c0Var15 == null) {
                kotlin.jvm.internal.f0.S("binding");
                c0Var15 = null;
            }
            c0Var15.f109091l.setVisibility(0);
            df.c0 c0Var16 = this.L;
            if (c0Var16 == null) {
                kotlin.jvm.internal.f0.S("binding");
                c0Var16 = null;
            }
            c0Var16.f109087h.setLayoutManager(new LinearLayoutManager(this.f66601b));
            df.c0 c0Var17 = this.L;
            if (c0Var17 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                c0Var3 = c0Var17;
            }
            RecyclerView recyclerView = c0Var3.f109087h;
            Activity activity = this.f66601b;
            List<GameObj> recommend_comment_game_list = resultVerifyInfoObj5.getRecommend_comment_game_list();
            kotlin.jvm.internal.f0.m(recommend_comment_game_list);
            recyclerView.setAdapter(new e(resultVerifyInfoObj5, activity, recommend_comment_game_list));
        }
    }

    public final void X1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32521, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(this.Q, null, null, new GameCommentSuccessActivity$showShareImgDialog$1(this, null), 3, null);
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32524, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.O);
        LinkInfoObj linkInfoObj = this.N;
        jsonObject.addProperty("comment_id", linkInfoObj != null ? linkInfoObj.getLinkid() : null);
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32518, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        df.c0 c0VarD = df.c0.d(this.f66602c, null, false);
        kotlin.jvm.internal.f0.o(c0VarD, "inflate(mInflater, null, false)");
        this.L = c0VarD;
        if (c0VarD == null) {
            kotlin.jvm.internal.f0.S("binding");
            c0VarD = null;
        }
        setContentView(c0VarD.b());
        com.max.hbutils.utils.t.X(this.f66601b, 0, null);
        com.max.hbutils.utils.t.M(this, true);
        V1();
        W1();
        kotlinx.coroutines.k.f(this.Q, null, null, new GameCommentSuccessActivity$installViews$1(this, null), 3, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32523, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i11 == -1 && i10 == 9991 && intent != null) {
            PostUtils.f81983a.u(this, intent);
        }
    }
}
