package com.max.xiaoheihe.module.team;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TeamChatPushNofitication.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class a extends com.max.hbcommon.component.inappnotification.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f92378l = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    private final WebProtocolObj f92379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f92380k;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.team.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TeamChatPushNofitication.kt */
    public static final class ViewOnClickListenerC0868a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f92381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f92382c;

        ViewOnClickListenerC0868a(Context context, a aVar) {
            this.f92381b = context;
            this.f92382c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44275, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.f92383a.c(this.f92381b, this.f92382c.f92379j.valueOf("room_id"), this.f92382c.f92379j.valueOf("channel_id"), this.f92382c.f92379j.valueOf("link_id"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@e Context context, @d WebProtocolObj webProtocolObj, int i10) {
        super(context, true, 4000L, false, null, 0, 0, false, false, 504, null);
        f0.p(webProtocolObj, "webProtocolObj");
        this.f92379j = webProtocolObj;
        this.f92380k = i10;
    }

    public /* synthetic */ a(Context context, WebProtocolObj webProtocolObj, int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? null : context, webProtocolObj, i10);
    }

    @Override // com.max.hbcommon.component.inappnotification.a
    @e
    public View g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44274, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        Context contextF = f();
        if (contextF == null) {
            return null;
        }
        View viewInflate = kb.c.d(contextF).inflate(R.layout.layout_team_chat_inapp_push, (ViewGroup) new FrameLayout(contextF), false);
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) viewInflate.findViewById(R.id.iv_avatar);
        CardView cardView = (CardView) viewInflate.findViewById(R.id.card_view);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f92380k;
        BBSUserInfoObj bBSUserInfoObj = (BBSUserInfoObj) this.f92379j.objectOf("inviter", BBSUserInfoObj.class);
        heyBoxAvatarView.setAvatar(bBSUserInfoObj != null ? bBSUserInfoObj.getAvatar() : null, (AvatarDecorationObj) null);
        textView.setText(bBSUserInfoObj != null ? bBSUserInfoObj.getUsername() : null);
        viewInflate.setOnClickListener(new ViewOnClickListenerC0868a(contextF, this));
        return viewInflate;
    }
}
