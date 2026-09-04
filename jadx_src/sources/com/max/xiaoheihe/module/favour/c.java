package com.max.xiaoheihe.module.favour;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import androidx.lifecycle.j0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.mvvm.BaseDisplayState;
import com.max.xiaoheihe.base.mvvm.BaseFragment;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgObj;
import com.max.xiaoheihe.bean.bbs.ForbidReasonResult;
import com.max.xiaoheihe.module.bbs.adapter.n;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;
import mb.z0;

/* JADX INFO: compiled from: CYPageFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = lb.d.A1)
@o(parameters = 0)
public final class c extends BaseFragment<CYPageViewModel> {

    @dl.d
    public static final a P = new a(null);
    public static final int Q = 8;

    @dl.d
    public static final String R = "arg_sort_type";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final Handler L = new Handler(Looper.getMainLooper());
    public z0 M;
    public n N;

    @dl.e
    private String O;

    /* JADX INFO: compiled from: CYPageFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final c a(@dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 31560, new Class[]{String.class}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putString(c.R, str);
            cVar.setArguments(bundle);
            return cVar;
        }
    }

    /* JADX INFO: compiled from: CYPageFragment.kt */
    public static final class b extends n {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: CYPageFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f83853b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f83854c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f83855d;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.favour.c$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: CYPageFragment.kt */
            public static final class C0736a implements HeyBoxPopupMenu.h {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ c f83856a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f83857b;

                C0736a(c cVar, String str) {
                    this.f83856a = cVar;
                    this.f83857b = str;
                }

                @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
                public final void a(View view, KeyDescObj keyDescObj) {
                    if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 31564, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (f0.g(org.apache.tools.ant.taskdefs.optional.j2ee.c.f135155a, keyDescObj.getKey())) {
                        CYPageViewModel cYPageViewModelS4 = c.s4(this.f83856a);
                        Context context = this.f83856a.getContext();
                        f0.m(context);
                        String commentId = this.f83857b;
                        f0.o(commentId, "commentId");
                        cYPageViewModelS4.p(context, commentId);
                        return;
                    }
                    if (f0.g("forbid", keyDescObj.getKey())) {
                        c cVar = this.f83856a;
                        String userid = i0.o().getAccount_detail().getUserid();
                        if (userid == null) {
                            userid = "-1";
                        }
                        String commentId2 = this.f83857b;
                        f0.o(commentId2, "commentId");
                        c.u4(cVar, userid, commentId2, "comment");
                    }
                }
            }

            a(c cVar, boolean z10, String str) {
                this.f83853b = cVar;
                this.f83854c = z10;
                this.f83855d = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31563, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                KeyDescObj keyDescObj = new KeyDescObj();
                keyDescObj.setKey(org.apache.tools.ant.taskdefs.optional.j2ee.c.f135155a);
                keyDescObj.setDesc(this.f83853b.getString(R.string.delete));
                arrayList.add(keyDescObj);
                if (this.f83854c) {
                    KeyDescObj keyDescObj2 = new KeyDescObj();
                    keyDescObj2.setKey("forbid");
                    keyDescObj2.setDesc(this.f83853b.getString(R.string.bbs_mute));
                    arrayList.add(keyDescObj2);
                }
                Context context = this.f83853b.getContext();
                f0.m(context);
                HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(context, arrayList, false);
                heyBoxPopupMenu.R(new C0736a(this.f83853b, this.f83855d));
                heyBoxPopupMenu.show();
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.favour.c$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CYPageFragment.kt */
        public static final class C0737b implements com.max.xiaoheihe.view.popuplist.a.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f83858a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f83859b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f83860c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ BBSUserMsgObj f83861d;

            C0737b(c cVar, String str, String str2, BBSUserMsgObj bBSUserMsgObj) {
                this.f83858a = cVar;
                this.f83859b = str;
                this.f83860c = str2;
                this.f83861d = bBSUserMsgObj;
            }

            @Override // com.max.xiaoheihe.view.popuplist.a.h
            public boolean a(@dl.d View adapterView, @dl.d View contextView, int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{adapterView, contextView, new Integer(i10)}, this, changeQuickRedirect, false, 31565, new Class[]{View.class, View.class, Integer.TYPE}, Boolean.TYPE);
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
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31566, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(contextView, "contextView");
                if (i11 == 0) {
                    com.max.xiaoheihe.utils.d.o(this.f83858a.getContext(), com.max.xiaoheihe.module.expression.core.a.f(this.f83858a.getContext(), new SpannableStringBuilder(this.f83859b), 0, true));
                    Context context = this.f83858a.getContext();
                    f0.m(context);
                    com.max.hbutils.utils.c.f(context.getString(R.string.text_copied));
                    return;
                }
                if (i11 == 1) {
                    CYPageViewModel cYPageViewModelS4 = c.s4(this.f83858a);
                    Context context2 = this.f83858a.getContext();
                    f0.m(context2);
                    String commentId = this.f83860c;
                    f0.o(commentId, "commentId");
                    cYPageViewModelS4.p(context2, commentId);
                    return;
                }
                if (!f0.g("1", this.f83861d.getIs_cy())) {
                    CYPageViewModel cYPageViewModelS5 = c.s4(this.f83858a);
                    String commentId2 = this.f83860c;
                    f0.o(commentId2, "commentId");
                    cYPageViewModelS5.r(commentId2, "1");
                    return;
                }
                if (com.max.hbcommon.utils.c.u(this.f83859b)) {
                    c cVar = this.f83858a;
                    String commentId3 = this.f83860c;
                    f0.o(commentId3, "commentId");
                    c.t4(cVar, commentId3);
                    return;
                }
                CYPageViewModel cYPageViewModelS6 = c.s4(this.f83858a);
                String commentId4 = this.f83860c;
                f0.o(commentId4, "commentId");
                cYPageViewModelS6.r(commentId4, "0");
            }

            @Override // com.max.xiaoheihe.view.popuplist.a.h
            public /* synthetic */ void onDismiss() {
                com.max.xiaoheihe.view.popuplist.b.a(this);
            }
        }

        b(Context context, ArrayList<BBSUserMsgObj> arrayList) {
            super(context, arrayList);
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.n
        public void C(@dl.d s.e viewHolder, @dl.d BBSUserMsgObj bbsUserMsgObj) {
            if (PatchProxy.proxy(new Object[]{viewHolder, bbsUserMsgObj}, this, changeQuickRedirect, false, 31561, new Class[]{s.e.class, BBSUserMsgObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(bbsUserMsgObj, "bbsUserMsgObj");
            if (viewHolder.d() == R.layout.item_user_comment) {
                View viewI = viewHolder.i(R.id.tv_text);
                f0.o(viewI, "viewHolder.getView(R.id.tv_text)");
                ExpressionTextView expressionTextView = (ExpressionTextView) viewI;
                expressionTextView.setCustomLineHeight(ViewUtils.f(c.this.getContext(), 22.0f));
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
                imageView.setOnClickListener(new a(c.this, zG, comment_id));
            } else {
                imageView.setVisibility(8);
            }
            com.max.xiaoheihe.view.popuplist.a aVar = new com.max.xiaoheihe.view.popuplist.a(c.this.getContext());
            ArrayList arrayList = new ArrayList();
            String string = c.this.getString(R.string.copy);
            f0.o(string, "getString(R.string.copy)");
            arrayList.add(string);
            String string2 = c.this.getString(R.string.delete);
            f0.o(string2, "getString(R.string.delete)");
            arrayList.add(string2);
            if (f0.g("1", bbsUserMsgObj.getIs_cy())) {
                arrayList.add("取消插眼");
            } else {
                arrayList.add("插眼");
            }
            aVar.q(viewB, arrayList, new C0737b(c.this, text, comment_id, bbsUserMsgObj));
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.n, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 31562, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            C(eVar, (BBSUserMsgObj) obj);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.favour.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CYPageFragment.kt */
    public static final class C0738c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0738c() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 31567, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            c.s4(c.this).B();
        }
    }

    /* JADX INFO: compiled from: CYPageFragment.kt */
    public static final class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 31568, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            c.s4(c.this).A();
        }
    }

    /* JADX INFO: compiled from: CYPageFragment.kt */
    public static final class e implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 31570, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 31569, new Class[]{Boolean.class}, Void.TYPE).isSupported || bool.booleanValue()) {
                return;
            }
            c.this.w4().f131840c.f131496c.A(0);
            c.this.w4().f131840c.f131496c.p(0);
        }
    }

    /* JADX INFO: compiled from: CYPageFragment.kt */
    public static final class f implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 31572, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 31571, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                return;
            }
            n nVarX4 = c.this.x4();
            if (nVarX4 != null) {
                nVarX4.notifyDataSetChanged();
            }
            c cVar = c.this;
            c.v4(cVar, c.s4(cVar).v(), R.drawable.common_tag_common_45x45, R.string.empty_content);
        }
    }

    /* JADX INFO: compiled from: CYPageFragment.kt */
    public static final class g implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83867c;

        g(String str) {
            this.f83867c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31573, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i0.e(c.this.getContext())) {
                CYPageViewModel cYPageViewModelS4 = c.s4(c.this);
                Context contextRequireContext = c.this.requireContext();
                f0.o(contextRequireContext, "requireContext()");
                cYPageViewModelS4.p(contextRequireContext, this.f83867c);
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: CYPageFragment.kt */
    public static final class h implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f83868b = new h();
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31574, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: CYPageFragment.kt */
    public static final class i implements com.max.xiaoheihe.module.bbs.n.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f83870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f83872d;

        /* JADX INFO: compiled from: CYPageFragment.kt */
        public static final class a implements RadioGroup.OnCheckedChangeListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f83873a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<RadioButton> f83874b;

            a(View view, Ref.ObjectRef<RadioButton> objectRef) {
                this.f83873a = view;
                this.f83874b = objectRef;
            }

            /* JADX WARN: Type inference failed for: r9v7, types: [T, android.widget.RadioButton, android.widget.TextView] */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                if (PatchProxy.proxy(new Object[]{radioGroup, new Integer(i10)}, this, changeQuickRedirect, false, 31576, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                ?? r10 = (RadioButton) this.f83873a.findViewById(i10);
                RadioButton radioButton = this.f83874b.f124891b;
                if (radioButton != null) {
                    radioButton.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                }
                if (r10 != 0) {
                    r10.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                }
                this.f83874b.f124891b = r10;
            }
        }

        /* JADX INFO: compiled from: CYPageFragment.kt */
        public static final class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RadioGroup f83875b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ EditText f83876c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f83877d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f83878e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f83879f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f83880g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f83881h;

            b(RadioGroup radioGroup, EditText editText, c cVar, String str, String str2, String str3, String str4) {
                this.f83875b = radioGroup;
                this.f83876c = editText;
                this.f83877d = cVar;
                this.f83878e = str;
                this.f83879f = str2;
                this.f83880g = str3;
                this.f83881h = str4;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                String str;
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31577, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (this.f83875b.getCheckedRadioButtonId() == R.id.rb_1) {
                    str = "259200";
                } else if (this.f83875b.getCheckedRadioButtonId() == R.id.rb_2) {
                    str = "604800";
                } else {
                    str = this.f83875b.getCheckedRadioButtonId() == R.id.rb_3 ? "1296000" : "86400";
                }
                String str2 = str;
                String string = !com.max.hbcommon.utils.c.u(this.f83876c.getText().toString()) ? this.f83876c.getText().toString() : null;
                CYPageViewModel cYPageViewModelS4 = c.s4(this.f83877d);
                Context contextRequireContext = this.f83877d.requireContext();
                f0.o(contextRequireContext, "requireContext()");
                cYPageViewModelS4.s(contextRequireContext, this.f83878e, this.f83879f, str2, null, this.f83880g, this.f83881h, string);
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.favour.c$i$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CYPageFragment.kt */
        public static final class DialogInterfaceOnClickListenerC0739c implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final DialogInterfaceOnClickListenerC0739c f83882b = new DialogInterfaceOnClickListenerC0739c();
            public static ChangeQuickRedirect changeQuickRedirect;

            DialogInterfaceOnClickListenerC0739c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31578, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        i(String str, String str2, String str3) {
            this.f83870b = str;
            this.f83871c = str2;
            this.f83872d = str3;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, android.view.View] */
        @Override // com.max.xiaoheihe.module.bbs.n.d
        public final void a(View view, int i10, ForbidReasonResult<List<String>> forbidReasonResult, String str) {
            String str2;
            if (PatchProxy.proxy(new Object[]{view, new Integer(i10), forbidReasonResult, str}, this, changeQuickRedirect, false, 31575, new Class[]{View.class, Integer.TYPE, ForbidReasonResult.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewInflate = c.this.getLayoutInflater().inflate(R.layout.layout_forbid_user, (ViewGroup) null);
            f0.o(viewInflate, "layoutInflater.inflate(R…layout_forbid_user, null)");
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
            if (forbidReasonResult == null || forbidReasonResult.getForbid_info() == null) {
                str2 = "0";
            } else {
                long jR = com.max.hbutils.utils.n.r(forbidReasonResult.getForbid_info().getRemained_seconds());
                v0 v0Var = v0.f124986a;
                str2 = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(Math.ceil(jR / 86400.0d))}, 1));
                f0.o(str2, "format(locale, format, *args)");
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? FindViewById = viewInflate.findViewById(radioGroup.getCheckedRadioButtonId());
            objectRef.f124891b = FindViewById;
            RadioButton radioButton = (RadioButton) FindViewById;
            if (radioButton != null) {
                radioButton.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            }
            radioGroup.setOnCheckedChangeListener(new a(viewInflate, objectRef));
            v0 v0Var2 = v0.f124986a;
            String string = c.this.getString(R.string.forbid_remained);
            f0.o(string, "getString(R.string.forbid_remained)");
            String str3 = String.format(string, Arrays.copyOf(new Object[]{str2}, 1));
            f0.o(str3, "format(format, *args)");
            textView.setText(str3);
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(c.this.getContext());
            fVar.y(c.this.getString(R.string.please_choose_forbid_time)).i(viewInflate).u(c.this.getString(R.string.bbs_mute), new b(radioGroup, editText, c.this, this.f83870b, str, this.f83871c, this.f83872d)).o(c.this.getString(R.string.cancel), DialogInterfaceOnClickListenerC0739c.f83882b);
            fVar.F();
        }
    }

    private final void C4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 31553, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(getContext()).l("当前评论内容为空，是否直接删除评论？").t(R.string.yes, new g(str)).n(R.string.no, h.f83868b).d().show();
    }

    private final void D4(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 31552, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.bbs.n.V3(str, new i(str, str2, str3)).show(getParentFragmentManager(), "ForbidReasonFragment");
    }

    private final void E4(List<?> list, int i10, int i11) {
        Object[] objArr = {list, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31550, new Class[]{List.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (!list.isEmpty()) {
            w4().f131839b.b().setVisibility(8);
            w4().f131840c.f131496c.i0(true);
            w4().f131840c.f131496c.b0(true);
            return;
        }
        w4().f131840c.f131496c.i0(false);
        w4().f131840c.f131496c.b0(false);
        w4().f131839b.b().setVisibility(0);
        ImageView imageView = w4().f131839b.f131708c;
        f0.o(imageView, "binding.rvEmptyView.ivEmpty");
        TextView textView = w4().f131839b.f131709d;
        f0.o(textView, "binding.rvEmptyView.tvEmpty");
        imageView.setImageResource(i10);
        textView.setText(i11);
        ViewGroup.LayoutParams layoutParams = w4().f131839b.b().getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, ViewUtils.f(getContext(), 4.0f), 0, 0);
        w4().f131839b.b().setLayoutParams(layoutParams2);
    }

    public static final /* synthetic */ CYPageViewModel s4(c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, 31556, new Class[]{c.class}, CYPageViewModel.class);
        return patchProxyResultProxy.isSupported ? (CYPageViewModel) patchProxyResultProxy.result : cVar.Y3();
    }

    public static final /* synthetic */ void t4(c cVar, String str) {
        if (PatchProxy.proxy(new Object[]{cVar, str}, null, changeQuickRedirect, true, 31558, new Class[]{c.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.C4(str);
    }

    public static final /* synthetic */ void u4(c cVar, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{cVar, str, str2, str3}, null, changeQuickRedirect, true, 31557, new Class[]{c.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.D4(str, str2, str3);
    }

    public static final /* synthetic */ void v4(c cVar, List list, int i10, int i11) {
        Object[] objArr = {cVar, list, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 31559, new Class[]{c.class, List.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        cVar.E4(list, i10, i11);
    }

    private final void y4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31548, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.O = arguments.getString(R);
        }
        CYPageViewModel cYPageViewModelY3 = Y3();
        String str = this.O;
        if (str == null) {
            str = "0";
        }
        cYPageViewModelY3.C(str);
    }

    @dl.d
    @xh.m
    public static final c z4(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 31555, new Class[]{String.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : P.a(str);
    }

    public final void A4(@dl.d z0 z0Var) {
        if (PatchProxy.proxy(new Object[]{z0Var}, this, changeQuickRedirect, false, 31544, new Class[]{z0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(z0Var, "<set-?>");
        this.M = z0Var;
    }

    public final void B4(@dl.d n nVar) {
        if (PatchProxy.proxy(new Object[]{nVar}, this, changeQuickRedirect, false, 31546, new Class[]{n.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(nVar, "<set-?>");
        this.N = nVar;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31547, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        z0 z0VarD = z0.d(getLayoutInflater(), null, false);
        f0.o(z0VarD, "inflate(layoutInflater, null, false)");
        A4(z0VarD);
        setViewBinding(w4());
        y4();
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    public void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31551, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Y3().z().k(this, new e());
        Y3().x().k(this, new f());
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    @dl.d
    public Handler getEventHandler() {
        return this.L;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment, com.max.hbcommon.analytics.d.f
    @dl.d
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31554, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", "2");
        String string = jsonObject.toString();
        f0.o(string, "additional.toString()");
        return string;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseFragment
    public void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31549, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        B4(new b(getContext(), Y3().v()));
        w4().f131840c.f131495b.setLayoutManager(new LinearLayoutManager(getContext()));
        w4().f131840c.f131495b.setAdapter(x4());
        w4().f131840c.f131495b.addItemDecoration(new com.max.hbcommon.base.adapter.i(getContext(), ViewUtils.f(getContext(), 12.0f), ViewUtils.f(getContext(), 12.0f)));
        w4().f131840c.f131496c.S(new C0738c());
        w4().f131840c.f131496c.f0(new d());
        Y3().k().r(BaseDisplayState.LOADING);
        Y3().B();
    }

    @dl.d
    public final z0 w4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31543, new Class[0], z0.class);
        if (patchProxyResultProxy.isSupported) {
            return (z0) patchProxyResultProxy.result;
        }
        z0 z0Var = this.M;
        if (z0Var != null) {
            return z0Var;
        }
        f0.S("binding");
        return null;
    }

    @dl.d
    public final n x4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31545, new Class[0], n.class);
        if (patchProxyResultProxy.isSupported) {
            return (n) patchProxyResultProxy.result;
        }
        n nVar = this.N;
        if (nVar != null) {
            return nVar;
        }
        f0.S("mAdapter");
        return null;
    }
}
