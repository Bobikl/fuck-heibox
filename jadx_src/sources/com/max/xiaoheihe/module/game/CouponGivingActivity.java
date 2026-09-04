package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.FriendRankResultObj;
import com.max.xiaoheihe.bean.account.HeyboxInfoObj;
import com.max.xiaoheihe.bean.account.PlayerRankObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class CouponGivingActivity extends BaseActivity {
    public static final String V = "online";
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.max.hbcommon.base.adapter.u<PlayerRankObj> N;
    private com.max.hbcommon.base.adapter.t O;
    private String P;
    private String Q;
    private String R;
    private String S;
    private String T;

    @BindView(R.id.et_search_friend)
    EditText et_search;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.tv_confirm)
    TextView tv_confirm;

    @BindView(R.id.vg_empty)
    ViewGroup vg_empty;
    private List<PlayerRankObj> L = new ArrayList();
    private List<PlayerRankObj> M = new ArrayList();
    Handler U = new e();

    public class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32327, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            CouponGivingActivity.M1(CouponGivingActivity.this);
        }
    }

    public class b extends com.max.hbcommon.base.adapter.u<PlayerRankObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f84054b;

            a(Context context) {
                this.f84054b = context;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32331, new Class[]{View.class}, Void.TYPE).isSupported && (this.f84054b instanceof Activity)) {
                    Intent intent = new Intent(this.f84054b, (Class<?>) WebActionActivity.class);
                    intent.putExtra("pageurl", String.format(lb.a.I1, com.max.xiaoheihe.module.account.utils.c.i()));
                    intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.invite_friend));
                    this.f84054b.startActivity(intent);
                }
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.CouponGivingActivity$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0745b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f84056b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f84057c;

            ViewOnClickListenerC0745b(String str, String str2) {
                this.f84056b = str;
                this.f84057c = str2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32332, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.U(view.getContext(), this.f84056b, this.f84057c).A();
            }
        }

        public class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f84059b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HeyboxInfoObj f84060c;

            c(String str, HeyboxInfoObj heyboxInfoObj) {
                this.f84059b = str;
                this.f84060c = heyboxInfoObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32333, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (this.f84059b.equals(CouponGivingActivity.this.Q)) {
                    CouponGivingActivity.this.Q = null;
                    CouponGivingActivity.this.R = null;
                } else {
                    CouponGivingActivity.this.Q = this.f84059b;
                    CouponGivingActivity.this.R = this.f84060c.getUsername();
                }
                CouponGivingActivity.this.O.notifyDataSetChanged();
            }
        }

        b(Context context, List list) {
            super(context, list);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, PlayerRankObj playerRankObj) {
            Object[] objArr = {new Integer(i10), playerRankObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32329, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, playerRankObj);
        }

        public int n(int i10, PlayerRankObj playerRankObj) {
            return R.layout.item_friend_checkable;
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, PlayerRankObj playerRankObj) {
            if (!PatchProxy.proxy(new Object[]{eVar, playerRankObj}, this, changeQuickRedirect, false, 32328, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PlayerRankObj.class}, Void.TYPE).isSupported && eVar.d() == R.layout.item_friend_checkable) {
                Context context = eVar.itemView.getContext();
                ImageView imageView = (ImageView) eVar.i(R.id.iv_item_friend_ranking_x_heybox_avatar);
                TextView textView = (TextView) eVar.i(R.id.tv_item_friend_ranking_x_heybox_username);
                ImageView imageView2 = (ImageView) eVar.i(R.id.iv_item_friend_ranking_avatar);
                ImageView imageView3 = (ImageView) eVar.i(R.id.iv_heybox_friend);
                TextView textView2 = (TextView) eVar.i(R.id.tv_item_friend_ranking_nickname);
                TextView textView3 = (TextView) eVar.i(R.id.tv_item_friend_online_status);
                View viewI = eVar.i(R.id.v_item_friend_ranking_divider);
                ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_steam_info);
                ImageView imageView4 = (ImageView) eVar.i(R.id.iv_check_state);
                if (com.max.hbcommon.utils.c.u(playerRankObj.getSteamid())) {
                    viewGroup.setVisibility(4);
                    imageView2.setVisibility(4);
                } else {
                    viewGroup.setVisibility(0);
                    imageView2.setVisibility(0);
                }
                com.max.hbimage.b.d0(playerRankObj.getAvatar(), imageView2, ViewUtils.f(context, 2.0f));
                textView2.setText(playerRankObj.getNickname());
                textView3.setVisibility(8);
                if ("1".equals(playerRankObj.getIs_steam())) {
                    imageView3.setVisibility(4);
                } else {
                    imageView3.setVisibility(0);
                }
                HeyboxInfoObj heybox_info = playerRankObj.getHeybox_info();
                if (heybox_info == null || TextUtils.isEmpty(heybox_info.getUserid()) || "-1".equals(heybox_info.getUserid())) {
                    com.max.hbimage.b.d(imageView, context.getResources().getDrawable(R.drawable.common_default_avatar_40x40));
                    textView.setPadding(ViewUtils.f(context, 12.0f), ViewUtils.f(context, 4.0f), ViewUtils.f(context, 12.0f), ViewUtils.f(context, 4.0f));
                    textView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
                    textView.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.border_text_primary_2dp));
                    textView.setText(context.getResources().getString(R.string.invite_he));
                    textView.setOnClickListener(new a(context));
                } else {
                    com.max.hbimage.b.I(heybox_info.getAvartar(), imageView, R.drawable.common_default_avatar_40x40);
                    textView.setPadding(0, 0, 0, 0);
                    textView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
                    textView.setBackgroundDrawable(null);
                    textView.setText(heybox_info.getUsername());
                    textView.setOnClickListener(null);
                }
                viewI.setVisibility(0);
                String steam_id = playerRankObj.getSteam_id();
                if (heybox_info == null || TextUtils.isEmpty(heybox_info.getUserid()) || "-1".equals(heybox_info.getUserid())) {
                    eVar.itemView.setOnClickListener(null);
                    imageView.setOnClickListener(null);
                    imageView4.setImageResource(R.drawable.common_cb_unclickable);
                } else {
                    String userid = heybox_info.getUserid();
                    if (userid.equals(CouponGivingActivity.this.Q)) {
                        imageView4.setImageResource(R.drawable.account_cb_checked_16_16x16);
                    } else {
                        imageView4.setImageResource(R.drawable.common_cb_unchecked);
                    }
                    imageView.setOnClickListener(new ViewOnClickListenerC0745b(userid, steam_id));
                    eVar.itemView.setOnClickListener(new c(userid, heybox_info));
                }
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 32330, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (PlayerRankObj) obj);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 32335, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 32336, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                CouponGivingActivity.Y1(CouponGivingActivity.this);
                dialogInterface.dismiss();
            }
        }

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32334, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            new com.max.hbcommon.view.a.f(((BaseActivity) CouponGivingActivity.this).f66601b).y(String.format(CouponGivingActivity.this.getString(R.string.present_coupon_title), CouponGivingActivity.this.R, CouponGivingActivity.this.S)).l(CouponGivingActivity.this.getString(R.string.present_coupon_msg)).u(CouponGivingActivity.this.getString(R.string.confirm), new b()).o(CouponGivingActivity.this.getString(R.string.cancel), new a()).F();
        }
    }

    public class d implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 32337, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            CouponGivingActivity.this.U.removeCallbacksAndMessages(null);
            Message messageObtainMessage = CouponGivingActivity.this.U.obtainMessage();
            messageObtainMessage.obj = com.max.xiaoheihe.utils.d.M1(editable.toString());
            CouponGivingActivity.this.U.sendMessageDelayed(messageObtainMessage, 100L);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class e extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 32338, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            CouponGivingActivity.this.T = (String) message.obj;
            com.max.hbcommon.utils.d.b("zzzztest", "keywords");
            CouponGivingActivity.c2(CouponGivingActivity.this);
            CouponGivingActivity.e2(CouponGivingActivity.this);
            CouponGivingActivity.this.O.notifyDataSetChanged();
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<FriendRankResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32340, new Class[0], Void.TYPE).isSupported && CouponGivingActivity.this.isActive()) {
                CouponGivingActivity.this.mRefreshLayout.A(0);
                CouponGivingActivity.this.mRefreshLayout.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 32339, new Class[]{Throwable.class}, Void.TYPE).isSupported && CouponGivingActivity.this.isActive()) {
                CouponGivingActivity.this.mRefreshLayout.A(0);
                CouponGivingActivity.this.mRefreshLayout.p(0);
                CouponGivingActivity.O1(CouponGivingActivity.this);
            }
        }

        public void onNext(Result<FriendRankResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32341, new Class[]{Result.class}, Void.TYPE).isSupported && CouponGivingActivity.this.isActive()) {
                CouponGivingActivity.R1(CouponGivingActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32342, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<FriendRankResultObj>) obj);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32343, new Class[]{Result.class}, Void.TYPE).isSupported && CouponGivingActivity.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.d(CouponGivingActivity.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.d(result.getMsg());
                }
                ((BaseActivity) CouponGivingActivity.this).f66601b.sendBroadcast(new Intent(lb.a.C));
                CouponGivingActivity.this.setResult(-1);
                CouponGivingActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32344, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    static /* synthetic */ void M1(CouponGivingActivity couponGivingActivity) {
        if (PatchProxy.proxy(new Object[]{couponGivingActivity}, null, changeQuickRedirect, true, 32321, new Class[]{CouponGivingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        couponGivingActivity.f2();
    }

    static /* synthetic */ void O1(CouponGivingActivity couponGivingActivity) {
        if (PatchProxy.proxy(new Object[]{couponGivingActivity}, null, changeQuickRedirect, true, 32325, new Class[]{CouponGivingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        couponGivingActivity.C1();
    }

    static /* synthetic */ void R1(CouponGivingActivity couponGivingActivity, FriendRankResultObj friendRankResultObj) {
        if (PatchProxy.proxy(new Object[]{couponGivingActivity, friendRankResultObj}, null, changeQuickRedirect, true, 32326, new Class[]{CouponGivingActivity.class, FriendRankResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        couponGivingActivity.m2(friendRankResultObj);
    }

    static /* synthetic */ void Y1(CouponGivingActivity couponGivingActivity) {
        if (PatchProxy.proxy(new Object[]{couponGivingActivity}, null, changeQuickRedirect, true, 32322, new Class[]{CouponGivingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        couponGivingActivity.l2();
    }

    static /* synthetic */ void c2(CouponGivingActivity couponGivingActivity) {
        if (PatchProxy.proxy(new Object[]{couponGivingActivity}, null, changeQuickRedirect, true, 32323, new Class[]{CouponGivingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        couponGivingActivity.k2();
    }

    static /* synthetic */ void e2(CouponGivingActivity couponGivingActivity) {
        if (PatchProxy.proxy(new Object[]{couponGivingActivity}, null, changeQuickRedirect, true, 32324, new Class[]{CouponGivingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        couponGivingActivity.n2();
    }

    private void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32317, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().K2("online", com.max.xiaoheihe.module.account.utils.c.i(), 0, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    public static Intent h2(Context context, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 32311, new Class[]{Context.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) CouponGivingActivity.class);
        intent.putExtra("coupon_id", str);
        intent.putExtra("game_name", str2);
        return intent;
    }

    private void i2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32313, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b bVar = new b(this.f66601b, this.L);
        this.N = bVar;
        this.O = new com.max.hbcommon.base.adapter.t(bVar);
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setClipChildren(false);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        View viewInflate = this.f66602c.inflate(R.layout.item_friend_count_header, (ViewGroup) this.mRecyclerView, false);
        viewInflate.setPadding(0, 0, ViewUtils.f(this.f66601b, 40.0f), 0);
        this.O.p(R.layout.item_friend_count_header, viewInflate);
        this.mRecyclerView.setAdapter(this.O);
    }

    private boolean j2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32316, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!com.max.hbcommon.utils.c.w(this.L)) {
            for (PlayerRankObj playerRankObj : this.L) {
                if (playerRankObj.getHeybox_info() != null && playerRankObj.getHeybox_info().getUserid() != null && playerRankObj.getHeybox_info().getUserid().equals(this.Q)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void k2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32315, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.w(this.M)) {
            this.L.clear();
            if (com.max.hbcommon.utils.c.u(this.T)) {
                this.L.addAll(this.M);
            } else {
                for (PlayerRankObj playerRankObj : this.M) {
                    if ((playerRankObj.getHeybox_info() != null && playerRankObj.getHeybox_info().getUsername() != null && playerRankObj.getHeybox_info().getUsername().contains(this.T)) || (playerRankObj.getNickname() != null && playerRankObj.getSteam_id() != null && playerRankObj.getNickname().contains(this.T))) {
                        this.L.add(playerRankObj);
                    }
                }
            }
        }
        if (!j2()) {
            this.Q = null;
            this.R = null;
        }
        com.max.hbcommon.utils.d.b("zzzztest", "onKeywordChanged    " + this.L.size());
    }

    private void l2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32319, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.v(this.Q, this.P)) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().y2(this.Q, this.P).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private void m2(FriendRankResultObj friendRankResultObj) {
        if (PatchProxy.proxy(new Object[]{friendRankResultObj}, this, changeQuickRedirect, false, 32318, new Class[]{FriendRankResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        if (com.max.hbcommon.utils.c.w(friendRankResultObj.getFriends())) {
            return;
        }
        this.M.clear();
        this.M.addAll(friendRankResultObj.getFriends());
        k2();
        n2();
        this.O.notifyDataSetChanged();
    }

    private void n2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32320, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(this.L)) {
            this.vg_empty.setVisibility(0);
        } else {
            this.vg_empty.setVisibility(8);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32312, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_coupon_giving);
        ButterKnife.a(this);
        this.f66616q.setTitle(getString(R.string.choose_friend_to_give));
        getWindow().setSoftInputMode(48);
        this.P = getIntent().getStringExtra("coupon_id");
        this.S = getIntent().getStringExtra("game_name");
        i2();
        this.mRefreshLayout.S(new a());
        this.mRefreshLayout.b0(false);
        E1();
        f2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32314, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.tv_confirm.setOnClickListener(new c());
        this.et_search.addTextChangedListener(new d());
    }
}
