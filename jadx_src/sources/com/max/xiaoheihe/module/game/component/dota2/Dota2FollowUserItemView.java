package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.Dota2UserObj;
import com.max.xiaoheihe.bean.game.gameoverview.HeyBoxUserObj;
import com.max.xiaoheihe.bean.game.gameoverview.MMRInfo;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.d;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: Dota2FollowUserItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2FollowUserItemView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f87072o = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f87073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f87074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public QMUIRadiusImageView f87075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f87076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f87077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f87078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f87079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f87080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public QMUIRadiusImageView f87081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f87082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f87083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ViewGroup f87084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f87085n;

    /* JADX INFO: compiled from: Dota2FollowUserItemView.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dota2UserObj f87087c;

        a(Dota2UserObj dota2UserObj) {
            this.f87087c = dota2UserObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37144, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = Dota2FollowUserItemView.this.getContext();
            f0.o(context, "context");
            HeyBoxUserObj heybox_info = this.f87087c.getHeybox_info();
            com.max.xiaoheihe.base.router.b.T(context, heybox_info != null ? heybox_info.getUser_id() : null).A();
        }
    }

    /* JADX INFO: compiled from: Dota2FollowUserItemView.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37145, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(Dota2FollowUserItemView.this.getContext())) {
                Intent intent = new Intent(Dota2FollowUserItemView.this.getContext(), (Class<?>) WebActionActivity.class);
                v0 v0Var = v0.f124986a;
                String INVITE_FRIEND_WEB = lb.a.I1;
                f0.o(INVITE_FRIEND_WEB, "INVITE_FRIEND_WEB");
                String str = String.format(INVITE_FRIEND_WEB, Arrays.copyOf(new Object[]{i0.j()}, 1));
                f0.o(str, "format(format, *args)");
                intent.putExtra("pageurl", str);
                intent.putExtra("title", d.n0(R.string.invite_friend));
                Dota2FollowUserItemView.this.getContext().startActivity(intent);
            }
        }
    }

    /* JADX INFO: compiled from: Dota2FollowUserItemView.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dota2UserObj f87090c;

        c(Dota2UserObj dota2UserObj) {
            this.f87090c = dota2UserObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37146, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = Dota2FollowUserItemView.this.getContext();
            f0.o(context, "context");
            HeyBoxUserObj heybox_info = this.f87090c.getHeybox_info();
            com.max.xiaoheihe.base.router.b.p0(context, heybox_info != null ? heybox_info.getUser_id() : null, this.f87090c.getSteam_id());
        }
    }

    public Dota2FollowUserItemView(@e Context context) {
        this(context, null);
    }

    public Dota2FollowUserItemView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Dota2FollowUserItemView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Dota2FollowUserItemView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37140, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.view_dota2_follow_user_item, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.div);
        f0.o(viewFindViewById, "findViewById(R.id.div)");
        setDiv(viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.tv_rank);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_rank)");
        setTvRank((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.iv_avatar);
        f0.o(viewFindViewById3, "findViewById(R.id.iv_avatar)");
        setIvAvatar((QMUIRadiusImageView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_name);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_name)");
        setTvName((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.tv_state);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_state)");
        setTvState((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.vg_dan);
        f0.o(viewFindViewById6, "findViewById(R.id.vg_dan)");
        setVgDan((FrameLayout) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.iv_dan_icon);
        f0.o(viewFindViewById7, "findViewById(R.id.iv_dan_icon)");
        setIvDanIcon((ImageView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.tv_dan_number);
        f0.o(viewFindViewById8, "findViewById(R.id.tv_dan_number)");
        setTvDanNumber((TextView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.iv_heybox_avatar);
        f0.o(viewFindViewById9, "findViewById(R.id.iv_heybox_avatar)");
        setIvHeyboxAvatar((QMUIRadiusImageView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.tv_heybox_name);
        f0.o(viewFindViewById10, "findViewById(R.id.tv_heybox_name)");
        setTvHeyboxName((TextView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.tv_invite);
        f0.o(viewFindViewById11, "findViewById(R.id.tv_invite)");
        setTvInvite((TextView) viewFindViewById11);
        View viewFindViewById12 = findViewById(R.id.vg_user);
        f0.o(viewFindViewById12, "findViewById(R.id.vg_user)");
        setVgUser((ViewGroup) viewFindViewById12);
        View viewFindViewById13 = findViewById(R.id.iv_authentication);
        f0.o(viewFindViewById13, "findViewById(R.id.iv_authentication)");
        setIvAuthentication((ImageView) viewFindViewById13);
        getTvInvite().setBackground(q.o(getContext(), R.color.white_alpha8, 3.0f));
    }

    public final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37143, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getTvRank().getLayoutParams();
        layoutParams.width = ViewUtils.f(getContext(), 12.0f);
        getTvRank().setLayoutParams(layoutParams);
        getTvRank().setVisibility(4);
    }

    @dl.d
    public final View getDiv() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37114, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f87073b;
        if (view != null) {
            return view;
        }
        f0.S(com.google.android.exoplayer2.text.ttml.d.f49801q);
        return null;
    }

    @dl.d
    public final ImageView getIvAuthentication() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37138, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87085n;
        if (imageView != null) {
            return imageView;
        }
        f0.S("ivAuthentication");
        return null;
    }

    @dl.d
    public final QMUIRadiusImageView getIvAvatar() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37118, new Class[0], QMUIRadiusImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (QMUIRadiusImageView) patchProxyResultProxy.result;
        }
        QMUIRadiusImageView qMUIRadiusImageView = this.f87075d;
        if (qMUIRadiusImageView != null) {
            return qMUIRadiusImageView;
        }
        f0.S("ivAvatar");
        return null;
    }

    @dl.d
    public final ImageView getIvDanIcon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37126, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87079h;
        if (imageView != null) {
            return imageView;
        }
        f0.S("ivDanIcon");
        return null;
    }

    @dl.d
    public final QMUIRadiusImageView getIvHeyboxAvatar() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37130, new Class[0], QMUIRadiusImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (QMUIRadiusImageView) patchProxyResultProxy.result;
        }
        QMUIRadiusImageView qMUIRadiusImageView = this.f87081j;
        if (qMUIRadiusImageView != null) {
            return qMUIRadiusImageView;
        }
        f0.S("ivHeyboxAvatar");
        return null;
    }

    @dl.d
    public final TextView getTvDanNumber() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37128, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87080i;
        if (textView != null) {
            return textView;
        }
        f0.S("tvDanNumber");
        return null;
    }

    @dl.d
    public final TextView getTvHeyboxName() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37132, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87082k;
        if (textView != null) {
            return textView;
        }
        f0.S("tvHeyboxName");
        return null;
    }

    @dl.d
    public final TextView getTvInvite() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37134, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87083l;
        if (textView != null) {
            return textView;
        }
        f0.S("tvInvite");
        return null;
    }

    @dl.d
    public final TextView getTvName() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37120, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87076e;
        if (textView != null) {
            return textView;
        }
        f0.S("tvName");
        return null;
    }

    @dl.d
    public final TextView getTvRank() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37116, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87074c;
        if (textView != null) {
            return textView;
        }
        f0.S("tvRank");
        return null;
    }

    @dl.d
    public final TextView getTvState() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37122, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87077f;
        if (textView != null) {
            return textView;
        }
        f0.S("tvState");
        return null;
    }

    @dl.d
    public final FrameLayout getVgDan() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37124, new Class[0], FrameLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (FrameLayout) patchProxyResultProxy.result;
        }
        FrameLayout frameLayout = this.f87078g;
        if (frameLayout != null) {
            return frameLayout;
        }
        f0.S("vgDan");
        return null;
    }

    @dl.d
    public final ViewGroup getVgUser() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37136, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f87084m;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vgUser");
        return null;
    }

    public final void setData(@e Dota2UserObj dota2UserObj) {
        if (PatchProxy.proxy(new Object[]{dota2UserObj}, this, changeQuickRedirect, false, 37141, new Class[]{Dota2UserObj.class}, Void.TYPE).isSupported || dota2UserObj == null) {
            return;
        }
        com.max.hbimage.b.L(dota2UserObj.getAvatar(), getIvAvatar(), R.drawable.common_default_game_avatar_74x74);
        getTvName().setText(dota2UserObj.getName());
        if (com.max.hbcommon.utils.c.u(dota2UserObj.getOnline_state_desc())) {
            getTvState().setVisibility(8);
        } else {
            getTvState().setVisibility(0);
            getTvState().setText(dota2UserObj.getOnline_state_desc());
            getTvState().setTextColor(d.e1(dota2UserObj.getOnline_state_color()));
        }
        MMRInfo mmr_info = dota2UserObj.getMmr_info();
        com.max.hbimage.b.K(mmr_info != null ? mmr_info.getDan_icon() : null, getIvDanIcon());
        TextView tvDanNumber = getTvDanNumber();
        MMRInfo mmr_info2 = dota2UserObj.getMmr_info();
        tvDanNumber.setText(mmr_info2 != null ? mmr_info2.getDan_value() : null);
        TextView tvRank = getTvRank();
        tvRank.setText(dota2UserObj.getSerial_number());
        int iQ = n.q(dota2UserObj.getSerial_number());
        if (iQ == 1) {
            tvRank.setTextColor(d.F(tvRank.getContext(), R.color.white));
            tvRank.setShadowLayer(ViewUtils.f(tvRank.getContext(), 6.0f), 0.0f, ViewUtils.f(tvRank.getContext(), 1.0f), d.F(tvRank.getContext(), R.color.white));
        } else if (iQ == 2) {
            tvRank.setTextColor(d.F(tvRank.getContext(), R.color.white_alpha80));
            tvRank.setShadowLayer(ViewUtils.f(tvRank.getContext(), 6.0f), 0.0f, ViewUtils.f(tvRank.getContext(), 1.0f), d.F(tvRank.getContext(), R.color.white_alpha60));
        } else if (iQ != 3) {
            tvRank.setTextColor(d.F(tvRank.getContext(), R.color.white_alpha60));
            tvRank.setShadowLayer(0.0f, 0.0f, 0.0f, d.F(tvRank.getContext(), R.color.transparent));
        } else {
            tvRank.setTextColor(d.F(tvRank.getContext(), R.color.white_alpha70));
            tvRank.setShadowLayer(ViewUtils.f(tvRank.getContext(), 6.0f), 0.0f, ViewUtils.f(tvRank.getContext(), 1.0f), d.F(tvRank.getContext(), R.color.white_alpha40));
        }
        getIvAuthentication().setVisibility(com.max.hbcommon.utils.c.x(dota2UserObj.is_verified()) ? 0 : 8);
        if (dota2UserObj.getHeybox_info() != null) {
            getVgUser().setVisibility(0);
            getTvInvite().setVisibility(8);
            HeyBoxUserObj heybox_info = dota2UserObj.getHeybox_info();
            com.max.hbimage.b.K(heybox_info != null ? heybox_info.getAvatar() : null, getIvHeyboxAvatar());
            TextView tvHeyboxName = getTvHeyboxName();
            HeyBoxUserObj heybox_info2 = dota2UserObj.getHeybox_info();
            tvHeyboxName.setText(heybox_info2 != null ? heybox_info2.getName() : null);
            getVgUser().setOnClickListener(new a(dota2UserObj));
        } else {
            getVgUser().setVisibility(8);
            getTvInvite().setVisibility(0);
            getTvInvite().setOnClickListener(new b());
        }
        setOnClickListener(new c(dota2UserObj));
    }

    public final void setDiv(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37115, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f87073b = view;
    }

    public final void setIvAuthentication(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37139, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87085n = imageView;
    }

    public final void setIvAvatar(@dl.d QMUIRadiusImageView qMUIRadiusImageView) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView}, this, changeQuickRedirect, false, 37119, new Class[]{QMUIRadiusImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(qMUIRadiusImageView, "<set-?>");
        this.f87075d = qMUIRadiusImageView;
    }

    public final void setIvDanIcon(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37127, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87079h = imageView;
    }

    public final void setIvHeyboxAvatar(@dl.d QMUIRadiusImageView qMUIRadiusImageView) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView}, this, changeQuickRedirect, false, 37131, new Class[]{QMUIRadiusImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(qMUIRadiusImageView, "<set-?>");
        this.f87081j = qMUIRadiusImageView;
    }

    public final void setLightStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37142, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getDiv().setBackgroundResource(R.color.divider_secondary_1_color);
        getTvName().setTextColor(d.E(R.color.text_primary_1_color));
        getTvHeyboxName().setTextColor(d.E(R.color.text_primary_1_color));
        getTvInvite().setTextColor(d.E(R.color.text_primary_1_color));
        getTvRank().setTextColor(d.E(R.color.text_primary_1_color));
        getTvDanNumber().setTextColor(d.E(R.color.text_primary_1_color));
        getTvInvite().setBackground(q.o(getContext(), R.color.divider_secondary_1_color, 3.0f));
    }

    public final void setTvDanNumber(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37129, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87080i = textView;
    }

    public final void setTvHeyboxName(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37133, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87082k = textView;
    }

    public final void setTvInvite(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37135, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87083l = textView;
    }

    public final void setTvName(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37121, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87076e = textView;
    }

    public final void setTvRank(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37117, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87074c = textView;
    }

    public final void setTvState(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37123, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87077f = textView;
    }

    public final void setVgDan(@dl.d FrameLayout frameLayout) {
        if (PatchProxy.proxy(new Object[]{frameLayout}, this, changeQuickRedirect, false, 37125, new Class[]{FrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(frameLayout, "<set-?>");
        this.f87078g = frameLayout;
    }

    public final void setVgUser(@dl.d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 37137, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f87084m = viewGroup;
    }
}
