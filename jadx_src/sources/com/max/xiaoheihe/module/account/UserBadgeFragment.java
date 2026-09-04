package com.max.xiaoheihe.module.account;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.BtnObj;
import com.max.xiaoheihe.bean.bbs.BBSAchieveObj;
import com.max.xiaoheihe.bean.bbs.BBSAchieveResult;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@com.max.hbcommon.analytics.m(path = lb.d.G1)
public class UserBadgeFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f78497h = "hey_box_id";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f78498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<BBSAchieveObj> f78499c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.t f78500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f78501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f78502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AchieveBadgeUpdatedBroadcastReceiver f78503g;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    public class AchieveBadgeUpdatedBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private AchieveBadgeUpdatedBroadcastReceiver() {
        }

        /* synthetic */ AchieveBadgeUpdatedBroadcastReceiver(UserBadgeFragment userBadgeFragment, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 24434, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.f131079z.equals(intent.getAction())) {
                UserBadgeFragment.S3(UserBadgeFragment.this);
            }
        }
    }

    public class a extends com.max.hbcommon.base.adapter.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, int i10, int i11) {
            super(context, i10, i11);
        }

        @Override // com.max.hbcommon.base.adapter.i, androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 24416, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (childAdapterPosition == 0) {
                rect.set(0, 0, 0, 0);
            } else if (childAdapterPosition == itemCount - 2 || childAdapterPosition == itemCount - 1) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, 0, 0, UserBadgeFragment.this.getResources().getDimensionPixelSize(R.dimen.divider_height));
            }
        }
    }

    public class b extends com.max.hbcommon.base.adapter.s<BBSAchieveObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f78506b;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BtnObj f78508b;

            a(BtnObj btnObj) {
                this.f78508b = btnObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24421, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) UserBadgeFragment.this).mContext, this.f78508b.getBtn_url());
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.UserBadgeFragment$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0642b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TextView f78510b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSAchieveObj f78511c;

            ViewOnClickListenerC0642b(TextView textView, BBSAchieveObj bBSAchieveObj) {
                this.f78510b = textView;
                this.f78511c = bBSAchieveObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24422, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                b.m(b.this, this.f78510b, this.f78511c, "0");
                UserBadgeFragment.O3(UserBadgeFragment.this, this.f78511c, BBSAchieveObj.OPE_UNLOAD);
            }
        }

        public class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TextView f78513b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSAchieveObj f78514c;

            c(TextView textView, BBSAchieveObj bBSAchieveObj) {
                this.f78513b = textView;
                this.f78514c = bBSAchieveObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24423, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                b.m(b.this, this.f78513b, this.f78514c, "1");
                UserBadgeFragment.O3(UserBadgeFragment.this, this.f78514c, BBSAchieveObj.OPE_WEAR);
            }
        }

        b(Context context, List list, int i10) {
            super(context, list, i10);
            this.f78506b = com.max.xiaoheihe.utils.i0.q(UserBadgeFragment.this.f78498b);
        }

        static /* synthetic */ void m(b bVar, TextView textView, BBSAchieveObj bBSAchieveObj, String str) {
            if (PatchProxy.proxy(new Object[]{bVar, textView, bBSAchieveObj, str}, null, changeQuickRedirect, true, 24420, new Class[]{b.class, TextView.class, BBSAchieveObj.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            bVar.o(textView, bBSAchieveObj, str);
        }

        private void o(TextView textView, BBSAchieveObj bBSAchieveObj, String str) {
            if (PatchProxy.proxy(new Object[]{textView, bBSAchieveObj, str}, this, changeQuickRedirect, false, 24418, new Class[]{TextView.class, BBSAchieveObj.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            int iH0 = ViewUtils.h0(((com.max.hbcommon.base.d) UserBadgeFragment.this).mContext, ViewUtils.m(((com.max.hbcommon.base.d) UserBadgeFragment.this).mContext, 0, ViewUtils.f(((com.max.hbcommon.base.d) UserBadgeFragment.this).mContext, 30.0f)));
            if (!"1".equals(str)) {
                textView.setText(UserBadgeFragment.this.getString(R.string.achieve_btn_wear));
                textView.setTextColor(UserBadgeFragment.this.getResources().getColor(R.color.white));
                textView.setBackground(com.max.hbutils.utils.q.h(((com.max.hbcommon.base.d) UserBadgeFragment.this).mContext, iH0));
                textView.setOnClickListener(new c(textView, bBSAchieveObj));
                return;
            }
            textView.setText(UserBadgeFragment.this.getString(R.string.worn));
            textView.setTextColor(UserBadgeFragment.this.getResources().getColor(R.color.text_secondary_1_color));
            StateListDrawable stateListDrawable = new StateListDrawable();
            float f10 = iH0;
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) UserBadgeFragment.this).mContext, R.color.tab_layout_divider_color, f10));
            stateListDrawable.addState(new int[0], com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) UserBadgeFragment.this).mContext, R.color.divider_secondary_2_color, f10));
            textView.setBackground(stateListDrawable);
            textView.setOnClickListener(new ViewOnClickListenerC0642b(textView, bBSAchieveObj));
        }

        public void n(com.max.hbcommon.base.adapter.s.e eVar, BBSAchieveObj bBSAchieveObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSAchieveObj}, this, changeQuickRedirect, false, 24417, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSAchieveObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
            TextView textView3 = (TextView) eVar.i(R.id.tv_option);
            TextView textView4 = (TextView) eVar.i(R.id.tv_not_achieve);
            com.max.hbimage.b.L(bBSAchieveObj.getImg(), imageView, R.color.divider_secondary_2_color);
            textView.setText(bBSAchieveObj.getName());
            textView3.setBackground(com.max.hbutils.utils.q.h(((com.max.hbcommon.base.d) UserBadgeFragment.this).mContext, ViewUtils.h0(((com.max.hbcommon.base.d) UserBadgeFragment.this).mContext, ViewUtils.m(((com.max.hbcommon.base.d) UserBadgeFragment.this).mContext, 0, ViewUtils.f(((com.max.hbcommon.base.d) UserBadgeFragment.this).mContext, 30.0f)))));
            if (com.max.hbcommon.utils.c.u(bBSAchieveObj.getDesc())) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(bBSAchieveObj.getDesc());
            }
            if (this.f78506b && "1".equals(bBSAchieveObj.getAchieved())) {
                textView3.setVisibility(0);
                o(textView3, bBSAchieveObj, bBSAchieveObj.getWear());
            } else if (!"1".equals(bBSAchieveObj.getBtn_enabled()) || bBSAchieveObj.getBtn() == null) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                BtnObj btn = bBSAchieveObj.getBtn();
                textView3.setText(btn.getBtn_desc());
                textView3.setOnClickListener(new a(btn));
            }
            if ("1".equals(bBSAchieveObj.getAchieved())) {
                imageView.setAlpha(1.0f);
                textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                textView4.setVisibility(8);
                return;
            }
            imageView.setAlpha(0.3f);
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            if (!"1".equals(bBSAchieveObj.getBtn_enabled()) || bBSAchieveObj.getBtn() == null) {
                textView4.setVisibility(0);
            } else {
                textView4.setVisibility(8);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSAchieveObj bBSAchieveObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSAchieveObj}, this, changeQuickRedirect, false, 24419, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            n(eVar, bBSAchieveObj);
        }
    }

    public class c extends com.max.hbcommon.base.adapter.t {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(com.max.hbcommon.base.adapter.s sVar) {
            super(sVar);
        }

        @Override // com.max.hbcommon.base.adapter.t
        public void C(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (!PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 24424, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported && eVar.d() == R.layout.item_user_achievement_badge_header) {
                BBSUserInfoObj bBSUserInfoObj = (BBSUserInfoObj) obj;
                HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) eVar.i(R.id.avatar);
                TextView textView = (TextView) eVar.i(R.id.tv_user_name);
                RelativeLayout relativeLayout = (RelativeLayout) eVar.i(R.id.rl_medal_level);
                TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
                TextView textView3 = (TextView) eVar.i(R.id.tv_count);
                heyBoxAvatarView.setAvatar(bBSUserInfoObj.getAvartar(), bBSUserInfoObj.getAvatar_decoration());
                textView.setText(bBSUserInfoObj.getUsername());
                com.max.xiaoheihe.utils.d.l1(relativeLayout, bBSUserInfoObj.getMedal(), bBSUserInfoObj.getMedals(), bBSUserInfoObj.getLevel_info(), bBSUserInfoObj.getUserid(), 16);
                SpannableString spannableString = new SpannableString(String.format("%1$s / %2$s", UserBadgeFragment.this.f78501e, UserBadgeFragment.this.f78502f));
                spannableString.setSpan(new ForegroundColorSpan(UserBadgeFragment.this.getResources().getColor(R.color.text_primary_1_color)), 0, UserBadgeFragment.this.f78501e.length(), 34);
                textView3.setText(spannableString);
                textView2.setText("我的徽章");
            }
        }
    }

    public class d implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 24425, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            UserBadgeFragment.S3(UserBadgeFragment.this);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24426, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) UserBadgeFragment.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.B2);
            intent.putExtra("title", UserBadgeFragment.this.getString(R.string.badge));
            ((com.max.hbcommon.base.d) UserBadgeFragment.this).mContext.startActivity(intent);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<BBSAchieveResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24428, new Class[0], Void.TYPE).isSupported && UserBadgeFragment.this.isActive()) {
                super.onComplete();
                UserBadgeFragment.this.mRefreshLayout.A(0);
                UserBadgeFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24427, new Class[]{Throwable.class}, Void.TYPE).isSupported && UserBadgeFragment.this.isActive()) {
                super.onError(th2);
                UserBadgeFragment.W3(UserBadgeFragment.this);
                UserBadgeFragment.this.mRefreshLayout.A(0);
                UserBadgeFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<BBSAchieveResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24429, new Class[]{Result.class}, Void.TYPE).isSupported && UserBadgeFragment.this.isActive()) {
                super.onNext(result);
                UserBadgeFragment.X3(UserBadgeFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24430, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSAchieveResult>) obj);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSAchieveObj f78520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f78521c;

        g(BBSAchieveObj bBSAchieveObj, String str) {
            this.f78520b = bBSAchieveObj;
            this.f78521c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24431, new Class[]{Throwable.class}, Void.TYPE).isSupported && UserBadgeFragment.this.isActive()) {
                super.onError(th2);
                UserBadgeFragment.this.f78500d.notifyDataSetChanged();
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24432, new Class[]{Result.class}, Void.TYPE).isSupported && UserBadgeFragment.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(UserBadgeFragment.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                this.f78520b.setWear(BBSAchieveObj.OPE_WEAR.equals(this.f78521c) ? "1" : "0");
                UserBadgeFragment.this.f78500d.notifyDataSetChanged();
                com.max.xiaoheihe.utils.d.r1(((com.max.hbcommon.base.d) UserBadgeFragment.this).mContext);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24433, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    static /* synthetic */ void O3(UserBadgeFragment userBadgeFragment, BBSAchieveObj bBSAchieveObj, String str) {
        if (PatchProxy.proxy(new Object[]{userBadgeFragment, bBSAchieveObj, str}, null, changeQuickRedirect, true, 24412, new Class[]{UserBadgeFragment.class, BBSAchieveObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        userBadgeFragment.l4(bBSAchieveObj, str);
    }

    static /* synthetic */ void S3(UserBadgeFragment userBadgeFragment) {
        if (PatchProxy.proxy(new Object[]{userBadgeFragment}, null, changeQuickRedirect, true, 24413, new Class[]{UserBadgeFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userBadgeFragment.h4();
    }

    static /* synthetic */ void W3(UserBadgeFragment userBadgeFragment) {
        if (PatchProxy.proxy(new Object[]{userBadgeFragment}, null, changeQuickRedirect, true, 24414, new Class[]{UserBadgeFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userBadgeFragment.showError();
    }

    static /* synthetic */ void X3(UserBadgeFragment userBadgeFragment, BBSAchieveResult bBSAchieveResult) {
        if (PatchProxy.proxy(new Object[]{userBadgeFragment, bBSAchieveResult}, null, changeQuickRedirect, true, 24415, new Class[]{UserBadgeFragment.class, BBSAchieveResult.class}, Void.TYPE).isSupported) {
            return;
        }
        userBadgeFragment.k4(bBSAchieveResult);
    }

    private void h4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24407, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Z7(this.f78498b, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void i4(BBSAchieveResult bBSAchieveResult) {
        if (PatchProxy.proxy(new Object[]{bBSAchieveResult}, this, changeQuickRedirect, false, 24406, new Class[]{BBSAchieveResult.class}, Void.TYPE).isSupported) {
            return;
        }
        BBSUserInfoObj user = bBSAchieveResult.getUser();
        if (user != null && !this.f78500d.H(R.layout.item_user_achievement_badge_header, user)) {
            this.f78500d.q(R.layout.item_user_achievement_badge_header, this.mInflater.inflate(R.layout.item_user_achievement_badge_header, (ViewGroup) this.mRecyclerView, false), user);
        }
        if (com.max.hbcommon.utils.c.u(bBSAchieveResult.getFaq()) || this.f78500d.G(R.layout.item_faq_footer, null)) {
            return;
        }
        View viewInflate = this.mInflater.inflate(R.layout.item_faq_footer, (ViewGroup) this.mRecyclerView, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_faq);
        textView.setText(getString(R.string.check_badge_rule));
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, getResources().getDrawable(R.drawable.ic_faq_gray), (Drawable) null);
        textView.setCompoundDrawablePadding(ViewUtils.f(this.mContext, 2.0f));
        textView.setOnClickListener(new e());
        this.f78500d.n(R.layout.item_faq_footer, viewInflate, null);
    }

    public static UserBadgeFragment j4(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 24401, new Class[]{String.class}, UserBadgeFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (UserBadgeFragment) patchProxyResultProxy.result;
        }
        UserBadgeFragment userBadgeFragment = new UserBadgeFragment();
        Bundle bundle = new Bundle();
        bundle.putString(f78497h, str);
        userBadgeFragment.setArguments(bundle);
        return userBadgeFragment;
    }

    private void k4(BBSAchieveResult bBSAchieveResult) {
        if (PatchProxy.proxy(new Object[]{bBSAchieveResult}, this, changeQuickRedirect, false, 24405, new Class[]{BBSAchieveResult.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (bBSAchieveResult == null) {
            return;
        }
        this.f78501e = bBSAchieveResult.getAchieve_count();
        this.f78502f = bBSAchieveResult.getTotal_count();
        i4(bBSAchieveResult);
        if (bBSAchieveResult.getAchieves() != null) {
            this.f78499c.clear();
            this.f78499c.addAll(bBSAchieveResult.getAchieves());
            this.f78500d.notifyDataSetChanged();
        }
    }

    private void l4(BBSAchieveObj bBSAchieveObj, String str) {
        if (PatchProxy.proxy(new Object[]{bBSAchieveObj, str}, this, changeQuickRedirect, false, 24408, new Class[]{BBSAchieveObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().e0(bBSAchieveObj.getMedal_id(), str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g(bBSAchieveObj, str)));
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24411, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("key", lb.c.f131115k);
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24404, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        h4();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24402, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f78498b = getArguments().getString(f78497h);
        }
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        RecyclerView recyclerView = this.mRecyclerView;
        Activity activity = this.mContext;
        recyclerView.addItemDecoration(new a(activity, ViewUtils.f(activity, 12.0f), 0));
        c cVar = new c(new b(this.mContext, this.f78499c, R.layout.item_user_badge));
        this.f78500d = cVar;
        this.mRecyclerView.setAdapter(cVar);
        this.mRefreshLayout.S(new d());
        this.mRefreshLayout.b0(false);
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24410, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        showLoading();
        h4();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24403, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        AchieveBadgeUpdatedBroadcastReceiver achieveBadgeUpdatedBroadcastReceiver = new AchieveBadgeUpdatedBroadcastReceiver(this, null);
        this.f78503g = achieveBadgeUpdatedBroadcastReceiver;
        registerReceiver(achieveBadgeUpdatedBroadcastReceiver, lb.a.f131079z);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24409, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.f78503g);
    }
}
