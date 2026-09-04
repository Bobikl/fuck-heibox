package com.max.xiaoheihe.module.bbs.messagecenter;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgObj;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgResult;
import com.max.xiaoheihe.bean.bbs.ForbidReasonResult;
import com.max.xiaoheihe.module.bbs.adapter.n;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;
import mb.z0;
import xh.m;

/* JADX INFO: compiled from: UserCommentsFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class d extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final a f81371g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f81372h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z0 f81373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f81374c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n f81376e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private ArrayList<BBSUserMsgObj> f81375d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private String f81377f = "-1";

    /* JADX INFO: compiled from: UserCommentsFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final d a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28453, new Class[0], d.class);
            if (patchProxyResultProxy.isSupported) {
                return (d) patchProxyResultProxy.result;
            }
            d dVar = new d();
            dVar.setArguments(new Bundle());
            return dVar;
        }
    }

    /* JADX INFO: compiled from: UserCommentsFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81379c;

        b(String str) {
            this.f81379c = str;
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28454, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (d.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(d.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                Iterator it = d.this.f81375d.iterator();
                f0.o(it, "dataList.iterator()");
                while (it.hasNext()) {
                    if (f0.g(this.f81379c, ((BBSUserMsgObj) it.next()).getComment_id())) {
                        it.remove();
                        n nVar = d.this.f81376e;
                        if (nVar == null) {
                            f0.S("adapter");
                            nVar = null;
                        }
                        nVar.notifyDataSetChanged();
                        return;
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28455, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: UserCommentsFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f81382d;

        c(String str, String str2) {
            this.f81381c = str;
            this.f81382d = str2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28456, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            if (d.this.isActive()) {
                com.max.hbutils.utils.c.f(f0.g("1", this.f81381c) ? "插眼失败，请稍后再试" : "取消插眼失败，请稍后再试");
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28457, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (d.this.isActive()) {
                if (!com.max.hbcommon.utils.c.w(d.this.f81375d)) {
                    for (BBSUserMsgObj bBSUserMsgObj : d.this.f81375d) {
                        if (f0.g(this.f81382d, bBSUserMsgObj.getComment_id())) {
                            bBSUserMsgObj.setIs_cy(this.f81381c);
                            break;
                        }
                    }
                }
                n nVar = d.this.f81376e;
                if (nVar == null) {
                    f0.S("adapter");
                    nVar = null;
                }
                nVar.notifyDataSetChanged();
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    return;
                }
                com.max.hbutils.utils.c.f(result.getMsg());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28458, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.messagecenter.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: UserCommentsFragment.kt */
    public static final class C0700d extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0700d() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28459, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (d.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(d.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28460, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: UserCommentsFragment.kt */
    public static final class e extends com.max.hbcommon.network.d<BBSUserMsgResult<List<? extends BBSUserMsgObj>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void a(@dl.d BBSUserMsgResult<List<BBSUserMsgObj>> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28463, new Class[]{BBSUserMsgResult.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (d.this.isActive()) {
                super.onNext(result);
                List<BBSUserMsgObj> result2 = result.getResult();
                if (result2 != null) {
                    for (BBSUserMsgObj bBSUserMsgObj : result2) {
                        bBSUserMsgObj.setUser_a(result.getUser());
                        bBSUserMsgObj.setMessage_type("-2");
                    }
                }
                d.V3(d.this, result2);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28462, new Class[0], Void.TYPE).isSupported && d.this.isActive()) {
                super.onComplete();
                z0 z0Var = d.this.f81373b;
                z0 z0Var2 = null;
                if (z0Var == null) {
                    f0.S("binding");
                    z0Var = null;
                }
                z0Var.f131840c.f131496c.A(0);
                z0 z0Var3 = d.this.f81373b;
                if (z0Var3 == null) {
                    f0.S("binding");
                } else {
                    z0Var2 = z0Var3;
                }
                z0Var2.f131840c.f131496c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28461, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (d.this.isActive()) {
                super.onError(e10);
                d.X3(d.this);
                z0 z0Var = d.this.f81373b;
                z0 z0Var2 = null;
                if (z0Var == null) {
                    f0.S("binding");
                    z0Var = null;
                }
                z0Var.f131840c.f131496c.A(0);
                z0 z0Var3 = d.this.f81373b;
                if (z0Var3 == null) {
                    f0.S("binding");
                } else {
                    z0Var2 = z0Var3;
                }
                z0Var2.f131840c.f131496c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28464, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((BBSUserMsgResult) obj);
        }
    }

    /* JADX INFO: compiled from: UserCommentsFragment.kt */
    public static final class f extends n {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: UserCommentsFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f81386b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f81387c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f81388d;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.messagecenter.d$f$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: UserCommentsFragment.kt */
            public static final class C0701a implements HeyBoxPopupMenu.h {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f81389a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f81390b;

                C0701a(d dVar, String str) {
                    this.f81389a = dVar;
                    this.f81390b = str;
                }

                @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
                public final void a(View view, KeyDescObj keyDescObj) {
                    if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 28468, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (f0.g(org.apache.tools.ant.taskdefs.optional.j2ee.c.f135155a, keyDescObj.getKey())) {
                        d dVar = this.f81389a;
                        String commentId = this.f81390b;
                        f0.o(commentId, "commentId");
                        d.L3(dVar, commentId);
                        return;
                    }
                    if (f0.g("forbid", keyDescObj.getKey())) {
                        d dVar2 = this.f81389a;
                        String strJ = i0.j();
                        f0.o(strJ, "getCurrentUserId()");
                        String commentId2 = this.f81390b;
                        f0.o(commentId2, "commentId");
                        d.Y3(dVar2, strJ, commentId2, "comment");
                    }
                }
            }

            a(d dVar, boolean z10, String str) {
                this.f81386b = dVar;
                this.f81387c = z10;
                this.f81388d = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28467, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                KeyDescObj keyDescObj = new KeyDescObj();
                keyDescObj.setKey(org.apache.tools.ant.taskdefs.optional.j2ee.c.f135155a);
                keyDescObj.setDesc(this.f81386b.getString(R.string.delete));
                arrayList.add(keyDescObj);
                if (this.f81387c) {
                    KeyDescObj keyDescObj2 = new KeyDescObj();
                    keyDescObj2.setKey("forbid");
                    keyDescObj2.setDesc(this.f81386b.getString(R.string.bbs_mute));
                    arrayList.add(keyDescObj2);
                }
                HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(((com.max.hbcommon.base.d) this.f81386b).mContext, arrayList, false);
                heyBoxPopupMenu.R(new C0701a(this.f81386b, this.f81388d));
                heyBoxPopupMenu.show();
            }
        }

        /* JADX INFO: compiled from: UserCommentsFragment.kt */
        public static final class b implements com.max.xiaoheihe.view.popuplist.a.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f81391a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f81392b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f81393c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ BBSUserMsgObj f81394d;

            b(d dVar, String str, String str2, BBSUserMsgObj bBSUserMsgObj) {
                this.f81391a = dVar;
                this.f81392b = str;
                this.f81393c = str2;
                this.f81394d = bBSUserMsgObj;
            }

            @Override // com.max.xiaoheihe.view.popuplist.a.h
            public boolean a(@dl.d View adapterView, @dl.d View contextView, int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{adapterView, contextView, new Integer(i10)}, this, changeQuickRedirect, false, 28469, new Class[]{View.class, View.class, Integer.TYPE}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                f0.p(adapterView, "adapterView");
                f0.p(contextView, "contextView");
                return true;
            }

            @Override // com.max.xiaoheihe.view.popuplist.a.h
            public void b(@dl.d View contextView, int i10, int i11) {
                Object[] objArr = {contextView, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28470, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(contextView, "contextView");
                if (i11 == 0) {
                    com.max.xiaoheihe.utils.d.o(((com.max.hbcommon.base.d) this.f81391a).mContext, com.max.xiaoheihe.module.expression.core.a.f(((com.max.hbcommon.base.d) this.f81391a).mContext, new SpannableStringBuilder(this.f81392b), 0, true));
                    com.max.hbutils.utils.c.f(((com.max.hbcommon.base.d) this.f81391a).mContext.getString(R.string.text_copied));
                    return;
                }
                if (i11 == 1) {
                    d dVar = this.f81391a;
                    String commentId = this.f81393c;
                    f0.o(commentId, "commentId");
                    d.L3(dVar, commentId);
                    return;
                }
                if (!f0.g("1", this.f81394d.getIs_cy())) {
                    d dVar2 = this.f81391a;
                    String commentId2 = this.f81393c;
                    f0.o(commentId2, "commentId");
                    d.M3(dVar2, commentId2, "1");
                    return;
                }
                if (com.max.hbcommon.utils.c.u(this.f81392b)) {
                    d dVar3 = this.f81391a;
                    String commentId3 = this.f81393c;
                    f0.o(commentId3, "commentId");
                    d.W3(dVar3, commentId3);
                    return;
                }
                d dVar4 = this.f81391a;
                String commentId4 = this.f81393c;
                f0.o(commentId4, "commentId");
                d.M3(dVar4, commentId4, "0");
            }

            @Override // com.max.xiaoheihe.view.popuplist.a.h
            public /* synthetic */ void onDismiss() {
                com.max.xiaoheihe.view.popuplist.b.a(this);
            }
        }

        f(Activity activity, ArrayList<BBSUserMsgObj> arrayList) {
            super(activity, arrayList);
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.n
        public void C(@dl.d s.e viewHolder, @dl.d BBSUserMsgObj bbsUserMsgObj) {
            if (PatchProxy.proxy(new Object[]{viewHolder, bbsUserMsgObj}, this, changeQuickRedirect, false, 28465, new Class[]{s.e.class, BBSUserMsgObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(bbsUserMsgObj, "bbsUserMsgObj");
            if (viewHolder.d() == R.layout.item_user_comment) {
                View viewI = viewHolder.i(R.id.tv_text);
                f0.o(viewI, "viewHolder.getView(R.id.tv_text)");
                ExpressionTextView expressionTextView = (ExpressionTextView) viewI;
                expressionTextView.setCustomLineHeight(ViewUtils.f(((com.max.hbcommon.base.d) d.this).mContext, 22.0f));
                expressionTextView.setMaxLines(2);
            }
            super.C(viewHolder, bbsUserMsgObj);
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_not_interested);
            viewHolder.i(R.id.v_placeholder).setVisibility(0);
            imageView.setImageResource(R.drawable.ic_more_20);
            String comment_id = bbsUserMsgObj.getComment_id();
            String text = bbsUserMsgObj.getText();
            View viewB = viewHolder.b();
            boolean zG = f0.g("1", i0.i().getPermission().getBbs_basic_permission());
            if (com.max.hbcommon.utils.c.u(comment_id)) {
                imageView.setVisibility(8);
                viewHolder.b().setLongClickable(false);
                return;
            }
            if (f0.g("-2", bbsUserMsgObj.getMessage_type())) {
                imageView.setVisibility(0);
                imageView.setOnClickListener(new a(d.this, zG, comment_id));
            } else {
                imageView.setVisibility(8);
            }
            com.max.xiaoheihe.view.popuplist.a aVar = new com.max.xiaoheihe.view.popuplist.a(((com.max.hbcommon.base.d) d.this).mContext);
            ArrayList arrayList = new ArrayList();
            String string = d.this.getString(R.string.copy);
            f0.o(string, "getString(R.string.copy)");
            arrayList.add(string);
            String string2 = d.this.getString(R.string.delete);
            f0.o(string2, "getString(R.string.delete)");
            arrayList.add(string2);
            if (f0.g("1", bbsUserMsgObj.getIs_cy())) {
                arrayList.add("取消插眼");
            } else {
                arrayList.add("插眼");
            }
            aVar.q(viewB, arrayList, new b(d.this, text, comment_id, bbsUserMsgObj));
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.n, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 28466, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            C(eVar, (BBSUserMsgObj) obj);
        }
    }

    /* JADX INFO: compiled from: UserCommentsFragment.kt */
    public static final class g implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 28471, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            d.T3(d.this);
        }
    }

    /* JADX INFO: compiled from: UserCommentsFragment.kt */
    public static final class h implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 28472, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            d.U3(d.this);
        }
    }

    /* JADX INFO: compiled from: UserCommentsFragment.kt */
    public static final class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81398c;

        i(String str) {
            this.f81398c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 28473, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i0.e(((com.max.hbcommon.base.d) d.this).mContext)) {
                d.L3(d.this, this.f81398c);
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: UserCommentsFragment.kt */
    public static final class j implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f81399b = new j();
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 28474, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: UserCommentsFragment.kt */
    public static final class k implements com.max.xiaoheihe.module.bbs.n.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f81401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f81403d;

        /* JADX INFO: compiled from: UserCommentsFragment.kt */
        public static final class a implements RadioGroup.OnCheckedChangeListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f81404a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<RadioButton> f81405b;

            a(View view, Ref.ObjectRef<RadioButton> objectRef) {
                this.f81404a = view;
                this.f81405b = objectRef;
            }

            /* JADX WARN: Type inference failed for: r9v7, types: [T, android.widget.RadioButton, android.widget.TextView] */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                if (PatchProxy.proxy(new Object[]{radioGroup, new Integer(i10)}, this, changeQuickRedirect, false, 28476, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                ?? r10 = (RadioButton) this.f81404a.findViewById(i10);
                RadioButton radioButton = this.f81405b.f124891b;
                if (radioButton != null) {
                    radioButton.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                }
                if (r10 != 0) {
                    r10.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                }
                this.f81405b.f124891b = r10;
            }
        }

        /* JADX INFO: compiled from: UserCommentsFragment.kt */
        public static final class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RadioGroup f81406b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ EditText f81407c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ d f81408d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f81409e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f81410f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f81411g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f81412h;

            b(RadioGroup radioGroup, EditText editText, d dVar, String str, String str2, String str3, String str4) {
                this.f81406b = radioGroup;
                this.f81407c = editText;
                this.f81408d = dVar;
                this.f81409e = str;
                this.f81410f = str2;
                this.f81411g = str3;
                this.f81412h = str4;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                String str;
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 28477, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (this.f81406b.getCheckedRadioButtonId() == R.id.rb_1) {
                    str = "259200";
                } else if (this.f81406b.getCheckedRadioButtonId() == R.id.rb_2) {
                    str = "604800";
                } else {
                    str = this.f81406b.getCheckedRadioButtonId() == R.id.rb_3 ? "1296000" : "86400";
                }
                d.N3(this.f81408d, this.f81409e, this.f81410f, str, null, this.f81411g, this.f81412h, !com.max.hbcommon.utils.c.u(this.f81407c.getText().toString()) ? this.f81407c.getText().toString() : null);
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: UserCommentsFragment.kt */
        public static final class c implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f81413b = new c();
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 28478, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        k(String str, String str2, String str3) {
            this.f81401b = str;
            this.f81402c = str2;
            this.f81403d = str3;
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [T, android.view.View] */
        @Override // com.max.xiaoheihe.module.bbs.n.d
        public final void a(View view, int i10, ForbidReasonResult<List<String>> forbidReasonResult, String str) {
            String str2;
            if (PatchProxy.proxy(new Object[]{view, new Integer(i10), forbidReasonResult, str}, this, changeQuickRedirect, false, 28475, new Class[]{View.class, Integer.TYPE, ForbidReasonResult.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewInflate = ((com.max.hbcommon.base.d) d.this).mInflater.inflate(R.layout.layout_forbid_user, (ViewGroup) null);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            View viewFindViewById = viewInflate.findViewById(R.id.rg_forbid_time);
            f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.RadioGroup");
            RadioGroup radioGroup = (RadioGroup) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.tv_forbid_time_remained);
            f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = viewInflate.findViewById(R.id.et_forbid_comment);
            f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
            EditText editText = (EditText) viewFindViewById3;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? FindViewById = viewInflate.findViewById(radioGroup.getCheckedRadioButtonId());
            objectRef.f124891b = FindViewById;
            RadioButton radioButton = (RadioButton) FindViewById;
            if (radioButton != null) {
                radioButton.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            }
            radioGroup.setOnCheckedChangeListener(new a(viewInflate, objectRef));
            if (forbidReasonResult == null || forbidReasonResult.getForbid_info() == null) {
                str2 = "0";
            } else {
                long jR = com.max.hbutils.utils.n.r(forbidReasonResult.getForbid_info().getRemained_seconds());
                v0 v0Var = v0.f124986a;
                str2 = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(Math.ceil(jR / 86400.0d))}, 1));
                f0.o(str2, "format(locale, format, *args)");
            }
            v0 v0Var2 = v0.f124986a;
            String string = d.this.getString(R.string.forbid_remained);
            f0.o(string, "getString(R.string.forbid_remained)");
            String str3 = String.format(string, Arrays.copyOf(new Object[]{str2}, 1));
            f0.o(str3, "format(format, *args)");
            textView.setText(str3);
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((com.max.hbcommon.base.d) d.this).mContext);
            fVar.y(d.this.getString(R.string.please_choose_forbid_time)).i(viewInflate).u(d.this.getString(R.string.bbs_mute), new b(radioGroup, editText, d.this, this.f81401b, str, this.f81402c, this.f81403d)).o(d.this.getString(R.string.cancel), c.f81413b);
            fVar.F();
        }
    }

    public static final /* synthetic */ void L3(d dVar, String str) {
        if (PatchProxy.proxy(new Object[]{dVar, str}, null, changeQuickRedirect, true, 28444, new Class[]{d.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.Z3(str);
    }

    public static final /* synthetic */ void M3(d dVar, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{dVar, str, str2}, null, changeQuickRedirect, true, 28447, new Class[]{d.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.a4(str, str2);
    }

    public static final /* synthetic */ void N3(d dVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (PatchProxy.proxy(new Object[]{dVar, str, str2, str3, str4, str5, str6, str7}, null, changeQuickRedirect, true, 28452, new Class[]{d.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.b4(str, str2, str3, str4, str5, str6, str7);
    }

    public static final /* synthetic */ void T3(d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, null, changeQuickRedirect, true, 28448, new Class[]{d.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.d4();
    }

    public static final /* synthetic */ void U3(d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, null, changeQuickRedirect, true, 28449, new Class[]{d.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.f4();
    }

    public static final /* synthetic */ void V3(d dVar, List list) {
        if (PatchProxy.proxy(new Object[]{dVar, list}, null, changeQuickRedirect, true, 28451, new Class[]{d.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.g4(list);
    }

    public static final /* synthetic */ void W3(d dVar, String str) {
        if (PatchProxy.proxy(new Object[]{dVar, str}, null, changeQuickRedirect, true, 28446, new Class[]{d.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.h4(str);
    }

    public static final /* synthetic */ void X3(d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, null, changeQuickRedirect, true, 28450, new Class[]{d.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.showError();
    }

    public static final /* synthetic */ void Y3(d dVar, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{dVar, str, str2, str3}, null, changeQuickRedirect, true, 28445, new Class[]{d.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.i4(str, str2, str3);
    }

    private final void Z3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28438, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().d4(str, new HashMap(16)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str)));
    }

    private final void a4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 28439, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().C3(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(str2, str)));
    }

    private final void b4(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 28442, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().n6(str, str2, str3, str4, str5, str6, str7).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0700d()));
    }

    private final void c4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28435, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().V5(this.f81377f, this.f81374c, 30, "0").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private final void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28434, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f81374c += 30;
        c4();
    }

    @dl.d
    @m
    public static final d e4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 28443, new Class[0], d.class);
        return patchProxyResultProxy.isSupported ? (d) patchProxyResultProxy.result : f81371g.a();
    }

    private final void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28433, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f81374c = 0;
        c4();
    }

    private final void g4(List<? extends BBSUserMsgObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 28436, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            if (this.f81374c == 0) {
                this.f81375d.clear();
            }
            this.f81375d.addAll(list);
            n nVar = this.f81376e;
            if (nVar == null) {
                f0.S("adapter");
                nVar = null;
            }
            nVar.notifyDataSetChanged();
        }
        j4(this.f81375d, R.drawable.common_tag_message_46x45, R.string.no_comment);
    }

    private final void h4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28440, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.mContext).l("当前评论内容为空，是否直接删除评论？").t(R.string.yes, new i(str)).n(R.string.no, j.f81399b).d().show();
    }

    private final void i4(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 28441, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.bbs.n.V3(str, new k(str, str2, str3)).show(getChildFragmentManager(), "ForbidReasonFragment");
    }

    private final void j4(List<?> list, int i10, int i11) {
        Object[] objArr = {list, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28437, new Class[]{List.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        z0 z0Var = null;
        if (!list.isEmpty()) {
            z0 z0Var2 = this.f81373b;
            if (z0Var2 == null) {
                f0.S("binding");
                z0Var2 = null;
            }
            z0Var2.f131839b.b().setVisibility(8);
            z0 z0Var3 = this.f81373b;
            if (z0Var3 == null) {
                f0.S("binding");
                z0Var3 = null;
            }
            z0Var3.f131840c.f131496c.i0(true);
            z0 z0Var4 = this.f81373b;
            if (z0Var4 == null) {
                f0.S("binding");
            } else {
                z0Var = z0Var4;
            }
            z0Var.f131840c.f131496c.b0(true);
            return;
        }
        z0 z0Var5 = this.f81373b;
        if (z0Var5 == null) {
            f0.S("binding");
            z0Var5 = null;
        }
        z0Var5.f131840c.f131496c.i0(false);
        z0 z0Var6 = this.f81373b;
        if (z0Var6 == null) {
            f0.S("binding");
            z0Var6 = null;
        }
        z0Var6.f131840c.f131496c.b0(false);
        z0 z0Var7 = this.f81373b;
        if (z0Var7 == null) {
            f0.S("binding");
            z0Var7 = null;
        }
        z0Var7.f131839b.b().setVisibility(0);
        z0 z0Var8 = this.f81373b;
        if (z0Var8 == null) {
            f0.S("binding");
            z0Var8 = null;
        }
        ImageView imageView = z0Var8.f131839b.f131708c;
        f0.o(imageView, "binding.rvEmptyView.ivEmpty");
        z0 z0Var9 = this.f81373b;
        if (z0Var9 == null) {
            f0.S("binding");
            z0Var9 = null;
        }
        TextView textView = z0Var9.f131839b.f131709d;
        f0.o(textView, "binding.rvEmptyView.tvEmpty");
        imageView.setImageResource(i10);
        textView.setText(i11);
        z0 z0Var10 = this.f81373b;
        if (z0Var10 == null) {
            f0.S("binding");
            z0Var10 = null;
        }
        ViewGroup.LayoutParams layoutParams = z0Var10.f131839b.b().getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, ViewUtils.f(this.mContext, 4.0f), 0, 0);
        z0 z0Var11 = this.f81373b;
        if (z0Var11 == null) {
            f0.S("binding");
        } else {
            z0Var = z0Var11;
        }
        z0Var.f131839b.b().setLayoutParams(layoutParams2);
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28431, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        z0 z0VarC = z0.c(this.mInflater);
        f0.o(z0VarC, "inflate(mInflater)");
        this.f81373b = z0VarC;
        z0 z0Var = null;
        if (z0VarC == null) {
            f0.S("binding");
            z0VarC = null;
        }
        setContentView(z0VarC);
        String strJ = i0.j();
        f0.o(strJ, "getCurrentUserId()");
        this.f81377f = strJ;
        this.f81376e = new f(this.mContext, this.f81375d);
        z0 z0Var2 = this.f81373b;
        if (z0Var2 == null) {
            f0.S("binding");
            z0Var2 = null;
        }
        z0Var2.f131840c.f131495b.setLayoutManager(new LinearLayoutManager(this.mContext));
        z0 z0Var3 = this.f81373b;
        if (z0Var3 == null) {
            f0.S("binding");
            z0Var3 = null;
        }
        RecyclerView recyclerView = z0Var3.f131840c.f131495b;
        n nVar = this.f81376e;
        if (nVar == null) {
            f0.S("adapter");
            nVar = null;
        }
        recyclerView.setAdapter(nVar);
        z0 z0Var4 = this.f81373b;
        if (z0Var4 == null) {
            f0.S("binding");
            z0Var4 = null;
        }
        z0Var4.f131840c.f131495b.addItemDecoration(new com.max.hbcommon.base.adapter.i(getContext(), ViewUtils.f(getContext(), 12.0f), ViewUtils.f(getContext(), 12.0f)));
        z0 z0Var5 = this.f81373b;
        if (z0Var5 == null) {
            f0.S("binding");
            z0Var5 = null;
        }
        z0Var5.f131840c.f131496c.f0(new g());
        z0 z0Var6 = this.f81373b;
        if (z0Var6 == null) {
            f0.S("binding");
            z0Var6 = null;
        }
        z0Var6.f131840c.f131496c.S(new h());
        showLoading();
        z0 z0Var7 = this.f81373b;
        if (z0Var7 == null) {
            f0.S("binding");
        } else {
            z0Var = z0Var7;
        }
        z0Var.f131840c.f131496c.F();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28432, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        f4();
    }
}
