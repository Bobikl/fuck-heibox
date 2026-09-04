package com.max.xiaoheihe.module.littleprogram;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbminiprogram.bean.MiniProgramGroupObj;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.max.hbminiprogram.component.MiniProgramView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.t;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import yh.p;

/* JADX INFO: compiled from: MiniProgramV2Dialog.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class MiniProgramV2Dialog extends Dialog {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f88684j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final Context f88685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f88686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f88687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final List<MiniProgramGroupObj> f88688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private View f88689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final q0 f88690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f88691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f88692i;

    /* JADX INFO: compiled from: MiniProgramV2Dialog.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38692, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MiniProgramV2Dialog.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: MiniProgramV2Dialog.kt */
    public static final class b extends s<MiniProgramGroupObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: MiniProgramV2Dialog.kt */
        public static final class a extends s<MiniProgramObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f88695b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f88696c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ MiniProgramV2Dialog f88697d;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.littleprogram.MiniProgramV2Dialog$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: MiniProgramV2Dialog.kt */
            public static final class ViewOnClickListenerC0808a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ MiniProgramObj f88698b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ MiniProgramV2Dialog f88699c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ MiniProgramView f88700d;

                ViewOnClickListenerC0808a(MiniProgramObj miniProgramObj, MiniProgramV2Dialog miniProgramV2Dialog, MiniProgramView miniProgramView) {
                    this.f88698b = miniProgramObj;
                    this.f88699c = miniProgramV2Dialog;
                    this.f88700d = miniProgramView;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38697, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    g.f74531b.q("MiniProgramV2Dialog, proto = " + this.f88698b.getProto());
                    if (com.max.hbcommon.utils.c.w(this.f88698b.getMore_mini_app())) {
                        Context context = this.f88699c.getContext();
                        f0.o(context, "context");
                        com.max.xiaoheihe.base.router.b.k0(context, this.f88698b.getProto());
                    }
                    this.f88698b.setHave_new(false);
                    this.f88698b.setShow_animator(false);
                    this.f88700d.getIv_point().setVisibility(8);
                    this.f88700d.t();
                    this.f88699c.dismiss();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z10, int i10, MiniProgramV2Dialog miniProgramV2Dialog, Context context, List<MiniProgramObj> list) {
                super(context, list, R.layout.item_mini_program_v2);
                this.f88695b = z10;
                this.f88696c = i10;
                this.f88697d = miniProgramV2Dialog;
            }

            public void m(@e s.e eVar, @e MiniProgramObj miniProgramObj) {
                if (PatchProxy.proxy(new Object[]{eVar, miniProgramObj}, this, changeQuickRedirect, false, 38695, new Class[]{s.e.class, MiniProgramObj.class}, Void.TYPE).isSupported || eVar == null) {
                    return;
                }
                boolean z10 = this.f88695b;
                int i10 = this.f88696c;
                MiniProgramV2Dialog miniProgramV2Dialog = this.f88697d;
                if (miniProgramObj != null) {
                    View viewI = eVar.i(R.id.v_mini_program);
                    f0.o(viewI, "viewHolder.getView(R.id.v_mini_program)");
                    MiniProgramView miniProgramView = (MiniProgramView) viewI;
                    miniProgramView.setData(miniProgramObj);
                    if (z10) {
                        ViewGroup.LayoutParams layoutParams = miniProgramView.getLayoutParams();
                        layoutParams.height = i10;
                        miniProgramView.setLayoutParams(layoutParams);
                    }
                    miniProgramView.setOnClickListener(new ViewOnClickListenerC0808a(miniProgramObj, miniProgramV2Dialog, miniProgramView));
                }
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, MiniProgramObj miniProgramObj) {
                if (PatchProxy.proxy(new Object[]{eVar, miniProgramObj}, this, changeQuickRedirect, false, 38696, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, miniProgramObj);
            }
        }

        b(Context context, List<MiniProgramGroupObj> list) {
            super(context, list, R.layout.item_mini_program_group);
        }

        public void m(@e s.e eVar, @e MiniProgramGroupObj miniProgramGroupObj) {
            if (PatchProxy.proxy(new Object[]{eVar, miniProgramGroupObj}, this, changeQuickRedirect, false, 38693, new Class[]{s.e.class, MiniProgramGroupObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            MiniProgramV2Dialog miniProgramV2Dialog = MiniProgramV2Dialog.this;
            if (miniProgramGroupObj != null) {
                TextView textView = (TextView) eVar.i(R.id.tv_title);
                RecyclerView recyclerView = (RecyclerView) eVar.i(R.id.rv_mini_app);
                textView.setText(miniProgramGroupObj.getTitle());
                recyclerView.setLayoutManager(new GridLayoutManager(miniProgramV2Dialog.getContext(), 4));
                if (recyclerView.getItemDecorationCount() == 0) {
                    recyclerView.addItemDecoration(new fc.b(4, ViewUtils.f(miniProgramV2Dialog.getContext(), 6.0f), false));
                }
                recyclerView.setAdapter(new a(ViewUtils.L(miniProgramV2Dialog.getContext()) >= ViewUtils.f(miniProgramV2Dialog.getContext(), 390.0f), ViewUtils.f(miniProgramV2Dialog.getContext(), 46.0f), miniProgramV2Dialog, miniProgramV2Dialog.getContext(), miniProgramGroupObj.getApps()));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, MiniProgramGroupObj miniProgramGroupObj) {
            if (PatchProxy.proxy(new Object[]{eVar, miniProgramGroupObj}, this, changeQuickRedirect, false, 38694, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, miniProgramGroupObj);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.littleprogram.MiniProgramV2Dialog$dismiss$1, reason: invalid class name */
    /* JADX INFO: compiled from: MiniProgramV2Dialog.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.littleprogram.MiniProgramV2Dialog$dismiss$1", f = "MiniProgramV2Dialog.kt", i = {}, l = {bb.c.b.f30896r0}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f88701b;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 38684, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : MiniProgramV2Dialog.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38686, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38685, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38683, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f88701b;
            if (i10 == 0) {
                t0.n(obj);
                MiniProgramV2Dialog.b(MiniProgramV2Dialog.this);
                this.f88701b = 1;
                if (DelayKt.b(200L, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            MiniProgramV2Dialog.a(MiniProgramV2Dialog.this);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniProgramV2Dialog(@d Context mContext, int i10, float f10, @d List<MiniProgramGroupObj> list) {
        super(mContext, R.style.FullScreenDialog);
        f0.p(mContext, "mContext");
        f0.p(list, "list");
        this.f88685b = mContext;
        this.f88686c = i10;
        this.f88687d = f10;
        this.f88688e = list;
        this.f88690g = r0.a(e1.e());
        this.f88691h = 300L;
        this.f88692i = 200L;
    }

    public /* synthetic */ MiniProgramV2Dialog(Context context, int i10, float f10, List list, int i11, u uVar) {
        this(context, i10, (i11 & 4) != 0 ? 0.0f : f10, list);
    }

    public static final /* synthetic */ void a(MiniProgramV2Dialog miniProgramV2Dialog) {
        if (PatchProxy.proxy(new Object[]{miniProgramV2Dialog}, null, changeQuickRedirect, true, 38682, new Class[]{MiniProgramV2Dialog.class}, Void.TYPE).isSupported) {
            return;
        }
        super.dismiss();
    }

    public static final /* synthetic */ void b(MiniProgramV2Dialog miniProgramV2Dialog) {
        if (PatchProxy.proxy(new Object[]{miniProgramV2Dialog}, null, changeQuickRedirect, true, 38681, new Class[]{MiniProgramV2Dialog.class}, Void.TYPE).isSupported) {
            return;
        }
        miniProgramV2Dialog.m();
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38679, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(this.f88690g, null, null, new MiniProgramV2Dialog$expandScaleView$1(this, null), 3, null);
    }

    private final View d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38676, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = LayoutInflater.from(this.f88685b).inflate(R.layout.dialog_mini_program, (ViewGroup) null, false);
        f0.o(viewInflate, "from(mContext).inflate(R…ini_program, null, false)");
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewInflate.setOnClickListener(new a());
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv);
        recyclerView.setPadding(0, 0, 0, ViewUtils.f(this.f88685b, 12.0f));
        this.f88689f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f88685b));
        recyclerView.setAdapter(new b(this.f88685b, this.f88688e));
        Context context = this.f88685b;
        int iM = ViewUtils.m(context, ViewUtils.L(context), ViewUtils.L(this.f88685b));
        Context context2 = this.f88685b;
        recyclerView.setBackground(q.i(context2, R.color.background_layer_2_color, R.color.divider_secondary_1_color, 0.5f, ViewUtils.h0(context2, iM)));
        return viewInflate;
    }

    private final void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38680, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(this.f88690g, null, null, new MiniProgramV2Dialog$hideScaleView$1(this, null), 3, null);
    }

    private final void n() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38677, new Class[0], Void.TYPE).isSupported || (view = this.f88689f) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f88686c;
        view.setAlpha(0.0f);
        view.setScaleY(0.0f);
        view.setScaleX(0.0f);
        view.setTranslationY(-this.f88687d);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38678, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(this.f88690g, null, null, new AnonymousClass1(null), 3, null);
    }

    public final long e() {
        return this.f88692i;
    }

    @d
    public final List<MiniProgramGroupObj> f() {
        return this.f88688e;
    }

    @d
    public final Context g() {
        return this.f88685b;
    }

    @d
    public final q0 h() {
        return this.f88690g;
    }

    @e
    public final View i() {
        return this.f88689f;
    }

    public final long j() {
        return this.f88691h;
    }

    public final int k() {
        return this.f88686c;
    }

    public final float l() {
        return this.f88687d;
    }

    public final void o(@e View view) {
        this.f88689f = view;
    }

    @Override // android.app.Dialog
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 38674, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setDimAmount(0.15f);
            window.setNavigationBarColor(com.max.xiaoheihe.utils.d.E(R.color.transparent));
            window.setTransitionBackgroundFadeDuration(this.f88691h);
        }
        setContentView(d());
        n();
    }

    public final void p(float f10) {
        this.f88687d = f10;
    }

    @Override // android.app.Dialog
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38675, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.show();
        t.h0(getWindow());
        t.N(getWindow(), true);
        n();
        c();
    }
}
