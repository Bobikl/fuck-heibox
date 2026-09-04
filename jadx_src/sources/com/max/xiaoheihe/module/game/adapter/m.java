package com.max.xiaoheihe.module.game.adapter;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.Glide;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.hbshare.bean.PostOptionObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.module.account.SendToFriendActivity;
import com.max.xiaoheihe.module.bbs.ReportReasonFragment;
import com.max.xiaoheihe.module.bbs.post.ui.FloatingLikeLottieAnimation;
import com.max.xiaoheihe.module.game.component.GameCommentLikeDislikeHappyView;
import com.max.xiaoheihe.module.game.component.GameDetailComment;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;

/* JADX INFO: compiled from: GameCommentsAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public class m extends com.max.hbcommon.base.adapter.s<LinkInfoObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f85712j = "分享";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f85713k = "私信好友";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f85714l = "编辑";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static String f85715m = "推荐";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String f85716n = "举报";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String f85717o = "删除";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BaseActivity f85718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f85719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f85720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f85721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private FloatingLikeLottieAnimation.a f85722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private FloatingLikeLottieAnimation.a f85723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference<LinearLayout> f85724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakReference<LinearLayout> f85725i;

    /* JADX INFO: compiled from: GameCommentsAdapter.java */
    public class a extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35564, new Class[]{Result.class}, Void.TYPE).isSupported && m.this.f85718b.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(m.this.f85718b.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35565, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: GameCommentsAdapter.java */
    public class b implements GameCommentLikeDislikeHappyView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GameDetailComment f85727a;

        b(GameDetailComment gameDetailComment) {
            this.f85727a = gameDetailComment;
        }

        @Override // com.max.xiaoheihe.module.game.component.GameCommentLikeDislikeHappyView.a
        public void a(@n0 LinkInfoObj linkInfoObj) {
            if (PatchProxy.proxy(new Object[]{linkInfoObj}, this, changeQuickRedirect, false, 35563, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (m.this.f85723g != null) {
                m.this.f85723g.a();
                m.this.f85723g = null;
            }
            if (m.this.f85718b == null || !com.max.hbcommon.utils.c.x(linkInfoObj.getUser_support_state().is_happy()) || com.max.hbcommon.utils.c.u(m.this.f85720d)) {
                return;
            }
            ShineButton shineButton = this.f85727a.f86688s.f86659d.f80881k;
            m mVar = m.this;
            m.w(mVar, mVar.f85720d, shineButton, R.drawable.expression_cube_huaji, false);
        }

        @Override // com.max.xiaoheihe.module.game.component.GameCommentLikeDislikeHappyView.a
        public void b(@n0 LinkInfoObj linkInfoObj) {
        }

        @Override // com.max.xiaoheihe.module.game.component.GameCommentLikeDislikeHappyView.a
        public void c(@n0 LinkInfoObj linkInfoObj) {
            if (PatchProxy.proxy(new Object[]{linkInfoObj}, this, changeQuickRedirect, false, 35562, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (m.this.f85722f != null) {
                m.this.f85722f.a();
                m.this.f85722f = null;
            }
            if (m.this.f85718b == null || !com.max.hbcommon.utils.c.x(linkInfoObj.getUser_support_state().is_up()) || com.max.hbcommon.utils.c.u(m.this.f85720d)) {
                return;
            }
            ShineButton shineButton = this.f85727a.f86688s.f86657b.f80881k;
            m mVar = m.this;
            m.w(mVar, mVar.f85720d, shineButton, R.drawable.expression_cube_zan, true);
        }
    }

    /* JADX INFO: compiled from: GameCommentsAdapter.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f85729b;

        c(LinkInfoObj linkInfoObj) {
            this.f85729b = linkInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35566, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            view.setVisibility(8);
            int iIndexOf = m.this.getDataList().indexOf(this.f85729b);
            int size = this.f85729b.getCustom_collapse_game_comments().size();
            int i10 = iIndexOf + 1;
            m.this.getDataList().addAll(i10, this.f85729b.getCustom_collapse_game_comments());
            this.f85729b.getCustom_collapse_game_comments().clear();
            m.this.notifyItemRangeInserted(i10, size);
        }
    }

    /* JADX INFO: compiled from: GameCommentsAdapter.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f85731b;

        d(LinkInfoObj linkInfoObj) {
            this.f85731b = linkInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35567, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            LinkInfoObj linkInfoObj = m.this.getDataList().get(0);
            if ("1".equals(linkInfoObj.getIs_top())) {
                linkInfoObj.setIs_top("0");
                m.this.notifyItemChanged(0);
            }
            if (com.max.hbcommon.utils.c.u(this.f85731b.getLinkid())) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.F(m.this.f85718b, this.f85731b.getH_src(), this.f85731b.getLinkid(), this.f85731b.getLink_tag(), this.f85731b.getHas_video(), null);
        }
    }

    /* JADX INFO: compiled from: GameCommentsAdapter.java */
    public class e implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f85735d;

        e(String str, String str2, LinkInfoObj linkInfoObj) {
            this.f85733b = str;
            this.f85734c = str2;
            this.f85735d = linkInfoObj;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35568, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            m.z(m.this, this.f85733b, this.f85734c, this.f85735d.getH_src(), this.f85735d.getUser().getAvatar(), this.f85735d.getDescription(), this.f85735d.getShare_url());
            return false;
        }
    }

    /* JADX INFO: compiled from: GameCommentsAdapter.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f85739d;

        f(String str, String str2, LinkInfoObj linkInfoObj) {
            this.f85737b = str;
            this.f85738c = str2;
            this.f85739d = linkInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35569, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            m.z(m.this, this.f85737b, this.f85738c, this.f85739d.getH_src(), this.f85739d.getUser().getAvatar(), this.f85739d.getDescription(), this.f85739d.getShare_url());
        }
    }

    /* JADX INFO: compiled from: GameCommentsAdapter.java */
    public class g extends com.bumptech.glide.request.target.e<Bitmap> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShineButton f85741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f85743d;

        g(ShineButton shineButton, String str, boolean z10) {
            this.f85741b = shineButton;
            this.f85742c = str;
            this.f85743d = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Rect e(Rect rect, Rect rect2, Rect rect3) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{rect, rect2, rect3}, this, changeQuickRedirect, false, 35575, new Class[]{Rect.class, Rect.class, Rect.class}, Rect.class);
            if (patchProxyResultProxy.isSupported) {
                return (Rect) patchProxyResultProxy.result;
            }
            LinearLayout linearLayout = m.this.f85724h != null ? (LinearLayout) m.this.f85724h.get() : null;
            if (linearLayout != null) {
                linearLayout.getGlobalVisibleRect(rect);
            }
            LinearLayout linearLayout2 = m.this.f85725i != null ? (LinearLayout) m.this.f85725i.get() : null;
            if (linearLayout2 != null) {
                linearLayout2.getGlobalVisibleRect(rect2);
            }
            rect3.set(-1, rect.bottom, -1, rect2.top);
            return rect3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ b2 f(ShineButton shineButton, FloatingLikeLottieAnimation.Builder builder) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{shineButton, builder}, null, changeQuickRedirect, true, 35574, new Class[]{ShineButton.class, FloatingLikeLottieAnimation.Builder.class}, b2.class);
            if (patchProxyResultProxy.isSupported) {
                return (b2) patchProxyResultProxy.result;
            }
            shineButton.setVisibility(4);
            shineButton.setChecked(true, false);
            return b2.f124493a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ b2 g(ShineButton shineButton, FloatingLikeLottieAnimation.Builder builder) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{shineButton, builder}, null, changeQuickRedirect, true, 35573, new Class[]{ShineButton.class, FloatingLikeLottieAnimation.Builder.class}, b2.class);
            if (patchProxyResultProxy.isSupported) {
                return (b2) patchProxyResultProxy.result;
            }
            shineButton.setVisibility(0);
            return b2.f124493a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ b2 h(ShineButton shineButton, FloatingLikeLottieAnimation.Builder builder) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{shineButton, builder}, null, changeQuickRedirect, true, 35572, new Class[]{ShineButton.class, FloatingLikeLottieAnimation.Builder.class}, b2.class);
            if (patchProxyResultProxy.isSupported) {
                return (b2) patchProxyResultProxy.result;
            }
            shineButton.setVisibility(0);
            return b2.f124493a;
        }

        @Override // com.bumptech.glide.request.target.p
        public void onLoadCleared(@p0 Drawable drawable) {
        }

        public void onResourceReady(@n0 Bitmap bitmap, @p0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            Bitmap bitmapA;
            if (PatchProxy.proxy(new Object[]{bitmap, fVar}, this, changeQuickRedirect, false, 35570, new Class[]{Bitmap.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported || !m.this.f85718b.isActive() || (bitmapA = m.A(m.this, bitmap, this.f85741b)) == null) {
                return;
            }
            final Rect rect = new Rect(0, 0, 0, 0);
            final Rect rect2 = new Rect(0, 0, 0, 0);
            final Rect rect3 = new Rect();
            FloatingLikeLottieAnimation.Builder builderV = new FloatingLikeLottieAnimation.Builder(m.this.f85718b).u(this.f85741b).A(bitmapA, "icon", true).F(this.f85742c).v(new yh.a() { // from class: com.max.xiaoheihe.module.game.adapter.n
                @Override // yh.a
                public final Object invoke() {
                    return this.f85752b.e(rect, rect2, rect3);
                }
            });
            final ShineButton shineButton = this.f85741b;
            FloatingLikeLottieAnimation.Builder builderO = builderV.O(new yh.l() { // from class: com.max.xiaoheihe.module.game.adapter.o
                @Override // yh.l
                public final Object invoke(Object obj) {
                    return m.g.f(shineButton, (FloatingLikeLottieAnimation.Builder) obj);
                }
            });
            final ShineButton shineButton2 = this.f85741b;
            FloatingLikeLottieAnimation.Builder builderM = builderO.M(new yh.l() { // from class: com.max.xiaoheihe.module.game.adapter.p
                @Override // yh.l
                public final Object invoke(Object obj) {
                    return m.g.g(shineButton2, (FloatingLikeLottieAnimation.Builder) obj);
                }
            });
            final ShineButton shineButton3 = this.f85741b;
            FloatingLikeLottieAnimation floatingLikeLottieAnimationA = builderM.P(new yh.l() { // from class: com.max.xiaoheihe.module.game.adapter.q
                @Override // yh.l
                public final Object invoke(Object obj) {
                    return m.g.h(shineButton3, (FloatingLikeLottieAnimation.Builder) obj);
                }
            }).a();
            if (this.f85743d) {
                m.this.f85722f = floatingLikeLottieAnimationA.g();
            } else {
                m.this.f85723g = floatingLikeLottieAnimationA.g();
            }
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, 35571, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            onResourceReady((Bitmap) obj, (com.bumptech.glide.request.transition.f<? super Bitmap>) fVar);
        }
    }

    /* JADX INFO: compiled from: GameCommentsAdapter.java */
    public class h implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f85745a;

        h(String str) {
            this.f85745a = str;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 35577, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            m.D(m.this, this.f85745a);
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 35576, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameCommentsAdapter.java */
    public class i implements ReportReasonFragment.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f85747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85748b;

        i(String str, String str2) {
            this.f85747a = str;
            this.f85748b = str2;
        }

        @Override // com.max.xiaoheihe.module.bbs.ReportReasonFragment.b
        public void a(@n0 String str, @p0 String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 35578, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.T(this.f85747a, str, str2, this.f85748b);
        }
    }

    /* JADX INFO: compiled from: GameCommentsAdapter.java */
    public class j extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85750b;

        j(String str) {
            this.f85750b = str;
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35579, new Class[]{Result.class}, Void.TYPE).isSupported && m.this.f85718b.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(m.this.f85718b.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                Iterator<LinkInfoObj> it = m.this.getDataList().iterator();
                while (it.hasNext()) {
                    if (this.f85750b.equals(it.next().getLinkid())) {
                        it.remove();
                        m.this.notifyDataSetChanged();
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35580, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: GameCommentsAdapter.java */
    public interface k {
        void a(String str);

        boolean b();

        void c();
    }

    public m(BaseActivity baseActivity, List<LinkInfoObj> list) {
        super(baseActivity, list, R.layout.item_game_comment);
        this.f85722f = null;
        this.f85723g = null;
        this.f85724h = null;
        this.f85725i = null;
        this.f85718b = baseActivity;
    }

    static /* synthetic */ Bitmap A(m mVar, Bitmap bitmap, ShineButton shineButton) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mVar, bitmap, shineButton}, null, changeQuickRedirect, true, 35560, new Class[]{m.class, Bitmap.class, ShineButton.class}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : mVar.M(bitmap, shineButton);
    }

    static /* synthetic */ void D(m mVar, String str) {
        if (PatchProxy.proxy(new Object[]{mVar, str}, null, changeQuickRedirect, true, 35561, new Class[]{m.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mVar.E(str);
    }

    private void E(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35547, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f85718b.V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().b3(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(String str, Dialog dialog, View view, ImageView imageView, TextView textView) {
        k kVar;
        if (PatchProxy.proxy(new Object[]{str, dialog, view, imageView, textView}, this, changeQuickRedirect, false, 35557, new Class[]{String.class, Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported || (kVar = this.f85721e) == null) {
            return;
        }
        kVar.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(String str, String str2, Dialog dialog, View view, ImageView imageView, TextView textView) {
        if (PatchProxy.proxy(new Object[]{str, str2, dialog, view, imageView, textView}, this, changeQuickRedirect, false, 35556, new Class[]{String.class, String.class, Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("link_id", str);
        com.max.hbcommon.analytics.d.d("4", lb.d.f131184j0, null, jsonObject);
        BaseActivity baseActivity = this.f85718b;
        baseActivity.startActivity(SendToFriendActivity.O.a(baseActivity, str2, "17"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(Dialog dialog, View view, ImageView imageView, TextView textView) {
        k kVar;
        if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 35555, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported || (kVar = this.f85721e) == null) {
            return;
        }
        kVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(String str, Dialog dialog, View view, ImageView imageView, TextView textView) {
        if (PatchProxy.proxy(new Object[]{str, dialog, view, imageView, textView}, this, changeQuickRedirect, false, 35554, new Class[]{String.class, Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        R(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(String str, Dialog dialog, View view, ImageView imageView, TextView textView) {
        if (PatchProxy.proxy(new Object[]{str, dialog, view, imageView, textView}, this, changeQuickRedirect, false, 35553, new Class[]{String.class, Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        BaseActivity baseActivity = this.f85718b;
        com.max.xiaoheihe.view.l.D(baseActivity, "", baseActivity.getString(R.string.del_post), this.f85718b.getString(R.string.confirm), this.f85718b.getString(R.string.cancel), new h(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(String str, String str2, Dialog dialog, View view, ImageView imageView, TextView textView) {
        if (!PatchProxy.proxy(new Object[]{str, str2, dialog, view, imageView, textView}, this, changeQuickRedirect, false, 35552, new Class[]{String.class, String.class, Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported && i0.e(this.f85718b)) {
            ReportReasonFragment.f80025u.a(new i(str, str2), ReportReasonFragment.ObjectType.link, null, str, null).show(this.f85718b.getSupportFragmentManager(), "ForbidReasonFragment");
        }
    }

    private Bitmap M(Bitmap bitmap, ShineButton shineButton) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, shineButton}, this, changeQuickRedirect, false, 35545, new Class[]{Bitmap.class, ShineButton.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        try {
            float f10 = ViewUtils.f(this.f85718b, 24.0f);
            float width = (bitmap.getWidth() / shineButton.getWidth()) * f10;
            float height = (bitmap.getHeight() / shineButton.getHeight()) * f10;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(0);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.translate(((width - bitmap.getWidth()) / 2.0f) - 2.0f, (height - bitmap.getHeight()) / 2.0f);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return Bitmap.createScaledBitmap(bitmapCreateBitmap, 72, 72, false);
        } catch (Exception e10) {
            com.max.heybox.hblog.g.G("[makeTargetAnimBitmap] error: " + e10);
            return null;
        }
    }

    private void R(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35548, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f85718b.V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().e1(str, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    private void U(String str, ShineButton shineButton, @androidx.annotation.v int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, shineButton, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35544, new Class[]{String.class, ShineButton.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        shineButton.setCancel();
        shineButton.A();
        Glide.I(this.f85718b).l().h(Integer.valueOf(i10)).z1(new g(shineButton, str, z10));
    }

    private void V(final String str, final String str2, final String str3, String str4, String str5, final String str6) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 35546, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.max.xiaoheihe.module.bbs.adapter.c.F(f85712j, R.drawable.bbs_sharebutton_share_46x46, new PostOptionObj.OnClickListener() { // from class: com.max.xiaoheihe.module.game.adapter.g
            @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
            public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
                this.f85699a.G(str2, dialog, view, imageView, textView);
            }
        }));
        arrayList.add(com.max.xiaoheihe.module.bbs.adapter.c.F(f85713k, R.drawable.bbs_sharebutton_private_chat_46x46, new PostOptionObj.OnClickListener() { // from class: com.max.xiaoheihe.module.game.adapter.h
            @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
            public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
                this.f85701a.H(str, str6, dialog, view, imageView, textView);
            }
        }));
        if (i0.q(str2)) {
            arrayList.add(com.max.xiaoheihe.module.bbs.adapter.c.F(f85714l, R.drawable.bbs_sharebutton_edit_tie_46x46, new PostOptionObj.OnClickListener() { // from class: com.max.xiaoheihe.module.game.adapter.i
                @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
                public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
                    this.f85704a.I(dialog, view, imageView, textView);
                }
            }));
        }
        if ("1".equals(i0.o().getPermission().getBbs_root_permission())) {
            arrayList.add(com.max.xiaoheihe.module.bbs.adapter.c.F(f85715m, R.drawable.bbs_sharebutton_hot_46x46, new PostOptionObj.OnClickListener() { // from class: com.max.xiaoheihe.module.game.adapter.j
                @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
                public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
                    this.f85705a.J(str, dialog, view, imageView, textView);
                }
            }));
        }
        if (i0.q(str2) || "1".equals(i0.o().getPermission().getBbs_basic_permission())) {
            arrayList.add(com.max.xiaoheihe.module.bbs.adapter.c.F(f85717o, R.drawable.bbs_sharebutton_delete_46x46, new PostOptionObj.OnClickListener() { // from class: com.max.xiaoheihe.module.game.adapter.k
                @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
                public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
                    this.f85707a.K(str, dialog, view, imageView, textView);
                }
            }));
        }
        if (!i0.q(str2)) {
            arrayList.add(com.max.xiaoheihe.module.bbs.adapter.c.F(f85716n, R.drawable.bbs_sharebutton_report_46x46, new PostOptionObj.OnClickListener() { // from class: com.max.xiaoheihe.module.game.adapter.l
                @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
                public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
                    this.f85709a.L(str, str3, dialog, view, imageView, textView);
                }
            }));
        }
        BaseActivity baseActivity = this.f85718b;
        com.max.xiaoheihe.module.bbs.adapter.c.W(baseActivity, arrayList, com.max.xiaoheihe.module.bbs.adapter.c.E(baseActivity, str4, str5));
    }

    static /* synthetic */ void w(m mVar, String str, ShineButton shineButton, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{mVar, str, shineButton, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 35558, new Class[]{m.class, String.class, ShineButton.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mVar.U(str, shineButton, i10, z10);
    }

    static /* synthetic */ void z(m mVar, String str, String str2, String str3, String str4, String str5, String str6) {
        if (PatchProxy.proxy(new Object[]{mVar, str, str2, str3, str4, str5, str6}, null, changeQuickRedirect, true, 35559, new Class[]{m.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mVar.V(str, str2, str3, str4, str5, str6);
    }

    public String F() {
        return this.f85719c;
    }

    public void N(com.max.hbcommon.base.adapter.s.e eVar, LinkInfoObj linkInfoObj) {
        if (PatchProxy.proxy(new Object[]{eVar, linkInfoObj}, this, changeQuickRedirect, false, 35543, new Class[]{com.max.hbcommon.base.adapter.s.e.class, LinkInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        linkInfoObj.setIndex(getDataList().indexOf(linkInfoObj) + "");
        eVar.itemView.setTag(linkInfoObj);
        GameDetailComment gameDetailComment = (GameDetailComment) eVar.i(R.id.gdc);
        gameDetailComment.f86683n.setBackgroundResource("1".equals(linkInfoObj.getIs_top()) ? R.color.divider_secondary_2_color : R.drawable.list_item_bg);
        gameDetailComment.setData(linkInfoObj, this.f85719c);
        if (this.f85721e.b()) {
            gameDetailComment.f86687r.setVisibility(0);
        } else {
            gameDetailComment.f86687r.setVisibility(eVar.getPosition() == getDataList().size() - 1 ? 8 : 0);
        }
        gameDetailComment.f86688s.setLinkInfo(linkInfoObj);
        gameDetailComment.f86688s.setOnLDHClickListener(new b(gameDetailComment));
        if (!com.max.hbcommon.utils.c.w(linkInfoObj.getCustom_collapse_game_comments())) {
            gameDetailComment.f86690u.setOnClickListener(new c(linkInfoObj));
        }
        d dVar = new d(linkInfoObj);
        gameDetailComment.f86683n.setOnClickListener(dVar);
        gameDetailComment.f86682m.setOnClickListener(dVar);
        String linkid = linkInfoObj.getLinkid();
        String userid = linkInfoObj.getUser().getUserid();
        gameDetailComment.f86682m.setOnLongClickListener(new e(linkid, userid, linkInfoObj));
        gameDetailComment.setMoreMenu(new f(linkid, userid, linkInfoObj));
    }

    public void O(LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 35550, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f85725i = new WeakReference<>(linearLayout);
    }

    public void P(LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 35549, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f85724h = new WeakReference<>(linearLayout);
    }

    public void Q(String str) {
        this.f85720d = str;
    }

    public void S(k kVar) {
        this.f85721e = kVar;
    }

    public void T(String str) {
        this.f85719c = str;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, LinkInfoObj linkInfoObj) {
        if (PatchProxy.proxy(new Object[]{eVar, linkInfoObj}, this, changeQuickRedirect, false, 35551, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        N(eVar, linkInfoObj);
    }
}
