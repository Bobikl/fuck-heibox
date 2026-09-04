package com.max.xiaoheihe.module.game.xbox.viewholderbinder;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.game.xbox.XboxFriendInfo;
import com.max.xiaoheihe.bean.game.xbox.XboxPresenceInfo;
import com.max.xiaoheihe.module.account.component.FriendItemView;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: XboxFriendViewHolderBinder.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nXboxFriendViewHolderBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XboxFriendViewHolderBinder.kt\ncom/max/xiaoheihe/module/game/xbox/viewholderbinder/XboxFriendViewHolderBinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
@o(parameters = 0)
public final class a extends cb.c<XboxFriendInfo> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f88550c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private com.max.xiaoheihe.module.game.xbox.viewholderbinder.b f88551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private Context f88552b;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.xbox.viewholderbinder.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: XboxFriendViewHolderBinder.kt */
    public static final class ViewOnClickListenerC0807a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ XboxFriendInfo f88553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f88554c;

        ViewOnClickListenerC0807a(XboxFriendInfo xboxFriendInfo, a aVar) {
            this.f88553b = xboxFriendInfo;
            this.f88554c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            XboxFriendInfo xboxFriendInfo;
            String xuid;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38437, new Class[]{View.class}, Void.TYPE).isSupported || (xboxFriendInfo = this.f88553b) == null || (xuid = xboxFriendInfo.getXuid()) == null) {
                return;
            }
            a aVar = this.f88554c;
            XboxFriendInfo xboxFriendInfo2 = this.f88553b;
            Context contextB = aVar.h().b();
            BBSUserInfoObj bind_heybox_info = xboxFriendInfo2.getBind_heybox_info();
            String userid = bind_heybox_info != null ? bind_heybox_info.getUserid() : null;
            if (userid == null) {
                userid = "0";
            } else {
                f0.o(userid, "data.bind_heybox_info?.userid ?: \"0\"");
            }
            r1.J0(contextB, userid, xuid);
        }
    }

    /* JADX INFO: compiled from: XboxFriendViewHolderBinder.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ XboxFriendInfo f88556c;

        b(XboxFriendInfo xboxFriendInfo) {
            this.f88556c = xboxFriendInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38438, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context contextB = a.this.h().b();
            BBSUserInfoObj bind_heybox_info = this.f88556c.getBind_heybox_info();
            com.max.xiaoheihe.base.router.b.T(contextB, bind_heybox_info != null ? bind_heybox_info.getUserid() : null).A();
        }
    }

    /* JADX INFO: compiled from: XboxFriendViewHolderBinder.kt */
    @t0({"SMAP\nXboxFriendViewHolderBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XboxFriendViewHolderBinder.kt\ncom/max/xiaoheihe/module/game/xbox/viewholderbinder/XboxFriendViewHolderBinder$refreshXboxOnlineStatus$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static final class c extends com.max.hbcommon.network.d<Result<XboxPresenceInfo>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FriendItemView f88557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ XboxFriendInfo f88558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f88559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s.e f88560e;

        c(FriendItemView friendItemView, XboxFriendInfo xboxFriendInfo, a aVar, s.e eVar) {
            this.f88557b = friendItemView;
            this.f88558c = xboxFriendInfo;
            this.f88559d = aVar;
            this.f88560e = eVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38440, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(this.f88557b.getTag(), this.f88558c.getXuid())) {
                this.f88558c.setOnlineStateCode(null);
                this.f88558c.setOnlineStateStr("");
            }
        }

        public void onNext(@d Result<XboxPresenceInfo> r10) {
            XboxPresenceInfo result;
            if (PatchProxy.proxy(new Object[]{r10}, this, changeQuickRedirect, false, 38439, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(r10, "r");
            if (!f0.g(this.f88557b.getTag(), this.f88558c.getXuid()) || (result = r10.getResult()) == null) {
                return;
            }
            FriendItemView friendItemView = this.f88557b;
            a aVar = this.f88559d;
            XboxFriendInfo xboxFriendInfo = this.f88558c;
            s.e eVar = this.f88560e;
            if (friendItemView != null) {
                friendItemView.setShowStatus(true);
            }
            String online_state = result.getOnline_state();
            if (f0.g(online_state, "1") ? true : f0.g(online_state, "2")) {
                if (friendItemView != null) {
                    friendItemView.setStatusColor(aVar.g().getResources().getColor(R.color.user_level_2_start));
                }
            } else if (friendItemView != null) {
                friendItemView.setStatusColor(aVar.g().getResources().getColor(R.color.text_secondary_1_color));
            }
            String presence_state_desc = result.getPresence_state_desc();
            if (presence_state_desc != null && friendItemView != null) {
                friendItemView.setStatusText(presence_state_desc);
            }
            xboxFriendInfo.setOnlineStateCode(result.getOnline_state());
            xboxFriendInfo.setOnlineStateStr(result.getPresence_state_desc());
            aVar.h().a().notifyItemChanged(eVar.getAdapterPosition());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38441, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<XboxPresenceInfo>) obj);
        }
    }

    public a(@d com.max.xiaoheihe.module.game.xbox.viewholderbinder.b param) {
        f0.p(param, "param");
        this.f88551a = param;
        this.f88552b = param.b();
    }

    private final void i(s.e eVar, XboxFriendInfo xboxFriendInfo) {
        String username;
        String avatar;
        if (PatchProxy.proxy(new Object[]{eVar, xboxFriendInfo}, this, changeQuickRedirect, false, 38435, new Class[]{s.e.class, XboxFriendInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        FriendItemView friendItemView = (FriendItemView) eVar.i(R.id.fiv);
        if (!(xboxFriendInfo != null ? f0.g(xboxFriendInfo.getHas_heybox(), Boolean.TRUE) : false)) {
            if (friendItemView != null) {
                friendItemView.setShowInvite(true);
                return;
            }
            return;
        }
        BBSUserInfoObj bind_heybox_info = xboxFriendInfo.getBind_heybox_info();
        if (bind_heybox_info != null && (avatar = bind_heybox_info.getAvatar()) != null && friendItemView != null) {
            friendItemView.setHeyboxAvartar(avatar);
        }
        BBSUserInfoObj bind_heybox_info2 = xboxFriendInfo.getBind_heybox_info();
        if (bind_heybox_info2 != null && (username = bind_heybox_info2.getUsername()) != null && friendItemView != null) {
            friendItemView.setHeyboxNickName(username);
        }
        if (friendItemView != null) {
            friendItemView.setHeyboxAccountClickListener(new b(xboxFriendInfo));
        }
        if (friendItemView != null) {
            friendItemView.setShowInvite(false);
        }
    }

    private final void j(s.e eVar, XboxFriendInfo xboxFriendInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, xboxFriendInfo}, this, changeQuickRedirect, false, 38434, new Class[]{s.e.class, XboxFriendInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        FriendItemView friendItemView = (FriendItemView) eVar.i(R.id.fiv);
        if (!(this.f88552b instanceof BaseActivity) || xboxFriendInfo == null) {
            return;
        }
        friendItemView.setTag(xboxFriendInfo.getXuid());
        Context context = this.f88552b;
        f0.n(context, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
        ((BaseActivity) context).V((io.reactivex.disposables.b) i.a().L0(xboxFriendInfo.getXuid()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(friendItemView, xboxFriendInfo, this, eVar)));
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(s.e eVar, XboxFriendInfo xboxFriendInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, xboxFriendInfo}, this, changeQuickRedirect, false, 38436, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, xboxFriendInfo);
    }

    public void f(@d s.e viewHolder, @e XboxFriendInfo xboxFriendInfo) {
        String total_gamer_score;
        String avatar_url;
        String nickname;
        String rank;
        if (PatchProxy.proxy(new Object[]{viewHolder, xboxFriendInfo}, this, changeQuickRedirect, false, 38433, new Class[]{s.e.class, XboxFriendInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        FriendItemView friendItemView = (FriendItemView) viewHolder.i(R.id.fiv);
        if (friendItemView != null) {
            friendItemView.setShowRank(true);
        }
        if (friendItemView != null) {
            friendItemView.setShowAchievement(true);
        }
        if (friendItemView != null) {
            friendItemView.setIsMe(xboxFriendInfo != null && xboxFriendInfo.isMyself());
        }
        if (friendItemView != null) {
            if (xboxFriendInfo == null || (rank = xboxFriendInfo.getRank()) == null) {
                rank = "0";
            }
            friendItemView.setRank(rank);
        }
        if (xboxFriendInfo != null && (nickname = xboxFriendInfo.getNickname()) != null && friendItemView != null) {
            friendItemView.setNickName(nickname);
        }
        if (xboxFriendInfo != null && (avatar_url = xboxFriendInfo.getAvatar_url()) != null && friendItemView != null) {
            friendItemView.setAvartar(avatar_url);
        }
        if (xboxFriendInfo != null && (total_gamer_score = xboxFriendInfo.getTotal_gamer_score()) != null && friendItemView != null) {
            friendItemView.setAchievementPoint(total_gamer_score);
        }
        i(viewHolder, xboxFriendInfo);
        if (friendItemView != null) {
            friendItemView.setStatusText("");
        }
        if ((xboxFriendInfo != null ? xboxFriendInfo.getOnlineStateCode() : null) == null) {
            if (friendItemView != null) {
                friendItemView.setShowStatus(false);
            }
            j(viewHolder, xboxFriendInfo);
        } else {
            if (friendItemView != null) {
                friendItemView.setShowStatus(true);
            }
            String onlineStateCode = xboxFriendInfo.getOnlineStateCode();
            if (f0.g(onlineStateCode, "1") ? true : f0.g(onlineStateCode, "2")) {
                if (friendItemView != null) {
                    friendItemView.setStatusColor(this.f88552b.getResources().getColor(R.color.user_level_2_start));
                }
            } else if (friendItemView != null) {
                friendItemView.setStatusColor(this.f88552b.getResources().getColor(R.color.text_secondary_1_color));
            }
            String onlineStateStr = xboxFriendInfo.getOnlineStateStr();
            if (onlineStateStr != null && friendItemView != null) {
                friendItemView.setStatusText(onlineStateStr);
            }
        }
        viewHolder.itemView.setOnClickListener(new ViewOnClickListenerC0807a(xboxFriendInfo, this));
    }

    @d
    public final Context g() {
        return this.f88552b;
    }

    @d
    public final com.max.xiaoheihe.module.game.xbox.viewholderbinder.b h() {
        return this.f88551a;
    }

    public final void k(@d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 38432, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f88552b = context;
    }

    public final void l(@d com.max.xiaoheihe.module.game.xbox.viewholderbinder.b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 38431, new Class[]{com.max.xiaoheihe.module.game.xbox.viewholderbinder.b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bVar, "<set-?>");
        this.f88551a = bVar;
    }
}
