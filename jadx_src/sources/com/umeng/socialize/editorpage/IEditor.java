package com.umeng.socialize.editorpage;

import android.os.Bundle;
import com.umeng.socialize.ShareContent;

/* JADX INFO: loaded from: classes4.dex */
public interface IEditor {
    Bundle getEditable(ShareContent shareContent);

    ShareContent getResult(ShareContent shareContent, Bundle bundle);
}
