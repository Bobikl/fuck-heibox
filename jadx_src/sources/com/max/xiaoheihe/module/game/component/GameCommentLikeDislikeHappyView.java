package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.game.UserSupportStateObj;
import com.max.xiaoheihe.module.bbs.component.GameCommentAwardView;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameCommentLikeDislikeHappyView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameCommentLikeDislikeHappyView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f86656f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GameCommentAwardView f86657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GameCommentAwardView f86658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GameCommentAwardView f86659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private a f86660e;

    /* JADX INFO: compiled from: GameCommentLikeDislikeHappyView.kt */
    public interface a {
        void a(@dl.d LinkInfoObj linkInfoObj);

        void b(@dl.d LinkInfoObj linkInfoObj);

        void c(@dl.d LinkInfoObj linkInfoObj);
    }

    /* JADX INFO: compiled from: GameCommentLikeDislikeHappyView.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f86662c;

        b(LinkInfoObj linkInfoObj) {
            this.f86662c = linkInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36432, new Class[]{View.class}, Void.TYPE).isSupported || !i0.e(GameCommentLikeDislikeHappyView.this.getContext()) || GameCommentLikeDislikeHappyView.this.c(this.f86662c)) {
                return;
            }
            if (this.f86662c.getUser_support_state() == null) {
                this.f86662c.setUser_support_state(new UserSupportStateObj("0", "0", "0"));
            }
            UserSupportStateObj user_support_state = this.f86662c.getUser_support_state();
            f0.o(user_support_state, "data.getUser_support_state()");
            if (com.max.hbcommon.utils.c.x(user_support_state.is_down())) {
                LinkInfoObj linkInfoObj = this.f86662c;
                linkInfoObj.setDown(String.valueOf(Math.max(0, n.q(linkInfoObj.getDown()) - 1)));
                user_support_state.set_down("0");
                this.f86662c.setIs_award_link("0");
                GameCommentLikeDislikeHappyView.a(GameCommentLikeDislikeHappyView.this, this.f86662c, "0", null);
            } else {
                if (com.max.hbcommon.utils.c.x(user_support_state.is_up())) {
                    LinkInfoObj linkInfoObj2 = this.f86662c;
                    linkInfoObj2.setLink_award_num(String.valueOf(Math.max(0, n.q(linkInfoObj2.getLink_award_num()) - 1)));
                    user_support_state.set_up("0");
                } else if (com.max.hbcommon.utils.c.x(user_support_state.is_happy())) {
                    LinkInfoObj linkInfoObj3 = this.f86662c;
                    linkInfoObj3.setHappy(String.valueOf(Math.max(0, n.q(linkInfoObj3.getHappy()) - 1)));
                    user_support_state.set_happy("0");
                }
                LinkInfoObj linkInfoObj4 = this.f86662c;
                linkInfoObj4.setDown(String.valueOf(n.q(linkInfoObj4.getDown()) + 1));
                user_support_state.set_down("1");
                this.f86662c.setIs_award_link("2");
                GameCommentLikeDislikeHappyView.a(GameCommentLikeDislikeHappyView.this, this.f86662c, "2", null);
            }
            GameCommentLikeDislikeHappyView.this.e(this.f86662c, true);
            a onLDHClickListener = GameCommentLikeDislikeHappyView.this.getOnLDHClickListener();
            if (onLDHClickListener != null) {
                onLDHClickListener.b(this.f86662c);
            }
        }
    }

    /* JADX INFO: compiled from: GameCommentLikeDislikeHappyView.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f86664c;

        c(LinkInfoObj linkInfoObj) {
            this.f86664c = linkInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36433, new Class[]{View.class}, Void.TYPE).isSupported || !i0.e(GameCommentLikeDislikeHappyView.this.getContext()) || GameCommentLikeDislikeHappyView.this.c(this.f86664c)) {
                return;
            }
            if (this.f86664c.getUser_support_state() == null) {
                this.f86664c.setUser_support_state(new UserSupportStateObj("0", "0", "0"));
            }
            UserSupportStateObj user_support_state = this.f86664c.getUser_support_state();
            f0.o(user_support_state, "data.getUser_support_state()");
            if (com.max.hbcommon.utils.c.x(user_support_state.is_happy())) {
                LinkInfoObj linkInfoObj = this.f86664c;
                linkInfoObj.setHappy(String.valueOf(Math.max(0, n.q(linkInfoObj.getHappy()) - 1)));
                user_support_state.set_happy("0");
                this.f86664c.setIs_award_link("0");
                GameCommentLikeDislikeHappyView.a(GameCommentLikeDislikeHappyView.this, this.f86664c, "0", null);
            } else {
                if (com.max.hbcommon.utils.c.x(user_support_state.is_down())) {
                    LinkInfoObj linkInfoObj2 = this.f86664c;
                    linkInfoObj2.setDown(String.valueOf(Math.max(0, n.q(linkInfoObj2.getDown()) - 1)));
                    user_support_state.set_down("0");
                } else if (com.max.hbcommon.utils.c.x(user_support_state.is_up())) {
                    LinkInfoObj linkInfoObj3 = this.f86664c;
                    linkInfoObj3.setLink_award_num(String.valueOf(Math.max(0, n.q(linkInfoObj3.getLink_award_num()) - 1)));
                    user_support_state.set_up("0");
                }
                LinkInfoObj linkInfoObj4 = this.f86664c;
                linkInfoObj4.setHappy(String.valueOf(n.q(linkInfoObj4.getHappy()) + 1));
                user_support_state.set_happy("1");
                this.f86664c.setIs_award_link("0");
                GameCommentLikeDislikeHappyView.a(GameCommentLikeDislikeHappyView.this, this.f86664c, "1", "1");
            }
            GameCommentLikeDislikeHappyView.this.e(this.f86664c, true);
            a onLDHClickListener = GameCommentLikeDislikeHappyView.this.getOnLDHClickListener();
            if (onLDHClickListener != null) {
                onLDHClickListener.a(this.f86664c);
            }
        }
    }

    /* JADX INFO: compiled from: GameCommentLikeDislikeHappyView.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f86666c;

        d(LinkInfoObj linkInfoObj) {
            this.f86666c = linkInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36434, new Class[]{View.class}, Void.TYPE).isSupported || !i0.e(GameCommentLikeDislikeHappyView.this.getContext()) || GameCommentLikeDislikeHappyView.this.c(this.f86666c)) {
                return;
            }
            if (this.f86666c.getUser_support_state() == null) {
                this.f86666c.setUser_support_state(new UserSupportStateObj("0", "0", "0"));
            }
            UserSupportStateObj user_support_state = this.f86666c.getUser_support_state();
            f0.o(user_support_state, "data.getUser_support_state()");
            if (com.max.hbcommon.utils.c.x(user_support_state.is_up())) {
                LinkInfoObj linkInfoObj = this.f86666c;
                linkInfoObj.setLink_award_num(String.valueOf(Math.max(0, n.q(linkInfoObj.getLink_award_num()) - 1)));
                this.f86666c.setIs_award_link("0");
                user_support_state.set_up("0");
                GameCommentLikeDislikeHappyView.a(GameCommentLikeDislikeHappyView.this, this.f86666c, "0", null);
            } else {
                if (com.max.hbcommon.utils.c.x(user_support_state.is_down())) {
                    LinkInfoObj linkInfoObj2 = this.f86666c;
                    linkInfoObj2.setDown(String.valueOf(Math.max(0, n.q(linkInfoObj2.getDown()) - 1)));
                    user_support_state.set_down("0");
                } else if (com.max.hbcommon.utils.c.x(user_support_state.is_happy())) {
                    LinkInfoObj linkInfoObj3 = this.f86666c;
                    linkInfoObj3.setHappy(String.valueOf(Math.max(0, n.q(linkInfoObj3.getHappy()) - 1)));
                    user_support_state.set_happy("0");
                }
                LinkInfoObj linkInfoObj4 = this.f86666c;
                linkInfoObj4.setLink_award_num(String.valueOf(n.q(linkInfoObj4.getLink_award_num()) + 1));
                this.f86666c.setIs_award_link("1");
                user_support_state.set_up("1");
                GameCommentLikeDislikeHappyView.a(GameCommentLikeDislikeHappyView.this, this.f86666c, "1", null);
            }
            GameCommentLikeDislikeHappyView.this.e(this.f86666c, true);
            a onLDHClickListener = GameCommentLikeDislikeHappyView.this.getOnLDHClickListener();
            if (onLDHClickListener != null) {
                onLDHClickListener.c(this.f86666c);
            }
        }
    }

    public GameCommentLikeDislikeHappyView(@e Context context) {
        this(context, null);
    }

    public GameCommentLikeDislikeHappyView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameCommentLikeDislikeHappyView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameCommentLikeDislikeHappyView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        b();
    }

    public static final /* synthetic */ void a(GameCommentLikeDislikeHappyView gameCommentLikeDislikeHappyView, LinkInfoObj linkInfoObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{gameCommentLikeDislikeHappyView, linkInfoObj, str, str2}, null, changeQuickRedirect, true, 36431, new Class[]{GameCommentLikeDislikeHappyView.class, LinkInfoObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameCommentLikeDislikeHappyView.d(linkInfoObj, str, str2);
    }

    private final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36425, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(16);
        int iF = ViewUtils.f(getContext(), 8.0f);
        setGca_like(new GameCommentAwardView(getContext()));
        getGca_like().setDesc(getContext().getResources().getString(R.string.useful));
        getGca_like().setIcon(R.drawable.expression_cube_zan);
        addView(getGca_like());
        setGca_dislike(new GameCommentAwardView(getContext()));
        getGca_dislike().setDesc(getContext().getResources().getString(R.string.unuseful));
        getGca_dislike().setIcon(R.drawable.expression_cube_cangsang);
        getGca_dislike().setShowAnim(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = iF;
        addView(getGca_dislike(), layoutParams);
        setGca_happy(new GameCommentAwardView(getContext()));
        getGca_happy().setDesc(getContext().getResources().getString(R.string.happy));
        getGca_happy().setIcon(R.drawable.expression_cube_huaji);
        addView(getGca_happy(), layoutParams);
    }

    private final void d(LinkInfoObj linkInfoObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj, str, str2}, this, changeQuickRedirect, false, 36430, new Class[]{LinkInfoObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        i.a().s4(linkInfoObj.getLinkid(), str, linkInfoObj.getH_src(), str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d());
    }

    public static /* synthetic */ void f(GameCommentLikeDislikeHappyView gameCommentLikeDislikeHappyView, LinkInfoObj linkInfoObj, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{gameCommentLikeDislikeHappyView, linkInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 36429, new Class[]{GameCommentLikeDislikeHappyView.class, LinkInfoObj.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        gameCommentLikeDislikeHappyView.e(linkInfoObj, z10);
    }

    public final boolean c(@dl.d LinkInfoObj data) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 36427, new Class[]{LinkInfoObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(data, "data");
        String strI = com.max.xiaoheihe.module.account.utils.c.i();
        BBSUserInfoObj user = data.getUser();
        if (!f0.g(strI, user != null ? user.getUserid() : null)) {
            return false;
        }
        com.max.hbutils.utils.c.f("不能给自己的评价点评为有用、没用或欢乐");
        return true;
    }

    public final void e(@e LinkInfoObj linkInfoObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36428, new Class[]{LinkInfoObj.class, Boolean.TYPE}, Void.TYPE).isSupported || linkInfoObj == null) {
            return;
        }
        UserSupportStateObj user_support_state = linkInfoObj.getUser_support_state();
        if (user_support_state != null) {
            f0.o(user_support_state, "user_support_state");
            getGca_like().setChecked(com.max.hbcommon.utils.c.x(linkInfoObj.getUser_support_state().is_up()), z10);
            getGca_dislike().setChecked(com.max.hbcommon.utils.c.x(linkInfoObj.getUser_support_state().is_down()), z10);
            getGca_happy().setChecked(com.max.hbcommon.utils.c.x(linkInfoObj.getUser_support_state().is_happy()), z10);
        }
        getGca_like().setNum(linkInfoObj.getLink_award_num());
        getGca_dislike().setNum(linkInfoObj.getDown());
        getGca_happy().setNum(linkInfoObj.getHappy());
    }

    @dl.d
    public final GameCommentAwardView getGca_dislike() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36421, new Class[0], GameCommentAwardView.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameCommentAwardView) patchProxyResultProxy.result;
        }
        GameCommentAwardView gameCommentAwardView = this.f86658c;
        if (gameCommentAwardView != null) {
            return gameCommentAwardView;
        }
        f0.S("gca_dislike");
        return null;
    }

    @dl.d
    public final GameCommentAwardView getGca_happy() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36423, new Class[0], GameCommentAwardView.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameCommentAwardView) patchProxyResultProxy.result;
        }
        GameCommentAwardView gameCommentAwardView = this.f86659d;
        if (gameCommentAwardView != null) {
            return gameCommentAwardView;
        }
        f0.S("gca_happy");
        return null;
    }

    @dl.d
    public final GameCommentAwardView getGca_like() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36419, new Class[0], GameCommentAwardView.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameCommentAwardView) patchProxyResultProxy.result;
        }
        GameCommentAwardView gameCommentAwardView = this.f86657b;
        if (gameCommentAwardView != null) {
            return gameCommentAwardView;
        }
        f0.S("gca_like");
        return null;
    }

    @e
    public final a getOnLDHClickListener() {
        return this.f86660e;
    }

    public final void setGca_dislike(@dl.d GameCommentAwardView gameCommentAwardView) {
        if (PatchProxy.proxy(new Object[]{gameCommentAwardView}, this, changeQuickRedirect, false, 36422, new Class[]{GameCommentAwardView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gameCommentAwardView, "<set-?>");
        this.f86658c = gameCommentAwardView;
    }

    public final void setGca_happy(@dl.d GameCommentAwardView gameCommentAwardView) {
        if (PatchProxy.proxy(new Object[]{gameCommentAwardView}, this, changeQuickRedirect, false, 36424, new Class[]{GameCommentAwardView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gameCommentAwardView, "<set-?>");
        this.f86659d = gameCommentAwardView;
    }

    public final void setGca_like(@dl.d GameCommentAwardView gameCommentAwardView) {
        if (PatchProxy.proxy(new Object[]{gameCommentAwardView}, this, changeQuickRedirect, false, 36420, new Class[]{GameCommentAwardView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gameCommentAwardView, "<set-?>");
        this.f86657b = gameCommentAwardView;
    }

    public final void setLinkInfo(@dl.d LinkInfoObj data) {
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 36426, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        d dVar = new d(data);
        b bVar = new b(data);
        c cVar = new c(data);
        getGca_like().setOnClickListener(dVar);
        getGca_dislike().setOnClickListener(bVar);
        getGca_happy().setOnClickListener(cVar);
    }

    public final void setOnLDHClickListener(@e a aVar) {
        this.f86660e = aVar;
    }
}
