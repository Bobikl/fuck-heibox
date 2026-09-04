package com.igexin.push.extension.stub;

import android.content.Context;
import com.igexin.push.core.a;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface IPushExtension {
    boolean executeAction(PushTaskBean pushTaskBean, BaseAction baseAction);

    boolean init(Context context);

    boolean isActionSupported(String str);

    void onDestroy();

    BaseAction parseAction(JSONObject jSONObject);

    a prepareExecuteAction(PushTaskBean pushTaskBean, BaseAction baseAction);
}
