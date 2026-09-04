package com.umeng.message.common.inter;

import com.umeng.analytics.pro.ak;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface ITagManager {
    public static final String FAIL = "fail";
    public static final String SUCCESS = "ok";

    public static class Result {
        public String errors;
        public long interval;
        public String jsonString;
        public int remain;
        public String status;

        public Result() {
            this.status = "fail";
            this.remain = 0;
            this.interval = 0L;
            this.errors = "";
            this.jsonString = "";
        }

        public Result(JSONObject jSONObject) {
            this.status = "fail";
            this.remain = 0;
            this.interval = 0L;
            this.errors = "";
            this.jsonString = "";
            if (jSONObject == null) {
                return;
            }
            this.jsonString = jSONObject.toString();
            this.status = jSONObject.optString("success", "fail");
            this.remain = jSONObject.optInt("remain", 0);
            this.interval = jSONObject.optLong(ak.aT, 0L);
            this.errors = jSONObject.optString("errors");
        }

        public void setErrors(String str) {
            this.errors = str;
        }

        public String toString() {
            return this.jsonString;
        }
    }

    Result addTags(JSONObject jSONObject, String... strArr) throws Exception;

    Result deleteTags(JSONObject jSONObject, String... strArr) throws Exception;

    List<String> getTags(JSONObject jSONObject) throws Exception;
}
