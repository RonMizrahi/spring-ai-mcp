package com.mcpserver.service;

import java.net.URI;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.mcpserver.mock.CustomSearchResponseMock;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomSearchMcpServer {

    private final WebClient webClient;

    // Inject the API key and custom search engine ID from your configuration
    @Value("${google.api.key}")
    private String apiKey;

    @Value("${google.custom.search.engine.id}")
    private String searchEngineId;

    public CustomSearchMcpServer() {
        this.webClient = WebClient.builder().build();
    }

    @Tool(name = "googleSearch", description = "Web search using Google Custom Search API")
    public String customSearchGoogle(@ToolParam(description = "search query") String query) {
        // system out println are read by the LLM which cause issues
        // System.out.println("Custom search query: " + query);
        // Return the response as a string
        return search(query);
    }

    /**
     * Performs a Google Custom Search for the provided query.
     *
     * @param query the search term
     * @return the JSON response from the Google Custom Search API as a String
     */
    public String search(String query) {
        try {
            URI uri = new URI(String.format(
                    "https://www.googleapis.com/customsearch/v1?key=%s&cx=%s&q=%s",
                    apiKey, searchEngineId, query));

            return webClient.get()
                    .uri(uri)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch search results: " + e.getMessage(), e);
        }
    }

    public String MockSearch(String query) {
        // Mock response for testing purposes
        return CustomSearchResponseMock.mockResponse;
    }
}
