package com.max.xiaoheihe.bean.account;

import androidx.annotation.p0;
import com.google.gson.annotations.SerializedName;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.utils.c;
import com.max.xiaoheihe.bean.game.apex.ApexAccountInfo;
import com.max.xiaoheihe.bean.game.csgob5.CSGOB5AccountInfoObj;
import com.max.xiaoheihe.bean.game.destiny2.Destiny2AccountInfo;
import com.max.xiaoheihe.bean.game.ow.OWAccountInfo;
import com.max.xiaoheihe.bean.game.pubg.PUBGAccountInfo;
import com.max.xiaoheihe.bean.game.r6.R6AccountInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class User implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1707051536187248593L;
    private AccountDetailObj account_detail;
    private ApexAccountInfo apex_account_info;
    private String can_manager_account_quantity;
    private boolean certificated;
    private CSGOB5AccountInfoObj csgo5e_account_info;
    private CSGOB5AccountInfoObj csgo_account_info;
    private CSGOB5AccountInfoObj csgob5_account_info;
    private Destiny2AccountInfo destiny2_account_info;
    private InviteInfoObj invite_info;
    private boolean loginFlag;
    private String need_guide;
    private String need_refresh;
    private OWAccountInfo ow_account_info;
    private UserPermissionObj permission = new UserPermissionObj();

    @SerializedName(alternate = {"phone_num"}, value = "phonenum")
    private String phonenum;
    private String pkey;
    private ProfileObj profile;
    private PUBGAccountInfo pubg_account_info;
    private R6AccountInfo r6_account_info;
    private SteamIdInfoObj steam_id_info;
    private TipsStateObj tips_state;
    private String token;
    private String visitor_enabled;
    private KeyDescObj visitor_info;

    public boolean equals(@p0 Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14004, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (obj instanceof User) {
            User user = (User) obj;
            if (user.getAccount_detail() != null && getAccount_detail() != null && user.getAccount_detail().getUserid() != null) {
                return user.getAccount_detail().getUserid().equals(getAccount_detail().getUserid());
            }
        }
        return super.equals(obj);
    }

    public AccountDetailObj getAccount_detail() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14002, new Class[0], AccountDetailObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AccountDetailObj) patchProxyResultProxy.result;
        }
        AccountDetailObj accountDetailObj = this.account_detail;
        return accountDetailObj == null ? new AccountDetailObj() : accountDetailObj;
    }

    public ApexAccountInfo getApex_account_info() {
        return this.apex_account_info;
    }

    public String getCan_manager_account_quantity() {
        return this.can_manager_account_quantity;
    }

    public CSGOB5AccountInfoObj getCsgo5e_account_info() {
        return this.csgo5e_account_info;
    }

    public CSGOB5AccountInfoObj getCsgo_account_info() {
        return this.csgo_account_info;
    }

    public CSGOB5AccountInfoObj getCsgob5_account_info() {
        return this.csgob5_account_info;
    }

    public Destiny2AccountInfo getDestiny2_account_info() {
        return this.destiny2_account_info;
    }

    public InviteInfoObj getInvite_info() {
        return this.invite_info;
    }

    public String getNeed_guide() {
        return this.need_guide;
    }

    public String getNeed_refresh() {
        return this.need_refresh;
    }

    public OWAccountInfo getOw_account_info() {
        return this.ow_account_info;
    }

    public UserPermissionObj getPermission() {
        return this.permission;
    }

    public String getPhonenum() {
        return this.phonenum;
    }

    public String getPkey() {
        return this.pkey;
    }

    public ProfileObj getProfile() {
        return this.profile;
    }

    public PUBGAccountInfo getPubg_account_info() {
        return this.pubg_account_info;
    }

    public R6AccountInfo getR6_account_info() {
        return this.r6_account_info;
    }

    public SteamIdInfoObj getSteam_id_info() {
        return this.steam_id_info;
    }

    public TipsStateObj getTips_state() {
        return this.tips_state;
    }

    public String getToken() {
        return this.token;
    }

    public String getVisitor_enabled() {
        return this.visitor_enabled;
    }

    public KeyDescObj getVisitor_info() {
        return this.visitor_info;
    }

    public boolean isCertificated() {
        return this.certificated;
    }

    public boolean isLoginFlag() {
        return this.loginFlag;
    }

    public void setAccount_detail(AccountDetailObj accountDetailObj) {
        this.account_detail = accountDetailObj;
    }

    public void setApex_account_info(ApexAccountInfo apexAccountInfo) {
        this.apex_account_info = apexAccountInfo;
    }

    public void setCan_manager_account_quantity(String str) {
        this.can_manager_account_quantity = str;
    }

    public void setCertificated(boolean z10) {
        this.certificated = z10;
    }

    public void setCsgo5e_account_info(CSGOB5AccountInfoObj cSGOB5AccountInfoObj) {
        this.csgo5e_account_info = cSGOB5AccountInfoObj;
    }

    public void setCsgo_account_info(CSGOB5AccountInfoObj cSGOB5AccountInfoObj) {
        this.csgo_account_info = cSGOB5AccountInfoObj;
    }

    public void setCsgob5_account_info(CSGOB5AccountInfoObj cSGOB5AccountInfoObj) {
        this.csgob5_account_info = cSGOB5AccountInfoObj;
    }

    public void setDestiny2_account_info(Destiny2AccountInfo destiny2AccountInfo) {
        this.destiny2_account_info = destiny2AccountInfo;
    }

    public void setGameAccountInfo(HomeDataObj homeDataObj) {
        if (PatchProxy.proxy(new Object[]{homeDataObj}, this, changeQuickRedirect, false, 14003, new Class[]{HomeDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        SteamIdInfoObj steam_id_info = homeDataObj.getSteam_id_info();
        if (steam_id_info == null || c.u(steam_id_info.getSteamid())) {
            setSteam_id_info(null);
        } else {
            setSteam_id_info(steam_id_info);
        }
        setPubg_account_info(homeDataObj.getPubg_account_info());
        setR6_account_info(homeDataObj.getR6_account_info());
        setApex_account_info(homeDataObj.getApex_account_info());
        setOw_account_info(homeDataObj.getOw_account_info());
        setDestiny2_account_info(homeDataObj.getDestiny2_account_info());
        setCsgob5_account_info(homeDataObj.getCsgob5_account_info());
        setCsgo_account_info(homeDataObj.getCsgo_account_info());
        setCsgo5e_account_info(homeDataObj.getCsgo5e_account_info());
    }

    public void setInvite_info(InviteInfoObj inviteInfoObj) {
        this.invite_info = inviteInfoObj;
    }

    public void setLoginFlag(boolean z10) {
        this.loginFlag = z10;
    }

    public void setNeed_guide(String str) {
        this.need_guide = str;
    }

    public void setNeed_refresh(String str) {
        this.need_refresh = str;
    }

    public void setOw_account_info(OWAccountInfo oWAccountInfo) {
        this.ow_account_info = oWAccountInfo;
    }

    public void setPermission(UserPermissionObj userPermissionObj) {
        this.permission = userPermissionObj;
    }

    public void setPhonenum(String str) {
        this.phonenum = str;
    }

    public void setPkey(String str) {
        this.pkey = str;
    }

    public void setProfile(ProfileObj profileObj) {
        this.profile = profileObj;
    }

    public void setPubg_account_info(PUBGAccountInfo pUBGAccountInfo) {
        this.pubg_account_info = pUBGAccountInfo;
    }

    public void setR6_account_info(R6AccountInfo r6AccountInfo) {
        this.r6_account_info = r6AccountInfo;
    }

    public void setSteam_id_info(SteamIdInfoObj steamIdInfoObj) {
        this.steam_id_info = steamIdInfoObj;
    }

    public void setTips_state(TipsStateObj tipsStateObj) {
        this.tips_state = tipsStateObj;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setVisitor_enabled(String str) {
        this.visitor_enabled = str;
    }

    public void setVisitor_info(KeyDescObj keyDescObj) {
        this.visitor_info = keyDescObj;
    }
}
