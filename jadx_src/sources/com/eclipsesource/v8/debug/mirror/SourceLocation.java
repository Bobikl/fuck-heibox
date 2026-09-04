package com.eclipsesource.v8.debug.mirror;

/* JADX INFO: loaded from: classes6.dex */
public class SourceLocation {
    private final int column;
    private final int line;
    private final int position;
    private final String scriptName;
    private String sourceText;

    public SourceLocation(String str, int i10, int i11, int i12, String str2) {
        this.scriptName = str;
        this.position = i10;
        this.line = i11;
        this.column = i12;
        this.sourceText = str2;
    }

    public int getColumn() {
        return this.column;
    }

    public int getLine() {
        return this.line;
    }

    public int getPosition() {
        return this.position;
    }

    public String getScriptName() {
        return this.scriptName;
    }

    public String getSourceText() {
        return this.sourceText;
    }

    public String toString() {
        return this.scriptName + " : " + this.position + " : " + this.line + " : " + this.column + " : " + this.sourceText;
    }
}
