package org.android.agoo.common;

import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class MsgDO {
    public boolean agooFlag;
    public String body;
    public String dataId;
    public String errorCode;
    public int evokeAppStatus;
    public String extData;
    public String fromAppkey;
    public String fromPkg;
    public boolean isGlobalClick;
    public long lastActiveTime;
    public String messageSource;
    public String msgIds;
    public String msgStatus;
    public String notifyEnable;
    public String pack;
    public String removePacks;
    public String reportStr;
    public String type;
    public boolean isStartProc = false;
    public boolean isFromCache = false;

    public String getMsgInfo() {
        HashMap map = new HashMap();
        map.put("msgIds", this.msgIds);
        map.put(AgooConstants.MESSAGE_EXT, this.extData);
        map.put("body", this.body);
        map.put(Constants.KEY_DATA_ID, this.dataId);
        map.put("pack", this.pack);
        map.put("messageSource", this.messageSource);
        if (!TextUtils.isEmpty(this.removePacks)) {
            map.put("removePacks", this.removePacks);
        }
        if (!TextUtils.isEmpty(this.errorCode)) {
            map.put(Constants.KEY_ERROR_CODE, this.errorCode);
        }
        if (!TextUtils.isEmpty(this.type)) {
            map.put("type", this.type);
        }
        return new JSONObject(map).toString();
    }
}
