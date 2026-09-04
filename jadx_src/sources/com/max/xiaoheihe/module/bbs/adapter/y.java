package com.max.xiaoheihe.module.bbs.adapter;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.gson.JsonObject;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.module.account.SendToFriendActivity;
import com.max.xiaoheihe.module.account.component.FollowButton;
import com.max.xiaoheihe.module.account.component.FollowListItemView;
import com.max.xiaoheihe.module.account.component.FollowListItemViewDotVer;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: UserFollowListAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public class y extends com.max.hbcommon.base.adapter.s<BBSUserInfoObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f80742i = "desc_rec_tag";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f80743j = "desc_steam_state";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f80744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f80745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f80746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f80747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f80748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f80749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f80750h;

    /* JADX INFO: compiled from: UserFollowListAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f80751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80752c;

        a(BBSUserInfoObj bBSUserInfoObj, com.max.hbcommon.base.adapter.s.e eVar) {
            this.f80751b = bBSUserInfoObj;
            this.f80752c = eVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27500, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f80751b.setIs_Send(true);
            y.this.notifyItemChanged(this.f80752c.getAbsoluteAdapterPosition());
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("user_id", this.f80751b.getUserid());
            jsonObject.addProperty("msg", y.this.f80747e);
            jsonObject.addProperty(SendToFriendActivity.R, y.this.f80748f);
            com.max.hbcommon.analytics.d.d("4", lb.d.Q4, null, jsonObject);
            y.o(y.this, this.f80751b.getUserid());
        }
    }

    /* JADX INFO: compiled from: UserFollowListAdapter.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f80755c;

        b(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
            this.f80754b = eVar;
            this.f80755c = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27501, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!y.this.f80746d) {
                ((FollowListItemViewDotVer) this.f80754b.i(R.id.uiv)).f78848b.a();
            }
            com.max.xiaoheihe.base.router.b.T(y.this.f80744b, this.f80755c.getUserid()).A();
        }
    }

    /* JADX INFO: compiled from: UserFollowListAdapter.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f80757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f80758c;

        /* JADX INFO: compiled from: UserFollowListAdapter.java */
        public class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 27504, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
                y.this.f80745c.H2(c.this.f80758c);
                com.max.hbcommon.analytics.l.f66572a.o("0", "follow", c.this.f80758c.getUserid());
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 27503, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        c(String str, BBSUserInfoObj bBSUserInfoObj) {
            this.f80757b = str;
            this.f80758c = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27502, new Class[]{View.class}, Void.TYPE).isSupported || y.this.f80745c == null) {
                return;
            }
            if ("0".equals(this.f80757b) || "2".equals(this.f80757b)) {
                y.this.f80745c.V2(this.f80758c);
                com.max.hbcommon.analytics.l.f66572a.o("1", "follow", this.f80758c.getUserid());
            } else if ("1".equals(this.f80757b) || "3".equals(this.f80757b)) {
                com.max.xiaoheihe.view.l.D(y.this.f80744b, com.max.xiaoheihe.utils.d.n0(R.string.cancel_follow_user_confirm), "", com.max.xiaoheihe.utils.d.n0(R.string.confirm), com.max.xiaoheihe.utils.d.n0(R.string.cancel), new a());
            }
        }
    }

    /* JADX INFO: compiled from: UserFollowListAdapter.java */
    public interface d {
        void H2(BBSUserInfoObj bBSUserInfoObj);

        void V2(BBSUserInfoObj bBSUserInfoObj);

        String w();
    }

    public y(Context context, d dVar, List<BBSUserInfoObj> list) {
        this(context, dVar, list, R.layout.item_heybox_user, null, null);
    }

    public y(Context context, d dVar, List<BBSUserInfoObj> list, int i10, String str, String str2) {
        super(context, list, i10);
        this.f80746d = true;
        this.f80747e = null;
        this.f80748f = null;
        this.f80749g = false;
        this.f80750h = false;
        this.f80744b = context;
        this.f80745c = dVar;
        this.f80746d = i10 == R.layout.item_heybox_user;
        this.f80747e = str;
        this.f80748f = str2;
        this.f80749g = !com.max.hbcommon.utils.c.v(str, str2);
    }

    static /* synthetic */ void o(y yVar, String str) {
        if (PatchProxy.proxy(new Object[]{yVar, str}, null, changeQuickRedirect, true, 27499, new Class[]{y.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        yVar.u(str);
    }

    private void t(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 27496, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        String is_follow = bBSUserInfoObj.getIs_follow();
        FollowButton followButton = (FollowButton) eVar.i(R.id.f76246fb);
        if ("1".equals(is_follow)) {
            followButton.setFollowState(FollowButton.FollowState.Followed);
        } else if ("2".equals(is_follow)) {
            followButton.setFollowState(FollowButton.FollowState.FollowBack);
        } else if ("3".equals(is_follow)) {
            followButton.setFollowState(FollowButton.FollowState.FollowedEachOther);
        } else {
            followButton.setFollowState(FollowButton.FollowState.Follow);
        }
        followButton.setOnClickListener(new c(is_follow, bBSUserInfoObj));
    }

    @SuppressLint({"CheckResult"})
    private void u(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27497, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().k6(str, this.f80747e, this.f80748f).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.q());
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 27498, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        s(eVar, bBSUserInfoObj);
    }

    public void s(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
        TextView textView;
        RelativeLayout relativeLayout;
        if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 27495, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        FollowButton followButton = (FollowButton) eVar.i(R.id.f76246fb);
        if (i0.q(bBSUserInfoObj.getUserid())) {
            followButton.setVisibility(8);
        } else {
            followButton.setVisibility(0);
        }
        if (this.f80746d) {
            FollowListItemView followListItemView = (FollowListItemView) eVar.i(R.id.uiv);
            textView = followListItemView.f78846g;
            relativeLayout = followListItemView.f78845f;
            followListItemView.f78841b.setAvatar(bBSUserInfoObj.getAvartar(), bBSUserInfoObj.getAvatar_decoration());
            followListItemView.setName(bBSUserInfoObj.getUsername());
        } else {
            FollowListItemViewDotVer followListItemViewDotVer = (FollowListItemViewDotVer) eVar.i(R.id.uiv);
            followListItemViewDotVer.f78848b.setAvatar(bBSUserInfoObj.getAvartar());
            if (this.f80750h) {
                followListItemViewDotVer.f78848b.setDecoration(bBSUserInfoObj.getAvatar_decoration());
            } else {
                followListItemViewDotVer.f78848b.setDecoration(null);
            }
            if (bBSUserInfoObj.getUnread() <= 0 || this.f80750h) {
                followListItemViewDotVer.f78848b.a();
            } else {
                followListItemViewDotVer.f78848b.e();
            }
            textView = followListItemViewDotVer.f78853g;
            relativeLayout = followListItemViewDotVer.f78852f;
            followListItemViewDotVer.setName(bBSUserInfoObj.getUsername());
        }
        com.max.xiaoheihe.utils.d.j1(relativeLayout, bBSUserInfoObj);
        d dVar = this.f80745c;
        String strW = dVar != null ? dVar.w() : f80742i;
        if (f80742i.equals(strW) && !com.max.hbcommon.utils.c.u(bBSUserInfoObj.getRec_tag())) {
            textView.setVisibility(0);
            textView.setText(bBSUserInfoObj.getRec_tag());
        } else if (!f80743j.equals(strW) || com.max.hbcommon.utils.c.u(bBSUserInfoObj.getSteamid())) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            com.max.xiaoheihe.module.account.utils.l.X(textView, bBSUserInfoObj.getPersonastate(), bBSUserInfoObj.getGameid());
        }
        if (this.f80749g) {
            followButton.getLayoutParams().width = ViewUtils.f(this.f80744b, 68.0f);
            followButton.f78836c.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            if (bBSUserInfoObj.isIs_Send()) {
                followButton.setBackground(com.max.hbutils.utils.q.o(this.f80744b, R.color.divider_secondary_1_color, 3.0f));
                followButton.f78835b.setVisibility(8);
                followButton.f78836c.setText("已发送");
                followButton.f78836c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
                followButton.setOnClickListener(null);
            } else {
                followButton.setBackground(com.max.hbutils.utils.q.o(this.f80744b, R.color.text_primary_1_color, 3.0f));
                followButton.f78835b.setVisibility(8);
                followButton.f78836c.setText("发送");
                followButton.f78836c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color));
                followButton.setOnClickListener(new a(bBSUserInfoObj, eVar));
            }
        } else {
            t(eVar, bBSUserInfoObj);
        }
        eVar.b().setOnClickListener(new b(eVar, bBSUserInfoObj));
    }
}
