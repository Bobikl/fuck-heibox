package com.igexin.push.core.a.a;

import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    com.igexin.push.core.a a(PushTaskBean pushTaskBean, BaseAction baseAction);

    BaseAction a(JSONObject jSONObject);

    boolean b(PushTaskBean pushTaskBean, BaseAction baseAction);
}
