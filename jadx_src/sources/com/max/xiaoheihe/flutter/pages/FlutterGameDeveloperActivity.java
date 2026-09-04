package com.max.xiaoheihe.flutter.pages;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.flutter.BaseFlutterActivity;
import com.max.xiaoheihe.okflutter.FlutterHelper;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import io.flutter.embedding.engine.FlutterEngine;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: FlutterGameDeveloperActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FlutterGameDeveloperActivity extends BaseFlutterActivity {
    public static final int $stable = 0;

    @d
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: FlutterGameDeveloperActivity.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @m
        public final void start(@d Context context, @e Object obj) {
            if (PatchProxy.proxy(new Object[]{context, obj}, this, changeQuickRedirect, false, 22030, new Class[]{Context.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            Pair[] pairArr = new Pair[2];
            pairArr[0] = c1.a("heybox_id", i0.o().getAccount_detail().getUserid());
            if (obj instanceof Number) {
                obj = Integer.valueOf(((Number) obj).intValue());
            }
            pairArr[1] = c1.a("dvpid", obj);
            FlutterHelper.INSTANCE.getInstance().startFlutterFragmentActivity(context, "/flutter/game_developer", FlutterGameDeveloperActivity.class, k.p(s0.W(pairArr)));
        }
    }

    @m
    public static final void start(@d Context context, @e Object obj) {
        if (PatchProxy.proxy(new Object[]{context, obj}, null, changeQuickRedirect, true, 22029, new Class[]{Context.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        Companion.start(context, obj);
    }

    @Override // com.max.xiaoheihe.flutter.BaseFlutterActivity, io.flutter.embedding.android.FlutterFragmentActivity, io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(@d FlutterEngine flutterEngine) {
        if (PatchProxy.proxy(new Object[]{flutterEngine}, this, changeQuickRedirect, false, 22028, new Class[]{FlutterEngine.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(flutterEngine, "flutterEngine");
        super.configureFlutterEngine(flutterEngine);
        flutterEngine.getPlatformViewsController().getRegistry().registerViewFactory("/view/game_card", new VerGameCardNativeViewFactory());
    }
}
