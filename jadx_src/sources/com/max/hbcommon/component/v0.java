package com.max.hbcommon.component;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: TopPopDownMenu.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class v0 extends PopupWindow {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private Context f67973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private List<KeyDescObj> f67974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private CheckItemView.Type f67975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private a f67976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearLayout f67977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinearLayout f67978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.max.hbcommon.base.adapter.s<KeyDescObj> f67979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BottomButtonLeftItemView f67980h;

    /* JADX INFO: compiled from: TopPopDownMenu.kt */
    public interface a {
        void a();

        void b(int i10, @dl.e KeyDescObj keyDescObj);
    }

    /* JADX INFO: compiled from: TopPopDownMenu.kt */
    public static final class b extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(Context context, List<KeyDescObj> list, int i10) {
            super(context, list, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(CheckItemView checkItemView, v0 this$0, com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj, View view) {
            if (PatchProxy.proxy(new Object[]{checkItemView, this$0, eVar, keyDescObj, view}, null, changeQuickRedirect, true, bb.c.d.f31665yg, new Class[]{CheckItemView.class, v0.class, com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(this$0, "this$0");
            checkItemView.setChecked(!checkItemView.b());
            a aVar = this$0.f67976d;
            if (aVar != null) {
                kotlin.jvm.internal.f0.m(eVar);
                aVar.b(eVar.getPosition(), keyDescObj);
            }
        }

        public void n(@dl.e final com.max.hbcommon.base.adapter.s.e eVar, @dl.e final KeyDescObj keyDescObj) {
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, bb.c.d.f31643xg, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            final CheckItemView checkItemView = eVar != null ? (CheckItemView) eVar.i(R.id.check_item) : null;
            if (checkItemView != null) {
                checkItemView.setType(v0.this.h());
            }
            if (checkItemView != null) {
                if (keyDescObj != null && keyDescObj.isChecked()) {
                    z10 = true;
                }
                checkItemView.setChecked(z10);
            }
            if (checkItemView != null) {
                checkItemView.setText(keyDescObj != null ? keyDescObj.getText() : null);
            }
            if (checkItemView != null) {
                final v0 v0Var = v0.this;
                checkItemView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.w0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        v0.b.o(checkItemView, v0Var, eVar, keyDescObj, view);
                    }
                });
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, bb.c.d.f31687zg, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            n(eVar, keyDescObj);
        }
    }

    /* JADX INFO: compiled from: TopPopDownMenu.kt */
    public static final class c implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.d.Bg, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.d.Cg, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.d.Ag, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
            LinearLayout linearLayout = v0.this.f67978f;
            if (linearLayout == null) {
                kotlin.jvm.internal.f0.S("topView");
                linearLayout = null;
            }
            linearLayout.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(@dl.d Context context, @dl.d List<KeyDescObj> list, @dl.d CheckItemView.Type type) {
        super(context);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(list, "list");
        kotlin.jvm.internal.f0.p(type, "type");
        this.f67973a = context;
        this.f67974b = list;
        this.f67975c = type;
        j();
    }

    public /* synthetic */ v0(Context context, List list, CheckItemView.Type type, int i10, kotlin.jvm.internal.u uVar) {
        this(context, list, (i10 & 4) != 0 ? CheckItemView.Type.Single : type);
    }

    private final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31489qg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.f67973a);
        this.f67977e = linearLayout;
        linearLayout.setGravity(48);
        LinearLayout linearLayout2 = this.f67977e;
        LinearLayout linearLayout3 = null;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
            linearLayout2 = null;
        }
        linearLayout2.setBackgroundResource(R.color.black_alpha60);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout4 = this.f67977e;
        if (linearLayout4 == null) {
            kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
            linearLayout4 = null;
        }
        linearLayout4.setLayoutParams(layoutParams);
        LinearLayout linearLayout5 = this.f67977e;
        if (linearLayout5 == null) {
            kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
            linearLayout5 = null;
        }
        linearLayout5.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v0.k(this.f67921b, view);
            }
        });
        LinearLayout linearLayout6 = new LinearLayout(this.f67973a);
        this.f67978f = linearLayout6;
        linearLayout6.setPadding(0, 0, 0, 0);
        LinearLayout linearLayout7 = this.f67978f;
        if (linearLayout7 == null) {
            kotlin.jvm.internal.f0.S("topView");
            linearLayout7 = null;
        }
        linearLayout7.setOrientation(1);
        LinearLayout linearLayout8 = this.f67978f;
        if (linearLayout8 == null) {
            kotlin.jvm.internal.f0.S("topView");
            linearLayout8 = null;
        }
        linearLayout8.setBackground(com.max.hbutils.utils.q.s(this.f67973a, R.color.background_layer_2_color, 4.0f));
        LinearLayout linearLayout9 = this.f67977e;
        if (linearLayout9 == null) {
            kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
            linearLayout9 = null;
        }
        LinearLayout linearLayout10 = this.f67978f;
        if (linearLayout10 == null) {
            kotlin.jvm.internal.f0.S("topView");
            linearLayout10 = null;
        }
        linearLayout9.addView(linearLayout10);
        RecyclerView recyclerView = new RecyclerView(this.f67973a);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout11 = this.f67978f;
        if (linearLayout11 == null) {
            kotlin.jvm.internal.f0.S("topView");
            linearLayout11 = null;
        }
        linearLayout11.addView(recyclerView, layoutParams2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f67973a));
        p(new b(this.f67973a, this.f67974b, R.layout.layout_checkitemview));
        recyclerView.setAdapter(g());
        BottomButtonLeftItemView bottomButtonLeftItemView = new BottomButtonLeftItemView(this.f67973a);
        this.f67980h = bottomButtonLeftItemView;
        bottomButtonLeftItemView.setRightButtonStyle(BaseBottomButton.BaseBottomButtonStyle.BlackWhite);
        BottomButtonLeftItemView bottomButtonLeftItemView2 = this.f67980h;
        if (bottomButtonLeftItemView2 == null) {
            kotlin.jvm.internal.f0.S("bt_confirm");
            bottomButtonLeftItemView2 = null;
        }
        bottomButtonLeftItemView2.setRightText(this.f67973a.getResources().getText(R.string.complete));
        BottomButtonLeftItemView bottomButtonLeftItemView3 = this.f67980h;
        if (bottomButtonLeftItemView3 == null) {
            kotlin.jvm.internal.f0.S("bt_confirm");
            bottomButtonLeftItemView3 = null;
        }
        bottomButtonLeftItemView3.setShowLeftButton(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = ViewUtils.f(this.f67973a, 10.0f);
        LinearLayout linearLayout12 = this.f67978f;
        if (linearLayout12 == null) {
            kotlin.jvm.internal.f0.S("topView");
            linearLayout12 = null;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView4 = this.f67980h;
        if (bottomButtonLeftItemView4 == null) {
            kotlin.jvm.internal.f0.S("bt_confirm");
            bottomButtonLeftItemView4 = null;
        }
        linearLayout12.addView(bottomButtonLeftItemView4, layoutParams3);
        BottomButtonLeftItemView bottomButtonLeftItemView5 = this.f67980h;
        if (bottomButtonLeftItemView5 == null) {
            kotlin.jvm.internal.f0.S("bt_confirm");
            bottomButtonLeftItemView5 = null;
        }
        bottomButtonLeftItemView5.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v0.l(this.f67972b, view);
            }
        });
        BottomButtonLeftItemView bottomButtonLeftItemView6 = this.f67980h;
        if (bottomButtonLeftItemView6 == null) {
            kotlin.jvm.internal.f0.S("bt_confirm");
            bottomButtonLeftItemView6 = null;
        }
        bottomButtonLeftItemView6.setVisibility(this.f67975c == CheckItemView.Type.Single ? 8 : 0);
        setHeight(-1);
        setWidth(-1);
        LinearLayout linearLayout13 = this.f67977e;
        if (linearLayout13 == null) {
            kotlin.jvm.internal.f0.S(com.google.android.exoplayer2.text.ttml.d.W);
        } else {
            linearLayout3 = linearLayout13;
        }
        setContentView(linearLayout3);
        setFocusable(true);
        setTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setAnimationStyle(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(v0 this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.f31599vg, new Class[]{v0.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(v0 this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.f31621wg, new Class[]{v0.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        a aVar = this$0.f67976d;
        if (aVar != null) {
            aVar.a();
        }
    }

    @dl.d
    public final Context e() {
        return this.f67973a;
    }

    @dl.d
    public final List<KeyDescObj> f() {
        return this.f67974b;
    }

    @dl.d
    public final com.max.hbcommon.base.adapter.s<KeyDescObj> g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31443og, new Class[0], com.max.hbcommon.base.adapter.s.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.base.adapter.s) patchProxyResultProxy.result;
        }
        com.max.hbcommon.base.adapter.s<KeyDescObj> sVar = this.f67979g;
        if (sVar != null) {
            return sVar;
        }
        kotlin.jvm.internal.f0.S("mAdapter");
        return null;
    }

    @dl.d
    public final CheckItemView.Type h() {
        return this.f67975c;
    }

    public final void i() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31555tg, new Class[0], Void.TYPE).isSupported && isShowing()) {
            LinearLayout linearLayout = this.f67978f;
            if (linearLayout == null) {
                kotlin.jvm.internal.f0.S("topView");
                linearLayout = null;
            }
            linearLayout.setVisibility(4);
            dismiss();
        }
    }

    public final void m(@dl.d String confirmDesc) {
        if (PatchProxy.proxy(new Object[]{confirmDesc}, this, changeQuickRedirect, false, bb.c.d.f31577ug, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(confirmDesc, "confirmDesc");
        BottomButtonLeftItemView bottomButtonLeftItemView = this.f67980h;
        if (bottomButtonLeftItemView == null) {
            kotlin.jvm.internal.f0.S("bt_confirm");
            bottomButtonLeftItemView = null;
        }
        bottomButtonLeftItemView.setRightText(confirmDesc);
    }

    public final void n(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.f31374lg, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "<set-?>");
        this.f67973a = context;
    }

    public final void o(@dl.d List<KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.d.f31397mg, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(list, "<set-?>");
        this.f67974b = list;
    }

    public final void p(@dl.d com.max.hbcommon.base.adapter.s<KeyDescObj> sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, bb.c.d.f31466pg, new Class[]{com.max.hbcommon.base.adapter.s.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(sVar, "<set-?>");
        this.f67979g = sVar;
    }

    public final void q(@dl.d a listener) {
        if (PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, bb.c.d.f31511rg, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.f67976d = listener;
    }

    public final void r(@dl.d CheckItemView.Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, bb.c.d.f31420ng, new Class[]{CheckItemView.Type.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(type, "<set-?>");
        this.f67975c = type;
    }

    public final void s(@dl.d View anchorView) {
        if (PatchProxy.proxy(new Object[]{anchorView}, this, changeQuickRedirect, false, bb.c.d.f31533sg, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(anchorView, "anchorView");
        ViewUtils.o0(this, anchorView);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f67973a, R.anim.filter_slide_in);
        animationLoadAnimation.setAnimationListener(new c());
        LinearLayout linearLayout = this.f67978f;
        if (linearLayout == null) {
            kotlin.jvm.internal.f0.S("topView");
            linearLayout = null;
        }
        linearLayout.startAnimation(animationLoadAnimation);
    }
}
