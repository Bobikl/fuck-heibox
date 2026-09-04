package com.google.gson;

/* JADX INFO: loaded from: classes7.dex */
public class JsonParseException extends RuntimeException {
    static final long serialVersionUID = -4086729973971783390L;

    public JsonParseException(String str) {
        super(str);
    }

    public JsonParseException(String str, Throwable th2) {
        super(str, th2);
    }

    public JsonParseException(Throwable th2) {
        super(th2);
    }
}
