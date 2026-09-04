package com.max.heyboxchat.douyinapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.p0;
import bb.c;
import com.max.hbshare.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.umeng.socialize.UMShareListener;
import j7.a;
import k7.b;

/* JADX INFO: loaded from: classes2.dex */
public class DouYinEntryActivity extends Activity implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    q7.a f74618b;

    @Override // j7.a
    public void a(k7.a aVar) {
    }

    @Override // j7.a
    public void b(Intent intent) {
    }

    @Override // j7.a
    public void c(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, c.l.f34562y9, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.e("DouYinEntryActivity", "onResp   " + bVar.errorCode + "   " + bVar.errorMsg);
        UMShareListener uMShareListener = d.f72579a;
        if (uMShareListener != null) {
            int i10 = bVar.errorCode;
            if (i10 == 0 || i10 == 20000) {
                uMShareListener.onResult(d.f72580b);
            } else if (i10 == -2 || i10 == 20004 || i10 == 20013) {
                uMShareListener.onCancel(d.f72580b);
            } else {
                uMShareListener.onError(d.f72580b, new Throwable(bVar.errorMsg));
            }
            d.f72579a = null;
            d.f72580b = null;
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(@p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, c.l.f34540x9, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        q7.a aVarA = p7.d.a(this);
        this.f74618b = aVarA;
        aVarA.m(getIntent(), this);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34584z9, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        d.f72579a = null;
        d.f72580b = null;
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.l.A9, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.onPointerCaptureChanged(z10);
    }
}
