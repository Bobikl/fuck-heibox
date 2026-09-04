package com.tencent.cos.xml.model.tag;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ACLAccount {
    List<String> idList = new ArrayList();

    public void addAccount(String str) {
        addAccount(str, str);
    }

    public void addAccount(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.idList.add(String.format("id=\"qcs::cam::uin/%s:uin/%s\"", str, str2));
    }

    public String getAccount() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.idList.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        String string = sb2.toString();
        int iLastIndexOf = string.lastIndexOf(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (iLastIndexOf > 0) {
            return string.substring(0, iLastIndexOf);
        }
        return null;
    }
}
