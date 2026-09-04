package com.efs.sdk.base.protocol.file.section;

import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AbsSection {
    public static final String SEP_LINE_BREAK = "linebreak";
    public static final String SEP_ORIGIN_LINE_BREAK = "\n";
    String type;
    String name = "";
    String version = "1.0";
    String sep = "";

    public AbsSection(String str) {
        this.type = str;
    }

    public abstract String changeToStr();

    String getDeclarationLine() {
        return "section:" + this.name + Constants.ACCEPT_TIME_SEPARATOR_SP + this.type + Constants.ACCEPT_TIME_SEPARATOR_SP + this.version + Constants.ACCEPT_TIME_SEPARATOR_SP + this.sep;
    }

    public void setSep(String str) {
        if (str.equals("\n")) {
            this.sep = SEP_LINE_BREAK;
        } else {
            this.sep = str;
        }
    }
}
