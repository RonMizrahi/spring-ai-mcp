package com.mcpserver.config;

import com.mcpserver.service.CustomSearchMcpServer;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiModelsConfig {

    private final CustomSearchMcpServer customSearchMcpServer;

    public AiModelsConfig(CustomSearchMcpServer customSearchMcpServer) {
        this.customSearchMcpServer = customSearchMcpServer;
    }

    @Bean
    ToolCallbackProvider userTools() {
        return MethodToolCallbackProvider
                .builder()
                .toolObjects(customSearchMcpServer)
                .build();
    }

}
