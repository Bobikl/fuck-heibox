package com.max.xiaoheihe.module.game.xbox;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.xbox.XboxFriendInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: XboxFriendAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b extends s<XboxFriendInfo> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f88541d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final Context f88542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final List<XboxFriendInfo> f88543c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@d Context context, @d List<XboxFriendInfo> friendList) {
        super(context, friendList, R.layout.item_platform_friend);
        f0.p(context, "context");
        f0.p(friendList, "friendList");
        this.f88542b = context;
        this.f88543c = friendList;
    }

    @d
    public final Context m() {
        return this.f88542b;
    }

    @d
    public final List<XboxFriendInfo> n() {
        return this.f88543c;
    }

    public void o(@d s.e viewHolder, @e XboxFriendInfo xboxFriendInfo) {
        if (PatchProxy.proxy(new Object[]{viewHolder, xboxFriendInfo}, this, changeQuickRedirect, false, 38421, new Class[]{s.e.class, XboxFriendInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        new com.max.xiaoheihe.module.game.xbox.viewholderbinder.a(new com.max.xiaoheihe.module.game.xbox.viewholderbinder.b(this.f88542b, this, null, 4, null)).f(viewHolder, xboxFriendInfo);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, XboxFriendInfo xboxFriendInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, xboxFriendInfo}, this, changeQuickRedirect, false, 38422, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(eVar, xboxFriendInfo);
    }
}
