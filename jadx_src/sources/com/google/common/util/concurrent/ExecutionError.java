package com.google.common.util.concurrent;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b
public class ExecutionError extends Error {
    private static final long serialVersionUID = 0;

    protected ExecutionError() {
    }

    public ExecutionError(@CheckForNull Error error) {
        super(error);
    }

    protected ExecutionError(@CheckForNull String str) {
        super(str);
    }

    public ExecutionError(@CheckForNull String str, @CheckForNull Error error) {
        super(str, error);
    }
}
