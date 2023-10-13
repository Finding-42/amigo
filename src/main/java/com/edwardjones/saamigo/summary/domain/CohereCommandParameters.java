package com.edwardjones.saamigo.summary.domain;

import lombok.Builder;
import lombok.Data;
import lombok.With;

import java.util.List;

@Data
@Builder
@With
public class CohereCommandParameters {

    private String prompt;
    private float temperature;
    private float p;
    private int k;
    private int maxTokens;
    private List<String> stopSequences;
    private ReturnLikelihood returnLikelihoods;

    public static CohereCommandParameters usingPrompt(String prompt) {
        return CohereCommandParameters.builder()
                .prompt(prompt)
                .p(0.01f)
                .k(0)
                .temperature(0.75f)
                .returnLikelihoods(ReturnLikelihood.NONE)
                .stopSequences(List.of())
                .maxTokens(400)
                .build();
    }

    public enum ReturnLikelihood {
        GENERATION, ALL, NONE;
    }
}
