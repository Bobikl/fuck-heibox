package com.max.xiaoheihe.bean.account.steaminfo;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SteamFriendRequestShareToken.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SteamFriendRequestShareToken implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private String token;

    public SteamFriendRequestShareToken(@d String token) {
        f0.p(token, "token");
        this.token = token;
    }

    @d
    public final String getToken() {
        return this.token;
    }

    public final void setToken(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14072, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.token = str;
    }
}
