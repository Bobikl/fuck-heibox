package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: GameOverviewHeaderInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewHeaderInfoObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String avatar;

    @e
    private String event_points;

    @e
    private List<FilterGroup> filters;

    @e
    private String is_heybox_user;

    @e
    private String is_plus_subscriber;

    @e
    private String is_verified;

    @e
    private String name;

    @e
    private String steam_id;

    @e
    public final String getAvatar() {
        return this.avatar;
    }

    @e
    public final String getEvent_points() {
        return this.event_points;
    }

    @e
    public final List<FilterGroup> getFilters() {
        return this.filters;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getSteam_id() {
        return this.steam_id;
    }

    @e
    public final String is_heybox_user() {
        return this.is_heybox_user;
    }

    @e
    public final String is_plus_subscriber() {
        return this.is_plus_subscriber;
    }

    @e
    public final String is_verified() {
        return this.is_verified;
    }

    public final void setAvatar(@e String str) {
        this.avatar = str;
    }

    public final void setEvent_points(@e String str) {
        this.event_points = str;
    }

    public final void setFilters(@e List<FilterGroup> list) {
        this.filters = list;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setSteam_id(@e String str) {
        this.steam_id = str;
    }

    public final void set_heybox_user(@e String str) {
        this.is_heybox_user = str;
    }

    public final void set_plus_subscriber(@e String str) {
        this.is_plus_subscriber = str;
    }

    public final void set_verified(@e String str) {
        this.is_verified = str;
    }
}
