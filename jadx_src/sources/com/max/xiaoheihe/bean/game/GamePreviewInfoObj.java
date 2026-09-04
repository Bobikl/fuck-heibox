package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GamePreviewInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2783257755139200243L;
    private GamePreviewAgreementOb agreement;
    private String count;
    private String deadline_date;
    private String preview_state;
    private List<GamePreviewRequirementObj> requirements;
    private String state;
    private String total;

    public GamePreviewAgreementOb getAgreement() {
        return this.agreement;
    }

    public String getCount() {
        return this.count;
    }

    public String getDeadline_date() {
        return this.deadline_date;
    }

    public String getPreview_state() {
        return this.preview_state;
    }

    public List<GamePreviewRequirementObj> getRequirements() {
        return this.requirements;
    }

    public String getState() {
        return this.state;
    }

    public String getTotal() {
        return this.total;
    }

    public void setAgreement(GamePreviewAgreementOb gamePreviewAgreementOb) {
        this.agreement = gamePreviewAgreementOb;
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setDeadline_date(String str) {
        this.deadline_date = str;
    }

    public void setPreview_state(String str) {
        this.preview_state = str;
    }

    public void setRequirements(List<GamePreviewRequirementObj> list) {
        this.requirements = list;
    }

    public void setState(String str) {
        this.state = str;
    }

    public void setTotal(String str) {
        this.total = str;
    }
}
