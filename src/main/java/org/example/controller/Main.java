package org.example.controller;

import com.alibaba.dashscope.app.*;
import com.alibaba.dashscope.exception.ApiException;
import com.alibaba.dashscope.exception.InputRequiredException;
import com.alibaba.dashscope.exception.NoApiKeyException;
import java.util.List;


public class Main{
    public static void callAgentApp()
            throws ApiException, NoApiKeyException, InputRequiredException {
        ApplicationParam param = ApplicationParam.builder()
                .apiKey("sk-e4cb776e7028497e9046866bb53b7372")
                .appId("326c3c0fa92b4736b23f4e3f59363e5c")
                .prompt("springmvc是什么")
                .build();

        Application application = new Application();
        ApplicationResult result = application.call(param);

        System.out.printf("requestId: %s, text: %s, finishReason: %s\n",
                result.getRequestId(), result.getOutput().getText(), result.getOutput().getFinishReason());
    }

    public static void main(String[] args) {
        try {
            callAgentApp();
        } catch (ApiException | NoApiKeyException | InputRequiredException e) {
            System.out.printf("Exception: %s", e.getMessage());
        }
        System.exit(0);
    }
}