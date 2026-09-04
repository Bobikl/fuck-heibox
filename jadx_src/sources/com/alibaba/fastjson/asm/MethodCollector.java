package com.alibaba.fastjson.asm;

/* JADX INFO: loaded from: classes6.dex */
public class MethodCollector {
    protected boolean debugInfoPresent;
    private final int ignoreCount;
    private final int paramCount;
    private final StringBuffer result = new StringBuffer();
    private int currentParameter = 0;

    protected MethodCollector(int i10, int i11) {
        this.ignoreCount = i10;
        this.paramCount = i11;
        this.debugInfoPresent = i11 == 0;
    }

    protected String getResult() {
        return this.result.length() != 0 ? this.result.substring(1) : "";
    }

    protected void visitLocalVariable(String str, int i10) {
        int i11 = this.ignoreCount;
        if (i10 < i11 || i10 >= i11 + this.paramCount) {
            return;
        }
        if (!str.equals("arg" + this.currentParameter)) {
            this.debugInfoPresent = true;
        }
        this.result.append(',');
        this.result.append(str);
        this.currentParameter++;
    }
}
