package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;

/* JADX INFO: compiled from: PlatformCurrentDataObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PlatformCurrentDataObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isHideEpic;
    private boolean isMe;

    @e
    private String mCurrentPlatform = GameObj.PLATFORM_STEAM;
    private int unBindPlatFormNum;

    @e
    public final String getMCurrentPlatform() {
        return this.mCurrentPlatform;
    }

    public final int getUnBindPlatFormNum() {
        return this.unBindPlatFormNum;
    }

    public final boolean isHideEpic() {
        return this.isHideEpic;
    }

    public final boolean isMe() {
        return this.isMe;
    }

    public final void setHideEpic(boolean z10) {
        this.isHideEpic = z10;
    }

    public final void setMCurrentPlatform(@e String str) {
        this.mCurrentPlatform = str;
    }

    public final void setMe(boolean z10) {
        this.isMe = z10;
    }

    public final void setUnBindPlatFormNum(int i10) {
        this.unBindPlatFormNum = i10;
    }
}
