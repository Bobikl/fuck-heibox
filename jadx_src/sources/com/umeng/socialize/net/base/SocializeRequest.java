package com.umeng.socialize.net.base;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.socialize.Config;
import com.umeng.socialize.c.a.a;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.media.BaseMediaObject;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.umeng.socialize.net.utils.URequest;
import com.umeng.socialize.utils.DefaultClass;
import com.umeng.socialize.utils.DeviceConfig;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SocializeRequest extends URequest {
    private static final String BASE_URL = "https://log.umsns.com/";
    public static final int REQUEST_ANALYTIC = 1;
    public static final int REQUEST_API = 2;
    public static final int REQUEST_SOCIAL = 0;
    private static final String TAG = "SocializeRequest";
    private Map<String, URequest.FilePair> mFileMap;
    public int mOpId;
    private int mReqType;

    /* JADX INFO: renamed from: com.umeng.socialize.net.base.SocializeRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$umeng$socialize$net$utils$URequest$RequestMethod;

        static {
            int[] iArr = new int[URequest.RequestMethod.values().length];
            $SwitchMap$com$umeng$socialize$net$utils$URequest$RequestMethod = iArr;
            try {
                iArr[URequest.RequestMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$umeng$socialize$net$utils$URequest$RequestMethod[URequest.RequestMethod.GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum FILE_TYPE {
        IMAGE,
        VEDIO
    }

    public SocializeRequest(Context context, String str, Class<? extends SocializeReseponse> cls, int i10, URequest.RequestMethod requestMethod) {
        super("");
        this.mFileMap = new HashMap();
        this.mReqType = 1;
        this.mResponseClz = cls;
        this.mOpId = i10;
        this.mContext = context;
        this.mMethod = requestMethod;
        setBaseUrl("https://log.umsns.com/");
    }

    public static Map<String, Object> getBaseQuery(Context context) {
        HashMap map = new HashMap();
        String deviceId = DeviceConfig.getDeviceId(context);
        if (!TextUtils.isEmpty(deviceId)) {
            map.put("imei", deviceId);
        }
        String mac = DeviceConfig.getMac(context);
        if (TextUtils.isEmpty(mac)) {
            mac = DefaultClass.getMac();
            SLog.I(UmengText.NET.MACNULL);
        }
        map.put("mac", mac);
        if (!TextUtils.isEmpty(SocializeConstants.UID)) {
            map.put("uid", SocializeConstants.UID);
        }
        try {
            map.put(SocializeProtocolConstants.PROTOCOL_KEY_EN, DeviceConfig.getNetworkAccessMode(context)[0]);
        } catch (Exception unused) {
            map.put(SocializeProtocolConstants.PROTOCOL_KEY_EN, "Unknown");
        }
        map.put(SocializeProtocolConstants.PROTOCOL_KEY_DE, Build.MODEL);
        map.put(SocializeProtocolConstants.PROTOCOL_KEY_VERSION, "7.3.2");
        map.put("os", "Android");
        map.put(SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID, DeviceConfig.getAndroidID(context));
        map.put("sn", DeviceConfig.getDeviceSN());
        map.put("os_version", DeviceConfig.getOsVersion());
        map.put(SocializeProtocolConstants.PROTOCOL_KEY_DT, Long.valueOf(System.currentTimeMillis()));
        map.put(SocializeProtocolConstants.PROTOCOL_KEY_AK, SocializeUtils.getAppkey(context));
        map.put(SocializeProtocolConstants.PROTOCOL_VERSION, SocializeConstants.PROTOCOL_VERSON);
        map.put(SocializeConstants.USHARETYPE, Config.shareType);
        if (!TextUtils.isEmpty(Config.EntityKey)) {
            map.put(SocializeProtocolConstants.PROTOCOL_KEY_ENTITY_KEY, Config.EntityKey);
        }
        if (!TextUtils.isEmpty(Config.SessionId)) {
            map.put("sid", Config.SessionId);
        }
        try {
            map.put(SocializeProtocolConstants.PROTOCOL_KEY_REQUEST_TYPE, 0);
        } catch (Exception e10) {
            SLog.error(e10);
        }
        return map;
    }

    private String mapTostring(Map<String, Object> map) {
        if (this.mParams.isEmpty()) {
            return null;
        }
        try {
            return new JSONObject(map).toString();
        } catch (Exception e10) {
            SLog.error(e10);
            return null;
        }
    }

    public void addFileParams(byte[] bArr, FILE_TYPE file_type, String str) {
        if (FILE_TYPE.IMAGE == file_type) {
            String strC = a.c(bArr);
            if (TextUtils.isEmpty(strC)) {
                strC = "png";
            }
            this.mFileMap.put(SocializeProtocolConstants.PROTOCOL_KEY_IMAGE, new URequest.FilePair(SocializeUtils.md5(bArr) + "." + strC, bArr));
        }
    }

    public void addMediaParams(UMediaObject uMediaObject) {
        if (uMediaObject == null) {
            return;
        }
        if (uMediaObject instanceof BaseMediaObject) {
            addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_TITLE, ((BaseMediaObject) uMediaObject).getTitle());
        }
        if (uMediaObject.isUrlMedia()) {
            for (Map.Entry<String, Object> entry : uMediaObject.toUrlExtraParams().entrySet()) {
                addStringParams(entry.getKey(), entry.getValue().toString());
            }
            return;
        }
        byte[] bArr = uMediaObject.toByte();
        if (bArr != null) {
            addFileParams(bArr, FILE_TYPE.IMAGE, null);
        }
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public Map<String, Object> buildParams() {
        Map<String, Object> baseQuery = getBaseQuery(this.mContext);
        if (!TextUtils.isEmpty(Config.EntityKey)) {
            baseQuery.put(SocializeProtocolConstants.PROTOCOL_KEY_ENTITY_KEY, Config.EntityKey);
        }
        if (!TextUtils.isEmpty(Config.SessionId)) {
            baseQuery.put("sid", Config.SessionId);
        }
        baseQuery.put(SocializeProtocolConstants.PROTOCOL_KEY_REQUEST_TYPE, Integer.valueOf(this.mReqType));
        baseQuery.put(SocializeProtocolConstants.PROTOCOL_KEY_OPID, Integer.valueOf(this.mOpId));
        baseQuery.put("uid", UMUtils.getUMId(this.mContext));
        baseQuery.putAll(this.mParams);
        return baseQuery;
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public Map<String, Object> getBodyPair() {
        return buildParams();
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public Map<String, URequest.FilePair> getFilePair() {
        return this.mFileMap;
    }

    @Override // com.umeng.socialize.net.utils.URequest
    protected String getHttpMethod() {
        return AnonymousClass1.$SwitchMap$com$umeng$socialize$net$utils$URequest$RequestMethod[this.mMethod.ordinal()] != 1 ? URequest.GET : URequest.POST;
    }

    protected abstract String getPath();

    @Override // com.umeng.socialize.net.utils.URequest
    public void onPrepareRequest() {
        addStringParams("pcv", SocializeConstants.PROTOCOL_VERSON);
        addStringParams(SocializeConstants.USHARETYPE, Config.shareType);
        addStringParams("imei", DeviceConfig.getDeviceId(this.mContext));
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_DE, Build.MODEL);
        addStringParams("mac", DeviceConfig.getMac(this.mContext));
        addStringParams("os", "Android");
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_EN, DeviceConfig.getNetworkAccessMode(this.mContext)[0]);
        addStringParams("uid", null);
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_VERSION, "7.3.2");
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_DT, String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public void setBaseUrl(String str) {
        String string = "";
        try {
            if (!TextUtils.isEmpty(getPath())) {
                string = new URL(new URL(str), getPath()).toString();
            }
        } catch (Exception e10) {
            SLog.error(UmengText.NET.getURLERROR(str), e10);
        }
        super.setBaseUrl(string);
    }

    public void setReqType(int i10) {
        this.mReqType = i10;
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public String toGetUrl() {
        return generateGetURL(getBaseUrl(), buildParams());
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public JSONObject toJson() {
        return null;
    }
}
