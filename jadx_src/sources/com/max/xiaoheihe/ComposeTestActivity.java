package com.max.xiaoheihe;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: ComposeTestActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ComposeTestActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f76132b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.m.ar, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        androidx.activity.compose.c.b(this, null, ComposableSingletons$ComposeTestActivityKt.f76129a.a(), 1, null);
    }
}
