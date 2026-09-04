package com.max.xiaoheihe.module.bbs.post.ui.fragments;

import android.app.Activity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebExtraObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.ForbidInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.module.account.WriteFeedbackActivity;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: PostForbidFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class a extends PostCommentFragment {

    @dl.d
    public static final C0705a Z = new C0705a(null);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f81967a0 = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean Y = true;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post.ui.fragments.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PostForbidFragment.kt */
    public static final class C0705a {
        private C0705a() {
        }

        public /* synthetic */ C0705a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: PostForbidFragment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29167, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WebExtraObj webExtraObj = new WebExtraObj();
            webExtraObj.setChooseTopic("1");
            a aVar = a.this;
            aVar.startActivity(WriteFeedbackActivity.u2(((com.max.hbcommon.base.d) aVar).mContext, "0", "0", null, webExtraObj));
        }
    }

    /* JADX INFO: compiled from: PostForbidFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ForbidInfoObj f81969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f81970c;

        c(ForbidInfoObj forbidInfoObj, a aVar) {
            this.f81969b = forbidInfoObj;
            this.f81970c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29168, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            KeyDescObj violated_rule = this.f81969b.getViolated_rule();
            String protocol = violated_rule != null ? violated_rule.getProtocol() : null;
            if (com.max.hbcommon.utils.c.u(protocol)) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) this.f81970c).mContext;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.k0(mContext, protocol);
        }
    }

    /* JADX INFO: compiled from: PostForbidFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f81972c;

        d(BBSUserInfoObj bBSUserInfoObj) {
            this.f81972c = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29169, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) a.this).mContext;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.T(mContext, this.f81972c.getUserid()).A();
        }
    }

    private final void m7() {
        View viewP5;
        char c10;
        String reason;
        String string;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29153, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        if (linkInfoObjD4.getForbid_info() == null || (viewP5 = P5()) == null) {
            return;
        }
        View viewFindViewById = viewP5.findViewById(R.id.tv_forbid_reason);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = viewP5.findViewById(R.id.iv_player_img);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById2;
        View viewFindViewById3 = viewP5.findViewById(R.id.tv_user_name);
        f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewP5.findViewById(R.id.tv_feedback);
        f0.n(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewP5.findViewById(R.id.rl_medal_level);
        f0.n(viewFindViewById5, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) viewFindViewById5;
        View viewFindViewById6 = viewP5.findViewById(R.id.tv_time);
        f0.n(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewP5.findViewById(R.id.tv_desc);
        f0.n(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) viewFindViewById7;
        View viewFindViewById8 = viewP5.findViewById(R.id.tv_forbid_comment);
        f0.n(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView6 = (TextView) viewFindViewById8;
        View viewFindViewById9 = viewP5.findViewById(R.id.vg_violated_rule);
        View viewFindViewById10 = viewP5.findViewById(R.id.tv_violated_rule);
        f0.n(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView7 = (TextView) viewFindViewById10;
        LinkInfoObj linkInfoObjD5 = d4();
        ForbidInfoObj forbid_info = linkInfoObjD5 != null ? linkInfoObjD5.getForbid_info() : null;
        String duration = forbid_info != null ? forbid_info.getDuration() : null;
        v0 v0Var = v0.f124986a;
        String string2 = getString(R.string.forbid_reason_format);
        f0.o(string2, "getString(R.string.forbid_reason_format)");
        Object[] objArr = new Object[2];
        if (forbid_info != null) {
            reason = forbid_info.getReason();
            c10 = 0;
        } else {
            c10 = 0;
            reason = null;
        }
        objArr[c10] = reason;
        objArr[1] = duration;
        String str = String.format(string2, Arrays.copyOf(objArr, 2));
        f0.o(str, "format(format, *args)");
        SpannableString spannableString = new SpannableString(str);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(R.color.badge_bg_color));
        int length = spannableString.length();
        if (duration == null) {
            duration = "";
        }
        spannableString.setSpan(foregroundColorSpan, length - duration.length(), spannableString.length(), 33);
        textView.setText(spannableString);
        LinkInfoObj linkInfoObjD6 = d4();
        f0.m(linkInfoObjD6);
        BBSUserInfoObj user = linkInfoObjD6.getUser();
        if (user != null) {
            com.max.hbimage.b.I(user.getAvartar(), imageView, R.drawable.common_default_avatar_40x40);
            textView2.setText(com.max.xiaoheihe.utils.d.M1(user.getUsername()));
            com.max.xiaoheihe.utils.d.j1(relativeLayout, user);
            d dVar = new d(user);
            imageView.setOnClickListener(dVar);
            textView2.setOnClickListener(dVar);
            textView4.setOnClickListener(dVar);
            if (f0.g(user.getUserid(), i0.j())) {
                textView3.setVisibility(0);
                textView3.setOnClickListener(new b());
            } else {
                textView3.setVisibility(0);
            }
        } else {
            textView3.setVisibility(8);
        }
        LinkInfoObj linkInfoObjD7 = d4();
        f0.m(linkInfoObjD7);
        textView4.setText(linkInfoObjD7.getPost_at());
        LinkInfoObj linkInfoObjD8 = d4();
        f0.m(linkInfoObjD8);
        textView5.setText(linkInfoObjD8.getDescription());
        if (com.max.hbcommon.utils.c.u(forbid_info != null ? forbid_info.getComment() : null)) {
            string = getString(R.string.not_have);
        } else {
            string = forbid_info != null ? forbid_info.getComment() : null;
        }
        String string3 = getString(R.string.forbid_comment_format);
        f0.o(string3, "getString(R.string.forbid_comment_format)");
        String str2 = String.format(string3, Arrays.copyOf(new Object[]{string}, 1));
        f0.o(str2, "format(format, *args)");
        textView6.setText(str2);
        f0.m(forbid_info);
        if (forbid_info.getViolated_rule() == null) {
            viewFindViewById9.setVisibility(8);
            return;
        }
        viewFindViewById9.setVisibility(0);
        textView7.setText(forbid_info.getViolated_rule().getDesc());
        textView7.setOnClickListener(new c(forbid_info, this));
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void A4(@e Result<BBSLinkTreeObj> result) {
        if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29166, new Class[]{Result.class}, Void.TYPE).isSupported && isActive()) {
            super.A4(result);
            if (result != null) {
                if (this.Y || r4()) {
                    this.Y = false;
                    G4(false);
                    m7();
                    n5();
                    l5();
                    h5();
                    j5();
                    kf.a aVarG4 = g4();
                    if (aVarG4 != null) {
                        aVarG4.p1();
                    }
                }
            }
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void B4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29155, new Class[0], Void.TYPE).isSupported || !i0.e(this.mContext) || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        String str = f0.g("2", linkInfoObjD4.getIs_award_link()) ? "0" : "2";
        o5(str);
        m5(str);
        LinkInfoObj linkInfoObjD5 = d4();
        f0.m(linkInfoObjD5);
        Q3(linkInfoObjD5.getLinkid(), str);
        T3("syncWeb('award')");
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void C4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29154, new Class[0], Void.TYPE).isSupported || !i0.e(this.mContext) || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        String str = f0.g("1", linkInfoObjD4.getIs_award_link()) ? "0" : "1";
        o5(str);
        m5(str);
        LinkInfoObj linkInfoObjD5 = d4();
        f0.m(linkInfoObjD5);
        Q3(linkInfoObjD5.getLinkid(), str);
        T3("syncWeb('award')");
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void U3(@e String str, @e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29156, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        i5(str);
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        String linkid = linkInfoObjD4.getLinkid();
        f0.m(str);
        V3(linkid, null, str);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void h5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29161, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        i5(linkInfoObjD4.getIs_favour());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void i5(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29162, new Class[]{String.class}, Void.TYPE).isSupported || g4() == null) {
            return;
        }
        kf.a aVarG4 = g4();
        f0.m(aVarG4);
        aVarG4.y(str);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment, com.max.hbcommon.base.d
    public void installViews(@e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29151, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        O4("page_style_post");
        R6(this.mInflater.inflate(R.layout.item_forbid_post_content, (ViewGroup) E5().f112942c, false));
        E5().f112942c.addView(P5(), 0, new ConsecutiveScrollerLayout.LayoutParams(-1, -2));
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29164, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        k5(linkInfoObjD4.getFollow_status());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void k5(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29165, new Class[]{String.class}, Void.TYPE).isSupported || g4() == null || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        if (linkInfoObjD4.getUser() != null) {
            kf.a aVarG4 = g4();
            f0.m(aVarG4);
            LinkInfoObj linkInfoObjD5 = d4();
            f0.m(linkInfoObjD5);
            aVarG4.r1(linkInfoObjD5.getUser(), str);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void l5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29159, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        m5(linkInfoObjD4.getIs_award_link());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void m5(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29160, new Class[]{String.class}, Void.TYPE).isSupported || g4() == null) {
            return;
        }
        kf.a aVarG4 = g4();
        f0.m(aVarG4);
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        aVarG4.M2(str, linkInfoObjD4.getLink_award_num());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void n5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29157, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        o5(linkInfoObjD4.getIs_award_link());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void o5(@e String str) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29158, new Class[]{String.class}, Void.TYPE).isSupported || (aVarG4 = g4()) == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        aVarG4.v(str, linkInfoObjD4 != null ? linkInfoObjD4.getLink_award_num() : null);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment
    public void x6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29152, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.x6();
        getArguments();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void y4(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29163, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (d4() != null) {
            LinkInfoObj linkInfoObjD4 = d4();
            f0.m(linkInfoObjD4);
            linkInfoObjD4.setIs_favour(str);
            h5();
        }
        if (g4() == null || !f0.g("1", str)) {
            return;
        }
        kf.a aVarG4 = g4();
        f0.m(aVarG4);
        aVarG4.l("action_favour", true);
    }
}
