package com.umeng.message.entity;

import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.xiaoheihe.module.game.pubg.PUBGFriendRankActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UMessage {
    public static final String DISPLAY_TYPE_CUSTOM = "custom";
    public static final String DISPLAY_TYPE_NOTIFICATION = "notification";
    public static final String NOTIFICATION_GO_ACTIVITY = "go_activity";
    public static final String NOTIFICATION_GO_APP = "go_app";
    public static final String NOTIFICATION_GO_CUSTOM = "go_custom";
    public static final String NOTIFICATION_GO_URL = "go_url";
    public String activity;
    public String after_open;
    public final String alias;
    private int badgeAdd;
    private int badgeSet;
    public String bar_image;
    private String bgImage;
    private String bigBody;
    private String bigTitle;
    public int builder_id;
    private String category;
    public String custom;
    public boolean dismiss;
    public final String display_type;
    public String expand_image;
    public final Map<String, String> extra = new HashMap();
    public String icon;
    public String img;
    private int importance;
    public String largeIcon;
    public final String message_id;
    public final String msg_id;
    public boolean play_lights;
    public boolean play_sound;
    public boolean play_vibrate;
    private final JSONObject rawJson;
    public final String recall;
    private boolean repost;
    private int repostCount;
    private int repostInterval;
    private int repostStart;
    public boolean screen_on;
    public String sound;
    public final String task_id;
    public String text;
    private String textColor;
    public String ticker;
    private long timestamp;
    public String title;
    private String titleColor;
    public String url;

    public UMessage(JSONObject jSONObject) {
        this.importance = 3;
        this.rawJson = jSONObject;
        this.message_id = jSONObject.optString("agoo_msg_id");
        this.task_id = jSONObject.optString("agoo_task_id");
        this.msg_id = jSONObject.optString("msg_id");
        this.display_type = jSONObject.optString("display_type");
        this.alias = jSONObject.optString("alias");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("body");
        if (jSONObjectOptJSONObject != null) {
            this.ticker = jSONObjectOptJSONObject.optString(RemoteMessageConst.Notification.TICKER);
            this.title = jSONObjectOptJSONObject.optString("title");
            this.text = jSONObjectOptJSONObject.optString("text");
            this.play_vibrate = jSONObjectOptJSONObject.optBoolean("play_vibrate", true);
            this.play_lights = jSONObjectOptJSONObject.optBoolean("play_lights", true);
            this.play_sound = jSONObjectOptJSONObject.optBoolean("play_sound", true);
            this.screen_on = jSONObjectOptJSONObject.optBoolean("screen_on", false);
            this.url = jSONObjectOptJSONObject.optString("url");
            this.img = jSONObjectOptJSONObject.optString(SocialConstants.PARAM_IMG_URL);
            this.sound = jSONObjectOptJSONObject.optString(RemoteMessageConst.Notification.SOUND);
            this.icon = jSONObjectOptJSONObject.optString("icon");
            this.after_open = jSONObjectOptJSONObject.optString("after_open");
            this.largeIcon = jSONObjectOptJSONObject.optString("largeIcon");
            this.activity = jSONObjectOptJSONObject.optString(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            this.custom = jSONObjectOptJSONObject.optString("custom");
            this.recall = jSONObjectOptJSONObject.optString("recall");
            this.bar_image = jSONObjectOptJSONObject.optString("bar_image");
            this.expand_image = jSONObjectOptJSONObject.optString("expand_image");
            this.bgImage = jSONObjectOptJSONObject.optString("bg_image");
            this.builder_id = jSONObjectOptJSONObject.optInt("builder_id", 0);
            this.badgeSet = jSONObjectOptJSONObject.optInt("badge", -1);
            this.badgeAdd = jSONObjectOptJSONObject.optInt("add_badge", 0);
            if (jSONObjectOptJSONObject.optInt("re_pop", 0) == 1) {
                int iOptInt = jSONObjectOptJSONObject.optInt("pop_start", 0);
                int iOptInt2 = jSONObjectOptJSONObject.optInt("pop_interval", 0);
                int iOptInt3 = jSONObjectOptJSONObject.optInt("pop_count", 0);
                if (iOptInt2 > 0 && iOptInt > 0 && iOptInt3 > 0) {
                    this.repostStart = iOptInt;
                    this.repostInterval = iOptInt2;
                    this.repostCount = iOptInt3;
                    this.repost = true;
                }
            }
            this.titleColor = jSONObjectOptJSONObject.optString("title_color");
            this.textColor = jSONObjectOptJSONObject.optString("text_color");
        } else {
            this.recall = null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("extra");
        if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObjectOptJSONObject2.optString(next);
                this.extra.put(next, strOptString);
                if ("umeng_big_title".equals(next)) {
                    this.bigTitle = strOptString;
                } else if ("umeng_big_body".equals(next)) {
                    this.bigBody = strOptString;
                }
            }
        }
        if (this.msg_id.length() == 22 && this.msg_id.startsWith(ak.aG)) {
            try {
                this.timestamp = Long.parseLong(this.msg_id.substring(7, 20));
            } catch (Throwable unused) {
            }
        }
        if (this.timestamp == 0) {
            this.timestamp = System.currentTimeMillis();
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("local_properties");
        if (jSONObjectOptJSONObject3 != null) {
            this.category = jSONObjectOptJSONObject3.optString(PUBGFriendRankActivity.Y);
            this.importance = jSONObjectOptJSONObject3.optInt("importance", 3);
        }
    }

    public String getAction() {
        return this.after_open;
    }

    public String getActivity() {
        return this.activity;
    }

    public String getAgooMsgId() {
        return this.message_id;
    }

    public String getBackgroundImageUrl() {
        return this.bgImage;
    }

    public int getBadgeAdd() {
        return this.badgeAdd;
    }

    public int getBadgeSet() {
        return this.badgeSet;
    }

    public String getBarImageUrl() {
        return this.bar_image;
    }

    public String getBigBody() {
        return this.bigBody;
    }

    public String getBigImage() {
        return this.expand_image;
    }

    public String getBigTitle() {
        return this.bigTitle;
    }

    public String getCategory() {
        return this.category;
    }

    public String getContent() {
        return this.text;
    }

    public String getCustom() {
        return this.custom;
    }

    public String getDeeplink() {
        return this.url;
    }

    public String getDisplayType() {
        return this.display_type;
    }

    public Map<String, String> getExtra() {
        return this.extra;
    }

    public int getImportance() {
        return this.importance;
    }

    public String getLargeIconDrawableName() {
        return this.largeIcon;
    }

    public String getLargeIconUrl() {
        return this.img;
    }

    public String getMsgId() {
        return this.msg_id;
    }

    public long getMsgTime() {
        return this.timestamp;
    }

    public JSONObject getRaw() {
        return this.rawJson;
    }

    public String getRecallMsgId() {
        return this.recall;
    }

    public int getRepostCount() {
        return this.repostCount;
    }

    public int getRepostInterval() {
        return this.repostInterval;
    }

    public int getRepostStart() {
        return this.repostStart;
    }

    public String getSmallIconDrawableName() {
        return this.icon;
    }

    public String getSoundUri() {
        return this.sound;
    }

    public int getStyle() {
        return this.builder_id;
    }

    public String getTaskId() {
        return this.task_id;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public String getTicker() {
        return this.ticker;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitleColor() {
        return this.titleColor;
    }

    public boolean hasBackgroundImage() {
        return !TextUtils.isEmpty(getBackgroundImageUrl());
    }

    public boolean hasResourceFromInternet() {
        return isLargeIconFromInternet() || isSoundFromInternet() || !TextUtils.isEmpty(getBarImageUrl()) || !TextUtils.isEmpty(getBigImage()) || hasBackgroundImage();
    }

    public boolean isLargeIconFromInternet() {
        return !TextUtils.isEmpty(this.img);
    }

    public boolean isLights() {
        return this.play_lights;
    }

    public boolean isRepost() {
        return this.repost;
    }

    public boolean isScreenOn() {
        return this.screen_on;
    }

    public boolean isSound() {
        return this.play_sound;
    }

    public boolean isSoundFromInternet() {
        if (TextUtils.isEmpty(getSoundUri())) {
            return false;
        }
        return getSoundUri().startsWith("http://") || getSoundUri().startsWith("https://");
    }

    public boolean isVibrate() {
        return this.play_vibrate;
    }
}
