package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.UserFriendObj;
import com.max.xiaoheihe.module.account.SendToFriendActivity;
import com.max.xiaoheihe.module.chat.MsgConversationActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: FriendAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nFriendAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendAdapter.kt\ncom/max/xiaoheihe/module/bbs/adapter/FriendAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,346:1\n262#2,2:347\n262#2,2:349\n*S KotlinDebug\n*F\n+ 1 FriendAdapter.kt\ncom/max/xiaoheihe/module/bbs/adapter/FriendAdapter\n*L\n75#1:347,2\n110#1:349,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class h extends com.max.hbcommon.base.adapter.s<UserFriendObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f80470g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f80471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f80472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final String f80473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private final String f80474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f80475f;

    /* JADX INFO: compiled from: FriendAdapter.kt */
    public static final class a extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UserFriendObj f80477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f80478d;

        a(com.max.hbcommon.base.adapter.s.e eVar, UserFriendObj userFriendObj, h hVar) {
            this.f80476b = eVar;
            this.f80477c = userFriendObj;
            this.f80478d = hVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            int absoluteAdapterPosition;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27303, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
            com.max.hbcommon.base.adapter.s.e eVar = this.f80476b;
            if (eVar != null) {
                UserFriendObj userFriendObj = this.f80477c;
                h hVar = this.f80478d;
                if (userFriendObj == null || (absoluteAdapterPosition = eVar.getAbsoluteAdapterPosition()) < 0 || absoluteAdapterPosition >= hVar.getDataList().size()) {
                    return;
                }
                userFriendObj.setFriend_state("2");
                hVar.notifyItemChanged(absoluteAdapterPosition);
            }
        }
    }

    /* JADX INFO: compiled from: FriendAdapter.kt */
    public static final class b extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f80480c;

        b(com.max.hbcommon.base.adapter.s.e eVar, h hVar) {
            this.f80479b = eVar;
            this.f80480c = hVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27304, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
            com.max.hbcommon.base.adapter.s.e eVar = this.f80479b;
            if (eVar != null) {
                h hVar = this.f80480c;
                int absoluteAdapterPosition = eVar.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition < 0 || absoluteAdapterPosition >= hVar.getDataList().size()) {
                    return;
                }
                hVar.getDataList().remove(absoluteAdapterPosition);
                hVar.notifyItemRemoved(absoluteAdapterPosition);
            }
        }
    }

    /* JADX INFO: compiled from: FriendAdapter.kt */
    public static final class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f80481b = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: FriendAdapter.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UserFriendObj f80482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f80483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80484d;

        d(UserFriendObj userFriendObj, h hVar, com.max.hbcommon.base.adapter.s.e eVar) {
            this.f80482b = userFriendObj;
            this.f80483c = hVar;
            this.f80484d = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27305, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f80482b.set_send(Boolean.TRUE);
            this.f80483c.notifyItemChanged(this.f80484d.getAbsoluteAdapterPosition());
            this.f80483c.t(this.f80482b.getUser_id());
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("user_id", this.f80482b.getUser_id());
            jsonObject.addProperty("msg", this.f80483c.p());
            jsonObject.addProperty(SendToFriendActivity.R, this.f80483c.q());
            com.max.hbcommon.analytics.d.d("4", lb.d.Q4, null, jsonObject);
        }
    }

    /* JADX INFO: compiled from: FriendAdapter.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UserFriendObj f80486c;

        e(UserFriendObj userFriendObj) {
            this.f80486c = userFriendObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27306, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MsgConversationActivity.R1(h.this.o(), this.f80486c.getUser_id(), this.f80486c.getNickname());
        }
    }

    /* JADX INFO: compiled from: FriendAdapter.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UserFriendObj f80487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f80488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80489d;

        /* JADX INFO: compiled from: FriendAdapter.kt */
        public static final class a implements HeyBoxPopupMenu.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f80490a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f80491b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ UserFriendObj f80492c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f80493d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80494e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f80495f;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.h$f$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: FriendAdapter.kt */
            public static final class DialogInterfaceOnClickListenerC0681a implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ EditText f80496b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ h f80497c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ UserFriendObj f80498d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80499e;

                DialogInterfaceOnClickListenerC0681a(EditText editText, h hVar, UserFriendObj userFriendObj, com.max.hbcommon.base.adapter.s.e eVar) {
                    this.f80496b = editText;
                    this.f80497c = hVar;
                    this.f80498d = userFriendObj;
                    this.f80499e = eVar;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 27309, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    String string = this.f80496b.getText().toString();
                    if (com.max.hbcommon.utils.c.u(string)) {
                        return;
                    }
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    this.f80497c.u(this.f80498d, this.f80499e, string);
                    this.f80497c.notifyItemChanged(this.f80499e.getAbsoluteAdapterPosition());
                }
            }

            /* JADX INFO: compiled from: FriendAdapter.kt */
            public static final class b implements DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final b f80500b = new b();
                public static ChangeQuickRedirect changeQuickRedirect;

                b() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 27310, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported || dialogInterface == null) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }

            /* JADX INFO: compiled from: FriendAdapter.kt */
            public static final class c implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ h f80501b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ UserFriendObj f80502c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80503d;

                c(h hVar, UserFriendObj userFriendObj, com.max.hbcommon.base.adapter.s.e eVar) {
                    this.f80501b = hVar;
                    this.f80502c = userFriendObj;
                    this.f80503d = eVar;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 27311, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    this.f80501b.v(this.f80502c, this.f80503d);
                }
            }

            /* JADX INFO: compiled from: FriendAdapter.kt */
            public static final class d implements DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final d f80504b = new d();
                public static ChangeQuickRedirect changeQuickRedirect;

                d() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 27312, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported || dialogInterface == null) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }

            /* JADX INFO: compiled from: FriendAdapter.kt */
            public static final class e implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ h f80505b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ UserFriendObj f80506c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80507d;

                e(h hVar, UserFriendObj userFriendObj, com.max.hbcommon.base.adapter.s.e eVar) {
                    this.f80505b = hVar;
                    this.f80506c = userFriendObj;
                    this.f80507d = eVar;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 27313, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    this.f80505b.n(this.f80506c.getUser_id(), this.f80507d);
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.h$f$a$f, reason: collision with other inner class name */
            /* JADX INFO: compiled from: FriendAdapter.kt */
            public static final class DialogInterfaceOnClickListenerC0682f implements DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final DialogInterfaceOnClickListenerC0682f f80508b = new DialogInterfaceOnClickListenerC0682f();
                public static ChangeQuickRedirect changeQuickRedirect;

                DialogInterfaceOnClickListenerC0682f() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 27314, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported || dialogInterface == null) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }

            a(String str, h hVar, UserFriendObj userFriendObj, String str2, com.max.hbcommon.base.adapter.s.e eVar, String str3) {
                this.f80490a = str;
                this.f80491b = hVar;
                this.f80492c = userFriendObj;
                this.f80493d = str2;
                this.f80494e = eVar;
                this.f80495f = str3;
            }

            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public final void a(View view, KeyDescObj keyDescObj) {
                if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 27308, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                String key = keyDescObj.getKey();
                if (f0.g(key, this.f80490a)) {
                    EditText editTextI = com.max.xiaoheihe.module.bbs.utils.b.i(this.f80491b.o());
                    editTextI.setHint(com.max.xiaoheihe.utils.d.n0(R.string.set_remark_tip));
                    editTextI.setText(this.f80492c.getRemarks());
                    new com.max.hbcommon.view.a.f(this.f80491b.o()).x(R.string.set_remark).i(editTextI).t(R.string.save, new DialogInterfaceOnClickListenerC0681a(editTextI, this.f80491b, this.f80492c, this.f80494e)).n(R.string.cancel, b.f80500b).F();
                    return;
                }
                if (!f0.g(key, this.f80493d)) {
                    if (f0.g(key, this.f80495f)) {
                        new com.max.hbcommon.view.a.f(this.f80491b.o()).x(R.string.delete_friend_tips).t(R.string.delete, new e(this.f80491b, this.f80492c, this.f80494e)).n(R.string.cancel, DialogInterfaceOnClickListenerC0682f.f80508b).F();
                    }
                } else {
                    if (!com.max.hbcommon.utils.c.x(this.f80492c.getView_state())) {
                        this.f80491b.v(this.f80492c, this.f80494e);
                        return;
                    }
                    com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f80491b.o());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("对 ");
                    sb2.append(!com.max.hbcommon.utils.c.u(this.f80492c.getRemarks()) ? this.f80492c.getRemarks() : this.f80492c.getNickname());
                    sb2.append(" 隐身");
                    fVar.y(sb2.toString()).k(R.string.hide_to_user_tips).t(R.string.hide_to_user, new c(this.f80491b, this.f80492c, this.f80494e)).n(R.string.cancel, d.f80504b).F();
                }
            }
        }

        f(UserFriendObj userFriendObj, h hVar, com.max.hbcommon.base.adapter.s.e eVar) {
            this.f80487b = userFriendObj;
            this.f80488c = hVar;
            this.f80489d = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27307, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setKey("remark");
            keyDescObj.setDesc(com.max.xiaoheihe.utils.d.n0(R.string.set_remark));
            keyDescObj.setColor(com.max.xiaoheihe.utils.d.m(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)));
            arrayList.add(keyDescObj);
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setKey("hide");
            keyDescObj2.setDesc(com.max.xiaoheihe.utils.d.n0(com.max.hbcommon.utils.c.x(this.f80487b.getView_state()) ? R.string.hide_to_user : R.string.cancel_hide_to_user));
            keyDescObj2.setColor(com.max.xiaoheihe.utils.d.m(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)));
            arrayList.add(keyDescObj2);
            KeyDescObj keyDescObj3 = new KeyDescObj();
            keyDescObj3.setDesc(com.max.xiaoheihe.utils.d.n0(R.string.delete_friend));
            keyDescObj3.setKey(org.apache.tools.ant.taskdefs.optional.j2ee.c.f135155a);
            keyDescObj3.setColor(com.max.xiaoheihe.utils.d.m(com.max.xiaoheihe.utils.d.E(R.color.delete_red)));
            arrayList.add(keyDescObj3);
            HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.f80488c.o(), arrayList);
            heyBoxPopupMenu.R(new a("remark", this.f80488c, this.f80487b, "hide", this.f80489d, org.apache.tools.ant.taskdefs.optional.j2ee.c.f135155a));
            heyBoxPopupMenu.Y(true);
            heyBoxPopupMenu.show();
        }
    }

    /* JADX INFO: compiled from: FriendAdapter.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UserFriendObj f80510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80511d;

        g(UserFriendObj userFriendObj, com.max.hbcommon.base.adapter.s.e eVar) {
            this.f80510c = userFriendObj;
            this.f80511d = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27315, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            h.this.m(this.f80510c.getUser_id(), this.f80511d, this.f80510c);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FriendAdapter.kt */
    public static final class ViewOnClickListenerC0683h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UserFriendObj f80513c;

        ViewOnClickListenerC0683h(UserFriendObj userFriendObj) {
            this.f80513c = userFriendObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27316, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(h.this.o(), this.f80513c.getUser_id()).A();
        }
    }

    /* JADX INFO: compiled from: FriendAdapter.kt */
    public static final class i extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UserFriendObj f80515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f80516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f80517e;

        i(com.max.hbcommon.base.adapter.s.e eVar, UserFriendObj userFriendObj, String str, h hVar) {
            this.f80514b = eVar;
            this.f80515c = userFriendObj;
            this.f80516d = str;
            this.f80517e = hVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 27317, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            UserFriendObj userFriendObj = (UserFriendObj) this.f80514b.g();
            if (f0.g(userFriendObj != null ? userFriendObj.getUser_id() : null, this.f80515c.getUser_id())) {
                this.f80515c.setRemarks(this.f80516d);
                this.f80517e.notifyItemChanged(this.f80514b.getAbsoluteAdapterPosition());
            }
        }
    }

    /* JADX INFO: compiled from: FriendAdapter.kt */
    public static final class j extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UserFriendObj f80519c;

        j(com.max.hbcommon.base.adapter.s.e eVar, UserFriendObj userFriendObj) {
            this.f80518b = eVar;
            this.f80519c = userFriendObj;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 27318, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            UserFriendObj userFriendObj = (UserFriendObj) this.f80518b.g();
            if (f0.g(userFriendObj != null ? userFriendObj.getUser_id() : null, this.f80519c.getUser_id())) {
                UserFriendObj userFriendObj2 = this.f80519c;
                userFriendObj2.setView_state(com.max.hbcommon.utils.c.x(userFriendObj2.getView_state()) ? "0" : "1");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@dl.d Context context, @dl.d List<UserFriendObj> dataList, boolean z10, @dl.e String str, @dl.e String str2) {
        super(context, dataList, R.layout.item_friend);
        f0.p(context, "context");
        f0.p(dataList, "dataList");
        this.f80471b = context;
        this.f80472c = z10;
        this.f80473d = str;
        this.f80474e = str2;
        this.f80475f = !com.max.hbcommon.utils.c.v(str, str2);
    }

    public /* synthetic */ h(Context context, List list, boolean z10, String str, String str2, int i10, kotlin.jvm.internal.u uVar) {
        this(context, list, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2);
    }

    public final void m(@dl.e String str, @dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e UserFriendObj userFriendObj) {
        if (PatchProxy.proxy(new Object[]{str, eVar, userFriendObj}, this, changeQuickRedirect, false, 27299, new Class[]{String.class, com.max.hbcommon.base.adapter.s.e.class, UserFriendObj.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
    }

    public final void n(@dl.e String str, @dl.e com.max.hbcommon.base.adapter.s.e eVar) {
        if (PatchProxy.proxy(new Object[]{str, eVar}, this, changeQuickRedirect, false, 27300, new Class[]{String.class, com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
    }

    @dl.d
    public final Context o() {
        return this.f80471b;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, UserFriendObj userFriendObj) {
        if (PatchProxy.proxy(new Object[]{eVar, userFriendObj}, this, changeQuickRedirect, false, 27302, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        s(eVar, userFriendObj);
    }

    @dl.e
    public final String p() {
        return this.f80473d;
    }

    @dl.e
    public final String q() {
        return this.f80474e;
    }

    public final boolean r() {
        return this.f80472c;
    }

    public void s(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e UserFriendObj userFriendObj) {
        if (PatchProxy.proxy(new Object[]{eVar, userFriendObj}, this, changeQuickRedirect, false, 27296, new Class[]{com.max.hbcommon.base.adapter.s.e.class, UserFriendObj.class}, Void.TYPE).isSupported || eVar == null || userFriendObj == null) {
            return;
        }
        eVar.o(userFriendObj);
        View viewI = eVar.i(R.id.avatar);
        f0.o(viewI, "viewHolder.getView(R.id.avatar)");
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) viewI;
        View viewI2 = eVar.i(R.id.tv_name);
        f0.o(viewI2, "viewHolder.getView(R.id.tv_name)");
        TextView textView = (TextView) viewI2;
        View viewI3 = eVar.i(R.id.tv_state);
        f0.o(viewI3, "viewHolder.getView(R.id.tv_state)");
        TextView textView2 = (TextView) viewI3;
        View viewI4 = eVar.i(R.id.tv_action);
        f0.o(viewI4, "viewHolder.getView(R.id.tv_action)");
        TextView textView3 = (TextView) viewI4;
        View viewI5 = eVar.i(R.id.iv_action);
        f0.o(viewI5, "viewHolder.getView(R.id.iv_action)");
        ImageView imageView = (ImageView) viewI5;
        View viewI6 = eVar.i(R.id.iv_action_icon);
        f0.o(viewI6, "viewHolder.getView(R.id.iv_action_icon)");
        ImageView imageView2 = (ImageView) viewI6;
        View viewI7 = eVar.i(R.id.vg_action);
        f0.o(viewI7, "viewHolder.getView(R.id.vg_action)");
        ViewGroup viewGroup = (ViewGroup) viewI7;
        heyBoxAvatarView.setAvatar(userFriendObj.getAvatar(), userFriendObj.getAvatar_decoration());
        heyBoxAvatarView.setOnlineState(userFriendObj.getState());
        textView.setText(!com.max.hbcommon.utils.c.u(userFriendObj.getRemarks()) ? userFriendObj.getRemarks() : userFriendObj.getNickname());
        int iO = ViewUtils.o(this.f80471b, textView3);
        if (this.f80472c) {
            if (f0.g(userFriendObj.getState(), "0") || userFriendObj.getState() == null) {
                textView2.setText(R.string.offline);
                textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            } else {
                textView2.setText(userFriendObj.getOnline_desc());
                textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.correct_color));
            }
            imageView2.setVisibility(8);
            viewGroup.setBackground(ViewUtils.G(iO, com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color)));
            if (this.f80475f) {
                imageView.setVisibility(8);
                if (f0.g(userFriendObj.is_send(), Boolean.TRUE)) {
                    textView3.setText("已发送");
                    textView3.setTextColor(com.max.xiaoheihe.accelworld.l.h(textView3.getContext(), R.color.text_secondary_1_color));
                    com.max.xiaoheihe.accelworld.l.q(viewGroup, R.color.divider_secondary_1_color, 3.0f);
                    viewGroup.setOnClickListener(c.f80481b);
                } else {
                    textView3.setText("发送");
                    textView3.setTextColor(com.max.xiaoheihe.accelworld.l.h(textView3.getContext(), R.color.background_layer_2_color));
                    com.max.xiaoheihe.accelworld.l.q(viewGroup, R.color.text_primary_1_color, 3.0f);
                    viewGroup.setOnClickListener(new d(userFriendObj, this, eVar));
                }
            } else {
                textView3.setTextColor(this.f80471b.getResources().getColor(R.color.text_secondary_1_color));
                textView3.setText(R.string.message);
                viewGroup.setOnClickListener(new e(userFriendObj));
                imageView.setVisibility(0);
                imageView.setOnClickListener(new f(userFriendObj, this, eVar));
            }
        } else {
            imageView.setVisibility(8);
            textView2.setText(userFriendObj.getMessage());
            String friend_state = userFriendObj.getFriend_state();
            if (f0.g(friend_state, "1")) {
                imageView2.setVisibility(8);
                viewGroup.setBackground(ViewUtils.G(iO, com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color)));
                textView3.setTextColor(this.f80471b.getResources().getColor(R.color.text_secondary_1_color));
                textView3.setText(R.string.added);
                viewGroup.setOnClickListener(null);
            } else if (f0.g(friend_state, "2")) {
                imageView2.setVisibility(8);
                viewGroup.setBackground(ViewUtils.G(iO, com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color)));
                textView3.setTextColor(this.f80471b.getResources().getColor(R.color.text_secondary_1_color));
                textView3.setText("等待验证");
                viewGroup.setOnClickListener(null);
            } else {
                imageView2.setVisibility(0);
                viewGroup.setBackground(ViewUtils.G(iO, com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)));
                int color = this.f80471b.getResources().getColor(R.color.background_layer_2_color);
                textView3.setTextColor(color);
                imageView2.setColorFilter(color);
                imageView2.setImageResource(R.drawable.common_add_line_24x24);
                textView3.setText(R.string.add);
                viewGroup.setOnClickListener(new g(userFriendObj, eVar));
            }
        }
        if (textView2.getText() == null || textView2.getText().length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
        eVar.itemView.setOnClickListener(new ViewOnClickListenerC0683h(userFriendObj));
    }

    public final void t(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27301, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
    }

    public final void u(@dl.e UserFriendObj userFriendObj, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{userFriendObj, viewHolder, str}, this, changeQuickRedirect, false, 27298, new Class[]{UserFriendObj.class, com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        if (userFriendObj == null || userFriendObj.getUser_id() == null) {
            return;
        }
        String remarks = userFriendObj.getRemarks();
        userFriendObj.setRemarks(str);
    }

    public final void v(@dl.e UserFriendObj userFriendObj, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder) {
        if (PatchProxy.proxy(new Object[]{userFriendObj, viewHolder}, this, changeQuickRedirect, false, 27297, new Class[]{UserFriendObj.class, com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        if (userFriendObj == null || userFriendObj.getUser_id() == null) {
            return;
        }
        userFriendObj.setView_state(com.max.hbcommon.utils.c.x(userFriendObj.getView_state()) ? "0" : "1");
    }
}
