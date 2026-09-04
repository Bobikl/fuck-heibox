package com.max.xiaoheihe.module.game.epic.adapter;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.game.epic.EpicFriendInfo;
import com.max.xiaoheihe.module.account.component.FriendItemView;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: EpicFriendAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nEpicFriendAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EpicFriendAdapter.kt\ncom/max/xiaoheihe/module/game/epic/adapter/EpicFriendAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
@o(parameters = 0)
public final class a extends s<EpicFriendInfo> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f87405c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final Context f87406b;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.epic.adapter.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EpicFriendAdapter.kt */
    public static final class ViewOnClickListenerC0793a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EpicFriendInfo f87408c;

        ViewOnClickListenerC0793a(EpicFriendInfo epicFriendInfo) {
            this.f87408c = epicFriendInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37505, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = a.this.f87406b;
            BBSUserInfoObj bind_heybox_info = this.f87408c.getBind_heybox_info();
            f0.m(bind_heybox_info);
            com.max.xiaoheihe.base.router.b.T(context, bind_heybox_info.getUserid()).A();
        }
    }

    /* JADX INFO: compiled from: EpicFriendAdapter.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EpicFriendInfo f87410c;

        b(EpicFriendInfo epicFriendInfo) {
            this.f87410c = epicFriendInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37506, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = a.this.f87406b;
            com.max.xiaoheihe.module.game.epic.a.C0792a c0792a = com.max.xiaoheihe.module.game.epic.a.f87402a;
            Context context2 = a.this.f87406b;
            BBSUserInfoObj bind_heybox_info = this.f87410c.getBind_heybox_info();
            f0.m(bind_heybox_info);
            String userid = bind_heybox_info.getUserid();
            f0.o(userid, "data.bind_heybox_info!!.userid");
            context.startActivity(c0792a.a(context2, userid));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@d Context mContext, @e List<EpicFriendInfo> list) {
        super(mContext, list, R.layout.item_platform_friend);
        f0.p(mContext, "mContext");
        this.f87406b = mContext;
    }

    public void n(@e s.e eVar, @e EpicFriendInfo epicFriendInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, epicFriendInfo}, this, changeQuickRedirect, false, 37503, new Class[]{s.e.class, EpicFriendInfo.class}, Void.TYPE).isSupported || epicFriendInfo == null) {
            return;
        }
        FriendItemView friendItemView = eVar != null ? (FriendItemView) eVar.i(R.id.fiv) : null;
        if (friendItemView != null) {
            friendItemView.b(true);
        }
        if (friendItemView != null) {
            friendItemView.setShowRank(false);
        }
        if (friendItemView != null) {
            friendItemView.setShowAchievement(false);
        }
        if (epicFriendInfo.getBind_heybox_info() != null) {
            if (friendItemView != null) {
                BBSUserInfoObj bind_heybox_info = epicFriendInfo.getBind_heybox_info();
                f0.m(bind_heybox_info);
                String username = bind_heybox_info.getUsername();
                f0.o(username, "data.bind_heybox_info!!.username");
                friendItemView.setHeyboxNickName(username);
            }
            if (friendItemView != null) {
                BBSUserInfoObj bind_heybox_info2 = epicFriendInfo.getBind_heybox_info();
                f0.m(bind_heybox_info2);
                String avartar = bind_heybox_info2.getAvartar();
                f0.o(avartar, "data.bind_heybox_info!!.avartar");
                friendItemView.setHeyboxAvartar(avartar);
            }
            if (friendItemView != null) {
                friendItemView.setHeyboxAccountClickListener(new ViewOnClickListenerC0793a(epicFriendInfo));
            }
            if (friendItemView != null) {
                friendItemView.setOnClickListener(new b(epicFriendInfo));
            }
        }
        if (epicFriendInfo.getEpic_name() != null) {
            r1.b2(friendItemView != null ? friendItemView.getTextAvartar() : null, epicFriendInfo.getEpic_name(), epicFriendInfo.getHead_color());
        }
        String epic_name = epicFriendInfo.getEpic_name();
        if (epic_name == null || friendItemView == null) {
            return;
        }
        friendItemView.setNickName(epic_name);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, EpicFriendInfo epicFriendInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, epicFriendInfo}, this, changeQuickRedirect, false, 37504, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, epicFriendInfo);
    }
}
