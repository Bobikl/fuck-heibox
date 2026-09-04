package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes9.dex */
public class WrittenOffConfirmActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    @BindView(R.id.tv_confirm)
    View tv_confirm;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.WrittenOffConfirmActivity$a$a, reason: collision with other inner class name */
        public class DialogInterfaceOnClickListenerC0647a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            DialogInterfaceOnClickListenerC0647a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24754, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (com.max.hbcommon.utils.c.u(com.max.xiaoheihe.utils.i0.o().getPhonenum())) {
                    WrittenOffConfirmActivity.N1(WrittenOffConfirmActivity.this);
                } else {
                    ((BaseActivity) WrittenOffConfirmActivity.this).f66601b.startActivity(WrittenOffActivity.c2(((BaseActivity) WrittenOffConfirmActivity.this).f66601b, com.max.xiaoheihe.utils.i0.o().getPhonenum()));
                }
                dialogInterface.dismiss();
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24755, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24753, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) WrittenOffConfirmActivity.this).f66601b);
            fVar.y(com.max.xiaoheihe.utils.d.n0(R.string.written_off_confirm));
            fVar.l(com.max.xiaoheihe.utils.d.n0(R.string.written_off_msg));
            com.max.hbcommon.view.a aVarD = fVar.d();
            aVarD.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new DialogInterfaceOnClickListenerC0647a());
            aVarD.r(com.max.xiaoheihe.utils.d.n0(R.string.cancel), new b());
            aVarD.show();
        }
    }

    public class b extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24756, new Class[]{Result.class}, Void.TYPE).isSupported && WrittenOffConfirmActivity.this.isActive()) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("成功");
                com.max.xiaoheihe.utils.d.W0(((BaseActivity) WrittenOffConfirmActivity.this).f66601b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24757, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    static /* synthetic */ void N1(WrittenOffConfirmActivity writtenOffConfirmActivity) {
        if (PatchProxy.proxy(new Object[]{writtenOffConfirmActivity}, null, changeQuickRedirect, true, 24752, new Class[]{WrittenOffConfirmActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writtenOffConfirmActivity.V1();
    }

    public static Intent T1(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 24749, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) WrittenOffConfirmActivity.class);
    }

    private void V1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24751, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().T3(null, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24750, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_written_off_confirm);
        this.f66620u = ButterKnife.a(this);
        this.f66616q.setTitle(R.string.written_off_account);
        this.f66617r.setVisibility(0);
        this.tv_confirm.setOnClickListener(new a());
    }
}
