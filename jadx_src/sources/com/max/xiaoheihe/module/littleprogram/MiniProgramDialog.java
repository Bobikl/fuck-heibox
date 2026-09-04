package com.max.xiaoheihe.module.littleprogram;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.max.hbminiprogram.component.MiniProgramView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.t;
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

/* JADX INFO: compiled from: MiniProgramDialog.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class MiniProgramDialog extends Dialog {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f88647j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final Context f88648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f88649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f88650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final List<MiniProgramObj> f88651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private View f88652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final q0 f88653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f88654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f88655i;

    /* JADX INFO: compiled from: MiniProgramDialog.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38585, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MiniProgramDialog.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: MiniProgramDialog.kt */
    public static final class b extends s<MiniProgramObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f88657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f88658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MiniProgramDialog f88659d;

        /* JADX INFO: compiled from: MiniProgramDialog.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MiniProgramObj f88660b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ MiniProgramDialog f88661c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ MiniProgramView f88662d;

            a(MiniProgramObj miniProgramObj, MiniProgramDialog miniProgramDialog, MiniProgramView miniProgramView) {
                this.f88660b = miniProgramObj;
                this.f88661c = miniProgramDialog;
                this.f88662d = miniProgramView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38588, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (com.max.hbcommon.utils.c.w(this.f88660b.getMore_mini_app())) {
                    Context context = this.f88661c.getContext();
                    f0.o(context, "context");
                    com.max.xiaoheihe.base.router.b.k0(context, this.f88660b.getProto());
                }
                this.f88660b.setHave_new(false);
                this.f88660b.setShow_animator(false);
                this.f88662d.getIv_point().setVisibility(8);
                this.f88662d.t();
                this.f88661c.dismiss();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, int i10, MiniProgramDialog miniProgramDialog, Context context, List<MiniProgramObj> list) {
            super(context, list, R.layout.item_mini_program_v2);
            this.f88657b = z10;
            this.f88658c = i10;
            this.f88659d = miniProgramDialog;
        }

        public void m(@e s.e eVar, @e MiniProgramObj miniProgramObj) {
            if (PatchProxy.proxy(new Object[]{eVar, miniProgramObj}, this, changeQuickRedirect, false, 38586, new Class[]{s.e.class, MiniProgramObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            boolean z10 = this.f88657b;
            int i10 = this.f88658c;
            MiniProgramDialog miniProgramDialog = this.f88659d;
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
                miniProgramView.setOnClickListener(new a(miniProgramObj, miniProgramDialog, miniProgramView));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, MiniProgramObj miniProgramObj) {
            if (PatchProxy.proxy(new Object[]{eVar, miniProgramObj}, this, changeQuickRedirect, false, 38587, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, miniProgramObj);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.littleprogram.MiniProgramDialog$dismiss$1, reason: invalid class name */
    /* JADX INFO: compiled from: MiniProgramDialog.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.littleprogram.MiniProgramDialog$dismiss$1", f = "MiniProgramDialog.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f88663b;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 38577, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : MiniProgramDialog.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38579, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38578, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38576, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f88663b;
            if (i10 == 0) {
                t0.n(obj);
                MiniProgramDialog.b(MiniProgramDialog.this);
                this.f88663b = 1;
                if (DelayKt.b(200L, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            MiniProgramDialog.a(MiniProgramDialog.this);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniProgramDialog(@d Context mContext, int i10, float f10, @d List<MiniProgramObj> list) {
        super(mContext, R.style.FullScreenDialog);
        f0.p(mContext, "mContext");
        f0.p(list, "list");
        this.f88648b = mContext;
        this.f88649c = i10;
        this.f88650d = f10;
        this.f88651e = list;
        this.f88653g = r0.a(e1.e());
        this.f88654h = 300L;
        this.f88655i = 200L;
    }

    public /* synthetic */ MiniProgramDialog(Context context, int i10, float f10, List list, int i11, u uVar) {
        this(context, i10, (i11 & 4) != 0 ? 0.0f : f10, list);
    }

    public static final /* synthetic */ void a(MiniProgramDialog miniProgramDialog) {
        if (PatchProxy.proxy(new Object[]{miniProgramDialog}, null, changeQuickRedirect, true, 38575, new Class[]{MiniProgramDialog.class}, Void.TYPE).isSupported) {
            return;
        }
        super.dismiss();
    }

    public static final /* synthetic */ void b(MiniProgramDialog miniProgramDialog) {
        if (PatchProxy.proxy(new Object[]{miniProgramDialog}, null, changeQuickRedirect, true, 38574, new Class[]{MiniProgramDialog.class}, Void.TYPE).isSupported) {
            return;
        }
        miniProgramDialog.m();
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38572, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(this.f88653g, null, null, new MiniProgramDialog$expandScaleView$1(this, null), 3, null);
    }

    private final View d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38569, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = LayoutInflater.from(this.f88648b).inflate(R.layout.dialog_mini_program, (ViewGroup) null, false);
        f0.o(viewInflate, "from(mContext).inflate(R…ini_program, null, false)");
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewInflate.setOnClickListener(new a());
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv);
        this.f88652f = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new fc.b(4, ViewUtils.f(getContext(), 7.0f), false));
        }
        recyclerView.setAdapter(new b(ViewUtils.L(getContext()) >= ViewUtils.f(getContext(), 390.0f), ViewUtils.f(getContext(), 46.0f), this, getContext(), this.f88651e));
        Context context = this.f88648b;
        int iM = ViewUtils.m(context, ViewUtils.L(context), ViewUtils.L(this.f88648b));
        Context context2 = this.f88648b;
        recyclerView.setBackground(q.i(context2, R.color.background_layer_2_color, R.color.divider_secondary_1_color, 0.5f, ViewUtils.h0(context2, iM)));
        return viewInflate;
    }

    private final void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38573, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(this.f88653g, null, null, new MiniProgramDialog$hideScaleView$1(this, null), 3, null);
    }

    private final void n() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38570, new Class[0], Void.TYPE).isSupported || (view = this.f88652f) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f88649c;
        view.setAlpha(0.0f);
        view.setScaleY(0.0f);
        view.setScaleX(0.0f);
        view.setTranslationY(-this.f88650d);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38571, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(this.f88653g, null, null, new AnonymousClass1(null), 3, null);
    }

    public final long e() {
        return this.f88655i;
    }

    @d
    public final List<MiniProgramObj> f() {
        return this.f88651e;
    }

    @d
    public final Context g() {
        return this.f88648b;
    }

    @d
    public final q0 h() {
        return this.f88653g;
    }

    @e
    public final View i() {
        return this.f88652f;
    }

    public final long j() {
        return this.f88654h;
    }

    public final int k() {
        return this.f88649c;
    }

    public final float l() {
        return this.f88650d;
    }

    public final void o(@e View view) {
        this.f88652f = view;
    }

    @Override // android.app.Dialog
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 38567, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setDimAmount(0.15f);
            window.setNavigationBarColor(com.max.xiaoheihe.utils.d.E(R.color.transparent));
            window.setTransitionBackgroundFadeDuration(this.f88654h);
        }
        setContentView(d());
        n();
    }

    public final void p(float f10) {
        this.f88650d = f10;
    }

    @Override // android.app.Dialog
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38568, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.show();
        t.h0(getWindow());
        t.N(getWindow(), true);
        n();
        c();
    }
}
