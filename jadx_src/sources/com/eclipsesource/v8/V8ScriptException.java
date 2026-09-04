package com.eclipsesource.v8;

/* JADX INFO: loaded from: classes6.dex */
public abstract class V8ScriptException extends V8RuntimeException {
    private final int endColumn;
    private final String fileName;
    private final String jsMessage;
    private final String jsStackTrace;
    private final int lineNumber;
    private final String sourceLine;
    private final int startColumn;

    V8ScriptException(String str, int i10, String str2, String str3, int i11, int i12, String str4, Throwable th2) {
        this.fileName = str;
        this.lineNumber = i10;
        this.jsMessage = str2;
        this.sourceLine = str3;
        this.startColumn = i11;
        this.endColumn = i12;
        this.jsStackTrace = str4;
        if (th2 != null) {
            initCause(th2);
        }
    }

    private char[] createCharSequence(int i10, char c10) {
        char[] cArr = new char[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            cArr[i11] = c10;
        }
        return cArr;
    }

    private String createJSStackDetails() {
        if (this.jsStackTrace == null) {
            return "";
        }
        return "\n" + this.jsStackTrace;
    }

    private String createMessageDetails() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.sourceLine;
        if (str != null && !str.isEmpty()) {
            sb2.append('\n');
            sb2.append(this.sourceLine);
            sb2.append('\n');
            int i10 = this.startColumn;
            if (i10 >= 0) {
                sb2.append(createCharSequence(i10, ' '));
                sb2.append(createCharSequence(this.endColumn - this.startColumn, '^'));
            }
        }
        return sb2.toString();
    }

    private String createMessageLine() {
        return this.fileName + ":" + this.lineNumber + ": " + this.jsMessage;
    }

    public int getEndColumn() {
        return this.endColumn;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getJSMessage() {
        return this.jsMessage;
    }

    public String getJSStackTrace() {
        return this.jsStackTrace;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return createMessageLine();
    }

    public String getSourceLine() {
        return this.sourceLine;
    }

    public int getStartColumn() {
        return this.startColumn;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return createMessageLine() + createMessageDetails() + createJSStackDetails() + "\n" + getClass().getName();
    }
}
