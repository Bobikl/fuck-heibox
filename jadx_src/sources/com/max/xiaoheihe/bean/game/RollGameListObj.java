package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class RollGameListObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4687414674812134538L;
    private List<FiltersObj> filters;
    private List<GameRollRoomObj> rooms;
    private List<KeyDescObj> sort_types;

    public List<FiltersObj> getFilters() {
        return this.filters;
    }

    public List<GameRollRoomObj> getRooms() {
        return this.rooms;
    }

    public List<KeyDescObj> getSort_types() {
        return this.sort_types;
    }

    public void setFilters(List<FiltersObj> list) {
        this.filters = list;
    }

    public void setRooms(List<GameRollRoomObj> list) {
        this.rooms = list;
    }

    public void setSort_types(List<KeyDescObj> list) {
        this.sort_types = list;
    }
}
