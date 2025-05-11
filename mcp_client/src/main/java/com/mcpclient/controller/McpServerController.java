package com.mcpclient.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.PromptChatMemoryAdvisor;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class McpServerController {

    private final ChatClient chatClient;
    private final Map<String, PromptChatMemoryAdvisor> advisorMap = new ConcurrentHashMap<>();

    public McpServerController(ChatClient.Builder chatClientBuilder,
            ToolCallbackProvider tools) {
        this.chatClient = chatClientBuilder
                .defaultTools(tools)
                .build();

    }

    @PostMapping("/mcp")
    public String handleCommand(@RequestBody String userInput) {
        // Log the command for debugging
        System.out.println("Received command: " + userInput);
        PromptTemplate pt = new PromptTemplate(
                """
                        You are a helpful assistant that can perform various tasks.
                        search for the query in google by using google custom api: {userInput}
                        if the response not looking reasonable to the query , please respond with "I am not sure how to help with that."
                        """);
        Prompt p = pt.create(Map.of("userInput", userInput));
        return this.chatClient.prompt(p)
                .call()
                .content();
    }
}
