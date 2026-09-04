package com.max.xiaoheihe.view;

import android.content.Context;
import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: MyURLSpan.java */
/* JADX INFO: loaded from: classes13.dex */
public class o extends ClickableSpan {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f96001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f96002c;

    public o(Context context, String str) {
        this.f96001b = str;
        this.f96002c = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49481, new Class[]{View.class}, Void.TYPE).isSupported || l0.n0(this.f96002c, this.f96001b)) {
            return;
        }
        Intent intent = new Intent(this.f96002c, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", this.f96001b);
        intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.app_name));
        this.f96002c.startActivity(intent);
    }
}
