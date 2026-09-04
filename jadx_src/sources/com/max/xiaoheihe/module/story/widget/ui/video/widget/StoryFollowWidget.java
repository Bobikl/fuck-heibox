package com.max.xiaoheihe.module.story.widget.ui.video.widget;

import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j0;
import com.max.hbstory.bean.StoryBBSUserInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.bean.StoryStatInfoObj;
import com.max.hbstory.g;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.view.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.zh0;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;
import yh.l;

/* JADX INFO: compiled from: StoryFollowWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class StoryFollowWidget extends FrameLayout implements com.max.hbstory.viewpage2.video.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f92286h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final zh0 f92287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private com.max.hbstory.d f92288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f92289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f92290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f92291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final View.OnClickListener f92292g;

    /* JADX INFO: compiled from: StoryFollowWidget.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f92294c;

        a(Context context) {
            this.f92294c = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            StoryLinkCardInfoObj link_card_info;
            StoryStatInfoObj stat_info;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44183, new Class[]{View.class}, Void.TYPE).isSupported || StoryFollowWidget.this.f92290e || !i0.e(this.f92294c)) {
                return;
            }
            StoryFollowWidget storyFollowWidget = StoryFollowWidget.this;
            StoryItemsObj storyItemsObjN = StoryUtilsKt.n(storyFollowWidget, storyFollowWidget.getMPosition());
            if (storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null || (stat_info = link_card_info.getStat_info()) == null) {
                return;
            }
            StoryFollowWidget.g(StoryFollowWidget.this, String.valueOf(stat_info.getFollow_status()));
        }
    }

    /* JADX INFO: compiled from: StoryFollowWidget.kt */
    public static final class b implements j0<g.b> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(g.b bVar) {
            if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 44185, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bVar);
        }

        public final void b(g.b bVar) {
            StoryLinkCardInfoObj link_card_info;
            StoryLinkCardInfoObj link_card_info2;
            StoryBBSUserInfoObj user_info;
            if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 44184, new Class[]{g.b.class}, Void.TYPE).isSupported) {
                return;
            }
            StoryFollowWidget storyFollowWidget = StoryFollowWidget.this;
            StoryItemsObj storyItemsObjN = StoryUtilsKt.n(storyFollowWidget, storyFollowWidget.getMPosition());
            StoryStatInfoObj stat_info = null;
            stat_info = null;
            String userid = (storyItemsObjN == null || (link_card_info2 = storyItemsObjN.getLink_card_info()) == null || (user_info = link_card_info2.getUser_info()) == null) ? null : user_info.getUserid();
            if (!i0.q(userid) && f0.g(bVar.e(), userid)) {
                StoryFollowWidget storyFollowWidget2 = StoryFollowWidget.this;
                StoryItemsObj storyItemsObjN2 = StoryUtilsKt.n(storyFollowWidget2, storyFollowWidget2.getMPosition());
                if (storyItemsObjN2 != null && (link_card_info = storyItemsObjN2.getLink_card_info()) != null) {
                    stat_info = link_card_info.getStat_info();
                }
                if (stat_info != null) {
                    stat_info.setFollow_status(bVar.f() ? 1 : 0);
                }
                if (bVar.f()) {
                    StoryFollowWidget.h(StoryFollowWidget.this);
                } else {
                    StoryFollowWidget.i(StoryFollowWidget.this);
                }
            }
        }
    }

    /* JADX INFO: compiled from: StoryFollowWidget.kt */
    public static final class c implements m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f92297b;

        c(String str) {
            this.f92297b = str;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 44187, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
            StoryFollowWidget.j(StoryFollowWidget.this, this.f92297b);
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 44186, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: StoryFollowWidget.kt */
    public static final class d implements m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f92299b;

        d(String str) {
            this.f92299b = str;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 44189, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
            StoryFollowWidget.j(StoryFollowWidget.this, this.f92299b);
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 44188, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryFollowWidget(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryFollowWidget(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryFollowWidget(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        zh0 zh0VarB = zh0.b(LayoutInflater.from(context), this);
        f0.o(zh0VarB, "inflate(LayoutInflater.from(context), this)");
        this.f92287b = zh0VarB;
        this.f92289d = -1;
        this.f92292g = new a(context);
    }

    public /* synthetic */ StoryFollowWidget(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final /* synthetic */ void a(StoryFollowWidget storyFollowWidget) {
        if (PatchProxy.proxy(new Object[]{storyFollowWidget}, null, changeQuickRedirect, true, 44173, new Class[]{StoryFollowWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyFollowWidget.l();
    }

    public static final /* synthetic */ void d(StoryFollowWidget storyFollowWidget, boolean z10, String str) {
        if (PatchProxy.proxy(new Object[]{storyFollowWidget, new Byte(z10 ? (byte) 1 : (byte) 0), str}, null, changeQuickRedirect, true, 44176, new Class[]{StoryFollowWidget.class, Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        storyFollowWidget.p(z10, str);
    }

    public static final /* synthetic */ void g(StoryFollowWidget storyFollowWidget, String str) {
        if (PatchProxy.proxy(new Object[]{storyFollowWidget, str}, null, changeQuickRedirect, true, 44178, new Class[]{StoryFollowWidget.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        storyFollowWidget.r(str);
    }

    public static final /* synthetic */ void h(StoryFollowWidget storyFollowWidget) {
        if (PatchProxy.proxy(new Object[]{storyFollowWidget}, null, changeQuickRedirect, true, 44177, new Class[]{StoryFollowWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyFollowWidget.s();
    }

    public static final /* synthetic */ void i(StoryFollowWidget storyFollowWidget) {
        if (PatchProxy.proxy(new Object[]{storyFollowWidget}, null, changeQuickRedirect, true, 44175, new Class[]{StoryFollowWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyFollowWidget.t();
    }

    public static final /* synthetic */ void j(StoryFollowWidget storyFollowWidget, String str) {
        if (PatchProxy.proxy(new Object[]{storyFollowWidget, str}, null, changeQuickRedirect, true, 44172, new Class[]{StoryFollowWidget.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        storyFollowWidget.v(str);
    }

    public static final /* synthetic */ void k(StoryFollowWidget storyFollowWidget, String str) {
        if (PatchProxy.proxy(new Object[]{storyFollowWidget, str}, null, changeQuickRedirect, true, 44174, new Class[]{StoryFollowWidget.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        storyFollowWidget.w(str);
    }

    private final void l() {
        this.f92290e = false;
    }

    private final void m(final String str) {
        com.max.hbstory.c cVarC;
        StoryItemsObj storyItemsObjM;
        StoryLinkCardInfoObj link_card_info;
        StoryBBSUserInfoObj user_info;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44161, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        String h_src = null;
        final String userid = (storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null || (user_info = link_card_info.getUser_info()) == null) ? null : user_info.getUserid();
        if (userid != null) {
            u();
            com.max.hbstory.d mStoryContext = getMStoryContext();
            if (mStoryContext == null || (cVarC = mStoryContext.c()) == null) {
                return;
            }
            com.max.hbstory.d mStoryContext2 = getMStoryContext();
            if (mStoryContext2 != null && (storyItemsObjM = StoryUtilsKt.m(mStoryContext2, getMPosition())) != null) {
                h_src = storyItemsObjM.getH_src();
            }
            cVarC.g(userid, h_src, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryFollowWidget$follow$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44180, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44179, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    StoryFollowWidget.a(this.f92300b);
                    StoryFollowWidget.k(this.f92300b, str);
                    StoryFollowWidget.h(this.f92300b);
                    StoryFollowWidget.d(this.f92300b, true, userid);
                }
            }, new l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryFollowWidget$follow$2
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 44182, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@d Throwable it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44181, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    StoryFollowWidget.a(this.f92303b);
                    StoryFollowWidget.i(this.f92303b);
                }
            });
        }
    }

    private final String n(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44158, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!f0.g("0", str)) {
            if (f0.g("1", str)) {
                return "0";
            }
            if (f0.g("2", str)) {
                return "3";
            }
            if (f0.g("3", str)) {
                return "2";
            }
        }
        return "1";
    }

    private final void o(int i10) {
        StoryLinkCardInfoObj link_card_info;
        StoryStatInfoObj stat_info;
        StoryLinkCardInfoObj link_card_info2;
        StoryBBSUserInfoObj user_info;
        String userid;
        int follow_status = 0;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44165, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, i10);
        if (storyItemsObjN != null && (link_card_info2 = storyItemsObjN.getLink_card_info()) != null && (user_info = link_card_info2.getUser_info()) != null && (userid = user_info.getUserid()) != null) {
            if (!i0.q(userid)) {
                userid = null;
            }
            if (userid != null) {
                zh0 zh0VarMo41getCoreViewBinding = mo41getCoreViewBinding();
                TextView storyUnfollowTextView = zh0VarMo41getCoreViewBinding.f118377c;
                f0.o(storyUnfollowTextView, "storyUnfollowTextView");
                TextView storyFollowedTextView = zh0VarMo41getCoreViewBinding.f118376b;
                f0.o(storyFollowedTextView, "storyFollowedTextView");
                com.max.xiaoheihe.module.story.d.a(storyUnfollowTextView, storyFollowedTextView);
                return;
            }
        }
        StoryItemsObj storyItemsObjN2 = StoryUtilsKt.n(this, i10);
        if (storyItemsObjN2 != null && (link_card_info = storyItemsObjN2.getLink_card_info()) != null && (stat_info = link_card_info.getStat_info()) != null) {
            follow_status = stat_info.getFollow_status();
        }
        if (f0.g(String.valueOf(follow_status), "0")) {
            t();
        } else if (f0.g(String.valueOf(follow_status), "1") || f0.g(String.valueOf(follow_status), "2") || f0.g(String.valueOf(follow_status), "3")) {
            s();
        }
    }

    private final void p(boolean z10, String str) {
        g gVarQ;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 44160, new Class[]{Boolean.TYPE, String.class}, Void.TYPE).isSupported || (gVarQ = StoryUtilsKt.q(this)) == null) {
            return;
        }
        gVarQ.a0(new g.b(z10, str));
    }

    private final void q(g gVar) {
        com.max.hbstory.d mStoryContext;
        Fragment fragmentB;
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 44168, new Class[]{g.class}, Void.TYPE).isSupported || gVar == null || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null) {
            return;
        }
        gVar.L().k(fragmentB, new b());
    }

    private final void r(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44157, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        String strN = n(str);
        if (f0.g("0", str)) {
            m(strN);
            return;
        }
        if (f0.g("2", str)) {
            m(strN);
        } else if (f0.g("1", str)) {
            com.max.xiaoheihe.view.l.D(getContext(), com.max.xiaoheihe.utils.d.n0(R.string.cancel_follow_user_confirm), "", com.max.xiaoheihe.utils.d.n0(R.string.confirm), com.max.xiaoheihe.utils.d.n0(R.string.cancel), new c(strN));
        } else if (f0.g("3", str)) {
            com.max.xiaoheihe.view.l.D(getContext(), com.max.xiaoheihe.utils.d.n0(R.string.cancel_follow_user_confirm), "", com.max.xiaoheihe.utils.d.n0(R.string.confirm), com.max.xiaoheihe.utils.d.n0(R.string.cancel), new d(strN));
        }
    }

    private final void s() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44156, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        zh0 zh0VarMo41getCoreViewBinding = mo41getCoreViewBinding();
        TextView storyFollowedTextView = zh0VarMo41getCoreViewBinding.f118376b;
        f0.o(storyFollowedTextView, "storyFollowedTextView");
        com.max.xiaoheihe.module.story.d.c(storyFollowedTextView);
        TextView storyUnfollowTextView = zh0VarMo41getCoreViewBinding.f118377c;
        f0.o(storyUnfollowTextView, "storyUnfollowTextView");
        com.max.xiaoheihe.module.story.d.a(storyUnfollowTextView);
    }

    private final void t() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44163, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        zh0 zh0VarMo41getCoreViewBinding = mo41getCoreViewBinding();
        TextView storyUnfollowTextView = zh0VarMo41getCoreViewBinding.f118377c;
        f0.o(storyUnfollowTextView, "storyUnfollowTextView");
        com.max.xiaoheihe.module.story.d.c(storyUnfollowTextView);
        TextView storyFollowedTextView = zh0VarMo41getCoreViewBinding.f118376b;
        f0.o(storyFollowedTextView, "storyFollowedTextView");
        com.max.xiaoheihe.module.story.d.a(storyFollowedTextView);
    }

    private final void u() {
        this.f92290e = true;
    }

    private final void v(final String str) {
        com.max.hbstory.c cVarC;
        StoryItemsObj storyItemsObjM;
        StoryLinkCardInfoObj link_card_info;
        StoryBBSUserInfoObj user_info;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44159, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        String h_src = null;
        final String userid = (storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null || (user_info = link_card_info.getUser_info()) == null) ? null : user_info.getUserid();
        if (userid != null) {
            u();
            com.max.hbstory.d mStoryContext = getMStoryContext();
            if (mStoryContext == null || (cVarC = mStoryContext.c()) == null) {
                return;
            }
            com.max.hbstory.d mStoryContext2 = getMStoryContext();
            if (mStoryContext2 != null && (storyItemsObjM = StoryUtilsKt.m(mStoryContext2, getMPosition())) != null) {
                h_src = storyItemsObjM.getH_src();
            }
            cVarC.d(userid, h_src, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryFollowWidget$unfollow$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44191, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44190, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    StoryFollowWidget.a(this.f92304b);
                    StoryFollowWidget.k(this.f92304b, str);
                    StoryFollowWidget.i(this.f92304b);
                    StoryFollowWidget.d(this.f92304b, false, userid);
                }
            }, new l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryFollowWidget$unfollow$2
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 44193, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@d Throwable it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44192, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    StoryFollowWidget.a(this.f92307b);
                    StoryFollowWidget.h(this.f92307b);
                }
            });
        }
    }

    private final void w(String str) {
        StoryLinkCardInfoObj link_card_info;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44162, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        StoryStatInfoObj stat_info = (storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null) ? null : link_card_info.getStat_info();
        if (stat_info == null) {
            return;
        }
        stat_info.setFollow_status(Integer.parseInt(str));
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@dl.d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44155, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@dl.d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44164, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        setMStoryContext(storyContext);
        setMPosition(i10);
        o(i10);
        if (this.f92291f) {
            return;
        }
        this.f92291f = true;
        com.max.hbstory.d mStoryContext = getMStoryContext();
        q(mStoryContext != null ? mStoryContext.d() : null);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @dl.d
    /* JADX INFO: renamed from: getCoreViewBinding */
    public zh0 mo41getCoreViewBinding() {
        return this.f92287b;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    /* JADX INFO: renamed from: getCoreViewBinding */
    public /* bridge */ /* synthetic */ l3.c mo41getCoreViewBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44171, new Class[0], l3.c.class);
        return patchProxyResultProxy.isSupported ? (l3.c) patchProxyResultProxy.result : mo41getCoreViewBinding();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f92289d;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public com.max.hbstory.d getMStoryContext() {
        return this.f92288c;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44170, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44166, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        setOnClickListener(this.f92292g);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44167, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOnClickListener(null);
        super.onDetachedFromWindow();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f92289d = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e com.max.hbstory.d dVar) {
        this.f92288c = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44169, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(0);
    }
}
