package com.alipay.face.network.model;

/* JADX INFO: loaded from: classes6.dex */
public class ZimInitRequest {
    public String bizData;
    public String channel;
    public String merchant;
    public String metaInfo;
    public String produceNode;
    public String productName;
    public String zimId;

    public String toString() {
        return "ZimInitRequest{zimId='" + this.zimId + "', channel='" + this.channel + "', merchant='" + this.merchant + "', productName='" + this.productName + "', produceNode='" + this.produceNode + "', bizData='" + this.bizData + "', metaInfo='" + this.metaInfo + "'}";
    }
}
