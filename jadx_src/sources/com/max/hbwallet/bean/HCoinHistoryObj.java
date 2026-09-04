package com.max.hbwallet.bean;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes2.dex */
public class HCoinHistoryObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String event_desc;
    private String order_id;
    private String refund_state;
    private String refund_way;
    private String timestamp;
    private String type;
    private String value;

    public String getEvent_desc() {
        return this.event_desc;
    }

    public String getOrder_id() {
        return this.order_id;
    }

    public String getRefund_state() {
        return this.refund_state;
    }

    public String getRefund_way() {
        return this.refund_way;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setEvent_desc(String str) {
        this.event_desc = str;
    }

    public void setOrder_id(String str) {
        this.order_id = str;
    }

    public void setRefund_state(String str) {
        this.refund_state = str;
    }

    public void setRefund_way(String str) {
        this.refund_way = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
