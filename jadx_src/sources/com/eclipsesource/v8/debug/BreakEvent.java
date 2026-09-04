package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.V8Object;

/* JADX INFO: loaded from: classes6.dex */
public class BreakEvent extends EventData {
    private static final String SOURCE_COLUMN = "sourceColumn";
    private static final String SOURCE_LINE = "sourceLine";
    private static final String SOURCE_LINE_TEXT = "sourceLineText";

    BreakEvent(V8Object v8Object) {
        super(v8Object);
    }

    public int getSourceColumn() {
        return this.v8Object.executeIntegerFunction(SOURCE_COLUMN, null);
    }

    public int getSourceLine() {
        return this.v8Object.executeIntegerFunction(SOURCE_LINE, null);
    }

    public String getSourceLineText() {
        return this.v8Object.executeStringFunction(SOURCE_LINE_TEXT, null);
    }
}
