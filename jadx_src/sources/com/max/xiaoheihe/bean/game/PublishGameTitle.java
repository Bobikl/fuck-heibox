package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.calendar.GameEventObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PublishGameTitle.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PublishGameTitle implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String day_timestamp;

    @e
    private GameEventObj event;

    @e
    private GameObj game;

    @e
    private String month_timestamp;

    @e
    private String title;

    public PublishGameTitle() {
        this(null, null, null, null, null, 31, null);
    }

    public PublishGameTitle(@e String str, @e GameObj gameObj, @e String str2, @e String str3, @e GameEventObj gameEventObj) {
        this.title = str;
        this.game = gameObj;
        this.month_timestamp = str2;
        this.day_timestamp = str3;
        this.event = gameEventObj;
    }

    public /* synthetic */ PublishGameTitle(String str, GameObj gameObj, String str2, String str3, GameEventObj gameEventObj, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : gameObj, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : gameEventObj);
    }

    public static /* synthetic */ PublishGameTitle copy$default(PublishGameTitle publishGameTitle, String str, GameObj gameObj, String str2, String str3, GameEventObj gameEventObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{publishGameTitle, str, gameObj, str2, str3, gameEventObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14962, new Class[]{PublishGameTitle.class, String.class, GameObj.class, String.class, String.class, GameEventObj.class, Integer.TYPE, Object.class}, PublishGameTitle.class);
        if (patchProxyResultProxy.isSupported) {
            return (PublishGameTitle) patchProxyResultProxy.result;
        }
        return publishGameTitle.copy((i10 & 1) != 0 ? publishGameTitle.title : str, (i10 & 2) != 0 ? publishGameTitle.game : gameObj, (i10 & 4) != 0 ? publishGameTitle.month_timestamp : str2, (i10 & 8) != 0 ? publishGameTitle.day_timestamp : str3, (i10 & 16) != 0 ? publishGameTitle.event : gameEventObj);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final GameObj component2() {
        return this.game;
    }

    @e
    public final String component3() {
        return this.month_timestamp;
    }

    @e
    public final String component4() {
        return this.day_timestamp;
    }

    @e
    public final GameEventObj component5() {
        return this.event;
    }

    @d
    public final PublishGameTitle copy(@e String str, @e GameObj gameObj, @e String str2, @e String str3, @e GameEventObj gameEventObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, gameObj, str2, str3, gameEventObj}, this, changeQuickRedirect, false, 14961, new Class[]{String.class, GameObj.class, String.class, String.class, GameEventObj.class}, PublishGameTitle.class);
        return patchProxyResultProxy.isSupported ? (PublishGameTitle) patchProxyResultProxy.result : new PublishGameTitle(str, gameObj, str2, str3, gameEventObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14965, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishGameTitle)) {
            return false;
        }
        PublishGameTitle publishGameTitle = (PublishGameTitle) obj;
        return f0.g(this.title, publishGameTitle.title) && f0.g(this.game, publishGameTitle.game) && f0.g(this.month_timestamp, publishGameTitle.month_timestamp) && f0.g(this.day_timestamp, publishGameTitle.day_timestamp) && f0.g(this.event, publishGameTitle.event);
    }

    @e
    public final String getDay_timestamp() {
        return this.day_timestamp;
    }

    @e
    public final GameEventObj getEvent() {
        return this.event;
    }

    @e
    public final GameObj getGame() {
        return this.game;
    }

    @e
    public final String getMonth_timestamp() {
        return this.month_timestamp;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14964, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        GameObj gameObj = this.game;
        int iHashCode2 = (iHashCode + (gameObj == null ? 0 : gameObj.hashCode())) * 31;
        String str2 = this.month_timestamp;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.day_timestamp;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        GameEventObj gameEventObj = this.event;
        return iHashCode4 + (gameEventObj != null ? gameEventObj.hashCode() : 0);
    }

    public final boolean isEvent() {
        return this.event != null;
    }

    public final boolean isGame() {
        return this.game != null;
    }

    public final boolean isNormalEvent() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14960, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        GameEventObj gameEventObj = this.event;
        return f0.g(gameEventObj != null ? gameEventObj.getItem_type() : null, "1");
    }

    public final boolean isTitle() {
        return this.title != null;
    }

    public final void setDay_timestamp(@e String str) {
        this.day_timestamp = str;
    }

    public final void setEvent(@e GameEventObj gameEventObj) {
        this.event = gameEventObj;
    }

    public final void setGame(@e GameObj gameObj) {
        this.game = gameObj;
    }

    public final void setMonth_timestamp(@e String str) {
        this.month_timestamp = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14963, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PublishGameTitle(title=" + this.title + ", game=" + this.game + ", month_timestamp=" + this.month_timestamp + ", day_timestamp=" + this.day_timestamp + ", event=" + this.event + ')';
    }
}
