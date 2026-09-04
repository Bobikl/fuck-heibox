package org.apache.tools.mail;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class ErrorInQuitException extends IOException {
    private static final long serialVersionUID = 1;

    public ErrorInQuitException(IOException iOException) {
        super(iOException.getMessage());
    }
}
