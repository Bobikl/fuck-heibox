package com.max.xiaoheihe.bean.game.epic;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: EpicLoginParam.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class EpicLoginParam implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private String epic_id;
    private boolean is_epic_api_changed;

    @d
    private String js_get_name;

    @d
    private SteamAcceptGameParams login_param;

    @d
    private SteamAcceptGameParams login_success_param;

    public EpicLoginParam(@d SteamAcceptGameParams login_param, @d SteamAcceptGameParams login_success_param, @d String js_get_name, boolean z10, @d String epic_id) {
        f0.p(login_param, "login_param");
        f0.p(login_success_param, "login_success_param");
        f0.p(js_get_name, "js_get_name");
        f0.p(epic_id, "epic_id");
        this.login_param = login_param;
        this.login_success_param = login_success_param;
        this.js_get_name = js_get_name;
        this.is_epic_api_changed = z10;
        this.epic_id = epic_id;
    }

    public /* synthetic */ EpicLoginParam(SteamAcceptGameParams steamAcceptGameParams, SteamAcceptGameParams steamAcceptGameParams2, String str, boolean z10, String str2, int i10, u uVar) {
        this(steamAcceptGameParams, steamAcceptGameParams2, str, (i10 & 8) != 0 ? false : z10, str2);
    }

    public static /* synthetic */ EpicLoginParam copy$default(EpicLoginParam epicLoginParam, SteamAcceptGameParams steamAcceptGameParams, SteamAcceptGameParams steamAcceptGameParams2, String str, boolean z10, String str2, int i10, Object obj) {
        boolean z11 = z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{epicLoginParam, steamAcceptGameParams, steamAcceptGameParams2, str, new Byte(z11 ? (byte) 1 : (byte) 0), str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15185, new Class[]{EpicLoginParam.class, SteamAcceptGameParams.class, SteamAcceptGameParams.class, String.class, Boolean.TYPE, String.class, Integer.TYPE, Object.class}, EpicLoginParam.class);
        if (patchProxyResultProxy.isSupported) {
            return (EpicLoginParam) patchProxyResultProxy.result;
        }
        SteamAcceptGameParams steamAcceptGameParams3 = (i10 & 1) != 0 ? epicLoginParam.login_param : steamAcceptGameParams;
        SteamAcceptGameParams steamAcceptGameParams4 = (i10 & 2) != 0 ? epicLoginParam.login_success_param : steamAcceptGameParams2;
        String str3 = (i10 & 4) != 0 ? epicLoginParam.js_get_name : str;
        if ((i10 & 8) != 0) {
            z11 = epicLoginParam.is_epic_api_changed;
        }
        return epicLoginParam.copy(steamAcceptGameParams3, steamAcceptGameParams4, str3, z11, (i10 & 16) != 0 ? epicLoginParam.epic_id : str2);
    }

    @d
    public final SteamAcceptGameParams component1() {
        return this.login_param;
    }

    @d
    public final SteamAcceptGameParams component2() {
        return this.login_success_param;
    }

    @d
    public final String component3() {
        return this.js_get_name;
    }

    public final boolean component4() {
        return this.is_epic_api_changed;
    }

    @d
    public final String component5() {
        return this.epic_id;
    }

    @d
    public final EpicLoginParam copy(@d SteamAcceptGameParams login_param, @d SteamAcceptGameParams login_success_param, @d String js_get_name, boolean z10, @d String epic_id) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{login_param, login_success_param, js_get_name, new Byte(z10 ? (byte) 1 : (byte) 0), epic_id}, this, changeQuickRedirect, false, 15184, new Class[]{SteamAcceptGameParams.class, SteamAcceptGameParams.class, String.class, Boolean.TYPE, String.class}, EpicLoginParam.class);
        if (patchProxyResultProxy.isSupported) {
            return (EpicLoginParam) patchProxyResultProxy.result;
        }
        f0.p(login_param, "login_param");
        f0.p(login_success_param, "login_success_param");
        f0.p(js_get_name, "js_get_name");
        f0.p(epic_id, "epic_id");
        return new EpicLoginParam(login_param, login_success_param, js_get_name, z10, epic_id);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15188, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpicLoginParam)) {
            return false;
        }
        EpicLoginParam epicLoginParam = (EpicLoginParam) obj;
        return f0.g(this.login_param, epicLoginParam.login_param) && f0.g(this.login_success_param, epicLoginParam.login_success_param) && f0.g(this.js_get_name, epicLoginParam.js_get_name) && this.is_epic_api_changed == epicLoginParam.is_epic_api_changed && f0.g(this.epic_id, epicLoginParam.epic_id);
    }

    @d
    public final String getEpic_id() {
        return this.epic_id;
    }

    @d
    public final String getJs_get_name() {
        return this.js_get_name;
    }

    @d
    public final SteamAcceptGameParams getLogin_param() {
        return this.login_param;
    }

    @d
    public final SteamAcceptGameParams getLogin_success_param() {
        return this.login_success_param;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        ?? r10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15187, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((((this.login_param.hashCode() * 31) + this.login_success_param.hashCode()) * 31) + this.js_get_name.hashCode()) * 31;
        boolean z10 = this.is_epic_api_changed;
        if (z10) {
            r10 = z10;
            r10 = 1;
        }
        r10 = z10;
        return ((iHashCode + r10) * 31) + this.epic_id.hashCode();
    }

    public final boolean is_epic_api_changed() {
        return this.is_epic_api_changed;
    }

    public final void setEpic_id(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 15183, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.epic_id = str;
    }

    public final void setJs_get_name(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 15182, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.js_get_name = str;
    }

    public final void setLogin_param(@d SteamAcceptGameParams steamAcceptGameParams) {
        if (PatchProxy.proxy(new Object[]{steamAcceptGameParams}, this, changeQuickRedirect, false, 15180, new Class[]{SteamAcceptGameParams.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(steamAcceptGameParams, "<set-?>");
        this.login_param = steamAcceptGameParams;
    }

    public final void setLogin_success_param(@d SteamAcceptGameParams steamAcceptGameParams) {
        if (PatchProxy.proxy(new Object[]{steamAcceptGameParams}, this, changeQuickRedirect, false, 15181, new Class[]{SteamAcceptGameParams.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(steamAcceptGameParams, "<set-?>");
        this.login_success_param = steamAcceptGameParams;
    }

    public final void set_epic_api_changed(boolean z10) {
        this.is_epic_api_changed = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15186, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EpicLoginParam(login_param=" + this.login_param + ", login_success_param=" + this.login_success_param + ", js_get_name=" + this.js_get_name + ", is_epic_api_changed=" + this.is_epic_api_changed + ", epic_id=" + this.epic_id + ')';
    }
}
