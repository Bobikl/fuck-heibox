package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameMobileBundleObj;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: MobileBundlePurchaseController.java */
/* JADX INFO: loaded from: classes11.dex */
public class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f85663b = "purchase";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.reactivex.disposables.a f85664a;

    /* JADX INFO: compiled from: MobileBundlePurchaseController.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f85665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameMobileBundleObj f85666c;

        a(Context context, GameMobileBundleObj gameMobileBundleObj) {
            this.f85665b = context;
            this.f85666c = gameMobileBundleObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35685, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(this.f85665b) && (this.f85665b instanceof AppCompatActivity)) {
                com.max.xiaoheihe.module.mall.j.V3(this.f85666c).show(((AppCompatActivity) this.f85665b).getSupportFragmentManager(), d0.f85663b);
            }
        }
    }

    private void a(io.reactivex.disposables.b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 35683, new Class[]{io.reactivex.disposables.b.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f85664a == null) {
            this.f85664a = new io.reactivex.disposables.a();
        }
        this.f85664a.c(bVar);
    }

    private void d() {
        io.reactivex.disposables.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35684, new Class[0], Void.TYPE).isSupported || (aVar = this.f85664a) == null) {
            return;
        }
        aVar.f();
    }

    public void b(com.max.hbcommon.base.adapter.s.e eVar, GameMobileBundleObj gameMobileBundleObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{eVar, gameMobileBundleObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35681, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameMobileBundleObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) eVar.i(R.id.tv_option);
        Context context = textView.getContext();
        textView.setText(!com.max.hbcommon.utils.c.u(gameMobileBundleObj.getButton_desc()) ? gameMobileBundleObj.getButton_desc() : context.getResources().getString(R.string.claim));
        if (gameMobileBundleObj.getDetail() == null) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(0);
            textView.setOnClickListener(new a(context, gameMobileBundleObj));
        }
    }

    public void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35682, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d();
    }
}
