package com.umeng.message;

import android.app.Notification;
import android.content.Context;
import com.umeng.message.api.UPushAliasCallback;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.y;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UTrack {

    @Deprecated
    public interface ICallBack extends UPushAliasCallback {
    }

    public static UTrack getInstance() {
        return y.a();
    }

    @Deprecated
    public static UTrack getInstance(Context context) {
        return getInstance();
    }

    public abstract void addAlias(String str, String str2, UPushAliasCallback uPushAliasCallback);

    public abstract void deleteAlias(String str, String str2, UPushAliasCallback uPushAliasCallback);

    public abstract void setAlias(String str, String str2, UPushAliasCallback uPushAliasCallback);

    public abstract void trackMfrPushMsgClick(UMessage uMessage);

    @Deprecated
    public void trackMiPushMsgClick(UMessage uMessage) {
        trackMfrPushMsgClick(uMessage);
    }

    public abstract void trackMsgArrival(UMessage uMessage);

    public abstract void trackMsgClick(UMessage uMessage);

    public abstract void trackMsgDismissed(UMessage uMessage);

    public abstract void trackMsgRepost(UMessage uMessage, Notification notification);

    public void trackMsgShow(UMessage uMessage) {
        trackMsgShow(uMessage, null);
    }

    public abstract void trackMsgShow(UMessage uMessage, Notification notification);
}
