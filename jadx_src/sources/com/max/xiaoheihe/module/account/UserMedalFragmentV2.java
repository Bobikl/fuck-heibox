package com.max.xiaoheihe.module.account;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.MedalLevelObj;
import com.max.xiaoheihe.bean.account.UserMedalResultV2;
import com.max.xiaoheihe.bean.account.UserMedalV2Obj;
import com.max.xiaoheihe.bean.bbs.AchieveBadgesObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.utils.ShareViewUtil;
import com.max.xiaoheihe.view.BoxAutoPlayView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import df.zb0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: UserMedalFragmentV2.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.jvm.internal.t0({"SMAP\nUserMedalFragmentV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMedalFragmentV2.kt\ncom/max/xiaoheihe/module/account/UserMedalFragmentV2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,490:1\n1#2:491\n1855#3,2:492\n*S KotlinDebug\n*F\n+ 1 UserMedalFragmentV2.kt\ncom/max/xiaoheihe/module/account/UserMedalFragmentV2\n*L\n348#1:492,2\n*E\n"})
@com.max.hbcommon.analytics.m(path = lb.d.G1)
@androidx.compose.runtime.internal.o(parameters = 0)
public final class UserMedalFragmentV2 extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f78556i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f78557j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f78558k = "heybox_id";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f78559l = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private String f78560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private BBSUserInfoObj f78561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zb0 f78562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<AchieveBadgesObj> f78563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private ArrayList<AchieveBadgesObj> f78564f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private ArrayList<UserMedalV2Obj> f78565g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<UserMedalV2Obj> f78566h;

    /* JADX INFO: compiled from: UserMedalFragmentV2.kt */
    public final class AchieveBadgeUpdatedBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public AchieveBadgeUpdatedBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@dl.d Context context, @dl.d Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 24528, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(intent, "intent");
            if (kotlin.jvm.internal.f0.g(lb.a.f131079z, intent.getAction())) {
                UserMedalFragmentV2.P3(UserMedalFragmentV2.this);
            }
        }
    }

    /* JADX INFO: compiled from: UserMedalFragmentV2.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final UserMedalFragmentV2 a(@dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24529, new Class[]{String.class}, UserMedalFragmentV2.class);
            if (patchProxyResultProxy.isSupported) {
                return (UserMedalFragmentV2) patchProxyResultProxy.result;
            }
            UserMedalFragmentV2 userMedalFragmentV2 = new UserMedalFragmentV2();
            Bundle bundle = new Bundle();
            bundle.putString("heybox_id", str);
            userMedalFragmentV2.setArguments(bundle);
            return userMedalFragmentV2;
        }
    }

    /* JADX INFO: compiled from: UserMedalFragmentV2.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<UserMedalResultV2>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24531, new Class[0], Void.TYPE).isSupported && UserMedalFragmentV2.this.isActive()) {
                super.onComplete();
                zb0 zb0Var = UserMedalFragmentV2.this.f78562d;
                zb0 zb0Var2 = null;
                if (zb0Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    zb0Var = null;
                }
                zb0Var.f118302d.A(0);
                zb0 zb0Var3 = UserMedalFragmentV2.this.f78562d;
                if (zb0Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    zb0Var2 = zb0Var3;
                }
                zb0Var2.f118302d.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 24530, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (UserMedalFragmentV2.this.isActive()) {
                super.onError(e10);
                UserMedalFragmentV2.T3(UserMedalFragmentV2.this);
                zb0 zb0Var = UserMedalFragmentV2.this.f78562d;
                zb0 zb0Var2 = null;
                if (zb0Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    zb0Var = null;
                }
                zb0Var.f118302d.A(0);
                zb0 zb0Var3 = UserMedalFragmentV2.this.f78562d;
                if (zb0Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    zb0Var2 = zb0Var3;
                }
                zb0Var2.f118302d.p(0);
            }
        }

        public void onNext(@dl.d Result<UserMedalResultV2> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24532, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (UserMedalFragmentV2.this.isActive()) {
                super.onNext(result);
                if (result.getResult() != null) {
                    UserMedalFragmentV2 userMedalFragmentV2 = UserMedalFragmentV2.this;
                    UserMedalResultV2 result2 = result.getResult();
                    kotlin.jvm.internal.f0.o(result2, "result.result");
                    UserMedalFragmentV2.Q3(userMedalFragmentV2, result2);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24533, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UserMedalResultV2>) obj);
        }
    }

    /* JADX INFO: compiled from: UserMedalFragmentV2.kt */
    public static final class c extends com.max.hbcommon.base.adapter.s<UserMedalV2Obj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: UserMedalFragmentV2.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ UserMedalFragmentV2 f78570b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ UserMedalV2Obj f78571c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<ImageView> f78572d;

            a(UserMedalFragmentV2 userMedalFragmentV2, UserMedalV2Obj userMedalV2Obj, Ref.ObjectRef<ImageView> objectRef) {
                this.f78570b = userMedalFragmentV2;
                this.f78571c = userMedalV2Obj;
                this.f78572d = objectRef;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24536, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                UserMedalFragmentV2 userMedalFragmentV2 = this.f78570b;
                UserMedalDetailActivity.a aVar = UserMedalDetailActivity.Q;
                Activity mContext = ((com.max.hbcommon.base.d) userMedalFragmentV2).mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                userMedalFragmentV2.startActivityForResult(aVar.a(mContext, this.f78571c, this.f78570b.f78561c), 4, ActivityOptions.makeSceneTransitionAnimation(((com.max.hbcommon.base.d) this.f78570b).mContext, this.f78572d.f124891b, "medal_img").toBundle());
            }
        }

        c(Activity activity, ArrayList<UserMedalV2Obj> arrayList) {
            super(activity, arrayList, R.layout.item_can_wear_medal);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x013d  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v15, types: [T, android.view.View] */
        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d UserMedalV2Obj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 24534, new Class[]{com.max.hbcommon.base.adapter.s.e.class, UserMedalV2Obj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            ViewGroup viewGroup = (ViewGroup) viewHolder.i(R.id.vg_bg);
            int iL = UserMedalFragmentV2.this.f78565g.size() > 7 ? (int) (((ViewUtils.L(((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext) - ViewUtils.f(((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext, 62.0f)) - (ViewUtils.f(((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext, 34.0f) * 7.5f)) / 8) : ((ViewUtils.L(((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext) - ViewUtils.f(((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext, 74.0f)) - (ViewUtils.f(((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext, 34.0f) * UserMedalFragmentV2.this.f78565g.size())) / UserMedalFragmentV2.this.f78565g.size();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = iL;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f124891b = viewHolder.i(R.id.iv_icon);
            int iO = ViewUtils.o(((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext, viewGroup);
            if (data.getWear() == 1) {
                viewGroup.setBackground(ViewUtils.x(iO, com.max.hbcommon.utils.l.a(R.color.medal_wear_start), com.max.hbcommon.utils.l.a(R.color.medal_wear_end)));
            } else {
                viewGroup.setBackground(com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext, R.color.white_alpha10, ViewUtils.h0(((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext, iO)));
            }
            com.max.hbimage.b.K(data.getCurrentLevel().getThumb(), (ImageView) objectRef.f124891b);
            if (data.getWear_level() != null) {
                int level = data.getLevel();
                Integer wear_level = data.getWear_level();
                kotlin.jvm.internal.f0.m(wear_level);
                if (level >= wear_level.intValue()) {
                    UserMedalFragmentV2 userMedalFragmentV2 = UserMedalFragmentV2.this;
                    T iv_icon = objectRef.f124891b;
                    kotlin.jvm.internal.f0.o(iv_icon, "iv_icon");
                    UserMedalFragmentV2.R3(userMedalFragmentV2, false, (ImageView) iv_icon);
                } else {
                    UserMedalFragmentV2 userMedalFragmentV3 = UserMedalFragmentV2.this;
                    T iv_icon2 = objectRef.f124891b;
                    kotlin.jvm.internal.f0.o(iv_icon2, "iv_icon");
                    UserMedalFragmentV2.R3(userMedalFragmentV3, true, (ImageView) iv_icon2);
                }
            } else {
                UserMedalFragmentV2 userMedalFragmentV4 = UserMedalFragmentV2.this;
                T iv_icon3 = objectRef.f124891b;
                kotlin.jvm.internal.f0.o(iv_icon3, "iv_icon");
                UserMedalFragmentV2.R3(userMedalFragmentV4, true, (ImageView) iv_icon3);
            }
            viewHolder.itemView.setOnClickListener(new a(UserMedalFragmentV2.this, data, objectRef));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, UserMedalV2Obj userMedalV2Obj) {
            if (PatchProxy.proxy(new Object[]{eVar, userMedalV2Obj}, this, changeQuickRedirect, false, 24535, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, userMedalV2Obj);
        }
    }

    /* JADX INFO: compiled from: UserMedalFragmentV2.kt */
    public static final class d extends com.max.hbcommon.base.adapter.s<AchieveBadgesObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: UserMedalFragmentV2.kt */
        public static final class a extends com.max.hbcommon.base.adapter.s<UserMedalV2Obj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ UserMedalFragmentV2 f78574b;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.UserMedalFragmentV2$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: UserMedalFragmentV2.kt */
            public static final class ViewOnClickListenerC0644a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ UserMedalFragmentV2 f78575b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ UserMedalV2Obj f78576c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef<ImageView> f78577d;

                ViewOnClickListenerC0644a(UserMedalFragmentV2 userMedalFragmentV2, UserMedalV2Obj userMedalV2Obj, Ref.ObjectRef<ImageView> objectRef) {
                    this.f78575b = userMedalFragmentV2;
                    this.f78576c = userMedalV2Obj;
                    this.f78577d = objectRef;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24543, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    UserMedalFragmentV2 userMedalFragmentV2 = this.f78575b;
                    UserMedalDetailActivity.a aVar = UserMedalDetailActivity.Q;
                    Activity mContext = ((com.max.hbcommon.base.d) userMedalFragmentV2).mContext;
                    kotlin.jvm.internal.f0.o(mContext, "mContext");
                    userMedalFragmentV2.startActivityForResult(aVar.a(mContext, this.f78576c, this.f78575b.f78561c), 4, ActivityOptions.makeSceneTransitionAnimation(((com.max.hbcommon.base.d) this.f78575b).mContext, this.f78577d.f124891b, "medal_img").toBundle());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(UserMedalFragmentV2 userMedalFragmentV2, Activity activity, List<UserMedalV2Obj> list) {
                super(activity, list, R.layout.item_user_medal_v2);
                this.f78574b = userMedalFragmentV2;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0103  */
            /* JADX WARN: Code duplicated, block: B:36:0x0194  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [T, android.view.View] */
            public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d UserMedalV2Obj medal) {
                int i10;
                boolean z10;
                if (PatchProxy.proxy(new Object[]{viewHolder, medal}, this, changeQuickRedirect, false, 24541, new Class[]{com.max.hbcommon.base.adapter.s.e.class, UserMedalV2Obj.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
                kotlin.jvm.internal.f0.p(medal, "medal");
                MedalLevelObj currentLevel = medal.getCurrentLevel();
                TextView textView = (TextView) viewHolder.i(R.id.tv_medal_name);
                TextView textView2 = (TextView) viewHolder.i(R.id.tv_level);
                ViewGroup vg_level = (ViewGroup) viewHolder.i(R.id.vg_level);
                ViewGroup viewGroup = (ViewGroup) viewHolder.i(R.id.vg_wear_state);
                ImageView iv_wear_state = (ImageView) viewHolder.i(R.id.iv_wear_state);
                HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) viewHolder.i(R.id.tv_desc);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.f124891b = viewHolder.i(R.id.iv_icon);
                if (medal.getWear_level() == null) {
                    viewGroup.setVisibility(8);
                    i10 = 1;
                } else {
                    viewGroup.setVisibility(0);
                    if (medal.getWear() == 1) {
                        viewGroup.setBackground(ViewUtils.x(ViewUtils.f(((com.max.hbcommon.base.d) this.f78574b).mContext, 20.0f), com.max.hbcommon.utils.l.a(R.color.medal_wear_start), com.max.hbcommon.utils.l.a(R.color.medal_wear_end)));
                    } else {
                        viewGroup.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) this.f78574b).mContext, R.color.white, 20.0f), ((com.max.hbcommon.base.d) this.f78574b).mContext, R.color.divider_secondary_1_color, 0.5f));
                    }
                    com.max.hbimage.b.K(medal.getCurrentLevel().getThumb(), iv_wear_state);
                    if (medal.getWear_level() != null) {
                        int level = medal.getLevel();
                        Integer wear_level = medal.getWear_level();
                        kotlin.jvm.internal.f0.m(wear_level);
                        if (level >= wear_level.intValue()) {
                            UserMedalFragmentV2 userMedalFragmentV2 = this.f78574b;
                            kotlin.jvm.internal.f0.o(iv_wear_state, "iv_wear_state");
                            UserMedalFragmentV2.R3(userMedalFragmentV2, false, iv_wear_state);
                            i10 = 1;
                        } else {
                            UserMedalFragmentV2 userMedalFragmentV3 = this.f78574b;
                            kotlin.jvm.internal.f0.o(iv_wear_state, "iv_wear_state");
                            i10 = 1;
                            UserMedalFragmentV2.R3(userMedalFragmentV3, true, iv_wear_state);
                        }
                    } else {
                        UserMedalFragmentV2 userMedalFragmentV4 = this.f78574b;
                        kotlin.jvm.internal.f0.o(iv_wear_state, "iv_wear_state");
                        i10 = 1;
                        UserMedalFragmentV2.R3(userMedalFragmentV4, true, iv_wear_state);
                    }
                }
                textView.setText(currentLevel.getName());
                com.max.hbimage.b.K(currentLevel.getImg(), (ImageView) objectRef.f124891b);
                if (medal.getLevels().size() <= i10 || medal.getLevel() <= 0) {
                    vg_level.setVisibility(8);
                } else {
                    vg_level.setVisibility(0);
                    textView2.setText("Lv." + medal.getLevel());
                    UserMedalFragmentV2 userMedalFragmentV5 = this.f78574b;
                    kotlin.jvm.internal.f0.o(vg_level, "vg_level");
                    UserMedalFragmentV2.S3(userMedalFragmentV5, vg_level, currentLevel);
                }
                SpannableString spannableString = new SpannableString(medal.getDesc());
                Integer achieved = currentLevel.getAchieved();
                if (achieved != null && achieved.intValue() == 1 && !com.max.hbcommon.utils.c.u(medal.getHighlight_text())) {
                    String desc = medal.getDesc();
                    if (desc != null) {
                        String highlight_text = medal.getHighlight_text();
                        kotlin.jvm.internal.f0.m(highlight_text);
                        if (StringsKt__StringsKt.W2(desc, highlight_text, false, 2, null)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        String highlight_text2 = medal.getHighlight_text();
                        kotlin.jvm.internal.f0.m(highlight_text2);
                        int iS3 = StringsKt__StringsKt.s3(spannableString, highlight_text2, 0, false, 6, null);
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                        String highlight_text3 = medal.getHighlight_text();
                        kotlin.jvm.internal.f0.m(highlight_text3);
                        spannableString.setSpan(foregroundColorSpan, iS3, highlight_text3.length() + iS3, 17);
                    }
                }
                hBLineHeightTextView.setText(spannableString);
                if (ViewUtils.S(hBLineHeightTextView.getPaint(), medal.getDesc()) > ViewUtils.f(((com.max.hbcommon.base.d) this.f78574b).mContext, 82.0f)) {
                    ViewGroup.LayoutParams layoutParams = hBLineHeightTextView.getLayoutParams();
                    kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ViewUtils.f(((com.max.hbcommon.base.d) this.f78574b).mContext, 3.0f);
                } else {
                    ViewGroup.LayoutParams layoutParams2 = hBLineHeightTextView.getLayoutParams();
                    kotlin.jvm.internal.f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = ViewUtils.f(((com.max.hbcommon.base.d) this.f78574b).mContext, 7.0f);
                }
                Integer achieved2 = currentLevel.getAchieved();
                if (achieved2 != null && achieved2.intValue() == 1) {
                    UserMedalFragmentV2 userMedalFragmentV6 = this.f78574b;
                    T iv_icon = objectRef.f124891b;
                    kotlin.jvm.internal.f0.o(iv_icon, "iv_icon");
                    UserMedalFragmentV2.R3(userMedalFragmentV6, false, (ImageView) iv_icon);
                    textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                } else {
                    UserMedalFragmentV2 userMedalFragmentV7 = this.f78574b;
                    T iv_icon2 = objectRef.f124891b;
                    kotlin.jvm.internal.f0.o(iv_icon2, "iv_icon");
                    UserMedalFragmentV2.R3(userMedalFragmentV7, true, (ImageView) iv_icon2);
                    textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
                }
                viewHolder.itemView.setOnClickListener(new ViewOnClickListenerC0644a(this.f78574b, medal, objectRef));
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, UserMedalV2Obj userMedalV2Obj) {
                if (PatchProxy.proxy(new Object[]{eVar, userMedalV2Obj}, this, changeQuickRedirect, false, 24542, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, userMedalV2Obj);
            }
        }

        /* JADX INFO: compiled from: UserMedalFragmentV2.kt */
        public static final class b extends RecyclerView.ItemDecoration {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f78578b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f78579c;

            b(int i10, int i11) {
                this.f78578b = i10;
                this.f78579c = i11;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
                if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 24544, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(outRect, "outRect");
                kotlin.jvm.internal.f0.p(view, "view");
                kotlin.jvm.internal.f0.p(parent, "parent");
                kotlin.jvm.internal.f0.p(state, "state");
                if (parent.getChildAdapterPosition(view) % 4 == 3) {
                    outRect.set(0, 0, this.f78578b - this.f78579c, 0);
                } else {
                    outRect.set(0, 0, this.f78578b - (this.f78579c * 2), 0);
                }
            }
        }

        d(Activity activity, ArrayList<AchieveBadgesObj> arrayList) {
            super(activity, arrayList, R.layout.layout_user_medal_group);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d AchieveBadgesObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 24538, new Class[]{com.max.hbcommon.base.adapter.s.e.class, AchieveBadgesObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            TextView textView = (TextView) viewHolder.i(R.id.tv_group_name);
            RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv_group);
            textView.setText(data.getName());
            recyclerView.setAdapter(new a(UserMedalFragmentV2.this, ((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext, data.getMedals()));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, AchieveBadgesObj achieveBadgesObj) {
            if (PatchProxy.proxy(new Object[]{eVar, achieveBadgesObj}, this, changeQuickRedirect, false, 24540, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, achieveBadgesObj);
        }

        @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 24539, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
            return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
        }

        @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
        @dl.d
        public com.max.hbcommon.base.adapter.s.e onCreateViewHolder(@dl.d ViewGroup parent, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 24537, new Class[]{ViewGroup.class, Integer.TYPE}, com.max.hbcommon.base.adapter.s.e.class);
            if (patchProxyResultProxy.isSupported) {
                return (com.max.hbcommon.base.adapter.s.e) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(parent, "parent");
            com.max.hbcommon.base.adapter.s.e eVarOnCreateViewHolder = super.onCreateViewHolder(parent, i10);
            kotlin.jvm.internal.f0.o(eVarOnCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
            RecyclerView recyclerView = (RecyclerView) eVarOnCreateViewHolder.i(R.id.rv_group);
            recyclerView.setLayoutManager(new GridLayoutManager(((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext, 4));
            int iL = ((ViewUtils.L(((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext) - (ViewUtils.f(((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext, 12.0f) * 2)) - (ViewUtils.f(((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext, 76.0f) * 4)) / 5;
            int iF = ViewUtils.f(((com.max.hbcommon.base.d) UserMedalFragmentV2.this).mContext, 3.0f);
            recyclerView.setPadding(iL - iF, 0, 0, iF);
            recyclerView.addItemDecoration(new b(iL, iF));
            return eVarOnCreateViewHolder;
        }
    }

    /* JADX INFO: compiled from: UserMedalFragmentV2.kt */
    public static final class e implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 24545, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            UserMedalFragmentV2.P3(UserMedalFragmentV2.this);
        }
    }

    public static final /* synthetic */ void P3(UserMedalFragmentV2 userMedalFragmentV2) {
        if (PatchProxy.proxy(new Object[]{userMedalFragmentV2}, null, changeQuickRedirect, true, 24525, new Class[]{UserMedalFragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        userMedalFragmentV2.U3();
    }

    public static final /* synthetic */ void Q3(UserMedalFragmentV2 userMedalFragmentV2, UserMedalResultV2 userMedalResultV2) {
        if (PatchProxy.proxy(new Object[]{userMedalFragmentV2, userMedalResultV2}, null, changeQuickRedirect, true, 24527, new Class[]{UserMedalFragmentV2.class, UserMedalResultV2.class}, Void.TYPE).isSupported) {
            return;
        }
        userMedalFragmentV2.Z3(userMedalResultV2);
    }

    public static final /* synthetic */ void R3(UserMedalFragmentV2 userMedalFragmentV2, boolean z10, ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{userMedalFragmentV2, new Byte(z10 ? (byte) 1 : (byte) 0), imageView}, null, changeQuickRedirect, true, 24523, new Class[]{UserMedalFragmentV2.class, Boolean.TYPE, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        userMedalFragmentV2.b4(z10, imageView);
    }

    public static final /* synthetic */ void S3(UserMedalFragmentV2 userMedalFragmentV2, ViewGroup viewGroup, MedalLevelObj medalLevelObj) {
        if (PatchProxy.proxy(new Object[]{userMedalFragmentV2, viewGroup, medalLevelObj}, null, changeQuickRedirect, true, 24524, new Class[]{UserMedalFragmentV2.class, ViewGroup.class, MedalLevelObj.class}, Void.TYPE).isSupported) {
            return;
        }
        userMedalFragmentV2.c4(viewGroup, medalLevelObj);
    }

    public static final /* synthetic */ void T3(UserMedalFragmentV2 userMedalFragmentV2) {
        if (PatchProxy.proxy(new Object[]{userMedalFragmentV2}, null, changeQuickRedirect, true, 24526, new Class[]{UserMedalFragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        userMedalFragmentV2.showError();
    }

    private final void U3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24517, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Sa(this.f78560b).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24511, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        zb0 zb0Var = this.f78562d;
        com.max.hbcommon.base.adapter.s<UserMedalV2Obj> sVar = null;
        if (zb0Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0Var = null;
        }
        RecyclerView recyclerView = zb0Var.f118304f.f115756d;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        this.f78566h = new c(this.mContext, this.f78565g);
        zb0 zb0Var2 = this.f78562d;
        if (zb0Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0Var2 = null;
        }
        RecyclerView recyclerView2 = zb0Var2.f118304f.f115756d;
        com.max.hbcommon.base.adapter.s<UserMedalV2Obj> sVar2 = this.f78566h;
        if (sVar2 == null) {
            kotlin.jvm.internal.f0.S("mCanWearMedalAdapter");
        } else {
            sVar = sVar2;
        }
        recyclerView2.setAdapter(sVar);
    }

    private final void X3() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24512, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        this.f78560b = arguments.getString("heybox_id");
    }

    @dl.d
    @xh.m
    public static final UserMedalFragmentV2 Y3(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 24522, new Class[]{String.class}, UserMedalFragmentV2.class);
        return patchProxyResultProxy.isSupported ? (UserMedalFragmentV2) patchProxyResultProxy.result : f78556i.a(str);
    }

    private final void Z3(UserMedalResultV2 userMedalResultV2) {
        if (PatchProxy.proxy(new Object[]{userMedalResultV2}, this, changeQuickRedirect, false, 24518, new Class[]{UserMedalResultV2.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        this.f78564f.clear();
        List<AchieveBadgesObj> groups = userMedalResultV2.getGroups();
        if (groups != null) {
            this.f78564f.addAll(groups);
        }
        a4(userMedalResultV2);
        com.max.hbcommon.base.adapter.s<AchieveBadgesObj> sVar = this.f78563e;
        if (sVar == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
            sVar = null;
        }
        sVar.notifyDataSetChanged();
    }

    private final void a4(UserMedalResultV2 userMedalResultV2) {
        BBSUserInfoObj user;
        if (PatchProxy.proxy(new Object[]{userMedalResultV2}, this, changeQuickRedirect, false, 24515, new Class[]{UserMedalResultV2.class}, Void.TYPE).isSupported || userMedalResultV2 == null || (user = userMedalResultV2.getUser()) == null) {
            return;
        }
        this.f78561c = user;
        zb0 zb0Var = this.f78562d;
        zb0 zb0Var2 = null;
        if (zb0Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0Var = null;
        }
        zb0Var.f118304f.f115754b.setAvatar(user.getAvartar());
        zb0 zb0Var3 = this.f78562d;
        if (zb0Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0Var3 = null;
        }
        zb0Var3.f118304f.f115754b.a();
        zb0 zb0Var4 = this.f78562d;
        if (zb0Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0Var4 = null;
        }
        zb0Var4.f118304f.f115754b.setDecoration(user.getAvatar_decoration());
        zb0 zb0Var5 = this.f78562d;
        if (zb0Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0Var5 = null;
        }
        zb0Var5.f118304f.f115758f.setText(user.getUsername());
        zb0 zb0Var6 = this.f78562d;
        if (zb0Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0Var6 = null;
        }
        zb0Var6.f118304f.f115759g.setBackground(com.max.hbutils.utils.q.o(this.mContext, R.color.default_off_color, 2.0f));
        int iQ = com.max.hbutils.utils.n.q(userMedalResultV2.getWear_achieved_cnt());
        this.f78565g.clear();
        if (com.max.hbcommon.utils.c.w(userMedalResultV2.getCan_wear_medal_ids())) {
            zb0 zb0Var7 = this.f78562d;
            if (zb0Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                zb0Var7 = null;
            }
            zb0Var7.f118304f.f115757e.setText("-/-");
        } else {
            HashMap map = new HashMap();
            zb0 zb0Var8 = this.f78562d;
            if (zb0Var8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                zb0Var8 = null;
            }
            TextView textView = zb0Var8.f118304f.f115757e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(iQ);
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            List<String> can_wear_medal_ids = userMedalResultV2.getCan_wear_medal_ids();
            kotlin.jvm.internal.f0.m(can_wear_medal_ids);
            sb2.append(can_wear_medal_ids.size());
            textView.setText(sb2.toString());
            if (!com.max.hbcommon.utils.c.w(userMedalResultV2.getGroups())) {
                List<AchieveBadgesObj> groups = userMedalResultV2.getGroups();
                kotlin.jvm.internal.f0.m(groups);
                for (AchieveBadgesObj achieveBadgesObj : groups) {
                    if (!com.max.hbcommon.utils.c.w(achieveBadgesObj.getMedals())) {
                        List<UserMedalV2Obj> medals = achieveBadgesObj.getMedals();
                        kotlin.jvm.internal.f0.m(medals);
                        for (UserMedalV2Obj userMedalV2Obj : medals) {
                            List<String> can_wear_medal_ids2 = userMedalResultV2.getCan_wear_medal_ids();
                            kotlin.jvm.internal.f0.m(can_wear_medal_ids2);
                            if (can_wear_medal_ids2.contains(userMedalV2Obj.getMedal_id())) {
                                String medal_id = userMedalV2Obj.getMedal_id();
                                kotlin.jvm.internal.f0.o(userMedalV2Obj, "userMedalV2Obj");
                                map.put(medal_id, userMedalV2Obj);
                            }
                        }
                    }
                }
            }
            List<String> can_wear_medal_ids3 = userMedalResultV2.getCan_wear_medal_ids();
            kotlin.jvm.internal.f0.m(can_wear_medal_ids3);
            Iterator<T> it = can_wear_medal_ids3.iterator();
            while (it.hasNext()) {
                UserMedalV2Obj userMedalV2Obj2 = (UserMedalV2Obj) map.get((String) it.next());
                if (userMedalV2Obj2 != null) {
                    this.f78565g.add(userMedalV2Obj2);
                }
            }
        }
        com.max.hbcommon.base.adapter.s<UserMedalV2Obj> sVar = this.f78566h;
        if (sVar == null) {
            kotlin.jvm.internal.f0.S("mCanWearMedalAdapter");
            sVar = null;
        }
        sVar.notifyDataSetChanged();
        if (com.max.hbcommon.utils.c.w(user.getMedal())) {
            zb0 zb0Var9 = this.f78562d;
            if (zb0Var9 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                zb0Var2 = zb0Var9;
            }
            zb0Var2.f118304f.f115760h.setVisibility(8);
            return;
        }
        String img_url = user.getMedal().get(0).getImg_url();
        zb0 zb0Var10 = this.f78562d;
        if (zb0Var10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0Var10 = null;
        }
        com.max.hbimage.b.K(img_url, zb0Var10.f118304f.f115755c);
        zb0 zb0Var11 = this.f78562d;
        if (zb0Var11 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            zb0Var2 = zb0Var11;
        }
        zb0Var2.f118304f.f115760h.setVisibility(0);
    }

    private final void b4(boolean z10, ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), imageView}, this, changeQuickRedirect, false, 24520, new Class[]{Boolean.TYPE, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            imageView.setAlpha(1.0f);
            imageView.setColorFilter((ColorFilter) null);
        } else {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            imageView.setAlpha(0.5f);
        }
    }

    private final void c4(ViewGroup viewGroup, MedalLevelObj medalLevelObj) {
        if (PatchProxy.proxy(new Object[]{viewGroup, medalLevelObj}, this, changeQuickRedirect, false, 24521, new Class[]{ViewGroup.class, MedalLevelObj.class}, Void.TYPE).isSupported) {
            return;
        }
        BoxAutoPlayView boxAutoPlayView = (BoxAutoPlayView) viewGroup.findViewById(R.id.bv_level);
        String rank_level = medalLevelObj.getRank_level();
        if (kotlin.jvm.internal.f0.g(rank_level, "3")) {
            boxAutoPlayView.setmResId(R.drawable.user_achievement_level_gold_gradient_filled_167x10);
            boxAutoPlayView.setRadius(ViewUtils.f(this.mContext, 2.0f));
            boxAutoPlayView.c(ViewUtils.f(getContext(), 10.0f), ViewUtils.f(getContext(), 22.0f));
            boxAutoPlayView.setVisibility(0);
            boxAutoPlayView.e();
            viewGroup.setBackground(null);
            return;
        }
        if (kotlin.jvm.internal.f0.g(rank_level, "2")) {
            boxAutoPlayView.setVisibility(8);
            viewGroup.setBackground(com.max.hbutils.utils.q.o(this.mContext, R.color.medal_silver, 2.0f));
        } else {
            boxAutoPlayView.setVisibility(8);
            viewGroup.setBackground(com.max.hbutils.utils.q.o(this.mContext, R.color.medal_level_bronze, 2.0f));
        }
    }

    @dl.d
    public final Bitmap V3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24516, new Class[0], Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        zb0 zb0Var = this.f78562d;
        if (zb0Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0Var = null;
        }
        Bitmap bitmapU = ViewUtils.U(zb0Var.f118304f.b());
        zb0 zb0Var2 = this.f78562d;
        if (zb0Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0Var2 = null;
        }
        Bitmap bitmapG = ShareViewUtil.g(zb0Var2.f118301c);
        int iF = ViewUtils.f(this.mContext, 8.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapU.getWidth(), bitmapU.getHeight() + iF + bitmapG.getHeight(), Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.f0.o(bitmapCreateBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmapU, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmapG, 0.0f, bitmapU.getHeight() + iF, (Paint) null);
        bitmapU.recycle();
        bitmapG.recycle();
        return bitmapCreateBitmap;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24519, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("key", "achieve");
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24514, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        U3();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24510, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        zb0 zb0VarC = zb0.c(this.mInflater);
        kotlin.jvm.internal.f0.o(zb0VarC, "inflate(mInflater)");
        this.f78562d = zb0VarC;
        zb0 zb0Var = null;
        if (zb0VarC == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0VarC = null;
        }
        setContentView(zb0VarC);
        X3();
        zb0 zb0Var2 = this.f78562d;
        if (zb0Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0Var2 = null;
        }
        zb0Var2.f118301c.setBackgroundResource(R.color.background_layer_2_color);
        zb0 zb0Var3 = this.f78562d;
        if (zb0Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0Var3 = null;
        }
        zb0Var3.f118301c.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.f78563e = new d(this.mContext, this.f78564f);
        zb0 zb0Var4 = this.f78562d;
        if (zb0Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0Var4 = null;
        }
        RecyclerView recyclerView = zb0Var4.f118301c;
        com.max.hbcommon.base.adapter.s<AchieveBadgesObj> sVar = this.f78563e;
        if (sVar == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
            sVar = null;
        }
        recyclerView.setAdapter(sVar);
        zb0 zb0Var5 = this.f78562d;
        if (zb0Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            zb0Var5 = null;
        }
        zb0Var5.f118302d.S(new e());
        zb0 zb0Var6 = this.f78562d;
        if (zb0Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            zb0Var = zb0Var6;
        }
        zb0Var.f118302d.b0(false);
        W3();
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @kotlin.k(message = "Deprecated in Java")
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 4 && i11 == -1) {
            U3();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24513, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        U3();
    }
}
