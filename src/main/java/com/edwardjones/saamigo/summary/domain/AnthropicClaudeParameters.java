package com.edwardjones.saamigo.summary.domain;

import lombok.Builder;
import lombok.Data;
import lombok.With;

import java.util.List;

import static java.lang.String.format;

@Data
@Builder
@With
public class AnthropicClaudeParameters {
    private String prompt;
    private float temperature;
    private float topP;
    private int topK;
    private int maxTokensToSample;
    private List<String> stopSequences;

    public static AnthropicClaudeParameters usingPrompt(String prompt) {
        return AnthropicClaudeParameters.builder()
                .build();
    }

    public void setPrompt(String prompt) {
        this.prompt = format("\n\nHuman:%s\n\nAssistant:");
    }

}
