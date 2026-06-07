package com.monchickey.manor.net;

import java.util.List;
import java.util.Map;

public class HttpResponse {
    private Map<String, List<String>> headers;
    private String content;

    HttpResponse(Map<String, List<String>> headers, String content) {
        this.headers = headers;
        this.content = content;
    }

    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    public String getContent() {
        return content;
    }
}
