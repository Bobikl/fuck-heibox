package com.max.xiaoheihe.bean.chat;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RoomListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RoomListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<FriendsChatRoomObj> rooms;

    public RoomListObj(@e List<FriendsChatRoomObj> list) {
        this.rooms = list;
    }

    public static /* synthetic */ RoomListObj copy$default(RoomListObj roomListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{roomListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14605, new Class[]{RoomListObj.class, List.class, Integer.TYPE, Object.class}, RoomListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RoomListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = roomListObj.rooms;
        }
        return roomListObj.copy(list);
    }

    @e
    public final List<FriendsChatRoomObj> component1() {
        return this.rooms;
    }

    @d
    public final RoomListObj copy(@e List<FriendsChatRoomObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14604, new Class[]{List.class}, RoomListObj.class);
        return patchProxyResultProxy.isSupported ? (RoomListObj) patchProxyResultProxy.result : new RoomListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14608, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof RoomListObj) && f0.g(this.rooms, ((RoomListObj) obj).rooms);
    }

    @e
    public final List<FriendsChatRoomObj> getRooms() {
        return this.rooms;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14607, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<FriendsChatRoomObj> list = this.rooms;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setRooms(@e List<FriendsChatRoomObj> list) {
        this.rooms = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14606, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RoomListObj(rooms=" + this.rooms + ')';
    }
}
