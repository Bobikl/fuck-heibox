package com.max.xiaoheihe.module.game.epic;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;
import xh.m;

/* JADX INFO: compiled from: EpicDetailActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final C0792a f87402a = new C0792a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f87403b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    public static final String f87404c = "user_id";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.epic.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EpicDetailActivity.kt */
    public static final class C0792a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private C0792a() {
        }

        public /* synthetic */ C0792a(u uVar) {
            this();
        }

        @d
        @m
        public final Intent a(@d Context context, @d String userId) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, userId}, this, changeQuickRedirect, false, 37472, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(userId, "userId");
            v0 v0Var = v0.f124986a;
            String EPIC_DETAIL_PAGE = lb.a.f131066w4;
            f0.o(EPIC_DETAIL_PAGE, "EPIC_DETAIL_PAGE");
            String str = String.format(EPIC_DETAIL_PAGE, Arrays.copyOf(new Object[]{userId}, 1));
            f0.o(str, "format(format, *args)");
            Intent intentK2 = WebActionActivity.K2(context, str, com.max.xiaoheihe.utils.d.n0(R.string.epic), true, true);
            f0.o(intentK2, "getIntent(\n             …       true\n            )");
            return intentK2;
        }
    }

    @d
    @m
    public static final Intent a(@d Context context, @d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 37471, new Class[]{Context.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : f87402a.a(context, str);
    }
}
