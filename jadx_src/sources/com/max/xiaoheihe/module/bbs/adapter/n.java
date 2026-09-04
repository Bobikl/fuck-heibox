package com.max.xiaoheihe.module.bbs.adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.flyco.tablayout.widget.MsgView;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.bbs.UserAwardListActivity;
import com.max.xiaoheihe.module.bbs.UserNotifyListActivity;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.bbs.p0;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import java.util.List;

/* JADX INFO: compiled from: MsgListAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public class n extends com.max.hbcommon.base.adapter.u<BBSUserMsgObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f80560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f80561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s f80562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f80563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private UMShareListener f80564f;

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class a implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserMsgObj f80565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f80566c;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MsgListAdapter.java */
        public class C0685a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0685a() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 27415, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                a aVar = a.this;
                n.o(n.this, aVar.f80565b.getUser_a().getUserid());
                int iIndexOf = n.this.getDataList().indexOf(a.this.f80565b);
                if (iIndexOf >= 0 && iIndexOf < n.this.getDataList().size()) {
                    n.this.getDataList().remove(iIndexOf);
                    n.this.notifyItemRemoved(iIndexOf);
                    if (n.this.f80561c != null) {
                        n.this.f80561c.a();
                    }
                }
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 27414, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        /* JADX INFO: compiled from: MsgListAdapter.java */
        public class b implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 27417, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                a aVar = a.this;
                n.q(n.this, aVar.f80565b.getUser_a().getSender_id());
                int iIndexOf = n.this.getDataList().indexOf(a.this.f80565b);
                if (iIndexOf >= 0 && iIndexOf < n.this.getDataList().size()) {
                    n.this.getDataList().remove(iIndexOf);
                    n.this.notifyItemRemoved(iIndexOf);
                    if (n.this.f80561c != null) {
                        n.this.f80561c.a();
                    }
                }
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 27416, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        /* JADX INFO: compiled from: MsgListAdapter.java */
        public class c implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 27419, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                a aVar = a.this;
                n.r(n.this, aVar.f80565b.getSub_entry(), a.this.f80565b.getLatest_msg_id());
                int iIndexOf = n.this.getDataList().indexOf(a.this.f80565b);
                if (iIndexOf >= 0 && iIndexOf < n.this.getDataList().size()) {
                    n.this.getDataList().remove(iIndexOf);
                    n.this.notifyItemRemoved(iIndexOf);
                    if (n.this.f80561c != null) {
                        n.this.f80561c.a();
                    }
                }
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 27418, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        a(BBSUserMsgObj bBSUserMsgObj, String str) {
            this.f80565b = bBSUserMsgObj;
            this.f80566c = str;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27413, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (!com.max.hbcommon.utils.c.x(this.f80565b.getEnable_delete())) {
                return false;
            }
            if ("message".equalsIgnoreCase(this.f80566c)) {
                com.max.xiaoheihe.view.l.D(n.this.f80560b, "", "确认删除本会话?", com.max.xiaoheihe.utils.d.n0(R.string.confirm), com.max.xiaoheihe.utils.d.n0(R.string.cancel), new C0685a());
            } else if (p0.C.equalsIgnoreCase(this.f80566c)) {
                com.max.xiaoheihe.view.l.D(n.this.f80560b, "", "确认删除本会话?", com.max.xiaoheihe.utils.d.n0(R.string.confirm), com.max.xiaoheihe.utils.d.n0(R.string.cancel), new b());
            } else {
                if (!p0.D.equalsIgnoreCase(this.f80566c)) {
                    return false;
                }
                com.max.xiaoheihe.view.l.D(n.this.f80560b, "", "确认删除本会话?", com.max.xiaoheihe.utils.d.n0(R.string.confirm), com.max.xiaoheihe.utils.d.n0(R.string.cancel), new c());
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserMsgObj f80571b;

        b(BBSUserMsgObj bBSUserMsgObj) {
            this.f80571b = bBSUserMsgObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27420, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(this.f80571b.getProtocol())) {
                com.max.xiaoheihe.base.router.b.k0(n.this.f80560b, this.f80571b.getProtocol());
            } else if (this.f80571b.getLink() != null) {
                BBSLinkObj link = this.f80571b.getLink();
                link.setRoot_comment_id(this.f80571b.getRoot_comment_id());
                link.setComment_id(this.f80571b.getComment_id());
                com.max.xiaoheihe.module.bbs.utils.b.E(n.this.f80560b, link);
            }
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class c implements com.max.xiaoheihe.module.bbs.utils.b.y {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.xiaoheihe.module.bbs.utils.b.y
        public void a(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class d extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27421, new Class[]{Result.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(result.getMsg())) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(result.getMsg());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27422, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class e implements com.max.xiaoheihe.module.bbs.utils.b.y {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.xiaoheihe.module.bbs.utils.b.y
        public void a(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class f extends com.max.hbcommon.network.d<Result> {
        f() {
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class g extends com.max.hbcommon.network.d<Result> {
        g() {
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class h extends com.max.hbcommon.network.d<Result> {
        h() {
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class i implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 27424, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(n.this.f80560b.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 27423, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.share_success));
            com.max.hbshare.d.F(n.u(n.this), null, "normal", null, null);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MsgView f80580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserMsgObj f80581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BBSUserMsgObj f80582d;

        j(MsgView msgView, BBSUserMsgObj bBSUserMsgObj, BBSUserMsgObj bBSUserMsgObj2) {
            this.f80580b = msgView;
            this.f80581c = bBSUserMsgObj;
            this.f80582d = bBSUserMsgObj2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27425, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f80580b.setVisibility(8);
            this.f80581c.setCount("0");
            if ((p0.G.equals(this.f80582d.getEntry()) || "message".equals(this.f80582d.getEntry())) && n.this.f80562d != null) {
                n.this.f80562d.a(this.f80581c);
            }
            if (!com.max.hbcommon.utils.c.u(this.f80581c.getEntry())) {
                n.t(n.this, this.f80581c);
            }
            com.max.xiaoheihe.module.bbs.utils.f.a(n.this.f80560b, this.f80581c);
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f80584b;

        k(String str) {
            this.f80584b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27426, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.K4, null, null);
            com.max.xiaoheihe.base.router.b.j0(view.getContext(), this.f80584b);
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserMsgObj f80586b;

        l(BBSUserMsgObj bBSUserMsgObj) {
            this.f80586b = bBSUserMsgObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27427, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            n.this.f80560b.startActivity(UserAwardListActivity.X1(n.this.f80560b, this.f80586b));
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserMsgObj f80588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f80589c;

        m(BBSUserMsgObj bBSUserMsgObj, View view) {
            this.f80588b = bBSUserMsgObj;
            this.f80589c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27428, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f80588b.setState("0");
            this.f80589c.setVisibility(8);
            if (com.max.hbcommon.utils.c.u(this.f80588b.getProtocol())) {
                com.max.xiaoheihe.module.bbs.utils.b.E(n.this.f80560b, this.f80588b.toBBSLinkObj());
            } else {
                com.max.xiaoheihe.base.router.b.k0(n.this.f80560b, this.f80588b.getProtocol());
            }
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.n$n, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class ViewOnClickListenerC0686n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserMsgObj f80591b;

        ViewOnClickListenerC0686n(BBSUserMsgObj bBSUserMsgObj) {
            this.f80591b = bBSUserMsgObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27429, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f80591b.setState("0");
            if (com.max.hbcommon.utils.c.u(this.f80591b.getProtocol())) {
                com.max.xiaoheihe.module.bbs.utils.b.E(n.this.f80560b, this.f80591b.toBBSLinkObj());
            } else {
                com.max.xiaoheihe.base.router.b.k0(n.this.f80560b, this.f80591b.getProtocol());
            }
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f80593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f80594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f80595d;

        o(String str, String str2, String str3) {
            this.f80593b = str;
            this.f80594c = str2;
            this.f80595d = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27430, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            n.this.f80560b.startActivity(com.max.xiaoheihe.module.game.z.b(n.this.f80560b, this.f80593b, this.f80594c, this.f80595d, null, i0.m(), i0.j(), null));
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27431, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.G(n.this.f80560b, 1).A();
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserMsgObj f80598b;

        q(BBSUserMsgObj bBSUserMsgObj) {
            this.f80598b = bBSUserMsgObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27432, new Class[]{View.class}, Void.TYPE).isSupported || this.f80598b.getLink() == null) {
                return;
            }
            BBSLinkObj link = this.f80598b.getLink();
            link.setRoot_comment_id(this.f80598b.getRoot_comment_id());
            com.max.xiaoheihe.module.bbs.utils.b.E(n.this.f80560b, link);
        }
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public interface r {
        void a();
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public interface s {
        void a(BBSUserMsgObj bBSUserMsgObj);
    }

    /* JADX INFO: compiled from: MsgListAdapter.java */
    public class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        BBSUserInfoObj f80600b;

        t(BBSUserInfoObj bBSUserInfoObj) {
            this.f80600b = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27433, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(view.getContext(), this.f80600b.getUserid()).A();
        }
    }

    public n(Context context, List<BBSUserMsgObj> list) {
        super(context, list);
        this.f80563e = true;
        this.f80564f = new i();
        this.f80560b = context;
    }

    private com.max.hbcommon.base.f A() {
        Object obj = this.f80560b;
        if (obj instanceof com.max.hbcommon.base.f) {
            return (com.max.hbcommon.base.f) obj;
        }
        return null;
    }

    private void D(com.max.hbcommon.base.adapter.s.e eVar, String str) {
        int i10;
        if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 27399, new Class[]{com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewI = eVar.i(R.id.vg_follow_state);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_follow_state);
        TextView textView = (TextView) eVar.i(R.id.tv_follow_state);
        boolean zEquals = "1".equals(str);
        int i11 = R.drawable.ic_0icon_action_interact_16;
        int i12 = R.color.background_layer_2_color;
        int i13 = R.drawable.btn_text_primary_2dp;
        int i14 = 18;
        if (!zEquals) {
            if ("2".equals(str)) {
                i10 = R.string.follow_too;
            } else if ("3".equals(str)) {
                i14 = 6;
                i10 = R.string.follow_each_other;
            } else {
                i11 = R.drawable.ic_0icon_action_add_16;
                i10 = R.string.follow;
            }
            viewI.setPadding(ViewUtils.f(this.f80560b, i14), 0, 0, 0);
            viewI.setBackgroundResource(i13);
            imageView.setColorFilter(this.f80560b.getResources().getColor(i12));
            textView.setTextColor(this.f80560b.getResources().getColor(i12));
            imageView.setImageResource(i11);
            textView.setText(i10);
        }
        i14 = 12;
        i11 = R.drawable.ic_0icon_action_select_16;
        i10 = R.string.has_followed;
        i12 = R.color.text_primary_2_color;
        i13 = R.drawable.btn_divider_concept_2dp;
        viewI.setPadding(ViewUtils.f(this.f80560b, i14), 0, 0, 0);
        viewI.setBackgroundResource(i13);
        imageView.setColorFilter(this.f80560b.getResources().getColor(i12));
        textView.setTextColor(this.f80560b.getResources().getColor(i12));
        imageView.setImageResource(i11);
        textView.setText(i10);
    }

    private void E(Context context, ViewGroup viewGroup, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{context, viewGroup, bBSLinkObj}, this, changeQuickRedirect, false, 27398, new Class[]{Context.class, ViewGroup.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_forward_post, viewGroup, false);
        bBSLinkObj.setIndex(getDataList().indexOf(bBSLinkObj) + "");
        com.max.xiaoheihe.module.bbs.utils.b.P(context, viewInflate, bBSLinkObj, com.max.xiaoheihe.module.bbs.utils.b.f83401f, 0, null, new e());
        viewGroup.addView(viewInflate);
    }

    private void F(BBSLinkObj bBSLinkObj, BBSUserSectionView bBSUserSectionView) {
        if (PatchProxy.proxy(new Object[]{bBSLinkObj, bBSUserSectionView}, this, changeQuickRedirect, false, 27395, new Class[]{BBSLinkObj.class, BBSUserSectionView.class}, Void.TYPE).isSupported || bBSLinkObj == null) {
            return;
        }
        String comment_num = bBSLinkObj.getComment_num();
        String link_award_num = bBSLinkObj.getLink_award_num();
        bBSUserSectionView.f80853i.f80993d.setNum(comment_num);
        bBSUserSectionView.f80853i.f80991b.setNum(link_award_num);
    }

    private void G(ImageView imageView, TextView textView, BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{imageView, textView, bBSUserInfoObj}, this, changeQuickRedirect, false, 27400, new Class[]{ImageView.class, TextView.class, BBSUserInfoObj.class}, Void.TYPE).isSupported || bBSUserInfoObj == null) {
            return;
        }
        com.max.hbimage.b.H(bBSUserInfoObj.getAvartar(), imageView);
        textView.setText(bBSUserInfoObj.getUsername());
        t tVar = new t(bBSUserInfoObj);
        imageView.setOnClickListener(tVar);
        textView.setOnClickListener(tVar);
    }

    private void H(HeyBoxAvatarView heyBoxAvatarView, TextView textView, BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{heyBoxAvatarView, textView, bBSUserInfoObj}, this, changeQuickRedirect, false, 27401, new Class[]{HeyBoxAvatarView.class, TextView.class, BBSUserInfoObj.class}, Void.TYPE).isSupported || bBSUserInfoObj == null) {
            return;
        }
        heyBoxAvatarView.setAvatar(bBSUserInfoObj.getAvartar(), bBSUserInfoObj.getAvatar_decoration());
        textView.setText(bBSUserInfoObj.getUsername());
        t tVar = new t(bBSUserInfoObj);
        heyBoxAvatarView.setOnClickListener(tVar);
        textView.setOnClickListener(tVar);
    }

    private void I(BBSUserMsgObj bBSUserMsgObj) {
        if (PatchProxy.proxy(new Object[]{bBSUserMsgObj}, this, changeQuickRedirect, false, 27405, new Class[]{BBSUserMsgObj.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("entry", bBSUserMsgObj.getEntry());
        if (!com.max.hbcommon.utils.c.u(bBSUserMsgObj.getSub_entry())) {
            jsonObject.addProperty(UserNotifyListActivity.O, bBSUserMsgObj.getSub_entry());
        }
        com.max.hbcommon.analytics.d.d("4", lb.d.M4, null, jsonObject);
    }

    static /* synthetic */ void o(n nVar, String str) {
        if (PatchProxy.proxy(new Object[]{nVar, str}, null, changeQuickRedirect, true, 27408, new Class[]{n.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.w(str);
    }

    static /* synthetic */ void q(n nVar, String str) {
        if (PatchProxy.proxy(new Object[]{nVar, str}, null, changeQuickRedirect, true, 27409, new Class[]{n.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.x(str);
    }

    static /* synthetic */ void r(n nVar, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{nVar, str, str2}, null, changeQuickRedirect, true, 27410, new Class[]{n.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.y(str, str2);
    }

    static /* synthetic */ void t(n nVar, BBSUserMsgObj bBSUserMsgObj) {
        if (PatchProxy.proxy(new Object[]{nVar, bBSUserMsgObj}, null, changeQuickRedirect, true, 27411, new Class[]{n.class, BBSUserMsgObj.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.I(bBSUserMsgObj);
    }

    static /* synthetic */ com.max.hbcommon.base.f u(n nVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{nVar}, null, changeQuickRedirect, true, 27412, new Class[]{n.class}, com.max.hbcommon.base.f.class);
        return patchProxyResultProxy.isSupported ? (com.max.hbcommon.base.f) patchProxyResultProxy.result : nVar.A();
    }

    private void v(BBSLinkObj bBSLinkObj, String str) {
        if (PatchProxy.proxy(new Object[]{bBSLinkObj, str}, this, changeQuickRedirect, false, 27397, new Class[]{BBSLinkObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().z2(null, bBSLinkObj.getLinkid(), str, l0.Y(bBSLinkObj)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d());
    }

    private void w(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27402, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().k0(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new f());
    }

    private void x(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27403, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().m1(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new g());
    }

    private void y(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 27404, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().d(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new h());
    }

    private String z(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27396, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return ad.a.a(ad.a.G, false) ? com.max.hbutils.utils.w.q(this.f80560b, str) : com.max.hbutils.utils.w.t(this.f80560b, str);
    }

    public int B(int i10, BBSUserMsgObj bBSUserMsgObj) {
        Object[] objArr = {new Integer(i10), bBSUserMsgObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27393, new Class[]{cls, BBSUserMsgObj.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (!com.max.hbcommon.utils.c.u(bBSUserMsgObj.getEntry())) {
            return R.layout.item_notify_group;
        }
        if ("3".equals(bBSUserMsgObj.getMessage_type()) || "7".equals(bBSUserMsgObj.getMessage_type()) || "13".equals(bBSUserMsgObj.getMessage_type())) {
            return R.layout.item_award_or_comments_msg;
        }
        if ("1".equals(bBSUserMsgObj.getMessage_type()) || "2".equals(bBSUserMsgObj.getMessage_type())) {
            return R.layout.item_comments_msg;
        }
        if ("8".equals(bBSUserMsgObj.getMessage_type())) {
            return R.layout.item_discount_notify_list;
        }
        if ("9".equals(bBSUserMsgObj.getMessage_type()) || "10".equals(bBSUserMsgObj.getMessage_type()) || "11".equals(bBSUserMsgObj.getMessage_type()) || "4".equals(bBSUserMsgObj.getMessage_type())) {
            return R.layout.item_notify_group;
        }
        if ("-2".equals(bBSUserMsgObj.getMessage_type())) {
            return R.layout.item_user_comment;
        }
        if ("16".equals(bBSUserMsgObj.getMessage_type())) {
            return R.layout.item_concept_moments_link;
        }
        return "17".equals(bBSUserMsgObj.getMessage_type()) ? R.layout.item_comments_msg : R.layout.item_user_message;
    }

    /* JADX WARN: Code duplicated, block: B:240:0x0db0  */
    /* JADX WARN: Code duplicated, block: B:241:0x0dbb  */
    /* JADX WARN: Code duplicated, block: B:243:0x0dc1  */
    /* JADX WARN: Code duplicated, block: B:246:0x0dd2  */
    /* JADX WARN: Code duplicated, block: B:247:0x0dda  */
    /* JADX WARN: Code duplicated, block: B:250:0x0dea  */
    /* JADX WARN: Code duplicated, block: B:251:0x0df0  */
    public void C(com.max.hbcommon.base.adapter.s.e eVar, BBSUserMsgObj bBSUserMsgObj) {
        String link_title;
        String link_desc;
        String link_img;
        int iQ;
        String string;
        String str;
        int i10;
        Drawable drawableL;
        int i11;
        View view;
        String text;
        int i12;
        int i13;
        int i14;
        int i15;
        if (PatchProxy.proxy(new Object[]{eVar, bBSUserMsgObj}, this, changeQuickRedirect, false, 27394, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSUserMsgObj.class}, Void.TYPE).isSupported) {
        }
        String entry = bBSUserMsgObj.getEntry();
        int iD = eVar.d();
        String str2 = "2";
        String str3 = lb.b.f131098n;
        switch (iD) {
            case R.layout.item_award_or_comments_msg /* 2131558955 */:
                String str4 = "1";
                ImageView imageView = (ImageView) eVar.i(R.id.iv_avatar);
                TextView textView = (TextView) eVar.i(R.id.tv_name);
                TextView textView2 = (TextView) eVar.i(R.id.tv_time);
                ExpressionTextView expressionTextView = (ExpressionTextView) eVar.i(R.id.tv_text);
                ImageView imageView2 = (ImageView) eVar.i(R.id.iv_source);
                ExpressionTextView expressionTextView2 = (ExpressionTextView) eVar.i(R.id.tv_source_title);
                ExpressionTextView expressionTextView3 = (ExpressionTextView) eVar.i(R.id.tv_source_desc);
                View viewI = eVar.i(R.id.divider);
                View viewI2 = eVar.i(R.id.state);
                View viewB = eVar.b();
                View viewI3 = eVar.i(R.id.ll_post_comment);
                eVar.itemView.setTag(R.id.rb_0, null);
                viewI3.setVisibility(8);
                if ("3".equals(bBSUserMsgObj.getMessage_type())) {
                    string = this.f80560b.getResources().getString(R.string.msg_type_bbs_award);
                    link_title = bBSUserMsgObj.getLink_title();
                    link_desc = bBSUserMsgObj.getLink_desc();
                    link_img = bBSUserMsgObj.getLink_img();
                    iQ = com.max.hbutils.utils.n.q(bBSUserMsgObj.getLink_award_num());
                } else if ("7".equals(bBSUserMsgObj.getMessage_type())) {
                    String string2 = this.f80560b.getResources().getString(R.string.msg_type_bbs_comment_award);
                    String comment_b_text = bBSUserMsgObj.getComment_b_text();
                    String comment_img = bBSUserMsgObj.getComment_img();
                    int iQ2 = com.max.hbutils.utils.n.q(bBSUserMsgObj.getComment_award_num());
                    String highLikeCommentProtocol = bBSUserMsgObj.getHighLikeCommentProtocol();
                    if (!com.max.hbcommon.utils.c.u(highLikeCommentProtocol)) {
                        eVar.itemView.setTag(R.id.rb_0, bBSUserMsgObj);
                        viewI3.setVisibility(0);
                        viewI3.setOnClickListener(new k(highLikeCommentProtocol));
                        com.max.xiaoheihe.accelworld.l.q(viewI3, R.color.background_card_1_color, 2.0f);
                    }
                    link_desc = comment_b_text;
                    link_img = comment_img;
                    iQ = iQ2;
                    string = string2;
                    link_title = null;
                } else if ("13".equals(bBSUserMsgObj.getMessage_type())) {
                    String string3 = this.f80560b.getResources().getString(R.string.msg_type_game_comment_award);
                    link_desc = bBSUserMsgObj.getLink_desc();
                    string = string3;
                    iQ = com.max.hbutils.utils.n.q(bBSUserMsgObj.getLink_award_num());
                    link_title = null;
                    link_img = null;
                } else {
                    if (str4.equals(bBSUserMsgObj.getMessage_type())) {
                        String string4 = this.f80560b.getResources().getString(R.string.msg_type_bbs_comment_comment);
                        link_desc = bBSUserMsgObj.getComment_b_text();
                        link_img = bBSUserMsgObj.getComment_img();
                        string = string4;
                        link_title = null;
                    } else if ("2".equals(bBSUserMsgObj.getMessage_type())) {
                        string = this.f80560b.getResources().getString(R.string.msg_type_bbs_comment);
                        link_title = bBSUserMsgObj.getLink_title();
                        link_desc = bBSUserMsgObj.getLink_desc();
                        link_img = bBSUserMsgObj.getLink_img();
                    } else {
                        link_title = null;
                        link_desc = null;
                        link_img = null;
                        iQ = 0;
                        string = null;
                    }
                    iQ = 0;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                String str5 = link_img;
                if ("3".equals(bBSUserMsgObj.getMessage_type()) || "7".equals(bBSUserMsgObj.getMessage_type()) || "13".equals(bBSUserMsgObj.getMessage_type())) {
                    imageView.setImageDrawable(this.f80560b.getResources().getDrawable(R.drawable.bbs_thumbs_up_34x34));
                    if (bBSUserMsgObj.getUser_as().size() > 0) {
                        spannableStringBuilder.append((CharSequence) bBSUserMsgObj.getUser_as().get(0).getUsername());
                    }
                    if (bBSUserMsgObj.getUser_as().size() > 1) {
                        spannableStringBuilder.append((CharSequence) "、").append((CharSequence) bBSUserMsgObj.getUser_as().get(1).getUsername());
                    }
                    if (iQ > 2) {
                        String strValueOf = String.valueOf(iQ);
                        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) String.format(this.f80560b.getResources().getString(R.string.and_more_people), strValueOf));
                        int length = (spannableStringBuilder.length() - 2) - strValueOf.length();
                        int length2 = strValueOf.length() + length;
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f80560b.getResources().getColor(R.color.text_primary_1_color)), length, length2, 33);
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.f80560b.getResources().getDimensionPixelSize(R.dimen.text_size_14)), length, length2, 33);
                    }
                    textView.setText(spannableStringBuilder);
                    l lVar = new l(bBSUserMsgObj);
                    imageView.setOnClickListener(lVar);
                    textView.setOnClickListener(lVar);
                } else {
                    link_desc = link_desc;
                    str4 = str4;
                }
                String strZ = z(bBSUserMsgObj.getTimestamp());
                if (string != null) {
                    strZ = strZ + " " + string;
                }
                textView2.setText(strZ);
                expressionTextView.setVisibility(8);
                if (com.max.hbcommon.utils.c.u(link_title)) {
                    expressionTextView2.setVisibility(8);
                } else {
                    expressionTextView2.setText(link_title);
                    expressionTextView2.setVisibility(0);
                }
                if (com.max.hbcommon.utils.c.u(link_desc)) {
                    str = str4;
                    if (!str.equals(bBSUserMsgObj.getComment_b_is_cy())) {
                        expressionTextView3.setVisibility(8);
                        i10 = 0;
                    }
                    drawableL = com.max.hbutils.utils.q.l(this.f80560b, ViewUtils.W(imageView2), ViewUtils.V(imageView2), ViewUtils.V(imageView2));
                    if (!com.max.hbcommon.utils.c.u(str5)) {
                        com.max.hbimage.b.U(str5, imageView2, drawableL);
                        imageView2.setVisibility(i10);
                    } else if (this.f80560b != null) {
                        imageView2.setImageDrawable(drawableL);
                    }
                    if (bBSUserMsgObj == this.mDataList.get(getItemCount() - 1)) {
                        viewI.setVisibility(4);
                        i11 = 0;
                    } else {
                        i11 = 0;
                        viewI.setVisibility(0);
                    }
                    if (str.equals(bBSUserMsgObj.getState())) {
                        view = viewI2;
                        view.setVisibility(i11);
                    } else {
                        view = viewI2;
                        view.setVisibility(8);
                    }
                    viewB.setOnClickListener(new m(bBSUserMsgObj, view));
                } else {
                    str = str4;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(link_desc == null ? "" : link_desc);
                if (str.equals(bBSUserMsgObj.getComment_b_is_cy())) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(lb.b.f131098n);
                    int textSize = (int) expressionTextView.getPaint().getTextSize();
                    Context context = this.f80560b;
                    i10 = 0;
                    spannableStringBuilder3.setSpan(new com.max.hbexpression.widget.a(context, R.drawable.item_cy_icon, ViewUtils.f(context, 20.0f), 0, textSize, 1), 0, spannableStringBuilder3.length(), 33);
                    spannableStringBuilder2.insert(0, (CharSequence) spannableStringBuilder3);
                } else {
                    i10 = 0;
                }
                r19.setText(spannableStringBuilder2);
                expressionTextView3.setVisibility(i10);
                drawableL = com.max.hbutils.utils.q.l(this.f80560b, ViewUtils.W(imageView2), ViewUtils.V(imageView2), ViewUtils.V(imageView2));
                if (!com.max.hbcommon.utils.c.u(str5)) {
                    com.max.hbimage.b.U(str5, imageView2, drawableL);
                    imageView2.setVisibility(i10);
                } else if (this.f80560b != null) {
                    imageView2.setImageDrawable(drawableL);
                }
                if (bBSUserMsgObj == this.mDataList.get(getItemCount() - 1)) {
                    viewI.setVisibility(4);
                    i11 = 0;
                } else {
                    i11 = 0;
                    viewI.setVisibility(0);
                }
                if (str.equals(bBSUserMsgObj.getState())) {
                    view = viewI2;
                    view.setVisibility(i11);
                } else {
                    view = viewI2;
                    view.setVisibility(8);
                }
                viewB.setOnClickListener(new m(bBSUserMsgObj, view));
                break;
            case R.layout.item_comments_msg /* 2131559010 */:
                HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) eVar.i(R.id.avatar);
                TextView textView3 = (TextView) eVar.i(R.id.tv_name);
                TextView textView4 = (TextView) eVar.i(R.id.tv_time);
                ExpressionTextView expressionTextView4 = (ExpressionTextView) eVar.i(R.id.tv_text);
                ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_source);
                ViewGroup viewGroup2 = (ViewGroup) eVar.i(R.id.vg_link);
                ExpressionTextView expressionTextView5 = (ExpressionTextView) eVar.i(R.id.tv_user_comments);
                ExpressionTextView expressionTextView6 = (ExpressionTextView) eVar.i(R.id.tv_link_title);
                ExpressionTextView expressionTextView7 = (ExpressionTextView) eVar.i(R.id.tv_link_owner);
                ImageView imageView3 = (ImageView) eVar.i(R.id.iv_img);
                View viewI4 = eVar.i(R.id.divider);
                View viewB2 = eVar.b();
                expressionTextView6.setText(bBSUserMsgObj.getLink_title());
                expressionTextView7.setText(bBSUserMsgObj.getLink_user());
                if (com.max.hbcommon.utils.c.u(bBSUserMsgObj.getLink_img())) {
                    imageView3.setImageResource(R.drawable.ic_comments_link_thumb);
                } else {
                    com.max.hbimage.b.K(bBSUserMsgObj.getLink_img(), imageView3);
                }
                if ("1".equals(bBSUserMsgObj.getMessage_type())) {
                    String string5 = this.f80560b.getResources().getString(R.string.msg_type_bbs_comment_comment);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                    String str6 = bBSUserMsgObj.getUser_b().getUsername() + ": ";
                    spannableStringBuilder4.append((CharSequence) str6);
                    if ("1".equals(bBSUserMsgObj.getComment_b_is_cy())) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(lb.b.f131098n);
                        int textSize2 = (int) expressionTextView5.getPaint().getTextSize();
                        Context context2 = this.f80560b;
                        i13 = 33;
                        i14 = 0;
                        spannableStringBuilder5.setSpan(new com.max.hbexpression.widget.a(context2, R.drawable.item_cy_icon, ViewUtils.f(context2, 20.0f), 0, textSize2, 1), 0, spannableStringBuilder5.length(), 33);
                        spannableStringBuilder4.append((CharSequence) spannableStringBuilder5);
                    } else {
                        i13 = 33;
                        i14 = 0;
                    }
                    spannableStringBuilder4.setSpan(new ForegroundColorSpan(this.f80560b.getResources().getColor(R.color.text_primary_1_color)), i14, str6.length(), i13);
                    spannableStringBuilder4.append((CharSequence) bBSUserMsgObj.getComment_b_text());
                    expressionTextView5.setText(spannableStringBuilder4);
                    expressionTextView5.setVisibility(i14);
                    int iF = ViewUtils.f(this.f80560b, 10.0f);
                    viewGroup.setPadding(iF, iF, iF, iF);
                    viewGroup2.setBackgroundResource(R.color.background_layer_2_color);
                    text = string5;
                } else {
                    viewI4 = viewI4;
                    str3 = lb.b.f131098n;
                    if ("2".equals(bBSUserMsgObj.getMessage_type())) {
                        text = this.f80560b.getResources().getString(R.string.msg_type_bbs_comment);
                        expressionTextView5.setVisibility(8);
                        viewGroup2.setBackgroundResource(R.color.transparent);
                        viewGroup.setPadding(0, 0, 0, 0);
                    } else if ("17".equals(bBSUserMsgObj.getMessage_type())) {
                        text = bBSUserMsgObj.getText();
                        expressionTextView5.setVisibility(8);
                        viewGroup2.setBackgroundResource(R.color.transparent);
                        viewGroup.setPadding(0, 0, 0, 0);
                    } else {
                        text = null;
                    }
                }
                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder("");
                if (bBSUserMsgObj.getUser_a() != null) {
                    heyBoxAvatarView.setAvatar(bBSUserMsgObj.getUser_a().getAvartar(), bBSUserMsgObj.getUser_a().getAvatar_decoration());
                    spannableStringBuilder6.append((CharSequence) bBSUserMsgObj.getUser_a().getUsername());
                    textView3.setText(spannableStringBuilder6);
                    t tVar = new t(bBSUserMsgObj.getUser_a());
                    heyBoxAvatarView.setOnClickListener(tVar);
                    textView3.setOnClickListener(tVar);
                } else {
                    heyBoxAvatarView.setAvatar((String) null, (AvatarDecorationObj) null);
                    textView3.setText((CharSequence) null);
                    heyBoxAvatarView.setOnClickListener(null);
                    textView3.setOnClickListener(null);
                }
                String comment_a_text = bBSUserMsgObj.getComment_a_text();
                String strZ2 = z(bBSUserMsgObj.getTimestamp());
                if (text != null) {
                    strZ2 = strZ2 + "·" + text;
                }
                textView4.setText(strZ2);
                if (comment_a_text != null || "1".equals(bBSUserMsgObj.getComment_a_is_cy())) {
                    SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(comment_a_text != null ? comment_a_text : "");
                    if ("1".equals(bBSUserMsgObj.getComment_a_is_cy())) {
                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder(str3);
                        int textSize3 = (int) expressionTextView4.getPaint().getTextSize();
                        Context context3 = this.f80560b;
                        i12 = 0;
                        spannableStringBuilder8.setSpan(new com.max.hbexpression.widget.a(context3, R.drawable.item_cy_icon, ViewUtils.f(context3, 20.0f), 0, textSize3, 1), 0, spannableStringBuilder8.length(), 33);
                        spannableStringBuilder7.insert(0, (CharSequence) spannableStringBuilder8);
                    } else {
                        i12 = 0;
                    }
                    expressionTextView4.setText(spannableStringBuilder7);
                    expressionTextView4.setVisibility(i12);
                } else {
                    expressionTextView4.setVisibility(8);
                    i12 = 0;
                }
                if (bBSUserMsgObj == this.mDataList.get(getItemCount() - 1)) {
                    viewI4.setVisibility(4);
                } else {
                    viewI4.setVisibility(i12);
                }
                viewB2.setOnClickListener(new ViewOnClickListenerC0686n(bBSUserMsgObj));
                break;
            case R.layout.item_concept_moments_link /* 2131559032 */:
                BBSLinkObj bBSLinkObj = (BBSLinkObj) com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(bBSUserMsgObj.getLink()), BBSLinkObj.class);
                bBSLinkObj.setClick_protocol(bBSUserMsgObj.getProtocol());
                if (eVar.i(R.id.vg_interactive_bar) != null) {
                    if (bBSUserMsgObj.getLink() != null) {
                        eVar.i(R.id.vg_interactive_bar).setVisibility(0);
                        eVar.i(R.id.vg_interactive_bar).getLayoutParams().height = -2;
                    } else {
                        eVar.i(R.id.vg_interactive_bar).getLayoutParams().height = ViewUtils.f(this.f80560b, 10.0f);
                        eVar.i(R.id.vg_interactive_bar).setVisibility(4);
                    }
                }
                if (eVar.i(R.id.ll_origin_post) != null) {
                    ((ViewGroup) eVar.i(R.id.ll_origin_post)).removeAllViews();
                }
                if (bBSUserMsgObj.getLink() != null && bBSUserMsgObj.getLink().getForward() != null) {
                    eVar.i(R.id.ll_origin_post).setVisibility(0);
                    E(this.f80560b, (ViewGroup) eVar.i(R.id.ll_origin_post), bBSLinkObj.getForward());
                }
                BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) eVar.i(R.id.vg_title);
                if (bBSUserSectionView != null) {
                    F(bBSLinkObj, bBSUserSectionView);
                    bBSUserSectionView.setDesc(com.max.xiaoheihe.module.bbs.utils.b.t(this.f80560b, bBSLinkObj));
                }
                bBSLinkObj.setIndex(getDataList().indexOf(bBSUserMsgObj) + "");
                com.max.xiaoheihe.module.bbs.utils.b.M(eVar, bBSLinkObj, com.max.xiaoheihe.module.bbs.utils.b.f83401f, 0, null, new c());
                TextView textView5 = (TextView) eVar.i(R.id.tv_desc);
                if (textView5 != null) {
                    textView5.setText(((Object) textView5.getText()) + bBSUserMsgObj.getText());
                }
                break;
            case R.layout.item_discount_notify_list /* 2131559078 */:
                GameObj game_info = bBSUserMsgObj.getGame_info();
                TextView textView6 = (TextView) eVar.i(R.id.tv_create_at);
                ImageView imageView4 = (ImageView) eVar.i(R.id.iv_img);
                TextView textView7 = (TextView) eVar.i(R.id.tv_name);
                textView6.setText(z(bBSUserMsgObj.getTimestamp()));
                if (game_info != null) {
                    com.max.hbimage.b.K(game_info.getImage(), imageView4);
                    textView7.setText(game_info.getName());
                    r1.A(eVar, game_info);
                    eVar.b().setOnClickListener(new o(bBSUserMsgObj.getH_src(), bBSUserMsgObj.getAppid(), game_info.getGame_type()));
                }
                break;
            case R.layout.item_notify_group /* 2131559353 */:
                if (!com.max.hbcommon.utils.c.u(bBSUserMsgObj.getEntry())) {
                    eVar.itemView.setTag(R.id.rb_0, bBSUserMsgObj);
                }
                HeyBoxAvatarView heyBoxAvatarView2 = (HeyBoxAvatarView) eVar.i(R.id.avatar);
                MsgView msgView = (MsgView) eVar.i(R.id.badge);
                TextView textView8 = (TextView) eVar.i(R.id.tv_title);
                TextView textView9 = (TextView) eVar.i(R.id.tv_time);
                TextView textView10 = (TextView) eVar.i(R.id.tv_desc);
                ImageView imageView5 = (ImageView) eVar.i(R.id.iv_arrow_more);
                TextView textView11 = (TextView) eVar.i(R.id.tv_action);
                TextView textView12 = (TextView) eVar.i(R.id.tv_action_x);
                TextView textView13 = (TextView) eVar.i(R.id.tv_hint);
                View viewI5 = eVar.i(R.id.vg_follow_state);
                if (bBSUserMsgObj.getUser_a() != null) {
                    if ("2".equals(bBSUserMsgObj.getUser_a().getBorder())) {
                        heyBoxAvatarView2.setAvatar(bBSUserMsgObj.getUser_a().getAvartar(), 0);
                        int iF2 = ViewUtils.f(this.f80560b, 10.0f);
                        heyBoxAvatarView2.setPadding(iF2, iF2, iF2, iF2);
                    } else {
                        heyBoxAvatarView2.setPadding(0, 0, 0, 0);
                        heyBoxAvatarView2.setAvatar(bBSUserMsgObj.getUser_a().getAvartar(), bBSUserMsgObj.getUser_a().getAvatar_decoration());
                    }
                    textView8.setText(!com.max.hbcommon.utils.c.u(bBSUserMsgObj.getUser_a().getRemarks()) ? bBSUserMsgObj.getUser_a().getRemarks() : bBSUserMsgObj.getUser_a().getUsername());
                    heyBoxAvatarView2.setOnlineState(bBSUserMsgObj.getOnline_state());
                } else {
                    str2 = "2";
                }
                int iQ3 = com.max.hbutils.utils.n.q(bBSUserMsgObj.getCount());
                if (iQ3 > 0) {
                    msgView.setVisibility(0);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) msgView.getLayoutParams();
                    layoutParams.height = ViewUtils.f(this.f80560b, 14.0f);
                    if (iQ3 >= 100) {
                        layoutParams.width = -2;
                        msgView.setPadding(ViewUtils.f(this.f80560b, 6.0f), 0, ViewUtils.f(this.f80560b, 6.0f), 0);
                        msgView.setText("99+");
                    } else if (iQ3 >= 10) {
                        layoutParams.width = -2;
                        msgView.setPadding(ViewUtils.f(this.f80560b, 6.0f), 0, ViewUtils.f(this.f80560b, 6.0f), 0);
                        msgView.setText(iQ3 + "");
                    } else {
                        layoutParams.width = ViewUtils.f(this.f80560b, 14.0f);
                        msgView.setPadding(0, 0, 0, 0);
                        msgView.setText(iQ3 + "");
                    }
                    msgView.setTranslationX(ViewUtils.f(this.f80560b, 2.0f));
                    msgView.setTranslationY(-ViewUtils.f(this.f80560b, 2.0f));
                    i15 = 8;
                } else {
                    i15 = 8;
                    msgView.setVisibility(8);
                }
                if (com.max.hbcommon.utils.c.u(bBSUserMsgObj.getText()) && com.max.hbcommon.utils.c.u(bBSUserMsgObj.getOnline_desc())) {
                    textView10.setVisibility(i15);
                } else {
                    textView10.setVisibility(0);
                    SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                    if (!com.max.hbcommon.utils.c.u(bBSUserMsgObj.getOnline_desc())) {
                        spannableStringBuilder9.append((CharSequence) (Constants.ARRAY_TYPE + bBSUserMsgObj.getOnline_desc() + "]"));
                        spannableStringBuilder9.append((CharSequence) " ");
                        spannableStringBuilder9.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.correct_color)), 0, spannableStringBuilder9.length(), 33);
                    }
                    if (!com.max.hbcommon.utils.c.u(bBSUserMsgObj.getText())) {
                        spannableStringBuilder9.append((CharSequence) bBSUserMsgObj.getText());
                    }
                    textView10.setText(spannableStringBuilder9);
                }
                if ("friends".equalsIgnoreCase(entry)) {
                    textView9.setText(z(bBSUserMsgObj.getTimestamp()));
                    textView9.setVisibility(0);
                    imageView5.setVisibility(8);
                    textView11.setVisibility(8);
                    textView12.setVisibility(8);
                    textView13.setVisibility(8);
                    viewI5.setVisibility(8);
                } else if ("9".equals(bBSUserMsgObj.getMessage_type()) || "10".equals(bBSUserMsgObj.getMessage_type()) || "11".equals(bBSUserMsgObj.getMessage_type())) {
                    textView9.setVisibility(8);
                    imageView5.setVisibility(8);
                    viewI5.setVisibility(8);
                    if (bBSUserMsgObj.getInvite_info() != null) {
                        if ("0".equals(bBSUserMsgObj.getInvite_info().getState())) {
                            textView11.setVisibility(0);
                            textView12.setVisibility(0);
                            textView13.setVisibility(8);
                        } else if ("1".equals(bBSUserMsgObj.getInvite_info().getState())) {
                            textView11.setVisibility(8);
                            textView12.setVisibility(8);
                            textView13.setVisibility(0);
                            textView13.setText(this.f80560b.getResources().getString(R.string.already_accept));
                        } else if (str2.equals(bBSUserMsgObj.getInvite_info().getState())) {
                            textView11.setVisibility(8);
                            textView12.setVisibility(8);
                            textView13.setVisibility(0);
                            textView13.setText(this.f80560b.getResources().getString(R.string.already_refuse));
                        }
                    }
                } else if ("4".equals(bBSUserMsgObj.getMessage_type())) {
                    textView9.setVisibility(8);
                    imageView5.setVisibility(8);
                    textView11.setVisibility(8);
                    textView12.setVisibility(8);
                    textView13.setVisibility(8);
                    String follow_status = bBSUserMsgObj.getFollow_status();
                    viewI5.setVisibility(!com.max.hbcommon.utils.c.u(follow_status) ? 0 : 8);
                    D(eVar, follow_status);
                } else {
                    textView9.setText(z(bBSUserMsgObj.getTimestamp()));
                    textView9.setVisibility(0);
                    imageView5.setVisibility(8);
                    textView11.setVisibility(8);
                    textView12.setVisibility(8);
                    textView13.setVisibility(8);
                    viewI5.setVisibility(8);
                }
                eVar.b().setOnLongClickListener(new a(bBSUserMsgObj, entry));
                eVar.b().setOnClickListener(new j(msgView, bBSUserMsgObj, bBSUserMsgObj));
                break;
            case R.layout.item_user_comment /* 2131559595 */:
                HeyBoxAvatarView heyBoxAvatarView3 = (HeyBoxAvatarView) eVar.i(R.id.avatar);
                TextView textView14 = (TextView) eVar.i(R.id.tv_name);
                TextView textView15 = (TextView) eVar.i(R.id.tv_desc);
                ExpressionTextView expressionTextView8 = (ExpressionTextView) eVar.i(R.id.tv_text);
                ViewGroup viewGroup3 = (ViewGroup) eVar.i(R.id.vg_source);
                ViewGroup viewGroup4 = (ViewGroup) eVar.i(R.id.vg_link);
                ExpressionTextView expressionTextView9 = (ExpressionTextView) eVar.i(R.id.tv_user_comments);
                ExpressionTextView expressionTextView10 = (ExpressionTextView) eVar.i(R.id.tv_link_title);
                ExpressionTextView expressionTextView11 = (ExpressionTextView) eVar.i(R.id.tv_link_owner);
                ViewGroup viewGroup5 = (ViewGroup) eVar.i(R.id.vg_interactive_comment);
                ViewGroup viewGroup6 = (ViewGroup) eVar.i(R.id.vg_interactive_like);
                ImageView imageView6 = (ImageView) eVar.i(R.id.iv_img);
                View viewB3 = eVar.b();
                viewGroup5.setVisibility(8);
                viewGroup6.setVisibility(8);
                textView15.setText(z(bBSUserMsgObj.getTimestamp()));
                textView15.setText(z(bBSUserMsgObj.getCreate_at()) + "·" + this.f80560b.getResources().getString(R.string.comment_post));
                H(heyBoxAvatarView3, textView14, bBSUserMsgObj.getUser_a());
                expressionTextView8.setText(bBSUserMsgObj.getText());
                if ("1".equals(bBSUserMsgObj.getIs_cy())) {
                    SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder(lb.b.f131098n);
                    int textSize4 = (int) expressionTextView8.getPaint().getTextSize();
                    Context context4 = this.f80560b;
                    spannableStringBuilder10.setSpan(new com.max.hbexpression.widget.a(context4, R.drawable.item_cy_icon, ViewUtils.f(context4, 20.0f), 0, textSize4, 1), 0, spannableStringBuilder10.length(), 33);
                    expressionTextView8.setText(spannableStringBuilder10.append((CharSequence) new SpannableStringBuilder(expressionTextView8.getText())));
                }
                expressionTextView10.setText(bBSUserMsgObj.getLink().getTitle());
                expressionTextView11.setText(bBSUserMsgObj.getLink().getUser().getUsername());
                if (com.max.hbcommon.utils.c.w(bBSUserMsgObj.getLink().getThumbs())) {
                    imageView6.setImageResource(R.drawable.ic_comments_link_thumb);
                } else {
                    com.max.hbimage.b.K(bBSUserMsgObj.getLink().getThumbs().get(0), imageView6);
                }
                if (bBSUserMsgObj.getParent_comment() != null) {
                    SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder();
                    String str7 = bBSUserMsgObj.getParent_comment().getUser().getUsername() + ": ";
                    spannableStringBuilder11.append((CharSequence) str7);
                    spannableStringBuilder11.setSpan(new ForegroundColorSpan(this.f80560b.getResources().getColor(R.color.text_primary_1_color)), 0, str7.length(), 33);
                    spannableStringBuilder11.append((CharSequence) bBSUserMsgObj.getParent_comment().getText());
                    expressionTextView9.setText(spannableStringBuilder11);
                    expressionTextView9.setVisibility(0);
                    viewGroup4.setBackgroundResource(R.color.background_layer_2_color);
                    int iF3 = ViewUtils.f(this.f80560b, 10.0f);
                    viewGroup3.setPadding(iF3, iF3, iF3, iF3);
                } else {
                    expressionTextView9.setVisibility(8);
                    viewGroup4.setBackgroundResource(R.color.transparent);
                    viewGroup3.setPadding(0, 0, 0, 0);
                }
                viewB3.setOnClickListener(new b(bBSUserMsgObj));
                break;
            case R.layout.item_user_message /* 2131559602 */:
                ImageView imageView7 = (ImageView) eVar.i(R.id.iv_avatar);
                TextView textView16 = (TextView) eVar.i(R.id.tv_name);
                TextView textView17 = (TextView) eVar.i(R.id.tv_time);
                ExpressionTextView expressionTextView12 = (ExpressionTextView) eVar.i(R.id.tv_text);
                ExpressionTextView expressionTextView13 = (ExpressionTextView) eVar.i(R.id.tv_type);
                View viewB4 = eVar.b();
                textView17.setText(z(bBSUserMsgObj.getTimestamp()));
                if ("4".equals(bBSUserMsgObj.getMessage_type())) {
                    G(imageView7, textView16, bBSUserMsgObj.getUser_a());
                    expressionTextView12.setText("");
                    expressionTextView13.setText(this.f80560b.getResources().getString(R.string.msg_type_follow));
                    viewB4.setOnClickListener(new t(bBSUserMsgObj.getUser_a()));
                } else if ("5".equals(bBSUserMsgObj.getMessage_type())) {
                    G(imageView7, textView16, bBSUserMsgObj.getUser_a());
                    expressionTextView12.setText(bBSUserMsgObj.getText());
                    expressionTextView13.setText(this.f80560b.getResources().getString(R.string.view));
                    viewB4.setOnClickListener(new p());
                } else if (!"-2".equals(bBSUserMsgObj.getMessage_type())) {
                    textView17.setText(z(bBSUserMsgObj.getCreate_at()));
                    G(imageView7, textView16, bBSUserMsgObj.getUser_a());
                    expressionTextView12.setText(bBSUserMsgObj.getText());
                    expressionTextView13.setText(this.f80560b.getResources().getString(R.string.view));
                } else {
                    textView17.setText(z(bBSUserMsgObj.getCreate_at()) + " " + this.f80560b.getResources().getString(R.string.comment_post));
                    G(imageView7, textView16, bBSUserMsgObj.getUser_a());
                    expressionTextView12.setText(bBSUserMsgObj.getText());
                    if (bBSUserMsgObj.getParent_comment() != null) {
                        expressionTextView13.setText(bBSUserMsgObj.getParent_comment().getText());
                    } else if (bBSUserMsgObj.getLink() != null) {
                        expressionTextView13.setText(bBSUserMsgObj.getLink().getTitle());
                    } else {
                        expressionTextView13.setText(this.f80560b.getResources().getString(R.string.view));
                    }
                    viewB4.setOnClickListener(new q(bBSUserMsgObj));
                }
                break;
        }
    }

    public void J(r rVar) {
        this.f80561c = rVar;
    }

    public void K(s sVar) {
        this.f80562d = sVar;
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, BBSUserMsgObj bBSUserMsgObj) {
        Object[] objArr = {new Integer(i10), bBSUserMsgObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27406, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : B(i10, bBSUserMsgObj);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 27407, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        C(eVar, (BBSUserMsgObj) obj);
    }
}
