package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ResponseBodyConverter<T> {

    public static final class BytesConverter extends ResponseBodyConverter<byte[]> {
        private BytesConverter() {
        }

        @Override // com.tencent.qcloud.core.http.ResponseBodyConverter
        public byte[] convert(HttpResponse<byte[]> httpResponse) throws QCloudServiceException, QCloudClientException {
            try {
                return httpResponse.bytes();
            } catch (IOException e10) {
                throw new QCloudClientException(e10);
            }
        }
    }

    public static final class InputStreamConverter extends ResponseBodyConverter<InputStream> {
        private InputStreamConverter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tencent.qcloud.core.http.ResponseBodyConverter
        public InputStream convert(HttpResponse<InputStream> httpResponse) throws QCloudServiceException, QCloudClientException {
            return httpResponse.byteStream();
        }
    }

    public static final class StringConverter extends ResponseBodyConverter<String> {
        private StringConverter() {
        }

        @Override // com.tencent.qcloud.core.http.ResponseBodyConverter
        public String convert(HttpResponse<String> httpResponse) throws QCloudServiceException, QCloudClientException {
            try {
                return httpResponse.string();
            } catch (IOException e10) {
                throw new QCloudClientException(e10);
            }
        }
    }

    public static ResponseBodyConverter<byte[]> bytes() {
        return new BytesConverter();
    }

    public static ResponseBodyConverter<Void> file(String str) {
        return file(str, -1L);
    }

    public static ResponseBodyConverter<Void> file(String str, long j10) {
        return new ResponseFileConverter(str, j10);
    }

    public static ResponseBodyConverter<InputStream> inputStream() {
        return new InputStreamConverter();
    }

    public static ResponseBodyConverter<String> string() {
        return new StringConverter();
    }

    public abstract T convert(HttpResponse<T> httpResponse) throws QCloudServiceException, QCloudClientException;
}
