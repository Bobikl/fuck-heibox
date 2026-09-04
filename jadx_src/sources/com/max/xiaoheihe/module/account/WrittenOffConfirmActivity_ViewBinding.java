package com.max.xiaoheihe.module.account;

import android.view.View;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class WrittenOffConfirmActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WrittenOffConfirmActivity f78716b;

    @i1
    public WrittenOffConfirmActivity_ViewBinding(WrittenOffConfirmActivity writtenOffConfirmActivity) {
        this(writtenOffConfirmActivity, writtenOffConfirmActivity.getWindow().getDecorView());
    }

    @i1
    public WrittenOffConfirmActivity_ViewBinding(WrittenOffConfirmActivity writtenOffConfirmActivity, View view) {
        this.f78716b = writtenOffConfirmActivity;
        writtenOffConfirmActivity.tv_confirm = butterknife.internal.f.e(view, R.id.tv_confirm, "field 'tv_confirm'");
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24758, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WrittenOffConfirmActivity writtenOffConfirmActivity = this.f78716b;
        if (writtenOffConfirmActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f78716b = null;
        writtenOffConfirmActivity.tv_confirm = null;
    }
}
