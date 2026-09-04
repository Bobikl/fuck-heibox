package com.tencent.cos.xml.model.tag.eventstreaming;

/* JADX INFO: loaded from: classes4.dex */
public class RequestProgress {
    private Boolean enabled;

    public RequestProgress(Boolean bool) {
        this.enabled = bool;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public RequestProgress withEnabled(Boolean bool) {
        setEnabled(bool);
        return this;
    }
}
