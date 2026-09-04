package com.max.xiaoheihe.bean.account;

import com.max.xiaoheihe.bean.account.steaminfo.BindTaskInfoObj;
import com.max.xiaoheihe.bean.game.BindGameCardV2;
import com.max.xiaoheihe.bean.game.CommonAccountInfo;
import com.max.xiaoheihe.bean.game.GameCardObj;
import com.max.xiaoheihe.bean.game.apex.ApexAccountInfo;
import com.max.xiaoheihe.bean.game.csgob5.CSGOB5AccountInfoObj;
import com.max.xiaoheihe.bean.game.destiny2.Destiny2AccountInfo;
import com.max.xiaoheihe.bean.game.epic.EpicAccountInfo;
import com.max.xiaoheihe.bean.game.nswitch.SwitchAccountInfo;
import com.max.xiaoheihe.bean.game.ow.OWAccountInfo;
import com.max.xiaoheihe.bean.game.psn.PSNAccountInfo;
import com.max.xiaoheihe.bean.game.pubg.PUBGAccountInfo;
import com.max.xiaoheihe.bean.game.r6.R6AccountInfo;
import com.max.xiaoheihe.bean.game.xbox.XboxShortAccountInfo;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class HomeDataObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6567749575631337553L;
    private AccountDetailObj account_detail;
    private List<AchieveObj> achieve_list;
    private ApexAccountInfo apex_account_info;
    private ArrayList<CommonAccountInfo> bind_game_infos;
    private ArrayList<String> card_orders;
    private ArrayList<GameCardObj> cards;
    private CSGOB5AccountInfoObj csgo5e_account_info;
    private CSGOB5AccountInfoObj csgo_account_info;
    private AccountCsGoInfoObj csgo_platform_info;
    private CSGOB5AccountInfoObj csgob5_account_info;
    private Destiny2AccountInfo destiny2_account_info;
    private AccountDota2InfoObj dota2_platform_info;
    private EpicAccountInfo epic_account_info;
    private List<BindGameCardV2> game_cards;
    private List<GameOverviewObj> game_overview;
    private HardwareInfoObj hardware_info;
    private InviteInfoObj invite_info;
    private String is_bind_dota2;
    private ReservedInfoObj mobile_pop_window;
    private String online_state_url;
    private OWAccountInfo ow_account_info;
    private ArrayList<String> platform_list;
    private ProfileObj profile;
    private PSNAccountInfo psn_account_info;
    private PUBGAccountInfo pubg_account_info;
    private R6AccountInfo r6_account_info;
    private ArrayList<String> stats_orders;
    private SteamIdInfoObj steam_id_info;
    private String steam_tips_img;
    private String store_desc;
    private SwitchAccountInfo switch_account_info;
    private String task_desc;
    private BindTaskInfoObj task_info;
    private String task_red_point;
    private XboxShortAccountInfo xbox_account_info;
    private boolean xbox_account_info_hidden = false;
    private boolean psn_account_info_hidden = false;
    private boolean switch_account_info_hidden = false;
    private boolean epic_account_info_hidden = false;
    private boolean isReport = true;

    public AccountDetailObj getAccount_detail() {
        return this.account_detail;
    }

    public List<AchieveObj> getAchieve_list() {
        return this.achieve_list;
    }

    public ApexAccountInfo getApex_account_info() {
        return this.apex_account_info;
    }

    public ArrayList<CommonAccountInfo> getBind_game_infos() {
        return this.bind_game_infos;
    }

    public ArrayList<String> getCard_orders() {
        return this.card_orders;
    }

    public ArrayList<GameCardObj> getCards() {
        return this.cards;
    }

    public CSGOB5AccountInfoObj getCsgo5e_account_info() {
        return this.csgo5e_account_info;
    }

    public CSGOB5AccountInfoObj getCsgo_account_info() {
        return this.csgo_account_info;
    }

    public AccountCsGoInfoObj getCsgo_platform_info() {
        return this.csgo_platform_info;
    }

    public CSGOB5AccountInfoObj getCsgob5_account_info() {
        return this.csgob5_account_info;
    }

    public Destiny2AccountInfo getDestiny2_account_info() {
        return this.destiny2_account_info;
    }

    public AccountDota2InfoObj getDota2_platform_info() {
        return this.dota2_platform_info;
    }

    public EpicAccountInfo getEpic_account_info() {
        return this.epic_account_info;
    }

    public List<BindGameCardV2> getGame_cards() {
        return this.game_cards;
    }

    public List<GameOverviewObj> getGame_overview() {
        return this.game_overview;
    }

    public HardwareInfoObj getHardware_info() {
        return this.hardware_info;
    }

    public InviteInfoObj getInvite_info() {
        return this.invite_info;
    }

    public String getIs_bind_dota2() {
        return this.is_bind_dota2;
    }

    public ReservedInfoObj getMobile_pop_window() {
        return this.mobile_pop_window;
    }

    public String getOnline_state_url() {
        return this.online_state_url;
    }

    public OWAccountInfo getOw_account_info() {
        return this.ow_account_info;
    }

    public ArrayList<String> getPlatform_list() {
        return this.platform_list;
    }

    public ProfileObj getProfile() {
        return this.profile;
    }

    public PSNAccountInfo getPsn_account_info() {
        return this.psn_account_info;
    }

    public PUBGAccountInfo getPubg_account_info() {
        return this.pubg_account_info;
    }

    public R6AccountInfo getR6_account_info() {
        return this.r6_account_info;
    }

    public ArrayList<String> getStats_orders() {
        return this.stats_orders;
    }

    public SteamIdInfoObj getSteam_id_info() {
        return this.steam_id_info;
    }

    public String getSteam_tips_img() {
        return this.steam_tips_img;
    }

    public String getStore_desc() {
        return this.store_desc;
    }

    public SwitchAccountInfo getSwitch_account_info() {
        return this.switch_account_info;
    }

    public String getTask_desc() {
        return this.task_desc;
    }

    public BindTaskInfoObj getTask_info() {
        return this.task_info;
    }

    public String getTask_red_point() {
        return this.task_red_point;
    }

    public XboxShortAccountInfo getXbox_account_info() {
        return this.xbox_account_info;
    }

    public boolean isEpic_account_info_hidden() {
        return this.epic_account_info_hidden;
    }

    public boolean isPsn_account_info_hidden() {
        return this.psn_account_info_hidden;
    }

    public boolean isReport() {
        return this.isReport;
    }

    public boolean isSwitch_account_info_hidden() {
        return this.switch_account_info_hidden;
    }

    public boolean isXbox_account_info_hidden() {
        return this.xbox_account_info_hidden;
    }

    public HomeDataObj setAccount_detail(AccountDetailObj accountDetailObj) {
        this.account_detail = accountDetailObj;
        return this;
    }

    public void setAchieve_list(List<AchieveObj> list) {
        this.achieve_list = list;
    }

    public void setApex_account_info(ApexAccountInfo apexAccountInfo) {
        this.apex_account_info = apexAccountInfo;
    }

    public void setBind_game_infos(ArrayList<CommonAccountInfo> arrayList) {
        this.bind_game_infos = arrayList;
    }

    public void setCard_orders(ArrayList<String> arrayList) {
        this.card_orders = arrayList;
    }

    public void setCards(ArrayList<GameCardObj> arrayList) {
        this.cards = arrayList;
    }

    public void setCsgo5e_account_info(CSGOB5AccountInfoObj cSGOB5AccountInfoObj) {
        this.csgo5e_account_info = cSGOB5AccountInfoObj;
    }

    public void setCsgo_account_info(CSGOB5AccountInfoObj cSGOB5AccountInfoObj) {
        this.csgo_account_info = cSGOB5AccountInfoObj;
    }

    public void setCsgo_platform_info(AccountCsGoInfoObj accountCsGoInfoObj) {
        this.csgo_platform_info = accountCsGoInfoObj;
    }

    public void setCsgob5_account_info(CSGOB5AccountInfoObj cSGOB5AccountInfoObj) {
        this.csgob5_account_info = cSGOB5AccountInfoObj;
    }

    public void setDestiny2_account_info(Destiny2AccountInfo destiny2AccountInfo) {
        this.destiny2_account_info = destiny2AccountInfo;
    }

    public void setDota2_platform_info(AccountDota2InfoObj accountDota2InfoObj) {
        this.dota2_platform_info = accountDota2InfoObj;
    }

    public void setEpic_account_info(EpicAccountInfo epicAccountInfo) {
        this.epic_account_info = epicAccountInfo;
    }

    public void setEpic_account_info_hidden(boolean z10) {
        this.epic_account_info_hidden = z10;
    }

    public void setGame_cards(List<BindGameCardV2> list) {
        this.game_cards = list;
    }

    public void setGame_overview(List<GameOverviewObj> list) {
        this.game_overview = list;
    }

    public void setHardware_info(HardwareInfoObj hardwareInfoObj) {
        this.hardware_info = hardwareInfoObj;
    }

    public void setInvite_info(InviteInfoObj inviteInfoObj) {
        this.invite_info = inviteInfoObj;
    }

    public void setIs_bind_dota2(String str) {
        this.is_bind_dota2 = str;
    }

    public void setMobile_pop_window(ReservedInfoObj reservedInfoObj) {
        this.mobile_pop_window = reservedInfoObj;
    }

    public void setOnline_state_url(String str) {
        this.online_state_url = str;
    }

    public void setOw_account_info(OWAccountInfo oWAccountInfo) {
        this.ow_account_info = oWAccountInfo;
    }

    public void setPlatform_list(ArrayList<String> arrayList) {
        this.platform_list = arrayList;
    }

    public void setProfile(ProfileObj profileObj) {
        this.profile = profileObj;
    }

    public void setPsn_account_info(PSNAccountInfo pSNAccountInfo) {
        this.psn_account_info = pSNAccountInfo;
    }

    public void setPsn_account_info_hidden(boolean z10) {
        this.psn_account_info_hidden = z10;
    }

    public void setPubg_account_info(PUBGAccountInfo pUBGAccountInfo) {
        this.pubg_account_info = pUBGAccountInfo;
    }

    public void setR6_account_info(R6AccountInfo r6AccountInfo) {
        this.r6_account_info = r6AccountInfo;
    }

    public void setReport(boolean z10) {
        this.isReport = z10;
    }

    public void setStats_orders(ArrayList<String> arrayList) {
        this.stats_orders = arrayList;
    }

    public void setSteam_id_info(SteamIdInfoObj steamIdInfoObj) {
        this.steam_id_info = steamIdInfoObj;
    }

    public void setSteam_tips_img(String str) {
        this.steam_tips_img = str;
    }

    public void setStore_desc(String str) {
        this.store_desc = str;
    }

    public void setSwitch_account_info(SwitchAccountInfo switchAccountInfo) {
        this.switch_account_info = switchAccountInfo;
    }

    public void setSwitch_account_info_hidden(boolean z10) {
        this.switch_account_info_hidden = z10;
    }

    public void setTask_desc(String str) {
        this.task_desc = str;
    }

    public void setTask_info(BindTaskInfoObj bindTaskInfoObj) {
        this.task_info = bindTaskInfoObj;
    }

    public void setTask_red_point(String str) {
        this.task_red_point = str;
    }

    public void setXbox_account_info(XboxShortAccountInfo xboxShortAccountInfo) {
        this.xbox_account_info = xboxShortAccountInfo;
    }

    public void setXbox_account_info_hidden(boolean z10) {
        this.xbox_account_info_hidden = z10;
    }
}
