package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.xiaoheihe.bean.FilterGroupObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameListObj implements Serializable {
    public static final String ROLL_PAGE_TYPE_HOME = "home";
    public static final String ROLL_PAGE_TYPE_ME = "me";
    public static final String ROLL_PAGE_TYPE_SEARCH = "search";
    public static final String ROLL_RELATE_TYPE_FOUNDED = "founded";
    public static final String ROLL_RELATE_TYPE_JOINED = "joined";
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<GameDeveloperObj> developers;
    private FiltersObj filter;
    private FiltersObj filter_head;
    private FilterGroupObj filter_region;
    private List<FilterGroup> filters;
    private KeyDescObj game_tag_info;
    private List<GameObj> games;
    private List<GameListHeaderObj> header;
    private boolean isRestored;
    private String is_use_new_style;
    private List<GameObj> items;
    private String key_point;
    private List<String> outer_filter_keys;
    private List<GameObj> publisher_games;
    private List<GameObj> similar_games;
    private List<KeyDescObj> sort_types;
    private List<GameReleaseTimeObj> time_list;

    public List<GameDeveloperObj> getDevelopers() {
        return this.developers;
    }

    public FiltersObj getFilter() {
        return this.filter;
    }

    public FiltersObj getFilter_head() {
        return this.filter_head;
    }

    public FilterGroupObj getFilter_region() {
        return this.filter_region;
    }

    public List<FilterGroup> getFilters() {
        return this.filters;
    }

    public KeyDescObj getGame_tag_info() {
        return this.game_tag_info;
    }

    public List<GameObj> getGames() {
        return this.games;
    }

    public List<GameListHeaderObj> getHeader() {
        return this.header;
    }

    public String getIs_use_new_style() {
        return this.is_use_new_style;
    }

    public List<GameObj> getItems() {
        return this.items;
    }

    public String getKey_point() {
        return this.key_point;
    }

    public List<String> getOuter_filter_keys() {
        return this.outer_filter_keys;
    }

    public List<GameObj> getPublisher_games() {
        return this.publisher_games;
    }

    public List<GameObj> getSimilar_games() {
        return this.similar_games;
    }

    public List<KeyDescObj> getSort_types() {
        return this.sort_types;
    }

    public List<GameReleaseTimeObj> getTime_list() {
        return this.time_list;
    }

    public boolean isRestored() {
        return this.isRestored;
    }

    public void setDevelopers(List<GameDeveloperObj> list) {
        this.developers = list;
    }

    public void setFilter(FiltersObj filtersObj) {
        this.filter = filtersObj;
    }

    public void setFilter_head(FiltersObj filtersObj) {
        this.filter_head = filtersObj;
    }

    public void setFilter_region(FilterGroupObj filterGroupObj) {
        this.filter_region = filterGroupObj;
    }

    public void setFilters(List<FilterGroup> list) {
        this.filters = list;
    }

    public void setGame_tag_info(KeyDescObj keyDescObj) {
        this.game_tag_info = keyDescObj;
    }

    public void setGames(List<GameObj> list) {
        this.games = list;
    }

    public void setHeader(List<GameListHeaderObj> list) {
        this.header = list;
    }

    public void setIs_use_new_style(String str) {
        this.is_use_new_style = str;
    }

    public void setItems(List<GameObj> list) {
        this.items = list;
    }

    public void setKey_point(String str) {
        this.key_point = str;
    }

    public void setOuter_filter_keys(List<String> list) {
        this.outer_filter_keys = list;
    }

    public void setPublisher_games(List<GameObj> list) {
        this.publisher_games = list;
    }

    public void setRestored(boolean z10) {
        this.isRestored = z10;
    }

    public void setSimilar_games(List<GameObj> list) {
        this.similar_games = list;
    }

    public void setSort_types(List<KeyDescObj> list) {
        this.sort_types = list;
    }

    public void setTime_list(List<GameReleaseTimeObj> list) {
        this.time_list = list;
    }
}
