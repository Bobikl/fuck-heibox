package org.json.alipay.zoloz;

import com.meituan.robust.Constants;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
public class JSONWriter {
    private static final int maxdepth = 20;
    private boolean comma = false;
    protected char mode = 'i';
    private char[] stack = new char[20];
    private int top = 0;
    protected Writer writer;

    public JSONWriter(Writer writer) {
        this.writer = writer;
    }

    private JSONWriter append(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Null pointer");
        }
        char c10 = this.mode;
        if (c10 != 'o' && c10 != 'a') {
            throw new JSONException("Value out of sequence.");
        }
        try {
            if (this.comma && c10 == 'a') {
                this.writer.write(44);
            }
            this.writer.write(str);
            if (this.mode == 'o') {
                this.mode = 'k';
            }
            this.comma = true;
            return this;
        } catch (IOException e10) {
            throw new JSONException(e10);
        }
    }

    private JSONWriter end(char c10, char c11) throws JSONException {
        if (this.mode != c10) {
            throw new JSONException(c10 == 'o' ? "Misplaced endObject." : "Misplaced endArray.");
        }
        pop(c10);
        try {
            this.writer.write(c11);
            this.comma = true;
            return this;
        } catch (IOException e10) {
            throw new JSONException(e10);
        }
    }

    private void pop(char c10) throws JSONException {
        int i10 = this.top;
        if (i10 > 0) {
            char[] cArr = this.stack;
            if (cArr[i10 - 1] == c10) {
                int i11 = i10 - 1;
                this.top = i11;
                this.mode = i11 == 0 ? 'd' : cArr[i11 - 1];
                return;
            }
        }
        throw new JSONException("Nesting error.");
    }

    private void push(char c10) throws JSONException {
        int i10 = this.top;
        if (i10 >= 20) {
            throw new JSONException("Nesting too deep.");
        }
        this.stack[i10] = c10;
        this.mode = c10;
        this.top = i10 + 1;
    }

    public JSONWriter array() throws JSONException {
        char c10 = this.mode;
        if (c10 != 'i' && c10 != 'o' && c10 != 'a') {
            throw new JSONException("Misplaced array.");
        }
        push('a');
        append(Constants.ARRAY_TYPE);
        this.comma = false;
        return this;
    }

    public JSONWriter endArray() throws JSONException {
        return end('a', ']');
    }

    public JSONWriter endObject() throws JSONException {
        return end('k', '}');
    }

    public JSONWriter key(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Null key.");
        }
        if (this.mode != 'k') {
            throw new JSONException("Misplaced key.");
        }
        try {
            if (this.comma) {
                this.writer.write(44);
            }
            this.writer.write(JSONObject.quote(str));
            this.writer.write(58);
            this.comma = false;
            this.mode = 'o';
            return this;
        } catch (IOException e10) {
            throw new JSONException(e10);
        }
    }

    public JSONWriter object() throws JSONException {
        if (this.mode == 'i') {
            this.mode = 'o';
        }
        char c10 = this.mode;
        if (c10 != 'o' && c10 != 'a') {
            throw new JSONException("Misplaced object.");
        }
        append("{");
        push('k');
        this.comma = false;
        return this;
    }

    public JSONWriter value(double d10) throws JSONException {
        return value(new Double(d10));
    }

    public JSONWriter value(long j10) throws JSONException {
        return append(Long.toString(j10));
    }

    public JSONWriter value(Object obj) throws JSONException {
        return append(JSONObject.valueToString(obj));
    }

    public JSONWriter value(boolean z10) throws JSONException {
        return append(z10 ? "true" : "false");
    }
}
