package com.max.xiaoheihe.utils;

import android.content.Context;
import android.content.DialogInterface;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AccountStateObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: AccountUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.utils.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AccountUtils.java */
    public class C0902a extends com.max.hbcommon.network.d<Result<AccountStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f95318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f95319c;

        /* JADX INFO: renamed from: com.max.xiaoheihe.utils.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AccountUtils.java */
        public class DialogInterfaceOnClickListenerC0903a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            DialogInterfaceOnClickListenerC0903a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48422, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                C0902a.this.f95318b.a();
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.utils.a$a$b */
        /* JADX INFO: compiled from: AccountUtils.java */
        public class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48423, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.utils.a$a$c */
        /* JADX INFO: compiled from: AccountUtils.java */
        public class c implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48424, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.utils.a$a$d */
        /* JADX INFO: compiled from: AccountUtils.java */
        public class d implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f95323b;

            /* JADX INFO: renamed from: com.max.xiaoheihe.utils.a$a$d$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: AccountUtils.java */
            public class DialogInterfaceOnClickListenerC0904a implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                DialogInterfaceOnClickListenerC0904a() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48426, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    C0902a.this.f95318b.a();
                    dialogInterface.dismiss();
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.utils.a$a$d$b */
            /* JADX INFO: compiled from: AccountUtils.java */
            public class b implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                b() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48427, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }

            d(String str) {
                this.f95323b = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48425, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(C0902a.this.f95319c);
                fVar.l(this.f95323b);
                com.max.hbcommon.view.a aVarD = fVar.d();
                aVarD.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new DialogInterfaceOnClickListenerC0904a());
                aVarD.r(com.max.xiaoheihe.utils.d.n0(R.string.cancel), new b());
                aVarD.show();
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.utils.a$a$e */
        /* JADX INFO: compiled from: AccountUtils.java */
        public class e implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            e() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48428, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        C0902a(b bVar, Context context) {
            this.f95318b = bVar;
            this.f95319c = context;
        }

        public void onNext(Result<AccountStateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48420, new Class[]{Result.class}, Void.TYPE).isSupported || result.getResult() == null) {
                return;
            }
            if ("info".equals(result.getResult().getLevel())) {
                this.f95318b.a();
                return;
            }
            if ("warn".equals(result.getResult().getLevel())) {
                com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f95319c);
                fVar.l(result.getResult().getMsg());
                com.max.hbcommon.view.a aVarD = fVar.d();
                aVarD.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new DialogInterfaceOnClickListenerC0903a());
                aVarD.r(com.max.xiaoheihe.utils.d.n0(R.string.cancel), new b());
                aVarD.show();
                return;
            }
            if ("error".equals(result.getResult().getLevel())) {
                com.max.hbcommon.view.a.f fVar2 = new com.max.hbcommon.view.a.f(this.f95319c);
                fVar2.l(result.getResult().getMsg());
                com.max.hbcommon.view.a aVarD2 = fVar2.d();
                aVarD2.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new c());
                aVarD2.show();
                return;
            }
            if ("warn_v2".equals(result.getResult().getLevel())) {
                com.max.hbcommon.view.a.f fVar3 = new com.max.hbcommon.view.a.f(this.f95319c);
                fVar3.l(result.getResult().getMsg());
                com.max.hbcommon.view.a aVarD3 = fVar3.d();
                aVarD3.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new d(result.getResult().getMsg2()));
                aVarD3.r(com.max.xiaoheihe.utils.d.n0(R.string.cancel), new e());
                aVarD3.show();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48421, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AccountStateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: AccountUtils.java */
    public interface b {
        void a();
    }

    public static void a(com.max.hbcommon.base.f fVar, io.reactivex.disposables.a aVar, String str, String str2, b bVar) {
        if (PatchProxy.proxy(new Object[]{fVar, aVar, str, str2, bVar}, null, changeQuickRedirect, true, 48419, new Class[]{com.max.hbcommon.base.f.class, io.reactivex.disposables.a.class, String.class, String.class, b.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().G8(str, w.a(str2)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0902a(bVar, fVar.getViewContext())));
    }
}
