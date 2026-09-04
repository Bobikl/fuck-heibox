package com.max.xiaoheihe.module.account.mine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.core.view.n;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.c1;
import androidx.lifecycle.i0;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbcustomview.SwitchButton.SwitchButton;
import com.max.hbcustomview.tickerview.TickerUtils;
import com.max.hbcustomview.tickerview.TickerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.avatar.AvatarDecorListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ld;
import java.util.ArrayList;
import java.util.List;
import kotlin.b0;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.z;

/* JADX INFO: compiled from: AvatarDecorListContainer.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nAvatarDecorListContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarDecorListContainer.kt\ncom/max/xiaoheihe/module/account/mine/AvatarDecorListContainer\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,366:1\n162#2,8:367\n*S KotlinDebug\n*F\n+ 1 AvatarDecorListContainer.kt\ncom/max/xiaoheihe/module/account/mine/AvatarDecorListContainer\n*L\n105#1:367,8\n*E\n"})
@o(parameters = 0)
public final class AvatarDecorListContainer extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f79010o = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final z f79011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecyclerView f79012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ld f79013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final ArrayList<AvatarDecorationObj> f79014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private a f79015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private AvatarDecorationObj f79016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private AvatarDecorationObj f79017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private yh.l<? super AvatarDecorationObj, b2> f79018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private yh.a<b2> f79019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private CountDownTimer f79020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f79021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private io.reactivex.disposables.b f79022m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private yh.l<? super Boolean, b2> f79023n;

    /* JADX INFO: compiled from: AvatarDecorListContainer.kt */
    @t0({"SMAP\nAvatarDecorListContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarDecorListContainer.kt\ncom/max/xiaoheihe/module/account/mine/AvatarDecorListContainer$Adapter\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,366:1\n142#2,8:367\n142#2,8:375\n*S KotlinDebug\n*F\n+ 1 AvatarDecorListContainer.kt\ncom/max/xiaoheihe/module/account/mine/AvatarDecorListContainer$Adapter\n*L\n308#1:367,8\n317#1:375,8\n*E\n"})
    public final class a extends s<AvatarDecorationObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.mine.AvatarDecorListContainer$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AvatarDecorListContainer.kt */
        public static final class ViewOnClickListenerC0656a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AvatarDecorListContainer f79025b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AvatarDecorationObj f79026c;

            ViewOnClickListenerC0656a(AvatarDecorListContainer avatarDecorListContainer, AvatarDecorationObj avatarDecorationObj) {
                this.f79025b = avatarDecorListContainer;
                this.f79026c = avatarDecorationObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25021, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                AvatarDecorListContainer avatarDecorListContainer = this.f79025b;
                avatarDecorListContainer.k(f0.g(avatarDecorListContainer.f79017h, this.f79026c) ? null : this.f79026c);
            }
        }

        public a() {
            super(AvatarDecorListContainer.this.getContext(), AvatarDecorListContainer.this.f79014e, R.layout.item_choose_avatar_decor);
        }

        public void m(@dl.d s.e viewHolder, @dl.d AvatarDecorationObj data) {
            ViewGroup.LayoutParams layoutParams;
            int i10;
            ViewGroup.LayoutParams layoutParams2;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 25019, new Class[]{s.e.class, AvatarDecorationObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            View viewB = viewHolder.b();
            HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) viewHolder.i(R.id.avatar);
            View viewI = viewHolder.i(R.id.checked);
            TextView textView = (TextView) viewHolder.i(R.id.name);
            TextView textView2 = (TextView) viewHolder.i(R.id.tag);
            TextView textView3 = (TextView) viewHolder.i(R.id.desc);
            ImageView imageView = (ImageView) viewHolder.i(R.id.descImg);
            View viewI2 = viewHolder.i(R.id.divider);
            heyBoxAvatarView.setAvatar(R.drawable.ic_avatar_emoji, data);
            com.max.hbresource.a aVar = com.max.hbresource.a.f71893a;
            textView.setTypeface(aVar.a(com.max.hbresource.a.f71894b));
            textView3.setTypeface(aVar.a(com.max.hbresource.a.f71895c));
            textView.setText(data.getName());
            if (!com.max.hbcommon.utils.c.u(data.getTag())) {
                textView2.setVisibility(0);
                textView2.setText(data.getTag());
                if (!com.max.hbcommon.utils.c.u(data.getTag_start_color()) && !com.max.hbcommon.utils.c.u(data.getTag_end_color())) {
                    textView2.setBackground(ViewUtils.x(ViewUtils.f(AvatarDecorListContainer.this.getContext(), 2.0f), com.max.xiaoheihe.utils.d.e1(data.getTag_start_color()), com.max.xiaoheihe.utils.d.e1(data.getTag_end_color())));
                }
            }
            if (!data.isIs_product() || data.isOwned() || com.max.hbcommon.utils.c.u(data.getDesc_img())) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                com.max.hbimage.b.K(data.getDesc_img(), imageView);
            }
            textView3.setText(data.getDesc());
            viewI.setVisibility(f0.g(data, AvatarDecorListContainer.this.f79016g) ? 0 : 8);
            if (f0.g(data, AvatarDecorListContainer.this.f79017h)) {
                if (viewI2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.LayoutParams layoutParams3 = viewI2.getLayoutParams();
                    f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    AvatarDecorListContainer avatarDecorListContainer = AvatarDecorListContainer.this;
                    marginLayoutParams.setMargins(ViewUtils.f(avatarDecorListContainer.getContext(), 1.0f), marginLayoutParams.topMargin, ViewUtils.f(avatarDecorListContainer.getContext(), 1.0f), marginLayoutParams.bottomMargin);
                    b2 b2Var = b2.f124493a;
                    layoutParams2 = marginLayoutParams;
                } else {
                    layoutParams2 = viewI2.getLayoutParams();
                }
                viewI2.setLayoutParams(layoutParams2);
                i10 = R.drawable.bg_white_radiu5_stroke1_primary;
            } else {
                if (viewI2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.LayoutParams layoutParams4 = viewI2.getLayoutParams();
                    f0.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    AvatarDecorListContainer avatarDecorListContainer2 = AvatarDecorListContainer.this;
                    marginLayoutParams2.setMargins(ViewUtils.f(avatarDecorListContainer2.getContext(), 0.5f), marginLayoutParams2.topMargin, ViewUtils.f(avatarDecorListContainer2.getContext(), 0.5f), marginLayoutParams2.bottomMargin);
                    b2 b2Var2 = b2.f124493a;
                    layoutParams = marginLayoutParams2;
                } else {
                    layoutParams = viewI2.getLayoutParams();
                }
                viewI2.setLayoutParams(layoutParams);
                i10 = R.drawable.bg_white_radiu5_stroke1;
            }
            viewB.setBackgroundResource(i10);
            if (f0.g("1", data.getExpired())) {
                heyBoxAvatarView.setAlpha(0.3f);
                textView.setTextColor(AvatarDecorListContainer.this.getResources().getColor(R.color.text_secondary_2_color));
                textView3.setTextColor(AvatarDecorListContainer.this.getResources().getColor(R.color.text_secondary_2_color));
                viewB.setClickable(false);
                return;
            }
            heyBoxAvatarView.setAlpha(1.0f);
            textView.setTextColor(AvatarDecorListContainer.this.getResources().getColor(R.color.text_primary_1_color));
            textView3.setTextColor(com.max.xiaoheihe.utils.d.H(AvatarDecorListContainer.this.getContext(), data.getDesc_color()));
            viewB.setOnClickListener(new ViewOnClickListenerC0656a(AvatarDecorListContainer.this, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, AvatarDecorationObj avatarDecorationObj) {
            if (PatchProxy.proxy(new Object[]{eVar, avatarDecorationObj}, this, changeQuickRedirect, false, 25020, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, avatarDecorationObj);
        }
    }

    /* JADX INFO: compiled from: AvatarDecorListContainer.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25022, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ld ldVar = AvatarDecorListContainer.this.f79013d;
            if (ldVar == null) {
                f0.S("headerBinding");
                ldVar = null;
            }
            ldVar.f113006d.y(true);
        }
    }

    /* JADX INFO: compiled from: AvatarDecorListContainer.kt */
    public static final class c implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AvatarDecorListObj f79029c;

        c(AvatarDecorListObj avatarDecorListObj) {
            this.f79029c = avatarDecorListObj;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            String pushType;
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25023, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            i iVarE = AvatarDecorListContainer.e(AvatarDecorListContainer.this);
            Context context = AvatarDecorListContainer.this.getContext();
            f0.o(context, "context");
            AvatarDecorListObj avatarDecorListObj = this.f79029c;
            if (avatarDecorListObj == null || (pushType = avatarDecorListObj.getPushType()) == null) {
                pushType = "";
            }
            iVarE.p(context, pushType, z10);
        }
    }

    /* JADX INFO: compiled from: AvatarDecorListContainer.kt */
    public static final class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25024, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            i0<Boolean> i0VarI = AvatarDecorListContainer.e(AvatarDecorListContainer.this).i();
            y yVarA = ViewTreeLifecycleOwner.a(AvatarDecorListContainer.this);
            f0.m(yVarA);
            i0VarI.k(yVarA, new com.max.xiaoheihe.module.account.mine.a.C0657a(AvatarDecorListContainer.this.getSubscribeCallback()));
        }
    }

    /* JADX INFO: compiled from: AvatarDecorListContainer.kt */
    public static final class e extends CountDownTimer {
        public static ChangeQuickRedirect changeQuickRedirect;

        e(long j10) {
            super(j10, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25026, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            AvatarDecorListContainer.f(AvatarDecorListContainer.this, 0L);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 25025, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            AvatarDecorListContainer.f(AvatarDecorListContainer.this, j10);
        }
    }

    public AvatarDecorListContainer(@dl.e Context context) {
        this(context, null);
    }

    public AvatarDecorListContainer(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarDecorListContainer(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public AvatarDecorListContainer(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f79011b = b0.c(new yh.a<i>() { // from class: com.max.xiaoheihe.module.account.mine.AvatarDecorListContainer$viewModel$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final i a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25029, new Class[0], i.class);
                if (patchProxyResultProxy.isSupported) {
                    return (i) patchProxyResultProxy.result;
                }
                c1 c1VarA = ViewTreeViewModelStoreOwner.a(this.f79033b);
                f0.m(c1VarA);
                return (i) new y0(c1VarA).a(i.class);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.account.mine.i, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ i invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25030, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f79014e = new ArrayList<>();
        if (isInEditMode()) {
            LayoutInflater.from(getContext()).inflate(R.layout.layout_empty, (ViewGroup) this, true);
        }
        this.f79023n = new yh.l<Boolean, b2>() { // from class: com.max.xiaoheihe.module.account.mine.AvatarDecorListContainer$subscribeCallback$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(boolean z10) {
                if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25027, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.heybox.hblog.g.f74531b.q("AvatarDecorListContainer, , subscribeCallback, it = " + z10);
                ld ldVar = this.f79032b.f79013d;
                if (ldVar == null) {
                    f0.S("headerBinding");
                    ldVar = null;
                }
                ldVar.f113006d.setChecked(z10, false);
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 25028, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bool.booleanValue());
                return b2.f124493a;
            }
        };
        setOrientation(1);
        h();
        g();
    }

    public static final /* synthetic */ i e(AvatarDecorListContainer avatarDecorListContainer) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{avatarDecorListContainer}, null, changeQuickRedirect, true, 25017, new Class[]{AvatarDecorListContainer.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : avatarDecorListContainer.getViewModel();
    }

    public static final /* synthetic */ void f(AvatarDecorListContainer avatarDecorListContainer, long j10) {
        if (PatchProxy.proxy(new Object[]{avatarDecorListContainer, new Long(j10)}, null, changeQuickRedirect, true, 25018, new Class[]{AvatarDecorListContainer.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        avatarDecorListContainer.n(j10);
    }

    private final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25002, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f79012c = recyclerView;
        RecyclerView recyclerView2 = null;
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView3 = this.f79012c;
        if (recyclerView3 == null) {
            f0.S("recyclerview");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(new GridLayoutManager(getContext(), 3));
        RecyclerView recyclerView4 = this.f79012c;
        if (recyclerView4 == null) {
            f0.S("recyclerview");
            recyclerView4 = null;
        }
        recyclerView4.addItemDecoration(new fc.b(3, ViewUtils.f(getContext(), 6.0f), false));
        this.f79015f = new a();
        RecyclerView recyclerView5 = this.f79012c;
        if (recyclerView5 == null) {
            f0.S("recyclerview");
            recyclerView5 = null;
        }
        recyclerView5.setAdapter(this.f79015f);
        RecyclerView recyclerView6 = this.f79012c;
        if (recyclerView6 == null) {
            f0.S("recyclerview");
            recyclerView6 = null;
        }
        recyclerView6.setPadding(ViewUtils.f(getContext(), 12.0f), recyclerView6.getPaddingTop(), ViewUtils.f(getContext(), 12.0f), recyclerView6.getPaddingBottom());
        RecyclerView recyclerView7 = this.f79012c;
        if (recyclerView7 == null) {
            f0.S("recyclerview");
        } else {
            recyclerView2 = recyclerView7;
        }
        addView(recyclerView2, new LinearLayout.LayoutParams(-1, -2));
    }

    private final i getViewModel() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25001, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) this.f79011b.getValue();
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25003, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ld ldVar = null;
        ld ldVarD = ld.d(LayoutInflater.from(getContext()), null, false);
        f0.o(ldVarD, "inflate(LayoutInflater.from(context), null, false)");
        this.f79013d = ldVarD;
        if (ldVarD == null) {
            f0.S("headerBinding");
            ldVarD = null;
        }
        ldVarD.f113007e.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        ld ldVar2 = this.f79013d;
        if (ldVar2 == null) {
            f0.S("headerBinding");
            ldVar2 = null;
        }
        ldVar2.b().setVisibility(8);
        ld ldVar3 = this.f79013d;
        if (ldVar3 == null) {
            f0.S("headerBinding");
        } else {
            ldVar = ldVar3;
        }
        View viewB = ldVar.b();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, ViewUtils.f(getContext(), 10.0f), 0, 0);
        b2 b2Var = b2.f124493a;
        addView(viewB, layoutParams);
    }

    private final void i(AvatarDecorListObj avatarDecorListObj) {
        Boolean subscribed;
        boolean zBooleanValue = false;
        if (PatchProxy.proxy(new Object[]{avatarDecorListObj}, this, changeQuickRedirect, false, 25007, new Class[]{AvatarDecorListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ld ldVar = this.f79013d;
        ld ldVar2 = null;
        if (ldVar == null) {
            f0.S("headerBinding");
            ldVar = null;
        }
        SwitchButton switchButton = ldVar.f113006d;
        if (avatarDecorListObj != null && (subscribed = avatarDecorListObj.getSubscribed()) != null) {
            zBooleanValue = subscribed.booleanValue();
        }
        switchButton.setChecked(zBooleanValue);
        ld ldVar3 = this.f79013d;
        if (ldVar3 == null) {
            f0.S("headerBinding");
            ldVar3 = null;
        }
        ldVar3.f113005c.setOnClickListener(new b());
        ld ldVar4 = this.f79013d;
        if (ldVar4 == null) {
            f0.S("headerBinding");
        } else {
            ldVar2 = ldVar4;
        }
        ldVar2.f113006d.setOnCheckedChangeListener(new c(avatarDecorListObj));
    }

    private final void j(TickerView tickerView) {
        if (PatchProxy.proxy(new Object[]{tickerView}, this, changeQuickRedirect, false, 25008, new Class[]{TickerView.class}, Void.TYPE).isSupported || tickerView == null) {
            return;
        }
        tickerView.setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        tickerView.setTextSize(ViewUtils.f(getContext(), 14.0f));
        tickerView.setTypeface(bb.d.a().b(4));
        tickerView.setAnimationDuration(500L);
        tickerView.setAnimationInterpolator(new DecelerateInterpolator());
        tickerView.setGravity(n.f21701b);
        tickerView.setPreferredScrollingDirection(TickerView.ScrollingDirection.DOWN);
        tickerView.setTickerTimeFormat(TickerUtils.TickerTimeFormat.FORMAT_HMS_SEPARATE_BY_SEMICOLON);
    }

    private final void l() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25010, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        CountDownTimer countDownTimer = this.f79020k;
        if (countDownTimer != null && countDownTimer != null) {
            countDownTimer.cancel();
        }
        e eVar = new e(this.f79021l * ((long) 1000));
        this.f79020k = eVar;
        eVar.start();
    }

    private final void n(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 25009, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ld ldVar = this.f79013d;
        if (ldVar == null) {
            f0.S("headerBinding");
            ldVar = null;
        }
        ldVar.f113008f.setText(w.A(j10));
        if (j10 <= 0) {
            CountDownTimer countDownTimer = this.f79020k;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            yh.a<b2> aVar = this.f79019j;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @dl.d
    public final yh.l<Boolean, b2> getSubscribeCallback() {
        return this.f79023n;
    }

    public final void k(@dl.e AvatarDecorationObj avatarDecorationObj) {
        a aVar;
        a aVar2;
        if (PatchProxy.proxy(new Object[]{avatarDecorationObj}, this, changeQuickRedirect, false, 25016, new Class[]{AvatarDecorationObj.class}, Void.TYPE).isSupported || f0.g(avatarDecorationObj, this.f79017h)) {
            return;
        }
        AvatarDecorationObj avatarDecorationObj2 = this.f79017h;
        int iY2 = avatarDecorationObj2 != null ? CollectionsKt___CollectionsKt.Y2(this.f79014e, avatarDecorationObj2) : -1;
        int iY3 = CollectionsKt___CollectionsKt.Y2(this.f79014e, avatarDecorationObj);
        this.f79017h = avatarDecorationObj;
        yh.l<? super AvatarDecorationObj, b2> lVar = this.f79018i;
        if (lVar != null) {
            lVar.invoke(avatarDecorationObj);
        }
        if (iY2 >= 0 && (aVar2 = this.f79015f) != null) {
            aVar2.notifyItemChanged(iY2);
        }
        if (iY3 < 0 || (aVar = this.f79015f) == null) {
            return;
        }
        aVar.notifyItemChanged(iY3);
    }

    public final void m(@dl.e AvatarDecorationObj avatarDecorationObj) {
        a aVar;
        a aVar2;
        if (PatchProxy.proxy(new Object[]{avatarDecorationObj}, this, changeQuickRedirect, false, 25011, new Class[]{AvatarDecorationObj.class}, Void.TYPE).isSupported || f0.g(this.f79016g, avatarDecorationObj)) {
            return;
        }
        int iY2 = CollectionsKt___CollectionsKt.Y2(this.f79014e, avatarDecorationObj);
        int iY3 = CollectionsKt___CollectionsKt.Y2(this.f79014e, this.f79016g);
        this.f79016g = avatarDecorationObj;
        for (AvatarDecorationObj avatarDecorationObj2 : this.f79014e) {
            AvatarDecorationObj avatarDecorationObj3 = this.f79016g;
            avatarDecorationObj2.setEnabled(avatarDecorationObj3 != null && f0.g(avatarDecorationObj3, avatarDecorationObj2));
        }
        if (iY2 >= 0 && (aVar2 = this.f79015f) != null) {
            aVar2.notifyItemChanged(iY2);
        }
        if (iY3 < 0 || (aVar = this.f79015f) == null) {
            return;
        }
        aVar.notifyItemChanged(iY3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25012, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        post(new d());
        com.max.heybox.hblog.g.f74531b.q("AvatarDecorListContainer, , initSubscribeSwitchButton, viewModel = " + getViewModel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25013, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        com.max.heybox.hblog.g.f74531b.q("AvatarDecorListContainer, onDetachedFromWindow");
        getViewModel().i().p(new com.max.xiaoheihe.module.account.mine.a.C0657a(this.f79023n));
        CountDownTimer countDownTimer = this.f79020k;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        io.reactivex.disposables.b bVar = this.f79022m;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public final void setAvatarDecorItemCheckedListener(@dl.d yh.l<? super AvatarDecorationObj, b2> callback) {
        if (PatchProxy.proxy(new Object[]{callback}, this, changeQuickRedirect, false, 25014, new Class[]{yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "callback");
        this.f79018i = callback;
    }

    public final void setData(@dl.e AvatarDecorListObj avatarDecorListObj, @dl.e AvatarDecorationObj avatarDecorationObj) {
        if (PatchProxy.proxy(new Object[]{avatarDecorListObj, avatarDecorationObj}, this, changeQuickRedirect, false, 25005, new Class[]{AvatarDecorListObj.class, AvatarDecorationObj.class}, Void.TYPE).isSupported || avatarDecorListObj == null) {
            return;
        }
        this.f79014e.clear();
        List<AvatarDecorationObj> items = avatarDecorListObj.getItems();
        if (items != null) {
            this.f79014e.addAll(items);
        }
        String title = avatarDecorListObj.getTitle();
        if (title != null) {
            ld ldVar = this.f79013d;
            if (ldVar == null) {
                f0.S("headerBinding");
                ldVar = null;
            }
            ldVar.b().setVisibility(0);
            ld ldVar2 = this.f79013d;
            if (ldVar2 == null) {
                f0.S("headerBinding");
                ldVar2 = null;
            }
            ldVar2.f113007e.setText(title);
        }
        if (avatarDecorListObj.getDeadlineInterval() != null && f0.g(avatarDecorListObj.getType(), "daily")) {
            ld ldVar3 = this.f79013d;
            if (ldVar3 == null) {
                f0.S("headerBinding");
                ldVar3 = null;
            }
            ldVar3.f113004b.setVisibility(0);
            ld ldVar4 = this.f79013d;
            if (ldVar4 == null) {
                f0.S("headerBinding");
                ldVar4 = null;
            }
            ldVar4.f113008f.setVisibility(0);
            Long deadlineInterval = avatarDecorListObj.getDeadlineInterval();
            f0.m(deadlineInterval);
            this.f79021l = deadlineInterval.longValue();
            ld ldVar5 = this.f79013d;
            if (ldVar5 == null) {
                f0.S("headerBinding");
                ldVar5 = null;
            }
            ldVar5.f113005c.setVisibility(0);
            i(avatarDecorListObj);
            ld ldVar6 = this.f79013d;
            if (ldVar6 == null) {
                f0.S("headerBinding");
                ldVar6 = null;
            }
            j(ldVar6.f113008f);
            l();
        }
        this.f79017h = null;
        this.f79016g = avatarDecorationObj;
        a aVar = this.f79015f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setData(@dl.e List<? extends AvatarDecorationObj> list, @dl.e AvatarDecorationObj avatarDecorationObj) {
        if (PatchProxy.proxy(new Object[]{list, avatarDecorationObj}, this, changeQuickRedirect, false, 25004, new Class[]{List.class, AvatarDecorationObj.class}, Void.TYPE).isSupported || list == null) {
            return;
        }
        this.f79014e.clear();
        this.f79014e.addAll(list);
        ld ldVar = this.f79013d;
        if (ldVar == null) {
            f0.S("headerBinding");
            ldVar = null;
        }
        ldVar.b().setVisibility(0);
        ld ldVar2 = this.f79013d;
        if (ldVar2 == null) {
            f0.S("headerBinding");
            ldVar2 = null;
        }
        ldVar2.f113007e.setText("头像框");
        ld ldVar3 = this.f79013d;
        if (ldVar3 == null) {
            f0.S("headerBinding");
            ldVar3 = null;
        }
        ldVar3.f113004b.setVisibility(0);
        ld ldVar4 = this.f79013d;
        if (ldVar4 == null) {
            f0.S("headerBinding");
            ldVar4 = null;
        }
        ldVar4.f113008f.setVisibility(0);
        ld ldVar5 = this.f79013d;
        if (ldVar5 == null) {
            f0.S("headerBinding");
            ldVar5 = null;
        }
        ldVar5.f113005c.setVisibility(0);
        this.f79021l = 10800L;
        ld ldVar6 = this.f79013d;
        if (ldVar6 == null) {
            f0.S("headerBinding");
            ldVar6 = null;
        }
        j(ldVar6.f113008f);
        l();
        i(null);
        this.f79017h = null;
        this.f79016g = avatarDecorationObj;
        a aVar = this.f79015f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final void setRefreshDailyCallback(@dl.d yh.a<b2> callback) {
        if (PatchProxy.proxy(new Object[]{callback}, this, changeQuickRedirect, false, 25015, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "callback");
        this.f79019j = callback;
    }

    public final void setSubscribeCallback(@dl.d yh.l<? super Boolean, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 25006, new Class[]{yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lVar, "<set-?>");
        this.f79023n = lVar;
    }
}
