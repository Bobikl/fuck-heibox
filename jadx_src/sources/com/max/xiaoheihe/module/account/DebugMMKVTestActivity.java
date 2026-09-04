package com.max.xiaoheihe.module.account;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbmmkv.MMKVManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;

/* JADX INFO: compiled from: DebugMMKVTestActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class DebugMMKVTestActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f77597b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // android.app.Activity
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 22631, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        final df.r rVarC = df.r.c(LayoutInflater.from(this));
        kotlin.jvm.internal.f0.o(rVarC, "inflate(LayoutInflater.from(this))");
        com.max.hbmmkv.c.a(MMKVManager.f71332d, new yh.l<com.max.hbmmkv.b, b2>() { // from class: com.max.xiaoheihe.module.account.DebugMMKVTestActivity.onCreate.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d com.max.hbmmkv.b withMMKV) {
                if (PatchProxy.proxy(new Object[]{withMMKV}, this, changeQuickRedirect, false, 22632, new Class[]{com.max.hbmmkv.b.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(withMMKV, "$this$withMMKV");
                String[] strArrA = withMMKV.a();
                if (strArrA != null) {
                    df.r rVar = rVarC;
                    DebugMMKVTestActivity debugMMKVTestActivity = this;
                    for (String str : strArrA) {
                        rVar.f115006b.setLayoutParams(new ViewGroup.LayoutParams(-1, com.max.accelworld.c.c(10, debugMMKVTestActivity)));
                        LinearLayout linearLayout = rVar.f115006b;
                        TextView textView = new TextView(debugMMKVTestActivity);
                        textView.setText(str);
                        linearLayout.addView(textView);
                    }
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(com.max.hbmmkv.b bVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 22633, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bVar);
                return b2.f124493a;
            }
        });
    }
}
