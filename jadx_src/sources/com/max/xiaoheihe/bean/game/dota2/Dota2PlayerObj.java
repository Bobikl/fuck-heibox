package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.game.gameoverview.KDAObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Dota2PlayerObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2PlayerObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String account_id;

    @e
    private String aghanims_img;

    @e
    private String avatar;

    @e
    private List<String> backpack;

    @e
    private String chart_color;

    @e
    private Float current_value;

    @e
    private String damage;

    @e
    private String damage_gold_rate;

    @e
    private String damage_rate;

    @e
    private String dan_icon;

    @e
    private String dan_value;
    private boolean expand;

    @e
    private String fight_rate;

    @e
    private String gold;

    @e
    private List<Dota2ChartObj> graph_exp;

    @e
    private List<Dota2ChartObj> graph_gold;

    @e
    private List<KeyDescObj> hero_data;

    @e
    private String hero_icon;

    @e
    private Dota2HeroObj hero_info;

    @e
    private HeroKillObj hero_kill;

    @e
    private String is_me;

    @e
    private String is_mvp;

    @e
    private List<String> items;

    @e
    private KDAObj kda;

    @e
    private String mvp_score;

    @e
    private String name;

    @e
    private String neutral;

    @e
    private List<KeyDescObj> permanent_buffs;

    @e
    private List<KeyDescObj> radar_data_list;

    @e
    private List<KeyDescObj> skill_up;

    @e
    private HeroKillObj support_items;

    @e
    private Dota2TeamInfoObj team_info;

    @e
    private Dota2UnitObj unit;

    @e
    private String win;

    public Dota2PlayerObj(@e String str, @e String str2, @e String str3, @e Dota2TeamInfoObj dota2TeamInfoObj, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12, @e Dota2HeroObj dota2HeroObj, @e KDAObj kDAObj, @e List<String> list, @e List<String> list2, @e List<KeyDescObj> list3, @e String str13, @e String str14, @e String str15, @e List<KeyDescObj> list4, @e Dota2UnitObj dota2UnitObj, @e HeroKillObj heroKillObj, @e HeroKillObj heroKillObj2, @e List<KeyDescObj> list5, boolean z10, @e List<Dota2ChartObj> list6, @e List<Dota2ChartObj> list7, @e String str16, @e String str17, @e String str18, @e List<KeyDescObj> list8, @e Float f10) {
        this.account_id = str;
        this.avatar = str2;
        this.name = str3;
        this.team_info = dota2TeamInfoObj;
        this.dan_value = str4;
        this.dan_icon = str5;
        this.fight_rate = str6;
        this.damage_rate = str7;
        this.is_mvp = str8;
        this.is_me = str9;
        this.win = str10;
        this.aghanims_img = str11;
        this.neutral = str12;
        this.hero_info = dota2HeroObj;
        this.kda = kDAObj;
        this.items = list;
        this.backpack = list2;
        this.hero_data = list3;
        this.mvp_score = str13;
        this.gold = str14;
        this.damage = str15;
        this.permanent_buffs = list4;
        this.unit = dota2UnitObj;
        this.hero_kill = heroKillObj;
        this.support_items = heroKillObj2;
        this.skill_up = list5;
        this.expand = z10;
        this.graph_gold = list6;
        this.graph_exp = list7;
        this.hero_icon = str16;
        this.chart_color = str17;
        this.damage_gold_rate = str18;
        this.radar_data_list = list8;
        this.current_value = f10;
    }

    public /* synthetic */ Dota2PlayerObj(String str, String str2, String str3, Dota2TeamInfoObj dota2TeamInfoObj, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Dota2HeroObj dota2HeroObj, KDAObj kDAObj, List list, List list2, List list3, String str13, String str14, String str15, List list4, Dota2UnitObj dota2UnitObj, HeroKillObj heroKillObj, HeroKillObj heroKillObj2, List list5, boolean z10, List list6, List list7, String str16, String str17, String str18, List list8, Float f10, int i10, int i11, u uVar) {
        this(str, str2, str3, dota2TeamInfoObj, str4, str5, str6, str7, str8, str9, str10, str11, str12, dota2HeroObj, kDAObj, list, list2, list3, str13, str14, str15, list4, dota2UnitObj, heroKillObj, heroKillObj2, list5, (i10 & 67108864) != 0 ? false : z10, list6, list7, str16, str17, str18, list8, (i11 & 2) != 0 ? Float.valueOf(0.0f) : f10);
    }

    public static /* synthetic */ Dota2PlayerObj copy$default(Dota2PlayerObj dota2PlayerObj, String str, String str2, String str3, Dota2TeamInfoObj dota2TeamInfoObj, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Dota2HeroObj dota2HeroObj, KDAObj kDAObj, List list, List list2, List list3, String str13, String str14, String str15, List list4, Dota2UnitObj dota2UnitObj, HeroKillObj heroKillObj, HeroKillObj heroKillObj2, List list5, boolean z10, List list6, List list7, String str16, String str17, String str18, List list8, Float f10, int i10, int i11, Object obj) {
        Object[] objArr = {dota2PlayerObj, str, str2, str3, dota2TeamInfoObj, str4, str5, str6, str7, str8, str9, str10, str11, str12, dota2HeroObj, kDAObj, list, list2, list3, str13, str14, str15, list4, dota2UnitObj, heroKillObj, heroKillObj2, list5, new Byte(z10 ? (byte) 1 : (byte) 0), list6, list7, str16, str17, str18, list8, f10, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15092, new Class[]{Dota2PlayerObj.class, String.class, String.class, String.class, Dota2TeamInfoObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Dota2HeroObj.class, KDAObj.class, List.class, List.class, List.class, String.class, String.class, String.class, List.class, Dota2UnitObj.class, HeroKillObj.class, HeroKillObj.class, List.class, Boolean.TYPE, List.class, List.class, String.class, String.class, String.class, List.class, Float.class, cls, cls, Object.class}, Dota2PlayerObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2PlayerObj) patchProxyResultProxy.result;
        }
        return dota2PlayerObj.copy((i10 & 1) != 0 ? dota2PlayerObj.account_id : str, (i10 & 2) != 0 ? dota2PlayerObj.avatar : str2, (i10 & 4) != 0 ? dota2PlayerObj.name : str3, (i10 & 8) != 0 ? dota2PlayerObj.team_info : dota2TeamInfoObj, (i10 & 16) != 0 ? dota2PlayerObj.dan_value : str4, (i10 & 32) != 0 ? dota2PlayerObj.dan_icon : str5, (i10 & 64) != 0 ? dota2PlayerObj.fight_rate : str6, (i10 & 128) != 0 ? dota2PlayerObj.damage_rate : str7, (i10 & 256) != 0 ? dota2PlayerObj.is_mvp : str8, (i10 & 512) != 0 ? dota2PlayerObj.is_me : str9, (i10 & 1024) != 0 ? dota2PlayerObj.win : str10, (i10 & 2048) != 0 ? dota2PlayerObj.aghanims_img : str11, (i10 & 4096) != 0 ? dota2PlayerObj.neutral : str12, (i10 & 8192) != 0 ? dota2PlayerObj.hero_info : dota2HeroObj, (i10 & 16384) != 0 ? dota2PlayerObj.kda : kDAObj, (i10 & 32768) != 0 ? dota2PlayerObj.items : list, (i10 & 65536) != 0 ? dota2PlayerObj.backpack : list2, (i10 & 131072) != 0 ? dota2PlayerObj.hero_data : list3, (i10 & 262144) != 0 ? dota2PlayerObj.mvp_score : str13, (i10 & 524288) != 0 ? dota2PlayerObj.gold : str14, (i10 & 1048576) != 0 ? dota2PlayerObj.damage : str15, (i10 & 2097152) != 0 ? dota2PlayerObj.permanent_buffs : list4, (i10 & 4194304) != 0 ? dota2PlayerObj.unit : dota2UnitObj, (i10 & 8388608) != 0 ? dota2PlayerObj.hero_kill : heroKillObj, (i10 & 16777216) != 0 ? dota2PlayerObj.support_items : heroKillObj2, (i10 & 33554432) != 0 ? dota2PlayerObj.skill_up : list5, (i10 & 67108864) != 0 ? dota2PlayerObj.expand : z10 ? 1 : 0, (i10 & 134217728) != 0 ? dota2PlayerObj.graph_gold : list6, (i10 & 268435456) != 0 ? dota2PlayerObj.graph_exp : list7, (i10 & 536870912) != 0 ? dota2PlayerObj.hero_icon : str16, (i10 & 1073741824) != 0 ? dota2PlayerObj.chart_color : str17, (i10 & Integer.MIN_VALUE) != 0 ? dota2PlayerObj.damage_gold_rate : str18, (i11 & 1) != 0 ? dota2PlayerObj.radar_data_list : list8, (i11 & 2) != 0 ? dota2PlayerObj.current_value : f10);
    }

    @e
    public final String component1() {
        return this.account_id;
    }

    @e
    public final String component10() {
        return this.is_me;
    }

    @e
    public final String component11() {
        return this.win;
    }

    @e
    public final String component12() {
        return this.aghanims_img;
    }

    @e
    public final String component13() {
        return this.neutral;
    }

    @e
    public final Dota2HeroObj component14() {
        return this.hero_info;
    }

    @e
    public final KDAObj component15() {
        return this.kda;
    }

    @e
    public final List<String> component16() {
        return this.items;
    }

    @e
    public final List<String> component17() {
        return this.backpack;
    }

    @e
    public final List<KeyDescObj> component18() {
        return this.hero_data;
    }

    @e
    public final String component19() {
        return this.mvp_score;
    }

    @e
    public final String component2() {
        return this.avatar;
    }

    @e
    public final String component20() {
        return this.gold;
    }

    @e
    public final String component21() {
        return this.damage;
    }

    @e
    public final List<KeyDescObj> component22() {
        return this.permanent_buffs;
    }

    @e
    public final Dota2UnitObj component23() {
        return this.unit;
    }

    @e
    public final HeroKillObj component24() {
        return this.hero_kill;
    }

    @e
    public final HeroKillObj component25() {
        return this.support_items;
    }

    @e
    public final List<KeyDescObj> component26() {
        return this.skill_up;
    }

    public final boolean component27() {
        return this.expand;
    }

    @e
    public final List<Dota2ChartObj> component28() {
        return this.graph_gold;
    }

    @e
    public final List<Dota2ChartObj> component29() {
        return this.graph_exp;
    }

    @e
    public final String component3() {
        return this.name;
    }

    @e
    public final String component30() {
        return this.hero_icon;
    }

    @e
    public final String component31() {
        return this.chart_color;
    }

    @e
    public final String component32() {
        return this.damage_gold_rate;
    }

    @e
    public final List<KeyDescObj> component33() {
        return this.radar_data_list;
    }

    @e
    public final Float component34() {
        return this.current_value;
    }

    @e
    public final Dota2TeamInfoObj component4() {
        return this.team_info;
    }

    @e
    public final String component5() {
        return this.dan_value;
    }

    @e
    public final String component6() {
        return this.dan_icon;
    }

    @e
    public final String component7() {
        return this.fight_rate;
    }

    @e
    public final String component8() {
        return this.damage_rate;
    }

    @e
    public final String component9() {
        return this.is_mvp;
    }

    @d
    public final Dota2PlayerObj copy(@e String str, @e String str2, @e String str3, @e Dota2TeamInfoObj dota2TeamInfoObj, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12, @e Dota2HeroObj dota2HeroObj, @e KDAObj kDAObj, @e List<String> list, @e List<String> list2, @e List<KeyDescObj> list3, @e String str13, @e String str14, @e String str15, @e List<KeyDescObj> list4, @e Dota2UnitObj dota2UnitObj, @e HeroKillObj heroKillObj, @e HeroKillObj heroKillObj2, @e List<KeyDescObj> list5, boolean z10, @e List<Dota2ChartObj> list6, @e List<Dota2ChartObj> list7, @e String str16, @e String str17, @e String str18, @e List<KeyDescObj> list8, @e Float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, dota2TeamInfoObj, str4, str5, str6, str7, str8, str9, str10, str11, str12, dota2HeroObj, kDAObj, list, list2, list3, str13, str14, str15, list4, dota2UnitObj, heroKillObj, heroKillObj2, list5, new Byte(z10 ? (byte) 1 : (byte) 0), list6, list7, str16, str17, str18, list8, f10}, this, changeQuickRedirect, false, 15091, new Class[]{String.class, String.class, String.class, Dota2TeamInfoObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Dota2HeroObj.class, KDAObj.class, List.class, List.class, List.class, String.class, String.class, String.class, List.class, Dota2UnitObj.class, HeroKillObj.class, HeroKillObj.class, List.class, Boolean.TYPE, List.class, List.class, String.class, String.class, String.class, List.class, Float.class}, Dota2PlayerObj.class);
        return patchProxyResultProxy.isSupported ? (Dota2PlayerObj) patchProxyResultProxy.result : new Dota2PlayerObj(str, str2, str3, dota2TeamInfoObj, str4, str5, str6, str7, str8, str9, str10, str11, str12, dota2HeroObj, kDAObj, list, list2, list3, str13, str14, str15, list4, dota2UnitObj, heroKillObj, heroKillObj2, list5, z10, list6, list7, str16, str17, str18, list8, f10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15095, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dota2PlayerObj)) {
            return false;
        }
        Dota2PlayerObj dota2PlayerObj = (Dota2PlayerObj) obj;
        return f0.g(this.account_id, dota2PlayerObj.account_id) && f0.g(this.avatar, dota2PlayerObj.avatar) && f0.g(this.name, dota2PlayerObj.name) && f0.g(this.team_info, dota2PlayerObj.team_info) && f0.g(this.dan_value, dota2PlayerObj.dan_value) && f0.g(this.dan_icon, dota2PlayerObj.dan_icon) && f0.g(this.fight_rate, dota2PlayerObj.fight_rate) && f0.g(this.damage_rate, dota2PlayerObj.damage_rate) && f0.g(this.is_mvp, dota2PlayerObj.is_mvp) && f0.g(this.is_me, dota2PlayerObj.is_me) && f0.g(this.win, dota2PlayerObj.win) && f0.g(this.aghanims_img, dota2PlayerObj.aghanims_img) && f0.g(this.neutral, dota2PlayerObj.neutral) && f0.g(this.hero_info, dota2PlayerObj.hero_info) && f0.g(this.kda, dota2PlayerObj.kda) && f0.g(this.items, dota2PlayerObj.items) && f0.g(this.backpack, dota2PlayerObj.backpack) && f0.g(this.hero_data, dota2PlayerObj.hero_data) && f0.g(this.mvp_score, dota2PlayerObj.mvp_score) && f0.g(this.gold, dota2PlayerObj.gold) && f0.g(this.damage, dota2PlayerObj.damage) && f0.g(this.permanent_buffs, dota2PlayerObj.permanent_buffs) && f0.g(this.unit, dota2PlayerObj.unit) && f0.g(this.hero_kill, dota2PlayerObj.hero_kill) && f0.g(this.support_items, dota2PlayerObj.support_items) && f0.g(this.skill_up, dota2PlayerObj.skill_up) && this.expand == dota2PlayerObj.expand && f0.g(this.graph_gold, dota2PlayerObj.graph_gold) && f0.g(this.graph_exp, dota2PlayerObj.graph_exp) && f0.g(this.hero_icon, dota2PlayerObj.hero_icon) && f0.g(this.chart_color, dota2PlayerObj.chart_color) && f0.g(this.damage_gold_rate, dota2PlayerObj.damage_gold_rate) && f0.g(this.radar_data_list, dota2PlayerObj.radar_data_list) && f0.g(this.current_value, dota2PlayerObj.current_value);
    }

    @e
    public final String getAccount_id() {
        return this.account_id;
    }

    @e
    public final String getAghanims_img() {
        return this.aghanims_img;
    }

    @e
    public final String getAvatar() {
        return this.avatar;
    }

    @e
    public final List<String> getBackpack() {
        return this.backpack;
    }

    @e
    public final String getChart_color() {
        return this.chart_color;
    }

    @e
    public final Float getCurrent_value() {
        return this.current_value;
    }

    @e
    public final String getDamage() {
        return this.damage;
    }

    @e
    public final String getDamage_gold_rate() {
        return this.damage_gold_rate;
    }

    @e
    public final String getDamage_rate() {
        return this.damage_rate;
    }

    @e
    public final String getDan_icon() {
        return this.dan_icon;
    }

    @e
    public final String getDan_value() {
        return this.dan_value;
    }

    public final boolean getExpand() {
        return this.expand;
    }

    @e
    public final String getFight_rate() {
        return this.fight_rate;
    }

    @e
    public final String getGold() {
        return this.gold;
    }

    @e
    public final List<Dota2ChartObj> getGraph_exp() {
        return this.graph_exp;
    }

    @e
    public final List<Dota2ChartObj> getGraph_gold() {
        return this.graph_gold;
    }

    @e
    public final List<KeyDescObj> getHero_data() {
        return this.hero_data;
    }

    @e
    public final String getHero_icon() {
        return this.hero_icon;
    }

    @e
    public final Dota2HeroObj getHero_info() {
        return this.hero_info;
    }

    @e
    public final HeroKillObj getHero_kill() {
        return this.hero_kill;
    }

    @e
    public final List<String> getItems() {
        return this.items;
    }

    @e
    public final KDAObj getKda() {
        return this.kda;
    }

    @e
    public final String getMvp_score() {
        return this.mvp_score;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getNeutral() {
        return this.neutral;
    }

    @e
    public final List<KeyDescObj> getPermanent_buffs() {
        return this.permanent_buffs;
    }

    @e
    public final List<KeyDescObj> getRadar_data_list() {
        return this.radar_data_list;
    }

    @e
    public final List<KeyDescObj> getSkill_up() {
        return this.skill_up;
    }

    @e
    public final HeroKillObj getSupport_items() {
        return this.support_items;
    }

    @e
    public final Dota2TeamInfoObj getTeam_info() {
        return this.team_info;
    }

    @e
    public final Dota2UnitObj getUnit() {
        return this.unit;
    }

    @e
    public final String getWin() {
        return this.win;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v104 */
    /* JADX WARN: Type inference failed for: r2v130 */
    /* JADX WARN: Type inference failed for: r2v78, types: [int] */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15094, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.account_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Dota2TeamInfoObj dota2TeamInfoObj = this.team_info;
        int iHashCode4 = (iHashCode3 + (dota2TeamInfoObj == null ? 0 : dota2TeamInfoObj.hashCode())) * 31;
        String str4 = this.dan_value;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dan_icon;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fight_rate;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.damage_rate;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.is_mvp;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.is_me;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.win;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.aghanims_img;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.neutral;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Dota2HeroObj dota2HeroObj = this.hero_info;
        int iHashCode14 = (iHashCode13 + (dota2HeroObj == null ? 0 : dota2HeroObj.hashCode())) * 31;
        KDAObj kDAObj = this.kda;
        int iHashCode15 = (iHashCode14 + (kDAObj == null ? 0 : kDAObj.hashCode())) * 31;
        List<String> list = this.items;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.backpack;
        int iHashCode17 = (iHashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<KeyDescObj> list3 = this.hero_data;
        int iHashCode18 = (iHashCode17 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str13 = this.mvp_score;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.gold;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.damage;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<KeyDescObj> list4 = this.permanent_buffs;
        int iHashCode22 = (iHashCode21 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Dota2UnitObj dota2UnitObj = this.unit;
        int iHashCode23 = (iHashCode22 + (dota2UnitObj == null ? 0 : dota2UnitObj.hashCode())) * 31;
        HeroKillObj heroKillObj = this.hero_kill;
        int iHashCode24 = (iHashCode23 + (heroKillObj == null ? 0 : heroKillObj.hashCode())) * 31;
        HeroKillObj heroKillObj2 = this.support_items;
        int iHashCode25 = (iHashCode24 + (heroKillObj2 == null ? 0 : heroKillObj2.hashCode())) * 31;
        List<KeyDescObj> list5 = this.skill_up;
        int iHashCode26 = (iHashCode25 + (list5 == null ? 0 : list5.hashCode())) * 31;
        boolean z10 = this.expand;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode26 + r10) * 31;
        List<Dota2ChartObj> list6 = this.graph_gold;
        int iHashCode27 = (i10 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<Dota2ChartObj> list7 = this.graph_exp;
        int iHashCode28 = (iHashCode27 + (list7 == null ? 0 : list7.hashCode())) * 31;
        String str16 = this.hero_icon;
        int iHashCode29 = (iHashCode28 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.chart_color;
        int iHashCode30 = (iHashCode29 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.damage_gold_rate;
        int iHashCode31 = (iHashCode30 + (str18 == null ? 0 : str18.hashCode())) * 31;
        List<KeyDescObj> list8 = this.radar_data_list;
        int iHashCode32 = (iHashCode31 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Float f10 = this.current_value;
        return iHashCode32 + (f10 != null ? f10.hashCode() : 0);
    }

    @e
    public final String is_me() {
        return this.is_me;
    }

    @e
    public final String is_mvp() {
        return this.is_mvp;
    }

    public final void setAccount_id(@e String str) {
        this.account_id = str;
    }

    public final void setAghanims_img(@e String str) {
        this.aghanims_img = str;
    }

    public final void setAvatar(@e String str) {
        this.avatar = str;
    }

    public final void setBackpack(@e List<String> list) {
        this.backpack = list;
    }

    public final void setChart_color(@e String str) {
        this.chart_color = str;
    }

    public final void setCurrent_value(@e Float f10) {
        this.current_value = f10;
    }

    public final void setDamage(@e String str) {
        this.damage = str;
    }

    public final void setDamage_gold_rate(@e String str) {
        this.damage_gold_rate = str;
    }

    public final void setDamage_rate(@e String str) {
        this.damage_rate = str;
    }

    public final void setDan_icon(@e String str) {
        this.dan_icon = str;
    }

    public final void setDan_value(@e String str) {
        this.dan_value = str;
    }

    public final void setExpand(boolean z10) {
        this.expand = z10;
    }

    public final void setFight_rate(@e String str) {
        this.fight_rate = str;
    }

    public final void setGold(@e String str) {
        this.gold = str;
    }

    public final void setGraph_exp(@e List<Dota2ChartObj> list) {
        this.graph_exp = list;
    }

    public final void setGraph_gold(@e List<Dota2ChartObj> list) {
        this.graph_gold = list;
    }

    public final void setHero_data(@e List<KeyDescObj> list) {
        this.hero_data = list;
    }

    public final void setHero_icon(@e String str) {
        this.hero_icon = str;
    }

    public final void setHero_info(@e Dota2HeroObj dota2HeroObj) {
        this.hero_info = dota2HeroObj;
    }

    public final void setHero_kill(@e HeroKillObj heroKillObj) {
        this.hero_kill = heroKillObj;
    }

    public final void setItems(@e List<String> list) {
        this.items = list;
    }

    public final void setKda(@e KDAObj kDAObj) {
        this.kda = kDAObj;
    }

    public final void setMvp_score(@e String str) {
        this.mvp_score = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setNeutral(@e String str) {
        this.neutral = str;
    }

    public final void setPermanent_buffs(@e List<KeyDescObj> list) {
        this.permanent_buffs = list;
    }

    public final void setRadar_data_list(@e List<KeyDescObj> list) {
        this.radar_data_list = list;
    }

    public final void setSkill_up(@e List<KeyDescObj> list) {
        this.skill_up = list;
    }

    public final void setSupport_items(@e HeroKillObj heroKillObj) {
        this.support_items = heroKillObj;
    }

    public final void setTeam_info(@e Dota2TeamInfoObj dota2TeamInfoObj) {
        this.team_info = dota2TeamInfoObj;
    }

    public final void setUnit(@e Dota2UnitObj dota2UnitObj) {
        this.unit = dota2UnitObj;
    }

    public final void setWin(@e String str) {
        this.win = str;
    }

    public final void set_me(@e String str) {
        this.is_me = str;
    }

    public final void set_mvp(@e String str) {
        this.is_mvp = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15093, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2PlayerObj(account_id=" + this.account_id + ", avatar=" + this.avatar + ", name=" + this.name + ", team_info=" + this.team_info + ", dan_value=" + this.dan_value + ", dan_icon=" + this.dan_icon + ", fight_rate=" + this.fight_rate + ", damage_rate=" + this.damage_rate + ", is_mvp=" + this.is_mvp + ", is_me=" + this.is_me + ", win=" + this.win + ", aghanims_img=" + this.aghanims_img + ", neutral=" + this.neutral + ", hero_info=" + this.hero_info + ", kda=" + this.kda + ", items=" + this.items + ", backpack=" + this.backpack + ", hero_data=" + this.hero_data + ", mvp_score=" + this.mvp_score + ", gold=" + this.gold + ", damage=" + this.damage + ", permanent_buffs=" + this.permanent_buffs + ", unit=" + this.unit + ", hero_kill=" + this.hero_kill + ", support_items=" + this.support_items + ", skill_up=" + this.skill_up + ", expand=" + this.expand + ", graph_gold=" + this.graph_gold + ", graph_exp=" + this.graph_exp + ", hero_icon=" + this.hero_icon + ", chart_color=" + this.chart_color + ", damage_gold_rate=" + this.damage_gold_rate + ", radar_data_list=" + this.radar_data_list + ", current_value=" + this.current_value + ')';
    }
}
