package com.max.xiaoheihe.module.bbs.messagecenter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flyco.tablayout.widget.MsgView;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.l;
import com.max.hbcommon.base.adapter.RecyclerViewItemWatcher;
import com.max.hbcommon.base.adapter.a0;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.mvvm.BaseDisplayState;
import com.max.xiaoheihe.base.mvvm.BaseFragment;
import com.max.xiaoheihe.bean.BizMessageObj;
import com.max.xiaoheihe.bean.NotifyPushMessageObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgObj;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgResult;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgsObj;
import com.max.xiaoheihe.bean.chat.GroupUserObj;
import com.max.xiaoheihe.module.account.MessageAndFriendsActivity;
import com.max.xiaoheihe.module.bbs.UserNotifyListActivity;
import com.max.xiaoheihe.module.bbs.adapter.n;
import com.max.xiaoheihe.module.bbs.p0;
import com.max.xiaoheihe.module.chat.MsgConversationActivity;
import com.max.xiaoheihe.utils.m0;
import com.max.xiaoheihe.view.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.r0;
import mb.z0;

/* JADX INFO: compiled from: MessageCenterFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nMessageCenterFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageCenterFragment.kt\ncom/max/xiaoheihe/module/bbs/messagecenter/MessageCenterFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,687:1\n172#2,9:688\n*S KotlinDebug\n*F\n+ 1 MessageCenterFragment.kt\ncom/max/xiaoheihe/module/bbs/messagecenter/MessageCenterFragment\n*L\n88#1:688,9\n*E\n"})
@o(parameters = 0)
public final class MessageCenterFragment extends BaseFragment<MessageCenterFragmentVM> implements m0.g {

    @dl.d
    public static final a Q = new a(null);
    public static final int R = 8;

    @dl.d
    public static final String S = "list_type";

    @dl.d
    public static final String T = "message_type";

    @dl.d
    private static final String U = "sender_id";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final z L;

    @dl.e
    private t M;
    public z0 N;

    @dl.d
    private final Handler O = new Handler(Looper.getMainLooper());

    @dl.e
    private String P;

    /* JADX INFO: compiled from: MessageCenterFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public final boolean a(@dl.e String str, @dl.e String str2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 28277, new Class[]{String.class, String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return (str == null || f0.g("2", str)) && com.max.hbcommon.utils.c.u(str2);
        }

        @dl.d
        public final MessageCenterFragment b(@dl.e String str, @dl.e String str2, @dl.e String str3) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 28276, new Class[]{String.class, String.class, String.class}, MessageCenterFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (MessageCenterFragment) patchProxyResultProxy.result;
            }
            MessageCenterFragment messageCenterFragment = new MessageCenterFragment();
            Bundle bundle = new Bundle();
            bundle.putString("list_type", str);
            bundle.putString("message_type", str2);
            bundle.putString("sender_id", str3);
            messageCenterFragment.setArguments(bundle);
            return messageCenterFragment;
        }
    }

    /* JADX INFO: compiled from: MessageCenterFragment.kt */
    public static final class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 28278, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            MessageCenterFragment.t4(MessageCenterFragment.this).L();
            if (MessageCenterFragment.this.getContext() instanceof MessageAndFriendsActivity) {
                Context context = MessageCenterFragment.this.getContext();
                f0.n(context, "null cannot be cast to non-null type com.max.xiaoheihe.module.account.MessageAndFriendsActivity");
                MessageAndFriendsActivity.b2((MessageAndFriendsActivity) context, false, 1, null);
            }
        }
    }

    /* JADX INFO: compiled from: MessageCenterFragment.kt */
    public static final class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 28279, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            MessageCenterFragmentVM messageCenterFragmentVMT4 = MessageCenterFragment.t4(MessageCenterFragment.this);
            messageCenterFragmentVMT4.P(messageCenterFragmentVMT4.C() + 30);
            MessageCenterFragment.t4(MessageCenterFragment.this).F();
        }
    }

    /* JADX INFO: compiled from: MessageCenterFragment.kt */
    public static final class d implements n.s {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.n.s
        public final void a(BBSUserMsgObj bBSUserMsgObj) {
            if (PatchProxy.proxy(new Object[]{bBSUserMsgObj}, this, changeQuickRedirect, false, 28280, new Class[]{BBSUserMsgObj.class}, Void.TYPE).isSupported) {
                return;
            }
            MessageCenterFragment messageCenterFragment = MessageCenterFragment.this;
            BBSUserInfoObj user_a = bBSUserMsgObj.getUser_a();
            messageCenterFragment.P = user_a != null ? user_a.getUserid() : null;
        }
    }

    /* JADX INFO: compiled from: MessageCenterFragment.kt */
    public static final class e implements n.r {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.n.r
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28281, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            t tVar = MessageCenterFragment.this.M;
            f0.m(tVar);
            tVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: compiled from: MessageCenterFragment.kt */
    public static final class f implements a0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void a(int i10, @dl.e RecyclerView.ViewHolder viewHolder, float f10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder, new Float(f10)}, this, changeQuickRedirect, false, 28283, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            a0.a.a(this, i10, viewHolder, f10);
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void b(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void c(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
            BBSUserMsgObj bBSUserMsgObj;
            Integer num = new Integer(i10);
            boolean z10 = false;
            if (!PatchProxy.proxy(new Object[]{num, viewHolder}, this, changeQuickRedirect, false, 28282, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported && (viewHolder instanceof s.e)) {
                View view = ((s.e) viewHolder).itemView;
                f0.o(view, "viewTag.itemView");
                if ((view.getTag(R.id.rb_0) instanceof BBSUserMsgObj) && (bBSUserMsgObj = (BBSUserMsgObj) view.getTag(R.id.rb_0)) != null) {
                    MessageCenterFragment messageCenterFragment = MessageCenterFragment.this;
                    if (!com.max.hbcommon.utils.c.u(bBSUserMsgObj.getEntry()) && !bBSUserMsgObj.isReported_exposure() && !f0.g("message", bBSUserMsgObj.getEntry())) {
                        MessageCenterFragment.y4(messageCenterFragment, bBSUserMsgObj);
                        z10 = true;
                    }
                    if (!bBSUserMsgObj.isReported_exposure() && f0.g("7", bBSUserMsgObj.getMessage_type())) {
                        com.max.hbcommon.analytics.d.d("3", lb.d.K4, null, null);
                        z10 = true;
                    }
                    if (z10) {
                        bBSUserMsgObj.setReported_exposure(true);
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: MessageCenterFragment.kt */
    public static final class g extends com.max.hbcommon.base.adapter.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        g(Activity activity, int i10) {
            super(activity, i10, 0);
        }

        @Override // com.max.hbcommon.base.adapter.i, androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 28284, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(outRect, "outRect");
            f0.p(view, "view");
            f0.p(parent, "parent");
            f0.p(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = parent.getAdapter();
            f0.m(adapter);
            int itemCount = adapter.getItemCount();
            t tVar = MessageCenterFragment.this.M;
            f0.m(tVar);
            int iU = tVar.u();
            if (childAdapterPosition == itemCount - 1 || childAdapterPosition < iU) {
                outRect.set(0, 0, 0, 0);
            } else {
                outRect.set(0, 0, 0, MessageCenterFragment.this.getResources().getDimensionPixelSize(R.dimen.divider_height));
            }
        }
    }

    /* JADX INFO: compiled from: MessageCenterFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MsgView f81251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MessageCenterFragment f81252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f81253d;

        h(MsgView msgView, MessageCenterFragment messageCenterFragment, String str) {
            this.f81251b = msgView;
            this.f81252c = messageCenterFragment;
            this.f81253d = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28310, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f81251b.setVisibility(8);
            MessageCenterFragment.x4(this.f81252c, this.f81253d);
            Activity activityU4 = MessageCenterFragment.u4(this.f81252c);
            if (activityU4 != null) {
                String str = this.f81253d;
                MessageCenterFragment messageCenterFragment = this.f81252c;
                if (kotlin.text.u.L1("comment", str, true)) {
                    Context contextRequireContext = messageCenterFragment.requireContext();
                    f0.o(contextRequireContext, "requireContext()");
                    com.max.xiaoheihe.base.router.b.f(contextRequireContext, lb.d.B4).U("list_type", "0").W("prefer_friend_list", false).A();
                } else {
                    if (kotlin.text.u.L1(p0.f81454v, str, true)) {
                        com.max.xiaoheihe.base.router.b.x(activityU4, "1", null).A();
                        return;
                    }
                    if (f0.g("follow", str)) {
                        com.max.xiaoheihe.base.router.b.x(activityU4, "2", "4").A();
                    } else if (f0.g("at", str)) {
                        com.max.xiaoheihe.base.router.b.x(activityU4, "2", "16").A();
                    } else if (kotlin.text.u.L1("notify", str, true)) {
                        activityU4.startActivity(UserNotifyListActivity.O1(MessageCenterFragment.u4(messageCenterFragment), "0"));
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: MessageCenterFragment.kt */
    public static final class i implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 28312, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 28311, new Class[]{Boolean.class}, Void.TYPE).isSupported || bool.booleanValue()) {
                return;
            }
            MessageCenterFragment.this.B4().f131840c.f131496c.A(0);
            MessageCenterFragment.this.B4().f131840c.f131496c.p(0);
        }
    }

    /* JADX INFO: compiled from: MessageCenterFragment.kt */
    public static final class j implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 28314, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 28313, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                return;
            }
            MessageCenterFragment messageCenterFragment = MessageCenterFragment.this;
            MessageCenterFragment.A4(messageCenterFragment, MessageCenterFragment.t4(messageCenterFragment).E(), R.drawable.common_tag_common_45x45, R.string.empty_content);
            t tVar = MessageCenterFragment.this.M;
            if (tVar != null) {
                tVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: compiled from: MessageCenterFragment.kt */
    public static final class k implements j0<BBSUserMsgResult<BBSUserMsgsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(BBSUserMsgResult<BBSUserMsgsObj> bBSUserMsgResult) {
            if (PatchProxy.proxy(new Object[]{bBSUserMsgResult}, this, changeQuickRedirect, false, 28316, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bBSUserMsgResult);
        }

        public final void b(BBSUserMsgResult<BBSUserMsgsObj> bBSUserMsgResult) {
            if (PatchProxy.proxy(new Object[]{bBSUserMsgResult}, this, changeQuickRedirect, false, 28315, new Class[]{BBSUserMsgResult.class}, Void.TYPE).isSupported) {
                return;
            }
            MessageCenterFragment.w4(MessageCenterFragment.this, bBSUserMsgResult);
        }
    }

    public MessageCenterFragment() {
        final yh.a aVar = null;
        this.L = FragmentViewModelLazyKt.h(this, n0.d(com.max.xiaoheihe.module.bbs.messagecenter.a.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$special$$inlined$activityViewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28317, new Class[0], b1.class);
                if (patchProxyResultProxy.isSupported) {
                    return (b1) patchProxyResultProxy.result;
                }
                b1 viewModelStore = this.requireActivity().getViewModelStore();
                f0.o(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28318, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$special$$inlined$activityViewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28320, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28319, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar3 = aVar;
                if (aVar3 != null && (aVar2 = (u2.a) aVar3.invoke()) != null) {
                    return aVar2;
                }
                u2.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                f0.o(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$special$$inlined$activityViewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28321, new Class[0], y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0.b) patchProxyResultProxy.result;
                }
                y0.b defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                f0.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28322, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
    }

    public static final /* synthetic */ void A4(MessageCenterFragment messageCenterFragment, List list, int i10, int i11) {
        Object[] objArr = {messageCenterFragment, list, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 28272, new Class[]{MessageCenterFragment.class, List.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        messageCenterFragment.J4(list, i10, i11);
    }

    private final com.max.xiaoheihe.module.bbs.messagecenter.a C4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28252, new Class[0], com.max.xiaoheihe.module.bbs.messagecenter.a.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.bbs.messagecenter.a) patchProxyResultProxy.result : (com.max.xiaoheihe.module.bbs.messagecenter.a) this.L.getValue();
    }

    private final int D4() {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28264, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Iterator<BBSUserMsgObj> it = Y3().E().iterator();
        while (it.hasNext() && com.max.hbcommon.utils.c.x(it.next().getIs_top())) {
            i10++;
        }
        return i10;
    }

    private final void E4() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28256, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        Y3().N(arguments.getString("list_type"));
        Y3().O(arguments.getString("message_type"));
        Y3().Q(arguments.getString("sender_id"));
    }

    private final void F4(BBSUserMsgResult<BBSUserMsgsObj> bBSUserMsgResult) {
        List<BBSUserMsgObj> header;
        if (PatchProxy.proxy(new Object[]{bBSUserMsgResult}, this, changeQuickRedirect, false, 28265, new Class[]{BBSUserMsgResult.class}, Void.TYPE).isSupported) {
            return;
        }
        if (bBSUserMsgResult == null || bBSUserMsgResult.getResult() == null) {
            header = null;
        } else {
            BBSUserMsgsObj result = bBSUserMsgResult.getResult();
            f0.m(result);
            header = result.getHeader();
        }
        if (header == null || header.size() == 0) {
            t tVar = this.M;
            f0.m(tVar);
            tVar.F(R.layout.item_user_msg_header);
            t tVar2 = this.M;
            f0.m(tVar2);
            tVar2.notifyDataSetChanged();
            return;
        }
        i0<Boolean> i0VarC = C4().c();
        f0.m(bBSUserMsgResult);
        i0VarC.r(Boolean.valueOf(bBSUserMsgResult.getResult().getFeedback_unread() > 0));
        t tVar3 = this.M;
        f0.m(tVar3);
        tVar3.F(R.layout.item_user_msg_header);
        View viewInflate = getMInflater().inflate(R.layout.item_user_msg_header, (ViewGroup) B4().f131840c.f131495b, false);
        View viewFindViewById = viewInflate.findViewById(R.id.ll_menu);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        for (BBSUserMsgObj bBSUserMsgObj : header) {
            View viewInflate2 = getMInflater().inflate(R.layout.item_user_msg_menu, (ViewGroup) linearLayout, false);
            View viewFindViewById2 = viewInflate2.findViewById(R.id.iv_img);
            f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) viewFindViewById2;
            View viewFindViewById3 = viewInflate2.findViewById(R.id.badge);
            f0.n(viewFindViewById3, "null cannot be cast to non-null type com.flyco.tablayout.widget.MsgView");
            MsgView msgView = (MsgView) viewFindViewById3;
            View viewFindViewById4 = viewInflate2.findViewById(R.id.tv_name);
            f0.n(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById4;
            linearLayout.addView(viewInflate2);
            BBSUserInfoObj user_a = bBSUserMsgObj.getUser_a();
            com.max.hbimage.b.K(user_a != null ? user_a.getAvartar() : null, imageView);
            BBSUserInfoObj user_a2 = bBSUserMsgObj.getUser_a();
            textView.setText(user_a2 != null ? user_a2.getUsername() : null);
            int iQ = com.max.hbutils.utils.n.q(bBSUserMsgObj.getCount());
            String entry = bBSUserMsgObj.getEntry();
            if (iQ > 0) {
                msgView.setVisibility(0);
                ViewGroup.LayoutParams layoutParams = msgView.getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.height = ViewUtils.f(getParentActivity(), 14.0f);
                if (iQ >= 100) {
                    layoutParams2.width = -2;
                    msgView.setPadding(ViewUtils.f(getParentActivity(), 6.0f), 0, ViewUtils.f(getParentActivity(), 6.0f), 0);
                    msgView.setText("99+");
                } else if (iQ >= 10) {
                    layoutParams2.width = -2;
                    msgView.setPadding(ViewUtils.f(getParentActivity(), 6.0f), 0, ViewUtils.f(getParentActivity(), 6.0f), 0);
                    msgView.setText(iQ + "");
                } else {
                    layoutParams2.width = ViewUtils.f(getParentActivity(), 14.0f);
                    msgView.setPadding(0, 0, 0, 0);
                    msgView.setText(iQ + "");
                }
                msgView.setTranslationX(ViewUtils.f(getParentActivity(), 2.0f));
                msgView.setTranslationY(-ViewUtils.f(getParentActivity(), 2.0f));
            } else {
                msgView.setVisibility(8);
            }
            viewInflate2.setOnClickListener(new h(msgView, this, entry));
        }
        t tVar4 = this.M;
        f0.m(tVar4);
        tVar4.p(R.layout.item_user_msg_header, viewInflate);
        t tVar5 = this.M;
        f0.m(tVar5);
        tVar5.notifyDataSetChanged();
    }

    private final void G4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28266, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("entry", str);
        com.max.hbcommon.analytics.d.d("4", lb.d.L4, null, jsonObject);
    }

    private final void H4(BBSUserMsgObj bBSUserMsgObj) {
        if (PatchProxy.proxy(new Object[]{bBSUserMsgObj}, this, changeQuickRedirect, false, 28267, new Class[]{BBSUserMsgObj.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("entry", bBSUserMsgObj.getEntry());
        String sub_entry = bBSUserMsgObj.getSub_entry();
        if (sub_entry != null) {
            jsonObject.addProperty(UserNotifyListActivity.O, sub_entry);
        }
        com.max.hbcommon.analytics.d.d("3", lb.d.M4, null, jsonObject);
    }

    private final void J4(List<?> list, int i10, int i11) {
        Object[] objArr = {list, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28262, new Class[]{List.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (!list.isEmpty()) {
            B4().f131839b.b().setVisibility(8);
            B4().f131840c.f131496c.i0(true);
            B4().f131840c.f131496c.b0(true);
            return;
        }
        B4().f131840c.f131496c.i0(false);
        B4().f131840c.f131496c.b0(false);
        B4().f131839b.b().setVisibility(0);
        ImageView imageView = B4().f131839b.f131708c;
        f0.o(imageView, "binding.rvEmptyView.ivEmpty");
        TextView textView = B4().f131839b.f131709d;
        f0.o(textView, "binding.rvEmptyView.tvEmpty");
        imageView.setImageResource(i10);
        textView.setText(i11);
        ViewGroup.LayoutParams layoutParams = B4().f131839b.b().getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, ViewUtils.f(getContext(), 4.0f), 0, 0);
        B4().f131839b.b().setLayoutParams(layoutParams2);
    }

    public static final /* synthetic */ MessageCenterFragmentVM t4(MessageCenterFragment messageCenterFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{messageCenterFragment}, null, changeQuickRedirect, true, 28269, new Class[]{MessageCenterFragment.class}, MessageCenterFragmentVM.class);
        return patchProxyResultProxy.isSupported ? (MessageCenterFragmentVM) patchProxyResultProxy.result : messageCenterFragment.Y3();
    }

    public static final /* synthetic */ Activity u4(MessageCenterFragment messageCenterFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{messageCenterFragment}, null, changeQuickRedirect, true, 28270, new Class[]{MessageCenterFragment.class}, Activity.class);
        return patchProxyResultProxy.isSupported ? (Activity) patchProxyResultProxy.result : messageCenterFragment.getParentActivity();
    }

    public static final /* synthetic */ int v4(MessageCenterFragment messageCenterFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{messageCenterFragment}, null, changeQuickRedirect, true, 28275, new Class[]{MessageCenterFragment.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : messageCenterFragment.D4();
    }

    public static final /* synthetic */ void w4(MessageCenterFragment messageCenterFragment, BBSUserMsgResult bBSUserMsgResult) {
        if (PatchProxy.proxy(new Object[]{messageCenterFragment, bBSUserMsgResult}, null, changeQuickRedirect, true, 28273, new Class[]{MessageCenterFragment.class, BBSUserMsgResult.class}, Void.TYPE).isSupported) {
            return;
        }
        messageCenterFragment.F4(bBSUserMsgResult);
    }

    public static final /* synthetic */ void x4(MessageCenterFragment messageCenterFragment, String str) {
        if (PatchProxy.proxy(new Object[]{messageCenterFragment, str}, null, changeQuickRedirect, true, 28274, new Class[]{MessageCenterFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        messageCenterFragment.G4(str);
    }

    public static final /* synthetic */ void y4(MessageCenterFragment messageCenterFragment, BBSUserMsgObj bBSUserMsgObj) {
        if (PatchProxy.proxy(new Object[]{messageCenterFragment, bBSUserMsgObj}, null, changeQuickRedirect, true, 28271, new Class[]{MessageCenterFragment.class, BBSUserMsgObj.class}, Void.TYPE).isSupported) {
            return;
        }
        messageCenterFragment.H4(bBSUserMsgObj);
    }

    @dl.d
    public final z0 B4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28253, new Class[0], z0.class);
        if (patchProxyResultProxy.isSupported) {
            return (z0) patchProxyResultProxy.result;
        }
        z0 z0Var = this.N;
        if (z0Var != null) {
            return z0Var;
        }
        f0.S("binding");
        return null;
    }

    @Override // com.max.xiaoheihe.utils.m0.g
    public /* synthetic */ void F2() {
        com.max.xiaoheihe.utils.n0.a(this);
    }

    public final void I4(@dl.d z0 z0Var) {
        if (PatchProxy.proxy(new Object[]{z0Var}, this, changeQuickRedirect, false, 28254, new Class[]{z0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(z0Var, "<set-?>");
        this.N = z0Var;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28255, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        z0 z0VarC = z0.c(getMInflater());
        f0.o(z0VarC, "inflate(mInflater)");
        I4(z0VarC);
        setViewBinding(B4());
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    public void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28261, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Y3().K().k(getViewLifecycleOwner(), new i());
        Y3().G().k(getViewLifecycleOwner(), new j());
        Y3().z().k(getViewLifecycleOwner(), new k());
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    @dl.d
    public Handler getEventHandler() {
        return this.O;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPagePath() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28268, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!e4()) {
            return null;
        }
        if (f0.g(Y3().A(), "2") && Y3().B() == null) {
            return lb.d.f131279w4;
        }
        if (f0.g(Y3().A(), "1")) {
            return lb.d.f131300z4;
        }
        if (f0.g(Y3().A(), "2") && f0.g(Y3().B(), "4")) {
            return lb.d.C4;
        }
        if (f0.g(Y3().A(), "2") && f0.g(Y3().B(), "16")) {
            return lb.d.G4;
        }
        if (f0.g(Y3().A(), "9") && Y3().B() == null) {
            return lb.d.D4;
        }
        return null;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    public void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28260, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E4();
        B4().f131840c.f131496c.S(new b());
        B4().f131840c.f131496c.f0(new c());
        final Activity parentActivity = getParentActivity();
        final ArrayList<BBSUserMsgObj> arrayListE = Y3().E();
        n nVar = new n(parentActivity, arrayListE) { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$initViews$msgListAdapter$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.xiaoheihe.module.bbs.adapter.n
            public void C(@dl.d s.e viewHolder, @dl.d @SuppressLint({"RecyclerView"}) final BBSUserMsgObj bbsUserMsgObj) {
                if (PatchProxy.proxy(new Object[]{viewHolder, bbsUserMsgObj}, this, changeQuickRedirect, false, 28285, new Class[]{s.e.class, BBSUserMsgObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                f0.p(bbsUserMsgObj, "bbsUserMsgObj");
                super.C(viewHolder, bbsUserMsgObj);
                if (viewHolder.d() == R.layout.item_notify_group) {
                    TextView textView = (TextView) viewHolder.i(R.id.tv_action);
                    TextView textView2 = (TextView) viewHolder.i(R.id.tv_action_x);
                    TextView textView3 = (TextView) viewHolder.i(R.id.tv_hint);
                    View viewI = viewHolder.i(R.id.vg_follow_state);
                    if (f0.g("9", bbsUserMsgObj.getMessage_type()) || f0.g("10", bbsUserMsgObj.getMessage_type()) || f0.g("11", bbsUserMsgObj.getMessage_type())) {
                        final MessageCenterFragment messageCenterFragment = this.f81255g;
                        textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$initViews$msgListAdapter$1$onBindViewHolder$1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28287, new Class[]{View.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                MessageCenterFragmentVM messageCenterFragmentVMT4 = MessageCenterFragment.t4(messageCenterFragment);
                                String invite_id = bbsUserMsgObj.getInvite_id();
                                f0.o(invite_id, "bbsUserMsgObj.invite_id");
                                final BBSUserMsgObj bBSUserMsgObj = bbsUserMsgObj;
                                final MessageCenterFragment messageCenterFragment2 = messageCenterFragment;
                                messageCenterFragmentVMT4.w(invite_id, "1", new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$initViews$msgListAdapter$1$onBindViewHolder$1.1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ b2 invoke() {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28289, new Class[0], Object.class);
                                        if (patchProxyResultProxy.isSupported) {
                                            return patchProxyResultProxy.result;
                                        }
                                        invoke2();
                                        return b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28288, new Class[0], Void.TYPE).isSupported || bBSUserMsgObj.getInvite_info() == null) {
                                            return;
                                        }
                                        bBSUserMsgObj.getInvite_info().setState("1");
                                        GroupUserObj groupUserObj = new GroupUserObj();
                                        groupUserObj.setUserid(bBSUserMsgObj.getUser_a().getUserid());
                                        groupUserObj.setAvartar(bBSUserMsgObj.getUser_a().getAvartar());
                                        groupUserObj.setUsername(bBSUserMsgObj.getUser_a().getUsername());
                                        MsgConversationActivity.R1(MessageCenterFragment.u4(messageCenterFragment2), bBSUserMsgObj.getUser_a().getUserid(), bBSUserMsgObj.getUser_a().getUsername());
                                        t tVar = messageCenterFragment2.M;
                                        if (tVar != null) {
                                            tVar.notifyDataSetChanged();
                                        }
                                    }
                                });
                            }
                        });
                        final MessageCenterFragment messageCenterFragment2 = this.f81255g;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$initViews$msgListAdapter$1$onBindViewHolder$2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28290, new Class[]{View.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                MessageCenterFragmentVM messageCenterFragmentVMT4 = MessageCenterFragment.t4(messageCenterFragment2);
                                String invite_id = bbsUserMsgObj.getInvite_id();
                                f0.o(invite_id, "bbsUserMsgObj.invite_id");
                                final BBSUserMsgObj bBSUserMsgObj = bbsUserMsgObj;
                                final MessageCenterFragment messageCenterFragment3 = messageCenterFragment2;
                                messageCenterFragmentVMT4.w(invite_id, "0", new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$initViews$msgListAdapter$1$onBindViewHolder$2.1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ b2 invoke() {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28292, new Class[0], Object.class);
                                        if (patchProxyResultProxy.isSupported) {
                                            return patchProxyResultProxy.result;
                                        }
                                        invoke2();
                                        return b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28291, new Class[0], Void.TYPE).isSupported) {
                                            return;
                                        }
                                        bBSUserMsgObj.getInvite_info().setState("2");
                                        t tVar = messageCenterFragment3.M;
                                        if (tVar != null) {
                                            tVar.notifyDataSetChanged();
                                        }
                                    }
                                });
                            }
                        });
                        textView3.setOnClickListener(null);
                        return;
                    }
                    if (f0.g("4", bbsUserMsgObj.getMessage_type())) {
                        textView.setOnClickListener(null);
                        textView2.setOnClickListener(null);
                        final MessageCenterFragment messageCenterFragment3 = this.f81255g;
                        viewI.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$initViews$msgListAdapter$1$onBindViewHolder$3
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28293, new Class[]{View.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                if (f0.g("0", bbsUserMsgObj.getFollow_status())) {
                                    l.f66572a.o("1", "message", bbsUserMsgObj.getUserid_a());
                                    MessageCenterFragmentVM messageCenterFragmentVMT4 = MessageCenterFragment.t4(messageCenterFragment3);
                                    String userid_a = bbsUserMsgObj.getUserid_a();
                                    f0.o(userid_a, "bbsUserMsgObj.userid_a");
                                    final MessageCenterFragment messageCenterFragment4 = messageCenterFragment3;
                                    final BBSUserMsgObj bBSUserMsgObj = bbsUserMsgObj;
                                    messageCenterFragmentVMT4.y(userid_a, null, new yh.l<Result<?>, b2>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$initViews$msgListAdapter$1$onBindViewHolder$3.1
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d Result<?> it) {
                                            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 28294, new Class[]{Result.class}, Void.TYPE).isSupported) {
                                                return;
                                            }
                                            f0.p(it, "it");
                                            if (com.max.hbcommon.utils.c.u(it.getMsg())) {
                                                com.max.hbutils.utils.c.f(messageCenterFragment4.getString(R.string.success));
                                            } else {
                                                com.max.hbutils.utils.c.f(it.getMsg());
                                            }
                                            if (f0.g("2", bBSUserMsgObj.getFollow_status())) {
                                                bBSUserMsgObj.setFollow_status("3");
                                            } else {
                                                bBSUserMsgObj.setFollow_status("1");
                                            }
                                            t tVar = messageCenterFragment4.M;
                                            f0.m(tVar);
                                            tVar.notifyDataSetChanged();
                                        }

                                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ b2 invoke(Result<?> result) {
                                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28295, new Class[]{Object.class}, Object.class);
                                            if (patchProxyResultProxy.isSupported) {
                                                return patchProxyResultProxy.result;
                                            }
                                            a(result);
                                            return b2.f124493a;
                                        }
                                    });
                                    return;
                                }
                                if (f0.g("1", bbsUserMsgObj.getFollow_status())) {
                                    Activity activityU4 = MessageCenterFragment.u4(messageCenterFragment3);
                                    String string = messageCenterFragment3.getString(R.string.cancel_follow_user_confirm);
                                    String string2 = messageCenterFragment3.getString(R.string.confirm);
                                    String string3 = messageCenterFragment3.getString(R.string.cancel);
                                    final BBSUserMsgObj bBSUserMsgObj2 = bbsUserMsgObj;
                                    final MessageCenterFragment messageCenterFragment5 = messageCenterFragment3;
                                    com.max.xiaoheihe.view.l.D(activityU4, string, "", string2, string3, new m() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$initViews$msgListAdapter$1$onBindViewHolder$3.2
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        @Override // com.max.xiaoheihe.view.m
                                        public void a(@dl.d Dialog dialog) {
                                            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 28297, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                                                return;
                                            }
                                            f0.p(dialog, "dialog");
                                            dialog.dismiss();
                                            l.f66572a.o("0", "message", bBSUserMsgObj2.getUserid_a());
                                            MessageCenterFragmentVM messageCenterFragmentVMT5 = MessageCenterFragment.t4(messageCenterFragment5);
                                            String userid_a2 = bBSUserMsgObj2.getUserid_a();
                                            f0.o(userid_a2, "bbsUserMsgObj.userid_a");
                                            final MessageCenterFragment messageCenterFragment6 = messageCenterFragment5;
                                            final BBSUserMsgObj bBSUserMsgObj3 = bBSUserMsgObj2;
                                            messageCenterFragmentVMT5.x(userid_a2, new yh.l<Result<?>, b2>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$initViews$msgListAdapter$1$onBindViewHolder$3$2$onPositiveClick$1
                                                public static ChangeQuickRedirect changeQuickRedirect;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public final void a(@dl.d Result<?> result) {
                                                    if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28298, new Class[]{Result.class}, Void.TYPE).isSupported) {
                                                        return;
                                                    }
                                                    f0.p(result, "result");
                                                    if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                                                        com.max.hbutils.utils.c.f(messageCenterFragment6.getString(R.string.success));
                                                    } else {
                                                        com.max.hbutils.utils.c.f(result.getMsg());
                                                    }
                                                    if (f0.g("3", bBSUserMsgObj3.getFollow_status())) {
                                                        bBSUserMsgObj3.setFollow_status("2");
                                                    } else {
                                                        bBSUserMsgObj3.setFollow_status("0");
                                                    }
                                                    t tVar = messageCenterFragment6.M;
                                                    f0.m(tVar);
                                                    tVar.notifyDataSetChanged();
                                                }

                                                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                                                @Override // yh.l
                                                public /* bridge */ /* synthetic */ b2 invoke(Result<?> result) {
                                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28299, new Class[]{Object.class}, Object.class);
                                                    if (patchProxyResultProxy.isSupported) {
                                                        return patchProxyResultProxy.result;
                                                    }
                                                    a(result);
                                                    return b2.f124493a;
                                                }
                                            });
                                        }

                                        @Override // com.max.xiaoheihe.view.m
                                        public void b(@dl.d Dialog dialog) {
                                            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 28296, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                                                return;
                                            }
                                            f0.p(dialog, "dialog");
                                            dialog.dismiss();
                                        }
                                    });
                                    return;
                                }
                                if (f0.g("2", bbsUserMsgObj.getFollow_status())) {
                                    l.f66572a.o("1", "message", bbsUserMsgObj.getUserid_a());
                                    MessageCenterFragmentVM messageCenterFragmentVMT5 = MessageCenterFragment.t4(messageCenterFragment3);
                                    String userid_a2 = bbsUserMsgObj.getUserid_a();
                                    f0.o(userid_a2, "bbsUserMsgObj.userid_a");
                                    final MessageCenterFragment messageCenterFragment6 = messageCenterFragment3;
                                    final BBSUserMsgObj bBSUserMsgObj3 = bbsUserMsgObj;
                                    messageCenterFragmentVMT5.y(userid_a2, null, new yh.l<Result<?>, b2>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$initViews$msgListAdapter$1$onBindViewHolder$3.3
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d Result<?> it) {
                                            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 28300, new Class[]{Result.class}, Void.TYPE).isSupported) {
                                                return;
                                            }
                                            f0.p(it, "it");
                                            if (com.max.hbcommon.utils.c.u(it.getMsg())) {
                                                com.max.hbutils.utils.c.f(messageCenterFragment6.getString(R.string.success));
                                            } else {
                                                com.max.hbutils.utils.c.f(it.getMsg());
                                            }
                                            if (f0.g("2", bBSUserMsgObj3.getFollow_status())) {
                                                bBSUserMsgObj3.setFollow_status("3");
                                            } else {
                                                bBSUserMsgObj3.setFollow_status("1");
                                            }
                                            t tVar = messageCenterFragment6.M;
                                            f0.m(tVar);
                                            tVar.notifyDataSetChanged();
                                        }

                                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ b2 invoke(Result<?> result) {
                                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28301, new Class[]{Object.class}, Object.class);
                                            if (patchProxyResultProxy.isSupported) {
                                                return patchProxyResultProxy.result;
                                            }
                                            a(result);
                                            return b2.f124493a;
                                        }
                                    });
                                    return;
                                }
                                if (f0.g("3", bbsUserMsgObj.getFollow_status())) {
                                    Activity activityU5 = MessageCenterFragment.u4(messageCenterFragment3);
                                    String string4 = messageCenterFragment3.getString(R.string.cancel_follow_user_confirm);
                                    String string5 = messageCenterFragment3.getString(R.string.confirm);
                                    String string6 = messageCenterFragment3.getString(R.string.cancel);
                                    final BBSUserMsgObj bBSUserMsgObj4 = bbsUserMsgObj;
                                    final MessageCenterFragment messageCenterFragment7 = messageCenterFragment3;
                                    com.max.xiaoheihe.view.l.D(activityU5, string4, "", string5, string6, new m() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$initViews$msgListAdapter$1$onBindViewHolder$3.4
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        @Override // com.max.xiaoheihe.view.m
                                        public void a(@dl.d Dialog dialog) {
                                            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 28303, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                                                return;
                                            }
                                            f0.p(dialog, "dialog");
                                            dialog.dismiss();
                                            l.f66572a.o("0", "message", bBSUserMsgObj4.getUserid_a());
                                            MessageCenterFragmentVM messageCenterFragmentVMT6 = MessageCenterFragment.t4(messageCenterFragment7);
                                            String userid_a3 = bBSUserMsgObj4.getUserid_a();
                                            f0.o(userid_a3, "bbsUserMsgObj.userid_a");
                                            final MessageCenterFragment messageCenterFragment8 = messageCenterFragment7;
                                            final BBSUserMsgObj bBSUserMsgObj5 = bBSUserMsgObj4;
                                            messageCenterFragmentVMT6.x(userid_a3, new yh.l<Result<?>, b2>() { // from class: com.max.xiaoheihe.module.bbs.messagecenter.MessageCenterFragment$initViews$msgListAdapter$1$onBindViewHolder$3$4$onPositiveClick$1
                                                public static ChangeQuickRedirect changeQuickRedirect;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public final void a(@dl.d Result<?> result) {
                                                    if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28304, new Class[]{Result.class}, Void.TYPE).isSupported) {
                                                        return;
                                                    }
                                                    f0.p(result, "result");
                                                    if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                                                        com.max.hbutils.utils.c.f(messageCenterFragment8.getString(R.string.success));
                                                    } else {
                                                        com.max.hbutils.utils.c.f(result.getMsg());
                                                    }
                                                    if (f0.g("3", bBSUserMsgObj5.getFollow_status())) {
                                                        bBSUserMsgObj5.setFollow_status("2");
                                                    } else {
                                                        bBSUserMsgObj5.setFollow_status("0");
                                                    }
                                                    t tVar = messageCenterFragment8.M;
                                                    f0.m(tVar);
                                                    tVar.notifyDataSetChanged();
                                                }

                                                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                                                @Override // yh.l
                                                public /* bridge */ /* synthetic */ b2 invoke(Result<?> result) {
                                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28305, new Class[]{Object.class}, Object.class);
                                                    if (patchProxyResultProxy.isSupported) {
                                                        return patchProxyResultProxy.result;
                                                    }
                                                    a(result);
                                                    return b2.f124493a;
                                                }
                                            });
                                        }

                                        @Override // com.max.xiaoheihe.view.m
                                        public void b(@dl.d Dialog dialog) {
                                            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 28302, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                                                return;
                                            }
                                            f0.p(dialog, "dialog");
                                            dialog.dismiss();
                                        }
                                    });
                                }
                            }
                        });
                    }
                }
            }

            @Override // com.max.xiaoheihe.module.bbs.adapter.n, com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
                if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 28286, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                C(eVar, (BBSUserMsgObj) obj);
            }
        };
        nVar.K(new d());
        this.M = new t(nVar);
        nVar.J(new e());
        B4().f131840c.f131495b.setLayoutManager(new LinearLayoutManager(getParentActivity(), 1, false));
        RecyclerView recyclerView = B4().f131840c.f131495b;
        f0.o(recyclerView, "binding.srl.rv");
        new RecyclerViewItemWatcher(this, recyclerView, new f(), 0, false, 24, null);
        if (kotlin.text.u.L1("2", Y3().A(), true)) {
            B4().f131840c.f131495b.addItemDecoration(new g(getParentActivity(), ViewUtils.f(getParentActivity(), 10.0f)));
            if (com.max.hbcommon.utils.c.u(Y3().B())) {
                B4().f131840c.f131496c.b0(false);
            } else {
                B4().f131840c.f131496c.b0(true);
            }
        } else {
            B4().f131840c.f131496c.b0(true);
        }
        B4().f131840c.f131495b.setAdapter(this.M);
        Y3().k().r(BaseDisplayState.LOADING);
        Y3().F();
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment, com.max.hbcommon.analytics.d.f
    public boolean o3() {
        return true;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment, androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 28257, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        m0.x().q(this);
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28259, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        m0.x().I(this);
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28258, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (com.max.hbcommon.utils.c.u(this.P)) {
            return;
        }
        int size = Y3().E().size();
        for (int i10 = 0; i10 < size; i10++) {
            BBSUserMsgObj bBSUserMsgObj = Y3().E().get(i10);
            f0.o(bBSUserMsgObj, "mViewModel.mUserMsgList[i]");
            BBSUserMsgObj bBSUserMsgObj2 = bBSUserMsgObj;
            BBSUserInfoObj user_a = bBSUserMsgObj2.getUser_a();
            if (f0.g(user_a != null ? user_a.getUserid() : null, this.P)) {
                bBSUserMsgObj2.setCount("0");
                this.P = null;
                t tVar = this.M;
                if (tVar != null) {
                    f0.m(tVar);
                    tVar.notifyItemChanged(tVar.u() + i10);
                    return;
                }
                return;
            }
        }
    }

    @Override // com.max.xiaoheihe.utils.m0.g
    public void s2(@dl.e String str, @dl.e String str2) {
        NotifyPushMessageObj notifyPushMessageObj;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 28263, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (f0.g(BizMessageObj.TYPE_MESSAGE_CENTER_PUSH, str2) && Q.a(Y3().A(), Y3().B())) {
            try {
                BBSUserMsgObj bBSUserMsgObj = (BBSUserMsgObj) com.max.hbutils.utils.k.a(str, BBSUserMsgObj.class);
                if (bBSUserMsgObj != null) {
                    kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new MessageCenterFragment$onReceiveMsg$1$1(this, bBSUserMsgObj, null), 3, null);
                    return;
                }
                return;
            } catch (Throwable th2) {
                Log.e("MessageCenterFragment", "onReceiveMsg error: " + th2.getMessage());
                return;
            }
        }
        if (!f0.g(BizMessageObj.TYPE_PUSH, str2) || Q.a(Y3().A(), Y3().B()) || (notifyPushMessageObj = (NotifyPushMessageObj) com.max.hbutils.utils.k.a(str, NotifyPushMessageObj.class)) == null || !f0.g("notify", notifyPushMessageObj.getType())) {
            return;
        }
        if (f0.g("9", Y3().A()) && f0.g("80", notifyPushMessageObj.getEvent())) {
            Y3().L();
        } else if (f0.g("2", Y3().A())) {
            Y3().L();
        }
    }
}
