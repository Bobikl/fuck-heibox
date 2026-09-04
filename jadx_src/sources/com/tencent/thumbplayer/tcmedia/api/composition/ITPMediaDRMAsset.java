package com.tencent.thumbplayer.tcmedia.api.composition;

import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPMediaDRMAsset extends ITPMediaAsset {
    public static final String TP_PLAYER_DRM_PROPERTY_APPVER = "drm_property_app_ver";
    public static final String TP_PLAYER_DRM_PROPERTY_COOKIE = "drm_property_cookie";
    public static final String TP_PLAYER_DRM_PROPERTY_DRM_USEL1 = "drm_property_use_l1";
    public static final String TP_PLAYER_DRM_PROPERTY_EXT_X_KEY = "drm_property_ext_x_key";
    public static final String TP_PLAYER_DRM_PROPERTY_GUID = "drm_property_guid";
    public static final String TP_PLAYER_DRM_PROPERTY_LICENSE_STANDARDIZATION = "drm_property_license_standardization";
    public static final String TP_PLAYER_DRM_PROPERTY_LICENSE_URL = "drm_property_license_url";
    public static final String TP_PLAYER_DRM_PROPERTY_PLATFORM = "drm_property_platform";
    public static final String TP_PLAYER_DRM_PROPERTY_PROVISION_URL = "drm_property_provision_url";
    public static final String TP_PLAYER_DRM_PROPERTY_SAVE_PATH = "drm_property_save_path";

    Map<String, String> getDrmAllProperties();

    String getDrmPlayUrl();

    String getDrmProperty(String str, String str2);

    @TPCommonEnum.TP_DRM_TYPE
    int getDrmType();

    String getOfflineKeySetId();

    void setDrmPlayUrl(String str);

    void setDrmProperty(String str, String str2);

    void setDrmType(@TPCommonEnum.TP_DRM_TYPE int i10);

    void setOfflineKeySetId(String str);
}
