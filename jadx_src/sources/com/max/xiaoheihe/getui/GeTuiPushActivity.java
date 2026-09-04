package com.max.xiaoheihe.getui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.sdk.PushManager;
import com.max.hbcommon.utils.d;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import dl.e;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.UUID;
import kotlin.jvm.internal.f0;
import kotlin.text.Regex;

/* JADX INFO: compiled from: GeTuiPushActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GeTuiPushActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f77023b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private final void N0(Intent intent) {
        String stringExtra;
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 22052, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (intent != null && (stringExtra = intent.getStringExtra(AssistPushConsts.MSG_TYPE_PAYLOAD)) != null) {
            d.b("zzzzupush", "UpushNotifyClickActivity onMessage  ==" + stringExtra);
            v.g(this, stringExtra);
        }
        O0(intent);
        finish();
    }

    public final boolean O0(@e Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 22053, new Class[]{Intent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        try {
            String stringExtra = intent.getStringExtra("gttask");
            String stringExtra2 = intent.getStringExtra("gtaction");
            String clientid = PushManager.getInstance().getClientid(this);
            String string = UUID.randomUUID().toString();
            f0.o(string, "randomUUID().toString()");
            String str = stringExtra + clientid + new Regex(Constants.ACCEPT_TIME_SEPARATOR_SERVER).m(string, "");
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Charset UTF_8 = StandardCharsets.UTF_8;
            f0.o(UTF_8, "UTF_8");
            byte[] bytes = str.getBytes(UTF_8);
            f0.o(bytes, "this as java.lang.String).getBytes(charset)");
            String string2 = new BigInteger(1, messageDigest.digest(bytes)).toString(16);
            if (stringExtra2 != null) {
                return PushManager.getInstance().sendFeedbackMessage(this, stringExtra, string2, Integer.parseInt(stringExtra2));
            }
            return false;
        } catch (Exception e10) {
            g.f74531b.v("pushClick error: " + e10.getMessage());
            return false;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 22050, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.layout_pure_empty);
        View viewFindViewById = findViewById(R.id.vg_pure_empty);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(R.color.background_layer_2_color);
        }
        N0(getIntent());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@e Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 22051, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onNewIntent(intent);
        N0(intent);
    }
}
