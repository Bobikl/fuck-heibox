package com.max.xiaoheihe.module.account;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.MedalLevelObj;
import com.max.xiaoheihe.bean.account.UserMedalV2Obj;
import com.max.xiaoheihe.bean.bbs.BBSAchieveObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import df.m1;
import df.yb0;
import java.io.Serializable;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: UserMedalDetailActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class UserMedalDetailActivity extends BaseActivity {

    @dl.d
    public static final a Q = new a(null);
    public static final int R = 8;

    @dl.d
    private static final String S = "arg_medal_info";

    @dl.d
    private static final String T = "arg_user";
    public static ChangeQuickRedirect changeQuickRedirect;
    private UserMedalV2Obj L;
    private m1 M;

    @dl.e
    private BBSUserInfoObj N;
    private com.max.hbcommon.base.adapter.s<MedalLevelObj> O;

    @dl.e
    private View P;

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.d UserMedalV2Obj medal, @dl.e BBSUserInfoObj bBSUserInfoObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, medal, bBSUserInfoObj}, this, changeQuickRedirect, false, 24485, new Class[]{Context.class, UserMedalV2Obj.class, BBSUserInfoObj.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(medal, "medal");
            Intent intent = new Intent(context, (Class<?>) UserMedalDetailActivity.class);
            intent.putExtra(UserMedalDetailActivity.S, medal);
            intent.putExtra(UserMedalDetailActivity.T, bBSUserInfoObj);
            return intent;
        }

        /* JADX WARN: Code duplicated, block: B:51:0x01fb  */
        @xh.m
        public final void b(@dl.d View detailView, @dl.e BBSUserInfoObj bBSUserInfoObj, @dl.d UserMedalV2Obj medal, @dl.d MedalLevelObj medalLevel) {
            int iE;
            String str;
            boolean z10;
            if (PatchProxy.proxy(new Object[]{detailView, bBSUserInfoObj, medal, medalLevel}, this, changeQuickRedirect, false, 24488, new Class[]{View.class, BBSUserInfoObj.class, UserMedalV2Obj.class, MedalLevelObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(detailView, "detailView");
            kotlin.jvm.internal.f0.p(medal, "medal");
            kotlin.jvm.internal.f0.p(medalLevel, "medalLevel");
            yb0 yb0VarA = yb0.a(detailView);
            kotlin.jvm.internal.f0.o(yb0VarA, "bind(detailView)");
            yb0VarA.f117891b.setAvatar(bBSUserInfoObj != null ? bBSUserInfoObj.getAvartar() : null);
            yb0VarA.f117891b.a();
            yb0VarA.f117891b.setDecoration(bBSUserInfoObj != null ? bBSUserInfoObj.getAvatar_decoration() : null);
            yb0VarA.f117902m.setText(bBSUserInfoObj != null ? bBSUserInfoObj.getUsername() : null);
            com.max.hbimage.b.K(medalLevel.getImg(), yb0VarA.f117893d);
            Integer achieved = medalLevel.getAchieved();
            if (achieved != null && achieved.intValue() == 1) {
                yb0VarA.f117893d.setAlpha(1.0f);
                yb0VarA.f117893d.setColorFilter((ColorFilter) null);
                yb0VarA.f117901l.setText(medalLevel.getAchieved_desc());
            } else {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(0.0f);
                yb0VarA.f117893d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                yb0VarA.f117893d.setAlpha(0.5f);
                yb0VarA.f117901l.setText("暂未获得");
            }
            if (medalLevel.getAchieved_percent() > 0 || medalLevel.getRank_level() != null) {
                yb0VarA.f117896g.setVisibility(0);
                if (medalLevel.getRank_level() != null) {
                    String rank_level = medalLevel.getRank_level();
                    if (kotlin.jvm.internal.f0.g(rank_level, "3")) {
                        yb0VarA.f117892c.setImageResource(R.drawable.user_achievement_level_gold_filled_15x15);
                        iE = com.max.xiaoheihe.utils.d.E(R.color.medal_gold);
                        str = "黄金";
                    } else if (kotlin.jvm.internal.f0.g(rank_level, "2")) {
                        yb0VarA.f117892c.setImageResource(R.drawable.user_achievement_level_silver_filled_15x15);
                        iE = com.max.xiaoheihe.utils.d.E(R.color.white);
                        str = "白银";
                    } else {
                        yb0VarA.f117892c.setImageResource(R.drawable.user_achievement_level_copper_filled_15x15);
                        iE = com.max.xiaoheihe.utils.d.E(R.color.medal_bronze);
                        str = "黄铜";
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + "成就");
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(iE), 0, spannableStringBuilder.length(), 17);
                    if (medalLevel.getAchieved_percent() > 0) {
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) ((char) 65292 + medalLevel.getAchieved_percent() + "% 的盒友达成"));
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(iE), length, spannableStringBuilder.length() - 5, 17);
                    }
                    yb0VarA.f117892c.setVisibility(0);
                    yb0VarA.f117896g.setText(spannableStringBuilder);
                } else {
                    yb0VarA.f117892c.setVisibility(8);
                    SpannableString spannableString = new SpannableString("盒友达成率 " + medalLevel.getAchieved_percent() + '%');
                    spannableString.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.white)), 5, spannableString.length(), 17);
                    yb0VarA.f117896g.setText(spannableString);
                }
            } else {
                yb0VarA.f117896g.setVisibility(8);
            }
            SpannableString spannableString2 = new SpannableString(medalLevel.getDesc());
            if (!com.max.hbcommon.utils.c.u(medalLevel.getHighlight_text())) {
                String desc = medalLevel.getDesc();
                if (desc != null) {
                    String highlight_text = medalLevel.getHighlight_text();
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
                    String highlight_text2 = medalLevel.getHighlight_text();
                    kotlin.jvm.internal.f0.m(highlight_text2);
                    int iS3 = StringsKt__StringsKt.s3(spannableString2, highlight_text2, 0, false, 6, null);
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.white));
                    String highlight_text3 = medalLevel.getHighlight_text();
                    kotlin.jvm.internal.f0.m(highlight_text3);
                    spannableString2.setSpan(foregroundColorSpan, iS3, highlight_text3.length() + iS3, 17);
                }
            }
            yb0VarA.f117897h.setText(spannableString2);
            yb0VarA.f117900k.setText(medalLevel.getName());
            if (medal.getLevels().size() <= 1 || medalLevel.getLevel() <= 0) {
                yb0VarA.f117899j.setVisibility(8);
                return;
            }
            yb0VarA.f117899j.setText("Lv." + medalLevel.getLevel());
            yb0VarA.f117899j.setVisibility(0);
        }

        @xh.m
        public final void c(boolean z10, @dl.d ImageView iv_icon) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), iv_icon}, this, changeQuickRedirect, false, 24487, new Class[]{Boolean.TYPE, ImageView.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(iv_icon, "iv_icon");
            if (!z10) {
                iv_icon.setColorFilter((ColorFilter) null);
                return;
            }
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            iv_icon.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        }

        @xh.m
        public final void d(@dl.d Context mContext, @dl.d View detailView, @dl.d UserMedalV2Obj medal) {
            if (PatchProxy.proxy(new Object[]{mContext, detailView, medal}, this, changeQuickRedirect, false, 24486, new Class[]{Context.class, View.class, UserMedalV2Obj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(mContext, "mContext");
            kotlin.jvm.internal.f0.p(detailView, "detailView");
            kotlin.jvm.internal.f0.p(medal, "medal");
            yb0 yb0VarA = yb0.a(detailView);
            kotlin.jvm.internal.f0.o(yb0VarA, "bind(detailView)");
            int iO = ViewUtils.o(mContext, yb0VarA.f117903n);
            if (medal.getWear() == 1) {
                yb0VarA.f117903n.setVisibility(0);
                yb0VarA.f117894e.setVisibility(0);
                com.max.hbimage.b.K(medal.getCurrentLevel().getThumb(), yb0VarA.f117894e);
                ImageView imageView = yb0VarA.f117894e;
                kotlin.jvm.internal.f0.o(imageView, "detailBinding.ivMedal");
                c(false, imageView);
                yb0VarA.f117903n.setText("佩戴中");
                yb0VarA.f117903n.setTextColor(com.max.hbcommon.utils.l.a(R.color.text_primary_1_color));
                yb0VarA.f117905p.setAlpha(1.0f);
                yb0VarA.f117903n.setBackground(ViewUtils.x(iO, com.max.hbcommon.utils.l.a(R.color.medal_wear_start), com.max.hbcommon.utils.l.a(R.color.medal_wear_end)));
                return;
            }
            if (medal.getWear_level() == null) {
                yb0VarA.f117903n.setVisibility(8);
                yb0VarA.f117894e.setVisibility(8);
                return;
            }
            int level = medal.getLevel();
            Integer wear_level = medal.getWear_level();
            kotlin.jvm.internal.f0.m(wear_level);
            if (level >= wear_level.intValue()) {
                yb0VarA.f117903n.setVisibility(0);
                yb0VarA.f117894e.setVisibility(0);
                com.max.hbimage.b.K(medal.getCurrentLevel().getThumb(), yb0VarA.f117894e);
                ImageView imageView2 = yb0VarA.f117894e;
                kotlin.jvm.internal.f0.o(imageView2, "detailBinding.ivMedal");
                c(false, imageView2);
                yb0VarA.f117903n.setText("可佩戴");
                yb0VarA.f117903n.setTextColor(com.max.hbcommon.utils.l.a(R.color.white));
                yb0VarA.f117905p.setAlpha(1.0f);
                yb0VarA.f117903n.setBackground(com.max.hbutils.utils.q.o(mContext, R.color.default_off_color, ViewUtils.h0(mContext, iO)));
                return;
            }
            yb0VarA.f117903n.setVisibility(0);
            yb0VarA.f117894e.setVisibility(0);
            com.max.hbimage.b.K(medal.getCurrentLevel().getThumb(), yb0VarA.f117894e);
            ImageView imageView3 = yb0VarA.f117894e;
            kotlin.jvm.internal.f0.o(imageView3, "detailBinding.ivMedal");
            c(true, imageView3);
            Integer wear_level2 = medal.getWear_level();
            if (wear_level2 != null && wear_level2.intValue() == 1) {
                yb0VarA.f117903n.setText("获得可佩戴");
            } else {
                yb0VarA.f117903n.setText("Lv." + medal.getWear_level() + "可佩戴");
            }
            yb0VarA.f117903n.setTextColor(com.max.hbcommon.utils.l.a(R.color.white));
            yb0VarA.f117905p.setAlpha(0.5f);
            yb0VarA.f117903n.setBackground(com.max.hbutils.utils.q.o(mContext, R.color.default_off_color, ViewUtils.h0(mContext, iO)));
        }
    }

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class b implements ViewPager2.PageTransformer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f78541a = 0;
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
        public void transformPage(@dl.d View page, float f10) {
            if (PatchProxy.proxy(new Object[]{page, new Float(f10)}, this, changeQuickRedirect, false, 24489, new Class[]{View.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(page, "page");
            int iL = ViewUtils.L(page.getContext()) / 2;
            page.setPivotX(page.getWidth() / 2.0f);
            page.setPivotY(ViewUtils.f(page.getContext(), 50.5f) + ViewUtils.f(page.getContext(), 105.0f));
            float fAbs = (float) (((double) 1) - (((double) Math.abs(f10)) * 0.5d));
            page.setScaleX(fAbs);
            page.setScaleY(fAbs);
            page.setAlpha(fAbs);
            page.setTranslationX((-f10) * iL);
        }
    }

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24490, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            UserMedalDetailActivity.this.onBackPressed();
        }
    }

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    public static final class d extends com.max.hbcommon.base.adapter.s<MedalLevelObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ UserMedalDetailActivity f78544b;

            a(UserMedalDetailActivity userMedalDetailActivity) {
                this.f78544b = userMedalDetailActivity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24493, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f78544b.onBackPressed();
            }
        }

        d(Activity activity, List<MedalLevelObj> list) {
            super(activity, list, R.layout.item_user_medal_vp_image);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d MedalLevelObj medalLevel) {
            if (PatchProxy.proxy(new Object[]{viewHolder, medalLevel}, this, changeQuickRedirect, false, 24491, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MedalLevelObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(medalLevel, "medalLevel");
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_image);
            com.max.hbimage.b.K(medalLevel.getImg(), imageView);
            Integer achieved = medalLevel.getAchieved();
            if (achieved != null && achieved.intValue() == 1) {
                imageView.setAlpha(1.0f);
                imageView.setColorFilter((ColorFilter) null);
            } else {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(0.0f);
                imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                imageView.setAlpha(0.5f);
            }
            viewHolder.itemView.setOnClickListener(new a(UserMedalDetailActivity.this));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MedalLevelObj medalLevelObj) {
            if (PatchProxy.proxy(new Object[]{eVar, medalLevelObj}, this, changeQuickRedirect, false, 24492, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, medalLevelObj);
        }
    }

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    public static final class e implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            View viewFindViewById;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24494, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            m1 m1Var = UserMedalDetailActivity.this.M;
            m1 m1Var2 = null;
            if (m1Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                m1Var = null;
            }
            ViewPager2 viewPager2 = m1Var.f113213e;
            kotlin.jvm.internal.f0.o(viewPager2, "binding.vp");
            View viewD = ViewGroupKt.d(viewPager2, 0);
            kotlin.jvm.internal.f0.n(viewD, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) viewD).getLayoutManager();
            if (layoutManager != null) {
                m1 m1Var3 = UserMedalDetailActivity.this.M;
                if (m1Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    m1Var2 = m1Var3;
                }
                View viewFindViewByPosition = layoutManager.findViewByPosition(m1Var2.f113213e.getCurrentItem());
                if (viewFindViewByPosition == null || (viewFindViewById = viewFindViewByPosition.findViewById(R.id.iv_image)) == null) {
                    return;
                }
                UserMedalDetailActivity userMedalDetailActivity = UserMedalDetailActivity.this;
                viewFindViewById.setTransitionName("medal_img");
                userMedalDetailActivity.startPostponedEnterTransition();
                userMedalDetailActivity.P = viewFindViewById;
            }
        }
    }

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    public static final class f extends ViewPager2.OnPageChangeCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            View viewFindViewByPosition;
            View viewFindViewById;
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 24495, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            a aVar = UserMedalDetailActivity.Q;
            m1 m1Var = UserMedalDetailActivity.this.M;
            m1 m1Var2 = null;
            if (m1Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                m1Var = null;
            }
            LinearLayout linearLayoutB = m1Var.f113212d.b();
            kotlin.jvm.internal.f0.o(linearLayoutB, "binding.vgDetail.root");
            BBSUserInfoObj bBSUserInfoObj = UserMedalDetailActivity.this.N;
            UserMedalV2Obj userMedalV2Obj = UserMedalDetailActivity.this.L;
            if (userMedalV2Obj == null) {
                kotlin.jvm.internal.f0.S("medalInfo");
                userMedalV2Obj = null;
            }
            UserMedalV2Obj userMedalV2Obj2 = UserMedalDetailActivity.this.L;
            if (userMedalV2Obj2 == null) {
                kotlin.jvm.internal.f0.S("medalInfo");
                userMedalV2Obj2 = null;
            }
            aVar.b(linearLayoutB, bBSUserInfoObj, userMedalV2Obj, userMedalV2Obj2.getLevels().get(i10));
            UserMedalDetailActivity.T1(UserMedalDetailActivity.this, i10);
            if (UserMedalDetailActivity.this.P != null) {
                View view = UserMedalDetailActivity.this.P;
                kotlin.jvm.internal.f0.m(view);
                view.setTransitionName(null);
                m1 m1Var3 = UserMedalDetailActivity.this.M;
                if (m1Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    m1Var2 = m1Var3;
                }
                ViewPager2 viewPager2 = m1Var2.f113213e;
                kotlin.jvm.internal.f0.o(viewPager2, "binding.vp");
                View viewD = ViewGroupKt.d(viewPager2, 0);
                kotlin.jvm.internal.f0.n(viewD, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                RecyclerView.LayoutManager layoutManager = ((RecyclerView) viewD).getLayoutManager();
                if (layoutManager == null || (viewFindViewByPosition = layoutManager.findViewByPosition(i10)) == null || (viewFindViewById = viewFindViewByPosition.findViewById(R.id.iv_image)) == null) {
                    return;
                }
                UserMedalDetailActivity userMedalDetailActivity = UserMedalDetailActivity.this;
                viewFindViewById.setTransitionName("medal_img");
                userMedalDetailActivity.P = viewFindViewById;
            }
        }
    }

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24496, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            UserMedalDetailActivity.this.onBackPressed();
        }
    }

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24497, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            UserMedalDetailActivity.X1(UserMedalDetailActivity.this);
        }
    }

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    public static final class i extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f78550c;

        i(String str) {
            this.f78550c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 24498, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (UserMedalDetailActivity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24499, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (UserMedalDetailActivity.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(UserMedalDetailActivity.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                UserMedalV2Obj userMedalV2Obj = UserMedalDetailActivity.this.L;
                if (userMedalV2Obj == null) {
                    kotlin.jvm.internal.f0.S("medalInfo");
                    userMedalV2Obj = null;
                }
                userMedalV2Obj.setWear(kotlin.jvm.internal.f0.g(BBSAchieveObj.OPE_WEAR, this.f78550c) ? 1 : 0);
                UserMedalDetailActivity.Y1(UserMedalDetailActivity.this);
                UserMedalDetailActivity.this.setResult(-1);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24500, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    public static final class j implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.d SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 24504, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(share_media, "share_media");
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.d SHARE_MEDIA share_media, @dl.d Throwable throwable) {
            if (PatchProxy.proxy(new Object[]{share_media, throwable}, this, changeQuickRedirect, false, 24503, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(share_media, "share_media");
            kotlin.jvm.internal.f0.p(throwable, "throwable");
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.d SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 24502, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(share_media, "share_media");
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.d SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 24501, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(share_media, "share_media");
        }
    }

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    public static final class k implements ShareImageDialogFragment.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // com.max.xiaoheihe.module.account.ShareImageDialogFragment.e
        public final View a(ViewGroup viewGroup) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 24505, new Class[]{ViewGroup.class}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            View viewInflate = LayoutInflater.from(((BaseActivity) UserMedalDetailActivity.this).f66601b).inflate(R.layout.layout_user_medal_share_bg, viewGroup, false);
            View vg_detail = viewInflate.findViewById(R.id.vg_detail);
            viewInflate.findViewById(R.id.iv_image).setVisibility(0);
            a aVar = UserMedalDetailActivity.Q;
            kotlin.jvm.internal.f0.o(vg_detail, "vg_detail");
            BBSUserInfoObj bBSUserInfoObj = UserMedalDetailActivity.this.N;
            UserMedalV2Obj userMedalV2Obj = UserMedalDetailActivity.this.L;
            UserMedalV2Obj userMedalV2Obj2 = null;
            if (userMedalV2Obj == null) {
                kotlin.jvm.internal.f0.S("medalInfo");
                userMedalV2Obj = null;
            }
            UserMedalV2Obj userMedalV2Obj3 = UserMedalDetailActivity.this.L;
            if (userMedalV2Obj3 == null) {
                kotlin.jvm.internal.f0.S("medalInfo");
                userMedalV2Obj3 = null;
            }
            aVar.b(vg_detail, bBSUserInfoObj, userMedalV2Obj, userMedalV2Obj3.getCurrentLevel());
            Activity mContext = ((BaseActivity) UserMedalDetailActivity.this).f66601b;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            kotlin.jvm.internal.f0.o(vg_detail, "vg_detail");
            UserMedalV2Obj userMedalV2Obj4 = UserMedalDetailActivity.this.L;
            if (userMedalV2Obj4 == null) {
                kotlin.jvm.internal.f0.S("medalInfo");
            } else {
                userMedalV2Obj2 = userMedalV2Obj4;
            }
            aVar.d(mContext, vg_detail, userMedalV2Obj2);
            return viewInflate;
        }
    }

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    public static final class l implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProgressBar f78552b;

        l(ProgressBar progressBar) {
            this.f78552b = progressBar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 24506, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
            ProgressBar progressBar = this.f78552b;
            Object animatedValue = animation.getAnimatedValue();
            kotlin.jvm.internal.f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            progressBar.setProgress(((Integer) animatedValue).intValue());
        }
    }

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24507, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            UserMedalDetailActivity userMedalDetailActivity = UserMedalDetailActivity.this;
            UserMedalV2Obj userMedalV2Obj = userMedalDetailActivity.L;
            if (userMedalV2Obj == null) {
                kotlin.jvm.internal.f0.S("medalInfo");
                userMedalV2Obj = null;
            }
            UserMedalDetailActivity.W1(userMedalDetailActivity, userMedalV2Obj.getMedal_id(), BBSAchieveObj.OPE_UNLOAD);
        }
    }

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24508, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            UserMedalDetailActivity userMedalDetailActivity = UserMedalDetailActivity.this;
            UserMedalV2Obj userMedalV2Obj = userMedalDetailActivity.L;
            if (userMedalV2Obj == null) {
                kotlin.jvm.internal.f0.S("medalInfo");
                userMedalV2Obj = null;
            }
            UserMedalDetailActivity.W1(userMedalDetailActivity, userMedalV2Obj.getMedal_id(), BBSAchieveObj.OPE_WEAR);
        }
    }

    /* JADX INFO: compiled from: UserMedalDetailActivity.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24509, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((BaseActivity) UserMedalDetailActivity.this).f66601b;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            UserMedalV2Obj userMedalV2Obj = UserMedalDetailActivity.this.L;
            if (userMedalV2Obj == null) {
                kotlin.jvm.internal.f0.S("medalInfo");
                userMedalV2Obj = null;
            }
            com.max.xiaoheihe.base.router.b.k0(mContext, userMedalV2Obj.getCurrentLevel().getBtn_protocol());
        }
    }

    public static final /* synthetic */ void T1(UserMedalDetailActivity userMedalDetailActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{userMedalDetailActivity, new Integer(i10)}, null, changeQuickRedirect, true, 24481, new Class[]{UserMedalDetailActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        userMedalDetailActivity.a2(i10);
    }

    public static final /* synthetic */ void W1(UserMedalDetailActivity userMedalDetailActivity, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{userMedalDetailActivity, str, str2}, null, changeQuickRedirect, true, 24483, new Class[]{UserMedalDetailActivity.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        userMedalDetailActivity.e2(str, str2);
    }

    public static final /* synthetic */ void X1(UserMedalDetailActivity userMedalDetailActivity) {
        if (PatchProxy.proxy(new Object[]{userMedalDetailActivity}, null, changeQuickRedirect, true, 24482, new Class[]{UserMedalDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        userMedalDetailActivity.f2();
    }

    public static final /* synthetic */ void Y1(UserMedalDetailActivity userMedalDetailActivity) {
        if (PatchProxy.proxy(new Object[]{userMedalDetailActivity}, null, changeQuickRedirect, true, 24484, new Class[]{UserMedalDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        userMedalDetailActivity.k2();
    }

    private final void Z1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24470, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m1 m1Var = this.M;
        UserMedalV2Obj userMedalV2Obj = null;
        if (m1Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var = null;
        }
        m1Var.b().setOnClickListener(new c());
        a aVar = Q;
        m1 m1Var2 = this.M;
        if (m1Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var2 = null;
        }
        LinearLayout linearLayoutB = m1Var2.f113212d.b();
        kotlin.jvm.internal.f0.o(linearLayoutB, "binding.vgDetail.root");
        BBSUserInfoObj bBSUserInfoObj = this.N;
        UserMedalV2Obj userMedalV2Obj2 = this.L;
        if (userMedalV2Obj2 == null) {
            kotlin.jvm.internal.f0.S("medalInfo");
            userMedalV2Obj2 = null;
        }
        UserMedalV2Obj userMedalV2Obj3 = this.L;
        if (userMedalV2Obj3 == null) {
            kotlin.jvm.internal.f0.S("medalInfo");
            userMedalV2Obj3 = null;
        }
        aVar.b(linearLayoutB, bBSUserInfoObj, userMedalV2Obj2, userMedalV2Obj3.getCurrentLevel());
        Activity activity = this.f66601b;
        UserMedalV2Obj userMedalV2Obj4 = this.L;
        if (userMedalV2Obj4 == null) {
            kotlin.jvm.internal.f0.S("medalInfo");
            userMedalV2Obj4 = null;
        }
        this.O = new d(activity, userMedalV2Obj4.getLevels());
        m1 m1Var3 = this.M;
        if (m1Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var3 = null;
        }
        View childAt = m1Var3.f113213e.getChildAt(0);
        kotlin.jvm.internal.f0.o(childAt, "binding.vp.getChildAt(0)");
        if (childAt instanceof RecyclerView) {
            ((RecyclerView) childAt).setOverScrollMode(2);
        }
        m1 m1Var4 = this.M;
        if (m1Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var4 = null;
        }
        m1Var4.f113213e.setOffscreenPageLimit(3);
        m1 m1Var5 = this.M;
        if (m1Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var5 = null;
        }
        m1Var5.f113213e.setPageTransformer(new b());
        m1 m1Var6 = this.M;
        if (m1Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var6 = null;
        }
        ViewPager2 viewPager2 = m1Var6.f113213e;
        com.max.hbcommon.base.adapter.s<MedalLevelObj> sVar = this.O;
        if (sVar == null) {
            kotlin.jvm.internal.f0.S("mPagerAdapter");
            sVar = null;
        }
        viewPager2.setAdapter(sVar);
        m1 m1Var7 = this.M;
        if (m1Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var7 = null;
        }
        ViewPager2 viewPager3 = m1Var7.f113213e;
        UserMedalV2Obj userMedalV2Obj5 = this.L;
        if (userMedalV2Obj5 == null) {
            kotlin.jvm.internal.f0.S("medalInfo");
            userMedalV2Obj5 = null;
        }
        viewPager3.setCurrentItem(fi.u.u(userMedalV2Obj5.getLevel() - 1, 0), false);
        m1 m1Var8 = this.M;
        if (m1Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var8 = null;
        }
        m1Var8.f113213e.post(new e());
        m1 m1Var9 = this.M;
        if (m1Var9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var9 = null;
        }
        m1Var9.f113213e.registerOnPageChangeCallback(new f());
        m1 m1Var10 = this.M;
        if (m1Var10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var10 = null;
        }
        m1Var10.f113211c.setOnClickListener(new g());
        m1 m1Var11 = this.M;
        if (m1Var11 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var11 = null;
        }
        m1Var11.f113210b.setBackgroundResource(R.color.transparent);
        m1 m1Var12 = this.M;
        if (m1Var12 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var12 = null;
        }
        m1Var12.f113210b.setRightClickListener(new h());
        m1 m1Var13 = this.M;
        if (m1Var13 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var13 = null;
        }
        BaseBottomButton rightbutton = m1Var13.f113210b.getRightbutton();
        if (rightbutton != null) {
            rightbutton.setBackground(com.max.hbutils.utils.q.o(this.f66601b, R.color.white, 5.0f));
        }
        m1 m1Var14 = this.M;
        if (m1Var14 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var14 = null;
        }
        BaseBottomButton leftButton = m1Var14.f113210b.getLeftButton();
        if (leftButton != null) {
            leftButton.setBackground(com.max.hbutils.utils.q.o(this.f66601b, R.color.white_alpha10, 5.0f));
        }
        UserMedalV2Obj userMedalV2Obj6 = this.L;
        if (userMedalV2Obj6 == null) {
            kotlin.jvm.internal.f0.S("medalInfo");
        } else {
            userMedalV2Obj = userMedalV2Obj6;
        }
        a2(fi.u.u(userMedalV2Obj.getLevel() - 1, 0));
        k2();
    }

    private final void a2(int i10) {
        String exp;
        String str;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 24471, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        UserMedalV2Obj userMedalV2Obj = this.L;
        m1 m1Var = null;
        if (userMedalV2Obj == null) {
            kotlin.jvm.internal.f0.S("medalInfo");
            userMedalV2Obj = null;
        }
        if (userMedalV2Obj.getLevels().size() <= 1) {
            m1 m1Var2 = this.M;
            if (m1Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                m1Var2 = null;
            }
            m1Var2.f113212d.f117895f.setVisibility(4);
            m1 m1Var3 = this.M;
            if (m1Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                m1Var = m1Var3;
            }
            m1Var.f113212d.f117898i.setVisibility(4);
            return;
        }
        UserMedalV2Obj userMedalV2Obj2 = this.L;
        if (userMedalV2Obj2 == null) {
            kotlin.jvm.internal.f0.S("medalInfo");
            userMedalV2Obj2 = null;
        }
        MedalLevelObj medalLevelObj = userMedalV2Obj2.getLevels().get(i10);
        m1 m1Var4 = this.M;
        if (m1Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var4 = null;
        }
        m1Var4.f113212d.f117895f.setVisibility(0);
        m1 m1Var5 = this.M;
        if (m1Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var5 = null;
        }
        m1Var5.f113212d.f117898i.setVisibility(0);
        UserMedalV2Obj userMedalV2Obj3 = this.L;
        if (userMedalV2Obj3 == null) {
            kotlin.jvm.internal.f0.S("medalInfo");
            userMedalV2Obj3 = null;
        }
        if (i10 < userMedalV2Obj3.getLevels().size() - 1) {
            Integer achieved = medalLevelObj.getAchieved();
            if (achieved != null && achieved.intValue() == 1) {
                UserMedalV2Obj userMedalV2Obj4 = this.L;
                if (userMedalV2Obj4 == null) {
                    kotlin.jvm.internal.f0.S("medalInfo");
                    userMedalV2Obj4 = null;
                }
                exp = userMedalV2Obj4.getLevels().get(i10 + 1).getExp();
                str = "下一级";
            } else {
                exp = medalLevelObj.getExp();
                str = "当前等级";
            }
        } else {
            exp = medalLevelObj.getExp();
            str = "已满级";
        }
        UserMedalV2Obj userMedalV2Obj5 = this.L;
        if (userMedalV2Obj5 == null) {
            kotlin.jvm.internal.f0.S("medalInfo");
            userMedalV2Obj5 = null;
        }
        String exp2 = userMedalV2Obj5.getExp();
        float fA = fi.u.A(com.max.hbutils.utils.n.p(exp2) / com.max.hbutils.utils.n.p(exp), 1.0f);
        m1 m1Var6 = this.M;
        if (m1Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var6 = null;
        }
        h2(fA, m1Var6.f113212d.f117895f);
        SpannableString spannableString = new SpannableString(str + ": " + exp2 + IOUtils.DIR_SEPARATOR_UNIX + exp);
        spannableString.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.white)), str.length() + 2, str.length() + 2 + (exp2 != null ? exp2.length() : 1), 17);
        m1 m1Var7 = this.M;
        if (m1Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            m1Var = m1Var7;
        }
        m1Var.f113212d.f117898i.setText(spannableString);
    }

    @xh.m
    public static final void b2(@dl.d View view, @dl.e BBSUserInfoObj bBSUserInfoObj, @dl.d UserMedalV2Obj userMedalV2Obj, @dl.d MedalLevelObj medalLevelObj) {
        if (PatchProxy.proxy(new Object[]{view, bBSUserInfoObj, userMedalV2Obj, medalLevelObj}, null, changeQuickRedirect, true, 24480, new Class[]{View.class, BBSUserInfoObj.class, UserMedalV2Obj.class, MedalLevelObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Q.b(view, bBSUserInfoObj, userMedalV2Obj, medalLevelObj);
    }

    @xh.m
    public static final void c2(boolean z10, @dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), imageView}, null, changeQuickRedirect, true, 24479, new Class[]{Boolean.TYPE, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        Q.c(z10, imageView);
    }

    private final void e2(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 24475, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().e0(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i(str2)));
    }

    private final void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24476, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ShareImageDialogFragment shareImageDialogFragmentX4 = ShareImageDialogFragment.x4();
        Activity activity = this.f66601b;
        kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type android.app.Activity");
        shareImageDialogFragmentX4.Q4(com.max.hbimage.image.c.d(activity));
        shareImageDialogFragmentX4.D4(new k());
        shareImageDialogFragmentX4.V4(true);
        JsonObject jsonObject = new JsonObject();
        UserMedalV2Obj userMedalV2Obj = this.L;
        if (userMedalV2Obj == null) {
            kotlin.jvm.internal.f0.S("medalInfo");
            userMedalV2Obj = null;
        }
        jsonObject.addProperty("medal_id", userMedalV2Obj.getMedal_id());
        shareImageDialogFragmentX4.S4(new com.max.hbshare.c.b(com.max.hbshare.c.f72566v, new j(), jsonObject));
        shareImageDialogFragmentX4.show(getSupportFragmentManager(), PostPageFactory.M);
    }

    private final void i2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24474, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UserMedalV2Obj userMedalV2Obj = this.L;
        m1 m1Var = null;
        if (userMedalV2Obj == null) {
            kotlin.jvm.internal.f0.S("medalInfo");
            userMedalV2Obj = null;
        }
        if (userMedalV2Obj.getWear_level() != null) {
            UserMedalV2Obj userMedalV2Obj2 = this.L;
            if (userMedalV2Obj2 == null) {
                kotlin.jvm.internal.f0.S("medalInfo");
                userMedalV2Obj2 = null;
            }
            int level = userMedalV2Obj2.getLevel();
            UserMedalV2Obj userMedalV2Obj3 = this.L;
            if (userMedalV2Obj3 == null) {
                kotlin.jvm.internal.f0.S("medalInfo");
                userMedalV2Obj3 = null;
            }
            Integer wear_level = userMedalV2Obj3.getWear_level();
            kotlin.jvm.internal.f0.m(wear_level);
            if (level >= wear_level.intValue()) {
                m1 m1Var2 = this.M;
                if (m1Var2 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    m1Var2 = null;
                }
                m1Var2.f113210b.setShowLeftButton(true);
                UserMedalV2Obj userMedalV2Obj4 = this.L;
                if (userMedalV2Obj4 == null) {
                    kotlin.jvm.internal.f0.S("medalInfo");
                    userMedalV2Obj4 = null;
                }
                if (userMedalV2Obj4.getWear() == 1) {
                    m1 m1Var3 = this.M;
                    if (m1Var3 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        m1Var3 = null;
                    }
                    m1Var3.f113210b.setLeftText("佩戴中");
                    m1 m1Var4 = this.M;
                    if (m1Var4 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        m1Var4 = null;
                    }
                    m1Var4.f113210b.setLeftTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
                    m1 m1Var5 = this.M;
                    if (m1Var5 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                    } else {
                        m1Var = m1Var5;
                    }
                    m1Var.f113210b.setLeftClickListener(new m());
                    return;
                }
                UserMedalV2Obj userMedalV2Obj5 = this.L;
                if (userMedalV2Obj5 == null) {
                    kotlin.jvm.internal.f0.S("medalInfo");
                    userMedalV2Obj5 = null;
                }
                if (userMedalV2Obj5.getWear() == 0) {
                    m1 m1Var6 = this.M;
                    if (m1Var6 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        m1Var6 = null;
                    }
                    m1Var6.f113210b.setLeftText("佩戴");
                    m1 m1Var7 = this.M;
                    if (m1Var7 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        m1Var7 = null;
                    }
                    m1Var7.f113210b.setLeftTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
                    m1 m1Var8 = this.M;
                    if (m1Var8 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                    } else {
                        m1Var = m1Var8;
                    }
                    m1Var.f113210b.setLeftClickListener(new n());
                    return;
                }
                return;
            }
        }
        UserMedalV2Obj userMedalV2Obj6 = this.L;
        if (userMedalV2Obj6 == null) {
            kotlin.jvm.internal.f0.S("medalInfo");
            userMedalV2Obj6 = null;
        }
        if (com.max.hbcommon.utils.c.u(userMedalV2Obj6.getCurrentLevel().getBtn_protocol())) {
            m1 m1Var9 = this.M;
            if (m1Var9 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                m1Var = m1Var9;
            }
            m1Var.f113210b.setShowLeftButton(false);
            return;
        }
        m1 m1Var10 = this.M;
        if (m1Var10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var10 = null;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView = m1Var10.f113210b;
        UserMedalV2Obj userMedalV2Obj7 = this.L;
        if (userMedalV2Obj7 == null) {
            kotlin.jvm.internal.f0.S("medalInfo");
            userMedalV2Obj7 = null;
        }
        bottomButtonLeftItemView.setLeftText(userMedalV2Obj7.getCurrentLevel().getBtn_desc());
        m1 m1Var11 = this.M;
        if (m1Var11 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var11 = null;
        }
        m1Var11.f113210b.setLeftTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        m1 m1Var12 = this.M;
        if (m1Var12 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            m1Var = m1Var12;
        }
        m1Var.f113210b.setLeftClickListener(new o());
    }

    @xh.m
    public static final void j2(@dl.d Context context, @dl.d View view, @dl.d UserMedalV2Obj userMedalV2Obj) {
        if (PatchProxy.proxy(new Object[]{context, view, userMedalV2Obj}, null, changeQuickRedirect, true, 24478, new Class[]{Context.class, View.class, UserMedalV2Obj.class}, Void.TYPE).isSupported) {
            return;
        }
        Q.d(context, view, userMedalV2Obj);
    }

    private final void k2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24473, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a aVar = Q;
        Activity mContext = this.f66601b;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        m1 m1Var = this.M;
        UserMedalV2Obj userMedalV2Obj = null;
        if (m1Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var = null;
        }
        LinearLayout linearLayoutB = m1Var.f113212d.b();
        kotlin.jvm.internal.f0.o(linearLayoutB, "binding.vgDetail.root");
        UserMedalV2Obj userMedalV2Obj2 = this.L;
        if (userMedalV2Obj2 == null) {
            kotlin.jvm.internal.f0.S("medalInfo");
        } else {
            userMedalV2Obj = userMedalV2Obj2;
        }
        aVar.d(mContext, linearLayoutB, userMedalV2Obj);
        i2();
    }

    public final void h2(float f10, @dl.e ProgressBar progressBar) {
        if (PatchProxy.proxy(new Object[]{new Float(f10), progressBar}, this, changeQuickRedirect, false, 24472, new Class[]{Float.TYPE, ProgressBar.class}, Void.TYPE).isSupported || progressBar == null) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(progressBar.getProgress(), (int) (f10 * 100));
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new l(progressBar));
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.start();
        addValueAnimator(valueAnimatorOfInt);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24469, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m1 m1VarC = m1.c(this.f66602c);
        kotlin.jvm.internal.f0.o(m1VarC, "inflate(mInflater)");
        this.M = m1VarC;
        m1 m1Var = null;
        if (m1VarC == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1VarC = null;
        }
        setContentView(m1VarC.b());
        postponeEnterTransition();
        Activity activity = this.f66601b;
        m1 m1Var2 = this.M;
        if (m1Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            m1Var2 = null;
        }
        com.max.hbutils.utils.t.X(activity, 0, m1Var2.f113211c);
        com.max.hbutils.utils.t.M(this.f66601b, false);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(134217728);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-17));
        }
        m1 m1Var3 = this.M;
        if (m1Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            m1Var = m1Var3;
        }
        ViewGroup.LayoutParams layoutParams = m1Var.f113210b.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = com.max.hbutils.utils.t.o(this);
        Serializable serializableExtra = getIntent().getSerializableExtra(S);
        kotlin.jvm.internal.f0.n(serializableExtra, "null cannot be cast to non-null type com.max.xiaoheihe.bean.account.UserMedalV2Obj");
        this.L = (UserMedalV2Obj) serializableExtra;
        this.N = (BBSUserInfoObj) getIntent().getSerializableExtra(T);
        Z1();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @kotlin.k(message = "Deprecated in Java")
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this.f66601b).onActivityResult(i10, i11, intent);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24477, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        UMShareAPI.get(this.f66601b).release();
    }
}
